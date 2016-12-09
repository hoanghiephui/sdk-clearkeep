package com.fisil.libclearkeep.protocol;


import com.fisil.libclearkeep.protocol.ecc.Curve;
import com.fisil.libclearkeep.protocol.ecc.ECKeyPair;
import com.fisil.libclearkeep.protocol.ecc.ECPublicKey;
import com.fisil.libclearkeep.protocol.exceptions.DuplicateMessageException;
import com.fisil.libclearkeep.protocol.exceptions.InvalidKeyException;
import com.fisil.libclearkeep.protocol.exceptions.InvalidKeyIdException;
import com.fisil.libclearkeep.protocol.exceptions.InvalidMessageException;
import com.fisil.libclearkeep.protocol.exceptions.LegacyMessageException;
import com.fisil.libclearkeep.protocol.exceptions.NoSessionException;
import com.fisil.libclearkeep.protocol.exceptions.UntrustedIdentityException;
import com.fisil.libclearkeep.protocol.keys.IdentityKey;
import com.fisil.libclearkeep.protocol.protocols.CiphertextMessage;
import com.fisil.libclearkeep.protocol.protocols.PreKeySignalMessage;
import com.fisil.libclearkeep.protocol.protocols.SignalMessage;
import com.fisil.libclearkeep.protocol.ratchet.ChainKey;
import com.fisil.libclearkeep.protocol.ratchet.MessageKeys;
import com.fisil.libclearkeep.protocol.ratchet.RootKey;
import com.fisil.libclearkeep.protocol.state.IdentityKeyStore;
import com.fisil.libclearkeep.protocol.state.PreKeyStore;
import com.fisil.libclearkeep.protocol.state.SessionRecord;
import com.fisil.libclearkeep.protocol.state.SessionState;
import com.fisil.libclearkeep.protocol.state.SessionStore;
import com.fisil.libclearkeep.protocol.state.SignalProtocolStore;
import com.fisil.libclearkeep.protocol.state.SignedPreKeyStore;
import com.fisil.libclearkeep.protocol.utils.ByteUtil;
import com.fisil.libclearkeep.protocol.utils.Pair;
import com.fisil.libclearkeep.protocol.utils.guava.Optional;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import static com.fisil.libclearkeep.protocol.state.SessionState.UnacknowledgedPreKeyMessageItems;

/**
 * The main entry point for Signal Protocol encrypt/decrypt operations.
 * <p>
 * Once a session has been established with {@link SessionBuilder},
 * this class can be used for all encrypt/decrypt operations within
 * that session.
 */
public class SessionCipher {

  public static final Object SESSION_LOCK = new Object();

  private final SessionStore sessionStore;
  private final SessionBuilder sessionBuilder;
  private final PreKeyStore preKeyStore;
  private final SignalProtocolAddress remoteAddress;

  /**
   * Construct a SessionCipher for encrypt/decrypt operations on a session.
   * In order to use SessionCipher, a session must have already been created
   * and stored using {@link SessionBuilder}.
   *
   * @param sessionStore  The {@link SessionStore} that contains a session for this recipient.
   * @param remoteAddress The remote address that messages will be encrypted to or decrypted from.
   */
  public SessionCipher(SessionStore sessionStore, PreKeyStore preKeyStore,
                       SignedPreKeyStore signedPreKeyStore, IdentityKeyStore identityKeyStore,
                       SignalProtocolAddress remoteAddress) {
    this.sessionStore = sessionStore;
    this.preKeyStore = preKeyStore;
    this.remoteAddress = remoteAddress;
    this.sessionBuilder = new SessionBuilder(sessionStore, preKeyStore, signedPreKeyStore,
    identityKeyStore, remoteAddress);
  }

  public SessionCipher(SignalProtocolStore store, SignalProtocolAddress remoteAddress) {
    this(store, store, store, store, remoteAddress);
  }

  /**
   * Encrypt a message.
   *
   * @param paddedMessage The plaintext message bytes, optionally padded to a constant multiple.
   * @return A ciphertext message encrypted to the recipient+device tuple.
   */
  public CiphertextMessage encrypt(byte[] paddedMessage) {
    synchronized (SESSION_LOCK) {
      SessionRecord sessionRecord = sessionStore.loadSession(remoteAddress);
      SessionState sessionState = sessionRecord.getSessionState();
      ChainKey chainKey = sessionState.getSenderChainKey();
      MessageKeys messageKeys = chainKey.getMessageKeys();
      ECPublicKey senderEphemeral = sessionState.getSenderRatchetKey();
      int previousCounter = sessionState.getPreviousCounter();
      int sessionVersion = sessionState.getSessionVersion();

      byte[] ciphertextBody = getCiphertext(sessionVersion, messageKeys, paddedMessage);
      CiphertextMessage ciphertextMessage = new SignalMessage(sessionVersion, messageKeys.getMacKey(),
      senderEphemeral, chainKey.getIndex(),
      previousCounter, ciphertextBody,
      sessionState.getLocalIdentityKey(),
      sessionState.getRemoteIdentityKey());

      if (sessionState.hasUnacknowledgedPreKeyMessage()) {
        UnacknowledgedPreKeyMessageItems items = sessionState.getUnacknowledgedPreKeyMessageItems();
        int localRegistrationId = sessionState.getLocalRegistrationId();

        ciphertextMessage = new PreKeySignalMessage(sessionVersion, localRegistrationId, items.getPreKeyId(),
        items.getSignedPreKeyId(), items.getBaseKey(),
        sessionState.getLocalIdentityKey(),
        (SignalMessage) ciphertextMessage);
      }

      sessionState.setSenderChainKey(chainKey.getNextChainKey());
      sessionStore.storeSession(remoteAddress, sessionRecord);
      return ciphertextMessage;
    }
  }

  /**
   * Decrypt a message.
   *
   * @param ciphertext The {@link PreKeySignalMessage} to decrypt.
   * @return The plaintext.
   * @throws InvalidMessageException    if the input is not valid ciphertext.
   * @throws DuplicateMessageException  if the input is a message that has already been received.
   * @throws LegacyMessageException     if the input is a message formatted by a protocol version that
   *                                    is no longer supported.
   * @throws InvalidKeyIdException      when there is no local {@link com.fisil.libclearkeep.protocol.state.PreKeyRecord}
   *                                    that corresponds to the PreKey ID in the message.
   * @throws InvalidKeyException        when the message is formatted incorrectly.
   * @throws UntrustedIdentityException when the {@link IdentityKey} of the sender is untrusted.
   */
  public byte[] decrypt(PreKeySignalMessage ciphertext)
  throws DuplicateMessageException, LegacyMessageException, InvalidMessageException,
  InvalidKeyIdException, InvalidKeyException, UntrustedIdentityException {
    return decrypt(ciphertext, new NullDecryptionCallback());
  }

  /**
   * Decrypt a message.
   *
   * @param ciphertext The {@link PreKeySignalMessage} to decrypt.
   * @param callback   A callback that is triggered after decryption is complete,
   *                   but before the updated session state has been committed to the session
   *                   DB.  This allows some implementations to store the committed plaintext
   *                   to a DB first, in case they are concerned with a crash happening between
   *                   the time the session state is updated but before they're able to store
   *                   the plaintext to disk.
   * @return The plaintext.
   * @throws InvalidMessageException    if the input is not valid ciphertext.
   * @throws DuplicateMessageException  if the input is a message that has already been received.
   * @throws LegacyMessageException     if the input is a message formatted by a protocol version that
   *                                    is no longer supported.
   * @throws InvalidKeyIdException      when there is no local {@link com.fisil.libclearkeep.protocol.state.PreKeyRecord}
   *                                    that corresponds to the PreKey ID in the message.
   * @throws InvalidKeyException        when the message is formatted incorrectly.
   * @throws UntrustedIdentityException when the {@link IdentityKey} of the sender is untrusted.
   */
  public byte[] decrypt(PreKeySignalMessage ciphertext, DecryptionCallback callback)
  throws DuplicateMessageException, LegacyMessageException, InvalidMessageException,
  InvalidKeyIdException, InvalidKeyException, UntrustedIdentityException {
    synchronized (SESSION_LOCK) {
      SessionRecord sessionRecord = sessionStore.loadSession(remoteAddress);
      Optional<Integer> unsignedPreKeyId = sessionBuilder.process(sessionRecord, ciphertext);
      byte[] plaintext = decrypt(sessionRecord, ciphertext.getWhisperMessage());

      callback.handlePlaintext(plaintext);

      sessionStore.storeSession(remoteAddress, sessionRecord);

      if (unsignedPreKeyId.isPresent()) {
        preKeyStore.removePreKey(unsignedPreKeyId.get());
      }

      return plaintext;
    }
  }

  /**
   * Decrypt a message.
   *
   * @param ciphertext The {@link SignalMessage} to decrypt.
   * @return The plaintext.
   * @throws InvalidMessageException   if the input is not valid ciphertext.
   * @throws DuplicateMessageException if the input is a message that has already been received.
   * @throws LegacyMessageException    if the input is a message formatted by a protocol version that
   *                                   is no longer supported.
   * @throws NoSessionException        if there is no established session for this contact.
   */
  public byte[] decrypt(SignalMessage ciphertext)
  throws InvalidMessageException, DuplicateMessageException, LegacyMessageException,
  NoSessionException {
    return decrypt(ciphertext, new NullDecryptionCallback());
  }

  /**
   * Decrypt a message.
   *
   * @param ciphertext The {@link SignalMessage} to decrypt.
   * @param callback   A callback that is triggered after decryption is complete,
   *                   but before the updated session state has been committed to the session
   *                   DB.  This allows some implementations to store the committed plaintext
   *                   to a DB first, in case they are concerned with a crash happening between
   *                   the time the session state is updated but before they're able to store
   *                   the plaintext to disk.
   * @return The plaintext.
   * @throws InvalidMessageException   if the input is not valid ciphertext.
   * @throws DuplicateMessageException if the input is a message that has already been received.
   * @throws LegacyMessageException    if the input is a message formatted by a protocol version that
   *                                   is no longer supported.
   * @throws NoSessionException        if there is no established session for this contact.
   */
  public byte[] decrypt(SignalMessage ciphertext, DecryptionCallback callback)
  throws InvalidMessageException, DuplicateMessageException, LegacyMessageException,
  NoSessionException {
    synchronized (SESSION_LOCK) {

      if (!sessionStore.containsSession(remoteAddress)) {
        throw new NoSessionException("No session for: " + remoteAddress);
      }

      SessionRecord sessionRecord = sessionStore.loadSession(remoteAddress);
      byte[] plaintext = decrypt(sessionRecord, ciphertext);

      callback.handlePlaintext(plaintext);

      sessionStore.storeSession(remoteAddress, sessionRecord);

      return plaintext;
    }
  }

  private byte[] decrypt(SessionRecord sessionRecord, SignalMessage ciphertext)
  throws DuplicateMessageException, LegacyMessageException, InvalidMessageException {
    synchronized (SESSION_LOCK) {
      Iterator<SessionState> previousStates = sessionRecord.getPreviousSessionStates().iterator();
      List<Exception> exceptions = new LinkedList<>();

      try {
        SessionState sessionState = new SessionState(sessionRecord.getSessionState());
        byte[] plaintext = decrypt(sessionState, ciphertext);

        sessionRecord.setState(sessionState);
        return plaintext;
      } catch (InvalidMessageException e) {
        exceptions.add(e);
      }

      while (previousStates.hasNext()) {
        try {
          SessionState promotedState = new SessionState(previousStates.next());
          byte[] plaintext = decrypt(promotedState, ciphertext);

          previousStates.remove();
          sessionRecord.promoteState(promotedState);

          return plaintext;
        } catch (InvalidMessageException e) {
          exceptions.add(e);
        }
      }

      throw new InvalidMessageException("No valid sessions.", exceptions);
    }
  }

  private byte[] decrypt(SessionState sessionState, SignalMessage ciphertextMessage)
  throws InvalidMessageException, DuplicateMessageException, LegacyMessageException {
    if (!sessionState.hasSenderChain()) {
      throw new InvalidMessageException("Uninitialized session!");
    }

    if (ciphertextMessage.getMessageVersion() != sessionState.getSessionVersion()) {
      throw new InvalidMessageException(String.format("Message version %d, but session version %d",
      ciphertextMessage.getMessageVersion(),
      sessionState.getSessionVersion()));
    }

    int messageVersion = ciphertextMessage.getMessageVersion();
    ECPublicKey theirEphemeral = ciphertextMessage.getSenderRatchetKey();
    int counter = ciphertextMessage.getCounter();
    ChainKey chainKey = getOrCreateChainKey(sessionState, theirEphemeral);
    MessageKeys messageKeys = getOrCreateMessageKeys(sessionState, theirEphemeral,
    chainKey, counter);

    ciphertextMessage.verifyMac(messageVersion,
    sessionState.getRemoteIdentityKey(),
    sessionState.getLocalIdentityKey(),
    messageKeys.getMacKey());

    byte[] plaintext = getPlaintext(messageVersion, messageKeys, ciphertextMessage.getBody());

    sessionState.clearUnacknowledgedPreKeyMessage();

    return plaintext;
  }

  public int getRemoteRegistrationId() {
    synchronized (SESSION_LOCK) {
      SessionRecord record = sessionStore.loadSession(remoteAddress);
      return record.getSessionState().getRemoteRegistrationId();
    }
  }

  public int getSessionVersion() {
    synchronized (SESSION_LOCK) {
      if (!sessionStore.containsSession(remoteAddress)) {
        throw new IllegalStateException(String.format("No session for (%s)!", remoteAddress));
      }

      SessionRecord record = sessionStore.loadSession(remoteAddress);
      return record.getSessionState().getSessionVersion();
    }
  }

  private ChainKey getOrCreateChainKey(SessionState sessionState, ECPublicKey theirEphemeral)
  throws InvalidMessageException {
    try {
      if (sessionState.hasReceiverChain(theirEphemeral)) {
        return sessionState.getReceiverChainKey(theirEphemeral);
      } else {
        RootKey rootKey = sessionState.getRootKey();
        ECKeyPair ourEphemeral = sessionState.getSenderRatchetKeyPair();
        Pair<RootKey, ChainKey> receiverChain = rootKey.createChain(theirEphemeral, ourEphemeral);
        ECKeyPair ourNewEphemeral = Curve.generateKeyPair();
        Pair<RootKey, ChainKey> senderChain = receiverChain.first().createChain(theirEphemeral, ourNewEphemeral);

        sessionState.setRootKey(senderChain.first());
        sessionState.addReceiverChain(theirEphemeral, receiverChain.second());
        sessionState.setPreviousCounter(Math.max(sessionState.getSenderChainKey().getIndex() - 1, 0));
        sessionState.setSenderChain(ourNewEphemeral, senderChain.second());

        return receiverChain.second();
      }
    } catch (InvalidKeyException e) {
      throw new InvalidMessageException(e);
    }
  }

  private MessageKeys getOrCreateMessageKeys(SessionState sessionState,
                                             ECPublicKey theirEphemeral,
                                             ChainKey chainKey, int counter)
  throws InvalidMessageException, DuplicateMessageException {
    if (chainKey.getIndex() > counter) {
      if (sessionState.hasMessageKeys(theirEphemeral, counter)) {
        return sessionState.removeMessageKeys(theirEphemeral, counter);
      } else {
        throw new DuplicateMessageException("Received message with old counter: " +
        chainKey.getIndex() + " , " + counter);
      }
    }

    if (counter - chainKey.getIndex() > 2000) {
      throw new InvalidMessageException("Over 2000 messages into the future!");
    }

    while (chainKey.getIndex() < counter) {
      MessageKeys messageKeys = chainKey.getMessageKeys();
      sessionState.setMessageKeys(theirEphemeral, messageKeys);
      chainKey = chainKey.getNextChainKey();
    }

    sessionState.setReceiverChainKey(theirEphemeral, chainKey.getNextChainKey());
    return chainKey.getMessageKeys();
  }

  private byte[] getCiphertext(int version, MessageKeys messageKeys, byte[] plaintext) {
    try {
      Cipher cipher;

      if (version >= 3) {
        cipher = getCipher(Cipher.ENCRYPT_MODE, messageKeys.getCipherKey(), messageKeys.getIv());
      } else {
        cipher = getCipher(Cipher.ENCRYPT_MODE, messageKeys.getCipherKey(), messageKeys.getCounter());
      }

      return cipher.doFinal(plaintext);
    } catch (IllegalBlockSizeException | BadPaddingException e) {
      throw new AssertionError(e);
    }
  }

  private byte[] getPlaintext(int version, MessageKeys messageKeys, byte[] cipherText)
  throws InvalidMessageException {
    try {
      Cipher cipher;

      if (version >= 3) {
        cipher = getCipher(Cipher.DECRYPT_MODE, messageKeys.getCipherKey(), messageKeys.getIv());
      } else {
        cipher = getCipher(Cipher.DECRYPT_MODE, messageKeys.getCipherKey(), messageKeys.getCounter());
      }

      return cipher.doFinal(cipherText);
    } catch (IllegalBlockSizeException | BadPaddingException e) {
      throw new InvalidMessageException(e);
    }
  }

  private Cipher getCipher(int mode, SecretKeySpec key, int counter) {
    try {
      Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");

      byte[] ivBytes = new byte[16];
      ByteUtil.intToByteArray(ivBytes, 0, counter);

      IvParameterSpec iv = new IvParameterSpec(ivBytes);
      cipher.init(mode, key, iv);

      return cipher;
    } catch (NoSuchAlgorithmException | NoSuchPaddingException | java.security.InvalidKeyException |
    InvalidAlgorithmParameterException e) {
      throw new AssertionError(e);
    }
  }

  private Cipher getCipher(int mode, SecretKeySpec key, IvParameterSpec iv) {
    try {
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      cipher.init(mode, key, iv);
      return cipher;
    } catch (NoSuchAlgorithmException | NoSuchPaddingException | java.security.InvalidKeyException |
    InvalidAlgorithmParameterException e) {
      throw new AssertionError(e);
    }
  }

  private static class NullDecryptionCallback implements DecryptionCallback {
    @Override
    public void handlePlaintext(byte[] plaintext) {
    }
  }
}
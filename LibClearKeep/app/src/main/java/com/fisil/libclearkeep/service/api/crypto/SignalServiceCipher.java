package com.fisil.libclearkeep.service.api.crypto;

import com.fisil.libclearkeep.protocol.SessionCipher;
import com.fisil.libclearkeep.protocol.SignalProtocolAddress;
import com.fisil.libclearkeep.protocol.exceptions.DuplicateMessageException;
import com.fisil.libclearkeep.protocol.exceptions.InvalidKeyException;
import com.fisil.libclearkeep.protocol.exceptions.InvalidKeyIdException;
import com.fisil.libclearkeep.protocol.exceptions.InvalidMessageException;
import com.fisil.libclearkeep.protocol.exceptions.InvalidVersionException;
import com.fisil.libclearkeep.protocol.exceptions.LegacyMessageException;
import com.fisil.libclearkeep.protocol.exceptions.NoSessionException;
import com.fisil.libclearkeep.protocol.exceptions.UntrustedIdentityException;
import com.fisil.libclearkeep.protocol.protocols.CiphertextMessage;
import com.fisil.libclearkeep.protocol.protocols.PreKeySignalMessage;
import com.fisil.libclearkeep.protocol.protocols.SignalMessage;
import com.fisil.libclearkeep.protocol.state.SignalProtocolStore;
import com.fisil.libclearkeep.protocol.utils.guava.Optional;
import com.fisil.libclearkeep.service.api.messages.SignalServiceAttachment;
import com.fisil.libclearkeep.service.api.messages.SignalServiceAttachmentPointer;
import com.fisil.libclearkeep.service.api.messages.SignalServiceContent;
import com.fisil.libclearkeep.service.api.messages.SignalServiceDataMessage;
import com.fisil.libclearkeep.service.api.messages.SignalServiceEnvelope;
import com.fisil.libclearkeep.service.api.messages.SignalServiceGroup;
import com.fisil.libclearkeep.service.api.multidevice.ReadMessage;
import com.fisil.libclearkeep.service.api.multidevice.RequestMessage;
import com.fisil.libclearkeep.service.api.multidevice.SentTranscriptMessage;
import com.fisil.libclearkeep.service.api.multidevice.SignalServiceSyncMessage;
import com.fisil.libclearkeep.service.api.push.SignalServiceAddress;
import com.fisil.libclearkeep.service.internal.push.OutgoingPushMessage;
import com.fisil.libclearkeep.service.internal.push.PushTransportDetails;
import com.fisil.libclearkeep.service.internal.push.SignalServiceProtos;
import com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer;
import com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content;
import com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage;
import com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage;
import com.fisil.libclearkeep.service.internal.utils.Base64;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.LinkedList;
import java.util.List;

import static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type.DELIVER;

/**
 * This is used to decrypt received {@link SignalServiceEnvelope}s.
 *
 * @author Moxie Marlinspike
 */
public class SignalServiceCipher {

  private static final String TAG = SignalServiceCipher.class.getSimpleName();

  private final SignalProtocolStore signalProtocolStore;
  private final SignalServiceAddress localAddress;

  public SignalServiceCipher(SignalServiceAddress localAddress, SignalProtocolStore signalProtocolStore) {
    this.signalProtocolStore = signalProtocolStore;
    this.localAddress = localAddress;
  }

  public OutgoingPushMessage encrypt(SignalProtocolAddress destination, byte[] unpaddedMessage, boolean legacy, boolean silent) {
    SessionCipher sessionCipher = new SessionCipher(signalProtocolStore, destination);
    PushTransportDetails transportDetails = new PushTransportDetails(sessionCipher.getSessionVersion());
    CiphertextMessage message = sessionCipher.encrypt(transportDetails.getPaddedMessageBody(unpaddedMessage));
    int remoteRegistrationId = sessionCipher.getRemoteRegistrationId();
    String body = Base64.encodeBytes(message.serialize());

    int type;

    switch (message.getType()) {
      case CiphertextMessage.PREKEY_TYPE:
        type = SignalServiceProtos.Envelope.Type.PREKEY_BUNDLE_VALUE;
        break;
      case CiphertextMessage.WHISPER_TYPE:
        type = SignalServiceProtos.Envelope.Type.CIPHERTEXT_VALUE;
        break;
      default:
        throw new AssertionError("Bad type: " + message.getType());
    }

    return new OutgoingPushMessage(type, destination.getDeviceId(), remoteRegistrationId,
      legacy ? body : null, legacy ? null : body, silent);
  }

  /**
   * Decrypt a received {@link SignalServiceEnvelope}
   *
   * @param envelope The received SignalServiceEnvelope
   * @return a decrypted SignalServiceContent
   * @throws InvalidVersionException
   * @throws InvalidMessageException
   * @throws InvalidKeyException
   * @throws DuplicateMessageException
   * @throws InvalidKeyIdException
   * @throws UntrustedIdentityException
   * @throws LegacyMessageException
   * @throws NoSessionException
   */
  public SignalServiceContent decrypt(SignalServiceEnvelope envelope)
    throws InvalidVersionException, InvalidMessageException, InvalidKeyException,
    DuplicateMessageException, InvalidKeyIdException, UntrustedIdentityException,
    LegacyMessageException, NoSessionException {
    try {
      SignalServiceContent content = new SignalServiceContent();

      if (envelope.hasLegacyMessage()) {
        SignalServiceProtos.DataMessage message = SignalServiceProtos.DataMessage.parseFrom(decrypt(envelope, envelope.getLegacyMessage()));
        content = new SignalServiceContent(createSignalServiceMessage(envelope, message));
      } else if (envelope.hasContent()) {
        Content message = Content.parseFrom(decrypt(envelope, envelope.getContent()));

        if (message.hasDataMessage()) {
          content = new SignalServiceContent(createSignalServiceMessage(envelope, message.getDataMessage()));
        } else if (message.hasSyncMessage() && localAddress.getNumber().equals(envelope.getSource())) {
          content = new SignalServiceContent(createSynchronizeMessage(envelope, message.getSyncMessage()));
        }
      }

      return content;
    } catch (InvalidProtocolBufferException e) {
      throw new InvalidMessageException(e);
    }
  }

  private byte[] decrypt(SignalServiceEnvelope envelope, byte[] ciphertext)
    throws InvalidVersionException, InvalidMessageException, InvalidKeyException,
    DuplicateMessageException, InvalidKeyIdException, UntrustedIdentityException,
    LegacyMessageException, NoSessionException {
    SignalProtocolAddress sourceAddress = new SignalProtocolAddress(envelope.getSource(), envelope.getSourceDevice());
    SessionCipher sessionCipher = new SessionCipher(signalProtocolStore, sourceAddress);

    byte[] paddedMessage;

    if (envelope.isPreKeySignalMessage()) {
      paddedMessage = sessionCipher.decrypt(new PreKeySignalMessage(ciphertext));
    } else if (envelope.isSignalMessage()) {
      paddedMessage = sessionCipher.decrypt(new SignalMessage(ciphertext));
    } else {
      throw new InvalidMessageException("Unknown type: " + envelope.getType());
    }

    PushTransportDetails transportDetails = new PushTransportDetails(sessionCipher.getSessionVersion());
    return transportDetails.getStrippedPaddingMessageBody(paddedMessage);
  }

  private SignalServiceDataMessage createSignalServiceMessage(SignalServiceEnvelope envelope, DataMessage content) {
    SignalServiceGroup groupInfo = createGroupInfo(envelope, content);
    List<SignalServiceAttachment> attachments = new LinkedList<>();
    boolean endSession = ((content.getFlags() & DataMessage.Flags.END_SESSION_VALUE) != 0);
    boolean expirationUpdate = ((content.getFlags() & DataMessage.Flags.EXPIRATION_TIMER_UPDATE_VALUE) != 0);

    for (AttachmentPointer pointer : content.getAttachmentsList()) {
      attachments.add(new SignalServiceAttachmentPointer(pointer.getId(),
        pointer.getContentType(),
        pointer.getKey().toByteArray(),
        envelope.getRelay(),
        pointer.hasSize() ? Optional.of(pointer.getSize()) : Optional.<Integer>absent(),
        pointer.hasThumbnail() ? Optional.of(pointer.getThumbnail().toByteArray()) : Optional.<byte[]>absent()));
    }

    return new SignalServiceDataMessage(envelope.getTimestamp(), groupInfo, attachments,
      content.getBody(), endSession, content.getExpireTimer(),
      expirationUpdate);
  }

  private SignalServiceSyncMessage createSynchronizeMessage(SignalServiceEnvelope envelope, SyncMessage content) {
    if (content.hasSent()) {
      SyncMessage.Sent sentContent = content.getSent();
      return SignalServiceSyncMessage.forSentTranscript(new SentTranscriptMessage(sentContent.getDestination(),
        sentContent.getTimestamp(),
        createSignalServiceMessage(envelope, sentContent.getMessage()),
        sentContent.getExpirationStartTimestamp()));
    }

    if (content.hasRequest()) {
      return SignalServiceSyncMessage.forRequest(new RequestMessage(content.getRequest()));
    }

    if (content.getReadList().size() > 0) {
      List<ReadMessage> readMessages = new LinkedList<>();

      for (SyncMessage.Read read : content.getReadList()) {
        readMessages.add(new ReadMessage(read.getSender(), read.getTimestamp()));
      }

      return SignalServiceSyncMessage.forRead(readMessages);
    }

    return SignalServiceSyncMessage.empty();
  }

  private SignalServiceGroup createGroupInfo(SignalServiceEnvelope envelope, DataMessage content) {
    if (! content.hasGroup()) return null;

    SignalServiceGroup.Type type;

    switch (content.getGroup().getType()) {
      case DELIVER:
        type = SignalServiceGroup.Type.DELIVER;
        break;
      case UPDATE:
        type = SignalServiceGroup.Type.UPDATE;
        break;
      case QUIT:
        type = SignalServiceGroup.Type.QUIT;
        break;
      case REQUEST_INFO:
        type = SignalServiceGroup.Type.REQUEST_INFO;
        break;
      default:
        type = SignalServiceGroup.Type.UNKNOWN;
        break;
    }

    if (content.getGroup().getType() != DELIVER) {
      String name = null;
      List<String> members = null;
      SignalServiceAttachmentPointer avatar = null;

      if (content.getGroup().hasName()) {
        name = content.getGroup().getName();
      }

      if (content.getGroup().getMembersCount() > 0) {
        members = content.getGroup().getMembersList();
      }

      if (content.getGroup().hasAvatar()) {
        avatar = new SignalServiceAttachmentPointer(content.getGroup().getAvatar().getId(),
          content.getGroup().getAvatar().getContentType(),
          content.getGroup().getAvatar().getKey().toByteArray(),
          envelope.getRelay());
      }

      return new SignalServiceGroup(type, content.getGroup().getId().toByteArray(), name, members, avatar);
    }

    return new SignalServiceGroup(content.getGroup().getId().toByteArray());
  }


}

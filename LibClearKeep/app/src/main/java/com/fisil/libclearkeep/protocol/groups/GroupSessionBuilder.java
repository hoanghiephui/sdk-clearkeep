package com.fisil.libclearkeep.protocol.groups;


import com.fisil.libclearkeep.protocol.exceptions.InvalidKeyException;
import com.fisil.libclearkeep.protocol.exceptions.InvalidKeyIdException;
import com.fisil.libclearkeep.protocol.groups.state.SenderKeyRecord;
import com.fisil.libclearkeep.protocol.groups.state.SenderKeyState;
import com.fisil.libclearkeep.protocol.groups.state.SenderKeyStore;
import com.fisil.libclearkeep.protocol.protocols.SenderKeyDistributionMessage;
import com.fisil.libclearkeep.protocol.utils.KeyHelper;

/**
 * GroupSessionBuilder is responsible for setting up group SenderKey encrypted sessions.
 * <p>
 * Once a session has been established, {@link com.fisil.libclearkeep.protocol.groups.GroupCipher}
 * can be used to encrypt/decrypt messages in that session.
 * <p>
 * The built sessions are unidirectional: they can be used either for sending or for receiving,
 * but not both.
 * <p>
 * Sessions are constructed per (groupId + senderId + deviceId) tuple.  Remote logical users
 * are identified by their senderId, and each logical recipientId can have multiple physical
 * devices.
 *
 * @author Moxie Marlinspike
 */

public class GroupSessionBuilder {

  private final SenderKeyStore senderKeyStore;

  public GroupSessionBuilder(SenderKeyStore senderKeyStore) {
    this.senderKeyStore = senderKeyStore;
  }

  /**
   * Construct a group session for receiving messages from senderKeyName.
   *
   * @param senderKeyName                The (groupId, senderId, deviceId) tuple associated with the SenderKeyDistributionMessage.
   * @param senderKeyDistributionMessage A received SenderKeyDistributionMessage.
   */
  public void process(SenderKeyName senderKeyName, SenderKeyDistributionMessage senderKeyDistributionMessage) {
    synchronized (GroupCipher.LOCK) {
      SenderKeyRecord senderKeyRecord = senderKeyStore.loadSenderKey(senderKeyName);
      senderKeyRecord.addSenderKeyState(senderKeyDistributionMessage.getId(),
      senderKeyDistributionMessage.getIteration(),
      senderKeyDistributionMessage.getChainKey(),
      senderKeyDistributionMessage.getSignatureKey());
      senderKeyStore.storeSenderKey(senderKeyName, senderKeyRecord);
    }
  }

  /**
   * Construct a group session for sending messages.
   *
   * @param senderKeyName The (groupId, senderId, deviceId) tuple.  In this case, 'senderId' should be the caller.
   * @return A SenderKeyDistributionMessage that is individually distributed to each member of the group.
   */
  public SenderKeyDistributionMessage create(SenderKeyName senderKeyName) {
    synchronized (GroupCipher.LOCK) {
      try {
        SenderKeyRecord senderKeyRecord = senderKeyStore.loadSenderKey(senderKeyName);

        if (senderKeyRecord.isEmpty()) {
          senderKeyRecord.setSenderKeyState(KeyHelper.generateSenderKeyId(),
          0,
          KeyHelper.generateSenderKey(),
          KeyHelper.generateSenderSigningKey());
          senderKeyStore.storeSenderKey(senderKeyName, senderKeyRecord);
        }

        SenderKeyState state = senderKeyRecord.getSenderKeyState();

        return new SenderKeyDistributionMessage(state.getKeyId(),
        state.getSenderChainKey().getIteration(),
        state.getSenderChainKey().getSeed(),
        state.getSigningKeyPublic());

      } catch (InvalidKeyIdException | InvalidKeyException e) {
        throw new AssertionError(e);
      }
    }
  }
}

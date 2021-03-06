package com.fisil.libclearkeep.protocol.groups.state;


import com.fisil.libclearkeep.protocol.groups.SenderKeyName;

public interface SenderKeyStore {

  /**
   * Commit to storage the {@link com.fisil.libclearkeep.protocol.groups.state.SenderKeyRecord} for a
   * given (groupId + senderId + deviceId) tuple.
   *
   * @param senderKeyName the (groupId + senderId + deviceId) tuple.
   * @param record        the current SenderKeyRecord for the specified senderKeyName.
   */
  public void storeSenderKey(SenderKeyName senderKeyName, SenderKeyRecord record);

  /**
   * Returns a copy of the {@link com.fisil.libclearkeep.protocol.groups.state.SenderKeyRecord}
   * corresponding to the (groupId + senderId + deviceId) tuple, or a new SenderKeyRecord if
   * one does not currently exist.
   * <p>
   * It is important that implementations return a copy of the current durable information.  The
   * returned SenderKeyRecord may be modified, but those changes should not have an effect on the
   * durable session state (what is returned by subsequent calls to this method) without the
   * store method being called here first.
   *
   * @param senderKeyName The (groupId + senderId + deviceId) tuple.
   * @return a copy of the SenderKeyRecord corresponding to the (groupId + senderId + deviceId tuple, or
   * a new SenderKeyRecord if one does not currently exist.
   */

  public SenderKeyRecord loadSenderKey(SenderKeyName senderKeyName);
}

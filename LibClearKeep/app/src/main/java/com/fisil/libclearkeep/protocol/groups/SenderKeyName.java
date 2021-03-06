package com.fisil.libclearkeep.protocol.groups;

import com.fisil.libclearkeep.protocol.SignalProtocolAddress;

/**
 * A representation of a (groupId + senderId + deviceId) tuple.
 */
public class SenderKeyName {

  private final String groupId;
  private final SignalProtocolAddress sender;

  public SenderKeyName(String groupId, SignalProtocolAddress sender) {
    this.groupId = groupId;
    this.sender = sender;
  }

  public String getGroupId() {
    return groupId;
  }

  public SignalProtocolAddress getSender() {
    return sender;
  }

  public String serialize() {
    return groupId + "::" + sender.getName() + "::" + String.valueOf(sender.getDeviceId());
  }

  @Override
  public boolean equals(Object other) {
    if (other == null) return false;
    if (!(other instanceof SenderKeyName)) return false;

    SenderKeyName that = (SenderKeyName) other;

    return
    this.groupId.equals(that.groupId) &&
    this.sender.equals(that.sender);
  }

  @Override
  public int hashCode() {
    return this.groupId.hashCode() ^ this.sender.hashCode();
  }

}

package com.fisil.libclearkeep.service.api.multidevice;

/**
 * Created by hoanghiep on 12/19/16.
 */
public class ReadMessage {
  private final String sender;
  private final long   timestamp;

  public ReadMessage(String sender, long timestamp) {
    this.sender    = sender;
    this.timestamp = timestamp;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public String getSender() {
    return sender;
  }
}

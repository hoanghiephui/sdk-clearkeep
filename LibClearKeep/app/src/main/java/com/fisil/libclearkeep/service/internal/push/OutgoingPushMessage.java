package com.fisil.libclearkeep.service.internal.push;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by hoanghiep on 12/19/16.
 */
public class OutgoingPushMessage {
  @JsonProperty
  private int type;
  @JsonProperty
  private int destinationDeviceId;
  @JsonProperty
  private int destinationRegistrationId;
  @JsonProperty
  private String body;
  @JsonProperty
  private String content;
  @JsonProperty
  private boolean silent;

  public OutgoingPushMessage(int type,
                             int destinationDeviceId,
                             int destinationRegistrationId,
                             String legacyMessage,
                             String content,
                             boolean silent) {
    this.type = type;
    this.destinationDeviceId = destinationDeviceId;
    this.destinationRegistrationId = destinationRegistrationId;
    this.body = legacyMessage;
    this.content = content;
    this.silent = silent;
  }
}

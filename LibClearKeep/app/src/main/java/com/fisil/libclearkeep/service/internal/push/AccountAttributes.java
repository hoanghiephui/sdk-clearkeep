package com.fisil.libclearkeep.service.internal.push;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class AccountAttributes {
  @JsonProperty
  private String  signalingKey;

  @JsonProperty
  private int     registrationId;

  @JsonProperty
  private boolean voice;

  public AccountAttributes(String signalingKey, int registrationId, boolean voice) {
    this.signalingKey   = signalingKey;
    this.registrationId = registrationId;
    this.voice          = voice;
  }

  public AccountAttributes() {}

  public String getSignalingKey() {
    return signalingKey;
  }

  public int getRegistrationId() {
    return registrationId;
  }

  public boolean isVoice() {
    return voice;
  }
}

package com.fisil.libclearkeep.service.api.push;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class ContactTokenDetails {
  @JsonProperty
  private String  token;

  @JsonProperty
  private String  relay;

  @JsonProperty
  private String  number;

  @JsonProperty
  private boolean voice;

  public ContactTokenDetails() {}

  /**
   * @return The "anonymized" token (truncated hash) that's transmitted to the server.
   */
  public String getToken() {
    return token;
  }

  /**
   * @return The federated server this contact is registered with, or null if on your server.
   */
  public String getRelay() {
    return relay;
  }

  /**
   * @return Whether this contact supports secure voice calls.
   */
  public boolean isVoice() {
    return voice;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * @return This contact's username (e164 formatted number).
   */
  public String getNumber() {
    return number;
  }
}

package com.fisil.libclearkeep.service.internal.push;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class DeviceCode {
  @JsonProperty
  private String verificationCode;

  public String getVerificationCode() {
    return verificationCode;
  }
}

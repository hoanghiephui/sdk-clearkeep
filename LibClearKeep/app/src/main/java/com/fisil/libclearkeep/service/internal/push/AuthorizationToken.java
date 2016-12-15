package com.fisil.libclearkeep.service.internal.push;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class AuthorizationToken {
  @JsonProperty
  private String token;

  public String getToken() {
    return token;
  }
}

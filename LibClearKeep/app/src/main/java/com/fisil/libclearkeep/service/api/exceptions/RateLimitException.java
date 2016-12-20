package com.fisil.libclearkeep.service.api.exceptions;

/**
 * Created by hoanghiep on 12/19/16.
 */

public class RateLimitException extends NonSuccessfulResponseCodeException {
  public RateLimitException(String s) {
    super(s);
  }
}


package com.fisil.libclearkeep.service.api.exceptions;

/**
 * Created by hoanghiep on 12/19/16.
 */

public class AuthorizationFailedException extends NonSuccessfulResponseCodeException {
  public AuthorizationFailedException(String s) {
    super(s);
  }
}

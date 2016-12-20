package com.fisil.libclearkeep.service.api.exceptions;

/**
 * Created by hoanghiep on 12/19/16.
 */

public class NotFoundException extends NonSuccessfulResponseCodeException {
  public NotFoundException(String s) {
    super(s);
  }
}

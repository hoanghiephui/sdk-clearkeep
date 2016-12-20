package com.fisil.libclearkeep.service.api.exceptions;

import java.io.IOException;

/**
 * Created by hoanghiep on 12/19/16.
 */

public class UnregisteredUserException extends IOException {

  private final String e164number;

  public UnregisteredUserException(String e164number, Exception exception) {
    super(exception);
    this.e164number = e164number;
  }

  public String getE164Number() {
    return e164number;
  }
}
package com.fisil.libclearkeep.service.api.exceptions;

/**
 * Created by hoanghiep on 12/19/16.
 */

public class NetworkFailureException extends Exception {

  private final String e164number;

  public NetworkFailureException(String e164number, Exception nested) {
    super(nested);
    this.e164number = e164number;
  }

  public String getE164number() {
    return e164number;
  }
}

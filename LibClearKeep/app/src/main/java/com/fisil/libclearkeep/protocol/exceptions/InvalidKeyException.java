package com.fisil.libclearkeep.protocol.exceptions;

public class InvalidKeyException extends Exception {

  public InvalidKeyException() {
  }

  public InvalidKeyException(String detailMessage) {
    super(detailMessage);
  }

  public InvalidKeyException(Throwable throwable) {
    super(throwable);
  }

  public InvalidKeyException(String detailMessage, Throwable throwable) {
    super(detailMessage, throwable);
  }
}

package com.fisil.libclearkeep.protocol.exceptions;

public class InvalidKeyIdException extends Exception {
  public InvalidKeyIdException(String detailMessage) {
    super(detailMessage);
  }

  public InvalidKeyIdException(Throwable throwable) {
    super(throwable);
  }
}

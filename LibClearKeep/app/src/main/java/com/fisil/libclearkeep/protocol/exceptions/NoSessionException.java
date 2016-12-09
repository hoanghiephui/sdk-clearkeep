package com.fisil.libclearkeep.protocol.exceptions;

public class NoSessionException extends Exception {
  public NoSessionException(String s) {
    super(s);
  }

  public NoSessionException(Exception nested) {
    super(nested);
  }
}

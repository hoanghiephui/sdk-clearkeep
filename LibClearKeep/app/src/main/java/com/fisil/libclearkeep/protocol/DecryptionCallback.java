package com.fisil.libclearkeep.protocol;

public interface DecryptionCallback {
  public void handlePlaintext(byte[] plaintext);
}
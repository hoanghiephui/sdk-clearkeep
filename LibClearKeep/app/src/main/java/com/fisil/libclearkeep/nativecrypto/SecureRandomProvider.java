package com.fisil.libclearkeep.nativecrypto;

public interface SecureRandomProvider {
  public void nextBytes(byte[] output);
  public int nextInt(int maxValue);
}

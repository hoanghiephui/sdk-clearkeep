package com.fisil.libclearkeep;

public interface SecureRandomProvider {
  public void nextBytes(byte[] output);
  public int nextInt(int maxValue);
}

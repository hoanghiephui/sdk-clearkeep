package com.fisil.libclearkeep.java;

public interface Sha512 {

  public void calculateDigest(byte[] out, byte[] in, long length);

}

package com.fisil.libclearkeep.protocol.ecc;

public interface ECPrivateKey {
  public byte[] serialize();

  public int getType();
}

package com.fisil.libclearkeep.protocol.ecc;

public interface ECPublicKey extends Comparable<ECPublicKey> {

  public static final int KEY_SIZE = 33;

  public byte[] serialize();

  public int getType();
}

package com.fisil.libclearkeep.protocol.kdf;

import com.fisil.libclearkeep.protocol.utils.ByteUtil;

public class DerivedRootSecrets {

  public static final int SIZE = 64;

  private final byte[] rootKey;
  private final byte[] chainKey;

  public DerivedRootSecrets(byte[] okm) {
    byte[][] keys = ByteUtil.split(okm, 32, 32);
    this.rootKey = keys[0];
    this.chainKey = keys[1];
  }

  public byte[] getRootKey() {
    return rootKey;
  }

  public byte[] getChainKey() {
    return chainKey;
  }

}

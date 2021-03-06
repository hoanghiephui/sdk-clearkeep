package com.fisil.libclearkeep.protocol.ratchet;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MessageKeys {

  private final SecretKeySpec cipherKey;
  private final SecretKeySpec macKey;
  private final IvParameterSpec iv;
  private final int counter;

  public MessageKeys(SecretKeySpec cipherKey, SecretKeySpec macKey, IvParameterSpec iv, int counter) {
    this.cipherKey = cipherKey;
    this.macKey = macKey;
    this.iv = iv;
    this.counter = counter;
  }

  public SecretKeySpec getCipherKey() {
    return cipherKey;
  }

  public SecretKeySpec getMacKey() {
    return macKey;
  }

  public IvParameterSpec getIv() {
    return iv;
  }

  public int getCounter() {
    return counter;
  }
}

package com.fisil.libclearkeep;

/**
 * Created by Hoang Hiep on 12/9/2016.
 */

public class NativeCryptoKeyPair {
  private final byte[] publicKey;
  private final byte[] privateKey;

  NativeCryptoKeyPair(byte[] publicKey, byte[] privateKey) {
    this.publicKey = publicKey;
    this.privateKey = privateKey;
  }

  /**
   * @return The public key.
   */
  public byte[] getPublicKey() {
    return publicKey;
  }

  /**
   * @return The private key.
   */
  public byte[] getPrivateKey() {
    return privateKey;
  }
}

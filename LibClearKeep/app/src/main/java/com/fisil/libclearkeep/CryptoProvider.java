package com.fisil.libclearkeep;

/**
 * Created by Hoang Hiep on 12/9/2016.
 */

public interface CryptoProvider {
  static final int PRIVATE_KEY_LEN = 32;

  boolean isNative();

  byte[] calculateAgreement(byte[] ourPrivate, byte[] theirPublic);

  byte[] generatePublicKey(byte[] privateKey);

  byte[] generatePrivateKey();

  byte[] generatePrivateKey(byte[] random);

  byte[] calculateSignature(byte[] random, byte[] privateKey, byte[] message);

  boolean verifySignature(byte[] publicKey, byte[] message, byte[] signature);

  byte[] calculateVrfSignature(byte[] random, byte[] privateKey, byte[] message);

  byte[] verifyVrfSignature(byte[] publicKey, byte[] message, byte[] signature)
  throws VrfSignatureVerificationFailedException;

  byte[] getRandom(int length);

  void setRandomProvider(SecureRandomProvider provider);
}

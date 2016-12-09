package com.fisil.libclearkeep.protocol.ecc;


import com.fisil.libclearkeep.nativecrypto.NativeCrypto;
import com.fisil.libclearkeep.nativecrypto.NativeCryptoKeyPair;
import com.fisil.libclearkeep.nativecrypto.VrfSignatureVerificationFailedException;
import com.fisil.libclearkeep.protocol.exceptions.InvalidKeyException;

import static com.fisil.libclearkeep.nativecrypto.NativeCrypto.BEST;

public class Curve {

  public static final int DJB_TYPE = 0x05;

  public static boolean isNative() {
    return NativeCrypto.getInstance(BEST).isNative();
  }

  public static ECKeyPair generateKeyPair() {
    NativeCryptoKeyPair keyPair = NativeCrypto.getInstance(BEST).generateKeyPair();

    return new ECKeyPair(new DjbECPublicKey(keyPair.getPublicKey()),
    new DjbECPrivateKey(keyPair.getPrivateKey()));
  }

  public static ECPublicKey decodePoint(byte[] bytes, int offset)
  throws InvalidKeyException {
    int type = bytes[offset] & 0xFF;

    switch (type) {
      case Curve.DJB_TYPE:
        byte[] keyBytes = new byte[32];
        System.arraycopy(bytes, offset + 1, keyBytes, 0, keyBytes.length);
        return new DjbECPublicKey(keyBytes);
      default:
        throw new InvalidKeyException("Bad key type: " + type);
    }
  }

  public static ECPrivateKey decodePrivatePoint(byte[] bytes) {
    return new DjbECPrivateKey(bytes);
  }

  public static byte[] calculateAgreement(ECPublicKey publicKey, ECPrivateKey privateKey)
  throws InvalidKeyException {
    if (publicKey.getType() != privateKey.getType()) {
      throw new InvalidKeyException("Public and private keys must be of the same type!");
    }

    if (publicKey.getType() == DJB_TYPE) {
      return NativeCrypto.getInstance(BEST)
      .calculateAgreement(((DjbECPublicKey) publicKey).getPublicKey(),
      ((DjbECPrivateKey) privateKey).getPrivateKey());
    } else {
      throw new InvalidKeyException("Unknown type: " + publicKey.getType());
    }
  }

  public static boolean verifySignature(ECPublicKey signingKey, byte[] message, byte[] signature)
  throws InvalidKeyException {
    if (signingKey.getType() == DJB_TYPE) {
      return NativeCrypto.getInstance(BEST)
      .verifySignature(((DjbECPublicKey) signingKey).getPublicKey(), message, signature);
    } else {
      throw new InvalidKeyException("Unknown type: " + signingKey.getType());
    }
  }

  public static byte[] calculateSignature(ECPrivateKey signingKey, byte[] message)
  throws InvalidKeyException {
    if (signingKey.getType() == DJB_TYPE) {
      return NativeCrypto.getInstance(BEST)
      .calculateSignature(((DjbECPrivateKey) signingKey).getPrivateKey(), message);
    } else {
      throw new InvalidKeyException("Unknown type: " + signingKey.getType());
    }
  }

  public static byte[] calculateVrfSignature(ECPrivateKey signingKey, byte[] message)
  throws InvalidKeyException {
    if (signingKey.getType() == DJB_TYPE) {
      return NativeCrypto.getInstance(BEST)
      .calculateVrfSignature(((DjbECPrivateKey) signingKey).getPrivateKey(), message);
    } else {
      throw new InvalidKeyException("Unknown type: " + signingKey.getType());
    }
  }

  public static byte[] verifyVrfSignature(ECPublicKey signingKey, byte[] message, byte[] signature)
  throws InvalidKeyException, VrfSignatureVerificationFailedException {
    if (signingKey.getType() == DJB_TYPE) {
      return NativeCrypto.getInstance(BEST)
      .verifyVrfSignature(((DjbECPublicKey) signingKey).getPublicKey(), message, signature);
    } else {
      throw new InvalidKeyException("Unknown type: " + signingKey.getType());
    }
  }

}

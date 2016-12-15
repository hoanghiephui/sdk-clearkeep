package com.fisil.libclearkeep.protocol.ratchet;


import com.fisil.libclearkeep.protocol.ecc.Curve;
import com.fisil.libclearkeep.protocol.ecc.ECKeyPair;
import com.fisil.libclearkeep.protocol.ecc.ECPublicKey;
import com.fisil.libclearkeep.protocol.exceptions.InvalidKeyException;
import com.fisil.libclearkeep.protocol.kdf.DerivedRootSecrets;
import com.fisil.libclearkeep.protocol.kdf.HKDF;
import com.fisil.libclearkeep.protocol.utils.Pair;

public class RootKey {

  private final HKDF kdf;
  private final byte[] key;

  public RootKey(HKDF kdf, byte[] key) {
    this.kdf = kdf;
    this.key = key;
  }

  public byte[] getKeyBytes() {
    return key;
  }

  // TODO: 12/15/16 chu y
  public Pair<RootKey, ChainKey> createChain(ECPublicKey theirRatchetKey, ECKeyPair ourRatchetKey)
  throws InvalidKeyException {
    byte[] sharedSecret = Curve.calculateAgreement(theirRatchetKey, ourRatchetKey.getPrivateKey());
    byte[] derivedSecretBytes = kdf.deriveSecrets(sharedSecret, key, "WhisperRatchet".getBytes(), DerivedRootSecrets.SIZE);
    DerivedRootSecrets derivedSecrets = new DerivedRootSecrets(derivedSecretBytes);

    RootKey newRootKey = new RootKey(kdf, derivedSecrets.getRootKey());
    ChainKey newChainKey = new ChainKey(kdf, derivedSecrets.getChainKey(), 0);

    return new Pair<>(newRootKey, newChainKey);
  }
}

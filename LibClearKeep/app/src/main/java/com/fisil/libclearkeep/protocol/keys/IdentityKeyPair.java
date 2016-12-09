package com.fisil.libclearkeep.protocol.keys;

import com.fisil.libclearkeep.protocol.ecc.Curve;
import com.fisil.libclearkeep.protocol.ecc.ECPrivateKey;
import com.fisil.libclearkeep.protocol.exceptions.InvalidKeyException;
import com.fisil.libclearkeep.protocol.state.StorageProtos;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;


/**
 * Holder for public and private identity key pair.
 */
public class IdentityKeyPair {

  private final IdentityKey publicKey;
  private final ECPrivateKey privateKey;

  public IdentityKeyPair(IdentityKey publicKey, ECPrivateKey privateKey) {
    this.publicKey = publicKey;
    this.privateKey = privateKey;
  }

  public IdentityKeyPair(byte[] serialized) throws InvalidKeyException {
    try {
      StorageProtos.IdentityKeyPairStructure structure = StorageProtos.IdentityKeyPairStructure.parseFrom(serialized);
      this.publicKey = new IdentityKey(structure.getPublicKey().toByteArray(), 0);
      this.privateKey = Curve.decodePrivatePoint(structure.getPrivateKey().toByteArray());
    } catch (InvalidProtocolBufferException e) {
      throw new InvalidKeyException(e);
    }
  }

  public IdentityKey getPublicKey() {
    return publicKey;
  }

  public ECPrivateKey getPrivateKey() {
    return privateKey;
  }

  public byte[] serialize() {
    return StorageProtos.IdentityKeyPairStructure.newBuilder()
    .setPublicKey(ByteString.copyFrom(publicKey.serialize()))
    .setPrivateKey(ByteString.copyFrom(privateKey.serialize()))
    .build().toByteArray();
  }
}

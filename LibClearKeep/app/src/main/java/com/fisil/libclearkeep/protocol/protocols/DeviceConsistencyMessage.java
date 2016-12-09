package com.fisil.libclearkeep.protocol.protocols;

import com.fisil.libclearkeep.nativecrypto.VrfSignatureVerificationFailedException;
import com.fisil.libclearkeep.protocol.devices.DeviceConsistencyCommitment;
import com.fisil.libclearkeep.protocol.devices.DeviceConsistencySignature;
import com.fisil.libclearkeep.protocol.ecc.Curve;
import com.fisil.libclearkeep.protocol.exceptions.InvalidKeyException;
import com.fisil.libclearkeep.protocol.exceptions.InvalidMessageException;
import com.fisil.libclearkeep.protocol.keys.IdentityKey;
import com.fisil.libclearkeep.protocol.keys.IdentityKeyPair;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;


public class DeviceConsistencyMessage {

  private final DeviceConsistencySignature signature;
  private final int generation;
  private final byte[] serialized;

  public DeviceConsistencyMessage(DeviceConsistencyCommitment commitment, IdentityKeyPair identityKeyPair) {
    try {
      byte[] signatureBytes = Curve.calculateVrfSignature(identityKeyPair.getPrivateKey(), commitment.toByteArray());
      byte[] vrfOutputBytes = Curve.verifyVrfSignature(identityKeyPair.getPublicKey().getPublicKey(), commitment.toByteArray(), signatureBytes);

      this.generation = commitment.getGeneration();
      this.signature = new DeviceConsistencySignature(signatureBytes, vrfOutputBytes);
      this.serialized = SignalProtos.DeviceConsistencyCodeMessage.newBuilder()
      .setGeneration(commitment.getGeneration())
      .setSignature(ByteString.copyFrom(signature.getSignature()))
      .build()
      .toByteArray();
    } catch (InvalidKeyException | VrfSignatureVerificationFailedException e) {
      throw new AssertionError(e);
    }
  }

  public DeviceConsistencyMessage(DeviceConsistencyCommitment commitment, byte[] serialized, IdentityKey identityKey) throws InvalidMessageException {
    try {
      SignalProtos.DeviceConsistencyCodeMessage message = SignalProtos.DeviceConsistencyCodeMessage.parseFrom(serialized);
      byte[] vrfOutputBytes = Curve.verifyVrfSignature(identityKey.getPublicKey(), commitment.toByteArray(), message.getSignature().toByteArray());

      this.generation = message.getGeneration();
      this.signature = new DeviceConsistencySignature(message.getSignature().toByteArray(), vrfOutputBytes);
      this.serialized = serialized;
    } catch (InvalidProtocolBufferException | InvalidKeyException | VrfSignatureVerificationFailedException e) {
      throw new InvalidMessageException(e);
    }
  }

  public byte[] getSerialized() {
    return serialized;
  }

  public DeviceConsistencySignature getSignature() {
    return signature;
  }

  public int getGeneration() {
    return generation;
  }
}

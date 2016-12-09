package com.fisil.libclearkeep.protocol.fingerprint;

import com.fisil.libclearkeep.protocol.utils.ByteUtil;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import java.security.MessageDigest;

public class ScannableFingerprint {

  private static final int VERSION = 1;

  private final FingerprintProtos.CombinedFingerprints fingerprints;

  ScannableFingerprint(byte[] localFingerprintData, byte[] remoteFingerprintData) {
    FingerprintProtos.LogicalFingerprint localFingerprint = FingerprintProtos.LogicalFingerprint.newBuilder()
    .setContent(ByteString.copyFrom(ByteUtil.trim(localFingerprintData, 32)))
    .build();

    FingerprintProtos.LogicalFingerprint remoteFingerprint = FingerprintProtos.LogicalFingerprint.newBuilder()
    .setContent(ByteString.copyFrom(ByteUtil.trim(remoteFingerprintData, 32)))
    .build();

    this.fingerprints = FingerprintProtos.CombinedFingerprints.newBuilder()
    .setVersion(VERSION)
    .setLocalFingerprint(localFingerprint)
    .setRemoteFingerprint(remoteFingerprint)
    .build();
  }

  /**
   * @return A byte string to be displayed in a QR code.
   */
  public byte[] getSerialized() {
    return fingerprints.toByteArray();
  }

  /**
   * Compare a scanned QR code with what we expect.
   *
   * @param scannedFingerprintData The scanned data
   * @return True if matching, otehrwise false.
   * @throws FingerprintVersionMismatchException if the scanned fingerprint is the wrong version.
   */
  public boolean compareTo(byte[] scannedFingerprintData)
  throws FingerprintVersionMismatchException,
  FingerprintParsingException {
    try {
      FingerprintProtos.CombinedFingerprints scanned = FingerprintProtos.CombinedFingerprints.parseFrom(scannedFingerprintData);

      if (!scanned.hasRemoteFingerprint() || !scanned.hasLocalFingerprint() ||
      !scanned.hasVersion() || scanned.getVersion() != VERSION) {
        throw new FingerprintVersionMismatchException(scanned.getVersion(), VERSION);
      }

      return MessageDigest.isEqual(fingerprints.getLocalFingerprint().getContent().toByteArray(), scanned.getRemoteFingerprint().getContent().toByteArray()) &&
      MessageDigest.isEqual(fingerprints.getRemoteFingerprint().getContent().toByteArray(), scanned.getLocalFingerprint().getContent().toByteArray());
    } catch (InvalidProtocolBufferException e) {
      throw new FingerprintParsingException(e);
    }
  }
}

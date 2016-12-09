package com.fisil.libclearkeep.protocol.devices;

import com.fisil.libclearkeep.protocol.keys.IdentityKey;
import com.fisil.libclearkeep.protocol.keys.IdentityKeyComparator;
import com.fisil.libclearkeep.protocol.utils.ByteUtil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeviceConsistencyCommitment {

  private static final String VERSION = "DeviceConsistencyCommitment_V0";

  private final int generation;
  private final byte[] serialized;

  public DeviceConsistencyCommitment(int generation, List<IdentityKey> identityKeys) {
    try {
      ArrayList<IdentityKey> sortedIdentityKeys = new ArrayList<>(identityKeys);
      Collections.sort(sortedIdentityKeys, new IdentityKeyComparator());

      MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
      messageDigest.update(VERSION.getBytes());
      messageDigest.update(ByteUtil.intToByteArray(generation));

      for (IdentityKey commitment : sortedIdentityKeys) {
        messageDigest.update(commitment.getPublicKey().serialize());
      }

      this.generation = generation;
      this.serialized = messageDigest.digest();
    } catch (NoSuchAlgorithmException e) {
      throw new AssertionError(e);
    }
  }

  public byte[] toByteArray() {
    return serialized;
  }

  public int getGeneration() {
    return generation;
  }


}

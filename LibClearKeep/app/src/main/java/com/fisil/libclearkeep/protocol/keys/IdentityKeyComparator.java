package com.fisil.libclearkeep.protocol.keys;

import com.fisil.libclearkeep.protocol.utils.ByteArrayComparator;

import java.util.Comparator;

public class IdentityKeyComparator extends ByteArrayComparator implements Comparator<IdentityKey> {

  @Override
  public int compare(IdentityKey first, IdentityKey second) {
    return compare(first.getPublicKey().serialize(), second.getPublicKey().serialize());
  }
}

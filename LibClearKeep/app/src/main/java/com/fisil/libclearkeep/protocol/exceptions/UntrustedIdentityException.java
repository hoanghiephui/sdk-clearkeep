package com.fisil.libclearkeep.protocol.exceptions;

import com.fisil.libclearkeep.protocol.keys.IdentityKey;

public class UntrustedIdentityException extends Exception {

  private final String name;
  private final IdentityKey key;

  public UntrustedIdentityException(String name, IdentityKey key) {
    this.name = name;
    this.key = key;
  }

  public IdentityKey getUntrustedIdentity() {
    return key;
  }

  public String getName() {
    return name;
  }
}

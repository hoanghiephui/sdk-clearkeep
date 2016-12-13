/**
 * Copyright (C) 2014-2016 Open Whisper Systems
 *
 * Licensed according to the LICENSE file in this repository.
 */

package com.fisil.libclearkeep.nativecrypto;

public class NullSecureRandomProvider implements SecureRandomProvider {
//  @Override
  public void nextBytes(byte[] output) {
    throw new IllegalArgumentException("No default J2ME Secure Random provider available!");
  }

//  @Override
  public int nextInt(int maxValue) {
    throw new IllegalArgumentException("No default J2ME Secure Random provider available!");
  }
}

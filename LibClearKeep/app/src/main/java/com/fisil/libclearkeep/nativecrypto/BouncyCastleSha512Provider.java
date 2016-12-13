package com.fisil.libclearkeep.nativecrypto;


import com.fisil.libclearkeep.java.Sha512;

import org.bouncycastle.crypto.digests.SHA512Digest;

public class BouncyCastleSha512Provider implements Sha512 {
  //@Override
  public void calculateDigest(byte[] out, byte[] in, long length) {
    SHA512Digest digest = new SHA512Digest();
    digest.update(in, 0, (int)length);
    digest.doFinal(out, 0);
  }
}

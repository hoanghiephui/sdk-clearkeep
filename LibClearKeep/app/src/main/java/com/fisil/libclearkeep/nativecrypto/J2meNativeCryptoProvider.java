package com.fisil.libclearkeep.nativecrypto;

public class J2meNativeCryptoProvider extends BaseJavaNativeCryptoProvider {

  protected J2meNativeCryptoProvider() {
    super(new BouncyCastleSha512Provider(), new NullSecureRandomProvider());
  }

//  @Override
  public boolean isNative() {
    return false;
  }
}

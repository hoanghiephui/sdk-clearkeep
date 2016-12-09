package com.fisil.libclearkeep.nativecrypto;

public class JavaNativeCryptorProvider extends BaseJavaNativeCryptoProvider {

  protected JavaNativeCryptorProvider() {
    super(new JCESha512Provider(), new JCESecureRandomProvider());
  }

  @Override
  public boolean isNative() {
    return false;
  }

}

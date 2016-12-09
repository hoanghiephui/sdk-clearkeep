package com.fisil.libclearkeep;

public class JavaNativeCryptorProvider extends BaseJavaNativeCryptoProvider {

  protected JavaNativeCryptorProvider() {
    super(new JCESha512Provider(), new JCESecureRandomProvider());
  }

  @Override
  public boolean isNative() {
    return false;
  }

}

package com.fisil.libclearkeep;

public class OpportunisticProvider implements CryptoProvider {

  private CryptoProvider delegate;

  OpportunisticProvider() {
    try {
      delegate = new NativeCryptorProvider();
    } catch (NoSuchProviderException e) {
      delegate = new JavaNativeCryptorProvider();
    }
  }

  @Override
  public boolean isNative() {
    return delegate.isNative();
  }

  @Override
  public byte[] calculateAgreement(byte[] ourPrivate, byte[] theirPublic) {
    return delegate.calculateAgreement(ourPrivate, theirPublic);
  }

  @Override
  public byte[] generatePublicKey(byte[] privateKey) {
    return delegate.generatePublicKey(privateKey);
  }

  @Override
  public byte[] generatePrivateKey() {
    return delegate.generatePrivateKey();
  }

  @Override
  public byte[] generatePrivateKey(byte[] random) {
    return delegate.generatePrivateKey(random);
  }

  @Override
  public byte[] getRandom(int length) {
    return delegate.getRandom(length);
  }

  @Override
  public void setRandomProvider(SecureRandomProvider provider) {
    delegate.setRandomProvider(provider);
  }

  @Override
  public byte[] calculateSignature(byte[] random, byte[] privateKey, byte[] message) {
    return delegate.calculateSignature(random, privateKey, message);
  }

  @Override
  public boolean verifySignature(byte[] publicKey, byte[] message, byte[] signature) {
    return delegate.verifySignature(publicKey, message, signature);
  }

  @Override
  public byte[] calculateVrfSignature(byte[] random, byte[] privateKey, byte[] message) {
    return delegate.calculateVrfSignature(random, privateKey, message);
  }

  @Override
  public byte[] verifyVrfSignature(byte[] publicKey, byte[] message, byte[] signature)
      throws VrfSignatureVerificationFailedException
  {
    return delegate.verifyVrfSignature(publicKey, message, signature);
  }

}

package com.fisil.libclearkeep.nativecrypto;


/**
 * Created by Hoang Hiep on 12/9/2016.
 */

public class NativeCrypto {
  public static final String NATIVE = "native";
  public static final String JAVA = "java";
  public static final String J2ME = "j2me";
  public static final String BEST = "best";
  private final CryptoProvider provider;

  private NativeCrypto(CryptoProvider provider) {
    this.provider = provider;
  }

  public static NativeCrypto getInstance(String type) throws NoSuchProviderException {
    return getInstance(type, null);
  }

  public static NativeCrypto getInstance(String type, SecureRandomProvider random)
  throws NoSuchProviderException {
    if (NATIVE.equals(type)) return new NativeCrypto(constructNativeProvider(random));
    else if (JAVA.equals(type)) return new NativeCrypto(constructJavaProvider(random));
    else if (J2ME.equals(type)) return new NativeCrypto(constructJ2meProvider(random));
    else if (BEST.equals(type)) return new NativeCrypto(constructOpportunisticProvider(random));
    else throw new NoSuchProviderException(type);
  }

  private static CryptoProvider constructNativeProvider(SecureRandomProvider random) throws NoSuchProviderException {
    return constructClass("NativeCurve25519Provider", random);
  }

  private static CryptoProvider constructJavaProvider(SecureRandomProvider random) throws NoSuchProviderException {
    return constructClass("JavaCurve25519Provider", random);
  }

  private static CryptoProvider constructJ2meProvider(SecureRandomProvider random) throws NoSuchProviderException {
    return constructClass("J2meCurve25519Provider", random);
  }

  private static CryptoProvider constructOpportunisticProvider(SecureRandomProvider random) throws NoSuchProviderException {
    return constructClass("OpportunisticCurve25519Provider", random);
  }

  private static CryptoProvider constructClass(String name, SecureRandomProvider random) throws NoSuchProviderException {
    try {
      CryptoProvider provider = (CryptoProvider) Class.forName("org.whispersystems.curve25519." + name).newInstance();

      if (random != null) {
        provider.setRandomProvider(random);
      }

      return provider;
    } catch (InstantiationException e) {
      throw new NoSuchProviderException(e);
    } catch (IllegalAccessException e) {
      throw new NoSuchProviderException(e);
    } catch (ClassNotFoundException e) {
      throw new NoSuchProviderException(e);
    }
  }

  /**
   * {@link NativeCrypto} is backed by either a native (via JNI)
   * or pure-Java provider.  By default it prefers the native provider, and falls back to the
   * pure-Java provider if the native library fails to load.
   *
   * @return true if backed by a native provider, false otherwise.
   */
  public boolean isNative() {
    return provider.isNative();
  }

  /**
   * Generates a keypair.
   *
   * @return A randomly generated Curve25519 keypair.
   */
  public NativeCryptoKeyPair generateKeyPair() {
    byte[] privateKey = provider.generatePrivateKey();
    byte[] publicKey = provider.generatePublicKey(privateKey);

    return new NativeCryptoKeyPair(publicKey, privateKey);
  }

  /**
   * Calculates an ECDH agreement.
   *
   * @param publicKey  The Curve25519 (typically remote party's) public key.
   * @param privateKey The Curve25519 (typically yours) private key.
   * @return A 32-byte shared secret.
   */
  public byte[] calculateAgreement(byte[] publicKey, byte[] privateKey) {
    if (publicKey == null || privateKey == null) {
      throw new IllegalArgumentException("Keys must not be null!");
    }

    if (publicKey.length != 32 || privateKey.length != 32) {
      throw new IllegalArgumentException("Keys must be 32 bytes!");
    }

    return provider.calculateAgreement(privateKey, publicKey);
  }

  /**
   * Calculates a Curve25519 signature.
   *
   * @param privateKey The private Curve25519 key to create the signature with.
   * @param message    The message to sign.
   * @return A 64-byte signature.
   */
  public byte[] calculateSignature(byte[] privateKey, byte[] message) {
    if (privateKey == null || privateKey.length != 32) {
      throw new IllegalArgumentException("Invalid private key length!");
    }

    byte[] random = provider.getRandom(64);
    return provider.calculateSignature(random, privateKey, message);
  }

  /**
   * Verify a Curve25519 signature.
   *
   * @param publicKey The Curve25519 public key the signature belongs to.
   * @param message   The message that was signed.
   * @param signature The signature to verify.
   * @return true if valid, false if not.
   */
  public boolean verifySignature(byte[] publicKey, byte[] message, byte[] signature) {
    if (publicKey == null || publicKey.length != 32) {
      throw new IllegalArgumentException("Invalid public key!");
    }

    if (message == null || signature == null || signature.length != 64) {
      return false;
    }

    return provider.verifySignature(publicKey, message, signature);
  }

  /**
   * Calculates a Unique Curve25519 signature.
   *
   * @param privateKey The private Curve25519 key to create the signature with.
   * @param message    The message to sign.
   * @return A 96-byte signature.
   */
  public byte[] calculateVrfSignature(byte[] privateKey, byte[] message) {
    if (privateKey == null || privateKey.length != 32) {
      throw new IllegalArgumentException("Invalid private key!");
    }

    byte[] random = provider.getRandom(64);
    return provider.calculateVrfSignature(random, privateKey, message);
  }

  /**
   * Verify a Unique Curve25519 signature.
   *
   * @param publicKey The Curve25519 public key the unique signature belongs to.
   * @param message   The message that was signed.
   * @param signature The unique signature to verify.
   * @return The vrf for this signature.
   */
  public byte[] verifyVrfSignature(byte[] publicKey, byte[] message, byte[] signature)
  throws VrfSignatureVerificationFailedException {
    if (publicKey == null || publicKey.length != 32) {
      throw new IllegalArgumentException("Invalid public key!");
    }

    if (message == null || signature == null || signature.length != 96) {
      throw new VrfSignatureVerificationFailedException("Invalid message or signature format");
    }

    return provider.verifyVrfSignature(publicKey, message, signature);
  }
}

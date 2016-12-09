package com.fisil.libclearkeep.protocol.state;

import com.fisil.libclearkeep.protocol.SignalProtocolAddress;
import com.fisil.libclearkeep.protocol.keys.IdentityKey;
import com.fisil.libclearkeep.protocol.keys.IdentityKeyPair;

/**
 * Provides an interface to identity information.
 */
public interface IdentityKeyStore {

  /**
   * Get the local client's identity key pair.
   *
   * @return The local client's persistent identity key pair.
   */
  public IdentityKeyPair getIdentityKeyPair();

  /**
   * Return the local client's registration ID.
   * <p>
   * Clients should maintain a registration ID, a random number
   * between 1 and 16380 that's generated once at install time.
   *
   * @return the local client's registration ID.
   */
  public int getLocalRegistrationId();

  /**
   * Save a remote client's identity key
   * <p>
   * Store a remote client's identity key as trusted.
   *
   * @param address     The address of the remote client.
   * @param identityKey The remote client's identity key.
   */
  public void saveIdentity(SignalProtocolAddress address, IdentityKey identityKey);


  /**
   * Verify a remote client's identity key.
   * <p>
   * Determine whether a remote client's identity is trusted.  Convention is
   * that the TextSecure protocol is 'trust on first use.'  This means that
   * an identity key is considered 'trusted' if there is no entry for the recipient
   * in the local store, or if it matches the saved key for a recipient in the local
   * store.  Only if it mismatches an entry in the local store is it considered
   * 'untrusted.'
   *
   * @param address     The address of the remote client.
   * @param identityKey The identity key to verify.
   * @return true if trusted, false if untrusted.
   */
  public boolean isTrustedIdentity(SignalProtocolAddress address, IdentityKey identityKey);

}

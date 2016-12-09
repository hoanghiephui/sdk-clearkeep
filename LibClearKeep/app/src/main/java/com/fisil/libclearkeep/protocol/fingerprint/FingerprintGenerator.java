package com.fisil.libclearkeep.protocol.fingerprint;

import com.fisil.libclearkeep.protocol.keys.IdentityKey;

import java.util.List;

public interface FingerprintGenerator {
  public Fingerprint createFor(String localStableIdentifier, IdentityKey localIdentityKey,
                               String remoteStableIdentifier, IdentityKey remoteIdentityKey);

  public Fingerprint createFor(String localStableIdentifier, List<IdentityKey> localIdentityKey,
                               String remoteStableIdentifier, List<IdentityKey> remoteIdentityKey);
}

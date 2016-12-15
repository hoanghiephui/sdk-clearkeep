package com.fisil.libclearkeep.service.api.push;

import java.io.InputStream;

/**
 * A class that represents a Java {@link java.security.KeyStore} and
 * its associated password.
 * Created by hoanghiep on 12/15/16.
 */
public interface TrustStore {
  public InputStream getKeyStoreInputStream();
  public String getKeyStorePassword();
}
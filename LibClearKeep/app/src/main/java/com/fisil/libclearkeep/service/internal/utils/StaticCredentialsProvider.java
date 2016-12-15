package com.fisil.libclearkeep.service.internal.utils;

import com.fisil.libclearkeep.service.api.utils.CredentialsProvider;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class StaticCredentialsProvider implements CredentialsProvider {

  private final String user;
  private final String password;
  private final String signalingKey;

  public StaticCredentialsProvider(String user, String password, String signalingKey) {
    this.user         = user;
    this.password     = password;
    this.signalingKey = signalingKey;
  }

  @Override
  public String getUser() {
    return user;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getSignalingKey() {
    return signalingKey;
  }
}

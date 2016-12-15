package com.fisil.libclearkeep.service.api.utils;

/**
 * Created by hoanghiep on 12/15/16.
 */

public interface CredentialsProvider {
  public String getUser();
  public String getPassword();
  public String getSignalingKey();
}

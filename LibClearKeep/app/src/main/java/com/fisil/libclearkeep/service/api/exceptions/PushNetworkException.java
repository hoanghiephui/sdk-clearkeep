package com.fisil.libclearkeep.service.api.exceptions;

import java.io.IOException;

/**
 * Created by hoanghiep on 12/19/16.
 */

public class PushNetworkException extends IOException {

  public PushNetworkException(Exception exception) {
    super(exception);
  }

  public PushNetworkException(String s) {
    super(s);
  }

}

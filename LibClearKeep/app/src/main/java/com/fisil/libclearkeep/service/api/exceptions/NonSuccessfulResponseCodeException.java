package com.fisil.libclearkeep.service.api.exceptions;

import java.io.IOException;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class NonSuccessfulResponseCodeException extends IOException {

  public NonSuccessfulResponseCodeException() {
    super();
  }

  public NonSuccessfulResponseCodeException(String s) {
    super(s);
  }
}

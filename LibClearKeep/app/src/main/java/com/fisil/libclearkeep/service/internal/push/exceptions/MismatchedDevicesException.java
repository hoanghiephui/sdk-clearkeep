package com.fisil.libclearkeep.service.internal.push.exceptions;

import com.fisil.libclearkeep.service.api.exceptions.NonSuccessfulResponseCodeException;
import com.fisil.libclearkeep.service.internal.push.MismatchedDevices;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class MismatchedDevicesException extends NonSuccessfulResponseCodeException {

  private final MismatchedDevices mismatchedDevices;

  public MismatchedDevicesException(MismatchedDevices mismatchedDevices) {
    this.mismatchedDevices = mismatchedDevices;
  }

  public MismatchedDevices getMismatchedDevices() {
    return mismatchedDevices;
  }
}
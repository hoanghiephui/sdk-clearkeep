package com.fisil.libclearkeep.service.internal.push.exceptions;

import com.fisil.libclearkeep.service.api.exceptions.NonSuccessfulResponseCodeException;
import com.fisil.libclearkeep.service.internal.push.StaleDevices;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class StaleDevicesException extends NonSuccessfulResponseCodeException {

  private final StaleDevices staleDevices;

  public StaleDevicesException(StaleDevices staleDevices) {
    this.staleDevices = staleDevices;
  }

  public StaleDevices getStaleDevices() {
    return staleDevices;
  }
}

package com.fisil.libclearkeep.service.internal.push;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fisil.libclearkeep.service.api.multidevice.DeviceInfo;

import java.util.List;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class DeviceInfoList {
  @JsonProperty
  private List<DeviceInfo> devices;

  public DeviceInfoList() {}

  public List<DeviceInfo> getDevices() {
    return devices;
  }
}

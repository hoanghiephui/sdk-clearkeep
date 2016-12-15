package com.fisil.libclearkeep.service.internal.push;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class MismatchedDevices {
  @JsonProperty
  private List<Integer> missingDevices;

  @JsonProperty
  private List<Integer> extraDevices;

  public List<Integer> getMissingDevices() {
    return missingDevices;
  }

  public List<Integer> getExtraDevices() {
    return extraDevices;
  }
}

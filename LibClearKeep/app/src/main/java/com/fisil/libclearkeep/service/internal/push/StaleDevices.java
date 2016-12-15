package com.fisil.libclearkeep.service.internal.push;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class StaleDevices {
  @JsonProperty
  private List<Integer> staleDevices;

  public List<Integer> getStaleDevices() {
    return staleDevices;
  }
}

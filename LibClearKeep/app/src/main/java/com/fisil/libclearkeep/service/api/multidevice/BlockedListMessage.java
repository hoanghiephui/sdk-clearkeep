package com.fisil.libclearkeep.service.api.multidevice;

import java.util.List;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class BlockedListMessage {
  private final List<String> numbers;

  public BlockedListMessage(List<String> numbers) {
    this.numbers = numbers;
  }

  public List<String> getNumbers() {
    return numbers;
  }
}

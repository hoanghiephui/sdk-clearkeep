package com.fisil.libclearkeep.service.api.multidevice;

import com.fisil.libclearkeep.protocol.utils.guava.Optional;
import com.fisil.libclearkeep.service.api.messages.SignalServiceAttachmentStream;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class DeviceContact {
  private final String number;
  private final Optional<String> name;
  private final Optional<SignalServiceAttachmentStream> avatar;
  private final Optional<String> color;

  public DeviceContact(String number, Optional<String> name,
                       Optional<SignalServiceAttachmentStream> avatar,
                       Optional<String> color) {
    this.number = number;
    this.name = name;
    this.avatar = avatar;
    this.color = color;
  }

  public Optional<SignalServiceAttachmentStream> getAvatar() {
    return avatar;
  }

  public Optional<String> getName() {
    return name;
  }

  public String getNumber() {
    return number;
  }

  public Optional<String> getColor() {
    return color;
  }
}

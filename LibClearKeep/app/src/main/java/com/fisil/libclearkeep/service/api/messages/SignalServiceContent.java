package com.fisil.libclearkeep.service.api.messages;

import com.fisil.libclearkeep.protocol.utils.guava.Optional;
import com.fisil.libclearkeep.service.api.multidevice.SignalServiceSyncMessage;

/**
 * Created by hoanghiep on 12/19/16.
 */
public class SignalServiceContent {
  private final Optional<SignalServiceDataMessage> message;
  private final Optional<SignalServiceSyncMessage> synchronizeMessage;

  public SignalServiceContent() {
    this.message = Optional.absent();
    this.synchronizeMessage = Optional.absent();
  }

  public SignalServiceContent(SignalServiceDataMessage message) {
    this.message = Optional.fromNullable(message);
    this.synchronizeMessage = Optional.absent();
  }

  public SignalServiceContent(SignalServiceSyncMessage synchronizeMessage) {
    this.message = Optional.absent();
    this.synchronizeMessage = Optional.fromNullable(synchronizeMessage);
  }

  public Optional<SignalServiceDataMessage> getDataMessage() {
    return message;
  }

  public Optional<SignalServiceSyncMessage> getSyncMessage() {
    return synchronizeMessage;
  }
}

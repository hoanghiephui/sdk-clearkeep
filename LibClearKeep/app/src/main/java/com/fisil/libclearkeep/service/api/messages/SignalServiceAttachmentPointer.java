package com.fisil.libclearkeep.service.api.messages;

import com.fisil.libclearkeep.protocol.utils.guava.Optional;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class SignalServiceAttachmentPointer extends SignalServiceAttachment {

  private final long id;
  private final byte[] key;
  private final Optional<String> relay;
  private final Optional<Integer> size;
  private final Optional<byte[]> preview;

  public SignalServiceAttachmentPointer(long id, String contentType, byte[] key, String relay) {
    this(id, contentType, key, relay, Optional.<Integer>absent(), Optional.<byte[]>absent());
  }

  public SignalServiceAttachmentPointer(long id, String contentType, byte[] key, String relay,
                                        Optional<Integer> size, Optional<byte[]> preview) {
    super(contentType);
    this.id = id;
    this.key = key;
    this.relay = Optional.fromNullable(relay);
    this.size = size;
    this.preview = preview;
  }

  public long getId() {
    return id;
  }

  public byte[] getKey() {
    return key;
  }

  @Override
  public boolean isStream() {
    return false;
  }

  @Override
  public boolean isPointer() {
    return true;
  }

  public Optional<String> getRelay() {
    return relay;
  }

  public Optional<Integer> getSize() {
    return size;
  }

  public Optional<byte[]> getPreview() {
    return preview;
  }
}

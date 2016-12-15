package com.fisil.libclearkeep.service.api.multidevice;

import com.fisil.libclearkeep.protocol.utils.guava.Optional;
import com.fisil.libclearkeep.service.api.messages.SignalServiceAttachmentStream;
import com.fisil.libclearkeep.service.internal.push.SignalServiceProtos;
import com.fisil.libclearkeep.service.internal.utils.Util;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class DeviceContactsInputStream extends ChunkedInputStream {

  public DeviceContactsInputStream(InputStream in) {
    super(in);
  }

  public DeviceContact read() throws IOException {
    long detailsLength = readRawVarint32();
    byte[] detailsSerialized = new byte[(int) detailsLength];
    Util.readFully(in, detailsSerialized);

    SignalServiceProtos.ContactDetails details = SignalServiceProtos.ContactDetails.parseFrom(detailsSerialized);
    String number = details.getNumber();
    Optional<String> name = Optional.fromNullable(details.getName());
    Optional<SignalServiceAttachmentStream> avatar = Optional.absent();
    Optional<String> color = details.hasColor() ? Optional.of(details.getColor()) : Optional.<String>absent();

    if (details.hasAvatar()) {
      long avatarLength = details.getAvatar().getLength();
      InputStream avatarStream = new LimitedInputStream(in, avatarLength);
      String avatarContentType = details.getAvatar().getContentType();

      avatar = Optional.of(new SignalServiceAttachmentStream(avatarStream, avatarContentType, avatarLength, null));
    }

    return new DeviceContact(number, name, avatar, color);
  }

}

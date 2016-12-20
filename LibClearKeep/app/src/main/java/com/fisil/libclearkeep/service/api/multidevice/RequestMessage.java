package com.fisil.libclearkeep.service.api.multidevice;

import com.fisil.libclearkeep.service.internal.push.SignalServiceProtos;

/**
 * Created by hoanghiep on 12/19/16.
 */
public class RequestMessage {
  private final SignalServiceProtos.SyncMessage.Request request;

  public RequestMessage(SignalServiceProtos.SyncMessage.Request request) {
    this.request = request;
  }

  public boolean isContactsRequest() {
    return request.getType() == SignalServiceProtos.SyncMessage.Request.Type.CONTACTS;
  }

  public boolean isGroupsRequest() {
    return request.getType() == SignalServiceProtos.SyncMessage.Request.Type.GROUPS;
  }

  public boolean isBlockedListRequest() {
    return request.getType() == SignalServiceProtos.SyncMessage.Request.Type.BLOCKED;
  }

}

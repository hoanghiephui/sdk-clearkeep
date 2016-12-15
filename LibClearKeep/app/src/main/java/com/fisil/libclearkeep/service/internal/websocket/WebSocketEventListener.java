package com.fisil.libclearkeep.service.internal.websocket;

/**
 * Created by hoanghiep on 12/15/16.
 */

public interface WebSocketEventListener {
  public void onMessage(byte[] payload);
  public void onClose();
  public void onConnected();
}

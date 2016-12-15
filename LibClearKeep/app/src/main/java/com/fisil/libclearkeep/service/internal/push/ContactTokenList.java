package com.fisil.libclearkeep.service.internal.push;

import java.util.List;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class ContactTokenList {
  private List<String> contacts;

  public ContactTokenList(List<String> contacts) {
    this.contacts = contacts;
  }

  public ContactTokenList() {}

  public List<String> getContacts() {
    return contacts;
  }
}

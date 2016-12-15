package com.fisil.libclearkeep.service.internal.push;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fisil.libclearkeep.service.api.push.ContactTokenDetails;

import java.util.List;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class ContactTokenDetailsList {
  @JsonProperty
  private List<ContactTokenDetails> contacts;

  public ContactTokenDetailsList() {}

  public List<ContactTokenDetails> getContacts() {
    return contacts;
  }
}

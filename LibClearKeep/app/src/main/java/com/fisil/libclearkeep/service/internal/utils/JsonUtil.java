package com.fisil.libclearkeep.service.internal.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fisil.libclearkeep.protocol.exceptions.InvalidKeyException;
import com.fisil.libclearkeep.protocol.keys.IdentityKey;
import com.fisil.libclearkeep.protocol.logs.Log;

import java.io.IOException;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class JsonUtil {
  private static final String TAG = JsonUtil.class.getSimpleName();

  private static final ObjectMapper objectMapper = new ObjectMapper();

  static {
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  public static String toJson(Object object) {
    try {
      return objectMapper.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      Log.w(TAG, e);
      return "";
    }
  }

  public static <T> T fromJson(String json, Class<T> clazz)
    throws IOException {
    return objectMapper.readValue(json, clazz);
  }

  public static class IdentityKeySerializer extends JsonSerializer<IdentityKey> {
    @Override
    public void serialize(IdentityKey value, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
      gen.writeString(Base64.encodeBytesWithoutPadding(value.serialize()));
    }
  }

  public static class IdentityKeyDeserializer extends JsonDeserializer<IdentityKey> {
    @Override
    public IdentityKey deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      try {
        return new IdentityKey(Base64.decodeWithoutPadding(p.getValueAsString()), 0);
      } catch (InvalidKeyException e) {
        throw new IOException(e);
      }
    }
  }
}

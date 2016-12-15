package com.fisil.libclearkeep.service.internal.websocket;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class WebSocketProtos {
  private WebSocketProtos() {
  }

  public static void registerAllExtensions(
    com.google.protobuf.ExtensionRegistry registry) {
  }

  public interface WebSocketRequestMessageOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional string verb = 1;

    /**
     * <code>optional string verb = 1;</code>
     */
    boolean hasVerb();

    /**
     * <code>optional string verb = 1;</code>
     */
    java.lang.String getVerb();

    /**
     * <code>optional string verb = 1;</code>
     */
    com.google.protobuf.ByteString
    getVerbBytes();

    // optional string path = 2;

    /**
     * <code>optional string path = 2;</code>
     */
    boolean hasPath();

    /**
     * <code>optional string path = 2;</code>
     */
    java.lang.String getPath();

    /**
     * <code>optional string path = 2;</code>
     */
    com.google.protobuf.ByteString
    getPathBytes();

    // optional bytes body = 3;

    /**
     * <code>optional bytes body = 3;</code>
     */
    boolean hasBody();

    /**
     * <code>optional bytes body = 3;</code>
     */
    com.google.protobuf.ByteString getBody();

    // optional uint64 id = 4;

    /**
     * <code>optional uint64 id = 4;</code>
     */
    boolean hasId();

    /**
     * <code>optional uint64 id = 4;</code>
     */
    long getId();
  }

  /**
   * Protobuf type {@code signalservice.WebSocketRequestMessage}
   */
  public static final class WebSocketRequestMessage extends
    com.google.protobuf.GeneratedMessage
    implements WebSocketRequestMessageOrBuilder {
    // Use WebSocketRequestMessage.newBuilder() to construct.
    private WebSocketRequestMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private WebSocketRequestMessage(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final WebSocketRequestMessage defaultInstance;

    public static WebSocketRequestMessage getDefaultInstance() {
      return defaultInstance;
    }

    public WebSocketRequestMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private WebSocketRequestMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (! done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (! parseUnknownField(input, unknownFields,
                extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              verb_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              path_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              body_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              id_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketRequestMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketRequestMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.class, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<WebSocketRequestMessage> PARSER =
      new com.google.protobuf.AbstractParser<WebSocketRequestMessage>() {
        public WebSocketRequestMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new WebSocketRequestMessage(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<WebSocketRequestMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string verb = 1;
    public static final int VERB_FIELD_NUMBER = 1;
    private java.lang.Object verb_;

    /**
     * <code>optional string verb = 1;</code>
     */
    public boolean hasVerb() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional string verb = 1;</code>
     */
    public java.lang.String getVerb() {
      java.lang.Object ref = verb_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          verb_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string verb = 1;</code>
     */
    public com.google.protobuf.ByteString
    getVerbBytes() {
      java.lang.Object ref = verb_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        verb_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string path = 2;
    public static final int PATH_FIELD_NUMBER = 2;
    private java.lang.Object path_;

    /**
     * <code>optional string path = 2;</code>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional string path = 2;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          path_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string path = 2;</code>
     */
    public com.google.protobuf.ByteString
    getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional bytes body = 3;
    public static final int BODY_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString body_;

    /**
     * <code>optional bytes body = 3;</code>
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional bytes body = 3;</code>
     */
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }

    // optional uint64 id = 4;
    public static final int ID_FIELD_NUMBER = 4;
    private long id_;

    /**
     * <code>optional uint64 id = 4;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional uint64 id = 4;</code>
     */
    public long getId() {
      return id_;
    }

    private void initFields() {
      verb_ = "";
      path_ = "";
      body_ = com.google.protobuf.ByteString.EMPTY;
      id_ = 0L;
    }

    private byte memoizedIsInitialized = - 1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != - 1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getVerbBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getPathBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, body_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt64(4, id_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = - 1;

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != - 1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getVerbBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPathBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, body_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, id_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code signalservice.WebSocketRequestMessage}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketRequestMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketRequestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.class, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        verb_ = "";
        bitField0_ = (bitField0_ & ~ 0x00000001);
        path_ = "";
        bitField0_ = (bitField0_ & ~ 0x00000002);
        body_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~ 0x00000004);
        id_ = 0L;
        bitField0_ = (bitField0_ & ~ 0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketRequestMessage_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage build() {
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage result = buildPartial();
        if (! result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage buildPartial() {
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage result = new com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.verb_ = verb_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.path_ = path_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.body_ = body_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.id_ = id_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage other) {
        if (other == com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.getDefaultInstance())
          return this;
        if (other.hasVerb()) {
          bitField0_ |= 0x00000001;
          verb_ = other.verb_;
          onChanged();
        }
        if (other.hasPath()) {
          bitField0_ |= 0x00000002;
          path_ = other.path_;
          onChanged();
        }
        if (other.hasBody()) {
          setBody(other.getBody());
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      // optional string verb = 1;
      private java.lang.Object verb_ = "";

      /**
       * <code>optional string verb = 1;</code>
       */
      public boolean hasVerb() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional string verb = 1;</code>
       */
      public java.lang.String getVerb() {
        java.lang.Object ref = verb_;
        if (! (ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          verb_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string verb = 1;</code>
       */
      public com.google.protobuf.ByteString
      getVerbBytes() {
        java.lang.Object ref = verb_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          verb_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string verb = 1;</code>
       */
      public Builder setVerb(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        verb_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string verb = 1;</code>
       */
      public Builder clearVerb() {
        bitField0_ = (bitField0_ & ~ 0x00000001);
        verb_ = getDefaultInstance().getVerb();
        onChanged();
        return this;
      }

      /**
       * <code>optional string verb = 1;</code>
       */
      public Builder setVerbBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        verb_ = value;
        onChanged();
        return this;
      }

      // optional string path = 2;
      private java.lang.Object path_ = "";

      /**
       * <code>optional string path = 2;</code>
       */
      public boolean hasPath() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional string path = 2;</code>
       */
      public java.lang.String getPath() {
        java.lang.Object ref = path_;
        if (! (ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          path_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string path = 2;</code>
       */
      public com.google.protobuf.ByteString
      getPathBytes() {
        java.lang.Object ref = path_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          path_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string path = 2;</code>
       */
      public Builder setPath(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        path_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string path = 2;</code>
       */
      public Builder clearPath() {
        bitField0_ = (bitField0_ & ~ 0x00000002);
        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
      }

      /**
       * <code>optional string path = 2;</code>
       */
      public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        path_ = value;
        onChanged();
        return this;
      }

      // optional bytes body = 3;
      private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;

      /**
       * <code>optional bytes body = 3;</code>
       */
      public boolean hasBody() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional bytes body = 3;</code>
       */
      public com.google.protobuf.ByteString getBody() {
        return body_;
      }

      /**
       * <code>optional bytes body = 3;</code>
       */
      public Builder setBody(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        body_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes body = 3;</code>
       */
      public Builder clearBody() {
        bitField0_ = (bitField0_ & ~ 0x00000004);
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }

      // optional uint64 id = 4;
      private long id_;

      /**
       * <code>optional uint64 id = 4;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional uint64 id = 4;</code>
       */
      public long getId() {
        return id_;
      }

      /**
       * <code>optional uint64 id = 4;</code>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000008;
        id_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 id = 4;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~ 0x00000008);
        id_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.WebSocketRequestMessage)
    }

    static {
      defaultInstance = new WebSocketRequestMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.WebSocketRequestMessage)
  }

  public interface WebSocketResponseMessageOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 id = 1;

    /**
     * <code>optional uint64 id = 1;</code>
     */
    boolean hasId();

    /**
     * <code>optional uint64 id = 1;</code>
     */
    long getId();

    // optional uint32 status = 2;

    /**
     * <code>optional uint32 status = 2;</code>
     */
    boolean hasStatus();

    /**
     * <code>optional uint32 status = 2;</code>
     */
    int getStatus();

    // optional string message = 3;

    /**
     * <code>optional string message = 3;</code>
     */
    boolean hasMessage();

    /**
     * <code>optional string message = 3;</code>
     */
    java.lang.String getMessage();

    /**
     * <code>optional string message = 3;</code>
     */
    com.google.protobuf.ByteString
    getMessageBytes();

    // optional bytes body = 4;

    /**
     * <code>optional bytes body = 4;</code>
     */
    boolean hasBody();

    /**
     * <code>optional bytes body = 4;</code>
     */
    com.google.protobuf.ByteString getBody();
  }

  /**
   * Protobuf type {@code signalservice.WebSocketResponseMessage}
   */
  public static final class WebSocketResponseMessage extends
    com.google.protobuf.GeneratedMessage
    implements WebSocketResponseMessageOrBuilder {
    // Use WebSocketResponseMessage.newBuilder() to construct.
    private WebSocketResponseMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private WebSocketResponseMessage(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final WebSocketResponseMessage defaultInstance;

    public static WebSocketResponseMessage getDefaultInstance() {
      return defaultInstance;
    }

    public WebSocketResponseMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private WebSocketResponseMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (! done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (! parseUnknownField(input, unknownFields,
                extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              status_ = input.readUInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              message_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              body_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketResponseMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketResponseMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.class, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<WebSocketResponseMessage> PARSER =
      new com.google.protobuf.AbstractParser<WebSocketResponseMessage>() {
        public WebSocketResponseMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new WebSocketResponseMessage(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<WebSocketResponseMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional uint64 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;

    /**
     * <code>optional uint64 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional uint64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    // optional uint32 status = 2;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int status_;

    /**
     * <code>optional uint32 status = 2;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional uint32 status = 2;</code>
     */
    public int getStatus() {
      return status_;
    }

    // optional string message = 3;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    private java.lang.Object message_;

    /**
     * <code>optional string message = 3;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional string message = 3;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string message = 3;</code>
     */
    public com.google.protobuf.ByteString
    getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional bytes body = 4;
    public static final int BODY_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString body_;

    /**
     * <code>optional bytes body = 4;</code>
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional bytes body = 4;</code>
     */
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }

    private void initFields() {
      id_ = 0L;
      status_ = 0;
      message_ = "";
      body_ = com.google.protobuf.ByteString.EMPTY;
    }

    private byte memoizedIsInitialized = - 1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != - 1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMessageBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, body_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = - 1;

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != - 1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMessageBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, body_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code signalservice.WebSocketResponseMessage}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketResponseMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketResponseMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.class, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0L;
        bitField0_ = (bitField0_ & ~ 0x00000001);
        status_ = 0;
        bitField0_ = (bitField0_ & ~ 0x00000002);
        message_ = "";
        bitField0_ = (bitField0_ & ~ 0x00000004);
        body_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~ 0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketResponseMessage_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage build() {
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage result = buildPartial();
        if (! result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage buildPartial() {
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage result = new com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.body_ = body_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage other) {
        if (other == com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.getDefaultInstance())
          return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000004;
          message_ = other.message_;
          onChanged();
        }
        if (other.hasBody()) {
          setBody(other.getBody());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      // optional uint64 id = 1;
      private long id_;

      /**
       * <code>optional uint64 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }

      /**
       * <code>optional uint64 id = 1;</code>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~ 0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }

      // optional uint32 status = 2;
      private int status_;

      /**
       * <code>optional uint32 status = 2;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional uint32 status = 2;</code>
       */
      public int getStatus() {
        return status_;
      }

      /**
       * <code>optional uint32 status = 2;</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000002;
        status_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 status = 2;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~ 0x00000002);
        status_ = 0;
        onChanged();
        return this;
      }

      // optional string message = 3;
      private java.lang.Object message_ = "";

      /**
       * <code>optional string message = 3;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional string message = 3;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (! (ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string message = 3;</code>
       */
      public com.google.protobuf.ByteString
      getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessage(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string message = 3;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~ 0x00000004);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }

      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }

      // optional bytes body = 4;
      private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;

      /**
       * <code>optional bytes body = 4;</code>
       */
      public boolean hasBody() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional bytes body = 4;</code>
       */
      public com.google.protobuf.ByteString getBody() {
        return body_;
      }

      /**
       * <code>optional bytes body = 4;</code>
       */
      public Builder setBody(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        body_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes body = 4;</code>
       */
      public Builder clearBody() {
        bitField0_ = (bitField0_ & ~ 0x00000008);
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.WebSocketResponseMessage)
    }

    static {
      defaultInstance = new WebSocketResponseMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.WebSocketResponseMessage)
  }

  public interface WebSocketMessageOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional .signalservice.WebSocketMessage.Type type = 1;

    /**
     * <code>optional .signalservice.WebSocketMessage.Type type = 1;</code>
     */
    boolean hasType();

    /**
     * <code>optional .signalservice.WebSocketMessage.Type type = 1;</code>
     */
    com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type getType();

    // optional .signalservice.WebSocketRequestMessage request = 2;

    /**
     * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
     */
    boolean hasRequest();

    /**
     * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
     */
    com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage getRequest();

    /**
     * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
     */
    com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessageOrBuilder getRequestOrBuilder();

    // optional .signalservice.WebSocketResponseMessage response = 3;

    /**
     * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
     */
    boolean hasResponse();

    /**
     * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
     */
    com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage getResponse();

    /**
     * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
     */
    com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessageOrBuilder getResponseOrBuilder();
  }

  /**
   * Protobuf type {@code signalservice.WebSocketMessage}
   */
  public static final class WebSocketMessage extends
    com.google.protobuf.GeneratedMessage
    implements WebSocketMessageOrBuilder {
    // Use WebSocketMessage.newBuilder() to construct.
    private WebSocketMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private WebSocketMessage(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final WebSocketMessage defaultInstance;

    public static WebSocketMessage getDefaultInstance() {
      return defaultInstance;
    }

    public WebSocketMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private WebSocketMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (! done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (! parseUnknownField(input, unknownFields,
                extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type value = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 18: {
              com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = request_.toBuilder();
              }
              request_ = input.readMessage(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(request_);
                request_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = response_.toBuilder();
              }
              response_ = input.readMessage(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(response_);
                response_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.class, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<WebSocketMessage> PARSER =
      new com.google.protobuf.AbstractParser<WebSocketMessage>() {
        public WebSocketMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new WebSocketMessage(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<WebSocketMessage> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code signalservice.WebSocketMessage.Type}
     */
    public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0, 0),
      /**
       * <code>REQUEST = 1;</code>
       */
      REQUEST(1, 1),
      /**
       * <code>RESPONSE = 2;</code>
       */
      RESPONSE(2, 2),;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>REQUEST = 1;</code>
       */
      public static final int REQUEST_VALUE = 1;
      /**
       * <code>RESPONSE = 2;</code>
       */
      public static final int RESPONSE_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      public static Type valueOf(int value) {
        switch (value) {
          case 0:
            return UNKNOWN;
          case 1:
            return REQUEST;
          case 2:
            return RESPONSE;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
      internalGetValueMap() {
        return internalValueMap;
      }

      private static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Type>() {
          public Type findValueByNumber(int number) {
            return Type.valueOf(number);
          }
        };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }

      public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
        return getDescriptor();
      }

      public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Type(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:signalservice.WebSocketMessage.Type)
    }

    private int bitField0_;
    // optional .signalservice.WebSocketMessage.Type type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type type_;

    /**
     * <code>optional .signalservice.WebSocketMessage.Type type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional .signalservice.WebSocketMessage.Type type = 1;</code>
     */
    public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type getType() {
      return type_;
    }

    // optional .signalservice.WebSocketRequestMessage request = 2;
    public static final int REQUEST_FIELD_NUMBER = 2;
    private com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage request_;

    /**
     * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
     */
    public boolean hasRequest() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
     */
    public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage getRequest() {
      return request_;
    }

    /**
     * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
     */
    public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessageOrBuilder getRequestOrBuilder() {
      return request_;
    }

    // optional .signalservice.WebSocketResponseMessage response = 3;
    public static final int RESPONSE_FIELD_NUMBER = 3;
    private com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage response_;

    /**
     * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
     */
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
     */
    public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage getResponse() {
      return response_;
    }

    /**
     * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
     */
    public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessageOrBuilder getResponseOrBuilder() {
      return response_;
    }

    private void initFields() {
      type_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type.UNKNOWN;
      request_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.getDefaultInstance();
      response_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.getDefaultInstance();
    }

    private byte memoizedIsInitialized = - 1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != - 1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, request_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, response_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = - 1;

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != - 1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, request_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, response_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code signalservice.WebSocketMessage}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.class, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getRequestFieldBuilder();
          getResponseFieldBuilder();
        }
      }

      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type.UNKNOWN;
        bitField0_ = (bitField0_ & ~ 0x00000001);
        if (requestBuilder_ == null) {
          request_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.getDefaultInstance();
        } else {
          requestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~ 0x00000002);
        if (responseBuilder_ == null) {
          response_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.getDefaultInstance();
        } else {
          responseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~ 0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.internal_static_signalservice_WebSocketMessage_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage build() {
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage result = buildPartial();
        if (! result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage buildPartial() {
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage result = new com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (requestBuilder_ == null) {
          result.request_ = request_;
        } else {
          result.request_ = requestBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (responseBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage other) {
        if (other == com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.getDefaultInstance())
          return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasRequest()) {
          mergeRequest(other.getRequest());
        }
        if (other.hasResponse()) {
          mergeResponse(other.getResponse());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      // optional .signalservice.WebSocketMessage.Type type = 1;
      private com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type type_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type.UNKNOWN;

      /**
       * <code>optional .signalservice.WebSocketMessage.Type type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional .signalservice.WebSocketMessage.Type type = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type getType() {
        return type_;
      }

      /**
       * <code>optional .signalservice.WebSocketMessage.Type type = 1;</code>
       */
      public Builder setType(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional .signalservice.WebSocketMessage.Type type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~ 0x00000001);
        type_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketMessage.Type.UNKNOWN;
        onChanged();
        return this;
      }

      // optional .signalservice.WebSocketRequestMessage request = 2;
      private com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage request_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.Builder, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessageOrBuilder> requestBuilder_;

      /**
       * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
       */
      public boolean hasRequest() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage getRequest() {
        if (requestBuilder_ == null) {
          return request_;
        } else {
          return requestBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
       */
      public Builder setRequest(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage value) {
        if (requestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          request_ = value;
          onChanged();
        } else {
          requestBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
       */
      public Builder setRequest(
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.Builder builderForValue) {
        if (requestBuilder_ == null) {
          request_ = builderForValue.build();
          onChanged();
        } else {
          requestBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
       */
      public Builder mergeRequest(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage value) {
        if (requestBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
            request_ != com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.getDefaultInstance()) {
            request_ =
              com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.newBuilder(request_).mergeFrom(value).buildPartial();
          } else {
            request_ = value;
          }
          onChanged();
        } else {
          requestBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
       */
      public Builder clearRequest() {
        if (requestBuilder_ == null) {
          request_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.getDefaultInstance();
          onChanged();
        } else {
          requestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~ 0x00000002);
        return this;
      }

      /**
       * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.Builder getRequestBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getRequestFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessageOrBuilder getRequestOrBuilder() {
        if (requestBuilder_ != null) {
          return requestBuilder_.getMessageOrBuilder();
        } else {
          return request_;
        }
      }

      /**
       * <code>optional .signalservice.WebSocketRequestMessage request = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.Builder, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessageOrBuilder>
      getRequestFieldBuilder() {
        if (requestBuilder_ == null) {
          requestBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessage.Builder, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketRequestMessageOrBuilder>(
            request_,
            getParentForChildren(),
            isClean());
          request_ = null;
        }
        return requestBuilder_;
      }

      // optional .signalservice.WebSocketResponseMessage response = 3;
      private com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage response_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.Builder, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessageOrBuilder> responseBuilder_;

      /**
       * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
       */
      public boolean hasResponse() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage getResponse() {
        if (responseBuilder_ == null) {
          return response_;
        } else {
          return responseBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
       */
      public Builder setResponse(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage value) {
        if (responseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          response_ = value;
          onChanged();
        } else {
          responseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
       */
      public Builder setResponse(
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.Builder builderForValue) {
        if (responseBuilder_ == null) {
          response_ = builderForValue.build();
          onChanged();
        } else {
          responseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
       */
      public Builder mergeResponse(com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage value) {
        if (responseBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
            response_ != com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.getDefaultInstance()) {
            response_ =
              com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.newBuilder(response_).mergeFrom(value).buildPartial();
          } else {
            response_ = value;
          }
          onChanged();
        } else {
          responseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
       */
      public Builder clearResponse() {
        if (responseBuilder_ == null) {
          response_ = com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.getDefaultInstance();
          onChanged();
        } else {
          responseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~ 0x00000004);
        return this;
      }

      /**
       * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.Builder getResponseBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getResponseFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessageOrBuilder getResponseOrBuilder() {
        if (responseBuilder_ != null) {
          return responseBuilder_.getMessageOrBuilder();
        } else {
          return response_;
        }
      }

      /**
       * <code>optional .signalservice.WebSocketResponseMessage response = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.Builder, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessageOrBuilder>
      getResponseFieldBuilder() {
        if (responseBuilder_ == null) {
          responseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessage.Builder, com.fisil.libclearkeep.service.internal.websocket.WebSocketProtos.WebSocketResponseMessageOrBuilder>(
            response_,
            getParentForChildren(),
            isClean());
          response_ = null;
        }
        return responseBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.WebSocketMessage)
    }

    static {
      defaultInstance = new WebSocketMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.WebSocketMessage)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_WebSocketRequestMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_WebSocketRequestMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_WebSocketResponseMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_WebSocketResponseMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_WebSocketMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_WebSocketMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor
    descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\030WebSocketResources.proto\022\rsignalservic" +
        "e\"O\n\027WebSocketRequestMessage\022\014\n\004verb\030\001 \001" +
        "(\t\022\014\n\004path\030\002 \001(\t\022\014\n\004body\030\003 \001(\014\022\n\n\002id\030\004 \001" +
        "(\004\"U\n\030WebSocketResponseMessage\022\n\n\002id\030\001 \001" +
        "(\004\022\016\n\006status\030\002 \001(\r\022\017\n\007message\030\003 \001(\t\022\014\n\004b" +
        "ody\030\004 \001(\014\"\352\001\n\020WebSocketMessage\0222\n\004type\030\001" +
        " \001(\0162$.signalservice.WebSocketMessage.Ty" +
        "pe\0227\n\007request\030\002 \001(\0132&.signalservice.WebS" +
        "ocketRequestMessage\0229\n\010response\030\003 \001(\0132\'." +
        "signalservice.WebSocketResponseMessage\".",
      "\n\004Type\022\013\n\007UNKNOWN\020\000\022\013\n\007REQUEST\020\001\022\014\n\010RESP" +
        "ONSE\020\002BF\n3com.fisil.libclearkeep.servi" +
        "ce.internal.websocketB\017WebSocketProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
          com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_signalservice_WebSocketRequestMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_signalservice_WebSocketRequestMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_WebSocketRequestMessage_descriptor,
            new java.lang.String[]{"Verb", "Path", "Body", "Id",});
          internal_static_signalservice_WebSocketResponseMessage_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_signalservice_WebSocketResponseMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_WebSocketResponseMessage_descriptor,
            new java.lang.String[]{"Id", "Status", "Message", "Body",});
          internal_static_signalservice_WebSocketMessage_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_signalservice_WebSocketMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_WebSocketMessage_descriptor,
            new java.lang.String[]{"Type", "Request", "Response",});
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[]{
        }, assigner);
  }
}

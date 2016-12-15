package com.fisil.libclearkeep.service.internal.push;

/**
 * Created by hoanghiep on 12/15/16.
 */

public final class SignalServiceProtos {
  private SignalServiceProtos() {}
  public static void registerAllExtensions(
    com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EnvelopeOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional .signalservice.Envelope.Type type = 1;
    /**
     * <code>optional .signalservice.Envelope.Type type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>optional .signalservice.Envelope.Type type = 1;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type getType();

    // optional string source = 2;
    /**
     * <code>optional string source = 2;</code>
     */
    boolean hasSource();
    /**
     * <code>optional string source = 2;</code>
     */
    java.lang.String getSource();
    /**
     * <code>optional string source = 2;</code>
     */
    com.google.protobuf.ByteString
    getSourceBytes();

    // optional uint32 sourceDevice = 7;
    /**
     * <code>optional uint32 sourceDevice = 7;</code>
     */
    boolean hasSourceDevice();
    /**
     * <code>optional uint32 sourceDevice = 7;</code>
     */
    int getSourceDevice();

    // optional string relay = 3;
    /**
     * <code>optional string relay = 3;</code>
     */
    boolean hasRelay();
    /**
     * <code>optional string relay = 3;</code>
     */
    java.lang.String getRelay();
    /**
     * <code>optional string relay = 3;</code>
     */
    com.google.protobuf.ByteString
    getRelayBytes();

    // optional uint64 timestamp = 5;
    /**
     * <code>optional uint64 timestamp = 5;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>optional uint64 timestamp = 5;</code>
     */
    long getTimestamp();

    // optional bytes legacyMessage = 6;
    /**
     * <code>optional bytes legacyMessage = 6;</code>
     *
     * <pre>
     * Contains an encrypted DataMessage
     * </pre>
     */
    boolean hasLegacyMessage();
    /**
     * <code>optional bytes legacyMessage = 6;</code>
     *
     * <pre>
     * Contains an encrypted DataMessage
     * </pre>
     */
    com.google.protobuf.ByteString getLegacyMessage();

    // optional bytes content = 8;
    /**
     * <code>optional bytes content = 8;</code>
     *
     * <pre>
     * Contains an encrypted Content
     * </pre>
     */
    boolean hasContent();
    /**
     * <code>optional bytes content = 8;</code>
     *
     * <pre>
     * Contains an encrypted Content
     * </pre>
     */
    com.google.protobuf.ByteString getContent();
  }
  /**
   * Protobuf type {@code signalservice.Envelope}
   */
  public static final class Envelope extends
    com.google.protobuf.GeneratedMessage
    implements EnvelopeOrBuilder {
    // Use Envelope.newBuilder() to construct.
    private Envelope(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Envelope(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Envelope defaultInstance;
    public static Envelope getDefaultInstance() {
      return defaultInstance;
    }

    public Envelope getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Envelope(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type value = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              source_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000008;
              relay_ = input.readBytes();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              timestamp_ = input.readUInt64();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              legacyMessage_ = input.readBytes();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000004;
              sourceDevice_ = input.readUInt32();
              break;
            }
            case 66: {
              bitField0_ |= 0x00000040;
              content_ = input.readBytes();
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
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_Envelope_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_Envelope_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Builder.class);
    }

    public static com.google.protobuf.Parser<Envelope> PARSER =
      new com.google.protobuf.AbstractParser<Envelope>() {
        public Envelope parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Envelope(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<Envelope> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code signalservice.Envelope.Type}
     */
    public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0, 0),
      /**
       * <code>CIPHERTEXT = 1;</code>
       */
      CIPHERTEXT(1, 1),
      /**
       * <code>KEY_EXCHANGE = 2;</code>
       */
      KEY_EXCHANGE(2, 2),
      /**
       * <code>PREKEY_BUNDLE = 3;</code>
       */
      PREKEY_BUNDLE(3, 3),
      /**
       * <code>RECEIPT = 5;</code>
       */
      RECEIPT(4, 5),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>CIPHERTEXT = 1;</code>
       */
      public static final int CIPHERTEXT_VALUE = 1;
      /**
       * <code>KEY_EXCHANGE = 2;</code>
       */
      public static final int KEY_EXCHANGE_VALUE = 2;
      /**
       * <code>PREKEY_BUNDLE = 3;</code>
       */
      public static final int PREKEY_BUNDLE_VALUE = 3;
      /**
       * <code>RECEIPT = 5;</code>
       */
      public static final int RECEIPT_VALUE = 5;


      public final int getNumber() { return value; }

      public static Type valueOf(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return CIPHERTEXT;
          case 2: return KEY_EXCHANGE;
          case 3: return PREKEY_BUNDLE;
          case 5: return RECEIPT;
          default: return null;
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
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:signalservice.Envelope.Type)
    }

    private int bitField0_;
    // optional .signalservice.Envelope.Type type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type type_;
    /**
     * <code>optional .signalservice.Envelope.Type type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .signalservice.Envelope.Type type = 1;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type getType() {
      return type_;
    }

    // optional string source = 2;
    public static final int SOURCE_FIELD_NUMBER = 2;
    private java.lang.Object source_;
    /**
     * <code>optional string source = 2;</code>
     */
    public boolean hasSource() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string source = 2;</code>
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          source_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string source = 2;</code>
     */
    public com.google.protobuf.ByteString
    getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional uint32 sourceDevice = 7;
    public static final int SOURCEDEVICE_FIELD_NUMBER = 7;
    private int sourceDevice_;
    /**
     * <code>optional uint32 sourceDevice = 7;</code>
     */
    public boolean hasSourceDevice() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 sourceDevice = 7;</code>
     */
    public int getSourceDevice() {
      return sourceDevice_;
    }

    // optional string relay = 3;
    public static final int RELAY_FIELD_NUMBER = 3;
    private java.lang.Object relay_;
    /**
     * <code>optional string relay = 3;</code>
     */
    public boolean hasRelay() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string relay = 3;</code>
     */
    public java.lang.String getRelay() {
      java.lang.Object ref = relay_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          relay_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string relay = 3;</code>
     */
    public com.google.protobuf.ByteString
    getRelayBytes() {
      java.lang.Object ref = relay_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        relay_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional uint64 timestamp = 5;
    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    private long timestamp_;
    /**
     * <code>optional uint64 timestamp = 5;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint64 timestamp = 5;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    // optional bytes legacyMessage = 6;
    public static final int LEGACYMESSAGE_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString legacyMessage_;
    /**
     * <code>optional bytes legacyMessage = 6;</code>
     *
     * <pre>
     * Contains an encrypted DataMessage
     * </pre>
     */
    public boolean hasLegacyMessage() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bytes legacyMessage = 6;</code>
     *
     * <pre>
     * Contains an encrypted DataMessage
     * </pre>
     */
    public com.google.protobuf.ByteString getLegacyMessage() {
      return legacyMessage_;
    }

    // optional bytes content = 8;
    public static final int CONTENT_FIELD_NUMBER = 8;
    private com.google.protobuf.ByteString content_;
    /**
     * <code>optional bytes content = 8;</code>
     *
     * <pre>
     * Contains an encrypted Content
     * </pre>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bytes content = 8;</code>
     *
     * <pre>
     * Contains an encrypted Content
     * </pre>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }

    private void initFields() {
      type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type.UNKNOWN;
      source_ = "";
      sourceDevice_ = 0;
      relay_ = "";
      timestamp_ = 0L;
      legacyMessage_ = com.google.protobuf.ByteString.EMPTY;
      content_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

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
        output.writeBytes(2, getSourceBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(3, getRelayBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt64(5, timestamp_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, legacyMessage_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(7, sourceDevice_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(8, content_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getSourceBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getRelayBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, timestamp_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, legacyMessage_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, sourceDevice_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, content_);
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

    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code signalservice.Envelope}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.EnvelopeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_Envelope_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_Envelope_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.newBuilder()
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
        type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type.UNKNOWN;
        bitField0_ = (bitField0_ & ~0x00000001);
        source_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        sourceDevice_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        relay_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        legacyMessage_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000020);
        content_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_Envelope_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope build() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope buildPartial() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.source_ = source_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.sourceDevice_ = sourceDevice_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.relay_ = relay_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.legacyMessage_ = legacyMessage_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.content_ = content_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope other) {
        if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasSource()) {
          bitField0_ |= 0x00000002;
          source_ = other.source_;
          onChanged();
        }
        if (other.hasSourceDevice()) {
          setSourceDevice(other.getSourceDevice());
        }
        if (other.hasRelay()) {
          bitField0_ |= 0x00000008;
          relay_ = other.relay_;
          onChanged();
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasLegacyMessage()) {
          setLegacyMessage(other.getLegacyMessage());
        }
        if (other.hasContent()) {
          setContent(other.getContent());
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
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional .signalservice.Envelope.Type type = 1;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type.UNKNOWN;
      /**
       * <code>optional .signalservice.Envelope.Type type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .signalservice.Envelope.Type type = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type getType() {
        return type_;
      }
      /**
       * <code>optional .signalservice.Envelope.Type type = 1;</code>
       */
      public Builder setType(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .signalservice.Envelope.Type type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Envelope.Type.UNKNOWN;
        onChanged();
        return this;
      }

      // optional string source = 2;
      private java.lang.Object source_ = "";
      /**
       * <code>optional string source = 2;</code>
       */
      public boolean hasSource() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string source = 2;</code>
       */
      public java.lang.String getSource() {
        java.lang.Object ref = source_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          source_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string source = 2;</code>
       */
      public com.google.protobuf.ByteString
      getSourceBytes() {
        java.lang.Object ref = source_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          source_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string source = 2;</code>
       */
      public Builder setSource(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        source_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string source = 2;</code>
       */
      public Builder clearSource() {
        bitField0_ = (bitField0_ & ~0x00000002);
        source_ = getDefaultInstance().getSource();
        onChanged();
        return this;
      }
      /**
       * <code>optional string source = 2;</code>
       */
      public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        source_ = value;
        onChanged();
        return this;
      }

      // optional uint32 sourceDevice = 7;
      private int sourceDevice_ ;
      /**
       * <code>optional uint32 sourceDevice = 7;</code>
       */
      public boolean hasSourceDevice() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 sourceDevice = 7;</code>
       */
      public int getSourceDevice() {
        return sourceDevice_;
      }
      /**
       * <code>optional uint32 sourceDevice = 7;</code>
       */
      public Builder setSourceDevice(int value) {
        bitField0_ |= 0x00000004;
        sourceDevice_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 sourceDevice = 7;</code>
       */
      public Builder clearSourceDevice() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sourceDevice_ = 0;
        onChanged();
        return this;
      }

      // optional string relay = 3;
      private java.lang.Object relay_ = "";
      /**
       * <code>optional string relay = 3;</code>
       */
      public boolean hasRelay() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string relay = 3;</code>
       */
      public java.lang.String getRelay() {
        java.lang.Object ref = relay_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          relay_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string relay = 3;</code>
       */
      public com.google.protobuf.ByteString
      getRelayBytes() {
        java.lang.Object ref = relay_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          relay_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string relay = 3;</code>
       */
      public Builder setRelay(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        relay_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string relay = 3;</code>
       */
      public Builder clearRelay() {
        bitField0_ = (bitField0_ & ~0x00000008);
        relay_ = getDefaultInstance().getRelay();
        onChanged();
        return this;
      }
      /**
       * <code>optional string relay = 3;</code>
       */
      public Builder setRelayBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        relay_ = value;
        onChanged();
        return this;
      }

      // optional uint64 timestamp = 5;
      private long timestamp_ ;
      /**
       * <code>optional uint64 timestamp = 5;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint64 timestamp = 5;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>optional uint64 timestamp = 5;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000010;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 timestamp = 5;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000010);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      // optional bytes legacyMessage = 6;
      private com.google.protobuf.ByteString legacyMessage_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes legacyMessage = 6;</code>
       *
       * <pre>
       * Contains an encrypted DataMessage
       * </pre>
       */
      public boolean hasLegacyMessage() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bytes legacyMessage = 6;</code>
       *
       * <pre>
       * Contains an encrypted DataMessage
       * </pre>
       */
      public com.google.protobuf.ByteString getLegacyMessage() {
        return legacyMessage_;
      }
      /**
       * <code>optional bytes legacyMessage = 6;</code>
       *
       * <pre>
       * Contains an encrypted DataMessage
       * </pre>
       */
      public Builder setLegacyMessage(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        legacyMessage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes legacyMessage = 6;</code>
       *
       * <pre>
       * Contains an encrypted DataMessage
       * </pre>
       */
      public Builder clearLegacyMessage() {
        bitField0_ = (bitField0_ & ~0x00000020);
        legacyMessage_ = getDefaultInstance().getLegacyMessage();
        onChanged();
        return this;
      }

      // optional bytes content = 8;
      private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes content = 8;</code>
       *
       * <pre>
       * Contains an encrypted Content
       * </pre>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bytes content = 8;</code>
       *
       * <pre>
       * Contains an encrypted Content
       * </pre>
       */
      public com.google.protobuf.ByteString getContent() {
        return content_;
      }
      /**
       * <code>optional bytes content = 8;</code>
       *
       * <pre>
       * Contains an encrypted Content
       * </pre>
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes content = 8;</code>
       *
       * <pre>
       * Contains an encrypted Content
       * </pre>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000040);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.Envelope)
    }

    static {
      defaultInstance = new Envelope(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.Envelope)
  }

  public interface ContentOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional .signalservice.DataMessage dataMessage = 1;
    /**
     * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
     */
    boolean hasDataMessage();
    /**
     * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage getDataMessage();
    /**
     * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder getDataMessageOrBuilder();

    // optional .signalservice.SyncMessage syncMessage = 2;
    /**
     * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
     */
    boolean hasSyncMessage();
    /**
     * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage getSyncMessage();
    /**
     * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessageOrBuilder getSyncMessageOrBuilder();
  }
  /**
   * Protobuf type {@code signalservice.Content}
   */
  public static final class Content extends
    com.google.protobuf.GeneratedMessage
    implements ContentOrBuilder {
    // Use Content.newBuilder() to construct.
    private Content(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Content(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Content defaultInstance;
    public static Content getDefaultInstance() {
      return defaultInstance;
    }

    public Content getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Content(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = dataMessage_.toBuilder();
              }
              dataMessage_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dataMessage_);
                dataMessage_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = syncMessage_.toBuilder();
              }
              syncMessage_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(syncMessage_);
                syncMessage_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
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
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_Content_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_Content_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content.Builder.class);
    }

    public static com.google.protobuf.Parser<Content> PARSER =
      new com.google.protobuf.AbstractParser<Content>() {
        public Content parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Content(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<Content> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional .signalservice.DataMessage dataMessage = 1;
    public static final int DATAMESSAGE_FIELD_NUMBER = 1;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage dataMessage_;
    /**
     * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
     */
    public boolean hasDataMessage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage getDataMessage() {
      return dataMessage_;
    }
    /**
     * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder getDataMessageOrBuilder() {
      return dataMessage_;
    }

    // optional .signalservice.SyncMessage syncMessage = 2;
    public static final int SYNCMESSAGE_FIELD_NUMBER = 2;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage syncMessage_;
    /**
     * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
     */
    public boolean hasSyncMessage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage getSyncMessage() {
      return syncMessage_;
    }
    /**
     * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessageOrBuilder getSyncMessageOrBuilder() {
      return syncMessage_;
    }

    private void initFields() {
      dataMessage_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance();
      syncMessage_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, dataMessage_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, syncMessage_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, dataMessage_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, syncMessage_);
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

    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code signalservice.Content}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_Content_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_Content_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content.newBuilder()
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
          getDataMessageFieldBuilder();
          getSyncMessageFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (dataMessageBuilder_ == null) {
          dataMessage_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance();
        } else {
          dataMessageBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (syncMessageBuilder_ == null) {
          syncMessage_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.getDefaultInstance();
        } else {
          syncMessageBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_Content_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content build() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content buildPartial() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (dataMessageBuilder_ == null) {
          result.dataMessage_ = dataMessage_;
        } else {
          result.dataMessage_ = dataMessageBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (syncMessageBuilder_ == null) {
          result.syncMessage_ = syncMessage_;
        } else {
          result.syncMessage_ = syncMessageBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content other) {
        if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content.getDefaultInstance()) return this;
        if (other.hasDataMessage()) {
          mergeDataMessage(other.getDataMessage());
        }
        if (other.hasSyncMessage()) {
          mergeSyncMessage(other.getSyncMessage());
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
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.Content) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional .signalservice.DataMessage dataMessage = 1;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage dataMessage_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder> dataMessageBuilder_;
      /**
       * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
       */
      public boolean hasDataMessage() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage getDataMessage() {
        if (dataMessageBuilder_ == null) {
          return dataMessage_;
        } else {
          return dataMessageBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
       */
      public Builder setDataMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage value) {
        if (dataMessageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataMessage_ = value;
          onChanged();
        } else {
          dataMessageBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
       */
      public Builder setDataMessage(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder builderForValue) {
        if (dataMessageBuilder_ == null) {
          dataMessage_ = builderForValue.build();
          onChanged();
        } else {
          dataMessageBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
       */
      public Builder mergeDataMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage value) {
        if (dataMessageBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
            dataMessage_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance()) {
            dataMessage_ =
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.newBuilder(dataMessage_).mergeFrom(value).buildPartial();
          } else {
            dataMessage_ = value;
          }
          onChanged();
        } else {
          dataMessageBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
       */
      public Builder clearDataMessage() {
        if (dataMessageBuilder_ == null) {
          dataMessage_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance();
          onChanged();
        } else {
          dataMessageBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder getDataMessageBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getDataMessageFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder getDataMessageOrBuilder() {
        if (dataMessageBuilder_ != null) {
          return dataMessageBuilder_.getMessageOrBuilder();
        } else {
          return dataMessage_;
        }
      }
      /**
       * <code>optional .signalservice.DataMessage dataMessage = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder>
      getDataMessageFieldBuilder() {
        if (dataMessageBuilder_ == null) {
          dataMessageBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder>(
            dataMessage_,
            getParentForChildren(),
            isClean());
          dataMessage_ = null;
        }
        return dataMessageBuilder_;
      }

      // optional .signalservice.SyncMessage syncMessage = 2;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage syncMessage_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessageOrBuilder> syncMessageBuilder_;
      /**
       * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
       */
      public boolean hasSyncMessage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage getSyncMessage() {
        if (syncMessageBuilder_ == null) {
          return syncMessage_;
        } else {
          return syncMessageBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
       */
      public Builder setSyncMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage value) {
        if (syncMessageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          syncMessage_ = value;
          onChanged();
        } else {
          syncMessageBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
       */
      public Builder setSyncMessage(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Builder builderForValue) {
        if (syncMessageBuilder_ == null) {
          syncMessage_ = builderForValue.build();
          onChanged();
        } else {
          syncMessageBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
       */
      public Builder mergeSyncMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage value) {
        if (syncMessageBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
            syncMessage_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.getDefaultInstance()) {
            syncMessage_ =
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.newBuilder(syncMessage_).mergeFrom(value).buildPartial();
          } else {
            syncMessage_ = value;
          }
          onChanged();
        } else {
          syncMessageBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
       */
      public Builder clearSyncMessage() {
        if (syncMessageBuilder_ == null) {
          syncMessage_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.getDefaultInstance();
          onChanged();
        } else {
          syncMessageBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Builder getSyncMessageBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSyncMessageFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessageOrBuilder getSyncMessageOrBuilder() {
        if (syncMessageBuilder_ != null) {
          return syncMessageBuilder_.getMessageOrBuilder();
        } else {
          return syncMessage_;
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage syncMessage = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessageOrBuilder>
      getSyncMessageFieldBuilder() {
        if (syncMessageBuilder_ == null) {
          syncMessageBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessageOrBuilder>(
            syncMessage_,
            getParentForChildren(),
            isClean());
          syncMessage_ = null;
        }
        return syncMessageBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.Content)
    }

    static {
      defaultInstance = new Content(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.Content)
  }

  public interface DataMessageOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional string body = 1;
    /**
     * <code>optional string body = 1;</code>
     */
    boolean hasBody();
    /**
     * <code>optional string body = 1;</code>
     */
    java.lang.String getBody();
    /**
     * <code>optional string body = 1;</code>
     */
    com.google.protobuf.ByteString
    getBodyBytes();

    // repeated .signalservice.AttachmentPointer attachments = 2;
    /**
     * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
     */
    java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer>
    getAttachmentsList();
    /**
     * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getAttachments(int index);
    /**
     * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
     */
    int getAttachmentsCount();
    /**
     * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
     */
    java.util.List<? extends com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder>
    getAttachmentsOrBuilderList();
    /**
     * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getAttachmentsOrBuilder(
      int index);

    // optional .signalservice.GroupContext group = 3;
    /**
     * <code>optional .signalservice.GroupContext group = 3;</code>
     */
    boolean hasGroup();
    /**
     * <code>optional .signalservice.GroupContext group = 3;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext getGroup();
    /**
     * <code>optional .signalservice.GroupContext group = 3;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContextOrBuilder getGroupOrBuilder();

    // optional uint32 flags = 4;
    /**
     * <code>optional uint32 flags = 4;</code>
     */
    boolean hasFlags();
    /**
     * <code>optional uint32 flags = 4;</code>
     */
    int getFlags();

    // optional uint32 expireTimer = 5;
    /**
     * <code>optional uint32 expireTimer = 5;</code>
     */
    boolean hasExpireTimer();
    /**
     * <code>optional uint32 expireTimer = 5;</code>
     */
    int getExpireTimer();
  }
  /**
   * Protobuf type {@code signalservice.DataMessage}
   */
  public static final class DataMessage extends
    com.google.protobuf.GeneratedMessage
    implements DataMessageOrBuilder {
    // Use DataMessage.newBuilder() to construct.
    private DataMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DataMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DataMessage defaultInstance;
    public static DataMessage getDefaultInstance() {
      return defaultInstance;
    }

    public DataMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DataMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              body_ = input.readBytes();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                attachments_ = new java.util.ArrayList<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer>();
                mutable_bitField0_ |= 0x00000002;
              }
              attachments_.add(input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = group_.toBuilder();
              }
              group_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(group_);
                group_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000004;
              flags_ = input.readUInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000008;
              expireTimer_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          attachments_ = java.util.Collections.unmodifiableList(attachments_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_DataMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_DataMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<DataMessage> PARSER =
      new com.google.protobuf.AbstractParser<DataMessage>() {
        public DataMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new DataMessage(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<DataMessage> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code signalservice.DataMessage.Flags}
     */
    public enum Flags
      implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>END_SESSION = 1;</code>
       */
      END_SESSION(0, 1),
      /**
       * <code>EXPIRATION_TIMER_UPDATE = 2;</code>
       */
      EXPIRATION_TIMER_UPDATE(1, 2),
      ;

      /**
       * <code>END_SESSION = 1;</code>
       */
      public static final int END_SESSION_VALUE = 1;
      /**
       * <code>EXPIRATION_TIMER_UPDATE = 2;</code>
       */
      public static final int EXPIRATION_TIMER_UPDATE_VALUE = 2;


      public final int getNumber() { return value; }

      public static Flags valueOf(int value) {
        switch (value) {
          case 1: return END_SESSION;
          case 2: return EXPIRATION_TIMER_UPDATE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Flags>
      internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Flags>
        internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Flags>() {
          public Flags findValueByNumber(int number) {
            return Flags.valueOf(number);
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
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final Flags[] VALUES = values();

      public static Flags valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Flags(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:signalservice.DataMessage.Flags)
    }

    private int bitField0_;
    // optional string body = 1;
    public static final int BODY_FIELD_NUMBER = 1;
    private java.lang.Object body_;
    /**
     * <code>optional string body = 1;</code>
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string body = 1;</code>
     */
    public java.lang.String getBody() {
      java.lang.Object ref = body_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          body_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string body = 1;</code>
     */
    public com.google.protobuf.ByteString
    getBodyBytes() {
      java.lang.Object ref = body_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        body_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated .signalservice.AttachmentPointer attachments = 2;
    public static final int ATTACHMENTS_FIELD_NUMBER = 2;
    private java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer> attachments_;
    /**
     * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
     */
    public java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer> getAttachmentsList() {
      return attachments_;
    }
    /**
     * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
     */
    public java.util.List<? extends com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder>
    getAttachmentsOrBuilderList() {
      return attachments_;
    }
    /**
     * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
     */
    public int getAttachmentsCount() {
      return attachments_.size();
    }
    /**
     * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getAttachments(int index) {
      return attachments_.get(index);
    }
    /**
     * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getAttachmentsOrBuilder(
      int index) {
      return attachments_.get(index);
    }

    // optional .signalservice.GroupContext group = 3;
    public static final int GROUP_FIELD_NUMBER = 3;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext group_;
    /**
     * <code>optional .signalservice.GroupContext group = 3;</code>
     */
    public boolean hasGroup() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .signalservice.GroupContext group = 3;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext getGroup() {
      return group_;
    }
    /**
     * <code>optional .signalservice.GroupContext group = 3;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContextOrBuilder getGroupOrBuilder() {
      return group_;
    }

    // optional uint32 flags = 4;
    public static final int FLAGS_FIELD_NUMBER = 4;
    private int flags_;
    /**
     * <code>optional uint32 flags = 4;</code>
     */
    public boolean hasFlags() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 flags = 4;</code>
     */
    public int getFlags() {
      return flags_;
    }

    // optional uint32 expireTimer = 5;
    public static final int EXPIRETIMER_FIELD_NUMBER = 5;
    private int expireTimer_;
    /**
     * <code>optional uint32 expireTimer = 5;</code>
     */
    public boolean hasExpireTimer() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 expireTimer = 5;</code>
     */
    public int getExpireTimer() {
      return expireTimer_;
    }

    private void initFields() {
      body_ = "";
      attachments_ = java.util.Collections.emptyList();
      group_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.getDefaultInstance();
      flags_ = 0;
      expireTimer_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getBodyBytes());
      }
      for (int i = 0; i < attachments_.size(); i++) {
        output.writeMessage(2, attachments_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(3, group_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(4, flags_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(5, expireTimer_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getBodyBytes());
      }
      for (int i = 0; i < attachments_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, attachments_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, group_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, flags_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, expireTimer_);
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

    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code signalservice.DataMessage}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_DataMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_DataMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.newBuilder()
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
          getAttachmentsFieldBuilder();
          getGroupFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        body_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (attachmentsBuilder_ == null) {
          attachments_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          attachmentsBuilder_.clear();
        }
        if (groupBuilder_ == null) {
          group_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.getDefaultInstance();
        } else {
          groupBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        flags_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        expireTimer_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_DataMessage_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage build() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage buildPartial() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.body_ = body_;
        if (attachmentsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            attachments_ = java.util.Collections.unmodifiableList(attachments_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.attachments_ = attachments_;
        } else {
          result.attachments_ = attachmentsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        if (groupBuilder_ == null) {
          result.group_ = group_;
        } else {
          result.group_ = groupBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.flags_ = flags_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.expireTimer_ = expireTimer_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage other) {
        if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance()) return this;
        if (other.hasBody()) {
          bitField0_ |= 0x00000001;
          body_ = other.body_;
          onChanged();
        }
        if (attachmentsBuilder_ == null) {
          if (!other.attachments_.isEmpty()) {
            if (attachments_.isEmpty()) {
              attachments_ = other.attachments_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureAttachmentsIsMutable();
              attachments_.addAll(other.attachments_);
            }
            onChanged();
          }
        } else {
          if (!other.attachments_.isEmpty()) {
            if (attachmentsBuilder_.isEmpty()) {
              attachmentsBuilder_.dispose();
              attachmentsBuilder_ = null;
              attachments_ = other.attachments_;
              bitField0_ = (bitField0_ & ~0x00000002);
              attachmentsBuilder_ =
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                  getAttachmentsFieldBuilder() : null;
            } else {
              attachmentsBuilder_.addAllMessages(other.attachments_);
            }
          }
        }
        if (other.hasGroup()) {
          mergeGroup(other.getGroup());
        }
        if (other.hasFlags()) {
          setFlags(other.getFlags());
        }
        if (other.hasExpireTimer()) {
          setExpireTimer(other.getExpireTimer());
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
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string body = 1;
      private java.lang.Object body_ = "";
      /**
       * <code>optional string body = 1;</code>
       */
      public boolean hasBody() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string body = 1;</code>
       */
      public java.lang.String getBody() {
        java.lang.Object ref = body_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          body_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string body = 1;</code>
       */
      public com.google.protobuf.ByteString
      getBodyBytes() {
        java.lang.Object ref = body_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          body_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string body = 1;</code>
       */
      public Builder setBody(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        body_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string body = 1;</code>
       */
      public Builder clearBody() {
        bitField0_ = (bitField0_ & ~0x00000001);
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }
      /**
       * <code>optional string body = 1;</code>
       */
      public Builder setBodyBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        body_ = value;
        onChanged();
        return this;
      }

      // repeated .signalservice.AttachmentPointer attachments = 2;
      private java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer> attachments_ =
        java.util.Collections.emptyList();
      private void ensureAttachmentsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          attachments_ = new java.util.ArrayList<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer>(attachments_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder> attachmentsBuilder_;

      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer> getAttachmentsList() {
        if (attachmentsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(attachments_);
        } else {
          return attachmentsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public int getAttachmentsCount() {
        if (attachmentsBuilder_ == null) {
          return attachments_.size();
        } else {
          return attachmentsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getAttachments(int index) {
        if (attachmentsBuilder_ == null) {
          return attachments_.get(index);
        } else {
          return attachmentsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public Builder setAttachments(
        int index, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer value) {
        if (attachmentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAttachmentsIsMutable();
          attachments_.set(index, value);
          onChanged();
        } else {
          attachmentsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public Builder setAttachments(
        int index, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder builderForValue) {
        if (attachmentsBuilder_ == null) {
          ensureAttachmentsIsMutable();
          attachments_.set(index, builderForValue.build());
          onChanged();
        } else {
          attachmentsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public Builder addAttachments(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer value) {
        if (attachmentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAttachmentsIsMutable();
          attachments_.add(value);
          onChanged();
        } else {
          attachmentsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public Builder addAttachments(
        int index, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer value) {
        if (attachmentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAttachmentsIsMutable();
          attachments_.add(index, value);
          onChanged();
        } else {
          attachmentsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public Builder addAttachments(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder builderForValue) {
        if (attachmentsBuilder_ == null) {
          ensureAttachmentsIsMutable();
          attachments_.add(builderForValue.build());
          onChanged();
        } else {
          attachmentsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public Builder addAttachments(
        int index, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder builderForValue) {
        if (attachmentsBuilder_ == null) {
          ensureAttachmentsIsMutable();
          attachments_.add(index, builderForValue.build());
          onChanged();
        } else {
          attachmentsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public Builder addAllAttachments(
        java.lang.Iterable<? extends com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer> values) {
        if (attachmentsBuilder_ == null) {
          ensureAttachmentsIsMutable();
          super.addAll(values, attachments_);
          onChanged();
        } else {
          attachmentsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public Builder clearAttachments() {
        if (attachmentsBuilder_ == null) {
          attachments_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          attachmentsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public Builder removeAttachments(int index) {
        if (attachmentsBuilder_ == null) {
          ensureAttachmentsIsMutable();
          attachments_.remove(index);
          onChanged();
        } else {
          attachmentsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder getAttachmentsBuilder(
        int index) {
        return getAttachmentsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getAttachmentsOrBuilder(
        int index) {
        if (attachmentsBuilder_ == null) {
          return attachments_.get(index);  } else {
          return attachmentsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public java.util.List<? extends com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder>
      getAttachmentsOrBuilderList() {
        if (attachmentsBuilder_ != null) {
          return attachmentsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(attachments_);
        }
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder addAttachmentsBuilder() {
        return getAttachmentsFieldBuilder().addBuilder(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance());
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder addAttachmentsBuilder(
        int index) {
        return getAttachmentsFieldBuilder().addBuilder(
          index, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance());
      }
      /**
       * <code>repeated .signalservice.AttachmentPointer attachments = 2;</code>
       */
      public java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder>
      getAttachmentsBuilderList() {
        return getAttachmentsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder>
      getAttachmentsFieldBuilder() {
        if (attachmentsBuilder_ == null) {
          attachmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder>(
            attachments_,
            ((bitField0_ & 0x00000002) == 0x00000002),
            getParentForChildren(),
            isClean());
          attachments_ = null;
        }
        return attachmentsBuilder_;
      }

      // optional .signalservice.GroupContext group = 3;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext group_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContextOrBuilder> groupBuilder_;
      /**
       * <code>optional .signalservice.GroupContext group = 3;</code>
       */
      public boolean hasGroup() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .signalservice.GroupContext group = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext getGroup() {
        if (groupBuilder_ == null) {
          return group_;
        } else {
          return groupBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .signalservice.GroupContext group = 3;</code>
       */
      public Builder setGroup(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext value) {
        if (groupBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          group_ = value;
          onChanged();
        } else {
          groupBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .signalservice.GroupContext group = 3;</code>
       */
      public Builder setGroup(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Builder builderForValue) {
        if (groupBuilder_ == null) {
          group_ = builderForValue.build();
          onChanged();
        } else {
          groupBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .signalservice.GroupContext group = 3;</code>
       */
      public Builder mergeGroup(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext value) {
        if (groupBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
            group_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.getDefaultInstance()) {
            group_ =
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.newBuilder(group_).mergeFrom(value).buildPartial();
          } else {
            group_ = value;
          }
          onChanged();
        } else {
          groupBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .signalservice.GroupContext group = 3;</code>
       */
      public Builder clearGroup() {
        if (groupBuilder_ == null) {
          group_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.getDefaultInstance();
          onChanged();
        } else {
          groupBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .signalservice.GroupContext group = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Builder getGroupBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getGroupFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .signalservice.GroupContext group = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContextOrBuilder getGroupOrBuilder() {
        if (groupBuilder_ != null) {
          return groupBuilder_.getMessageOrBuilder();
        } else {
          return group_;
        }
      }
      /**
       * <code>optional .signalservice.GroupContext group = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContextOrBuilder>
      getGroupFieldBuilder() {
        if (groupBuilder_ == null) {
          groupBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContextOrBuilder>(
            group_,
            getParentForChildren(),
            isClean());
          group_ = null;
        }
        return groupBuilder_;
      }

      // optional uint32 flags = 4;
      private int flags_ ;
      /**
       * <code>optional uint32 flags = 4;</code>
       */
      public boolean hasFlags() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint32 flags = 4;</code>
       */
      public int getFlags() {
        return flags_;
      }
      /**
       * <code>optional uint32 flags = 4;</code>
       */
      public Builder setFlags(int value) {
        bitField0_ |= 0x00000008;
        flags_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 flags = 4;</code>
       */
      public Builder clearFlags() {
        bitField0_ = (bitField0_ & ~0x00000008);
        flags_ = 0;
        onChanged();
        return this;
      }

      // optional uint32 expireTimer = 5;
      private int expireTimer_ ;
      /**
       * <code>optional uint32 expireTimer = 5;</code>
       */
      public boolean hasExpireTimer() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint32 expireTimer = 5;</code>
       */
      public int getExpireTimer() {
        return expireTimer_;
      }
      /**
       * <code>optional uint32 expireTimer = 5;</code>
       */
      public Builder setExpireTimer(int value) {
        bitField0_ |= 0x00000010;
        expireTimer_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 expireTimer = 5;</code>
       */
      public Builder clearExpireTimer() {
        bitField0_ = (bitField0_ & ~0x00000010);
        expireTimer_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.DataMessage)
    }

    static {
      defaultInstance = new DataMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.DataMessage)
  }

  public interface SyncMessageOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional .signalservice.SyncMessage.Sent sent = 1;
    /**
     * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
     */
    boolean hasSent();
    /**
     * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent getSent();
    /**
     * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.SentOrBuilder getSentOrBuilder();

    // optional .signalservice.SyncMessage.Contacts contacts = 2;
    /**
     * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
     */
    boolean hasContacts();
    /**
     * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts getContacts();
    /**
     * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ContactsOrBuilder getContactsOrBuilder();

    // optional .signalservice.SyncMessage.Groups groups = 3;
    /**
     * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
     */
    boolean hasGroups();
    /**
     * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups getGroups();
    /**
     * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.GroupsOrBuilder getGroupsOrBuilder();

    // optional .signalservice.SyncMessage.Request request = 4;
    /**
     * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
     */
    boolean hasRequest();
    /**
     * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request getRequest();
    /**
     * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.RequestOrBuilder getRequestOrBuilder();

    // repeated .signalservice.SyncMessage.Read read = 5;
    /**
     * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
     */
    java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read>
    getReadList();
    /**
     * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read getRead(int index);
    /**
     * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
     */
    int getReadCount();
    /**
     * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
     */
    java.util.List<? extends com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ReadOrBuilder>
    getReadOrBuilderList();
    /**
     * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ReadOrBuilder getReadOrBuilder(
      int index);

    // optional .signalservice.SyncMessage.Blocked blocked = 6;
    /**
     * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
     */
    boolean hasBlocked();
    /**
     * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked getBlocked();
    /**
     * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.BlockedOrBuilder getBlockedOrBuilder();
  }
  /**
   * Protobuf type {@code signalservice.SyncMessage}
   */
  public static final class SyncMessage extends
    com.google.protobuf.GeneratedMessage
    implements SyncMessageOrBuilder {
    // Use SyncMessage.newBuilder() to construct.
    private SyncMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SyncMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SyncMessage defaultInstance;
    public static SyncMessage getDefaultInstance() {
      return defaultInstance;
    }

    public SyncMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SyncMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = sent_.toBuilder();
              }
              sent_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(sent_);
                sent_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = contacts_.toBuilder();
              }
              contacts_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(contacts_);
                contacts_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = groups_.toBuilder();
              }
              groups_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(groups_);
                groups_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = request_.toBuilder();
              }
              request_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(request_);
                request_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                read_ = new java.util.ArrayList<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read>();
                mutable_bitField0_ |= 0x00000010;
              }
              read_.add(input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.PARSER, extensionRegistry));
              break;
            }
            case 50: {
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.Builder subBuilder = null;
              if (((bitField0_ & 0x00000010) == 0x00000010)) {
                subBuilder = blocked_.toBuilder();
              }
              blocked_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(blocked_);
                blocked_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000010;
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
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          read_ = java.util.Collections.unmodifiableList(read_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<SyncMessage> PARSER =
      new com.google.protobuf.AbstractParser<SyncMessage>() {
        public SyncMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SyncMessage(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<SyncMessage> getParserForType() {
      return PARSER;
    }

    public interface SentOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

      // optional string destination = 1;
      /**
       * <code>optional string destination = 1;</code>
       */
      boolean hasDestination();
      /**
       * <code>optional string destination = 1;</code>
       */
      java.lang.String getDestination();
      /**
       * <code>optional string destination = 1;</code>
       */
      com.google.protobuf.ByteString
      getDestinationBytes();

      // optional uint64 timestamp = 2;
      /**
       * <code>optional uint64 timestamp = 2;</code>
       */
      boolean hasTimestamp();
      /**
       * <code>optional uint64 timestamp = 2;</code>
       */
      long getTimestamp();

      // optional .signalservice.DataMessage message = 3;
      /**
       * <code>optional .signalservice.DataMessage message = 3;</code>
       */
      boolean hasMessage();
      /**
       * <code>optional .signalservice.DataMessage message = 3;</code>
       */
      com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage getMessage();
      /**
       * <code>optional .signalservice.DataMessage message = 3;</code>
       */
      com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder getMessageOrBuilder();

      // optional uint64 expirationStartTimestamp = 4;
      /**
       * <code>optional uint64 expirationStartTimestamp = 4;</code>
       */
      boolean hasExpirationStartTimestamp();
      /**
       * <code>optional uint64 expirationStartTimestamp = 4;</code>
       */
      long getExpirationStartTimestamp();
    }
    /**
     * Protobuf type {@code signalservice.SyncMessage.Sent}
     */
    public static final class Sent extends
      com.google.protobuf.GeneratedMessage
      implements SentOrBuilder {
      // Use Sent.newBuilder() to construct.
      private Sent(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private Sent(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

      private static final Sent defaultInstance;
      public static Sent getDefaultInstance() {
        return defaultInstance;
      }

      public Sent getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Sent(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(input, unknownFields,
                  extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                bitField0_ |= 0x00000001;
                destination_ = input.readBytes();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                timestamp_ = input.readUInt64();
                break;
              }
              case 26: {
                com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = message_.toBuilder();
                }
                message_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(message_);
                  message_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
              case 32: {
                bitField0_ |= 0x00000008;
                expirationStartTimestamp_ = input.readUInt64();
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
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Sent_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Sent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.Builder.class);
      }

      public static com.google.protobuf.Parser<Sent> PARSER =
        new com.google.protobuf.AbstractParser<Sent>() {
          public Sent parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new Sent(input, extensionRegistry);
          }
        };

      @java.lang.Override
      public com.google.protobuf.Parser<Sent> getParserForType() {
        return PARSER;
      }

      private int bitField0_;
      // optional string destination = 1;
      public static final int DESTINATION_FIELD_NUMBER = 1;
      private java.lang.Object destination_;
      /**
       * <code>optional string destination = 1;</code>
       */
      public boolean hasDestination() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string destination = 1;</code>
       */
      public java.lang.String getDestination() {
        java.lang.Object ref = destination_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            destination_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string destination = 1;</code>
       */
      public com.google.protobuf.ByteString
      getDestinationBytes() {
        java.lang.Object ref = destination_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          destination_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      // optional uint64 timestamp = 2;
      public static final int TIMESTAMP_FIELD_NUMBER = 2;
      private long timestamp_;
      /**
       * <code>optional uint64 timestamp = 2;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint64 timestamp = 2;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }

      // optional .signalservice.DataMessage message = 3;
      public static final int MESSAGE_FIELD_NUMBER = 3;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage message_;
      /**
       * <code>optional .signalservice.DataMessage message = 3;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .signalservice.DataMessage message = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage getMessage() {
        return message_;
      }
      /**
       * <code>optional .signalservice.DataMessage message = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder getMessageOrBuilder() {
        return message_;
      }

      // optional uint64 expirationStartTimestamp = 4;
      public static final int EXPIRATIONSTARTTIMESTAMP_FIELD_NUMBER = 4;
      private long expirationStartTimestamp_;
      /**
       * <code>optional uint64 expirationStartTimestamp = 4;</code>
       */
      public boolean hasExpirationStartTimestamp() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint64 expirationStartTimestamp = 4;</code>
       */
      public long getExpirationStartTimestamp() {
        return expirationStartTimestamp_;
      }

      private void initFields() {
        destination_ = "";
        timestamp_ = 0L;
        message_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance();
        expirationStartTimestamp_ = 0L;
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeBytes(1, getDestinationBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeUInt64(2, timestamp_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          output.writeMessage(3, message_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          output.writeUInt64(4, expirationStartTimestamp_);
        }
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(1, getDestinationBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt64Size(2, timestamp_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(3, message_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt64Size(4, expirationStartTimestamp_);
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

      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }

      @java.lang.Override
      protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code signalservice.SyncMessage.Sent}
       */
      public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
        implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.SentOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Sent_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Sent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.Builder.class);
        }

        // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.newBuilder()
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
            getMessageFieldBuilder();
          }
        }
        private static Builder create() {
          return new Builder();
        }

        public Builder clear() {
          super.clear();
          destination_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          timestamp_ = 0L;
          bitField0_ = (bitField0_ & ~0x00000002);
          if (messageBuilder_ == null) {
            message_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance();
          } else {
            messageBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000004);
          expirationStartTimestamp_ = 0L;
          bitField0_ = (bitField0_ & ~0x00000008);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Sent_descriptor;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent getDefaultInstanceForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.getDefaultInstance();
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent build() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent buildPartial() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.destination_ = destination_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.timestamp_ = timestamp_;
          if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
            to_bitField0_ |= 0x00000004;
          }
          if (messageBuilder_ == null) {
            result.message_ = message_;
          } else {
            result.message_ = messageBuilder_.build();
          }
          if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
            to_bitField0_ |= 0x00000008;
          }
          result.expirationStartTimestamp_ = expirationStartTimestamp_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent) {
            return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent other) {
          if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.getDefaultInstance()) return this;
          if (other.hasDestination()) {
            bitField0_ |= 0x00000001;
            destination_ = other.destination_;
            onChanged();
          }
          if (other.hasTimestamp()) {
            setTimestamp(other.getTimestamp());
          }
          if (other.hasMessage()) {
            mergeMessage(other.getMessage());
          }
          if (other.hasExpirationStartTimestamp()) {
            setExpirationStartTimestamp(other.getExpirationStartTimestamp());
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
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        // optional string destination = 1;
        private java.lang.Object destination_ = "";
        /**
         * <code>optional string destination = 1;</code>
         */
        public boolean hasDestination() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional string destination = 1;</code>
         */
        public java.lang.String getDestination() {
          java.lang.Object ref = destination_;
          if (!(ref instanceof java.lang.String)) {
            java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
            destination_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>optional string destination = 1;</code>
         */
        public com.google.protobuf.ByteString
        getDestinationBytes() {
          java.lang.Object ref = destination_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
            destination_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string destination = 1;</code>
         */
        public Builder setDestination(
          java.lang.String value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          destination_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional string destination = 1;</code>
         */
        public Builder clearDestination() {
          bitField0_ = (bitField0_ & ~0x00000001);
          destination_ = getDefaultInstance().getDestination();
          onChanged();
          return this;
        }
        /**
         * <code>optional string destination = 1;</code>
         */
        public Builder setDestinationBytes(
          com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          destination_ = value;
          onChanged();
          return this;
        }

        // optional uint64 timestamp = 2;
        private long timestamp_ ;
        /**
         * <code>optional uint64 timestamp = 2;</code>
         */
        public boolean hasTimestamp() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 timestamp = 2;</code>
         */
        public long getTimestamp() {
          return timestamp_;
        }
        /**
         * <code>optional uint64 timestamp = 2;</code>
         */
        public Builder setTimestamp(long value) {
          bitField0_ |= 0x00000002;
          timestamp_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional uint64 timestamp = 2;</code>
         */
        public Builder clearTimestamp() {
          bitField0_ = (bitField0_ & ~0x00000002);
          timestamp_ = 0L;
          onChanged();
          return this;
        }

        // optional .signalservice.DataMessage message = 3;
        private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage message_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder> messageBuilder_;
        /**
         * <code>optional .signalservice.DataMessage message = 3;</code>
         */
        public boolean hasMessage() {
          return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .signalservice.DataMessage message = 3;</code>
         */
        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage getMessage() {
          if (messageBuilder_ == null) {
            return message_;
          } else {
            return messageBuilder_.getMessage();
          }
        }
        /**
         * <code>optional .signalservice.DataMessage message = 3;</code>
         */
        public Builder setMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage value) {
          if (messageBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            message_ = value;
            onChanged();
          } else {
            messageBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000004;
          return this;
        }
        /**
         * <code>optional .signalservice.DataMessage message = 3;</code>
         */
        public Builder setMessage(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder builderForValue) {
          if (messageBuilder_ == null) {
            message_ = builderForValue.build();
            onChanged();
          } else {
            messageBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000004;
          return this;
        }
        /**
         * <code>optional .signalservice.DataMessage message = 3;</code>
         */
        public Builder mergeMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage value) {
          if (messageBuilder_ == null) {
            if (((bitField0_ & 0x00000004) == 0x00000004) &&
              message_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance()) {
              message_ =
                com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.newBuilder(message_).mergeFrom(value).buildPartial();
            } else {
              message_ = value;
            }
            onChanged();
          } else {
            messageBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000004;
          return this;
        }
        /**
         * <code>optional .signalservice.DataMessage message = 3;</code>
         */
        public Builder clearMessage() {
          if (messageBuilder_ == null) {
            message_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.getDefaultInstance();
            onChanged();
          } else {
            messageBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000004);
          return this;
        }
        /**
         * <code>optional .signalservice.DataMessage message = 3;</code>
         */
        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder getMessageBuilder() {
          bitField0_ |= 0x00000004;
          onChanged();
          return getMessageFieldBuilder().getBuilder();
        }
        /**
         * <code>optional .signalservice.DataMessage message = 3;</code>
         */
        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder getMessageOrBuilder() {
          if (messageBuilder_ != null) {
            return messageBuilder_.getMessageOrBuilder();
          } else {
            return message_;
          }
        }
        /**
         * <code>optional .signalservice.DataMessage message = 3;</code>
         */
        private com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder>
        getMessageFieldBuilder() {
          if (messageBuilder_ == null) {
            messageBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessage.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.DataMessageOrBuilder>(
              message_,
              getParentForChildren(),
              isClean());
            message_ = null;
          }
          return messageBuilder_;
        }

        // optional uint64 expirationStartTimestamp = 4;
        private long expirationStartTimestamp_ ;
        /**
         * <code>optional uint64 expirationStartTimestamp = 4;</code>
         */
        public boolean hasExpirationStartTimestamp() {
          return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional uint64 expirationStartTimestamp = 4;</code>
         */
        public long getExpirationStartTimestamp() {
          return expirationStartTimestamp_;
        }
        /**
         * <code>optional uint64 expirationStartTimestamp = 4;</code>
         */
        public Builder setExpirationStartTimestamp(long value) {
          bitField0_ |= 0x00000008;
          expirationStartTimestamp_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional uint64 expirationStartTimestamp = 4;</code>
         */
        public Builder clearExpirationStartTimestamp() {
          bitField0_ = (bitField0_ & ~0x00000008);
          expirationStartTimestamp_ = 0L;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:signalservice.SyncMessage.Sent)
      }

      static {
        defaultInstance = new Sent(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:signalservice.SyncMessage.Sent)
    }

    public interface ContactsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

      // optional .signalservice.AttachmentPointer blob = 1;
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      boolean hasBlob();
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getBlob();
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getBlobOrBuilder();
    }
    /**
     * Protobuf type {@code signalservice.SyncMessage.Contacts}
     */
    public static final class Contacts extends
      com.google.protobuf.GeneratedMessage
      implements ContactsOrBuilder {
      // Use Contacts.newBuilder() to construct.
      private Contacts(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private Contacts(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

      private static final Contacts defaultInstance;
      public static Contacts getDefaultInstance() {
        return defaultInstance;
      }

      public Contacts getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Contacts(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(input, unknownFields,
                  extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = blob_.toBuilder();
                }
                blob_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(blob_);
                  blob_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
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
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Contacts_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Contacts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.Builder.class);
      }

      public static com.google.protobuf.Parser<Contacts> PARSER =
        new com.google.protobuf.AbstractParser<Contacts>() {
          public Contacts parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new Contacts(input, extensionRegistry);
          }
        };

      @java.lang.Override
      public com.google.protobuf.Parser<Contacts> getParserForType() {
        return PARSER;
      }

      private int bitField0_;
      // optional .signalservice.AttachmentPointer blob = 1;
      public static final int BLOB_FIELD_NUMBER = 1;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer blob_;
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      public boolean hasBlob() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getBlob() {
        return blob_;
      }
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getBlobOrBuilder() {
        return blob_;
      }

      private void initFields() {
        blob_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeMessage(1, blob_);
        }
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, blob_);
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

      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }

      @java.lang.Override
      protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code signalservice.SyncMessage.Contacts}
       */
      public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
        implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ContactsOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Contacts_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Contacts_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.Builder.class);
        }

        // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.newBuilder()
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
            getBlobFieldBuilder();
          }
        }
        private static Builder create() {
          return new Builder();
        }

        public Builder clear() {
          super.clear();
          if (blobBuilder_ == null) {
            blob_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
          } else {
            blobBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Contacts_descriptor;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts getDefaultInstanceForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.getDefaultInstance();
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts build() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts buildPartial() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          if (blobBuilder_ == null) {
            result.blob_ = blob_;
          } else {
            result.blob_ = blobBuilder_.build();
          }
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts) {
            return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts other) {
          if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.getDefaultInstance()) return this;
          if (other.hasBlob()) {
            mergeBlob(other.getBlob());
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
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        // optional .signalservice.AttachmentPointer blob = 1;
        private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer blob_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder> blobBuilder_;
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public boolean hasBlob() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getBlob() {
          if (blobBuilder_ == null) {
            return blob_;
          } else {
            return blobBuilder_.getMessage();
          }
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public Builder setBlob(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer value) {
          if (blobBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            blob_ = value;
            onChanged();
          } else {
            blobBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public Builder setBlob(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder builderForValue) {
          if (blobBuilder_ == null) {
            blob_ = builderForValue.build();
            onChanged();
          } else {
            blobBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public Builder mergeBlob(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer value) {
          if (blobBuilder_ == null) {
            if (((bitField0_ & 0x00000001) == 0x00000001) &&
              blob_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance()) {
              blob_ =
                com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.newBuilder(blob_).mergeFrom(value).buildPartial();
            } else {
              blob_ = value;
            }
            onChanged();
          } else {
            blobBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public Builder clearBlob() {
          if (blobBuilder_ == null) {
            blob_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
            onChanged();
          } else {
            blobBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder getBlobBuilder() {
          bitField0_ |= 0x00000001;
          onChanged();
          return getBlobFieldBuilder().getBuilder();
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getBlobOrBuilder() {
          if (blobBuilder_ != null) {
            return blobBuilder_.getMessageOrBuilder();
          } else {
            return blob_;
          }
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder>
        getBlobFieldBuilder() {
          if (blobBuilder_ == null) {
            blobBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder>(
              blob_,
              getParentForChildren(),
              isClean());
            blob_ = null;
          }
          return blobBuilder_;
        }

        // @@protoc_insertion_point(builder_scope:signalservice.SyncMessage.Contacts)
      }

      static {
        defaultInstance = new Contacts(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:signalservice.SyncMessage.Contacts)
    }

    public interface GroupsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

      // optional .signalservice.AttachmentPointer blob = 1;
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      boolean hasBlob();
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getBlob();
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getBlobOrBuilder();
    }
    /**
     * Protobuf type {@code signalservice.SyncMessage.Groups}
     */
    public static final class Groups extends
      com.google.protobuf.GeneratedMessage
      implements GroupsOrBuilder {
      // Use Groups.newBuilder() to construct.
      private Groups(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private Groups(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

      private static final Groups defaultInstance;
      public static Groups getDefaultInstance() {
        return defaultInstance;
      }

      public Groups getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Groups(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(input, unknownFields,
                  extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = blob_.toBuilder();
                }
                blob_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(blob_);
                  blob_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
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
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Groups_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Groups_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.Builder.class);
      }

      public static com.google.protobuf.Parser<Groups> PARSER =
        new com.google.protobuf.AbstractParser<Groups>() {
          public Groups parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new Groups(input, extensionRegistry);
          }
        };

      @java.lang.Override
      public com.google.protobuf.Parser<Groups> getParserForType() {
        return PARSER;
      }

      private int bitField0_;
      // optional .signalservice.AttachmentPointer blob = 1;
      public static final int BLOB_FIELD_NUMBER = 1;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer blob_;
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      public boolean hasBlob() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getBlob() {
        return blob_;
      }
      /**
       * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getBlobOrBuilder() {
        return blob_;
      }

      private void initFields() {
        blob_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeMessage(1, blob_);
        }
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, blob_);
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

      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }

      @java.lang.Override
      protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code signalservice.SyncMessage.Groups}
       */
      public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
        implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.GroupsOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Groups_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Groups_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.Builder.class);
        }

        // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.newBuilder()
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
            getBlobFieldBuilder();
          }
        }
        private static Builder create() {
          return new Builder();
        }

        public Builder clear() {
          super.clear();
          if (blobBuilder_ == null) {
            blob_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
          } else {
            blobBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Groups_descriptor;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups getDefaultInstanceForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.getDefaultInstance();
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups build() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups buildPartial() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          if (blobBuilder_ == null) {
            result.blob_ = blob_;
          } else {
            result.blob_ = blobBuilder_.build();
          }
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups) {
            return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups other) {
          if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.getDefaultInstance()) return this;
          if (other.hasBlob()) {
            mergeBlob(other.getBlob());
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
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        // optional .signalservice.AttachmentPointer blob = 1;
        private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer blob_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder> blobBuilder_;
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public boolean hasBlob() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getBlob() {
          if (blobBuilder_ == null) {
            return blob_;
          } else {
            return blobBuilder_.getMessage();
          }
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public Builder setBlob(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer value) {
          if (blobBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            blob_ = value;
            onChanged();
          } else {
            blobBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public Builder setBlob(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder builderForValue) {
          if (blobBuilder_ == null) {
            blob_ = builderForValue.build();
            onChanged();
          } else {
            blobBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public Builder mergeBlob(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer value) {
          if (blobBuilder_ == null) {
            if (((bitField0_ & 0x00000001) == 0x00000001) &&
              blob_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance()) {
              blob_ =
                com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.newBuilder(blob_).mergeFrom(value).buildPartial();
            } else {
              blob_ = value;
            }
            onChanged();
          } else {
            blobBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public Builder clearBlob() {
          if (blobBuilder_ == null) {
            blob_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
            onChanged();
          } else {
            blobBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder getBlobBuilder() {
          bitField0_ |= 0x00000001;
          onChanged();
          return getBlobFieldBuilder().getBuilder();
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getBlobOrBuilder() {
          if (blobBuilder_ != null) {
            return blobBuilder_.getMessageOrBuilder();
          } else {
            return blob_;
          }
        }
        /**
         * <code>optional .signalservice.AttachmentPointer blob = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder>
        getBlobFieldBuilder() {
          if (blobBuilder_ == null) {
            blobBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder>(
              blob_,
              getParentForChildren(),
              isClean());
            blob_ = null;
          }
          return blobBuilder_;
        }

        // @@protoc_insertion_point(builder_scope:signalservice.SyncMessage.Groups)
      }

      static {
        defaultInstance = new Groups(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:signalservice.SyncMessage.Groups)
    }

    public interface BlockedOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

      // repeated string numbers = 1;
      /**
       * <code>repeated string numbers = 1;</code>
       */
      java.util.List<java.lang.String>
      getNumbersList();
      /**
       * <code>repeated string numbers = 1;</code>
       */
      int getNumbersCount();
      /**
       * <code>repeated string numbers = 1;</code>
       */
      java.lang.String getNumbers(int index);
      /**
       * <code>repeated string numbers = 1;</code>
       */
      com.google.protobuf.ByteString
      getNumbersBytes(int index);
    }
    /**
     * Protobuf type {@code signalservice.SyncMessage.Blocked}
     */
    public static final class Blocked extends
      com.google.protobuf.GeneratedMessage
      implements BlockedOrBuilder {
      // Use Blocked.newBuilder() to construct.
      private Blocked(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private Blocked(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

      private static final Blocked defaultInstance;
      public static Blocked getDefaultInstance() {
        return defaultInstance;
      }

      public Blocked getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Blocked(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(input, unknownFields,
                  extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  numbers_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                numbers_.add(input.readBytes());
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
          if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
            numbers_ = new com.google.protobuf.UnmodifiableLazyStringList(numbers_);
          }
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Blocked_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Blocked_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.Builder.class);
      }

      public static com.google.protobuf.Parser<Blocked> PARSER =
        new com.google.protobuf.AbstractParser<Blocked>() {
          public Blocked parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new Blocked(input, extensionRegistry);
          }
        };

      @java.lang.Override
      public com.google.protobuf.Parser<Blocked> getParserForType() {
        return PARSER;
      }

      // repeated string numbers = 1;
      public static final int NUMBERS_FIELD_NUMBER = 1;
      private com.google.protobuf.LazyStringList numbers_;
      /**
       * <code>repeated string numbers = 1;</code>
       */
      public java.util.List<java.lang.String>
      getNumbersList() {
        return numbers_;
      }
      /**
       * <code>repeated string numbers = 1;</code>
       */
      public int getNumbersCount() {
        return numbers_.size();
      }
      /**
       * <code>repeated string numbers = 1;</code>
       */
      public java.lang.String getNumbers(int index) {
        return numbers_.get(index);
      }
      /**
       * <code>repeated string numbers = 1;</code>
       */
      public com.google.protobuf.ByteString
      getNumbersBytes(int index) {
        return numbers_.getByteString(index);
      }

      private void initFields() {
        numbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        getSerializedSize();
        for (int i = 0; i < numbers_.size(); i++) {
          output.writeBytes(1, numbers_.getByteString(i));
        }
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        {
          int dataSize = 0;
          for (int i = 0; i < numbers_.size(); i++) {
            dataSize += com.google.protobuf.CodedOutputStream
              .computeBytesSizeNoTag(numbers_.getByteString(i));
          }
          size += dataSize;
          size += 1 * getNumbersList().size();
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

      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }

      @java.lang.Override
      protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code signalservice.SyncMessage.Blocked}
       */
      public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
        implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.BlockedOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Blocked_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Blocked_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.Builder.class);
        }

        // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.newBuilder()
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
          numbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Blocked_descriptor;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked getDefaultInstanceForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.getDefaultInstance();
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked build() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked buildPartial() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked(this);
          int from_bitField0_ = bitField0_;
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            numbers_ = new com.google.protobuf.UnmodifiableLazyStringList(
              numbers_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.numbers_ = numbers_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked) {
            return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked other) {
          if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.getDefaultInstance()) return this;
          if (!other.numbers_.isEmpty()) {
            if (numbers_.isEmpty()) {
              numbers_ = other.numbers_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNumbersIsMutable();
              numbers_.addAll(other.numbers_);
            }
            onChanged();
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
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        // repeated string numbers = 1;
        private com.google.protobuf.LazyStringList numbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        private void ensureNumbersIsMutable() {
          if (!((bitField0_ & 0x00000001) == 0x00000001)) {
            numbers_ = new com.google.protobuf.LazyStringArrayList(numbers_);
            bitField0_ |= 0x00000001;
          }
        }
        /**
         * <code>repeated string numbers = 1;</code>
         */
        public java.util.List<java.lang.String>
        getNumbersList() {
          return java.util.Collections.unmodifiableList(numbers_);
        }
        /**
         * <code>repeated string numbers = 1;</code>
         */
        public int getNumbersCount() {
          return numbers_.size();
        }
        /**
         * <code>repeated string numbers = 1;</code>
         */
        public java.lang.String getNumbers(int index) {
          return numbers_.get(index);
        }
        /**
         * <code>repeated string numbers = 1;</code>
         */
        public com.google.protobuf.ByteString
        getNumbersBytes(int index) {
          return numbers_.getByteString(index);
        }
        /**
         * <code>repeated string numbers = 1;</code>
         */
        public Builder setNumbers(
          int index, java.lang.String value) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNumbersIsMutable();
          numbers_.set(index, value);
          onChanged();
          return this;
        }
        /**
         * <code>repeated string numbers = 1;</code>
         */
        public Builder addNumbers(
          java.lang.String value) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNumbersIsMutable();
          numbers_.add(value);
          onChanged();
          return this;
        }
        /**
         * <code>repeated string numbers = 1;</code>
         */
        public Builder addAllNumbers(
          java.lang.Iterable<java.lang.String> values) {
          ensureNumbersIsMutable();
          super.addAll(values, numbers_);
          onChanged();
          return this;
        }
        /**
         * <code>repeated string numbers = 1;</code>
         */
        public Builder clearNumbers() {
          numbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
          return this;
        }
        /**
         * <code>repeated string numbers = 1;</code>
         */
        public Builder addNumbersBytes(
          com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNumbersIsMutable();
          numbers_.add(value);
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:signalservice.SyncMessage.Blocked)
      }

      static {
        defaultInstance = new Blocked(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:signalservice.SyncMessage.Blocked)
    }

    public interface RequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

      // optional .signalservice.SyncMessage.Request.Type type = 1;
      /**
       * <code>optional .signalservice.SyncMessage.Request.Type type = 1;</code>
       */
      boolean hasType();
      /**
       * <code>optional .signalservice.SyncMessage.Request.Type type = 1;</code>
       */
      com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type getType();
    }
    /**
     * Protobuf type {@code signalservice.SyncMessage.Request}
     */
    public static final class Request extends
      com.google.protobuf.GeneratedMessage
      implements RequestOrBuilder {
      // Use Request.newBuilder() to construct.
      private Request(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private Request(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

      private static final Request defaultInstance;
      public static Request getDefaultInstance() {
        return defaultInstance;
      }

      public Request getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Request(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(input, unknownFields,
                  extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 8: {
                int rawValue = input.readEnum();
                com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type value = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(1, rawValue);
                } else {
                  bitField0_ |= 0x00000001;
                  type_ = value;
                }
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
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Builder.class);
      }

      public static com.google.protobuf.Parser<Request> PARSER =
        new com.google.protobuf.AbstractParser<Request>() {
          public Request parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new Request(input, extensionRegistry);
          }
        };

      @java.lang.Override
      public com.google.protobuf.Parser<Request> getParserForType() {
        return PARSER;
      }

      /**
       * Protobuf enum {@code signalservice.SyncMessage.Request.Type}
       */
      public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>UNKNOWN = 0;</code>
         */
        UNKNOWN(0, 0),
        /**
         * <code>CONTACTS = 1;</code>
         */
        CONTACTS(1, 1),
        /**
         * <code>GROUPS = 2;</code>
         */
        GROUPS(2, 2),
        /**
         * <code>BLOCKED = 3;</code>
         */
        BLOCKED(3, 3),
        ;

        /**
         * <code>UNKNOWN = 0;</code>
         */
        public static final int UNKNOWN_VALUE = 0;
        /**
         * <code>CONTACTS = 1;</code>
         */
        public static final int CONTACTS_VALUE = 1;
        /**
         * <code>GROUPS = 2;</code>
         */
        public static final int GROUPS_VALUE = 2;
        /**
         * <code>BLOCKED = 3;</code>
         */
        public static final int BLOCKED_VALUE = 3;


        public final int getNumber() { return value; }

        public static Type valueOf(int value) {
          switch (value) {
            case 0: return UNKNOWN;
            case 1: return CONTACTS;
            case 2: return GROUPS;
            case 3: return BLOCKED;
            default: return null;
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
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.getDescriptor().getEnumTypes().get(0);
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

        // @@protoc_insertion_point(enum_scope:signalservice.SyncMessage.Request.Type)
      }

      private int bitField0_;
      // optional .signalservice.SyncMessage.Request.Type type = 1;
      public static final int TYPE_FIELD_NUMBER = 1;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type type_;
      /**
       * <code>optional .signalservice.SyncMessage.Request.Type type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .signalservice.SyncMessage.Request.Type type = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type getType() {
        return type_;
      }

      private void initFields() {
        type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type.UNKNOWN;
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeEnum(1, type_.getNumber());
        }
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(1, type_.getNumber());
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

      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }

      @java.lang.Override
      protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code signalservice.SyncMessage.Request}
       */
      public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
        implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.RequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Request_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Builder.class);
        }

        // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.newBuilder()
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
          type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type.UNKNOWN;
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Request_descriptor;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request getDefaultInstanceForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.getDefaultInstance();
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request build() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request buildPartial() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.type_ = type_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request) {
            return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request other) {
          if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.getDefaultInstance()) return this;
          if (other.hasType()) {
            setType(other.getType());
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
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        // optional .signalservice.SyncMessage.Request.Type type = 1;
        private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type.UNKNOWN;
        /**
         * <code>optional .signalservice.SyncMessage.Request.Type type = 1;</code>
         */
        public boolean hasType() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .signalservice.SyncMessage.Request.Type type = 1;</code>
         */
        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type getType() {
          return type_;
        }
        /**
         * <code>optional .signalservice.SyncMessage.Request.Type type = 1;</code>
         */
        public Builder setType(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          type_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional .signalservice.SyncMessage.Request.Type type = 1;</code>
         */
        public Builder clearType() {
          bitField0_ = (bitField0_ & ~0x00000001);
          type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Type.UNKNOWN;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:signalservice.SyncMessage.Request)
      }

      static {
        defaultInstance = new Request(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:signalservice.SyncMessage.Request)
    }

    public interface ReadOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

      // optional string sender = 1;
      /**
       * <code>optional string sender = 1;</code>
       */
      boolean hasSender();
      /**
       * <code>optional string sender = 1;</code>
       */
      java.lang.String getSender();
      /**
       * <code>optional string sender = 1;</code>
       */
      com.google.protobuf.ByteString
      getSenderBytes();

      // optional uint64 timestamp = 2;
      /**
       * <code>optional uint64 timestamp = 2;</code>
       */
      boolean hasTimestamp();
      /**
       * <code>optional uint64 timestamp = 2;</code>
       */
      long getTimestamp();
    }
    /**
     * Protobuf type {@code signalservice.SyncMessage.Read}
     */
    public static final class Read extends
      com.google.protobuf.GeneratedMessage
      implements ReadOrBuilder {
      // Use Read.newBuilder() to construct.
      private Read(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private Read(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

      private static final Read defaultInstance;
      public static Read getDefaultInstance() {
        return defaultInstance;
      }

      public Read getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Read(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(input, unknownFields,
                  extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                bitField0_ |= 0x00000001;
                sender_ = input.readBytes();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                timestamp_ = input.readUInt64();
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
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Read_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Read_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder.class);
      }

      public static com.google.protobuf.Parser<Read> PARSER =
        new com.google.protobuf.AbstractParser<Read>() {
          public Read parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new Read(input, extensionRegistry);
          }
        };

      @java.lang.Override
      public com.google.protobuf.Parser<Read> getParserForType() {
        return PARSER;
      }

      private int bitField0_;
      // optional string sender = 1;
      public static final int SENDER_FIELD_NUMBER = 1;
      private java.lang.Object sender_;
      /**
       * <code>optional string sender = 1;</code>
       */
      public boolean hasSender() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string sender = 1;</code>
       */
      public java.lang.String getSender() {
        java.lang.Object ref = sender_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            sender_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string sender = 1;</code>
       */
      public com.google.protobuf.ByteString
      getSenderBytes() {
        java.lang.Object ref = sender_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          sender_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      // optional uint64 timestamp = 2;
      public static final int TIMESTAMP_FIELD_NUMBER = 2;
      private long timestamp_;
      /**
       * <code>optional uint64 timestamp = 2;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint64 timestamp = 2;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }

      private void initFields() {
        sender_ = "";
        timestamp_ = 0L;
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeBytes(1, getSenderBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeUInt64(2, timestamp_);
        }
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(1, getSenderBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt64Size(2, timestamp_);
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

      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }

      @java.lang.Override
      protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code signalservice.SyncMessage.Read}
       */
      public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
        implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ReadOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Read_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Read_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder.class);
        }

        // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.newBuilder()
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
          sender_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          timestamp_ = 0L;
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_Read_descriptor;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read getDefaultInstanceForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.getDefaultInstance();
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read build() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read buildPartial() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.sender_ = sender_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.timestamp_ = timestamp_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read) {
            return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read other) {
          if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.getDefaultInstance()) return this;
          if (other.hasSender()) {
            bitField0_ |= 0x00000001;
            sender_ = other.sender_;
            onChanged();
          }
          if (other.hasTimestamp()) {
            setTimestamp(other.getTimestamp());
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
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        // optional string sender = 1;
        private java.lang.Object sender_ = "";
        /**
         * <code>optional string sender = 1;</code>
         */
        public boolean hasSender() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional string sender = 1;</code>
         */
        public java.lang.String getSender() {
          java.lang.Object ref = sender_;
          if (!(ref instanceof java.lang.String)) {
            java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
            sender_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>optional string sender = 1;</code>
         */
        public com.google.protobuf.ByteString
        getSenderBytes() {
          java.lang.Object ref = sender_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
            sender_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string sender = 1;</code>
         */
        public Builder setSender(
          java.lang.String value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          sender_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional string sender = 1;</code>
         */
        public Builder clearSender() {
          bitField0_ = (bitField0_ & ~0x00000001);
          sender_ = getDefaultInstance().getSender();
          onChanged();
          return this;
        }
        /**
         * <code>optional string sender = 1;</code>
         */
        public Builder setSenderBytes(
          com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          sender_ = value;
          onChanged();
          return this;
        }

        // optional uint64 timestamp = 2;
        private long timestamp_ ;
        /**
         * <code>optional uint64 timestamp = 2;</code>
         */
        public boolean hasTimestamp() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 timestamp = 2;</code>
         */
        public long getTimestamp() {
          return timestamp_;
        }
        /**
         * <code>optional uint64 timestamp = 2;</code>
         */
        public Builder setTimestamp(long value) {
          bitField0_ |= 0x00000002;
          timestamp_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional uint64 timestamp = 2;</code>
         */
        public Builder clearTimestamp() {
          bitField0_ = (bitField0_ & ~0x00000002);
          timestamp_ = 0L;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:signalservice.SyncMessage.Read)
      }

      static {
        defaultInstance = new Read(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:signalservice.SyncMessage.Read)
    }

    private int bitField0_;
    // optional .signalservice.SyncMessage.Sent sent = 1;
    public static final int SENT_FIELD_NUMBER = 1;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent sent_;
    /**
     * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
     */
    public boolean hasSent() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent getSent() {
      return sent_;
    }
    /**
     * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.SentOrBuilder getSentOrBuilder() {
      return sent_;
    }

    // optional .signalservice.SyncMessage.Contacts contacts = 2;
    public static final int CONTACTS_FIELD_NUMBER = 2;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts contacts_;
    /**
     * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
     */
    public boolean hasContacts() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts getContacts() {
      return contacts_;
    }
    /**
     * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ContactsOrBuilder getContactsOrBuilder() {
      return contacts_;
    }

    // optional .signalservice.SyncMessage.Groups groups = 3;
    public static final int GROUPS_FIELD_NUMBER = 3;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups groups_;
    /**
     * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
     */
    public boolean hasGroups() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups getGroups() {
      return groups_;
    }
    /**
     * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.GroupsOrBuilder getGroupsOrBuilder() {
      return groups_;
    }

    // optional .signalservice.SyncMessage.Request request = 4;
    public static final int REQUEST_FIELD_NUMBER = 4;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request request_;
    /**
     * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
     */
    public boolean hasRequest() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request getRequest() {
      return request_;
    }
    /**
     * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.RequestOrBuilder getRequestOrBuilder() {
      return request_;
    }

    // repeated .signalservice.SyncMessage.Read read = 5;
    public static final int READ_FIELD_NUMBER = 5;
    private java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read> read_;
    /**
     * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
     */
    public java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read> getReadList() {
      return read_;
    }
    /**
     * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
     */
    public java.util.List<? extends com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ReadOrBuilder>
    getReadOrBuilderList() {
      return read_;
    }
    /**
     * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
     */
    public int getReadCount() {
      return read_.size();
    }
    /**
     * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read getRead(int index) {
      return read_.get(index);
    }
    /**
     * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ReadOrBuilder getReadOrBuilder(
      int index) {
      return read_.get(index);
    }

    // optional .signalservice.SyncMessage.Blocked blocked = 6;
    public static final int BLOCKED_FIELD_NUMBER = 6;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked blocked_;
    /**
     * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
     */
    public boolean hasBlocked() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked getBlocked() {
      return blocked_;
    }
    /**
     * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.BlockedOrBuilder getBlockedOrBuilder() {
      return blocked_;
    }

    private void initFields() {
      sent_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.getDefaultInstance();
      contacts_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.getDefaultInstance();
      groups_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.getDefaultInstance();
      request_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.getDefaultInstance();
      read_ = java.util.Collections.emptyList();
      blocked_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, sent_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, contacts_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, groups_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, request_);
      }
      for (int i = 0; i < read_.size(); i++) {
        output.writeMessage(5, read_.get(i));
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(6, blocked_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, sent_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, contacts_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, groups_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, request_);
      }
      for (int i = 0; i < read_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, read_.get(i));
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, blocked_);
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

    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code signalservice.SyncMessage}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.newBuilder()
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
          getSentFieldBuilder();
          getContactsFieldBuilder();
          getGroupsFieldBuilder();
          getRequestFieldBuilder();
          getReadFieldBuilder();
          getBlockedFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (sentBuilder_ == null) {
          sent_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.getDefaultInstance();
        } else {
          sentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (contactsBuilder_ == null) {
          contacts_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.getDefaultInstance();
        } else {
          contactsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (groupsBuilder_ == null) {
          groups_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.getDefaultInstance();
        } else {
          groupsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (requestBuilder_ == null) {
          request_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.getDefaultInstance();
        } else {
          requestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (readBuilder_ == null) {
          read_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          readBuilder_.clear();
        }
        if (blockedBuilder_ == null) {
          blocked_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.getDefaultInstance();
        } else {
          blockedBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_SyncMessage_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage build() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage buildPartial() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (sentBuilder_ == null) {
          result.sent_ = sent_;
        } else {
          result.sent_ = sentBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (contactsBuilder_ == null) {
          result.contacts_ = contacts_;
        } else {
          result.contacts_ = contactsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (groupsBuilder_ == null) {
          result.groups_ = groups_;
        } else {
          result.groups_ = groupsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (requestBuilder_ == null) {
          result.request_ = request_;
        } else {
          result.request_ = requestBuilder_.build();
        }
        if (readBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            read_ = java.util.Collections.unmodifiableList(read_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.read_ = read_;
        } else {
          result.read_ = readBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000010;
        }
        if (blockedBuilder_ == null) {
          result.blocked_ = blocked_;
        } else {
          result.blocked_ = blockedBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage other) {
        if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.getDefaultInstance()) return this;
        if (other.hasSent()) {
          mergeSent(other.getSent());
        }
        if (other.hasContacts()) {
          mergeContacts(other.getContacts());
        }
        if (other.hasGroups()) {
          mergeGroups(other.getGroups());
        }
        if (other.hasRequest()) {
          mergeRequest(other.getRequest());
        }
        if (readBuilder_ == null) {
          if (!other.read_.isEmpty()) {
            if (read_.isEmpty()) {
              read_ = other.read_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureReadIsMutable();
              read_.addAll(other.read_);
            }
            onChanged();
          }
        } else {
          if (!other.read_.isEmpty()) {
            if (readBuilder_.isEmpty()) {
              readBuilder_.dispose();
              readBuilder_ = null;
              read_ = other.read_;
              bitField0_ = (bitField0_ & ~0x00000010);
              readBuilder_ =
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                  getReadFieldBuilder() : null;
            } else {
              readBuilder_.addAllMessages(other.read_);
            }
          }
        }
        if (other.hasBlocked()) {
          mergeBlocked(other.getBlocked());
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
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional .signalservice.SyncMessage.Sent sent = 1;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent sent_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.SentOrBuilder> sentBuilder_;
      /**
       * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
       */
      public boolean hasSent() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent getSent() {
        if (sentBuilder_ == null) {
          return sent_;
        } else {
          return sentBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
       */
      public Builder setSent(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent value) {
        if (sentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          sent_ = value;
          onChanged();
        } else {
          sentBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
       */
      public Builder setSent(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.Builder builderForValue) {
        if (sentBuilder_ == null) {
          sent_ = builderForValue.build();
          onChanged();
        } else {
          sentBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
       */
      public Builder mergeSent(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent value) {
        if (sentBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
            sent_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.getDefaultInstance()) {
            sent_ =
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.newBuilder(sent_).mergeFrom(value).buildPartial();
          } else {
            sent_ = value;
          }
          onChanged();
        } else {
          sentBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
       */
      public Builder clearSent() {
        if (sentBuilder_ == null) {
          sent_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.getDefaultInstance();
          onChanged();
        } else {
          sentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.Builder getSentBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSentFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.SentOrBuilder getSentOrBuilder() {
        if (sentBuilder_ != null) {
          return sentBuilder_.getMessageOrBuilder();
        } else {
          return sent_;
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage.Sent sent = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.SentOrBuilder>
      getSentFieldBuilder() {
        if (sentBuilder_ == null) {
          sentBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Sent.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.SentOrBuilder>(
            sent_,
            getParentForChildren(),
            isClean());
          sent_ = null;
        }
        return sentBuilder_;
      }

      // optional .signalservice.SyncMessage.Contacts contacts = 2;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts contacts_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ContactsOrBuilder> contactsBuilder_;
      /**
       * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
       */
      public boolean hasContacts() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts getContacts() {
        if (contactsBuilder_ == null) {
          return contacts_;
        } else {
          return contactsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
       */
      public Builder setContacts(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts value) {
        if (contactsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          contacts_ = value;
          onChanged();
        } else {
          contactsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
       */
      public Builder setContacts(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.Builder builderForValue) {
        if (contactsBuilder_ == null) {
          contacts_ = builderForValue.build();
          onChanged();
        } else {
          contactsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
       */
      public Builder mergeContacts(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts value) {
        if (contactsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
            contacts_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.getDefaultInstance()) {
            contacts_ =
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.newBuilder(contacts_).mergeFrom(value).buildPartial();
          } else {
            contacts_ = value;
          }
          onChanged();
        } else {
          contactsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
       */
      public Builder clearContacts() {
        if (contactsBuilder_ == null) {
          contacts_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.getDefaultInstance();
          onChanged();
        } else {
          contactsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.Builder getContactsBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getContactsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ContactsOrBuilder getContactsOrBuilder() {
        if (contactsBuilder_ != null) {
          return contactsBuilder_.getMessageOrBuilder();
        } else {
          return contacts_;
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage.Contacts contacts = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ContactsOrBuilder>
      getContactsFieldBuilder() {
        if (contactsBuilder_ == null) {
          contactsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Contacts.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ContactsOrBuilder>(
            contacts_,
            getParentForChildren(),
            isClean());
          contacts_ = null;
        }
        return contactsBuilder_;
      }

      // optional .signalservice.SyncMessage.Groups groups = 3;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups groups_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.GroupsOrBuilder> groupsBuilder_;
      /**
       * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
       */
      public boolean hasGroups() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups getGroups() {
        if (groupsBuilder_ == null) {
          return groups_;
        } else {
          return groupsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
       */
      public Builder setGroups(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups value) {
        if (groupsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          groups_ = value;
          onChanged();
        } else {
          groupsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
       */
      public Builder setGroups(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.Builder builderForValue) {
        if (groupsBuilder_ == null) {
          groups_ = builderForValue.build();
          onChanged();
        } else {
          groupsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
       */
      public Builder mergeGroups(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups value) {
        if (groupsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
            groups_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.getDefaultInstance()) {
            groups_ =
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.newBuilder(groups_).mergeFrom(value).buildPartial();
          } else {
            groups_ = value;
          }
          onChanged();
        } else {
          groupsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
       */
      public Builder clearGroups() {
        if (groupsBuilder_ == null) {
          groups_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.getDefaultInstance();
          onChanged();
        } else {
          groupsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.Builder getGroupsBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getGroupsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.GroupsOrBuilder getGroupsOrBuilder() {
        if (groupsBuilder_ != null) {
          return groupsBuilder_.getMessageOrBuilder();
        } else {
          return groups_;
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage.Groups groups = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.GroupsOrBuilder>
      getGroupsFieldBuilder() {
        if (groupsBuilder_ == null) {
          groupsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Groups.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.GroupsOrBuilder>(
            groups_,
            getParentForChildren(),
            isClean());
          groups_ = null;
        }
        return groupsBuilder_;
      }

      // optional .signalservice.SyncMessage.Request request = 4;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request request_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.RequestOrBuilder> requestBuilder_;
      /**
       * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
       */
      public boolean hasRequest() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request getRequest() {
        if (requestBuilder_ == null) {
          return request_;
        } else {
          return requestBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
       */
      public Builder setRequest(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request value) {
        if (requestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          request_ = value;
          onChanged();
        } else {
          requestBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
       */
      public Builder setRequest(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Builder builderForValue) {
        if (requestBuilder_ == null) {
          request_ = builderForValue.build();
          onChanged();
        } else {
          requestBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
       */
      public Builder mergeRequest(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request value) {
        if (requestBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
            request_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.getDefaultInstance()) {
            request_ =
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.newBuilder(request_).mergeFrom(value).buildPartial();
          } else {
            request_ = value;
          }
          onChanged();
        } else {
          requestBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
       */
      public Builder clearRequest() {
        if (requestBuilder_ == null) {
          request_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.getDefaultInstance();
          onChanged();
        } else {
          requestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Builder getRequestBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getRequestFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.RequestOrBuilder getRequestOrBuilder() {
        if (requestBuilder_ != null) {
          return requestBuilder_.getMessageOrBuilder();
        } else {
          return request_;
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage.Request request = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.RequestOrBuilder>
      getRequestFieldBuilder() {
        if (requestBuilder_ == null) {
          requestBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Request.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.RequestOrBuilder>(
            request_,
            getParentForChildren(),
            isClean());
          request_ = null;
        }
        return requestBuilder_;
      }

      // repeated .signalservice.SyncMessage.Read read = 5;
      private java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read> read_ =
        java.util.Collections.emptyList();
      private void ensureReadIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          read_ = new java.util.ArrayList<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read>(read_);
          bitField0_ |= 0x00000010;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ReadOrBuilder> readBuilder_;

      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read> getReadList() {
        if (readBuilder_ == null) {
          return java.util.Collections.unmodifiableList(read_);
        } else {
          return readBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public int getReadCount() {
        if (readBuilder_ == null) {
          return read_.size();
        } else {
          return readBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read getRead(int index) {
        if (readBuilder_ == null) {
          return read_.get(index);
        } else {
          return readBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public Builder setRead(
        int index, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read value) {
        if (readBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReadIsMutable();
          read_.set(index, value);
          onChanged();
        } else {
          readBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public Builder setRead(
        int index, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder builderForValue) {
        if (readBuilder_ == null) {
          ensureReadIsMutable();
          read_.set(index, builderForValue.build());
          onChanged();
        } else {
          readBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public Builder addRead(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read value) {
        if (readBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReadIsMutable();
          read_.add(value);
          onChanged();
        } else {
          readBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public Builder addRead(
        int index, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read value) {
        if (readBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReadIsMutable();
          read_.add(index, value);
          onChanged();
        } else {
          readBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public Builder addRead(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder builderForValue) {
        if (readBuilder_ == null) {
          ensureReadIsMutable();
          read_.add(builderForValue.build());
          onChanged();
        } else {
          readBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public Builder addRead(
        int index, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder builderForValue) {
        if (readBuilder_ == null) {
          ensureReadIsMutable();
          read_.add(index, builderForValue.build());
          onChanged();
        } else {
          readBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public Builder addAllRead(
        java.lang.Iterable<? extends com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read> values) {
        if (readBuilder_ == null) {
          ensureReadIsMutable();
          super.addAll(values, read_);
          onChanged();
        } else {
          readBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public Builder clearRead() {
        if (readBuilder_ == null) {
          read_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          readBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public Builder removeRead(int index) {
        if (readBuilder_ == null) {
          ensureReadIsMutable();
          read_.remove(index);
          onChanged();
        } else {
          readBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder getReadBuilder(
        int index) {
        return getReadFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ReadOrBuilder getReadOrBuilder(
        int index) {
        if (readBuilder_ == null) {
          return read_.get(index);  } else {
          return readBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public java.util.List<? extends com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ReadOrBuilder>
      getReadOrBuilderList() {
        if (readBuilder_ != null) {
          return readBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(read_);
        }
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder addReadBuilder() {
        return getReadFieldBuilder().addBuilder(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.getDefaultInstance());
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder addReadBuilder(
        int index) {
        return getReadFieldBuilder().addBuilder(
          index, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.getDefaultInstance());
      }
      /**
       * <code>repeated .signalservice.SyncMessage.Read read = 5;</code>
       */
      public java.util.List<com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder>
      getReadBuilderList() {
        return getReadFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ReadOrBuilder>
      getReadFieldBuilder() {
        if (readBuilder_ == null) {
          readBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Read.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.ReadOrBuilder>(
            read_,
            ((bitField0_ & 0x00000010) == 0x00000010),
            getParentForChildren(),
            isClean());
          read_ = null;
        }
        return readBuilder_;
      }

      // optional .signalservice.SyncMessage.Blocked blocked = 6;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked blocked_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.BlockedOrBuilder> blockedBuilder_;
      /**
       * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
       */
      public boolean hasBlocked() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked getBlocked() {
        if (blockedBuilder_ == null) {
          return blocked_;
        } else {
          return blockedBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
       */
      public Builder setBlocked(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked value) {
        if (blockedBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          blocked_ = value;
          onChanged();
        } else {
          blockedBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
       */
      public Builder setBlocked(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.Builder builderForValue) {
        if (blockedBuilder_ == null) {
          blocked_ = builderForValue.build();
          onChanged();
        } else {
          blockedBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
       */
      public Builder mergeBlocked(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked value) {
        if (blockedBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020) &&
            blocked_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.getDefaultInstance()) {
            blocked_ =
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.newBuilder(blocked_).mergeFrom(value).buildPartial();
          } else {
            blocked_ = value;
          }
          onChanged();
        } else {
          blockedBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
       */
      public Builder clearBlocked() {
        if (blockedBuilder_ == null) {
          blocked_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.getDefaultInstance();
          onChanged();
        } else {
          blockedBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      /**
       * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.Builder getBlockedBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getBlockedFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.BlockedOrBuilder getBlockedOrBuilder() {
        if (blockedBuilder_ != null) {
          return blockedBuilder_.getMessageOrBuilder();
        } else {
          return blocked_;
        }
      }
      /**
       * <code>optional .signalservice.SyncMessage.Blocked blocked = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.BlockedOrBuilder>
      getBlockedFieldBuilder() {
        if (blockedBuilder_ == null) {
          blockedBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.Blocked.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.SyncMessage.BlockedOrBuilder>(
            blocked_,
            getParentForChildren(),
            isClean());
          blocked_ = null;
        }
        return blockedBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.SyncMessage)
    }

    static {
      defaultInstance = new SyncMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.SyncMessage)
  }

  public interface AttachmentPointerOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional fixed64 id = 1;
    /**
     * <code>optional fixed64 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>optional fixed64 id = 1;</code>
     */
    long getId();

    // optional string contentType = 2;
    /**
     * <code>optional string contentType = 2;</code>
     */
    boolean hasContentType();
    /**
     * <code>optional string contentType = 2;</code>
     */
    java.lang.String getContentType();
    /**
     * <code>optional string contentType = 2;</code>
     */
    com.google.protobuf.ByteString
    getContentTypeBytes();

    // optional bytes key = 3;
    /**
     * <code>optional bytes key = 3;</code>
     */
    boolean hasKey();
    /**
     * <code>optional bytes key = 3;</code>
     */
    com.google.protobuf.ByteString getKey();

    // optional uint32 size = 4;
    /**
     * <code>optional uint32 size = 4;</code>
     */
    boolean hasSize();
    /**
     * <code>optional uint32 size = 4;</code>
     */
    int getSize();

    // optional bytes thumbnail = 5;
    /**
     * <code>optional bytes thumbnail = 5;</code>
     */
    boolean hasThumbnail();
    /**
     * <code>optional bytes thumbnail = 5;</code>
     */
    com.google.protobuf.ByteString getThumbnail();
  }
  /**
   * Protobuf type {@code signalservice.AttachmentPointer}
   */
  public static final class AttachmentPointer extends
    com.google.protobuf.GeneratedMessage
    implements AttachmentPointerOrBuilder {
    // Use AttachmentPointer.newBuilder() to construct.
    private AttachmentPointer(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AttachmentPointer(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AttachmentPointer defaultInstance;
    public static AttachmentPointer getDefaultInstance() {
      return defaultInstance;
    }

    public AttachmentPointer getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AttachmentPointer(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 9: {
              bitField0_ |= 0x00000001;
              id_ = input.readFixed64();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              contentType_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              key_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              size_ = input.readUInt32();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              thumbnail_ = input.readBytes();
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
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_AttachmentPointer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_AttachmentPointer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder.class);
    }

    public static com.google.protobuf.Parser<AttachmentPointer> PARSER =
      new com.google.protobuf.AbstractParser<AttachmentPointer>() {
        public AttachmentPointer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new AttachmentPointer(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<AttachmentPointer> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional fixed64 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>optional fixed64 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional fixed64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    // optional string contentType = 2;
    public static final int CONTENTTYPE_FIELD_NUMBER = 2;
    private java.lang.Object contentType_;
    /**
     * <code>optional string contentType = 2;</code>
     */
    public boolean hasContentType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string contentType = 2;</code>
     */
    public java.lang.String getContentType() {
      java.lang.Object ref = contentType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          contentType_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string contentType = 2;</code>
     */
    public com.google.protobuf.ByteString
    getContentTypeBytes() {
      java.lang.Object ref = contentType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        contentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional bytes key = 3;
    public static final int KEY_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString key_;
    /**
     * <code>optional bytes key = 3;</code>
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes key = 3;</code>
     */
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }

    // optional uint32 size = 4;
    public static final int SIZE_FIELD_NUMBER = 4;
    private int size_;
    /**
     * <code>optional uint32 size = 4;</code>
     */
    public boolean hasSize() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 size = 4;</code>
     */
    public int getSize() {
      return size_;
    }

    // optional bytes thumbnail = 5;
    public static final int THUMBNAIL_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString thumbnail_;
    /**
     * <code>optional bytes thumbnail = 5;</code>
     */
    public boolean hasThumbnail() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bytes thumbnail = 5;</code>
     */
    public com.google.protobuf.ByteString getThumbnail() {
      return thumbnail_;
    }

    private void initFields() {
      id_ = 0L;
      contentType_ = "";
      key_ = com.google.protobuf.ByteString.EMPTY;
      size_ = 0;
      thumbnail_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeFixed64(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getContentTypeBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, key_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, size_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, thumbnail_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getContentTypeBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, key_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, size_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, thumbnail_);
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

    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code signalservice.AttachmentPointer}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_AttachmentPointer_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_AttachmentPointer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.newBuilder()
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
        bitField0_ = (bitField0_ & ~0x00000001);
        contentType_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        key_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        size_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        thumbnail_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_AttachmentPointer_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer build() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer buildPartial() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.contentType_ = contentType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.key_ = key_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.size_ = size_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.thumbnail_ = thumbnail_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer other) {
        if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasContentType()) {
          bitField0_ |= 0x00000002;
          contentType_ = other.contentType_;
          onChanged();
        }
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasSize()) {
          setSize(other.getSize());
        }
        if (other.hasThumbnail()) {
          setThumbnail(other.getThumbnail());
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
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional fixed64 id = 1;
      private long id_ ;
      /**
       * <code>optional fixed64 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional fixed64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>optional fixed64 id = 1;</code>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }

      // optional string contentType = 2;
      private java.lang.Object contentType_ = "";
      /**
       * <code>optional string contentType = 2;</code>
       */
      public boolean hasContentType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string contentType = 2;</code>
       */
      public java.lang.String getContentType() {
        java.lang.Object ref = contentType_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          contentType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string contentType = 2;</code>
       */
      public com.google.protobuf.ByteString
      getContentTypeBytes() {
        java.lang.Object ref = contentType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          contentType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string contentType = 2;</code>
       */
      public Builder setContentType(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        contentType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string contentType = 2;</code>
       */
      public Builder clearContentType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        contentType_ = getDefaultInstance().getContentType();
        onChanged();
        return this;
      }
      /**
       * <code>optional string contentType = 2;</code>
       */
      public Builder setContentTypeBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        contentType_ = value;
        onChanged();
        return this;
      }

      // optional bytes key = 3;
      private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes key = 3;</code>
       */
      public boolean hasKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bytes key = 3;</code>
       */
      public com.google.protobuf.ByteString getKey() {
        return key_;
      }
      /**
       * <code>optional bytes key = 3;</code>
       */
      public Builder setKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes key = 3;</code>
       */
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000004);
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }

      // optional uint32 size = 4;
      private int size_ ;
      /**
       * <code>optional uint32 size = 4;</code>
       */
      public boolean hasSize() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint32 size = 4;</code>
       */
      public int getSize() {
        return size_;
      }
      /**
       * <code>optional uint32 size = 4;</code>
       */
      public Builder setSize(int value) {
        bitField0_ |= 0x00000008;
        size_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 size = 4;</code>
       */
      public Builder clearSize() {
        bitField0_ = (bitField0_ & ~0x00000008);
        size_ = 0;
        onChanged();
        return this;
      }

      // optional bytes thumbnail = 5;
      private com.google.protobuf.ByteString thumbnail_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes thumbnail = 5;</code>
       */
      public boolean hasThumbnail() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bytes thumbnail = 5;</code>
       */
      public com.google.protobuf.ByteString getThumbnail() {
        return thumbnail_;
      }
      /**
       * <code>optional bytes thumbnail = 5;</code>
       */
      public Builder setThumbnail(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        thumbnail_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes thumbnail = 5;</code>
       */
      public Builder clearThumbnail() {
        bitField0_ = (bitField0_ & ~0x00000010);
        thumbnail_ = getDefaultInstance().getThumbnail();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.AttachmentPointer)
    }

    static {
      defaultInstance = new AttachmentPointer(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.AttachmentPointer)
  }

  public interface GroupContextOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional bytes id = 1;
    /**
     * <code>optional bytes id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>optional bytes id = 1;</code>
     */
    com.google.protobuf.ByteString getId();

    // optional .signalservice.GroupContext.Type type = 2;
    /**
     * <code>optional .signalservice.GroupContext.Type type = 2;</code>
     */
    boolean hasType();
    /**
     * <code>optional .signalservice.GroupContext.Type type = 2;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type getType();

    // optional string name = 3;
    /**
     * <code>optional string name = 3;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 3;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 3;</code>
     */
    com.google.protobuf.ByteString
    getNameBytes();

    // repeated string members = 4;
    /**
     * <code>repeated string members = 4;</code>
     */
    java.util.List<java.lang.String>
    getMembersList();
    /**
     * <code>repeated string members = 4;</code>
     */
    int getMembersCount();
    /**
     * <code>repeated string members = 4;</code>
     */
    java.lang.String getMembers(int index);
    /**
     * <code>repeated string members = 4;</code>
     */
    com.google.protobuf.ByteString
    getMembersBytes(int index);

    // optional .signalservice.AttachmentPointer avatar = 5;
    /**
     * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
     */
    boolean hasAvatar();
    /**
     * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getAvatar();
    /**
     * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getAvatarOrBuilder();
  }
  /**
   * Protobuf type {@code signalservice.GroupContext}
   */
  public static final class GroupContext extends
    com.google.protobuf.GeneratedMessage
    implements GroupContextOrBuilder {
    // Use GroupContext.newBuilder() to construct.
    private GroupContext(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GroupContext(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GroupContext defaultInstance;
    public static GroupContext getDefaultInstance() {
      return defaultInstance;
    }

    public GroupContext getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GroupContext(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              id_ = input.readBytes();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type value = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                type_ = value;
              }
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              name_ = input.readBytes();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                members_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              members_.add(input.readBytes());
              break;
            }
            case 42: {
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = avatar_.toBuilder();
              }
              avatar_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(avatar_);
                avatar_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
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
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          members_ = new com.google.protobuf.UnmodifiableLazyStringList(members_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupContext_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Builder.class);
    }

    public static com.google.protobuf.Parser<GroupContext> PARSER =
      new com.google.protobuf.AbstractParser<GroupContext>() {
        public GroupContext parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new GroupContext(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<GroupContext> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code signalservice.GroupContext.Type}
     */
    public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0, 0),
      /**
       * <code>UPDATE = 1;</code>
       */
      UPDATE(1, 1),
      /**
       * <code>DELIVER = 2;</code>
       */
      DELIVER(2, 2),
      /**
       * <code>QUIT = 3;</code>
       */
      QUIT(3, 3),
      /**
       * <code>REQUEST_INFO = 4;</code>
       */
      REQUEST_INFO(4, 4),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>UPDATE = 1;</code>
       */
      public static final int UPDATE_VALUE = 1;
      /**
       * <code>DELIVER = 2;</code>
       */
      public static final int DELIVER_VALUE = 2;
      /**
       * <code>QUIT = 3;</code>
       */
      public static final int QUIT_VALUE = 3;
      /**
       * <code>REQUEST_INFO = 4;</code>
       */
      public static final int REQUEST_INFO_VALUE = 4;


      public final int getNumber() { return value; }

      public static Type valueOf(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return UPDATE;
          case 2: return DELIVER;
          case 3: return QUIT;
          case 4: return REQUEST_INFO;
          default: return null;
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
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:signalservice.GroupContext.Type)
    }

    private int bitField0_;
    // optional bytes id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString id_;
    /**
     * <code>optional bytes id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bytes id = 1;</code>
     */
    public com.google.protobuf.ByteString getId() {
      return id_;
    }

    // optional .signalservice.GroupContext.Type type = 2;
    public static final int TYPE_FIELD_NUMBER = 2;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type type_;
    /**
     * <code>optional .signalservice.GroupContext.Type type = 2;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .signalservice.GroupContext.Type type = 2;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type getType() {
      return type_;
    }

    // optional string name = 3;
    public static final int NAME_FIELD_NUMBER = 3;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 3;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public com.google.protobuf.ByteString
    getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated string members = 4;
    public static final int MEMBERS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList members_;
    /**
     * <code>repeated string members = 4;</code>
     */
    public java.util.List<java.lang.String>
    getMembersList() {
      return members_;
    }
    /**
     * <code>repeated string members = 4;</code>
     */
    public int getMembersCount() {
      return members_.size();
    }
    /**
     * <code>repeated string members = 4;</code>
     */
    public java.lang.String getMembers(int index) {
      return members_.get(index);
    }
    /**
     * <code>repeated string members = 4;</code>
     */
    public com.google.protobuf.ByteString
    getMembersBytes(int index) {
      return members_.getByteString(index);
    }

    // optional .signalservice.AttachmentPointer avatar = 5;
    public static final int AVATAR_FIELD_NUMBER = 5;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer avatar_;
    /**
     * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
     */
    public boolean hasAvatar() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getAvatar() {
      return avatar_;
    }
    /**
     * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getAvatarOrBuilder() {
      return avatar_;
    }

    private void initFields() {
      id_ = com.google.protobuf.ByteString.EMPTY;
      type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type.UNKNOWN;
      name_ = "";
      members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, type_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getNameBytes());
      }
      for (int i = 0; i < members_.size(); i++) {
        output.writeBytes(4, members_.getByteString(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(5, avatar_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, type_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getNameBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < members_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(members_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getMembersList().size();
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, avatar_);
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

    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code signalservice.GroupContext}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContextOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupContext_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.newBuilder()
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
          getAvatarFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type.UNKNOWN;
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (avatarBuilder_ == null) {
          avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
        } else {
          avatarBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupContext_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext build() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext buildPartial() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.name_ = name_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          members_ = new com.google.protobuf.UnmodifiableLazyStringList(
            members_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.members_ = members_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        if (avatarBuilder_ == null) {
          result.avatar_ = avatar_;
        } else {
          result.avatar_ = avatarBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext other) {
        if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000004;
          name_ = other.name_;
          onChanged();
        }
        if (!other.members_.isEmpty()) {
          if (members_.isEmpty()) {
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureMembersIsMutable();
            members_.addAll(other.members_);
          }
          onChanged();
        }
        if (other.hasAvatar()) {
          mergeAvatar(other.getAvatar());
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
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional bytes id = 1;
      private com.google.protobuf.ByteString id_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bytes id = 1;</code>
       */
      public com.google.protobuf.ByteString getId() {
        return id_;
      }
      /**
       * <code>optional bytes id = 1;</code>
       */
      public Builder setId(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }

      // optional .signalservice.GroupContext.Type type = 2;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type.UNKNOWN;
      /**
       * <code>optional .signalservice.GroupContext.Type type = 2;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .signalservice.GroupContext.Type type = 2;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type getType() {
        return type_;
      }
      /**
       * <code>optional .signalservice.GroupContext.Type type = 2;</code>
       */
      public Builder setType(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .signalservice.GroupContext.Type type = 2;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupContext.Type.UNKNOWN;
        onChanged();
        return this;
      }

      // optional string name = 3;
      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 3;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public com.google.protobuf.ByteString
      getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public Builder setName(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }

      // repeated string members = 4;
      private com.google.protobuf.LazyStringList members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureMembersIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          members_ = new com.google.protobuf.LazyStringArrayList(members_);
          bitField0_ |= 0x00000008;
        }
      }
      /**
       * <code>repeated string members = 4;</code>
       */
      public java.util.List<java.lang.String>
      getMembersList() {
        return java.util.Collections.unmodifiableList(members_);
      }
      /**
       * <code>repeated string members = 4;</code>
       */
      public int getMembersCount() {
        return members_.size();
      }
      /**
       * <code>repeated string members = 4;</code>
       */
      public java.lang.String getMembers(int index) {
        return members_.get(index);
      }
      /**
       * <code>repeated string members = 4;</code>
       */
      public com.google.protobuf.ByteString
      getMembersBytes(int index) {
        return members_.getByteString(index);
      }
      /**
       * <code>repeated string members = 4;</code>
       */
      public Builder setMembers(
        int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string members = 4;</code>
       */
      public Builder addMembers(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string members = 4;</code>
       */
      public Builder addAllMembers(
        java.lang.Iterable<java.lang.String> values) {
        ensureMembersIsMutable();
        super.addAll(values, members_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string members = 4;</code>
       */
      public Builder clearMembers() {
        members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string members = 4;</code>
       */
      public Builder addMembersBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(value);
        onChanged();
        return this;
      }

      // optional .signalservice.AttachmentPointer avatar = 5;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder> avatarBuilder_;
      /**
       * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
       */
      public boolean hasAvatar() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer getAvatar() {
        if (avatarBuilder_ == null) {
          return avatar_;
        } else {
          return avatarBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
       */
      public Builder setAvatar(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer value) {
        if (avatarBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          avatar_ = value;
          onChanged();
        } else {
          avatarBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
       */
      public Builder setAvatar(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder builderForValue) {
        if (avatarBuilder_ == null) {
          avatar_ = builderForValue.build();
          onChanged();
        } else {
          avatarBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
       */
      public Builder mergeAvatar(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer value) {
        if (avatarBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010) &&
            avatar_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance()) {
            avatar_ =
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.newBuilder(avatar_).mergeFrom(value).buildPartial();
          } else {
            avatar_ = value;
          }
          onChanged();
        } else {
          avatarBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
       */
      public Builder clearAvatar() {
        if (avatarBuilder_ == null) {
          avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.getDefaultInstance();
          onChanged();
        } else {
          avatarBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder getAvatarBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getAvatarFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder getAvatarOrBuilder() {
        if (avatarBuilder_ != null) {
          return avatarBuilder_.getMessageOrBuilder();
        } else {
          return avatar_;
        }
      }
      /**
       * <code>optional .signalservice.AttachmentPointer avatar = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder>
      getAvatarFieldBuilder() {
        if (avatarBuilder_ == null) {
          avatarBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointer.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.AttachmentPointerOrBuilder>(
            avatar_,
            getParentForChildren(),
            isClean());
          avatar_ = null;
        }
        return avatarBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.GroupContext)
    }

    static {
      defaultInstance = new GroupContext(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.GroupContext)
  }

  public interface ContactDetailsOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional string number = 1;
    /**
     * <code>optional string number = 1;</code>
     */
    boolean hasNumber();
    /**
     * <code>optional string number = 1;</code>
     */
    java.lang.String getNumber();
    /**
     * <code>optional string number = 1;</code>
     */
    com.google.protobuf.ByteString
    getNumberBytes();

    // optional string name = 2;
    /**
     * <code>optional string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString
    getNameBytes();

    // optional .signalservice.ContactDetails.Avatar avatar = 3;
    /**
     * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
     */
    boolean hasAvatar();
    /**
     * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar getAvatar();
    /**
     * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.AvatarOrBuilder getAvatarOrBuilder();

    // optional string color = 4;
    /**
     * <code>optional string color = 4;</code>
     */
    boolean hasColor();
    /**
     * <code>optional string color = 4;</code>
     */
    java.lang.String getColor();
    /**
     * <code>optional string color = 4;</code>
     */
    com.google.protobuf.ByteString
    getColorBytes();
  }
  /**
   * Protobuf type {@code signalservice.ContactDetails}
   */
  public static final class ContactDetails extends
    com.google.protobuf.GeneratedMessage
    implements ContactDetailsOrBuilder {
    // Use ContactDetails.newBuilder() to construct.
    private ContactDetails(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ContactDetails(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ContactDetails defaultInstance;
    public static ContactDetails getDefaultInstance() {
      return defaultInstance;
    }

    public ContactDetails getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ContactDetails(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              number_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              name_ = input.readBytes();
              break;
            }
            case 26: {
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = avatar_.toBuilder();
              }
              avatar_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(avatar_);
                avatar_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              color_ = input.readBytes();
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
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_ContactDetails_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_ContactDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Builder.class);
    }

    public static com.google.protobuf.Parser<ContactDetails> PARSER =
      new com.google.protobuf.AbstractParser<ContactDetails>() {
        public ContactDetails parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ContactDetails(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<ContactDetails> getParserForType() {
      return PARSER;
    }

    public interface AvatarOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

      // optional string contentType = 1;
      /**
       * <code>optional string contentType = 1;</code>
       */
      boolean hasContentType();
      /**
       * <code>optional string contentType = 1;</code>
       */
      java.lang.String getContentType();
      /**
       * <code>optional string contentType = 1;</code>
       */
      com.google.protobuf.ByteString
      getContentTypeBytes();

      // optional uint32 length = 2;
      /**
       * <code>optional uint32 length = 2;</code>
       */
      boolean hasLength();
      /**
       * <code>optional uint32 length = 2;</code>
       */
      int getLength();
    }
    /**
     * Protobuf type {@code signalservice.ContactDetails.Avatar}
     */
    public static final class Avatar extends
      com.google.protobuf.GeneratedMessage
      implements AvatarOrBuilder {
      // Use Avatar.newBuilder() to construct.
      private Avatar(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private Avatar(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

      private static final Avatar defaultInstance;
      public static Avatar getDefaultInstance() {
        return defaultInstance;
      }

      public Avatar getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Avatar(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(input, unknownFields,
                  extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                bitField0_ |= 0x00000001;
                contentType_ = input.readBytes();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                length_ = input.readUInt32();
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
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_ContactDetails_Avatar_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_ContactDetails_Avatar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.Builder.class);
      }

      public static com.google.protobuf.Parser<Avatar> PARSER =
        new com.google.protobuf.AbstractParser<Avatar>() {
          public Avatar parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new Avatar(input, extensionRegistry);
          }
        };

      @java.lang.Override
      public com.google.protobuf.Parser<Avatar> getParserForType() {
        return PARSER;
      }

      private int bitField0_;
      // optional string contentType = 1;
      public static final int CONTENTTYPE_FIELD_NUMBER = 1;
      private java.lang.Object contentType_;
      /**
       * <code>optional string contentType = 1;</code>
       */
      public boolean hasContentType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string contentType = 1;</code>
       */
      public java.lang.String getContentType() {
        java.lang.Object ref = contentType_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            contentType_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string contentType = 1;</code>
       */
      public com.google.protobuf.ByteString
      getContentTypeBytes() {
        java.lang.Object ref = contentType_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          contentType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      // optional uint32 length = 2;
      public static final int LENGTH_FIELD_NUMBER = 2;
      private int length_;
      /**
       * <code>optional uint32 length = 2;</code>
       */
      public boolean hasLength() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 length = 2;</code>
       */
      public int getLength() {
        return length_;
      }

      private void initFields() {
        contentType_ = "";
        length_ = 0;
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeBytes(1, getContentTypeBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeUInt32(2, length_);
        }
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(1, getContentTypeBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32Size(2, length_);
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

      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }

      @java.lang.Override
      protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code signalservice.ContactDetails.Avatar}
       */
      public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
        implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.AvatarOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_ContactDetails_Avatar_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_ContactDetails_Avatar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.Builder.class);
        }

        // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.newBuilder()
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
          contentType_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          length_ = 0;
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_ContactDetails_Avatar_descriptor;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar getDefaultInstanceForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.getDefaultInstance();
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar build() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar buildPartial() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.contentType_ = contentType_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.length_ = length_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar) {
            return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar other) {
          if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.getDefaultInstance()) return this;
          if (other.hasContentType()) {
            bitField0_ |= 0x00000001;
            contentType_ = other.contentType_;
            onChanged();
          }
          if (other.hasLength()) {
            setLength(other.getLength());
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
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        // optional string contentType = 1;
        private java.lang.Object contentType_ = "";
        /**
         * <code>optional string contentType = 1;</code>
         */
        public boolean hasContentType() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional string contentType = 1;</code>
         */
        public java.lang.String getContentType() {
          java.lang.Object ref = contentType_;
          if (!(ref instanceof java.lang.String)) {
            java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
            contentType_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>optional string contentType = 1;</code>
         */
        public com.google.protobuf.ByteString
        getContentTypeBytes() {
          java.lang.Object ref = contentType_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
            contentType_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string contentType = 1;</code>
         */
        public Builder setContentType(
          java.lang.String value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          contentType_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional string contentType = 1;</code>
         */
        public Builder clearContentType() {
          bitField0_ = (bitField0_ & ~0x00000001);
          contentType_ = getDefaultInstance().getContentType();
          onChanged();
          return this;
        }
        /**
         * <code>optional string contentType = 1;</code>
         */
        public Builder setContentTypeBytes(
          com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          contentType_ = value;
          onChanged();
          return this;
        }

        // optional uint32 length = 2;
        private int length_ ;
        /**
         * <code>optional uint32 length = 2;</code>
         */
        public boolean hasLength() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint32 length = 2;</code>
         */
        public int getLength() {
          return length_;
        }
        /**
         * <code>optional uint32 length = 2;</code>
         */
        public Builder setLength(int value) {
          bitField0_ |= 0x00000002;
          length_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional uint32 length = 2;</code>
         */
        public Builder clearLength() {
          bitField0_ = (bitField0_ & ~0x00000002);
          length_ = 0;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:signalservice.ContactDetails.Avatar)
      }

      static {
        defaultInstance = new Avatar(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:signalservice.ContactDetails.Avatar)
    }

    private int bitField0_;
    // optional string number = 1;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private java.lang.Object number_;
    /**
     * <code>optional string number = 1;</code>
     */
    public boolean hasNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string number = 1;</code>
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          number_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string number = 1;</code>
     */
    public com.google.protobuf.ByteString
    getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string name = 2;
    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
    getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional .signalservice.ContactDetails.Avatar avatar = 3;
    public static final int AVATAR_FIELD_NUMBER = 3;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar avatar_;
    /**
     * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
     */
    public boolean hasAvatar() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar getAvatar() {
      return avatar_;
    }
    /**
     * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.AvatarOrBuilder getAvatarOrBuilder() {
      return avatar_;
    }

    // optional string color = 4;
    public static final int COLOR_FIELD_NUMBER = 4;
    private java.lang.Object color_;
    /**
     * <code>optional string color = 4;</code>
     */
    public boolean hasColor() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string color = 4;</code>
     */
    public java.lang.String getColor() {
      java.lang.Object ref = color_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          color_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string color = 4;</code>
     */
    public com.google.protobuf.ByteString
    getColorBytes() {
      java.lang.Object ref = color_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        color_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      number_ = "";
      name_ = "";
      avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.getDefaultInstance();
      color_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNumberBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, avatar_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getColorBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNumberBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, avatar_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getColorBytes());
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

    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code signalservice.ContactDetails}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetailsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_ContactDetails_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_ContactDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.newBuilder()
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
          getAvatarFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        number_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (avatarBuilder_ == null) {
          avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.getDefaultInstance();
        } else {
          avatarBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        color_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_ContactDetails_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails build() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails buildPartial() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.number_ = number_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (avatarBuilder_ == null) {
          result.avatar_ = avatar_;
        } else {
          result.avatar_ = avatarBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.color_ = color_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails other) {
        if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.getDefaultInstance()) return this;
        if (other.hasNumber()) {
          bitField0_ |= 0x00000001;
          number_ = other.number_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasAvatar()) {
          mergeAvatar(other.getAvatar());
        }
        if (other.hasColor()) {
          bitField0_ |= 0x00000008;
          color_ = other.color_;
          onChanged();
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
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string number = 1;
      private java.lang.Object number_ = "";
      /**
       * <code>optional string number = 1;</code>
       */
      public boolean hasNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string number = 1;</code>
       */
      public java.lang.String getNumber() {
        java.lang.Object ref = number_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          number_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string number = 1;</code>
       */
      public com.google.protobuf.ByteString
      getNumberBytes() {
        java.lang.Object ref = number_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          number_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string number = 1;</code>
       */
      public Builder setNumber(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        number_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string number = 1;</code>
       */
      public Builder clearNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        number_ = getDefaultInstance().getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional string number = 1;</code>
       */
      public Builder setNumberBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        number_ = value;
        onChanged();
        return this;
      }

      // optional string name = 2;
      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public com.google.protobuf.ByteString
      getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setName(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      // optional .signalservice.ContactDetails.Avatar avatar = 3;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.AvatarOrBuilder> avatarBuilder_;
      /**
       * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
       */
      public boolean hasAvatar() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar getAvatar() {
        if (avatarBuilder_ == null) {
          return avatar_;
        } else {
          return avatarBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
       */
      public Builder setAvatar(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar value) {
        if (avatarBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          avatar_ = value;
          onChanged();
        } else {
          avatarBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
       */
      public Builder setAvatar(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.Builder builderForValue) {
        if (avatarBuilder_ == null) {
          avatar_ = builderForValue.build();
          onChanged();
        } else {
          avatarBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
       */
      public Builder mergeAvatar(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar value) {
        if (avatarBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
            avatar_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.getDefaultInstance()) {
            avatar_ =
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.newBuilder(avatar_).mergeFrom(value).buildPartial();
          } else {
            avatar_ = value;
          }
          onChanged();
        } else {
          avatarBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
       */
      public Builder clearAvatar() {
        if (avatarBuilder_ == null) {
          avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.getDefaultInstance();
          onChanged();
        } else {
          avatarBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.Builder getAvatarBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getAvatarFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.AvatarOrBuilder getAvatarOrBuilder() {
        if (avatarBuilder_ != null) {
          return avatarBuilder_.getMessageOrBuilder();
        } else {
          return avatar_;
        }
      }
      /**
       * <code>optional .signalservice.ContactDetails.Avatar avatar = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.AvatarOrBuilder>
      getAvatarFieldBuilder() {
        if (avatarBuilder_ == null) {
          avatarBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.Avatar.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.ContactDetails.AvatarOrBuilder>(
            avatar_,
            getParentForChildren(),
            isClean());
          avatar_ = null;
        }
        return avatarBuilder_;
      }

      // optional string color = 4;
      private java.lang.Object color_ = "";
      /**
       * <code>optional string color = 4;</code>
       */
      public boolean hasColor() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string color = 4;</code>
       */
      public java.lang.String getColor() {
        java.lang.Object ref = color_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          color_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string color = 4;</code>
       */
      public com.google.protobuf.ByteString
      getColorBytes() {
        java.lang.Object ref = color_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          color_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string color = 4;</code>
       */
      public Builder setColor(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        color_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string color = 4;</code>
       */
      public Builder clearColor() {
        bitField0_ = (bitField0_ & ~0x00000008);
        color_ = getDefaultInstance().getColor();
        onChanged();
        return this;
      }
      /**
       * <code>optional string color = 4;</code>
       */
      public Builder setColorBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        color_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.ContactDetails)
    }

    static {
      defaultInstance = new ContactDetails(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.ContactDetails)
  }

  public interface GroupDetailsOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional bytes id = 1;
    /**
     * <code>optional bytes id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>optional bytes id = 1;</code>
     */
    com.google.protobuf.ByteString getId();

    // optional string name = 2;
    /**
     * <code>optional string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString
    getNameBytes();

    // repeated string members = 3;
    /**
     * <code>repeated string members = 3;</code>
     */
    java.util.List<java.lang.String>
    getMembersList();
    /**
     * <code>repeated string members = 3;</code>
     */
    int getMembersCount();
    /**
     * <code>repeated string members = 3;</code>
     */
    java.lang.String getMembers(int index);
    /**
     * <code>repeated string members = 3;</code>
     */
    com.google.protobuf.ByteString
    getMembersBytes(int index);

    // optional .signalservice.GroupDetails.Avatar avatar = 4;
    /**
     * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
     */
    boolean hasAvatar();
    /**
     * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar getAvatar();
    /**
     * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
     */
    com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.AvatarOrBuilder getAvatarOrBuilder();

    // optional bool active = 5 [default = true];
    /**
     * <code>optional bool active = 5 [default = true];</code>
     */
    boolean hasActive();
    /**
     * <code>optional bool active = 5 [default = true];</code>
     */
    boolean getActive();
  }
  /**
   * Protobuf type {@code signalservice.GroupDetails}
   */
  public static final class GroupDetails extends
    com.google.protobuf.GeneratedMessage
    implements GroupDetailsOrBuilder {
    // Use GroupDetails.newBuilder() to construct.
    private GroupDetails(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GroupDetails(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GroupDetails defaultInstance;
    public static GroupDetails getDefaultInstance() {
      return defaultInstance;
    }

    public GroupDetails getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GroupDetails(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              id_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              name_ = input.readBytes();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                members_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              members_.add(input.readBytes());
              break;
            }
            case 34: {
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = avatar_.toBuilder();
              }
              avatar_ = input.readMessage(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(avatar_);
                avatar_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000008;
              active_ = input.readBool();
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          members_ = new com.google.protobuf.UnmodifiableLazyStringList(members_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupDetails_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Builder.class);
    }

    public static com.google.protobuf.Parser<GroupDetails> PARSER =
      new com.google.protobuf.AbstractParser<GroupDetails>() {
        public GroupDetails parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new GroupDetails(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<GroupDetails> getParserForType() {
      return PARSER;
    }

    public interface AvatarOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

      // optional string contentType = 1;
      /**
       * <code>optional string contentType = 1;</code>
       */
      boolean hasContentType();
      /**
       * <code>optional string contentType = 1;</code>
       */
      java.lang.String getContentType();
      /**
       * <code>optional string contentType = 1;</code>
       */
      com.google.protobuf.ByteString
      getContentTypeBytes();

      // optional uint32 length = 2;
      /**
       * <code>optional uint32 length = 2;</code>
       */
      boolean hasLength();
      /**
       * <code>optional uint32 length = 2;</code>
       */
      int getLength();
    }
    /**
     * Protobuf type {@code signalservice.GroupDetails.Avatar}
     */
    public static final class Avatar extends
      com.google.protobuf.GeneratedMessage
      implements AvatarOrBuilder {
      // Use Avatar.newBuilder() to construct.
      private Avatar(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private Avatar(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

      private static final Avatar defaultInstance;
      public static Avatar getDefaultInstance() {
        return defaultInstance;
      }

      public Avatar getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Avatar(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(input, unknownFields,
                  extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                bitField0_ |= 0x00000001;
                contentType_ = input.readBytes();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                length_ = input.readUInt32();
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
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupDetails_Avatar_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupDetails_Avatar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.Builder.class);
      }

      public static com.google.protobuf.Parser<Avatar> PARSER =
        new com.google.protobuf.AbstractParser<Avatar>() {
          public Avatar parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new Avatar(input, extensionRegistry);
          }
        };

      @java.lang.Override
      public com.google.protobuf.Parser<Avatar> getParserForType() {
        return PARSER;
      }

      private int bitField0_;
      // optional string contentType = 1;
      public static final int CONTENTTYPE_FIELD_NUMBER = 1;
      private java.lang.Object contentType_;
      /**
       * <code>optional string contentType = 1;</code>
       */
      public boolean hasContentType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string contentType = 1;</code>
       */
      public java.lang.String getContentType() {
        java.lang.Object ref = contentType_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            contentType_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string contentType = 1;</code>
       */
      public com.google.protobuf.ByteString
      getContentTypeBytes() {
        java.lang.Object ref = contentType_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          contentType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      // optional uint32 length = 2;
      public static final int LENGTH_FIELD_NUMBER = 2;
      private int length_;
      /**
       * <code>optional uint32 length = 2;</code>
       */
      public boolean hasLength() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 length = 2;</code>
       */
      public int getLength() {
        return length_;
      }

      private void initFields() {
        contentType_ = "";
        length_ = 0;
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeBytes(1, getContentTypeBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeUInt32(2, length_);
        }
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(1, getContentTypeBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32Size(2, length_);
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

      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }

      @java.lang.Override
      protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code signalservice.GroupDetails.Avatar}
       */
      public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
        implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.AvatarOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupDetails_Avatar_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupDetails_Avatar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.Builder.class);
        }

        // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.newBuilder()
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
          contentType_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          length_ = 0;
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupDetails_Avatar_descriptor;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar getDefaultInstanceForType() {
          return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.getDefaultInstance();
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar build() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar buildPartial() {
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.contentType_ = contentType_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.length_ = length_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar) {
            return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar other) {
          if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.getDefaultInstance()) return this;
          if (other.hasContentType()) {
            bitField0_ |= 0x00000001;
            contentType_ = other.contentType_;
            onChanged();
          }
          if (other.hasLength()) {
            setLength(other.getLength());
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
          com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        // optional string contentType = 1;
        private java.lang.Object contentType_ = "";
        /**
         * <code>optional string contentType = 1;</code>
         */
        public boolean hasContentType() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional string contentType = 1;</code>
         */
        public java.lang.String getContentType() {
          java.lang.Object ref = contentType_;
          if (!(ref instanceof java.lang.String)) {
            java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
            contentType_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>optional string contentType = 1;</code>
         */
        public com.google.protobuf.ByteString
        getContentTypeBytes() {
          java.lang.Object ref = contentType_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
            contentType_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string contentType = 1;</code>
         */
        public Builder setContentType(
          java.lang.String value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          contentType_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional string contentType = 1;</code>
         */
        public Builder clearContentType() {
          bitField0_ = (bitField0_ & ~0x00000001);
          contentType_ = getDefaultInstance().getContentType();
          onChanged();
          return this;
        }
        /**
         * <code>optional string contentType = 1;</code>
         */
        public Builder setContentTypeBytes(
          com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          contentType_ = value;
          onChanged();
          return this;
        }

        // optional uint32 length = 2;
        private int length_ ;
        /**
         * <code>optional uint32 length = 2;</code>
         */
        public boolean hasLength() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint32 length = 2;</code>
         */
        public int getLength() {
          return length_;
        }
        /**
         * <code>optional uint32 length = 2;</code>
         */
        public Builder setLength(int value) {
          bitField0_ |= 0x00000002;
          length_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional uint32 length = 2;</code>
         */
        public Builder clearLength() {
          bitField0_ = (bitField0_ & ~0x00000002);
          length_ = 0;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:signalservice.GroupDetails.Avatar)
      }

      static {
        defaultInstance = new Avatar(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:signalservice.GroupDetails.Avatar)
    }

    private int bitField0_;
    // optional bytes id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString id_;
    /**
     * <code>optional bytes id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bytes id = 1;</code>
     */
    public com.google.protobuf.ByteString getId() {
      return id_;
    }

    // optional string name = 2;
    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
    getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated string members = 3;
    public static final int MEMBERS_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList members_;
    /**
     * <code>repeated string members = 3;</code>
     */
    public java.util.List<java.lang.String>
    getMembersList() {
      return members_;
    }
    /**
     * <code>repeated string members = 3;</code>
     */
    public int getMembersCount() {
      return members_.size();
    }
    /**
     * <code>repeated string members = 3;</code>
     */
    public java.lang.String getMembers(int index) {
      return members_.get(index);
    }
    /**
     * <code>repeated string members = 3;</code>
     */
    public com.google.protobuf.ByteString
    getMembersBytes(int index) {
      return members_.getByteString(index);
    }

    // optional .signalservice.GroupDetails.Avatar avatar = 4;
    public static final int AVATAR_FIELD_NUMBER = 4;
    private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar avatar_;
    /**
     * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
     */
    public boolean hasAvatar() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar getAvatar() {
      return avatar_;
    }
    /**
     * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
     */
    public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.AvatarOrBuilder getAvatarOrBuilder() {
      return avatar_;
    }

    // optional bool active = 5 [default = true];
    public static final int ACTIVE_FIELD_NUMBER = 5;
    private boolean active_;
    /**
     * <code>optional bool active = 5 [default = true];</code>
     */
    public boolean hasActive() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool active = 5 [default = true];</code>
     */
    public boolean getActive() {
      return active_;
    }

    private void initFields() {
      id_ = com.google.protobuf.ByteString.EMPTY;
      name_ = "";
      members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.getDefaultInstance();
      active_ = true;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameBytes());
      }
      for (int i = 0; i < members_.size(); i++) {
        output.writeBytes(3, members_.getByteString(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(4, avatar_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(5, active_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < members_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(members_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getMembersList().size();
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, avatar_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, active_);
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

    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code signalservice.GroupDetails}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetailsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupDetails_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.class, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.newBuilder()
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
          getAvatarFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (avatarBuilder_ == null) {
          avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.getDefaultInstance();
        } else {
          avatarBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        active_ = true;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.internal_static_signalservice_GroupDetails_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails build() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails buildPartial() {
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails result = new com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          members_ = new com.google.protobuf.UnmodifiableLazyStringList(
            members_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.members_ = members_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        if (avatarBuilder_ == null) {
          result.avatar_ = avatar_;
        } else {
          result.avatar_ = avatarBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.active_ = active_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails other) {
        if (other == com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (!other.members_.isEmpty()) {
          if (members_.isEmpty()) {
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureMembersIsMutable();
            members_.addAll(other.members_);
          }
          onChanged();
        }
        if (other.hasAvatar()) {
          mergeAvatar(other.getAvatar());
        }
        if (other.hasActive()) {
          setActive(other.getActive());
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
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional bytes id = 1;
      private com.google.protobuf.ByteString id_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bytes id = 1;</code>
       */
      public com.google.protobuf.ByteString getId() {
        return id_;
      }
      /**
       * <code>optional bytes id = 1;</code>
       */
      public Builder setId(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }

      // optional string name = 2;
      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public com.google.protobuf.ByteString
      getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setName(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      // repeated string members = 3;
      private com.google.protobuf.LazyStringList members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureMembersIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          members_ = new com.google.protobuf.LazyStringArrayList(members_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       * <code>repeated string members = 3;</code>
       */
      public java.util.List<java.lang.String>
      getMembersList() {
        return java.util.Collections.unmodifiableList(members_);
      }
      /**
       * <code>repeated string members = 3;</code>
       */
      public int getMembersCount() {
        return members_.size();
      }
      /**
       * <code>repeated string members = 3;</code>
       */
      public java.lang.String getMembers(int index) {
        return members_.get(index);
      }
      /**
       * <code>repeated string members = 3;</code>
       */
      public com.google.protobuf.ByteString
      getMembersBytes(int index) {
        return members_.getByteString(index);
      }
      /**
       * <code>repeated string members = 3;</code>
       */
      public Builder setMembers(
        int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string members = 3;</code>
       */
      public Builder addMembers(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string members = 3;</code>
       */
      public Builder addAllMembers(
        java.lang.Iterable<java.lang.String> values) {
        ensureMembersIsMutable();
        super.addAll(values, members_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string members = 3;</code>
       */
      public Builder clearMembers() {
        members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string members = 3;</code>
       */
      public Builder addMembersBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(value);
        onChanged();
        return this;
      }

      // optional .signalservice.GroupDetails.Avatar avatar = 4;
      private com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.AvatarOrBuilder> avatarBuilder_;
      /**
       * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
       */
      public boolean hasAvatar() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar getAvatar() {
        if (avatarBuilder_ == null) {
          return avatar_;
        } else {
          return avatarBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
       */
      public Builder setAvatar(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar value) {
        if (avatarBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          avatar_ = value;
          onChanged();
        } else {
          avatarBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
       */
      public Builder setAvatar(
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.Builder builderForValue) {
        if (avatarBuilder_ == null) {
          avatar_ = builderForValue.build();
          onChanged();
        } else {
          avatarBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
       */
      public Builder mergeAvatar(com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar value) {
        if (avatarBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
            avatar_ != com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.getDefaultInstance()) {
            avatar_ =
              com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.newBuilder(avatar_).mergeFrom(value).buildPartial();
          } else {
            avatar_ = value;
          }
          onChanged();
        } else {
          avatarBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
       */
      public Builder clearAvatar() {
        if (avatarBuilder_ == null) {
          avatar_ = com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.getDefaultInstance();
          onChanged();
        } else {
          avatarBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.Builder getAvatarBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getAvatarFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
       */
      public com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.AvatarOrBuilder getAvatarOrBuilder() {
        if (avatarBuilder_ != null) {
          return avatarBuilder_.getMessageOrBuilder();
        } else {
          return avatar_;
        }
      }
      /**
       * <code>optional .signalservice.GroupDetails.Avatar avatar = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.AvatarOrBuilder>
      getAvatarFieldBuilder() {
        if (avatarBuilder_ == null) {
          avatarBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.Avatar.Builder, com.fisil.libclearkeep.service.internal.push.SignalServiceProtos.GroupDetails.AvatarOrBuilder>(
            avatar_,
            getParentForChildren(),
            isClean());
          avatar_ = null;
        }
        return avatarBuilder_;
      }

      // optional bool active = 5 [default = true];
      private boolean active_ = true;
      /**
       * <code>optional bool active = 5 [default = true];</code>
       */
      public boolean hasActive() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bool active = 5 [default = true];</code>
       */
      public boolean getActive() {
        return active_;
      }
      /**
       * <code>optional bool active = 5 [default = true];</code>
       */
      public Builder setActive(boolean value) {
        bitField0_ |= 0x00000010;
        active_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool active = 5 [default = true];</code>
       */
      public Builder clearActive() {
        bitField0_ = (bitField0_ & ~0x00000010);
        active_ = true;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.GroupDetails)
    }

    static {
      defaultInstance = new GroupDetails(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.GroupDetails)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_Envelope_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_Envelope_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_Content_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_Content_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_DataMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_DataMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_SyncMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_SyncMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_SyncMessage_Sent_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_SyncMessage_Sent_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_SyncMessage_Contacts_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_SyncMessage_Contacts_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_SyncMessage_Groups_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_SyncMessage_Groups_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_SyncMessage_Blocked_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_SyncMessage_Blocked_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_SyncMessage_Request_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_SyncMessage_Request_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_SyncMessage_Read_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_SyncMessage_Read_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_AttachmentPointer_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_AttachmentPointer_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_GroupContext_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_GroupContext_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_ContactDetails_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_ContactDetails_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_ContactDetails_Avatar_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_ContactDetails_Avatar_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_GroupDetails_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_GroupDetails_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_GroupDetails_Avatar_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_GroupDetails_Avatar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
    descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SignalService.proto\022\rsignalservice\"\375\001\n" +
        "\010Envelope\022*\n\004type\030\001 \001(\0162\034.signalservice." +
        "Envelope.Type\022\016\n\006source\030\002 \001(\t\022\024\n\014sourceD" +
        "evice\030\007 \001(\r\022\r\n\005relay\030\003 \001(\t\022\021\n\ttimestamp\030" +
        "\005 \001(\004\022\025\n\rlegacyMessage\030\006 \001(\014\022\017\n\007content\030" +
        "\010 \001(\014\"U\n\004Type\022\013\n\007UNKNOWN\020\000\022\016\n\nCIPHERTEXT" +
        "\020\001\022\020\n\014KEY_EXCHANGE\020\002\022\021\n\rPREKEY_BUNDLE\020\003\022" +
        "\013\n\007RECEIPT\020\005\"k\n\007Content\022/\n\013dataMessage\030\001" +
        " \001(\0132\032.signalservice.DataMessage\022/\n\013sync" +
        "Message\030\002 \001(\0132\032.signalservice.SyncMessag",
      "e\"\331\001\n\013DataMessage\022\014\n\004body\030\001 \001(\t\0225\n\013attac" +
        "hments\030\002 \003(\0132 .signalservice.AttachmentP" +
        "ointer\022*\n\005group\030\003 \001(\0132\033.signalservice.Gr" +
        "oupContext\022\r\n\005flags\030\004 \001(\r\022\023\n\013expireTimer" +
        "\030\005 \001(\r\"5\n\005Flags\022\017\n\013END_SESSION\020\001\022\033\n\027EXPI" +
        "RATION_TIMER_UPDATE\020\002\"\371\005\n\013SyncMessage\022-\n" +
        "\004sent\030\001 \001(\0132\037.signalservice.SyncMessage." +
        "Sent\0225\n\010contacts\030\002 \001(\0132#.signalservice.S" +
        "yncMessage.Contacts\0221\n\006groups\030\003 \001(\0132!.si" +
        "gnalservice.SyncMessage.Groups\0223\n\007reques",
      "t\030\004 \001(\0132\".signalservice.SyncMessage.Requ" +
        "est\022-\n\004read\030\005 \003(\0132\037.signalservice.SyncMe" +
        "ssage.Read\0223\n\007blocked\030\006 \001(\0132\".signalserv" +
        "ice.SyncMessage.Blocked\032}\n\004Sent\022\023\n\013desti" +
        "nation\030\001 \001(\t\022\021\n\ttimestamp\030\002 \001(\004\022+\n\007messa" +
        "ge\030\003 \001(\0132\032.signalservice.DataMessage\022 \n\030" +
        "expirationStartTimestamp\030\004 \001(\004\032:\n\010Contac" +
        "ts\022.\n\004blob\030\001 \001(\0132 .signalservice.Attachm" +
        "entPointer\0328\n\006Groups\022.\n\004blob\030\001 \001(\0132 .sig" +
        "nalservice.AttachmentPointer\032\032\n\007Blocked\022",
      "\017\n\007numbers\030\001 \003(\t\032|\n\007Request\0225\n\004type\030\001 \001(" +
        "\0162\'.signalservice.SyncMessage.Request.Ty" +
        "pe\":\n\004Type\022\013\n\007UNKNOWN\020\000\022\014\n\010CONTACTS\020\001\022\n\n" +
        "\006GROUPS\020\002\022\013\n\007BLOCKED\020\003\032)\n\004Read\022\016\n\006sender" +
        "\030\001 \001(\t\022\021\n\ttimestamp\030\002 \001(\004\"b\n\021AttachmentP" +
        "ointer\022\n\n\002id\030\001 \001(\006\022\023\n\013contentType\030\002 \001(\t\022" +
        "\013\n\003key\030\003 \001(\014\022\014\n\004size\030\004 \001(\r\022\021\n\tthumbnail\030" +
        "\005 \001(\014\"\345\001\n\014GroupContext\022\n\n\002id\030\001 \001(\014\022.\n\004ty" +
        "pe\030\002 \001(\0162 .signalservice.GroupContext.Ty" +
        "pe\022\014\n\004name\030\003 \001(\t\022\017\n\007members\030\004 \003(\t\0220\n\006ava",
      "tar\030\005 \001(\0132 .signalservice.AttachmentPoin" +
        "ter\"H\n\004Type\022\013\n\007UNKNOWN\020\000\022\n\n\006UPDATE\020\001\022\013\n\007" +
        "DELIVER\020\002\022\010\n\004QUIT\020\003\022\020\n\014REQUEST_INFO\020\004\"\242\001" +
        "\n\016ContactDetails\022\016\n\006number\030\001 \001(\t\022\014\n\004name" +
        "\030\002 \001(\t\0224\n\006avatar\030\003 \001(\0132$.signalservice.C" +
        "ontactDetails.Avatar\022\r\n\005color\030\004 \001(\t\032-\n\006A" +
        "vatar\022\023\n\013contentType\030\001 \001(\t\022\016\n\006length\030\002 \001" +
        "(\r\"\262\001\n\014GroupDetails\022\n\n\002id\030\001 \001(\014\022\014\n\004name\030" +
        "\002 \001(\t\022\017\n\007members\030\003 \003(\t\0222\n\006avatar\030\004 \001(\0132\"" +
        ".signalservice.GroupDetails.Avatar\022\024\n\006ac",
      "tive\030\005 \001(\010:\004true\032-\n\006Avatar\022\023\n\013contentTyp" +
        "e\030\001 \001(\t\022\016\n\006length\030\002 \001(\rBE\n.com.fisil.libclear" +
        "keep.service.internal.pushB\023Signa" +
        "lServiceProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
          com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_signalservice_Envelope_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_signalservice_Envelope_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_Envelope_descriptor,
            new java.lang.String[] { "Type", "Source", "SourceDevice", "Relay", "Timestamp", "LegacyMessage", "Content", });
          internal_static_signalservice_Content_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_signalservice_Content_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_Content_descriptor,
            new java.lang.String[] { "DataMessage", "SyncMessage", });
          internal_static_signalservice_DataMessage_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_signalservice_DataMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_DataMessage_descriptor,
            new java.lang.String[] { "Body", "Attachments", "Group", "Flags", "ExpireTimer", });
          internal_static_signalservice_SyncMessage_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_signalservice_SyncMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_SyncMessage_descriptor,
            new java.lang.String[] { "Sent", "Contacts", "Groups", "Request", "Read", "Blocked", });
          internal_static_signalservice_SyncMessage_Sent_descriptor =
            internal_static_signalservice_SyncMessage_descriptor.getNestedTypes().get(0);
          internal_static_signalservice_SyncMessage_Sent_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_SyncMessage_Sent_descriptor,
            new java.lang.String[] { "Destination", "Timestamp", "Message", "ExpirationStartTimestamp", });
          internal_static_signalservice_SyncMessage_Contacts_descriptor =
            internal_static_signalservice_SyncMessage_descriptor.getNestedTypes().get(1);
          internal_static_signalservice_SyncMessage_Contacts_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_SyncMessage_Contacts_descriptor,
            new java.lang.String[] { "Blob", });
          internal_static_signalservice_SyncMessage_Groups_descriptor =
            internal_static_signalservice_SyncMessage_descriptor.getNestedTypes().get(2);
          internal_static_signalservice_SyncMessage_Groups_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_SyncMessage_Groups_descriptor,
            new java.lang.String[] { "Blob", });
          internal_static_signalservice_SyncMessage_Blocked_descriptor =
            internal_static_signalservice_SyncMessage_descriptor.getNestedTypes().get(3);
          internal_static_signalservice_SyncMessage_Blocked_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_SyncMessage_Blocked_descriptor,
            new java.lang.String[] { "Numbers", });
          internal_static_signalservice_SyncMessage_Request_descriptor =
            internal_static_signalservice_SyncMessage_descriptor.getNestedTypes().get(4);
          internal_static_signalservice_SyncMessage_Request_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_SyncMessage_Request_descriptor,
            new java.lang.String[] { "Type", });
          internal_static_signalservice_SyncMessage_Read_descriptor =
            internal_static_signalservice_SyncMessage_descriptor.getNestedTypes().get(5);
          internal_static_signalservice_SyncMessage_Read_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_SyncMessage_Read_descriptor,
            new java.lang.String[] { "Sender", "Timestamp", });
          internal_static_signalservice_AttachmentPointer_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_signalservice_AttachmentPointer_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_AttachmentPointer_descriptor,
            new java.lang.String[] { "Id", "ContentType", "Key", "Size", "Thumbnail", });
          internal_static_signalservice_GroupContext_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_signalservice_GroupContext_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_GroupContext_descriptor,
            new java.lang.String[] { "Id", "Type", "Name", "Members", "Avatar", });
          internal_static_signalservice_ContactDetails_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_signalservice_ContactDetails_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_ContactDetails_descriptor,
            new java.lang.String[] { "Number", "Name", "Avatar", "Color", });
          internal_static_signalservice_ContactDetails_Avatar_descriptor =
            internal_static_signalservice_ContactDetails_descriptor.getNestedTypes().get(0);
          internal_static_signalservice_ContactDetails_Avatar_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_ContactDetails_Avatar_descriptor,
            new java.lang.String[] { "ContentType", "Length", });
          internal_static_signalservice_GroupDetails_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_signalservice_GroupDetails_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_GroupDetails_descriptor,
            new java.lang.String[] { "Id", "Name", "Members", "Avatar", "Active", });
          internal_static_signalservice_GroupDetails_Avatar_descriptor =
            internal_static_signalservice_GroupDetails_descriptor.getNestedTypes().get(0);
          internal_static_signalservice_GroupDetails_Avatar_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_GroupDetails_Avatar_descriptor,
            new java.lang.String[] { "ContentType", "Length", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}

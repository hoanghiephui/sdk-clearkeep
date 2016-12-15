package com.fisil.libclearkeep.protocol.fingerprint;

public final class FingerprintProtos {
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_LogicalFingerprint_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_LogicalFingerprint_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_CombinedFingerprints_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_CombinedFingerprints_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.FileDescriptor
  descriptor;

  // TODO: 12/14/16 chú ý kiểm tra
  static {
    String[] descriptorData = {
    "\n\031FingerprintProtocol.proto\022\ntextsecure\"" +
    "%\n\022LogicalFingerprint\022\017\n\007content\030\001 \001(\014\"\234" +
    "\001\n\024CombinedFingerprints\022\017\n\007version\030\001 \001(\r" +
    "\0228\n\020localFingerprint\030\002 \001(\0132\036.textsecure." +
    "LogicalFingerprint\0229\n\021remoteFingerprint\030" +
    "\003 \001(\0132\036.textsecure.LogicalFingerprintB=\n" +
    "(com.fisil.libclearkeep.protocol.fingerprint" +
    "tB\021FingerprintProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
    new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
      public com.google.protobuf.ExtensionRegistry assignDescriptors(
      com.google.protobuf.Descriptors.FileDescriptor root) {
        descriptor = root;
        internal_static_textsecure_LogicalFingerprint_descriptor =
        getDescriptor().getMessageTypes().get(0);
        internal_static_textsecure_LogicalFingerprint_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_LogicalFingerprint_descriptor,
        new String[]{"Content",});
        internal_static_textsecure_CombinedFingerprints_descriptor =
        getDescriptor().getMessageTypes().get(1);
        internal_static_textsecure_CombinedFingerprints_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_CombinedFingerprints_descriptor,
        new String[]{"Version", "LocalFingerprint", "RemoteFingerprint",});
        return null;
      }
    };
    com.google.protobuf.Descriptors.FileDescriptor
    .internalBuildGeneratedFileFrom(descriptorData,
    new com.google.protobuf.Descriptors.FileDescriptor[]{
    }, assigner);
  }

  private FingerprintProtos() {
  }

  public static void registerAllExtensions(
  com.google.protobuf.ExtensionRegistry registry) {
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  public interface LogicalFingerprintOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // optional bytes content = 1;

    /**
     * <code>optional bytes content = 1;</code>
     * <p>
     * <pre>
     *  optional bytes identifier = 2;
     * </pre>
     */
    boolean hasContent();

    /**
     * <code>optional bytes content = 1;</code>
     * <p>
     * <pre>
     *  optional bytes identifier = 2;
     * </pre>
     */
    com.google.protobuf.ByteString getContent();
  }

  public interface CombinedFingerprintsOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 version = 1;

    /**
     * <code>optional uint32 version = 1;</code>
     */
    boolean hasVersion();

    /**
     * <code>optional uint32 version = 1;</code>
     */
    int getVersion();

    // optional .textsecure.LogicalFingerprint localFingerprint = 2;

    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    boolean hasLocalFingerprint();

    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint getLocalFingerprint();

    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder getLocalFingerprintOrBuilder();

    // optional .textsecure.LogicalFingerprint remoteFingerprint = 3;

    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    boolean hasRemoteFingerprint();

    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint getRemoteFingerprint();

    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder getRemoteFingerprintOrBuilder();
  }

  /**
   * Protobuf type {@code textsecure.LogicalFingerprint}
   */
  public static final class LogicalFingerprint extends
  com.google.protobuf.GeneratedMessage
  implements LogicalFingerprintOrBuilder {
    // optional bytes content = 1;
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final LogicalFingerprint defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<LogicalFingerprint> PARSER =
    new com.google.protobuf.AbstractParser<LogicalFingerprint>() {
      public LogicalFingerprint parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new LogicalFingerprint(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new LogicalFingerprint(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private com.google.protobuf.ByteString content_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;

    // Use LogicalFingerprint.newBuilder() to construct.
    private LogicalFingerprint(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private LogicalFingerprint(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private LogicalFingerprint(
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

    public static LogicalFingerprint getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.internal_static_textsecure_LogicalFingerprint_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public LogicalFingerprint getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.internal_static_textsecure_LogicalFingerprint_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.class, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<LogicalFingerprint> getParserForType() {
      return PARSER;
    }

    /**
     * <code>optional bytes content = 1;</code>
     * <p>
     * <pre>
     *  optional bytes identifier = 2;
     * </pre>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional bytes content = 1;</code>
     * <p>
     * <pre>
     *  optional bytes identifier = 2;
     * </pre>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }

    private void initFields() {
      content_ = com.google.protobuf.ByteString.EMPTY;
    }

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
        output.writeBytes(1, content_);
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, content_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    @Override
    protected Object writeReplace()
    throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public Builder toBuilder() {
      return newBuilder(this);
    }

    @Override
    protected Builder newBuilderForType(
    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code textsecure.LogicalFingerprint}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder {
      private int bitField0_;
      // optional bytes content = 1;
      private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;

      // Construct using com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.internal_static_textsecure_LogicalFingerprint_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.internal_static_textsecure_LogicalFingerprint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.class, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        content_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.internal_static_textsecure_LogicalFingerprint_descriptor;
      }

      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint build() {
        com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint buildPartial() {
        com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint result = new com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.content_ = content_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint) {
          return mergeFrom((com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint other) {
        if (other == com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance())
          return this;
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
        com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>optional bytes content = 1;</code>
       * <p>
       * <pre>
       *  optional bytes identifier = 2;
       * </pre>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional bytes content = 1;</code>
       * <p>
       * <pre>
       *  optional bytes identifier = 2;
       * </pre>
       */
      public com.google.protobuf.ByteString getContent() {
        return content_;
      }

      /**
       * <code>optional bytes content = 1;</code>
       * <p>
       * <pre>
       *  optional bytes identifier = 2;
       * </pre>
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        content_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes content = 1;</code>
       * <p>
       * <pre>
       *  optional bytes identifier = 2;
       * </pre>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000001);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.LogicalFingerprint)
    }

    // @@protoc_insertion_point(class_scope:textsecure.LogicalFingerprint)
  }

  /**
   * Protobuf type {@code textsecure.CombinedFingerprints}
   */
  public static final class CombinedFingerprints extends
  com.google.protobuf.GeneratedMessage
  implements CombinedFingerprintsOrBuilder {
    // optional uint32 version = 1;
    public static final int VERSION_FIELD_NUMBER = 1;
    // optional .textsecure.LogicalFingerprint localFingerprint = 2;
    public static final int LOCALFINGERPRINT_FIELD_NUMBER = 2;
    // optional .textsecure.LogicalFingerprint remoteFingerprint = 3;
    public static final int REMOTEFINGERPRINT_FIELD_NUMBER = 3;
    private static final CombinedFingerprints defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<CombinedFingerprints> PARSER =
    new com.google.protobuf.AbstractParser<CombinedFingerprints>() {
      public CombinedFingerprints parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new CombinedFingerprints(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new CombinedFingerprints(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private int version_;
    private com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint localFingerprint_;
    private com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint remoteFingerprint_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;
    // Use CombinedFingerprints.newBuilder() to construct.
    private CombinedFingerprints(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private CombinedFingerprints(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private CombinedFingerprints(
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
              bitField0_ |= 0x00000001;
              version_ = input.readUInt32();
              break;
            }
            case 18: {
              com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = localFingerprint_.toBuilder();
              }
              localFingerprint_ = input.readMessage(com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(localFingerprint_);
                localFingerprint_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = remoteFingerprint_.toBuilder();
              }
              remoteFingerprint_ = input.readMessage(com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(remoteFingerprint_);
                remoteFingerprint_ = subBuilder.buildPartial();
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

    public static CombinedFingerprints getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.internal_static_textsecure_CombinedFingerprints_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public CombinedFingerprints getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.internal_static_textsecure_CombinedFingerprints_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints.class, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<CombinedFingerprints> getParserForType() {
      return PARSER;
    }

    /**
     * <code>optional uint32 version = 1;</code>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional uint32 version = 1;</code>
     */
    public int getVersion() {
      return version_;
    }

    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    public boolean hasLocalFingerprint() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint getLocalFingerprint() {
      return localFingerprint_;
    }

    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder getLocalFingerprintOrBuilder() {
      return localFingerprint_;
    }

    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    public boolean hasRemoteFingerprint() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint getRemoteFingerprint() {
      return remoteFingerprint_;
    }

    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder getRemoteFingerprintOrBuilder() {
      return remoteFingerprint_;
    }

    private void initFields() {
      version_ = 0;
      localFingerprint_ = com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance();
      remoteFingerprint_ = com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance();
    }

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
        output.writeUInt32(1, version_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, localFingerprint_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, remoteFingerprint_);
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, version_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, localFingerprint_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, remoteFingerprint_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    @Override
    protected Object writeReplace()
    throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public Builder toBuilder() {
      return newBuilder(this);
    }

    @Override
    protected Builder newBuilderForType(
    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code textsecure.CombinedFingerprints}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprintsOrBuilder {
      private int bitField0_;
      // optional uint32 version = 1;
      private int version_;
      // optional .textsecure.LogicalFingerprint localFingerprint = 2;
      private com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint localFingerprint_ = com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder> localFingerprintBuilder_;
      // optional .textsecure.LogicalFingerprint remoteFingerprint = 3;
      private com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint remoteFingerprint_ = com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder> remoteFingerprintBuilder_;

      // Construct using com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.internal_static_textsecure_CombinedFingerprints_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.internal_static_textsecure_CombinedFingerprints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints.class, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getLocalFingerprintFieldBuilder();
          getRemoteFingerprintFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        version_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (localFingerprintBuilder_ == null) {
          localFingerprint_ = com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance();
        } else {
          localFingerprintBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (remoteFingerprintBuilder_ == null) {
          remoteFingerprint_ = com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance();
        } else {
          remoteFingerprintBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.internal_static_textsecure_CombinedFingerprints_descriptor;
      }

      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints build() {
        com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints buildPartial() {
        com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints result = new com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.version_ = version_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (localFingerprintBuilder_ == null) {
          result.localFingerprint_ = localFingerprint_;
        } else {
          result.localFingerprint_ = localFingerprintBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (remoteFingerprintBuilder_ == null) {
          result.remoteFingerprint_ = remoteFingerprint_;
        } else {
          result.remoteFingerprint_ = remoteFingerprintBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints) {
          return mergeFrom((com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints other) {
        if (other == com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints.getDefaultInstance())
          return this;
        if (other.hasVersion()) {
          setVersion(other.getVersion());
        }
        if (other.hasLocalFingerprint()) {
          mergeLocalFingerprint(other.getLocalFingerprint());
        }
        if (other.hasRemoteFingerprint()) {
          mergeRemoteFingerprint(other.getRemoteFingerprint());
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
        com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.CombinedFingerprints) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>optional uint32 version = 1;</code>
       */
      public boolean hasVersion() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 version = 1;</code>
       */
      public int getVersion() {
        return version_;
      }

      /**
       * <code>optional uint32 version = 1;</code>
       */
      public Builder setVersion(int value) {
        bitField0_ |= 0x00000001;
        version_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 version = 1;</code>
       */
      public Builder clearVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        version_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public boolean hasLocalFingerprint() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint getLocalFingerprint() {
        if (localFingerprintBuilder_ == null) {
          return localFingerprint_;
        } else {
          return localFingerprintBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public Builder setLocalFingerprint(
      com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder builderForValue) {
        if (localFingerprintBuilder_ == null) {
          localFingerprint_ = builderForValue.build();
          onChanged();
        } else {
          localFingerprintBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public Builder setLocalFingerprint(com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint value) {
        if (localFingerprintBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          localFingerprint_ = value;
          onChanged();
        } else {
          localFingerprintBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public Builder mergeLocalFingerprint(com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint value) {
        if (localFingerprintBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
          localFingerprint_ != com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance()) {
            localFingerprint_ =
            com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.newBuilder(localFingerprint_).mergeFrom(value).buildPartial();
          } else {
            localFingerprint_ = value;
          }
          onChanged();
        } else {
          localFingerprintBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public Builder clearLocalFingerprint() {
        if (localFingerprintBuilder_ == null) {
          localFingerprint_ = com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance();
          onChanged();
        } else {
          localFingerprintBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder getLocalFingerprintBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getLocalFingerprintFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder getLocalFingerprintOrBuilder() {
        if (localFingerprintBuilder_ != null) {
          return localFingerprintBuilder_.getMessageOrBuilder();
        } else {
          return localFingerprint_;
        }
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder>
      getLocalFingerprintFieldBuilder() {
        if (localFingerprintBuilder_ == null) {
          localFingerprintBuilder_ = new com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder>(
          localFingerprint_,
          getParentForChildren(),
          isClean());
          localFingerprint_ = null;
        }
        return localFingerprintBuilder_;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public boolean hasRemoteFingerprint() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint getRemoteFingerprint() {
        if (remoteFingerprintBuilder_ == null) {
          return remoteFingerprint_;
        } else {
          return remoteFingerprintBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public Builder setRemoteFingerprint(
      com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder builderForValue) {
        if (remoteFingerprintBuilder_ == null) {
          remoteFingerprint_ = builderForValue.build();
          onChanged();
        } else {
          remoteFingerprintBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public Builder setRemoteFingerprint(com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint value) {
        if (remoteFingerprintBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          remoteFingerprint_ = value;
          onChanged();
        } else {
          remoteFingerprintBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public Builder mergeRemoteFingerprint(com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint value) {
        if (remoteFingerprintBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
          remoteFingerprint_ != com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance()) {
            remoteFingerprint_ =
            com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.newBuilder(remoteFingerprint_).mergeFrom(value).buildPartial();
          } else {
            remoteFingerprint_ = value;
          }
          onChanged();
        } else {
          remoteFingerprintBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public Builder clearRemoteFingerprint() {
        if (remoteFingerprintBuilder_ == null) {
          remoteFingerprint_ = com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance();
          onChanged();
        } else {
          remoteFingerprintBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder getRemoteFingerprintBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getRemoteFingerprintFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder getRemoteFingerprintOrBuilder() {
        if (remoteFingerprintBuilder_ != null) {
          return remoteFingerprintBuilder_.getMessageOrBuilder();
        } else {
          return remoteFingerprint_;
        }
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder>
      getRemoteFingerprintFieldBuilder() {
        if (remoteFingerprintBuilder_ == null) {
          remoteFingerprintBuilder_ = new com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprint.Builder, com.fisil.libclearkeep.protocol.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder>(
          remoteFingerprint_,
          getParentForChildren(),
          isClean());
          remoteFingerprint_ = null;
        }
        return remoteFingerprintBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.CombinedFingerprints)
    }

    // @@protoc_insertion_point(class_scope:textsecure.CombinedFingerprints)
  }

  // @@protoc_insertion_point(outer_class_scope)
}

package com.fisil.libclearkeep.service.internal.push;

/**
 * Created by hoanghiep on 12/15/16.
 */

public class ProvisioningProtos {
  private ProvisioningProtos() {
  }

  public static void registerAllExtensions(
    com.google.protobuf.ExtensionRegistry registry) {
  }

  public interface ProvisionEnvelopeOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional bytes publicKey = 1;

    /**
     * <code>optional bytes publicKey = 1;</code>
     */
    boolean hasPublicKey();

    /**
     * <code>optional bytes publicKey = 1;</code>
     */
    com.google.protobuf.ByteString getPublicKey();

    // optional bytes body = 2;

    /**
     * <code>optional bytes body = 2;</code>
     * <p>
     * <pre>
     * Encrypted ProvisionMessage
     * </pre>
     */
    boolean hasBody();

    /**
     * <code>optional bytes body = 2;</code>
     * <p>
     * <pre>
     * Encrypted ProvisionMessage
     * </pre>
     */
    com.google.protobuf.ByteString getBody();
  }

  /**
   * Protobuf type {@code signalservice.ProvisionEnvelope}
   */
  public static final class ProvisionEnvelope extends
    com.google.protobuf.GeneratedMessage
    implements ProvisionEnvelopeOrBuilder {
    // Use ProvisionEnvelope.newBuilder() to construct.
    private ProvisionEnvelope(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private ProvisionEnvelope(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final ProvisionEnvelope defaultInstance;

    public static ProvisionEnvelope getDefaultInstance() {
      return defaultInstance;
    }

    public ProvisionEnvelope getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private ProvisionEnvelope(
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
              publicKey_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
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
      return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.internal_static_signalservice_ProvisionEnvelope_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.internal_static_signalservice_ProvisionEnvelope_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope.class, com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope.Builder.class);
    }

    public static com.google.protobuf.Parser<ProvisionEnvelope> PARSER =
      new com.google.protobuf.AbstractParser<ProvisionEnvelope>() {
        public ProvisionEnvelope parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProvisionEnvelope(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<ProvisionEnvelope> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional bytes publicKey = 1;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString publicKey_;

    /**
     * <code>optional bytes publicKey = 1;</code>
     */
    public boolean hasPublicKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional bytes publicKey = 1;</code>
     */
    public com.google.protobuf.ByteString getPublicKey() {
      return publicKey_;
    }

    // optional bytes body = 2;
    public static final int BODY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString body_;

    /**
     * <code>optional bytes body = 2;</code>
     * <p>
     * <pre>
     * Encrypted ProvisionMessage
     * </pre>
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional bytes body = 2;</code>
     * <p>
     * <pre>
     * Encrypted ProvisionMessage
     * </pre>
     */
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }

    private void initFields() {
      publicKey_ = com.google.protobuf.ByteString.EMPTY;
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
        output.writeBytes(1, publicKey_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, body_);
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
          .computeBytesSize(1, publicKey_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, body_);
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

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope parseFrom(
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

    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope prototype) {
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
     * Protobuf type {@code signalservice.ProvisionEnvelope}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelopeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.internal_static_signalservice_ProvisionEnvelope_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.internal_static_signalservice_ProvisionEnvelope_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope.class, com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope.newBuilder()
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
        publicKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~ 0x00000001);
        body_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~ 0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.internal_static_signalservice_ProvisionEnvelope_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope build() {
        com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope result = buildPartial();
        if (! result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope buildPartial() {
        com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope result = new com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.publicKey_ = publicKey_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.body_ = body_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope other) {
        if (other == com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope.getDefaultInstance())
          return this;
        if (other.hasPublicKey()) {
          setPublicKey(other.getPublicKey());
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
        com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionEnvelope) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      // optional bytes publicKey = 1;
      private com.google.protobuf.ByteString publicKey_ = com.google.protobuf.ByteString.EMPTY;

      /**
       * <code>optional bytes publicKey = 1;</code>
       */
      public boolean hasPublicKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional bytes publicKey = 1;</code>
       */
      public com.google.protobuf.ByteString getPublicKey() {
        return publicKey_;
      }

      /**
       * <code>optional bytes publicKey = 1;</code>
       */
      public Builder setPublicKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        publicKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes publicKey = 1;</code>
       */
      public Builder clearPublicKey() {
        bitField0_ = (bitField0_ & ~ 0x00000001);
        publicKey_ = getDefaultInstance().getPublicKey();
        onChanged();
        return this;
      }

      // optional bytes body = 2;
      private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;

      /**
       * <code>optional bytes body = 2;</code>
       * <p>
       * <pre>
       * Encrypted ProvisionMessage
       * </pre>
       */
      public boolean hasBody() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes body = 2;</code>
       * <p>
       * <pre>
       * Encrypted ProvisionMessage
       * </pre>
       */
      public com.google.protobuf.ByteString getBody() {
        return body_;
      }

      /**
       * <code>optional bytes body = 2;</code>
       * <p>
       * <pre>
       * Encrypted ProvisionMessage
       * </pre>
       */
      public Builder setBody(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        body_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes body = 2;</code>
       * <p>
       * <pre>
       * Encrypted ProvisionMessage
       * </pre>
       */
      public Builder clearBody() {
        bitField0_ = (bitField0_ & ~ 0x00000002);
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.ProvisionEnvelope)
    }

    static {
      defaultInstance = new ProvisionEnvelope(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.ProvisionEnvelope)
  }

  public interface ProvisionMessageOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

    // optional bytes identityKeyPublic = 1;

    /**
     * <code>optional bytes identityKeyPublic = 1;</code>
     */
    boolean hasIdentityKeyPublic();

    /**
     * <code>optional bytes identityKeyPublic = 1;</code>
     */
    com.google.protobuf.ByteString getIdentityKeyPublic();

    // optional bytes identityKeyPrivate = 2;

    /**
     * <code>optional bytes identityKeyPrivate = 2;</code>
     */
    boolean hasIdentityKeyPrivate();

    /**
     * <code>optional bytes identityKeyPrivate = 2;</code>
     */
    com.google.protobuf.ByteString getIdentityKeyPrivate();

    // optional string number = 3;

    /**
     * <code>optional string number = 3;</code>
     */
    boolean hasNumber();

    /**
     * <code>optional string number = 3;</code>
     */
    java.lang.String getNumber();

    /**
     * <code>optional string number = 3;</code>
     */
    com.google.protobuf.ByteString
    getNumberBytes();

    // optional string provisioningCode = 4;

    /**
     * <code>optional string provisioningCode = 4;</code>
     */
    boolean hasProvisioningCode();

    /**
     * <code>optional string provisioningCode = 4;</code>
     */
    java.lang.String getProvisioningCode();

    /**
     * <code>optional string provisioningCode = 4;</code>
     */
    com.google.protobuf.ByteString
    getProvisioningCodeBytes();
  }

  /**
   * Protobuf type {@code signalservice.ProvisionMessage}
   */
  public static final class ProvisionMessage extends
    com.google.protobuf.GeneratedMessage
    implements ProvisionMessageOrBuilder {
    // Use ProvisionMessage.newBuilder() to construct.
    private ProvisionMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private ProvisionMessage(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final ProvisionMessage defaultInstance;

    public static ProvisionMessage getDefaultInstance() {
      return defaultInstance;
    }

    public ProvisionMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private ProvisionMessage(
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
              identityKeyPublic_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              identityKeyPrivate_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              number_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              provisioningCode_ = input.readBytes();
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
      return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.internal_static_signalservice_ProvisionMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.internal_static_signalservice_ProvisionMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage.class, com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<ProvisionMessage> PARSER =
      new com.google.protobuf.AbstractParser<ProvisionMessage>() {
        public ProvisionMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProvisionMessage(input, extensionRegistry);
        }
      };

    @java.lang.Override
    public com.google.protobuf.Parser<ProvisionMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional bytes identityKeyPublic = 1;
    public static final int IDENTITYKEYPUBLIC_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString identityKeyPublic_;

    /**
     * <code>optional bytes identityKeyPublic = 1;</code>
     */
    public boolean hasIdentityKeyPublic() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional bytes identityKeyPublic = 1;</code>
     */
    public com.google.protobuf.ByteString getIdentityKeyPublic() {
      return identityKeyPublic_;
    }

    // optional bytes identityKeyPrivate = 2;
    public static final int IDENTITYKEYPRIVATE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString identityKeyPrivate_;

    /**
     * <code>optional bytes identityKeyPrivate = 2;</code>
     */
    public boolean hasIdentityKeyPrivate() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional bytes identityKeyPrivate = 2;</code>
     */
    public com.google.protobuf.ByteString getIdentityKeyPrivate() {
      return identityKeyPrivate_;
    }

    // optional string number = 3;
    public static final int NUMBER_FIELD_NUMBER = 3;
    private java.lang.Object number_;

    /**
     * <code>optional string number = 3;</code>
     */
    public boolean hasNumber() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional string number = 3;</code>
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
     * <code>optional string number = 3;</code>
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

    // optional string provisioningCode = 4;
    public static final int PROVISIONINGCODE_FIELD_NUMBER = 4;
    private java.lang.Object provisioningCode_;

    /**
     * <code>optional string provisioningCode = 4;</code>
     */
    public boolean hasProvisioningCode() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional string provisioningCode = 4;</code>
     */
    public java.lang.String getProvisioningCode() {
      java.lang.Object ref = provisioningCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          provisioningCode_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string provisioningCode = 4;</code>
     */
    public com.google.protobuf.ByteString
    getProvisioningCodeBytes() {
      java.lang.Object ref = provisioningCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        provisioningCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      identityKeyPublic_ = com.google.protobuf.ByteString.EMPTY;
      identityKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
      number_ = "";
      provisioningCode_ = "";
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
        output.writeBytes(1, identityKeyPublic_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, identityKeyPrivate_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getNumberBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getProvisioningCodeBytes());
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
          .computeBytesSize(1, identityKeyPublic_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, identityKeyPrivate_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getNumberBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getProvisioningCodeBytes());
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

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage parseFrom(
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

    public static Builder newBuilder(com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage prototype) {
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
     * Protobuf type {@code signalservice.ProvisionMessage}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.internal_static_signalservice_ProvisionMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.internal_static_signalservice_ProvisionMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage.class, com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage.Builder.class);
      }

      // Construct using com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage.newBuilder()
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
        identityKeyPublic_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~ 0x00000001);
        identityKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~ 0x00000002);
        number_ = "";
        bitField0_ = (bitField0_ & ~ 0x00000004);
        provisioningCode_ = "";
        bitField0_ = (bitField0_ & ~ 0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.internal_static_signalservice_ProvisionMessage_descriptor;
      }

      public com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage build() {
        com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage result = buildPartial();
        if (! result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage buildPartial() {
        com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage result = new com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.identityKeyPublic_ = identityKeyPublic_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.identityKeyPrivate_ = identityKeyPrivate_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.number_ = number_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.provisioningCode_ = provisioningCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage) {
          return mergeFrom((com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage other) {
        if (other == com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage.getDefaultInstance())
          return this;
        if (other.hasIdentityKeyPublic()) {
          setIdentityKeyPublic(other.getIdentityKeyPublic());
        }
        if (other.hasIdentityKeyPrivate()) {
          setIdentityKeyPrivate(other.getIdentityKeyPrivate());
        }
        if (other.hasNumber()) {
          bitField0_ |= 0x00000004;
          number_ = other.number_;
          onChanged();
        }
        if (other.hasProvisioningCode()) {
          bitField0_ |= 0x00000008;
          provisioningCode_ = other.provisioningCode_;
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
        com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.service.internal.push.ProvisioningProtos.ProvisionMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      // optional bytes identityKeyPublic = 1;
      private com.google.protobuf.ByteString identityKeyPublic_ = com.google.protobuf.ByteString.EMPTY;

      /**
       * <code>optional bytes identityKeyPublic = 1;</code>
       */
      public boolean hasIdentityKeyPublic() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional bytes identityKeyPublic = 1;</code>
       */
      public com.google.protobuf.ByteString getIdentityKeyPublic() {
        return identityKeyPublic_;
      }

      /**
       * <code>optional bytes identityKeyPublic = 1;</code>
       */
      public Builder setIdentityKeyPublic(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        identityKeyPublic_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes identityKeyPublic = 1;</code>
       */
      public Builder clearIdentityKeyPublic() {
        bitField0_ = (bitField0_ & ~ 0x00000001);
        identityKeyPublic_ = getDefaultInstance().getIdentityKeyPublic();
        onChanged();
        return this;
      }

      // optional bytes identityKeyPrivate = 2;
      private com.google.protobuf.ByteString identityKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;

      /**
       * <code>optional bytes identityKeyPrivate = 2;</code>
       */
      public boolean hasIdentityKeyPrivate() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes identityKeyPrivate = 2;</code>
       */
      public com.google.protobuf.ByteString getIdentityKeyPrivate() {
        return identityKeyPrivate_;
      }

      /**
       * <code>optional bytes identityKeyPrivate = 2;</code>
       */
      public Builder setIdentityKeyPrivate(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        identityKeyPrivate_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes identityKeyPrivate = 2;</code>
       */
      public Builder clearIdentityKeyPrivate() {
        bitField0_ = (bitField0_ & ~ 0x00000002);
        identityKeyPrivate_ = getDefaultInstance().getIdentityKeyPrivate();
        onChanged();
        return this;
      }

      // optional string number = 3;
      private java.lang.Object number_ = "";

      /**
       * <code>optional string number = 3;</code>
       */
      public boolean hasNumber() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional string number = 3;</code>
       */
      public java.lang.String getNumber() {
        java.lang.Object ref = number_;
        if (! (ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          number_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string number = 3;</code>
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
       * <code>optional string number = 3;</code>
       */
      public Builder setNumber(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        number_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string number = 3;</code>
       */
      public Builder clearNumber() {
        bitField0_ = (bitField0_ & ~ 0x00000004);
        number_ = getDefaultInstance().getNumber();
        onChanged();
        return this;
      }

      /**
       * <code>optional string number = 3;</code>
       */
      public Builder setNumberBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        number_ = value;
        onChanged();
        return this;
      }

      // optional string provisioningCode = 4;
      private java.lang.Object provisioningCode_ = "";

      /**
       * <code>optional string provisioningCode = 4;</code>
       */
      public boolean hasProvisioningCode() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional string provisioningCode = 4;</code>
       */
      public java.lang.String getProvisioningCode() {
        java.lang.Object ref = provisioningCode_;
        if (! (ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
          provisioningCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string provisioningCode = 4;</code>
       */
      public com.google.protobuf.ByteString
      getProvisioningCodeBytes() {
        java.lang.Object ref = provisioningCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          provisioningCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string provisioningCode = 4;</code>
       */
      public Builder setProvisioningCode(
        java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        provisioningCode_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string provisioningCode = 4;</code>
       */
      public Builder clearProvisioningCode() {
        bitField0_ = (bitField0_ & ~ 0x00000008);
        provisioningCode_ = getDefaultInstance().getProvisioningCode();
        onChanged();
        return this;
      }

      /**
       * <code>optional string provisioningCode = 4;</code>
       */
      public Builder setProvisioningCodeBytes(
        com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        provisioningCode_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:signalservice.ProvisionMessage)
    }

    static {
      defaultInstance = new ProvisionMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:signalservice.ProvisionMessage)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_ProvisionEnvelope_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_ProvisionEnvelope_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_signalservice_ProvisionMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_signalservice_ProvisionMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor
    descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\022Provisioning.proto\022\rsignalservice\"4\n\021P" +
        "rovisionEnvelope\022\021\n\tpublicKey\030\001 \001(\014\022\014\n\004b" +
        "ody\030\002 \001(\014\"s\n\020ProvisionMessage\022\031\n\021identit" +
        "yKeyPublic\030\001 \001(\014\022\032\n\022identityKeyPrivate\030\002" +
        " \001(\014\022\016\n\006number\030\003 \001(\t\022\030\n\020provisioningCode" +
        "\030\004 \001(\tBD\n.com.fisil.libclearkeep.servi" +
        "ce.internal.pushB\022ProvisioningProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
          com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_signalservice_ProvisionEnvelope_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_signalservice_ProvisionEnvelope_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_ProvisionEnvelope_descriptor,
            new java.lang.String[]{"PublicKey", "Body",});
          internal_static_signalservice_ProvisionMessage_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_signalservice_ProvisionMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_signalservice_ProvisionMessage_descriptor,
            new java.lang.String[]{"IdentityKeyPublic", "IdentityKeyPrivate", "Number", "ProvisioningCode",});
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[]{
        }, assigner);
  }
}

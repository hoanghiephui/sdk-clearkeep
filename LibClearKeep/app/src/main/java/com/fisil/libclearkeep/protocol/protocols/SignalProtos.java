package com.fisil.libclearkeep.protocol.protocols;

public final class SignalProtos {
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SignalMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SignalMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_PreKeySignalMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_PreKeySignalMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_KeyExchangeMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_KeyExchangeMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SenderKeyMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SenderKeyMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SenderKeyDistributionMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SenderKeyDistributionMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_DeviceConsistencyCodeMessage_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_DeviceConsistencyCodeMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.FileDescriptor
  descriptor;

  static {
    String[] descriptorData = {
    "\n\031WhisperTextProtocol.proto\022\ntextsecure\"" +
    "a\n\rSignalMessage\022\022\n\nratchetKey\030\001 \001(\014\022\017\n\007" +
    "counter\030\002 \001(\r\022\027\n\017previousCounter\030\003 \001(\r\022\022" +
    "\n\nciphertext\030\004 \001(\014\"\216\001\n\023PreKeySignalMessa" +
    "ge\022\026\n\016registrationId\030\005 \001(\r\022\020\n\010preKeyId\030\001" +
    " \001(\r\022\026\n\016signedPreKeyId\030\006 \001(\r\022\017\n\007baseKey\030" +
    "\002 \001(\014\022\023\n\013identityKey\030\003 \001(\014\022\017\n\007message\030\004 " +
    "\001(\014\"t\n\022KeyExchangeMessage\022\n\n\002id\030\001 \001(\r\022\017\n" +
    "\007baseKey\030\002 \001(\014\022\022\n\nratchetKey\030\003 \001(\014\022\023\n\013id" +
    "entityKey\030\004 \001(\014\022\030\n\020baseKeySignature\030\005 \001(",
    "\014\"E\n\020SenderKeyMessage\022\n\n\002id\030\001 \001(\r\022\021\n\tite" +
    "ration\030\002 \001(\r\022\022\n\nciphertext\030\003 \001(\014\"c\n\034Send" +
    "erKeyDistributionMessage\022\n\n\002id\030\001 \001(\r\022\021\n\t" +
    "iteration\030\002 \001(\r\022\020\n\010chainKey\030\003 \001(\014\022\022\n\nsig" +
    "ningKey\030\004 \001(\014\"E\n\034DeviceConsistencyCodeMe" +
    "ssage\022\022\n\ngeneration\030\001 \001(\r\022\021\n\tsignature\030\002" +
    " \001(\014B5\n%com.fisil.libclearkeep.protocol.pro" +
    "tocolsB\014SignalProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
    new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
      public com.google.protobuf.ExtensionRegistry assignDescriptors(
      com.google.protobuf.Descriptors.FileDescriptor root) {
        descriptor = root;
        internal_static_textsecure_SignalMessage_descriptor =
        getDescriptor().getMessageTypes().get(0);
        internal_static_textsecure_SignalMessage_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SignalMessage_descriptor,
        new String[]{"RatchetKey", "Counter", "PreviousCounter", "Ciphertext",});
        internal_static_textsecure_PreKeySignalMessage_descriptor =
        getDescriptor().getMessageTypes().get(1);
        internal_static_textsecure_PreKeySignalMessage_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_PreKeySignalMessage_descriptor,
        new String[]{"RegistrationId", "PreKeyId", "SignedPreKeyId", "BaseKey", "IdentityKey", "Message",});
        internal_static_textsecure_KeyExchangeMessage_descriptor =
        getDescriptor().getMessageTypes().get(2);
        internal_static_textsecure_KeyExchangeMessage_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_KeyExchangeMessage_descriptor,
        new String[]{"Id", "BaseKey", "RatchetKey", "IdentityKey", "BaseKeySignature",});
        internal_static_textsecure_SenderKeyMessage_descriptor =
        getDescriptor().getMessageTypes().get(3);
        internal_static_textsecure_SenderKeyMessage_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SenderKeyMessage_descriptor,
        new String[]{"Id", "Iteration", "Ciphertext",});
        internal_static_textsecure_SenderKeyDistributionMessage_descriptor =
        getDescriptor().getMessageTypes().get(4);
        internal_static_textsecure_SenderKeyDistributionMessage_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SenderKeyDistributionMessage_descriptor,
        new String[]{"Id", "Iteration", "ChainKey", "SigningKey",});
        internal_static_textsecure_DeviceConsistencyCodeMessage_descriptor =
        getDescriptor().getMessageTypes().get(5);
        internal_static_textsecure_DeviceConsistencyCodeMessage_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_DeviceConsistencyCodeMessage_descriptor,
        new String[]{"Generation", "Signature",});
        return null;
      }
    };
    com.google.protobuf.Descriptors.FileDescriptor
    .internalBuildGeneratedFileFrom(descriptorData,
    new com.google.protobuf.Descriptors.FileDescriptor[]{
    }, assigner);
  }

  private SignalProtos() {
  }

  public static void registerAllExtensions(
  com.google.protobuf.ExtensionRegistry registry) {
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  public interface SignalMessageOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // optional bytes ratchetKey = 1;

    /**
     * <code>optional bytes ratchetKey = 1;</code>
     */
    boolean hasRatchetKey();

    /**
     * <code>optional bytes ratchetKey = 1;</code>
     */
    com.google.protobuf.ByteString getRatchetKey();

    // optional uint32 counter = 2;

    /**
     * <code>optional uint32 counter = 2;</code>
     */
    boolean hasCounter();

    /**
     * <code>optional uint32 counter = 2;</code>
     */
    int getCounter();

    // optional uint32 previousCounter = 3;

    /**
     * <code>optional uint32 previousCounter = 3;</code>
     */
    boolean hasPreviousCounter();

    /**
     * <code>optional uint32 previousCounter = 3;</code>
     */
    int getPreviousCounter();

    // optional bytes ciphertext = 4;

    /**
     * <code>optional bytes ciphertext = 4;</code>
     */
    boolean hasCiphertext();

    /**
     * <code>optional bytes ciphertext = 4;</code>
     */
    com.google.protobuf.ByteString getCiphertext();
  }
  public interface PreKeySignalMessageOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 registrationId = 5;

    /**
     * <code>optional uint32 registrationId = 5;</code>
     */
    boolean hasRegistrationId();

    /**
     * <code>optional uint32 registrationId = 5;</code>
     */
    int getRegistrationId();

    // optional uint32 preKeyId = 1;

    /**
     * <code>optional uint32 preKeyId = 1;</code>
     */
    boolean hasPreKeyId();

    /**
     * <code>optional uint32 preKeyId = 1;</code>
     */
    int getPreKeyId();

    // optional uint32 signedPreKeyId = 6;

    /**
     * <code>optional uint32 signedPreKeyId = 6;</code>
     */
    boolean hasSignedPreKeyId();

    /**
     * <code>optional uint32 signedPreKeyId = 6;</code>
     */
    int getSignedPreKeyId();

    // optional bytes baseKey = 2;

    /**
     * <code>optional bytes baseKey = 2;</code>
     */
    boolean hasBaseKey();

    /**
     * <code>optional bytes baseKey = 2;</code>
     */
    com.google.protobuf.ByteString getBaseKey();

    // optional bytes identityKey = 3;

    /**
     * <code>optional bytes identityKey = 3;</code>
     */
    boolean hasIdentityKey();

    /**
     * <code>optional bytes identityKey = 3;</code>
     */
    com.google.protobuf.ByteString getIdentityKey();

    // optional bytes message = 4;

    /**
     * <code>optional bytes message = 4;</code>
     * <p>
     * <pre>
     * SignalMessage
     * </pre>
     */
    boolean hasMessage();

    /**
     * <code>optional bytes message = 4;</code>
     * <p>
     * <pre>
     * SignalMessage
     * </pre>
     */
    com.google.protobuf.ByteString getMessage();
  }
  public interface KeyExchangeMessageOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 id = 1;

    /**
     * <code>optional uint32 id = 1;</code>
     */
    boolean hasId();

    /**
     * <code>optional uint32 id = 1;</code>
     */
    int getId();

    // optional bytes baseKey = 2;

    /**
     * <code>optional bytes baseKey = 2;</code>
     */
    boolean hasBaseKey();

    /**
     * <code>optional bytes baseKey = 2;</code>
     */
    com.google.protobuf.ByteString getBaseKey();

    // optional bytes ratchetKey = 3;

    /**
     * <code>optional bytes ratchetKey = 3;</code>
     */
    boolean hasRatchetKey();

    /**
     * <code>optional bytes ratchetKey = 3;</code>
     */
    com.google.protobuf.ByteString getRatchetKey();

    // optional bytes identityKey = 4;

    /**
     * <code>optional bytes identityKey = 4;</code>
     */
    boolean hasIdentityKey();

    /**
     * <code>optional bytes identityKey = 4;</code>
     */
    com.google.protobuf.ByteString getIdentityKey();

    // optional bytes baseKeySignature = 5;

    /**
     * <code>optional bytes baseKeySignature = 5;</code>
     */
    boolean hasBaseKeySignature();

    /**
     * <code>optional bytes baseKeySignature = 5;</code>
     */
    com.google.protobuf.ByteString getBaseKeySignature();
  }
  public interface SenderKeyMessageOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 id = 1;

    /**
     * <code>optional uint32 id = 1;</code>
     */
    boolean hasId();

    /**
     * <code>optional uint32 id = 1;</code>
     */
    int getId();

    // optional uint32 iteration = 2;

    /**
     * <code>optional uint32 iteration = 2;</code>
     */
    boolean hasIteration();

    /**
     * <code>optional uint32 iteration = 2;</code>
     */
    int getIteration();

    // optional bytes ciphertext = 3;

    /**
     * <code>optional bytes ciphertext = 3;</code>
     */
    boolean hasCiphertext();

    /**
     * <code>optional bytes ciphertext = 3;</code>
     */
    com.google.protobuf.ByteString getCiphertext();
  }
  public interface SenderKeyDistributionMessageOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 id = 1;

    /**
     * <code>optional uint32 id = 1;</code>
     */
    boolean hasId();

    /**
     * <code>optional uint32 id = 1;</code>
     */
    int getId();

    // optional uint32 iteration = 2;

    /**
     * <code>optional uint32 iteration = 2;</code>
     */
    boolean hasIteration();

    /**
     * <code>optional uint32 iteration = 2;</code>
     */
    int getIteration();

    // optional bytes chainKey = 3;

    /**
     * <code>optional bytes chainKey = 3;</code>
     */
    boolean hasChainKey();

    /**
     * <code>optional bytes chainKey = 3;</code>
     */
    com.google.protobuf.ByteString getChainKey();

    // optional bytes signingKey = 4;

    /**
     * <code>optional bytes signingKey = 4;</code>
     */
    boolean hasSigningKey();

    /**
     * <code>optional bytes signingKey = 4;</code>
     */
    com.google.protobuf.ByteString getSigningKey();
  }
  public interface DeviceConsistencyCodeMessageOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 generation = 1;

    /**
     * <code>optional uint32 generation = 1;</code>
     */
    boolean hasGeneration();

    /**
     * <code>optional uint32 generation = 1;</code>
     */
    int getGeneration();

    // optional bytes signature = 2;

    /**
     * <code>optional bytes signature = 2;</code>
     */
    boolean hasSignature();

    /**
     * <code>optional bytes signature = 2;</code>
     */
    com.google.protobuf.ByteString getSignature();
  }

  /**
   * Protobuf type {@code textsecure.SignalMessage}
   */
  public static final class SignalMessage extends
  com.google.protobuf.GeneratedMessage
  implements SignalMessageOrBuilder {
    // optional bytes ratchetKey = 1;
    public static final int RATCHETKEY_FIELD_NUMBER = 1;
    // optional uint32 counter = 2;
    public static final int COUNTER_FIELD_NUMBER = 2;
    // optional uint32 previousCounter = 3;
    public static final int PREVIOUSCOUNTER_FIELD_NUMBER = 3;
    // optional bytes ciphertext = 4;
    public static final int CIPHERTEXT_FIELD_NUMBER = 4;
    private static final SignalMessage defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<SignalMessage> PARSER =
    new com.google.protobuf.AbstractParser<SignalMessage>() {
      public SignalMessage parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new SignalMessage(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new SignalMessage(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private com.google.protobuf.ByteString ratchetKey_;
    private int counter_;
    private int previousCounter_;
    private com.google.protobuf.ByteString ciphertext_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;

    // Use SignalMessage.newBuilder() to construct.
    private SignalMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private SignalMessage(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SignalMessage(
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
              ratchetKey_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              counter_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              previousCounter_ = input.readUInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              ciphertext_ = input.readBytes();
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

    public static SignalMessage getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SignalMessage_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public SignalMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SignalMessage_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<SignalMessage> getParserForType() {
      return PARSER;
    }

    /**
     * <code>optional bytes ratchetKey = 1;</code>
     */
    public boolean hasRatchetKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional bytes ratchetKey = 1;</code>
     */
    public com.google.protobuf.ByteString getRatchetKey() {
      return ratchetKey_;
    }

    /**
     * <code>optional uint32 counter = 2;</code>
     */
    public boolean hasCounter() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional uint32 counter = 2;</code>
     */
    public int getCounter() {
      return counter_;
    }

    /**
     * <code>optional uint32 previousCounter = 3;</code>
     */
    public boolean hasPreviousCounter() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional uint32 previousCounter = 3;</code>
     */
    public int getPreviousCounter() {
      return previousCounter_;
    }

    /**
     * <code>optional bytes ciphertext = 4;</code>
     */
    public boolean hasCiphertext() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional bytes ciphertext = 4;</code>
     */
    public com.google.protobuf.ByteString getCiphertext() {
      return ciphertext_;
    }

    private void initFields() {
      ratchetKey_ = com.google.protobuf.ByteString.EMPTY;
      counter_ = 0;
      previousCounter_ = 0;
      ciphertext_ = com.google.protobuf.ByteString.EMPTY;
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
        output.writeBytes(1, ratchetKey_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, counter_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, previousCounter_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, ciphertext_);
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, ratchetKey_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, counter_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, previousCounter_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, ciphertext_);
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
     * Protobuf type {@code textsecure.SignalMessage}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessageOrBuilder {
      private int bitField0_;
      // optional bytes ratchetKey = 1;
      private com.google.protobuf.ByteString ratchetKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional uint32 counter = 2;
      private int counter_;
      // optional uint32 previousCounter = 3;
      private int previousCounter_;
      // optional bytes ciphertext = 4;
      private com.google.protobuf.ByteString ciphertext_ = com.google.protobuf.ByteString.EMPTY;

      // Construct using com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage.newBuilder()
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
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SignalMessage_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SignalMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        ratchetKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        counter_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        previousCounter_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        ciphertext_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SignalMessage_descriptor;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage build() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage buildPartial() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage result = new com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ratchetKey_ = ratchetKey_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.counter_ = counter_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.previousCounter_ = previousCounter_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.ciphertext_ = ciphertext_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage) {
          return mergeFrom((com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage other) {
        if (other == com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage.getDefaultInstance())
          return this;
        if (other.hasRatchetKey()) {
          setRatchetKey(other.getRatchetKey());
        }
        if (other.hasCounter()) {
          setCounter(other.getCounter());
        }
        if (other.hasPreviousCounter()) {
          setPreviousCounter(other.getPreviousCounter());
        }
        if (other.hasCiphertext()) {
          setCiphertext(other.getCiphertext());
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
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.protocols.SignalProtos.SignalMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>optional bytes ratchetKey = 1;</code>
       */
      public boolean hasRatchetKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional bytes ratchetKey = 1;</code>
       */
      public com.google.protobuf.ByteString getRatchetKey() {
        return ratchetKey_;
      }

      /**
       * <code>optional bytes ratchetKey = 1;</code>
       */
      public Builder setRatchetKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        ratchetKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes ratchetKey = 1;</code>
       */
      public Builder clearRatchetKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ratchetKey_ = getDefaultInstance().getRatchetKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 counter = 2;</code>
       */
      public boolean hasCounter() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional uint32 counter = 2;</code>
       */
      public int getCounter() {
        return counter_;
      }

      /**
       * <code>optional uint32 counter = 2;</code>
       */
      public Builder setCounter(int value) {
        bitField0_ |= 0x00000002;
        counter_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 counter = 2;</code>
       */
      public Builder clearCounter() {
        bitField0_ = (bitField0_ & ~0x00000002);
        counter_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 previousCounter = 3;</code>
       */
      public boolean hasPreviousCounter() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional uint32 previousCounter = 3;</code>
       */
      public int getPreviousCounter() {
        return previousCounter_;
      }

      /**
       * <code>optional uint32 previousCounter = 3;</code>
       */
      public Builder setPreviousCounter(int value) {
        bitField0_ |= 0x00000004;
        previousCounter_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 previousCounter = 3;</code>
       */
      public Builder clearPreviousCounter() {
        bitField0_ = (bitField0_ & ~0x00000004);
        previousCounter_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes ciphertext = 4;</code>
       */
      public boolean hasCiphertext() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional bytes ciphertext = 4;</code>
       */
      public com.google.protobuf.ByteString getCiphertext() {
        return ciphertext_;
      }

      /**
       * <code>optional bytes ciphertext = 4;</code>
       */
      public Builder setCiphertext(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        ciphertext_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes ciphertext = 4;</code>
       */
      public Builder clearCiphertext() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ciphertext_ = getDefaultInstance().getCiphertext();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.SignalMessage)
    }

    // @@protoc_insertion_point(class_scope:textsecure.SignalMessage)
  }

  /**
   * Protobuf type {@code textsecure.PreKeySignalMessage}
   */
  public static final class PreKeySignalMessage extends
  com.google.protobuf.GeneratedMessage
  implements PreKeySignalMessageOrBuilder {
    // optional uint32 registrationId = 5;
    public static final int REGISTRATIONID_FIELD_NUMBER = 5;
    // optional uint32 preKeyId = 1;
    public static final int PREKEYID_FIELD_NUMBER = 1;
    // optional uint32 signedPreKeyId = 6;
    public static final int SIGNEDPREKEYID_FIELD_NUMBER = 6;
    // optional bytes baseKey = 2;
    public static final int BASEKEY_FIELD_NUMBER = 2;
    // optional bytes identityKey = 3;
    public static final int IDENTITYKEY_FIELD_NUMBER = 3;
    // optional bytes message = 4;
    public static final int MESSAGE_FIELD_NUMBER = 4;
    private static final PreKeySignalMessage defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<PreKeySignalMessage> PARSER =
    new com.google.protobuf.AbstractParser<PreKeySignalMessage>() {
      public PreKeySignalMessage parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new PreKeySignalMessage(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new PreKeySignalMessage(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private int registrationId_;
    private int preKeyId_;
    private int signedPreKeyId_;
    private com.google.protobuf.ByteString baseKey_;
    private com.google.protobuf.ByteString identityKey_;
    private com.google.protobuf.ByteString message_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;

    // Use PreKeySignalMessage.newBuilder() to construct.
    private PreKeySignalMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private PreKeySignalMessage(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private PreKeySignalMessage(
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
              bitField0_ |= 0x00000002;
              preKeyId_ = input.readUInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000008;
              baseKey_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000010;
              identityKey_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000020;
              message_ = input.readBytes();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000001;
              registrationId_ = input.readUInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000004;
              signedPreKeyId_ = input.readUInt32();
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

    public static PreKeySignalMessage getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_PreKeySignalMessage_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public PreKeySignalMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_PreKeySignalMessage_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<PreKeySignalMessage> getParserForType() {
      return PARSER;
    }

    /**
     * <code>optional uint32 registrationId = 5;</code>
     */
    public boolean hasRegistrationId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional uint32 registrationId = 5;</code>
     */
    public int getRegistrationId() {
      return registrationId_;
    }

    /**
     * <code>optional uint32 preKeyId = 1;</code>
     */
    public boolean hasPreKeyId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional uint32 preKeyId = 1;</code>
     */
    public int getPreKeyId() {
      return preKeyId_;
    }

    /**
     * <code>optional uint32 signedPreKeyId = 6;</code>
     */
    public boolean hasSignedPreKeyId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional uint32 signedPreKeyId = 6;</code>
     */
    public int getSignedPreKeyId() {
      return signedPreKeyId_;
    }

    /**
     * <code>optional bytes baseKey = 2;</code>
     */
    public boolean hasBaseKey() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional bytes baseKey = 2;</code>
     */
    public com.google.protobuf.ByteString getBaseKey() {
      return baseKey_;
    }

    /**
     * <code>optional bytes identityKey = 3;</code>
     */
    public boolean hasIdentityKey() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional bytes identityKey = 3;</code>
     */
    public com.google.protobuf.ByteString getIdentityKey() {
      return identityKey_;
    }

    /**
     * <code>optional bytes message = 4;</code>
     * <p>
     * <pre>
     * SignalMessage
     * </pre>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }

    /**
     * <code>optional bytes message = 4;</code>
     * <p>
     * <pre>
     * SignalMessage
     * </pre>
     */
    public com.google.protobuf.ByteString getMessage() {
      return message_;
    }

    private void initFields() {
      registrationId_ = 0;
      preKeyId_ = 0;
      signedPreKeyId_ = 0;
      baseKey_ = com.google.protobuf.ByteString.EMPTY;
      identityKey_ = com.google.protobuf.ByteString.EMPTY;
      message_ = com.google.protobuf.ByteString.EMPTY;
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
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(1, preKeyId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(2, baseKey_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(3, identityKey_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(4, message_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(5, registrationId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(6, signedPreKeyId_);
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, preKeyId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, baseKey_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, identityKey_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, message_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, registrationId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, signedPreKeyId_);
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
     * Protobuf type {@code textsecure.PreKeySignalMessage}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessageOrBuilder {
      private int bitField0_;
      // optional uint32 registrationId = 5;
      private int registrationId_;
      // optional uint32 preKeyId = 1;
      private int preKeyId_;
      // optional uint32 signedPreKeyId = 6;
      private int signedPreKeyId_;
      // optional bytes baseKey = 2;
      private com.google.protobuf.ByteString baseKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes identityKey = 3;
      private com.google.protobuf.ByteString identityKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes message = 4;
      private com.google.protobuf.ByteString message_ = com.google.protobuf.ByteString.EMPTY;

      // Construct using com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage.newBuilder()
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
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_PreKeySignalMessage_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_PreKeySignalMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        registrationId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        preKeyId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        signedPreKeyId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        baseKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        identityKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        message_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_PreKeySignalMessage_descriptor;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage build() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage buildPartial() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage result = new com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.registrationId_ = registrationId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.preKeyId_ = preKeyId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.signedPreKeyId_ = signedPreKeyId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.baseKey_ = baseKey_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.identityKey_ = identityKey_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage) {
          return mergeFrom((com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage other) {
        if (other == com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage.getDefaultInstance())
          return this;
        if (other.hasRegistrationId()) {
          setRegistrationId(other.getRegistrationId());
        }
        if (other.hasPreKeyId()) {
          setPreKeyId(other.getPreKeyId());
        }
        if (other.hasSignedPreKeyId()) {
          setSignedPreKeyId(other.getSignedPreKeyId());
        }
        if (other.hasBaseKey()) {
          setBaseKey(other.getBaseKey());
        }
        if (other.hasIdentityKey()) {
          setIdentityKey(other.getIdentityKey());
        }
        if (other.hasMessage()) {
          setMessage(other.getMessage());
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
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.protocols.SignalProtos.PreKeySignalMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>optional uint32 registrationId = 5;</code>
       */
      public boolean hasRegistrationId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 registrationId = 5;</code>
       */
      public int getRegistrationId() {
        return registrationId_;
      }

      /**
       * <code>optional uint32 registrationId = 5;</code>
       */
      public Builder setRegistrationId(int value) {
        bitField0_ |= 0x00000001;
        registrationId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 registrationId = 5;</code>
       */
      public Builder clearRegistrationId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        registrationId_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 preKeyId = 1;</code>
       */
      public boolean hasPreKeyId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional uint32 preKeyId = 1;</code>
       */
      public int getPreKeyId() {
        return preKeyId_;
      }

      /**
       * <code>optional uint32 preKeyId = 1;</code>
       */
      public Builder setPreKeyId(int value) {
        bitField0_ |= 0x00000002;
        preKeyId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 preKeyId = 1;</code>
       */
      public Builder clearPreKeyId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        preKeyId_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 signedPreKeyId = 6;</code>
       */
      public boolean hasSignedPreKeyId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional uint32 signedPreKeyId = 6;</code>
       */
      public int getSignedPreKeyId() {
        return signedPreKeyId_;
      }

      /**
       * <code>optional uint32 signedPreKeyId = 6;</code>
       */
      public Builder setSignedPreKeyId(int value) {
        bitField0_ |= 0x00000004;
        signedPreKeyId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 signedPreKeyId = 6;</code>
       */
      public Builder clearSignedPreKeyId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        signedPreKeyId_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes baseKey = 2;</code>
       */
      public boolean hasBaseKey() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional bytes baseKey = 2;</code>
       */
      public com.google.protobuf.ByteString getBaseKey() {
        return baseKey_;
      }

      /**
       * <code>optional bytes baseKey = 2;</code>
       */
      public Builder setBaseKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        baseKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes baseKey = 2;</code>
       */
      public Builder clearBaseKey() {
        bitField0_ = (bitField0_ & ~0x00000008);
        baseKey_ = getDefaultInstance().getBaseKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes identityKey = 3;</code>
       */
      public boolean hasIdentityKey() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional bytes identityKey = 3;</code>
       */
      public com.google.protobuf.ByteString getIdentityKey() {
        return identityKey_;
      }

      /**
       * <code>optional bytes identityKey = 3;</code>
       */
      public Builder setIdentityKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        identityKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes identityKey = 3;</code>
       */
      public Builder clearIdentityKey() {
        bitField0_ = (bitField0_ & ~0x00000010);
        identityKey_ = getDefaultInstance().getIdentityKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes message = 4;</code>
       * <p>
       * <pre>
       * SignalMessage
       * </pre>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }

      /**
       * <code>optional bytes message = 4;</code>
       * <p>
       * <pre>
       * SignalMessage
       * </pre>
       */
      public com.google.protobuf.ByteString getMessage() {
        return message_;
      }

      /**
       * <code>optional bytes message = 4;</code>
       * <p>
       * <pre>
       * SignalMessage
       * </pre>
       */
      public Builder setMessage(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        message_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes message = 4;</code>
       * <p>
       * <pre>
       * SignalMessage
       * </pre>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000020);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.PreKeySignalMessage)
    }

    // @@protoc_insertion_point(class_scope:textsecure.PreKeySignalMessage)
  }

  /**
   * Protobuf type {@code textsecure.KeyExchangeMessage}
   */
  public static final class KeyExchangeMessage extends
  com.google.protobuf.GeneratedMessage
  implements KeyExchangeMessageOrBuilder {
    // optional uint32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    // optional bytes baseKey = 2;
    public static final int BASEKEY_FIELD_NUMBER = 2;
    // optional bytes ratchetKey = 3;
    public static final int RATCHETKEY_FIELD_NUMBER = 3;
    // optional bytes identityKey = 4;
    public static final int IDENTITYKEY_FIELD_NUMBER = 4;
    // optional bytes baseKeySignature = 5;
    public static final int BASEKEYSIGNATURE_FIELD_NUMBER = 5;
    private static final KeyExchangeMessage defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<KeyExchangeMessage> PARSER =
    new com.google.protobuf.AbstractParser<KeyExchangeMessage>() {
      public KeyExchangeMessage parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new KeyExchangeMessage(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new KeyExchangeMessage(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private int id_;
    private com.google.protobuf.ByteString baseKey_;
    private com.google.protobuf.ByteString ratchetKey_;
    private com.google.protobuf.ByteString identityKey_;
    private com.google.protobuf.ByteString baseKeySignature_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;
    // Use KeyExchangeMessage.newBuilder() to construct.
    private KeyExchangeMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private KeyExchangeMessage(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private KeyExchangeMessage(
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
              id_ = input.readUInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              baseKey_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              ratchetKey_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              identityKey_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              baseKeySignature_ = input.readBytes();
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

    public static KeyExchangeMessage getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_KeyExchangeMessage_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public KeyExchangeMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_KeyExchangeMessage_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<KeyExchangeMessage> getParserForType() {
      return PARSER;
    }

    /**
     * <code>optional uint32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional uint32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    /**
     * <code>optional bytes baseKey = 2;</code>
     */
    public boolean hasBaseKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional bytes baseKey = 2;</code>
     */
    public com.google.protobuf.ByteString getBaseKey() {
      return baseKey_;
    }

    /**
     * <code>optional bytes ratchetKey = 3;</code>
     */
    public boolean hasRatchetKey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional bytes ratchetKey = 3;</code>
     */
    public com.google.protobuf.ByteString getRatchetKey() {
      return ratchetKey_;
    }

    /**
     * <code>optional bytes identityKey = 4;</code>
     */
    public boolean hasIdentityKey() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional bytes identityKey = 4;</code>
     */
    public com.google.protobuf.ByteString getIdentityKey() {
      return identityKey_;
    }

    /**
     * <code>optional bytes baseKeySignature = 5;</code>
     */
    public boolean hasBaseKeySignature() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional bytes baseKeySignature = 5;</code>
     */
    public com.google.protobuf.ByteString getBaseKeySignature() {
      return baseKeySignature_;
    }

    private void initFields() {
      id_ = 0;
      baseKey_ = com.google.protobuf.ByteString.EMPTY;
      ratchetKey_ = com.google.protobuf.ByteString.EMPTY;
      identityKey_ = com.google.protobuf.ByteString.EMPTY;
      baseKeySignature_ = com.google.protobuf.ByteString.EMPTY;
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
        output.writeUInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, baseKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, ratchetKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, identityKey_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, baseKeySignature_);
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, baseKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, ratchetKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, identityKey_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, baseKeySignature_);
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
     * Protobuf type {@code textsecure.KeyExchangeMessage}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessageOrBuilder {
      private int bitField0_;
      // optional uint32 id = 1;
      private int id_;
      // optional bytes baseKey = 2;
      private com.google.protobuf.ByteString baseKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes ratchetKey = 3;
      private com.google.protobuf.ByteString ratchetKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes identityKey = 4;
      private com.google.protobuf.ByteString identityKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes baseKeySignature = 5;
      private com.google.protobuf.ByteString baseKeySignature_ = com.google.protobuf.ByteString.EMPTY;

      // Construct using com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage.newBuilder()
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
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_KeyExchangeMessage_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_KeyExchangeMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        baseKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        ratchetKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        identityKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        baseKeySignature_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_KeyExchangeMessage_descriptor;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage build() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage buildPartial() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage result = new com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.baseKey_ = baseKey_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.ratchetKey_ = ratchetKey_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.identityKey_ = identityKey_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.baseKeySignature_ = baseKeySignature_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage) {
          return mergeFrom((com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage other) {
        if (other == com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage.getDefaultInstance())
          return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasBaseKey()) {
          setBaseKey(other.getBaseKey());
        }
        if (other.hasRatchetKey()) {
          setRatchetKey(other.getRatchetKey());
        }
        if (other.hasIdentityKey()) {
          setIdentityKey(other.getIdentityKey());
        }
        if (other.hasBaseKeySignature()) {
          setBaseKeySignature(other.getBaseKeySignature());
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
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.protocols.SignalProtos.KeyExchangeMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes baseKey = 2;</code>
       */
      public boolean hasBaseKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes baseKey = 2;</code>
       */
      public com.google.protobuf.ByteString getBaseKey() {
        return baseKey_;
      }

      /**
       * <code>optional bytes baseKey = 2;</code>
       */
      public Builder setBaseKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        baseKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes baseKey = 2;</code>
       */
      public Builder clearBaseKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        baseKey_ = getDefaultInstance().getBaseKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes ratchetKey = 3;</code>
       */
      public boolean hasRatchetKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional bytes ratchetKey = 3;</code>
       */
      public com.google.protobuf.ByteString getRatchetKey() {
        return ratchetKey_;
      }

      /**
       * <code>optional bytes ratchetKey = 3;</code>
       */
      public Builder setRatchetKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        ratchetKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes ratchetKey = 3;</code>
       */
      public Builder clearRatchetKey() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ratchetKey_ = getDefaultInstance().getRatchetKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes identityKey = 4;</code>
       */
      public boolean hasIdentityKey() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional bytes identityKey = 4;</code>
       */
      public com.google.protobuf.ByteString getIdentityKey() {
        return identityKey_;
      }

      /**
       * <code>optional bytes identityKey = 4;</code>
       */
      public Builder setIdentityKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        identityKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes identityKey = 4;</code>
       */
      public Builder clearIdentityKey() {
        bitField0_ = (bitField0_ & ~0x00000008);
        identityKey_ = getDefaultInstance().getIdentityKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes baseKeySignature = 5;</code>
       */
      public boolean hasBaseKeySignature() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional bytes baseKeySignature = 5;</code>
       */
      public com.google.protobuf.ByteString getBaseKeySignature() {
        return baseKeySignature_;
      }

      /**
       * <code>optional bytes baseKeySignature = 5;</code>
       */
      public Builder setBaseKeySignature(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        baseKeySignature_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes baseKeySignature = 5;</code>
       */
      public Builder clearBaseKeySignature() {
        bitField0_ = (bitField0_ & ~0x00000010);
        baseKeySignature_ = getDefaultInstance().getBaseKeySignature();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.KeyExchangeMessage)
    }

    // @@protoc_insertion_point(class_scope:textsecure.KeyExchangeMessage)
  }

  /**
   * Protobuf type {@code textsecure.SenderKeyMessage}
   */
  public static final class SenderKeyMessage extends
  com.google.protobuf.GeneratedMessage
  implements SenderKeyMessageOrBuilder {
    // optional uint32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    // optional uint32 iteration = 2;
    public static final int ITERATION_FIELD_NUMBER = 2;
    // optional bytes ciphertext = 3;
    public static final int CIPHERTEXT_FIELD_NUMBER = 3;
    private static final SenderKeyMessage defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<SenderKeyMessage> PARSER =
    new com.google.protobuf.AbstractParser<SenderKeyMessage>() {
      public SenderKeyMessage parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new SenderKeyMessage(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new SenderKeyMessage(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private int id_;
    private int iteration_;
    private com.google.protobuf.ByteString ciphertext_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;
    // Use SenderKeyMessage.newBuilder() to construct.
    private SenderKeyMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private SenderKeyMessage(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private SenderKeyMessage(
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
              id_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              iteration_ = input.readUInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              ciphertext_ = input.readBytes();
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

    public static SenderKeyMessage getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SenderKeyMessage_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public SenderKeyMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SenderKeyMessage_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<SenderKeyMessage> getParserForType() {
      return PARSER;
    }

    /**
     * <code>optional uint32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional uint32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    /**
     * <code>optional uint32 iteration = 2;</code>
     */
    public boolean hasIteration() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional uint32 iteration = 2;</code>
     */
    public int getIteration() {
      return iteration_;
    }

    /**
     * <code>optional bytes ciphertext = 3;</code>
     */
    public boolean hasCiphertext() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional bytes ciphertext = 3;</code>
     */
    public com.google.protobuf.ByteString getCiphertext() {
      return ciphertext_;
    }

    private void initFields() {
      id_ = 0;
      iteration_ = 0;
      ciphertext_ = com.google.protobuf.ByteString.EMPTY;
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
        output.writeUInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, iteration_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, ciphertext_);
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, iteration_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, ciphertext_);
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
     * Protobuf type {@code textsecure.SenderKeyMessage}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessageOrBuilder {
      private int bitField0_;
      // optional uint32 id = 1;
      private int id_;
      // optional uint32 iteration = 2;
      private int iteration_;
      // optional bytes ciphertext = 3;
      private com.google.protobuf.ByteString ciphertext_ = com.google.protobuf.ByteString.EMPTY;

      // Construct using com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage.newBuilder()
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
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SenderKeyMessage_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SenderKeyMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        iteration_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        ciphertext_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SenderKeyMessage_descriptor;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage build() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage buildPartial() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage result = new com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.iteration_ = iteration_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.ciphertext_ = ciphertext_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage) {
          return mergeFrom((com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage other) {
        if (other == com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage.getDefaultInstance())
          return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasIteration()) {
          setIteration(other.getIteration());
        }
        if (other.hasCiphertext()) {
          setCiphertext(other.getCiphertext());
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
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 iteration = 2;</code>
       */
      public boolean hasIteration() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional uint32 iteration = 2;</code>
       */
      public int getIteration() {
        return iteration_;
      }

      /**
       * <code>optional uint32 iteration = 2;</code>
       */
      public Builder setIteration(int value) {
        bitField0_ |= 0x00000002;
        iteration_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 iteration = 2;</code>
       */
      public Builder clearIteration() {
        bitField0_ = (bitField0_ & ~0x00000002);
        iteration_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes ciphertext = 3;</code>
       */
      public boolean hasCiphertext() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional bytes ciphertext = 3;</code>
       */
      public com.google.protobuf.ByteString getCiphertext() {
        return ciphertext_;
      }

      /**
       * <code>optional bytes ciphertext = 3;</code>
       */
      public Builder setCiphertext(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        ciphertext_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes ciphertext = 3;</code>
       */
      public Builder clearCiphertext() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ciphertext_ = getDefaultInstance().getCiphertext();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.SenderKeyMessage)
    }

    // @@protoc_insertion_point(class_scope:textsecure.SenderKeyMessage)
  }

  /**
   * Protobuf type {@code textsecure.SenderKeyDistributionMessage}
   */
  public static final class SenderKeyDistributionMessage extends
  com.google.protobuf.GeneratedMessage
  implements SenderKeyDistributionMessageOrBuilder {
    // optional uint32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    // optional uint32 iteration = 2;
    public static final int ITERATION_FIELD_NUMBER = 2;
    // optional bytes chainKey = 3;
    public static final int CHAINKEY_FIELD_NUMBER = 3;
    // optional bytes signingKey = 4;
    public static final int SIGNINGKEY_FIELD_NUMBER = 4;
    private static final SenderKeyDistributionMessage defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<SenderKeyDistributionMessage> PARSER =
    new com.google.protobuf.AbstractParser<SenderKeyDistributionMessage>() {
      public SenderKeyDistributionMessage parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new SenderKeyDistributionMessage(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new SenderKeyDistributionMessage(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private int id_;
    private int iteration_;
    private com.google.protobuf.ByteString chainKey_;
    private com.google.protobuf.ByteString signingKey_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;

    // Use SenderKeyDistributionMessage.newBuilder() to construct.
    private SenderKeyDistributionMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private SenderKeyDistributionMessage(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SenderKeyDistributionMessage(
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
              id_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              iteration_ = input.readUInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              chainKey_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              signingKey_ = input.readBytes();
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

    public static SenderKeyDistributionMessage getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SenderKeyDistributionMessage_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public SenderKeyDistributionMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SenderKeyDistributionMessage_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<SenderKeyDistributionMessage> getParserForType() {
      return PARSER;
    }

    /**
     * <code>optional uint32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional uint32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    /**
     * <code>optional uint32 iteration = 2;</code>
     */
    public boolean hasIteration() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional uint32 iteration = 2;</code>
     */
    public int getIteration() {
      return iteration_;
    }

    /**
     * <code>optional bytes chainKey = 3;</code>
     */
    public boolean hasChainKey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional bytes chainKey = 3;</code>
     */
    public com.google.protobuf.ByteString getChainKey() {
      return chainKey_;
    }

    /**
     * <code>optional bytes signingKey = 4;</code>
     */
    public boolean hasSigningKey() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional bytes signingKey = 4;</code>
     */
    public com.google.protobuf.ByteString getSigningKey() {
      return signingKey_;
    }

    private void initFields() {
      id_ = 0;
      iteration_ = 0;
      chainKey_ = com.google.protobuf.ByteString.EMPTY;
      signingKey_ = com.google.protobuf.ByteString.EMPTY;
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
        output.writeUInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, iteration_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, chainKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, signingKey_);
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, iteration_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, chainKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, signingKey_);
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
     * Protobuf type {@code textsecure.SenderKeyDistributionMessage}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessageOrBuilder {
      private int bitField0_;
      // optional uint32 id = 1;
      private int id_;
      // optional uint32 iteration = 2;
      private int iteration_;
      // optional bytes chainKey = 3;
      private com.google.protobuf.ByteString chainKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes signingKey = 4;
      private com.google.protobuf.ByteString signingKey_ = com.google.protobuf.ByteString.EMPTY;

      // Construct using com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage.newBuilder()
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
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SenderKeyDistributionMessage_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SenderKeyDistributionMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        iteration_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        chainKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        signingKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_SenderKeyDistributionMessage_descriptor;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage build() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage buildPartial() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage result = new com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.iteration_ = iteration_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.chainKey_ = chainKey_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.signingKey_ = signingKey_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage) {
          return mergeFrom((com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage other) {
        if (other == com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage.getDefaultInstance())
          return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasIteration()) {
          setIteration(other.getIteration());
        }
        if (other.hasChainKey()) {
          setChainKey(other.getChainKey());
        }
        if (other.hasSigningKey()) {
          setSigningKey(other.getSigningKey());
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
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.protocols.SignalProtos.SenderKeyDistributionMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 iteration = 2;</code>
       */
      public boolean hasIteration() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional uint32 iteration = 2;</code>
       */
      public int getIteration() {
        return iteration_;
      }

      /**
       * <code>optional uint32 iteration = 2;</code>
       */
      public Builder setIteration(int value) {
        bitField0_ |= 0x00000002;
        iteration_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 iteration = 2;</code>
       */
      public Builder clearIteration() {
        bitField0_ = (bitField0_ & ~0x00000002);
        iteration_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes chainKey = 3;</code>
       */
      public boolean hasChainKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional bytes chainKey = 3;</code>
       */
      public com.google.protobuf.ByteString getChainKey() {
        return chainKey_;
      }

      /**
       * <code>optional bytes chainKey = 3;</code>
       */
      public Builder setChainKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        chainKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes chainKey = 3;</code>
       */
      public Builder clearChainKey() {
        bitField0_ = (bitField0_ & ~0x00000004);
        chainKey_ = getDefaultInstance().getChainKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes signingKey = 4;</code>
       */
      public boolean hasSigningKey() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional bytes signingKey = 4;</code>
       */
      public com.google.protobuf.ByteString getSigningKey() {
        return signingKey_;
      }

      /**
       * <code>optional bytes signingKey = 4;</code>
       */
      public Builder setSigningKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        signingKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes signingKey = 4;</code>
       */
      public Builder clearSigningKey() {
        bitField0_ = (bitField0_ & ~0x00000008);
        signingKey_ = getDefaultInstance().getSigningKey();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.SenderKeyDistributionMessage)
    }

    // @@protoc_insertion_point(class_scope:textsecure.SenderKeyDistributionMessage)
  }

  /**
   * Protobuf type {@code textsecure.DeviceConsistencyCodeMessage}
   */
  public static final class DeviceConsistencyCodeMessage extends
  com.google.protobuf.GeneratedMessage
  implements DeviceConsistencyCodeMessageOrBuilder {
    // optional uint32 generation = 1;
    public static final int GENERATION_FIELD_NUMBER = 1;
    // optional bytes signature = 2;
    public static final int SIGNATURE_FIELD_NUMBER = 2;
    private static final DeviceConsistencyCodeMessage defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<DeviceConsistencyCodeMessage> PARSER =
    new com.google.protobuf.AbstractParser<DeviceConsistencyCodeMessage>() {
      public DeviceConsistencyCodeMessage parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeviceConsistencyCodeMessage(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new DeviceConsistencyCodeMessage(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private int generation_;
    private com.google.protobuf.ByteString signature_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;

    // Use DeviceConsistencyCodeMessage.newBuilder() to construct.
    private DeviceConsistencyCodeMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DeviceConsistencyCodeMessage(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private DeviceConsistencyCodeMessage(
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
              generation_ = input.readUInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              signature_ = input.readBytes();
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

    public static DeviceConsistencyCodeMessage getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_DeviceConsistencyCodeMessage_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public DeviceConsistencyCodeMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_DeviceConsistencyCodeMessage_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<DeviceConsistencyCodeMessage> getParserForType() {
      return PARSER;
    }

    /**
     * <code>optional uint32 generation = 1;</code>
     */
    public boolean hasGeneration() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional uint32 generation = 1;</code>
     */
    public int getGeneration() {
      return generation_;
    }

    /**
     * <code>optional bytes signature = 2;</code>
     */
    public boolean hasSignature() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional bytes signature = 2;</code>
     */
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }

    private void initFields() {
      generation_ = 0;
      signature_ = com.google.protobuf.ByteString.EMPTY;
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
        output.writeUInt32(1, generation_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, signature_);
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, generation_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, signature_);
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
     * Protobuf type {@code textsecure.DeviceConsistencyCodeMessage}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessageOrBuilder {
      private int bitField0_;
      // optional uint32 generation = 1;
      private int generation_;
      // optional bytes signature = 2;
      private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;

      // Construct using com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage.newBuilder()
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
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_DeviceConsistencyCodeMessage_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_DeviceConsistencyCodeMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage.class, com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        generation_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        signature_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.internal_static_textsecure_DeviceConsistencyCodeMessage_descriptor;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage build() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage buildPartial() {
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage result = new com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.generation_ = generation_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.signature_ = signature_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage) {
          return mergeFrom((com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage other) {
        if (other == com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage.getDefaultInstance())
          return this;
        if (other.hasGeneration()) {
          setGeneration(other.getGeneration());
        }
        if (other.hasSignature()) {
          setSignature(other.getSignature());
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
        com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.protocols.SignalProtos.DeviceConsistencyCodeMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>optional uint32 generation = 1;</code>
       */
      public boolean hasGeneration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 generation = 1;</code>
       */
      public int getGeneration() {
        return generation_;
      }

      /**
       * <code>optional uint32 generation = 1;</code>
       */
      public Builder setGeneration(int value) {
        bitField0_ |= 0x00000001;
        generation_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 generation = 1;</code>
       */
      public Builder clearGeneration() {
        bitField0_ = (bitField0_ & ~0x00000001);
        generation_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes signature = 2;</code>
       */
      public boolean hasSignature() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes signature = 2;</code>
       */
      public com.google.protobuf.ByteString getSignature() {
        return signature_;
      }

      /**
       * <code>optional bytes signature = 2;</code>
       */
      public Builder setSignature(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        signature_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes signature = 2;</code>
       */
      public Builder clearSignature() {
        bitField0_ = (bitField0_ & ~0x00000002);
        signature_ = getDefaultInstance().getSignature();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.DeviceConsistencyCodeMessage)
    }

    // @@protoc_insertion_point(class_scope:textsecure.DeviceConsistencyCodeMessage)
  }

  // @@protoc_insertion_point(outer_class_scope)
}

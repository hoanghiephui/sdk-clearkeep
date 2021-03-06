package com.fisil.libclearkeep.protocol.state;

public final class StorageProtos {
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SessionStructure_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SessionStructure_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SessionStructure_Chain_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SessionStructure_Chain_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SessionStructure_Chain_ChainKey_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SessionStructure_Chain_ChainKey_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SessionStructure_Chain_MessageKey_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SessionStructure_Chain_MessageKey_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SessionStructure_PendingKeyExchange_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SessionStructure_PendingKeyExchange_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SessionStructure_PendingPreKey_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SessionStructure_PendingPreKey_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_RecordStructure_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_RecordStructure_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_PreKeyRecordStructure_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_PreKeyRecordStructure_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SignedPreKeyRecordStructure_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SignedPreKeyRecordStructure_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_IdentityKeyPairStructure_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_IdentityKeyPairStructure_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SenderKeyStateStructure_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SenderKeyStateStructure_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SenderKeyStateStructure_SenderChainKey_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SenderKeyStateStructure_SenderChainKey_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SenderKeyStateStructure_SenderMessageKey_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SenderKeyStateStructure_SenderMessageKey_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SenderKeyStateStructure_SenderSigningKey_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SenderKeyStateStructure_SenderSigningKey_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
  internal_static_textsecure_SenderKeyRecordStructure_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
  internal_static_textsecure_SenderKeyRecordStructure_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.FileDescriptor
  descriptor;

  static {
    String[] descriptorData = {
    "\n\032LocalStorageProtocol.proto\022\ntextsecure" +
    "\"\323\010\n\020SessionStructure\022\026\n\016sessionVersion\030" +
    "\001 \001(\r\022\033\n\023localIdentityPublic\030\002 \001(\014\022\034\n\024re" +
    "moteIdentityPublic\030\003 \001(\014\022\017\n\007rootKey\030\004 \001(" +
    "\014\022\027\n\017previousCounter\030\005 \001(\r\0227\n\013senderChai" +
    "n\030\006 \001(\0132\".textsecure.SessionStructure.Ch" +
    "ain\022:\n\016receiverChains\030\007 \003(\0132\".textsecure" +
    ".SessionStructure.Chain\022K\n\022pendingKeyExc" +
    "hange\030\010 \001(\0132/.textsecure.SessionStructur" +
    "e.PendingKeyExchange\022A\n\rpendingPreKey\030\t ",
    "\001(\0132*.textsecure.SessionStructure.Pendin" +
    "gPreKey\022\034\n\024remoteRegistrationId\030\n \001(\r\022\033\n" +
    "\023localRegistrationId\030\013 \001(\r\022\024\n\014needsRefre" +
    "sh\030\014 \001(\010\022\024\n\014aliceBaseKey\030\r \001(\014\032\271\002\n\005Chain" +
    "\022\030\n\020senderRatchetKey\030\001 \001(\014\022\037\n\027senderRatc" +
    "hetKeyPrivate\030\002 \001(\014\022=\n\010chainKey\030\003 \001(\0132+." +
    "textsecure.SessionStructure.Chain.ChainK" +
    "ey\022B\n\013messageKeys\030\004 \003(\0132-.textsecure.Ses" +
    "sionStructure.Chain.MessageKey\032&\n\010ChainK" +
    "ey\022\r\n\005index\030\001 \001(\r\022\013\n\003key\030\002 \001(\014\032J\n\nMessag",
    "eKey\022\r\n\005index\030\001 \001(\r\022\021\n\tcipherKey\030\002 \001(\014\022\016" +
    "\n\006macKey\030\003 \001(\014\022\n\n\002iv\030\004 \001(\014\032\315\001\n\022PendingKe" +
    "yExchange\022\020\n\010sequence\030\001 \001(\r\022\024\n\014localBase" +
    "Key\030\002 \001(\014\022\033\n\023localBaseKeyPrivate\030\003 \001(\014\022\027" +
    "\n\017localRatchetKey\030\004 \001(\014\022\036\n\026localRatchetK" +
    "eyPrivate\030\005 \001(\014\022\030\n\020localIdentityKey\030\007 \001(" +
    "\014\022\037\n\027localIdentityKeyPrivate\030\010 \001(\014\032J\n\rPe" +
    "ndingPreKey\022\020\n\010preKeyId\030\001 \001(\r\022\026\n\016signedP" +
    "reKeyId\030\003 \001(\005\022\017\n\007baseKey\030\002 \001(\014\"\177\n\017Record" +
    "Structure\0224\n\016currentSession\030\001 \001(\0132\034.text",
    "secure.SessionStructure\0226\n\020previousSessi" +
    "ons\030\002 \003(\0132\034.textsecure.SessionStructure\"" +
    "J\n\025PreKeyRecordStructure\022\n\n\002id\030\001 \001(\r\022\021\n\t" +
    "publicKey\030\002 \001(\014\022\022\n\nprivateKey\030\003 \001(\014\"v\n\033S" +
    "ignedPreKeyRecordStructure\022\n\n\002id\030\001 \001(\r\022\021" +
    "\n\tpublicKey\030\002 \001(\014\022\022\n\nprivateKey\030\003 \001(\014\022\021\n" +
    "\tsignature\030\004 \001(\014\022\021\n\ttimestamp\030\005 \001(\006\"A\n\030I" +
    "dentityKeyPairStructure\022\021\n\tpublicKey\030\001 \001" +
    "(\014\022\022\n\nprivateKey\030\002 \001(\014\"\270\003\n\027SenderKeyStat" +
    "eStructure\022\023\n\013senderKeyId\030\001 \001(\r\022J\n\016sende",
    "rChainKey\030\002 \001(\01322.textsecure.SenderKeySt" +
    "ateStructure.SenderChainKey\022N\n\020senderSig" +
    "ningKey\030\003 \001(\01324.textsecure.SenderKeyStat" +
    "eStructure.SenderSigningKey\022O\n\021senderMes" +
    "sageKeys\030\004 \003(\01324.textsecure.SenderKeySta" +
    "teStructure.SenderMessageKey\0321\n\016SenderCh" +
    "ainKey\022\021\n\titeration\030\001 \001(\r\022\014\n\004seed\030\002 \001(\014\032" +
    "3\n\020SenderMessageKey\022\021\n\titeration\030\001 \001(\r\022\014" +
    "\n\004seed\030\002 \001(\014\0323\n\020SenderSigningKey\022\016\n\006publ" +
    "ic\030\001 \001(\014\022\017\n\007private\030\002 \001(\014\"X\n\030SenderKeyRe",
    "cordStructure\022<\n\017senderKeyStates\030\001 \003(\0132#" +
    ".textsecure.SenderKeyStateStructureB3\n\"c" +
    "om.fisil.libclearkeep.stateB\rStora" +
    "geProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
    new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
      public com.google.protobuf.ExtensionRegistry assignDescriptors(
      com.google.protobuf.Descriptors.FileDescriptor root) {
        descriptor = root;
        internal_static_textsecure_SessionStructure_descriptor =
        getDescriptor().getMessageTypes().get(0);
        internal_static_textsecure_SessionStructure_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SessionStructure_descriptor,
        new String[]{"SessionVersion", "LocalIdentityPublic", "RemoteIdentityPublic", "RootKey", "PreviousCounter", "SenderChain", "ReceiverChains", "PendingKeyExchange", "PendingPreKey", "RemoteRegistrationId", "LocalRegistrationId", "NeedsRefresh", "AliceBaseKey",});
        internal_static_textsecure_SessionStructure_Chain_descriptor =
        internal_static_textsecure_SessionStructure_descriptor.getNestedTypes().get(0);
        internal_static_textsecure_SessionStructure_Chain_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SessionStructure_Chain_descriptor,
        new String[]{"SenderRatchetKey", "SenderRatchetKeyPrivate", "ChainKey", "MessageKeys",});
        internal_static_textsecure_SessionStructure_Chain_ChainKey_descriptor =
        internal_static_textsecure_SessionStructure_Chain_descriptor.getNestedTypes().get(0);
        internal_static_textsecure_SessionStructure_Chain_ChainKey_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SessionStructure_Chain_ChainKey_descriptor,
        new String[]{"Index", "Key",});
        internal_static_textsecure_SessionStructure_Chain_MessageKey_descriptor =
        internal_static_textsecure_SessionStructure_Chain_descriptor.getNestedTypes().get(1);
        internal_static_textsecure_SessionStructure_Chain_MessageKey_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SessionStructure_Chain_MessageKey_descriptor,
        new String[]{"Index", "CipherKey", "MacKey", "Iv",});
        internal_static_textsecure_SessionStructure_PendingKeyExchange_descriptor =
        internal_static_textsecure_SessionStructure_descriptor.getNestedTypes().get(1);
        internal_static_textsecure_SessionStructure_PendingKeyExchange_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SessionStructure_PendingKeyExchange_descriptor,
        new String[]{"Sequence", "LocalBaseKey", "LocalBaseKeyPrivate", "LocalRatchetKey", "LocalRatchetKeyPrivate", "LocalIdentityKey", "LocalIdentityKeyPrivate",});
        internal_static_textsecure_SessionStructure_PendingPreKey_descriptor =
        internal_static_textsecure_SessionStructure_descriptor.getNestedTypes().get(2);
        internal_static_textsecure_SessionStructure_PendingPreKey_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SessionStructure_PendingPreKey_descriptor,
        new String[]{"PreKeyId", "SignedPreKeyId", "BaseKey",});
        internal_static_textsecure_RecordStructure_descriptor =
        getDescriptor().getMessageTypes().get(1);
        internal_static_textsecure_RecordStructure_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_RecordStructure_descriptor,
        new String[]{"CurrentSession", "PreviousSessions",});
        internal_static_textsecure_PreKeyRecordStructure_descriptor =
        getDescriptor().getMessageTypes().get(2);
        internal_static_textsecure_PreKeyRecordStructure_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_PreKeyRecordStructure_descriptor,
        new String[]{"Id", "PublicKey", "PrivateKey",});
        internal_static_textsecure_SignedPreKeyRecordStructure_descriptor =
        getDescriptor().getMessageTypes().get(3);
        internal_static_textsecure_SignedPreKeyRecordStructure_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SignedPreKeyRecordStructure_descriptor,
        new String[]{"Id", "PublicKey", "PrivateKey", "Signature", "Timestamp",});
        internal_static_textsecure_IdentityKeyPairStructure_descriptor =
        getDescriptor().getMessageTypes().get(4);
        internal_static_textsecure_IdentityKeyPairStructure_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_IdentityKeyPairStructure_descriptor,
        new String[]{"PublicKey", "PrivateKey",});
        internal_static_textsecure_SenderKeyStateStructure_descriptor =
        getDescriptor().getMessageTypes().get(5);
        internal_static_textsecure_SenderKeyStateStructure_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SenderKeyStateStructure_descriptor,
        new String[]{"SenderKeyId", "SenderChainKey", "SenderSigningKey", "SenderMessageKeys",});
        internal_static_textsecure_SenderKeyStateStructure_SenderChainKey_descriptor =
        internal_static_textsecure_SenderKeyStateStructure_descriptor.getNestedTypes().get(0);
        internal_static_textsecure_SenderKeyStateStructure_SenderChainKey_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SenderKeyStateStructure_SenderChainKey_descriptor,
        new String[]{"Iteration", "Seed",});
        internal_static_textsecure_SenderKeyStateStructure_SenderMessageKey_descriptor =
        internal_static_textsecure_SenderKeyStateStructure_descriptor.getNestedTypes().get(1);
        internal_static_textsecure_SenderKeyStateStructure_SenderMessageKey_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SenderKeyStateStructure_SenderMessageKey_descriptor,
        new String[]{"Iteration", "Seed",});
        internal_static_textsecure_SenderKeyStateStructure_SenderSigningKey_descriptor =
        internal_static_textsecure_SenderKeyStateStructure_descriptor.getNestedTypes().get(2);
        internal_static_textsecure_SenderKeyStateStructure_SenderSigningKey_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SenderKeyStateStructure_SenderSigningKey_descriptor,
        new String[]{"Public", "Private",});
        internal_static_textsecure_SenderKeyRecordStructure_descriptor =
        getDescriptor().getMessageTypes().get(6);
        internal_static_textsecure_SenderKeyRecordStructure_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_textsecure_SenderKeyRecordStructure_descriptor,
        new String[]{"SenderKeyStates",});
        return null;
      }
    };
    com.google.protobuf.Descriptors.FileDescriptor
    .internalBuildGeneratedFileFrom(descriptorData,
    new com.google.protobuf.Descriptors.FileDescriptor[]{
    }, assigner);
  }
  private StorageProtos() {
  }

  public static void registerAllExtensions(
  com.google.protobuf.ExtensionRegistry registry) {
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  public interface SessionStructureOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 sessionVersion = 1;

    /**
     * <code>optional uint32 sessionVersion = 1;</code>
     */
    boolean hasSessionVersion();

    /**
     * <code>optional uint32 sessionVersion = 1;</code>
     */
    int getSessionVersion();

    // optional bytes localIdentityPublic = 2;

    /**
     * <code>optional bytes localIdentityPublic = 2;</code>
     */
    boolean hasLocalIdentityPublic();

    /**
     * <code>optional bytes localIdentityPublic = 2;</code>
     */
    com.google.protobuf.ByteString getLocalIdentityPublic();

    // optional bytes remoteIdentityPublic = 3;

    /**
     * <code>optional bytes remoteIdentityPublic = 3;</code>
     */
    boolean hasRemoteIdentityPublic();

    /**
     * <code>optional bytes remoteIdentityPublic = 3;</code>
     */
    com.google.protobuf.ByteString getRemoteIdentityPublic();

    // optional bytes rootKey = 4;

    /**
     * <code>optional bytes rootKey = 4;</code>
     */
    boolean hasRootKey();

    /**
     * <code>optional bytes rootKey = 4;</code>
     */
    com.google.protobuf.ByteString getRootKey();

    // optional uint32 previousCounter = 5;

    /**
     * <code>optional uint32 previousCounter = 5;</code>
     */
    boolean hasPreviousCounter();

    /**
     * <code>optional uint32 previousCounter = 5;</code>
     */
    int getPreviousCounter();

    // optional .textsecure.SessionStructure.Chain senderChain = 6;

    /**
     * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
     */
    boolean hasSenderChain();

    /**
     * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain getSenderChain();

    /**
     * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder getSenderChainOrBuilder();

    // repeated .textsecure.SessionStructure.Chain receiverChains = 7;

    /**
     * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
     */
    java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain>
    getReceiverChainsList();

    /**
     * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain getReceiverChains(int index);

    /**
     * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
     */
    int getReceiverChainsCount();

    /**
     * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
     */
    java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder>
    getReceiverChainsOrBuilderList();

    /**
     * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder getReceiverChainsOrBuilder(
    int index);

    // optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;

    /**
     * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
     */
    boolean hasPendingKeyExchange();

    /**
     * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange getPendingKeyExchange();

    /**
     * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchangeOrBuilder getPendingKeyExchangeOrBuilder();

    // optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;

    /**
     * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
     */
    boolean hasPendingPreKey();

    /**
     * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey getPendingPreKey();

    /**
     * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKeyOrBuilder getPendingPreKeyOrBuilder();

    // optional uint32 remoteRegistrationId = 10;

    /**
     * <code>optional uint32 remoteRegistrationId = 10;</code>
     */
    boolean hasRemoteRegistrationId();

    /**
     * <code>optional uint32 remoteRegistrationId = 10;</code>
     */
    int getRemoteRegistrationId();

    // optional uint32 localRegistrationId = 11;

    /**
     * <code>optional uint32 localRegistrationId = 11;</code>
     */
    boolean hasLocalRegistrationId();

    /**
     * <code>optional uint32 localRegistrationId = 11;</code>
     */
    int getLocalRegistrationId();

    // optional bool needsRefresh = 12;

    /**
     * <code>optional bool needsRefresh = 12;</code>
     */
    boolean hasNeedsRefresh();

    /**
     * <code>optional bool needsRefresh = 12;</code>
     */
    boolean getNeedsRefresh();

    // optional bytes aliceBaseKey = 13;

    /**
     * <code>optional bytes aliceBaseKey = 13;</code>
     */
    boolean hasAliceBaseKey();

    /**
     * <code>optional bytes aliceBaseKey = 13;</code>
     */
    com.google.protobuf.ByteString getAliceBaseKey();
  }
  public interface RecordStructureOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // optional .textsecure.SessionStructure currentSession = 1;

    /**
     * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
     */
    boolean hasCurrentSession();

    /**
     * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure getCurrentSession();

    /**
     * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder getCurrentSessionOrBuilder();

    // repeated .textsecure.SessionStructure previousSessions = 2;

    /**
     * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
     */
    java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure>
    getPreviousSessionsList();

    /**
     * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure getPreviousSessions(int index);

    /**
     * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
     */
    int getPreviousSessionsCount();

    /**
     * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
     */
    java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder>
    getPreviousSessionsOrBuilderList();

    /**
     * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder getPreviousSessionsOrBuilder(
    int index);
  }
  public interface PreKeyRecordStructureOrBuilder
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

    // optional bytes publicKey = 2;

    /**
     * <code>optional bytes publicKey = 2;</code>
     */
    boolean hasPublicKey();

    /**
     * <code>optional bytes publicKey = 2;</code>
     */
    com.google.protobuf.ByteString getPublicKey();

    // optional bytes privateKey = 3;

    /**
     * <code>optional bytes privateKey = 3;</code>
     */
    boolean hasPrivateKey();

    /**
     * <code>optional bytes privateKey = 3;</code>
     */
    com.google.protobuf.ByteString getPrivateKey();
  }
  public interface SignedPreKeyRecordStructureOrBuilder
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

    // optional bytes publicKey = 2;

    /**
     * <code>optional bytes publicKey = 2;</code>
     */
    boolean hasPublicKey();

    /**
     * <code>optional bytes publicKey = 2;</code>
     */
    com.google.protobuf.ByteString getPublicKey();

    // optional bytes privateKey = 3;

    /**
     * <code>optional bytes privateKey = 3;</code>
     */
    boolean hasPrivateKey();

    /**
     * <code>optional bytes privateKey = 3;</code>
     */
    com.google.protobuf.ByteString getPrivateKey();

    // optional bytes signature = 4;

    /**
     * <code>optional bytes signature = 4;</code>
     */
    boolean hasSignature();

    /**
     * <code>optional bytes signature = 4;</code>
     */
    com.google.protobuf.ByteString getSignature();

    // optional fixed64 timestamp = 5;

    /**
     * <code>optional fixed64 timestamp = 5;</code>
     */
    boolean hasTimestamp();

    /**
     * <code>optional fixed64 timestamp = 5;</code>
     */
    long getTimestamp();
  }
  public interface IdentityKeyPairStructureOrBuilder
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

    // optional bytes privateKey = 2;

    /**
     * <code>optional bytes privateKey = 2;</code>
     */
    boolean hasPrivateKey();

    /**
     * <code>optional bytes privateKey = 2;</code>
     */
    com.google.protobuf.ByteString getPrivateKey();
  }
  public interface SenderKeyStateStructureOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 senderKeyId = 1;

    /**
     * <code>optional uint32 senderKeyId = 1;</code>
     */
    boolean hasSenderKeyId();

    /**
     * <code>optional uint32 senderKeyId = 1;</code>
     */
    int getSenderKeyId();

    // optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
     */
    boolean hasSenderChainKey();

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey getSenderChainKey();

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKeyOrBuilder getSenderChainKeyOrBuilder();

    // optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
     */
    boolean hasSenderSigningKey();

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey getSenderSigningKey();

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKeyOrBuilder getSenderSigningKeyOrBuilder();

    // repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
     */
    java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey>
    getSenderMessageKeysList();

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey getSenderMessageKeys(int index);

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
     */
    int getSenderMessageKeysCount();

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
     */
    java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKeyOrBuilder>
    getSenderMessageKeysOrBuilderList();

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKeyOrBuilder getSenderMessageKeysOrBuilder(
    int index);
  }
  public interface SenderKeyRecordStructureOrBuilder
  extends com.google.protobuf.MessageOrBuilder {

    // repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
     */
    java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure>
    getSenderKeyStatesList();

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure getSenderKeyStates(int index);

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
     */
    int getSenderKeyStatesCount();

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
     */
    java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructureOrBuilder>
    getSenderKeyStatesOrBuilderList();

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
     */
    com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructureOrBuilder getSenderKeyStatesOrBuilder(
    int index);
  }

  /**
   * Protobuf type {@code textsecure.SessionStructure}
   */
  public static final class SessionStructure extends
  com.google.protobuf.GeneratedMessage
  implements SessionStructureOrBuilder {
    // optional uint32 sessionVersion = 1;
    public static final int SESSIONVERSION_FIELD_NUMBER = 1;
    // optional bytes localIdentityPublic = 2;
    public static final int LOCALIDENTITYPUBLIC_FIELD_NUMBER = 2;
    // optional bytes remoteIdentityPublic = 3;
    public static final int REMOTEIDENTITYPUBLIC_FIELD_NUMBER = 3;
    // optional bytes rootKey = 4;
    public static final int ROOTKEY_FIELD_NUMBER = 4;
    // optional uint32 previousCounter = 5;
    public static final int PREVIOUSCOUNTER_FIELD_NUMBER = 5;
    // optional .textsecure.SessionStructure.Chain senderChain = 6;
    public static final int SENDERCHAIN_FIELD_NUMBER = 6;
    // repeated .textsecure.SessionStructure.Chain receiverChains = 7;
    public static final int RECEIVERCHAINS_FIELD_NUMBER = 7;
    // optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;
    public static final int PENDINGKEYEXCHANGE_FIELD_NUMBER = 8;
    // optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;
    public static final int PENDINGPREKEY_FIELD_NUMBER = 9;
    // optional uint32 remoteRegistrationId = 10;
    public static final int REMOTEREGISTRATIONID_FIELD_NUMBER = 10;
    // optional uint32 localRegistrationId = 11;
    public static final int LOCALREGISTRATIONID_FIELD_NUMBER = 11;
    // optional bool needsRefresh = 12;
    public static final int NEEDSREFRESH_FIELD_NUMBER = 12;
    // optional bytes aliceBaseKey = 13;
    public static final int ALICEBASEKEY_FIELD_NUMBER = 13;
    private static final SessionStructure defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<SessionStructure> PARSER =
    new com.google.protobuf.AbstractParser<SessionStructure>() {
      public SessionStructure parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new SessionStructure(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new SessionStructure(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private int sessionVersion_;
    private com.google.protobuf.ByteString localIdentityPublic_;
    private com.google.protobuf.ByteString remoteIdentityPublic_;
    private com.google.protobuf.ByteString rootKey_;
    private int previousCounter_;
    private com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain senderChain_;
    private java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain> receiverChains_;
    private com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange pendingKeyExchange_;
    private com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey pendingPreKey_;
    private int remoteRegistrationId_;
    private int localRegistrationId_;
    private boolean needsRefresh_;
    private com.google.protobuf.ByteString aliceBaseKey_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;

    // Use SessionStructure.newBuilder() to construct.
    private SessionStructure(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private SessionStructure(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SessionStructure(
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
              sessionVersion_ = input.readUInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              localIdentityPublic_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              remoteIdentityPublic_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              rootKey_ = input.readBytes();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              previousCounter_ = input.readUInt32();
              break;
            }
            case 50: {
              com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder subBuilder = null;
              if (((bitField0_ & 0x00000020) == 0x00000020)) {
                subBuilder = senderChain_.toBuilder();
              }
              senderChain_ = input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(senderChain_);
                senderChain_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000020;
              break;
            }
            case 58: {
              if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                receiverChains_ = new java.util.ArrayList<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain>();
                mutable_bitField0_ |= 0x00000040;
              }
              receiverChains_.add(input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.PARSER, extensionRegistry));
              break;
            }
            case 66: {
              com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.Builder subBuilder = null;
              if (((bitField0_ & 0x00000040) == 0x00000040)) {
                subBuilder = pendingKeyExchange_.toBuilder();
              }
              pendingKeyExchange_ = input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pendingKeyExchange_);
                pendingKeyExchange_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000040;
              break;
            }
            case 74: {
              com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.Builder subBuilder = null;
              if (((bitField0_ & 0x00000080) == 0x00000080)) {
                subBuilder = pendingPreKey_.toBuilder();
              }
              pendingPreKey_ = input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pendingPreKey_);
                pendingPreKey_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000080;
              break;
            }
            case 80: {
              bitField0_ |= 0x00000100;
              remoteRegistrationId_ = input.readUInt32();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000200;
              localRegistrationId_ = input.readUInt32();
              break;
            }
            case 96: {
              bitField0_ |= 0x00000400;
              needsRefresh_ = input.readBool();
              break;
            }
            case 106: {
              bitField0_ |= 0x00000800;
              aliceBaseKey_ = input.readBytes();
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
        if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
          receiverChains_ = java.util.Collections.unmodifiableList(receiverChains_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static SessionStructure getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public SessionStructure getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<SessionStructure> getParserForType() {
      return PARSER;
    }

    /**
     * <code>optional uint32 sessionVersion = 1;</code>
     */
    public boolean hasSessionVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional uint32 sessionVersion = 1;</code>
     */
    public int getSessionVersion() {
      return sessionVersion_;
    }

    /**
     * <code>optional bytes localIdentityPublic = 2;</code>
     */
    public boolean hasLocalIdentityPublic() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional bytes localIdentityPublic = 2;</code>
     */
    public com.google.protobuf.ByteString getLocalIdentityPublic() {
      return localIdentityPublic_;
    }

    /**
     * <code>optional bytes remoteIdentityPublic = 3;</code>
     */
    public boolean hasRemoteIdentityPublic() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional bytes remoteIdentityPublic = 3;</code>
     */
    public com.google.protobuf.ByteString getRemoteIdentityPublic() {
      return remoteIdentityPublic_;
    }

    /**
     * <code>optional bytes rootKey = 4;</code>
     */
    public boolean hasRootKey() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional bytes rootKey = 4;</code>
     */
    public com.google.protobuf.ByteString getRootKey() {
      return rootKey_;
    }

    /**
     * <code>optional uint32 previousCounter = 5;</code>
     */
    public boolean hasPreviousCounter() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional uint32 previousCounter = 5;</code>
     */
    public int getPreviousCounter() {
      return previousCounter_;
    }

    /**
     * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
     */
    public boolean hasSenderChain() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }

    /**
     * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain getSenderChain() {
      return senderChain_;
    }

    /**
     * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder getSenderChainOrBuilder() {
      return senderChain_;
    }

    /**
     * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
     */
    public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain> getReceiverChainsList() {
      return receiverChains_;
    }

    /**
     * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
     */
    public java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder>
    getReceiverChainsOrBuilderList() {
      return receiverChains_;
    }

    /**
     * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
     */
    public int getReceiverChainsCount() {
      return receiverChains_.size();
    }

    /**
     * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain getReceiverChains(int index) {
      return receiverChains_.get(index);
    }

    /**
     * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder getReceiverChainsOrBuilder(
    int index) {
      return receiverChains_.get(index);
    }

    /**
     * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
     */
    public boolean hasPendingKeyExchange() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }

    /**
     * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange getPendingKeyExchange() {
      return pendingKeyExchange_;
    }

    /**
     * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchangeOrBuilder getPendingKeyExchangeOrBuilder() {
      return pendingKeyExchange_;
    }

    /**
     * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
     */
    public boolean hasPendingPreKey() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }

    /**
     * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey getPendingPreKey() {
      return pendingPreKey_;
    }

    /**
     * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKeyOrBuilder getPendingPreKeyOrBuilder() {
      return pendingPreKey_;
    }

    /**
     * <code>optional uint32 remoteRegistrationId = 10;</code>
     */
    public boolean hasRemoteRegistrationId() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }

    /**
     * <code>optional uint32 remoteRegistrationId = 10;</code>
     */
    public int getRemoteRegistrationId() {
      return remoteRegistrationId_;
    }

    /**
     * <code>optional uint32 localRegistrationId = 11;</code>
     */
    public boolean hasLocalRegistrationId() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }

    /**
     * <code>optional uint32 localRegistrationId = 11;</code>
     */
    public int getLocalRegistrationId() {
      return localRegistrationId_;
    }

    /**
     * <code>optional bool needsRefresh = 12;</code>
     */
    public boolean hasNeedsRefresh() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }

    /**
     * <code>optional bool needsRefresh = 12;</code>
     */
    public boolean getNeedsRefresh() {
      return needsRefresh_;
    }

    /**
     * <code>optional bytes aliceBaseKey = 13;</code>
     */
    public boolean hasAliceBaseKey() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }

    /**
     * <code>optional bytes aliceBaseKey = 13;</code>
     */
    public com.google.protobuf.ByteString getAliceBaseKey() {
      return aliceBaseKey_;
    }

    private void initFields() {
      sessionVersion_ = 0;
      localIdentityPublic_ = com.google.protobuf.ByteString.EMPTY;
      remoteIdentityPublic_ = com.google.protobuf.ByteString.EMPTY;
      rootKey_ = com.google.protobuf.ByteString.EMPTY;
      previousCounter_ = 0;
      senderChain_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.getDefaultInstance();
      receiverChains_ = java.util.Collections.emptyList();
      pendingKeyExchange_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.getDefaultInstance();
      pendingPreKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.getDefaultInstance();
      remoteRegistrationId_ = 0;
      localRegistrationId_ = 0;
      needsRefresh_ = false;
      aliceBaseKey_ = com.google.protobuf.ByteString.EMPTY;
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
        output.writeUInt32(1, sessionVersion_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, localIdentityPublic_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, remoteIdentityPublic_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, rootKey_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(5, previousCounter_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeMessage(6, senderChain_);
      }
      for (int i = 0; i < receiverChains_.size(); i++) {
        output.writeMessage(7, receiverChains_.get(i));
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeMessage(8, pendingKeyExchange_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeMessage(9, pendingPreKey_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeUInt32(10, remoteRegistrationId_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeUInt32(11, localRegistrationId_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeBool(12, needsRefresh_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeBytes(13, aliceBaseKey_);
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, sessionVersion_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, localIdentityPublic_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, remoteIdentityPublic_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, rootKey_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, previousCounter_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, senderChain_);
      }
      for (int i = 0; i < receiverChains_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, receiverChains_.get(i));
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, pendingKeyExchange_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(9, pendingPreKey_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(10, remoteRegistrationId_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(11, localRegistrationId_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(12, needsRefresh_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(13, aliceBaseKey_);
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

    public interface ChainOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

      // optional bytes senderRatchetKey = 1;

      /**
       * <code>optional bytes senderRatchetKey = 1;</code>
       */
      boolean hasSenderRatchetKey();

      /**
       * <code>optional bytes senderRatchetKey = 1;</code>
       */
      com.google.protobuf.ByteString getSenderRatchetKey();

      // optional bytes senderRatchetKeyPrivate = 2;

      /**
       * <code>optional bytes senderRatchetKeyPrivate = 2;</code>
       */
      boolean hasSenderRatchetKeyPrivate();

      /**
       * <code>optional bytes senderRatchetKeyPrivate = 2;</code>
       */
      com.google.protobuf.ByteString getSenderRatchetKeyPrivate();

      // optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;

      /**
       * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
       */
      boolean hasChainKey();

      /**
       * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
       */
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey getChainKey();

      /**
       * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
       */
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKeyOrBuilder getChainKeyOrBuilder();

      // repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;

      /**
       * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
       */
      java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey>
      getMessageKeysList();

      /**
       * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
       */
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey getMessageKeys(int index);

      /**
       * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
       */
      int getMessageKeysCount();

      /**
       * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
       */
      java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKeyOrBuilder>
      getMessageKeysOrBuilderList();

      /**
       * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
       */
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKeyOrBuilder getMessageKeysOrBuilder(
      int index);
    }

    public interface PendingKeyExchangeOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

      // optional uint32 sequence = 1;

      /**
       * <code>optional uint32 sequence = 1;</code>
       */
      boolean hasSequence();

      /**
       * <code>optional uint32 sequence = 1;</code>
       */
      int getSequence();

      // optional bytes localBaseKey = 2;

      /**
       * <code>optional bytes localBaseKey = 2;</code>
       */
      boolean hasLocalBaseKey();

      /**
       * <code>optional bytes localBaseKey = 2;</code>
       */
      com.google.protobuf.ByteString getLocalBaseKey();

      // optional bytes localBaseKeyPrivate = 3;

      /**
       * <code>optional bytes localBaseKeyPrivate = 3;</code>
       */
      boolean hasLocalBaseKeyPrivate();

      /**
       * <code>optional bytes localBaseKeyPrivate = 3;</code>
       */
      com.google.protobuf.ByteString getLocalBaseKeyPrivate();

      // optional bytes localRatchetKey = 4;

      /**
       * <code>optional bytes localRatchetKey = 4;</code>
       */
      boolean hasLocalRatchetKey();

      /**
       * <code>optional bytes localRatchetKey = 4;</code>
       */
      com.google.protobuf.ByteString getLocalRatchetKey();

      // optional bytes localRatchetKeyPrivate = 5;

      /**
       * <code>optional bytes localRatchetKeyPrivate = 5;</code>
       */
      boolean hasLocalRatchetKeyPrivate();

      /**
       * <code>optional bytes localRatchetKeyPrivate = 5;</code>
       */
      com.google.protobuf.ByteString getLocalRatchetKeyPrivate();

      // optional bytes localIdentityKey = 7;

      /**
       * <code>optional bytes localIdentityKey = 7;</code>
       */
      boolean hasLocalIdentityKey();

      /**
       * <code>optional bytes localIdentityKey = 7;</code>
       */
      com.google.protobuf.ByteString getLocalIdentityKey();

      // optional bytes localIdentityKeyPrivate = 8;

      /**
       * <code>optional bytes localIdentityKeyPrivate = 8;</code>
       */
      boolean hasLocalIdentityKeyPrivate();

      /**
       * <code>optional bytes localIdentityKeyPrivate = 8;</code>
       */
      com.google.protobuf.ByteString getLocalIdentityKeyPrivate();
    }

    public interface PendingPreKeyOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

      // optional uint32 preKeyId = 1;

      /**
       * <code>optional uint32 preKeyId = 1;</code>
       */
      boolean hasPreKeyId();

      /**
       * <code>optional uint32 preKeyId = 1;</code>
       */
      int getPreKeyId();

      // optional int32 signedPreKeyId = 3;

      /**
       * <code>optional int32 signedPreKeyId = 3;</code>
       */
      boolean hasSignedPreKeyId();

      /**
       * <code>optional int32 signedPreKeyId = 3;</code>
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
    }

    /**
     * Protobuf type {@code textsecure.SessionStructure.Chain}
     */
    public static final class Chain extends
    com.google.protobuf.GeneratedMessage
    implements ChainOrBuilder {
      // optional bytes senderRatchetKey = 1;
      public static final int SENDERRATCHETKEY_FIELD_NUMBER = 1;
      // optional bytes senderRatchetKeyPrivate = 2;
      public static final int SENDERRATCHETKEYPRIVATE_FIELD_NUMBER = 2;
      // optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;
      public static final int CHAINKEY_FIELD_NUMBER = 3;
      // repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;
      public static final int MESSAGEKEYS_FIELD_NUMBER = 4;
      private static final Chain defaultInstance;
      private static final long serialVersionUID = 0L;
      public static com.google.protobuf.Parser<Chain> PARSER =
      new com.google.protobuf.AbstractParser<Chain>() {
        public Chain parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return new Chain(input, extensionRegistry);
        }
      };

      static {
        defaultInstance = new Chain(true);
        defaultInstance.initFields();
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      private int bitField0_;
      private com.google.protobuf.ByteString senderRatchetKey_;
      private com.google.protobuf.ByteString senderRatchetKeyPrivate_;
      private com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey chainKey_;
      private java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey> messageKeys_;
      private byte memoizedIsInitialized = -1;
      private int memoizedSerializedSize = -1;

      // Use Chain.newBuilder() to construct.
      private Chain(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private Chain(boolean noInit) {
        this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }
      private Chain(
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
                senderRatchetKey_ = input.readBytes();
                break;
              }
              case 18: {
                bitField0_ |= 0x00000002;
                senderRatchetKeyPrivate_ = input.readBytes();
                break;
              }
              case 26: {
                com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = chainKey_.toBuilder();
                }
                chainKey_ = input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(chainKey_);
                  chainKey_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
              case 34: {
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  messageKeys_ = new java.util.ArrayList<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey>();
                  mutable_bitField0_ |= 0x00000008;
                }
                messageKeys_.add(input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.PARSER, extensionRegistry));
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
            messageKeys_ = java.util.Collections.unmodifiableList(messageKeys_);
          }
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }

      public static Chain getDefaultInstance() {
        return defaultInstance;
      }

      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_descriptor;
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain parseFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() {
        return Builder.create();
      }

      public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain prototype) {
        return newBuilder().mergeFrom(prototype);
      }

      public Chain getDefaultInstanceForType() {
        return defaultInstance;
      }

      @Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder.class);
      }

      @Override
      public com.google.protobuf.Parser<Chain> getParserForType() {
        return PARSER;
      }

      /**
       * <code>optional bytes senderRatchetKey = 1;</code>
       */
      public boolean hasSenderRatchetKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional bytes senderRatchetKey = 1;</code>
       */
      public com.google.protobuf.ByteString getSenderRatchetKey() {
        return senderRatchetKey_;
      }

      /**
       * <code>optional bytes senderRatchetKeyPrivate = 2;</code>
       */
      public boolean hasSenderRatchetKeyPrivate() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes senderRatchetKeyPrivate = 2;</code>
       */
      public com.google.protobuf.ByteString getSenderRatchetKeyPrivate() {
        return senderRatchetKeyPrivate_;
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
       */
      public boolean hasChainKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey getChainKey() {
        return chainKey_;
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKeyOrBuilder getChainKeyOrBuilder() {
        return chainKey_;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
       */
      public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey> getMessageKeysList() {
        return messageKeys_;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
       */
      public java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKeyOrBuilder>
      getMessageKeysOrBuilderList() {
        return messageKeys_;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
       */
      public int getMessageKeysCount() {
        return messageKeys_.size();
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey getMessageKeys(int index) {
        return messageKeys_.get(index);
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKeyOrBuilder getMessageKeysOrBuilder(
      int index) {
        return messageKeys_.get(index);
      }

      private void initFields() {
        senderRatchetKey_ = com.google.protobuf.ByteString.EMPTY;
        senderRatchetKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
        chainKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.getDefaultInstance();
        messageKeys_ = java.util.Collections.emptyList();
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
          output.writeBytes(1, senderRatchetKey_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeBytes(2, senderRatchetKeyPrivate_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          output.writeMessage(3, chainKey_);
        }
        for (int i = 0; i < messageKeys_.size(); i++) {
          output.writeMessage(4, messageKeys_.get(i));
        }
        getUnknownFields().writeTo(output);
      }

      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, senderRatchetKey_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, senderRatchetKeyPrivate_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, chainKey_);
        }
        for (int i = 0; i < messageKeys_.size(); i++) {
          size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, messageKeys_.get(i));
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

      public interface ChainKeyOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

        // optional uint32 index = 1;

        /**
         * <code>optional uint32 index = 1;</code>
         */
        boolean hasIndex();

        /**
         * <code>optional uint32 index = 1;</code>
         */
        int getIndex();

        // optional bytes key = 2;

        /**
         * <code>optional bytes key = 2;</code>
         */
        boolean hasKey();

        /**
         * <code>optional bytes key = 2;</code>
         */
        com.google.protobuf.ByteString getKey();
      }

      public interface MessageKeyOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

        // optional uint32 index = 1;

        /**
         * <code>optional uint32 index = 1;</code>
         */
        boolean hasIndex();

        /**
         * <code>optional uint32 index = 1;</code>
         */
        int getIndex();

        // optional bytes cipherKey = 2;

        /**
         * <code>optional bytes cipherKey = 2;</code>
         */
        boolean hasCipherKey();

        /**
         * <code>optional bytes cipherKey = 2;</code>
         */
        com.google.protobuf.ByteString getCipherKey();

        // optional bytes macKey = 3;

        /**
         * <code>optional bytes macKey = 3;</code>
         */
        boolean hasMacKey();

        /**
         * <code>optional bytes macKey = 3;</code>
         */
        com.google.protobuf.ByteString getMacKey();

        // optional bytes iv = 4;

        /**
         * <code>optional bytes iv = 4;</code>
         */
        boolean hasIv();

        /**
         * <code>optional bytes iv = 4;</code>
         */
        com.google.protobuf.ByteString getIv();
      }

      /**
       * Protobuf type {@code textsecure.SessionStructure.Chain.ChainKey}
       */
      public static final class ChainKey extends
      com.google.protobuf.GeneratedMessage
      implements ChainKeyOrBuilder {
        // optional uint32 index = 1;
        public static final int INDEX_FIELD_NUMBER = 1;
        // optional bytes key = 2;
        public static final int KEY_FIELD_NUMBER = 2;
        private static final ChainKey defaultInstance;
        private static final long serialVersionUID = 0L;
        public static com.google.protobuf.Parser<ChainKey> PARSER =
        new com.google.protobuf.AbstractParser<ChainKey>() {
          public ChainKey parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
            return new ChainKey(input, extensionRegistry);
          }
        };

        static {
          defaultInstance = new ChainKey(true);
          defaultInstance.initFields();
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        private int bitField0_;
        private int index_;
        private com.google.protobuf.ByteString key_;
        private byte memoizedIsInitialized = -1;
        private int memoizedSerializedSize = -1;

        // Use ChainKey.newBuilder() to construct.
        private ChainKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
          super(builder);
          this.unknownFields = builder.getUnknownFields();
        }
        private ChainKey(boolean noInit) {
          this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private ChainKey(
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
                  index_ = input.readUInt32();
                  break;
                }
                case 18: {
                  bitField0_ |= 0x00000002;
                  key_ = input.readBytes();
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

        public static ChainKey getDefaultInstance() {
          return defaultInstance;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_ChainKey_descriptor;
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
          return PARSER.parseFrom(input);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
          return PARSER.parseFrom(input, extensionRegistry);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
          return PARSER.parseDelimitedFrom(input);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
          return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
          return PARSER.parseFrom(input);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
          return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
          return Builder.create();
        }

        public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey prototype) {
          return newBuilder().mergeFrom(prototype);
        }

        public ChainKey getDefaultInstanceForType() {
          return defaultInstance;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
          return this.unknownFields;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_ChainKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.Builder.class);
        }

        @Override
        public com.google.protobuf.Parser<ChainKey> getParserForType() {
          return PARSER;
        }

        /**
         * <code>optional uint32 index = 1;</code>
         */
        public boolean hasIndex() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional uint32 index = 1;</code>
         */
        public int getIndex() {
          return index_;
        }

        /**
         * <code>optional bytes key = 2;</code>
         */
        public boolean hasKey() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional bytes key = 2;</code>
         */
        public com.google.protobuf.ByteString getKey() {
          return key_;
        }

        private void initFields() {
          index_ = 0;
          key_ = com.google.protobuf.ByteString.EMPTY;
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
            output.writeUInt32(1, index_);
          }
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeBytes(2, key_);
          }
          getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
          int size = memoizedSerializedSize;
          if (size != -1) return size;

          size = 0;
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            size += com.google.protobuf.CodedOutputStream
            .computeUInt32Size(1, index_);
          }
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(2, key_);
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
         * Protobuf type {@code textsecure.SessionStructure.Chain.ChainKey}
         */
        public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
        implements com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKeyOrBuilder {
          private int bitField0_;
          // optional uint32 index = 1;
          private int index_;
          // optional bytes key = 2;
          private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;

          // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.newBuilder()
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
            return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_ChainKey_descriptor;
          }

          private static Builder create() {
            return new Builder();
          }

          protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
            return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_ChainKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.Builder.class);
          }

          private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
            }
          }

          public Builder clear() {
            super.clear();
            index_ = 0;
            bitField0_ = (bitField0_ & ~0x00000001);
            key_ = com.google.protobuf.ByteString.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000002);
            return this;
          }

          public Builder clone() {
            return create().mergeFrom(buildPartial());
          }

          public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
            return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_ChainKey_descriptor;
          }

          public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey getDefaultInstanceForType() {
            return com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.getDefaultInstance();
          }

          public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey build() {
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey result = buildPartial();
            if (!result.isInitialized()) {
              throw newUninitializedMessageException(result);
            }
            return result;
          }

          public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey buildPartial() {
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
              to_bitField0_ |= 0x00000001;
            }
            result.index_ = index_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
              to_bitField0_ |= 0x00000002;
            }
            result.key_ = key_;
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
          }

          public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey) {
              return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey) other);
            } else {
              super.mergeFrom(other);
              return this;
            }
          }

          public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey other) {
            if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.getDefaultInstance())
              return this;
            if (other.hasIndex()) {
              setIndex(other.getIndex());
            }
            if (other.hasKey()) {
              setKey(other.getKey());
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
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey parsedMessage = null;
            try {
              parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
              parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey) e.getUnfinishedMessage();
              throw e;
            } finally {
              if (parsedMessage != null) {
                mergeFrom(parsedMessage);
              }
            }
            return this;
          }

          /**
           * <code>optional uint32 index = 1;</code>
           */
          public boolean hasIndex() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
          }

          /**
           * <code>optional uint32 index = 1;</code>
           */
          public int getIndex() {
            return index_;
          }

          /**
           * <code>optional uint32 index = 1;</code>
           */
          public Builder setIndex(int value) {
            bitField0_ |= 0x00000001;
            index_ = value;
            onChanged();
            return this;
          }

          /**
           * <code>optional uint32 index = 1;</code>
           */
          public Builder clearIndex() {
            bitField0_ = (bitField0_ & ~0x00000001);
            index_ = 0;
            onChanged();
            return this;
          }

          /**
           * <code>optional bytes key = 2;</code>
           */
          public boolean hasKey() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
          }

          /**
           * <code>optional bytes key = 2;</code>
           */
          public com.google.protobuf.ByteString getKey() {
            return key_;
          }

          /**
           * <code>optional bytes key = 2;</code>
           */
          public Builder setKey(com.google.protobuf.ByteString value) {
            if (value == null) {
              throw new NullPointerException();
            }
            bitField0_ |= 0x00000002;
            key_ = value;
            onChanged();
            return this;
          }

          /**
           * <code>optional bytes key = 2;</code>
           */
          public Builder clearKey() {
            bitField0_ = (bitField0_ & ~0x00000002);
            key_ = getDefaultInstance().getKey();
            onChanged();
            return this;
          }

          // @@protoc_insertion_point(builder_scope:textsecure.SessionStructure.Chain.ChainKey)
        }

        // @@protoc_insertion_point(class_scope:textsecure.SessionStructure.Chain.ChainKey)
      }

      /**
       * Protobuf type {@code textsecure.SessionStructure.Chain.MessageKey}
       */
      public static final class MessageKey extends
      com.google.protobuf.GeneratedMessage
      implements MessageKeyOrBuilder {
        // optional uint32 index = 1;
        public static final int INDEX_FIELD_NUMBER = 1;
        // optional bytes cipherKey = 2;
        public static final int CIPHERKEY_FIELD_NUMBER = 2;
        // optional bytes macKey = 3;
        public static final int MACKEY_FIELD_NUMBER = 3;
        // optional bytes iv = 4;
        public static final int IV_FIELD_NUMBER = 4;
        private static final MessageKey defaultInstance;
        private static final long serialVersionUID = 0L;
        public static com.google.protobuf.Parser<MessageKey> PARSER =
        new com.google.protobuf.AbstractParser<MessageKey>() {
          public MessageKey parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
            return new MessageKey(input, extensionRegistry);
          }
        };

        static {
          defaultInstance = new MessageKey(true);
          defaultInstance.initFields();
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        private int bitField0_;
        private int index_;
        private com.google.protobuf.ByteString cipherKey_;
        private com.google.protobuf.ByteString macKey_;
        private com.google.protobuf.ByteString iv_;
        private byte memoizedIsInitialized = -1;
        private int memoizedSerializedSize = -1;

        // Use MessageKey.newBuilder() to construct.
        private MessageKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
          super(builder);
          this.unknownFields = builder.getUnknownFields();
        }

        private MessageKey(boolean noInit) {
          this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private MessageKey(
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
                  index_ = input.readUInt32();
                  break;
                }
                case 18: {
                  bitField0_ |= 0x00000002;
                  cipherKey_ = input.readBytes();
                  break;
                }
                case 26: {
                  bitField0_ |= 0x00000004;
                  macKey_ = input.readBytes();
                  break;
                }
                case 34: {
                  bitField0_ |= 0x00000008;
                  iv_ = input.readBytes();
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

        public static MessageKey getDefaultInstance() {
          return defaultInstance;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_MessageKey_descriptor;
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
          return PARSER.parseFrom(input);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
          return PARSER.parseFrom(input, extensionRegistry);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
          return PARSER.parseDelimitedFrom(input);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
          return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
          return PARSER.parseFrom(input);
        }

        public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
          return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
          return Builder.create();
        }

        public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey prototype) {
          return newBuilder().mergeFrom(prototype);
        }

        public MessageKey getDefaultInstanceForType() {
          return defaultInstance;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
          return this.unknownFields;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_MessageKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder.class);
        }

        @Override
        public com.google.protobuf.Parser<MessageKey> getParserForType() {
          return PARSER;
        }

        /**
         * <code>optional uint32 index = 1;</code>
         */
        public boolean hasIndex() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional uint32 index = 1;</code>
         */
        public int getIndex() {
          return index_;
        }

        /**
         * <code>optional bytes cipherKey = 2;</code>
         */
        public boolean hasCipherKey() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional bytes cipherKey = 2;</code>
         */
        public com.google.protobuf.ByteString getCipherKey() {
          return cipherKey_;
        }

        /**
         * <code>optional bytes macKey = 3;</code>
         */
        public boolean hasMacKey() {
          return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>optional bytes macKey = 3;</code>
         */
        public com.google.protobuf.ByteString getMacKey() {
          return macKey_;
        }

        /**
         * <code>optional bytes iv = 4;</code>
         */
        public boolean hasIv() {
          return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        /**
         * <code>optional bytes iv = 4;</code>
         */
        public com.google.protobuf.ByteString getIv() {
          return iv_;
        }

        private void initFields() {
          index_ = 0;
          cipherKey_ = com.google.protobuf.ByteString.EMPTY;
          macKey_ = com.google.protobuf.ByteString.EMPTY;
          iv_ = com.google.protobuf.ByteString.EMPTY;
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
            output.writeUInt32(1, index_);
          }
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeBytes(2, cipherKey_);
          }
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            output.writeBytes(3, macKey_);
          }
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            output.writeBytes(4, iv_);
          }
          getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
          int size = memoizedSerializedSize;
          if (size != -1) return size;

          size = 0;
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            size += com.google.protobuf.CodedOutputStream
            .computeUInt32Size(1, index_);
          }
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(2, cipherKey_);
          }
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(3, macKey_);
          }
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(4, iv_);
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
         * Protobuf type {@code textsecure.SessionStructure.Chain.MessageKey}
         */
        public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
        implements com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKeyOrBuilder {
          private int bitField0_;
          // optional uint32 index = 1;
          private int index_;
          // optional bytes cipherKey = 2;
          private com.google.protobuf.ByteString cipherKey_ = com.google.protobuf.ByteString.EMPTY;
          // optional bytes macKey = 3;
          private com.google.protobuf.ByteString macKey_ = com.google.protobuf.ByteString.EMPTY;
          // optional bytes iv = 4;
          private com.google.protobuf.ByteString iv_ = com.google.protobuf.ByteString.EMPTY;

          // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.newBuilder()
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
            return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_MessageKey_descriptor;
          }

          private static Builder create() {
            return new Builder();
          }

          protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
            return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_MessageKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder.class);
          }

          private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
            }
          }

          public Builder clear() {
            super.clear();
            index_ = 0;
            bitField0_ = (bitField0_ & ~0x00000001);
            cipherKey_ = com.google.protobuf.ByteString.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000002);
            macKey_ = com.google.protobuf.ByteString.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000004);
            iv_ = com.google.protobuf.ByteString.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000008);
            return this;
          }

          public Builder clone() {
            return create().mergeFrom(buildPartial());
          }

          public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
            return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_MessageKey_descriptor;
          }

          public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey getDefaultInstanceForType() {
            return com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.getDefaultInstance();
          }

          public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey build() {
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey result = buildPartial();
            if (!result.isInitialized()) {
              throw newUninitializedMessageException(result);
            }
            return result;
          }

          public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey buildPartial() {
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
              to_bitField0_ |= 0x00000001;
            }
            result.index_ = index_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
              to_bitField0_ |= 0x00000002;
            }
            result.cipherKey_ = cipherKey_;
            if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
              to_bitField0_ |= 0x00000004;
            }
            result.macKey_ = macKey_;
            if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
              to_bitField0_ |= 0x00000008;
            }
            result.iv_ = iv_;
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
          }

          public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey) {
              return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey) other);
            } else {
              super.mergeFrom(other);
              return this;
            }
          }

          public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey other) {
            if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.getDefaultInstance())
              return this;
            if (other.hasIndex()) {
              setIndex(other.getIndex());
            }
            if (other.hasCipherKey()) {
              setCipherKey(other.getCipherKey());
            }
            if (other.hasMacKey()) {
              setMacKey(other.getMacKey());
            }
            if (other.hasIv()) {
              setIv(other.getIv());
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
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey parsedMessage = null;
            try {
              parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
              parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey) e.getUnfinishedMessage();
              throw e;
            } finally {
              if (parsedMessage != null) {
                mergeFrom(parsedMessage);
              }
            }
            return this;
          }

          /**
           * <code>optional uint32 index = 1;</code>
           */
          public boolean hasIndex() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
          }

          /**
           * <code>optional uint32 index = 1;</code>
           */
          public int getIndex() {
            return index_;
          }

          /**
           * <code>optional uint32 index = 1;</code>
           */
          public Builder setIndex(int value) {
            bitField0_ |= 0x00000001;
            index_ = value;
            onChanged();
            return this;
          }

          /**
           * <code>optional uint32 index = 1;</code>
           */
          public Builder clearIndex() {
            bitField0_ = (bitField0_ & ~0x00000001);
            index_ = 0;
            onChanged();
            return this;
          }

          /**
           * <code>optional bytes cipherKey = 2;</code>
           */
          public boolean hasCipherKey() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
          }

          /**
           * <code>optional bytes cipherKey = 2;</code>
           */
          public com.google.protobuf.ByteString getCipherKey() {
            return cipherKey_;
          }

          /**
           * <code>optional bytes cipherKey = 2;</code>
           */
          public Builder setCipherKey(com.google.protobuf.ByteString value) {
            if (value == null) {
              throw new NullPointerException();
            }
            bitField0_ |= 0x00000002;
            cipherKey_ = value;
            onChanged();
            return this;
          }

          /**
           * <code>optional bytes cipherKey = 2;</code>
           */
          public Builder clearCipherKey() {
            bitField0_ = (bitField0_ & ~0x00000002);
            cipherKey_ = getDefaultInstance().getCipherKey();
            onChanged();
            return this;
          }

          /**
           * <code>optional bytes macKey = 3;</code>
           */
          public boolean hasMacKey() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
          }

          /**
           * <code>optional bytes macKey = 3;</code>
           */
          public com.google.protobuf.ByteString getMacKey() {
            return macKey_;
          }

          /**
           * <code>optional bytes macKey = 3;</code>
           */
          public Builder setMacKey(com.google.protobuf.ByteString value) {
            if (value == null) {
              throw new NullPointerException();
            }
            bitField0_ |= 0x00000004;
            macKey_ = value;
            onChanged();
            return this;
          }

          /**
           * <code>optional bytes macKey = 3;</code>
           */
          public Builder clearMacKey() {
            bitField0_ = (bitField0_ & ~0x00000004);
            macKey_ = getDefaultInstance().getMacKey();
            onChanged();
            return this;
          }

          /**
           * <code>optional bytes iv = 4;</code>
           */
          public boolean hasIv() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
          }

          /**
           * <code>optional bytes iv = 4;</code>
           */
          public com.google.protobuf.ByteString getIv() {
            return iv_;
          }

          /**
           * <code>optional bytes iv = 4;</code>
           */
          public Builder setIv(com.google.protobuf.ByteString value) {
            if (value == null) {
              throw new NullPointerException();
            }
            bitField0_ |= 0x00000008;
            iv_ = value;
            onChanged();
            return this;
          }

          /**
           * <code>optional bytes iv = 4;</code>
           */
          public Builder clearIv() {
            bitField0_ = (bitField0_ & ~0x00000008);
            iv_ = getDefaultInstance().getIv();
            onChanged();
            return this;
          }

          // @@protoc_insertion_point(builder_scope:textsecure.SessionStructure.Chain.MessageKey)
        }

        // @@protoc_insertion_point(class_scope:textsecure.SessionStructure.Chain.MessageKey)
      }

      /**
       * Protobuf type {@code textsecure.SessionStructure.Chain}
       */
      public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder {
        private int bitField0_;
        // optional bytes senderRatchetKey = 1;
        private com.google.protobuf.ByteString senderRatchetKey_ = com.google.protobuf.ByteString.EMPTY;
        // optional bytes senderRatchetKeyPrivate = 2;
        private com.google.protobuf.ByteString senderRatchetKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
        // optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;
        private com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey chainKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKeyOrBuilder> chainKeyBuilder_;
        // repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;
        private java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey> messageKeys_ =
        java.util.Collections.emptyList();
        private com.google.protobuf.RepeatedFieldBuilder<
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKeyOrBuilder> messageKeysBuilder_;

        // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.newBuilder()
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
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_descriptor;
        }

        private static Builder create() {
          return new Builder();
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
            getChainKeyFieldBuilder();
            getMessageKeysFieldBuilder();
          }
        }

        public Builder clear() {
          super.clear();
          senderRatchetKey_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000001);
          senderRatchetKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000002);
          if (chainKeyBuilder_ == null) {
            chainKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.getDefaultInstance();
          } else {
            chainKeyBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000004);
          if (messageKeysBuilder_ == null) {
            messageKeys_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            messageKeysBuilder_.clear();
          }
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_Chain_descriptor;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain getDefaultInstanceForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.getDefaultInstance();
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain build() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain buildPartial() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.senderRatchetKey_ = senderRatchetKey_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.senderRatchetKeyPrivate_ = senderRatchetKeyPrivate_;
          if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
            to_bitField0_ |= 0x00000004;
          }
          if (chainKeyBuilder_ == null) {
            result.chainKey_ = chainKey_;
          } else {
            result.chainKey_ = chainKeyBuilder_.build();
          }
          if (messageKeysBuilder_ == null) {
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
              messageKeys_ = java.util.Collections.unmodifiableList(messageKeys_);
              bitField0_ = (bitField0_ & ~0x00000008);
            }
            result.messageKeys_ = messageKeys_;
          } else {
            result.messageKeys_ = messageKeysBuilder_.build();
          }
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain) {
            return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain) other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain other) {
          if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.getDefaultInstance())
            return this;
          if (other.hasSenderRatchetKey()) {
            setSenderRatchetKey(other.getSenderRatchetKey());
          }
          if (other.hasSenderRatchetKeyPrivate()) {
            setSenderRatchetKeyPrivate(other.getSenderRatchetKeyPrivate());
          }
          if (other.hasChainKey()) {
            mergeChainKey(other.getChainKey());
          }
          if (messageKeysBuilder_ == null) {
            if (!other.messageKeys_.isEmpty()) {
              if (messageKeys_.isEmpty()) {
                messageKeys_ = other.messageKeys_;
                bitField0_ = (bitField0_ & ~0x00000008);
              } else {
                ensureMessageKeysIsMutable();
                messageKeys_.addAll(other.messageKeys_);
              }
              onChanged();
            }
          } else {
            if (!other.messageKeys_.isEmpty()) {
              if (messageKeysBuilder_.isEmpty()) {
                messageKeysBuilder_.dispose();
                messageKeysBuilder_ = null;
                messageKeys_ = other.messageKeys_;
                bitField0_ = (bitField0_ & ~0x00000008);
                messageKeysBuilder_ =
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                getMessageKeysFieldBuilder() : null;
              } else {
                messageKeysBuilder_.addAllMessages(other.messageKeys_);
              }
            }
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
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        /**
         * <code>optional bytes senderRatchetKey = 1;</code>
         */
        public boolean hasSenderRatchetKey() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional bytes senderRatchetKey = 1;</code>
         */
        public com.google.protobuf.ByteString getSenderRatchetKey() {
          return senderRatchetKey_;
        }

        /**
         * <code>optional bytes senderRatchetKey = 1;</code>
         */
        public Builder setSenderRatchetKey(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          senderRatchetKey_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes senderRatchetKey = 1;</code>
         */
        public Builder clearSenderRatchetKey() {
          bitField0_ = (bitField0_ & ~0x00000001);
          senderRatchetKey_ = getDefaultInstance().getSenderRatchetKey();
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes senderRatchetKeyPrivate = 2;</code>
         */
        public boolean hasSenderRatchetKeyPrivate() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional bytes senderRatchetKeyPrivate = 2;</code>
         */
        public com.google.protobuf.ByteString getSenderRatchetKeyPrivate() {
          return senderRatchetKeyPrivate_;
        }

        /**
         * <code>optional bytes senderRatchetKeyPrivate = 2;</code>
         */
        public Builder setSenderRatchetKeyPrivate(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          senderRatchetKeyPrivate_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes senderRatchetKeyPrivate = 2;</code>
         */
        public Builder clearSenderRatchetKeyPrivate() {
          bitField0_ = (bitField0_ & ~0x00000002);
          senderRatchetKeyPrivate_ = getDefaultInstance().getSenderRatchetKeyPrivate();
          onChanged();
          return this;
        }

        /**
         * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
         */
        public boolean hasChainKey() {
          return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
         */
        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey getChainKey() {
          if (chainKeyBuilder_ == null) {
            return chainKey_;
          } else {
            return chainKeyBuilder_.getMessage();
          }
        }

        /**
         * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
         */
        public Builder setChainKey(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.Builder builderForValue) {
          if (chainKeyBuilder_ == null) {
            chainKey_ = builderForValue.build();
            onChanged();
          } else {
            chainKeyBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000004;
          return this;
        }

        /**
         * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
         */
        public Builder setChainKey(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey value) {
          if (chainKeyBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            chainKey_ = value;
            onChanged();
          } else {
            chainKeyBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000004;
          return this;
        }

        /**
         * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
         */
        public Builder mergeChainKey(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey value) {
          if (chainKeyBuilder_ == null) {
            if (((bitField0_ & 0x00000004) == 0x00000004) &&
            chainKey_ != com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.getDefaultInstance()) {
              chainKey_ =
              com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.newBuilder(chainKey_).mergeFrom(value).buildPartial();
            } else {
              chainKey_ = value;
            }
            onChanged();
          } else {
            chainKeyBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000004;
          return this;
        }

        /**
         * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
         */
        public Builder clearChainKey() {
          if (chainKeyBuilder_ == null) {
            chainKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.getDefaultInstance();
            onChanged();
          } else {
            chainKeyBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000004);
          return this;
        }

        /**
         * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
         */
        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.Builder getChainKeyBuilder() {
          bitField0_ |= 0x00000004;
          onChanged();
          return getChainKeyFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
         */
        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKeyOrBuilder getChainKeyOrBuilder() {
          if (chainKeyBuilder_ != null) {
            return chainKeyBuilder_.getMessageOrBuilder();
          } else {
            return chainKey_;
          }
        }

        /**
         * <code>optional .textsecure.SessionStructure.Chain.ChainKey chainKey = 3;</code>
         */
        private com.google.protobuf.SingleFieldBuilder<
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKeyOrBuilder>
        getChainKeyFieldBuilder() {
          if (chainKeyBuilder_ == null) {
            chainKeyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.ChainKeyOrBuilder>(
            chainKey_,
            getParentForChildren(),
            isClean());
            chainKey_ = null;
          }
          return chainKeyBuilder_;
        }

        private void ensureMessageKeysIsMutable() {
          if (!((bitField0_ & 0x00000008) == 0x00000008)) {
            messageKeys_ = new java.util.ArrayList<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey>(messageKeys_);
            bitField0_ |= 0x00000008;
          }
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey> getMessageKeysList() {
          if (messageKeysBuilder_ == null) {
            return java.util.Collections.unmodifiableList(messageKeys_);
          } else {
            return messageKeysBuilder_.getMessageList();
          }
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public int getMessageKeysCount() {
          if (messageKeysBuilder_ == null) {
            return messageKeys_.size();
          } else {
            return messageKeysBuilder_.getCount();
          }
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey getMessageKeys(int index) {
          if (messageKeysBuilder_ == null) {
            return messageKeys_.get(index);
          } else {
            return messageKeysBuilder_.getMessage(index);
          }
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public Builder setMessageKeys(
        int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey value) {
          if (messageKeysBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureMessageKeysIsMutable();
            messageKeys_.set(index, value);
            onChanged();
          } else {
            messageKeysBuilder_.setMessage(index, value);
          }
          return this;
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public Builder setMessageKeys(
        int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder builderForValue) {
          if (messageKeysBuilder_ == null) {
            ensureMessageKeysIsMutable();
            messageKeys_.set(index, builderForValue.build());
            onChanged();
          } else {
            messageKeysBuilder_.setMessage(index, builderForValue.build());
          }
          return this;
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public Builder addMessageKeys(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey value) {
          if (messageKeysBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureMessageKeysIsMutable();
            messageKeys_.add(value);
            onChanged();
          } else {
            messageKeysBuilder_.addMessage(value);
          }
          return this;
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public Builder addMessageKeys(
        int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey value) {
          if (messageKeysBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureMessageKeysIsMutable();
            messageKeys_.add(index, value);
            onChanged();
          } else {
            messageKeysBuilder_.addMessage(index, value);
          }
          return this;
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public Builder addMessageKeys(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder builderForValue) {
          if (messageKeysBuilder_ == null) {
            ensureMessageKeysIsMutable();
            messageKeys_.add(builderForValue.build());
            onChanged();
          } else {
            messageKeysBuilder_.addMessage(builderForValue.build());
          }
          return this;
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public Builder addMessageKeys(
        int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder builderForValue) {
          if (messageKeysBuilder_ == null) {
            ensureMessageKeysIsMutable();
            messageKeys_.add(index, builderForValue.build());
            onChanged();
          } else {
            messageKeysBuilder_.addMessage(index, builderForValue.build());
          }
          return this;
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public Builder addAllMessageKeys(
        Iterable<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey> values) {
          if (messageKeysBuilder_ == null) {
            ensureMessageKeysIsMutable();
            super.addAll(values, messageKeys_);
            onChanged();
          } else {
            messageKeysBuilder_.addAllMessages(values);
          }
          return this;
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public Builder clearMessageKeys() {
          if (messageKeysBuilder_ == null) {
            messageKeys_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000008);
            onChanged();
          } else {
            messageKeysBuilder_.clear();
          }
          return this;
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public Builder removeMessageKeys(int index) {
          if (messageKeysBuilder_ == null) {
            ensureMessageKeysIsMutable();
            messageKeys_.remove(index);
            onChanged();
          } else {
            messageKeysBuilder_.remove(index);
          }
          return this;
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder getMessageKeysBuilder(
        int index) {
          return getMessageKeysFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKeyOrBuilder getMessageKeysOrBuilder(
        int index) {
          if (messageKeysBuilder_ == null) {
            return messageKeys_.get(index);
          } else {
            return messageKeysBuilder_.getMessageOrBuilder(index);
          }
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKeyOrBuilder>
        getMessageKeysOrBuilderList() {
          if (messageKeysBuilder_ != null) {
            return messageKeysBuilder_.getMessageOrBuilderList();
          } else {
            return java.util.Collections.unmodifiableList(messageKeys_);
          }
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder addMessageKeysBuilder() {
          return getMessageKeysFieldBuilder().addBuilder(
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.getDefaultInstance());
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder addMessageKeysBuilder(
        int index) {
          return getMessageKeysFieldBuilder().addBuilder(
          index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.getDefaultInstance());
        }

        /**
         * <code>repeated .textsecure.SessionStructure.Chain.MessageKey messageKeys = 4;</code>
         */
        public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder>
        getMessageKeysBuilderList() {
          return getMessageKeysFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilder<
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKeyOrBuilder>
        getMessageKeysFieldBuilder() {
          if (messageKeysBuilder_ == null) {
            messageKeysBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.MessageKeyOrBuilder>(
            messageKeys_,
            ((bitField0_ & 0x00000008) == 0x00000008),
            getParentForChildren(),
            isClean());
            messageKeys_ = null;
          }
          return messageKeysBuilder_;
        }

        // @@protoc_insertion_point(builder_scope:textsecure.SessionStructure.Chain)
      }

      // @@protoc_insertion_point(class_scope:textsecure.SessionStructure.Chain)
    }

    /**
     * Protobuf type {@code textsecure.SessionStructure.PendingKeyExchange}
     */
    public static final class PendingKeyExchange extends
    com.google.protobuf.GeneratedMessage
    implements PendingKeyExchangeOrBuilder {
      // optional uint32 sequence = 1;
      public static final int SEQUENCE_FIELD_NUMBER = 1;
      // optional bytes localBaseKey = 2;
      public static final int LOCALBASEKEY_FIELD_NUMBER = 2;
      // optional bytes localBaseKeyPrivate = 3;
      public static final int LOCALBASEKEYPRIVATE_FIELD_NUMBER = 3;
      // optional bytes localRatchetKey = 4;
      public static final int LOCALRATCHETKEY_FIELD_NUMBER = 4;
      // optional bytes localRatchetKeyPrivate = 5;
      public static final int LOCALRATCHETKEYPRIVATE_FIELD_NUMBER = 5;
      // optional bytes localIdentityKey = 7;
      public static final int LOCALIDENTITYKEY_FIELD_NUMBER = 7;
      // optional bytes localIdentityKeyPrivate = 8;
      public static final int LOCALIDENTITYKEYPRIVATE_FIELD_NUMBER = 8;
      private static final PendingKeyExchange defaultInstance;
      private static final long serialVersionUID = 0L;
      public static com.google.protobuf.Parser<PendingKeyExchange> PARSER =
      new com.google.protobuf.AbstractParser<PendingKeyExchange>() {
        public PendingKeyExchange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return new PendingKeyExchange(input, extensionRegistry);
        }
      };

      static {
        defaultInstance = new PendingKeyExchange(true);
        defaultInstance.initFields();
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      private int bitField0_;
      private int sequence_;
      private com.google.protobuf.ByteString localBaseKey_;
      private com.google.protobuf.ByteString localBaseKeyPrivate_;
      private com.google.protobuf.ByteString localRatchetKey_;
      private com.google.protobuf.ByteString localRatchetKeyPrivate_;
      private com.google.protobuf.ByteString localIdentityKey_;
      private com.google.protobuf.ByteString localIdentityKeyPrivate_;
      private byte memoizedIsInitialized = -1;
      private int memoizedSerializedSize = -1;
      // Use PendingKeyExchange.newBuilder() to construct.
      private PendingKeyExchange(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }

      private PendingKeyExchange(boolean noInit) {
        this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }

      private PendingKeyExchange(
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
                sequence_ = input.readUInt32();
                break;
              }
              case 18: {
                bitField0_ |= 0x00000002;
                localBaseKey_ = input.readBytes();
                break;
              }
              case 26: {
                bitField0_ |= 0x00000004;
                localBaseKeyPrivate_ = input.readBytes();
                break;
              }
              case 34: {
                bitField0_ |= 0x00000008;
                localRatchetKey_ = input.readBytes();
                break;
              }
              case 42: {
                bitField0_ |= 0x00000010;
                localRatchetKeyPrivate_ = input.readBytes();
                break;
              }
              case 58: {
                bitField0_ |= 0x00000020;
                localIdentityKey_ = input.readBytes();
                break;
              }
              case 66: {
                bitField0_ |= 0x00000040;
                localIdentityKeyPrivate_ = input.readBytes();
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

      public static PendingKeyExchange getDefaultInstance() {
        return defaultInstance;
      }

      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_PendingKeyExchange_descriptor;
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() {
        return Builder.create();
      }

      public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange prototype) {
        return newBuilder().mergeFrom(prototype);
      }

      public PendingKeyExchange getDefaultInstanceForType() {
        return defaultInstance;
      }

      @Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_PendingKeyExchange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.Builder.class);
      }

      @Override
      public com.google.protobuf.Parser<PendingKeyExchange> getParserForType() {
        return PARSER;
      }

      /**
       * <code>optional uint32 sequence = 1;</code>
       */
      public boolean hasSequence() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 sequence = 1;</code>
       */
      public int getSequence() {
        return sequence_;
      }

      /**
       * <code>optional bytes localBaseKey = 2;</code>
       */
      public boolean hasLocalBaseKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes localBaseKey = 2;</code>
       */
      public com.google.protobuf.ByteString getLocalBaseKey() {
        return localBaseKey_;
      }

      /**
       * <code>optional bytes localBaseKeyPrivate = 3;</code>
       */
      public boolean hasLocalBaseKeyPrivate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional bytes localBaseKeyPrivate = 3;</code>
       */
      public com.google.protobuf.ByteString getLocalBaseKeyPrivate() {
        return localBaseKeyPrivate_;
      }

      /**
       * <code>optional bytes localRatchetKey = 4;</code>
       */
      public boolean hasLocalRatchetKey() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional bytes localRatchetKey = 4;</code>
       */
      public com.google.protobuf.ByteString getLocalRatchetKey() {
        return localRatchetKey_;
      }

      /**
       * <code>optional bytes localRatchetKeyPrivate = 5;</code>
       */
      public boolean hasLocalRatchetKeyPrivate() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional bytes localRatchetKeyPrivate = 5;</code>
       */
      public com.google.protobuf.ByteString getLocalRatchetKeyPrivate() {
        return localRatchetKeyPrivate_;
      }

      /**
       * <code>optional bytes localIdentityKey = 7;</code>
       */
      public boolean hasLocalIdentityKey() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }

      /**
       * <code>optional bytes localIdentityKey = 7;</code>
       */
      public com.google.protobuf.ByteString getLocalIdentityKey() {
        return localIdentityKey_;
      }

      /**
       * <code>optional bytes localIdentityKeyPrivate = 8;</code>
       */
      public boolean hasLocalIdentityKeyPrivate() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }

      /**
       * <code>optional bytes localIdentityKeyPrivate = 8;</code>
       */
      public com.google.protobuf.ByteString getLocalIdentityKeyPrivate() {
        return localIdentityKeyPrivate_;
      }

      private void initFields() {
        sequence_ = 0;
        localBaseKey_ = com.google.protobuf.ByteString.EMPTY;
        localBaseKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
        localRatchetKey_ = com.google.protobuf.ByteString.EMPTY;
        localRatchetKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
        localIdentityKey_ = com.google.protobuf.ByteString.EMPTY;
        localIdentityKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
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
          output.writeUInt32(1, sequence_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeBytes(2, localBaseKey_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          output.writeBytes(3, localBaseKeyPrivate_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          output.writeBytes(4, localRatchetKey_);
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          output.writeBytes(5, localRatchetKeyPrivate_);
        }
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          output.writeBytes(7, localIdentityKey_);
        }
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
          output.writeBytes(8, localIdentityKeyPrivate_);
        }
        getUnknownFields().writeTo(output);
      }

      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, sequence_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, localBaseKey_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, localBaseKeyPrivate_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, localRatchetKey_);
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, localRatchetKeyPrivate_);
        }
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, localIdentityKey_);
        }
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, localIdentityKeyPrivate_);
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
       * Protobuf type {@code textsecure.SessionStructure.PendingKeyExchange}
       */
      public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchangeOrBuilder {
        private int bitField0_;
        // optional uint32 sequence = 1;
        private int sequence_;
        // optional bytes localBaseKey = 2;
        private com.google.protobuf.ByteString localBaseKey_ = com.google.protobuf.ByteString.EMPTY;
        // optional bytes localBaseKeyPrivate = 3;
        private com.google.protobuf.ByteString localBaseKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
        // optional bytes localRatchetKey = 4;
        private com.google.protobuf.ByteString localRatchetKey_ = com.google.protobuf.ByteString.EMPTY;
        // optional bytes localRatchetKeyPrivate = 5;
        private com.google.protobuf.ByteString localRatchetKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
        // optional bytes localIdentityKey = 7;
        private com.google.protobuf.ByteString localIdentityKey_ = com.google.protobuf.ByteString.EMPTY;
        // optional bytes localIdentityKeyPrivate = 8;
        private com.google.protobuf.ByteString localIdentityKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;

        // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.newBuilder()
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
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_PendingKeyExchange_descriptor;
        }

        private static Builder create() {
          return new Builder();
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_PendingKeyExchange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          }
        }

        public Builder clear() {
          super.clear();
          sequence_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          localBaseKey_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000002);
          localBaseKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000004);
          localRatchetKey_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000008);
          localRatchetKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000010);
          localIdentityKey_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000020);
          localIdentityKeyPrivate_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000040);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_PendingKeyExchange_descriptor;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange getDefaultInstanceForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.getDefaultInstance();
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange build() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange buildPartial() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.sequence_ = sequence_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.localBaseKey_ = localBaseKey_;
          if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
            to_bitField0_ |= 0x00000004;
          }
          result.localBaseKeyPrivate_ = localBaseKeyPrivate_;
          if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
            to_bitField0_ |= 0x00000008;
          }
          result.localRatchetKey_ = localRatchetKey_;
          if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
            to_bitField0_ |= 0x00000010;
          }
          result.localRatchetKeyPrivate_ = localRatchetKeyPrivate_;
          if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
            to_bitField0_ |= 0x00000020;
          }
          result.localIdentityKey_ = localIdentityKey_;
          if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
            to_bitField0_ |= 0x00000040;
          }
          result.localIdentityKeyPrivate_ = localIdentityKeyPrivate_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange) {
            return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange) other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange other) {
          if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.getDefaultInstance())
            return this;
          if (other.hasSequence()) {
            setSequence(other.getSequence());
          }
          if (other.hasLocalBaseKey()) {
            setLocalBaseKey(other.getLocalBaseKey());
          }
          if (other.hasLocalBaseKeyPrivate()) {
            setLocalBaseKeyPrivate(other.getLocalBaseKeyPrivate());
          }
          if (other.hasLocalRatchetKey()) {
            setLocalRatchetKey(other.getLocalRatchetKey());
          }
          if (other.hasLocalRatchetKeyPrivate()) {
            setLocalRatchetKeyPrivate(other.getLocalRatchetKeyPrivate());
          }
          if (other.hasLocalIdentityKey()) {
            setLocalIdentityKey(other.getLocalIdentityKey());
          }
          if (other.hasLocalIdentityKeyPrivate()) {
            setLocalIdentityKeyPrivate(other.getLocalIdentityKeyPrivate());
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
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        /**
         * <code>optional uint32 sequence = 1;</code>
         */
        public boolean hasSequence() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional uint32 sequence = 1;</code>
         */
        public int getSequence() {
          return sequence_;
        }

        /**
         * <code>optional uint32 sequence = 1;</code>
         */
        public Builder setSequence(int value) {
          bitField0_ |= 0x00000001;
          sequence_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional uint32 sequence = 1;</code>
         */
        public Builder clearSequence() {
          bitField0_ = (bitField0_ & ~0x00000001);
          sequence_ = 0;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localBaseKey = 2;</code>
         */
        public boolean hasLocalBaseKey() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional bytes localBaseKey = 2;</code>
         */
        public com.google.protobuf.ByteString getLocalBaseKey() {
          return localBaseKey_;
        }

        /**
         * <code>optional bytes localBaseKey = 2;</code>
         */
        public Builder setLocalBaseKey(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          localBaseKey_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localBaseKey = 2;</code>
         */
        public Builder clearLocalBaseKey() {
          bitField0_ = (bitField0_ & ~0x00000002);
          localBaseKey_ = getDefaultInstance().getLocalBaseKey();
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localBaseKeyPrivate = 3;</code>
         */
        public boolean hasLocalBaseKeyPrivate() {
          return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>optional bytes localBaseKeyPrivate = 3;</code>
         */
        public com.google.protobuf.ByteString getLocalBaseKeyPrivate() {
          return localBaseKeyPrivate_;
        }

        /**
         * <code>optional bytes localBaseKeyPrivate = 3;</code>
         */
        public Builder setLocalBaseKeyPrivate(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000004;
          localBaseKeyPrivate_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localBaseKeyPrivate = 3;</code>
         */
        public Builder clearLocalBaseKeyPrivate() {
          bitField0_ = (bitField0_ & ~0x00000004);
          localBaseKeyPrivate_ = getDefaultInstance().getLocalBaseKeyPrivate();
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localRatchetKey = 4;</code>
         */
        public boolean hasLocalRatchetKey() {
          return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        /**
         * <code>optional bytes localRatchetKey = 4;</code>
         */
        public com.google.protobuf.ByteString getLocalRatchetKey() {
          return localRatchetKey_;
        }

        /**
         * <code>optional bytes localRatchetKey = 4;</code>
         */
        public Builder setLocalRatchetKey(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000008;
          localRatchetKey_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localRatchetKey = 4;</code>
         */
        public Builder clearLocalRatchetKey() {
          bitField0_ = (bitField0_ & ~0x00000008);
          localRatchetKey_ = getDefaultInstance().getLocalRatchetKey();
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localRatchetKeyPrivate = 5;</code>
         */
        public boolean hasLocalRatchetKeyPrivate() {
          return ((bitField0_ & 0x00000010) == 0x00000010);
        }

        /**
         * <code>optional bytes localRatchetKeyPrivate = 5;</code>
         */
        public com.google.protobuf.ByteString getLocalRatchetKeyPrivate() {
          return localRatchetKeyPrivate_;
        }

        /**
         * <code>optional bytes localRatchetKeyPrivate = 5;</code>
         */
        public Builder setLocalRatchetKeyPrivate(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000010;
          localRatchetKeyPrivate_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localRatchetKeyPrivate = 5;</code>
         */
        public Builder clearLocalRatchetKeyPrivate() {
          bitField0_ = (bitField0_ & ~0x00000010);
          localRatchetKeyPrivate_ = getDefaultInstance().getLocalRatchetKeyPrivate();
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localIdentityKey = 7;</code>
         */
        public boolean hasLocalIdentityKey() {
          return ((bitField0_ & 0x00000020) == 0x00000020);
        }

        /**
         * <code>optional bytes localIdentityKey = 7;</code>
         */
        public com.google.protobuf.ByteString getLocalIdentityKey() {
          return localIdentityKey_;
        }

        /**
         * <code>optional bytes localIdentityKey = 7;</code>
         */
        public Builder setLocalIdentityKey(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000020;
          localIdentityKey_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localIdentityKey = 7;</code>
         */
        public Builder clearLocalIdentityKey() {
          bitField0_ = (bitField0_ & ~0x00000020);
          localIdentityKey_ = getDefaultInstance().getLocalIdentityKey();
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localIdentityKeyPrivate = 8;</code>
         */
        public boolean hasLocalIdentityKeyPrivate() {
          return ((bitField0_ & 0x00000040) == 0x00000040);
        }

        /**
         * <code>optional bytes localIdentityKeyPrivate = 8;</code>
         */
        public com.google.protobuf.ByteString getLocalIdentityKeyPrivate() {
          return localIdentityKeyPrivate_;
        }

        /**
         * <code>optional bytes localIdentityKeyPrivate = 8;</code>
         */
        public Builder setLocalIdentityKeyPrivate(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000040;
          localIdentityKeyPrivate_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes localIdentityKeyPrivate = 8;</code>
         */
        public Builder clearLocalIdentityKeyPrivate() {
          bitField0_ = (bitField0_ & ~0x00000040);
          localIdentityKeyPrivate_ = getDefaultInstance().getLocalIdentityKeyPrivate();
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:textsecure.SessionStructure.PendingKeyExchange)
      }

      // @@protoc_insertion_point(class_scope:textsecure.SessionStructure.PendingKeyExchange)
    }

    /**
     * Protobuf type {@code textsecure.SessionStructure.PendingPreKey}
     */
    public static final class PendingPreKey extends
    com.google.protobuf.GeneratedMessage
    implements PendingPreKeyOrBuilder {
      // optional uint32 preKeyId = 1;
      public static final int PREKEYID_FIELD_NUMBER = 1;
      // optional int32 signedPreKeyId = 3;
      public static final int SIGNEDPREKEYID_FIELD_NUMBER = 3;
      // optional bytes baseKey = 2;
      public static final int BASEKEY_FIELD_NUMBER = 2;
      private static final PendingPreKey defaultInstance;
      private static final long serialVersionUID = 0L;
      public static com.google.protobuf.Parser<PendingPreKey> PARSER =
      new com.google.protobuf.AbstractParser<PendingPreKey>() {
        public PendingPreKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return new PendingPreKey(input, extensionRegistry);
        }
      };

      static {
        defaultInstance = new PendingPreKey(true);
        defaultInstance.initFields();
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      private int bitField0_;
      private int preKeyId_;
      private int signedPreKeyId_;
      private com.google.protobuf.ByteString baseKey_;
      private byte memoizedIsInitialized = -1;
      private int memoizedSerializedSize = -1;
      // Use PendingPreKey.newBuilder() to construct.
      private PendingPreKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }

      private PendingPreKey(boolean noInit) {
        this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }

      private PendingPreKey(
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
                preKeyId_ = input.readUInt32();
                break;
              }
              case 18: {
                bitField0_ |= 0x00000004;
                baseKey_ = input.readBytes();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000002;
                signedPreKeyId_ = input.readInt32();
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

      public static PendingPreKey getDefaultInstance() {
        return defaultInstance;
      }

      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_PendingPreKey_descriptor;
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() {
        return Builder.create();
      }

      public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey prototype) {
        return newBuilder().mergeFrom(prototype);
      }

      public PendingPreKey getDefaultInstanceForType() {
        return defaultInstance;
      }

      @Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_PendingPreKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.Builder.class);
      }

      @Override
      public com.google.protobuf.Parser<PendingPreKey> getParserForType() {
        return PARSER;
      }

      /**
       * <code>optional uint32 preKeyId = 1;</code>
       */
      public boolean hasPreKeyId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 preKeyId = 1;</code>
       */
      public int getPreKeyId() {
        return preKeyId_;
      }

      /**
       * <code>optional int32 signedPreKeyId = 3;</code>
       */
      public boolean hasSignedPreKeyId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional int32 signedPreKeyId = 3;</code>
       */
      public int getSignedPreKeyId() {
        return signedPreKeyId_;
      }

      /**
       * <code>optional bytes baseKey = 2;</code>
       */
      public boolean hasBaseKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional bytes baseKey = 2;</code>
       */
      public com.google.protobuf.ByteString getBaseKey() {
        return baseKey_;
      }

      private void initFields() {
        preKeyId_ = 0;
        signedPreKeyId_ = 0;
        baseKey_ = com.google.protobuf.ByteString.EMPTY;
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
          output.writeUInt32(1, preKeyId_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          output.writeBytes(2, baseKey_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeInt32(3, signedPreKeyId_);
        }
        getUnknownFields().writeTo(output);
      }

      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, preKeyId_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, baseKey_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, signedPreKeyId_);
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
       * Protobuf type {@code textsecure.SessionStructure.PendingPreKey}
       */
      public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKeyOrBuilder {
        private int bitField0_;
        // optional uint32 preKeyId = 1;
        private int preKeyId_;
        // optional int32 signedPreKeyId = 3;
        private int signedPreKeyId_;
        // optional bytes baseKey = 2;
        private com.google.protobuf.ByteString baseKey_ = com.google.protobuf.ByteString.EMPTY;

        // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.newBuilder()
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
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_PendingPreKey_descriptor;
        }

        private static Builder create() {
          return new Builder();
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_PendingPreKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          }
        }

        public Builder clear() {
          super.clear();
          preKeyId_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          signedPreKeyId_ = 0;
          bitField0_ = (bitField0_ & ~0x00000002);
          baseKey_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000004);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_PendingPreKey_descriptor;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey getDefaultInstanceForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.getDefaultInstance();
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey build() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey buildPartial() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.preKeyId_ = preKeyId_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.signedPreKeyId_ = signedPreKeyId_;
          if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
            to_bitField0_ |= 0x00000004;
          }
          result.baseKey_ = baseKey_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey) {
            return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey) other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey other) {
          if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.getDefaultInstance())
            return this;
          if (other.hasPreKeyId()) {
            setPreKeyId(other.getPreKeyId());
          }
          if (other.hasSignedPreKeyId()) {
            setSignedPreKeyId(other.getSignedPreKeyId());
          }
          if (other.hasBaseKey()) {
            setBaseKey(other.getBaseKey());
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
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        /**
         * <code>optional uint32 preKeyId = 1;</code>
         */
        public boolean hasPreKeyId() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
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
          bitField0_ |= 0x00000001;
          preKeyId_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional uint32 preKeyId = 1;</code>
         */
        public Builder clearPreKeyId() {
          bitField0_ = (bitField0_ & ~0x00000001);
          preKeyId_ = 0;
          onChanged();
          return this;
        }

        /**
         * <code>optional int32 signedPreKeyId = 3;</code>
         */
        public boolean hasSignedPreKeyId() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional int32 signedPreKeyId = 3;</code>
         */
        public int getSignedPreKeyId() {
          return signedPreKeyId_;
        }

        /**
         * <code>optional int32 signedPreKeyId = 3;</code>
         */
        public Builder setSignedPreKeyId(int value) {
          bitField0_ |= 0x00000002;
          signedPreKeyId_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional int32 signedPreKeyId = 3;</code>
         */
        public Builder clearSignedPreKeyId() {
          bitField0_ = (bitField0_ & ~0x00000002);
          signedPreKeyId_ = 0;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes baseKey = 2;</code>
         */
        public boolean hasBaseKey() {
          return ((bitField0_ & 0x00000004) == 0x00000004);
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
          bitField0_ |= 0x00000004;
          baseKey_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes baseKey = 2;</code>
         */
        public Builder clearBaseKey() {
          bitField0_ = (bitField0_ & ~0x00000004);
          baseKey_ = getDefaultInstance().getBaseKey();
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:textsecure.SessionStructure.PendingPreKey)
      }

      // @@protoc_insertion_point(class_scope:textsecure.SessionStructure.PendingPreKey)
    }

    /**
     * Protobuf type {@code textsecure.SessionStructure}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder {
      private int bitField0_;
      // optional uint32 sessionVersion = 1;
      private int sessionVersion_;
      // optional bytes localIdentityPublic = 2;
      private com.google.protobuf.ByteString localIdentityPublic_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes remoteIdentityPublic = 3;
      private com.google.protobuf.ByteString remoteIdentityPublic_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes rootKey = 4;
      private com.google.protobuf.ByteString rootKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional uint32 previousCounter = 5;
      private int previousCounter_;
      // optional .textsecure.SessionStructure.Chain senderChain = 6;
      private com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain senderChain_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder> senderChainBuilder_;
      // repeated .textsecure.SessionStructure.Chain receiverChains = 7;
      private java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain> receiverChains_ =
      java.util.Collections.emptyList();
      private com.google.protobuf.RepeatedFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder> receiverChainsBuilder_;
      // optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;
      private com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange pendingKeyExchange_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchangeOrBuilder> pendingKeyExchangeBuilder_;
      // optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;
      private com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey pendingPreKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKeyOrBuilder> pendingPreKeyBuilder_;
      // optional uint32 remoteRegistrationId = 10;
      private int remoteRegistrationId_;
      // optional uint32 localRegistrationId = 11;
      private int localRegistrationId_;
      // optional bool needsRefresh = 12;
      private boolean needsRefresh_;
      // optional bytes aliceBaseKey = 13;
      private com.google.protobuf.ByteString aliceBaseKey_ = com.google.protobuf.ByteString.EMPTY;

      // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.newBuilder()
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
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getSenderChainFieldBuilder();
          getReceiverChainsFieldBuilder();
          getPendingKeyExchangeFieldBuilder();
          getPendingPreKeyFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        sessionVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        localIdentityPublic_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        remoteIdentityPublic_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        rootKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        previousCounter_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        if (senderChainBuilder_ == null) {
          senderChain_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.getDefaultInstance();
        } else {
          senderChainBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        if (receiverChainsBuilder_ == null) {
          receiverChains_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          receiverChainsBuilder_.clear();
        }
        if (pendingKeyExchangeBuilder_ == null) {
          pendingKeyExchange_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.getDefaultInstance();
        } else {
          pendingKeyExchangeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        if (pendingPreKeyBuilder_ == null) {
          pendingPreKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.getDefaultInstance();
        } else {
          pendingPreKeyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        remoteRegistrationId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        localRegistrationId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000400);
        needsRefresh_ = false;
        bitField0_ = (bitField0_ & ~0x00000800);
        aliceBaseKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00001000);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SessionStructure_descriptor;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure build() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure buildPartial() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sessionVersion_ = sessionVersion_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.localIdentityPublic_ = localIdentityPublic_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.remoteIdentityPublic_ = remoteIdentityPublic_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.rootKey_ = rootKey_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.previousCounter_ = previousCounter_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        if (senderChainBuilder_ == null) {
          result.senderChain_ = senderChain_;
        } else {
          result.senderChain_ = senderChainBuilder_.build();
        }
        if (receiverChainsBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040)) {
            receiverChains_ = java.util.Collections.unmodifiableList(receiverChains_);
            bitField0_ = (bitField0_ & ~0x00000040);
          }
          result.receiverChains_ = receiverChains_;
        } else {
          result.receiverChains_ = receiverChainsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000040;
        }
        if (pendingKeyExchangeBuilder_ == null) {
          result.pendingKeyExchange_ = pendingKeyExchange_;
        } else {
          result.pendingKeyExchange_ = pendingKeyExchangeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000080;
        }
        if (pendingPreKeyBuilder_ == null) {
          result.pendingPreKey_ = pendingPreKey_;
        } else {
          result.pendingPreKey_ = pendingPreKeyBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000100;
        }
        result.remoteRegistrationId_ = remoteRegistrationId_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000200;
        }
        result.localRegistrationId_ = localRegistrationId_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000400;
        }
        result.needsRefresh_ = needsRefresh_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00000800;
        }
        result.aliceBaseKey_ = aliceBaseKey_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure) {
          return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure other) {
        if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.getDefaultInstance())
          return this;
        if (other.hasSessionVersion()) {
          setSessionVersion(other.getSessionVersion());
        }
        if (other.hasLocalIdentityPublic()) {
          setLocalIdentityPublic(other.getLocalIdentityPublic());
        }
        if (other.hasRemoteIdentityPublic()) {
          setRemoteIdentityPublic(other.getRemoteIdentityPublic());
        }
        if (other.hasRootKey()) {
          setRootKey(other.getRootKey());
        }
        if (other.hasPreviousCounter()) {
          setPreviousCounter(other.getPreviousCounter());
        }
        if (other.hasSenderChain()) {
          mergeSenderChain(other.getSenderChain());
        }
        if (receiverChainsBuilder_ == null) {
          if (!other.receiverChains_.isEmpty()) {
            if (receiverChains_.isEmpty()) {
              receiverChains_ = other.receiverChains_;
              bitField0_ = (bitField0_ & ~0x00000040);
            } else {
              ensureReceiverChainsIsMutable();
              receiverChains_.addAll(other.receiverChains_);
            }
            onChanged();
          }
        } else {
          if (!other.receiverChains_.isEmpty()) {
            if (receiverChainsBuilder_.isEmpty()) {
              receiverChainsBuilder_.dispose();
              receiverChainsBuilder_ = null;
              receiverChains_ = other.receiverChains_;
              bitField0_ = (bitField0_ & ~0x00000040);
              receiverChainsBuilder_ =
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
              getReceiverChainsFieldBuilder() : null;
            } else {
              receiverChainsBuilder_.addAllMessages(other.receiverChains_);
            }
          }
        }
        if (other.hasPendingKeyExchange()) {
          mergePendingKeyExchange(other.getPendingKeyExchange());
        }
        if (other.hasPendingPreKey()) {
          mergePendingPreKey(other.getPendingPreKey());
        }
        if (other.hasRemoteRegistrationId()) {
          setRemoteRegistrationId(other.getRemoteRegistrationId());
        }
        if (other.hasLocalRegistrationId()) {
          setLocalRegistrationId(other.getLocalRegistrationId());
        }
        if (other.hasNeedsRefresh()) {
          setNeedsRefresh(other.getNeedsRefresh());
        }
        if (other.hasAliceBaseKey()) {
          setAliceBaseKey(other.getAliceBaseKey());
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
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>optional uint32 sessionVersion = 1;</code>
       */
      public boolean hasSessionVersion() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 sessionVersion = 1;</code>
       */
      public int getSessionVersion() {
        return sessionVersion_;
      }

      /**
       * <code>optional uint32 sessionVersion = 1;</code>
       */
      public Builder setSessionVersion(int value) {
        bitField0_ |= 0x00000001;
        sessionVersion_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 sessionVersion = 1;</code>
       */
      public Builder clearSessionVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sessionVersion_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes localIdentityPublic = 2;</code>
       */
      public boolean hasLocalIdentityPublic() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes localIdentityPublic = 2;</code>
       */
      public com.google.protobuf.ByteString getLocalIdentityPublic() {
        return localIdentityPublic_;
      }

      /**
       * <code>optional bytes localIdentityPublic = 2;</code>
       */
      public Builder setLocalIdentityPublic(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        localIdentityPublic_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes localIdentityPublic = 2;</code>
       */
      public Builder clearLocalIdentityPublic() {
        bitField0_ = (bitField0_ & ~0x00000002);
        localIdentityPublic_ = getDefaultInstance().getLocalIdentityPublic();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes remoteIdentityPublic = 3;</code>
       */
      public boolean hasRemoteIdentityPublic() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional bytes remoteIdentityPublic = 3;</code>
       */
      public com.google.protobuf.ByteString getRemoteIdentityPublic() {
        return remoteIdentityPublic_;
      }

      /**
       * <code>optional bytes remoteIdentityPublic = 3;</code>
       */
      public Builder setRemoteIdentityPublic(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        remoteIdentityPublic_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes remoteIdentityPublic = 3;</code>
       */
      public Builder clearRemoteIdentityPublic() {
        bitField0_ = (bitField0_ & ~0x00000004);
        remoteIdentityPublic_ = getDefaultInstance().getRemoteIdentityPublic();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes rootKey = 4;</code>
       */
      public boolean hasRootKey() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional bytes rootKey = 4;</code>
       */
      public com.google.protobuf.ByteString getRootKey() {
        return rootKey_;
      }

      /**
       * <code>optional bytes rootKey = 4;</code>
       */
      public Builder setRootKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        rootKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes rootKey = 4;</code>
       */
      public Builder clearRootKey() {
        bitField0_ = (bitField0_ & ~0x00000008);
        rootKey_ = getDefaultInstance().getRootKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 previousCounter = 5;</code>
       */
      public boolean hasPreviousCounter() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional uint32 previousCounter = 5;</code>
       */
      public int getPreviousCounter() {
        return previousCounter_;
      }

      /**
       * <code>optional uint32 previousCounter = 5;</code>
       */
      public Builder setPreviousCounter(int value) {
        bitField0_ |= 0x00000010;
        previousCounter_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 previousCounter = 5;</code>
       */
      public Builder clearPreviousCounter() {
        bitField0_ = (bitField0_ & ~0x00000010);
        previousCounter_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
       */
      public boolean hasSenderChain() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain getSenderChain() {
        if (senderChainBuilder_ == null) {
          return senderChain_;
        } else {
          return senderChainBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
       */
      public Builder setSenderChain(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder builderForValue) {
        if (senderChainBuilder_ == null) {
          senderChain_ = builderForValue.build();
          onChanged();
        } else {
          senderChainBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
       */
      public Builder setSenderChain(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain value) {
        if (senderChainBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          senderChain_ = value;
          onChanged();
        } else {
          senderChainBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
       */
      public Builder mergeSenderChain(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain value) {
        if (senderChainBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020) &&
          senderChain_ != com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.getDefaultInstance()) {
            senderChain_ =
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.newBuilder(senderChain_).mergeFrom(value).buildPartial();
          } else {
            senderChain_ = value;
          }
          onChanged();
        } else {
          senderChainBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
       */
      public Builder clearSenderChain() {
        if (senderChainBuilder_ == null) {
          senderChain_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.getDefaultInstance();
          onChanged();
        } else {
          senderChainBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder getSenderChainBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getSenderChainFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder getSenderChainOrBuilder() {
        if (senderChainBuilder_ != null) {
          return senderChainBuilder_.getMessageOrBuilder();
        } else {
          return senderChain_;
        }
      }

      /**
       * <code>optional .textsecure.SessionStructure.Chain senderChain = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder>
      getSenderChainFieldBuilder() {
        if (senderChainBuilder_ == null) {
          senderChainBuilder_ = new com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder>(
          senderChain_,
          getParentForChildren(),
          isClean());
          senderChain_ = null;
        }
        return senderChainBuilder_;
      }

      private void ensureReceiverChainsIsMutable() {
        if (!((bitField0_ & 0x00000040) == 0x00000040)) {
          receiverChains_ = new java.util.ArrayList<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain>(receiverChains_);
          bitField0_ |= 0x00000040;
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain> getReceiverChainsList() {
        if (receiverChainsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(receiverChains_);
        } else {
          return receiverChainsBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public int getReceiverChainsCount() {
        if (receiverChainsBuilder_ == null) {
          return receiverChains_.size();
        } else {
          return receiverChainsBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain getReceiverChains(int index) {
        if (receiverChainsBuilder_ == null) {
          return receiverChains_.get(index);
        } else {
          return receiverChainsBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public Builder setReceiverChains(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain value) {
        if (receiverChainsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReceiverChainsIsMutable();
          receiverChains_.set(index, value);
          onChanged();
        } else {
          receiverChainsBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public Builder setReceiverChains(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder builderForValue) {
        if (receiverChainsBuilder_ == null) {
          ensureReceiverChainsIsMutable();
          receiverChains_.set(index, builderForValue.build());
          onChanged();
        } else {
          receiverChainsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public Builder addReceiverChains(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain value) {
        if (receiverChainsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReceiverChainsIsMutable();
          receiverChains_.add(value);
          onChanged();
        } else {
          receiverChainsBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public Builder addReceiverChains(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain value) {
        if (receiverChainsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReceiverChainsIsMutable();
          receiverChains_.add(index, value);
          onChanged();
        } else {
          receiverChainsBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public Builder addReceiverChains(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder builderForValue) {
        if (receiverChainsBuilder_ == null) {
          ensureReceiverChainsIsMutable();
          receiverChains_.add(builderForValue.build());
          onChanged();
        } else {
          receiverChainsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public Builder addReceiverChains(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder builderForValue) {
        if (receiverChainsBuilder_ == null) {
          ensureReceiverChainsIsMutable();
          receiverChains_.add(index, builderForValue.build());
          onChanged();
        } else {
          receiverChainsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public Builder addAllReceiverChains(
      Iterable<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain> values) {
        if (receiverChainsBuilder_ == null) {
          ensureReceiverChainsIsMutable();
          super.addAll(values, receiverChains_);
          onChanged();
        } else {
          receiverChainsBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public Builder clearReceiverChains() {
        if (receiverChainsBuilder_ == null) {
          receiverChains_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
          onChanged();
        } else {
          receiverChainsBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public Builder removeReceiverChains(int index) {
        if (receiverChainsBuilder_ == null) {
          ensureReceiverChainsIsMutable();
          receiverChains_.remove(index);
          onChanged();
        } else {
          receiverChainsBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder getReceiverChainsBuilder(
      int index) {
        return getReceiverChainsFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder getReceiverChainsOrBuilder(
      int index) {
        if (receiverChainsBuilder_ == null) {
          return receiverChains_.get(index);
        } else {
          return receiverChainsBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder>
      getReceiverChainsOrBuilderList() {
        if (receiverChainsBuilder_ != null) {
          return receiverChainsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(receiverChains_);
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder addReceiverChainsBuilder() {
        return getReceiverChainsFieldBuilder().addBuilder(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.getDefaultInstance());
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder addReceiverChainsBuilder(
      int index) {
        return getReceiverChainsFieldBuilder().addBuilder(
        index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.getDefaultInstance());
      }

      /**
       * <code>repeated .textsecure.SessionStructure.Chain receiverChains = 7;</code>
       */
      public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder>
      getReceiverChainsBuilderList() {
        return getReceiverChainsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder>
      getReceiverChainsFieldBuilder() {
        if (receiverChainsBuilder_ == null) {
          receiverChainsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Chain.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.ChainOrBuilder>(
          receiverChains_,
          ((bitField0_ & 0x00000040) == 0x00000040),
          getParentForChildren(),
          isClean());
          receiverChains_ = null;
        }
        return receiverChainsBuilder_;
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
       */
      public boolean hasPendingKeyExchange() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange getPendingKeyExchange() {
        if (pendingKeyExchangeBuilder_ == null) {
          return pendingKeyExchange_;
        } else {
          return pendingKeyExchangeBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
       */
      public Builder setPendingKeyExchange(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.Builder builderForValue) {
        if (pendingKeyExchangeBuilder_ == null) {
          pendingKeyExchange_ = builderForValue.build();
          onChanged();
        } else {
          pendingKeyExchangeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000080;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
       */
      public Builder setPendingKeyExchange(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange value) {
        if (pendingKeyExchangeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pendingKeyExchange_ = value;
          onChanged();
        } else {
          pendingKeyExchangeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000080;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
       */
      public Builder mergePendingKeyExchange(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange value) {
        if (pendingKeyExchangeBuilder_ == null) {
          if (((bitField0_ & 0x00000080) == 0x00000080) &&
          pendingKeyExchange_ != com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.getDefaultInstance()) {
            pendingKeyExchange_ =
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.newBuilder(pendingKeyExchange_).mergeFrom(value).buildPartial();
          } else {
            pendingKeyExchange_ = value;
          }
          onChanged();
        } else {
          pendingKeyExchangeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000080;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
       */
      public Builder clearPendingKeyExchange() {
        if (pendingKeyExchangeBuilder_ == null) {
          pendingKeyExchange_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.getDefaultInstance();
          onChanged();
        } else {
          pendingKeyExchangeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.Builder getPendingKeyExchangeBuilder() {
        bitField0_ |= 0x00000080;
        onChanged();
        return getPendingKeyExchangeFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchangeOrBuilder getPendingKeyExchangeOrBuilder() {
        if (pendingKeyExchangeBuilder_ != null) {
          return pendingKeyExchangeBuilder_.getMessageOrBuilder();
        } else {
          return pendingKeyExchange_;
        }
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingKeyExchange pendingKeyExchange = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchangeOrBuilder>
      getPendingKeyExchangeFieldBuilder() {
        if (pendingKeyExchangeBuilder_ == null) {
          pendingKeyExchangeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchange.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingKeyExchangeOrBuilder>(
          pendingKeyExchange_,
          getParentForChildren(),
          isClean());
          pendingKeyExchange_ = null;
        }
        return pendingKeyExchangeBuilder_;
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
       */
      public boolean hasPendingPreKey() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey getPendingPreKey() {
        if (pendingPreKeyBuilder_ == null) {
          return pendingPreKey_;
        } else {
          return pendingPreKeyBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
       */
      public Builder setPendingPreKey(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.Builder builderForValue) {
        if (pendingPreKeyBuilder_ == null) {
          pendingPreKey_ = builderForValue.build();
          onChanged();
        } else {
          pendingPreKeyBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000100;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
       */
      public Builder setPendingPreKey(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey value) {
        if (pendingPreKeyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pendingPreKey_ = value;
          onChanged();
        } else {
          pendingPreKeyBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000100;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
       */
      public Builder mergePendingPreKey(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey value) {
        if (pendingPreKeyBuilder_ == null) {
          if (((bitField0_ & 0x00000100) == 0x00000100) &&
          pendingPreKey_ != com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.getDefaultInstance()) {
            pendingPreKey_ =
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.newBuilder(pendingPreKey_).mergeFrom(value).buildPartial();
          } else {
            pendingPreKey_ = value;
          }
          onChanged();
        } else {
          pendingPreKeyBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000100;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
       */
      public Builder clearPendingPreKey() {
        if (pendingPreKeyBuilder_ == null) {
          pendingPreKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.getDefaultInstance();
          onChanged();
        } else {
          pendingPreKeyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.Builder getPendingPreKeyBuilder() {
        bitField0_ |= 0x00000100;
        onChanged();
        return getPendingPreKeyFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKeyOrBuilder getPendingPreKeyOrBuilder() {
        if (pendingPreKeyBuilder_ != null) {
          return pendingPreKeyBuilder_.getMessageOrBuilder();
        } else {
          return pendingPreKey_;
        }
      }

      /**
       * <code>optional .textsecure.SessionStructure.PendingPreKey pendingPreKey = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKeyOrBuilder>
      getPendingPreKeyFieldBuilder() {
        if (pendingPreKeyBuilder_ == null) {
          pendingPreKeyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PendingPreKeyOrBuilder>(
          pendingPreKey_,
          getParentForChildren(),
          isClean());
          pendingPreKey_ = null;
        }
        return pendingPreKeyBuilder_;
      }

      /**
       * <code>optional uint32 remoteRegistrationId = 10;</code>
       */
      public boolean hasRemoteRegistrationId() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }

      /**
       * <code>optional uint32 remoteRegistrationId = 10;</code>
       */
      public int getRemoteRegistrationId() {
        return remoteRegistrationId_;
      }

      /**
       * <code>optional uint32 remoteRegistrationId = 10;</code>
       */
      public Builder setRemoteRegistrationId(int value) {
        bitField0_ |= 0x00000200;
        remoteRegistrationId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 remoteRegistrationId = 10;</code>
       */
      public Builder clearRemoteRegistrationId() {
        bitField0_ = (bitField0_ & ~0x00000200);
        remoteRegistrationId_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 localRegistrationId = 11;</code>
       */
      public boolean hasLocalRegistrationId() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }

      /**
       * <code>optional uint32 localRegistrationId = 11;</code>
       */
      public int getLocalRegistrationId() {
        return localRegistrationId_;
      }

      /**
       * <code>optional uint32 localRegistrationId = 11;</code>
       */
      public Builder setLocalRegistrationId(int value) {
        bitField0_ |= 0x00000400;
        localRegistrationId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 localRegistrationId = 11;</code>
       */
      public Builder clearLocalRegistrationId() {
        bitField0_ = (bitField0_ & ~0x00000400);
        localRegistrationId_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional bool needsRefresh = 12;</code>
       */
      public boolean hasNeedsRefresh() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }

      /**
       * <code>optional bool needsRefresh = 12;</code>
       */
      public boolean getNeedsRefresh() {
        return needsRefresh_;
      }

      /**
       * <code>optional bool needsRefresh = 12;</code>
       */
      public Builder setNeedsRefresh(boolean value) {
        bitField0_ |= 0x00000800;
        needsRefresh_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bool needsRefresh = 12;</code>
       */
      public Builder clearNeedsRefresh() {
        bitField0_ = (bitField0_ & ~0x00000800);
        needsRefresh_ = false;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes aliceBaseKey = 13;</code>
       */
      public boolean hasAliceBaseKey() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }

      /**
       * <code>optional bytes aliceBaseKey = 13;</code>
       */
      public com.google.protobuf.ByteString getAliceBaseKey() {
        return aliceBaseKey_;
      }

      /**
       * <code>optional bytes aliceBaseKey = 13;</code>
       */
      public Builder setAliceBaseKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00001000;
        aliceBaseKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes aliceBaseKey = 13;</code>
       */
      public Builder clearAliceBaseKey() {
        bitField0_ = (bitField0_ & ~0x00001000);
        aliceBaseKey_ = getDefaultInstance().getAliceBaseKey();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.SessionStructure)
    }

    // @@protoc_insertion_point(class_scope:textsecure.SessionStructure)
  }

  /**
   * Protobuf type {@code textsecure.RecordStructure}
   */
  public static final class RecordStructure extends
  com.google.protobuf.GeneratedMessage
  implements RecordStructureOrBuilder {
    // optional .textsecure.SessionStructure currentSession = 1;
    public static final int CURRENTSESSION_FIELD_NUMBER = 1;
    // repeated .textsecure.SessionStructure previousSessions = 2;
    public static final int PREVIOUSSESSIONS_FIELD_NUMBER = 2;
    private static final RecordStructure defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<RecordStructure> PARSER =
    new com.google.protobuf.AbstractParser<RecordStructure>() {
      public RecordStructure parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new RecordStructure(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new RecordStructure(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure currentSession_;
    private java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure> previousSessions_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;

    // Use RecordStructure.newBuilder() to construct.
    private RecordStructure(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RecordStructure(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private RecordStructure(
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
              com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = currentSession_.toBuilder();
              }
              currentSession_ = input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(currentSession_);
                currentSession_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                previousSessions_ = new java.util.ArrayList<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure>();
                mutable_bitField0_ |= 0x00000002;
              }
              previousSessions_.add(input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.PARSER, extensionRegistry));
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
          previousSessions_ = java.util.Collections.unmodifiableList(previousSessions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static RecordStructure getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_RecordStructure_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public RecordStructure getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_RecordStructure_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<RecordStructure> getParserForType() {
      return PARSER;
    }

    /**
     * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
     */
    public boolean hasCurrentSession() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure getCurrentSession() {
      return currentSession_;
    }

    /**
     * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder getCurrentSessionOrBuilder() {
      return currentSession_;
    }

    /**
     * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
     */
    public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure> getPreviousSessionsList() {
      return previousSessions_;
    }

    /**
     * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
     */
    public java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder>
    getPreviousSessionsOrBuilderList() {
      return previousSessions_;
    }

    /**
     * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
     */
    public int getPreviousSessionsCount() {
      return previousSessions_.size();
    }

    /**
     * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure getPreviousSessions(int index) {
      return previousSessions_.get(index);
    }

    /**
     * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder getPreviousSessionsOrBuilder(
    int index) {
      return previousSessions_.get(index);
    }

    private void initFields() {
      currentSession_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.getDefaultInstance();
      previousSessions_ = java.util.Collections.emptyList();
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
        output.writeMessage(1, currentSession_);
      }
      for (int i = 0; i < previousSessions_.size(); i++) {
        output.writeMessage(2, previousSessions_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, currentSession_);
      }
      for (int i = 0; i < previousSessions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, previousSessions_.get(i));
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
     * Protobuf type {@code textsecure.RecordStructure}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructureOrBuilder {
      private int bitField0_;
      // optional .textsecure.SessionStructure currentSession = 1;
      private com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure currentSession_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder> currentSessionBuilder_;
      // repeated .textsecure.SessionStructure previousSessions = 2;
      private java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure> previousSessions_ =
      java.util.Collections.emptyList();
      private com.google.protobuf.RepeatedFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder> previousSessionsBuilder_;

      // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure.newBuilder()
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
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_RecordStructure_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_RecordStructure_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getCurrentSessionFieldBuilder();
          getPreviousSessionsFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        if (currentSessionBuilder_ == null) {
          currentSession_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.getDefaultInstance();
        } else {
          currentSessionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (previousSessionsBuilder_ == null) {
          previousSessions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          previousSessionsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_RecordStructure_descriptor;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure build() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure buildPartial() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure result = new com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (currentSessionBuilder_ == null) {
          result.currentSession_ = currentSession_;
        } else {
          result.currentSession_ = currentSessionBuilder_.build();
        }
        if (previousSessionsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            previousSessions_ = java.util.Collections.unmodifiableList(previousSessions_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.previousSessions_ = previousSessions_;
        } else {
          result.previousSessions_ = previousSessionsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure) {
          return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure other) {
        if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure.getDefaultInstance())
          return this;
        if (other.hasCurrentSession()) {
          mergeCurrentSession(other.getCurrentSession());
        }
        if (previousSessionsBuilder_ == null) {
          if (!other.previousSessions_.isEmpty()) {
            if (previousSessions_.isEmpty()) {
              previousSessions_ = other.previousSessions_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensurePreviousSessionsIsMutable();
              previousSessions_.addAll(other.previousSessions_);
            }
            onChanged();
          }
        } else {
          if (!other.previousSessions_.isEmpty()) {
            if (previousSessionsBuilder_.isEmpty()) {
              previousSessionsBuilder_.dispose();
              previousSessionsBuilder_ = null;
              previousSessions_ = other.previousSessions_;
              bitField0_ = (bitField0_ & ~0x00000002);
              previousSessionsBuilder_ =
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
              getPreviousSessionsFieldBuilder() : null;
            } else {
              previousSessionsBuilder_.addAllMessages(other.previousSessions_);
            }
          }
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
        com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.RecordStructure) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
       */
      public boolean hasCurrentSession() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure getCurrentSession() {
        if (currentSessionBuilder_ == null) {
          return currentSession_;
        } else {
          return currentSessionBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
       */
      public Builder setCurrentSession(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder builderForValue) {
        if (currentSessionBuilder_ == null) {
          currentSession_ = builderForValue.build();
          onChanged();
        } else {
          currentSessionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
       */
      public Builder setCurrentSession(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure value) {
        if (currentSessionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          currentSession_ = value;
          onChanged();
        } else {
          currentSessionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
       */
      public Builder mergeCurrentSession(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure value) {
        if (currentSessionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
          currentSession_ != com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.getDefaultInstance()) {
            currentSession_ =
            com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.newBuilder(currentSession_).mergeFrom(value).buildPartial();
          } else {
            currentSession_ = value;
          }
          onChanged();
        } else {
          currentSessionBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
       */
      public Builder clearCurrentSession() {
        if (currentSessionBuilder_ == null) {
          currentSession_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.getDefaultInstance();
          onChanged();
        } else {
          currentSessionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      /**
       * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder getCurrentSessionBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCurrentSessionFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder getCurrentSessionOrBuilder() {
        if (currentSessionBuilder_ != null) {
          return currentSessionBuilder_.getMessageOrBuilder();
        } else {
          return currentSession_;
        }
      }

      /**
       * <code>optional .textsecure.SessionStructure currentSession = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder>
      getCurrentSessionFieldBuilder() {
        if (currentSessionBuilder_ == null) {
          currentSessionBuilder_ = new com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder>(
          currentSession_,
          getParentForChildren(),
          isClean());
          currentSession_ = null;
        }
        return currentSessionBuilder_;
      }

      private void ensurePreviousSessionsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          previousSessions_ = new java.util.ArrayList<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure>(previousSessions_);
          bitField0_ |= 0x00000002;
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure> getPreviousSessionsList() {
        if (previousSessionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(previousSessions_);
        } else {
          return previousSessionsBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public int getPreviousSessionsCount() {
        if (previousSessionsBuilder_ == null) {
          return previousSessions_.size();
        } else {
          return previousSessionsBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure getPreviousSessions(int index) {
        if (previousSessionsBuilder_ == null) {
          return previousSessions_.get(index);
        } else {
          return previousSessionsBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public Builder setPreviousSessions(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure value) {
        if (previousSessionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePreviousSessionsIsMutable();
          previousSessions_.set(index, value);
          onChanged();
        } else {
          previousSessionsBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public Builder setPreviousSessions(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder builderForValue) {
        if (previousSessionsBuilder_ == null) {
          ensurePreviousSessionsIsMutable();
          previousSessions_.set(index, builderForValue.build());
          onChanged();
        } else {
          previousSessionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public Builder addPreviousSessions(com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure value) {
        if (previousSessionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePreviousSessionsIsMutable();
          previousSessions_.add(value);
          onChanged();
        } else {
          previousSessionsBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public Builder addPreviousSessions(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure value) {
        if (previousSessionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePreviousSessionsIsMutable();
          previousSessions_.add(index, value);
          onChanged();
        } else {
          previousSessionsBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public Builder addPreviousSessions(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder builderForValue) {
        if (previousSessionsBuilder_ == null) {
          ensurePreviousSessionsIsMutable();
          previousSessions_.add(builderForValue.build());
          onChanged();
        } else {
          previousSessionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public Builder addPreviousSessions(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder builderForValue) {
        if (previousSessionsBuilder_ == null) {
          ensurePreviousSessionsIsMutable();
          previousSessions_.add(index, builderForValue.build());
          onChanged();
        } else {
          previousSessionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public Builder addAllPreviousSessions(
      Iterable<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure> values) {
        if (previousSessionsBuilder_ == null) {
          ensurePreviousSessionsIsMutable();
          super.addAll(values, previousSessions_);
          onChanged();
        } else {
          previousSessionsBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public Builder clearPreviousSessions() {
        if (previousSessionsBuilder_ == null) {
          previousSessions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          previousSessionsBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public Builder removePreviousSessions(int index) {
        if (previousSessionsBuilder_ == null) {
          ensurePreviousSessionsIsMutable();
          previousSessions_.remove(index);
          onChanged();
        } else {
          previousSessionsBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder getPreviousSessionsBuilder(
      int index) {
        return getPreviousSessionsFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder getPreviousSessionsOrBuilder(
      int index) {
        if (previousSessionsBuilder_ == null) {
          return previousSessions_.get(index);
        } else {
          return previousSessionsBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder>
      getPreviousSessionsOrBuilderList() {
        if (previousSessionsBuilder_ != null) {
          return previousSessionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(previousSessions_);
        }
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder addPreviousSessionsBuilder() {
        return getPreviousSessionsFieldBuilder().addBuilder(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.getDefaultInstance());
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder addPreviousSessionsBuilder(
      int index) {
        return getPreviousSessionsFieldBuilder().addBuilder(
        index, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.getDefaultInstance());
      }

      /**
       * <code>repeated .textsecure.SessionStructure previousSessions = 2;</code>
       */
      public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder>
      getPreviousSessionsBuilderList() {
        return getPreviousSessionsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder>
      getPreviousSessionsFieldBuilder() {
        if (previousSessionsBuilder_ == null) {
          previousSessionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
          com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructure.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SessionStructureOrBuilder>(
          previousSessions_,
          ((bitField0_ & 0x00000002) == 0x00000002),
          getParentForChildren(),
          isClean());
          previousSessions_ = null;
        }
        return previousSessionsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.RecordStructure)
    }

    // @@protoc_insertion_point(class_scope:textsecure.RecordStructure)
  }

  /**
   * Protobuf type {@code textsecure.PreKeyRecordStructure}
   */
  public static final class PreKeyRecordStructure extends
  com.google.protobuf.GeneratedMessage
  implements PreKeyRecordStructureOrBuilder {
    // optional uint32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    // optional bytes publicKey = 2;
    public static final int PUBLICKEY_FIELD_NUMBER = 2;
    // optional bytes privateKey = 3;
    public static final int PRIVATEKEY_FIELD_NUMBER = 3;
    private static final PreKeyRecordStructure defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<PreKeyRecordStructure> PARSER =
    new com.google.protobuf.AbstractParser<PreKeyRecordStructure>() {
      public PreKeyRecordStructure parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new PreKeyRecordStructure(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new PreKeyRecordStructure(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private int id_;
    private com.google.protobuf.ByteString publicKey_;
    private com.google.protobuf.ByteString privateKey_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;
    // Use PreKeyRecordStructure.newBuilder() to construct.
    private PreKeyRecordStructure(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private PreKeyRecordStructure(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private PreKeyRecordStructure(
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
              publicKey_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              privateKey_ = input.readBytes();
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

    public static PreKeyRecordStructure getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_PreKeyRecordStructure_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public PreKeyRecordStructure getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_PreKeyRecordStructure_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<PreKeyRecordStructure> getParserForType() {
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
     * <code>optional bytes publicKey = 2;</code>
     */
    public boolean hasPublicKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional bytes publicKey = 2;</code>
     */
    public com.google.protobuf.ByteString getPublicKey() {
      return publicKey_;
    }

    /**
     * <code>optional bytes privateKey = 3;</code>
     */
    public boolean hasPrivateKey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional bytes privateKey = 3;</code>
     */
    public com.google.protobuf.ByteString getPrivateKey() {
      return privateKey_;
    }

    private void initFields() {
      id_ = 0;
      publicKey_ = com.google.protobuf.ByteString.EMPTY;
      privateKey_ = com.google.protobuf.ByteString.EMPTY;
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
        output.writeBytes(2, publicKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, privateKey_);
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
        .computeBytesSize(2, publicKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, privateKey_);
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
     * Protobuf type {@code textsecure.PreKeyRecordStructure}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructureOrBuilder {
      private int bitField0_;
      // optional uint32 id = 1;
      private int id_;
      // optional bytes publicKey = 2;
      private com.google.protobuf.ByteString publicKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes privateKey = 3;
      private com.google.protobuf.ByteString privateKey_ = com.google.protobuf.ByteString.EMPTY;

      // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure.newBuilder()
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
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_PreKeyRecordStructure_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_PreKeyRecordStructure_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        publicKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        privateKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_PreKeyRecordStructure_descriptor;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure build() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure buildPartial() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure result = new com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.publicKey_ = publicKey_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.privateKey_ = privateKey_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure) {
          return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure other) {
        if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure.getDefaultInstance())
          return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasPublicKey()) {
          setPublicKey(other.getPublicKey());
        }
        if (other.hasPrivateKey()) {
          setPrivateKey(other.getPrivateKey());
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
        com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.PreKeyRecordStructure) e.getUnfinishedMessage();
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
       * <code>optional bytes publicKey = 2;</code>
       */
      public boolean hasPublicKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes publicKey = 2;</code>
       */
      public com.google.protobuf.ByteString getPublicKey() {
        return publicKey_;
      }

      /**
       * <code>optional bytes publicKey = 2;</code>
       */
      public Builder setPublicKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        publicKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes publicKey = 2;</code>
       */
      public Builder clearPublicKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        publicKey_ = getDefaultInstance().getPublicKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes privateKey = 3;</code>
       */
      public boolean hasPrivateKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional bytes privateKey = 3;</code>
       */
      public com.google.protobuf.ByteString getPrivateKey() {
        return privateKey_;
      }

      /**
       * <code>optional bytes privateKey = 3;</code>
       */
      public Builder setPrivateKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        privateKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes privateKey = 3;</code>
       */
      public Builder clearPrivateKey() {
        bitField0_ = (bitField0_ & ~0x00000004);
        privateKey_ = getDefaultInstance().getPrivateKey();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.PreKeyRecordStructure)
    }

    // @@protoc_insertion_point(class_scope:textsecure.PreKeyRecordStructure)
  }

  /**
   * Protobuf type {@code textsecure.SignedPreKeyRecordStructure}
   */
  public static final class SignedPreKeyRecordStructure extends
  com.google.protobuf.GeneratedMessage
  implements SignedPreKeyRecordStructureOrBuilder {
    // optional uint32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    // optional bytes publicKey = 2;
    public static final int PUBLICKEY_FIELD_NUMBER = 2;
    // optional bytes privateKey = 3;
    public static final int PRIVATEKEY_FIELD_NUMBER = 3;
    // optional bytes signature = 4;
    public static final int SIGNATURE_FIELD_NUMBER = 4;
    // optional fixed64 timestamp = 5;
    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    private static final SignedPreKeyRecordStructure defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<SignedPreKeyRecordStructure> PARSER =
    new com.google.protobuf.AbstractParser<SignedPreKeyRecordStructure>() {
      public SignedPreKeyRecordStructure parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new SignedPreKeyRecordStructure(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new SignedPreKeyRecordStructure(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private int id_;
    private com.google.protobuf.ByteString publicKey_;
    private com.google.protobuf.ByteString privateKey_;
    private com.google.protobuf.ByteString signature_;
    private long timestamp_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;
    // Use SignedPreKeyRecordStructure.newBuilder() to construct.
    private SignedPreKeyRecordStructure(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private SignedPreKeyRecordStructure(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private SignedPreKeyRecordStructure(
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
              publicKey_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              privateKey_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              signature_ = input.readBytes();
              break;
            }
            case 41: {
              bitField0_ |= 0x00000010;
              timestamp_ = input.readFixed64();
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

    public static SignedPreKeyRecordStructure getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SignedPreKeyRecordStructure_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public SignedPreKeyRecordStructure getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SignedPreKeyRecordStructure_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<SignedPreKeyRecordStructure> getParserForType() {
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
     * <code>optional bytes publicKey = 2;</code>
     */
    public boolean hasPublicKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional bytes publicKey = 2;</code>
     */
    public com.google.protobuf.ByteString getPublicKey() {
      return publicKey_;
    }

    /**
     * <code>optional bytes privateKey = 3;</code>
     */
    public boolean hasPrivateKey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional bytes privateKey = 3;</code>
     */
    public com.google.protobuf.ByteString getPrivateKey() {
      return privateKey_;
    }

    /**
     * <code>optional bytes signature = 4;</code>
     */
    public boolean hasSignature() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional bytes signature = 4;</code>
     */
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }

    /**
     * <code>optional fixed64 timestamp = 5;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional fixed64 timestamp = 5;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    private void initFields() {
      id_ = 0;
      publicKey_ = com.google.protobuf.ByteString.EMPTY;
      privateKey_ = com.google.protobuf.ByteString.EMPTY;
      signature_ = com.google.protobuf.ByteString.EMPTY;
      timestamp_ = 0L;
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
        output.writeBytes(2, publicKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, privateKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, signature_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeFixed64(5, timestamp_);
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
        .computeBytesSize(2, publicKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, privateKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, signature_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(5, timestamp_);
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
     * Protobuf type {@code textsecure.SignedPreKeyRecordStructure}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructureOrBuilder {
      private int bitField0_;
      // optional uint32 id = 1;
      private int id_;
      // optional bytes publicKey = 2;
      private com.google.protobuf.ByteString publicKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes privateKey = 3;
      private com.google.protobuf.ByteString privateKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes signature = 4;
      private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
      // optional fixed64 timestamp = 5;
      private long timestamp_;

      // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure.newBuilder()
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
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SignedPreKeyRecordStructure_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SignedPreKeyRecordStructure_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        publicKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        privateKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        signature_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SignedPreKeyRecordStructure_descriptor;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure build() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure buildPartial() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.publicKey_ = publicKey_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.privateKey_ = privateKey_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.signature_ = signature_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.timestamp_ = timestamp_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure) {
          return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure other) {
        if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure.getDefaultInstance())
          return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasPublicKey()) {
          setPublicKey(other.getPublicKey());
        }
        if (other.hasPrivateKey()) {
          setPrivateKey(other.getPrivateKey());
        }
        if (other.hasSignature()) {
          setSignature(other.getSignature());
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
        com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SignedPreKeyRecordStructure) e.getUnfinishedMessage();
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
       * <code>optional bytes publicKey = 2;</code>
       */
      public boolean hasPublicKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes publicKey = 2;</code>
       */
      public com.google.protobuf.ByteString getPublicKey() {
        return publicKey_;
      }

      /**
       * <code>optional bytes publicKey = 2;</code>
       */
      public Builder setPublicKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        publicKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes publicKey = 2;</code>
       */
      public Builder clearPublicKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        publicKey_ = getDefaultInstance().getPublicKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes privateKey = 3;</code>
       */
      public boolean hasPrivateKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional bytes privateKey = 3;</code>
       */
      public com.google.protobuf.ByteString getPrivateKey() {
        return privateKey_;
      }

      /**
       * <code>optional bytes privateKey = 3;</code>
       */
      public Builder setPrivateKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        privateKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes privateKey = 3;</code>
       */
      public Builder clearPrivateKey() {
        bitField0_ = (bitField0_ & ~0x00000004);
        privateKey_ = getDefaultInstance().getPrivateKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes signature = 4;</code>
       */
      public boolean hasSignature() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional bytes signature = 4;</code>
       */
      public com.google.protobuf.ByteString getSignature() {
        return signature_;
      }

      /**
       * <code>optional bytes signature = 4;</code>
       */
      public Builder setSignature(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        signature_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes signature = 4;</code>
       */
      public Builder clearSignature() {
        bitField0_ = (bitField0_ & ~0x00000008);
        signature_ = getDefaultInstance().getSignature();
        onChanged();
        return this;
      }

      /**
       * <code>optional fixed64 timestamp = 5;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional fixed64 timestamp = 5;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }

      /**
       * <code>optional fixed64 timestamp = 5;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000010;
        timestamp_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional fixed64 timestamp = 5;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000010);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.SignedPreKeyRecordStructure)
    }

    // @@protoc_insertion_point(class_scope:textsecure.SignedPreKeyRecordStructure)
  }

  /**
   * Protobuf type {@code textsecure.IdentityKeyPairStructure}
   */
  public static final class IdentityKeyPairStructure extends
  com.google.protobuf.GeneratedMessage
  implements IdentityKeyPairStructureOrBuilder {
    // optional bytes publicKey = 1;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    // optional bytes privateKey = 2;
    public static final int PRIVATEKEY_FIELD_NUMBER = 2;
    private static final IdentityKeyPairStructure defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<IdentityKeyPairStructure> PARSER =
    new com.google.protobuf.AbstractParser<IdentityKeyPairStructure>() {
      public IdentityKeyPairStructure parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new IdentityKeyPairStructure(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new IdentityKeyPairStructure(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private com.google.protobuf.ByteString publicKey_;
    private com.google.protobuf.ByteString privateKey_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;

    // Use IdentityKeyPairStructure.newBuilder() to construct.
    private IdentityKeyPairStructure(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private IdentityKeyPairStructure(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private IdentityKeyPairStructure(
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
              publicKey_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              privateKey_ = input.readBytes();
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

    public static IdentityKeyPairStructure getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_IdentityKeyPairStructure_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public IdentityKeyPairStructure getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_IdentityKeyPairStructure_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<IdentityKeyPairStructure> getParserForType() {
      return PARSER;
    }

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
     * <code>optional bytes privateKey = 2;</code>
     */
    public boolean hasPrivateKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional bytes privateKey = 2;</code>
     */
    public com.google.protobuf.ByteString getPrivateKey() {
      return privateKey_;
    }

    private void initFields() {
      publicKey_ = com.google.protobuf.ByteString.EMPTY;
      privateKey_ = com.google.protobuf.ByteString.EMPTY;
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
        output.writeBytes(1, publicKey_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, privateKey_);
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, publicKey_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, privateKey_);
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
     * Protobuf type {@code textsecure.IdentityKeyPairStructure}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructureOrBuilder {
      private int bitField0_;
      // optional bytes publicKey = 1;
      private com.google.protobuf.ByteString publicKey_ = com.google.protobuf.ByteString.EMPTY;
      // optional bytes privateKey = 2;
      private com.google.protobuf.ByteString privateKey_ = com.google.protobuf.ByteString.EMPTY;

      // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure.newBuilder()
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
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_IdentityKeyPairStructure_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_IdentityKeyPairStructure_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        publicKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        privateKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_IdentityKeyPairStructure_descriptor;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure build() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure buildPartial() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure result = new com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.publicKey_ = publicKey_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.privateKey_ = privateKey_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure) {
          return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure other) {
        if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure.getDefaultInstance())
          return this;
        if (other.hasPublicKey()) {
          setPublicKey(other.getPublicKey());
        }
        if (other.hasPrivateKey()) {
          setPrivateKey(other.getPrivateKey());
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
        com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.IdentityKeyPairStructure) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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
        bitField0_ = (bitField0_ & ~0x00000001);
        publicKey_ = getDefaultInstance().getPublicKey();
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes privateKey = 2;</code>
       */
      public boolean hasPrivateKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes privateKey = 2;</code>
       */
      public com.google.protobuf.ByteString getPrivateKey() {
        return privateKey_;
      }

      /**
       * <code>optional bytes privateKey = 2;</code>
       */
      public Builder setPrivateKey(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        privateKey_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes privateKey = 2;</code>
       */
      public Builder clearPrivateKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        privateKey_ = getDefaultInstance().getPrivateKey();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.IdentityKeyPairStructure)
    }

    // @@protoc_insertion_point(class_scope:textsecure.IdentityKeyPairStructure)
  }

  /**
   * Protobuf type {@code textsecure.SenderKeyStateStructure}
   */
  public static final class SenderKeyStateStructure extends
  com.google.protobuf.GeneratedMessage
  implements SenderKeyStateStructureOrBuilder {
    // optional uint32 senderKeyId = 1;
    public static final int SENDERKEYID_FIELD_NUMBER = 1;
    // optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;
    public static final int SENDERCHAINKEY_FIELD_NUMBER = 2;
    // optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;
    public static final int SENDERSIGNINGKEY_FIELD_NUMBER = 3;
    // repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;
    public static final int SENDERMESSAGEKEYS_FIELD_NUMBER = 4;
    private static final SenderKeyStateStructure defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<SenderKeyStateStructure> PARSER =
    new com.google.protobuf.AbstractParser<SenderKeyStateStructure>() {
      public SenderKeyStateStructure parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new SenderKeyStateStructure(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new SenderKeyStateStructure(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private int bitField0_;
    private int senderKeyId_;
    private com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey senderChainKey_;
    private com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey senderSigningKey_;
    private java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey> senderMessageKeys_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;

    // Use SenderKeyStateStructure.newBuilder() to construct.
    private SenderKeyStateStructure(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private SenderKeyStateStructure(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private SenderKeyStateStructure(
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
              senderKeyId_ = input.readUInt32();
              break;
            }
            case 18: {
              com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = senderChainKey_.toBuilder();
              }
              senderChainKey_ = input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(senderChainKey_);
                senderChainKey_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = senderSigningKey_.toBuilder();
              }
              senderSigningKey_ = input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(senderSigningKey_);
                senderSigningKey_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                senderMessageKeys_ = new java.util.ArrayList<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey>();
                mutable_bitField0_ |= 0x00000008;
              }
              senderMessageKeys_.add(input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.PARSER, extensionRegistry));
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
          senderMessageKeys_ = java.util.Collections.unmodifiableList(senderMessageKeys_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static SenderKeyStateStructure getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public SenderKeyStateStructure getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<SenderKeyStateStructure> getParserForType() {
      return PARSER;
    }

    /**
     * <code>optional uint32 senderKeyId = 1;</code>
     */
    public boolean hasSenderKeyId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional uint32 senderKeyId = 1;</code>
     */
    public int getSenderKeyId() {
      return senderKeyId_;
    }

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
     */
    public boolean hasSenderChainKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey getSenderChainKey() {
      return senderChainKey_;
    }

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKeyOrBuilder getSenderChainKeyOrBuilder() {
      return senderChainKey_;
    }

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
     */
    public boolean hasSenderSigningKey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey getSenderSigningKey() {
      return senderSigningKey_;
    }

    /**
     * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKeyOrBuilder getSenderSigningKeyOrBuilder() {
      return senderSigningKey_;
    }

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
     */
    public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey> getSenderMessageKeysList() {
      return senderMessageKeys_;
    }

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
     */
    public java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKeyOrBuilder>
    getSenderMessageKeysOrBuilderList() {
      return senderMessageKeys_;
    }

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
     */
    public int getSenderMessageKeysCount() {
      return senderMessageKeys_.size();
    }

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey getSenderMessageKeys(int index) {
      return senderMessageKeys_.get(index);
    }

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKeyOrBuilder getSenderMessageKeysOrBuilder(
    int index) {
      return senderMessageKeys_.get(index);
    }

    private void initFields() {
      senderKeyId_ = 0;
      senderChainKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.getDefaultInstance();
      senderSigningKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.getDefaultInstance();
      senderMessageKeys_ = java.util.Collections.emptyList();
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
        output.writeUInt32(1, senderKeyId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, senderChainKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, senderSigningKey_);
      }
      for (int i = 0; i < senderMessageKeys_.size(); i++) {
        output.writeMessage(4, senderMessageKeys_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, senderKeyId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, senderChainKey_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, senderSigningKey_);
      }
      for (int i = 0; i < senderMessageKeys_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, senderMessageKeys_.get(i));
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

    public interface SenderChainKeyOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

      // optional uint32 iteration = 1;

      /**
       * <code>optional uint32 iteration = 1;</code>
       */
      boolean hasIteration();

      /**
       * <code>optional uint32 iteration = 1;</code>
       */
      int getIteration();

      // optional bytes seed = 2;

      /**
       * <code>optional bytes seed = 2;</code>
       */
      boolean hasSeed();

      /**
       * <code>optional bytes seed = 2;</code>
       */
      com.google.protobuf.ByteString getSeed();
    }

    public interface SenderMessageKeyOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

      // optional uint32 iteration = 1;

      /**
       * <code>optional uint32 iteration = 1;</code>
       */
      boolean hasIteration();

      /**
       * <code>optional uint32 iteration = 1;</code>
       */
      int getIteration();

      // optional bytes seed = 2;

      /**
       * <code>optional bytes seed = 2;</code>
       */
      boolean hasSeed();

      /**
       * <code>optional bytes seed = 2;</code>
       */
      com.google.protobuf.ByteString getSeed();
    }

    public interface SenderSigningKeyOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

      // optional bytes public = 1;

      /**
       * <code>optional bytes public = 1;</code>
       */
      boolean hasPublic();

      /**
       * <code>optional bytes public = 1;</code>
       */
      com.google.protobuf.ByteString getPublic();

      // optional bytes private = 2;

      /**
       * <code>optional bytes private = 2;</code>
       */
      boolean hasPrivate();

      /**
       * <code>optional bytes private = 2;</code>
       */
      com.google.protobuf.ByteString getPrivate();
    }

    /**
     * Protobuf type {@code textsecure.SenderKeyStateStructure.SenderChainKey}
     */
    public static final class SenderChainKey extends
    com.google.protobuf.GeneratedMessage
    implements SenderChainKeyOrBuilder {
      // optional uint32 iteration = 1;
      public static final int ITERATION_FIELD_NUMBER = 1;
      // optional bytes seed = 2;
      public static final int SEED_FIELD_NUMBER = 2;
      private static final SenderChainKey defaultInstance;
      private static final long serialVersionUID = 0L;
      public static com.google.protobuf.Parser<SenderChainKey> PARSER =
      new com.google.protobuf.AbstractParser<SenderChainKey>() {
        public SenderChainKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return new SenderChainKey(input, extensionRegistry);
        }
      };

      static {
        defaultInstance = new SenderChainKey(true);
        defaultInstance.initFields();
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      private int bitField0_;
      private int iteration_;
      private com.google.protobuf.ByteString seed_;
      private byte memoizedIsInitialized = -1;
      private int memoizedSerializedSize = -1;

      // Use SenderChainKey.newBuilder() to construct.
      private SenderChainKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private SenderChainKey(boolean noInit) {
        this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }
      private SenderChainKey(
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
                iteration_ = input.readUInt32();
                break;
              }
              case 18: {
                bitField0_ |= 0x00000002;
                seed_ = input.readBytes();
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

      public static SenderChainKey getDefaultInstance() {
        return defaultInstance;
      }

      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderChainKey_descriptor;
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() {
        return Builder.create();
      }

      public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey prototype) {
        return newBuilder().mergeFrom(prototype);
      }

      public SenderChainKey getDefaultInstanceForType() {
        return defaultInstance;
      }

      @Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderChainKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.Builder.class);
      }

      @Override
      public com.google.protobuf.Parser<SenderChainKey> getParserForType() {
        return PARSER;
      }

      /**
       * <code>optional uint32 iteration = 1;</code>
       */
      public boolean hasIteration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 iteration = 1;</code>
       */
      public int getIteration() {
        return iteration_;
      }

      /**
       * <code>optional bytes seed = 2;</code>
       */
      public boolean hasSeed() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes seed = 2;</code>
       */
      public com.google.protobuf.ByteString getSeed() {
        return seed_;
      }

      private void initFields() {
        iteration_ = 0;
        seed_ = com.google.protobuf.ByteString.EMPTY;
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
          output.writeUInt32(1, iteration_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeBytes(2, seed_);
        }
        getUnknownFields().writeTo(output);
      }

      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, iteration_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, seed_);
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
       * Protobuf type {@code textsecure.SenderKeyStateStructure.SenderChainKey}
       */
      public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKeyOrBuilder {
        private int bitField0_;
        // optional uint32 iteration = 1;
        private int iteration_;
        // optional bytes seed = 2;
        private com.google.protobuf.ByteString seed_ = com.google.protobuf.ByteString.EMPTY;

        // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.newBuilder()
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
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderChainKey_descriptor;
        }

        private static Builder create() {
          return new Builder();
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderChainKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          }
        }

        public Builder clear() {
          super.clear();
          iteration_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          seed_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderChainKey_descriptor;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey getDefaultInstanceForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.getDefaultInstance();
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey build() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey buildPartial() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.iteration_ = iteration_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.seed_ = seed_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey) {
            return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey) other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey other) {
          if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.getDefaultInstance())
            return this;
          if (other.hasIteration()) {
            setIteration(other.getIteration());
          }
          if (other.hasSeed()) {
            setSeed(other.getSeed());
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
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        /**
         * <code>optional uint32 iteration = 1;</code>
         */
        public boolean hasIteration() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional uint32 iteration = 1;</code>
         */
        public int getIteration() {
          return iteration_;
        }

        /**
         * <code>optional uint32 iteration = 1;</code>
         */
        public Builder setIteration(int value) {
          bitField0_ |= 0x00000001;
          iteration_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional uint32 iteration = 1;</code>
         */
        public Builder clearIteration() {
          bitField0_ = (bitField0_ & ~0x00000001);
          iteration_ = 0;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes seed = 2;</code>
         */
        public boolean hasSeed() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional bytes seed = 2;</code>
         */
        public com.google.protobuf.ByteString getSeed() {
          return seed_;
        }

        /**
         * <code>optional bytes seed = 2;</code>
         */
        public Builder setSeed(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          seed_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes seed = 2;</code>
         */
        public Builder clearSeed() {
          bitField0_ = (bitField0_ & ~0x00000002);
          seed_ = getDefaultInstance().getSeed();
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:textsecure.SenderKeyStateStructure.SenderChainKey)
      }

      // @@protoc_insertion_point(class_scope:textsecure.SenderKeyStateStructure.SenderChainKey)
    }

    /**
     * Protobuf type {@code textsecure.SenderKeyStateStructure.SenderMessageKey}
     */
    public static final class SenderMessageKey extends
    com.google.protobuf.GeneratedMessage
    implements SenderMessageKeyOrBuilder {
      // optional uint32 iteration = 1;
      public static final int ITERATION_FIELD_NUMBER = 1;
      // optional bytes seed = 2;
      public static final int SEED_FIELD_NUMBER = 2;
      private static final SenderMessageKey defaultInstance;
      private static final long serialVersionUID = 0L;
      public static com.google.protobuf.Parser<SenderMessageKey> PARSER =
      new com.google.protobuf.AbstractParser<SenderMessageKey>() {
        public SenderMessageKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return new SenderMessageKey(input, extensionRegistry);
        }
      };

      static {
        defaultInstance = new SenderMessageKey(true);
        defaultInstance.initFields();
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      private int bitField0_;
      private int iteration_;
      private com.google.protobuf.ByteString seed_;
      private byte memoizedIsInitialized = -1;
      private int memoizedSerializedSize = -1;

      // Use SenderMessageKey.newBuilder() to construct.
      private SenderMessageKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private SenderMessageKey(boolean noInit) {
        this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }
      private SenderMessageKey(
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
                iteration_ = input.readUInt32();
                break;
              }
              case 18: {
                bitField0_ |= 0x00000002;
                seed_ = input.readBytes();
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

      public static SenderMessageKey getDefaultInstance() {
        return defaultInstance;
      }

      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderMessageKey_descriptor;
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() {
        return Builder.create();
      }

      public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey prototype) {
        return newBuilder().mergeFrom(prototype);
      }

      public SenderMessageKey getDefaultInstanceForType() {
        return defaultInstance;
      }

      @Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderMessageKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder.class);
      }

      @Override
      public com.google.protobuf.Parser<SenderMessageKey> getParserForType() {
        return PARSER;
      }

      /**
       * <code>optional uint32 iteration = 1;</code>
       */
      public boolean hasIteration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 iteration = 1;</code>
       */
      public int getIteration() {
        return iteration_;
      }

      /**
       * <code>optional bytes seed = 2;</code>
       */
      public boolean hasSeed() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes seed = 2;</code>
       */
      public com.google.protobuf.ByteString getSeed() {
        return seed_;
      }

      private void initFields() {
        iteration_ = 0;
        seed_ = com.google.protobuf.ByteString.EMPTY;
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
          output.writeUInt32(1, iteration_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeBytes(2, seed_);
        }
        getUnknownFields().writeTo(output);
      }

      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, iteration_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, seed_);
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
       * Protobuf type {@code textsecure.SenderKeyStateStructure.SenderMessageKey}
       */
      public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKeyOrBuilder {
        private int bitField0_;
        // optional uint32 iteration = 1;
        private int iteration_;
        // optional bytes seed = 2;
        private com.google.protobuf.ByteString seed_ = com.google.protobuf.ByteString.EMPTY;

        // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.newBuilder()
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
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderMessageKey_descriptor;
        }

        private static Builder create() {
          return new Builder();
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderMessageKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          }
        }

        public Builder clear() {
          super.clear();
          iteration_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          seed_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderMessageKey_descriptor;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey getDefaultInstanceForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.getDefaultInstance();
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey build() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey buildPartial() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.iteration_ = iteration_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.seed_ = seed_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey) {
            return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey) other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey other) {
          if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.getDefaultInstance())
            return this;
          if (other.hasIteration()) {
            setIteration(other.getIteration());
          }
          if (other.hasSeed()) {
            setSeed(other.getSeed());
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
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        /**
         * <code>optional uint32 iteration = 1;</code>
         */
        public boolean hasIteration() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional uint32 iteration = 1;</code>
         */
        public int getIteration() {
          return iteration_;
        }

        /**
         * <code>optional uint32 iteration = 1;</code>
         */
        public Builder setIteration(int value) {
          bitField0_ |= 0x00000001;
          iteration_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional uint32 iteration = 1;</code>
         */
        public Builder clearIteration() {
          bitField0_ = (bitField0_ & ~0x00000001);
          iteration_ = 0;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes seed = 2;</code>
         */
        public boolean hasSeed() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional bytes seed = 2;</code>
         */
        public com.google.protobuf.ByteString getSeed() {
          return seed_;
        }

        /**
         * <code>optional bytes seed = 2;</code>
         */
        public Builder setSeed(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          seed_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes seed = 2;</code>
         */
        public Builder clearSeed() {
          bitField0_ = (bitField0_ & ~0x00000002);
          seed_ = getDefaultInstance().getSeed();
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:textsecure.SenderKeyStateStructure.SenderMessageKey)
      }

      // @@protoc_insertion_point(class_scope:textsecure.SenderKeyStateStructure.SenderMessageKey)
    }

    /**
     * Protobuf type {@code textsecure.SenderKeyStateStructure.SenderSigningKey}
     */
    public static final class SenderSigningKey extends
    com.google.protobuf.GeneratedMessage
    implements SenderSigningKeyOrBuilder {
      // optional bytes public = 1;
      public static final int PUBLIC_FIELD_NUMBER = 1;
      // optional bytes private = 2;
      public static final int PRIVATE_FIELD_NUMBER = 2;
      private static final SenderSigningKey defaultInstance;
      private static final long serialVersionUID = 0L;
      public static com.google.protobuf.Parser<SenderSigningKey> PARSER =
      new com.google.protobuf.AbstractParser<SenderSigningKey>() {
        public SenderSigningKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
          return new SenderSigningKey(input, extensionRegistry);
        }
      };

      static {
        defaultInstance = new SenderSigningKey(true);
        defaultInstance.initFields();
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      private int bitField0_;
      private com.google.protobuf.ByteString public_;
      private com.google.protobuf.ByteString private_;
      private byte memoizedIsInitialized = -1;
      private int memoizedSerializedSize = -1;

      // Use SenderSigningKey.newBuilder() to construct.
      private SenderSigningKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private SenderSigningKey(boolean noInit) {
        this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }
      private SenderSigningKey(
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
                public_ = input.readBytes();
                break;
              }
              case 18: {
                bitField0_ |= 0x00000002;
                private_ = input.readBytes();
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

      public static SenderSigningKey getDefaultInstance() {
        return defaultInstance;
      }

      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderSigningKey_descriptor;
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() {
        return Builder.create();
      }

      public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey prototype) {
        return newBuilder().mergeFrom(prototype);
      }

      public SenderSigningKey getDefaultInstanceForType() {
        return defaultInstance;
      }

      @Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderSigningKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.Builder.class);
      }

      @Override
      public com.google.protobuf.Parser<SenderSigningKey> getParserForType() {
        return PARSER;
      }

      /**
       * <code>optional bytes public = 1;</code>
       */
      public boolean hasPublic() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional bytes public = 1;</code>
       */
      public com.google.protobuf.ByteString getPublic() {
        return public_;
      }

      /**
       * <code>optional bytes private = 2;</code>
       */
      public boolean hasPrivate() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bytes private = 2;</code>
       */
      public com.google.protobuf.ByteString getPrivate() {
        return private_;
      }

      private void initFields() {
        public_ = com.google.protobuf.ByteString.EMPTY;
        private_ = com.google.protobuf.ByteString.EMPTY;
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
          output.writeBytes(1, public_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeBytes(2, private_);
        }
        getUnknownFields().writeTo(output);
      }

      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, public_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, private_);
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
       * Protobuf type {@code textsecure.SenderKeyStateStructure.SenderSigningKey}
       */
      public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
      implements com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKeyOrBuilder {
        private int bitField0_;
        // optional bytes public = 1;
        private com.google.protobuf.ByteString public_ = com.google.protobuf.ByteString.EMPTY;
        // optional bytes private = 2;
        private com.google.protobuf.ByteString private_ = com.google.protobuf.ByteString.EMPTY;

        // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.newBuilder()
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
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderSigningKey_descriptor;
        }

        private static Builder create() {
          return new Builder();
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderSigningKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          }
        }

        public Builder clear() {
          super.clear();
          public_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000001);
          private_ = com.google.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_SenderSigningKey_descriptor;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey getDefaultInstanceForType() {
          return com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.getDefaultInstance();
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey build() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey buildPartial() {
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.public_ = public_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.private_ = private_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey) {
            return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey) other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey other) {
          if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.getDefaultInstance())
            return this;
          if (other.hasPublic()) {
            setPublic(other.getPublic());
          }
          if (other.hasPrivate()) {
            setPrivate(other.getPrivate());
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
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        /**
         * <code>optional bytes public = 1;</code>
         */
        public boolean hasPublic() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional bytes public = 1;</code>
         */
        public com.google.protobuf.ByteString getPublic() {
          return public_;
        }

        /**
         * <code>optional bytes public = 1;</code>
         */
        public Builder setPublic(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          public_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes public = 1;</code>
         */
        public Builder clearPublic() {
          bitField0_ = (bitField0_ & ~0x00000001);
          public_ = getDefaultInstance().getPublic();
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes private = 2;</code>
         */
        public boolean hasPrivate() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional bytes private = 2;</code>
         */
        public com.google.protobuf.ByteString getPrivate() {
          return private_;
        }

        /**
         * <code>optional bytes private = 2;</code>
         */
        public Builder setPrivate(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          private_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional bytes private = 2;</code>
         */
        public Builder clearPrivate() {
          bitField0_ = (bitField0_ & ~0x00000002);
          private_ = getDefaultInstance().getPrivate();
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:textsecure.SenderKeyStateStructure.SenderSigningKey)
      }

      // @@protoc_insertion_point(class_scope:textsecure.SenderKeyStateStructure.SenderSigningKey)
    }

    /**
     * Protobuf type {@code textsecure.SenderKeyStateStructure}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructureOrBuilder {
      private int bitField0_;
      // optional uint32 senderKeyId = 1;
      private int senderKeyId_;
      // optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;
      private com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey senderChainKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKeyOrBuilder> senderChainKeyBuilder_;
      // optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;
      private com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey senderSigningKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKeyOrBuilder> senderSigningKeyBuilder_;
      // repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;
      private java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey> senderMessageKeys_ =
      java.util.Collections.emptyList();
      private com.google.protobuf.RepeatedFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKeyOrBuilder> senderMessageKeysBuilder_;

      // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.newBuilder()
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
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getSenderChainKeyFieldBuilder();
          getSenderSigningKeyFieldBuilder();
          getSenderMessageKeysFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        senderKeyId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (senderChainKeyBuilder_ == null) {
          senderChainKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.getDefaultInstance();
        } else {
          senderChainKeyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (senderSigningKeyBuilder_ == null) {
          senderSigningKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.getDefaultInstance();
        } else {
          senderSigningKeyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (senderMessageKeysBuilder_ == null) {
          senderMessageKeys_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          senderMessageKeysBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyStateStructure_descriptor;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure build() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure buildPartial() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.senderKeyId_ = senderKeyId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (senderChainKeyBuilder_ == null) {
          result.senderChainKey_ = senderChainKey_;
        } else {
          result.senderChainKey_ = senderChainKeyBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (senderSigningKeyBuilder_ == null) {
          result.senderSigningKey_ = senderSigningKey_;
        } else {
          result.senderSigningKey_ = senderSigningKeyBuilder_.build();
        }
        if (senderMessageKeysBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            senderMessageKeys_ = java.util.Collections.unmodifiableList(senderMessageKeys_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.senderMessageKeys_ = senderMessageKeys_;
        } else {
          result.senderMessageKeys_ = senderMessageKeysBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure) {
          return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure other) {
        if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.getDefaultInstance())
          return this;
        if (other.hasSenderKeyId()) {
          setSenderKeyId(other.getSenderKeyId());
        }
        if (other.hasSenderChainKey()) {
          mergeSenderChainKey(other.getSenderChainKey());
        }
        if (other.hasSenderSigningKey()) {
          mergeSenderSigningKey(other.getSenderSigningKey());
        }
        if (senderMessageKeysBuilder_ == null) {
          if (!other.senderMessageKeys_.isEmpty()) {
            if (senderMessageKeys_.isEmpty()) {
              senderMessageKeys_ = other.senderMessageKeys_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureSenderMessageKeysIsMutable();
              senderMessageKeys_.addAll(other.senderMessageKeys_);
            }
            onChanged();
          }
        } else {
          if (!other.senderMessageKeys_.isEmpty()) {
            if (senderMessageKeysBuilder_.isEmpty()) {
              senderMessageKeysBuilder_.dispose();
              senderMessageKeysBuilder_ = null;
              senderMessageKeys_ = other.senderMessageKeys_;
              bitField0_ = (bitField0_ & ~0x00000008);
              senderMessageKeysBuilder_ =
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
              getSenderMessageKeysFieldBuilder() : null;
            } else {
              senderMessageKeysBuilder_.addAllMessages(other.senderMessageKeys_);
            }
          }
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
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>optional uint32 senderKeyId = 1;</code>
       */
      public boolean hasSenderKeyId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 senderKeyId = 1;</code>
       */
      public int getSenderKeyId() {
        return senderKeyId_;
      }

      /**
       * <code>optional uint32 senderKeyId = 1;</code>
       */
      public Builder setSenderKeyId(int value) {
        bitField0_ |= 0x00000001;
        senderKeyId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 senderKeyId = 1;</code>
       */
      public Builder clearSenderKeyId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        senderKeyId_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
       */
      public boolean hasSenderChainKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey getSenderChainKey() {
        if (senderChainKeyBuilder_ == null) {
          return senderChainKey_;
        } else {
          return senderChainKeyBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
       */
      public Builder setSenderChainKey(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.Builder builderForValue) {
        if (senderChainKeyBuilder_ == null) {
          senderChainKey_ = builderForValue.build();
          onChanged();
        } else {
          senderChainKeyBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
       */
      public Builder setSenderChainKey(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey value) {
        if (senderChainKeyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          senderChainKey_ = value;
          onChanged();
        } else {
          senderChainKeyBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
       */
      public Builder mergeSenderChainKey(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey value) {
        if (senderChainKeyBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
          senderChainKey_ != com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.getDefaultInstance()) {
            senderChainKey_ =
            com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.newBuilder(senderChainKey_).mergeFrom(value).buildPartial();
          } else {
            senderChainKey_ = value;
          }
          onChanged();
        } else {
          senderChainKeyBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
       */
      public Builder clearSenderChainKey() {
        if (senderChainKeyBuilder_ == null) {
          senderChainKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.getDefaultInstance();
          onChanged();
        } else {
          senderChainKeyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.Builder getSenderChainKeyBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSenderChainKeyFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKeyOrBuilder getSenderChainKeyOrBuilder() {
        if (senderChainKeyBuilder_ != null) {
          return senderChainKeyBuilder_.getMessageOrBuilder();
        } else {
          return senderChainKey_;
        }
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderChainKey senderChainKey = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKeyOrBuilder>
      getSenderChainKeyFieldBuilder() {
        if (senderChainKeyBuilder_ == null) {
          senderChainKeyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderChainKeyOrBuilder>(
          senderChainKey_,
          getParentForChildren(),
          isClean());
          senderChainKey_ = null;
        }
        return senderChainKeyBuilder_;
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
       */
      public boolean hasSenderSigningKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey getSenderSigningKey() {
        if (senderSigningKeyBuilder_ == null) {
          return senderSigningKey_;
        } else {
          return senderSigningKeyBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
       */
      public Builder setSenderSigningKey(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.Builder builderForValue) {
        if (senderSigningKeyBuilder_ == null) {
          senderSigningKey_ = builderForValue.build();
          onChanged();
        } else {
          senderSigningKeyBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
       */
      public Builder setSenderSigningKey(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey value) {
        if (senderSigningKeyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          senderSigningKey_ = value;
          onChanged();
        } else {
          senderSigningKeyBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
       */
      public Builder mergeSenderSigningKey(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey value) {
        if (senderSigningKeyBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
          senderSigningKey_ != com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.getDefaultInstance()) {
            senderSigningKey_ =
            com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.newBuilder(senderSigningKey_).mergeFrom(value).buildPartial();
          } else {
            senderSigningKey_ = value;
          }
          onChanged();
        } else {
          senderSigningKeyBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
       */
      public Builder clearSenderSigningKey() {
        if (senderSigningKeyBuilder_ == null) {
          senderSigningKey_ = com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.getDefaultInstance();
          onChanged();
        } else {
          senderSigningKeyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.Builder getSenderSigningKeyBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getSenderSigningKeyFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKeyOrBuilder getSenderSigningKeyOrBuilder() {
        if (senderSigningKeyBuilder_ != null) {
          return senderSigningKeyBuilder_.getMessageOrBuilder();
        } else {
          return senderSigningKey_;
        }
      }

      /**
       * <code>optional .textsecure.SenderKeyStateStructure.SenderSigningKey senderSigningKey = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKeyOrBuilder>
      getSenderSigningKeyFieldBuilder() {
        if (senderSigningKeyBuilder_ == null) {
          senderSigningKeyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderSigningKeyOrBuilder>(
          senderSigningKey_,
          getParentForChildren(),
          isClean());
          senderSigningKey_ = null;
        }
        return senderSigningKeyBuilder_;
      }

      private void ensureSenderMessageKeysIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          senderMessageKeys_ = new java.util.ArrayList<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey>(senderMessageKeys_);
          bitField0_ |= 0x00000008;
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey> getSenderMessageKeysList() {
        if (senderMessageKeysBuilder_ == null) {
          return java.util.Collections.unmodifiableList(senderMessageKeys_);
        } else {
          return senderMessageKeysBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public int getSenderMessageKeysCount() {
        if (senderMessageKeysBuilder_ == null) {
          return senderMessageKeys_.size();
        } else {
          return senderMessageKeysBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey getSenderMessageKeys(int index) {
        if (senderMessageKeysBuilder_ == null) {
          return senderMessageKeys_.get(index);
        } else {
          return senderMessageKeysBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public Builder setSenderMessageKeys(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey value) {
        if (senderMessageKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSenderMessageKeysIsMutable();
          senderMessageKeys_.set(index, value);
          onChanged();
        } else {
          senderMessageKeysBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public Builder setSenderMessageKeys(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder builderForValue) {
        if (senderMessageKeysBuilder_ == null) {
          ensureSenderMessageKeysIsMutable();
          senderMessageKeys_.set(index, builderForValue.build());
          onChanged();
        } else {
          senderMessageKeysBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public Builder addSenderMessageKeys(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey value) {
        if (senderMessageKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSenderMessageKeysIsMutable();
          senderMessageKeys_.add(value);
          onChanged();
        } else {
          senderMessageKeysBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public Builder addSenderMessageKeys(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey value) {
        if (senderMessageKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSenderMessageKeysIsMutable();
          senderMessageKeys_.add(index, value);
          onChanged();
        } else {
          senderMessageKeysBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public Builder addSenderMessageKeys(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder builderForValue) {
        if (senderMessageKeysBuilder_ == null) {
          ensureSenderMessageKeysIsMutable();
          senderMessageKeys_.add(builderForValue.build());
          onChanged();
        } else {
          senderMessageKeysBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public Builder addSenderMessageKeys(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder builderForValue) {
        if (senderMessageKeysBuilder_ == null) {
          ensureSenderMessageKeysIsMutable();
          senderMessageKeys_.add(index, builderForValue.build());
          onChanged();
        } else {
          senderMessageKeysBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public Builder addAllSenderMessageKeys(
      Iterable<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey> values) {
        if (senderMessageKeysBuilder_ == null) {
          ensureSenderMessageKeysIsMutable();
          super.addAll(values, senderMessageKeys_);
          onChanged();
        } else {
          senderMessageKeysBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public Builder clearSenderMessageKeys() {
        if (senderMessageKeysBuilder_ == null) {
          senderMessageKeys_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          senderMessageKeysBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public Builder removeSenderMessageKeys(int index) {
        if (senderMessageKeysBuilder_ == null) {
          ensureSenderMessageKeysIsMutable();
          senderMessageKeys_.remove(index);
          onChanged();
        } else {
          senderMessageKeysBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder getSenderMessageKeysBuilder(
      int index) {
        return getSenderMessageKeysFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKeyOrBuilder getSenderMessageKeysOrBuilder(
      int index) {
        if (senderMessageKeysBuilder_ == null) {
          return senderMessageKeys_.get(index);
        } else {
          return senderMessageKeysBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKeyOrBuilder>
      getSenderMessageKeysOrBuilderList() {
        if (senderMessageKeysBuilder_ != null) {
          return senderMessageKeysBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(senderMessageKeys_);
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder addSenderMessageKeysBuilder() {
        return getSenderMessageKeysFieldBuilder().addBuilder(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.getDefaultInstance());
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder addSenderMessageKeysBuilder(
      int index) {
        return getSenderMessageKeysFieldBuilder().addBuilder(
        index, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.getDefaultInstance());
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure.SenderMessageKey senderMessageKeys = 4;</code>
       */
      public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder>
      getSenderMessageKeysBuilderList() {
        return getSenderMessageKeysFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKeyOrBuilder>
      getSenderMessageKeysFieldBuilder() {
        if (senderMessageKeysBuilder_ == null) {
          senderMessageKeysBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKey.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.SenderMessageKeyOrBuilder>(
          senderMessageKeys_,
          ((bitField0_ & 0x00000008) == 0x00000008),
          getParentForChildren(),
          isClean());
          senderMessageKeys_ = null;
        }
        return senderMessageKeysBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.SenderKeyStateStructure)
    }

    // @@protoc_insertion_point(class_scope:textsecure.SenderKeyStateStructure)
  }

  /**
   * Protobuf type {@code textsecure.SenderKeyRecordStructure}
   */
  public static final class SenderKeyRecordStructure extends
  com.google.protobuf.GeneratedMessage
  implements SenderKeyRecordStructureOrBuilder {
    // repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;
    public static final int SENDERKEYSTATES_FIELD_NUMBER = 1;
    private static final SenderKeyRecordStructure defaultInstance;
    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.Parser<SenderKeyRecordStructure> PARSER =
    new com.google.protobuf.AbstractParser<SenderKeyRecordStructure>() {
      public SenderKeyRecordStructure parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
        return new SenderKeyRecordStructure(input, extensionRegistry);
      }
    };

    static {
      defaultInstance = new SenderKeyRecordStructure(true);
      defaultInstance.initFields();
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    private java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure> senderKeyStates_;
    private byte memoizedIsInitialized = -1;
    private int memoizedSerializedSize = -1;

    // Use SenderKeyRecordStructure.newBuilder() to construct.
    private SenderKeyRecordStructure(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private SenderKeyRecordStructure(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private SenderKeyRecordStructure(
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
                senderKeyStates_ = new java.util.ArrayList<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure>();
                mutable_bitField0_ |= 0x00000001;
              }
              senderKeyStates_.add(input.readMessage(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.PARSER, extensionRegistry));
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
          senderKeyStates_ = java.util.Collections.unmodifiableList(senderKeyStates_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static SenderKeyRecordStructure getDefaultInstance() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyRecordStructure_descriptor;
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure parseFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public static Builder newBuilder(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public SenderKeyRecordStructure getDefaultInstanceForType() {
      return defaultInstance;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyRecordStructure_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure.Builder.class);
    }

    @Override
    public com.google.protobuf.Parser<SenderKeyRecordStructure> getParserForType() {
      return PARSER;
    }

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
     */
    public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure> getSenderKeyStatesList() {
      return senderKeyStates_;
    }

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
     */
    public java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructureOrBuilder>
    getSenderKeyStatesOrBuilderList() {
      return senderKeyStates_;
    }

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
     */
    public int getSenderKeyStatesCount() {
      return senderKeyStates_.size();
    }

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure getSenderKeyStates(int index) {
      return senderKeyStates_.get(index);
    }

    /**
     * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
     */
    public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructureOrBuilder getSenderKeyStatesOrBuilder(
    int index) {
      return senderKeyStates_.get(index);
    }

    private void initFields() {
      senderKeyStates_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < senderKeyStates_.size(); i++) {
        output.writeMessage(1, senderKeyStates_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < senderKeyStates_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, senderKeyStates_.get(i));
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
     * Protobuf type {@code textsecure.SenderKeyRecordStructure}
     */
    public static final class Builder extends
    com.google.protobuf.GeneratedMessage.Builder<Builder>
    implements com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructureOrBuilder {
      private int bitField0_;
      // repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;
      private java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure> senderKeyStates_ =
      java.util.Collections.emptyList();
      private com.google.protobuf.RepeatedFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructureOrBuilder> senderKeyStatesBuilder_;

      // Construct using com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure.newBuilder()
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
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyRecordStructure_descriptor;
      }

      private static Builder create() {
        return new Builder();
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyRecordStructure_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure.class, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getSenderKeyStatesFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        if (senderKeyStatesBuilder_ == null) {
          senderKeyStates_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          senderKeyStatesBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.internal_static_textsecure_SenderKeyRecordStructure_descriptor;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure getDefaultInstanceForType() {
        return com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure.getDefaultInstance();
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure build() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure buildPartial() {
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure result = new com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure(this);
        int from_bitField0_ = bitField0_;
        if (senderKeyStatesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            senderKeyStates_ = java.util.Collections.unmodifiableList(senderKeyStates_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.senderKeyStates_ = senderKeyStates_;
        } else {
          result.senderKeyStates_ = senderKeyStatesBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure) {
          return mergeFrom((com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure other) {
        if (other == com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure.getDefaultInstance())
          return this;
        if (senderKeyStatesBuilder_ == null) {
          if (!other.senderKeyStates_.isEmpty()) {
            if (senderKeyStates_.isEmpty()) {
              senderKeyStates_ = other.senderKeyStates_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSenderKeyStatesIsMutable();
              senderKeyStates_.addAll(other.senderKeyStates_);
            }
            onChanged();
          }
        } else {
          if (!other.senderKeyStates_.isEmpty()) {
            if (senderKeyStatesBuilder_.isEmpty()) {
              senderKeyStatesBuilder_.dispose();
              senderKeyStatesBuilder_ = null;
              senderKeyStates_ = other.senderKeyStates_;
              bitField0_ = (bitField0_ & ~0x00000001);
              senderKeyStatesBuilder_ =
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
              getSenderKeyStatesFieldBuilder() : null;
            } else {
              senderKeyStatesBuilder_.addAllMessages(other.senderKeyStates_);
            }
          }
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
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyRecordStructure) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private void ensureSenderKeyStatesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          senderKeyStates_ = new java.util.ArrayList<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure>(senderKeyStates_);
          bitField0_ |= 0x00000001;
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure> getSenderKeyStatesList() {
        if (senderKeyStatesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(senderKeyStates_);
        } else {
          return senderKeyStatesBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public int getSenderKeyStatesCount() {
        if (senderKeyStatesBuilder_ == null) {
          return senderKeyStates_.size();
        } else {
          return senderKeyStatesBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure getSenderKeyStates(int index) {
        if (senderKeyStatesBuilder_ == null) {
          return senderKeyStates_.get(index);
        } else {
          return senderKeyStatesBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public Builder setSenderKeyStates(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure value) {
        if (senderKeyStatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSenderKeyStatesIsMutable();
          senderKeyStates_.set(index, value);
          onChanged();
        } else {
          senderKeyStatesBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public Builder setSenderKeyStates(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder builderForValue) {
        if (senderKeyStatesBuilder_ == null) {
          ensureSenderKeyStatesIsMutable();
          senderKeyStates_.set(index, builderForValue.build());
          onChanged();
        } else {
          senderKeyStatesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public Builder addSenderKeyStates(com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure value) {
        if (senderKeyStatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSenderKeyStatesIsMutable();
          senderKeyStates_.add(value);
          onChanged();
        } else {
          senderKeyStatesBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public Builder addSenderKeyStates(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure value) {
        if (senderKeyStatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSenderKeyStatesIsMutable();
          senderKeyStates_.add(index, value);
          onChanged();
        } else {
          senderKeyStatesBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public Builder addSenderKeyStates(
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder builderForValue) {
        if (senderKeyStatesBuilder_ == null) {
          ensureSenderKeyStatesIsMutable();
          senderKeyStates_.add(builderForValue.build());
          onChanged();
        } else {
          senderKeyStatesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public Builder addSenderKeyStates(
      int index, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder builderForValue) {
        if (senderKeyStatesBuilder_ == null) {
          ensureSenderKeyStatesIsMutable();
          senderKeyStates_.add(index, builderForValue.build());
          onChanged();
        } else {
          senderKeyStatesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public Builder addAllSenderKeyStates(
      Iterable<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure> values) {
        if (senderKeyStatesBuilder_ == null) {
          ensureSenderKeyStatesIsMutable();
          super.addAll(values, senderKeyStates_);
          onChanged();
        } else {
          senderKeyStatesBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public Builder clearSenderKeyStates() {
        if (senderKeyStatesBuilder_ == null) {
          senderKeyStates_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          senderKeyStatesBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public Builder removeSenderKeyStates(int index) {
        if (senderKeyStatesBuilder_ == null) {
          ensureSenderKeyStatesIsMutable();
          senderKeyStates_.remove(index);
          onChanged();
        } else {
          senderKeyStatesBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder getSenderKeyStatesBuilder(
      int index) {
        return getSenderKeyStatesFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructureOrBuilder getSenderKeyStatesOrBuilder(
      int index) {
        if (senderKeyStatesBuilder_ == null) {
          return senderKeyStates_.get(index);
        } else {
          return senderKeyStatesBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public java.util.List<? extends com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructureOrBuilder>
      getSenderKeyStatesOrBuilderList() {
        if (senderKeyStatesBuilder_ != null) {
          return senderKeyStatesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(senderKeyStates_);
        }
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder addSenderKeyStatesBuilder() {
        return getSenderKeyStatesFieldBuilder().addBuilder(
        com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.getDefaultInstance());
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder addSenderKeyStatesBuilder(
      int index) {
        return getSenderKeyStatesFieldBuilder().addBuilder(
        index, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.getDefaultInstance());
      }

      /**
       * <code>repeated .textsecure.SenderKeyStateStructure senderKeyStates = 1;</code>
       */
      public java.util.List<com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder>
      getSenderKeyStatesBuilderList() {
        return getSenderKeyStatesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilder<
      com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructureOrBuilder>
      getSenderKeyStatesFieldBuilder() {
        if (senderKeyStatesBuilder_ == null) {
          senderKeyStatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
          com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructure.Builder, com.fisil.libclearkeep.protocol.state.StorageProtos.SenderKeyStateStructureOrBuilder>(
          senderKeyStates_,
          ((bitField0_ & 0x00000001) == 0x00000001),
          getParentForChildren(),
          isClean());
          senderKeyStates_ = null;
        }
        return senderKeyStatesBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.SenderKeyRecordStructure)
    }

    // @@protoc_insertion_point(class_scope:textsecure.SenderKeyRecordStructure)
  }

  // @@protoc_insertion_point(outer_class_scope)
}

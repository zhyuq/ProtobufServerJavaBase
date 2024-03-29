// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtoBas.proto

package com.games.common.protocol;

public final class ProtoBas {
  private ProtoBas() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum eCommand
      implements com.google.protobuf.ProtocolMessageEnum {
    NOP(0, 0),
    HEARTBEAT(1, 1),
    START_GAME(2, 2),
    QUIT_SERVER(3, 5000),
    ;
    
    public static final int NOP_VALUE = 0;
    public static final int HEARTBEAT_VALUE = 1;
    public static final int START_GAME_VALUE = 2;
    public static final int QUIT_SERVER_VALUE = 5000;
    
    
    public final int getNumber() { return value; }
    
    public static eCommand valueOf(int value) {
      switch (value) {
        case 0: return NOP;
        case 1: return HEARTBEAT;
        case 2: return START_GAME;
        case 5000: return QUIT_SERVER;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<eCommand>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<eCommand>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<eCommand>() {
            public eCommand findValueByNumber(int number) {
              return eCommand.valueOf(number);
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
      return com.games.common.protocol.ProtoBas.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final eCommand[] VALUES = {
      NOP, HEARTBEAT, START_GAME, QUIT_SERVER, 
    };
    
    public static eCommand valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private eCommand(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:com.games.common.protocol.eCommand)
  }
  
  public enum eErrorCode
      implements com.google.protobuf.ProtocolMessageEnum {
    OK(0, 0),
    FAILED(1, 1),
    ;
    
    public static final int OK_VALUE = 0;
    public static final int FAILED_VALUE = 1;
    
    
    public final int getNumber() { return value; }
    
    public static eErrorCode valueOf(int value) {
      switch (value) {
        case 0: return OK;
        case 1: return FAILED;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<eErrorCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<eErrorCode>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<eErrorCode>() {
            public eErrorCode findValueByNumber(int number) {
              return eErrorCode.valueOf(number);
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
      return com.games.common.protocol.ProtoBas.getDescriptor().getEnumTypes().get(1);
    }
    
    private static final eErrorCode[] VALUES = {
      OK, FAILED, 
    };
    
    public static eErrorCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private eErrorCode(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:com.games.common.protocol.eErrorCode)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016ProtoBas.proto\022\031com.games.common.proto" +
      "col*D\n\010eCommand\022\007\n\003NOP\020\000\022\r\n\tHEARTBEAT\020\001\022" +
      "\016\n\nSTART_GAME\020\002\022\020\n\013QUIT_SERVER\020\210\'* \n\neEr" +
      "rorCode\022\006\n\002OK\020\000\022\n\n\006FAILED\020\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
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

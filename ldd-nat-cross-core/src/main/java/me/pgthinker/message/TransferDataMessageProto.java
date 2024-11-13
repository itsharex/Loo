// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transfer_message.proto

// Protobuf Java Version: 3.25.3
package me.pgthinker.message;

public final class TransferDataMessageProto {
  private TransferDataMessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TransferDataMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:me.pgthinker.message.TransferDataMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.me.pgthinker.message.CmdType cmdType = 1;</code>
     * @return The enum numeric value on the wire for cmdType.
     */
    int getCmdTypeValue();
    /**
     * <code>.me.pgthinker.message.CmdType cmdType = 1;</code>
     * @return The cmdType.
     */
    me.pgthinker.enums.CmdTypeProto.CmdType getCmdType();

    /**
     * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
     * @return Whether the metaData field is set.
     */
    boolean hasMetaData();
    /**
     * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
     * @return The metaData.
     */
    me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData getMetaData();
    /**
     * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
     */
    me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaDataOrBuilder getMetaDataOrBuilder();

    /**
     * <code>bytes data = 3;</code>
     * @return The data.
     */
    com.google.protobuf.ByteString getData();
  }
  /**
   * <pre>
   * 传输数据的消息定义
   * </pre>
   *
   * Protobuf type {@code me.pgthinker.message.TransferDataMessage}
   */
  public static final class TransferDataMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:me.pgthinker.message.TransferDataMessage)
      TransferDataMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransferDataMessage.newBuilder() to construct.
    private TransferDataMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransferDataMessage() {
      cmdType_ = 0;
      data_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TransferDataMessage();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return me.pgthinker.message.TransferDataMessageProto.internal_static_me_pgthinker_message_TransferDataMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.pgthinker.message.TransferDataMessageProto.internal_static_me_pgthinker_message_TransferDataMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.pgthinker.message.TransferDataMessageProto.TransferDataMessage.class, me.pgthinker.message.TransferDataMessageProto.TransferDataMessage.Builder.class);
    }

    private int bitField0_;
    public static final int CMDTYPE_FIELD_NUMBER = 1;
    private int cmdType_ = 0;
    /**
     * <code>.me.pgthinker.message.CmdType cmdType = 1;</code>
     * @return The enum numeric value on the wire for cmdType.
     */
    @java.lang.Override public int getCmdTypeValue() {
      return cmdType_;
    }
    /**
     * <code>.me.pgthinker.message.CmdType cmdType = 1;</code>
     * @return The cmdType.
     */
    @java.lang.Override public me.pgthinker.enums.CmdTypeProto.CmdType getCmdType() {
      me.pgthinker.enums.CmdTypeProto.CmdType result = me.pgthinker.enums.CmdTypeProto.CmdType.forNumber(cmdType_);
      return result == null ? me.pgthinker.enums.CmdTypeProto.CmdType.UNRECOGNIZED : result;
    }

    public static final int METADATA_FIELD_NUMBER = 2;
    private me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData metaData_;
    /**
     * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
     * @return Whether the metaData field is set.
     */
    @java.lang.Override
    public boolean hasMetaData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
     * @return The metaData.
     */
    @java.lang.Override
    public me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData getMetaData() {
      return metaData_ == null ? me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData.getDefaultInstance() : metaData_;
    }
    /**
     * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
     */
    @java.lang.Override
    public me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaDataOrBuilder getMetaDataOrBuilder() {
      return metaData_ == null ? me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData.getDefaultInstance() : metaData_;
    }

    public static final int DATA_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 3;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (cmdType_ != me.pgthinker.enums.CmdTypeProto.CmdType.HEARTBEAT.getNumber()) {
        output.writeEnum(1, cmdType_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(2, getMetaData());
      }
      if (!data_.isEmpty()) {
        output.writeBytes(3, data_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cmdType_ != me.pgthinker.enums.CmdTypeProto.CmdType.HEARTBEAT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, cmdType_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getMetaData());
      }
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, data_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof me.pgthinker.message.TransferDataMessageProto.TransferDataMessage)) {
        return super.equals(obj);
      }
      me.pgthinker.message.TransferDataMessageProto.TransferDataMessage other = (me.pgthinker.message.TransferDataMessageProto.TransferDataMessage) obj;

      if (cmdType_ != other.cmdType_) return false;
      if (hasMetaData() != other.hasMetaData()) return false;
      if (hasMetaData()) {
        if (!getMetaData()
            .equals(other.getMetaData())) return false;
      }
      if (!getData()
          .equals(other.getData())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CMDTYPE_FIELD_NUMBER;
      hash = (53 * hash) + cmdType_;
      if (hasMetaData()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetaData().hashCode();
      }
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(me.pgthinker.message.TransferDataMessageProto.TransferDataMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 传输数据的消息定义
     * </pre>
     *
     * Protobuf type {@code me.pgthinker.message.TransferDataMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:me.pgthinker.message.TransferDataMessage)
        me.pgthinker.message.TransferDataMessageProto.TransferDataMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return me.pgthinker.message.TransferDataMessageProto.internal_static_me_pgthinker_message_TransferDataMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return me.pgthinker.message.TransferDataMessageProto.internal_static_me_pgthinker_message_TransferDataMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.pgthinker.message.TransferDataMessageProto.TransferDataMessage.class, me.pgthinker.message.TransferDataMessageProto.TransferDataMessage.Builder.class);
      }

      // Construct using me.pgthinker.message.TransferDataMessageProto.TransferDataMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getMetaDataFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        cmdType_ = 0;
        metaData_ = null;
        if (metaDataBuilder_ != null) {
          metaDataBuilder_.dispose();
          metaDataBuilder_ = null;
        }
        data_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return me.pgthinker.message.TransferDataMessageProto.internal_static_me_pgthinker_message_TransferDataMessage_descriptor;
      }

      @java.lang.Override
      public me.pgthinker.message.TransferDataMessageProto.TransferDataMessage getDefaultInstanceForType() {
        return me.pgthinker.message.TransferDataMessageProto.TransferDataMessage.getDefaultInstance();
      }

      @java.lang.Override
      public me.pgthinker.message.TransferDataMessageProto.TransferDataMessage build() {
        me.pgthinker.message.TransferDataMessageProto.TransferDataMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public me.pgthinker.message.TransferDataMessageProto.TransferDataMessage buildPartial() {
        me.pgthinker.message.TransferDataMessageProto.TransferDataMessage result = new me.pgthinker.message.TransferDataMessageProto.TransferDataMessage(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(me.pgthinker.message.TransferDataMessageProto.TransferDataMessage result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.cmdType_ = cmdType_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.metaData_ = metaDataBuilder_ == null
              ? metaData_
              : metaDataBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.data_ = data_;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof me.pgthinker.message.TransferDataMessageProto.TransferDataMessage) {
          return mergeFrom((me.pgthinker.message.TransferDataMessageProto.TransferDataMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.pgthinker.message.TransferDataMessageProto.TransferDataMessage other) {
        if (other == me.pgthinker.message.TransferDataMessageProto.TransferDataMessage.getDefaultInstance()) return this;
        if (other.cmdType_ != 0) {
          setCmdTypeValue(other.getCmdTypeValue());
        }
        if (other.hasMetaData()) {
          mergeMetaData(other.getMetaData());
        }
        if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
          setData(other.getData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                cmdType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                input.readMessage(
                    getMetaDataFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                data_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int cmdType_ = 0;
      /**
       * <code>.me.pgthinker.message.CmdType cmdType = 1;</code>
       * @return The enum numeric value on the wire for cmdType.
       */
      @java.lang.Override public int getCmdTypeValue() {
        return cmdType_;
      }
      /**
       * <code>.me.pgthinker.message.CmdType cmdType = 1;</code>
       * @param value The enum numeric value on the wire for cmdType to set.
       * @return This builder for chaining.
       */
      public Builder setCmdTypeValue(int value) {
        cmdType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.me.pgthinker.message.CmdType cmdType = 1;</code>
       * @return The cmdType.
       */
      @java.lang.Override
      public me.pgthinker.enums.CmdTypeProto.CmdType getCmdType() {
        me.pgthinker.enums.CmdTypeProto.CmdType result = me.pgthinker.enums.CmdTypeProto.CmdType.forNumber(cmdType_);
        return result == null ? me.pgthinker.enums.CmdTypeProto.CmdType.UNRECOGNIZED : result;
      }
      /**
       * <code>.me.pgthinker.message.CmdType cmdType = 1;</code>
       * @param value The cmdType to set.
       * @return This builder for chaining.
       */
      public Builder setCmdType(me.pgthinker.enums.CmdTypeProto.CmdType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        cmdType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.me.pgthinker.message.CmdType cmdType = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCmdType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cmdType_ = 0;
        onChanged();
        return this;
      }

      private me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData metaData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData, me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData.Builder, me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaDataOrBuilder> metaDataBuilder_;
      /**
       * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
       * @return Whether the metaData field is set.
       */
      public boolean hasMetaData() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
       * @return The metaData.
       */
      public me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData getMetaData() {
        if (metaDataBuilder_ == null) {
          return metaData_ == null ? me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData.getDefaultInstance() : metaData_;
        } else {
          return metaDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
       */
      public Builder setMetaData(me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData value) {
        if (metaDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metaData_ = value;
        } else {
          metaDataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
       */
      public Builder setMetaData(
          me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData.Builder builderForValue) {
        if (metaDataBuilder_ == null) {
          metaData_ = builderForValue.build();
        } else {
          metaDataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
       */
      public Builder mergeMetaData(me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData value) {
        if (metaDataBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            metaData_ != null &&
            metaData_ != me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData.getDefaultInstance()) {
            getMetaDataBuilder().mergeFrom(value);
          } else {
            metaData_ = value;
          }
        } else {
          metaDataBuilder_.mergeFrom(value);
        }
        if (metaData_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
       */
      public Builder clearMetaData() {
        bitField0_ = (bitField0_ & ~0x00000002);
        metaData_ = null;
        if (metaDataBuilder_ != null) {
          metaDataBuilder_.dispose();
          metaDataBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
       */
      public me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData.Builder getMetaDataBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getMetaDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
       */
      public me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaDataOrBuilder getMetaDataOrBuilder() {
        if (metaDataBuilder_ != null) {
          return metaDataBuilder_.getMessageOrBuilder();
        } else {
          return metaData_ == null ?
              me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData.getDefaultInstance() : metaData_;
        }
      }
      /**
       * <code>.me.pgthinker.message.TransferMessageMetaData metaData = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData, me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData.Builder, me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaDataOrBuilder> 
          getMetaDataFieldBuilder() {
        if (metaDataBuilder_ == null) {
          metaDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData, me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaData.Builder, me.pgthinker.message.TransferMessageMetaDataProto.TransferMessageMetaDataOrBuilder>(
                  getMetaData(),
                  getParentForChildren(),
                  isClean());
          metaData_ = null;
        }
        return metaDataBuilder_;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes data = 3;</code>
       * @return The data.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>bytes data = 3;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        data_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bytes data = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000004);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:me.pgthinker.message.TransferDataMessage)
    }

    // @@protoc_insertion_point(class_scope:me.pgthinker.message.TransferDataMessage)
    private static final me.pgthinker.message.TransferDataMessageProto.TransferDataMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new me.pgthinker.message.TransferDataMessageProto.TransferDataMessage();
    }

    public static me.pgthinker.message.TransferDataMessageProto.TransferDataMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TransferDataMessage>
        PARSER = new com.google.protobuf.AbstractParser<TransferDataMessage>() {
      @java.lang.Override
      public TransferDataMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<TransferDataMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TransferDataMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public me.pgthinker.message.TransferDataMessageProto.TransferDataMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_me_pgthinker_message_TransferDataMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_me_pgthinker_message_TransferDataMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026transfer_message.proto\022\024me.pgthinker.m" +
      "essage\032\016cmd_type.proto\032\017meta_data.proto\"" +
      "\224\001\n\023TransferDataMessage\022.\n\007cmdType\030\001 \001(\016" +
      "2\035.me.pgthinker.message.CmdType\022?\n\010metaD" +
      "ata\030\002 \001(\0132-.me.pgthinker.message.Transfe" +
      "rMessageMetaData\022\014\n\004data\030\003 \001(\014B2\n\024me.pgt" +
      "hinker.messageB\030TransferDataMessageProto" +
      "P\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          me.pgthinker.enums.CmdTypeProto.getDescriptor(),
          me.pgthinker.message.TransferMessageMetaDataProto.getDescriptor(),
        });
    internal_static_me_pgthinker_message_TransferDataMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_me_pgthinker_message_TransferDataMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_me_pgthinker_message_TransferDataMessage_descriptor,
        new java.lang.String[] { "CmdType", "MetaData", "Data", });
    me.pgthinker.enums.CmdTypeProto.getDescriptor();
    me.pgthinker.message.TransferMessageMetaDataProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

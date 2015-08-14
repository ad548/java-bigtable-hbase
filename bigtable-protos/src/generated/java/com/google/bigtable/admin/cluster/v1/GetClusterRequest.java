// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/cluster/v1/bigtable_cluster_service_messages.proto

package com.google.bigtable.admin.cluster.v1;

/**
 * Protobuf type {@code google.bigtable.admin.cluster.v1.GetClusterRequest}
 *
 * <pre>
 * Request message for BigtableClusterService.GetCluster.
 * </pre>
 */
public  final class GetClusterRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.cluster.v1.GetClusterRequest)
    GetClusterRequestOrBuilder {
  // Use GetClusterRequest.newBuilder() to construct.
  private GetClusterRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private GetClusterRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetClusterRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();

            name_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_GetClusterRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_GetClusterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.cluster.v1.GetClusterRequest.class, com.google.bigtable.admin.cluster.v1.GetClusterRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The unique name of the requested cluster.
   * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/&lt;cluster&gt;
   * </pre>
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
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The unique name of the requested cluster.
   * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/&lt;cluster&gt;
   * </pre>
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

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      output.writeBytes(1, getNameBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getNameBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.bigtable.admin.cluster.v1.GetClusterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.cluster.v1.GetClusterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.GetClusterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.cluster.v1.GetClusterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.GetClusterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.cluster.v1.GetClusterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.GetClusterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.bigtable.admin.cluster.v1.GetClusterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.GetClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.cluster.v1.GetClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.admin.cluster.v1.GetClusterRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.bigtable.admin.cluster.v1.GetClusterRequest}
   *
   * <pre>
   * Request message for BigtableClusterService.GetCluster.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.cluster.v1.GetClusterRequest)
      com.google.bigtable.admin.cluster.v1.GetClusterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_GetClusterRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_GetClusterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.cluster.v1.GetClusterRequest.class, com.google.bigtable.admin.cluster.v1.GetClusterRequest.Builder.class);
    }

    // Construct using com.google.bigtable.admin.cluster.v1.GetClusterRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      name_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_GetClusterRequest_descriptor;
    }

    public com.google.bigtable.admin.cluster.v1.GetClusterRequest getDefaultInstanceForType() {
      return com.google.bigtable.admin.cluster.v1.GetClusterRequest.getDefaultInstance();
    }

    public com.google.bigtable.admin.cluster.v1.GetClusterRequest build() {
      com.google.bigtable.admin.cluster.v1.GetClusterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.cluster.v1.GetClusterRequest buildPartial() {
      com.google.bigtable.admin.cluster.v1.GetClusterRequest result = new com.google.bigtable.admin.cluster.v1.GetClusterRequest(this);
      result.name_ = name_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.cluster.v1.GetClusterRequest) {
        return mergeFrom((com.google.bigtable.admin.cluster.v1.GetClusterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.cluster.v1.GetClusterRequest other) {
      if (other == com.google.bigtable.admin.cluster.v1.GetClusterRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.cluster.v1.GetClusterRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.cluster.v1.GetClusterRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the requested cluster.
     * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/&lt;cluster&gt;
     * </pre>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the requested cluster.
     * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/&lt;cluster&gt;
     * </pre>
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
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the requested cluster.
     * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/&lt;cluster&gt;
     * </pre>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the requested cluster.
     * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/&lt;cluster&gt;
     * </pre>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the requested cluster.
     * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/&lt;cluster&gt;
     * </pre>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.cluster.v1.GetClusterRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.cluster.v1.GetClusterRequest)
  private static final com.google.bigtable.admin.cluster.v1.GetClusterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.cluster.v1.GetClusterRequest();
  }

  public static com.google.bigtable.admin.cluster.v1.GetClusterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<GetClusterRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetClusterRequest>() {
    public GetClusterRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetClusterRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<GetClusterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetClusterRequest> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.admin.cluster.v1.GetClusterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


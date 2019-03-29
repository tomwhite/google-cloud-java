// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

package com.google.cloud.tasks.v2beta2;

/**
 *
 *
 * <pre>
 * Request message for getting a task using
 * [GetTask][google.cloud.tasks.v2beta2.CloudTasks.GetTask].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta2.GetTaskRequest}
 */
public final class GetTaskRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta2.GetTaskRequest)
    GetTaskRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetTaskRequest.newBuilder() to construct.
  private GetTaskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetTaskRequest() {
    name_ = "";
    responseView_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GetTaskRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              responseView_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tasks.v2beta2.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta2_GetTaskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta2.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta2_GetTaskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta2.GetTaskRequest.class,
            com.google.cloud.tasks.v2beta2.GetTaskRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required.
   * The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESPONSE_VIEW_FIELD_NUMBER = 2;
  private int responseView_;
  /**
   *
   *
   * <pre>
   * The response_view specifies which subset of the
   * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
   * By default response_view is
   * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
   * retrieved by default because some data, such as payloads, might be
   * desirable to return only when needed because of its large size or because
   * of the sensitivity of data that it contains.
   * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
   * requires `cloudtasks.tasks.fullView` [Google
   * IAM](https://cloud.google.com/iam/) permission on the
   * [Task][google.cloud.tasks.v2beta2.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
   */
  public int getResponseViewValue() {
    return responseView_;
  }
  /**
   *
   *
   * <pre>
   * The response_view specifies which subset of the
   * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
   * By default response_view is
   * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
   * retrieved by default because some data, such as payloads, might be
   * desirable to return only when needed because of its large size or because
   * of the sensitivity of data that it contains.
   * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
   * requires `cloudtasks.tasks.fullView` [Google
   * IAM](https://cloud.google.com/iam/) permission on the
   * [Task][google.cloud.tasks.v2beta2.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
   */
  public com.google.cloud.tasks.v2beta2.Task.View getResponseView() {
    @SuppressWarnings("deprecation")
    com.google.cloud.tasks.v2beta2.Task.View result =
        com.google.cloud.tasks.v2beta2.Task.View.valueOf(responseView_);
    return result == null ? com.google.cloud.tasks.v2beta2.Task.View.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (responseView_ != com.google.cloud.tasks.v2beta2.Task.View.VIEW_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, responseView_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (responseView_ != com.google.cloud.tasks.v2beta2.Task.View.VIEW_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, responseView_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.tasks.v2beta2.GetTaskRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta2.GetTaskRequest other =
        (com.google.cloud.tasks.v2beta2.GetTaskRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (responseView_ != other.responseView_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + RESPONSE_VIEW_FIELD_NUMBER;
    hash = (53 * hash) + responseView_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.tasks.v2beta2.GetTaskRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for getting a task using
   * [GetTask][google.cloud.tasks.v2beta2.CloudTasks.GetTask].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta2.GetTaskRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta2.GetTaskRequest)
      com.google.cloud.tasks.v2beta2.GetTaskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_GetTaskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_GetTaskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta2.GetTaskRequest.class,
              com.google.cloud.tasks.v2beta2.GetTaskRequest.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta2.GetTaskRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      responseView_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_GetTaskRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.GetTaskRequest getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta2.GetTaskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.GetTaskRequest build() {
      com.google.cloud.tasks.v2beta2.GetTaskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.GetTaskRequest buildPartial() {
      com.google.cloud.tasks.v2beta2.GetTaskRequest result =
          new com.google.cloud.tasks.v2beta2.GetTaskRequest(this);
      result.name_ = name_;
      result.responseView_ = responseView_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.tasks.v2beta2.GetTaskRequest) {
        return mergeFrom((com.google.cloud.tasks.v2beta2.GetTaskRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta2.GetTaskRequest other) {
      if (other == com.google.cloud.tasks.v2beta2.GetTaskRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.responseView_ != 0) {
        setResponseViewValue(other.getResponseViewValue());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.tasks.v2beta2.GetTaskRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.tasks.v2beta2.GetTaskRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required.
     * The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The task name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private int responseView_ = 0;
    /**
     *
     *
     * <pre>
     * The response_view specifies which subset of the
     * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
     * By default response_view is
     * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
     * retrieved by default because some data, such as payloads, might be
     * desirable to return only when needed because of its large size or because
     * of the sensitivity of data that it contains.
     * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
     * requires `cloudtasks.tasks.fullView` [Google
     * IAM](https://cloud.google.com/iam/) permission on the
     * [Task][google.cloud.tasks.v2beta2.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
     */
    public int getResponseViewValue() {
      return responseView_;
    }
    /**
     *
     *
     * <pre>
     * The response_view specifies which subset of the
     * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
     * By default response_view is
     * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
     * retrieved by default because some data, such as payloads, might be
     * desirable to return only when needed because of its large size or because
     * of the sensitivity of data that it contains.
     * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
     * requires `cloudtasks.tasks.fullView` [Google
     * IAM](https://cloud.google.com/iam/) permission on the
     * [Task][google.cloud.tasks.v2beta2.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
     */
    public Builder setResponseViewValue(int value) {
      responseView_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The response_view specifies which subset of the
     * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
     * By default response_view is
     * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
     * retrieved by default because some data, such as payloads, might be
     * desirable to return only when needed because of its large size or because
     * of the sensitivity of data that it contains.
     * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
     * requires `cloudtasks.tasks.fullView` [Google
     * IAM](https://cloud.google.com/iam/) permission on the
     * [Task][google.cloud.tasks.v2beta2.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
     */
    public com.google.cloud.tasks.v2beta2.Task.View getResponseView() {
      @SuppressWarnings("deprecation")
      com.google.cloud.tasks.v2beta2.Task.View result =
          com.google.cloud.tasks.v2beta2.Task.View.valueOf(responseView_);
      return result == null ? com.google.cloud.tasks.v2beta2.Task.View.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The response_view specifies which subset of the
     * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
     * By default response_view is
     * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
     * retrieved by default because some data, such as payloads, might be
     * desirable to return only when needed because of its large size or because
     * of the sensitivity of data that it contains.
     * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
     * requires `cloudtasks.tasks.fullView` [Google
     * IAM](https://cloud.google.com/iam/) permission on the
     * [Task][google.cloud.tasks.v2beta2.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
     */
    public Builder setResponseView(com.google.cloud.tasks.v2beta2.Task.View value) {
      if (value == null) {
        throw new NullPointerException();
      }

      responseView_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The response_view specifies which subset of the
     * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
     * By default response_view is
     * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
     * retrieved by default because some data, such as payloads, might be
     * desirable to return only when needed because of its large size or because
     * of the sensitivity of data that it contains.
     * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
     * requires `cloudtasks.tasks.fullView` [Google
     * IAM](https://cloud.google.com/iam/) permission on the
     * [Task][google.cloud.tasks.v2beta2.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
     */
    public Builder clearResponseView() {

      responseView_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta2.GetTaskRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta2.GetTaskRequest)
  private static final com.google.cloud.tasks.v2beta2.GetTaskRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta2.GetTaskRequest();
  }

  public static com.google.cloud.tasks.v2beta2.GetTaskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTaskRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetTaskRequest>() {
        @java.lang.Override
        public GetTaskRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetTaskRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GetTaskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTaskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta2.GetTaskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.framework;

/**
 * <pre>
 * EXPERIMENTAL. Metadata output (i.e., non-Tensor) for a single Run() call.
 * </pre>
 *
 * Protobuf type {@code tensorflow.RunMetadata}
 */
public  final class RunMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.RunMetadata)
    RunMetadataOrBuilder {
  // Use RunMetadata.newBuilder() to construct.
  private RunMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RunMetadata() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RunMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
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
            org.tensorflow.framework.StepStats.Builder subBuilder = null;
            if (stepStats_ != null) {
              subBuilder = stepStats_.toBuilder();
            }
            stepStats_ = input.readMessage(org.tensorflow.framework.StepStats.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stepStats_);
              stepStats_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            org.tensorflow.framework.CostGraphDef.Builder subBuilder = null;
            if (costGraph_ != null) {
              subBuilder = costGraph_.toBuilder();
            }
            costGraph_ = input.readMessage(org.tensorflow.framework.CostGraphDef.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(costGraph_);
              costGraph_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_RunMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_RunMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.RunMetadata.class, org.tensorflow.framework.RunMetadata.Builder.class);
  }

  public static final int STEP_STATS_FIELD_NUMBER = 1;
  private org.tensorflow.framework.StepStats stepStats_;
  /**
   * <pre>
   * Statistics traced for this step. Populated if tracing is turned on via the
   * "RunOptions" proto.
   * EXPERIMENTAL: The format and set of events may change in future versions.
   * </pre>
   *
   * <code>optional .tensorflow.StepStats step_stats = 1;</code>
   */
  public boolean hasStepStats() {
    return stepStats_ != null;
  }
  /**
   * <pre>
   * Statistics traced for this step. Populated if tracing is turned on via the
   * "RunOptions" proto.
   * EXPERIMENTAL: The format and set of events may change in future versions.
   * </pre>
   *
   * <code>optional .tensorflow.StepStats step_stats = 1;</code>
   */
  public org.tensorflow.framework.StepStats getStepStats() {
    return stepStats_ == null ? org.tensorflow.framework.StepStats.getDefaultInstance() : stepStats_;
  }
  /**
   * <pre>
   * Statistics traced for this step. Populated if tracing is turned on via the
   * "RunOptions" proto.
   * EXPERIMENTAL: The format and set of events may change in future versions.
   * </pre>
   *
   * <code>optional .tensorflow.StepStats step_stats = 1;</code>
   */
  public org.tensorflow.framework.StepStatsOrBuilder getStepStatsOrBuilder() {
    return getStepStats();
  }

  public static final int COST_GRAPH_FIELD_NUMBER = 2;
  private org.tensorflow.framework.CostGraphDef costGraph_;
  /**
   * <pre>
   * The cost graph for the computation defined by the run call.
   * </pre>
   *
   * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
   */
  public boolean hasCostGraph() {
    return costGraph_ != null;
  }
  /**
   * <pre>
   * The cost graph for the computation defined by the run call.
   * </pre>
   *
   * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
   */
  public org.tensorflow.framework.CostGraphDef getCostGraph() {
    return costGraph_ == null ? org.tensorflow.framework.CostGraphDef.getDefaultInstance() : costGraph_;
  }
  /**
   * <pre>
   * The cost graph for the computation defined by the run call.
   * </pre>
   *
   * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
   */
  public org.tensorflow.framework.CostGraphDefOrBuilder getCostGraphOrBuilder() {
    return getCostGraph();
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
    if (stepStats_ != null) {
      output.writeMessage(1, getStepStats());
    }
    if (costGraph_ != null) {
      output.writeMessage(2, getCostGraph());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stepStats_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStepStats());
    }
    if (costGraph_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCostGraph());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.framework.RunMetadata)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.RunMetadata other = (org.tensorflow.framework.RunMetadata) obj;

    boolean result = true;
    result = result && (hasStepStats() == other.hasStepStats());
    if (hasStepStats()) {
      result = result && getStepStats()
          .equals(other.getStepStats());
    }
    result = result && (hasCostGraph() == other.hasCostGraph());
    if (hasCostGraph()) {
      result = result && getCostGraph()
          .equals(other.getCostGraph());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasStepStats()) {
      hash = (37 * hash) + STEP_STATS_FIELD_NUMBER;
      hash = (53 * hash) + getStepStats().hashCode();
    }
    if (hasCostGraph()) {
      hash = (37 * hash) + COST_GRAPH_FIELD_NUMBER;
      hash = (53 * hash) + getCostGraph().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.RunMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.RunMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.RunMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.RunMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.RunMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.RunMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.RunMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.RunMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.RunMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.RunMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.RunMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * EXPERIMENTAL. Metadata output (i.e., non-Tensor) for a single Run() call.
   * </pre>
   *
   * Protobuf type {@code tensorflow.RunMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.RunMetadata)
      org.tensorflow.framework.RunMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_RunMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_RunMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.RunMetadata.class, org.tensorflow.framework.RunMetadata.Builder.class);
    }

    // Construct using org.tensorflow.framework.RunMetadata.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (stepStatsBuilder_ == null) {
        stepStats_ = null;
      } else {
        stepStats_ = null;
        stepStatsBuilder_ = null;
      }
      if (costGraphBuilder_ == null) {
        costGraph_ = null;
      } else {
        costGraph_ = null;
        costGraphBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_RunMetadata_descriptor;
    }

    public org.tensorflow.framework.RunMetadata getDefaultInstanceForType() {
      return org.tensorflow.framework.RunMetadata.getDefaultInstance();
    }

    public org.tensorflow.framework.RunMetadata build() {
      org.tensorflow.framework.RunMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.framework.RunMetadata buildPartial() {
      org.tensorflow.framework.RunMetadata result = new org.tensorflow.framework.RunMetadata(this);
      if (stepStatsBuilder_ == null) {
        result.stepStats_ = stepStats_;
      } else {
        result.stepStats_ = stepStatsBuilder_.build();
      }
      if (costGraphBuilder_ == null) {
        result.costGraph_ = costGraph_;
      } else {
        result.costGraph_ = costGraphBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.RunMetadata) {
        return mergeFrom((org.tensorflow.framework.RunMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.RunMetadata other) {
      if (other == org.tensorflow.framework.RunMetadata.getDefaultInstance()) return this;
      if (other.hasStepStats()) {
        mergeStepStats(other.getStepStats());
      }
      if (other.hasCostGraph()) {
        mergeCostGraph(other.getCostGraph());
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
      org.tensorflow.framework.RunMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.RunMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.tensorflow.framework.StepStats stepStats_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.StepStats, org.tensorflow.framework.StepStats.Builder, org.tensorflow.framework.StepStatsOrBuilder> stepStatsBuilder_;
    /**
     * <pre>
     * Statistics traced for this step. Populated if tracing is turned on via the
     * "RunOptions" proto.
     * EXPERIMENTAL: The format and set of events may change in future versions.
     * </pre>
     *
     * <code>optional .tensorflow.StepStats step_stats = 1;</code>
     */
    public boolean hasStepStats() {
      return stepStatsBuilder_ != null || stepStats_ != null;
    }
    /**
     * <pre>
     * Statistics traced for this step. Populated if tracing is turned on via the
     * "RunOptions" proto.
     * EXPERIMENTAL: The format and set of events may change in future versions.
     * </pre>
     *
     * <code>optional .tensorflow.StepStats step_stats = 1;</code>
     */
    public org.tensorflow.framework.StepStats getStepStats() {
      if (stepStatsBuilder_ == null) {
        return stepStats_ == null ? org.tensorflow.framework.StepStats.getDefaultInstance() : stepStats_;
      } else {
        return stepStatsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Statistics traced for this step. Populated if tracing is turned on via the
     * "RunOptions" proto.
     * EXPERIMENTAL: The format and set of events may change in future versions.
     * </pre>
     *
     * <code>optional .tensorflow.StepStats step_stats = 1;</code>
     */
    public Builder setStepStats(org.tensorflow.framework.StepStats value) {
      if (stepStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stepStats_ = value;
        onChanged();
      } else {
        stepStatsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Statistics traced for this step. Populated if tracing is turned on via the
     * "RunOptions" proto.
     * EXPERIMENTAL: The format and set of events may change in future versions.
     * </pre>
     *
     * <code>optional .tensorflow.StepStats step_stats = 1;</code>
     */
    public Builder setStepStats(
        org.tensorflow.framework.StepStats.Builder builderForValue) {
      if (stepStatsBuilder_ == null) {
        stepStats_ = builderForValue.build();
        onChanged();
      } else {
        stepStatsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Statistics traced for this step. Populated if tracing is turned on via the
     * "RunOptions" proto.
     * EXPERIMENTAL: The format and set of events may change in future versions.
     * </pre>
     *
     * <code>optional .tensorflow.StepStats step_stats = 1;</code>
     */
    public Builder mergeStepStats(org.tensorflow.framework.StepStats value) {
      if (stepStatsBuilder_ == null) {
        if (stepStats_ != null) {
          stepStats_ =
            org.tensorflow.framework.StepStats.newBuilder(stepStats_).mergeFrom(value).buildPartial();
        } else {
          stepStats_ = value;
        }
        onChanged();
      } else {
        stepStatsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Statistics traced for this step. Populated if tracing is turned on via the
     * "RunOptions" proto.
     * EXPERIMENTAL: The format and set of events may change in future versions.
     * </pre>
     *
     * <code>optional .tensorflow.StepStats step_stats = 1;</code>
     */
    public Builder clearStepStats() {
      if (stepStatsBuilder_ == null) {
        stepStats_ = null;
        onChanged();
      } else {
        stepStats_ = null;
        stepStatsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Statistics traced for this step. Populated if tracing is turned on via the
     * "RunOptions" proto.
     * EXPERIMENTAL: The format and set of events may change in future versions.
     * </pre>
     *
     * <code>optional .tensorflow.StepStats step_stats = 1;</code>
     */
    public org.tensorflow.framework.StepStats.Builder getStepStatsBuilder() {
      
      onChanged();
      return getStepStatsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Statistics traced for this step. Populated if tracing is turned on via the
     * "RunOptions" proto.
     * EXPERIMENTAL: The format and set of events may change in future versions.
     * </pre>
     *
     * <code>optional .tensorflow.StepStats step_stats = 1;</code>
     */
    public org.tensorflow.framework.StepStatsOrBuilder getStepStatsOrBuilder() {
      if (stepStatsBuilder_ != null) {
        return stepStatsBuilder_.getMessageOrBuilder();
      } else {
        return stepStats_ == null ?
            org.tensorflow.framework.StepStats.getDefaultInstance() : stepStats_;
      }
    }
    /**
     * <pre>
     * Statistics traced for this step. Populated if tracing is turned on via the
     * "RunOptions" proto.
     * EXPERIMENTAL: The format and set of events may change in future versions.
     * </pre>
     *
     * <code>optional .tensorflow.StepStats step_stats = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.StepStats, org.tensorflow.framework.StepStats.Builder, org.tensorflow.framework.StepStatsOrBuilder> 
        getStepStatsFieldBuilder() {
      if (stepStatsBuilder_ == null) {
        stepStatsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.StepStats, org.tensorflow.framework.StepStats.Builder, org.tensorflow.framework.StepStatsOrBuilder>(
                getStepStats(),
                getParentForChildren(),
                isClean());
        stepStats_ = null;
      }
      return stepStatsBuilder_;
    }

    private org.tensorflow.framework.CostGraphDef costGraph_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.CostGraphDef, org.tensorflow.framework.CostGraphDef.Builder, org.tensorflow.framework.CostGraphDefOrBuilder> costGraphBuilder_;
    /**
     * <pre>
     * The cost graph for the computation defined by the run call.
     * </pre>
     *
     * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
     */
    public boolean hasCostGraph() {
      return costGraphBuilder_ != null || costGraph_ != null;
    }
    /**
     * <pre>
     * The cost graph for the computation defined by the run call.
     * </pre>
     *
     * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
     */
    public org.tensorflow.framework.CostGraphDef getCostGraph() {
      if (costGraphBuilder_ == null) {
        return costGraph_ == null ? org.tensorflow.framework.CostGraphDef.getDefaultInstance() : costGraph_;
      } else {
        return costGraphBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The cost graph for the computation defined by the run call.
     * </pre>
     *
     * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
     */
    public Builder setCostGraph(org.tensorflow.framework.CostGraphDef value) {
      if (costGraphBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        costGraph_ = value;
        onChanged();
      } else {
        costGraphBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The cost graph for the computation defined by the run call.
     * </pre>
     *
     * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
     */
    public Builder setCostGraph(
        org.tensorflow.framework.CostGraphDef.Builder builderForValue) {
      if (costGraphBuilder_ == null) {
        costGraph_ = builderForValue.build();
        onChanged();
      } else {
        costGraphBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The cost graph for the computation defined by the run call.
     * </pre>
     *
     * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
     */
    public Builder mergeCostGraph(org.tensorflow.framework.CostGraphDef value) {
      if (costGraphBuilder_ == null) {
        if (costGraph_ != null) {
          costGraph_ =
            org.tensorflow.framework.CostGraphDef.newBuilder(costGraph_).mergeFrom(value).buildPartial();
        } else {
          costGraph_ = value;
        }
        onChanged();
      } else {
        costGraphBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The cost graph for the computation defined by the run call.
     * </pre>
     *
     * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
     */
    public Builder clearCostGraph() {
      if (costGraphBuilder_ == null) {
        costGraph_ = null;
        onChanged();
      } else {
        costGraph_ = null;
        costGraphBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The cost graph for the computation defined by the run call.
     * </pre>
     *
     * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
     */
    public org.tensorflow.framework.CostGraphDef.Builder getCostGraphBuilder() {
      
      onChanged();
      return getCostGraphFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The cost graph for the computation defined by the run call.
     * </pre>
     *
     * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
     */
    public org.tensorflow.framework.CostGraphDefOrBuilder getCostGraphOrBuilder() {
      if (costGraphBuilder_ != null) {
        return costGraphBuilder_.getMessageOrBuilder();
      } else {
        return costGraph_ == null ?
            org.tensorflow.framework.CostGraphDef.getDefaultInstance() : costGraph_;
      }
    }
    /**
     * <pre>
     * The cost graph for the computation defined by the run call.
     * </pre>
     *
     * <code>optional .tensorflow.CostGraphDef cost_graph = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.CostGraphDef, org.tensorflow.framework.CostGraphDef.Builder, org.tensorflow.framework.CostGraphDefOrBuilder> 
        getCostGraphFieldBuilder() {
      if (costGraphBuilder_ == null) {
        costGraphBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.CostGraphDef, org.tensorflow.framework.CostGraphDef.Builder, org.tensorflow.framework.CostGraphDefOrBuilder>(
                getCostGraph(),
                getParentForChildren(),
                isClean());
        costGraph_ = null;
      }
      return costGraphBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.RunMetadata)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.RunMetadata)
  private static final org.tensorflow.framework.RunMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.RunMetadata();
  }

  public static org.tensorflow.framework.RunMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunMetadata>
      PARSER = new com.google.protobuf.AbstractParser<RunMetadata>() {
    public RunMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RunMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RunMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunMetadata> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.framework.RunMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

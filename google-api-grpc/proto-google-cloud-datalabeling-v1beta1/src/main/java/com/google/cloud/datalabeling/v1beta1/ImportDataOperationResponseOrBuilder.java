// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/operations.proto

package com.google.cloud.datalabeling.v1beta1;

public interface ImportDataOperationResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ImportDataOperationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Ouptut only. The name of imported dataset.
   * </pre>
   *
   * <code>string dataset = 1;</code>
   */
  java.lang.String getDataset();
  /**
   *
   *
   * <pre>
   * Ouptut only. The name of imported dataset.
   * </pre>
   *
   * <code>string dataset = 1;</code>
   */
  com.google.protobuf.ByteString getDatasetBytes();

  /**
   *
   *
   * <pre>
   * Output only. Total number of examples requested to import
   * </pre>
   *
   * <code>int32 total_count = 2;</code>
   */
  int getTotalCount();

  /**
   *
   *
   * <pre>
   * Output only. Number of examples imported successfully.
   * </pre>
   *
   * <code>int32 import_count = 3;</code>
   */
  int getImportCount();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface ApplicationStatusFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ApplicationStatusFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * User entered or selected application status. The API does an exact match
   * between the application status specified in this filter and the
   * [JobApplication.status][] in profiles.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.JobApplication.ApplicationStatus application_status = 1;
   * </code>
   */
  int getApplicationStatusValue();
  /**
   *
   *
   * <pre>
   * Required.
   * User entered or selected application status. The API does an exact match
   * between the application status specified in this filter and the
   * [JobApplication.status][] in profiles.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.JobApplication.ApplicationStatus application_status = 1;
   * </code>
   */
  com.google.cloud.talent.v4beta1.JobApplication.ApplicationStatus getApplicationStatus();

  /**
   *
   *
   * <pre>
   * Optional.
   * If true, The API excludes all candidates with any [JobApplication.status][]
   * matching the status specified in the filter.
   * </pre>
   *
   * <code>bool negated = 2;</code>
   */
  boolean getNegated();
}

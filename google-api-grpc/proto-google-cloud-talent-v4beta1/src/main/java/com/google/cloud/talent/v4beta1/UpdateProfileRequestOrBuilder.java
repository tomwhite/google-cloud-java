// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile_service.proto

package com.google.cloud.talent.v4beta1;

public interface UpdateProfileRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.UpdateProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * Profile to be updated.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Profile profile = 1;</code>
   */
  boolean hasProfile();
  /**
   *
   *
   * <pre>
   * Required.
   * Profile to be updated.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Profile profile = 1;</code>
   */
  com.google.cloud.talent.v4beta1.Profile getProfile();
  /**
   *
   *
   * <pre>
   * Required.
   * Profile to be updated.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Profile profile = 1;</code>
   */
  com.google.cloud.talent.v4beta1.ProfileOrBuilder getProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * A field mask to specify the profile fields to update.
   * A full update is performed if it is unset.
   * Valid values are:
   * * externalId
   * * source
   * * uri
   * * isHirable
   * * createTime
   * * updateTime
   * * resumeHrxml
   * * personNames
   * * addresses
   * * emailAddresses
   * * phoneNumbers
   * * personalUris
   * * additionalContactInfo
   * * employmentRecords
   * * educationRecords
   * * skills
   * * projects
   * * publications
   * * patents
   * * certifications
   * * recruitingNotes
   * * customAttributes
   * * groupId
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional.
   * A field mask to specify the profile fields to update.
   * A full update is performed if it is unset.
   * Valid values are:
   * * externalId
   * * source
   * * uri
   * * isHirable
   * * createTime
   * * updateTime
   * * resumeHrxml
   * * personNames
   * * addresses
   * * emailAddresses
   * * phoneNumbers
   * * personalUris
   * * additionalContactInfo
   * * employmentRecords
   * * educationRecords
   * * skills
   * * projects
   * * publications
   * * patents
   * * certifications
   * * recruitingNotes
   * * customAttributes
   * * groupId
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional.
   * A field mask to specify the profile fields to update.
   * A full update is performed if it is unset.
   * Valid values are:
   * * externalId
   * * source
   * * uri
   * * isHirable
   * * createTime
   * * updateTime
   * * resumeHrxml
   * * personNames
   * * addresses
   * * emailAddresses
   * * phoneNumbers
   * * personalUris
   * * additionalContactInfo
   * * employmentRecords
   * * educationRecords
   * * skills
   * * projects
   * * publications
   * * patents
   * * certifications
   * * recruitingNotes
   * * customAttributes
   * * groupId
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}

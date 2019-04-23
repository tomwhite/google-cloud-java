// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

public interface PersonNameOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.PersonName)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional.
   * A string represents a person's full name. For example, "Dr. John Smith".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string formatted_name = 1;</code>
   */
  java.lang.String getFormattedName();
  /**
   *
   *
   * <pre>
   * Optional.
   * A string represents a person's full name. For example, "Dr. John Smith".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string formatted_name = 1;</code>
   */
  com.google.protobuf.ByteString getFormattedNameBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * A person's name in a structured way (last name, first name, suffix, and
   * so on.)
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.PersonName.PersonStructuredName structured_name = 2;</code>
   */
  boolean hasStructuredName();
  /**
   *
   *
   * <pre>
   * Optional.
   * A person's name in a structured way (last name, first name, suffix, and
   * so on.)
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.PersonName.PersonStructuredName structured_name = 2;</code>
   */
  com.google.cloud.talent.v4beta1.PersonName.PersonStructuredName getStructuredName();
  /**
   *
   *
   * <pre>
   * Optional.
   * A person's name in a structured way (last name, first name, suffix, and
   * so on.)
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.PersonName.PersonStructuredName structured_name = 2;</code>
   */
  com.google.cloud.talent.v4beta1.PersonName.PersonStructuredNameOrBuilder
      getStructuredNameOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * Preferred name for the person.
   * </pre>
   *
   * <code>string preferred_name = 3;</code>
   */
  java.lang.String getPreferredName();
  /**
   *
   *
   * <pre>
   * Optional.
   * Preferred name for the person.
   * </pre>
   *
   * <code>string preferred_name = 3;</code>
   */
  com.google.protobuf.ByteString getPreferredNameBytes();

  public com.google.cloud.talent.v4beta1.PersonName.PersonNameCase getPersonNameCase();
}

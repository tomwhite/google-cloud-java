/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.examples.securitycenter.snippets;

import com.google.cloud.securitycenter.v1.ListAssetsRequest;
import com.google.cloud.securitycenter.v1.ListAssetsResponse.ListAssetsResult;
import com.google.cloud.securitycenter.v1.ListFindingsRequest;
import com.google.cloud.securitycenter.v1.ListFindingsResponse.ListFindingsResult;
import com.google.cloud.securitycenter.v1.OrganizationName;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import com.google.cloud.securitycenter.v1.SecurityCenterClient.ListAssetsPagedResponse;
import com.google.cloud.securitycenter.v1.SecurityCenterClient.ListFindingsPagedResponse;
import com.google.cloud.securitycenter.v1.SecurityMarks;
import com.google.cloud.securitycenter.v1.SourceName;
import com.google.cloud.securitycenter.v1.UpdateSecurityMarksRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.FieldMask;
import java.io.IOException;

public class SecurityMarkSnippets {

  private SecurityMarkSnippets() {}

  /**
   * Add security mark to an asset.
   *
   * @param assetName The asset resource to add the security mark for.
   */
  // [START add_to_asset]
  static SecurityMarks addToAsset(String assetName) {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // asset_name = "organizations/123123342/assets/12312321";
      // Start setting up a request to add security marks for an asset.
      ImmutableMap markMap = ImmutableMap.of("key_a", "value_a", "key_b", "value_b");

      // Add security marks and field mask for security marks.
      SecurityMarks securityMarks =
          SecurityMarks.newBuilder()
              .setName(assetName + "/securityMarks")
              .putAllMarks(markMap)
              .build();
      FieldMask updateMask =
          FieldMask.newBuilder().addPaths("marks.key_a").addPaths("marks.key_b").build();

      UpdateSecurityMarksRequest request =
          UpdateSecurityMarksRequest.newBuilder()
              .setSecurityMarks(securityMarks)
              .setUpdateMask(updateMask)
              .build();

      // Call the API.
      SecurityMarks response = client.updateSecurityMarks(request);

      System.out.println("Security Marks:");
      System.out.println(response);
      return response;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END add_to_asset]

  /**
   * Clear security marks for an asset.
   *
   * @param assetName The asset resource to clear the security marks for.
   */
  // [START clear_from_asset]
  static SecurityMarks clearFromAsset(String assetName) {
    // asset_name = "organizations/123123342/assets/12312321";
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // Start setting up a request to clear security marks for an asset.
      // Create security mark and field mask for clearing security marks.
      SecurityMarks securityMarks =
          SecurityMarks.newBuilder().setName(assetName + "/securityMarks").build();
      FieldMask updateMask =
          FieldMask.newBuilder().addPaths("marks.key_a").addPaths("marks.key_b").build();

      UpdateSecurityMarksRequest request =
          UpdateSecurityMarksRequest.newBuilder()
              .setSecurityMarks(securityMarks)
              .setUpdateMask(updateMask)
              .build();

      // Call the API.
      SecurityMarks response = client.updateSecurityMarks(request);

      System.out.println("Security Marks cleared:");
      System.out.println(response);
      return response;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END clear_from_asset]

  /**
   * Deletes and updates a security mark for an asset.
   *
   * @param assetName The asset resource path to update and remove the security marks for.
   */
  // [START delete_and_update_marks]
  static SecurityMarks deleteAndUpdateMarks(String assetName) {
    // asset_name = "organizations/123123342/assets/12312321";
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // Start setting up a request to clear and update security marks for an asset.
      // Create security mark and field mask for clearing security marks.
      SecurityMarks securityMarks =
          SecurityMarks.newBuilder()
              .setName(assetName + "/securityMarks")
              .putMarks("key_a", "new_value_for_a")
              .build();
      FieldMask updateMask =
          FieldMask.newBuilder().addPaths("marks.key_a").addPaths("marks.key_b").build();

      UpdateSecurityMarksRequest request =
          UpdateSecurityMarksRequest.newBuilder()
              .setSecurityMarks(securityMarks)
              .setUpdateMask(updateMask)
              .build();

      // Call the API.
      SecurityMarks response = client.updateSecurityMarks(request);

      System.out.println("Security Marks updated and cleared:");
      System.out.println(response);
      return response;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END delete_and_update_marks]

  /**
   * Add security mark to a finding.
   *
   * @param findingName The finding resource path to add the security mark for.
   */
  // [START add_to_finding]
  static SecurityMarks addToFinding(String findingName) {
    // finding_name = "organizations/1112/sources/1234/findings/findingid";
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // Start setting up a request to add security marks for a finding.
      ImmutableMap markMap = ImmutableMap.of("key_a", "value_a", "key_b", "value_b");

      // Add security marks and field mask for security marks.
      SecurityMarks securityMarks =
          SecurityMarks.newBuilder()
              .setName(findingName + "/securityMarks")
              .putAllMarks(markMap)
              .build();
      FieldMask updateMask =
          FieldMask.newBuilder().addPaths("marks.key_a").addPaths("marks.key_b").build();

      UpdateSecurityMarksRequest request =
          UpdateSecurityMarksRequest.newBuilder()
              .setSecurityMarks(securityMarks)
              .setUpdateMask(updateMask)
              .build();

      // Call the API.
      SecurityMarks response = client.updateSecurityMarks(request);

      System.out.println("Security Marks:");
      System.out.println(response);
      return response;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END add_to_finding]

  /**
   * Lists all assets with a filter on security marks.
   *
   * @param organizationName The organization to list assets for.
   */
  // [START list_assets_with_filter]
  static ImmutableList<ListAssetsResult> listAssetsWithQueryMarks(
      OrganizationName organizationName) {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // Start setting up a request for to list all assets filtered by a specific security mark.
      // OrganizationName organizationName = OrganizationName.of("123234324");
      ListAssetsRequest request =
          ListAssetsRequest.newBuilder()
              .setParent(organizationName.toString())
              .setFilter("security_marks.marks.key_a = \"value_a\"")
              .build();

      // Call the API.
      ListAssetsPagedResponse response = client.listAssets(request);

      // This creates one list for all assets.  If your organization has a large number of assets
      // this can cause out of memory issues.  You can process them batches by returning
      // the Iterable returned response.iterateAll() directly.
      ImmutableList<ListAssetsResult> results = ImmutableList.copyOf(response.iterateAll());
      System.out.println("Assets with security mark - key_a=value_a:");
      System.out.println(results);
      return results;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END list_assets_with_filter]

  /**
   * List all findings with a filter on security marks.
   *
   * @param sourceName The source to list filtered findings for.
   */
  // [START list_filtered_findings]
  static ImmutableList<ListFindingsResult> listFindingsWithQueryMarks(SourceName sourceName) {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // Start setting up a request for to list all findings filtered by a specific security mark.
      // SourceName sourceName = SourceName.of("123234324", "423432321");
      // Create filter for NOT security_mark key_a=value_a
      String filter = "NOT security_marks.marks.key_a=\"value_a\"";

      ListFindingsRequest.Builder request =
          ListFindingsRequest.newBuilder().setParent(sourceName.toString()).setFilter(filter);

      // Call the API.
      ListFindingsPagedResponse response = client.listFindings(request.build());

      // This creates one list for all findings in the filter.If your organization has a large
      // number of
      // findings this can cause out of memory issues.  You can process them batches by returning
      // the Iterable returned response.iterateAll() directly.
      ImmutableList<ListFindingsResult> results = ImmutableList.copyOf(response.iterateAll());
      System.out.println("Findings with security mark - key_a=value_a:");
      System.out.println(results);
      return results;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END list_filtered_findings]

}

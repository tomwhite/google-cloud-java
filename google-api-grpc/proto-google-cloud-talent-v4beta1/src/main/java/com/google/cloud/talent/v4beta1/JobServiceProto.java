// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

public final class JobServiceProto {
  private JobServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CreateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_GetJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_DeleteJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_BatchDeleteJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_BatchDeleteJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_CustomRankingInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_CustomRankingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_MatchingJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_MatchingJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_CommuteInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_CommuteInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/talent/v4beta1/job_servic"
          + "e.proto\022\033google.cloud.talent.v4beta1\032\034go"
          + "ogle/api/annotations.proto\032(google/cloud"
          + "/talent/v4beta1/common.proto\032)google/clo"
          + "ud/talent/v4beta1/filters.proto\032+google/"
          + "cloud/talent/v4beta1/histogram.proto\032%go"
          + "ogle/cloud/talent/v4beta1/job.proto\032#goo"
          + "gle/longrunning/operations.proto\032\036google"
          + "/protobuf/duration.proto\032\033google/protobu"
          + "f/empty.proto\032 google/protobuf/field_mas"
          + "k.proto\"Q\n\020CreateJobRequest\022\016\n\006parent\030\001 "
          + "\001(\t\022-\n\003job\030\002 \001(\0132 .google.cloud.talent.v"
          + "4beta1.Job\"\035\n\rGetJobRequest\022\014\n\004name\030\001 \001("
          + "\t\"r\n\020UpdateJobRequest\022-\n\003job\030\001 \001(\0132 .goo"
          + "gle.cloud.talent.v4beta1.Job\022/\n\013update_m"
          + "ask\030\002 \001(\0132\032.google.protobuf.FieldMask\" \n"
          + "\020DeleteJobRequest\022\014\n\004name\030\001 \001(\t\"8\n\026Batch"
          + "DeleteJobsRequest\022\016\n\006parent\030\001 \001(\t\022\016\n\006fil"
          + "ter\030\002 \001(\t\"\220\001\n\017ListJobsRequest\022\016\n\006parent\030"
          + "\001 \001(\t\022\016\n\006filter\030\002 \001(\t\022\022\n\npage_token\030\003 \001("
          + "\t\022\021\n\tpage_size\030\004 \001(\005\0226\n\010job_view\030\005 \001(\0162$"
          + ".google.cloud.talent.v4beta1.JobView\"\234\001\n"
          + "\020ListJobsResponse\022.\n\004jobs\030\001 \003(\0132 .google"
          + ".cloud.talent.v4beta1.Job\022\027\n\017next_page_t"
          + "oken\030\002 \001(\t\022?\n\010metadata\030\003 \001(\0132-.google.cl"
          + "oud.talent.v4beta1.ResponseMetadata\"\240\t\n\021"
          + "SearchJobsRequest\022\016\n\006parent\030\001 \001(\t\022N\n\013sea"
          + "rch_mode\030\002 \001(\01629.google.cloud.talent.v4b"
          + "eta1.SearchJobsRequest.SearchMode\022F\n\020req"
          + "uest_metadata\030\003 \001(\0132,.google.cloud.talen"
          + "t.v4beta1.RequestMetadata\0228\n\tjob_query\030\004"
          + " \001(\0132%.google.cloud.talent.v4beta1.JobQu"
          + "ery\022\031\n\021enable_broadening\030\005 \001(\010\022#\n\033requir"
          + "e_precise_result_size\030\006 \001(\010\022F\n\021histogram"
          + "_queries\030\007 \003(\0132+.google.cloud.talent.v4b"
          + "eta1.HistogramQuery\0226\n\010job_view\030\010 \001(\0162$."
          + "google.cloud.talent.v4beta1.JobView\022\016\n\006o"
          + "ffset\030\t \001(\005\022\021\n\tpage_size\030\n \001(\005\022\022\n\npage_t"
          + "oken\030\013 \001(\t\022\020\n\010order_by\030\014 \001(\t\022b\n\025diversif"
          + "ication_level\030\r \001(\0162C.google.cloud.talen"
          + "t.v4beta1.SearchJobsRequest.Diversificat"
          + "ionLevel\022]\n\023custom_ranking_info\030\016 \001(\0132@."
          + "google.cloud.talent.v4beta1.SearchJobsRe"
          + "quest.CustomRankingInfo\022\035\n\025disable_keywo"
          + "rd_match\030\020 \001(\010\032\220\002\n\021CustomRankingInfo\022j\n\020"
          + "importance_level\030\001 \001(\0162P.google.cloud.ta"
          + "lent.v4beta1.SearchJobsRequest.CustomRan"
          + "kingInfo.ImportanceLevel\022\032\n\022ranking_expr"
          + "ession\030\002 \001(\t\"s\n\017ImportanceLevel\022 \n\034IMPOR"
          + "TANCE_LEVEL_UNSPECIFIED\020\000\022\010\n\004NONE\020\001\022\007\n\003L"
          + "OW\020\002\022\010\n\004MILD\020\003\022\n\n\006MEDIUM\020\004\022\010\n\004HIGH\020\005\022\013\n\007"
          + "EXTREME\020\006\"R\n\nSearchMode\022\033\n\027SEARCH_MODE_U"
          + "NSPECIFIED\020\000\022\016\n\nJOB_SEARCH\020\001\022\027\n\023FEATURED"
          + "_JOB_SEARCH\020\002\"W\n\024DiversificationLevel\022%\n"
          + "!DIVERSIFICATION_LEVEL_UNSPECIFIED\020\000\022\014\n\010"
          + "DISABLED\020\001\022\n\n\006SIMPLE\020\002\"\327\006\n\022SearchJobsRes"
          + "ponse\022R\n\rmatching_jobs\030\001 \003(\0132;.google.cl"
          + "oud.talent.v4beta1.SearchJobsResponse.Ma"
          + "tchingJob\022R\n\027histogram_query_results\030\002 \003"
          + "(\01321.google.cloud.talent.v4beta1.Histogr"
          + "amQueryResult\022\027\n\017next_page_token\030\003 \001(\t\022?"
          + "\n\020location_filters\030\004 \003(\0132%.google.cloud."
          + "talent.v4beta1.Location\022\034\n\024estimated_tot"
          + "al_size\030\005 \001(\005\022\022\n\ntotal_size\030\006 \001(\005\022?\n\010met"
          + "adata\030\007 \001(\0132-.google.cloud.talent.v4beta"
          + "1.ResponseMetadata\022\"\n\032broadened_query_jo"
          + "bs_count\030\010 \001(\005\022I\n\020spell_correction\030\t \001(\013"
          + "2/.google.cloud.talent.v4beta1.SpellingC"
          + "orrection\032\334\001\n\013MatchingJob\022-\n\003job\030\001 \001(\0132 "
          + ".google.cloud.talent.v4beta1.Job\022\023\n\013job_"
          + "summary\030\002 \001(\t\022\031\n\021job_title_snippet\030\003 \001(\t"
          + "\022\033\n\023search_text_snippet\030\004 \001(\t\022Q\n\014commute"
          + "_info\030\005 \001(\0132;.google.cloud.talent.v4beta"
          + "1.SearchJobsResponse.CommuteInfo\032~\n\013Comm"
          + "uteInfo\022;\n\014job_location\030\001 \001(\0132%.google.c"
          + "loud.talent.v4beta1.Location\0222\n\017travel_d"
          + "uration\030\002 \001(\0132\031.google.protobuf.Duration"
          + "*v\n\007JobView\022\030\n\024JOB_VIEW_UNSPECIFIED\020\000\022\024\n"
          + "\020JOB_VIEW_ID_ONLY\020\001\022\024\n\020JOB_VIEW_MINIMAL\020"
          + "\002\022\022\n\016JOB_VIEW_SMALL\020\003\022\021\n\rJOB_VIEW_FULL\020\004"
          + "2\342\014\n\nJobService\022\274\001\n\tCreateJob\022-.google.c"
          + "loud.talent.v4beta1.CreateJobRequest\032 .g"
          + "oogle.cloud.talent.v4beta1.Job\"^\202\323\344\223\002X\"+"
          + "/v4beta1/{parent=projects/*/tenants/*}/j"
          + "obs:\001*Z&\"!/v4beta1/{parent=projects/*}/j"
          + "obs:\001*\022\260\001\n\006GetJob\022*.google.cloud.talent."
          + "v4beta1.GetJobRequest\032 .google.cloud.tal"
          + "ent.v4beta1.Job\"X\202\323\344\223\002R\022+/v4beta1/{name="
          + "projects/*/tenants/*/jobs/*}Z#\022!/v4beta1"
          + "/{name=projects/*/jobs/*}\022\304\001\n\tUpdateJob\022"
          + "-.google.cloud.talent.v4beta1.UpdateJobR"
          + "equest\032 .google.cloud.talent.v4beta1.Job"
          + "\"f\202\323\344\223\002`2//v4beta1/{job.name=projects/*/"
          + "tenants/*/jobs/*}:\001*Z*2%/v4beta1/{job.na"
          + "me=projects/*/jobs/*}:\001*\022\254\001\n\tDeleteJob\022-"
          + ".google.cloud.talent.v4beta1.DeleteJobRe"
          + "quest\032\026.google.protobuf.Empty\"X\202\323\344\223\002R*+/"
          + "v4beta1/{name=projects/*/tenants/*/jobs/"
          + "*}Z#*!/v4beta1/{name=projects/*/jobs/*}\022"
          + "\301\001\n\010ListJobs\022,.google.cloud.talent.v4bet"
          + "a1.ListJobsRequest\032-.google.cloud.talent"
          + ".v4beta1.ListJobsResponse\"X\202\323\344\223\002R\022+/v4be"
          + "ta1/{parent=projects/*/tenants/*}/jobsZ#"
          + "\022!/v4beta1/{parent=projects/*}/jobs\022\323\001\n\017"
          + "BatchDeleteJobs\0223.google.cloud.talent.v4"
          + "beta1.BatchDeleteJobsRequest\032\026.google.pr"
          + "otobuf.Empty\"s\202\323\344\223\002m\"7/v4beta1/{parent=p"
          + "rojects/*/tenants/*}/jobs:batchDelete:\001*"
          + "Z/\"-/v4beta1/{parent=projects/*}/jobs:ba"
          + "tchDelete\022\333\001\n\nSearchJobs\022..google.cloud."
          + "talent.v4beta1.SearchJobsRequest\032/.googl"
          + "e.cloud.talent.v4beta1.SearchJobsRespons"
          + "e\"l\202\323\344\223\002f\"2/v4beta1/{parent=projects/*/t"
          + "enants/*}/jobs:search:\001*Z-\"(/v4beta1/{pa"
          + "rent=projects/*}/jobs:search:\001*\022\363\001\n\022Sear"
          + "chJobsForAlert\022..google.cloud.talent.v4b"
          + "eta1.SearchJobsRequest\032/.google.cloud.ta"
          + "lent.v4beta1.SearchJobsResponse\"|\202\323\344\223\002v\""
          + ":/v4beta1/{parent=projects/*/tenants/*}/"
          + "jobs:searchForAlert:\001*Z5\"0/v4beta1/{pare"
          + "nt=projects/*}/jobs:searchForAlert:\001*B}\n"
          + "\037com.google.cloud.talent.v4beta1B\017JobSer"
          + "viceProtoP\001ZAgoogle.golang.org/genproto/"
          + "googleapis/cloud/talent/v4beta1;talent\242\002"
          + "\003CTSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.FiltersProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.HistogramProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.JobResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_CreateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CreateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CreateJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Job",
            });
    internal_static_google_cloud_talent_v4beta1_GetJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_GetJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_GetJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_descriptor,
            new java.lang.String[] {
              "Job", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4beta1_DeleteJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_DeleteJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_DeleteJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_BatchDeleteJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_BatchDeleteJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_BatchDeleteJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter",
            });
    internal_static_google_cloud_talent_v4beta1_ListJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_ListJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageToken", "PageSize", "JobView",
            });
    internal_static_google_cloud_talent_v4beta1_ListJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4beta1_ListJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListJobsResponse_descriptor,
            new java.lang.String[] {
              "Jobs", "NextPageToken", "Metadata",
            });
    internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "SearchMode",
              "RequestMetadata",
              "JobQuery",
              "EnableBroadening",
              "RequirePreciseResultSize",
              "HistogramQueries",
              "JobView",
              "Offset",
              "PageSize",
              "PageToken",
              "OrderBy",
              "DiversificationLevel",
              "CustomRankingInfo",
              "DisableKeywordMatch",
            });
    internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_CustomRankingInfo_descriptor =
        internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_CustomRankingInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_CustomRankingInfo_descriptor,
            new java.lang.String[] {
              "ImportanceLevel", "RankingExpression",
            });
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_descriptor,
            new java.lang.String[] {
              "MatchingJobs",
              "HistogramQueryResults",
              "NextPageToken",
              "LocationFilters",
              "EstimatedTotalSize",
              "TotalSize",
              "Metadata",
              "BroadenedQueryJobsCount",
              "SpellCorrection",
            });
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_MatchingJob_descriptor =
        internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_MatchingJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_MatchingJob_descriptor,
            new java.lang.String[] {
              "Job", "JobSummary", "JobTitleSnippet", "SearchTextSnippet", "CommuteInfo",
            });
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_CommuteInfo_descriptor =
        internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_CommuteInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_CommuteInfo_descriptor,
            new java.lang.String[] {
              "JobLocation", "TravelDuration",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.cloud.talent.v4beta1.FiltersProto.getDescriptor();
    com.google.cloud.talent.v4beta1.HistogramProto.getDescriptor();
    com.google.cloud.talent.v4beta1.JobResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

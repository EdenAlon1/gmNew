package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjjn {
    public static final String[] a = {"messages._id", "messages.conversation_id", "messages.sender_id", "messages.sent_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.is_hidden", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.cms_id", "messages.web_id", "messages.usage_stats_logging_id", "messages.original_rcs_message_id", "messages.result_code", "messages.cms_life_cycle", "messages.fallback_reason", "messages.trace_id", "messages.xms_transport", "(count(parts._id)) AS parts_count", "group_concat(quote(parts._id), '|')", "parts.message_id", "group_concat(quote(parts.text), '|')", "group_concat(quote(parts.uri), '|')", "group_concat(quote(parts.content_type), '|')", "group_concat(quote(parts.original_uri), '|')", "group_concat(quote(parts.storage_uri), '|')", "group_concat(quote(parts.width), '|')", "group_concat(quote(parts.height), '|')", "parts.timestamp", "parts.output_uri", "group_concat(quote(parts.target_size), '|')", "parts.processing_status", "group_concat(quote(parts.cms_attachment_processing_status), '|')", "parts.conversation_id", "parts.sticker_set_id", "parts.sticker_id", "parts.media_modified_timestamp", "parts.longitude", "parts.latitude", "group_concat(quote(parts.preview_content_uri), '|')", "parts.preview_content_type", "group_concat(quote(parts.fallback_uri), '|')", "group_concat(quote(parts.source), '|')", "group_concat(quote(parts.bundle_index), '|')", "group_concat(quote(parts.blob_id), '|')", "group_concat(quote(parts.blob_gaia_email), '|')", "parts.cms_full_size_blob_id", "parts.cms_media_encryption_key", "parts.cms_compressed_media_encryption_key", "group_concat(quote(parts.blob_upload_permanent_failure), '|')", "group_concat(quote(parts.blob_upload_timestamp), '|')", "group_concat(quote(parts.expressive_sticker_name), '|')", "group_concat(quote(parts.file_name), '|')", "group_concat(quote(parts.duration), '|')", "group_concat(quote(parts.compressed_blob_id), '|')", "parts.cms_compressed_blob_id", "group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')", "group_concat(quote(parts.compressed_blob_upload_timestamp), '|')", "group_concat(quote(parts.media_encryption_key), '|')", "group_concat(quote(parts.compressed_media_encryption_key), '|')", "group_concat(quote(parts.missing_entry_in_telephony), '|')", "parts.awaiting_reverse_sync", "parts.file_size_bytes", "parts.local_cache_path", "group_concat(quote(parts.media_send_type), '|')", "parts.voice_metadata", "parts.validation_status", "parts.processing_id", "parts.rich_card_media_download_failure_reason", "parts.image_display_state", "parts.preserve_size", "group_concat(quote(parts.rowid), '|') AS parts__ROWID", "participants.normalized_destination", "participants.send_destination", "participants.display_destination", "participants.full_name", "participants.first_name", "participants.profile_photo_uri", "participants.contact_id", "participants.lookup_key", "participants.color_palette_index", "participants.color_type", "participants.extended_color", "participants.blocked", "participants.participant_type", "participants.is_spam", "participants.latest_verification_status", "participants.directory_id", "participants.name_source", "participants.photo_source", "reports_concat_view._id_read_reports", "reports_concat_view.message_id_read_reports", "reports_concat_view.participant_id_read_reports", "reports_concat_view.receive_time_read_reports", "reports_concat_view.read_time_read_reports", "reports_concat_view.ftd_time_read_reports", "reports_concat_view.read_reports__ROWID_read_reports", "user_refs_concat_view.message_id_user_references", "user_refs_concat_view.participant_id_user_references", "user_refs_concat_view.user_ref_datetime_user_references", "user_refs_concat_view.user_references__ROWID_user_references", "user_refs_concat_view.user_ref_display_name", "user_refs_concat_view.user_ref_profile_photo_uri", "user_refs_concat_view.user_ref_full_name", "user_refs_concat_view.user_ref_lookup_key", "user_refs_concat_view.normalized_destination_participants", "user_refs_concat_view.color_palette_index_participants", "user_refs_concat_view.color_type_participants", "user_refs_concat_view.extended_color_participants", "user_refs_concat_view.participants__ROWID_participants", "link_preview.message_id", "link_preview.trigger_url", "link_preview.expiration_time_millis", "link_preview.link_title", "link_preview.link_description", "link_preview.link_image_url", "link_preview.link_domain", "link_preview.link_canonical_url", "link_preview.link_preview_prevented", "link_preview.link_preview_failed", "verified_sms_brands.name", "verified_sms_brands.description", "verified_sms_brands.logo_uri", "conversations.participant_normalized_destination", "conversations.conv_type", "conversations.has_ea2p_bot_recipient", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.rcs_session_allows_revocation", "conversations.recipient_offline_timestamp_ms", "message_reactions.reactions_data", "file_transfer.transfer_id", "message_star.message_id", "message_photos_sharing.sharing_state", "group_concat(quote(vmt.part_id), '|')", "group_concat(quote(vmt.vmt_status), '|')", "group_concat(quote(vmt.text), '|')", "group_concat(quote(vmt.locale), '|')", "group_concat(quote(vmt.rowid), '|') AS vmt__ROWID", "message_replies_view.message_id_message_replies", "message_replies_view._id_messages", "message_replies_view.received_timestamp_messages", "message_replies_view._id_participants", "message_replies_view.sub_id_participants", "message_replies_view.normalized_destination_participants", "message_replies_view.display_destination_participants", "message_replies_view.full_name_participants", "message_replies_view.first_name_participants", "message_replies_view._id_parts", "message_replies_view.text_parts", "message_replies_view.uri_parts", "message_replies_view.content_type_parts", "message_replies_view.file_name_parts", "message_replies_view.duration_parts", "message_replies_view.parts__ROWID_parts", "message_replies_view.trigger_url_link_preview", "message_replies_view.expiration_time_millis_link_preview", "message_replies_view.link_title_link_preview", "message_replies_view.link_image_url_link_preview", "message_replies_view.link_preview_failed_link_preview", "profiles_table.display_name", "message_captions.caption"};
    public static final enhk b;
    public static final bjjb c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("messages.message_report_status", 13020);
        enhdVar.k("messages.rcs_expiry", 59890);
        enhdVar.k("messages.mms_retrieve_text", 9030);
        enhdVar.k("messages.rcs_message_id_with_text_type", 41040);
        enhdVar.k("messages.etouffee_status", 29060);
        enhdVar.k("messages.verification_status", 29090);
        enhdVar.k("messages.is_hidden", 30010);
        enhdVar.k("messages.rcs_file_transfer_session_id", 10004);
        enhdVar.k("messages.sms_error_code", 9000);
        enhdVar.k("messages.sms_error_desc_map_name", 9000);
        enhdVar.k("messages.cms_id", 31010);
        enhdVar.k("messages.web_id", 19020);
        enhdVar.k("messages.usage_stats_logging_id", 29100);
        enhdVar.k("messages.original_rcs_message_id", 35030);
        enhdVar.k("messages.result_code", 58040);
        enhdVar.k("messages.cms_life_cycle", 58210);
        enhdVar.k("messages.fallback_reason", 58710);
        enhdVar.k("messages.trace_id", 58680);
        enhdVar.k("messages.xms_transport", 59310);
        enhdVar.k("(count(parts._id)) AS parts_count", 0);
        enhdVar.k("group_concat(quote(parts.original_uri), '|')", 10021);
        enhdVar.k("group_concat(quote(parts.storage_uri), '|')", 29060);
        enhdVar.k("parts.timestamp", 3010);
        enhdVar.k("parts.output_uri", 4020);
        enhdVar.k("group_concat(quote(parts.target_size), '|')", 4020);
        enhdVar.k("parts.processing_status", 4020);
        enhdVar.k("group_concat(quote(parts.cms_attachment_processing_status), '|')", 44010);
        enhdVar.k("parts.sticker_set_id", 5020);
        enhdVar.k("parts.sticker_id", 5020);
        enhdVar.k("parts.media_modified_timestamp", 7000);
        enhdVar.k("parts.longitude", 10005);
        enhdVar.k("parts.latitude", 10005);
        enhdVar.k("group_concat(quote(parts.preview_content_uri), '|')", 10017);
        enhdVar.k("parts.preview_content_type", 10017);
        enhdVar.k("group_concat(quote(parts.fallback_uri), '|')", 13000);
        enhdVar.k("group_concat(quote(parts.source), '|')", 14010);
        enhdVar.k("group_concat(quote(parts.bundle_index), '|')", 17010);
        enhdVar.k("group_concat(quote(parts.blob_id), '|')", 17020);
        enhdVar.k("group_concat(quote(parts.blob_gaia_email), '|')", 59570);
        enhdVar.k("parts.cms_full_size_blob_id", 40040);
        enhdVar.k("parts.cms_media_encryption_key", 42010);
        enhdVar.k("parts.cms_compressed_media_encryption_key", 42070);
        enhdVar.k("group_concat(quote(parts.blob_upload_permanent_failure), '|')", 18000);
        enhdVar.k("group_concat(quote(parts.blob_upload_timestamp), '|')", 19030);
        enhdVar.k("group_concat(quote(parts.expressive_sticker_name), '|')", 22060);
        enhdVar.k("group_concat(quote(parts.file_name), '|')", 26000);
        enhdVar.k("group_concat(quote(parts.duration), '|')", 26040);
        enhdVar.k("group_concat(quote(parts.compressed_blob_id), '|')", 27000);
        enhdVar.k("parts.cms_compressed_blob_id", 40040);
        enhdVar.k("group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')", 27000);
        enhdVar.k("group_concat(quote(parts.compressed_blob_upload_timestamp), '|')", 27000);
        enhdVar.k("group_concat(quote(parts.media_encryption_key), '|')", 30040);
        enhdVar.k("group_concat(quote(parts.compressed_media_encryption_key), '|')", 30040);
        enhdVar.k("group_concat(quote(parts.missing_entry_in_telephony), '|')", 52030);
        enhdVar.k("parts.awaiting_reverse_sync", 53040);
        enhdVar.k("parts.file_size_bytes", 52050);
        enhdVar.k("parts.local_cache_path", 52050);
        enhdVar.k("group_concat(quote(parts.media_send_type), '|')", 58150);
        enhdVar.k("parts.voice_metadata", 59470);
        enhdVar.k("parts.validation_status", 58770);
        enhdVar.k("parts.processing_id", 60080);
        enhdVar.k("parts.rich_card_media_download_failure_reason", 60230);
        enhdVar.k("parts.image_display_state", 60240);
        enhdVar.k("parts.preserve_size", 60680);
        enhdVar.k("participants.color_type", 1000);
        enhdVar.k("participants.extended_color", 10027);
        enhdVar.k("participants.participant_type", 12001);
        enhdVar.k("participants.is_spam", 24060);
        enhdVar.k("participants.latest_verification_status", 31030);
        enhdVar.k("participants.directory_id", 35010);
        enhdVar.k("participants.name_source", 59550);
        enhdVar.k("participants.photo_source", 59550);
        enhdVar.k("reports_concat_view._id_read_reports", 0);
        enhdVar.k("reports_concat_view.message_id_read_reports", 0);
        enhdVar.k("reports_concat_view.participant_id_read_reports", 0);
        enhdVar.k("reports_concat_view.receive_time_read_reports", 0);
        enhdVar.k("reports_concat_view.read_time_read_reports", 0);
        enhdVar.k("reports_concat_view.ftd_time_read_reports", 0);
        enhdVar.k("user_refs_concat_view.message_id_user_references", 0);
        enhdVar.k("user_refs_concat_view.participant_id_user_references", 0);
        enhdVar.k("user_refs_concat_view.user_ref_datetime_user_references", 0);
        enhdVar.k("user_refs_concat_view.user_ref_display_name", 0);
        enhdVar.k("user_refs_concat_view.user_ref_profile_photo_uri", 0);
        enhdVar.k("user_refs_concat_view.user_ref_full_name", 0);
        enhdVar.k("user_refs_concat_view.user_ref_lookup_key", 0);
        enhdVar.k("user_refs_concat_view.normalized_destination_participants", 0);
        enhdVar.k("user_refs_concat_view.color_palette_index_participants", 0);
        enhdVar.k("user_refs_concat_view.color_type_participants", 0);
        enhdVar.k("user_refs_concat_view.extended_color_participants", 0);
        enhdVar.k("link_preview.link_preview_prevented", 21010);
        enhdVar.k("link_preview.link_preview_failed", 22020);
        enhdVar.k("conversations.conv_type", 10007);
        enhdVar.k("conversations.has_ea2p_bot_recipient", 12001);
        enhdVar.k("conversations.rcs_group_id", 40050);
        enhdVar.k("conversations.rcs_conference_uri", 40050);
        enhdVar.k("conversations.rcs_session_allows_revocation", 48040);
        enhdVar.k("conversations.recipient_offline_timestamp_ms", 58750);
        enhdVar.k("message_replies_view.message_id_message_replies", 0);
        enhdVar.k("message_replies_view._id_messages", 0);
        enhdVar.k("message_replies_view.received_timestamp_messages", 0);
        enhdVar.k("message_replies_view._id_participants", 0);
        enhdVar.k("message_replies_view.sub_id_participants", 0);
        enhdVar.k("message_replies_view.normalized_destination_participants", 0);
        enhdVar.k("message_replies_view.display_destination_participants", 0);
        enhdVar.k("message_replies_view.full_name_participants", 0);
        enhdVar.k("message_replies_view.first_name_participants", 0);
        enhdVar.k("message_replies_view._id_parts", 0);
        enhdVar.k("message_replies_view.text_parts", 0);
        enhdVar.k("message_replies_view.uri_parts", 0);
        enhdVar.k("message_replies_view.content_type_parts", 0);
        enhdVar.k("message_replies_view.file_name_parts", 0);
        enhdVar.k("message_replies_view.duration_parts", 0);
        enhdVar.k("message_replies_view.trigger_url_link_preview", 0);
        enhdVar.k("message_replies_view.expiration_time_millis_link_preview", 0);
        enhdVar.k("message_replies_view.link_title_link_preview", 0);
        enhdVar.k("message_replies_view.link_image_url_link_preview", 0);
        enhdVar.k("message_replies_view.link_preview_failed_link_preview", 0);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("_id", "index_unsent_rcs_report");
        enhdVar2.k("sender_id", "index_null_sender_id");
        enhdVar2.k("sent_timestamp", "index_null_sent_timestamp");
        enhdVar2.k("read", "index_messages_read_0");
        enhdVar2.k("sms_message_uri", "index_null_sms_message_uri");
        enhdVar2.k("rcs_expiry", "index_null_rcs_expiry");
        enhdVar2.k("self_id", "index_null_self_id");
        enhdVar2.k(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "index_null_verification_status");
        enhdVar2.k("cms_id", "index_null_cms_id");
        enhdVar2.k("web_id", "index_null_web_id");
        enhdVar2.k("original_rcs_message_id", "index_null_original_rcs_message_id");
        enhdVar2.c();
        c = new bjjb();
    }

    public static final bjji a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("messages._id");
            engrVar.h("messages.conversation_id");
            engrVar.h("messages.sender_id");
            engrVar.h("messages.sent_timestamp");
            engrVar.h("messages.received_timestamp");
            engrVar.h("messages.message_protocol");
            engrVar.h("messages.message_status");
            if (c2.intValue() >= 13020) {
                engrVar.h("messages.message_report_status");
            }
            engrVar.h("messages.seen");
            engrVar.h("messages.read");
            engrVar.h("messages.sms_message_uri");
            engrVar.h("messages.sms_priority");
            engrVar.h("messages.sms_message_size");
            engrVar.h("messages.mms_subject");
            engrVar.h("messages.mms_expiry");
            if (c2.intValue() >= 59890) {
                engrVar.h("messages.rcs_expiry");
            }
            if (c2.intValue() >= 9030) {
                engrVar.h("messages.mms_retrieve_text");
            }
            engrVar.h("messages.raw_status");
            engrVar.h("messages.self_id");
            if (c2.intValue() >= 41040) {
                engrVar.h("messages.rcs_message_id_with_text_type");
            }
            if (c2.intValue() >= 29060) {
                engrVar.h("messages.etouffee_status");
            }
            if (c2.intValue() >= 29090) {
                engrVar.h("messages.verification_status");
            }
            if (c2.intValue() >= 30010) {
                engrVar.h("messages.is_hidden");
            }
            if (c2.intValue() >= 10004) {
                engrVar.h("messages.rcs_file_transfer_session_id");
            }
            if (c2.intValue() >= 9000) {
                engrVar.h("messages.sms_error_code");
            }
            if (c2.intValue() >= 9000) {
                engrVar.h("messages.sms_error_desc_map_name");
            }
            if (c2.intValue() >= 31010) {
                engrVar.h("messages.cms_id");
            }
            if (c2.intValue() >= 19020) {
                engrVar.h("messages.web_id");
            }
            if (c2.intValue() >= 29100) {
                engrVar.h("messages.usage_stats_logging_id");
            }
            if (c2.intValue() >= 35030) {
                engrVar.h("messages.original_rcs_message_id");
            }
            if (c2.intValue() >= 58040) {
                engrVar.h("messages.result_code");
            }
            if (c2.intValue() >= 58210) {
                engrVar.h("messages.cms_life_cycle");
            }
            if (c2.intValue() >= 58710) {
                engrVar.h("messages.fallback_reason");
            }
            if (c2.intValue() >= 58680) {
                engrVar.h("messages.trace_id");
            }
            if (c2.intValue() >= 59310) {
                engrVar.h("messages.xms_transport");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("(count(parts._id)) AS parts_count");
            }
            engrVar.h("group_concat(quote(parts._id), '|')");
            engrVar.h("parts.message_id");
            engrVar.h("group_concat(quote(parts.text), '|')");
            engrVar.h("group_concat(quote(parts.uri), '|')");
            engrVar.h("group_concat(quote(parts.content_type), '|')");
            if (c2.intValue() >= 10021) {
                engrVar.h("group_concat(quote(parts.original_uri), '|')");
            }
            if (c2.intValue() >= 29060) {
                engrVar.h("group_concat(quote(parts.storage_uri), '|')");
            }
            engrVar.h("group_concat(quote(parts.width), '|')");
            engrVar.h("group_concat(quote(parts.height), '|')");
            if (c2.intValue() >= 3010) {
                engrVar.h("parts.timestamp");
            }
            if (c2.intValue() >= 4020) {
                engrVar.h("parts.output_uri");
            }
            if (c2.intValue() >= 4020) {
                engrVar.h("group_concat(quote(parts.target_size), '|')");
            }
            if (c2.intValue() >= 4020) {
                engrVar.h("parts.processing_status");
            }
            if (c2.intValue() >= 44010) {
                engrVar.h("group_concat(quote(parts.cms_attachment_processing_status), '|')");
            }
            engrVar.h("parts.conversation_id");
            if (c2.intValue() >= 5020) {
                engrVar.h("parts.sticker_set_id");
            }
            if (c2.intValue() >= 5020) {
                engrVar.h("parts.sticker_id");
            }
            if (c2.intValue() >= 7000) {
                engrVar.h("parts.media_modified_timestamp");
            }
            if (c2.intValue() >= 10005) {
                engrVar.h("parts.longitude");
            }
            if (c2.intValue() >= 10005) {
                engrVar.h("parts.latitude");
            }
            if (c2.intValue() >= 10017) {
                engrVar.h("group_concat(quote(parts.preview_content_uri), '|')");
            }
            if (c2.intValue() >= 10017) {
                engrVar.h("parts.preview_content_type");
            }
            if (c2.intValue() >= 13000) {
                engrVar.h("group_concat(quote(parts.fallback_uri), '|')");
            }
            if (c2.intValue() >= 14010) {
                engrVar.h("group_concat(quote(parts.source), '|')");
            }
            if (c2.intValue() >= 17010) {
                engrVar.h("group_concat(quote(parts.bundle_index), '|')");
            }
            if (c2.intValue() >= 17020) {
                engrVar.h("group_concat(quote(parts.blob_id), '|')");
            }
            if (c2.intValue() >= 59570) {
                engrVar.h("group_concat(quote(parts.blob_gaia_email), '|')");
            }
            if (c2.intValue() >= 40040) {
                engrVar.h("parts.cms_full_size_blob_id");
            }
            if (c2.intValue() >= 42010) {
                engrVar.h("parts.cms_media_encryption_key");
            }
            if (c2.intValue() >= 42070) {
                engrVar.h("parts.cms_compressed_media_encryption_key");
            }
            if (c2.intValue() >= 18000) {
                engrVar.h("group_concat(quote(parts.blob_upload_permanent_failure), '|')");
            }
            if (c2.intValue() >= 19030) {
                engrVar.h("group_concat(quote(parts.blob_upload_timestamp), '|')");
            }
            if (c2.intValue() >= 22060) {
                engrVar.h("group_concat(quote(parts.expressive_sticker_name), '|')");
            }
            if (c2.intValue() >= 26000) {
                engrVar.h("group_concat(quote(parts.file_name), '|')");
            }
            if (c2.intValue() >= 26040) {
                engrVar.h("group_concat(quote(parts.duration), '|')");
            }
            if (c2.intValue() >= 27000) {
                engrVar.h("group_concat(quote(parts.compressed_blob_id), '|')");
            }
            if (c2.intValue() >= 40040) {
                engrVar.h("parts.cms_compressed_blob_id");
            }
            if (c2.intValue() >= 27000) {
                engrVar.h("group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')");
            }
            if (c2.intValue() >= 27000) {
                engrVar.h("group_concat(quote(parts.compressed_blob_upload_timestamp), '|')");
            }
            if (c2.intValue() >= 30040) {
                engrVar.h("group_concat(quote(parts.media_encryption_key), '|')");
            }
            if (c2.intValue() >= 30040) {
                engrVar.h("group_concat(quote(parts.compressed_media_encryption_key), '|')");
            }
            if (c2.intValue() >= 52030) {
                engrVar.h("group_concat(quote(parts.missing_entry_in_telephony), '|')");
            }
            if (c2.intValue() >= 53040) {
                engrVar.h("parts.awaiting_reverse_sync");
            }
            if (c2.intValue() >= 52050) {
                engrVar.h("parts.file_size_bytes");
            }
            if (c2.intValue() >= 52050) {
                engrVar.h("parts.local_cache_path");
            }
            if (c2.intValue() >= 58150) {
                engrVar.h("group_concat(quote(parts.media_send_type), '|')");
            }
            if (c2.intValue() >= 59470) {
                engrVar.h("parts.voice_metadata");
            }
            if (c2.intValue() >= 58770) {
                engrVar.h("parts.validation_status");
            }
            if (c2.intValue() >= 60080) {
                engrVar.h("parts.processing_id");
            }
            if (c2.intValue() >= 60230) {
                engrVar.h("parts.rich_card_media_download_failure_reason");
            }
            if (c2.intValue() >= 60240) {
                engrVar.h("parts.image_display_state");
            }
            if (c2.intValue() >= 60680) {
                engrVar.h("parts.preserve_size");
            }
            engrVar.h("participants.normalized_destination");
            engrVar.h("participants.send_destination");
            engrVar.h("participants.display_destination");
            engrVar.h("participants.full_name");
            engrVar.h("participants.first_name");
            engrVar.h("participants.profile_photo_uri");
            engrVar.h("participants.contact_id");
            engrVar.h("participants.lookup_key");
            engrVar.h("participants.color_palette_index");
            if (c2.intValue() >= 1000) {
                engrVar.h("participants.color_type");
            }
            if (c2.intValue() >= 10027) {
                engrVar.h("participants.extended_color");
            }
            engrVar.h("participants.blocked");
            if (c2.intValue() >= 12001) {
                engrVar.h("participants.participant_type");
            }
            if (c2.intValue() >= 24060) {
                engrVar.h("participants.is_spam");
            }
            if (c2.intValue() >= 31030) {
                engrVar.h("participants.latest_verification_status");
            }
            if (c2.intValue() >= 35010) {
                engrVar.h("participants.directory_id");
            }
            if (c2.intValue() >= 59550) {
                engrVar.h("participants.name_source");
            }
            if (c2.intValue() >= 59550) {
                engrVar.h("participants.photo_source");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("reports_concat_view._id_read_reports");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("reports_concat_view.message_id_read_reports");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("reports_concat_view.participant_id_read_reports");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("reports_concat_view.receive_time_read_reports");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("reports_concat_view.read_time_read_reports");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("reports_concat_view.ftd_time_read_reports");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("user_refs_concat_view.message_id_user_references");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("user_refs_concat_view.participant_id_user_references");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("user_refs_concat_view.user_ref_datetime_user_references");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("user_refs_concat_view.user_ref_display_name");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("user_refs_concat_view.user_ref_profile_photo_uri");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("user_refs_concat_view.user_ref_full_name");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("user_refs_concat_view.user_ref_lookup_key");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("user_refs_concat_view.normalized_destination_participants");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("user_refs_concat_view.color_palette_index_participants");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("user_refs_concat_view.color_type_participants");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("user_refs_concat_view.extended_color_participants");
            }
            engrVar.h("link_preview.message_id");
            engrVar.h("link_preview.trigger_url");
            engrVar.h("link_preview.expiration_time_millis");
            engrVar.h("link_preview.link_title");
            engrVar.h("link_preview.link_description");
            engrVar.h("link_preview.link_image_url");
            engrVar.h("link_preview.link_domain");
            engrVar.h("link_preview.link_canonical_url");
            if (c2.intValue() >= 21010) {
                engrVar.h("link_preview.link_preview_prevented");
            }
            if (c2.intValue() >= 22020) {
                engrVar.h("link_preview.link_preview_failed");
            }
            engrVar.h("verified_sms_brands.name");
            engrVar.h("verified_sms_brands.description");
            engrVar.h("verified_sms_brands.logo_uri");
            engrVar.h("conversations.participant_normalized_destination");
            if (c2.intValue() >= 10007) {
                engrVar.h("conversations.conv_type");
            }
            if (c2.intValue() >= 12001) {
                engrVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (c2.intValue() >= 40050) {
                engrVar.h("conversations.rcs_group_id");
            }
            if (c2.intValue() >= 40050) {
                engrVar.h("conversations.rcs_conference_uri");
            }
            if (c2.intValue() >= 48040) {
                engrVar.h("conversations.rcs_session_allows_revocation");
            }
            if (c2.intValue() >= 58750) {
                engrVar.h("conversations.recipient_offline_timestamp_ms");
            }
            engrVar.h("message_reactions.reactions_data");
            engrVar.h("file_transfer.transfer_id");
            engrVar.h("message_star.message_id");
            engrVar.h("message_photos_sharing.sharing_state");
            engrVar.h("group_concat(quote(vmt.part_id), '|')");
            engrVar.h("group_concat(quote(vmt.vmt_status), '|')");
            engrVar.h("group_concat(quote(vmt.text), '|')");
            engrVar.h("group_concat(quote(vmt.locale), '|')");
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.message_id_message_replies");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view._id_messages");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.received_timestamp_messages");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view._id_participants");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.sub_id_participants");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.normalized_destination_participants");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.display_destination_participants");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.full_name_participants");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.first_name_participants");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view._id_parts");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.text_parts");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.uri_parts");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.content_type_parts");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.file_name_parts");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.duration_parts");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.trigger_url_link_preview");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.expiration_time_millis_link_preview");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.link_title_link_preview");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.link_image_url_link_preview");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("message_replies_view.link_preview_failed_link_preview");
            }
            engrVar.h("profiles_table.display_name");
            engrVar.h("message_captions.caption");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bjji(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(d().a());
    }

    public static dtzf d() {
        return b().P();
    }
}

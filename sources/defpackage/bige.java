package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bige {
    public static final String[] a = {"messages._id", "messages.conversation_id", "messages.sender_id", "messages.sent_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.is_hidden", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.cms_id", "messages.web_id", "messages.usage_stats_logging_id", "messages.original_rcs_message_id", "messages.result_code", "messages.cms_life_cycle", "messages.fallback_reason", "messages.trace_id", "messages.xms_transport", "group_concat(quote((coalesce(user_ref_participant.first_name,user_ref_participant.full_name,user_ref_participant.display_destination))), '|') AS user_ref_display_name", "group_concat(quote((ifnull(user_ref_participant.profile_photo_uri,\"\"))), '|') AS user_ref_profile_photo_uri", "group_concat(quote((ifnull(user_ref_participant.full_name,\"\"))), '|') AS user_ref_full_name", "group_concat(quote((ifnull(user_ref_participant.lookup_key,\"\"))), '|') AS user_ref_lookup_key", "(count(parts._id)) AS parts_count", "group_concat(quote(parts._id), '|')", "parts.message_id", "group_concat(quote(parts.text), '|')", "group_concat(quote(parts.uri), '|')", "group_concat(quote(parts.content_type), '|')", "group_concat(quote(parts.original_uri), '|')", "group_concat(quote(parts.storage_uri), '|')", "group_concat(quote(parts.width), '|')", "group_concat(quote(parts.height), '|')", "parts.timestamp", "parts.output_uri", "group_concat(quote(parts.target_size), '|')", "parts.processing_status", "group_concat(quote(parts.cms_attachment_processing_status), '|')", "parts.conversation_id", "parts.sticker_set_id", "parts.sticker_id", "parts.media_modified_timestamp", "parts.longitude", "parts.latitude", "group_concat(quote(parts.preview_content_uri), '|')", "parts.preview_content_type", "group_concat(quote(parts.fallback_uri), '|')", "group_concat(quote(parts.source), '|')", "group_concat(quote(parts.bundle_index), '|')", "group_concat(quote(parts.blob_id), '|')", "group_concat(quote(parts.blob_gaia_email), '|')", "parts.cms_full_size_blob_id", "parts.cms_media_encryption_key", "parts.cms_compressed_media_encryption_key", "group_concat(quote(parts.blob_upload_permanent_failure), '|')", "group_concat(quote(parts.blob_upload_timestamp), '|')", "group_concat(quote(parts.expressive_sticker_name), '|')", "group_concat(quote(parts.file_name), '|')", "group_concat(quote(parts.duration), '|')", "group_concat(quote(parts.compressed_blob_id), '|')", "parts.cms_compressed_blob_id", "group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')", "group_concat(quote(parts.compressed_blob_upload_timestamp), '|')", "group_concat(quote(parts.media_encryption_key), '|')", "group_concat(quote(parts.compressed_media_encryption_key), '|')", "group_concat(quote(parts.missing_entry_in_telephony), '|')", "parts.awaiting_reverse_sync", "parts.file_size_bytes", "parts.local_cache_path", "group_concat(quote(parts.media_send_type), '|')", "parts.voice_metadata", "parts.validation_status", "parts.processing_id", "parts.rich_card_media_download_failure_reason", "parts.image_display_state", "parts.preserve_size", "group_concat(quote(parts.rowid), '|') AS parts__ROWID", "participants.normalized_destination", "participants.send_destination", "participants.display_destination", "participants.full_name", "participants.first_name", "participants.profile_photo_uri", "participants.contact_id", "participants.lookup_key", "participants.color_palette_index", "participants.color_type", "participants.extended_color", "participants.blocked", "participants.participant_type", "participants.is_spam", "participants.latest_verification_status", "participants.directory_id", "participants.name_source", "participants.photo_source", "read_reports._id", "read_reports.message_id", "group_concat(quote(read_reports.participant_id), '|')", "group_concat(quote(read_reports.receive_time), '|')", "group_concat(quote(read_reports.read_time), '|')", "group_concat(quote(read_reports.ftd_time), '|')", "group_concat(quote(read_reports.rowid), '|') AS read_reports__ROWID", "user_references._id", "user_references.message_id", "group_concat(quote(user_references.user_ref_id), '|')", "group_concat(quote(user_references.user_ref_datetime), '|')", "group_concat(quote(user_references.rowid), '|') AS user_references__ROWID", "group_concat(quote(user_ref_participant.normalized_destination), '|')", "group_concat(quote(user_ref_participant.color_palette_index), '|')", "group_concat(quote(user_ref_participant.color_type), '|')", "group_concat(quote(user_ref_participant.extended_color), '|')", "group_concat(quote(user_ref_participant.participant_type), '|')", "group_concat(quote(user_ref_participant.rowid), '|') AS user_ref_participant__ROWID", "link_preview.message_id", "link_preview.trigger_url", "link_preview.expiration_time_millis", "link_preview.link_title", "link_preview.link_description", "link_preview.link_image_url", "link_preview.link_domain", "link_preview.link_canonical_url", "link_preview.link_preview_prevented", "link_preview.link_preview_failed", "verified_sms_brands.name", "verified_sms_brands.description", "verified_sms_brands.logo_uri", "conversations.participant_normalized_destination", "conversations.conv_type", "conversations.has_ea2p_bot_recipient", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.rcs_session_allows_revocation", "conversations.recipient_offline_timestamp_ms", "message_reactions.reactions_data", "file_transfer.transfer_id", "message_star.message_id", "message_photos_sharing.sharing_state", "group_concat(quote(vmt.part_id), '|')", "group_concat(quote(vmt.vmt_status), '|')", "group_concat(quote(vmt.text), '|')", "group_concat(quote(vmt.locale), '|')", "group_concat(quote(vmt.rowid), '|') AS vmt__ROWID", "replied_to_message._id", "replied_to_message.received_timestamp", "replied_to_participant._id", "replied_to_participant.sub_id", "replied_to_participant.normalized_destination", "replied_to_participant.display_destination", "replied_to_participant.full_name", "replied_to_participant.first_name", "replied_to_message_part.text", "replied_to_message_part.uri", "replied_to_message_part.content_type", "replied_to_message_part.file_name", "replied_to_message_part.duration", "replied_to_message_link_preview.trigger_url", "replied_to_message_link_preview.expiration_time_millis", "replied_to_message_link_preview.link_title", "replied_to_message_link_preview.link_image_url", "replied_to_message_link_preview.link_preview_failed", "profiles_table.display_name", "message_captions.caption"};
    public static final bifs b;

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
        enhdVar.k("group_concat(quote((coalesce(user_ref_participant.first_name,user_ref_participant.full_name,user_ref_participant.display_destination))), '|') AS user_ref_display_name", 0);
        enhdVar.k("group_concat(quote((ifnull(user_ref_participant.profile_photo_uri,\"\"))), '|') AS user_ref_profile_photo_uri", 0);
        enhdVar.k("group_concat(quote((ifnull(user_ref_participant.full_name,\"\"))), '|') AS user_ref_full_name", 0);
        enhdVar.k("group_concat(quote((ifnull(user_ref_participant.lookup_key,\"\"))), '|') AS user_ref_lookup_key", 0);
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
        enhdVar.k("group_concat(quote(read_reports.ftd_time), '|')", 58880);
        enhdVar.k("group_concat(quote(user_ref_participant.color_type), '|')", 1000);
        enhdVar.k("group_concat(quote(user_ref_participant.extended_color), '|')", 10027);
        enhdVar.k("group_concat(quote(user_ref_participant.participant_type), '|')", 12001);
        enhdVar.k("link_preview.link_preview_prevented", 21010);
        enhdVar.k("link_preview.link_preview_failed", 22020);
        enhdVar.k("conversations.conv_type", 10007);
        enhdVar.k("conversations.has_ea2p_bot_recipient", 12001);
        enhdVar.k("conversations.rcs_group_id", 40050);
        enhdVar.k("conversations.rcs_conference_uri", 40050);
        enhdVar.k("conversations.rcs_session_allows_revocation", 48040);
        enhdVar.k("conversations.recipient_offline_timestamp_ms", 58750);
        enhdVar.k("replied_to_message_part.file_name", 26000);
        enhdVar.k("replied_to_message_part.duration", 26040);
        enhdVar.k("replied_to_message_link_preview.link_preview_failed", 22020);
        enhdVar.c();
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
        b = new bifs();
    }

    public static final bifz a() {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
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
            if (c.intValue() >= 13020) {
                engrVar.h("messages.message_report_status");
            }
            engrVar.h("messages.seen");
            engrVar.h("messages.read");
            engrVar.h("messages.sms_message_uri");
            engrVar.h("messages.sms_priority");
            engrVar.h("messages.sms_message_size");
            engrVar.h("messages.mms_subject");
            engrVar.h("messages.mms_expiry");
            if (c.intValue() >= 59890) {
                engrVar.h("messages.rcs_expiry");
            }
            if (c.intValue() >= 9030) {
                engrVar.h("messages.mms_retrieve_text");
            }
            engrVar.h("messages.raw_status");
            engrVar.h("messages.self_id");
            if (c.intValue() >= 41040) {
                engrVar.h("messages.rcs_message_id_with_text_type");
            }
            if (c.intValue() >= 29060) {
                engrVar.h("messages.etouffee_status");
            }
            if (c.intValue() >= 29090) {
                engrVar.h("messages.verification_status");
            }
            if (c.intValue() >= 30010) {
                engrVar.h("messages.is_hidden");
            }
            if (c.intValue() >= 10004) {
                engrVar.h("messages.rcs_file_transfer_session_id");
            }
            if (c.intValue() >= 9000) {
                engrVar.h("messages.sms_error_code");
            }
            if (c.intValue() >= 9000) {
                engrVar.h("messages.sms_error_desc_map_name");
            }
            if (c.intValue() >= 31010) {
                engrVar.h("messages.cms_id");
            }
            if (c.intValue() >= 19020) {
                engrVar.h("messages.web_id");
            }
            if (c.intValue() >= 29100) {
                engrVar.h("messages.usage_stats_logging_id");
            }
            if (c.intValue() >= 35030) {
                engrVar.h("messages.original_rcs_message_id");
            }
            if (c.intValue() >= 58040) {
                engrVar.h("messages.result_code");
            }
            if (c.intValue() >= 58210) {
                engrVar.h("messages.cms_life_cycle");
            }
            if (c.intValue() >= 58710) {
                engrVar.h("messages.fallback_reason");
            }
            if (c.intValue() >= 58680) {
                engrVar.h("messages.trace_id");
            }
            if (c.intValue() >= 59310) {
                engrVar.h("messages.xms_transport");
            }
            if (c.intValue() >= 0) {
                engrVar.h("group_concat(quote((coalesce(user_ref_participant.first_name,user_ref_participant.full_name,user_ref_participant.display_destination))), '|') AS user_ref_display_name");
            }
            if (c.intValue() >= 0) {
                engrVar.h("group_concat(quote((ifnull(user_ref_participant.profile_photo_uri,\"\"))), '|') AS user_ref_profile_photo_uri");
            }
            if (c.intValue() >= 0) {
                engrVar.h("group_concat(quote((ifnull(user_ref_participant.full_name,\"\"))), '|') AS user_ref_full_name");
            }
            if (c.intValue() >= 0) {
                engrVar.h("group_concat(quote((ifnull(user_ref_participant.lookup_key,\"\"))), '|') AS user_ref_lookup_key");
            }
            if (c.intValue() >= 0) {
                engrVar.h("(count(parts._id)) AS parts_count");
            }
            engrVar.h("group_concat(quote(parts._id), '|')");
            engrVar.h("parts.message_id");
            engrVar.h("group_concat(quote(parts.text), '|')");
            engrVar.h("group_concat(quote(parts.uri), '|')");
            engrVar.h("group_concat(quote(parts.content_type), '|')");
            if (c.intValue() >= 10021) {
                engrVar.h("group_concat(quote(parts.original_uri), '|')");
            }
            if (c.intValue() >= 29060) {
                engrVar.h("group_concat(quote(parts.storage_uri), '|')");
            }
            engrVar.h("group_concat(quote(parts.width), '|')");
            engrVar.h("group_concat(quote(parts.height), '|')");
            if (c.intValue() >= 3010) {
                engrVar.h("parts.timestamp");
            }
            if (c.intValue() >= 4020) {
                engrVar.h("parts.output_uri");
            }
            if (c.intValue() >= 4020) {
                engrVar.h("group_concat(quote(parts.target_size), '|')");
            }
            if (c.intValue() >= 4020) {
                engrVar.h("parts.processing_status");
            }
            if (c.intValue() >= 44010) {
                engrVar.h("group_concat(quote(parts.cms_attachment_processing_status), '|')");
            }
            engrVar.h("parts.conversation_id");
            if (c.intValue() >= 5020) {
                engrVar.h("parts.sticker_set_id");
            }
            if (c.intValue() >= 5020) {
                engrVar.h("parts.sticker_id");
            }
            if (c.intValue() >= 7000) {
                engrVar.h("parts.media_modified_timestamp");
            }
            if (c.intValue() >= 10005) {
                engrVar.h("parts.longitude");
            }
            if (c.intValue() >= 10005) {
                engrVar.h("parts.latitude");
            }
            if (c.intValue() >= 10017) {
                engrVar.h("group_concat(quote(parts.preview_content_uri), '|')");
            }
            if (c.intValue() >= 10017) {
                engrVar.h("parts.preview_content_type");
            }
            if (c.intValue() >= 13000) {
                engrVar.h("group_concat(quote(parts.fallback_uri), '|')");
            }
            if (c.intValue() >= 14010) {
                engrVar.h("group_concat(quote(parts.source), '|')");
            }
            if (c.intValue() >= 17010) {
                engrVar.h("group_concat(quote(parts.bundle_index), '|')");
            }
            if (c.intValue() >= 17020) {
                engrVar.h("group_concat(quote(parts.blob_id), '|')");
            }
            if (c.intValue() >= 59570) {
                engrVar.h("group_concat(quote(parts.blob_gaia_email), '|')");
            }
            if (c.intValue() >= 40040) {
                engrVar.h("parts.cms_full_size_blob_id");
            }
            if (c.intValue() >= 42010) {
                engrVar.h("parts.cms_media_encryption_key");
            }
            if (c.intValue() >= 42070) {
                engrVar.h("parts.cms_compressed_media_encryption_key");
            }
            if (c.intValue() >= 18000) {
                engrVar.h("group_concat(quote(parts.blob_upload_permanent_failure), '|')");
            }
            if (c.intValue() >= 19030) {
                engrVar.h("group_concat(quote(parts.blob_upload_timestamp), '|')");
            }
            if (c.intValue() >= 22060) {
                engrVar.h("group_concat(quote(parts.expressive_sticker_name), '|')");
            }
            if (c.intValue() >= 26000) {
                engrVar.h("group_concat(quote(parts.file_name), '|')");
            }
            if (c.intValue() >= 26040) {
                engrVar.h("group_concat(quote(parts.duration), '|')");
            }
            if (c.intValue() >= 27000) {
                engrVar.h("group_concat(quote(parts.compressed_blob_id), '|')");
            }
            if (c.intValue() >= 40040) {
                engrVar.h("parts.cms_compressed_blob_id");
            }
            if (c.intValue() >= 27000) {
                engrVar.h("group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')");
            }
            if (c.intValue() >= 27000) {
                engrVar.h("group_concat(quote(parts.compressed_blob_upload_timestamp), '|')");
            }
            if (c.intValue() >= 30040) {
                engrVar.h("group_concat(quote(parts.media_encryption_key), '|')");
            }
            if (c.intValue() >= 30040) {
                engrVar.h("group_concat(quote(parts.compressed_media_encryption_key), '|')");
            }
            if (c.intValue() >= 52030) {
                engrVar.h("group_concat(quote(parts.missing_entry_in_telephony), '|')");
            }
            if (c.intValue() >= 53040) {
                engrVar.h("parts.awaiting_reverse_sync");
            }
            if (c.intValue() >= 52050) {
                engrVar.h("parts.file_size_bytes");
            }
            if (c.intValue() >= 52050) {
                engrVar.h("parts.local_cache_path");
            }
            if (c.intValue() >= 58150) {
                engrVar.h("group_concat(quote(parts.media_send_type), '|')");
            }
            if (c.intValue() >= 59470) {
                engrVar.h("parts.voice_metadata");
            }
            if (c.intValue() >= 58770) {
                engrVar.h("parts.validation_status");
            }
            if (c.intValue() >= 60080) {
                engrVar.h("parts.processing_id");
            }
            if (c.intValue() >= 60230) {
                engrVar.h("parts.rich_card_media_download_failure_reason");
            }
            if (c.intValue() >= 60240) {
                engrVar.h("parts.image_display_state");
            }
            if (c.intValue() >= 60680) {
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
            if (c.intValue() >= 1000) {
                engrVar.h("participants.color_type");
            }
            if (c.intValue() >= 10027) {
                engrVar.h("participants.extended_color");
            }
            engrVar.h("participants.blocked");
            if (c.intValue() >= 12001) {
                engrVar.h("participants.participant_type");
            }
            if (c.intValue() >= 24060) {
                engrVar.h("participants.is_spam");
            }
            if (c.intValue() >= 31030) {
                engrVar.h("participants.latest_verification_status");
            }
            if (c.intValue() >= 35010) {
                engrVar.h("participants.directory_id");
            }
            if (c.intValue() >= 59550) {
                engrVar.h("participants.name_source");
            }
            if (c.intValue() >= 59550) {
                engrVar.h("participants.photo_source");
            }
            engrVar.h("read_reports._id");
            engrVar.h("read_reports.message_id");
            engrVar.h("group_concat(quote(read_reports.participant_id), '|')");
            engrVar.h("group_concat(quote(read_reports.receive_time), '|')");
            engrVar.h("group_concat(quote(read_reports.read_time), '|')");
            if (c.intValue() >= 58880) {
                engrVar.h("group_concat(quote(read_reports.ftd_time), '|')");
            }
            engrVar.h("user_references._id");
            engrVar.h("user_references.message_id");
            engrVar.h("group_concat(quote(user_references.user_ref_id), '|')");
            engrVar.h("group_concat(quote(user_references.user_ref_datetime), '|')");
            engrVar.h("group_concat(quote(user_ref_participant.normalized_destination), '|')");
            engrVar.h("group_concat(quote(user_ref_participant.color_palette_index), '|')");
            if (c.intValue() >= 1000) {
                engrVar.h("group_concat(quote(user_ref_participant.color_type), '|')");
            }
            if (c.intValue() >= 10027) {
                engrVar.h("group_concat(quote(user_ref_participant.extended_color), '|')");
            }
            if (c.intValue() >= 12001) {
                engrVar.h("group_concat(quote(user_ref_participant.participant_type), '|')");
            }
            engrVar.h("link_preview.message_id");
            engrVar.h("link_preview.trigger_url");
            engrVar.h("link_preview.expiration_time_millis");
            engrVar.h("link_preview.link_title");
            engrVar.h("link_preview.link_description");
            engrVar.h("link_preview.link_image_url");
            engrVar.h("link_preview.link_domain");
            engrVar.h("link_preview.link_canonical_url");
            if (c.intValue() >= 21010) {
                engrVar.h("link_preview.link_preview_prevented");
            }
            if (c.intValue() >= 22020) {
                engrVar.h("link_preview.link_preview_failed");
            }
            engrVar.h("verified_sms_brands.name");
            engrVar.h("verified_sms_brands.description");
            engrVar.h("verified_sms_brands.logo_uri");
            engrVar.h("conversations.participant_normalized_destination");
            if (c.intValue() >= 10007) {
                engrVar.h("conversations.conv_type");
            }
            if (c.intValue() >= 12001) {
                engrVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (c.intValue() >= 40050) {
                engrVar.h("conversations.rcs_group_id");
            }
            if (c.intValue() >= 40050) {
                engrVar.h("conversations.rcs_conference_uri");
            }
            if (c.intValue() >= 48040) {
                engrVar.h("conversations.rcs_session_allows_revocation");
            }
            if (c.intValue() >= 58750) {
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
            engrVar.h("replied_to_message._id");
            engrVar.h("replied_to_message.received_timestamp");
            engrVar.h("replied_to_participant._id");
            engrVar.h("replied_to_participant.sub_id");
            engrVar.h("replied_to_participant.normalized_destination");
            engrVar.h("replied_to_participant.display_destination");
            engrVar.h("replied_to_participant.full_name");
            engrVar.h("replied_to_participant.first_name");
            engrVar.h("replied_to_message_part.text");
            engrVar.h("replied_to_message_part.uri");
            engrVar.h("replied_to_message_part.content_type");
            if (c.intValue() >= 26000) {
                engrVar.h("replied_to_message_part.file_name");
            }
            if (c.intValue() >= 26040) {
                engrVar.h("replied_to_message_part.duration");
            }
            engrVar.h("replied_to_message_link_preview.trigger_url");
            engrVar.h("replied_to_message_link_preview.expiration_time_millis");
            engrVar.h("replied_to_message_link_preview.link_title");
            engrVar.h("replied_to_message_link_preview.link_image_url");
            if (c.intValue() >= 22020) {
                engrVar.h("replied_to_message_link_preview.link_preview_failed");
            }
            engrVar.h("profiles_table.display_name");
            engrVar.h("message_captions.caption");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bifz(strArr);
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

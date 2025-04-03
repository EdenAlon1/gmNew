package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cogq {
    public static final String[] a = {"scheduled_send._id", "scheduled_send.message_id", "scheduled_send.conversation_id", "scheduled_send.scheduled_time", "scheduled_send.status", "scheduled_send.creation_time", "messages._id", "messages.conversation_id", "messages.sender_id", "messages.sender_send_destination", "messages.msisdn_receiving_rcs_message", "messages.receiving_network_country", "messages.sent_timestamp", "messages.queue_insert_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_transaction_id", "messages.mms_content_location", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.my_identity_foreign_key", "messages.retry_start_timestamp", "messages.cloud_sync_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.rcs_ui_status", "messages.is_hidden", "messages.rcs_remote_instance", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.correlation_id", "messages.cms_id", "messages.cms_last_mod_seq", "messages.web_id", "messages.usage_stats_logging_id", "messages.send_counter", "messages.original_rcs_message_id", "messages.custom_delivery_receipt_mime_type", "messages.custom_delivery_receipt_content", "messages.report_attempt_acounter", "messages.custom_headers", "messages.cms_correlation_id", "messages.group_private_participant", "messages.original_message_id", "messages.awaiting_reverse_sync", "messages.old_sms_message_uri", "messages.draft_id", "messages.result_code", "messages.cms_life_cycle", "messages.mute_priority", "messages.fallback_reason", "messages.auto_retry_counter", "messages.can_revoke_before_delivered_with_rcs", "messages.trace_id", "messages.outgoing_delivery_report_status", "messages.outgoing_read_report_status", "messages.xms_transport", "messages.message_original_protocol", "messages.satellite_datagram_id", "messages.encryption_protocol", "messages.message_persistence_id", "group_concat(quote(parts._id), '|')", "parts.message_id", "group_concat(quote(parts.text), '|')", "group_concat(quote(parts.uri), '|')", "group_concat(quote(parts.content_type), '|')", "group_concat(quote(parts.original_uri), '|')", "group_concat(quote(parts.storage_uri), '|')", "group_concat(quote(parts.width), '|')", "group_concat(quote(parts.height), '|')", "parts.timestamp", "parts.output_uri", "group_concat(quote(parts.target_size), '|')", "parts.processing_status", "group_concat(quote(parts.cms_attachment_processing_status), '|')", "parts.conversation_id", "parts.sticker_set_id", "parts.sticker_id", "parts.media_modified_timestamp", "parts.longitude", "parts.latitude", "group_concat(quote(parts.preview_content_uri), '|')", "parts.preview_content_type", "group_concat(quote(parts.fallback_uri), '|')", "group_concat(quote(parts.source), '|')", "group_concat(quote(parts.bundle_index), '|')", "group_concat(quote(parts.blob_id), '|')", "parts.blob_gaia_email", "parts.cms_full_size_blob_id", "parts.cms_media_encryption_key", "parts.cms_compressed_media_encryption_key", "group_concat(quote(parts.blob_upload_permanent_failure), '|')", "group_concat(quote(parts.blob_upload_timestamp), '|')", "group_concat(quote(parts.expressive_sticker_name), '|')", "group_concat(quote(parts.file_name), '|')", "group_concat(quote(parts.duration), '|')", "group_concat(quote(parts.compressed_blob_id), '|')", "parts.cms_compressed_blob_id", "group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')", "group_concat(quote(parts.compressed_blob_upload_timestamp), '|')", "group_concat(quote(parts.media_encryption_key), '|')", "group_concat(quote(parts.compressed_media_encryption_key), '|')", "group_concat(quote(parts.missing_entry_in_telephony), '|')", "parts.awaiting_reverse_sync", "parts.file_size_bytes", "parts.local_cache_path", "parts.media_send_type", "parts.voice_metadata", "parts.validation_status", "parts.processing_id", "parts.rich_card_media_download_failure_reason", "parts.image_display_state", "parts.preserve_size", "group_concat(quote(parts.rowid), '|') AS parts__ROWID", "message_captions.caption"};
    public static final cogg b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("scheduled_send.creation_time", 58020);
        enhdVar.k("messages.sender_send_destination", 54040);
        enhdVar.k("messages.msisdn_receiving_rcs_message", 59340);
        enhdVar.k("messages.receiving_network_country", 54040);
        enhdVar.k("messages.queue_insert_timestamp", 17030);
        enhdVar.k("messages.message_report_status", 13020);
        enhdVar.k("messages.rcs_expiry", 59890);
        enhdVar.k("messages.mms_retrieve_text", 9030);
        enhdVar.k("messages.my_identity_foreign_key", 60160);
        enhdVar.k("messages.cloud_sync_id", 8500);
        enhdVar.k("messages.rcs_message_id_with_text_type", 41040);
        enhdVar.k("messages.etouffee_status", 29060);
        enhdVar.k("messages.verification_status", 29090);
        enhdVar.k("messages.rcs_ui_status", 39000);
        enhdVar.k("messages.is_hidden", 30010);
        enhdVar.k("messages.rcs_remote_instance", 10002);
        enhdVar.k("messages.rcs_file_transfer_session_id", 10004);
        enhdVar.k("messages.sms_error_code", 9000);
        enhdVar.k("messages.sms_error_desc_map_name", 9000);
        enhdVar.k("messages.correlation_id", 9010);
        enhdVar.k("messages.cms_id", 31010);
        enhdVar.k("messages.cms_last_mod_seq", 37040);
        enhdVar.k("messages.web_id", 19020);
        enhdVar.k("messages.usage_stats_logging_id", 29100);
        enhdVar.k("messages.send_counter", 35030);
        enhdVar.k("messages.original_rcs_message_id", 35030);
        enhdVar.k("messages.custom_delivery_receipt_mime_type", 37020);
        enhdVar.k("messages.custom_delivery_receipt_content", 37020);
        enhdVar.k("messages.report_attempt_acounter", 37030);
        enhdVar.k("messages.custom_headers", 45020);
        enhdVar.k("messages.cms_correlation_id", 46010);
        enhdVar.k("messages.group_private_participant", 48030);
        enhdVar.k("messages.original_message_id", 48030);
        enhdVar.k("messages.awaiting_reverse_sync", 49060);
        enhdVar.k("messages.old_sms_message_uri", 49060);
        enhdVar.k("messages.draft_id", 56000);
        enhdVar.k("messages.result_code", 58040);
        enhdVar.k("messages.cms_life_cycle", 58210);
        enhdVar.k("messages.mute_priority", 60750);
        enhdVar.k("messages.fallback_reason", 58710);
        enhdVar.k("messages.auto_retry_counter", 58230);
        enhdVar.k("messages.can_revoke_before_delivered_with_rcs", 58280);
        enhdVar.k("messages.trace_id", 58680);
        enhdVar.k("messages.outgoing_delivery_report_status", 58720);
        enhdVar.k("messages.outgoing_read_report_status", 58720);
        enhdVar.k("messages.xms_transport", 59310);
        enhdVar.k("messages.message_original_protocol", 59430);
        enhdVar.k("messages.satellite_datagram_id", 59490);
        enhdVar.k("messages.encryption_protocol", 60190);
        enhdVar.k("messages.message_persistence_id", 60370);
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
        enhdVar.k("parts.blob_gaia_email", 59570);
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
        enhdVar.k("parts.media_send_type", 58150);
        enhdVar.k("parts.voice_metadata", 59470);
        enhdVar.k("parts.validation_status", 58770);
        enhdVar.k("parts.processing_id", 60080);
        enhdVar.k("parts.rich_card_media_download_failure_reason", 60230);
        enhdVar.k("parts.image_display_state", 60240);
        enhdVar.k("parts.preserve_size", 60680);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("conversation_id", "index_null_conversation_id");
        enhdVar2.c();
        b = new cogg();
    }

    public static final cogn a() {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("scheduled_send._id");
            engrVar.h("scheduled_send.message_id");
            engrVar.h("scheduled_send.conversation_id");
            engrVar.h("scheduled_send.scheduled_time");
            engrVar.h("scheduled_send.status");
            if (c.intValue() >= 58020) {
                engrVar.h("scheduled_send.creation_time");
            }
            engrVar.h("messages._id");
            engrVar.h("messages.conversation_id");
            engrVar.h("messages.sender_id");
            if (c.intValue() >= 54040) {
                engrVar.h("messages.sender_send_destination");
            }
            if (c.intValue() >= 59340) {
                engrVar.h("messages.msisdn_receiving_rcs_message");
            }
            if (c.intValue() >= 54040) {
                engrVar.h("messages.receiving_network_country");
            }
            engrVar.h("messages.sent_timestamp");
            if (c.intValue() >= 17030) {
                engrVar.h("messages.queue_insert_timestamp");
            }
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
            engrVar.h("messages.mms_transaction_id");
            engrVar.h("messages.mms_content_location");
            engrVar.h("messages.mms_expiry");
            if (c.intValue() >= 59890) {
                engrVar.h("messages.rcs_expiry");
            }
            if (c.intValue() >= 9030) {
                engrVar.h("messages.mms_retrieve_text");
            }
            engrVar.h("messages.raw_status");
            engrVar.h("messages.self_id");
            if (c.intValue() >= 60160) {
                engrVar.h("messages.my_identity_foreign_key");
            }
            engrVar.h("messages.retry_start_timestamp");
            if (c.intValue() >= 8500) {
                engrVar.h("messages.cloud_sync_id");
            }
            if (c.intValue() >= 41040) {
                engrVar.h("messages.rcs_message_id_with_text_type");
            }
            if (c.intValue() >= 29060) {
                engrVar.h("messages.etouffee_status");
            }
            if (c.intValue() >= 29090) {
                engrVar.h("messages.verification_status");
            }
            if (c.intValue() >= 39000) {
                engrVar.h("messages.rcs_ui_status");
            }
            if (c.intValue() >= 30010) {
                engrVar.h("messages.is_hidden");
            }
            if (c.intValue() >= 10002) {
                engrVar.h("messages.rcs_remote_instance");
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
            if (c.intValue() >= 9010) {
                engrVar.h("messages.correlation_id");
            }
            if (c.intValue() >= 31010) {
                engrVar.h("messages.cms_id");
            }
            if (c.intValue() >= 37040) {
                engrVar.h("messages.cms_last_mod_seq");
            }
            if (c.intValue() >= 19020) {
                engrVar.h("messages.web_id");
            }
            if (c.intValue() >= 29100) {
                engrVar.h("messages.usage_stats_logging_id");
            }
            if (c.intValue() >= 35030) {
                engrVar.h("messages.send_counter");
            }
            if (c.intValue() >= 35030) {
                engrVar.h("messages.original_rcs_message_id");
            }
            if (c.intValue() >= 37020) {
                engrVar.h("messages.custom_delivery_receipt_mime_type");
            }
            if (c.intValue() >= 37020) {
                engrVar.h("messages.custom_delivery_receipt_content");
            }
            if (c.intValue() >= 37030) {
                engrVar.h("messages.report_attempt_acounter");
            }
            if (c.intValue() >= 45020) {
                engrVar.h("messages.custom_headers");
            }
            if (c.intValue() >= 46010) {
                engrVar.h("messages.cms_correlation_id");
            }
            if (c.intValue() >= 48030) {
                engrVar.h("messages.group_private_participant");
            }
            if (c.intValue() >= 48030) {
                engrVar.h("messages.original_message_id");
            }
            if (c.intValue() >= 49060) {
                engrVar.h("messages.awaiting_reverse_sync");
            }
            if (c.intValue() >= 49060) {
                engrVar.h("messages.old_sms_message_uri");
            }
            if (c.intValue() >= 56000) {
                engrVar.h("messages.draft_id");
            }
            if (c.intValue() >= 58040) {
                engrVar.h("messages.result_code");
            }
            if (c.intValue() >= 58210) {
                engrVar.h("messages.cms_life_cycle");
            }
            if (c.intValue() >= 60750) {
                engrVar.h("messages.mute_priority");
            }
            if (c.intValue() >= 58710) {
                engrVar.h("messages.fallback_reason");
            }
            if (c.intValue() >= 58230) {
                engrVar.h("messages.auto_retry_counter");
            }
            if (c.intValue() >= 58280) {
                engrVar.h("messages.can_revoke_before_delivered_with_rcs");
            }
            if (c.intValue() >= 58680) {
                engrVar.h("messages.trace_id");
            }
            if (c.intValue() >= 58720) {
                engrVar.h("messages.outgoing_delivery_report_status");
            }
            if (c.intValue() >= 58720) {
                engrVar.h("messages.outgoing_read_report_status");
            }
            if (c.intValue() >= 59310) {
                engrVar.h("messages.xms_transport");
            }
            if (c.intValue() >= 59430) {
                engrVar.h("messages.message_original_protocol");
            }
            if (c.intValue() >= 59490) {
                engrVar.h("messages.satellite_datagram_id");
            }
            if (c.intValue() >= 60190) {
                engrVar.h("messages.encryption_protocol");
            }
            if (c.intValue() >= 60370) {
                engrVar.h("messages.message_persistence_id");
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
                engrVar.h("parts.blob_gaia_email");
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
                engrVar.h("parts.media_send_type");
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
            engrVar.h("message_captions.caption");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new cogn(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}

package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agze {
    public static final String[] a = {"messages._id", "messages.conversation_id", "messages.sender_id", "messages.sender_send_destination", "messages.msisdn_receiving_rcs_message", "messages.receiving_network_country", "messages.sent_timestamp", "messages.queue_insert_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_transaction_id", "messages.mms_content_location", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.my_identity_foreign_key", "messages.retry_start_timestamp", "messages.cloud_sync_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.rcs_ui_status", "messages.is_hidden", "messages.rcs_remote_instance", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.correlation_id", "messages.cms_id", "messages.cms_last_mod_seq", "messages.web_id", "messages.usage_stats_logging_id", "messages.send_counter", "messages.original_rcs_message_id", "messages.custom_delivery_receipt_mime_type", "messages.custom_delivery_receipt_content", "messages.report_attempt_acounter", "messages.custom_headers", "messages.cms_correlation_id", "messages.group_private_participant", "messages.original_message_id", "messages.awaiting_reverse_sync", "messages.old_sms_message_uri", "messages.draft_id", "messages.result_code", "messages.cms_life_cycle", "messages.mute_priority", "messages.fallback_reason", "messages.auto_retry_counter", "messages.can_revoke_before_delivered_with_rcs", "messages.trace_id", "messages.outgoing_delivery_report_status", "messages.outgoing_read_report_status", "messages.xms_transport", "messages.message_original_protocol", "messages.satellite_datagram_id", "messages.encryption_protocol", "messages.message_persistence_id", "message_labels._id", "message_labels.label"};
    public static final enhk b;
    public static final agyx c;

    static {
        enhd enhdVar = new enhd();
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
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("_id", "index_unsent_rcs_report");
        enhdVar2.k("sender_id", "index_null_sender_id");
        enhdVar2.k("sent_timestamp", "index_null_sent_timestamp");
        enhdVar2.k("read", "index_messages_read_0");
        enhdVar2.k("sms_message_uri", "index_null_sms_message_uri");
        enhdVar2.k("rcs_expiry", "index_null_rcs_expiry");
        enhdVar2.k("self_id", "index_null_self_id");
        enhdVar2.k("my_identity", "index_null_my_identity");
        enhdVar2.k("my_identity_foreign_key", "index_null_my_identity_foreign_key");
        enhdVar2.k("cloud_sync_id", "index_null_cloud_sync_id");
        enhdVar2.k(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "index_null_verification_status");
        enhdVar2.k("cms_id", "index_null_cms_id");
        enhdVar2.k("web_id", "index_null_web_id");
        enhdVar2.k("original_rcs_message_id", "index_null_original_rcs_message_id");
        enhdVar2.k("cms_correlation_id", "index_null_cms_correlation_id");
        enhdVar2.k("group_private_participant", "index_null_group_private_participant");
        enhdVar2.k("original_message_id", "index_null_original_message_id");
        enhdVar2.k("awaiting_reverse_sync", "index_null_awaiting_reverse_sync");
        enhdVar2.k("draft_id", "index_null_draft_id");
        enhdVar2.k("satellite_datagram_id", "index_null_satellite_datagram_id");
        enhdVar2.k("message_persistence_id", "index_null_message_persistence_id");
        enhdVar2.c();
        c = new agyx();
    }

    public static final agzb a() {
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
            if (c2.intValue() >= 54040) {
                engrVar.h("messages.sender_send_destination");
            }
            if (c2.intValue() >= 59340) {
                engrVar.h("messages.msisdn_receiving_rcs_message");
            }
            if (c2.intValue() >= 54040) {
                engrVar.h("messages.receiving_network_country");
            }
            engrVar.h("messages.sent_timestamp");
            if (c2.intValue() >= 17030) {
                engrVar.h("messages.queue_insert_timestamp");
            }
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
            engrVar.h("messages.mms_transaction_id");
            engrVar.h("messages.mms_content_location");
            engrVar.h("messages.mms_expiry");
            if (c2.intValue() >= 59890) {
                engrVar.h("messages.rcs_expiry");
            }
            if (c2.intValue() >= 9030) {
                engrVar.h("messages.mms_retrieve_text");
            }
            engrVar.h("messages.raw_status");
            engrVar.h("messages.self_id");
            if (c2.intValue() >= 60160) {
                engrVar.h("messages.my_identity_foreign_key");
            }
            engrVar.h("messages.retry_start_timestamp");
            if (c2.intValue() >= 8500) {
                engrVar.h("messages.cloud_sync_id");
            }
            if (c2.intValue() >= 41040) {
                engrVar.h("messages.rcs_message_id_with_text_type");
            }
            if (c2.intValue() >= 29060) {
                engrVar.h("messages.etouffee_status");
            }
            if (c2.intValue() >= 29090) {
                engrVar.h("messages.verification_status");
            }
            if (c2.intValue() >= 39000) {
                engrVar.h("messages.rcs_ui_status");
            }
            if (c2.intValue() >= 30010) {
                engrVar.h("messages.is_hidden");
            }
            if (c2.intValue() >= 10002) {
                engrVar.h("messages.rcs_remote_instance");
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
            if (c2.intValue() >= 9010) {
                engrVar.h("messages.correlation_id");
            }
            if (c2.intValue() >= 31010) {
                engrVar.h("messages.cms_id");
            }
            if (c2.intValue() >= 37040) {
                engrVar.h("messages.cms_last_mod_seq");
            }
            if (c2.intValue() >= 19020) {
                engrVar.h("messages.web_id");
            }
            if (c2.intValue() >= 29100) {
                engrVar.h("messages.usage_stats_logging_id");
            }
            if (c2.intValue() >= 35030) {
                engrVar.h("messages.send_counter");
            }
            if (c2.intValue() >= 35030) {
                engrVar.h("messages.original_rcs_message_id");
            }
            if (c2.intValue() >= 37020) {
                engrVar.h("messages.custom_delivery_receipt_mime_type");
            }
            if (c2.intValue() >= 37020) {
                engrVar.h("messages.custom_delivery_receipt_content");
            }
            if (c2.intValue() >= 37030) {
                engrVar.h("messages.report_attempt_acounter");
            }
            if (c2.intValue() >= 45020) {
                engrVar.h("messages.custom_headers");
            }
            if (c2.intValue() >= 46010) {
                engrVar.h("messages.cms_correlation_id");
            }
            if (c2.intValue() >= 48030) {
                engrVar.h("messages.group_private_participant");
            }
            if (c2.intValue() >= 48030) {
                engrVar.h("messages.original_message_id");
            }
            if (c2.intValue() >= 49060) {
                engrVar.h("messages.awaiting_reverse_sync");
            }
            if (c2.intValue() >= 49060) {
                engrVar.h("messages.old_sms_message_uri");
            }
            if (c2.intValue() >= 56000) {
                engrVar.h("messages.draft_id");
            }
            if (c2.intValue() >= 58040) {
                engrVar.h("messages.result_code");
            }
            if (c2.intValue() >= 58210) {
                engrVar.h("messages.cms_life_cycle");
            }
            if (c2.intValue() >= 60750) {
                engrVar.h("messages.mute_priority");
            }
            if (c2.intValue() >= 58710) {
                engrVar.h("messages.fallback_reason");
            }
            if (c2.intValue() >= 58230) {
                engrVar.h("messages.auto_retry_counter");
            }
            if (c2.intValue() >= 58280) {
                engrVar.h("messages.can_revoke_before_delivered_with_rcs");
            }
            if (c2.intValue() >= 58680) {
                engrVar.h("messages.trace_id");
            }
            if (c2.intValue() >= 58720) {
                engrVar.h("messages.outgoing_delivery_report_status");
            }
            if (c2.intValue() >= 58720) {
                engrVar.h("messages.outgoing_read_report_status");
            }
            if (c2.intValue() >= 59310) {
                engrVar.h("messages.xms_transport");
            }
            if (c2.intValue() >= 59430) {
                engrVar.h("messages.message_original_protocol");
            }
            if (c2.intValue() >= 59490) {
                engrVar.h("messages.satellite_datagram_id");
            }
            if (c2.intValue() >= 60190) {
                engrVar.h("messages.encryption_protocol");
            }
            if (c2.intValue() >= 60370) {
                engrVar.h("messages.message_persistence_id");
            }
            engrVar.h("message_labels._id");
            engrVar.h("message_labels.label");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new agzb(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}

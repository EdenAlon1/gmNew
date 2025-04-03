package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkfh {
    public static final String[] a = {"draft_parts_view._id_messages", "draft_parts_view.conversation_id_messages", "draft_parts_view.sender_participant_id_messages", "draft_parts_view.sender_send_destination_messages", "draft_parts_view.msisdn_receiving_rcs_message_messages", "draft_parts_view.receiving_network_country_messages", "draft_parts_view.sent_timestamp_messages", "draft_parts_view.queue_insert_timestamp_messages", "draft_parts_view.received_timestamp_messages", "draft_parts_view.protocol_messages", "draft_parts_view.status_messages", "draft_parts_view.message_report_status_messages", "draft_parts_view.notified_messages", "draft_parts_view.read_messages", "draft_parts_view.sms_message_uri_messages", "draft_parts_view.sms_priority_messages", "draft_parts_view.sms_message_size_messages", "draft_parts_view.mms_subject_messages", "draft_parts_view.mms_transaction_id_messages", "draft_parts_view.mms_content_location_messages", "draft_parts_view.mms_expiry_messages", "draft_parts_view.rcs_expiry_messages", "draft_parts_view.mms_retrieve_text_messages", "draft_parts_view.raw_telephony_status_messages", "draft_parts_view.self_id_messages", "draft_parts_view.my_identity_messages", "draft_parts_view.retry_start_timestamp_messages", "draft_parts_view.cloud_sync_id_messages", "draft_parts_view.rcs_message_id_messages", "draft_parts_view.rcs_encryption_status_messages", "draft_parts_view.verification_status_messages", "draft_parts_view.rcs_ui_status_messages", "draft_parts_view.is_hidden_messages", "draft_parts_view.rcs_remote_instance_messages", "draft_parts_view.rcs_file_transfer_session_id_messages", "draft_parts_view.sms_error_code_messages", "draft_parts_view.sms_error_desc_map_name_messages", "draft_parts_view.correlation_id_messages", "draft_parts_view.cms_id_messages", "draft_parts_view.cms_last_mod_seq_messages", "draft_parts_view.web_id_messages", "draft_parts_view.usage_stats_logging_id_messages", "draft_parts_view.send_counter_messages", "draft_parts_view.original_rcs_message_id_messages", "draft_parts_view.custom_delivery_receipt_mime_type_messages", "draft_parts_view.custom_delivery_receipt_content_messages", "draft_parts_view.report_attempt_counter_messages", "draft_parts_view.custom_headers_messages", "draft_parts_view.cms_correlation_id_messages", "draft_parts_view.group_private_participant_messages", "draft_parts_view.original_message_id_messages", "draft_parts_view.awaiting_reverse_sync_messages", "draft_parts_view.old_sms_message_uri_messages", "draft_parts_view.draft_id_messages", "draft_parts_view.result_code_messages", "draft_parts_view.cms_life_cycle_messages", "draft_parts_view.mute_priority_messages", "draft_parts_view.fallback_reason_messages", "draft_parts_view.auto_retry_counter_messages", "draft_parts_view.can_revoke_before_delivered_with_rcs_messages", "draft_parts_view.trace_id_messages", "draft_parts_view.outgoing_delivery_report_status_messages", "draft_parts_view.outgoing_read_report_status_messages", "draft_parts_view.xms_transport_messages", "draft_parts_view.original_protocol_messages", "draft_parts_view.satellite_datagram_id_messages", "draft_parts_view.encryption_protocol_messages", "draft_parts_view.message_persistence_id_messages", "draft_parts_view._id_parts", "draft_parts_view.message_id_parts", "draft_parts_view.text_parts", "draft_parts_view.uri_parts", "draft_parts_view.content_type_parts", "draft_parts_view.original_uri_parts", "draft_parts_view.storage_uri_parts", "draft_parts_view.width_parts", "draft_parts_view.height_parts", "draft_parts_view.timestamp_parts", "draft_parts_view.processing_output_uri_parts", "draft_parts_view.target_size_parts", "draft_parts_view.processing_status_parts", "draft_parts_view.cms_attachment_processing_status_parts", "draft_parts_view.conversation_id_parts", "draft_parts_view.sticker_set_id_parts", "draft_parts_view.sticker_id_parts", "draft_parts_view.media_modified_timestamp_parts", "draft_parts_view.longitude_parts", "draft_parts_view.latitude_parts", "draft_parts_view.preview_content_uri_parts", "draft_parts_view.preview_content_type_parts", "draft_parts_view.fallback_uri_parts", "draft_parts_view.source_parts", "draft_parts_view.bundle_index_parts", "draft_parts_view.blob_id_parts", "draft_parts_view.blob_gaia_email_parts", "draft_parts_view.cms_full_size_blob_id_parts", "draft_parts_view.cms_media_encryption_key_parts", "draft_parts_view.cms_compressed_media_encryption_key_parts", "draft_parts_view.blob_upload_permanent_failure_parts", "draft_parts_view.blob_upload_timestamp_parts", "draft_parts_view.expressive_sticker_name_parts", "draft_parts_view.file_name_parts", "draft_parts_view.duration_parts", "draft_parts_view.compressed_blob_id_parts", "draft_parts_view.cms_compressed_blob_id_parts", "draft_parts_view.compressed_blob_upload_permanent_failure_parts", "draft_parts_view.compressed_blob_upload_timestamp_parts", "draft_parts_view.media_encryption_key_parts", "draft_parts_view.compressed_media_encryption_key_parts", "draft_parts_view.missing_entry_in_telephony_parts", "draft_parts_view.awaiting_reverse_sync_parts", "draft_parts_view.file_size_bytes_parts", "draft_parts_view.local_cache_path_parts", "draft_parts_view.media_send_type_parts", "draft_parts_view.voice_metadata_parts", "draft_parts_view.validation_status_parts", "draft_parts_view.processing_id_parts", "draft_parts_view.rich_card_media_download_failure_reason_parts", "draft_parts_view.image_display_state_parts", "draft_parts_view.preserve_size_parts"};

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("draft_parts_view.sender_send_destination_messages", 54040);
        enhdVar.k("draft_parts_view.msisdn_receiving_rcs_message_messages", 59340);
        enhdVar.k("draft_parts_view.receiving_network_country_messages", 54040);
        enhdVar.k("draft_parts_view.queue_insert_timestamp_messages", 17030);
        enhdVar.k("draft_parts_view.message_report_status_messages", 13020);
        enhdVar.k("draft_parts_view.rcs_expiry_messages", 59890);
        enhdVar.k("draft_parts_view.mms_retrieve_text_messages", 9030);
        enhdVar.k("draft_parts_view.my_identity_messages", 60160);
        enhdVar.k("draft_parts_view.cloud_sync_id_messages", 8500);
        enhdVar.k("draft_parts_view.rcs_message_id_messages", 41040);
        enhdVar.k("draft_parts_view.rcs_encryption_status_messages", 29060);
        enhdVar.k("draft_parts_view.verification_status_messages", 29090);
        enhdVar.k("draft_parts_view.rcs_ui_status_messages", 39000);
        enhdVar.k("draft_parts_view.is_hidden_messages", 30010);
        enhdVar.k("draft_parts_view.rcs_remote_instance_messages", 10002);
        enhdVar.k("draft_parts_view.rcs_file_transfer_session_id_messages", 10004);
        enhdVar.k("draft_parts_view.sms_error_code_messages", 9000);
        enhdVar.k("draft_parts_view.sms_error_desc_map_name_messages", 9000);
        enhdVar.k("draft_parts_view.correlation_id_messages", 9010);
        enhdVar.k("draft_parts_view.cms_id_messages", 31010);
        enhdVar.k("draft_parts_view.cms_last_mod_seq_messages", 37040);
        enhdVar.k("draft_parts_view.web_id_messages", 19020);
        enhdVar.k("draft_parts_view.usage_stats_logging_id_messages", 29100);
        enhdVar.k("draft_parts_view.send_counter_messages", 35030);
        enhdVar.k("draft_parts_view.original_rcs_message_id_messages", 35030);
        enhdVar.k("draft_parts_view.custom_delivery_receipt_mime_type_messages", 37020);
        enhdVar.k("draft_parts_view.custom_delivery_receipt_content_messages", 37020);
        enhdVar.k("draft_parts_view.report_attempt_counter_messages", 37030);
        enhdVar.k("draft_parts_view.custom_headers_messages", 45020);
        enhdVar.k("draft_parts_view.cms_correlation_id_messages", 46010);
        enhdVar.k("draft_parts_view.group_private_participant_messages", 48030);
        enhdVar.k("draft_parts_view.original_message_id_messages", 48030);
        enhdVar.k("draft_parts_view.awaiting_reverse_sync_messages", 49060);
        enhdVar.k("draft_parts_view.old_sms_message_uri_messages", 49060);
        enhdVar.k("draft_parts_view.draft_id_messages", 56000);
        enhdVar.k("draft_parts_view.result_code_messages", 58040);
        enhdVar.k("draft_parts_view.cms_life_cycle_messages", 58210);
        enhdVar.k("draft_parts_view.mute_priority_messages", 60750);
        enhdVar.k("draft_parts_view.fallback_reason_messages", 58710);
        enhdVar.k("draft_parts_view.auto_retry_counter_messages", 58230);
        enhdVar.k("draft_parts_view.can_revoke_before_delivered_with_rcs_messages", 58280);
        enhdVar.k("draft_parts_view.trace_id_messages", 58680);
        enhdVar.k("draft_parts_view.outgoing_delivery_report_status_messages", 58720);
        enhdVar.k("draft_parts_view.outgoing_read_report_status_messages", 58720);
        enhdVar.k("draft_parts_view.xms_transport_messages", 59310);
        enhdVar.k("draft_parts_view.original_protocol_messages", 59430);
        enhdVar.k("draft_parts_view.satellite_datagram_id_messages", 59490);
        enhdVar.k("draft_parts_view.encryption_protocol_messages", 60190);
        enhdVar.k("draft_parts_view.message_persistence_id_messages", 60370);
        enhdVar.k("draft_parts_view.original_uri_parts", 10021);
        enhdVar.k("draft_parts_view.storage_uri_parts", 29060);
        enhdVar.k("draft_parts_view.timestamp_parts", 3010);
        enhdVar.k("draft_parts_view.processing_output_uri_parts", 4020);
        enhdVar.k("draft_parts_view.target_size_parts", 4020);
        enhdVar.k("draft_parts_view.processing_status_parts", 4020);
        enhdVar.k("draft_parts_view.cms_attachment_processing_status_parts", 44010);
        enhdVar.k("draft_parts_view.sticker_set_id_parts", 5020);
        enhdVar.k("draft_parts_view.sticker_id_parts", 5020);
        enhdVar.k("draft_parts_view.media_modified_timestamp_parts", 7000);
        enhdVar.k("draft_parts_view.longitude_parts", 10005);
        enhdVar.k("draft_parts_view.latitude_parts", 10005);
        enhdVar.k("draft_parts_view.preview_content_uri_parts", 10017);
        enhdVar.k("draft_parts_view.preview_content_type_parts", 10017);
        enhdVar.k("draft_parts_view.fallback_uri_parts", 13000);
        enhdVar.k("draft_parts_view.source_parts", 14010);
        enhdVar.k("draft_parts_view.bundle_index_parts", 17010);
        enhdVar.k("draft_parts_view.blob_id_parts", 17020);
        enhdVar.k("draft_parts_view.blob_gaia_email_parts", 59570);
        enhdVar.k("draft_parts_view.cms_full_size_blob_id_parts", 40040);
        enhdVar.k("draft_parts_view.cms_media_encryption_key_parts", 42010);
        enhdVar.k("draft_parts_view.cms_compressed_media_encryption_key_parts", 42070);
        enhdVar.k("draft_parts_view.blob_upload_permanent_failure_parts", 18000);
        enhdVar.k("draft_parts_view.blob_upload_timestamp_parts", 19030);
        enhdVar.k("draft_parts_view.expressive_sticker_name_parts", 22060);
        enhdVar.k("draft_parts_view.file_name_parts", 26000);
        enhdVar.k("draft_parts_view.duration_parts", 26040);
        enhdVar.k("draft_parts_view.compressed_blob_id_parts", 27000);
        enhdVar.k("draft_parts_view.cms_compressed_blob_id_parts", 40040);
        enhdVar.k("draft_parts_view.compressed_blob_upload_permanent_failure_parts", 27000);
        enhdVar.k("draft_parts_view.compressed_blob_upload_timestamp_parts", 27000);
        enhdVar.k("draft_parts_view.media_encryption_key_parts", 30040);
        enhdVar.k("draft_parts_view.compressed_media_encryption_key_parts", 30040);
        enhdVar.k("draft_parts_view.missing_entry_in_telephony_parts", 52030);
        enhdVar.k("draft_parts_view.awaiting_reverse_sync_parts", 53040);
        enhdVar.k("draft_parts_view.file_size_bytes_parts", 52050);
        enhdVar.k("draft_parts_view.local_cache_path_parts", 52050);
        enhdVar.k("draft_parts_view.media_send_type_parts", 58150);
        enhdVar.k("draft_parts_view.voice_metadata_parts", 59470);
        enhdVar.k("draft_parts_view.validation_status_parts", 58770);
        enhdVar.k("draft_parts_view.processing_id_parts", 60080);
        enhdVar.k("draft_parts_view.rich_card_media_download_failure_reason_parts", 60230);
        enhdVar.k("draft_parts_view.image_display_state_parts", 60240);
        enhdVar.k("draft_parts_view.preserve_size_parts", 60680);
        enhdVar.c();
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
        dtsb m = dtsd.m();
        m.m(2);
        m.l(true);
        m.g(true);
        m.d(true);
        m.b("draft_parts_view._id_messages");
        m.i(-1);
        m.c(new Supplier() { // from class: bjvo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m.j(new dtsc() { // from class: bjwb
        });
        m.a();
        dtsb m2 = dtsd.m();
        m2.m(1);
        m2.d(true);
        m2.e(true);
        m2.h(new Supplier() { // from class: bjyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m2.b("draft_parts_view.conversation_id_messages");
        m2.i(-1);
        m2.c(new Supplier() { // from class: bjza
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m2.j(new dtsc() { // from class: bjzm
        });
        m2.a();
        dtsb m3 = dtsd.m();
        m3.m(1);
        m3.d(true);
        m3.e(true);
        m3.h(new Supplier() { // from class: bjzz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m3.b("draft_parts_view.sender_participant_id_messages");
        m3.i(-1);
        m3.c(new Supplier() { // from class: bkal
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m3.j(new dtsc() { // from class: bkax
        });
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(4);
        m4.b("draft_parts_view.sender_send_destination_messages");
        m4.i(54040);
        m4.c(new Supplier() { // from class: bkbj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m4.j(new dtsc() { // from class: bkbv
        });
        m4.a();
        dtsb m5 = dtsd.m();
        m5.m(4);
        m5.b("draft_parts_view.msisdn_receiving_rcs_message_messages");
        m5.i(59340);
        m5.c(new Supplier() { // from class: bjwk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m5.j(new dtsc() { // from class: bkbc
        });
        m5.a();
        dtsb m6 = dtsd.m();
        m6.m(4);
        m6.b("draft_parts_view.receiving_network_country_messages");
        m6.i(54040);
        m6.c(new Supplier() { // from class: bkcg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m6.j(new dtsc() { // from class: bkcs
        });
        m6.a();
        dtsb m7 = dtsd.m();
        m7.m(1);
        m7.d(true);
        m7.b("draft_parts_view.sent_timestamp_messages");
        m7.i(-1);
        m7.c(new Supplier() { // from class: bkde
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m7.j(new dtsc() { // from class: bkdq
        });
        m7.a();
        dtsb m8 = dtsd.m();
        m8.m(1);
        m8.b("draft_parts_view.queue_insert_timestamp_messages");
        m8.i(17030);
        m8.c(new Supplier() { // from class: bkec
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m8.j(new dtsc() { // from class: bkeo
        });
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(1);
        m9.d(true);
        m9.b("draft_parts_view.received_timestamp_messages");
        m9.i(-1);
        m9.c(new Supplier() { // from class: bkfa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m9.j(new dtsc() { // from class: bjwa
        });
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(1);
        m10.b("draft_parts_view.protocol_messages");
        m10.i(-1);
        m10.c(new Supplier() { // from class: bjwn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m10.j(new dtsc() { // from class: bjwz
        });
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(1);
        m11.d(true);
        m11.b("draft_parts_view.status_messages");
        m11.i(-1);
        m11.c(new Supplier() { // from class: bjxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m11.j(new dtsc() { // from class: bjxx
        });
        m11.a();
        dtsb m12 = dtsd.m();
        m12.m(1);
        m12.b("draft_parts_view.message_report_status_messages");
        m12.i(13020);
        m12.c(new Supplier() { // from class: bjyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m12.j(new dtsc() { // from class: bjyi
        });
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(1);
        m13.d(true);
        m13.b("draft_parts_view.notified_messages");
        m13.f(true);
        m13.i(-1);
        m13.c(new Supplier() { // from class: bjyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m13.j(new dtsc() { // from class: bjyk
        });
        m13.a();
        dtsb m14 = dtsd.m();
        m14.m(1);
        m14.d(true);
        m14.b("draft_parts_view.read_messages");
        m14.i(-1);
        m14.c(new Supplier() { // from class: bjyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m14.j(new dtsc() { // from class: bjym
        });
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(4);
        m15.d(true);
        m15.b("draft_parts_view.sms_message_uri_messages");
        m15.i(-1);
        m15.c(new Supplier() { // from class: bjyp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m15.j(new dtsc() { // from class: bjyq
        });
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(1);
        m16.b("draft_parts_view.sms_priority_messages");
        m16.i(-1);
        m16.c(new Supplier() { // from class: bjyr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m16.j(new dtsc() { // from class: bjys
        });
        m16.a();
        dtsb m17 = dtsd.m();
        m17.m(1);
        m17.b("draft_parts_view.sms_message_size_messages");
        m17.i(-1);
        m17.c(new Supplier() { // from class: bjyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m17.j(new dtsc() { // from class: bjyu
        });
        m17.a();
        dtsb m18 = dtsd.m();
        m18.m(4);
        m18.b("draft_parts_view.mms_subject_messages");
        m18.i(-1);
        m18.c(new Supplier() { // from class: bjyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m18.j(new dtsc() { // from class: bjyw
        });
        m18.a();
        dtsb m19 = dtsd.m();
        m19.m(4);
        m19.b("draft_parts_view.mms_transaction_id_messages");
        m19.i(-1);
        m19.c(new Supplier() { // from class: bjyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m19.j(new dtsc() { // from class: bjyz
        });
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(4);
        m20.b("draft_parts_view.mms_content_location_messages");
        m20.i(-1);
        m20.c(new Supplier() { // from class: bjzb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m20.j(new dtsc() { // from class: bjzc
        });
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(1);
        m21.b("draft_parts_view.mms_expiry_messages");
        m21.i(-1);
        m21.c(new Supplier() { // from class: bjzd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m21.j(new dtsc() { // from class: bjze
        });
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(1);
        m22.d(true);
        m22.b("draft_parts_view.rcs_expiry_messages");
        m22.i(59890);
        m22.c(new Supplier() { // from class: bjzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m22.j(new dtsc() { // from class: bjzg
        });
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(4);
        m23.b("draft_parts_view.mms_retrieve_text_messages");
        m23.i(9030);
        m23.c(new Supplier() { // from class: bjzh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m23.j(new dtsc() { // from class: bjzi
        });
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(1);
        m24.b("draft_parts_view.raw_telephony_status_messages");
        m24.i(-1);
        m24.c(new Supplier() { // from class: bjzk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m24.j(new dtsc() { // from class: bjzl
        });
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(1);
        m25.d(true);
        m25.e(true);
        m25.h(new Supplier() { // from class: bjzn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m25.b("draft_parts_view.self_id_messages");
        m25.i(-1);
        m25.c(new Supplier() { // from class: bjzo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m25.j(new dtsc() { // from class: bjzp
        });
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(4);
        m26.d(true);
        m26.e(true);
        m26.h(new Supplier() { // from class: bjzq
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m26.b("draft_parts_view.my_identity_messages");
        m26.i(60160);
        m26.c(new Supplier() { // from class: bjzr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m26.j(new dtsc() { // from class: bjzs
        });
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(1);
        m27.b("draft_parts_view.retry_start_timestamp_messages");
        m27.i(-1);
        m27.c(new Supplier() { // from class: bjzt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m27.j(new dtsc() { // from class: bjzw
        });
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(4);
        m28.d(true);
        m28.b("draft_parts_view.cloud_sync_id_messages");
        m28.i(8500);
        m28.c(new Supplier() { // from class: bjzx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m28.j(new dtsc() { // from class: bjzy
        });
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(4);
        m29.d(true);
        m29.b("draft_parts_view.rcs_message_id_messages");
        m29.f(true);
        m29.i(41040);
        m29.c(new Supplier() { // from class: bkaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m29.j(new dtsc() { // from class: bkab
        });
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(1);
        m30.b("draft_parts_view.rcs_encryption_status_messages");
        m30.i(29060);
        m30.c(new Supplier() { // from class: bkac
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m30.j(new dtsc() { // from class: bkad
        });
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(1);
        m31.b("draft_parts_view.verification_status_messages");
        m31.i(29090);
        m31.c(new Supplier() { // from class: bkae
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m31.j(new dtsc() { // from class: bkaf
        });
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(1);
        m32.b("draft_parts_view.rcs_ui_status_messages");
        m32.i(39000);
        m32.c(new Supplier() { // from class: bkah
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m32.j(new dtsc() { // from class: bkai
        });
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(1);
        m33.d(true);
        m33.b("draft_parts_view.is_hidden_messages");
        m33.i(30010);
        m33.c(new Supplier() { // from class: bkaj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m33.j(new dtsc() { // from class: bkak
        });
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(7);
        m34.b("draft_parts_view.rcs_remote_instance_messages");
        m34.i(10002);
        m34.c(new Supplier() { // from class: bkam
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m34.j(new dtsc() { // from class: bkan
        });
        m34.a();
        dtsb m35 = dtsd.m();
        m35.m(1);
        m35.b("draft_parts_view.rcs_file_transfer_session_id_messages");
        m35.i(10004);
        m35.c(new Supplier() { // from class: bkao
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m35.j(new dtsc() { // from class: bkap
        });
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(1);
        m36.b("draft_parts_view.sms_error_code_messages");
        m36.i(9000);
        m36.c(new Supplier() { // from class: bkaq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m36.j(new dtsc() { // from class: bkas
        });
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(4);
        m37.b("draft_parts_view.sms_error_desc_map_name_messages");
        m37.i(9000);
        m37.c(new Supplier() { // from class: bkat
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m37.j(new dtsc() { // from class: bkau
        });
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(4);
        m38.b("draft_parts_view.correlation_id_messages");
        m38.i(9010);
        m38.c(new Supplier() { // from class: bkav
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m38.j(new dtsc() { // from class: bkaw
        });
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(4);
        m39.l(true);
        m39.d(true);
        m39.b("draft_parts_view.cms_id_messages");
        m39.f(true);
        m39.i(31010);
        m39.c(new Supplier() { // from class: bkay
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m39.j(new dtsc() { // from class: bkaz
        });
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(2);
        m40.b("draft_parts_view.cms_last_mod_seq_messages");
        m40.i(37040);
        m40.c(new Supplier() { // from class: bkba
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m40.j(new dtsc() { // from class: bkbb
        });
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(4);
        m41.d(true);
        m41.b("draft_parts_view.web_id_messages");
        m41.i(19020);
        m41.c(new Supplier() { // from class: bkbd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m41.j(new dtsc() { // from class: bkbe
        });
        m41.a();
        dtsb m42 = dtsd.m();
        m42.m(1);
        m42.b("draft_parts_view.usage_stats_logging_id_messages");
        m42.i(29100);
        m42.c(new Supplier() { // from class: bkbf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m42.j(new dtsc() { // from class: bkbg
        });
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(1);
        m43.b("draft_parts_view.send_counter_messages");
        m43.i(35030);
        m43.c(new Supplier() { // from class: bkbh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m43.j(new dtsc() { // from class: bkbi
        });
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(4);
        m44.d(true);
        m44.b("draft_parts_view.original_rcs_message_id_messages");
        m44.i(35030);
        m44.c(new Supplier() { // from class: bkbk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m44.j(new dtsc() { // from class: bkbl
        });
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(4);
        m45.b("draft_parts_view.custom_delivery_receipt_mime_type_messages");
        m45.i(37020);
        m45.c(new Supplier() { // from class: bkbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m45.j(new dtsc() { // from class: bkbo
        });
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(5);
        m46.b("draft_parts_view.custom_delivery_receipt_content_messages");
        m46.i(37020);
        m46.c(new Supplier() { // from class: bkbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m46.j(new dtsc() { // from class: bkbq
        });
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(1);
        m47.b("draft_parts_view.report_attempt_counter_messages");
        m47.i(37030);
        m47.c(new Supplier() { // from class: bkbr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m47.j(new dtsc() { // from class: bkbs
        });
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(5);
        m48.b("draft_parts_view.custom_headers_messages");
        m48.i(45020);
        m48.c(new Supplier() { // from class: bkbt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m48.j(new dtsc() { // from class: bkbu
        });
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(4);
        m49.l(true);
        m49.d(true);
        m49.b("draft_parts_view.cms_correlation_id_messages");
        m49.f(true);
        m49.i(46010);
        m49.c(new Supplier() { // from class: bjzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m49.j(new dtsc() { // from class: bkcc
        });
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(1);
        m50.d(true);
        m50.e(true);
        m50.h(new Supplier() { // from class: bkcn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m50.b("draft_parts_view.group_private_participant_messages");
        m50.i(48030);
        m50.c(new Supplier() { // from class: bkcy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m50.j(new dtsc() { // from class: bkdj
        });
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(1);
        m51.d(true);
        m51.e(true);
        m51.h(new Supplier() { // from class: bkdu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m51.b("draft_parts_view.original_message_id_messages");
        m51.i(48030);
        m51.c(new Supplier() { // from class: bkef
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m51.j(new dtsc() { // from class: bkeq
        });
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(1);
        m52.b("draft_parts_view.awaiting_reverse_sync_messages");
        m52.i(49060);
        m52.c(new Supplier() { // from class: bkfb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m52.j(new dtsc() { // from class: bjvz
        });
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(4);
        m53.b("draft_parts_view.old_sms_message_uri_messages");
        m53.i(49060);
        m53.c(new Supplier() { // from class: bjwv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m53.j(new dtsc() { // from class: bjxg
        });
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(4);
        m54.l(true);
        m54.d(true);
        m54.b("draft_parts_view.draft_id_messages");
        m54.f(true);
        m54.i(56000);
        m54.c(new Supplier() { // from class: bjxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m54.j(new dtsc() { // from class: bjyc
        });
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(1);
        m55.b("draft_parts_view.result_code_messages");
        m55.i(58040);
        m55.c(new Supplier() { // from class: bjyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m55.j(new dtsc() { // from class: bjyy
        });
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(1);
        m56.b("draft_parts_view.cms_life_cycle_messages");
        m56.i(58210);
        m56.c(new Supplier() { // from class: bjzj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m56.j(new dtsc() { // from class: bjzu
        });
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(1);
        m57.b("draft_parts_view.mute_priority_messages");
        m57.i(60750);
        m57.c(new Supplier() { // from class: bkag
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m57.j(new dtsc() { // from class: bkar
        });
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(1);
        m58.b("draft_parts_view.fallback_reason_messages");
        m58.i(58710);
        m58.c(new Supplier() { // from class: bkbn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m58.j(new dtsc() { // from class: bkbw
        });
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(1);
        m59.b("draft_parts_view.auto_retry_counter_messages");
        m59.i(58230);
        m59.c(new Supplier() { // from class: bkbx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m59.j(new dtsc() { // from class: bkby
        });
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(2);
        m60.b("draft_parts_view.can_revoke_before_delivered_with_rcs_messages");
        m60.i(58280);
        m60.c(new Supplier() { // from class: bkbz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m60.j(new dtsc() { // from class: bkca
        });
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(5);
        m61.b("draft_parts_view.trace_id_messages");
        m61.i(58680);
        m61.c(new Supplier() { // from class: bkcb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m61.j(new dtsc() { // from class: bkcd
        });
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(1);
        m62.b("draft_parts_view.outgoing_delivery_report_status_messages");
        m62.i(58720);
        m62.c(new Supplier() { // from class: bkce
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m62.j(new dtsc() { // from class: bkcf
        });
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(1);
        m63.b("draft_parts_view.outgoing_read_report_status_messages");
        m63.i(58720);
        m63.c(new Supplier() { // from class: bkch
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m63.j(new dtsc() { // from class: bkci
        });
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(1);
        m64.b("draft_parts_view.xms_transport_messages");
        m64.i(59310);
        m64.c(new Supplier() { // from class: bkcj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m64.j(new dtsc() { // from class: bkck
        });
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(1);
        m65.b("draft_parts_view.original_protocol_messages");
        m65.i(59430);
        m65.c(new Supplier() { // from class: bkcl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m65.j(new dtsc() { // from class: bkcm
        });
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(4);
        m66.l(true);
        m66.d(true);
        m66.b("draft_parts_view.satellite_datagram_id_messages");
        m66.f(true);
        m66.i(59490);
        m66.c(new Supplier() { // from class: bkco
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m66.j(new dtsc() { // from class: bkcp
        });
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(1);
        m67.b("draft_parts_view.encryption_protocol_messages");
        m67.i(60190);
        m67.c(new Supplier() { // from class: bkcq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m67.j(new dtsc() { // from class: bkcr
        });
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(4);
        m68.l(true);
        m68.d(true);
        m68.b("draft_parts_view.message_persistence_id_messages");
        m68.f(true);
        m68.i(60370);
        m68.c(new Supplier() { // from class: bkct
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m68.j(new dtsc() { // from class: bkcu
        });
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(2);
        m69.l(true);
        m69.g(true);
        m69.d(true);
        m69.b("draft_parts_view._id_parts");
        m69.i(-1);
        m69.c(new Supplier() { // from class: bkcv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m69.j(new dtsc() { // from class: bkcw
        });
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(1);
        m70.d(true);
        m70.e(true);
        m70.h(new Supplier() { // from class: bkcx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m70.b("draft_parts_view.message_id_parts");
        m70.i(-1);
        m70.c(new Supplier() { // from class: bkcz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m70.j(new dtsc() { // from class: bkda
        });
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(4);
        m71.b("draft_parts_view.text_parts");
        m71.i(-1);
        m71.c(new Supplier() { // from class: bkdb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m71.j(new dtsc() { // from class: bkdc
        });
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(4);
        m72.b("draft_parts_view.uri_parts");
        m72.i(-1);
        m72.c(new Supplier() { // from class: bkdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m72.j(new dtsc() { // from class: bkdf
        });
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(4);
        m73.d(true);
        m73.b("draft_parts_view.content_type_parts");
        m73.i(-1);
        m73.c(new Supplier() { // from class: bkdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m73.j(new dtsc() { // from class: bkdh
        });
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(4);
        m74.b("draft_parts_view.original_uri_parts");
        m74.i(10021);
        m74.c(new Supplier() { // from class: bkdi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m74.j(new dtsc() { // from class: bkdk
        });
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(4);
        m75.b("draft_parts_view.storage_uri_parts");
        m75.i(29060);
        m75.c(new Supplier() { // from class: bkdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m75.j(new dtsc() { // from class: bkdm
        });
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(1);
        m76.b("draft_parts_view.width_parts");
        m76.i(-1);
        m76.c(new Supplier() { // from class: bkdn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m76.j(new dtsc() { // from class: bkdo
        });
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(1);
        m77.b("draft_parts_view.height_parts");
        m77.i(-1);
        m77.c(new Supplier() { // from class: bkdp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m77.j(new dtsc() { // from class: bkdr
        });
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(1);
        m78.b("draft_parts_view.timestamp_parts");
        m78.i(3010);
        m78.c(new Supplier() { // from class: bkds
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m78.j(new dtsc() { // from class: bkdt
        });
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(4);
        m79.d(true);
        m79.b("draft_parts_view.processing_output_uri_parts");
        m79.i(4020);
        m79.c(new Supplier() { // from class: bkdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m79.j(new dtsc() { // from class: bkdw
        });
        m79.a();
        dtsb m80 = dtsd.m();
        m80.m(1);
        m80.b("draft_parts_view.target_size_parts");
        m80.i(4020);
        m80.c(new Supplier() { // from class: bkdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m80.j(new dtsc() { // from class: bkdy
        });
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(1);
        m81.b("draft_parts_view.processing_status_parts");
        m81.i(4020);
        m81.c(new Supplier() { // from class: bkdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m81.j(new dtsc() { // from class: bkea
        });
        m81.a();
        dtsb m82 = dtsd.m();
        m82.m(1);
        m82.b("draft_parts_view.cms_attachment_processing_status_parts");
        m82.i(44010);
        m82.c(new Supplier() { // from class: bkeb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m82.j(new dtsc() { // from class: bked
        });
        m82.a();
        dtsb m83 = dtsd.m();
        m83.m(1);
        m83.k(true);
        m83.d(true);
        m83.e(true);
        m83.h(new Supplier() { // from class: bkee
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m83.b("draft_parts_view.conversation_id_parts");
        m83.i(-1);
        m83.c(new Supplier() { // from class: bkeg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m83.j(new dtsc() { // from class: bkeh
        });
        m83.a();
        dtsb m84 = dtsd.m();
        m84.m(1);
        m84.b("draft_parts_view.sticker_set_id_parts");
        m84.i(5020);
        m84.c(new Supplier() { // from class: bkei
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m84.j(new dtsc() { // from class: bkej
        });
        m84.a();
        dtsb m85 = dtsd.m();
        m85.m(1);
        m85.b("draft_parts_view.sticker_id_parts");
        m85.i(5020);
        m85.c(new Supplier() { // from class: bkek
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m85.j(new dtsc() { // from class: bkel
        });
        m85.a();
        dtsb m86 = dtsd.m();
        m86.m(1);
        m86.b("draft_parts_view.media_modified_timestamp_parts");
        m86.i(7000);
        m86.c(new Supplier() { // from class: bkem
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m86.j(new dtsc() { // from class: bken
        });
        m86.a();
        dtsb m87 = dtsd.m();
        m87.m(3);
        m87.b("draft_parts_view.longitude_parts");
        m87.i(10005);
        m87.c(new Supplier() { // from class: bkep
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m87.j(new dtsc() { // from class: bker
        });
        m87.a();
        dtsb m88 = dtsd.m();
        m88.m(3);
        m88.b("draft_parts_view.latitude_parts");
        m88.i(10005);
        m88.c(new Supplier() { // from class: bkes
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m88.j(new dtsc() { // from class: bket
        });
        m88.a();
        dtsb m89 = dtsd.m();
        m89.m(4);
        m89.b("draft_parts_view.preview_content_uri_parts");
        m89.i(10017);
        m89.c(new Supplier() { // from class: bkeu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m89.j(new dtsc() { // from class: bkev
        });
        m89.a();
        dtsb m90 = dtsd.m();
        m90.m(4);
        m90.d(true);
        m90.b("draft_parts_view.preview_content_type_parts");
        m90.i(10017);
        m90.c(new Supplier() { // from class: bkew
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m90.j(new dtsc() { // from class: bkex
        });
        m90.a();
        dtsb m91 = dtsd.m();
        m91.m(4);
        m91.b("draft_parts_view.fallback_uri_parts");
        m91.i(13000);
        m91.c(new Supplier() { // from class: bkey
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m91.j(new dtsc() { // from class: bkez
        });
        m91.a();
        dtsb m92 = dtsd.m();
        m92.m(1);
        m92.b("draft_parts_view.source_parts");
        m92.i(14010);
        m92.c(new Supplier() { // from class: bjvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m92.j(new dtsc() { // from class: bjvq
        });
        m92.a();
        dtsb m93 = dtsd.m();
        m93.m(1);
        m93.b("draft_parts_view.bundle_index_parts");
        m93.i(17010);
        m93.c(new Supplier() { // from class: bjvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m93.j(new dtsc() { // from class: bjvs
        });
        m93.a();
        dtsb m94 = dtsd.m();
        m94.m(4);
        m94.b("draft_parts_view.blob_id_parts");
        m94.i(17020);
        m94.c(new Supplier() { // from class: bjvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m94.j(new dtsc() { // from class: bjvu
        });
        m94.a();
        dtsb m95 = dtsd.m();
        m95.m(4);
        m95.b("draft_parts_view.blob_gaia_email_parts");
        m95.i(59570);
        m95.c(new Supplier() { // from class: bjvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m95.j(new dtsc() { // from class: bjvw
        });
        m95.a();
        dtsb m96 = dtsd.m();
        m96.m(4);
        m96.b("draft_parts_view.cms_full_size_blob_id_parts");
        m96.i(40040);
        m96.c(new Supplier() { // from class: bjvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m96.j(new dtsc() { // from class: bjvy
        });
        m96.a();
        dtsb m97 = dtsd.m();
        m97.m(5);
        m97.b("draft_parts_view.cms_media_encryption_key_parts");
        m97.i(42010);
        m97.c(new Supplier() { // from class: bjwc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m97.j(new dtsc() { // from class: bjwd
        });
        m97.a();
        dtsb m98 = dtsd.m();
        m98.m(5);
        m98.b("draft_parts_view.cms_compressed_media_encryption_key_parts");
        m98.i(42070);
        m98.c(new Supplier() { // from class: bjwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m98.j(new dtsc() { // from class: bjwf
        });
        m98.a();
        dtsb m99 = dtsd.m();
        m99.m(1);
        m99.b("draft_parts_view.blob_upload_permanent_failure_parts");
        m99.i(18000);
        m99.c(new Supplier() { // from class: bjwg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m99.j(new dtsc() { // from class: bjwh
        });
        m99.a();
        dtsb m100 = dtsd.m();
        m100.m(1);
        m100.b("draft_parts_view.blob_upload_timestamp_parts");
        m100.i(19030);
        m100.c(new Supplier() { // from class: bjwi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m100.j(new dtsc() { // from class: bjwj
        });
        m100.a();
        dtsb m101 = dtsd.m();
        m101.m(4);
        m101.b("draft_parts_view.expressive_sticker_name_parts");
        m101.i(22060);
        m101.c(new Supplier() { // from class: bjwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m101.j(new dtsc() { // from class: bjwm
        });
        m101.a();
        dtsb m102 = dtsd.m();
        m102.m(4);
        m102.b("draft_parts_view.file_name_parts");
        m102.i(26000);
        m102.c(new Supplier() { // from class: bjwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m102.j(new dtsc() { // from class: bjwp
        });
        m102.a();
        dtsb m103 = dtsd.m();
        m103.m(1);
        m103.b("draft_parts_view.duration_parts");
        m103.i(26040);
        m103.c(new Supplier() { // from class: bjwq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m103.j(new dtsc() { // from class: bjwr
        });
        m103.a();
        dtsb m104 = dtsd.m();
        m104.m(4);
        m104.b("draft_parts_view.compressed_blob_id_parts");
        m104.i(27000);
        m104.c(new Supplier() { // from class: bjws
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m104.j(new dtsc() { // from class: bjwt
        });
        m104.a();
        dtsb m105 = dtsd.m();
        m105.m(4);
        m105.b("draft_parts_view.cms_compressed_blob_id_parts");
        m105.i(40040);
        m105.c(new Supplier() { // from class: bjwu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m105.j(new dtsc() { // from class: bjww
        });
        m105.a();
        dtsb m106 = dtsd.m();
        m106.m(1);
        m106.b("draft_parts_view.compressed_blob_upload_permanent_failure_parts");
        m106.i(27000);
        m106.c(new Supplier() { // from class: bjwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m106.j(new dtsc() { // from class: bjwy
        });
        m106.a();
        dtsb m107 = dtsd.m();
        m107.m(1);
        m107.b("draft_parts_view.compressed_blob_upload_timestamp_parts");
        m107.i(27000);
        m107.c(new Supplier() { // from class: bjxa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m107.j(new dtsc() { // from class: bjxb
        });
        m107.a();
        dtsb m108 = dtsd.m();
        m108.m(5);
        m108.b("draft_parts_view.media_encryption_key_parts");
        m108.i(30040);
        m108.c(new Supplier() { // from class: bjxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m108.j(new dtsc() { // from class: bjxd
        });
        m108.a();
        dtsb m109 = dtsd.m();
        m109.m(5);
        m109.b("draft_parts_view.compressed_media_encryption_key_parts");
        m109.i(30040);
        m109.c(new Supplier() { // from class: bjxe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m109.j(new dtsc() { // from class: bjxf
        });
        m109.a();
        dtsb m110 = dtsd.m();
        m110.m(1);
        m110.b("draft_parts_view.missing_entry_in_telephony_parts");
        m110.i(52030);
        m110.c(new Supplier() { // from class: bjxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m110.j(new dtsc() { // from class: bjxi
        });
        m110.a();
        dtsb m111 = dtsd.m();
        m111.m(1);
        m111.b("draft_parts_view.awaiting_reverse_sync_parts");
        m111.i(53040);
        m111.c(new Supplier() { // from class: bjxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m111.j(new dtsc() { // from class: bjxk
        });
        m111.a();
        dtsb m112 = dtsd.m();
        m112.m(1);
        m112.b("draft_parts_view.file_size_bytes_parts");
        m112.i(52050);
        m112.c(new Supplier() { // from class: bjxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m112.j(new dtsc() { // from class: bjxn
        });
        m112.a();
        dtsb m113 = dtsd.m();
        m113.m(4);
        m113.d(true);
        m113.b("draft_parts_view.local_cache_path_parts");
        m113.i(52050);
        m113.c(new Supplier() { // from class: bjxo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m113.j(new dtsc() { // from class: bjxp
        });
        m113.a();
        dtsb m114 = dtsd.m();
        m114.m(1);
        m114.b("draft_parts_view.media_send_type_parts");
        m114.i(58150);
        m114.c(new Supplier() { // from class: bjxq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m114.j(new dtsc() { // from class: bjxs
        });
        m114.a();
        dtsb m115 = dtsd.m();
        m115.m(5);
        m115.b("draft_parts_view.voice_metadata_parts");
        m115.i(59470);
        m115.c(new Supplier() { // from class: bjxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m115.j(new dtsc() { // from class: bjxu
        });
        m115.a();
        dtsb m116 = dtsd.m();
        m116.m(1);
        m116.b("draft_parts_view.validation_status_parts");
        m116.i(58770);
        m116.c(new Supplier() { // from class: bjxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m116.j(new dtsc() { // from class: bjxw
        });
        m116.a();
        dtsb m117 = dtsd.m();
        m117.m(4);
        m117.b("draft_parts_view.processing_id_parts");
        m117.i(60080);
        m117.c(new Supplier() { // from class: bjxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m117.j(new dtsc() { // from class: bjxz
        });
        m117.a();
        dtsb m118 = dtsd.m();
        m118.m(1);
        m118.b("draft_parts_view.rich_card_media_download_failure_reason_parts");
        m118.i(60230);
        m118.c(new Supplier() { // from class: bjya
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m118.j(new dtsc() { // from class: bjyb
        });
        m118.a();
        dtsb m119 = dtsd.m();
        m119.m(1);
        m119.b("draft_parts_view.image_display_state_parts");
        m119.i(60240);
        m119.c(new Supplier() { // from class: bjyd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m119.j(new dtsc() { // from class: bjye
        });
        m119.a();
        dtsb m120 = dtsd.m();
        m120.m(1);
        m120.b("draft_parts_view.preserve_size_parts");
        m120.i(60680);
        m120.c(new Supplier() { // from class: bjyf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkfh.b();
            }
        });
        m120.j(new dtsc() { // from class: bjyg
        });
        m120.a();
    }

    public static final bkfe a() {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("draft_parts_view._id_messages");
            engrVar.h("draft_parts_view.conversation_id_messages");
            engrVar.h("draft_parts_view.sender_participant_id_messages");
            if (c.intValue() >= 54040) {
                engrVar.h("draft_parts_view.sender_send_destination_messages");
            }
            if (c.intValue() >= 59340) {
                engrVar.h("draft_parts_view.msisdn_receiving_rcs_message_messages");
            }
            if (c.intValue() >= 54040) {
                engrVar.h("draft_parts_view.receiving_network_country_messages");
            }
            engrVar.h("draft_parts_view.sent_timestamp_messages");
            if (c.intValue() >= 17030) {
                engrVar.h("draft_parts_view.queue_insert_timestamp_messages");
            }
            engrVar.h("draft_parts_view.received_timestamp_messages");
            engrVar.h("draft_parts_view.protocol_messages");
            engrVar.h("draft_parts_view.status_messages");
            if (c.intValue() >= 13020) {
                engrVar.h("draft_parts_view.message_report_status_messages");
            }
            engrVar.h("draft_parts_view.notified_messages");
            engrVar.h("draft_parts_view.read_messages");
            engrVar.h("draft_parts_view.sms_message_uri_messages");
            engrVar.h("draft_parts_view.sms_priority_messages");
            engrVar.h("draft_parts_view.sms_message_size_messages");
            engrVar.h("draft_parts_view.mms_subject_messages");
            engrVar.h("draft_parts_view.mms_transaction_id_messages");
            engrVar.h("draft_parts_view.mms_content_location_messages");
            engrVar.h("draft_parts_view.mms_expiry_messages");
            if (c.intValue() >= 59890) {
                engrVar.h("draft_parts_view.rcs_expiry_messages");
            }
            if (c.intValue() >= 9030) {
                engrVar.h("draft_parts_view.mms_retrieve_text_messages");
            }
            engrVar.h("draft_parts_view.raw_telephony_status_messages");
            engrVar.h("draft_parts_view.self_id_messages");
            if (c.intValue() >= 60160) {
                engrVar.h("draft_parts_view.my_identity_messages");
            }
            engrVar.h("draft_parts_view.retry_start_timestamp_messages");
            if (c.intValue() >= 8500) {
                engrVar.h("draft_parts_view.cloud_sync_id_messages");
            }
            if (c.intValue() >= 41040) {
                engrVar.h("draft_parts_view.rcs_message_id_messages");
            }
            if (c.intValue() >= 29060) {
                engrVar.h("draft_parts_view.rcs_encryption_status_messages");
            }
            if (c.intValue() >= 29090) {
                engrVar.h("draft_parts_view.verification_status_messages");
            }
            if (c.intValue() >= 39000) {
                engrVar.h("draft_parts_view.rcs_ui_status_messages");
            }
            if (c.intValue() >= 30010) {
                engrVar.h("draft_parts_view.is_hidden_messages");
            }
            if (c.intValue() >= 10002) {
                engrVar.h("draft_parts_view.rcs_remote_instance_messages");
            }
            if (c.intValue() >= 10004) {
                engrVar.h("draft_parts_view.rcs_file_transfer_session_id_messages");
            }
            if (c.intValue() >= 9000) {
                engrVar.h("draft_parts_view.sms_error_code_messages");
            }
            if (c.intValue() >= 9000) {
                engrVar.h("draft_parts_view.sms_error_desc_map_name_messages");
            }
            if (c.intValue() >= 9010) {
                engrVar.h("draft_parts_view.correlation_id_messages");
            }
            if (c.intValue() >= 31010) {
                engrVar.h("draft_parts_view.cms_id_messages");
            }
            if (c.intValue() >= 37040) {
                engrVar.h("draft_parts_view.cms_last_mod_seq_messages");
            }
            if (c.intValue() >= 19020) {
                engrVar.h("draft_parts_view.web_id_messages");
            }
            if (c.intValue() >= 29100) {
                engrVar.h("draft_parts_view.usage_stats_logging_id_messages");
            }
            if (c.intValue() >= 35030) {
                engrVar.h("draft_parts_view.send_counter_messages");
            }
            if (c.intValue() >= 35030) {
                engrVar.h("draft_parts_view.original_rcs_message_id_messages");
            }
            if (c.intValue() >= 37020) {
                engrVar.h("draft_parts_view.custom_delivery_receipt_mime_type_messages");
            }
            if (c.intValue() >= 37020) {
                engrVar.h("draft_parts_view.custom_delivery_receipt_content_messages");
            }
            if (c.intValue() >= 37030) {
                engrVar.h("draft_parts_view.report_attempt_counter_messages");
            }
            if (c.intValue() >= 45020) {
                engrVar.h("draft_parts_view.custom_headers_messages");
            }
            if (c.intValue() >= 46010) {
                engrVar.h("draft_parts_view.cms_correlation_id_messages");
            }
            if (c.intValue() >= 48030) {
                engrVar.h("draft_parts_view.group_private_participant_messages");
            }
            if (c.intValue() >= 48030) {
                engrVar.h("draft_parts_view.original_message_id_messages");
            }
            if (c.intValue() >= 49060) {
                engrVar.h("draft_parts_view.awaiting_reverse_sync_messages");
            }
            if (c.intValue() >= 49060) {
                engrVar.h("draft_parts_view.old_sms_message_uri_messages");
            }
            if (c.intValue() >= 56000) {
                engrVar.h("draft_parts_view.draft_id_messages");
            }
            if (c.intValue() >= 58040) {
                engrVar.h("draft_parts_view.result_code_messages");
            }
            if (c.intValue() >= 58210) {
                engrVar.h("draft_parts_view.cms_life_cycle_messages");
            }
            if (c.intValue() >= 60750) {
                engrVar.h("draft_parts_view.mute_priority_messages");
            }
            if (c.intValue() >= 58710) {
                engrVar.h("draft_parts_view.fallback_reason_messages");
            }
            if (c.intValue() >= 58230) {
                engrVar.h("draft_parts_view.auto_retry_counter_messages");
            }
            if (c.intValue() >= 58280) {
                engrVar.h("draft_parts_view.can_revoke_before_delivered_with_rcs_messages");
            }
            if (c.intValue() >= 58680) {
                engrVar.h("draft_parts_view.trace_id_messages");
            }
            if (c.intValue() >= 58720) {
                engrVar.h("draft_parts_view.outgoing_delivery_report_status_messages");
            }
            if (c.intValue() >= 58720) {
                engrVar.h("draft_parts_view.outgoing_read_report_status_messages");
            }
            if (c.intValue() >= 59310) {
                engrVar.h("draft_parts_view.xms_transport_messages");
            }
            if (c.intValue() >= 59430) {
                engrVar.h("draft_parts_view.original_protocol_messages");
            }
            if (c.intValue() >= 59490) {
                engrVar.h("draft_parts_view.satellite_datagram_id_messages");
            }
            if (c.intValue() >= 60190) {
                engrVar.h("draft_parts_view.encryption_protocol_messages");
            }
            if (c.intValue() >= 60370) {
                engrVar.h("draft_parts_view.message_persistence_id_messages");
            }
            engrVar.h("draft_parts_view._id_parts");
            engrVar.h("draft_parts_view.message_id_parts");
            engrVar.h("draft_parts_view.text_parts");
            engrVar.h("draft_parts_view.uri_parts");
            engrVar.h("draft_parts_view.content_type_parts");
            if (c.intValue() >= 10021) {
                engrVar.h("draft_parts_view.original_uri_parts");
            }
            if (c.intValue() >= 29060) {
                engrVar.h("draft_parts_view.storage_uri_parts");
            }
            engrVar.h("draft_parts_view.width_parts");
            engrVar.h("draft_parts_view.height_parts");
            if (c.intValue() >= 3010) {
                engrVar.h("draft_parts_view.timestamp_parts");
            }
            if (c.intValue() >= 4020) {
                engrVar.h("draft_parts_view.processing_output_uri_parts");
            }
            if (c.intValue() >= 4020) {
                engrVar.h("draft_parts_view.target_size_parts");
            }
            if (c.intValue() >= 4020) {
                engrVar.h("draft_parts_view.processing_status_parts");
            }
            if (c.intValue() >= 44010) {
                engrVar.h("draft_parts_view.cms_attachment_processing_status_parts");
            }
            engrVar.h("draft_parts_view.conversation_id_parts");
            if (c.intValue() >= 5020) {
                engrVar.h("draft_parts_view.sticker_set_id_parts");
            }
            if (c.intValue() >= 5020) {
                engrVar.h("draft_parts_view.sticker_id_parts");
            }
            if (c.intValue() >= 7000) {
                engrVar.h("draft_parts_view.media_modified_timestamp_parts");
            }
            if (c.intValue() >= 10005) {
                engrVar.h("draft_parts_view.longitude_parts");
            }
            if (c.intValue() >= 10005) {
                engrVar.h("draft_parts_view.latitude_parts");
            }
            if (c.intValue() >= 10017) {
                engrVar.h("draft_parts_view.preview_content_uri_parts");
            }
            if (c.intValue() >= 10017) {
                engrVar.h("draft_parts_view.preview_content_type_parts");
            }
            if (c.intValue() >= 13000) {
                engrVar.h("draft_parts_view.fallback_uri_parts");
            }
            if (c.intValue() >= 14010) {
                engrVar.h("draft_parts_view.source_parts");
            }
            if (c.intValue() >= 17010) {
                engrVar.h("draft_parts_view.bundle_index_parts");
            }
            if (c.intValue() >= 17020) {
                engrVar.h("draft_parts_view.blob_id_parts");
            }
            if (c.intValue() >= 59570) {
                engrVar.h("draft_parts_view.blob_gaia_email_parts");
            }
            if (c.intValue() >= 40040) {
                engrVar.h("draft_parts_view.cms_full_size_blob_id_parts");
            }
            if (c.intValue() >= 42010) {
                engrVar.h("draft_parts_view.cms_media_encryption_key_parts");
            }
            if (c.intValue() >= 42070) {
                engrVar.h("draft_parts_view.cms_compressed_media_encryption_key_parts");
            }
            if (c.intValue() >= 18000) {
                engrVar.h("draft_parts_view.blob_upload_permanent_failure_parts");
            }
            if (c.intValue() >= 19030) {
                engrVar.h("draft_parts_view.blob_upload_timestamp_parts");
            }
            if (c.intValue() >= 22060) {
                engrVar.h("draft_parts_view.expressive_sticker_name_parts");
            }
            if (c.intValue() >= 26000) {
                engrVar.h("draft_parts_view.file_name_parts");
            }
            if (c.intValue() >= 26040) {
                engrVar.h("draft_parts_view.duration_parts");
            }
            if (c.intValue() >= 27000) {
                engrVar.h("draft_parts_view.compressed_blob_id_parts");
            }
            if (c.intValue() >= 40040) {
                engrVar.h("draft_parts_view.cms_compressed_blob_id_parts");
            }
            if (c.intValue() >= 27000) {
                engrVar.h("draft_parts_view.compressed_blob_upload_permanent_failure_parts");
            }
            if (c.intValue() >= 27000) {
                engrVar.h("draft_parts_view.compressed_blob_upload_timestamp_parts");
            }
            if (c.intValue() >= 30040) {
                engrVar.h("draft_parts_view.media_encryption_key_parts");
            }
            if (c.intValue() >= 30040) {
                engrVar.h("draft_parts_view.compressed_media_encryption_key_parts");
            }
            if (c.intValue() >= 52030) {
                engrVar.h("draft_parts_view.missing_entry_in_telephony_parts");
            }
            if (c.intValue() >= 53040) {
                engrVar.h("draft_parts_view.awaiting_reverse_sync_parts");
            }
            if (c.intValue() >= 52050) {
                engrVar.h("draft_parts_view.file_size_bytes_parts");
            }
            if (c.intValue() >= 52050) {
                engrVar.h("draft_parts_view.local_cache_path_parts");
            }
            if (c.intValue() >= 58150) {
                engrVar.h("draft_parts_view.media_send_type_parts");
            }
            if (c.intValue() >= 59470) {
                engrVar.h("draft_parts_view.voice_metadata_parts");
            }
            if (c.intValue() >= 58770) {
                engrVar.h("draft_parts_view.validation_status_parts");
            }
            if (c.intValue() >= 60080) {
                engrVar.h("draft_parts_view.processing_id_parts");
            }
            if (c.intValue() >= 60230) {
                engrVar.h("draft_parts_view.rich_card_media_download_failure_reason_parts");
            }
            if (c.intValue() >= 60240) {
                engrVar.h("draft_parts_view.image_display_state_parts");
            }
            if (c.intValue() >= 60680) {
                engrVar.h("draft_parts_view.preserve_size_parts");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bkfe(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}

package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjvk {
    public static final String[] a = {"messages._id", "messages.conversation_id", "messages.sender_id", "messages.sender_send_destination", "messages.msisdn_receiving_rcs_message", "messages.receiving_network_country", "messages.sent_timestamp", "messages.queue_insert_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_transaction_id", "messages.mms_content_location", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.my_identity_foreign_key", "messages.retry_start_timestamp", "messages.cloud_sync_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.rcs_ui_status", "messages.is_hidden", "messages.rcs_remote_instance", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.correlation_id", "messages.cms_id", "messages.cms_last_mod_seq", "messages.web_id", "messages.usage_stats_logging_id", "messages.send_counter", "messages.original_rcs_message_id", "messages.custom_delivery_receipt_mime_type", "messages.custom_delivery_receipt_content", "messages.report_attempt_acounter", "messages.custom_headers", "messages.cms_correlation_id", "messages.group_private_participant", "messages.original_message_id", "messages.awaiting_reverse_sync", "messages.old_sms_message_uri", "messages.draft_id", "messages.result_code", "messages.cms_life_cycle", "messages.mute_priority", "messages.fallback_reason", "messages.auto_retry_counter", "messages.can_revoke_before_delivered_with_rcs", "messages.trace_id", "messages.outgoing_delivery_report_status", "messages.outgoing_read_report_status", "messages.xms_transport", "messages.message_original_protocol", "messages.satellite_datagram_id", "messages.encryption_protocol", "messages.message_persistence_id", "message_replies_view.message_id_message_replies", "message_replies_view._id_messages", "message_replies_view.received_timestamp_messages", "message_replies_view._id_participants", "message_replies_view.sub_id_participants", "message_replies_view.normalized_destination_participants", "message_replies_view.display_destination_participants", "message_replies_view.full_name_participants", "message_replies_view.first_name_participants", "message_replies_view._id_parts", "message_replies_view.text_parts", "message_replies_view.uri_parts", "message_replies_view.content_type_parts", "message_replies_view.file_name_parts", "message_replies_view.duration_parts", "message_replies_view.parts__ROWID_parts", "message_replies_view.trigger_url_link_preview", "message_replies_view.expiration_time_millis_link_preview", "message_replies_view.link_title_link_preview", "message_replies_view.link_image_url_link_preview", "message_replies_view.link_preview_failed_link_preview"};

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
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.a = "messages._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bjoc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bjva
        };
        m.a();
        dtsb m2 = dtsd.m();
        m2.m(1);
        m2.d(true);
        m2.e(true);
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.b = new Supplier() { // from class: bjok
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar2.a = "messages.conversation_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bjow
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bjpi
        };
        m2.a();
        dtsb m3 = dtsd.m();
        m3.m(1);
        m3.d(true);
        m3.e(true);
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.b = new Supplier() { // from class: bjpv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar3.a = "messages.sender_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bjqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bjqt
        };
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(4);
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.a = "messages.sender_send_destination";
        m4.i(54040);
        dtqsVar4.d = new Supplier() { // from class: bjrf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bjrr
        };
        m4.a();
        dtsb m5 = dtsd.m();
        m5.m(4);
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.a = "messages.msisdn_receiving_rcs_message";
        m5.i(59340);
        dtqsVar5.d = new Supplier() { // from class: bjoy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bjrx
        };
        m5.a();
        dtsb m6 = dtsd.m();
        m6.m(4);
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.a = "messages.receiving_network_country";
        m6.i(54040);
        dtqsVar6.d = new Supplier() { // from class: bjsj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bjsv
        };
        m6.a();
        dtsb m7 = dtsd.m();
        m7.m(1);
        m7.d(true);
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.a = "messages.sent_timestamp";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bjth
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bjtt
        };
        m7.a();
        dtsb m8 = dtsd.m();
        m8.m(1);
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.a = "messages.queue_insert_timestamp";
        m8.i(17030);
        dtqsVar8.d = new Supplier() { // from class: bjuf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bjur
        };
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(1);
        m9.d(true);
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.a = "messages.received_timestamp";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: bjuy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bjuz
        };
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(1);
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.a = "messages.message_protocol";
        m10.i(-1);
        dtqsVar10.d = new Supplier() { // from class: bjvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bjvc
        };
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(1);
        m11.d(true);
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.a = "messages.message_status";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: bjvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bjod
        };
        m11.a();
        dtsb m12 = dtsd.m();
        m12.m(1);
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.a = "messages.message_report_status";
        m12.i(13020);
        dtqsVar12.d = new Supplier() { // from class: bjoe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bjof
        };
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(1);
        m13.d(true);
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.a = "messages.seen";
        m13.f(true);
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: bjog
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bjoh
        };
        m13.a();
        dtsb m14 = dtsd.m();
        m14.m(1);
        m14.d(true);
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.a = "messages.read";
        m14.i(-1);
        dtqsVar14.d = new Supplier() { // from class: bjoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: bjoj
        };
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(4);
        m15.d(true);
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.a = "messages.sms_message_uri";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: bjol
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: bjom
        };
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(1);
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.a = "messages.sms_priority";
        m16.i(-1);
        dtqsVar16.d = new Supplier() { // from class: bjoo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: bjop
        };
        m16.a();
        dtsb m17 = dtsd.m();
        m17.m(1);
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.a = "messages.sms_message_size";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: bjoq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: bjor
        };
        m17.a();
        dtsb m18 = dtsd.m();
        m18.m(4);
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.a = "messages.mms_subject";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: bjos
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: bjot
        };
        m18.a();
        dtsb m19 = dtsd.m();
        m19.m(4);
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.a = "messages.mms_transaction_id";
        m19.i(-1);
        dtqsVar19.d = new Supplier() { // from class: bjou
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: bjov
        };
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(4);
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.a = "messages.mms_content_location";
        m20.i(-1);
        dtqsVar20.d = new Supplier() { // from class: bjox
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: bjoz
        };
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(1);
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.a = "messages.mms_expiry";
        m21.i(-1);
        dtqsVar21.d = new Supplier() { // from class: bjpa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: bjpb
        };
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(1);
        m22.d(true);
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.a = "messages.rcs_expiry";
        m22.i(59890);
        dtqsVar22.d = new Supplier() { // from class: bjpc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: bjpd
        };
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(4);
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.a = "messages.mms_retrieve_text";
        m23.i(9030);
        dtqsVar23.d = new Supplier() { // from class: bjpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: bjpf
        };
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(1);
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.a = "messages.raw_status";
        m24.i(-1);
        dtqsVar24.d = new Supplier() { // from class: bjpg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: bjph
        };
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(1);
        m25.d(true);
        m25.e(true);
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.b = new Supplier() { // from class: bjpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar25.a = "messages.self_id";
        m25.i(-1);
        dtqsVar25.d = new Supplier() { // from class: bjpl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: bjpm
        };
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(4);
        m26.d(true);
        m26.e(true);
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.b = new Supplier() { // from class: bjpn
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar26.a = "messages.my_identity_foreign_key";
        m26.i(60160);
        dtqsVar26.d = new Supplier() { // from class: bjpo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: bjpp
        };
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(1);
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.a = "messages.retry_start_timestamp";
        m27.i(-1);
        dtqsVar27.d = new Supplier() { // from class: bjpq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: bjpr
        };
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(4);
        m28.d(true);
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.a = "messages.cloud_sync_id";
        m28.i(8500);
        dtqsVar28.d = new Supplier() { // from class: bjps
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: bjpt
        };
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(4);
        m29.d(true);
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.a = "messages.rcs_message_id_with_text_type";
        m29.f(true);
        m29.i(41040);
        dtqsVar29.d = new Supplier() { // from class: bjpw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: bjpx
        };
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(1);
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.a = "messages.etouffee_status";
        m30.i(29060);
        dtqsVar30.d = new Supplier() { // from class: bjpy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: bjpz
        };
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(1);
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.a = "messages.verification_status";
        m31.i(29090);
        dtqsVar31.d = new Supplier() { // from class: bjqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: bjqb
        };
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(1);
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.a = "messages.rcs_ui_status";
        m32.i(39000);
        dtqsVar32.d = new Supplier() { // from class: bjqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: bjqd
        };
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(1);
        m33.d(true);
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.a = "messages.is_hidden";
        m33.i(30010);
        dtqsVar33.d = new Supplier() { // from class: bjqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: bjqg
        };
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(7);
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.a = "messages.rcs_remote_instance";
        m34.i(10002);
        dtqsVar34.d = new Supplier() { // from class: bjqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: bjqj
        };
        m34.a();
        dtsb m35 = dtsd.m();
        m35.m(1);
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.a = "messages.rcs_file_transfer_session_id";
        m35.i(10004);
        dtqsVar35.d = new Supplier() { // from class: bjqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: bjql
        };
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(1);
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.a = "messages.sms_error_code";
        m36.i(9000);
        dtqsVar36.d = new Supplier() { // from class: bjqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: bjqn
        };
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(4);
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.a = "messages.sms_error_desc_map_name";
        m37.i(9000);
        dtqsVar37.d = new Supplier() { // from class: bjqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: bjqp
        };
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(4);
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.a = "messages.correlation_id";
        m38.i(9010);
        dtqsVar38.d = new Supplier() { // from class: bjqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: bjqs
        };
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(4);
        m39.l(true);
        m39.d(true);
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.a = "messages.cms_id";
        m39.f(true);
        m39.i(31010);
        dtqsVar39.d = new Supplier() { // from class: bjqu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: bjqv
        };
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(2);
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.a = "messages.cms_last_mod_seq";
        m40.i(37040);
        dtqsVar40.d = new Supplier() { // from class: bjqw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: bjqx
        };
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(4);
        m41.d(true);
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.a = "messages.web_id";
        m41.i(19020);
        dtqsVar41.d = new Supplier() { // from class: bjqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: bjqz
        };
        m41.a();
        dtsb m42 = dtsd.m();
        m42.m(1);
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.a = "messages.usage_stats_logging_id";
        m42.i(29100);
        dtqsVar42.d = new Supplier() { // from class: bjra
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: bjrc
        };
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(1);
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.a = "messages.send_counter";
        m43.i(35030);
        dtqsVar43.d = new Supplier() { // from class: bjrd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: bjre
        };
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(4);
        m44.d(true);
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.a = "messages.original_rcs_message_id";
        m44.i(35030);
        dtqsVar44.d = new Supplier() { // from class: bjrg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: bjrh
        };
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(4);
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.a = "messages.custom_delivery_receipt_mime_type";
        m45.i(37020);
        dtqsVar45.d = new Supplier() { // from class: bjri
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: bjrj
        };
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(5);
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.a = "messages.custom_delivery_receipt_content";
        m46.i(37020);
        dtqsVar46.d = new Supplier() { // from class: bjrk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: bjrl
        };
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(1);
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.a = "messages.report_attempt_acounter";
        m47.i(37030);
        dtqsVar47.d = new Supplier() { // from class: bjrn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: bjro
        };
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(5);
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.a = "messages.custom_headers";
        m48.i(45020);
        dtqsVar48.d = new Supplier() { // from class: bjrp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: bjrq
        };
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(4);
        m49.l(true);
        m49.d(true);
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.a = "messages.cms_correlation_id";
        m49.f(true);
        m49.i(46010);
        dtqsVar49.d = new Supplier() { // from class: bjru
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: bjsf
        };
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(1);
        m50.d(true);
        m50.e(true);
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.b = new Supplier() { // from class: bjsq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar50.a = "messages.group_private_participant";
        m50.i(48030);
        dtqsVar50.d = new Supplier() { // from class: bjtb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: bjtm
        };
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(1);
        m51.d(true);
        m51.e(true);
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.b = new Supplier() { // from class: bjtx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar51.a = "messages.original_message_id";
        m51.i(48030);
        dtqsVar51.d = new Supplier() { // from class: bjui
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: bjut
        };
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(1);
        dtqs dtqsVar52 = (dtqs) m52;
        dtqsVar52.a = "messages.awaiting_reverse_sync";
        m52.i(49060);
        dtqsVar52.d = new Supplier() { // from class: bjve
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar52.c = new dtsc() { // from class: bjon
        };
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(4);
        dtqs dtqsVar53 = (dtqs) m53;
        dtqsVar53.a = "messages.old_sms_message_uri";
        m53.i(49060);
        dtqsVar53.d = new Supplier() { // from class: bjpj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar53.c = new dtsc() { // from class: bjpu
        };
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(4);
        m54.l(true);
        m54.d(true);
        dtqs dtqsVar54 = (dtqs) m54;
        dtqsVar54.a = "messages.draft_id";
        m54.f(true);
        m54.i(56000);
        dtqsVar54.d = new Supplier() { // from class: bjqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar54.c = new dtsc() { // from class: bjqq
        };
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(1);
        dtqs dtqsVar55 = (dtqs) m55;
        dtqsVar55.a = "messages.result_code";
        m55.i(58040);
        dtqsVar55.d = new Supplier() { // from class: bjrb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar55.c = new dtsc() { // from class: bjrm
        };
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(1);
        dtqs dtqsVar56 = (dtqs) m56;
        dtqsVar56.a = "messages.cms_life_cycle";
        m56.i(58210);
        dtqsVar56.d = new Supplier() { // from class: bjrs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar56.c = new dtsc() { // from class: bjrt
        };
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(1);
        dtqs dtqsVar57 = (dtqs) m57;
        dtqsVar57.a = "messages.mute_priority";
        m57.i(60750);
        dtqsVar57.d = new Supplier() { // from class: bjrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar57.c = new dtsc() { // from class: bjrw
        };
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(1);
        dtqs dtqsVar58 = (dtqs) m58;
        dtqsVar58.a = "messages.fallback_reason";
        m58.i(58710);
        dtqsVar58.d = new Supplier() { // from class: bjry
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar58.c = new dtsc() { // from class: bjrz
        };
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(1);
        dtqs dtqsVar59 = (dtqs) m59;
        dtqsVar59.a = "messages.auto_retry_counter";
        m59.i(58230);
        dtqsVar59.d = new Supplier() { // from class: bjsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar59.c = new dtsc() { // from class: bjsb
        };
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(2);
        dtqs dtqsVar60 = (dtqs) m60;
        dtqsVar60.a = "messages.can_revoke_before_delivered_with_rcs";
        m60.i(58280);
        dtqsVar60.d = new Supplier() { // from class: bjsc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar60.c = new dtsc() { // from class: bjsd
        };
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(5);
        dtqs dtqsVar61 = (dtqs) m61;
        dtqsVar61.a = "messages.trace_id";
        m61.i(58680);
        dtqsVar61.d = new Supplier() { // from class: bjse
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar61.c = new dtsc() { // from class: bjsg
        };
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(1);
        dtqs dtqsVar62 = (dtqs) m62;
        dtqsVar62.a = "messages.outgoing_delivery_report_status";
        m62.i(58720);
        dtqsVar62.d = new Supplier() { // from class: bjsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar62.c = new dtsc() { // from class: bjsi
        };
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(1);
        dtqs dtqsVar63 = (dtqs) m63;
        dtqsVar63.a = "messages.outgoing_read_report_status";
        m63.i(58720);
        dtqsVar63.d = new Supplier() { // from class: bjsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar63.c = new dtsc() { // from class: bjsl
        };
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(1);
        dtqs dtqsVar64 = (dtqs) m64;
        dtqsVar64.a = "messages.xms_transport";
        m64.i(59310);
        dtqsVar64.d = new Supplier() { // from class: bjsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar64.c = new dtsc() { // from class: bjsn
        };
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(1);
        dtqs dtqsVar65 = (dtqs) m65;
        dtqsVar65.a = "messages.message_original_protocol";
        m65.i(59430);
        dtqsVar65.d = new Supplier() { // from class: bjso
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar65.c = new dtsc() { // from class: bjsp
        };
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(4);
        m66.l(true);
        m66.d(true);
        dtqs dtqsVar66 = (dtqs) m66;
        dtqsVar66.a = "messages.satellite_datagram_id";
        m66.f(true);
        m66.i(59490);
        dtqsVar66.d = new Supplier() { // from class: bjsr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar66.c = new dtsc() { // from class: bjss
        };
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(1);
        dtqs dtqsVar67 = (dtqs) m67;
        dtqsVar67.a = "messages.encryption_protocol";
        m67.i(60190);
        dtqsVar67.d = new Supplier() { // from class: bjst
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar67.c = new dtsc() { // from class: bjsu
        };
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(4);
        m68.l(true);
        m68.d(true);
        dtqs dtqsVar68 = (dtqs) m68;
        dtqsVar68.a = "messages.message_persistence_id";
        m68.f(true);
        m68.i(60370);
        dtqsVar68.d = new Supplier() { // from class: bjsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar68.c = new dtsc() { // from class: bjsx
        };
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(2);
        m69.l(true);
        m69.k(true);
        m69.d(true);
        m69.e(true);
        dtqs dtqsVar69 = (dtqs) m69;
        dtqsVar69.b = new Supplier() { // from class: bjsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar69.a = "message_replies_view.message_id_message_replies";
        m69.f(true);
        m69.i(0);
        dtqsVar69.d = new Supplier() { // from class: bjsz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar69.c = new dtsc() { // from class: bjta
        };
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(2);
        m70.d(true);
        dtqs dtqsVar70 = (dtqs) m70;
        dtqsVar70.a = "message_replies_view._id_messages";
        m70.i(0);
        dtqsVar70.d = new Supplier() { // from class: bjtc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar70.c = new dtsc() { // from class: bjtd
        };
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(1);
        m71.d(true);
        dtqs dtqsVar71 = (dtqs) m71;
        dtqsVar71.a = "message_replies_view.received_timestamp_messages";
        m71.i(0);
        dtqsVar71.d = new Supplier() { // from class: bjte
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar71.c = new dtsc() { // from class: bjtf
        };
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(2);
        m72.d(true);
        dtqs dtqsVar72 = (dtqs) m72;
        dtqsVar72.a = "message_replies_view._id_participants";
        m72.i(0);
        dtqsVar72.d = new Supplier() { // from class: bjtg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar72.c = new dtsc() { // from class: bjti
        };
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(1);
        m73.d(true);
        dtqs dtqsVar73 = (dtqs) m73;
        dtqsVar73.a = "message_replies_view.sub_id_participants";
        m73.f(true);
        m73.i(0);
        dtqsVar73.d = new Supplier() { // from class: bjtj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar73.c = new dtsc() { // from class: bjtk
        };
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(4);
        m74.d(true);
        dtqs dtqsVar74 = (dtqs) m74;
        dtqsVar74.a = "message_replies_view.normalized_destination_participants";
        m74.f(true);
        m74.i(0);
        dtqsVar74.d = new Supplier() { // from class: bjtl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar74.c = new dtsc() { // from class: bjtn
        };
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(4);
        dtqs dtqsVar75 = (dtqs) m75;
        dtqsVar75.a = "message_replies_view.display_destination_participants";
        m75.i(0);
        dtqsVar75.d = new Supplier() { // from class: bjto
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar75.c = new dtsc() { // from class: bjtp
        };
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(4);
        dtqs dtqsVar76 = (dtqs) m76;
        dtqsVar76.a = "message_replies_view.full_name_participants";
        m76.i(0);
        dtqsVar76.d = new Supplier() { // from class: bjtq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar76.c = new dtsc() { // from class: bjtr
        };
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(4);
        dtqs dtqsVar77 = (dtqs) m77;
        dtqsVar77.a = "message_replies_view.first_name_participants";
        m77.i(0);
        dtqsVar77.d = new Supplier() { // from class: bjts
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar77.c = new dtsc() { // from class: bjtu
        };
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(2);
        m78.d(true);
        dtqs dtqsVar78 = (dtqs) m78;
        dtqsVar78.a = "message_replies_view._id_parts";
        m78.i(0);
        dtqsVar78.d = new Supplier() { // from class: bjtv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar78.c = new dtsc() { // from class: bjtw
        };
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(4);
        dtqs dtqsVar79 = (dtqs) m79;
        dtqsVar79.a = "message_replies_view.text_parts";
        m79.i(0);
        dtqsVar79.d = new Supplier() { // from class: bjty
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar79.c = new dtsc() { // from class: bjtz
        };
        m79.a();
        dtsb m80 = dtsd.m();
        m80.m(4);
        dtqs dtqsVar80 = (dtqs) m80;
        dtqsVar80.a = "message_replies_view.uri_parts";
        m80.i(0);
        dtqsVar80.d = new Supplier() { // from class: bjua
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar80.c = new dtsc() { // from class: bjub
        };
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(4);
        m81.d(true);
        dtqs dtqsVar81 = (dtqs) m81;
        dtqsVar81.a = "message_replies_view.content_type_parts";
        m81.i(0);
        dtqsVar81.d = new Supplier() { // from class: bjuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar81.c = new dtsc() { // from class: bjud
        };
        m81.a();
        dtsb m82 = dtsd.m();
        m82.m(4);
        dtqs dtqsVar82 = (dtqs) m82;
        dtqsVar82.a = "message_replies_view.file_name_parts";
        m82.i(0);
        dtqsVar82.d = new Supplier() { // from class: bjue
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar82.c = new dtsc() { // from class: bjug
        };
        m82.a();
        dtsb m83 = dtsd.m();
        m83.m(1);
        dtqs dtqsVar83 = (dtqs) m83;
        dtqsVar83.a = "message_replies_view.duration_parts";
        m83.i(0);
        dtqsVar83.d = new Supplier() { // from class: bjuh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar83.c = new dtsc() { // from class: bjuj
        };
        m83.a();
        dtsb m84 = dtsd.m();
        m84.m(8);
        dtqs dtqsVar84 = (dtqs) m84;
        dtqsVar84.a = "message_replies_view.parts__ROWID_parts";
        m84.i(0);
        dtqsVar84.d = new Supplier() { // from class: bjuk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar84.c = new dtsc() { // from class: bjul
        };
        m84.a();
        dtsb m85 = dtsd.m();
        m85.m(4);
        m85.k(true);
        dtqs dtqsVar85 = (dtqs) m85;
        dtqsVar85.a = "message_replies_view.trigger_url_link_preview";
        m85.i(0);
        dtqsVar85.d = new Supplier() { // from class: bjum
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar85.c = new dtsc() { // from class: bjun
        };
        m85.a();
        dtsb m86 = dtsd.m();
        m86.m(2);
        dtqs dtqsVar86 = (dtqs) m86;
        dtqsVar86.a = "message_replies_view.expiration_time_millis_link_preview";
        m86.i(0);
        dtqsVar86.d = new Supplier() { // from class: bjuo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar86.c = new dtsc() { // from class: bjup
        };
        m86.a();
        dtsb m87 = dtsd.m();
        m87.m(4);
        dtqs dtqsVar87 = (dtqs) m87;
        dtqsVar87.a = "message_replies_view.link_title_link_preview";
        m87.i(0);
        dtqsVar87.d = new Supplier() { // from class: bjuq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar87.c = new dtsc() { // from class: bjus
        };
        m87.a();
        dtsb m88 = dtsd.m();
        m88.m(4);
        dtqs dtqsVar88 = (dtqs) m88;
        dtqsVar88.a = "message_replies_view.link_image_url_link_preview";
        m88.i(0);
        dtqsVar88.d = new Supplier() { // from class: bjuu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar88.c = new dtsc() { // from class: bjuv
        };
        m88.a();
        dtsb m89 = dtsd.m();
        m89.m(2);
        dtqs dtqsVar89 = (dtqs) m89;
        dtqsVar89.a = "message_replies_view.link_preview_failed_link_preview";
        m89.i(0);
        dtqsVar89.d = new Supplier() { // from class: bjuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjvk.a();
            }
        };
        dtqsVar89.c = new dtsc() { // from class: bjux
        };
        m89.a();
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static Integer b() {
        return Integer.valueOf(a().P().a());
    }
}

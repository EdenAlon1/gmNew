package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class blxy {
    public static final String[] a = {"messages_annotations._id", "messages_annotations.conversation_id", "messages_annotations.message_id", "messages_annotations.annotation_type", "messages_annotations.annotation_details", "conversations._id", "conversations.sms_thread_id", "conversations.name", "conversations.name_is_automatic", "conversations.subtitle", "conversations.latest_message_id", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.etouffee_default", "conversations.archive_status", "conversations.sort_timestamp", "conversations.last_read_timestamp", "conversations.icon", "conversations.participant_contact_id", "conversations.normalized_participant_contact_id", "conversations.participant_lookup_key", "conversations.normalized_participant_lookup_key", "conversations.participant_normalized_destination", "conversations.participant_comparable_destination", "conversations.current_self_id", "conversations.current_my_identity_foreign_key", "conversations.destination_token", "conversations.participant_count", "conversations.notification_enabled", "conversations.notification_sound_uri", "conversations.notification_vibration", "conversations.include_email_addr", "conversations.sms_service_center", "conversations.participant_id_list", "conversations.normalized_participant_id_list", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.send_mode", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.last_interactive_event_timestamp", "conversations.participant_display_destination", "conversations.normalized_participant_display_destination", "conversations.spam_warning_dismiss_status", "conversations.open_count", "conversations.last_logged_scooby_metadata_timestamp", "conversations.delete_timestamp", "conversations.cms_id", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.tachygram_group_routing_info_token", "conversations.cms_most_recent_read_message_timestamp_ms", "conversations.rcs_subject_change_timestamp_ms", "conversations.rcs_session_allows_revocation", "conversations.rcs_group_capabilities", "conversations.awaiting_reverse_sync", "conversations.duplicate_of", "conversations.new_duplicate_of", "conversations.error_state", "conversations.cms_life_cycle", "conversations.rcs_group_self_msisdn", "conversations.recipient_offline_timestamp_ms", "conversations.rcs_group_last_sync_timestamp", "conversations.has_been_e2ee", "conversations.marked_as_unread", "conversations.custom_theme", "conversations.mms_group_upgrade_status", "conversations.mms_group_upgrade_retries", "conversations.encryption_protocol", "conversations.encryption_id", "conversations.cms_correlation_id", "conversations.rcs_group_icon_url", "conversations.unread_count"};

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("messages_annotations.message_id", 20040);
        enhdVar.k("conversations.name_is_automatic", 10012);
        enhdVar.k("conversations.subtitle", 59760);
        enhdVar.k("conversations.etouffee_default", 29060);
        enhdVar.k("conversations.normalized_participant_contact_id", 58090);
        enhdVar.k("conversations.normalized_participant_lookup_key", 58090);
        enhdVar.k("conversations.participant_comparable_destination", 58090);
        enhdVar.k("conversations.current_my_identity_foreign_key", 60160);
        enhdVar.k("conversations.destination_token", 60360);
        enhdVar.k("conversations.participant_id_list", 8500);
        enhdVar.k("conversations.normalized_participant_id_list", 58090);
        enhdVar.k("conversations.source_type", 8500);
        enhdVar.k("conversations.rcs_session_id", 10000);
        enhdVar.k("conversations.join_state", 10006);
        enhdVar.k("conversations.conv_type", 10007);
        enhdVar.k("conversations.send_mode", 10016);
        enhdVar.k("conversations.IS_ENTERPRISE", 10018);
        enhdVar.k("conversations.has_ea2p_bot_recipient", 12001);
        enhdVar.k("conversations.last_interactive_event_timestamp", 15000);
        enhdVar.k("conversations.participant_display_destination", 15010);
        enhdVar.k("conversations.normalized_participant_display_destination", 58090);
        enhdVar.k("conversations.spam_warning_dismiss_status", 23000);
        enhdVar.k("conversations.open_count", 26020);
        enhdVar.k("conversations.last_logged_scooby_metadata_timestamp", 28010);
        enhdVar.k("conversations.delete_timestamp", 29020);
        enhdVar.k("conversations.cms_id", 32000);
        enhdVar.k("conversations.rcs_group_id", 40050);
        enhdVar.k("conversations.rcs_conference_uri", 40050);
        enhdVar.k("conversations.tachygram_group_routing_info_token", 58120);
        enhdVar.k("conversations.cms_most_recent_read_message_timestamp_ms", 53030);
        enhdVar.k("conversations.rcs_subject_change_timestamp_ms", 46050);
        enhdVar.k("conversations.rcs_session_allows_revocation", 48040);
        enhdVar.k("conversations.rcs_group_capabilities", 49020);
        enhdVar.k("conversations.awaiting_reverse_sync", 49060);
        enhdVar.k("conversations.duplicate_of", 58090);
        enhdVar.k("conversations.new_duplicate_of", 59130);
        enhdVar.k("conversations.error_state", 58140);
        enhdVar.k("conversations.cms_life_cycle", 58210);
        enhdVar.k("conversations.rcs_group_self_msisdn", 58540);
        enhdVar.k("conversations.recipient_offline_timestamp_ms", 58750);
        enhdVar.k("conversations.rcs_group_last_sync_timestamp", 58910);
        enhdVar.k("conversations.has_been_e2ee", 59210);
        enhdVar.k("conversations.marked_as_unread", 59220);
        enhdVar.k("conversations.custom_theme", 59820);
        enhdVar.k("conversations.mms_group_upgrade_status", 60050);
        enhdVar.k("conversations.mms_group_upgrade_retries", 60050);
        enhdVar.k("conversations.encryption_protocol", 60180);
        enhdVar.k("conversations.encryption_id", 60210);
        enhdVar.k("conversations.cms_correlation_id", 60250);
        enhdVar.k("conversations.rcs_group_icon_url", 60590);
        enhdVar.k("conversations.unread_count", 60740);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("conversation_id", "index_null_conversation_id");
        enhdVar2.k("message_id", "index_null_message_id");
        enhdVar2.k("annotation_type", "index_null_annotation_type");
        enhdVar2.c();
        dtsb m = dtsd.m();
        m.m(2);
        m.l(true);
        m.g(true);
        m.d(true);
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.a = "messages_annotations._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: blrg
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: blwx
        };
        m.a();
        dtsb m2 = dtsd.m();
        m2.m(4);
        m2.d(true);
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.a = "messages_annotations.conversation_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: blxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: blrj
        };
        m2.a();
        dtsb m3 = dtsd.m();
        m3.m(2);
        m3.d(true);
        m3.e(true);
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.b = new Supplier() { // from class: blrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar3.a = "messages_annotations.message_id";
        m3.i(20040);
        dtqsVar3.d = new Supplier() { // from class: blsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: blst
        };
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(1);
        m4.d(true);
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.a = "messages_annotations.annotation_type";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bltf
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bltr
        };
        m4.a();
        dtsb m5 = dtsd.m();
        m5.m(5);
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.a = "messages_annotations.annotation_details";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: blud
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: blsc
        };
        m5.a();
        dtsb m6 = dtsd.m();
        m6.m(2);
        m6.l(true);
        m6.g(true);
        m6.d(true);
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.a = "conversations._id";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: blul
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: blux
        };
        m6.a();
        dtsb m7 = dtsd.m();
        m7.m(1);
        m7.d(true);
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.a = "conversations.sms_thread_id";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: blvj
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: blvv
        };
        m7.a();
        dtsb m8 = dtsd.m();
        m8.m(4);
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.a = "conversations.name";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: blwh
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: blws
        };
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(2);
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.a = "conversations.name_is_automatic";
        m9.i(10012);
        dtqsVar9.d = new Supplier() { // from class: blwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: blwu
        };
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(4);
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.a = "conversations.subtitle";
        m10.i(59760);
        dtqsVar10.d = new Supplier() { // from class: blwv
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: blwy
        };
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(1);
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.a = "conversations.latest_message_id";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: blwz
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: blxa
        };
        m11.a();
        dtsb m12 = dtsd.m();
        m12.m(4);
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.a = "conversations.snippet_text";
        m12.i(-1);
        dtqsVar12.d = new Supplier() { // from class: blxb
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: blxc
        };
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(4);
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.a = "conversations.subject_text";
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: blxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: blxe
        };
        m13.a();
        dtsb m14 = dtsd.m();
        m14.m(4);
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.a = "conversations.preview_uri";
        m14.i(-1);
        dtqsVar14.d = new Supplier() { // from class: blxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: blxg
        };
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(4);
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.a = "conversations.preview_content_type";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: blxi
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: blxk
        };
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(1);
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.a = "conversations.show_draft";
        m16.i(-1);
        dtqsVar16.d = new Supplier() { // from class: blxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: blxm
        };
        m16.a();
        dtsb m17 = dtsd.m();
        m17.m(4);
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.a = "conversations.draft_snippet_text";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: blxn
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: blxo
        };
        m17.a();
        dtsb m18 = dtsd.m();
        m18.m(4);
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.a = "conversations.draft_subject_text";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: blxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: blxq
        };
        m18.a();
        dtsb m19 = dtsd.m();
        m19.m(4);
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.a = "conversations.draft_preview_uri";
        m19.i(-1);
        dtqsVar19.d = new Supplier() { // from class: blxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: blrh
        };
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(4);
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.a = "conversations.draft_preview_content_type";
        m20.i(-1);
        dtqsVar20.d = new Supplier() { // from class: blri
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: blrk
        };
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(1);
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.a = "conversations.etouffee_default";
        m21.i(29060);
        dtqsVar21.d = new Supplier() { // from class: blrl
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: blrm
        };
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(1);
        m22.d(true);
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.a = "conversations.archive_status";
        m22.i(-1);
        dtqsVar22.d = new Supplier() { // from class: blrn
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: blro
        };
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(1);
        m23.d(true);
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.a = "conversations.sort_timestamp";
        m23.i(-1);
        dtqsVar23.d = new Supplier() { // from class: blrp
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: blrq
        };
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(1);
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.a = "conversations.last_read_timestamp";
        m24.i(-1);
        dtqsVar24.d = new Supplier() { // from class: blrs
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: blrt
        };
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(4);
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.a = "conversations.icon";
        m25.i(-1);
        dtqsVar25.d = new Supplier() { // from class: blru
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: blrw
        };
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(1);
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.a = "conversations.participant_contact_id";
        m26.i(-1);
        dtqsVar26.d = new Supplier() { // from class: blrx
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: blry
        };
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(1);
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.a = "conversations.normalized_participant_contact_id";
        m27.i(58090);
        dtqsVar27.d = new Supplier() { // from class: blrz
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: blsa
        };
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(4);
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.a = "conversations.participant_lookup_key";
        m28.i(-1);
        dtqsVar28.d = new Supplier() { // from class: blsb
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: blsd
        };
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(4);
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.a = "conversations.normalized_participant_lookup_key";
        m29.i(58090);
        dtqsVar29.d = new Supplier() { // from class: blse
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: blsf
        };
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(4);
        m30.d(true);
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.a = "conversations.participant_normalized_destination";
        m30.i(-1);
        dtqsVar30.d = new Supplier() { // from class: blsg
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: blsi
        };
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(4);
        m31.l(true);
        m31.d(true);
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.a = "conversations.participant_comparable_destination";
        m31.f(true);
        m31.i(58090);
        dtqsVar31.d = new Supplier() { // from class: blsj
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: blsk
        };
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(4);
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.a = "conversations.current_self_id";
        m32.i(-1);
        dtqsVar32.d = new Supplier() { // from class: blsl
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: blsm
        };
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(4);
        m33.d(true);
        m33.e(true);
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.b = new Supplier() { // from class: blso
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar33.a = "conversations.current_my_identity_foreign_key";
        m33.i(60160);
        dtqsVar33.d = new Supplier() { // from class: blsp
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: blsq
        };
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(4);
        m34.d(true);
        m34.e(true);
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.b = new Supplier() { // from class: blsr
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.b.a;
            }
        };
        dtqsVar34.a = "conversations.destination_token";
        m34.i(60360);
        dtqsVar34.d = new Supplier() { // from class: blss
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: blsu
        };
        m34.a();
        dtsb m35 = dtsd.m();
        m35.m(1);
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.a = "conversations.participant_count";
        m35.i(-1);
        dtqsVar35.d = new Supplier() { // from class: blsv
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: blsw
        };
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(1);
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.a = "conversations.notification_enabled";
        m36.i(-1);
        dtqsVar36.d = new Supplier() { // from class: blsx
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: blsz
        };
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(4);
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.a = "conversations.notification_sound_uri";
        m37.i(-1);
        dtqsVar37.d = new Supplier() { // from class: blta
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: bltb
        };
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(1);
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.a = "conversations.notification_vibration";
        m38.i(-1);
        dtqsVar38.d = new Supplier() { // from class: bltc
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: bltd
        };
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(1);
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.a = "conversations.include_email_addr";
        m39.i(-1);
        dtqsVar39.d = new Supplier() { // from class: blte
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: bltg
        };
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(4);
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.a = "conversations.sms_service_center";
        m40.i(-1);
        dtqsVar40.d = new Supplier() { // from class: blth
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: blti
        };
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(4);
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.a = "conversations.participant_id_list";
        m41.i(8500);
        dtqsVar41.d = new Supplier() { // from class: bltk
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: bltl
        };
        m41.a();
        dtsb m42 = dtsd.m();
        m42.m(4);
        m42.l(true);
        m42.d(true);
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.a = "conversations.normalized_participant_id_list";
        m42.f(true);
        m42.i(58090);
        dtqsVar42.d = new Supplier() { // from class: bltm
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: bltn
        };
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(1);
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.a = "conversations.source_type";
        m43.i(8500);
        dtqsVar43.d = new Supplier() { // from class: blto
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: bltp
        };
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(1);
        m44.d(true);
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.a = "conversations.rcs_session_id";
        m44.i(10000);
        dtqsVar44.d = new Supplier() { // from class: bltq
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: blts
        };
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(1);
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.a = "conversations.join_state";
        m45.i(10006);
        dtqsVar45.d = new Supplier() { // from class: bltt
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: bltv
        };
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(1);
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.a = "conversations.conv_type";
        m46.i(10007);
        dtqsVar46.d = new Supplier() { // from class: bltw
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: bltx
        };
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(1);
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.a = "conversations.send_mode";
        m47.i(10016);
        dtqsVar47.d = new Supplier() { // from class: blty
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: bltz
        };
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(1);
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.a = "conversations.IS_ENTERPRISE";
        m48.i(10018);
        dtqsVar48.d = new Supplier() { // from class: blua
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: blub
        };
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(1);
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.a = "conversations.has_ea2p_bot_recipient";
        m49.i(12001);
        dtqsVar49.d = new Supplier() { // from class: bluc
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: blui
        };
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(1);
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.a = "conversations.last_interactive_event_timestamp";
        m50.i(15000);
        dtqsVar50.d = new Supplier() { // from class: blut
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: blve
        };
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(4);
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.a = "conversations.participant_display_destination";
        m51.i(15010);
        dtqsVar51.d = new Supplier() { // from class: blvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: blwa
        };
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(4);
        dtqs dtqsVar52 = (dtqs) m52;
        dtqsVar52.a = "conversations.normalized_participant_display_destination";
        m52.i(58090);
        dtqsVar52.d = new Supplier() { // from class: blwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar52.c = new dtsc() { // from class: blww
        };
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(1);
        dtqs dtqsVar53 = (dtqs) m53;
        dtqsVar53.a = "conversations.spam_warning_dismiss_status";
        m53.i(23000);
        dtqsVar53.d = new Supplier() { // from class: blxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar53.c = new dtsc() { // from class: blxs
        };
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(1);
        dtqs dtqsVar54 = (dtqs) m54;
        dtqsVar54.a = "conversations.open_count";
        m54.i(26020);
        dtqsVar54.d = new Supplier() { // from class: blrr
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar54.c = new dtsc() { // from class: blsn
        };
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(1);
        dtqs dtqsVar55 = (dtqs) m55;
        dtqsVar55.a = "conversations.last_logged_scooby_metadata_timestamp";
        m55.i(28010);
        dtqsVar55.d = new Supplier() { // from class: blsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar55.c = new dtsc() { // from class: bltj
        };
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(1);
        m56.d(true);
        dtqs dtqsVar56 = (dtqs) m56;
        dtqsVar56.a = "conversations.delete_timestamp";
        m56.i(29020);
        dtqsVar56.d = new Supplier() { // from class: bltu
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar56.c = new dtsc() { // from class: blue
        };
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(4);
        m57.l(true);
        m57.d(true);
        dtqs dtqsVar57 = (dtqs) m57;
        dtqsVar57.a = "conversations.cms_id";
        m57.f(true);
        m57.i(32000);
        dtqsVar57.d = new Supplier() { // from class: bluf
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar57.c = new dtsc() { // from class: blug
        };
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(4);
        m58.d(true);
        dtqs dtqsVar58 = (dtqs) m58;
        dtqsVar58.a = "conversations.rcs_group_id";
        m58.i(40050);
        dtqsVar58.d = new Supplier() { // from class: bluh
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar58.c = new dtsc() { // from class: bluj
        };
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(4);
        dtqs dtqsVar59 = (dtqs) m59;
        dtqsVar59.a = "conversations.rcs_conference_uri";
        m59.i(40050);
        dtqsVar59.d = new Supplier() { // from class: bluk
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar59.c = new dtsc() { // from class: blum
        };
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(5);
        dtqs dtqsVar60 = (dtqs) m60;
        dtqsVar60.a = "conversations.tachygram_group_routing_info_token";
        m60.i(58120);
        dtqsVar60.d = new Supplier() { // from class: blun
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar60.c = new dtsc() { // from class: bluo
        };
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(1);
        dtqs dtqsVar61 = (dtqs) m61;
        dtqsVar61.a = "conversations.cms_most_recent_read_message_timestamp_ms";
        m61.i(53030);
        dtqsVar61.d = new Supplier() { // from class: blup
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar61.c = new dtsc() { // from class: bluq
        };
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(2);
        dtqs dtqsVar62 = (dtqs) m62;
        dtqsVar62.a = "conversations.rcs_subject_change_timestamp_ms";
        m62.i(46050);
        dtqsVar62.d = new Supplier() { // from class: blur
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar62.c = new dtsc() { // from class: blus
        };
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(1);
        dtqs dtqsVar63 = (dtqs) m63;
        dtqsVar63.a = "conversations.rcs_session_allows_revocation";
        m63.i(48040);
        dtqsVar63.d = new Supplier() { // from class: bluu
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar63.c = new dtsc() { // from class: bluv
        };
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(2);
        dtqs dtqsVar64 = (dtqs) m64;
        dtqsVar64.a = "conversations.rcs_group_capabilities";
        m64.i(49020);
        dtqsVar64.d = new Supplier() { // from class: bluw
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar64.c = new dtsc() { // from class: bluy
        };
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(1);
        dtqs dtqsVar65 = (dtqs) m65;
        dtqsVar65.a = "conversations.awaiting_reverse_sync";
        m65.i(49060);
        dtqsVar65.d = new Supplier() { // from class: bluz
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar65.c = new dtsc() { // from class: blva
        };
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(2);
        m66.d(true);
        m66.e(true);
        dtqs dtqsVar66 = (dtqs) m66;
        dtqsVar66.b = new Supplier() { // from class: blvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar66.a = "conversations.duplicate_of";
        m66.i(58090);
        dtqsVar66.d = new Supplier() { // from class: blvc
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar66.c = new dtsc() { // from class: blvd
        };
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(2);
        m67.d(true);
        m67.e(true);
        dtqs dtqsVar67 = (dtqs) m67;
        dtqsVar67.b = new Supplier() { // from class: blvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar67.a = "conversations.new_duplicate_of";
        m67.i(59130);
        dtqsVar67.d = new Supplier() { // from class: blvg
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar67.c = new dtsc() { // from class: blvh
        };
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(1);
        dtqs dtqsVar68 = (dtqs) m68;
        dtqsVar68.a = "conversations.error_state";
        m68.i(58140);
        dtqsVar68.d = new Supplier() { // from class: blvi
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar68.c = new dtsc() { // from class: blvk
        };
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(1);
        dtqs dtqsVar69 = (dtqs) m69;
        dtqsVar69.a = "conversations.cms_life_cycle";
        m69.i(58210);
        dtqsVar69.d = new Supplier() { // from class: blvl
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar69.c = new dtsc() { // from class: blvm
        };
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(4);
        dtqs dtqsVar70 = (dtqs) m70;
        dtqsVar70.a = "conversations.rcs_group_self_msisdn";
        m70.i(58540);
        dtqsVar70.d = new Supplier() { // from class: blvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar70.c = new dtsc() { // from class: blvo
        };
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(2);
        dtqs dtqsVar71 = (dtqs) m71;
        dtqsVar71.a = "conversations.recipient_offline_timestamp_ms";
        m71.i(58750);
        dtqsVar71.d = new Supplier() { // from class: blvq
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar71.c = new dtsc() { // from class: blvr
        };
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(2);
        dtqs dtqsVar72 = (dtqs) m72;
        dtqsVar72.a = "conversations.rcs_group_last_sync_timestamp";
        m72.i(58910);
        dtqsVar72.d = new Supplier() { // from class: blvs
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar72.c = new dtsc() { // from class: blvt
        };
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(1);
        dtqs dtqsVar73 = (dtqs) m73;
        dtqsVar73.a = "conversations.has_been_e2ee";
        m73.i(59210);
        dtqsVar73.d = new Supplier() { // from class: blvu
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar73.c = new dtsc() { // from class: blvw
        };
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(1);
        dtqs dtqsVar74 = (dtqs) m74;
        dtqsVar74.a = "conversations.marked_as_unread";
        m74.i(59220);
        dtqsVar74.d = new Supplier() { // from class: blvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar74.c = new dtsc() { // from class: blvy
        };
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(5);
        dtqs dtqsVar75 = (dtqs) m75;
        dtqsVar75.a = "conversations.custom_theme";
        m75.i(59820);
        dtqsVar75.d = new Supplier() { // from class: blvz
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar75.c = new dtsc() { // from class: blwb
        };
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(2);
        dtqs dtqsVar76 = (dtqs) m76;
        dtqsVar76.a = "conversations.mms_group_upgrade_status";
        m76.i(60050);
        dtqsVar76.d = new Supplier() { // from class: blwc
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar76.c = new dtsc() { // from class: blwd
        };
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(2);
        dtqs dtqsVar77 = (dtqs) m77;
        dtqsVar77.a = "conversations.mms_group_upgrade_retries";
        m77.i(60050);
        dtqsVar77.d = new Supplier() { // from class: blwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar77.c = new dtsc() { // from class: blwf
        };
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(2);
        dtqs dtqsVar78 = (dtqs) m78;
        dtqsVar78.a = "conversations.encryption_protocol";
        m78.i(60180);
        dtqsVar78.d = new Supplier() { // from class: blwg
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar78.c = new dtsc() { // from class: blwi
        };
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(4);
        dtqs dtqsVar79 = (dtqs) m79;
        dtqsVar79.a = "conversations.encryption_id";
        m79.i(60210);
        dtqsVar79.d = new Supplier() { // from class: blwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar79.c = new dtsc() { // from class: blwk
        };
        m79.a();
        dtsb m80 = dtsd.m();
        m80.m(4);
        m80.l(true);
        m80.d(true);
        dtqs dtqsVar80 = (dtqs) m80;
        dtqsVar80.a = "conversations.cms_correlation_id";
        m80.f(true);
        m80.i(60250);
        dtqsVar80.d = new Supplier() { // from class: blwm
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar80.c = new dtsc() { // from class: blwn
        };
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(4);
        dtqs dtqsVar81 = (dtqs) m81;
        dtqsVar81.a = "conversations.rcs_group_icon_url";
        m81.i(60590);
        dtqsVar81.d = new Supplier() { // from class: blwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar81.c = new dtsc() { // from class: blwp
        };
        m81.a();
        dtsb m82 = dtsd.m();
        m82.m(2);
        dtqs dtqsVar82 = (dtqs) m82;
        dtqsVar82.a = "conversations.unread_count";
        m82.i(60740);
        dtqsVar82.d = new Supplier() { // from class: blwq
            @Override // java.util.function.Supplier
            public final Object get() {
                return blxy.b();
            }
        };
        dtqsVar82.c = new dtsc() { // from class: blwr
        };
        m82.a();
    }

    public static final blxv a() {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("messages_annotations._id");
            engrVar.h("messages_annotations.conversation_id");
            if (c.intValue() >= 20040) {
                engrVar.h("messages_annotations.message_id");
            }
            engrVar.h("messages_annotations.annotation_type");
            engrVar.h("messages_annotations.annotation_details");
            engrVar.h("conversations._id");
            engrVar.h("conversations.sms_thread_id");
            engrVar.h("conversations.name");
            if (c.intValue() >= 10012) {
                engrVar.h("conversations.name_is_automatic");
            }
            if (c.intValue() >= 59760) {
                engrVar.h("conversations.subtitle");
            }
            engrVar.h("conversations.latest_message_id");
            engrVar.h("conversations.snippet_text");
            engrVar.h("conversations.subject_text");
            engrVar.h("conversations.preview_uri");
            engrVar.h("conversations.preview_content_type");
            engrVar.h("conversations.show_draft");
            engrVar.h("conversations.draft_snippet_text");
            engrVar.h("conversations.draft_subject_text");
            engrVar.h("conversations.draft_preview_uri");
            engrVar.h("conversations.draft_preview_content_type");
            if (c.intValue() >= 29060) {
                engrVar.h("conversations.etouffee_default");
            }
            engrVar.h("conversations.archive_status");
            engrVar.h("conversations.sort_timestamp");
            engrVar.h("conversations.last_read_timestamp");
            engrVar.h("conversations.icon");
            engrVar.h("conversations.participant_contact_id");
            if (c.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_contact_id");
            }
            engrVar.h("conversations.participant_lookup_key");
            if (c.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_lookup_key");
            }
            engrVar.h("conversations.participant_normalized_destination");
            if (c.intValue() >= 58090) {
                engrVar.h("conversations.participant_comparable_destination");
            }
            engrVar.h("conversations.current_self_id");
            if (c.intValue() >= 60160) {
                engrVar.h("conversations.current_my_identity_foreign_key");
            }
            if (c.intValue() >= 60360) {
                engrVar.h("conversations.destination_token");
            }
            engrVar.h("conversations.participant_count");
            engrVar.h("conversations.notification_enabled");
            engrVar.h("conversations.notification_sound_uri");
            engrVar.h("conversations.notification_vibration");
            engrVar.h("conversations.include_email_addr");
            engrVar.h("conversations.sms_service_center");
            if (c.intValue() >= 8500) {
                engrVar.h("conversations.participant_id_list");
            }
            if (c.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_id_list");
            }
            if (c.intValue() >= 8500) {
                engrVar.h("conversations.source_type");
            }
            if (c.intValue() >= 10000) {
                engrVar.h("conversations.rcs_session_id");
            }
            if (c.intValue() >= 10006) {
                engrVar.h("conversations.join_state");
            }
            if (c.intValue() >= 10007) {
                engrVar.h("conversations.conv_type");
            }
            if (c.intValue() >= 10016) {
                engrVar.h("conversations.send_mode");
            }
            if (c.intValue() >= 10018) {
                engrVar.h("conversations.IS_ENTERPRISE");
            }
            if (c.intValue() >= 12001) {
                engrVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (c.intValue() >= 15000) {
                engrVar.h("conversations.last_interactive_event_timestamp");
            }
            if (c.intValue() >= 15010) {
                engrVar.h("conversations.participant_display_destination");
            }
            if (c.intValue() >= 58090) {
                engrVar.h("conversations.normalized_participant_display_destination");
            }
            if (c.intValue() >= 23000) {
                engrVar.h("conversations.spam_warning_dismiss_status");
            }
            if (c.intValue() >= 26020) {
                engrVar.h("conversations.open_count");
            }
            if (c.intValue() >= 28010) {
                engrVar.h("conversations.last_logged_scooby_metadata_timestamp");
            }
            if (c.intValue() >= 29020) {
                engrVar.h("conversations.delete_timestamp");
            }
            if (c.intValue() >= 32000) {
                engrVar.h("conversations.cms_id");
            }
            if (c.intValue() >= 40050) {
                engrVar.h("conversations.rcs_group_id");
            }
            if (c.intValue() >= 40050) {
                engrVar.h("conversations.rcs_conference_uri");
            }
            if (c.intValue() >= 58120) {
                engrVar.h("conversations.tachygram_group_routing_info_token");
            }
            if (c.intValue() >= 53030) {
                engrVar.h("conversations.cms_most_recent_read_message_timestamp_ms");
            }
            if (c.intValue() >= 46050) {
                engrVar.h("conversations.rcs_subject_change_timestamp_ms");
            }
            if (c.intValue() >= 48040) {
                engrVar.h("conversations.rcs_session_allows_revocation");
            }
            if (c.intValue() >= 49020) {
                engrVar.h("conversations.rcs_group_capabilities");
            }
            if (c.intValue() >= 49060) {
                engrVar.h("conversations.awaiting_reverse_sync");
            }
            if (c.intValue() >= 58090) {
                engrVar.h("conversations.duplicate_of");
            }
            if (c.intValue() >= 59130) {
                engrVar.h("conversations.new_duplicate_of");
            }
            if (c.intValue() >= 58140) {
                engrVar.h("conversations.error_state");
            }
            if (c.intValue() >= 58210) {
                engrVar.h("conversations.cms_life_cycle");
            }
            if (c.intValue() >= 58540) {
                engrVar.h("conversations.rcs_group_self_msisdn");
            }
            if (c.intValue() >= 58750) {
                engrVar.h("conversations.recipient_offline_timestamp_ms");
            }
            if (c.intValue() >= 58910) {
                engrVar.h("conversations.rcs_group_last_sync_timestamp");
            }
            if (c.intValue() >= 59210) {
                engrVar.h("conversations.has_been_e2ee");
            }
            if (c.intValue() >= 59220) {
                engrVar.h("conversations.marked_as_unread");
            }
            if (c.intValue() >= 59820) {
                engrVar.h("conversations.custom_theme");
            }
            if (c.intValue() >= 60050) {
                engrVar.h("conversations.mms_group_upgrade_status");
            }
            if (c.intValue() >= 60050) {
                engrVar.h("conversations.mms_group_upgrade_retries");
            }
            if (c.intValue() >= 60180) {
                engrVar.h("conversations.encryption_protocol");
            }
            if (c.intValue() >= 60210) {
                engrVar.h("conversations.encryption_id");
            }
            if (c.intValue() >= 60250) {
                engrVar.h("conversations.cms_correlation_id");
            }
            if (c.intValue() >= 60590) {
                engrVar.h("conversations.rcs_group_icon_url");
            }
            if (c.intValue() >= 60740) {
                engrVar.h("conversations.unread_count");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new blxv(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}

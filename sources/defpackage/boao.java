package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boao {
    public static final String[] a = {"messages._id", "messages.received_timestamp", "participants._id", "participants.sub_id", "participants.normalized_destination", "participants.display_destination", "participants.full_name", "participants.first_name", "group_concat(quote(parts._id), '|')", "group_concat(quote(parts.text), '|')", "group_concat(quote(parts.uri), '|')", "group_concat(quote(parts.content_type), '|')", "group_concat(quote(parts.file_name), '|')", "group_concat(quote(parts.duration), '|')", "group_concat(quote(parts.rowid), '|') AS parts__ROWID", "link_preview.trigger_url", "link_preview.expiration_time_millis", "link_preview.link_title", "link_preview.link_image_url", "link_preview.link_preview_failed"};

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("group_concat(quote(parts.file_name), '|')", 26000);
        enhdVar.k("group_concat(quote(parts.duration), '|')", 26040);
        enhdVar.k("link_preview.link_preview_failed", 22020);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("_id", "index_unsent_rcs_report");
        enhdVar2.c();
        dtsb m = dtsd.m();
        m.m(2);
        m.l(true);
        m.g(true);
        m.d(true);
        m.b("messages._id");
        m.i(-1);
        m.c(new Supplier() { // from class: bnly
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m.j(new dtsc() { // from class: bnml
        });
        m.a();
        dtsb m2 = dtsd.m();
        m2.m(1);
        m2.d(true);
        m2.b("messages.received_timestamp");
        m2.i(-1);
        m2.c(new Supplier() { // from class: bnre
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m2.j(new dtsc() { // from class: bnuv
        });
        m2.a();
        dtsb m3 = dtsd.m();
        m3.m(1);
        m3.d(true);
        m3.e(true);
        m3.h(new Supplier() { // from class: bnvh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m3.b("messages.conversation_id");
        m3.i(-1);
        m3.c(new Supplier() { // from class: bnvu
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m3.j(new dtsc() { // from class: bnwg
        });
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(1);
        m4.d(true);
        m4.e(true);
        m4.h(new Supplier() { // from class: bnws
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m4.b("messages.sender_id");
        m4.i(-1);
        m4.c(new Supplier() { // from class: bnxe
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m4.j(new dtsc() { // from class: bnxq
        });
        m4.a();
        dtsb m5 = dtsd.m();
        m5.m(4);
        m5.b("messages.sender_send_destination");
        m5.i(54040);
        m5.c(new Supplier() { // from class: bnmu
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m5.j(new dtsc() { // from class: bnrm
        });
        m5.a();
        dtsb m6 = dtsd.m();
        m6.m(4);
        m6.b("messages.msisdn_receiving_rcs_message");
        m6.i(59340);
        m6.c(new Supplier() { // from class: bnwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m6.j(new dtsc() { // from class: bnxz
        });
        m6.a();
        dtsb m7 = dtsd.m();
        m7.m(4);
        m7.b("messages.receiving_network_country");
        m7.i(54040);
        m7.c(new Supplier() { // from class: bnyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m7.j(new dtsc() { // from class: bnyx
        });
        m7.a();
        dtsb m8 = dtsd.m();
        m8.m(1);
        m8.d(true);
        m8.b("messages.sent_timestamp");
        m8.i(-1);
        m8.c(new Supplier() { // from class: bnzj
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m8.j(new dtsc() { // from class: bnzv
        });
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(1);
        m9.b("messages.queue_insert_timestamp");
        m9.i(17030);
        m9.c(new Supplier() { // from class: boah
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m9.j(new dtsc() { // from class: bnmk
        });
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(1);
        m10.b("messages.message_protocol");
        m10.i(-1);
        m10.c(new Supplier() { // from class: bnmx
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m10.j(new dtsc() { // from class: bnnj
        });
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(1);
        m11.d(true);
        m11.b("messages.message_status");
        m11.i(-1);
        m11.c(new Supplier() { // from class: bnnv
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m11.j(new dtsc() { // from class: bnoh
        });
        m11.a();
        dtsb m12 = dtsd.m();
        m12.m(1);
        m12.b("messages.message_report_status");
        m12.i(13020);
        m12.c(new Supplier() { // from class: bnot
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m12.j(new dtsc() { // from class: bnpf
        });
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(1);
        m13.d(true);
        m13.b("messages.seen");
        m13.f(true);
        m13.i(-1);
        m13.c(new Supplier() { // from class: bnpr
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m13.j(new dtsc() { // from class: bnqd
        });
        m13.a();
        dtsb m14 = dtsd.m();
        m14.m(1);
        m14.d(true);
        m14.b("messages.read");
        m14.i(-1);
        m14.c(new Supplier() { // from class: bnqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m14.j(new dtsc() { // from class: bnrd
        });
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(4);
        m15.d(true);
        m15.b("messages.sms_message_uri");
        m15.i(-1);
        m15.c(new Supplier() { // from class: bnrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m15.j(new dtsc() { // from class: bnsc
        });
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(1);
        m16.b("messages.sms_priority");
        m16.i(-1);
        m16.c(new Supplier() { // from class: bnso
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m16.j(new dtsc() { // from class: bnta
        });
        m16.a();
        dtsb m17 = dtsd.m();
        m17.m(1);
        m17.b("messages.sms_message_size");
        m17.i(-1);
        m17.c(new Supplier() { // from class: bntm
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m17.j(new dtsc() { // from class: bnty
        });
        m17.a();
        dtsb m18 = dtsd.m();
        m18.m(4);
        m18.b("messages.mms_subject");
        m18.i(-1);
        m18.c(new Supplier() { // from class: bnuk
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m18.j(new dtsc() { // from class: bnus
        });
        m18.a();
        dtsb m19 = dtsd.m();
        m19.m(4);
        m19.b("messages.mms_transaction_id");
        m19.i(-1);
        m19.c(new Supplier() { // from class: bnut
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m19.j(new dtsc() { // from class: bnuu
        });
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(4);
        m20.b("messages.mms_content_location");
        m20.i(-1);
        m20.c(new Supplier() { // from class: bnuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m20.j(new dtsc() { // from class: bnuy
        });
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(1);
        m21.b("messages.mms_expiry");
        m21.i(-1);
        m21.c(new Supplier() { // from class: bnuz
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m21.j(new dtsc() { // from class: bnva
        });
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(1);
        m22.d(true);
        m22.b("messages.rcs_expiry");
        m22.i(59890);
        m22.c(new Supplier() { // from class: bnvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m22.j(new dtsc() { // from class: bnvc
        });
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(4);
        m23.b("messages.mms_retrieve_text");
        m23.i(9030);
        m23.c(new Supplier() { // from class: bnvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m23.j(new dtsc() { // from class: bnve
        });
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(1);
        m24.b("messages.raw_status");
        m24.i(-1);
        m24.c(new Supplier() { // from class: bnvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m24.j(new dtsc() { // from class: bnvg
        });
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(1);
        m25.d(true);
        m25.e(true);
        m25.h(new Supplier() { // from class: bnvj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m25.b("messages.self_id");
        m25.i(-1);
        m25.c(new Supplier() { // from class: bnvk
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m25.j(new dtsc() { // from class: bnvl
        });
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(4);
        m26.d(true);
        m26.b("messages.my_identity");
        m26.i(59810);
        m26.c(new Supplier() { // from class: bnvm
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m26.j(new dtsc() { // from class: bnvn
        });
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(4);
        m27.d(true);
        m27.e(true);
        m27.h(new Supplier() { // from class: bnvo
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m27.b("messages.my_identity_foreign_key");
        m27.i(60160);
        m27.c(new Supplier() { // from class: bnvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m27.j(new dtsc() { // from class: bnvq
        });
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(1);
        m28.b("messages.retry_start_timestamp");
        m28.i(-1);
        m28.c(new Supplier() { // from class: bnvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m28.j(new dtsc() { // from class: bnvs
        });
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(4);
        m29.d(true);
        m29.b("messages.cloud_sync_id");
        m29.i(8500);
        m29.c(new Supplier() { // from class: bnvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m29.j(new dtsc() { // from class: bnvw
        });
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(7);
        m30.d(true);
        m30.b("messages.rcs_message_id");
        m30.f(true);
        m30.i(10000);
        m30.c(new Supplier() { // from class: bnvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m30.j(new dtsc() { // from class: bnvy
        });
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(4);
        m31.d(true);
        m31.b("messages.rcs_message_id_with_text_type");
        m31.f(true);
        m31.i(41040);
        m31.c(new Supplier() { // from class: bnvz
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m31.j(new dtsc() { // from class: bnwa
        });
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(1);
        m32.b("messages.etouffee_status");
        m32.i(29060);
        m32.c(new Supplier() { // from class: bnwb
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m32.j(new dtsc() { // from class: bnwc
        });
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(1);
        m33.b("messages.verification_status");
        m33.i(29090);
        m33.c(new Supplier() { // from class: bnwd
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m33.j(new dtsc() { // from class: bnwf
        });
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(1);
        m34.b("messages.rcs_ui_status");
        m34.i(39000);
        m34.c(new Supplier() { // from class: bnwh
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m34.j(new dtsc() { // from class: bnwi
        });
        m34.a();
        dtsb m35 = dtsd.m();
        m35.m(1);
        m35.d(true);
        m35.b("messages.is_hidden");
        m35.i(30010);
        m35.c(new Supplier() { // from class: bnwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m35.j(new dtsc() { // from class: bnwk
        });
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(7);
        m36.b("messages.rcs_remote_instance");
        m36.i(10002);
        m36.c(new Supplier() { // from class: bnwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m36.j(new dtsc() { // from class: bnwm
        });
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(1);
        m37.b("messages.rcs_file_transfer_session_id");
        m37.i(10004);
        m37.c(new Supplier() { // from class: bnwn
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m37.j(new dtsc() { // from class: bnwo
        });
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(1);
        m38.b("messages.sms_error_code");
        m38.i(9000);
        m38.c(new Supplier() { // from class: bnwq
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m38.j(new dtsc() { // from class: bnwr
        });
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(4);
        m39.b("messages.sms_error_desc_map_name");
        m39.i(9000);
        m39.c(new Supplier() { // from class: bnwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m39.j(new dtsc() { // from class: bnwu
        });
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(4);
        m40.b("messages.correlation_id");
        m40.i(9010);
        m40.c(new Supplier() { // from class: bnwv
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m40.j(new dtsc() { // from class: bnww
        });
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(4);
        m41.l(true);
        m41.d(true);
        m41.b("messages.cms_id");
        m41.f(true);
        m41.i(31010);
        m41.c(new Supplier() { // from class: bnwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m41.j(new dtsc() { // from class: bnwy
        });
        m41.a();
        dtsb m42 = dtsd.m();
        m42.m(2);
        m42.b("messages.cms_last_mod_seq");
        m42.i(37040);
        m42.c(new Supplier() { // from class: bnwz
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m42.j(new dtsc() { // from class: bnxb
        });
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(4);
        m43.d(true);
        m43.b("messages.web_id");
        m43.i(19020);
        m43.c(new Supplier() { // from class: bnxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m43.j(new dtsc() { // from class: bnxd
        });
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(1);
        m44.b("messages.usage_stats_logging_id");
        m44.i(29100);
        m44.c(new Supplier() { // from class: bnxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m44.j(new dtsc() { // from class: bnxg
        });
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(1);
        m45.b("messages.send_counter");
        m45.i(35030);
        m45.c(new Supplier() { // from class: bnxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m45.j(new dtsc() { // from class: bnxi
        });
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(4);
        m46.d(true);
        m46.b("messages.original_rcs_message_id");
        m46.i(35030);
        m46.c(new Supplier() { // from class: bnxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m46.j(new dtsc() { // from class: bnxk
        });
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(4);
        m47.b("messages.custom_delivery_receipt_mime_type");
        m47.i(37020);
        m47.c(new Supplier() { // from class: bnxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m47.j(new dtsc() { // from class: bnxn
        });
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(5);
        m48.b("messages.custom_delivery_receipt_content");
        m48.i(37020);
        m48.c(new Supplier() { // from class: bnxo
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m48.j(new dtsc() { // from class: bnxp
        });
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(1);
        m49.b("messages.report_attempt_acounter");
        m49.i(37030);
        m49.c(new Supplier() { // from class: bnqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m49.j(new dtsc() { // from class: bnum
        });
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(5);
        m50.b("messages.custom_headers");
        m50.i(45020);
        m50.c(new Supplier() { // from class: bnxu
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m50.j(new dtsc() { // from class: bnyf
        });
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(4);
        m51.l(true);
        m51.d(true);
        m51.b("messages.cms_correlation_id");
        m51.f(true);
        m51.i(46010);
        m51.c(new Supplier() { // from class: bnyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m51.j(new dtsc() { // from class: bnzb
        });
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(1);
        m52.d(true);
        m52.e(true);
        m52.h(new Supplier() { // from class: bnzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m52.b("messages.group_private_participant");
        m52.i(48030);
        m52.c(new Supplier() { // from class: bnzx
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m52.j(new dtsc() { // from class: boai
        });
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(1);
        m53.d(true);
        m53.e(true);
        m53.h(new Supplier() { // from class: bnmj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m53.b("messages.original_message_id");
        m53.i(48030);
        m53.c(new Supplier() { // from class: bnnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m53.j(new dtsc() { // from class: bnnq
        });
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(1);
        m54.b("messages.awaiting_reverse_sync");
        m54.i(49060);
        m54.c(new Supplier() { // from class: bnob
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m54.j(new dtsc() { // from class: bnom
        });
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(4);
        m55.b("messages.old_sms_message_uri");
        m55.i(49060);
        m55.c(new Supplier() { // from class: bnox
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m55.j(new dtsc() { // from class: bnpi
        });
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(4);
        m56.l(true);
        m56.d(true);
        m56.b("messages.draft_id");
        m56.f(true);
        m56.i(56000);
        m56.c(new Supplier() { // from class: bnpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m56.j(new dtsc() { // from class: bnqe
        });
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(1);
        m57.b("messages.result_code");
        m57.i(58040);
        m57.c(new Supplier() { // from class: bnqq
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m57.j(new dtsc() { // from class: bnrb
        });
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(1);
        m58.b("messages.cms_life_cycle");
        m58.i(58210);
        m58.c(new Supplier() { // from class: bnrx
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m58.j(new dtsc() { // from class: bnsi
        });
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(1);
        m59.b("messages.mute_priority");
        m59.i(60750);
        m59.c(new Supplier() { // from class: bnst
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m59.j(new dtsc() { // from class: bnte
        });
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(1);
        m60.b("messages.fallback_reason");
        m60.i(58710);
        m60.c(new Supplier() { // from class: bntp
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m60.j(new dtsc() { // from class: bnua
        });
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(1);
        m61.b("messages.auto_retry_counter");
        m61.i(58230);
        m61.c(new Supplier() { // from class: bnul
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m61.j(new dtsc() { // from class: bnux
        });
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(2);
        m62.b("messages.can_revoke_before_delivered_with_rcs");
        m62.i(58280);
        m62.c(new Supplier() { // from class: bnvi
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m62.j(new dtsc() { // from class: bnvt
        });
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(5);
        m63.b("messages.trace_id");
        m63.i(58680);
        m63.c(new Supplier() { // from class: bnwp
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m63.j(new dtsc() { // from class: bnxa
        });
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(1);
        m64.b("messages.outgoing_delivery_report_status");
        m64.i(58720);
        m64.c(new Supplier() { // from class: bnxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m64.j(new dtsc() { // from class: bnxr
        });
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(1);
        m65.b("messages.outgoing_read_report_status");
        m65.i(58720);
        m65.c(new Supplier() { // from class: bnxs
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m65.j(new dtsc() { // from class: bnxt
        });
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(1);
        m66.b("messages.xms_transport");
        m66.i(59310);
        m66.c(new Supplier() { // from class: bnxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m66.j(new dtsc() { // from class: bnxw
        });
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(1);
        m67.b("messages.message_original_protocol");
        m67.i(59430);
        m67.c(new Supplier() { // from class: bnxx
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m67.j(new dtsc() { // from class: bnxy
        });
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(4);
        m68.l(true);
        m68.d(true);
        m68.b("messages.satellite_datagram_id");
        m68.f(true);
        m68.i(59490);
        m68.c(new Supplier() { // from class: bnya
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m68.j(new dtsc() { // from class: bnyb
        });
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(1);
        m69.b("messages.encryption_protocol");
        m69.i(60190);
        m69.c(new Supplier() { // from class: bnyc
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m69.j(new dtsc() { // from class: bnyd
        });
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(4);
        m70.l(true);
        m70.d(true);
        m70.b("messages.message_persistence_id");
        m70.f(true);
        m70.i(60370);
        m70.c(new Supplier() { // from class: bnye
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m70.j(new dtsc() { // from class: bnyg
        });
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(2);
        m71.l(true);
        m71.g(true);
        m71.d(true);
        m71.b("participants._id");
        m71.i(-1);
        m71.c(new Supplier() { // from class: bnyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m71.j(new dtsc() { // from class: bnyi
        });
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(1);
        m72.d(true);
        m72.b("participants.sub_id");
        m72.f(true);
        m72.i(-1);
        m72.c(new Supplier() { // from class: bnyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m72.j(new dtsc() { // from class: bnyk
        });
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(4);
        m73.d(true);
        m73.b("participants.normalized_destination");
        m73.f(true);
        m73.i(-1);
        m73.c(new Supplier() { // from class: bnym
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m73.j(new dtsc() { // from class: bnyn
        });
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(4);
        m74.b("participants.display_destination");
        m74.i(-1);
        m74.c(new Supplier() { // from class: bnyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m74.j(new dtsc() { // from class: bnyp
        });
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(4);
        m75.b("participants.full_name");
        m75.i(-1);
        m75.c(new Supplier() { // from class: bnyr
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m75.j(new dtsc() { // from class: bnys
        });
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(4);
        m76.b("participants.first_name");
        m76.i(-1);
        m76.c(new Supplier() { // from class: bnyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m76.j(new dtsc() { // from class: bnyu
        });
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(4);
        m77.d(true);
        m77.b("participants.my_identity_token");
        m77.i(59930);
        m77.c(new Supplier() { // from class: bnyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m77.j(new dtsc() { // from class: bnyw
        });
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(4);
        m78.d(true);
        m78.e(true);
        m78.h(new Supplier() { // from class: bnyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m78.b("participants.my_identity_token_foreign_key");
        m78.i(60160);
        m78.c(new Supplier() { // from class: bnyz
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m78.j(new dtsc() { // from class: bnza
        });
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(1);
        m79.b("participants.sim_slot_id");
        m79.i(2000);
        m79.c(new Supplier() { // from class: bnzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m79.j(new dtsc() { // from class: bnzd
        });
        m79.a();
        dtsb m80 = dtsd.m();
        m80.m(4);
        m80.b("participants.send_destination");
        m80.i(-1);
        m80.c(new Supplier() { // from class: bnze
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m80.j(new dtsc() { // from class: bnzf
        });
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(4);
        m81.l(true);
        m81.d(true);
        m81.b("participants.comparable_destination");
        m81.f(true);
        m81.i(54040);
        m81.c(new Supplier() { // from class: bnzg
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m81.j(new dtsc() { // from class: bnzh
        });
        m81.a();
        dtsb m82 = dtsd.m();
        m82.m(4);
        m82.b("participants.country_code");
        m82.i(54040);
        m82.c(new Supplier() { // from class: bnzi
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m82.j(new dtsc() { // from class: bnzk
        });
        m82.a();
        dtsb m83 = dtsd.m();
        m83.m(2);
        m83.l(true);
        m83.d(true);
        m83.b("participants.recipient_id");
        m83.f(true);
        m83.i(58090);
        m83.c(new Supplier() { // from class: bnzl
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m83.j(new dtsc() { // from class: bnzn
        });
        m83.a();
        dtsb m84 = dtsd.m();
        m84.m(4);
        m84.b("participants.recipient_canonical_address");
        m84.i(58090);
        m84.c(new Supplier() { // from class: bnzo
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m84.j(new dtsc() { // from class: bnzp
        });
        m84.a();
        dtsb m85 = dtsd.m();
        m85.m(4);
        m85.b("participants.profile_photo_uri");
        m85.i(-1);
        m85.c(new Supplier() { // from class: bnzq
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m85.j(new dtsc() { // from class: bnzr
        });
        m85.a();
        dtsb m86 = dtsd.m();
        m86.m(4);
        m86.b("participants.contact_photo_uri");
        m86.i(59850);
        m86.c(new Supplier() { // from class: bnzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m86.j(new dtsc() { // from class: bnzt
        });
        m86.a();
        dtsb m87 = dtsd.m();
        m87.m(1);
        m87.b("participants.contact_id");
        m87.i(-1);
        m87.c(new Supplier() { // from class: bnzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m87.j(new dtsc() { // from class: bnzw
        });
        m87.a();
        dtsb m88 = dtsd.m();
        m88.m(4);
        m88.b("participants.lookup_key");
        m88.i(-1);
        m88.c(new Supplier() { // from class: bnzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m88.j(new dtsc() { // from class: bnzz
        });
        m88.a();
        dtsb m89 = dtsd.m();
        m89.m(1);
        m89.b("participants.color_palette_index");
        m89.i(-1);
        m89.c(new Supplier() { // from class: boaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m89.j(new dtsc() { // from class: boab
        });
        m89.a();
        dtsb m90 = dtsd.m();
        m90.m(1);
        m90.b("participants.color_type");
        m90.i(1000);
        m90.c(new Supplier() { // from class: boac
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m90.j(new dtsc() { // from class: boad
        });
        m90.a();
        dtsb m91 = dtsd.m();
        m91.m(1);
        m91.b("participants.extended_color");
        m91.i(10027);
        m91.c(new Supplier() { // from class: boae
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m91.j(new dtsc() { // from class: boaf
        });
        m91.a();
        dtsb m92 = dtsd.m();
        m92.m(1);
        m92.b("participants.blocked");
        m92.i(-1);
        m92.c(new Supplier() { // from class: boag
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m92.j(new dtsc() { // from class: bnlz
        });
        m92.a();
        dtsb m93 = dtsd.m();
        m93.m(4);
        m93.b("participants.subscription_name");
        m93.i(2000);
        m93.c(new Supplier() { // from class: bnma
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m93.j(new dtsc() { // from class: bnmb
        });
        m93.a();
        dtsb m94 = dtsd.m();
        m94.m(1);
        m94.b("participants.subscription_color");
        m94.i(2000);
        m94.c(new Supplier() { // from class: bnmc
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m94.j(new dtsc() { // from class: bnmd
        });
        m94.a();
        dtsb m95 = dtsd.m();
        m95.m(4);
        m95.b("participants.contact_destination");
        m95.i(4000);
        m95.c(new Supplier() { // from class: bnme
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m95.j(new dtsc() { // from class: bnmf
        });
        m95.a();
        dtsb m96 = dtsd.m();
        m96.m(1);
        m96.b("participants.participant_type");
        m96.i(12001);
        m96.c(new Supplier() { // from class: bnmg
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m96.j(new dtsc() { // from class: bnmh
        });
        m96.a();
        dtsb m97 = dtsd.m();
        m97.m(1);
        m97.b("participants.video_reachability");
        m97.i(13050);
        m97.c(new Supplier() { // from class: bnmi
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m97.j(new dtsc() { // from class: bnmm
        });
        m97.a();
        dtsb m98 = dtsd.m();
        m98.m(4);
        m98.b("participants.alias");
        m98.i(20060);
        m98.c(new Supplier() { // from class: bnmn
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m98.j(new dtsc() { // from class: bnmo
        });
        m98.a();
        dtsb m99 = dtsd.m();
        m99.m(1);
        m99.b("participants.is_spam");
        m99.i(24060);
        m99.c(new Supplier() { // from class: bnmp
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m99.j(new dtsc() { // from class: bnmq
        });
        m99.a();
        dtsb m100 = dtsd.m();
        m100.m(1);
        m100.b("participants.is_rcs_available");
        m100.i(29030);
        m100.c(new Supplier() { // from class: bnmr
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m100.j(new dtsc() { // from class: bnms
        });
        m100.a();
        dtsb m101 = dtsd.m();
        m101.m(1);
        m101.b("participants.is_spam_source");
        m101.i(30000);
        m101.c(new Supplier() { // from class: bnmt
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m101.j(new dtsc() { // from class: bnmv
        });
        m101.a();
        dtsb m102 = dtsd.m();
        m102.m(4);
        m102.l(true);
        m102.d(true);
        m102.b("participants.cms_id");
        m102.f(true);
        m102.i(31020);
        m102.c(new Supplier() { // from class: bnmw
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m102.j(new dtsc() { // from class: bnmy
        });
        m102.a();
        dtsb m103 = dtsd.m();
        m103.m(1);
        m103.b("participants.latest_verification_status");
        m103.i(31030);
        m103.c(new Supplier() { // from class: bnmz
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m103.j(new dtsc() { // from class: bnna
        });
        m103.a();
        dtsb m104 = dtsd.m();
        m104.m(4);
        m104.b("participants.profile_photo_blob_id");
        m104.i(33000);
        m104.c(new Supplier() { // from class: bnnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m104.j(new dtsc() { // from class: bnnc
        });
        m104.a();
        dtsb m105 = dtsd.m();
        m105.m(5);
        m105.b("participants.profile_photo_encryption_key");
        m105.i(33060);
        m105.c(new Supplier() { // from class: bnnd
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m105.j(new dtsc() { // from class: bnne
        });
        m105.a();
        dtsb m106 = dtsd.m();
        m106.m(1);
        m106.b("participants.directory_id");
        m106.i(35010);
        m106.c(new Supplier() { // from class: bnng
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m106.j(new dtsc() { // from class: bnnh
        });
        m106.a();
        dtsb m107 = dtsd.m();
        m107.m(1);
        m107.b("participants.is_check_constraint_enabled_via_phenotype");
        m107.i(55010);
        m107.c(new Supplier() { // from class: bnni
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m107.j(new dtsc() { // from class: bnnk
        });
        m107.a();
        dtsb m108 = dtsd.m();
        m108.m(1);
        m108.b("participants.is_valid_phone_number_data");
        m108.i(55010);
        m108.c(new Supplier() { // from class: bnnl
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m108.j(new dtsc() { // from class: bnnm
        });
        m108.a();
        dtsb m109 = dtsd.m();
        m109.m(2);
        m109.d(true);
        m109.e(true);
        m109.h(new Supplier() { // from class: bnnn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m109.b("participants.duplicate_of");
        m109.i(58090);
        m109.c(new Supplier() { // from class: bnno
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m109.j(new dtsc() { // from class: bnnp
        });
        m109.a();
        dtsb m110 = dtsd.m();
        m110.m(1);
        m110.b("participants.cms_life_cycle");
        m110.i(58210);
        m110.c(new Supplier() { // from class: bnnr
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m110.j(new dtsc() { // from class: bnns
        });
        m110.a();
        dtsb m111 = dtsd.m();
        m111.m(1);
        m111.b("participants.norm_ui_status");
        m111.i(58620);
        m111.c(new Supplier() { // from class: bnnt
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m111.j(new dtsc() { // from class: bnnu
        });
        m111.a();
        dtsb m112 = dtsd.m();
        m112.m(4);
        m112.b("participants.last_modified_by_key");
        m112.i(59440);
        m112.c(new Supplier() { // from class: bnnw
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m112.j(new dtsc() { // from class: bnnx
        });
        m112.a();
        dtsb m113 = dtsd.m();
        m113.m(1);
        m113.b("participants.name_source");
        m113.i(59550);
        m113.c(new Supplier() { // from class: bnny
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m113.j(new dtsc() { // from class: bnnz
        });
        m113.a();
        dtsb m114 = dtsd.m();
        m114.m(1);
        m114.b("participants.photo_source");
        m114.i(59550);
        m114.c(new Supplier() { // from class: bnoa
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m114.j(new dtsc() { // from class: bnoc
        });
        m114.a();
        dtsb m115 = dtsd.m();
        m115.m(1);
        m115.b("participants.profile_photo_user_preference");
        m115.i(60060);
        m115.c(new Supplier() { // from class: bnod
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m115.j(new dtsc() { // from class: bnoe
        });
        m115.a();
        dtsb m116 = dtsd.m();
        m116.m(5);
        m116.b("participants.contact_metadata");
        m116.i(60070);
        m116.c(new Supplier() { // from class: bnof
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m116.j(new dtsc() { // from class: bnog
        });
        m116.a();
        dtsb m117 = dtsd.m();
        m117.m(1);
        m117.d(true);
        m117.b("participants.is_enterprise_contact");
        m117.i(60640);
        m117.c(new Supplier() { // from class: bnoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m117.j(new dtsc() { // from class: bnoj
        });
        m117.a();
        dtsb m118 = dtsd.m();
        m118.m(2);
        m118.l(true);
        m118.g(true);
        m118.d(true);
        m118.b("parts._id");
        m118.i(-1);
        m118.c(new Supplier() { // from class: bnok
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m118.j(new dtsc() { // from class: bnol
        });
        m118.a();
        dtsb m119 = dtsd.m();
        m119.m(4);
        m119.b("parts.text");
        m119.i(-1);
        m119.c(new Supplier() { // from class: bnon
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m119.j(new dtsc() { // from class: bnoo
        });
        m119.a();
        dtsb m120 = dtsd.m();
        m120.m(4);
        m120.b("parts.uri");
        m120.i(-1);
        m120.c(new Supplier() { // from class: bnop
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m120.j(new dtsc() { // from class: bnoq
        });
        m120.a();
        dtsb m121 = dtsd.m();
        m121.m(4);
        m121.d(true);
        m121.b("parts.content_type");
        m121.i(-1);
        m121.c(new Supplier() { // from class: bnor
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m121.j(new dtsc() { // from class: bnos
        });
        m121.a();
        dtsb m122 = dtsd.m();
        m122.m(4);
        m122.b("parts.file_name");
        m122.i(26000);
        m122.c(new Supplier() { // from class: bnou
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m122.j(new dtsc() { // from class: bnov
        });
        m122.a();
        dtsb m123 = dtsd.m();
        m123.m(1);
        m123.b("parts.duration");
        m123.i(26040);
        m123.c(new Supplier() { // from class: bnow
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m123.j(new dtsc() { // from class: bnoy
        });
        m123.a();
        dtsb m124 = dtsd.m();
        m124.m(8);
        m124.b("parts__ROWID");
        m124.i(0);
        m124.c(new Supplier() { // from class: bnoz
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m124.j(new dtsc() { // from class: bnpa
        });
        m124.a();
        dtsb m125 = dtsd.m();
        m125.m(1);
        m125.d(true);
        m125.e(true);
        m125.h(new Supplier() { // from class: bnpb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m125.b("parts.message_id");
        m125.i(-1);
        m125.c(new Supplier() { // from class: bnpc
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m125.j(new dtsc() { // from class: bnpd
        });
        m125.a();
        dtsb m126 = dtsd.m();
        m126.m(4);
        m126.b("parts.original_uri");
        m126.i(10021);
        m126.c(new Supplier() { // from class: bnpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m126.j(new dtsc() { // from class: bnpg
        });
        m126.a();
        dtsb m127 = dtsd.m();
        m127.m(4);
        m127.b("parts.storage_uri");
        m127.i(29060);
        m127.c(new Supplier() { // from class: bnph
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m127.j(new dtsc() { // from class: bnpj
        });
        m127.a();
        dtsb m128 = dtsd.m();
        m128.m(1);
        m128.b("parts.width");
        m128.i(-1);
        m128.c(new Supplier() { // from class: bnpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m128.j(new dtsc() { // from class: bnpl
        });
        m128.a();
        dtsb m129 = dtsd.m();
        m129.m(1);
        m129.b("parts.height");
        m129.i(-1);
        m129.c(new Supplier() { // from class: bnpm
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m129.j(new dtsc() { // from class: bnpn
        });
        m129.a();
        dtsb m130 = dtsd.m();
        m130.m(1);
        m130.b("parts.timestamp");
        m130.i(3010);
        m130.c(new Supplier() { // from class: bnpo
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m130.j(new dtsc() { // from class: bnpp
        });
        m130.a();
        dtsb m131 = dtsd.m();
        m131.m(4);
        m131.d(true);
        m131.b("parts.output_uri");
        m131.i(4020);
        m131.c(new Supplier() { // from class: bnpq
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m131.j(new dtsc() { // from class: bnps
        });
        m131.a();
        dtsb m132 = dtsd.m();
        m132.m(1);
        m132.b("parts.target_size");
        m132.i(4020);
        m132.c(new Supplier() { // from class: bnpu
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m132.j(new dtsc() { // from class: bnpv
        });
        m132.a();
        dtsb m133 = dtsd.m();
        m133.m(1);
        m133.b("parts.processing_status");
        m133.i(4020);
        m133.c(new Supplier() { // from class: bnpw
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m133.j(new dtsc() { // from class: bnpx
        });
        m133.a();
        dtsb m134 = dtsd.m();
        m134.m(1);
        m134.b("parts.cms_attachment_processing_status");
        m134.i(44010);
        m134.c(new Supplier() { // from class: bnpy
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m134.j(new dtsc() { // from class: bnpz
        });
        m134.a();
        dtsb m135 = dtsd.m();
        m135.m(1);
        m135.d(true);
        m135.e(true);
        m135.h(new Supplier() { // from class: bnqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m135.b("parts.conversation_id");
        m135.i(-1);
        m135.c(new Supplier() { // from class: bnqb
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m135.j(new dtsc() { // from class: bnqc
        });
        m135.a();
        dtsb m136 = dtsd.m();
        m136.m(1);
        m136.b("parts.sticker_set_id");
        m136.i(5020);
        m136.c(new Supplier() { // from class: bnqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m136.j(new dtsc() { // from class: bnqh
        });
        m136.a();
        dtsb m137 = dtsd.m();
        m137.m(1);
        m137.b("parts.sticker_id");
        m137.i(5020);
        m137.c(new Supplier() { // from class: bnqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m137.j(new dtsc() { // from class: bnqj
        });
        m137.a();
        dtsb m138 = dtsd.m();
        m138.m(1);
        m138.b("parts.media_modified_timestamp");
        m138.i(7000);
        m138.c(new Supplier() { // from class: bnqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m138.j(new dtsc() { // from class: bnql
        });
        m138.a();
        dtsb m139 = dtsd.m();
        m139.m(3);
        m139.b("parts.longitude");
        m139.i(10005);
        m139.c(new Supplier() { // from class: bnqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m139.j(new dtsc() { // from class: bnqn
        });
        m139.a();
        dtsb m140 = dtsd.m();
        m140.m(3);
        m140.b("parts.latitude");
        m140.i(10005);
        m140.c(new Supplier() { // from class: bnqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m140.j(new dtsc() { // from class: bnqp
        });
        m140.a();
        dtsb m141 = dtsd.m();
        m141.m(4);
        m141.b("parts.preview_content_uri");
        m141.i(10017);
        m141.c(new Supplier() { // from class: bnqs
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m141.j(new dtsc() { // from class: bnqt
        });
        m141.a();
        dtsb m142 = dtsd.m();
        m142.m(4);
        m142.d(true);
        m142.b("parts.preview_content_type");
        m142.i(10017);
        m142.c(new Supplier() { // from class: bnqu
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m142.j(new dtsc() { // from class: bnqv
        });
        m142.a();
        dtsb m143 = dtsd.m();
        m143.m(4);
        m143.b("parts.fallback_uri");
        m143.i(13000);
        m143.c(new Supplier() { // from class: bnqw
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m143.j(new dtsc() { // from class: bnqx
        });
        m143.a();
        dtsb m144 = dtsd.m();
        m144.m(1);
        m144.b("parts.source");
        m144.i(14010);
        m144.c(new Supplier() { // from class: bnqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m144.j(new dtsc() { // from class: bnqz
        });
        m144.a();
        dtsb m145 = dtsd.m();
        m145.m(1);
        m145.b("parts.bundle_index");
        m145.i(17010);
        m145.c(new Supplier() { // from class: bnra
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m145.j(new dtsc() { // from class: bnrc
        });
        m145.a();
        dtsb m146 = dtsd.m();
        m146.m(4);
        m146.b("parts.blob_id");
        m146.i(17020);
        m146.c(new Supplier() { // from class: bnrf
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m146.j(new dtsc() { // from class: bnrg
        });
        m146.a();
        dtsb m147 = dtsd.m();
        m147.m(4);
        m147.b("parts.blob_gaia_email");
        m147.i(59570);
        m147.c(new Supplier() { // from class: bnrh
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m147.j(new dtsc() { // from class: bnri
        });
        m147.a();
        dtsb m148 = dtsd.m();
        m148.m(4);
        m148.b("parts.cms_full_size_blob_id");
        m148.i(40040);
        m148.c(new Supplier() { // from class: bnrj
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m148.j(new dtsc() { // from class: bnrk
        });
        m148.a();
        dtsb m149 = dtsd.m();
        m149.m(5);
        m149.b("parts.cms_media_encryption_key");
        m149.i(42010);
        m149.c(new Supplier() { // from class: bnrl
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m149.j(new dtsc() { // from class: bnrn
        });
        m149.a();
        dtsb m150 = dtsd.m();
        m150.m(5);
        m150.b("parts.cms_compressed_media_encryption_key");
        m150.i(42070);
        m150.c(new Supplier() { // from class: bnro
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m150.j(new dtsc() { // from class: bnrp
        });
        m150.a();
        dtsb m151 = dtsd.m();
        m151.m(1);
        m151.b("parts.blob_upload_permanent_failure");
        m151.i(18000);
        m151.c(new Supplier() { // from class: bnrr
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m151.j(new dtsc() { // from class: bnrs
        });
        m151.a();
        dtsb m152 = dtsd.m();
        m152.m(1);
        m152.b("parts.blob_upload_timestamp");
        m152.i(19030);
        m152.c(new Supplier() { // from class: bnrt
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m152.j(new dtsc() { // from class: bnru
        });
        m152.a();
        dtsb m153 = dtsd.m();
        m153.m(4);
        m153.b("parts.expressive_sticker_name");
        m153.i(22060);
        m153.c(new Supplier() { // from class: bnrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m153.j(new dtsc() { // from class: bnrw
        });
        m153.a();
        dtsb m154 = dtsd.m();
        m154.m(4);
        m154.b("parts.compressed_blob_id");
        m154.i(27000);
        m154.c(new Supplier() { // from class: bnry
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m154.j(new dtsc() { // from class: bnrz
        });
        m154.a();
        dtsb m155 = dtsd.m();
        m155.m(4);
        m155.b("parts.cms_compressed_blob_id");
        m155.i(40040);
        m155.c(new Supplier() { // from class: bnsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m155.j(new dtsc() { // from class: bnsb
        });
        m155.a();
        dtsb m156 = dtsd.m();
        m156.m(1);
        m156.b("parts.compressed_blob_upload_permanent_failure");
        m156.i(27000);
        m156.c(new Supplier() { // from class: bnsd
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m156.j(new dtsc() { // from class: bnse
        });
        m156.a();
        dtsb m157 = dtsd.m();
        m157.m(1);
        m157.b("parts.compressed_blob_upload_timestamp");
        m157.i(27000);
        m157.c(new Supplier() { // from class: bnsf
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m157.j(new dtsc() { // from class: bnsg
        });
        m157.a();
        dtsb m158 = dtsd.m();
        m158.m(5);
        m158.b("parts.media_encryption_key");
        m158.i(30040);
        m158.c(new Supplier() { // from class: bnsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m158.j(new dtsc() { // from class: bnsj
        });
        m158.a();
        dtsb m159 = dtsd.m();
        m159.m(5);
        m159.b("parts.compressed_media_encryption_key");
        m159.i(30040);
        m159.c(new Supplier() { // from class: bnsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m159.j(new dtsc() { // from class: bnsl
        });
        m159.a();
        dtsb m160 = dtsd.m();
        m160.m(5);
        m160.b("parts.attachment_upload_response");
        m160.i(49010);
        m160.c(new Supplier() { // from class: bnsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m160.j(new dtsc() { // from class: bnsn
        });
        m160.a();
        dtsb m161 = dtsd.m();
        m161.m(1);
        m161.b("parts.missing_entry_in_telephony");
        m161.i(52030);
        m161.c(new Supplier() { // from class: bnsp
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m161.j(new dtsc() { // from class: bnsq
        });
        m161.a();
        dtsb m162 = dtsd.m();
        m162.m(1);
        m162.b("parts.awaiting_reverse_sync");
        m162.i(53040);
        m162.c(new Supplier() { // from class: bnsr
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m162.j(new dtsc() { // from class: bnss
        });
        m162.a();
        dtsb m163 = dtsd.m();
        m163.m(1);
        m163.b("parts.file_size_bytes");
        m163.i(52050);
        m163.c(new Supplier() { // from class: bnsu
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m163.j(new dtsc() { // from class: bnsv
        });
        m163.a();
        dtsb m164 = dtsd.m();
        m164.m(4);
        m164.d(true);
        m164.b("parts.local_cache_path");
        m164.i(52050);
        m164.c(new Supplier() { // from class: bnsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m164.j(new dtsc() { // from class: bnsx
        });
        m164.a();
        dtsb m165 = dtsd.m();
        m165.m(1);
        m165.b("parts.media_send_type");
        m165.i(58150);
        m165.c(new Supplier() { // from class: bnsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m165.j(new dtsc() { // from class: bnsz
        });
        m165.a();
        dtsb m166 = dtsd.m();
        m166.m(5);
        m166.b("parts.voice_metadata");
        m166.i(59470);
        m166.c(new Supplier() { // from class: bntb
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m166.j(new dtsc() { // from class: bntc
        });
        m166.a();
        dtsb m167 = dtsd.m();
        m167.m(1);
        m167.b("parts.validation_status");
        m167.i(58770);
        m167.c(new Supplier() { // from class: bntd
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m167.j(new dtsc() { // from class: bntf
        });
        m167.a();
        dtsb m168 = dtsd.m();
        m168.m(4);
        m168.b("parts.processing_id");
        m168.i(60080);
        m168.c(new Supplier() { // from class: bntg
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m168.j(new dtsc() { // from class: bnth
        });
        m168.a();
        dtsb m169 = dtsd.m();
        m169.m(1);
        m169.b("parts.rich_card_media_download_failure_reason");
        m169.i(60230);
        m169.c(new Supplier() { // from class: bnti
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m169.j(new dtsc() { // from class: bntj
        });
        m169.a();
        dtsb m170 = dtsd.m();
        m170.m(1);
        m170.b("parts.image_display_state");
        m170.i(60240);
        m170.c(new Supplier() { // from class: bntk
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m170.j(new dtsc() { // from class: bntl
        });
        m170.a();
        dtsb m171 = dtsd.m();
        m171.m(1);
        m171.b("parts.preserve_size");
        m171.i(60680);
        m171.c(new Supplier() { // from class: bntn
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m171.j(new dtsc() { // from class: bnto
        });
        m171.a();
        dtsb m172 = dtsd.m();
        m172.m(4);
        m172.b("link_preview.trigger_url");
        m172.i(-1);
        m172.c(new Supplier() { // from class: bntq
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m172.j(new dtsc() { // from class: bntr
        });
        m172.a();
        dtsb m173 = dtsd.m();
        m173.m(2);
        m173.b("link_preview.expiration_time_millis");
        m173.i(-1);
        m173.c(new Supplier() { // from class: bnts
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m173.j(new dtsc() { // from class: bntt
        });
        m173.a();
        dtsb m174 = dtsd.m();
        m174.m(4);
        m174.b("link_preview.link_title");
        m174.i(-1);
        m174.c(new Supplier() { // from class: bntu
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m174.j(new dtsc() { // from class: bntv
        });
        m174.a();
        dtsb m175 = dtsd.m();
        m175.m(4);
        m175.b("link_preview.link_image_url");
        m175.i(-1);
        m175.c(new Supplier() { // from class: bntw
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m175.j(new dtsc() { // from class: bntx
        });
        m175.a();
        dtsb m176 = dtsd.m();
        m176.m(2);
        m176.b("link_preview.link_preview_failed");
        m176.i(22020);
        m176.c(new Supplier() { // from class: bntz
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m176.j(new dtsc() { // from class: bnub
        });
        m176.a();
        dtsb m177 = dtsd.m();
        m177.m(2);
        m177.l(true);
        m177.g(true);
        m177.d(true);
        m177.b("link_preview._id");
        m177.i(-1);
        m177.c(new Supplier() { // from class: bnuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m177.j(new dtsc() { // from class: bnud
        });
        m177.a();
        dtsb m178 = dtsd.m();
        m178.m(2);
        m178.l(true);
        m178.d(true);
        m178.e(true);
        m178.h(new Supplier() { // from class: bnue
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m178.b("link_preview.message_id");
        m178.i(-1);
        m178.c(new Supplier() { // from class: bnuf
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m178.j(new dtsc() { // from class: bnug
        });
        m178.a();
        dtsb m179 = dtsd.m();
        m179.m(4);
        m179.b("link_preview.link_description");
        m179.i(-1);
        m179.c(new Supplier() { // from class: bnuh
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m179.j(new dtsc() { // from class: bnui
        });
        m179.a();
        dtsb m180 = dtsd.m();
        m180.m(4);
        m180.b("link_preview.link_domain");
        m180.i(-1);
        m180.c(new Supplier() { // from class: bnuj
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m180.j(new dtsc() { // from class: bnun
        });
        m180.a();
        dtsb m181 = dtsd.m();
        m181.m(4);
        m181.b("link_preview.link_canonical_url");
        m181.i(-1);
        m181.c(new Supplier() { // from class: bnuo
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m181.j(new dtsc() { // from class: bnup
        });
        m181.a();
        dtsb m182 = dtsd.m();
        m182.m(2);
        m182.b("link_preview.link_preview_prevented");
        m182.i(21010);
        m182.c(new Supplier() { // from class: bnuq
            @Override // java.util.function.Supplier
            public final Object get() {
                return boao.a();
            }
        });
        m182.j(new dtsc() { // from class: bnur
        });
        m182.a();
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static Integer b() {
        return Integer.valueOf(a().P().a());
    }
}

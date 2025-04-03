package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmju {
    public static final String[] a = {"messages._id"};

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("_id", "index_unsent_rcs_report");
        enhdVar.c();
        dtsb m = dtsd.m();
        m.m(2);
        m.l(true);
        m.g(true);
        m.d(true);
        m.b("messages._id");
        m.i(-1);
        m.c(new Supplier() { // from class: blyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m.j(new dtsc() { // from class: blyw
        });
        m.a();
        dtsb m2 = dtsd.m();
        m2.m(1);
        m2.d(true);
        m2.e(true);
        m2.h(new Supplier() { // from class: bmdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m2.b("messages.conversation_id");
        m2.i(-1);
        m2.c(new Supplier() { // from class: bmds
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m2.j(new dtsc() { // from class: bmee
        });
        m2.a();
        dtsb m3 = dtsd.m();
        m3.m(1);
        m3.d(true);
        m3.e(true);
        m3.h(new Supplier() { // from class: bmeq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m3.b("messages.sender_id");
        m3.i(-1);
        m3.c(new Supplier() { // from class: bmfc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m3.j(new dtsc() { // from class: bmfo
        });
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(4);
        m4.b("messages.sender_send_destination");
        m4.i(54040);
        m4.c(new Supplier() { // from class: bmgb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m4.j(new dtsc() { // from class: bmgn
        });
        m4.a();
        dtsb m5 = dtsd.m();
        m5.m(4);
        m5.b("messages.msisdn_receiving_rcs_message");
        m5.i(59340);
        m5.c(new Supplier() { // from class: blzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m5.j(new dtsc() { // from class: bmdx
        });
        m5.a();
        dtsb m6 = dtsd.m();
        m6.m(4);
        m6.b("messages.receiving_network_country");
        m6.i(54040);
        m6.c(new Supplier() { // from class: bmgt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m6.j(new dtsc() { // from class: bmhf
        });
        m6.a();
        dtsb m7 = dtsd.m();
        m7.m(1);
        m7.d(true);
        m7.b("messages.sent_timestamp");
        m7.i(-1);
        m7.c(new Supplier() { // from class: bmhr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m7.j(new dtsc() { // from class: bmid
        });
        m7.a();
        dtsb m8 = dtsd.m();
        m8.m(1);
        m8.b("messages.queue_insert_timestamp");
        m8.i(17030);
        m8.c(new Supplier() { // from class: bmip
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m8.j(new dtsc() { // from class: bmjb
        });
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(1);
        m9.d(true);
        m9.b("messages.received_timestamp");
        m9.i(-1);
        m9.c(new Supplier() { // from class: bmjn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m9.j(new dtsc() { // from class: blyv
        });
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(1);
        m10.b("messages.message_protocol");
        m10.i(-1);
        m10.c(new Supplier() { // from class: blzi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m10.j(new dtsc() { // from class: blzu
        });
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(1);
        m11.d(true);
        m11.b("messages.message_status");
        m11.i(-1);
        m11.c(new Supplier() { // from class: bmag
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m11.j(new dtsc() { // from class: bmas
        });
        m11.a();
        dtsb m12 = dtsd.m();
        m12.m(1);
        m12.b("messages.message_report_status");
        m12.i(13020);
        m12.c(new Supplier() { // from class: bmbe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m12.j(new dtsc() { // from class: bmbq
        });
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(1);
        m13.d(true);
        m13.b("messages.seen");
        m13.f(true);
        m13.i(-1);
        m13.c(new Supplier() { // from class: bmcc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m13.j(new dtsc() { // from class: bmco
        });
        m13.a();
        dtsb m14 = dtsd.m();
        m14.m(1);
        m14.d(true);
        m14.b("messages.read");
        m14.i(-1);
        m14.c(new Supplier() { // from class: bmdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m14.j(new dtsc() { // from class: bmdf
        });
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(4);
        m15.d(true);
        m15.b("messages.sms_message_uri");
        m15.i(-1);
        m15.c(new Supplier() { // from class: bmdh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m15.j(new dtsc() { // from class: bmdi
        });
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(1);
        m16.b("messages.sms_priority");
        m16.i(-1);
        m16.c(new Supplier() { // from class: bmdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m16.j(new dtsc() { // from class: bmdk
        });
        m16.a();
        dtsb m17 = dtsd.m();
        m17.m(1);
        m17.b("messages.sms_message_size");
        m17.i(-1);
        m17.c(new Supplier() { // from class: bmdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m17.j(new dtsc() { // from class: bmdn
        });
        m17.a();
        dtsb m18 = dtsd.m();
        m18.m(4);
        m18.b("messages.mms_subject");
        m18.i(-1);
        m18.c(new Supplier() { // from class: bmdo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m18.j(new dtsc() { // from class: bmdp
        });
        m18.a();
        dtsb m19 = dtsd.m();
        m19.m(4);
        m19.b("messages.mms_transaction_id");
        m19.i(-1);
        m19.c(new Supplier() { // from class: bmdq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m19.j(new dtsc() { // from class: bmdr
        });
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(4);
        m20.b("messages.mms_content_location");
        m20.i(-1);
        m20.c(new Supplier() { // from class: bmdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m20.j(new dtsc() { // from class: bmdu
        });
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(1);
        m21.b("messages.mms_expiry");
        m21.i(-1);
        m21.c(new Supplier() { // from class: bmdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m21.j(new dtsc() { // from class: bmdw
        });
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(1);
        m22.d(true);
        m22.b("messages.rcs_expiry");
        m22.i(59890);
        m22.c(new Supplier() { // from class: bmdy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m22.j(new dtsc() { // from class: bmdz
        });
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(4);
        m23.b("messages.mms_retrieve_text");
        m23.i(9030);
        m23.c(new Supplier() { // from class: bmea
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m23.j(new dtsc() { // from class: bmeb
        });
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(1);
        m24.b("messages.raw_status");
        m24.i(-1);
        m24.c(new Supplier() { // from class: bmec
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m24.j(new dtsc() { // from class: bmed
        });
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(1);
        m25.d(true);
        m25.e(true);
        m25.h(new Supplier() { // from class: bmef
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m25.b("messages.self_id");
        m25.i(-1);
        m25.c(new Supplier() { // from class: bmeg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m25.j(new dtsc() { // from class: bmeh
        });
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(4);
        m26.d(true);
        m26.b("messages.my_identity");
        m26.i(59810);
        m26.c(new Supplier() { // from class: bmej
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m26.j(new dtsc() { // from class: bmek
        });
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(4);
        m27.d(true);
        m27.e(true);
        m27.h(new Supplier() { // from class: bmel
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m27.b("messages.my_identity_foreign_key");
        m27.i(60160);
        m27.c(new Supplier() { // from class: bmem
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m27.j(new dtsc() { // from class: bmen
        });
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(1);
        m28.b("messages.retry_start_timestamp");
        m28.i(-1);
        m28.c(new Supplier() { // from class: bmeo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m28.j(new dtsc() { // from class: bmep
        });
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(4);
        m29.d(true);
        m29.b("messages.cloud_sync_id");
        m29.i(8500);
        m29.c(new Supplier() { // from class: bmer
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m29.j(new dtsc() { // from class: bmes
        });
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(7);
        m30.d(true);
        m30.b("messages.rcs_message_id");
        m30.f(true);
        m30.i(10000);
        m30.c(new Supplier() { // from class: bmeu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m30.j(new dtsc() { // from class: bmev
        });
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(4);
        m31.d(true);
        m31.b("messages.rcs_message_id_with_text_type");
        m31.f(true);
        m31.i(41040);
        m31.c(new Supplier() { // from class: bmew
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m31.j(new dtsc() { // from class: bmex
        });
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(1);
        m32.b("messages.etouffee_status");
        m32.i(29060);
        m32.c(new Supplier() { // from class: bmey
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m32.j(new dtsc() { // from class: bmez
        });
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(1);
        m33.b("messages.verification_status");
        m33.i(29090);
        m33.c(new Supplier() { // from class: bmfa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m33.j(new dtsc() { // from class: bmfb
        });
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(1);
        m34.b("messages.rcs_ui_status");
        m34.i(39000);
        m34.c(new Supplier() { // from class: bmfd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m34.j(new dtsc() { // from class: bmff
        });
        m34.a();
        dtsb m35 = dtsd.m();
        m35.m(1);
        m35.d(true);
        m35.b("messages.is_hidden");
        m35.i(30010);
        m35.c(new Supplier() { // from class: bmfg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m35.j(new dtsc() { // from class: bmfh
        });
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(7);
        m36.b("messages.rcs_remote_instance");
        m36.i(10002);
        m36.c(new Supplier() { // from class: bmfi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m36.j(new dtsc() { // from class: bmfj
        });
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(1);
        m37.b("messages.rcs_file_transfer_session_id");
        m37.i(10004);
        m37.c(new Supplier() { // from class: bmfk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m37.j(new dtsc() { // from class: bmfl
        });
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(1);
        m38.b("messages.sms_error_code");
        m38.i(9000);
        m38.c(new Supplier() { // from class: bmfm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m38.j(new dtsc() { // from class: bmfn
        });
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(4);
        m39.b("messages.sms_error_desc_map_name");
        m39.i(9000);
        m39.c(new Supplier() { // from class: bmfq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m39.j(new dtsc() { // from class: bmfr
        });
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(4);
        m40.b("messages.correlation_id");
        m40.i(9010);
        m40.c(new Supplier() { // from class: bmfs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m40.j(new dtsc() { // from class: bmft
        });
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(4);
        m41.l(true);
        m41.d(true);
        m41.b("messages.cms_id");
        m41.f(true);
        m41.i(31010);
        m41.c(new Supplier() { // from class: bmfu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m41.j(new dtsc() { // from class: bmfv
        });
        m41.a();
        dtsb m42 = dtsd.m();
        m42.m(2);
        m42.b("messages.cms_last_mod_seq");
        m42.i(37040);
        m42.c(new Supplier() { // from class: bmfw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m42.j(new dtsc() { // from class: bmfx
        });
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(4);
        m43.d(true);
        m43.b("messages.web_id");
        m43.i(19020);
        m43.c(new Supplier() { // from class: bmfy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m43.j(new dtsc() { // from class: bmfz
        });
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(1);
        m44.b("messages.usage_stats_logging_id");
        m44.i(29100);
        m44.c(new Supplier() { // from class: bmgc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m44.j(new dtsc() { // from class: bmgd
        });
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(1);
        m45.b("messages.send_counter");
        m45.i(35030);
        m45.c(new Supplier() { // from class: bmge
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m45.j(new dtsc() { // from class: bmgf
        });
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(4);
        m46.d(true);
        m46.b("messages.original_rcs_message_id");
        m46.i(35030);
        m46.c(new Supplier() { // from class: bmgg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m46.j(new dtsc() { // from class: bmgh
        });
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(4);
        m47.b("messages.custom_delivery_receipt_mime_type");
        m47.i(37020);
        m47.c(new Supplier() { // from class: bmgi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m47.j(new dtsc() { // from class: bmgj
        });
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(5);
        m48.b("messages.custom_delivery_receipt_content");
        m48.i(37020);
        m48.c(new Supplier() { // from class: bmgk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m48.j(new dtsc() { // from class: bmgm
        });
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(1);
        m49.b("messages.report_attempt_acounter");
        m49.i(37030);
        m49.c(new Supplier() { // from class: bmcq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m49.j(new dtsc() { // from class: bmgp
        });
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(5);
        m50.b("messages.custom_headers");
        m50.i(45020);
        m50.c(new Supplier() { // from class: bmha
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m50.j(new dtsc() { // from class: bmhl
        });
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(4);
        m51.l(true);
        m51.d(true);
        m51.b("messages.cms_correlation_id");
        m51.f(true);
        m51.i(46010);
        m51.c(new Supplier() { // from class: bmhw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m51.j(new dtsc() { // from class: bmih
        });
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(1);
        m52.d(true);
        m52.e(true);
        m52.h(new Supplier() { // from class: bmis
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m52.b("messages.group_private_participant");
        m52.i(48030);
        m52.c(new Supplier() { // from class: bmjd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m52.j(new dtsc() { // from class: bmjo
        });
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(1);
        m53.d(true);
        m53.e(true);
        m53.h(new Supplier() { // from class: blyu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m53.b("messages.original_message_id");
        m53.i(48030);
        m53.c(new Supplier() { // from class: blzq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m53.j(new dtsc() { // from class: bmab
        });
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(1);
        m54.b("messages.awaiting_reverse_sync");
        m54.i(49060);
        m54.c(new Supplier() { // from class: bmam
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m54.j(new dtsc() { // from class: bmax
        });
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(4);
        m55.b("messages.old_sms_message_uri");
        m55.i(49060);
        m55.c(new Supplier() { // from class: bmbi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m55.j(new dtsc() { // from class: bmbt
        });
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(4);
        m56.l(true);
        m56.d(true);
        m56.b("messages.draft_id");
        m56.f(true);
        m56.i(56000);
        m56.c(new Supplier() { // from class: bmce
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m56.j(new dtsc() { // from class: bmcp
        });
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(1);
        m57.b("messages.result_code");
        m57.i(58040);
        m57.c(new Supplier() { // from class: bmdb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m57.j(new dtsc() { // from class: bmdm
        });
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(1);
        m58.b("messages.cms_life_cycle");
        m58.i(58210);
        m58.c(new Supplier() { // from class: bmei
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m58.j(new dtsc() { // from class: bmet
        });
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(1);
        m59.b("messages.mute_priority");
        m59.i(60750);
        m59.c(new Supplier() { // from class: bmfe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m59.j(new dtsc() { // from class: bmfp
        });
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(1);
        m60.b("messages.fallback_reason");
        m60.i(58710);
        m60.c(new Supplier() { // from class: bmga
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m60.j(new dtsc() { // from class: bmgl
        });
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(1);
        m61.b("messages.auto_retry_counter");
        m61.i(58230);
        m61.c(new Supplier() { // from class: bmgo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m61.j(new dtsc() { // from class: bmgq
        });
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(2);
        m62.b("messages.can_revoke_before_delivered_with_rcs");
        m62.i(58280);
        m62.c(new Supplier() { // from class: bmgr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m62.j(new dtsc() { // from class: bmgs
        });
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(5);
        m63.b("messages.trace_id");
        m63.i(58680);
        m63.c(new Supplier() { // from class: bmgu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m63.j(new dtsc() { // from class: bmgv
        });
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(1);
        m64.b("messages.outgoing_delivery_report_status");
        m64.i(58720);
        m64.c(new Supplier() { // from class: bmgw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m64.j(new dtsc() { // from class: bmgx
        });
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(1);
        m65.b("messages.outgoing_read_report_status");
        m65.i(58720);
        m65.c(new Supplier() { // from class: bmgy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m65.j(new dtsc() { // from class: bmgz
        });
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(1);
        m66.b("messages.xms_transport");
        m66.i(59310);
        m66.c(new Supplier() { // from class: bmhb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m66.j(new dtsc() { // from class: bmhc
        });
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(1);
        m67.b("messages.message_original_protocol");
        m67.i(59430);
        m67.c(new Supplier() { // from class: bmhd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m67.j(new dtsc() { // from class: bmhe
        });
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(4);
        m68.l(true);
        m68.d(true);
        m68.b("messages.satellite_datagram_id");
        m68.f(true);
        m68.i(59490);
        m68.c(new Supplier() { // from class: bmhg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m68.j(new dtsc() { // from class: bmhh
        });
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(1);
        m69.b("messages.encryption_protocol");
        m69.i(60190);
        m69.c(new Supplier() { // from class: bmhi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m69.j(new dtsc() { // from class: bmhj
        });
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(4);
        m70.l(true);
        m70.d(true);
        m70.b("messages.message_persistence_id");
        m70.f(true);
        m70.i(60370);
        m70.c(new Supplier() { // from class: bmhk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m70.j(new dtsc() { // from class: bmhm
        });
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(2);
        m71.l(true);
        m71.g(true);
        m71.d(true);
        m71.b("b._id");
        m71.i(-1);
        m71.c(new Supplier() { // from class: bmhn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m71.j(new dtsc() { // from class: bmho
        });
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(1);
        m72.d(true);
        m72.e(true);
        m72.h(new Supplier() { // from class: bmhp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m72.b("b.conversation_id");
        m72.i(-1);
        m72.c(new Supplier() { // from class: bmhq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m72.j(new dtsc() { // from class: bmhs
        });
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(1);
        m73.d(true);
        m73.e(true);
        m73.h(new Supplier() { // from class: bmht
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m73.b("b.sender_id");
        m73.i(-1);
        m73.c(new Supplier() { // from class: bmhu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m73.j(new dtsc() { // from class: bmhv
        });
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(4);
        m74.b("b.sender_send_destination");
        m74.i(54040);
        m74.c(new Supplier() { // from class: bmhx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m74.j(new dtsc() { // from class: bmhy
        });
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(4);
        m75.b("b.msisdn_receiving_rcs_message");
        m75.i(59340);
        m75.c(new Supplier() { // from class: bmhz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m75.j(new dtsc() { // from class: bmia
        });
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(4);
        m76.b("b.receiving_network_country");
        m76.i(54040);
        m76.c(new Supplier() { // from class: bmib
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m76.j(new dtsc() { // from class: bmic
        });
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(1);
        m77.d(true);
        m77.b("b.sent_timestamp");
        m77.i(-1);
        m77.c(new Supplier() { // from class: bmie
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m77.j(new dtsc() { // from class: bmif
        });
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(1);
        m78.b("b.queue_insert_timestamp");
        m78.i(17030);
        m78.c(new Supplier() { // from class: bmig
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m78.j(new dtsc() { // from class: bmii
        });
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(1);
        m79.d(true);
        m79.b("b.received_timestamp");
        m79.i(-1);
        m79.c(new Supplier() { // from class: bmij
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m79.j(new dtsc() { // from class: bmik
        });
        m79.a();
        dtsb m80 = dtsd.m();
        m80.m(1);
        m80.b("b.message_protocol");
        m80.i(-1);
        m80.c(new Supplier() { // from class: bmil
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m80.j(new dtsc() { // from class: bmim
        });
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(1);
        m81.d(true);
        m81.b("b.message_status");
        m81.i(-1);
        m81.c(new Supplier() { // from class: bmin
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m81.j(new dtsc() { // from class: bmio
        });
        m81.a();
        dtsb m82 = dtsd.m();
        m82.m(1);
        m82.b("b.message_report_status");
        m82.i(13020);
        m82.c(new Supplier() { // from class: bmiq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m82.j(new dtsc() { // from class: bmir
        });
        m82.a();
        dtsb m83 = dtsd.m();
        m83.m(1);
        m83.d(true);
        m83.b("b.seen");
        m83.f(true);
        m83.i(-1);
        m83.c(new Supplier() { // from class: bmit
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m83.j(new dtsc() { // from class: bmiu
        });
        m83.a();
        dtsb m84 = dtsd.m();
        m84.m(1);
        m84.d(true);
        m84.b("b.read");
        m84.i(-1);
        m84.c(new Supplier() { // from class: bmiv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m84.j(new dtsc() { // from class: bmiw
        });
        m84.a();
        dtsb m85 = dtsd.m();
        m85.m(4);
        m85.d(true);
        m85.b("b.sms_message_uri");
        m85.i(-1);
        m85.c(new Supplier() { // from class: bmix
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m85.j(new dtsc() { // from class: bmiy
        });
        m85.a();
        dtsb m86 = dtsd.m();
        m86.m(1);
        m86.b("b.sms_priority");
        m86.i(-1);
        m86.c(new Supplier() { // from class: bmiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m86.j(new dtsc() { // from class: bmja
        });
        m86.a();
        dtsb m87 = dtsd.m();
        m87.m(1);
        m87.b("b.sms_message_size");
        m87.i(-1);
        m87.c(new Supplier() { // from class: bmjc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m87.j(new dtsc() { // from class: bmje
        });
        m87.a();
        dtsb m88 = dtsd.m();
        m88.m(4);
        m88.b("b.mms_subject");
        m88.i(-1);
        m88.c(new Supplier() { // from class: bmjf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m88.j(new dtsc() { // from class: bmjg
        });
        m88.a();
        dtsb m89 = dtsd.m();
        m89.m(4);
        m89.b("b.mms_transaction_id");
        m89.i(-1);
        m89.c(new Supplier() { // from class: bmjh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m89.j(new dtsc() { // from class: bmji
        });
        m89.a();
        dtsb m90 = dtsd.m();
        m90.m(4);
        m90.b("b.mms_content_location");
        m90.i(-1);
        m90.c(new Supplier() { // from class: bmjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m90.j(new dtsc() { // from class: bmjk
        });
        m90.a();
        dtsb m91 = dtsd.m();
        m91.m(1);
        m91.b("b.mms_expiry");
        m91.i(-1);
        m91.c(new Supplier() { // from class: bmjl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m91.j(new dtsc() { // from class: bmjm
        });
        m91.a();
        dtsb m92 = dtsd.m();
        m92.m(1);
        m92.d(true);
        m92.b("b.rcs_expiry");
        m92.i(59890);
        m92.c(new Supplier() { // from class: blyk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m92.j(new dtsc() { // from class: blyl
        });
        m92.a();
        dtsb m93 = dtsd.m();
        m93.m(4);
        m93.b("b.mms_retrieve_text");
        m93.i(9030);
        m93.c(new Supplier() { // from class: blym
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m93.j(new dtsc() { // from class: blyn
        });
        m93.a();
        dtsb m94 = dtsd.m();
        m94.m(1);
        m94.b("b.raw_status");
        m94.i(-1);
        m94.c(new Supplier() { // from class: blyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m94.j(new dtsc() { // from class: blyp
        });
        m94.a();
        dtsb m95 = dtsd.m();
        m95.m(1);
        m95.d(true);
        m95.e(true);
        m95.h(new Supplier() { // from class: blyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m95.b("b.self_id");
        m95.i(-1);
        m95.c(new Supplier() { // from class: blyr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m95.j(new dtsc() { // from class: blys
        });
        m95.a();
        dtsb m96 = dtsd.m();
        m96.m(4);
        m96.d(true);
        m96.b("b.my_identity");
        m96.i(59810);
        m96.c(new Supplier() { // from class: blyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m96.j(new dtsc() { // from class: blyx
        });
        m96.a();
        dtsb m97 = dtsd.m();
        m97.m(4);
        m97.d(true);
        m97.e(true);
        m97.h(new Supplier() { // from class: blyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m97.b("b.my_identity_foreign_key");
        m97.i(60160);
        m97.c(new Supplier() { // from class: blyz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m97.j(new dtsc() { // from class: blza
        });
        m97.a();
        dtsb m98 = dtsd.m();
        m98.m(1);
        m98.b("b.retry_start_timestamp");
        m98.i(-1);
        m98.c(new Supplier() { // from class: blzb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m98.j(new dtsc() { // from class: blzc
        });
        m98.a();
        dtsb m99 = dtsd.m();
        m99.m(4);
        m99.d(true);
        m99.b("b.cloud_sync_id");
        m99.i(8500);
        m99.c(new Supplier() { // from class: blzd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m99.j(new dtsc() { // from class: blze
        });
        m99.a();
        dtsb m100 = dtsd.m();
        m100.m(7);
        m100.d(true);
        m100.b("b.rcs_message_id");
        m100.f(true);
        m100.i(10000);
        m100.c(new Supplier() { // from class: blzg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m100.j(new dtsc() { // from class: blzh
        });
        m100.a();
        dtsb m101 = dtsd.m();
        m101.m(4);
        m101.d(true);
        m101.b("b.rcs_message_id_with_text_type");
        m101.f(true);
        m101.i(41040);
        m101.c(new Supplier() { // from class: blzj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m101.j(new dtsc() { // from class: blzk
        });
        m101.a();
        dtsb m102 = dtsd.m();
        m102.m(1);
        m102.b("b.etouffee_status");
        m102.i(29060);
        m102.c(new Supplier() { // from class: blzl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m102.j(new dtsc() { // from class: blzm
        });
        m102.a();
        dtsb m103 = dtsd.m();
        m103.m(1);
        m103.b("b.verification_status");
        m103.i(29090);
        m103.c(new Supplier() { // from class: blzn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m103.j(new dtsc() { // from class: blzo
        });
        m103.a();
        dtsb m104 = dtsd.m();
        m104.m(1);
        m104.b("b.rcs_ui_status");
        m104.i(39000);
        m104.c(new Supplier() { // from class: blzp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m104.j(new dtsc() { // from class: blzr
        });
        m104.a();
        dtsb m105 = dtsd.m();
        m105.m(1);
        m105.d(true);
        m105.b("b.is_hidden");
        m105.i(30010);
        m105.c(new Supplier() { // from class: blzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m105.j(new dtsc() { // from class: blzt
        });
        m105.a();
        dtsb m106 = dtsd.m();
        m106.m(7);
        m106.b("b.rcs_remote_instance");
        m106.i(10002);
        m106.c(new Supplier() { // from class: blzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m106.j(new dtsc() { // from class: blzw
        });
        m106.a();
        dtsb m107 = dtsd.m();
        m107.m(1);
        m107.b("b.rcs_file_transfer_session_id");
        m107.i(10004);
        m107.c(new Supplier() { // from class: blzx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m107.j(new dtsc() { // from class: blzy
        });
        m107.a();
        dtsb m108 = dtsd.m();
        m108.m(1);
        m108.b("b.sms_error_code");
        m108.i(9000);
        m108.c(new Supplier() { // from class: blzz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m108.j(new dtsc() { // from class: bmaa
        });
        m108.a();
        dtsb m109 = dtsd.m();
        m109.m(4);
        m109.b("b.sms_error_desc_map_name");
        m109.i(9000);
        m109.c(new Supplier() { // from class: bmac
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m109.j(new dtsc() { // from class: bmad
        });
        m109.a();
        dtsb m110 = dtsd.m();
        m110.m(4);
        m110.b("b.correlation_id");
        m110.i(9010);
        m110.c(new Supplier() { // from class: bmae
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m110.j(new dtsc() { // from class: bmaf
        });
        m110.a();
        dtsb m111 = dtsd.m();
        m111.m(4);
        m111.l(true);
        m111.d(true);
        m111.b("b.cms_id");
        m111.f(true);
        m111.i(31010);
        m111.c(new Supplier() { // from class: bmah
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m111.j(new dtsc() { // from class: bmai
        });
        m111.a();
        dtsb m112 = dtsd.m();
        m112.m(2);
        m112.b("b.cms_last_mod_seq");
        m112.i(37040);
        m112.c(new Supplier() { // from class: bmaj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m112.j(new dtsc() { // from class: bmak
        });
        m112.a();
        dtsb m113 = dtsd.m();
        m113.m(4);
        m113.d(true);
        m113.b("b.web_id");
        m113.i(19020);
        m113.c(new Supplier() { // from class: bmal
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m113.j(new dtsc() { // from class: bman
        });
        m113.a();
        dtsb m114 = dtsd.m();
        m114.m(1);
        m114.b("b.usage_stats_logging_id");
        m114.i(29100);
        m114.c(new Supplier() { // from class: bmao
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m114.j(new dtsc() { // from class: bmap
        });
        m114.a();
        dtsb m115 = dtsd.m();
        m115.m(1);
        m115.b("b.send_counter");
        m115.i(35030);
        m115.c(new Supplier() { // from class: bmaq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m115.j(new dtsc() { // from class: bmar
        });
        m115.a();
        dtsb m116 = dtsd.m();
        m116.m(4);
        m116.d(true);
        m116.b("b.original_rcs_message_id");
        m116.i(35030);
        m116.c(new Supplier() { // from class: bmat
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m116.j(new dtsc() { // from class: bmau
        });
        m116.a();
        dtsb m117 = dtsd.m();
        m117.m(4);
        m117.b("b.custom_delivery_receipt_mime_type");
        m117.i(37020);
        m117.c(new Supplier() { // from class: bmav
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m117.j(new dtsc() { // from class: bmaw
        });
        m117.a();
        dtsb m118 = dtsd.m();
        m118.m(5);
        m118.b("b.custom_delivery_receipt_content");
        m118.i(37020);
        m118.c(new Supplier() { // from class: bmay
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m118.j(new dtsc() { // from class: bmaz
        });
        m118.a();
        dtsb m119 = dtsd.m();
        m119.m(1);
        m119.b("b.report_attempt_acounter");
        m119.i(37030);
        m119.c(new Supplier() { // from class: bmba
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m119.j(new dtsc() { // from class: bmbb
        });
        m119.a();
        dtsb m120 = dtsd.m();
        m120.m(5);
        m120.b("b.custom_headers");
        m120.i(45020);
        m120.c(new Supplier() { // from class: bmbc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m120.j(new dtsc() { // from class: bmbd
        });
        m120.a();
        dtsb m121 = dtsd.m();
        m121.m(4);
        m121.l(true);
        m121.d(true);
        m121.b("b.cms_correlation_id");
        m121.f(true);
        m121.i(46010);
        m121.c(new Supplier() { // from class: bmbf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m121.j(new dtsc() { // from class: bmbg
        });
        m121.a();
        dtsb m122 = dtsd.m();
        m122.m(1);
        m122.d(true);
        m122.e(true);
        m122.h(new Supplier() { // from class: bmbh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m122.b("b.group_private_participant");
        m122.i(48030);
        m122.c(new Supplier() { // from class: bmbj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m122.j(new dtsc() { // from class: bmbk
        });
        m122.a();
        dtsb m123 = dtsd.m();
        m123.m(1);
        m123.d(true);
        m123.e(true);
        m123.h(new Supplier() { // from class: bmbl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m123.b("b.original_message_id");
        m123.i(48030);
        m123.c(new Supplier() { // from class: bmbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m123.j(new dtsc() { // from class: bmbn
        });
        m123.a();
        dtsb m124 = dtsd.m();
        m124.m(1);
        m124.b("b.awaiting_reverse_sync");
        m124.i(49060);
        m124.c(new Supplier() { // from class: bmbo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m124.j(new dtsc() { // from class: bmbp
        });
        m124.a();
        dtsb m125 = dtsd.m();
        m125.m(4);
        m125.b("b.old_sms_message_uri");
        m125.i(49060);
        m125.c(new Supplier() { // from class: bmbr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m125.j(new dtsc() { // from class: bmbs
        });
        m125.a();
        dtsb m126 = dtsd.m();
        m126.m(4);
        m126.l(true);
        m126.d(true);
        m126.b("b.draft_id");
        m126.f(true);
        m126.i(56000);
        m126.c(new Supplier() { // from class: bmbu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m126.j(new dtsc() { // from class: bmbv
        });
        m126.a();
        dtsb m127 = dtsd.m();
        m127.m(1);
        m127.b("b.result_code");
        m127.i(58040);
        m127.c(new Supplier() { // from class: bmbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m127.j(new dtsc() { // from class: bmbx
        });
        m127.a();
        dtsb m128 = dtsd.m();
        m128.m(1);
        m128.b("b.cms_life_cycle");
        m128.i(58210);
        m128.c(new Supplier() { // from class: bmby
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m128.j(new dtsc() { // from class: bmbz
        });
        m128.a();
        dtsb m129 = dtsd.m();
        m129.m(1);
        m129.b("b.mute_priority");
        m129.i(60750);
        m129.c(new Supplier() { // from class: bmca
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m129.j(new dtsc() { // from class: bmcb
        });
        m129.a();
        dtsb m130 = dtsd.m();
        m130.m(1);
        m130.b("b.fallback_reason");
        m130.i(58710);
        m130.c(new Supplier() { // from class: bmcd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m130.j(new dtsc() { // from class: bmcf
        });
        m130.a();
        dtsb m131 = dtsd.m();
        m131.m(1);
        m131.b("b.auto_retry_counter");
        m131.i(58230);
        m131.c(new Supplier() { // from class: bmcg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m131.j(new dtsc() { // from class: bmch
        });
        m131.a();
        dtsb m132 = dtsd.m();
        m132.m(2);
        m132.b("b.can_revoke_before_delivered_with_rcs");
        m132.i(58280);
        m132.c(new Supplier() { // from class: bmci
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m132.j(new dtsc() { // from class: bmcj
        });
        m132.a();
        dtsb m133 = dtsd.m();
        m133.m(5);
        m133.b("b.trace_id");
        m133.i(58680);
        m133.c(new Supplier() { // from class: bmck
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m133.j(new dtsc() { // from class: bmcl
        });
        m133.a();
        dtsb m134 = dtsd.m();
        m134.m(1);
        m134.b("b.outgoing_delivery_report_status");
        m134.i(58720);
        m134.c(new Supplier() { // from class: bmcm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m134.j(new dtsc() { // from class: bmcn
        });
        m134.a();
        dtsb m135 = dtsd.m();
        m135.m(1);
        m135.b("b.outgoing_read_report_status");
        m135.i(58720);
        m135.c(new Supplier() { // from class: bmcr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m135.j(new dtsc() { // from class: bmcs
        });
        m135.a();
        dtsb m136 = dtsd.m();
        m136.m(1);
        m136.b("b.xms_transport");
        m136.i(59310);
        m136.c(new Supplier() { // from class: bmct
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m136.j(new dtsc() { // from class: bmcu
        });
        m136.a();
        dtsb m137 = dtsd.m();
        m137.m(1);
        m137.b("b.message_original_protocol");
        m137.i(59430);
        m137.c(new Supplier() { // from class: bmcv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m137.j(new dtsc() { // from class: bmcw
        });
        m137.a();
        dtsb m138 = dtsd.m();
        m138.m(4);
        m138.l(true);
        m138.d(true);
        m138.b("b.satellite_datagram_id");
        m138.f(true);
        m138.i(59490);
        m138.c(new Supplier() { // from class: bmcx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m138.j(new dtsc() { // from class: bmcy
        });
        m138.a();
        dtsb m139 = dtsd.m();
        m139.m(1);
        m139.b("b.encryption_protocol");
        m139.i(60190);
        m139.c(new Supplier() { // from class: bmcz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m139.j(new dtsc() { // from class: bmda
        });
        m139.a();
        dtsb m140 = dtsd.m();
        m140.m(4);
        m140.l(true);
        m140.d(true);
        m140.b("b.message_persistence_id");
        m140.f(true);
        m140.i(60370);
        m140.c(new Supplier() { // from class: bmdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmju.a();
            }
        });
        m140.j(new dtsc() { // from class: bmde
        });
        m140.a();
    }

    public static dtve a() {
        return dtub.e("$primary");
    }
}

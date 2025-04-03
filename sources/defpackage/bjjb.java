package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjjb {
    public final bjjc a;
    public final bjjc b;
    public final bjjc c;
    public final bjjc d;
    public final bjjc e;
    public final bjjc f;
    public final bjjc g;
    public final bjjc h;
    public final bjjc i;
    public final bjjc j;
    public final bjjc k;
    public final bjjc l;
    public final bjjc m;
    public final bjjc n;

    public bjjb() {
        dtsb m = dtsd.m();
        m.m(2);
        m.l(true);
        m.g(true);
        m.d(true);
        m.b("messages._id");
        m.i(-1);
        m.c(new Supplier() { // from class: bigp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m.j(new dtsc() { // from class: bihc
        });
        this.a = new bjjc(m.a());
        dtsb m2 = dtsd.m();
        m2.m(1);
        m2.d(true);
        m2.e(true);
        m2.h(new Supplier() { // from class: bilv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m2.b("messages.conversation_id");
        m2.i(-1);
        m2.c(new Supplier() { // from class: biqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m2.j(new dtsc() { // from class: bivh
        });
        this.b = new bjjc(m2.a());
        dtsb m3 = dtsd.m();
        m3.m(1);
        m3.d(true);
        m3.e(true);
        m3.h(new Supplier() { // from class: bjaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m3.b("messages.sender_id");
        m3.i(-1);
        m3.c(new Supplier() { // from class: bjet
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m3.j(new dtsc() { // from class: bjgy
        });
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(1);
        m4.d(true);
        m4.b("messages.sent_timestamp");
        m4.i(-1);
        m4.c(new Supplier() { // from class: bjhk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m4.j(new dtsc() { // from class: bjhw
        });
        this.c = new bjjc(m4.a());
        dtsb m5 = dtsd.m();
        m5.m(1);
        m5.d(true);
        m5.b("messages.received_timestamp");
        m5.i(-1);
        m5.c(new Supplier() { // from class: bihl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m5.j(new dtsc() { // from class: bimd
        });
        this.d = new bjjc(m5.a());
        dtsb m6 = dtsd.m();
        m6.m(1);
        m6.b("messages.message_protocol");
        m6.i(-1);
        m6.c(new Supplier() { // from class: biqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m6.j(new dtsc() { // from class: bivn
        });
        this.e = new bjjc(m6.a());
        dtsb m7 = dtsd.m();
        m7.m(1);
        m7.d(true);
        m7.b("messages.message_status");
        m7.i(-1);
        m7.c(new Supplier() { // from class: bjaf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m7.j(new dtsc() { // from class: bjex
        });
        this.f = new bjjc(m7.a());
        dtsb m8 = dtsd.m();
        m8.m(1);
        m8.b("messages.message_report_status");
        m8.i(13020);
        m8.c(new Supplier() { // from class: bjib
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m8.j(new dtsc() { // from class: bjin
        });
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(1);
        m9.d(true);
        m9.b("messages.seen");
        m9.f(true);
        m9.i(-1);
        m9.c(new Supplier() { // from class: bjiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m9.j(new dtsc() { // from class: bihb
        });
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(1);
        m10.d(true);
        m10.b("messages.read");
        m10.i(-1);
        m10.c(new Supplier() { // from class: biho
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m10.j(new dtsc() { // from class: biia
        });
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(4);
        m11.d(true);
        m11.b("messages.sms_message_uri");
        m11.i(-1);
        m11.c(new Supplier() { // from class: biim
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m11.j(new dtsc() { // from class: biiy
        });
        this.g = new bjjc(m11.a());
        dtsb m12 = dtsd.m();
        m12.m(1);
        m12.b("messages.sms_priority");
        m12.i(-1);
        m12.c(new Supplier() { // from class: bijk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m12.j(new dtsc() { // from class: bijw
        });
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(1);
        m13.b("messages.sms_message_size");
        m13.i(-1);
        m13.c(new Supplier() { // from class: biki
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m13.j(new dtsc() { // from class: biku
        });
        m13.a();
        dtsb m14 = dtsd.m();
        m14.m(4);
        m14.b("messages.mms_subject");
        m14.i(-1);
        m14.c(new Supplier() { // from class: bili
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m14.j(new dtsc() { // from class: bilu
        });
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(1);
        m15.b("messages.mms_expiry");
        m15.i(-1);
        m15.c(new Supplier() { // from class: bimh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m15.j(new dtsc() { // from class: bimt
        });
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(1);
        m16.d(true);
        m16.b("messages.rcs_expiry");
        m16.i(59890);
        m16.c(new Supplier() { // from class: binf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m16.j(new dtsc() { // from class: binr
        });
        m16.a();
        dtsb m17 = dtsd.m();
        m17.m(4);
        m17.b("messages.mms_retrieve_text");
        m17.i(9030);
        m17.c(new Supplier() { // from class: biod
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m17.j(new dtsc() { // from class: biop
        });
        this.h = new bjjc(m17.a());
        dtsb m18 = dtsd.m();
        m18.m(1);
        m18.b("messages.raw_status");
        m18.i(-1);
        m18.c(new Supplier() { // from class: bipb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m18.j(new dtsc() { // from class: bipp
        });
        this.i = new bjjc(m18.a());
        dtsb m19 = dtsd.m();
        m19.m(1);
        m19.d(true);
        m19.e(true);
        m19.h(new Supplier() { // from class: biqb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m19.b("messages.self_id");
        m19.i(-1);
        m19.c(new Supplier() { // from class: biqn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m19.j(new dtsc() { // from class: bira
        });
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(4);
        m20.d(true);
        m20.b("messages.rcs_message_id_with_text_type");
        m20.f(true);
        m20.i(41040);
        m20.c(new Supplier() { // from class: birm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m20.j(new dtsc() { // from class: biry
        });
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(1);
        m21.b("messages.etouffee_status");
        m21.i(29060);
        m21.c(new Supplier() { // from class: bisk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m21.j(new dtsc() { // from class: bisw
        });
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(1);
        m22.b("messages.verification_status");
        m22.i(29090);
        m22.c(new Supplier() { // from class: biti
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m22.j(new dtsc() { // from class: bitw
        });
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(1);
        m23.d(true);
        m23.b("messages.is_hidden");
        m23.i(30010);
        m23.c(new Supplier() { // from class: biui
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m23.j(new dtsc() { // from class: biuu
        });
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(1);
        m24.b("messages.rcs_file_transfer_session_id");
        m24.i(10004);
        m24.c(new Supplier() { // from class: bivg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m24.j(new dtsc() { // from class: bivt
        });
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(1);
        m25.b("messages.sms_error_code");
        m25.i(9000);
        m25.c(new Supplier() { // from class: biwf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m25.j(new dtsc() { // from class: biwr
        });
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(4);
        m26.b("messages.sms_error_desc_map_name");
        m26.i(9000);
        m26.c(new Supplier() { // from class: bixd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m26.j(new dtsc() { // from class: bixp
        });
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(4);
        m27.l(true);
        m27.d(true);
        m27.b("messages.cms_id");
        m27.f(true);
        m27.i(31010);
        m27.c(new Supplier() { // from class: biyd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m27.j(new dtsc() { // from class: biyp
        });
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(4);
        m28.d(true);
        m28.b("messages.web_id");
        m28.i(19020);
        m28.c(new Supplier() { // from class: bizb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m28.j(new dtsc() { // from class: bizn
        });
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(1);
        m29.b("messages.usage_stats_logging_id");
        m29.i(29100);
        m29.c(new Supplier() { // from class: bizz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m29.j(new dtsc() { // from class: bjam
        });
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(4);
        m30.d(true);
        m30.b("messages.original_rcs_message_id");
        m30.i(35030);
        m30.c(new Supplier() { // from class: bjay
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m30.j(new dtsc() { // from class: bjbk
        });
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(1);
        m31.b("messages.result_code");
        m31.i(58040);
        m31.c(new Supplier() { // from class: bjbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m31.j(new dtsc() { // from class: bjck
        });
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(1);
        m32.b("messages.cms_life_cycle");
        m32.i(58210);
        m32.c(new Supplier() { // from class: bjcw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m32.j(new dtsc() { // from class: bjdi
        });
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(1);
        m33.b("messages.fallback_reason");
        m33.i(58710);
        m33.c(new Supplier() { // from class: bjdu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m33.j(new dtsc() { // from class: bjeg
        });
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(5);
        m34.b("messages.trace_id");
        m34.i(58680);
        m34.c(new Supplier() { // from class: bjes
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m34.j(new dtsc() { // from class: bjff
        });
        m34.a();
        dtsb m35 = dtsd.m();
        m35.m(1);
        m35.b("messages.xms_transport");
        m35.i(59310);
        m35.c(new Supplier() { // from class: bjfr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m35.j(new dtsc() { // from class: bjgd
        });
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(4);
        m36.b("messages.sender_send_destination");
        m36.i(54040);
        m36.c(new Supplier() { // from class: bjgr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m36.j(new dtsc() { // from class: bjgs
        });
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(4);
        m37.b("messages.msisdn_receiving_rcs_message");
        m37.i(59340);
        m37.c(new Supplier() { // from class: bjgt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m37.j(new dtsc() { // from class: bjgu
        });
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(4);
        m38.b("messages.receiving_network_country");
        m38.i(54040);
        m38.c(new Supplier() { // from class: bjgv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m38.j(new dtsc() { // from class: bjgw
        });
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(1);
        m39.b("messages.queue_insert_timestamp");
        m39.i(17030);
        m39.c(new Supplier() { // from class: bjgx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m39.j(new dtsc() { // from class: bjgz
        });
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(4);
        m40.b("messages.mms_transaction_id");
        m40.i(-1);
        m40.c(new Supplier() { // from class: bjha
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m40.j(new dtsc() { // from class: bjhc
        });
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(4);
        m41.b("messages.mms_content_location");
        m41.i(-1);
        m41.c(new Supplier() { // from class: bjhd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m41.j(new dtsc() { // from class: bjhe
        });
        this.j = new bjjc(m41.a());
        dtsb m42 = dtsd.m();
        m42.m(4);
        m42.d(true);
        m42.b("messages.my_identity");
        m42.i(59810);
        m42.c(new Supplier() { // from class: bjhf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m42.j(new dtsc() { // from class: bjhg
        });
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(4);
        m43.d(true);
        m43.e(true);
        m43.h(new Supplier() { // from class: bjhh
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m43.b("messages.my_identity_foreign_key");
        m43.i(60160);
        m43.c(new Supplier() { // from class: bjhi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m43.j(new dtsc() { // from class: bjhj
        });
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(1);
        m44.b("messages.retry_start_timestamp");
        m44.i(-1);
        m44.c(new Supplier() { // from class: bjhl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m44.j(new dtsc() { // from class: bjhn
        });
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(4);
        m45.d(true);
        m45.b("messages.cloud_sync_id");
        m45.i(8500);
        m45.c(new Supplier() { // from class: bjho
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m45.j(new dtsc() { // from class: bjhp
        });
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(7);
        m46.d(true);
        m46.b("messages.rcs_message_id");
        m46.f(true);
        m46.i(10000);
        m46.c(new Supplier() { // from class: bjhq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m46.j(new dtsc() { // from class: bjhr
        });
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(1);
        m47.b("messages.rcs_ui_status");
        m47.i(39000);
        m47.c(new Supplier() { // from class: bjhs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m47.j(new dtsc() { // from class: bjht
        });
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(7);
        m48.b("messages.rcs_remote_instance");
        m48.i(10002);
        m48.c(new Supplier() { // from class: bjhu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m48.j(new dtsc() { // from class: bjhv
        });
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(4);
        m49.b("messages.correlation_id");
        m49.i(9010);
        m49.c(new Supplier() { // from class: bikw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m49.j(new dtsc() { // from class: bipd
        });
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(2);
        m50.b("messages.cms_last_mod_seq");
        m50.i(37040);
        m50.c(new Supplier() { // from class: bitk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m50.j(new dtsc() { // from class: bixr
        });
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(1);
        m51.b("messages.send_counter");
        m51.i(35030);
        m51.c(new Supplier() { // from class: bjby
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m51.j(new dtsc() { // from class: bjgf
        });
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(4);
        m52.b("messages.custom_delivery_receipt_mime_type");
        m52.i(37020);
        m52.c(new Supplier() { // from class: bjie
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m52.j(new dtsc() { // from class: bjip
        });
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(5);
        m53.b("messages.custom_delivery_receipt_content");
        m53.i(37020);
        m53.c(new Supplier() { // from class: bjja
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m53.j(new dtsc() { // from class: biha
        });
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(1);
        m54.b("messages.report_attempt_acounter");
        m54.i(37030);
        m54.c(new Supplier() { // from class: bihw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m54.j(new dtsc() { // from class: biih
        });
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(5);
        m55.b("messages.custom_headers");
        m55.i(45020);
        m55.c(new Supplier() { // from class: biis
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m55.j(new dtsc() { // from class: bijd
        });
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(4);
        m56.l(true);
        m56.d(true);
        m56.b("messages.cms_correlation_id");
        m56.f(true);
        m56.i(46010);
        m56.c(new Supplier() { // from class: bijo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m56.j(new dtsc() { // from class: bijz
        });
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(1);
        m57.d(true);
        m57.e(true);
        m57.h(new Supplier() { // from class: bikk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m57.b("messages.group_private_participant");
        m57.i(48030);
        m57.c(new Supplier() { // from class: bikv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m57.j(new dtsc() { // from class: bilh
        });
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(1);
        m58.d(true);
        m58.e(true);
        m58.h(new Supplier() { // from class: bils
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m58.b("messages.original_message_id");
        m58.i(48030);
        m58.c(new Supplier() { // from class: bimo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m58.j(new dtsc() { // from class: bimz
        });
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(1);
        m59.b("messages.awaiting_reverse_sync");
        m59.i(49060);
        m59.c(new Supplier() { // from class: bink
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m59.j(new dtsc() { // from class: binv
        });
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(4);
        m60.b("messages.old_sms_message_uri");
        m60.i(49060);
        m60.c(new Supplier() { // from class: biog
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m60.j(new dtsc() { // from class: bior
        });
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(4);
        m61.l(true);
        m61.d(true);
        m61.b("messages.draft_id");
        m61.f(true);
        m61.i(56000);
        m61.c(new Supplier() { // from class: bipc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m61.j(new dtsc() { // from class: bipo
        });
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(1);
        m62.b("messages.mute_priority");
        m62.i(60750);
        m62.c(new Supplier() { // from class: bipz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m62.j(new dtsc() { // from class: biqk
        });
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(1);
        m63.b("messages.auto_retry_counter");
        m63.i(58230);
        m63.c(new Supplier() { // from class: birg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m63.j(new dtsc() { // from class: birr
        });
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(2);
        m64.b("messages.can_revoke_before_delivered_with_rcs");
        m64.i(58280);
        m64.c(new Supplier() { // from class: bisc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m64.j(new dtsc() { // from class: bisn
        });
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(1);
        m65.b("messages.outgoing_delivery_report_status");
        m65.i(58720);
        m65.c(new Supplier() { // from class: bisy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m65.j(new dtsc() { // from class: bitj
        });
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(1);
        m66.b("messages.outgoing_read_report_status");
        m66.i(58720);
        m66.c(new Supplier() { // from class: bitv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m66.j(new dtsc() { // from class: biug
        });
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(1);
        m67.b("messages.message_original_protocol");
        m67.i(59430);
        m67.c(new Supplier() { // from class: biur
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m67.j(new dtsc() { // from class: bivc
        });
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(4);
        m68.l(true);
        m68.d(true);
        m68.b("messages.satellite_datagram_id");
        m68.f(true);
        m68.i(59490);
        m68.c(new Supplier() { // from class: bivy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m68.j(new dtsc() { // from class: biwj
        });
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(1);
        m69.b("messages.encryption_protocol");
        m69.i(60190);
        m69.c(new Supplier() { // from class: biwu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m69.j(new dtsc() { // from class: bixf
        });
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(4);
        m70.l(true);
        m70.d(true);
        m70.b("messages.message_persistence_id");
        m70.f(true);
        m70.i(60370);
        m70.c(new Supplier() { // from class: bixq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m70.j(new dtsc() { // from class: biyc
        });
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(8);
        m71.b("parts_count");
        m71.i(0);
        m71.c(new Supplier() { // from class: biyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m71.j(new dtsc() { // from class: biyy
        });
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(2);
        m72.l(true);
        m72.g(true);
        m72.d(true);
        m72.b("parts._id");
        m72.i(-1);
        m72.c(new Supplier() { // from class: bizj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m72.j(new dtsc() { // from class: bizu
        });
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(1);
        m73.d(true);
        m73.e(true);
        m73.h(new Supplier() { // from class: bjaq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m73.b("parts.message_id");
        m73.i(-1);
        m73.c(new Supplier() { // from class: bjbb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m73.j(new dtsc() { // from class: bjbm
        });
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(4);
        m74.b("parts.text");
        m74.i(-1);
        m74.c(new Supplier() { // from class: bjbx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m74.j(new dtsc() { // from class: bjcj
        });
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(4);
        m75.b("parts.uri");
        m75.i(-1);
        m75.c(new Supplier() { // from class: bjcu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m75.j(new dtsc() { // from class: bjdf
        });
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(4);
        m76.d(true);
        m76.b("parts.content_type");
        m76.i(-1);
        m76.c(new Supplier() { // from class: bjdq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m76.j(new dtsc() { // from class: bjeb
        });
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(4);
        m77.b("parts.original_uri");
        m77.i(10021);
        m77.c(new Supplier() { // from class: bjem
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m77.j(new dtsc() { // from class: bjfi
        });
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(4);
        m78.b("parts.storage_uri");
        m78.i(29060);
        m78.c(new Supplier() { // from class: bjft
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m78.j(new dtsc() { // from class: bjge
        });
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(1);
        m79.b("parts.width");
        m79.i(-1);
        m79.c(new Supplier() { // from class: bjgq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m79.j(new dtsc() { // from class: bjhb
        });
        m79.a();
        dtsb m80 = dtsd.m();
        m80.m(1);
        m80.b("parts.height");
        m80.i(-1);
        m80.c(new Supplier() { // from class: bjhm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m80.j(new dtsc() { // from class: bjhx
        });
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(1);
        m81.b("parts.timestamp");
        m81.i(3010);
        m81.c(new Supplier() { // from class: bjhy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m81.j(new dtsc() { // from class: bjhz
        });
        m81.a();
        dtsb m82 = dtsd.m();
        m82.m(4);
        m82.d(true);
        m82.b("parts.output_uri");
        m82.i(4020);
        m82.c(new Supplier() { // from class: bjia
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m82.j(new dtsc() { // from class: bjic
        });
        m82.a();
        dtsb m83 = dtsd.m();
        m83.m(1);
        m83.b("parts.target_size");
        m83.i(4020);
        m83.c(new Supplier() { // from class: bjid
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m83.j(new dtsc() { // from class: bjif
        });
        m83.a();
        dtsb m84 = dtsd.m();
        m84.m(1);
        m84.b("parts.processing_status");
        m84.i(4020);
        m84.c(new Supplier() { // from class: bjig
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m84.j(new dtsc() { // from class: bjih
        });
        m84.a();
        dtsb m85 = dtsd.m();
        m85.m(1);
        m85.b("parts.cms_attachment_processing_status");
        m85.i(44010);
        m85.c(new Supplier() { // from class: bjii
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m85.j(new dtsc() { // from class: bjij
        });
        m85.a();
        dtsb m86 = dtsd.m();
        m86.m(1);
        m86.d(true);
        m86.e(true);
        m86.h(new Supplier() { // from class: bjik
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m86.b("parts.conversation_id");
        m86.i(-1);
        m86.c(new Supplier() { // from class: bjil
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m86.j(new dtsc() { // from class: bjim
        });
        m86.a();
        dtsb m87 = dtsd.m();
        m87.m(1);
        m87.b("parts.sticker_set_id");
        m87.i(5020);
        m87.c(new Supplier() { // from class: bjio
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m87.j(new dtsc() { // from class: bjiq
        });
        m87.a();
        dtsb m88 = dtsd.m();
        m88.m(1);
        m88.b("parts.sticker_id");
        m88.i(5020);
        m88.c(new Supplier() { // from class: bjir
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m88.j(new dtsc() { // from class: bjis
        });
        m88.a();
        dtsb m89 = dtsd.m();
        m89.m(1);
        m89.b("parts.media_modified_timestamp");
        m89.i(7000);
        m89.c(new Supplier() { // from class: bjit
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m89.j(new dtsc() { // from class: bjiu
        });
        m89.a();
        dtsb m90 = dtsd.m();
        m90.m(3);
        m90.b("parts.longitude");
        m90.i(10005);
        m90.c(new Supplier() { // from class: bjiv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m90.j(new dtsc() { // from class: bjiw
        });
        m90.a();
        dtsb m91 = dtsd.m();
        m91.m(3);
        m91.b("parts.latitude");
        m91.i(10005);
        m91.c(new Supplier() { // from class: bjix
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m91.j(new dtsc() { // from class: bjiy
        });
        m91.a();
        dtsb m92 = dtsd.m();
        m92.m(4);
        m92.b("parts.preview_content_uri");
        m92.i(10017);
        m92.c(new Supplier() { // from class: bigq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m92.j(new dtsc() { // from class: bigr
        });
        m92.a();
        dtsb m93 = dtsd.m();
        m93.m(4);
        m93.d(true);
        m93.b("parts.preview_content_type");
        m93.i(10017);
        m93.c(new Supplier() { // from class: bigs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m93.j(new dtsc() { // from class: bigt
        });
        m93.a();
        dtsb m94 = dtsd.m();
        m94.m(4);
        m94.b("parts.fallback_uri");
        m94.i(13000);
        m94.c(new Supplier() { // from class: bigu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m94.j(new dtsc() { // from class: bigv
        });
        m94.a();
        dtsb m95 = dtsd.m();
        m95.m(1);
        m95.b("parts.source");
        m95.i(14010);
        m95.c(new Supplier() { // from class: bigw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m95.j(new dtsc() { // from class: bigx
        });
        m95.a();
        dtsb m96 = dtsd.m();
        m96.m(1);
        m96.b("parts.bundle_index");
        m96.i(17010);
        m96.c(new Supplier() { // from class: bigy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m96.j(new dtsc() { // from class: bigz
        });
        m96.a();
        dtsb m97 = dtsd.m();
        m97.m(4);
        m97.b("parts.blob_id");
        m97.i(17020);
        m97.c(new Supplier() { // from class: bihd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m97.j(new dtsc() { // from class: bihe
        });
        m97.a();
        dtsb m98 = dtsd.m();
        m98.m(4);
        m98.b("parts.blob_gaia_email");
        m98.i(59570);
        m98.c(new Supplier() { // from class: bihf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m98.j(new dtsc() { // from class: bihg
        });
        m98.a();
        dtsb m99 = dtsd.m();
        m99.m(4);
        m99.b("parts.cms_full_size_blob_id");
        m99.i(40040);
        m99.c(new Supplier() { // from class: bihh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m99.j(new dtsc() { // from class: bihi
        });
        m99.a();
        dtsb m100 = dtsd.m();
        m100.m(5);
        m100.b("parts.cms_media_encryption_key");
        m100.i(42010);
        m100.c(new Supplier() { // from class: bihj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m100.j(new dtsc() { // from class: bihk
        });
        m100.a();
        dtsb m101 = dtsd.m();
        m101.m(5);
        m101.b("parts.cms_compressed_media_encryption_key");
        m101.i(42070);
        m101.c(new Supplier() { // from class: bihm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m101.j(new dtsc() { // from class: bihn
        });
        m101.a();
        dtsb m102 = dtsd.m();
        m102.m(1);
        m102.b("parts.blob_upload_permanent_failure");
        m102.i(18000);
        m102.c(new Supplier() { // from class: bihp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m102.j(new dtsc() { // from class: bihq
        });
        m102.a();
        dtsb m103 = dtsd.m();
        m103.m(1);
        m103.b("parts.blob_upload_timestamp");
        m103.i(19030);
        m103.c(new Supplier() { // from class: bihr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m103.j(new dtsc() { // from class: bihs
        });
        m103.a();
        dtsb m104 = dtsd.m();
        m104.m(4);
        m104.b("parts.expressive_sticker_name");
        m104.i(22060);
        m104.c(new Supplier() { // from class: biht
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m104.j(new dtsc() { // from class: bihu
        });
        m104.a();
        dtsb m105 = dtsd.m();
        m105.m(4);
        m105.b("parts.file_name");
        m105.i(26000);
        m105.c(new Supplier() { // from class: bihv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m105.j(new dtsc() { // from class: bihx
        });
        m105.a();
        dtsb m106 = dtsd.m();
        m106.m(1);
        m106.b("parts.duration");
        m106.i(26040);
        m106.c(new Supplier() { // from class: bihy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m106.j(new dtsc() { // from class: bihz
        });
        m106.a();
        dtsb m107 = dtsd.m();
        m107.m(4);
        m107.b("parts.compressed_blob_id");
        m107.i(27000);
        m107.c(new Supplier() { // from class: biib
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m107.j(new dtsc() { // from class: biic
        });
        m107.a();
        dtsb m108 = dtsd.m();
        m108.m(4);
        m108.b("parts.cms_compressed_blob_id");
        m108.i(40040);
        m108.c(new Supplier() { // from class: biid
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m108.j(new dtsc() { // from class: biie
        });
        m108.a();
        dtsb m109 = dtsd.m();
        m109.m(1);
        m109.b("parts.compressed_blob_upload_permanent_failure");
        m109.i(27000);
        m109.c(new Supplier() { // from class: biif
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m109.j(new dtsc() { // from class: biig
        });
        m109.a();
        dtsb m110 = dtsd.m();
        m110.m(1);
        m110.b("parts.compressed_blob_upload_timestamp");
        m110.i(27000);
        m110.c(new Supplier() { // from class: biii
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m110.j(new dtsc() { // from class: biij
        });
        m110.a();
        dtsb m111 = dtsd.m();
        m111.m(5);
        m111.b("parts.media_encryption_key");
        m111.i(30040);
        m111.c(new Supplier() { // from class: biik
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m111.j(new dtsc() { // from class: biil
        });
        m111.a();
        dtsb m112 = dtsd.m();
        m112.m(5);
        m112.b("parts.compressed_media_encryption_key");
        m112.i(30040);
        m112.c(new Supplier() { // from class: biin
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m112.j(new dtsc() { // from class: biio
        });
        m112.a();
        dtsb m113 = dtsd.m();
        m113.m(1);
        m113.b("parts.missing_entry_in_telephony");
        m113.i(52030);
        m113.c(new Supplier() { // from class: biip
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m113.j(new dtsc() { // from class: biiq
        });
        m113.a();
        dtsb m114 = dtsd.m();
        m114.m(1);
        m114.b("parts.awaiting_reverse_sync");
        m114.i(53040);
        m114.c(new Supplier() { // from class: biir
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m114.j(new dtsc() { // from class: biit
        });
        m114.a();
        dtsb m115 = dtsd.m();
        m115.m(1);
        m115.b("parts.file_size_bytes");
        m115.i(52050);
        m115.c(new Supplier() { // from class: biiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m115.j(new dtsc() { // from class: biiv
        });
        m115.a();
        dtsb m116 = dtsd.m();
        m116.m(4);
        m116.d(true);
        m116.b("parts.local_cache_path");
        m116.i(52050);
        m116.c(new Supplier() { // from class: biiw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m116.j(new dtsc() { // from class: biix
        });
        m116.a();
        dtsb m117 = dtsd.m();
        m117.m(1);
        m117.b("parts.media_send_type");
        m117.i(58150);
        m117.c(new Supplier() { // from class: biiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m117.j(new dtsc() { // from class: bija
        });
        m117.a();
        dtsb m118 = dtsd.m();
        m118.m(5);
        m118.b("parts.voice_metadata");
        m118.i(59470);
        m118.c(new Supplier() { // from class: bijb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m118.j(new dtsc() { // from class: bijc
        });
        m118.a();
        dtsb m119 = dtsd.m();
        m119.m(1);
        m119.b("parts.validation_status");
        m119.i(58770);
        m119.c(new Supplier() { // from class: bije
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m119.j(new dtsc() { // from class: bijf
        });
        m119.a();
        dtsb m120 = dtsd.m();
        m120.m(4);
        m120.b("parts.processing_id");
        m120.i(60080);
        m120.c(new Supplier() { // from class: bijg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m120.j(new dtsc() { // from class: bijh
        });
        m120.a();
        dtsb m121 = dtsd.m();
        m121.m(1);
        m121.b("parts.rich_card_media_download_failure_reason");
        m121.i(60230);
        m121.c(new Supplier() { // from class: biji
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m121.j(new dtsc() { // from class: bijj
        });
        m121.a();
        dtsb m122 = dtsd.m();
        m122.m(1);
        m122.b("parts.image_display_state");
        m122.i(60240);
        m122.c(new Supplier() { // from class: bijl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m122.j(new dtsc() { // from class: bijm
        });
        m122.a();
        dtsb m123 = dtsd.m();
        m123.m(1);
        m123.b("parts.preserve_size");
        m123.i(60680);
        m123.c(new Supplier() { // from class: bijn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m123.j(new dtsc() { // from class: bijp
        });
        m123.a();
        dtsb m124 = dtsd.m();
        m124.m(8);
        m124.b("parts__ROWID");
        m124.i(0);
        m124.c(new Supplier() { // from class: bijq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m124.j(new dtsc() { // from class: bijr
        });
        m124.a();
        dtsb m125 = dtsd.m();
        m125.m(4);
        m125.d(true);
        m125.b("participants.normalized_destination");
        m125.f(true);
        m125.i(-1);
        m125.c(new Supplier() { // from class: bijs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m125.j(new dtsc() { // from class: bijt
        });
        m125.a();
        dtsb m126 = dtsd.m();
        m126.m(4);
        m126.b("participants.send_destination");
        m126.i(-1);
        m126.c(new Supplier() { // from class: biju
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m126.j(new dtsc() { // from class: bijv
        });
        m126.a();
        dtsb m127 = dtsd.m();
        m127.m(4);
        m127.b("participants.display_destination");
        m127.i(-1);
        m127.c(new Supplier() { // from class: bijx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m127.j(new dtsc() { // from class: bijy
        });
        m127.a();
        dtsb m128 = dtsd.m();
        m128.m(4);
        m128.b("participants.full_name");
        m128.i(-1);
        m128.c(new Supplier() { // from class: bika
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m128.j(new dtsc() { // from class: bikb
        });
        m128.a();
        dtsb m129 = dtsd.m();
        m129.m(4);
        m129.b("participants.first_name");
        m129.i(-1);
        m129.c(new Supplier() { // from class: bikc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m129.j(new dtsc() { // from class: bikd
        });
        m129.a();
        dtsb m130 = dtsd.m();
        m130.m(4);
        m130.b("participants.profile_photo_uri");
        m130.i(-1);
        m130.c(new Supplier() { // from class: bike
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m130.j(new dtsc() { // from class: bikf
        });
        m130.a();
        dtsb m131 = dtsd.m();
        m131.m(1);
        m131.b("participants.contact_id");
        m131.i(-1);
        m131.c(new Supplier() { // from class: bikg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m131.j(new dtsc() { // from class: bikh
        });
        m131.a();
        dtsb m132 = dtsd.m();
        m132.m(4);
        m132.b("participants.lookup_key");
        m132.i(-1);
        m132.c(new Supplier() { // from class: bikj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m132.j(new dtsc() { // from class: bikl
        });
        m132.a();
        dtsb m133 = dtsd.m();
        m133.m(1);
        m133.b("participants.color_palette_index");
        m133.i(-1);
        m133.c(new Supplier() { // from class: bikm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m133.j(new dtsc() { // from class: bikn
        });
        m133.a();
        dtsb m134 = dtsd.m();
        m134.m(1);
        m134.b("participants.color_type");
        m134.i(1000);
        m134.c(new Supplier() { // from class: biko
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m134.j(new dtsc() { // from class: bikp
        });
        m134.a();
        dtsb m135 = dtsd.m();
        m135.m(1);
        m135.b("participants.extended_color");
        m135.i(10027);
        m135.c(new Supplier() { // from class: bikq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m135.j(new dtsc() { // from class: bikr
        });
        m135.a();
        dtsb m136 = dtsd.m();
        m136.m(1);
        m136.b("participants.blocked");
        m136.i(-1);
        m136.c(new Supplier() { // from class: biks
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m136.j(new dtsc() { // from class: bikt
        });
        m136.a();
        dtsb m137 = dtsd.m();
        m137.m(1);
        m137.b("participants.participant_type");
        m137.i(12001);
        m137.c(new Supplier() { // from class: bikx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m137.j(new dtsc() { // from class: biky
        });
        m137.a();
        dtsb m138 = dtsd.m();
        m138.m(1);
        m138.b("participants.is_spam");
        m138.i(24060);
        m138.c(new Supplier() { // from class: bikz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m138.j(new dtsc() { // from class: bila
        });
        m138.a();
        dtsb m139 = dtsd.m();
        m139.m(1);
        m139.b("participants.latest_verification_status");
        m139.i(31030);
        m139.c(new Supplier() { // from class: bilb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m139.j(new dtsc() { // from class: bilc
        });
        m139.a();
        dtsb m140 = dtsd.m();
        m140.m(1);
        m140.b("participants.directory_id");
        m140.i(35010);
        m140.c(new Supplier() { // from class: bild
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m140.j(new dtsc() { // from class: bile
        });
        m140.a();
        dtsb m141 = dtsd.m();
        m141.m(1);
        m141.b("participants.name_source");
        m141.i(59550);
        m141.c(new Supplier() { // from class: bilf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m141.j(new dtsc() { // from class: bilg
        });
        m141.a();
        dtsb m142 = dtsd.m();
        m142.m(1);
        m142.b("participants.photo_source");
        m142.i(59550);
        m142.c(new Supplier() { // from class: bilj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m142.j(new dtsc() { // from class: bilk
        });
        m142.a();
        dtsb m143 = dtsd.m();
        m143.m(2);
        m143.l(true);
        m143.g(true);
        m143.d(true);
        m143.b("participants._id");
        m143.i(-1);
        m143.c(new Supplier() { // from class: bill
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m143.j(new dtsc() { // from class: bilm
        });
        m143.a();
        dtsb m144 = dtsd.m();
        m144.m(4);
        m144.d(true);
        m144.b("participants.my_identity_token");
        m144.i(59930);
        m144.c(new Supplier() { // from class: biln
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m144.j(new dtsc() { // from class: bilo
        });
        m144.a();
        dtsb m145 = dtsd.m();
        m145.m(4);
        m145.d(true);
        m145.e(true);
        m145.h(new Supplier() { // from class: bilp
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m145.b("participants.my_identity_token_foreign_key");
        m145.i(60160);
        m145.c(new Supplier() { // from class: bilq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m145.j(new dtsc() { // from class: bilr
        });
        m145.a();
        dtsb m146 = dtsd.m();
        m146.m(1);
        m146.d(true);
        m146.b("participants.sub_id");
        m146.f(true);
        m146.i(-1);
        m146.c(new Supplier() { // from class: bilt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m146.j(new dtsc() { // from class: bilw
        });
        m146.a();
        dtsb m147 = dtsd.m();
        m147.m(1);
        m147.b("participants.sim_slot_id");
        m147.i(2000);
        m147.c(new Supplier() { // from class: bilx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m147.j(new dtsc() { // from class: bily
        });
        m147.a();
        dtsb m148 = dtsd.m();
        m148.m(4);
        m148.l(true);
        m148.d(true);
        m148.b("participants.comparable_destination");
        m148.f(true);
        m148.i(54040);
        m148.c(new Supplier() { // from class: bilz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m148.j(new dtsc() { // from class: bima
        });
        m148.a();
        dtsb m149 = dtsd.m();
        m149.m(4);
        m149.b("participants.country_code");
        m149.i(54040);
        m149.c(new Supplier() { // from class: bimb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m149.j(new dtsc() { // from class: bimc
        });
        m149.a();
        dtsb m150 = dtsd.m();
        m150.m(2);
        m150.l(true);
        m150.d(true);
        m150.b("participants.recipient_id");
        m150.f(true);
        m150.i(58090);
        m150.c(new Supplier() { // from class: bime
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m150.j(new dtsc() { // from class: bimf
        });
        m150.a();
        dtsb m151 = dtsd.m();
        m151.m(4);
        m151.b("participants.recipient_canonical_address");
        m151.i(58090);
        m151.c(new Supplier() { // from class: bimg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m151.j(new dtsc() { // from class: bimi
        });
        this.k = new bjjc(m151.a());
        dtsb m152 = dtsd.m();
        m152.m(4);
        m152.b("participants.contact_photo_uri");
        m152.i(59850);
        m152.c(new Supplier() { // from class: bimj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m152.j(new dtsc() { // from class: bimk
        });
        m152.a();
        dtsb m153 = dtsd.m();
        m153.m(4);
        m153.b("participants.subscription_name");
        m153.i(2000);
        m153.c(new Supplier() { // from class: biml
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m153.j(new dtsc() { // from class: bimm
        });
        m153.a();
        dtsb m154 = dtsd.m();
        m154.m(1);
        m154.b("participants.subscription_color");
        m154.i(2000);
        m154.c(new Supplier() { // from class: bimn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m154.j(new dtsc() { // from class: bimp
        });
        m154.a();
        dtsb m155 = dtsd.m();
        m155.m(4);
        m155.b("participants.contact_destination");
        m155.i(4000);
        m155.c(new Supplier() { // from class: bimq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m155.j(new dtsc() { // from class: bimr
        });
        m155.a();
        dtsb m156 = dtsd.m();
        m156.m(1);
        m156.b("participants.video_reachability");
        m156.i(13050);
        m156.c(new Supplier() { // from class: bims
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m156.j(new dtsc() { // from class: bimu
        });
        m156.a();
        dtsb m157 = dtsd.m();
        m157.m(4);
        m157.b("participants.alias");
        m157.i(20060);
        m157.c(new Supplier() { // from class: bimv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m157.j(new dtsc() { // from class: bimw
        });
        m157.a();
        dtsb m158 = dtsd.m();
        m158.m(1);
        m158.b("participants.is_rcs_available");
        m158.i(29030);
        m158.c(new Supplier() { // from class: bimx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m158.j(new dtsc() { // from class: bimy
        });
        m158.a();
        dtsb m159 = dtsd.m();
        m159.m(1);
        m159.b("participants.is_spam_source");
        m159.i(30000);
        m159.c(new Supplier() { // from class: bina
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m159.j(new dtsc() { // from class: binb
        });
        m159.a();
        dtsb m160 = dtsd.m();
        m160.m(4);
        m160.l(true);
        m160.d(true);
        m160.b("participants.cms_id");
        m160.f(true);
        m160.i(31020);
        m160.c(new Supplier() { // from class: binc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m160.j(new dtsc() { // from class: bind
        });
        m160.a();
        dtsb m161 = dtsd.m();
        m161.m(4);
        m161.b("participants.profile_photo_blob_id");
        m161.i(33000);
        m161.c(new Supplier() { // from class: bine
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m161.j(new dtsc() { // from class: bing
        });
        m161.a();
        dtsb m162 = dtsd.m();
        m162.m(5);
        m162.b("participants.profile_photo_encryption_key");
        m162.i(33060);
        m162.c(new Supplier() { // from class: binh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m162.j(new dtsc() { // from class: bini
        });
        m162.a();
        dtsb m163 = dtsd.m();
        m163.m(1);
        m163.b("participants.is_check_constraint_enabled_via_phenotype");
        m163.i(55010);
        m163.c(new Supplier() { // from class: binj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m163.j(new dtsc() { // from class: binl
        });
        m163.a();
        dtsb m164 = dtsd.m();
        m164.m(1);
        m164.b("participants.is_valid_phone_number_data");
        m164.i(55010);
        m164.c(new Supplier() { // from class: binm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m164.j(new dtsc() { // from class: binn
        });
        m164.a();
        dtsb m165 = dtsd.m();
        m165.m(2);
        m165.d(true);
        m165.e(true);
        m165.h(new Supplier() { // from class: bino
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m165.b("participants.duplicate_of");
        m165.i(58090);
        m165.c(new Supplier() { // from class: binp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m165.j(new dtsc() { // from class: binq
        });
        m165.a();
        dtsb m166 = dtsd.m();
        m166.m(1);
        m166.b("participants.cms_life_cycle");
        m166.i(58210);
        m166.c(new Supplier() { // from class: bins
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m166.j(new dtsc() { // from class: bint
        });
        m166.a();
        dtsb m167 = dtsd.m();
        m167.m(1);
        m167.b("participants.norm_ui_status");
        m167.i(58620);
        m167.c(new Supplier() { // from class: binu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m167.j(new dtsc() { // from class: binw
        });
        m167.a();
        dtsb m168 = dtsd.m();
        m168.m(4);
        m168.b("participants.last_modified_by_key");
        m168.i(59440);
        m168.c(new Supplier() { // from class: binx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m168.j(new dtsc() { // from class: biny
        });
        m168.a();
        dtsb m169 = dtsd.m();
        m169.m(1);
        m169.b("participants.profile_photo_user_preference");
        m169.i(60060);
        m169.c(new Supplier() { // from class: binz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m169.j(new dtsc() { // from class: bioa
        });
        m169.a();
        dtsb m170 = dtsd.m();
        m170.m(5);
        m170.b("participants.contact_metadata");
        m170.i(60070);
        m170.c(new Supplier() { // from class: biob
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m170.j(new dtsc() { // from class: bioc
        });
        m170.a();
        dtsb m171 = dtsd.m();
        m171.m(1);
        m171.d(true);
        m171.b("participants.is_enterprise_contact");
        m171.i(60640);
        m171.c(new Supplier() { // from class: bioe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m171.j(new dtsc() { // from class: biof
        });
        m171.a();
        dtsb m172 = dtsd.m();
        m172.m(2);
        m172.d(true);
        m172.b("reports_concat_view._id_read_reports");
        m172.i(0);
        m172.c(new Supplier() { // from class: bioh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m172.j(new dtsc() { // from class: bioi
        });
        m172.a();
        dtsb m173 = dtsd.m();
        m173.m(1);
        m173.k(true);
        m173.d(true);
        m173.e(true);
        m173.h(new Supplier() { // from class: bioj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m173.b("reports_concat_view.message_id_read_reports");
        m173.f(true);
        m173.i(0);
        m173.c(new Supplier() { // from class: biok
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m173.j(new dtsc() { // from class: biol
        });
        m173.a();
        dtsb m174 = dtsd.m();
        m174.m(1);
        m174.k(true);
        m174.d(true);
        m174.e(true);
        m174.h(new Supplier() { // from class: biom
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m174.b("reports_concat_view.participant_id_read_reports");
        m174.f(true);
        m174.i(0);
        m174.c(new Supplier() { // from class: bion
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m174.j(new dtsc() { // from class: bioo
        });
        m174.a();
        dtsb m175 = dtsd.m();
        m175.m(1);
        m175.b("reports_concat_view.receive_time_read_reports");
        m175.i(0);
        m175.c(new Supplier() { // from class: bioq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m175.j(new dtsc() { // from class: bios
        });
        m175.a();
        dtsb m176 = dtsd.m();
        m176.m(1);
        m176.b("reports_concat_view.read_time_read_reports");
        m176.i(0);
        m176.c(new Supplier() { // from class: biot
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m176.j(new dtsc() { // from class: biou
        });
        m176.a();
        dtsb m177 = dtsd.m();
        m177.m(2);
        m177.b("reports_concat_view.ftd_time_read_reports");
        m177.i(0);
        m177.c(new Supplier() { // from class: biov
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m177.j(new dtsc() { // from class: biow
        });
        m177.a();
        dtsb m178 = dtsd.m();
        m178.m(8);
        m178.b("reports_concat_view.read_reports__ROWID_read_reports");
        m178.i(0);
        m178.c(new Supplier() { // from class: biox
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m178.j(new dtsc() { // from class: bioy
        });
        m178.a();
        dtsb m179 = dtsd.m();
        m179.m(2);
        m179.k(true);
        m179.d(true);
        m179.e(true);
        m179.h(new Supplier() { // from class: bioz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m179.b("user_refs_concat_view.message_id_user_references");
        m179.f(true);
        m179.i(0);
        m179.c(new Supplier() { // from class: bipa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m179.j(new dtsc() { // from class: bipe
        });
        m179.a();
        dtsb m180 = dtsd.m();
        m180.m(2);
        m180.k(true);
        m180.d(true);
        m180.e(true);
        m180.h(new Supplier() { // from class: bipf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m180.b("user_refs_concat_view.participant_id_user_references");
        m180.f(true);
        m180.i(0);
        m180.c(new Supplier() { // from class: bipg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m180.j(new dtsc() { // from class: biph
        });
        m180.a();
        dtsb m181 = dtsd.m();
        m181.m(2);
        m181.b("user_refs_concat_view.user_ref_datetime_user_references");
        m181.i(0);
        m181.c(new Supplier() { // from class: bipi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m181.j(new dtsc() { // from class: bipj
        });
        m181.a();
        dtsb m182 = dtsd.m();
        m182.m(8);
        m182.b("user_refs_concat_view.user_references__ROWID_user_references");
        m182.i(0);
        m182.c(new Supplier() { // from class: bipk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m182.j(new dtsc() { // from class: bipl
        });
        m182.a();
        dtsb m183 = dtsd.m();
        m183.m(8);
        m183.b("user_refs_concat_view.user_ref_display_name");
        m183.i(0);
        m183.c(new Supplier() { // from class: bipm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m183.j(new dtsc() { // from class: bipn
        });
        m183.a();
        dtsb m184 = dtsd.m();
        m184.m(8);
        m184.b("user_refs_concat_view.user_ref_profile_photo_uri");
        m184.i(0);
        m184.c(new Supplier() { // from class: bipq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m184.j(new dtsc() { // from class: bipr
        });
        m184.a();
        dtsb m185 = dtsd.m();
        m185.m(8);
        m185.b("user_refs_concat_view.user_ref_full_name");
        m185.i(0);
        m185.c(new Supplier() { // from class: bips
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m185.j(new dtsc() { // from class: bipt
        });
        m185.a();
        dtsb m186 = dtsd.m();
        m186.m(8);
        m186.b("user_refs_concat_view.user_ref_lookup_key");
        m186.i(0);
        m186.c(new Supplier() { // from class: bipu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m186.j(new dtsc() { // from class: bipv
        });
        m186.a();
        dtsb m187 = dtsd.m();
        m187.m(4);
        m187.d(true);
        m187.b("user_refs_concat_view.normalized_destination_participants");
        m187.f(true);
        m187.i(0);
        m187.c(new Supplier() { // from class: bipw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m187.j(new dtsc() { // from class: bipx
        });
        m187.a();
        dtsb m188 = dtsd.m();
        m188.m(1);
        m188.b("user_refs_concat_view.color_palette_index_participants");
        m188.i(0);
        m188.c(new Supplier() { // from class: bipy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m188.j(new dtsc() { // from class: biqa
        });
        m188.a();
        dtsb m189 = dtsd.m();
        m189.m(1);
        m189.b("user_refs_concat_view.color_type_participants");
        m189.i(0);
        m189.c(new Supplier() { // from class: biqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m189.j(new dtsc() { // from class: biqd
        });
        m189.a();
        dtsb m190 = dtsd.m();
        m190.m(1);
        m190.b("user_refs_concat_view.extended_color_participants");
        m190.i(0);
        m190.c(new Supplier() { // from class: biqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m190.j(new dtsc() { // from class: biqf
        });
        m190.a();
        dtsb m191 = dtsd.m();
        m191.m(8);
        m191.b("user_refs_concat_view.participants__ROWID_participants");
        m191.i(0);
        m191.c(new Supplier() { // from class: biqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m191.j(new dtsc() { // from class: biqh
        });
        m191.a();
        dtsb m192 = dtsd.m();
        m192.m(2);
        m192.l(true);
        m192.d(true);
        m192.e(true);
        m192.h(new Supplier() { // from class: biqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m192.b("link_preview.message_id");
        m192.i(-1);
        m192.c(new Supplier() { // from class: biqj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m192.j(new dtsc() { // from class: biql
        });
        m192.a();
        dtsb m193 = dtsd.m();
        m193.m(4);
        m193.b("link_preview.trigger_url");
        m193.i(-1);
        m193.c(new Supplier() { // from class: biqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m193.j(new dtsc() { // from class: biqp
        });
        m193.a();
        dtsb m194 = dtsd.m();
        m194.m(2);
        m194.b("link_preview.expiration_time_millis");
        m194.i(-1);
        m194.c(new Supplier() { // from class: biqq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m194.j(new dtsc() { // from class: biqr
        });
        m194.a();
        dtsb m195 = dtsd.m();
        m195.m(4);
        m195.b("link_preview.link_title");
        m195.i(-1);
        m195.c(new Supplier() { // from class: biqs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m195.j(new dtsc() { // from class: biqt
        });
        m195.a();
        dtsb m196 = dtsd.m();
        m196.m(4);
        m196.b("link_preview.link_description");
        m196.i(-1);
        m196.c(new Supplier() { // from class: biqu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m196.j(new dtsc() { // from class: biqw
        });
        m196.a();
        dtsb m197 = dtsd.m();
        m197.m(4);
        m197.b("link_preview.link_image_url");
        m197.i(-1);
        m197.c(new Supplier() { // from class: biqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m197.j(new dtsc() { // from class: biqy
        });
        m197.a();
        dtsb m198 = dtsd.m();
        m198.m(4);
        m198.b("link_preview.link_domain");
        m198.i(-1);
        m198.c(new Supplier() { // from class: biqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m198.j(new dtsc() { // from class: birb
        });
        m198.a();
        dtsb m199 = dtsd.m();
        m199.m(4);
        m199.b("link_preview.link_canonical_url");
        m199.i(-1);
        m199.c(new Supplier() { // from class: birc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m199.j(new dtsc() { // from class: bird
        });
        m199.a();
        dtsb m200 = dtsd.m();
        m200.m(2);
        m200.b("link_preview.link_preview_prevented");
        m200.i(21010);
        m200.c(new Supplier() { // from class: bire
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m200.j(new dtsc() { // from class: birf
        });
        m200.a();
        dtsb m201 = dtsd.m();
        m201.m(2);
        m201.b("link_preview.link_preview_failed");
        m201.i(22020);
        m201.c(new Supplier() { // from class: birh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m201.j(new dtsc() { // from class: biri
        });
        m201.a();
        dtsb m202 = dtsd.m();
        m202.m(2);
        m202.l(true);
        m202.g(true);
        m202.d(true);
        m202.b("link_preview._id");
        m202.i(-1);
        m202.c(new Supplier() { // from class: birj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m202.j(new dtsc() { // from class: birk
        });
        m202.a();
        dtsb m203 = dtsd.m();
        m203.m(4);
        m203.l(true);
        m203.g(true);
        m203.d(true);
        m203.b("verified_sms_senders.sender_id");
        m203.i(-1);
        m203.c(new Supplier() { // from class: birl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m203.j(new dtsc() { // from class: birn
        });
        m203.a();
        dtsb m204 = dtsd.m();
        m204.m(4);
        m204.b("verified_sms_senders.brand_id");
        m204.i(-1);
        m204.c(new Supplier() { // from class: biro
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m204.j(new dtsc() { // from class: birp
        });
        m204.a();
        dtsb m205 = dtsd.m();
        m205.m(4);
        m205.b("verified_sms_brands.name");
        m205.i(-1);
        m205.c(new Supplier() { // from class: birq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m205.j(new dtsc() { // from class: birs
        });
        m205.a();
        dtsb m206 = dtsd.m();
        m206.m(4);
        m206.b("verified_sms_brands.description");
        m206.i(-1);
        m206.c(new Supplier() { // from class: birt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m206.j(new dtsc() { // from class: biru
        });
        m206.a();
        dtsb m207 = dtsd.m();
        m207.m(4);
        m207.b("verified_sms_brands.logo_uri");
        m207.i(-1);
        m207.c(new Supplier() { // from class: birv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m207.j(new dtsc() { // from class: birw
        });
        m207.a();
        dtsb m208 = dtsd.m();
        m208.m(2);
        m208.l(true);
        m208.g(true);
        m208.d(true);
        m208.b("verified_sms_brands._id");
        m208.i(-1);
        m208.c(new Supplier() { // from class: birx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m208.j(new dtsc() { // from class: birz
        });
        m208.a();
        dtsb m209 = dtsd.m();
        m209.m(4);
        m209.l(true);
        m209.d(true);
        m209.b("verified_sms_brands.brand_id");
        m209.i(-1);
        m209.c(new Supplier() { // from class: bisa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m209.j(new dtsc() { // from class: bisb
        });
        m209.a();
        dtsb m210 = dtsd.m();
        m210.m(4);
        m210.b("verified_sms_brands.logo_url");
        m210.i(-1);
        m210.c(new Supplier() { // from class: bisd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m210.j(new dtsc() { // from class: bise
        });
        m210.a();
        dtsb m211 = dtsd.m();
        m211.m(4);
        m211.b("verified_sms_brands.version_token");
        m211.i(-1);
        m211.c(new Supplier() { // from class: bisf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m211.j(new dtsc() { // from class: bisg
        });
        m211.a();
        dtsb m212 = dtsd.m();
        m212.m(4);
        m212.d(true);
        m212.b("conversations.participant_normalized_destination");
        m212.i(-1);
        m212.c(new Supplier() { // from class: bish
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m212.j(new dtsc() { // from class: bisi
        });
        m212.a();
        dtsb m213 = dtsd.m();
        m213.m(1);
        m213.b("conversations.conv_type");
        m213.i(10007);
        m213.c(new Supplier() { // from class: bisj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m213.j(new dtsc() { // from class: bisl
        });
        m213.a();
        dtsb m214 = dtsd.m();
        m214.m(1);
        m214.b("conversations.has_ea2p_bot_recipient");
        m214.i(12001);
        m214.c(new Supplier() { // from class: bism
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m214.j(new dtsc() { // from class: biso
        });
        this.l = new bjjc(m214.a());
        dtsb m215 = dtsd.m();
        m215.m(4);
        m215.d(true);
        m215.b("conversations.rcs_group_id");
        m215.i(40050);
        m215.c(new Supplier() { // from class: bisp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m215.j(new dtsc() { // from class: bisq
        });
        this.m = new bjjc(m215.a());
        dtsb m216 = dtsd.m();
        m216.m(4);
        m216.b("conversations.rcs_conference_uri");
        m216.i(40050);
        m216.c(new Supplier() { // from class: bisr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m216.j(new dtsc() { // from class: biss
        });
        m216.a();
        dtsb m217 = dtsd.m();
        m217.m(1);
        m217.b("conversations.rcs_session_allows_revocation");
        m217.i(48040);
        m217.c(new Supplier() { // from class: bist
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m217.j(new dtsc() { // from class: bisu
        });
        m217.a();
        dtsb m218 = dtsd.m();
        m218.m(2);
        m218.b("conversations.recipient_offline_timestamp_ms");
        m218.i(58750);
        m218.c(new Supplier() { // from class: bisv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m218.j(new dtsc() { // from class: bisx
        });
        m218.a();
        dtsb m219 = dtsd.m();
        m219.m(2);
        m219.l(true);
        m219.g(true);
        m219.d(true);
        m219.b("conversations._id");
        m219.i(-1);
        m219.c(new Supplier() { // from class: bisz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m219.j(new dtsc() { // from class: bita
        });
        this.n = new bjjc(m219.a());
        dtsb m220 = dtsd.m();
        m220.m(1);
        m220.d(true);
        m220.b("conversations.sms_thread_id");
        m220.i(-1);
        m220.c(new Supplier() { // from class: bitb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m220.j(new dtsc() { // from class: bitc
        });
        m220.a();
        dtsb m221 = dtsd.m();
        m221.m(4);
        m221.b("conversations.name");
        m221.i(-1);
        m221.c(new Supplier() { // from class: bitd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m221.j(new dtsc() { // from class: bite
        });
        m221.a();
        dtsb m222 = dtsd.m();
        m222.m(2);
        m222.b("conversations.name_is_automatic");
        m222.i(10012);
        m222.c(new Supplier() { // from class: bitf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m222.j(new dtsc() { // from class: bitg
        });
        m222.a();
        dtsb m223 = dtsd.m();
        m223.m(4);
        m223.b("conversations.subtitle");
        m223.i(59760);
        m223.c(new Supplier() { // from class: bith
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m223.j(new dtsc() { // from class: bitl
        });
        m223.a();
        dtsb m224 = dtsd.m();
        m224.m(1);
        m224.b("conversations.latest_message_id");
        m224.i(-1);
        m224.c(new Supplier() { // from class: bitm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m224.j(new dtsc() { // from class: bitn
        });
        m224.a();
        dtsb m225 = dtsd.m();
        m225.m(4);
        m225.b("conversations.snippet_text");
        m225.i(-1);
        m225.c(new Supplier() { // from class: bito
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m225.j(new dtsc() { // from class: bitp
        });
        m225.a();
        dtsb m226 = dtsd.m();
        m226.m(4);
        m226.b("conversations.subject_text");
        m226.i(-1);
        m226.c(new Supplier() { // from class: bitq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m226.j(new dtsc() { // from class: bitr
        });
        m226.a();
        dtsb m227 = dtsd.m();
        m227.m(4);
        m227.b("conversations.preview_uri");
        m227.i(-1);
        m227.c(new Supplier() { // from class: bits
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m227.j(new dtsc() { // from class: bitt
        });
        m227.a();
        dtsb m228 = dtsd.m();
        m228.m(4);
        m228.b("conversations.preview_content_type");
        m228.i(-1);
        m228.c(new Supplier() { // from class: bitu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m228.j(new dtsc() { // from class: bitx
        });
        m228.a();
        dtsb m229 = dtsd.m();
        m229.m(1);
        m229.b("conversations.show_draft");
        m229.i(-1);
        m229.c(new Supplier() { // from class: bity
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m229.j(new dtsc() { // from class: bitz
        });
        m229.a();
        dtsb m230 = dtsd.m();
        m230.m(4);
        m230.b("conversations.draft_snippet_text");
        m230.i(-1);
        m230.c(new Supplier() { // from class: biua
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m230.j(new dtsc() { // from class: biub
        });
        m230.a();
        dtsb m231 = dtsd.m();
        m231.m(4);
        m231.b("conversations.draft_subject_text");
        m231.i(-1);
        m231.c(new Supplier() { // from class: biuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m231.j(new dtsc() { // from class: biud
        });
        m231.a();
        dtsb m232 = dtsd.m();
        m232.m(4);
        m232.b("conversations.draft_preview_uri");
        m232.i(-1);
        m232.c(new Supplier() { // from class: biue
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m232.j(new dtsc() { // from class: biuf
        });
        m232.a();
        dtsb m233 = dtsd.m();
        m233.m(4);
        m233.b("conversations.draft_preview_content_type");
        m233.i(-1);
        m233.c(new Supplier() { // from class: biuh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m233.j(new dtsc() { // from class: biuj
        });
        m233.a();
        dtsb m234 = dtsd.m();
        m234.m(1);
        m234.b("conversations.etouffee_default");
        m234.i(29060);
        m234.c(new Supplier() { // from class: biuk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m234.j(new dtsc() { // from class: biul
        });
        m234.a();
        dtsb m235 = dtsd.m();
        m235.m(1);
        m235.d(true);
        m235.b("conversations.archive_status");
        m235.i(-1);
        m235.c(new Supplier() { // from class: bium
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m235.j(new dtsc() { // from class: biun
        });
        m235.a();
        dtsb m236 = dtsd.m();
        m236.m(1);
        m236.d(true);
        m236.b("conversations.sort_timestamp");
        m236.i(-1);
        m236.c(new Supplier() { // from class: biuo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m236.j(new dtsc() { // from class: biup
        });
        m236.a();
        dtsb m237 = dtsd.m();
        m237.m(1);
        m237.b("conversations.last_read_timestamp");
        m237.i(-1);
        m237.c(new Supplier() { // from class: biuq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m237.j(new dtsc() { // from class: bius
        });
        m237.a();
        dtsb m238 = dtsd.m();
        m238.m(4);
        m238.b("conversations.icon");
        m238.i(-1);
        m238.c(new Supplier() { // from class: biut
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m238.j(new dtsc() { // from class: biuv
        });
        m238.a();
        dtsb m239 = dtsd.m();
        m239.m(1);
        m239.b("conversations.participant_contact_id");
        m239.i(-1);
        m239.c(new Supplier() { // from class: biuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m239.j(new dtsc() { // from class: biux
        });
        m239.a();
        dtsb m240 = dtsd.m();
        m240.m(1);
        m240.b("conversations.normalized_participant_contact_id");
        m240.i(58090);
        m240.c(new Supplier() { // from class: biuy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m240.j(new dtsc() { // from class: biuz
        });
        m240.a();
        dtsb m241 = dtsd.m();
        m241.m(4);
        m241.b("conversations.participant_lookup_key");
        m241.i(-1);
        m241.c(new Supplier() { // from class: biva
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m241.j(new dtsc() { // from class: bivb
        });
        m241.a();
        dtsb m242 = dtsd.m();
        m242.m(4);
        m242.b("conversations.normalized_participant_lookup_key");
        m242.i(58090);
        m242.c(new Supplier() { // from class: bivd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m242.j(new dtsc() { // from class: bive
        });
        m242.a();
        dtsb m243 = dtsd.m();
        m243.m(4);
        m243.l(true);
        m243.d(true);
        m243.b("conversations.participant_comparable_destination");
        m243.f(true);
        m243.i(58090);
        m243.c(new Supplier() { // from class: bivf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m243.j(new dtsc() { // from class: bivi
        });
        m243.a();
        dtsb m244 = dtsd.m();
        m244.m(4);
        m244.b("conversations.current_self_id");
        m244.i(-1);
        m244.c(new Supplier() { // from class: bivj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m244.j(new dtsc() { // from class: bivk
        });
        m244.a();
        dtsb m245 = dtsd.m();
        m245.m(4);
        m245.b("conversations.current_my_identity");
        m245.i(59810);
        m245.c(new Supplier() { // from class: bivl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m245.j(new dtsc() { // from class: bivm
        });
        m245.a();
        dtsb m246 = dtsd.m();
        m246.m(4);
        m246.d(true);
        m246.e(true);
        m246.h(new Supplier() { // from class: bivo
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m246.b("conversations.current_my_identity_foreign_key");
        m246.i(60160);
        m246.c(new Supplier() { // from class: bivp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m246.j(new dtsc() { // from class: bivq
        });
        m246.a();
        dtsb m247 = dtsd.m();
        m247.m(4);
        m247.d(true);
        m247.e(true);
        m247.h(new Supplier() { // from class: bivr
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.b.a;
            }
        });
        m247.b("conversations.destination_token");
        m247.i(60360);
        m247.c(new Supplier() { // from class: bivs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m247.j(new dtsc() { // from class: bivu
        });
        m247.a();
        dtsb m248 = dtsd.m();
        m248.m(1);
        m248.b("conversations.participant_count");
        m248.i(-1);
        m248.c(new Supplier() { // from class: bivv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m248.j(new dtsc() { // from class: bivw
        });
        m248.a();
        dtsb m249 = dtsd.m();
        m249.m(1);
        m249.b("conversations.notification_enabled");
        m249.i(-1);
        m249.c(new Supplier() { // from class: bivx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m249.j(new dtsc() { // from class: bivz
        });
        m249.a();
        dtsb m250 = dtsd.m();
        m250.m(4);
        m250.b("conversations.notification_sound_uri");
        m250.i(-1);
        m250.c(new Supplier() { // from class: biwa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m250.j(new dtsc() { // from class: biwb
        });
        m250.a();
        dtsb m251 = dtsd.m();
        m251.m(1);
        m251.b("conversations.notification_vibration");
        m251.i(-1);
        m251.c(new Supplier() { // from class: biwc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m251.j(new dtsc() { // from class: biwd
        });
        m251.a();
        dtsb m252 = dtsd.m();
        m252.m(1);
        m252.b("conversations.include_email_addr");
        m252.i(-1);
        m252.c(new Supplier() { // from class: biwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m252.j(new dtsc() { // from class: biwg
        });
        m252.a();
        dtsb m253 = dtsd.m();
        m253.m(4);
        m253.b("conversations.sms_service_center");
        m253.i(-1);
        m253.c(new Supplier() { // from class: biwh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m253.j(new dtsc() { // from class: biwi
        });
        m253.a();
        dtsb m254 = dtsd.m();
        m254.m(4);
        m254.b("conversations.participant_id_list");
        m254.i(8500);
        m254.c(new Supplier() { // from class: biwk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m254.j(new dtsc() { // from class: biwl
        });
        m254.a();
        dtsb m255 = dtsd.m();
        m255.m(4);
        m255.l(true);
        m255.d(true);
        m255.b("conversations.normalized_participant_id_list");
        m255.f(true);
        m255.i(58090);
        m255.c(new Supplier() { // from class: biwm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m255.j(new dtsc() { // from class: biwn
        });
        m255.a();
        dtsb m256 = dtsd.m();
        m256.m(1);
        m256.b("conversations.source_type");
        m256.i(8500);
        m256.c(new Supplier() { // from class: biwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m256.j(new dtsc() { // from class: biwp
        });
        m256.a();
        dtsb m257 = dtsd.m();
        m257.m(1);
        m257.d(true);
        m257.b("conversations.rcs_session_id");
        m257.i(10000);
        m257.c(new Supplier() { // from class: biwq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m257.j(new dtsc() { // from class: biws
        });
        m257.a();
        dtsb m258 = dtsd.m();
        m258.m(1);
        m258.b("conversations.join_state");
        m258.i(10006);
        m258.c(new Supplier() { // from class: biwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m258.j(new dtsc() { // from class: biwv
        });
        m258.a();
        dtsb m259 = dtsd.m();
        m259.m(1);
        m259.b("conversations.send_mode");
        m259.i(10016);
        m259.c(new Supplier() { // from class: biww
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m259.j(new dtsc() { // from class: biwx
        });
        m259.a();
        dtsb m260 = dtsd.m();
        m260.m(1);
        m260.b("conversations.IS_ENTERPRISE");
        m260.i(10018);
        m260.c(new Supplier() { // from class: biwy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m260.j(new dtsc() { // from class: biwz
        });
        m260.a();
        dtsb m261 = dtsd.m();
        m261.m(1);
        m261.b("conversations.last_interactive_event_timestamp");
        m261.i(15000);
        m261.c(new Supplier() { // from class: bixa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m261.j(new dtsc() { // from class: bixb
        });
        m261.a();
        dtsb m262 = dtsd.m();
        m262.m(4);
        m262.b("conversations.participant_display_destination");
        m262.i(15010);
        m262.c(new Supplier() { // from class: bixc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m262.j(new dtsc() { // from class: bixe
        });
        m262.a();
        dtsb m263 = dtsd.m();
        m263.m(4);
        m263.b("conversations.normalized_participant_display_destination");
        m263.i(58090);
        m263.c(new Supplier() { // from class: bixg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m263.j(new dtsc() { // from class: bixh
        });
        m263.a();
        dtsb m264 = dtsd.m();
        m264.m(1);
        m264.b("conversations.spam_warning_dismiss_status");
        m264.i(23000);
        m264.c(new Supplier() { // from class: bixi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m264.j(new dtsc() { // from class: bixj
        });
        m264.a();
        dtsb m265 = dtsd.m();
        m265.m(1);
        m265.b("conversations.open_count");
        m265.i(26020);
        m265.c(new Supplier() { // from class: bixk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m265.j(new dtsc() { // from class: bixl
        });
        m265.a();
        dtsb m266 = dtsd.m();
        m266.m(1);
        m266.b("conversations.last_logged_scooby_metadata_timestamp");
        m266.i(28010);
        m266.c(new Supplier() { // from class: bixm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m266.j(new dtsc() { // from class: bixn
        });
        m266.a();
        dtsb m267 = dtsd.m();
        m267.m(1);
        m267.d(true);
        m267.b("conversations.delete_timestamp");
        m267.i(29020);
        m267.c(new Supplier() { // from class: bixo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m267.j(new dtsc() { // from class: bixs
        });
        m267.a();
        dtsb m268 = dtsd.m();
        m268.m(4);
        m268.l(true);
        m268.d(true);
        m268.b("conversations.cms_id");
        m268.f(true);
        m268.i(32000);
        m268.c(new Supplier() { // from class: bixt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m268.j(new dtsc() { // from class: bixu
        });
        m268.a();
        dtsb m269 = dtsd.m();
        m269.m(5);
        m269.b("conversations.tachygram_group_routing_info_token");
        m269.i(58120);
        m269.c(new Supplier() { // from class: bixv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m269.j(new dtsc() { // from class: bixw
        });
        m269.a();
        dtsb m270 = dtsd.m();
        m270.m(1);
        m270.b("conversations.cms_most_recent_read_message_timestamp_ms");
        m270.i(53030);
        m270.c(new Supplier() { // from class: bixx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m270.j(new dtsc() { // from class: bixy
        });
        m270.a();
        dtsb m271 = dtsd.m();
        m271.m(2);
        m271.b("conversations.rcs_subject_change_timestamp_ms");
        m271.i(46050);
        m271.c(new Supplier() { // from class: bixz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m271.j(new dtsc() { // from class: biya
        });
        m271.a();
        dtsb m272 = dtsd.m();
        m272.m(2);
        m272.b("conversations.rcs_group_capabilities");
        m272.i(49020);
        m272.c(new Supplier() { // from class: biyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m272.j(new dtsc() { // from class: biye
        });
        m272.a();
        dtsb m273 = dtsd.m();
        m273.m(1);
        m273.b("conversations.awaiting_reverse_sync");
        m273.i(49060);
        m273.c(new Supplier() { // from class: biyf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m273.j(new dtsc() { // from class: biyg
        });
        m273.a();
        dtsb m274 = dtsd.m();
        m274.m(2);
        m274.d(true);
        m274.e(true);
        m274.h(new Supplier() { // from class: biyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m274.b("conversations.duplicate_of");
        m274.i(58090);
        m274.c(new Supplier() { // from class: biyi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m274.j(new dtsc() { // from class: biyj
        });
        m274.a();
        dtsb m275 = dtsd.m();
        m275.m(2);
        m275.d(true);
        m275.e(true);
        m275.h(new Supplier() { // from class: biyk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m275.b("conversations.new_duplicate_of");
        m275.i(59130);
        m275.c(new Supplier() { // from class: biyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m275.j(new dtsc() { // from class: biym
        });
        m275.a();
        dtsb m276 = dtsd.m();
        m276.m(1);
        m276.b("conversations.error_state");
        m276.i(58140);
        m276.c(new Supplier() { // from class: biyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m276.j(new dtsc() { // from class: biyq
        });
        m276.a();
        dtsb m277 = dtsd.m();
        m277.m(1);
        m277.b("conversations.cms_life_cycle");
        m277.i(58210);
        m277.c(new Supplier() { // from class: biyr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m277.j(new dtsc() { // from class: biys
        });
        m277.a();
        dtsb m278 = dtsd.m();
        m278.m(4);
        m278.b("conversations.rcs_group_self_msisdn");
        m278.i(58540);
        m278.c(new Supplier() { // from class: biyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m278.j(new dtsc() { // from class: biyu
        });
        m278.a();
        dtsb m279 = dtsd.m();
        m279.m(2);
        m279.b("conversations.rcs_group_last_sync_timestamp");
        m279.i(58910);
        m279.c(new Supplier() { // from class: biyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m279.j(new dtsc() { // from class: biyw
        });
        m279.a();
        dtsb m280 = dtsd.m();
        m280.m(1);
        m280.b("conversations.has_been_e2ee");
        m280.i(59210);
        m280.c(new Supplier() { // from class: biyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m280.j(new dtsc() { // from class: biyz
        });
        m280.a();
        dtsb m281 = dtsd.m();
        m281.m(1);
        m281.b("conversations.marked_as_unread");
        m281.i(59220);
        m281.c(new Supplier() { // from class: biza
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m281.j(new dtsc() { // from class: bizc
        });
        m281.a();
        dtsb m282 = dtsd.m();
        m282.m(5);
        m282.b("conversations.custom_theme");
        m282.i(59820);
        m282.c(new Supplier() { // from class: bizd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m282.j(new dtsc() { // from class: bize
        });
        m282.a();
        dtsb m283 = dtsd.m();
        m283.m(2);
        m283.b("conversations.mms_group_upgrade_status");
        m283.i(60050);
        m283.c(new Supplier() { // from class: bizf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m283.j(new dtsc() { // from class: bizg
        });
        m283.a();
        dtsb m284 = dtsd.m();
        m284.m(2);
        m284.b("conversations.mms_group_upgrade_retries");
        m284.i(60050);
        m284.c(new Supplier() { // from class: bizh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m284.j(new dtsc() { // from class: bizi
        });
        m284.a();
        dtsb m285 = dtsd.m();
        m285.m(2);
        m285.b("conversations.encryption_protocol");
        m285.i(60180);
        m285.c(new Supplier() { // from class: bizk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m285.j(new dtsc() { // from class: bizl
        });
        m285.a();
        dtsb m286 = dtsd.m();
        m286.m(4);
        m286.b("conversations.encryption_id");
        m286.i(60210);
        m286.c(new Supplier() { // from class: bizm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m286.j(new dtsc() { // from class: bizo
        });
        m286.a();
        dtsb m287 = dtsd.m();
        m287.m(4);
        m287.l(true);
        m287.d(true);
        m287.b("conversations.cms_correlation_id");
        m287.f(true);
        m287.i(60250);
        m287.c(new Supplier() { // from class: bizp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m287.j(new dtsc() { // from class: bizq
        });
        m287.a();
        dtsb m288 = dtsd.m();
        m288.m(4);
        m288.b("conversations.rcs_group_icon_url");
        m288.i(60590);
        m288.c(new Supplier() { // from class: bizr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m288.j(new dtsc() { // from class: bizs
        });
        m288.a();
        dtsb m289 = dtsd.m();
        m289.m(2);
        m289.b("conversations.unread_count");
        m289.i(60740);
        m289.c(new Supplier() { // from class: bizt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m289.j(new dtsc() { // from class: bizv
        });
        m289.a();
        dtsb m290 = dtsd.m();
        m290.m(5);
        m290.b("message_reactions.reactions_data");
        m290.i(-1);
        m290.c(new Supplier() { // from class: bizw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m290.j(new dtsc() { // from class: bizx
        });
        m290.a();
        dtsb m291 = dtsd.m();
        m291.m(2);
        m291.l(true);
        m291.g(true);
        m291.d(true);
        m291.b("message_reactions._id");
        m291.i(-1);
        m291.c(new Supplier() { // from class: bizy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m291.j(new dtsc() { // from class: bjab
        });
        m291.a();
        dtsb m292 = dtsd.m();
        m292.m(2);
        m292.l(true);
        m292.d(true);
        m292.e(true);
        m292.h(new Supplier() { // from class: bjac
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m292.b("message_reactions.message_id");
        m292.i(-1);
        m292.c(new Supplier() { // from class: bjad
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m292.j(new dtsc() { // from class: bjae
        });
        m292.a();
        dtsb m293 = dtsd.m();
        m293.m(2);
        m293.d(true);
        m293.e(true);
        m293.h(new Supplier() { // from class: bjag
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m293.b("message_reactions.reacted_message_id");
        m293.i(46020);
        m293.c(new Supplier() { // from class: bjah
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m293.j(new dtsc() { // from class: bjai
        });
        m293.a();
        dtsb m294 = dtsd.m();
        m294.m(2);
        m294.b("message_reactions.reaction");
        m294.i(48000);
        m294.c(new Supplier() { // from class: bjaj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m294.j(new dtsc() { // from class: bjak
        });
        m294.a();
        dtsb m295 = dtsd.m();
        m295.m(5);
        m295.b("message_reactions.applied_reaction");
        m295.i(59060);
        m295.c(new Supplier() { // from class: bjal
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m295.j(new dtsc() { // from class: bjan
        });
        m295.a();
        dtsb m296 = dtsd.m();
        m296.m(5);
        m296.d(true);
        m296.b("message_reactions.animation_effect");
        m296.i(59520);
        m296.c(new Supplier() { // from class: bjao
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m296.j(new dtsc() { // from class: bjap
        });
        m296.a();
        dtsb m297 = dtsd.m();
        m297.m(4);
        m297.d(true);
        m297.b("file_transfer.transfer_id");
        m297.i(-1);
        m297.c(new Supplier() { // from class: bjar
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m297.j(new dtsc() { // from class: bjas
        });
        m297.a();
        dtsb m298 = dtsd.m();
        m298.m(1);
        m298.l(true);
        m298.g(true);
        m298.d(true);
        m298.e(true);
        m298.h(new Supplier() { // from class: bjat
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m298.b("file_transfer.message_id");
        m298.i(-1);
        m298.c(new Supplier() { // from class: bjau
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m298.j(new dtsc() { // from class: bjav
        });
        m298.a();
        dtsb m299 = dtsd.m();
        m299.m(1);
        m299.b("file_transfer.transfer_type");
        m299.i(-1);
        m299.c(new Supplier() { // from class: bjaw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m299.j(new dtsc() { // from class: bjax
        });
        m299.a();
        dtsb m300 = dtsd.m();
        m300.m(5);
        m300.b("file_transfer.attachment_upload_response");
        m300.i(-1);
        m300.c(new Supplier() { // from class: bjaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m300.j(new dtsc() { // from class: bjba
        });
        m300.a();
        dtsb m301 = dtsd.m();
        m301.m(5);
        m301.b("file_transfer.file_information");
        m301.i(55030);
        m301.c(new Supplier() { // from class: bjbc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m301.j(new dtsc() { // from class: bjbd
        });
        m301.a();
        dtsb m302 = dtsd.m();
        m302.m(5);
        m302.b("file_transfer.thumbnail_information");
        m302.i(59910);
        m302.c(new Supplier() { // from class: bjbe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m302.j(new dtsc() { // from class: bjbf
        });
        m302.a();
        dtsb m303 = dtsd.m();
        m303.m(4);
        m303.b("file_transfer.transfer_handle");
        m303.i(55030);
        m303.c(new Supplier() { // from class: bjbg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m303.j(new dtsc() { // from class: bjbh
        });
        m303.a();
        dtsb m304 = dtsd.m();
        m304.m(5);
        m304.b("file_transfer.opaque_data");
        m304.i(56040);
        m304.c(new Supplier() { // from class: bjbi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m304.j(new dtsc() { // from class: bjbj
        });
        m304.a();
        dtsb m305 = dtsd.m();
        m305.m(2);
        m305.l(true);
        m305.d(true);
        m305.e(true);
        m305.h(new Supplier() { // from class: bjbl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m305.b("message_star.message_id");
        m305.f(true);
        m305.i(-1);
        m305.c(new Supplier() { // from class: bjbn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m305.j(new dtsc() { // from class: bjbo
        });
        m305.a();
        dtsb m306 = dtsd.m();
        m306.m(2);
        m306.l(true);
        m306.g(true);
        m306.d(true);
        m306.b("message_star._id");
        m306.i(-1);
        m306.c(new Supplier() { // from class: bjbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m306.j(new dtsc() { // from class: bjbq
        });
        m306.a();
        dtsb m307 = dtsd.m();
        m307.m(5);
        m307.b("message_photos_sharing.sharing_state");
        m307.i(-1);
        m307.c(new Supplier() { // from class: bjbr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m307.j(new dtsc() { // from class: bjbs
        });
        m307.a();
        dtsb m308 = dtsd.m();
        m308.m(2);
        m308.l(true);
        m308.d(true);
        m308.e(true);
        m308.h(new Supplier() { // from class: bjbt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m308.b("message_photos_sharing.message_id");
        m308.f(true);
        m308.i(-1);
        m308.c(new Supplier() { // from class: bjbu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m308.j(new dtsc() { // from class: bjbv
        });
        m308.a();
        dtsb m309 = dtsd.m();
        m309.m(2);
        m309.l(true);
        m309.d(true);
        m309.e(true);
        m309.h(new Supplier() { // from class: bjbz
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d.a;
            }
        });
        m309.b("vmt.part_id");
        m309.f(true);
        m309.i(-1);
        m309.c(new Supplier() { // from class: bjca
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m309.j(new dtsc() { // from class: bjcb
        });
        m309.a();
        dtsb m310 = dtsd.m();
        m310.m(2);
        m310.b("vmt.vmt_status");
        m310.i(-1);
        m310.c(new Supplier() { // from class: bjcc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m310.j(new dtsc() { // from class: bjcd
        });
        m310.a();
        dtsb m311 = dtsd.m();
        m311.m(4);
        m311.b("vmt.text");
        m311.i(-1);
        m311.c(new Supplier() { // from class: bjce
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m311.j(new dtsc() { // from class: bjcf
        });
        m311.a();
        dtsb m312 = dtsd.m();
        m312.m(4);
        m312.b("vmt.locale");
        m312.i(-1);
        m312.c(new Supplier() { // from class: bjcg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m312.j(new dtsc() { // from class: bjch
        });
        m312.a();
        dtsb m313 = dtsd.m();
        m313.m(8);
        m313.b("vmt__ROWID");
        m313.i(0);
        m313.c(new Supplier() { // from class: bjci
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m313.j(new dtsc() { // from class: bjcl
        });
        m313.a();
        dtsb m314 = dtsd.m();
        m314.m(2);
        m314.l(true);
        m314.k(true);
        m314.d(true);
        m314.e(true);
        m314.h(new Supplier() { // from class: bjcm
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m314.b("message_replies_view.message_id_message_replies");
        m314.f(true);
        m314.i(0);
        m314.c(new Supplier() { // from class: bjcn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m314.j(new dtsc() { // from class: bjco
        });
        m314.a();
        dtsb m315 = dtsd.m();
        m315.m(2);
        m315.d(true);
        m315.b("message_replies_view._id_messages");
        m315.i(0);
        m315.c(new Supplier() { // from class: bjcp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m315.j(new dtsc() { // from class: bjcq
        });
        m315.a();
        dtsb m316 = dtsd.m();
        m316.m(1);
        m316.d(true);
        m316.b("message_replies_view.received_timestamp_messages");
        m316.i(0);
        m316.c(new Supplier() { // from class: bjcr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m316.j(new dtsc() { // from class: bjcs
        });
        m316.a();
        dtsb m317 = dtsd.m();
        m317.m(2);
        m317.d(true);
        m317.b("message_replies_view._id_participants");
        m317.i(0);
        m317.c(new Supplier() { // from class: bjct
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m317.j(new dtsc() { // from class: bjcv
        });
        m317.a();
        dtsb m318 = dtsd.m();
        m318.m(1);
        m318.d(true);
        m318.b("message_replies_view.sub_id_participants");
        m318.f(true);
        m318.i(0);
        m318.c(new Supplier() { // from class: bjcx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m318.j(new dtsc() { // from class: bjcy
        });
        m318.a();
        dtsb m319 = dtsd.m();
        m319.m(4);
        m319.d(true);
        m319.b("message_replies_view.normalized_destination_participants");
        m319.f(true);
        m319.i(0);
        m319.c(new Supplier() { // from class: bjcz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m319.j(new dtsc() { // from class: bjda
        });
        m319.a();
        dtsb m320 = dtsd.m();
        m320.m(4);
        m320.b("message_replies_view.display_destination_participants");
        m320.i(0);
        m320.c(new Supplier() { // from class: bjdb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m320.j(new dtsc() { // from class: bjdc
        });
        m320.a();
        dtsb m321 = dtsd.m();
        m321.m(4);
        m321.b("message_replies_view.full_name_participants");
        m321.i(0);
        m321.c(new Supplier() { // from class: bjdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m321.j(new dtsc() { // from class: bjde
        });
        m321.a();
        dtsb m322 = dtsd.m();
        m322.m(4);
        m322.b("message_replies_view.first_name_participants");
        m322.i(0);
        m322.c(new Supplier() { // from class: bjdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m322.j(new dtsc() { // from class: bjdh
        });
        m322.a();
        dtsb m323 = dtsd.m();
        m323.m(2);
        m323.d(true);
        m323.b("message_replies_view._id_parts");
        m323.i(0);
        m323.c(new Supplier() { // from class: bjdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m323.j(new dtsc() { // from class: bjdk
        });
        m323.a();
        dtsb m324 = dtsd.m();
        m324.m(4);
        m324.b("message_replies_view.text_parts");
        m324.i(0);
        m324.c(new Supplier() { // from class: bjdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m324.j(new dtsc() { // from class: bjdm
        });
        m324.a();
        dtsb m325 = dtsd.m();
        m325.m(4);
        m325.b("message_replies_view.uri_parts");
        m325.i(0);
        m325.c(new Supplier() { // from class: bjdn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m325.j(new dtsc() { // from class: bjdo
        });
        m325.a();
        dtsb m326 = dtsd.m();
        m326.m(4);
        m326.d(true);
        m326.b("message_replies_view.content_type_parts");
        m326.i(0);
        m326.c(new Supplier() { // from class: bjdp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m326.j(new dtsc() { // from class: bjdr
        });
        m326.a();
        dtsb m327 = dtsd.m();
        m327.m(4);
        m327.b("message_replies_view.file_name_parts");
        m327.i(0);
        m327.c(new Supplier() { // from class: bjds
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m327.j(new dtsc() { // from class: bjdt
        });
        m327.a();
        dtsb m328 = dtsd.m();
        m328.m(1);
        m328.b("message_replies_view.duration_parts");
        m328.i(0);
        m328.c(new Supplier() { // from class: bjdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m328.j(new dtsc() { // from class: bjdw
        });
        m328.a();
        dtsb m329 = dtsd.m();
        m329.m(8);
        m329.b("message_replies_view.parts__ROWID_parts");
        m329.i(0);
        m329.c(new Supplier() { // from class: bjdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m329.j(new dtsc() { // from class: bjdy
        });
        m329.a();
        dtsb m330 = dtsd.m();
        m330.m(4);
        m330.k(true);
        m330.b("message_replies_view.trigger_url_link_preview");
        m330.i(0);
        m330.c(new Supplier() { // from class: bjdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m330.j(new dtsc() { // from class: bjea
        });
        m330.a();
        dtsb m331 = dtsd.m();
        m331.m(2);
        m331.b("message_replies_view.expiration_time_millis_link_preview");
        m331.i(0);
        m331.c(new Supplier() { // from class: bjec
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m331.j(new dtsc() { // from class: bjed
        });
        m331.a();
        dtsb m332 = dtsd.m();
        m332.m(4);
        m332.b("message_replies_view.link_title_link_preview");
        m332.i(0);
        m332.c(new Supplier() { // from class: bjee
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m332.j(new dtsc() { // from class: bjef
        });
        m332.a();
        dtsb m333 = dtsd.m();
        m333.m(4);
        m333.b("message_replies_view.link_image_url_link_preview");
        m333.i(0);
        m333.c(new Supplier() { // from class: bjeh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m333.j(new dtsc() { // from class: bjei
        });
        m333.a();
        dtsb m334 = dtsd.m();
        m334.m(2);
        m334.b("message_replies_view.link_preview_failed_link_preview");
        m334.i(0);
        m334.c(new Supplier() { // from class: bjej
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m334.j(new dtsc() { // from class: bjek
        });
        m334.a();
        dtsb m335 = dtsd.m();
        m335.m(4);
        m335.b("profiles_table.display_name");
        m335.i(-1);
        m335.c(new Supplier() { // from class: bjel
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m335.j(new dtsc() { // from class: bjen
        });
        m335.a();
        dtsb m336 = dtsd.m();
        m336.m(2);
        m336.l(true);
        m336.g(true);
        m336.d(true);
        m336.b("profiles_table._id");
        m336.i(-1);
        m336.c(new Supplier() { // from class: bjeo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m336.j(new dtsc() { // from class: bjep
        });
        m336.a();
        dtsb m337 = dtsd.m();
        m337.m(2);
        m337.d(true);
        m337.e(true);
        m337.h(new Supplier() { // from class: bjeq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m337.b("profiles_table.participant_id");
        m337.i(-1);
        m337.c(new Supplier() { // from class: bjer
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m337.j(new dtsc() { // from class: bjeu
        });
        m337.a();
        dtsb m338 = dtsd.m();
        m338.m(4);
        m338.b("profiles_table.person_id");
        m338.i(60170);
        m338.c(new Supplier() { // from class: bjev
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m338.j(new dtsc() { // from class: bjew
        });
        m338.a();
        dtsb m339 = dtsd.m();
        m339.m(4);
        m339.b("profiles_table.profile_access_token");
        m339.i(60170);
        m339.c(new Supplier() { // from class: bjey
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m339.j(new dtsc() { // from class: bjez
        });
        m339.a();
        dtsb m340 = dtsd.m();
        m340.m(2);
        m340.b("profiles_table.sending_self_profile_interaction_state");
        m340.i(60200);
        m340.c(new Supplier() { // from class: bjfa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m340.j(new dtsc() { // from class: bjfb
        });
        m340.a();
        dtsb m341 = dtsd.m();
        m341.m(5);
        m341.b("profiles_table.self_profile_sharing_metadata");
        m341.i(60340);
        m341.c(new Supplier() { // from class: bjfc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m341.j(new dtsc() { // from class: bjfd
        });
        m341.a();
        dtsb m342 = dtsd.m();
        m342.m(4);
        m342.b("profiles_table.first_name");
        m342.i(-1);
        m342.c(new Supplier() { // from class: bjfe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m342.j(new dtsc() { // from class: bjfg
        });
        m342.a();
        dtsb m343 = dtsd.m();
        m343.m(4);
        m343.b("profiles_table.last_name");
        m343.i(-1);
        m343.c(new Supplier() { // from class: bjfh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m343.j(new dtsc() { // from class: bjfj
        });
        m343.a();
        dtsb m344 = dtsd.m();
        m344.m(4);
        m344.b("profiles_table.photo_uri");
        m344.i(-1);
        m344.c(new Supplier() { // from class: bjfk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m344.j(new dtsc() { // from class: bjfl
        });
        m344.a();
        dtsb m345 = dtsd.m();
        m345.m(4);
        m345.b("profiles_table.sender_last_updated_time");
        m345.i(60170);
        m345.c(new Supplier() { // from class: bjfm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m345.j(new dtsc() { // from class: bjfn
        });
        m345.a();
        dtsb m346 = dtsd.m();
        m346.m(4);
        m346.b("profiles_table.sender_last_updated_time_from_rcs");
        m346.i(60200);
        m346.c(new Supplier() { // from class: bjfo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m346.j(new dtsc() { // from class: bjfp
        });
        m346.a();
        dtsb m347 = dtsd.m();
        m347.m(4);
        m347.d(true);
        m347.b("profiles_table.contact_lookup_key");
        m347.i(-1);
        m347.c(new Supplier() { // from class: bjfq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m347.j(new dtsc() { // from class: bjfs
        });
        m347.a();
        dtsb m348 = dtsd.m();
        m348.m(4);
        m348.d(true);
        m348.b("profiles_table.phone_number");
        m348.i(-1);
        m348.c(new Supplier() { // from class: bjfu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m348.j(new dtsc() { // from class: bjfv
        });
        m348.a();
        dtsb m349 = dtsd.m();
        m349.m(1);
        m349.b("profiles_table.is_self_profile_shareable");
        m349.i(60400);
        m349.c(new Supplier() { // from class: bjfw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m349.j(new dtsc() { // from class: bjfx
        });
        m349.a();
        dtsb m350 = dtsd.m();
        m350.m(2);
        m350.b("profiles_table.has_shared_access_token_with_user");
        m350.i(60170);
        m350.c(new Supplier() { // from class: bjfy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m350.j(new dtsc() { // from class: bjfz
        });
        m350.a();
        dtsb m351 = dtsd.m();
        m351.m(1);
        m351.b("profiles_table.name_timestamp");
        m351.i(-1);
        m351.c(new Supplier() { // from class: bjga
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m351.j(new dtsc() { // from class: bjgb
        });
        m351.a();
        dtsb m352 = dtsd.m();
        m352.m(1);
        m352.b("profiles_table.photo_timestamp");
        m352.i(-1);
        m352.c(new Supplier() { // from class: bjgc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m352.j(new dtsc() { // from class: bjgg
        });
        m352.a();
        dtsb m353 = dtsd.m();
        m353.m(1);
        m353.b("profiles_table.belongs_to_self_gaia");
        m353.i(59940);
        m353.c(new Supplier() { // from class: bjgh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m353.j(new dtsc() { // from class: bjgi
        });
        m353.a();
        dtsb m354 = dtsd.m();
        m354.m(1);
        m354.b("profiles_table.gaia_update_timestamp");
        m354.i(59940);
        m354.c(new Supplier() { // from class: bjgj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m354.j(new dtsc() { // from class: bjgk
        });
        m354.a();
        dtsb m355 = dtsd.m();
        m355.m(4);
        m355.b("message_captions.caption");
        m355.i(-1);
        m355.c(new Supplier() { // from class: bjgl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m355.j(new dtsc() { // from class: bjgm
        });
        m355.a();
        dtsb m356 = dtsd.m();
        m356.m(2);
        m356.l(true);
        m356.d(true);
        m356.e(true);
        m356.h(new Supplier() { // from class: bjgn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m356.b("message_captions.message_id");
        m356.f(true);
        m356.i(-1);
        m356.c(new Supplier() { // from class: bjgo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjjn.b();
            }
        });
        m356.j(new dtsc() { // from class: bjgp
        });
        m356.a();
    }
}

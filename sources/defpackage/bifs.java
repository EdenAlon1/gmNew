package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bifs {
    public final bift a;

    public bifs() {
        dtsb m = dtsd.m();
        m.m(2);
        m.l(true);
        m.g(true);
        m.d(true);
        m.b("messages._id");
        m.i(-1);
        m.c(new Supplier() { // from class: bgms
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m.j(new dtsc() { // from class: bhaz
        });
        m.a();
        dtsb m2 = dtsd.m();
        m2.m(1);
        m2.d(true);
        m2.e(true);
        m2.h(new Supplier() { // from class: bhfs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m2.b("messages.conversation_id");
        m2.i(-1);
        m2.c(new Supplier() { // from class: bhkm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m2.j(new dtsc() { // from class: bhpf
        });
        m2.a();
        dtsb m3 = dtsd.m();
        m3.m(1);
        m3.d(true);
        m3.e(true);
        m3.h(new Supplier() { // from class: bhty
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m3.b("messages.sender_id");
        m3.i(-1);
        m3.c(new Supplier() { // from class: bhyr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m3.j(new dtsc() { // from class: bidk
        });
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(1);
        m4.d(true);
        m4.b("messages.sent_timestamp");
        m4.i(-1);
        m4.c(new Supplier() { // from class: bgpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m4.j(new dtsc() { // from class: bgtx
        });
        m4.a();
        dtsb m5 = dtsd.m();
        m5.m(1);
        m5.d(true);
        m5.b("messages.received_timestamp");
        m5.i(-1);
        m5.c(new Supplier() { // from class: bgrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m5.j(new dtsc() { // from class: bgxe
        });
        this.a = new bift(m5.a());
        dtsb m6 = dtsd.m();
        m6.m(1);
        m6.b("messages.message_protocol");
        m6.i(-1);
        m6.c(new Supplier() { // from class: bgxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m6.j(new dtsc() { // from class: bgyd
        });
        m6.a();
        dtsb m7 = dtsd.m();
        m7.m(1);
        m7.d(true);
        m7.b("messages.message_status");
        m7.i(-1);
        m7.c(new Supplier() { // from class: bgyp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m7.j(new dtsc() { // from class: bgzb
        });
        m7.a();
        dtsb m8 = dtsd.m();
        m8.m(1);
        m8.b("messages.message_report_status");
        m8.i(13020);
        m8.c(new Supplier() { // from class: bgzn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m8.j(new dtsc() { // from class: bgzz
        });
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(1);
        m9.d(true);
        m9.b("messages.seen");
        m9.f(true);
        m9.i(-1);
        m9.c(new Supplier() { // from class: bhal
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m9.j(new dtsc() { // from class: bhay
        });
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(1);
        m10.d(true);
        m10.b("messages.read");
        m10.i(-1);
        m10.c(new Supplier() { // from class: bhbl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m10.j(new dtsc() { // from class: bhby
        });
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(4);
        m11.d(true);
        m11.b("messages.sms_message_uri");
        m11.i(-1);
        m11.c(new Supplier() { // from class: bhck
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m11.j(new dtsc() { // from class: bhcw
        });
        m11.a();
        dtsb m12 = dtsd.m();
        m12.m(1);
        m12.b("messages.sms_priority");
        m12.i(-1);
        m12.c(new Supplier() { // from class: bhdi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m12.j(new dtsc() { // from class: bhdu
        });
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(1);
        m13.b("messages.sms_message_size");
        m13.i(-1);
        m13.c(new Supplier() { // from class: bheg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m13.j(new dtsc() { // from class: bhes
        });
        m13.a();
        dtsb m14 = dtsd.m();
        m14.m(4);
        m14.b("messages.mms_subject");
        m14.i(-1);
        m14.c(new Supplier() { // from class: bhff
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m14.j(new dtsc() { // from class: bhfr
        });
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(1);
        m15.b("messages.mms_expiry");
        m15.i(-1);
        m15.c(new Supplier() { // from class: bhgf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m15.j(new dtsc() { // from class: bhgr
        });
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(1);
        m16.d(true);
        m16.b("messages.rcs_expiry");
        m16.i(59890);
        m16.c(new Supplier() { // from class: bhhd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m16.j(new dtsc() { // from class: bhhp
        });
        m16.a();
        dtsb m17 = dtsd.m();
        m17.m(4);
        m17.b("messages.mms_retrieve_text");
        m17.i(9030);
        m17.c(new Supplier() { // from class: bhib
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m17.j(new dtsc() { // from class: bhin
        });
        m17.a();
        dtsb m18 = dtsd.m();
        m18.m(1);
        m18.b("messages.raw_status");
        m18.i(-1);
        m18.c(new Supplier() { // from class: bhiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m18.j(new dtsc() { // from class: bhjm
        });
        m18.a();
        dtsb m19 = dtsd.m();
        m19.m(1);
        m19.d(true);
        m19.e(true);
        m19.h(new Supplier() { // from class: bhjy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m19.b("messages.self_id");
        m19.i(-1);
        m19.c(new Supplier() { // from class: bhkl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m19.j(new dtsc() { // from class: bhky
        });
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(4);
        m20.d(true);
        m20.b("messages.rcs_message_id_with_text_type");
        m20.f(true);
        m20.i(41040);
        m20.c(new Supplier() { // from class: bhlk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m20.j(new dtsc() { // from class: bhlw
        });
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(1);
        m21.b("messages.etouffee_status");
        m21.i(29060);
        m21.c(new Supplier() { // from class: bhmi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m21.j(new dtsc() { // from class: bhmu
        });
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(1);
        m22.b("messages.verification_status");
        m22.i(29090);
        m22.c(new Supplier() { // from class: bhng
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m22.j(new dtsc() { // from class: bhnt
        });
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(1);
        m23.d(true);
        m23.b("messages.is_hidden");
        m23.i(30010);
        m23.c(new Supplier() { // from class: bhof
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m23.j(new dtsc() { // from class: bhos
        });
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(1);
        m24.b("messages.rcs_file_transfer_session_id");
        m24.i(10004);
        m24.c(new Supplier() { // from class: bhpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m24.j(new dtsc() { // from class: bhpr
        });
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(1);
        m25.b("messages.sms_error_code");
        m25.i(9000);
        m25.c(new Supplier() { // from class: bhqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m25.j(new dtsc() { // from class: bhqp
        });
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(4);
        m26.b("messages.sms_error_desc_map_name");
        m26.i(9000);
        m26.c(new Supplier() { // from class: bhrb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m26.j(new dtsc() { // from class: bhrn
        });
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(4);
        m27.l(true);
        m27.d(true);
        m27.b("messages.cms_id");
        m27.f(true);
        m27.i(31010);
        m27.c(new Supplier() { // from class: bhsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m27.j(new dtsc() { // from class: bhsm
        });
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(4);
        m28.d(true);
        m28.b("messages.web_id");
        m28.i(19020);
        m28.c(new Supplier() { // from class: bhsz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m28.j(new dtsc() { // from class: bhtl
        });
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(1);
        m29.b("messages.usage_stats_logging_id");
        m29.i(29100);
        m29.c(new Supplier() { // from class: bhtx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m29.j(new dtsc() { // from class: bhuk
        });
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(4);
        m30.d(true);
        m30.b("messages.original_rcs_message_id");
        m30.i(35030);
        m30.c(new Supplier() { // from class: bhuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m30.j(new dtsc() { // from class: bhvi
        });
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(1);
        m31.b("messages.result_code");
        m31.i(58040);
        m31.c(new Supplier() { // from class: bhvu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m31.j(new dtsc() { // from class: bhwh
        });
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(1);
        m32.b("messages.cms_life_cycle");
        m32.i(58210);
        m32.c(new Supplier() { // from class: bhwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m32.j(new dtsc() { // from class: bhxg
        });
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(1);
        m33.b("messages.fallback_reason");
        m33.i(58710);
        m33.c(new Supplier() { // from class: bhxs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m33.j(new dtsc() { // from class: bhye
        });
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(5);
        m34.b("messages.trace_id");
        m34.i(58680);
        m34.c(new Supplier() { // from class: bhyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m34.j(new dtsc() { // from class: bhzd
        });
        m34.a();
        dtsb m35 = dtsd.m();
        m35.m(1);
        m35.b("messages.xms_transport");
        m35.i(59310);
        m35.c(new Supplier() { // from class: bhzp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m35.j(new dtsc() { // from class: biab
        });
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(4);
        m36.b("messages.sender_send_destination");
        m36.i(54040);
        m36.c(new Supplier() { // from class: biao
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m36.j(new dtsc() { // from class: biba
        });
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(4);
        m37.b("messages.msisdn_receiving_rcs_message");
        m37.i(59340);
        m37.c(new Supplier() { // from class: bibn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m37.j(new dtsc() { // from class: bibz
        });
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(4);
        m38.b("messages.receiving_network_country");
        m38.i(54040);
        m38.c(new Supplier() { // from class: bicl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m38.j(new dtsc() { // from class: bicx
        });
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(1);
        m39.b("messages.queue_insert_timestamp");
        m39.i(17030);
        m39.c(new Supplier() { // from class: bidj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m39.j(new dtsc() { // from class: bidw
        });
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(4);
        m40.b("messages.mms_transaction_id");
        m40.i(-1);
        m40.c(new Supplier() { // from class: biei
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m40.j(new dtsc() { // from class: biev
        });
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(4);
        m41.b("messages.mms_content_location");
        m41.i(-1);
        m41.c(new Supplier() { // from class: bifh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m41.j(new dtsc() { // from class: bgmv
        });
        m41.a();
        dtsb m42 = dtsd.m();
        m42.m(4);
        m42.d(true);
        m42.b("messages.my_identity");
        m42.i(59810);
        m42.c(new Supplier() { // from class: bgnh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m42.j(new dtsc() { // from class: bgnt
        });
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(4);
        m43.d(true);
        m43.e(true);
        m43.h(new Supplier() { // from class: bgof
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m43.b("messages.my_identity_foreign_key");
        m43.i(60160);
        m43.c(new Supplier() { // from class: bgor
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m43.j(new dtsc() { // from class: bgpd
        });
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(1);
        m44.b("messages.retry_start_timestamp");
        m44.i(-1);
        m44.c(new Supplier() { // from class: bgpq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m44.j(new dtsc() { // from class: bgqd
        });
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(4);
        m45.d(true);
        m45.b("messages.cloud_sync_id");
        m45.i(8500);
        m45.c(new Supplier() { // from class: bgqp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m45.j(new dtsc() { // from class: bgrc
        });
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(7);
        m46.d(true);
        m46.b("messages.rcs_message_id");
        m46.f(true);
        m46.i(10000);
        m46.c(new Supplier() { // from class: bgro
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m46.j(new dtsc() { // from class: bgsa
        });
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(1);
        m47.b("messages.rcs_ui_status");
        m47.i(39000);
        m47.c(new Supplier() { // from class: bgsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m47.j(new dtsc() { // from class: bgsy
        });
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(7);
        m48.b("messages.rcs_remote_instance");
        m48.i(10002);
        m48.c(new Supplier() { // from class: bgtk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m48.j(new dtsc() { // from class: bgtw
        });
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(4);
        m49.b("messages.correlation_id");
        m49.i(9010);
        m49.c(new Supplier() { // from class: bguc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m49.j(new dtsc() { // from class: bgyu
        });
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(2);
        m50.b("messages.cms_last_mod_seq");
        m50.i(37040);
        m50.c(new Supplier() { // from class: bhdm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m50.j(new dtsc() { // from class: bhie
        });
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(1);
        m51.b("messages.send_counter");
        m51.i(35030);
        m51.c(new Supplier() { // from class: bhmw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m51.j(new dtsc() { // from class: bhro
        });
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(4);
        m52.b("messages.custom_delivery_receipt_mime_type");
        m52.i(37020);
        m52.c(new Supplier() { // from class: bhwg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m52.j(new dtsc() { // from class: biay
        });
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(5);
        m53.b("messages.custom_delivery_receipt_content");
        m53.i(37020);
        m53.c(new Supplier() { // from class: bifq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m53.j(new dtsc() { // from class: bgrk
        });
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(1);
        m54.b("messages.report_attempt_acounter");
        m54.i(37030);
        m54.c(new Supplier() { // from class: bguf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m54.j(new dtsc() { // from class: bgur
        });
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(5);
        m55.b("messages.custom_headers");
        m55.i(45020);
        m55.c(new Supplier() { // from class: bgvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m55.j(new dtsc() { // from class: bgvp
        });
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(4);
        m56.l(true);
        m56.d(true);
        m56.b("messages.cms_correlation_id");
        m56.f(true);
        m56.i(46010);
        m56.c(new Supplier() { // from class: bgwb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m56.j(new dtsc() { // from class: bgwn
        });
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(1);
        m57.d(true);
        m57.e(true);
        m57.h(new Supplier() { // from class: bgwz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m57.b("messages.group_private_participant");
        m57.i(48030);
        m57.c(new Supplier() { // from class: bgxa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m57.j(new dtsc() { // from class: bgxc
        });
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(1);
        m58.d(true);
        m58.e(true);
        m58.h(new Supplier() { // from class: bgxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m58.b("messages.original_message_id");
        m58.i(48030);
        m58.c(new Supplier() { // from class: bgxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m58.j(new dtsc() { // from class: bgxg
        });
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(1);
        m59.b("messages.awaiting_reverse_sync");
        m59.i(49060);
        m59.c(new Supplier() { // from class: bgxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m59.j(new dtsc() { // from class: bgxi
        });
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(4);
        m60.b("messages.old_sms_message_uri");
        m60.i(49060);
        m60.c(new Supplier() { // from class: bgxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m60.j(new dtsc() { // from class: bgxk
        });
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(4);
        m61.l(true);
        m61.d(true);
        m61.b("messages.draft_id");
        m61.f(true);
        m61.i(56000);
        m61.c(new Supplier() { // from class: bgxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m61.j(new dtsc() { // from class: bgxo
        });
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(1);
        m62.b("messages.mute_priority");
        m62.i(60750);
        m62.c(new Supplier() { // from class: bgxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m62.j(new dtsc() { // from class: bgxq
        });
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(1);
        m63.b("messages.auto_retry_counter");
        m63.i(58230);
        m63.c(new Supplier() { // from class: bgxs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m63.j(new dtsc() { // from class: bgxt
        });
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(2);
        m64.b("messages.can_revoke_before_delivered_with_rcs");
        m64.i(58280);
        m64.c(new Supplier() { // from class: bgxu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m64.j(new dtsc() { // from class: bgxv
        });
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(1);
        m65.b("messages.outgoing_delivery_report_status");
        m65.i(58720);
        m65.c(new Supplier() { // from class: bgxw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m65.j(new dtsc() { // from class: bgxx
        });
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(1);
        m66.b("messages.outgoing_read_report_status");
        m66.i(58720);
        m66.c(new Supplier() { // from class: bgxz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m66.j(new dtsc() { // from class: bgya
        });
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(1);
        m67.b("messages.message_original_protocol");
        m67.i(59430);
        m67.c(new Supplier() { // from class: bgyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m67.j(new dtsc() { // from class: bgyc
        });
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(4);
        m68.l(true);
        m68.d(true);
        m68.b("messages.satellite_datagram_id");
        m68.f(true);
        m68.i(59490);
        m68.c(new Supplier() { // from class: bgye
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m68.j(new dtsc() { // from class: bgyf
        });
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(1);
        m69.b("messages.encryption_protocol");
        m69.i(60190);
        m69.c(new Supplier() { // from class: bgyg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m69.j(new dtsc() { // from class: bgyh
        });
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(4);
        m70.l(true);
        m70.d(true);
        m70.b("messages.message_persistence_id");
        m70.f(true);
        m70.i(60370);
        m70.c(new Supplier() { // from class: bgyi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m70.j(new dtsc() { // from class: bgyk
        });
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(8);
        m71.b("user_ref_display_name");
        m71.i(0);
        m71.c(new Supplier() { // from class: bgyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m71.j(new dtsc() { // from class: bgym
        });
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(8);
        m72.b("user_ref_profile_photo_uri");
        m72.i(0);
        m72.c(new Supplier() { // from class: bgyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m72.j(new dtsc() { // from class: bgyo
        });
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(8);
        m73.b("user_ref_full_name");
        m73.i(0);
        m73.c(new Supplier() { // from class: bgyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m73.j(new dtsc() { // from class: bgyr
        });
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(8);
        m74.b("user_ref_lookup_key");
        m74.i(0);
        m74.c(new Supplier() { // from class: bgys
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m74.j(new dtsc() { // from class: bgyt
        });
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(8);
        m75.b("parts_count");
        m75.i(0);
        m75.c(new Supplier() { // from class: bgyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m75.j(new dtsc() { // from class: bgyw
        });
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(2);
        m76.l(true);
        m76.g(true);
        m76.d(true);
        m76.b("parts._id");
        m76.i(-1);
        m76.c(new Supplier() { // from class: bgyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m76.j(new dtsc() { // from class: bgyy
        });
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(1);
        m77.d(true);
        m77.e(true);
        m77.h(new Supplier() { // from class: bgyz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m77.b("parts.message_id");
        m77.i(-1);
        m77.c(new Supplier() { // from class: bgza
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m77.j(new dtsc() { // from class: bgzc
        });
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(4);
        m78.b("parts.text");
        m78.i(-1);
        m78.c(new Supplier() { // from class: bgzd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m78.j(new dtsc() { // from class: bgze
        });
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(4);
        m79.b("parts.uri");
        m79.i(-1);
        m79.c(new Supplier() { // from class: bgzg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m79.j(new dtsc() { // from class: bgzh
        });
        m79.a();
        dtsb m80 = dtsd.m();
        m80.m(4);
        m80.d(true);
        m80.b("parts.content_type");
        m80.i(-1);
        m80.c(new Supplier() { // from class: bgzi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m80.j(new dtsc() { // from class: bgzj
        });
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(4);
        m81.b("parts.original_uri");
        m81.i(10021);
        m81.c(new Supplier() { // from class: bgzk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m81.j(new dtsc() { // from class: bgzl
        });
        m81.a();
        dtsb m82 = dtsd.m();
        m82.m(4);
        m82.b("parts.storage_uri");
        m82.i(29060);
        m82.c(new Supplier() { // from class: bgzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m82.j(new dtsc() { // from class: bgzo
        });
        m82.a();
        dtsb m83 = dtsd.m();
        m83.m(1);
        m83.b("parts.width");
        m83.i(-1);
        m83.c(new Supplier() { // from class: bgzp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m83.j(new dtsc() { // from class: bgzr
        });
        m83.a();
        dtsb m84 = dtsd.m();
        m84.m(1);
        m84.b("parts.height");
        m84.i(-1);
        m84.c(new Supplier() { // from class: bgzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m84.j(new dtsc() { // from class: bgzt
        });
        m84.a();
        dtsb m85 = dtsd.m();
        m85.m(1);
        m85.b("parts.timestamp");
        m85.i(3010);
        m85.c(new Supplier() { // from class: bgzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m85.j(new dtsc() { // from class: bgzv
        });
        m85.a();
        dtsb m86 = dtsd.m();
        m86.m(4);
        m86.d(true);
        m86.b("parts.output_uri");
        m86.i(4020);
        m86.c(new Supplier() { // from class: bgzw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m86.j(new dtsc() { // from class: bgzx
        });
        m86.a();
        dtsb m87 = dtsd.m();
        m87.m(1);
        m87.b("parts.target_size");
        m87.i(4020);
        m87.c(new Supplier() { // from class: bgzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m87.j(new dtsc() { // from class: bhaa
        });
        m87.a();
        dtsb m88 = dtsd.m();
        m88.m(1);
        m88.b("parts.processing_status");
        m88.i(4020);
        m88.c(new Supplier() { // from class: bhac
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m88.j(new dtsc() { // from class: bhad
        });
        m88.a();
        dtsb m89 = dtsd.m();
        m89.m(1);
        m89.b("parts.cms_attachment_processing_status");
        m89.i(44010);
        m89.c(new Supplier() { // from class: bhae
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m89.j(new dtsc() { // from class: bhaf
        });
        m89.a();
        dtsb m90 = dtsd.m();
        m90.m(1);
        m90.d(true);
        m90.e(true);
        m90.h(new Supplier() { // from class: bhag
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m90.b("parts.conversation_id");
        m90.i(-1);
        m90.c(new Supplier() { // from class: bhah
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m90.j(new dtsc() { // from class: bhai
        });
        m90.a();
        dtsb m91 = dtsd.m();
        m91.m(1);
        m91.b("parts.sticker_set_id");
        m91.i(5020);
        m91.c(new Supplier() { // from class: bhaj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m91.j(new dtsc() { // from class: bhak
        });
        m91.a();
        dtsb m92 = dtsd.m();
        m92.m(1);
        m92.b("parts.sticker_id");
        m92.i(5020);
        m92.c(new Supplier() { // from class: bhan
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m92.j(new dtsc() { // from class: bhao
        });
        m92.a();
        dtsb m93 = dtsd.m();
        m93.m(1);
        m93.b("parts.media_modified_timestamp");
        m93.i(7000);
        m93.c(new Supplier() { // from class: bhap
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m93.j(new dtsc() { // from class: bhaq
        });
        m93.a();
        dtsb m94 = dtsd.m();
        m94.m(3);
        m94.b("parts.longitude");
        m94.i(10005);
        m94.c(new Supplier() { // from class: bhar
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m94.j(new dtsc() { // from class: bhas
        });
        m94.a();
        dtsb m95 = dtsd.m();
        m95.m(3);
        m95.b("parts.latitude");
        m95.i(10005);
        m95.c(new Supplier() { // from class: bhat
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m95.j(new dtsc() { // from class: bhau
        });
        m95.a();
        dtsb m96 = dtsd.m();
        m96.m(4);
        m96.b("parts.preview_content_uri");
        m96.i(10017);
        m96.c(new Supplier() { // from class: bhav
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m96.j(new dtsc() { // from class: bhaw
        });
        m96.a();
        dtsb m97 = dtsd.m();
        m97.m(4);
        m97.d(true);
        m97.b("parts.preview_content_type");
        m97.i(10017);
        m97.c(new Supplier() { // from class: bhba
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m97.j(new dtsc() { // from class: bhbb
        });
        m97.a();
        dtsb m98 = dtsd.m();
        m98.m(4);
        m98.b("parts.fallback_uri");
        m98.i(13000);
        m98.c(new Supplier() { // from class: bhbc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m98.j(new dtsc() { // from class: bhbd
        });
        m98.a();
        dtsb m99 = dtsd.m();
        m99.m(1);
        m99.b("parts.source");
        m99.i(14010);
        m99.c(new Supplier() { // from class: bhbe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m99.j(new dtsc() { // from class: bhbf
        });
        m99.a();
        dtsb m100 = dtsd.m();
        m100.m(1);
        m100.b("parts.bundle_index");
        m100.i(17010);
        m100.c(new Supplier() { // from class: bhbg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m100.j(new dtsc() { // from class: bhbh
        });
        m100.a();
        dtsb m101 = dtsd.m();
        m101.m(4);
        m101.b("parts.blob_id");
        m101.i(17020);
        m101.c(new Supplier() { // from class: bhbj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m101.j(new dtsc() { // from class: bhbk
        });
        m101.a();
        dtsb m102 = dtsd.m();
        m102.m(4);
        m102.b("parts.blob_gaia_email");
        m102.i(59570);
        m102.c(new Supplier() { // from class: bhbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m102.j(new dtsc() { // from class: bhbn
        });
        m102.a();
        dtsb m103 = dtsd.m();
        m103.m(4);
        m103.b("parts.cms_full_size_blob_id");
        m103.i(40040);
        m103.c(new Supplier() { // from class: bhbo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m103.j(new dtsc() { // from class: bhbp
        });
        m103.a();
        dtsb m104 = dtsd.m();
        m104.m(5);
        m104.b("parts.cms_media_encryption_key");
        m104.i(42010);
        m104.c(new Supplier() { // from class: bhbq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m104.j(new dtsc() { // from class: bhbr
        });
        m104.a();
        dtsb m105 = dtsd.m();
        m105.m(5);
        m105.b("parts.cms_compressed_media_encryption_key");
        m105.i(42070);
        m105.c(new Supplier() { // from class: bhbs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m105.j(new dtsc() { // from class: bhbv
        });
        m105.a();
        dtsb m106 = dtsd.m();
        m106.m(1);
        m106.b("parts.blob_upload_permanent_failure");
        m106.i(18000);
        m106.c(new Supplier() { // from class: bhbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m106.j(new dtsc() { // from class: bhbx
        });
        m106.a();
        dtsb m107 = dtsd.m();
        m107.m(1);
        m107.b("parts.blob_upload_timestamp");
        m107.i(19030);
        m107.c(new Supplier() { // from class: bhbz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m107.j(new dtsc() { // from class: bhca
        });
        m107.a();
        dtsb m108 = dtsd.m();
        m108.m(4);
        m108.b("parts.expressive_sticker_name");
        m108.i(22060);
        m108.c(new Supplier() { // from class: bhcb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m108.j(new dtsc() { // from class: bhcc
        });
        m108.a();
        dtsb m109 = dtsd.m();
        m109.m(4);
        m109.b("parts.file_name");
        m109.i(26000);
        m109.c(new Supplier() { // from class: bhcd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m109.j(new dtsc() { // from class: bhce
        });
        m109.a();
        dtsb m110 = dtsd.m();
        m110.m(1);
        m110.b("parts.duration");
        m110.i(26040);
        m110.c(new Supplier() { // from class: bhcg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m110.j(new dtsc() { // from class: bhch
        });
        m110.a();
        dtsb m111 = dtsd.m();
        m111.m(4);
        m111.b("parts.compressed_blob_id");
        m111.i(27000);
        m111.c(new Supplier() { // from class: bhci
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m111.j(new dtsc() { // from class: bhcj
        });
        m111.a();
        dtsb m112 = dtsd.m();
        m112.m(4);
        m112.b("parts.cms_compressed_blob_id");
        m112.i(40040);
        m112.c(new Supplier() { // from class: bhcl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m112.j(new dtsc() { // from class: bhcm
        });
        m112.a();
        dtsb m113 = dtsd.m();
        m113.m(1);
        m113.b("parts.compressed_blob_upload_permanent_failure");
        m113.i(27000);
        m113.c(new Supplier() { // from class: bhcn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m113.j(new dtsc() { // from class: bhco
        });
        m113.a();
        dtsb m114 = dtsd.m();
        m114.m(1);
        m114.b("parts.compressed_blob_upload_timestamp");
        m114.i(27000);
        m114.c(new Supplier() { // from class: bhcp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m114.j(new dtsc() { // from class: bhcr
        });
        m114.a();
        dtsb m115 = dtsd.m();
        m115.m(5);
        m115.b("parts.media_encryption_key");
        m115.i(30040);
        m115.c(new Supplier() { // from class: bhcs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m115.j(new dtsc() { // from class: bhct
        });
        m115.a();
        dtsb m116 = dtsd.m();
        m116.m(5);
        m116.b("parts.compressed_media_encryption_key");
        m116.i(30040);
        m116.c(new Supplier() { // from class: bhcu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m116.j(new dtsc() { // from class: bhcv
        });
        m116.a();
        dtsb m117 = dtsd.m();
        m117.m(1);
        m117.b("parts.missing_entry_in_telephony");
        m117.i(52030);
        m117.c(new Supplier() { // from class: bhcx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m117.j(new dtsc() { // from class: bhcy
        });
        m117.a();
        dtsb m118 = dtsd.m();
        m118.m(1);
        m118.b("parts.awaiting_reverse_sync");
        m118.i(53040);
        m118.c(new Supplier() { // from class: bhcz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m118.j(new dtsc() { // from class: bhda
        });
        m118.a();
        dtsb m119 = dtsd.m();
        m119.m(1);
        m119.b("parts.file_size_bytes");
        m119.i(52050);
        m119.c(new Supplier() { // from class: bhdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m119.j(new dtsc() { // from class: bhdd
        });
        m119.a();
        dtsb m120 = dtsd.m();
        m120.m(4);
        m120.d(true);
        m120.b("parts.local_cache_path");
        m120.i(52050);
        m120.c(new Supplier() { // from class: bhde
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m120.j(new dtsc() { // from class: bhdf
        });
        m120.a();
        dtsb m121 = dtsd.m();
        m121.m(1);
        m121.b("parts.media_send_type");
        m121.i(58150);
        m121.c(new Supplier() { // from class: bhdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m121.j(new dtsc() { // from class: bhdh
        });
        m121.a();
        dtsb m122 = dtsd.m();
        m122.m(5);
        m122.b("parts.voice_metadata");
        m122.i(59470);
        m122.c(new Supplier() { // from class: bhdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m122.j(new dtsc() { // from class: bhdk
        });
        m122.a();
        dtsb m123 = dtsd.m();
        m123.m(1);
        m123.b("parts.validation_status");
        m123.i(58770);
        m123.c(new Supplier() { // from class: bhdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m123.j(new dtsc() { // from class: bhdn
        });
        m123.a();
        dtsb m124 = dtsd.m();
        m124.m(4);
        m124.b("parts.processing_id");
        m124.i(60080);
        m124.c(new Supplier() { // from class: bhdo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m124.j(new dtsc() { // from class: bhdp
        });
        m124.a();
        dtsb m125 = dtsd.m();
        m125.m(1);
        m125.b("parts.rich_card_media_download_failure_reason");
        m125.i(60230);
        m125.c(new Supplier() { // from class: bhdq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m125.j(new dtsc() { // from class: bhdr
        });
        m125.a();
        dtsb m126 = dtsd.m();
        m126.m(1);
        m126.b("parts.image_display_state");
        m126.i(60240);
        m126.c(new Supplier() { // from class: bhds
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m126.j(new dtsc() { // from class: bhdt
        });
        m126.a();
        dtsb m127 = dtsd.m();
        m127.m(1);
        m127.b("parts.preserve_size");
        m127.i(60680);
        m127.c(new Supplier() { // from class: bhdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m127.j(new dtsc() { // from class: bhdw
        });
        m127.a();
        dtsb m128 = dtsd.m();
        m128.m(8);
        m128.b("parts__ROWID");
        m128.i(0);
        m128.c(new Supplier() { // from class: bhdy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m128.j(new dtsc() { // from class: bhdz
        });
        m128.a();
        dtsb m129 = dtsd.m();
        m129.m(4);
        m129.d(true);
        m129.b("participants.normalized_destination");
        m129.f(true);
        m129.i(-1);
        m129.c(new Supplier() { // from class: bhea
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m129.j(new dtsc() { // from class: bheb
        });
        m129.a();
        dtsb m130 = dtsd.m();
        m130.m(4);
        m130.b("participants.send_destination");
        m130.i(-1);
        m130.c(new Supplier() { // from class: bhec
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m130.j(new dtsc() { // from class: bhed
        });
        m130.a();
        dtsb m131 = dtsd.m();
        m131.m(4);
        m131.b("participants.display_destination");
        m131.i(-1);
        m131.c(new Supplier() { // from class: bhee
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m131.j(new dtsc() { // from class: bhef
        });
        m131.a();
        dtsb m132 = dtsd.m();
        m132.m(4);
        m132.b("participants.full_name");
        m132.i(-1);
        m132.c(new Supplier() { // from class: bheh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m132.j(new dtsc() { // from class: bhej
        });
        m132.a();
        dtsb m133 = dtsd.m();
        m133.m(4);
        m133.b("participants.first_name");
        m133.i(-1);
        m133.c(new Supplier() { // from class: bhek
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m133.j(new dtsc() { // from class: bhel
        });
        m133.a();
        dtsb m134 = dtsd.m();
        m134.m(4);
        m134.b("participants.profile_photo_uri");
        m134.i(-1);
        m134.c(new Supplier() { // from class: bhem
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m134.j(new dtsc() { // from class: bhen
        });
        m134.a();
        dtsb m135 = dtsd.m();
        m135.m(1);
        m135.b("participants.contact_id");
        m135.i(-1);
        m135.c(new Supplier() { // from class: bheo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m135.j(new dtsc() { // from class: bhep
        });
        m135.a();
        dtsb m136 = dtsd.m();
        m136.m(4);
        m136.b("participants.lookup_key");
        m136.i(-1);
        m136.c(new Supplier() { // from class: bheq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m136.j(new dtsc() { // from class: bher
        });
        m136.a();
        dtsb m137 = dtsd.m();
        m137.m(1);
        m137.b("participants.color_palette_index");
        m137.i(-1);
        m137.c(new Supplier() { // from class: bheu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m137.j(new dtsc() { // from class: bhev
        });
        m137.a();
        dtsb m138 = dtsd.m();
        m138.m(1);
        m138.b("participants.color_type");
        m138.i(1000);
        m138.c(new Supplier() { // from class: bhew
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m138.j(new dtsc() { // from class: bhex
        });
        m138.a();
        dtsb m139 = dtsd.m();
        m139.m(1);
        m139.b("participants.extended_color");
        m139.i(10027);
        m139.c(new Supplier() { // from class: bhey
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m139.j(new dtsc() { // from class: bhez
        });
        m139.a();
        dtsb m140 = dtsd.m();
        m140.m(1);
        m140.b("participants.blocked");
        m140.i(-1);
        m140.c(new Supplier() { // from class: bhfa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m140.j(new dtsc() { // from class: bhfb
        });
        m140.a();
        dtsb m141 = dtsd.m();
        m141.m(1);
        m141.b("participants.participant_type");
        m141.i(12001);
        m141.c(new Supplier() { // from class: bhfc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m141.j(new dtsc() { // from class: bhfd
        });
        m141.a();
        dtsb m142 = dtsd.m();
        m142.m(1);
        m142.b("participants.is_spam");
        m142.i(24060);
        m142.c(new Supplier() { // from class: bhfg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m142.j(new dtsc() { // from class: bhfh
        });
        m142.a();
        dtsb m143 = dtsd.m();
        m143.m(1);
        m143.b("participants.latest_verification_status");
        m143.i(31030);
        m143.c(new Supplier() { // from class: bhfi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m143.j(new dtsc() { // from class: bhfj
        });
        m143.a();
        dtsb m144 = dtsd.m();
        m144.m(1);
        m144.b("participants.directory_id");
        m144.i(35010);
        m144.c(new Supplier() { // from class: bhfk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m144.j(new dtsc() { // from class: bhfl
        });
        m144.a();
        dtsb m145 = dtsd.m();
        m145.m(1);
        m145.b("participants.name_source");
        m145.i(59550);
        m145.c(new Supplier() { // from class: bhfm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m145.j(new dtsc() { // from class: bhfn
        });
        m145.a();
        dtsb m146 = dtsd.m();
        m146.m(1);
        m146.b("participants.photo_source");
        m146.i(59550);
        m146.c(new Supplier() { // from class: bhfo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m146.j(new dtsc() { // from class: bhfq
        });
        m146.a();
        dtsb m147 = dtsd.m();
        m147.m(2);
        m147.l(true);
        m147.g(true);
        m147.d(true);
        m147.b("participants._id");
        m147.i(-1);
        m147.c(new Supplier() { // from class: bhft
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m147.j(new dtsc() { // from class: bhfu
        });
        m147.a();
        dtsb m148 = dtsd.m();
        m148.m(4);
        m148.d(true);
        m148.b("participants.my_identity_token");
        m148.i(59930);
        m148.c(new Supplier() { // from class: bhfv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m148.j(new dtsc() { // from class: bhfw
        });
        m148.a();
        dtsb m149 = dtsd.m();
        m149.m(4);
        m149.d(true);
        m149.e(true);
        m149.h(new Supplier() { // from class: bhfx
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m149.b("participants.my_identity_token_foreign_key");
        m149.i(60160);
        m149.c(new Supplier() { // from class: bhfy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m149.j(new dtsc() { // from class: bhfz
        });
        m149.a();
        dtsb m150 = dtsd.m();
        m150.m(1);
        m150.d(true);
        m150.b("participants.sub_id");
        m150.f(true);
        m150.i(-1);
        m150.c(new Supplier() { // from class: bhgc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m150.j(new dtsc() { // from class: bhgd
        });
        m150.a();
        dtsb m151 = dtsd.m();
        m151.m(1);
        m151.b("participants.sim_slot_id");
        m151.i(2000);
        m151.c(new Supplier() { // from class: bhge
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m151.j(new dtsc() { // from class: bhgg
        });
        m151.a();
        dtsb m152 = dtsd.m();
        m152.m(4);
        m152.l(true);
        m152.d(true);
        m152.b("participants.comparable_destination");
        m152.f(true);
        m152.i(54040);
        m152.c(new Supplier() { // from class: bhgh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m152.j(new dtsc() { // from class: bhgi
        });
        m152.a();
        dtsb m153 = dtsd.m();
        m153.m(4);
        m153.b("participants.country_code");
        m153.i(54040);
        m153.c(new Supplier() { // from class: bhgj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m153.j(new dtsc() { // from class: bhgk
        });
        m153.a();
        dtsb m154 = dtsd.m();
        m154.m(2);
        m154.l(true);
        m154.d(true);
        m154.b("participants.recipient_id");
        m154.f(true);
        m154.i(58090);
        m154.c(new Supplier() { // from class: bhgl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m154.j(new dtsc() { // from class: bhgn
        });
        m154.a();
        dtsb m155 = dtsd.m();
        m155.m(4);
        m155.b("participants.recipient_canonical_address");
        m155.i(58090);
        m155.c(new Supplier() { // from class: bhgo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m155.j(new dtsc() { // from class: bhgp
        });
        m155.a();
        dtsb m156 = dtsd.m();
        m156.m(4);
        m156.b("participants.contact_photo_uri");
        m156.i(59850);
        m156.c(new Supplier() { // from class: bhgq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m156.j(new dtsc() { // from class: bhgs
        });
        m156.a();
        dtsb m157 = dtsd.m();
        m157.m(4);
        m157.b("participants.subscription_name");
        m157.i(2000);
        m157.c(new Supplier() { // from class: bhgt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m157.j(new dtsc() { // from class: bhgu
        });
        m157.a();
        dtsb m158 = dtsd.m();
        m158.m(1);
        m158.b("participants.subscription_color");
        m158.i(2000);
        m158.c(new Supplier() { // from class: bhgv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m158.j(new dtsc() { // from class: bhgw
        });
        m158.a();
        dtsb m159 = dtsd.m();
        m159.m(4);
        m159.b("participants.contact_destination");
        m159.i(4000);
        m159.c(new Supplier() { // from class: bhgy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m159.j(new dtsc() { // from class: bhgz
        });
        m159.a();
        dtsb m160 = dtsd.m();
        m160.m(1);
        m160.b("participants.video_reachability");
        m160.i(13050);
        m160.c(new Supplier() { // from class: bhha
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m160.j(new dtsc() { // from class: bhhb
        });
        m160.a();
        dtsb m161 = dtsd.m();
        m161.m(4);
        m161.b("participants.alias");
        m161.i(20060);
        m161.c(new Supplier() { // from class: bhhc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m161.j(new dtsc() { // from class: bhhe
        });
        m161.a();
        dtsb m162 = dtsd.m();
        m162.m(1);
        m162.b("participants.is_rcs_available");
        m162.i(29030);
        m162.c(new Supplier() { // from class: bhhf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m162.j(new dtsc() { // from class: bhhg
        });
        m162.a();
        dtsb m163 = dtsd.m();
        m163.m(1);
        m163.b("participants.is_spam_source");
        m163.i(30000);
        m163.c(new Supplier() { // from class: bhhh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m163.j(new dtsc() { // from class: bhhj
        });
        m163.a();
        dtsb m164 = dtsd.m();
        m164.m(4);
        m164.l(true);
        m164.d(true);
        m164.b("participants.cms_id");
        m164.f(true);
        m164.i(31020);
        m164.c(new Supplier() { // from class: bhhk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m164.j(new dtsc() { // from class: bhhl
        });
        m164.a();
        dtsb m165 = dtsd.m();
        m165.m(4);
        m165.b("participants.profile_photo_blob_id");
        m165.i(33000);
        m165.c(new Supplier() { // from class: bhhm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m165.j(new dtsc() { // from class: bhhn
        });
        m165.a();
        dtsb m166 = dtsd.m();
        m166.m(5);
        m166.b("participants.profile_photo_encryption_key");
        m166.i(33060);
        m166.c(new Supplier() { // from class: bhho
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m166.j(new dtsc() { // from class: bhhq
        });
        m166.a();
        dtsb m167 = dtsd.m();
        m167.m(1);
        m167.b("participants.is_check_constraint_enabled_via_phenotype");
        m167.i(55010);
        m167.c(new Supplier() { // from class: bhhr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m167.j(new dtsc() { // from class: bhhs
        });
        m167.a();
        dtsb m168 = dtsd.m();
        m168.m(1);
        m168.b("participants.is_valid_phone_number_data");
        m168.i(55010);
        m168.c(new Supplier() { // from class: bhhu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m168.j(new dtsc() { // from class: bhhv
        });
        m168.a();
        dtsb m169 = dtsd.m();
        m169.m(2);
        m169.d(true);
        m169.e(true);
        m169.h(new Supplier() { // from class: bhhw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m169.b("participants.duplicate_of");
        m169.i(58090);
        m169.c(new Supplier() { // from class: bhhx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m169.j(new dtsc() { // from class: bhhy
        });
        m169.a();
        dtsb m170 = dtsd.m();
        m170.m(1);
        m170.b("participants.cms_life_cycle");
        m170.i(58210);
        m170.c(new Supplier() { // from class: bhhz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m170.j(new dtsc() { // from class: bhia
        });
        m170.a();
        dtsb m171 = dtsd.m();
        m171.m(1);
        m171.b("participants.norm_ui_status");
        m171.i(58620);
        m171.c(new Supplier() { // from class: bhic
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m171.j(new dtsc() { // from class: bhid
        });
        m171.a();
        dtsb m172 = dtsd.m();
        m172.m(4);
        m172.b("participants.last_modified_by_key");
        m172.i(59440);
        m172.c(new Supplier() { // from class: bhif
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m172.j(new dtsc() { // from class: bhig
        });
        m172.a();
        dtsb m173 = dtsd.m();
        m173.m(1);
        m173.b("participants.profile_photo_user_preference");
        m173.i(60060);
        m173.c(new Supplier() { // from class: bhih
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m173.j(new dtsc() { // from class: bhii
        });
        m173.a();
        dtsb m174 = dtsd.m();
        m174.m(5);
        m174.b("participants.contact_metadata");
        m174.i(60070);
        m174.c(new Supplier() { // from class: bhij
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m174.j(new dtsc() { // from class: bhik
        });
        m174.a();
        dtsb m175 = dtsd.m();
        m175.m(1);
        m175.d(true);
        m175.b("participants.is_enterprise_contact");
        m175.i(60640);
        m175.c(new Supplier() { // from class: bhil
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m175.j(new dtsc() { // from class: bhim
        });
        m175.a();
        dtsb m176 = dtsd.m();
        m176.m(2);
        m176.l(true);
        m176.g(true);
        m176.d(true);
        m176.b("read_reports._id");
        m176.i(-1);
        m176.c(new Supplier() { // from class: bhio
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m176.j(new dtsc() { // from class: bhiq
        });
        m176.a();
        dtsb m177 = dtsd.m();
        m177.m(1);
        m177.d(true);
        m177.e(true);
        m177.h(new Supplier() { // from class: bhir
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m177.b("read_reports.message_id");
        m177.f(true);
        m177.i(-1);
        m177.c(new Supplier() { // from class: bhis
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m177.j(new dtsc() { // from class: bhit
        });
        m177.a();
        dtsb m178 = dtsd.m();
        m178.m(1);
        m178.d(true);
        m178.e(true);
        m178.h(new Supplier() { // from class: bhiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m178.b("read_reports.participant_id");
        m178.f(true);
        m178.i(-1);
        m178.c(new Supplier() { // from class: bhiv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m178.j(new dtsc() { // from class: bhiw
        });
        m178.a();
        dtsb m179 = dtsd.m();
        m179.m(1);
        m179.b("read_reports.receive_time");
        m179.i(-1);
        m179.c(new Supplier() { // from class: bhix
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m179.j(new dtsc() { // from class: bhiy
        });
        m179.a();
        dtsb m180 = dtsd.m();
        m180.m(1);
        m180.b("read_reports.read_time");
        m180.i(-1);
        m180.c(new Supplier() { // from class: bhjb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m180.j(new dtsc() { // from class: bhjc
        });
        m180.a();
        dtsb m181 = dtsd.m();
        m181.m(2);
        m181.b("read_reports.ftd_time");
        m181.i(58880);
        m181.c(new Supplier() { // from class: bhjd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m181.j(new dtsc() { // from class: bhje
        });
        m181.a();
        dtsb m182 = dtsd.m();
        m182.m(8);
        m182.b("read_reports__ROWID");
        m182.i(0);
        m182.c(new Supplier() { // from class: bhjf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m182.j(new dtsc() { // from class: bhjg
        });
        m182.a();
        dtsb m183 = dtsd.m();
        m183.m(2);
        m183.l(true);
        m183.g(true);
        m183.d(true);
        m183.b("user_references._id");
        m183.i(-1);
        m183.c(new Supplier() { // from class: bhjh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m183.j(new dtsc() { // from class: bhji
        });
        m183.a();
        dtsb m184 = dtsd.m();
        m184.m(2);
        m184.d(true);
        m184.e(true);
        m184.h(new Supplier() { // from class: bhjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m184.b("user_references.message_id");
        m184.f(true);
        m184.i(-1);
        m184.c(new Supplier() { // from class: bhjk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m184.j(new dtsc() { // from class: bhjn
        });
        m184.a();
        dtsb m185 = dtsd.m();
        m185.m(2);
        m185.d(true);
        m185.e(true);
        m185.h(new Supplier() { // from class: bhjo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m185.b("user_references.user_ref_id");
        m185.f(true);
        m185.i(-1);
        m185.c(new Supplier() { // from class: bhjp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m185.j(new dtsc() { // from class: bhjq
        });
        m185.a();
        dtsb m186 = dtsd.m();
        m186.m(2);
        m186.b("user_references.user_ref_datetime");
        m186.i(-1);
        m186.c(new Supplier() { // from class: bhjr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m186.j(new dtsc() { // from class: bhjs
        });
        m186.a();
        dtsb m187 = dtsd.m();
        m187.m(8);
        m187.b("user_references__ROWID");
        m187.i(0);
        m187.c(new Supplier() { // from class: bhjt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m187.j(new dtsc() { // from class: bhju
        });
        m187.a();
        dtsb m188 = dtsd.m();
        m188.m(4);
        m188.d(true);
        m188.b("user_ref_participant.normalized_destination");
        m188.f(true);
        m188.i(-1);
        m188.c(new Supplier() { // from class: bhjv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m188.j(new dtsc() { // from class: bhjx
        });
        m188.a();
        dtsb m189 = dtsd.m();
        m189.m(1);
        m189.b("user_ref_participant.color_palette_index");
        m189.i(-1);
        m189.c(new Supplier() { // from class: bhjz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m189.j(new dtsc() { // from class: bhka
        });
        m189.a();
        dtsb m190 = dtsd.m();
        m190.m(1);
        m190.b("user_ref_participant.color_type");
        m190.i(1000);
        m190.c(new Supplier() { // from class: bhkb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m190.j(new dtsc() { // from class: bhkc
        });
        m190.a();
        dtsb m191 = dtsd.m();
        m191.m(1);
        m191.b("user_ref_participant.extended_color");
        m191.i(10027);
        m191.c(new Supplier() { // from class: bhkd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m191.j(new dtsc() { // from class: bhke
        });
        m191.a();
        dtsb m192 = dtsd.m();
        m192.m(1);
        m192.b("user_ref_participant.participant_type");
        m192.i(12001);
        m192.c(new Supplier() { // from class: bhkf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m192.j(new dtsc() { // from class: bhkg
        });
        m192.a();
        dtsb m193 = dtsd.m();
        m193.m(8);
        m193.b("user_ref_participant__ROWID");
        m193.i(0);
        m193.c(new Supplier() { // from class: bhkj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m193.j(new dtsc() { // from class: bhkk
        });
        m193.a();
        dtsb m194 = dtsd.m();
        m194.m(2);
        m194.l(true);
        m194.g(true);
        m194.d(true);
        m194.b("user_ref_participant._id");
        m194.i(-1);
        m194.c(new Supplier() { // from class: bhkn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m194.j(new dtsc() { // from class: bhko
        });
        m194.a();
        dtsb m195 = dtsd.m();
        m195.m(4);
        m195.d(true);
        m195.b("user_ref_participant.my_identity_token");
        m195.i(59930);
        m195.c(new Supplier() { // from class: bhkp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m195.j(new dtsc() { // from class: bhkq
        });
        m195.a();
        dtsb m196 = dtsd.m();
        m196.m(4);
        m196.d(true);
        m196.e(true);
        m196.h(new Supplier() { // from class: bhkr
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m196.b("user_ref_participant.my_identity_token_foreign_key");
        m196.i(60160);
        m196.c(new Supplier() { // from class: bhks
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m196.j(new dtsc() { // from class: bhku
        });
        m196.a();
        dtsb m197 = dtsd.m();
        m197.m(1);
        m197.d(true);
        m197.b("user_ref_participant.sub_id");
        m197.f(true);
        m197.i(-1);
        m197.c(new Supplier() { // from class: bhkv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m197.j(new dtsc() { // from class: bhkw
        });
        m197.a();
        dtsb m198 = dtsd.m();
        m198.m(1);
        m198.b("user_ref_participant.sim_slot_id");
        m198.i(2000);
        m198.c(new Supplier() { // from class: bhkx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m198.j(new dtsc() { // from class: bhkz
        });
        m198.a();
        dtsb m199 = dtsd.m();
        m199.m(4);
        m199.b("user_ref_participant.send_destination");
        m199.i(-1);
        m199.c(new Supplier() { // from class: bhla
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m199.j(new dtsc() { // from class: bhlb
        });
        m199.a();
        dtsb m200 = dtsd.m();
        m200.m(4);
        m200.b("user_ref_participant.display_destination");
        m200.i(-1);
        m200.c(new Supplier() { // from class: bhlc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m200.j(new dtsc() { // from class: bhld
        });
        m200.a();
        dtsb m201 = dtsd.m();
        m201.m(4);
        m201.l(true);
        m201.d(true);
        m201.b("user_ref_participant.comparable_destination");
        m201.f(true);
        m201.i(54040);
        m201.c(new Supplier() { // from class: bhlf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m201.j(new dtsc() { // from class: bhlg
        });
        m201.a();
        dtsb m202 = dtsd.m();
        m202.m(4);
        m202.b("user_ref_participant.country_code");
        m202.i(54040);
        m202.c(new Supplier() { // from class: bhlh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m202.j(new dtsc() { // from class: bhli
        });
        m202.a();
        dtsb m203 = dtsd.m();
        m203.m(2);
        m203.l(true);
        m203.d(true);
        m203.b("user_ref_participant.recipient_id");
        m203.f(true);
        m203.i(58090);
        m203.c(new Supplier() { // from class: bhlj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m203.j(new dtsc() { // from class: bhll
        });
        m203.a();
        dtsb m204 = dtsd.m();
        m204.m(4);
        m204.b("user_ref_participant.recipient_canonical_address");
        m204.i(58090);
        m204.c(new Supplier() { // from class: bhlm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m204.j(new dtsc() { // from class: bhln
        });
        m204.a();
        dtsb m205 = dtsd.m();
        m205.m(4);
        m205.b("user_ref_participant.full_name");
        m205.i(-1);
        m205.c(new Supplier() { // from class: bhlo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m205.j(new dtsc() { // from class: bhlq
        });
        m205.a();
        dtsb m206 = dtsd.m();
        m206.m(4);
        m206.b("user_ref_participant.first_name");
        m206.i(-1);
        m206.c(new Supplier() { // from class: bhlr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m206.j(new dtsc() { // from class: bhls
        });
        m206.a();
        dtsb m207 = dtsd.m();
        m207.m(4);
        m207.b("user_ref_participant.profile_photo_uri");
        m207.i(-1);
        m207.c(new Supplier() { // from class: bhlt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m207.j(new dtsc() { // from class: bhlu
        });
        m207.a();
        dtsb m208 = dtsd.m();
        m208.m(4);
        m208.b("user_ref_participant.contact_photo_uri");
        m208.i(59850);
        m208.c(new Supplier() { // from class: bhlv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m208.j(new dtsc() { // from class: bhlx
        });
        m208.a();
        dtsb m209 = dtsd.m();
        m209.m(1);
        m209.b("user_ref_participant.contact_id");
        m209.i(-1);
        m209.c(new Supplier() { // from class: bhly
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m209.j(new dtsc() { // from class: bhlz
        });
        m209.a();
        dtsb m210 = dtsd.m();
        m210.m(4);
        m210.b("user_ref_participant.lookup_key");
        m210.i(-1);
        m210.c(new Supplier() { // from class: bhmb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m210.j(new dtsc() { // from class: bhmc
        });
        m210.a();
        dtsb m211 = dtsd.m();
        m211.m(1);
        m211.b("user_ref_participant.blocked");
        m211.i(-1);
        m211.c(new Supplier() { // from class: bhmd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m211.j(new dtsc() { // from class: bhme
        });
        m211.a();
        dtsb m212 = dtsd.m();
        m212.m(4);
        m212.b("user_ref_participant.subscription_name");
        m212.i(2000);
        m212.c(new Supplier() { // from class: bhmf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m212.j(new dtsc() { // from class: bhmg
        });
        m212.a();
        dtsb m213 = dtsd.m();
        m213.m(1);
        m213.b("user_ref_participant.subscription_color");
        m213.i(2000);
        m213.c(new Supplier() { // from class: bhmh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m213.j(new dtsc() { // from class: bhmj
        });
        m213.a();
        dtsb m214 = dtsd.m();
        m214.m(4);
        m214.b("user_ref_participant.contact_destination");
        m214.i(4000);
        m214.c(new Supplier() { // from class: bhmk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m214.j(new dtsc() { // from class: bhmm
        });
        m214.a();
        dtsb m215 = dtsd.m();
        m215.m(1);
        m215.b("user_ref_participant.video_reachability");
        m215.i(13050);
        m215.c(new Supplier() { // from class: bhmn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m215.j(new dtsc() { // from class: bhmo
        });
        m215.a();
        dtsb m216 = dtsd.m();
        m216.m(4);
        m216.b("user_ref_participant.alias");
        m216.i(20060);
        m216.c(new Supplier() { // from class: bhmp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m216.j(new dtsc() { // from class: bhmq
        });
        m216.a();
        dtsb m217 = dtsd.m();
        m217.m(1);
        m217.b("user_ref_participant.is_spam");
        m217.i(24060);
        m217.c(new Supplier() { // from class: bhmr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m217.j(new dtsc() { // from class: bhms
        });
        m217.a();
        dtsb m218 = dtsd.m();
        m218.m(1);
        m218.b("user_ref_participant.is_rcs_available");
        m218.i(29030);
        m218.c(new Supplier() { // from class: bhmt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m218.j(new dtsc() { // from class: bhmv
        });
        m218.a();
        dtsb m219 = dtsd.m();
        m219.m(1);
        m219.b("user_ref_participant.is_spam_source");
        m219.i(30000);
        m219.c(new Supplier() { // from class: bhmx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m219.j(new dtsc() { // from class: bhmy
        });
        m219.a();
        dtsb m220 = dtsd.m();
        m220.m(4);
        m220.l(true);
        m220.d(true);
        m220.b("user_ref_participant.cms_id");
        m220.f(true);
        m220.i(31020);
        m220.c(new Supplier() { // from class: bhmz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m220.j(new dtsc() { // from class: bhna
        });
        m220.a();
        dtsb m221 = dtsd.m();
        m221.m(1);
        m221.b("user_ref_participant.latest_verification_status");
        m221.i(31030);
        m221.c(new Supplier() { // from class: bhnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m221.j(new dtsc() { // from class: bhnc
        });
        m221.a();
        dtsb m222 = dtsd.m();
        m222.m(4);
        m222.b("user_ref_participant.profile_photo_blob_id");
        m222.i(33000);
        m222.c(new Supplier() { // from class: bhnd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m222.j(new dtsc() { // from class: bhne
        });
        m222.a();
        dtsb m223 = dtsd.m();
        m223.m(5);
        m223.b("user_ref_participant.profile_photo_encryption_key");
        m223.i(33060);
        m223.c(new Supplier() { // from class: bhnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m223.j(new dtsc() { // from class: bhni
        });
        m223.a();
        dtsb m224 = dtsd.m();
        m224.m(1);
        m224.b("user_ref_participant.directory_id");
        m224.i(35010);
        m224.c(new Supplier() { // from class: bhnj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m224.j(new dtsc() { // from class: bhnk
        });
        m224.a();
        dtsb m225 = dtsd.m();
        m225.m(1);
        m225.b("user_ref_participant.is_check_constraint_enabled_via_phenotype");
        m225.i(55010);
        m225.c(new Supplier() { // from class: bhnl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m225.j(new dtsc() { // from class: bhnm
        });
        m225.a();
        dtsb m226 = dtsd.m();
        m226.m(1);
        m226.b("user_ref_participant.is_valid_phone_number_data");
        m226.i(55010);
        m226.c(new Supplier() { // from class: bhnn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m226.j(new dtsc() { // from class: bhno
        });
        m226.a();
        dtsb m227 = dtsd.m();
        m227.m(2);
        m227.d(true);
        m227.e(true);
        m227.h(new Supplier() { // from class: bhnp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m227.b("user_ref_participant.duplicate_of");
        m227.i(58090);
        m227.c(new Supplier() { // from class: bhnq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m227.j(new dtsc() { // from class: bhnr
        });
        m227.a();
        dtsb m228 = dtsd.m();
        m228.m(1);
        m228.b("user_ref_participant.cms_life_cycle");
        m228.i(58210);
        m228.c(new Supplier() { // from class: bhnu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m228.j(new dtsc() { // from class: bhnv
        });
        m228.a();
        dtsb m229 = dtsd.m();
        m229.m(1);
        m229.b("user_ref_participant.norm_ui_status");
        m229.i(58620);
        m229.c(new Supplier() { // from class: bhnw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m229.j(new dtsc() { // from class: bhnx
        });
        m229.a();
        dtsb m230 = dtsd.m();
        m230.m(4);
        m230.b("user_ref_participant.last_modified_by_key");
        m230.i(59440);
        m230.c(new Supplier() { // from class: bhny
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m230.j(new dtsc() { // from class: bhnz
        });
        m230.a();
        dtsb m231 = dtsd.m();
        m231.m(1);
        m231.b("user_ref_participant.name_source");
        m231.i(59550);
        m231.c(new Supplier() { // from class: bhoa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m231.j(new dtsc() { // from class: bhob
        });
        m231.a();
        dtsb m232 = dtsd.m();
        m232.m(1);
        m232.b("user_ref_participant.photo_source");
        m232.i(59550);
        m232.c(new Supplier() { // from class: bhoc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m232.j(new dtsc() { // from class: bhoe
        });
        m232.a();
        dtsb m233 = dtsd.m();
        m233.m(1);
        m233.b("user_ref_participant.profile_photo_user_preference");
        m233.i(60060);
        m233.c(new Supplier() { // from class: bhog
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m233.j(new dtsc() { // from class: bhoh
        });
        m233.a();
        dtsb m234 = dtsd.m();
        m234.m(5);
        m234.b("user_ref_participant.contact_metadata");
        m234.i(60070);
        m234.c(new Supplier() { // from class: bhoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m234.j(new dtsc() { // from class: bhoj
        });
        m234.a();
        dtsb m235 = dtsd.m();
        m235.m(1);
        m235.d(true);
        m235.b("user_ref_participant.is_enterprise_contact");
        m235.i(60640);
        m235.c(new Supplier() { // from class: bhok
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m235.j(new dtsc() { // from class: bhol
        });
        m235.a();
        dtsb m236 = dtsd.m();
        m236.m(2);
        m236.l(true);
        m236.d(true);
        m236.e(true);
        m236.h(new Supplier() { // from class: bhom
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m236.b("link_preview.message_id");
        m236.i(-1);
        m236.c(new Supplier() { // from class: bhon
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m236.j(new dtsc() { // from class: bhoq
        });
        m236.a();
        dtsb m237 = dtsd.m();
        m237.m(4);
        m237.b("link_preview.trigger_url");
        m237.i(-1);
        m237.c(new Supplier() { // from class: bhor
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m237.j(new dtsc() { // from class: bhot
        });
        m237.a();
        dtsb m238 = dtsd.m();
        m238.m(2);
        m238.b("link_preview.expiration_time_millis");
        m238.i(-1);
        m238.c(new Supplier() { // from class: bhou
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m238.j(new dtsc() { // from class: bhov
        });
        m238.a();
        dtsb m239 = dtsd.m();
        m239.m(4);
        m239.b("link_preview.link_title");
        m239.i(-1);
        m239.c(new Supplier() { // from class: bhow
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m239.j(new dtsc() { // from class: bhox
        });
        m239.a();
        dtsb m240 = dtsd.m();
        m240.m(4);
        m240.b("link_preview.link_description");
        m240.i(-1);
        m240.c(new Supplier() { // from class: bhoy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m240.j(new dtsc() { // from class: bhoz
        });
        m240.a();
        dtsb m241 = dtsd.m();
        m241.m(4);
        m241.b("link_preview.link_image_url");
        m241.i(-1);
        m241.c(new Supplier() { // from class: bhpb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m241.j(new dtsc() { // from class: bhpc
        });
        m241.a();
        dtsb m242 = dtsd.m();
        m242.m(4);
        m242.b("link_preview.link_domain");
        m242.i(-1);
        m242.c(new Supplier() { // from class: bhpd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m242.j(new dtsc() { // from class: bhpg
        });
        m242.a();
        dtsb m243 = dtsd.m();
        m243.m(4);
        m243.b("link_preview.link_canonical_url");
        m243.i(-1);
        m243.c(new Supplier() { // from class: bhph
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m243.j(new dtsc() { // from class: bhpi
        });
        m243.a();
        dtsb m244 = dtsd.m();
        m244.m(2);
        m244.b("link_preview.link_preview_prevented");
        m244.i(21010);
        m244.c(new Supplier() { // from class: bhpj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m244.j(new dtsc() { // from class: bhpk
        });
        m244.a();
        dtsb m245 = dtsd.m();
        m245.m(2);
        m245.b("link_preview.link_preview_failed");
        m245.i(22020);
        m245.c(new Supplier() { // from class: bhpm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m245.j(new dtsc() { // from class: bhpn
        });
        m245.a();
        dtsb m246 = dtsd.m();
        m246.m(2);
        m246.l(true);
        m246.g(true);
        m246.d(true);
        m246.b("link_preview._id");
        m246.i(-1);
        m246.c(new Supplier() { // from class: bhpo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m246.j(new dtsc() { // from class: bhpp
        });
        m246.a();
        dtsb m247 = dtsd.m();
        m247.m(4);
        m247.l(true);
        m247.g(true);
        m247.d(true);
        m247.b("verified_sms_senders.sender_id");
        m247.i(-1);
        m247.c(new Supplier() { // from class: bhpq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m247.j(new dtsc() { // from class: bhps
        });
        m247.a();
        dtsb m248 = dtsd.m();
        m248.m(4);
        m248.b("verified_sms_senders.brand_id");
        m248.i(-1);
        m248.c(new Supplier() { // from class: bhpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m248.j(new dtsc() { // from class: bhpu
        });
        m248.a();
        dtsb m249 = dtsd.m();
        m249.m(4);
        m249.b("verified_sms_brands.name");
        m249.i(-1);
        m249.c(new Supplier() { // from class: bhpv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m249.j(new dtsc() { // from class: bhpx
        });
        m249.a();
        dtsb m250 = dtsd.m();
        m250.m(4);
        m250.b("verified_sms_brands.description");
        m250.i(-1);
        m250.c(new Supplier() { // from class: bhpy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m250.j(new dtsc() { // from class: bhpz
        });
        m250.a();
        dtsb m251 = dtsd.m();
        m251.m(4);
        m251.b("verified_sms_brands.logo_uri");
        m251.i(-1);
        m251.c(new Supplier() { // from class: bhqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m251.j(new dtsc() { // from class: bhqb
        });
        m251.a();
        dtsb m252 = dtsd.m();
        m252.m(2);
        m252.l(true);
        m252.g(true);
        m252.d(true);
        m252.b("verified_sms_brands._id");
        m252.i(-1);
        m252.c(new Supplier() { // from class: bhqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m252.j(new dtsc() { // from class: bhqe
        });
        m252.a();
        dtsb m253 = dtsd.m();
        m253.m(4);
        m253.l(true);
        m253.d(true);
        m253.b("verified_sms_brands.brand_id");
        m253.i(-1);
        m253.c(new Supplier() { // from class: bhqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m253.j(new dtsc() { // from class: bhqg
        });
        m253.a();
        dtsb m254 = dtsd.m();
        m254.m(4);
        m254.b("verified_sms_brands.logo_url");
        m254.i(-1);
        m254.c(new Supplier() { // from class: bhqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m254.j(new dtsc() { // from class: bhqj
        });
        m254.a();
        dtsb m255 = dtsd.m();
        m255.m(4);
        m255.b("verified_sms_brands.version_token");
        m255.i(-1);
        m255.c(new Supplier() { // from class: bhqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m255.j(new dtsc() { // from class: bhql
        });
        m255.a();
        dtsb m256 = dtsd.m();
        m256.m(4);
        m256.d(true);
        m256.b("conversations.participant_normalized_destination");
        m256.i(-1);
        m256.c(new Supplier() { // from class: bhqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m256.j(new dtsc() { // from class: bhqn
        });
        m256.a();
        dtsb m257 = dtsd.m();
        m257.m(1);
        m257.b("conversations.conv_type");
        m257.i(10007);
        m257.c(new Supplier() { // from class: bhqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m257.j(new dtsc() { // from class: bhqq
        });
        m257.a();
        dtsb m258 = dtsd.m();
        m258.m(1);
        m258.b("conversations.has_ea2p_bot_recipient");
        m258.i(12001);
        m258.c(new Supplier() { // from class: bhqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m258.j(new dtsc() { // from class: bhqt
        });
        m258.a();
        dtsb m259 = dtsd.m();
        m259.m(4);
        m259.d(true);
        m259.b("conversations.rcs_group_id");
        m259.i(40050);
        m259.c(new Supplier() { // from class: bhqu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m259.j(new dtsc() { // from class: bhqv
        });
        m259.a();
        dtsb m260 = dtsd.m();
        m260.m(4);
        m260.b("conversations.rcs_conference_uri");
        m260.i(40050);
        m260.c(new Supplier() { // from class: bhqw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m260.j(new dtsc() { // from class: bhqx
        });
        m260.a();
        dtsb m261 = dtsd.m();
        m261.m(1);
        m261.b("conversations.rcs_session_allows_revocation");
        m261.i(48040);
        m261.c(new Supplier() { // from class: bhqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m261.j(new dtsc() { // from class: bhqz
        });
        m261.a();
        dtsb m262 = dtsd.m();
        m262.m(2);
        m262.b("conversations.recipient_offline_timestamp_ms");
        m262.i(58750);
        m262.c(new Supplier() { // from class: bhra
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m262.j(new dtsc() { // from class: bhrc
        });
        m262.a();
        dtsb m263 = dtsd.m();
        m263.m(2);
        m263.l(true);
        m263.g(true);
        m263.d(true);
        m263.b("conversations._id");
        m263.i(-1);
        m263.c(new Supplier() { // from class: bhre
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m263.j(new dtsc() { // from class: bhrf
        });
        m263.a();
        dtsb m264 = dtsd.m();
        m264.m(1);
        m264.d(true);
        m264.b("conversations.sms_thread_id");
        m264.i(-1);
        m264.c(new Supplier() { // from class: bhrg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m264.j(new dtsc() { // from class: bhrh
        });
        m264.a();
        dtsb m265 = dtsd.m();
        m265.m(4);
        m265.b("conversations.name");
        m265.i(-1);
        m265.c(new Supplier() { // from class: bhri
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m265.j(new dtsc() { // from class: bhrj
        });
        m265.a();
        dtsb m266 = dtsd.m();
        m266.m(2);
        m266.b("conversations.name_is_automatic");
        m266.i(10012);
        m266.c(new Supplier() { // from class: bhrk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m266.j(new dtsc() { // from class: bhrl
        });
        m266.a();
        dtsb m267 = dtsd.m();
        m267.m(4);
        m267.b("conversations.subtitle");
        m267.i(59760);
        m267.c(new Supplier() { // from class: bhrm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m267.j(new dtsc() { // from class: bhrp
        });
        m267.a();
        dtsb m268 = dtsd.m();
        m268.m(1);
        m268.b("conversations.latest_message_id");
        m268.i(-1);
        m268.c(new Supplier() { // from class: bhrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m268.j(new dtsc() { // from class: bhrr
        });
        m268.a();
        dtsb m269 = dtsd.m();
        m269.m(4);
        m269.b("conversations.snippet_text");
        m269.i(-1);
        m269.c(new Supplier() { // from class: bhrs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m269.j(new dtsc() { // from class: bhrt
        });
        m269.a();
        dtsb m270 = dtsd.m();
        m270.m(4);
        m270.b("conversations.subject_text");
        m270.i(-1);
        m270.c(new Supplier() { // from class: bhru
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m270.j(new dtsc() { // from class: bhrv
        });
        m270.a();
        dtsb m271 = dtsd.m();
        m271.m(4);
        m271.b("conversations.preview_uri");
        m271.i(-1);
        m271.c(new Supplier() { // from class: bhrw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m271.j(new dtsc() { // from class: bhrx
        });
        m271.a();
        dtsb m272 = dtsd.m();
        m272.m(4);
        m272.b("conversations.preview_content_type");
        m272.i(-1);
        m272.c(new Supplier() { // from class: bhry
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m272.j(new dtsc() { // from class: bhsb
        });
        m272.a();
        dtsb m273 = dtsd.m();
        m273.m(1);
        m273.b("conversations.show_draft");
        m273.i(-1);
        m273.c(new Supplier() { // from class: bhsc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m273.j(new dtsc() { // from class: bhsd
        });
        m273.a();
        dtsb m274 = dtsd.m();
        m274.m(4);
        m274.b("conversations.draft_snippet_text");
        m274.i(-1);
        m274.c(new Supplier() { // from class: bhse
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m274.j(new dtsc() { // from class: bhsf
        });
        m274.a();
        dtsb m275 = dtsd.m();
        m275.m(4);
        m275.b("conversations.draft_subject_text");
        m275.i(-1);
        m275.c(new Supplier() { // from class: bhsg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m275.j(new dtsc() { // from class: bhsh
        });
        m275.a();
        dtsb m276 = dtsd.m();
        m276.m(4);
        m276.b("conversations.draft_preview_uri");
        m276.i(-1);
        m276.c(new Supplier() { // from class: bhsi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m276.j(new dtsc() { // from class: bhsj
        });
        m276.a();
        dtsb m277 = dtsd.m();
        m277.m(4);
        m277.b("conversations.draft_preview_content_type");
        m277.i(-1);
        m277.c(new Supplier() { // from class: bhsl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m277.j(new dtsc() { // from class: bhsn
        });
        m277.a();
        dtsb m278 = dtsd.m();
        m278.m(1);
        m278.b("conversations.etouffee_default");
        m278.i(29060);
        m278.c(new Supplier() { // from class: bhso
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m278.j(new dtsc() { // from class: bhsp
        });
        m278.a();
        dtsb m279 = dtsd.m();
        m279.m(1);
        m279.d(true);
        m279.b("conversations.archive_status");
        m279.i(-1);
        m279.c(new Supplier() { // from class: bhsq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m279.j(new dtsc() { // from class: bhsr
        });
        m279.a();
        dtsb m280 = dtsd.m();
        m280.m(1);
        m280.d(true);
        m280.b("conversations.sort_timestamp");
        m280.i(-1);
        m280.c(new Supplier() { // from class: bhss
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m280.j(new dtsc() { // from class: bhst
        });
        m280.a();
        dtsb m281 = dtsd.m();
        m281.m(1);
        m281.b("conversations.last_read_timestamp");
        m281.i(-1);
        m281.c(new Supplier() { // from class: bhsu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m281.j(new dtsc() { // from class: bhsx
        });
        m281.a();
        dtsb m282 = dtsd.m();
        m282.m(4);
        m282.b("conversations.icon");
        m282.i(-1);
        m282.c(new Supplier() { // from class: bhsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m282.j(new dtsc() { // from class: bhta
        });
        m282.a();
        dtsb m283 = dtsd.m();
        m283.m(1);
        m283.b("conversations.participant_contact_id");
        m283.i(-1);
        m283.c(new Supplier() { // from class: bhtb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m283.j(new dtsc() { // from class: bhtc
        });
        m283.a();
        dtsb m284 = dtsd.m();
        m284.m(1);
        m284.b("conversations.normalized_participant_contact_id");
        m284.i(58090);
        m284.c(new Supplier() { // from class: bhtd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m284.j(new dtsc() { // from class: bhte
        });
        m284.a();
        dtsb m285 = dtsd.m();
        m285.m(4);
        m285.b("conversations.participant_lookup_key");
        m285.i(-1);
        m285.c(new Supplier() { // from class: bhtf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m285.j(new dtsc() { // from class: bhtg
        });
        m285.a();
        dtsb m286 = dtsd.m();
        m286.m(4);
        m286.b("conversations.normalized_participant_lookup_key");
        m286.i(58090);
        m286.c(new Supplier() { // from class: bhti
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m286.j(new dtsc() { // from class: bhtj
        });
        m286.a();
        dtsb m287 = dtsd.m();
        m287.m(4);
        m287.l(true);
        m287.d(true);
        m287.b("conversations.participant_comparable_destination");
        m287.f(true);
        m287.i(58090);
        m287.c(new Supplier() { // from class: bhtk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m287.j(new dtsc() { // from class: bhtm
        });
        m287.a();
        dtsb m288 = dtsd.m();
        m288.m(4);
        m288.b("conversations.current_self_id");
        m288.i(-1);
        m288.c(new Supplier() { // from class: bhtn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m288.j(new dtsc() { // from class: bhto
        });
        m288.a();
        dtsb m289 = dtsd.m();
        m289.m(4);
        m289.b("conversations.current_my_identity");
        m289.i(59810);
        m289.c(new Supplier() { // from class: bhtp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m289.j(new dtsc() { // from class: bhtq
        });
        m289.a();
        dtsb m290 = dtsd.m();
        m290.m(4);
        m290.d(true);
        m290.e(true);
        m290.h(new Supplier() { // from class: bhtr
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m290.b("conversations.current_my_identity_foreign_key");
        m290.i(60160);
        m290.c(new Supplier() { // from class: bhtt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m290.j(new dtsc() { // from class: bhtu
        });
        m290.a();
        dtsb m291 = dtsd.m();
        m291.m(4);
        m291.d(true);
        m291.e(true);
        m291.h(new Supplier() { // from class: bhtv
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.b.a;
            }
        });
        m291.b("conversations.destination_token");
        m291.i(60360);
        m291.c(new Supplier() { // from class: bhtw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m291.j(new dtsc() { // from class: bhtz
        });
        m291.a();
        dtsb m292 = dtsd.m();
        m292.m(1);
        m292.b("conversations.participant_count");
        m292.i(-1);
        m292.c(new Supplier() { // from class: bhua
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m292.j(new dtsc() { // from class: bhub
        });
        m292.a();
        dtsb m293 = dtsd.m();
        m293.m(1);
        m293.b("conversations.notification_enabled");
        m293.i(-1);
        m293.c(new Supplier() { // from class: bhuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m293.j(new dtsc() { // from class: bhue
        });
        m293.a();
        dtsb m294 = dtsd.m();
        m294.m(4);
        m294.b("conversations.notification_sound_uri");
        m294.i(-1);
        m294.c(new Supplier() { // from class: bhuf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m294.j(new dtsc() { // from class: bhug
        });
        m294.a();
        dtsb m295 = dtsd.m();
        m295.m(1);
        m295.b("conversations.notification_vibration");
        m295.i(-1);
        m295.c(new Supplier() { // from class: bhuh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m295.j(new dtsc() { // from class: bhui
        });
        m295.a();
        dtsb m296 = dtsd.m();
        m296.m(1);
        m296.b("conversations.include_email_addr");
        m296.i(-1);
        m296.c(new Supplier() { // from class: bhuj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m296.j(new dtsc() { // from class: bhul
        });
        m296.a();
        dtsb m297 = dtsd.m();
        m297.m(4);
        m297.b("conversations.sms_service_center");
        m297.i(-1);
        m297.c(new Supplier() { // from class: bhum
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m297.j(new dtsc() { // from class: bhun
        });
        m297.a();
        dtsb m298 = dtsd.m();
        m298.m(4);
        m298.b("conversations.participant_id_list");
        m298.i(8500);
        m298.c(new Supplier() { // from class: bhup
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m298.j(new dtsc() { // from class: bhuq
        });
        m298.a();
        dtsb m299 = dtsd.m();
        m299.m(4);
        m299.l(true);
        m299.d(true);
        m299.b("conversations.normalized_participant_id_list");
        m299.f(true);
        m299.i(58090);
        m299.c(new Supplier() { // from class: bhur
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m299.j(new dtsc() { // from class: bhus
        });
        m299.a();
        dtsb m300 = dtsd.m();
        m300.m(1);
        m300.b("conversations.source_type");
        m300.i(8500);
        m300.c(new Supplier() { // from class: bhut
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m300.j(new dtsc() { // from class: bhuu
        });
        m300.a();
        dtsb m301 = dtsd.m();
        m301.m(1);
        m301.d(true);
        m301.b("conversations.rcs_session_id");
        m301.i(10000);
        m301.c(new Supplier() { // from class: bhuv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m301.j(new dtsc() { // from class: bhux
        });
        m301.a();
        dtsb m302 = dtsd.m();
        m302.m(1);
        m302.b("conversations.join_state");
        m302.i(10006);
        m302.c(new Supplier() { // from class: bhuy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m302.j(new dtsc() { // from class: bhva
        });
        m302.a();
        dtsb m303 = dtsd.m();
        m303.m(1);
        m303.b("conversations.send_mode");
        m303.i(10016);
        m303.c(new Supplier() { // from class: bhvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m303.j(new dtsc() { // from class: bhvc
        });
        m303.a();
        dtsb m304 = dtsd.m();
        m304.m(1);
        m304.b("conversations.IS_ENTERPRISE");
        m304.i(10018);
        m304.c(new Supplier() { // from class: bhvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m304.j(new dtsc() { // from class: bhve
        });
        m304.a();
        dtsb m305 = dtsd.m();
        m305.m(1);
        m305.b("conversations.last_interactive_event_timestamp");
        m305.i(15000);
        m305.c(new Supplier() { // from class: bhvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m305.j(new dtsc() { // from class: bhvg
        });
        m305.a();
        dtsb m306 = dtsd.m();
        m306.m(4);
        m306.b("conversations.participant_display_destination");
        m306.i(15010);
        m306.c(new Supplier() { // from class: bhvh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m306.j(new dtsc() { // from class: bhvj
        });
        m306.a();
        dtsb m307 = dtsd.m();
        m307.m(4);
        m307.b("conversations.normalized_participant_display_destination");
        m307.i(58090);
        m307.c(new Supplier() { // from class: bhvl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m307.j(new dtsc() { // from class: bhvm
        });
        m307.a();
        dtsb m308 = dtsd.m();
        m308.m(1);
        m308.b("conversations.spam_warning_dismiss_status");
        m308.i(23000);
        m308.c(new Supplier() { // from class: bhvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m308.j(new dtsc() { // from class: bhvo
        });
        m308.a();
        dtsb m309 = dtsd.m();
        m309.m(1);
        m309.b("conversations.open_count");
        m309.i(26020);
        m309.c(new Supplier() { // from class: bhvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m309.j(new dtsc() { // from class: bhvq
        });
        m309.a();
        dtsb m310 = dtsd.m();
        m310.m(1);
        m310.b("conversations.last_logged_scooby_metadata_timestamp");
        m310.i(28010);
        m310.c(new Supplier() { // from class: bhvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m310.j(new dtsc() { // from class: bhvs
        });
        m310.a();
        dtsb m311 = dtsd.m();
        m311.m(1);
        m311.d(true);
        m311.b("conversations.delete_timestamp");
        m311.i(29020);
        m311.c(new Supplier() { // from class: bhvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m311.j(new dtsc() { // from class: bhvw
        });
        m311.a();
        dtsb m312 = dtsd.m();
        m312.m(4);
        m312.l(true);
        m312.d(true);
        m312.b("conversations.cms_id");
        m312.f(true);
        m312.i(32000);
        m312.c(new Supplier() { // from class: bhvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m312.j(new dtsc() { // from class: bhvy
        });
        m312.a();
        dtsb m313 = dtsd.m();
        m313.m(5);
        m313.b("conversations.tachygram_group_routing_info_token");
        m313.i(58120);
        m313.c(new Supplier() { // from class: bhvz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m313.j(new dtsc() { // from class: bhwa
        });
        m313.a();
        dtsb m314 = dtsd.m();
        m314.m(1);
        m314.b("conversations.cms_most_recent_read_message_timestamp_ms");
        m314.i(53030);
        m314.c(new Supplier() { // from class: bhwb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m314.j(new dtsc() { // from class: bhwc
        });
        m314.a();
        dtsb m315 = dtsd.m();
        m315.m(2);
        m315.b("conversations.rcs_subject_change_timestamp_ms");
        m315.i(46050);
        m315.c(new Supplier() { // from class: bhwd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m315.j(new dtsc() { // from class: bhwe
        });
        m315.a();
        dtsb m316 = dtsd.m();
        m316.m(2);
        m316.b("conversations.rcs_group_capabilities");
        m316.i(49020);
        m316.c(new Supplier() { // from class: bhwf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m316.j(new dtsc() { // from class: bhwi
        });
        m316.a();
        dtsb m317 = dtsd.m();
        m317.m(1);
        m317.b("conversations.awaiting_reverse_sync");
        m317.i(49060);
        m317.c(new Supplier() { // from class: bhwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m317.j(new dtsc() { // from class: bhwk
        });
        m317.a();
        dtsb m318 = dtsd.m();
        m318.m(2);
        m318.d(true);
        m318.e(true);
        m318.h(new Supplier() { // from class: bhwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m318.b("conversations.duplicate_of");
        m318.i(58090);
        m318.c(new Supplier() { // from class: bhwm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m318.j(new dtsc() { // from class: bhwn
        });
        m318.a();
        dtsb m319 = dtsd.m();
        m319.m(2);
        m319.d(true);
        m319.e(true);
        m319.h(new Supplier() { // from class: bhwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m319.b("conversations.new_duplicate_of");
        m319.i(59130);
        m319.c(new Supplier() { // from class: bhwp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m319.j(new dtsc() { // from class: bhwq
        });
        m319.a();
        dtsb m320 = dtsd.m();
        m320.m(1);
        m320.b("conversations.error_state");
        m320.i(58140);
        m320.c(new Supplier() { // from class: bhws
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m320.j(new dtsc() { // from class: bhwu
        });
        m320.a();
        dtsb m321 = dtsd.m();
        m321.m(1);
        m321.b("conversations.cms_life_cycle");
        m321.i(58210);
        m321.c(new Supplier() { // from class: bhwv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m321.j(new dtsc() { // from class: bhww
        });
        m321.a();
        dtsb m322 = dtsd.m();
        m322.m(4);
        m322.b("conversations.rcs_group_self_msisdn");
        m322.i(58540);
        m322.c(new Supplier() { // from class: bhwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m322.j(new dtsc() { // from class: bhwy
        });
        m322.a();
        dtsb m323 = dtsd.m();
        m323.m(2);
        m323.b("conversations.rcs_group_last_sync_timestamp");
        m323.i(58910);
        m323.c(new Supplier() { // from class: bhwz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m323.j(new dtsc() { // from class: bhxa
        });
        m323.a();
        dtsb m324 = dtsd.m();
        m324.m(1);
        m324.b("conversations.has_been_e2ee");
        m324.i(59210);
        m324.c(new Supplier() { // from class: bhxb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m324.j(new dtsc() { // from class: bhxe
        });
        m324.a();
        dtsb m325 = dtsd.m();
        m325.m(1);
        m325.b("conversations.marked_as_unread");
        m325.i(59220);
        m325.c(new Supplier() { // from class: bhxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m325.j(new dtsc() { // from class: bhxh
        });
        m325.a();
        dtsb m326 = dtsd.m();
        m326.m(5);
        m326.b("conversations.custom_theme");
        m326.i(59820);
        m326.c(new Supplier() { // from class: bhxi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m326.j(new dtsc() { // from class: bhxj
        });
        m326.a();
        dtsb m327 = dtsd.m();
        m327.m(2);
        m327.b("conversations.mms_group_upgrade_status");
        m327.i(60050);
        m327.c(new Supplier() { // from class: bhxk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m327.j(new dtsc() { // from class: bhxl
        });
        m327.a();
        dtsb m328 = dtsd.m();
        m328.m(2);
        m328.b("conversations.mms_group_upgrade_retries");
        m328.i(60050);
        m328.c(new Supplier() { // from class: bhxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m328.j(new dtsc() { // from class: bhxn
        });
        m328.a();
        dtsb m329 = dtsd.m();
        m329.m(2);
        m329.b("conversations.encryption_protocol");
        m329.i(60180);
        m329.c(new Supplier() { // from class: bhxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m329.j(new dtsc() { // from class: bhxq
        });
        m329.a();
        dtsb m330 = dtsd.m();
        m330.m(4);
        m330.b("conversations.encryption_id");
        m330.i(60210);
        m330.c(new Supplier() { // from class: bhxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m330.j(new dtsc() { // from class: bhxt
        });
        m330.a();
        dtsb m331 = dtsd.m();
        m331.m(4);
        m331.l(true);
        m331.d(true);
        m331.b("conversations.cms_correlation_id");
        m331.f(true);
        m331.i(60250);
        m331.c(new Supplier() { // from class: bhxu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m331.j(new dtsc() { // from class: bhxv
        });
        m331.a();
        dtsb m332 = dtsd.m();
        m332.m(4);
        m332.b("conversations.rcs_group_icon_url");
        m332.i(60590);
        m332.c(new Supplier() { // from class: bhxw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m332.j(new dtsc() { // from class: bhxx
        });
        m332.a();
        dtsb m333 = dtsd.m();
        m333.m(2);
        m333.b("conversations.unread_count");
        m333.i(60740);
        m333.c(new Supplier() { // from class: bhxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m333.j(new dtsc() { // from class: bhya
        });
        m333.a();
        dtsb m334 = dtsd.m();
        m334.m(5);
        m334.b("message_reactions.reactions_data");
        m334.i(-1);
        m334.c(new Supplier() { // from class: bhyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m334.j(new dtsc() { // from class: bhyc
        });
        m334.a();
        dtsb m335 = dtsd.m();
        m335.m(2);
        m335.l(true);
        m335.g(true);
        m335.d(true);
        m335.b("message_reactions._id");
        m335.i(-1);
        m335.c(new Supplier() { // from class: bhyd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m335.j(new dtsc() { // from class: bhyf
        });
        m335.a();
        dtsb m336 = dtsd.m();
        m336.m(2);
        m336.l(true);
        m336.d(true);
        m336.e(true);
        m336.h(new Supplier() { // from class: bhyg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m336.b("message_reactions.message_id");
        m336.i(-1);
        m336.c(new Supplier() { // from class: bhyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m336.j(new dtsc() { // from class: bhyi
        });
        m336.a();
        dtsb m337 = dtsd.m();
        m337.m(2);
        m337.d(true);
        m337.e(true);
        m337.h(new Supplier() { // from class: bhyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m337.b("message_reactions.reacted_message_id");
        m337.i(46020);
        m337.c(new Supplier() { // from class: bhyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m337.j(new dtsc() { // from class: bhym
        });
        m337.a();
        dtsb m338 = dtsd.m();
        m338.m(2);
        m338.b("message_reactions.reaction");
        m338.i(48000);
        m338.c(new Supplier() { // from class: bhyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m338.j(new dtsc() { // from class: bhyo
        });
        m338.a();
        dtsb m339 = dtsd.m();
        m339.m(5);
        m339.b("message_reactions.applied_reaction");
        m339.i(59060);
        m339.c(new Supplier() { // from class: bhyp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m339.j(new dtsc() { // from class: bhys
        });
        m339.a();
        dtsb m340 = dtsd.m();
        m340.m(5);
        m340.d(true);
        m340.b("message_reactions.animation_effect");
        m340.i(59520);
        m340.c(new Supplier() { // from class: bhyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m340.j(new dtsc() { // from class: bhyu
        });
        m340.a();
        dtsb m341 = dtsd.m();
        m341.m(4);
        m341.d(true);
        m341.b("file_transfer.transfer_id");
        m341.i(-1);
        m341.c(new Supplier() { // from class: bhyw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m341.j(new dtsc() { // from class: bhyx
        });
        m341.a();
        dtsb m342 = dtsd.m();
        m342.m(1);
        m342.l(true);
        m342.g(true);
        m342.d(true);
        m342.e(true);
        m342.h(new Supplier() { // from class: bhyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m342.b("file_transfer.message_id");
        m342.i(-1);
        m342.c(new Supplier() { // from class: bhyz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m342.j(new dtsc() { // from class: bhza
        });
        m342.a();
        dtsb m343 = dtsd.m();
        m343.m(1);
        m343.b("file_transfer.transfer_type");
        m343.i(-1);
        m343.c(new Supplier() { // from class: bhzb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m343.j(new dtsc() { // from class: bhzc
        });
        m343.a();
        dtsb m344 = dtsd.m();
        m344.m(5);
        m344.b("file_transfer.attachment_upload_response");
        m344.i(-1);
        m344.c(new Supplier() { // from class: bhze
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m344.j(new dtsc() { // from class: bhzf
        });
        m344.a();
        dtsb m345 = dtsd.m();
        m345.m(5);
        m345.b("file_transfer.file_information");
        m345.i(55030);
        m345.c(new Supplier() { // from class: bhzh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m345.j(new dtsc() { // from class: bhzi
        });
        m345.a();
        dtsb m346 = dtsd.m();
        m346.m(5);
        m346.b("file_transfer.thumbnail_information");
        m346.i(59910);
        m346.c(new Supplier() { // from class: bhzj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m346.j(new dtsc() { // from class: bhzk
        });
        m346.a();
        dtsb m347 = dtsd.m();
        m347.m(4);
        m347.b("file_transfer.transfer_handle");
        m347.i(55030);
        m347.c(new Supplier() { // from class: bhzl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m347.j(new dtsc() { // from class: bhzm
        });
        m347.a();
        dtsb m348 = dtsd.m();
        m348.m(5);
        m348.b("file_transfer.opaque_data");
        m348.i(56040);
        m348.c(new Supplier() { // from class: bhzn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m348.j(new dtsc() { // from class: bhzo
        });
        m348.a();
        dtsb m349 = dtsd.m();
        m349.m(2);
        m349.l(true);
        m349.d(true);
        m349.e(true);
        m349.h(new Supplier() { // from class: bhzq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m349.b("message_star.message_id");
        m349.f(true);
        m349.i(-1);
        m349.c(new Supplier() { // from class: bhzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m349.j(new dtsc() { // from class: bhzt
        });
        m349.a();
        dtsb m350 = dtsd.m();
        m350.m(2);
        m350.l(true);
        m350.g(true);
        m350.d(true);
        m350.b("message_star._id");
        m350.i(-1);
        m350.c(new Supplier() { // from class: bhzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m350.j(new dtsc() { // from class: bhzv
        });
        m350.a();
        dtsb m351 = dtsd.m();
        m351.m(5);
        m351.b("message_photos_sharing.sharing_state");
        m351.i(-1);
        m351.c(new Supplier() { // from class: bhzw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m351.j(new dtsc() { // from class: bhzx
        });
        m351.a();
        dtsb m352 = dtsd.m();
        m352.m(2);
        m352.l(true);
        m352.d(true);
        m352.e(true);
        m352.h(new Supplier() { // from class: bhzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m352.b("message_photos_sharing.message_id");
        m352.f(true);
        m352.i(-1);
        m352.c(new Supplier() { // from class: bhzz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m352.j(new dtsc() { // from class: biaa
        });
        m352.a();
        dtsb m353 = dtsd.m();
        m353.m(2);
        m353.l(true);
        m353.d(true);
        m353.e(true);
        m353.h(new Supplier() { // from class: biad
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d.a;
            }
        });
        m353.b("vmt.part_id");
        m353.f(true);
        m353.i(-1);
        m353.c(new Supplier() { // from class: biae
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m353.j(new dtsc() { // from class: biaf
        });
        m353.a();
        dtsb m354 = dtsd.m();
        m354.m(2);
        m354.b("vmt.vmt_status");
        m354.i(-1);
        m354.c(new Supplier() { // from class: biag
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m354.j(new dtsc() { // from class: biah
        });
        m354.a();
        dtsb m355 = dtsd.m();
        m355.m(4);
        m355.b("vmt.text");
        m355.i(-1);
        m355.c(new Supplier() { // from class: biai
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m355.j(new dtsc() { // from class: biaj
        });
        m355.a();
        dtsb m356 = dtsd.m();
        m356.m(4);
        m356.b("vmt.locale");
        m356.i(-1);
        m356.c(new Supplier() { // from class: biak
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m356.j(new dtsc() { // from class: bial
        });
        m356.a();
        dtsb m357 = dtsd.m();
        m357.m(8);
        m357.b("vmt__ROWID");
        m357.i(0);
        m357.c(new Supplier() { // from class: biam
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m357.j(new dtsc() { // from class: biap
        });
        m357.a();
        dtsb m358 = dtsd.m();
        m358.m(2);
        m358.l(true);
        m358.d(true);
        m358.e(true);
        m358.h(new Supplier() { // from class: biaq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m358.b("message_replies.message_id");
        m358.f(true);
        m358.i(-1);
        m358.c(new Supplier() { // from class: biar
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m358.j(new dtsc() { // from class: bias
        });
        m358.a();
        dtsb m359 = dtsd.m();
        m359.m(2);
        m359.d(true);
        m359.e(true);
        m359.h(new Supplier() { // from class: biat
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m359.b("message_replies.replied_to_message_id");
        m359.i(-1);
        m359.c(new Supplier() { // from class: biau
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m359.j(new dtsc() { // from class: biav
        });
        m359.a();
        dtsb m360 = dtsd.m();
        m360.m(1);
        m360.b("message_replies.replied_to_message_id_null_reason");
        m360.i(-1);
        m360.c(new Supplier() { // from class: biaw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m360.j(new dtsc() { // from class: biax
        });
        m360.a();
        dtsb m361 = dtsd.m();
        m361.m(4);
        m361.d(true);
        m361.b("message_replies.replied_to_rcs_message_id");
        m361.i(-1);
        m361.c(new Supplier() { // from class: biaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m361.j(new dtsc() { // from class: bibb
        });
        m361.a();
        dtsb m362 = dtsd.m();
        m362.m(2);
        m362.l(true);
        m362.g(true);
        m362.d(true);
        m362.b("replied_to_message._id");
        m362.i(-1);
        m362.c(new Supplier() { // from class: bibc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m362.j(new dtsc() { // from class: bibd
        });
        m362.a();
        dtsb m363 = dtsd.m();
        m363.m(1);
        m363.d(true);
        m363.b("replied_to_message.received_timestamp");
        m363.i(-1);
        m363.c(new Supplier() { // from class: bibe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m363.j(new dtsc() { // from class: bibf
        });
        m363.a();
        dtsb m364 = dtsd.m();
        m364.m(1);
        m364.d(true);
        m364.e(true);
        m364.h(new Supplier() { // from class: bibg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m364.b("replied_to_message.conversation_id");
        m364.i(-1);
        m364.c(new Supplier() { // from class: bibh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m364.j(new dtsc() { // from class: bibi
        });
        m364.a();
        dtsb m365 = dtsd.m();
        m365.m(1);
        m365.d(true);
        m365.e(true);
        m365.h(new Supplier() { // from class: bibl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m365.b("replied_to_message.sender_id");
        m365.i(-1);
        m365.c(new Supplier() { // from class: bibm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m365.j(new dtsc() { // from class: bibo
        });
        m365.a();
        dtsb m366 = dtsd.m();
        m366.m(4);
        m366.b("replied_to_message.sender_send_destination");
        m366.i(54040);
        m366.c(new Supplier() { // from class: bibp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m366.j(new dtsc() { // from class: bibq
        });
        m366.a();
        dtsb m367 = dtsd.m();
        m367.m(4);
        m367.b("replied_to_message.msisdn_receiving_rcs_message");
        m367.i(59340);
        m367.c(new Supplier() { // from class: bibr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m367.j(new dtsc() { // from class: bibs
        });
        m367.a();
        dtsb m368 = dtsd.m();
        m368.m(4);
        m368.b("replied_to_message.receiving_network_country");
        m368.i(54040);
        m368.c(new Supplier() { // from class: bibt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m368.j(new dtsc() { // from class: bibu
        });
        m368.a();
        dtsb m369 = dtsd.m();
        m369.m(1);
        m369.d(true);
        m369.b("replied_to_message.sent_timestamp");
        m369.i(-1);
        m369.c(new Supplier() { // from class: bibw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m369.j(new dtsc() { // from class: bibx
        });
        m369.a();
        dtsb m370 = dtsd.m();
        m370.m(1);
        m370.b("replied_to_message.queue_insert_timestamp");
        m370.i(17030);
        m370.c(new Supplier() { // from class: biby
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m370.j(new dtsc() { // from class: bica
        });
        m370.a();
        dtsb m371 = dtsd.m();
        m371.m(1);
        m371.b("replied_to_message.message_protocol");
        m371.i(-1);
        m371.c(new Supplier() { // from class: bicb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m371.j(new dtsc() { // from class: bicc
        });
        m371.a();
        dtsb m372 = dtsd.m();
        m372.m(1);
        m372.d(true);
        m372.b("replied_to_message.message_status");
        m372.i(-1);
        m372.c(new Supplier() { // from class: bicd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m372.j(new dtsc() { // from class: bice
        });
        m372.a();
        dtsb m373 = dtsd.m();
        m373.m(1);
        m373.b("replied_to_message.message_report_status");
        m373.i(13020);
        m373.c(new Supplier() { // from class: bicf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m373.j(new dtsc() { // from class: bich
        });
        m373.a();
        dtsb m374 = dtsd.m();
        m374.m(1);
        m374.d(true);
        m374.b("replied_to_message.seen");
        m374.f(true);
        m374.i(-1);
        m374.c(new Supplier() { // from class: bici
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m374.j(new dtsc() { // from class: bicj
        });
        m374.a();
        dtsb m375 = dtsd.m();
        m375.m(1);
        m375.d(true);
        m375.b("replied_to_message.read");
        m375.i(-1);
        m375.c(new Supplier() { // from class: bick
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m375.j(new dtsc() { // from class: bicm
        });
        m375.a();
        dtsb m376 = dtsd.m();
        m376.m(4);
        m376.d(true);
        m376.b("replied_to_message.sms_message_uri");
        m376.i(-1);
        m376.c(new Supplier() { // from class: bicn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m376.j(new dtsc() { // from class: bico
        });
        m376.a();
        dtsb m377 = dtsd.m();
        m377.m(1);
        m377.b("replied_to_message.sms_priority");
        m377.i(-1);
        m377.c(new Supplier() { // from class: bicp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m377.j(new dtsc() { // from class: bicq
        });
        m377.a();
        dtsb m378 = dtsd.m();
        m378.m(1);
        m378.b("replied_to_message.sms_message_size");
        m378.i(-1);
        m378.c(new Supplier() { // from class: bics
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m378.j(new dtsc() { // from class: bict
        });
        m378.a();
        dtsb m379 = dtsd.m();
        m379.m(4);
        m379.b("replied_to_message.mms_subject");
        m379.i(-1);
        m379.c(new Supplier() { // from class: bicu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m379.j(new dtsc() { // from class: bicv
        });
        m379.a();
        dtsb m380 = dtsd.m();
        m380.m(4);
        m380.b("replied_to_message.mms_transaction_id");
        m380.i(-1);
        m380.c(new Supplier() { // from class: bicw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m380.j(new dtsc() { // from class: bicy
        });
        m380.a();
        dtsb m381 = dtsd.m();
        m381.m(4);
        m381.b("replied_to_message.mms_content_location");
        m381.i(-1);
        m381.c(new Supplier() { // from class: bicz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m381.j(new dtsc() { // from class: bida
        });
        m381.a();
        dtsb m382 = dtsd.m();
        m382.m(1);
        m382.b("replied_to_message.mms_expiry");
        m382.i(-1);
        m382.c(new Supplier() { // from class: bidb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m382.j(new dtsc() { // from class: bidd
        });
        m382.a();
        dtsb m383 = dtsd.m();
        m383.m(1);
        m383.d(true);
        m383.b("replied_to_message.rcs_expiry");
        m383.i(59890);
        m383.c(new Supplier() { // from class: bide
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m383.j(new dtsc() { // from class: bidf
        });
        m383.a();
        dtsb m384 = dtsd.m();
        m384.m(4);
        m384.b("replied_to_message.mms_retrieve_text");
        m384.i(9030);
        m384.c(new Supplier() { // from class: bidg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m384.j(new dtsc() { // from class: bidh
        });
        m384.a();
        dtsb m385 = dtsd.m();
        m385.m(1);
        m385.b("replied_to_message.raw_status");
        m385.i(-1);
        m385.c(new Supplier() { // from class: bidi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m385.j(new dtsc() { // from class: bidl
        });
        m385.a();
        dtsb m386 = dtsd.m();
        m386.m(1);
        m386.d(true);
        m386.e(true);
        m386.h(new Supplier() { // from class: bidm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m386.b("replied_to_message.self_id");
        m386.i(-1);
        m386.c(new Supplier() { // from class: bido
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m386.j(new dtsc() { // from class: bidp
        });
        m386.a();
        dtsb m387 = dtsd.m();
        m387.m(4);
        m387.d(true);
        m387.b("replied_to_message.my_identity");
        m387.i(59810);
        m387.c(new Supplier() { // from class: bidq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m387.j(new dtsc() { // from class: bidr
        });
        m387.a();
        dtsb m388 = dtsd.m();
        m388.m(4);
        m388.d(true);
        m388.e(true);
        m388.h(new Supplier() { // from class: bids
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m388.b("replied_to_message.my_identity_foreign_key");
        m388.i(60160);
        m388.c(new Supplier() { // from class: bidt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m388.j(new dtsc() { // from class: bidu
        });
        m388.a();
        dtsb m389 = dtsd.m();
        m389.m(1);
        m389.b("replied_to_message.retry_start_timestamp");
        m389.i(-1);
        m389.c(new Supplier() { // from class: bidv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m389.j(new dtsc() { // from class: bidx
        });
        m389.a();
        dtsb m390 = dtsd.m();
        m390.m(4);
        m390.d(true);
        m390.b("replied_to_message.cloud_sync_id");
        m390.i(8500);
        m390.c(new Supplier() { // from class: bidz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m390.j(new dtsc() { // from class: biea
        });
        m390.a();
        dtsb m391 = dtsd.m();
        m391.m(7);
        m391.d(true);
        m391.b("replied_to_message.rcs_message_id");
        m391.f(true);
        m391.i(10000);
        m391.c(new Supplier() { // from class: bieb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m391.j(new dtsc() { // from class: biec
        });
        m391.a();
        dtsb m392 = dtsd.m();
        m392.m(4);
        m392.d(true);
        m392.b("replied_to_message.rcs_message_id_with_text_type");
        m392.f(true);
        m392.i(41040);
        m392.c(new Supplier() { // from class: bied
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m392.j(new dtsc() { // from class: biee
        });
        m392.a();
        dtsb m393 = dtsd.m();
        m393.m(1);
        m393.b("replied_to_message.etouffee_status");
        m393.i(29060);
        m393.c(new Supplier() { // from class: bief
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m393.j(new dtsc() { // from class: bieg
        });
        m393.a();
        dtsb m394 = dtsd.m();
        m394.m(1);
        m394.b("replied_to_message.verification_status");
        m394.i(29090);
        m394.c(new Supplier() { // from class: bieh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m394.j(new dtsc() { // from class: biek
        });
        m394.a();
        dtsb m395 = dtsd.m();
        m395.m(1);
        m395.b("replied_to_message.rcs_ui_status");
        m395.i(39000);
        m395.c(new Supplier() { // from class: biel
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m395.j(new dtsc() { // from class: biem
        });
        m395.a();
        dtsb m396 = dtsd.m();
        m396.m(1);
        m396.d(true);
        m396.b("replied_to_message.is_hidden");
        m396.i(30010);
        m396.c(new Supplier() { // from class: bien
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m396.j(new dtsc() { // from class: bieo
        });
        m396.a();
        dtsb m397 = dtsd.m();
        m397.m(7);
        m397.b("replied_to_message.rcs_remote_instance");
        m397.i(10002);
        m397.c(new Supplier() { // from class: biep
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m397.j(new dtsc() { // from class: bieq
        });
        m397.a();
        dtsb m398 = dtsd.m();
        m398.m(1);
        m398.b("replied_to_message.rcs_file_transfer_session_id");
        m398.i(10004);
        m398.c(new Supplier() { // from class: bier
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m398.j(new dtsc() { // from class: bies
        });
        m398.a();
        dtsb m399 = dtsd.m();
        m399.m(1);
        m399.b("replied_to_message.sms_error_code");
        m399.i(9000);
        m399.c(new Supplier() { // from class: biet
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m399.j(new dtsc() { // from class: biew
        });
        m399.a();
        dtsb m400 = dtsd.m();
        m400.m(4);
        m400.b("replied_to_message.sms_error_desc_map_name");
        m400.i(9000);
        m400.c(new Supplier() { // from class: biex
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m400.j(new dtsc() { // from class: biey
        });
        m400.a();
        dtsb m401 = dtsd.m();
        m401.m(4);
        m401.b("replied_to_message.correlation_id");
        m401.i(9010);
        m401.c(new Supplier() { // from class: biez
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m401.j(new dtsc() { // from class: bifa
        });
        m401.a();
        dtsb m402 = dtsd.m();
        m402.m(4);
        m402.l(true);
        m402.d(true);
        m402.b("replied_to_message.cms_id");
        m402.f(true);
        m402.i(31010);
        m402.c(new Supplier() { // from class: bifb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m402.j(new dtsc() { // from class: bifc
        });
        m402.a();
        dtsb m403 = dtsd.m();
        m403.m(2);
        m403.b("replied_to_message.cms_last_mod_seq");
        m403.i(37040);
        m403.c(new Supplier() { // from class: bifd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m403.j(new dtsc() { // from class: bife
        });
        m403.a();
        dtsb m404 = dtsd.m();
        m404.m(4);
        m404.d(true);
        m404.b("replied_to_message.web_id");
        m404.i(19020);
        m404.c(new Supplier() { // from class: bifg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m404.j(new dtsc() { // from class: bifi
        });
        m404.a();
        dtsb m405 = dtsd.m();
        m405.m(1);
        m405.b("replied_to_message.usage_stats_logging_id");
        m405.i(29100);
        m405.c(new Supplier() { // from class: bifj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m405.j(new dtsc() { // from class: bifk
        });
        m405.a();
        dtsb m406 = dtsd.m();
        m406.m(1);
        m406.b("replied_to_message.send_counter");
        m406.i(35030);
        m406.c(new Supplier() { // from class: bifl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m406.j(new dtsc() { // from class: bifm
        });
        m406.a();
        dtsb m407 = dtsd.m();
        m407.m(4);
        m407.d(true);
        m407.b("replied_to_message.original_rcs_message_id");
        m407.i(35030);
        m407.c(new Supplier() { // from class: bifn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m407.j(new dtsc() { // from class: bifo
        });
        m407.a();
        dtsb m408 = dtsd.m();
        m408.m(4);
        m408.b("replied_to_message.custom_delivery_receipt_mime_type");
        m408.i(37020);
        m408.c(new Supplier() { // from class: bifp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m408.j(new dtsc() { // from class: bgmt
        });
        m408.a();
        dtsb m409 = dtsd.m();
        m409.m(5);
        m409.b("replied_to_message.custom_delivery_receipt_content");
        m409.i(37020);
        m409.c(new Supplier() { // from class: bgmu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m409.j(new dtsc() { // from class: bgmw
        });
        m409.a();
        dtsb m410 = dtsd.m();
        m410.m(1);
        m410.b("replied_to_message.report_attempt_acounter");
        m410.i(37030);
        m410.c(new Supplier() { // from class: bgmx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m410.j(new dtsc() { // from class: bgmy
        });
        m410.a();
        dtsb m411 = dtsd.m();
        m411.m(5);
        m411.b("replied_to_message.custom_headers");
        m411.i(45020);
        m411.c(new Supplier() { // from class: bgmz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m411.j(new dtsc() { // from class: bgna
        });
        m411.a();
        dtsb m412 = dtsd.m();
        m412.m(4);
        m412.l(true);
        m412.d(true);
        m412.b("replied_to_message.cms_correlation_id");
        m412.f(true);
        m412.i(46010);
        m412.c(new Supplier() { // from class: bgnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m412.j(new dtsc() { // from class: bgnc
        });
        m412.a();
        dtsb m413 = dtsd.m();
        m413.m(1);
        m413.d(true);
        m413.e(true);
        m413.h(new Supplier() { // from class: bgne
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m413.b("replied_to_message.group_private_participant");
        m413.i(48030);
        m413.c(new Supplier() { // from class: bgnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m413.j(new dtsc() { // from class: bgng
        });
        m413.a();
        dtsb m414 = dtsd.m();
        m414.m(1);
        m414.d(true);
        m414.e(true);
        m414.h(new Supplier() { // from class: bgni
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m414.b("replied_to_message.original_message_id");
        m414.i(48030);
        m414.c(new Supplier() { // from class: bgnj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m414.j(new dtsc() { // from class: bgnk
        });
        m414.a();
        dtsb m415 = dtsd.m();
        m415.m(1);
        m415.b("replied_to_message.awaiting_reverse_sync");
        m415.i(49060);
        m415.c(new Supplier() { // from class: bgnl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m415.j(new dtsc() { // from class: bgnm
        });
        m415.a();
        dtsb m416 = dtsd.m();
        m416.m(4);
        m416.b("replied_to_message.old_sms_message_uri");
        m416.i(49060);
        m416.c(new Supplier() { // from class: bgnn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m416.j(new dtsc() { // from class: bgnp
        });
        m416.a();
        dtsb m417 = dtsd.m();
        m417.m(4);
        m417.l(true);
        m417.d(true);
        m417.b("replied_to_message.draft_id");
        m417.f(true);
        m417.i(56000);
        m417.c(new Supplier() { // from class: bgnq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m417.j(new dtsc() { // from class: bgnr
        });
        m417.a();
        dtsb m418 = dtsd.m();
        m418.m(1);
        m418.b("replied_to_message.result_code");
        m418.i(58040);
        m418.c(new Supplier() { // from class: bgns
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m418.j(new dtsc() { // from class: bgnu
        });
        m418.a();
        dtsb m419 = dtsd.m();
        m419.m(1);
        m419.b("replied_to_message.cms_life_cycle");
        m419.i(58210);
        m419.c(new Supplier() { // from class: bgnv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m419.j(new dtsc() { // from class: bgnw
        });
        m419.a();
        dtsb m420 = dtsd.m();
        m420.m(1);
        m420.b("replied_to_message.mute_priority");
        m420.i(60750);
        m420.c(new Supplier() { // from class: bgnx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m420.j(new dtsc() { // from class: bgny
        });
        m420.a();
        dtsb m421 = dtsd.m();
        m421.m(1);
        m421.b("replied_to_message.fallback_reason");
        m421.i(58710);
        m421.c(new Supplier() { // from class: bgoa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m421.j(new dtsc() { // from class: bgob
        });
        m421.a();
        dtsb m422 = dtsd.m();
        m422.m(1);
        m422.b("replied_to_message.auto_retry_counter");
        m422.i(58230);
        m422.c(new Supplier() { // from class: bgoc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m422.j(new dtsc() { // from class: bgod
        });
        m422.a();
        dtsb m423 = dtsd.m();
        m423.m(2);
        m423.b("replied_to_message.can_revoke_before_delivered_with_rcs");
        m423.i(58280);
        m423.c(new Supplier() { // from class: bgoe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m423.j(new dtsc() { // from class: bgog
        });
        m423.a();
        dtsb m424 = dtsd.m();
        m424.m(5);
        m424.b("replied_to_message.trace_id");
        m424.i(58680);
        m424.c(new Supplier() { // from class: bgoh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m424.j(new dtsc() { // from class: bgoi
        });
        m424.a();
        dtsb m425 = dtsd.m();
        m425.m(1);
        m425.b("replied_to_message.outgoing_delivery_report_status");
        m425.i(58720);
        m425.c(new Supplier() { // from class: bgoj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m425.j(new dtsc() { // from class: bgol
        });
        m425.a();
        dtsb m426 = dtsd.m();
        m426.m(1);
        m426.b("replied_to_message.outgoing_read_report_status");
        m426.i(58720);
        m426.c(new Supplier() { // from class: bgom
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m426.j(new dtsc() { // from class: bgon
        });
        m426.a();
        dtsb m427 = dtsd.m();
        m427.m(1);
        m427.b("replied_to_message.xms_transport");
        m427.i(59310);
        m427.c(new Supplier() { // from class: bgoo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m427.j(new dtsc() { // from class: bgop
        });
        m427.a();
        dtsb m428 = dtsd.m();
        m428.m(1);
        m428.b("replied_to_message.message_original_protocol");
        m428.i(59430);
        m428.c(new Supplier() { // from class: bgoq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m428.j(new dtsc() { // from class: bgos
        });
        m428.a();
        dtsb m429 = dtsd.m();
        m429.m(4);
        m429.l(true);
        m429.d(true);
        m429.b("replied_to_message.satellite_datagram_id");
        m429.f(true);
        m429.i(59490);
        m429.c(new Supplier() { // from class: bgot
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m429.j(new dtsc() { // from class: bgou
        });
        m429.a();
        dtsb m430 = dtsd.m();
        m430.m(1);
        m430.b("replied_to_message.encryption_protocol");
        m430.i(60190);
        m430.c(new Supplier() { // from class: bgow
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m430.j(new dtsc() { // from class: bgox
        });
        m430.a();
        dtsb m431 = dtsd.m();
        m431.m(4);
        m431.l(true);
        m431.d(true);
        m431.b("replied_to_message.message_persistence_id");
        m431.f(true);
        m431.i(60370);
        m431.c(new Supplier() { // from class: bgoy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m431.j(new dtsc() { // from class: bgoz
        });
        m431.a();
        dtsb m432 = dtsd.m();
        m432.m(2);
        m432.l(true);
        m432.g(true);
        m432.d(true);
        m432.b("replied_to_participant._id");
        m432.i(-1);
        m432.c(new Supplier() { // from class: bgpa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m432.j(new dtsc() { // from class: bgpb
        });
        m432.a();
        dtsb m433 = dtsd.m();
        m433.m(1);
        m433.d(true);
        m433.b("replied_to_participant.sub_id");
        m433.f(true);
        m433.i(-1);
        m433.c(new Supplier() { // from class: bgpc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m433.j(new dtsc() { // from class: bgpf
        });
        m433.a();
        dtsb m434 = dtsd.m();
        m434.m(4);
        m434.d(true);
        m434.b("replied_to_participant.normalized_destination");
        m434.f(true);
        m434.i(-1);
        m434.c(new Supplier() { // from class: bgph
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m434.j(new dtsc() { // from class: bgpi
        });
        m434.a();
        dtsb m435 = dtsd.m();
        m435.m(4);
        m435.b("replied_to_participant.display_destination");
        m435.i(-1);
        m435.c(new Supplier() { // from class: bgpj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m435.j(new dtsc() { // from class: bgpk
        });
        m435.a();
        dtsb m436 = dtsd.m();
        m436.m(4);
        m436.b("replied_to_participant.full_name");
        m436.i(-1);
        m436.c(new Supplier() { // from class: bgpl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m436.j(new dtsc() { // from class: bgpm
        });
        m436.a();
        dtsb m437 = dtsd.m();
        m437.m(4);
        m437.b("replied_to_participant.first_name");
        m437.i(-1);
        m437.c(new Supplier() { // from class: bgpn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m437.j(new dtsc() { // from class: bgpo
        });
        m437.a();
        dtsb m438 = dtsd.m();
        m438.m(4);
        m438.d(true);
        m438.b("replied_to_participant.my_identity_token");
        m438.i(59930);
        m438.c(new Supplier() { // from class: bgpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m438.j(new dtsc() { // from class: bgps
        });
        m438.a();
        dtsb m439 = dtsd.m();
        m439.m(4);
        m439.d(true);
        m439.e(true);
        m439.h(new Supplier() { // from class: bgpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m439.b("replied_to_participant.my_identity_token_foreign_key");
        m439.i(60160);
        m439.c(new Supplier() { // from class: bgpu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m439.j(new dtsc() { // from class: bgpv
        });
        m439.a();
        dtsb m440 = dtsd.m();
        m440.m(1);
        m440.b("replied_to_participant.sim_slot_id");
        m440.i(2000);
        m440.c(new Supplier() { // from class: bgpw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m440.j(new dtsc() { // from class: bgpx
        });
        m440.a();
        dtsb m441 = dtsd.m();
        m441.m(4);
        m441.b("replied_to_participant.send_destination");
        m441.i(-1);
        m441.c(new Supplier() { // from class: bgpy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m441.j(new dtsc() { // from class: bgpz
        });
        m441.a();
        dtsb m442 = dtsd.m();
        m442.m(4);
        m442.l(true);
        m442.d(true);
        m442.b("replied_to_participant.comparable_destination");
        m442.f(true);
        m442.i(54040);
        m442.c(new Supplier() { // from class: bgqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m442.j(new dtsc() { // from class: bgqb
        });
        m442.a();
        dtsb m443 = dtsd.m();
        m443.m(4);
        m443.b("replied_to_participant.country_code");
        m443.i(54040);
        m443.c(new Supplier() { // from class: bgqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m443.j(new dtsc() { // from class: bgqf
        });
        m443.a();
        dtsb m444 = dtsd.m();
        m444.m(2);
        m444.l(true);
        m444.d(true);
        m444.b("replied_to_participant.recipient_id");
        m444.f(true);
        m444.i(58090);
        m444.c(new Supplier() { // from class: bgqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m444.j(new dtsc() { // from class: bgqh
        });
        m444.a();
        dtsb m445 = dtsd.m();
        m445.m(4);
        m445.b("replied_to_participant.recipient_canonical_address");
        m445.i(58090);
        m445.c(new Supplier() { // from class: bgqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m445.j(new dtsc() { // from class: bgqj
        });
        m445.a();
        dtsb m446 = dtsd.m();
        m446.m(4);
        m446.b("replied_to_participant.profile_photo_uri");
        m446.i(-1);
        m446.c(new Supplier() { // from class: bgqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m446.j(new dtsc() { // from class: bgql
        });
        m446.a();
        dtsb m447 = dtsd.m();
        m447.m(4);
        m447.b("replied_to_participant.contact_photo_uri");
        m447.i(59850);
        m447.c(new Supplier() { // from class: bgqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m447.j(new dtsc() { // from class: bgqo
        });
        m447.a();
        dtsb m448 = dtsd.m();
        m448.m(1);
        m448.b("replied_to_participant.contact_id");
        m448.i(-1);
        m448.c(new Supplier() { // from class: bgqq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m448.j(new dtsc() { // from class: bgqr
        });
        m448.a();
        dtsb m449 = dtsd.m();
        m449.m(4);
        m449.b("replied_to_participant.lookup_key");
        m449.i(-1);
        m449.c(new Supplier() { // from class: bgqs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m449.j(new dtsc() { // from class: bgqt
        });
        m449.a();
        dtsb m450 = dtsd.m();
        m450.m(1);
        m450.b("replied_to_participant.color_palette_index");
        m450.i(-1);
        m450.c(new Supplier() { // from class: bgqu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m450.j(new dtsc() { // from class: bgqv
        });
        m450.a();
        dtsb m451 = dtsd.m();
        m451.m(1);
        m451.b("replied_to_participant.color_type");
        m451.i(1000);
        m451.c(new Supplier() { // from class: bgqw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m451.j(new dtsc() { // from class: bgqx
        });
        m451.a();
        dtsb m452 = dtsd.m();
        m452.m(1);
        m452.b("replied_to_participant.extended_color");
        m452.i(10027);
        m452.c(new Supplier() { // from class: bgra
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m452.j(new dtsc() { // from class: bgrb
        });
        m452.a();
        dtsb m453 = dtsd.m();
        m453.m(1);
        m453.b("replied_to_participant.blocked");
        m453.i(-1);
        m453.c(new Supplier() { // from class: bgrd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m453.j(new dtsc() { // from class: bgre
        });
        m453.a();
        dtsb m454 = dtsd.m();
        m454.m(4);
        m454.b("replied_to_participant.subscription_name");
        m454.i(2000);
        m454.c(new Supplier() { // from class: bgrf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m454.j(new dtsc() { // from class: bgrg
        });
        m454.a();
        dtsb m455 = dtsd.m();
        m455.m(1);
        m455.b("replied_to_participant.subscription_color");
        m455.i(2000);
        m455.c(new Supplier() { // from class: bgrh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m455.j(new dtsc() { // from class: bgri
        });
        m455.a();
        dtsb m456 = dtsd.m();
        m456.m(4);
        m456.b("replied_to_participant.contact_destination");
        m456.i(4000);
        m456.c(new Supplier() { // from class: bgrj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m456.j(new dtsc() { // from class: bgrl
        });
        m456.a();
        dtsb m457 = dtsd.m();
        m457.m(1);
        m457.b("replied_to_participant.participant_type");
        m457.i(12001);
        m457.c(new Supplier() { // from class: bgrm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m457.j(new dtsc() { // from class: bgrn
        });
        m457.a();
        dtsb m458 = dtsd.m();
        m458.m(1);
        m458.b("replied_to_participant.video_reachability");
        m458.i(13050);
        m458.c(new Supplier() { // from class: bgrp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m458.j(new dtsc() { // from class: bgrq
        });
        m458.a();
        dtsb m459 = dtsd.m();
        m459.m(4);
        m459.b("replied_to_participant.alias");
        m459.i(20060);
        m459.c(new Supplier() { // from class: bgrr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m459.j(new dtsc() { // from class: bgrs
        });
        m459.a();
        dtsb m460 = dtsd.m();
        m460.m(1);
        m460.b("replied_to_participant.is_spam");
        m460.i(24060);
        m460.c(new Supplier() { // from class: bgrt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m460.j(new dtsc() { // from class: bgru
        });
        m460.a();
        dtsb m461 = dtsd.m();
        m461.m(1);
        m461.b("replied_to_participant.is_rcs_available");
        m461.i(29030);
        m461.c(new Supplier() { // from class: bgrw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m461.j(new dtsc() { // from class: bgrx
        });
        m461.a();
        dtsb m462 = dtsd.m();
        m462.m(1);
        m462.b("replied_to_participant.is_spam_source");
        m462.i(30000);
        m462.c(new Supplier() { // from class: bgry
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m462.j(new dtsc() { // from class: bgrz
        });
        m462.a();
        dtsb m463 = dtsd.m();
        m463.m(4);
        m463.l(true);
        m463.d(true);
        m463.b("replied_to_participant.cms_id");
        m463.f(true);
        m463.i(31020);
        m463.c(new Supplier() { // from class: bgsb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m463.j(new dtsc() { // from class: bgsc
        });
        m463.a();
        dtsb m464 = dtsd.m();
        m464.m(1);
        m464.b("replied_to_participant.latest_verification_status");
        m464.i(31030);
        m464.c(new Supplier() { // from class: bgsd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m464.j(new dtsc() { // from class: bgse
        });
        m464.a();
        dtsb m465 = dtsd.m();
        m465.m(4);
        m465.b("replied_to_participant.profile_photo_blob_id");
        m465.i(33000);
        m465.c(new Supplier() { // from class: bgsf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m465.j(new dtsc() { // from class: bgsh
        });
        m465.a();
        dtsb m466 = dtsd.m();
        m466.m(5);
        m466.b("replied_to_participant.profile_photo_encryption_key");
        m466.i(33060);
        m466.c(new Supplier() { // from class: bgsi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m466.j(new dtsc() { // from class: bgsj
        });
        m466.a();
        dtsb m467 = dtsd.m();
        m467.m(1);
        m467.b("replied_to_participant.directory_id");
        m467.i(35010);
        m467.c(new Supplier() { // from class: bgsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m467.j(new dtsc() { // from class: bgsl
        });
        m467.a();
        dtsb m468 = dtsd.m();
        m468.m(1);
        m468.b("replied_to_participant.is_check_constraint_enabled_via_phenotype");
        m468.i(55010);
        m468.c(new Supplier() { // from class: bgsn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m468.j(new dtsc() { // from class: bgso
        });
        m468.a();
        dtsb m469 = dtsd.m();
        m469.m(1);
        m469.b("replied_to_participant.is_valid_phone_number_data");
        m469.i(55010);
        m469.c(new Supplier() { // from class: bgsp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m469.j(new dtsc() { // from class: bgsq
        });
        m469.a();
        dtsb m470 = dtsd.m();
        m470.m(2);
        m470.d(true);
        m470.e(true);
        m470.h(new Supplier() { // from class: bgss
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m470.b("replied_to_participant.duplicate_of");
        m470.i(58090);
        m470.c(new Supplier() { // from class: bgst
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m470.j(new dtsc() { // from class: bgsu
        });
        m470.a();
        dtsb m471 = dtsd.m();
        m471.m(1);
        m471.b("replied_to_participant.cms_life_cycle");
        m471.i(58210);
        m471.c(new Supplier() { // from class: bgsv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m471.j(new dtsc() { // from class: bgsw
        });
        m471.a();
        dtsb m472 = dtsd.m();
        m472.m(1);
        m472.b("replied_to_participant.norm_ui_status");
        m472.i(58620);
        m472.c(new Supplier() { // from class: bgsx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m472.j(new dtsc() { // from class: bgsz
        });
        m472.a();
        dtsb m473 = dtsd.m();
        m473.m(4);
        m473.b("replied_to_participant.last_modified_by_key");
        m473.i(59440);
        m473.c(new Supplier() { // from class: bgta
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m473.j(new dtsc() { // from class: bgtb
        });
        m473.a();
        dtsb m474 = dtsd.m();
        m474.m(1);
        m474.b("replied_to_participant.name_source");
        m474.i(59550);
        m474.c(new Supplier() { // from class: bgtd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m474.j(new dtsc() { // from class: bgte
        });
        m474.a();
        dtsb m475 = dtsd.m();
        m475.m(1);
        m475.b("replied_to_participant.photo_source");
        m475.i(59550);
        m475.c(new Supplier() { // from class: bgtf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m475.j(new dtsc() { // from class: bgtg
        });
        m475.a();
        dtsb m476 = dtsd.m();
        m476.m(1);
        m476.b("replied_to_participant.profile_photo_user_preference");
        m476.i(60060);
        m476.c(new Supplier() { // from class: bgth
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m476.j(new dtsc() { // from class: bgti
        });
        m476.a();
        dtsb m477 = dtsd.m();
        m477.m(5);
        m477.b("replied_to_participant.contact_metadata");
        m477.i(60070);
        m477.c(new Supplier() { // from class: bgtj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m477.j(new dtsc() { // from class: bgtl
        });
        m477.a();
        dtsb m478 = dtsd.m();
        m478.m(1);
        m478.d(true);
        m478.b("replied_to_participant.is_enterprise_contact");
        m478.i(60640);
        m478.c(new Supplier() { // from class: bgtm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m478.j(new dtsc() { // from class: bgto
        });
        m478.a();
        dtsb m479 = dtsd.m();
        m479.m(4);
        m479.b("replied_to_message_part.text");
        m479.i(-1);
        m479.c(new Supplier() { // from class: bgtp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m479.j(new dtsc() { // from class: bgtq
        });
        m479.a();
        dtsb m480 = dtsd.m();
        m480.m(4);
        m480.b("replied_to_message_part.uri");
        m480.i(-1);
        m480.c(new Supplier() { // from class: bgtr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m480.j(new dtsc() { // from class: bgts
        });
        m480.a();
        dtsb m481 = dtsd.m();
        m481.m(4);
        m481.d(true);
        m481.b("replied_to_message_part.content_type");
        m481.i(-1);
        m481.c(new Supplier() { // from class: bgtt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m481.j(new dtsc() { // from class: bgtu
        });
        m481.a();
        dtsb m482 = dtsd.m();
        m482.m(4);
        m482.b("replied_to_message_part.file_name");
        m482.i(26000);
        m482.c(new Supplier() { // from class: bgtv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m482.j(new dtsc() { // from class: bgxn
        });
        m482.a();
        dtsb m483 = dtsd.m();
        m483.m(1);
        m483.b("replied_to_message_part.duration");
        m483.i(26040);
        m483.c(new Supplier() { // from class: bhbu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m483.j(new dtsc() { // from class: bhgb
        });
        m483.a();
        dtsb m484 = dtsd.m();
        m484.m(2);
        m484.l(true);
        m484.g(true);
        m484.d(true);
        m484.b("replied_to_message_part._id");
        m484.i(-1);
        m484.c(new Supplier() { // from class: bhki
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m484.j(new dtsc() { // from class: bhop
        });
        m484.a();
        dtsb m485 = dtsd.m();
        m485.m(1);
        m485.d(true);
        m485.e(true);
        m485.h(new Supplier() { // from class: bhsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m485.b("replied_to_message_part.message_id");
        m485.i(-1);
        m485.c(new Supplier() { // from class: bhxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m485.j(new dtsc() { // from class: bibk
        });
        m485.a();
        dtsb m486 = dtsd.m();
        m486.m(4);
        m486.b("replied_to_message_part.original_uri");
        m486.i(10021);
        m486.c(new Supplier() { // from class: bifr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m486.j(new dtsc() { // from class: bgqz
        });
        m486.a();
        dtsb m487 = dtsd.m();
        m487.m(4);
        m487.b("replied_to_message_part.storage_uri");
        m487.i(29060);
        m487.c(new Supplier() { // from class: bgun
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m487.j(new dtsc() { // from class: bguy
        });
        m487.a();
        dtsb m488 = dtsd.m();
        m488.m(1);
        m488.b("replied_to_message_part.width");
        m488.i(-1);
        m488.c(new Supplier() { // from class: bgvj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m488.j(new dtsc() { // from class: bgvu
        });
        m488.a();
        dtsb m489 = dtsd.m();
        m489.m(1);
        m489.b("replied_to_message_part.height");
        m489.i(-1);
        m489.c(new Supplier() { // from class: bgwf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m489.j(new dtsc() { // from class: bgwq
        });
        m489.a();
        dtsb m490 = dtsd.m();
        m490.m(1);
        m490.b("replied_to_message_part.timestamp");
        m490.i(3010);
        m490.c(new Supplier() { // from class: bgxb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m490.j(new dtsc() { // from class: bgxm
        });
        m490.a();
        dtsb m491 = dtsd.m();
        m491.m(4);
        m491.d(true);
        m491.b("replied_to_message_part.output_uri");
        m491.i(4020);
        m491.c(new Supplier() { // from class: bgxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m491.j(new dtsc() { // from class: bgyj
        });
        m491.a();
        dtsb m492 = dtsd.m();
        m492.m(1);
        m492.b("replied_to_message_part.target_size");
        m492.i(4020);
        m492.c(new Supplier() { // from class: bgzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m492.j(new dtsc() { // from class: bgzq
        });
        m492.a();
        dtsb m493 = dtsd.m();
        m493.m(1);
        m493.b("replied_to_message_part.processing_status");
        m493.i(4020);
        m493.c(new Supplier() { // from class: bhab
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m493.j(new dtsc() { // from class: bham
        });
        m493.a();
        dtsb m494 = dtsd.m();
        m494.m(1);
        m494.b("replied_to_message_part.cms_attachment_processing_status");
        m494.i(44010);
        m494.c(new Supplier() { // from class: bhax
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m494.j(new dtsc() { // from class: bhbi
        });
        m494.a();
        dtsb m495 = dtsd.m();
        m495.m(1);
        m495.d(true);
        m495.e(true);
        m495.h(new Supplier() { // from class: bhbt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m495.b("replied_to_message_part.conversation_id");
        m495.i(-1);
        m495.c(new Supplier() { // from class: bhcf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m495.j(new dtsc() { // from class: bhcq
        });
        m495.a();
        dtsb m496 = dtsd.m();
        m496.m(1);
        m496.b("replied_to_message_part.sticker_set_id");
        m496.i(5020);
        m496.c(new Supplier() { // from class: bhdb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m496.j(new dtsc() { // from class: bhdx
        });
        m496.a();
        dtsb m497 = dtsd.m();
        m497.m(1);
        m497.b("replied_to_message_part.sticker_id");
        m497.i(5020);
        m497.c(new Supplier() { // from class: bhei
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m497.j(new dtsc() { // from class: bhet
        });
        m497.a();
        dtsb m498 = dtsd.m();
        m498.m(1);
        m498.b("replied_to_message_part.media_modified_timestamp");
        m498.i(7000);
        m498.c(new Supplier() { // from class: bhfe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m498.j(new dtsc() { // from class: bhfp
        });
        m498.a();
        dtsb m499 = dtsd.m();
        m499.m(3);
        m499.b("replied_to_message_part.longitude");
        m499.i(10005);
        m499.c(new Supplier() { // from class: bhga
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m499.j(new dtsc() { // from class: bhgm
        });
        m499.a();
        dtsb m500 = dtsd.m();
        m500.m(3);
        m500.b("replied_to_message_part.latitude");
        m500.i(10005);
        m500.c(new Supplier() { // from class: bhgx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m500.j(new dtsc() { // from class: bhhi
        });
        m500.a();
        dtsb m501 = dtsd.m();
        m501.m(4);
        m501.b("replied_to_message_part.preview_content_uri");
        m501.i(10017);
        m501.c(new Supplier() { // from class: bhht
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m501.j(new dtsc() { // from class: bhip
        });
        m501.a();
        dtsb m502 = dtsd.m();
        m502.m(4);
        m502.d(true);
        m502.b("replied_to_message_part.preview_content_type");
        m502.i(10017);
        m502.c(new Supplier() { // from class: bhja
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m502.j(new dtsc() { // from class: bhjl
        });
        m502.a();
        dtsb m503 = dtsd.m();
        m503.m(4);
        m503.b("replied_to_message_part.fallback_uri");
        m503.i(13000);
        m503.c(new Supplier() { // from class: bhjw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m503.j(new dtsc() { // from class: bhkh
        });
        m503.a();
        dtsb m504 = dtsd.m();
        m504.m(1);
        m504.b("replied_to_message_part.source");
        m504.i(14010);
        m504.c(new Supplier() { // from class: bhkt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m504.j(new dtsc() { // from class: bhle
        });
        m504.a();
        dtsb m505 = dtsd.m();
        m505.m(1);
        m505.b("replied_to_message_part.bundle_index");
        m505.i(17010);
        m505.c(new Supplier() { // from class: bhlp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m505.j(new dtsc() { // from class: bhma
        });
        m505.a();
        dtsb m506 = dtsd.m();
        m506.m(4);
        m506.b("replied_to_message_part.blob_id");
        m506.i(17020);
        m506.c(new Supplier() { // from class: bhml
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m506.j(new dtsc() { // from class: bhnh
        });
        m506.a();
        dtsb m507 = dtsd.m();
        m507.m(4);
        m507.b("replied_to_message_part.blob_gaia_email");
        m507.i(59570);
        m507.c(new Supplier() { // from class: bhns
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m507.j(new dtsc() { // from class: bhod
        });
        m507.a();
        dtsb m508 = dtsd.m();
        m508.m(4);
        m508.b("replied_to_message_part.cms_full_size_blob_id");
        m508.i(40040);
        m508.c(new Supplier() { // from class: bhoo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m508.j(new dtsc() { // from class: bhpa
        });
        m508.a();
        dtsb m509 = dtsd.m();
        m509.m(5);
        m509.b("replied_to_message_part.cms_media_encryption_key");
        m509.i(42010);
        m509.c(new Supplier() { // from class: bhpl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m509.j(new dtsc() { // from class: bhpw
        });
        m509.a();
        dtsb m510 = dtsd.m();
        m510.m(5);
        m510.b("replied_to_message_part.cms_compressed_media_encryption_key");
        m510.i(42070);
        m510.c(new Supplier() { // from class: bhqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m510.j(new dtsc() { // from class: bhqs
        });
        m510.a();
        dtsb m511 = dtsd.m();
        m511.m(1);
        m511.b("replied_to_message_part.blob_upload_permanent_failure");
        m511.i(18000);
        m511.c(new Supplier() { // from class: bhrd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m511.j(new dtsc() { // from class: bhrz
        });
        m511.a();
        dtsb m512 = dtsd.m();
        m512.m(1);
        m512.b("replied_to_message_part.blob_upload_timestamp");
        m512.i(19030);
        m512.c(new Supplier() { // from class: bhsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m512.j(new dtsc() { // from class: bhsv
        });
        m512.a();
        dtsb m513 = dtsd.m();
        m513.m(4);
        m513.b("replied_to_message_part.expressive_sticker_name");
        m513.i(22060);
        m513.c(new Supplier() { // from class: bhth
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m513.j(new dtsc() { // from class: bhts
        });
        m513.a();
        dtsb m514 = dtsd.m();
        m514.m(4);
        m514.b("replied_to_message_part.compressed_blob_id");
        m514.i(27000);
        m514.c(new Supplier() { // from class: bhud
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m514.j(new dtsc() { // from class: bhuo
        });
        m514.a();
        dtsb m515 = dtsd.m();
        m515.m(4);
        m515.b("replied_to_message_part.cms_compressed_blob_id");
        m515.i(40040);
        m515.c(new Supplier() { // from class: bhuz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m515.j(new dtsc() { // from class: bhvk
        });
        m515.a();
        dtsb m516 = dtsd.m();
        m516.m(1);
        m516.b("replied_to_message_part.compressed_blob_upload_permanent_failure");
        m516.i(27000);
        m516.c(new Supplier() { // from class: bhvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m516.j(new dtsc() { // from class: bhwr
        });
        m516.a();
        dtsb m517 = dtsd.m();
        m517.m(1);
        m517.b("replied_to_message_part.compressed_blob_upload_timestamp");
        m517.i(27000);
        m517.c(new Supplier() { // from class: bhxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m517.j(new dtsc() { // from class: bhxo
        });
        m517.a();
        dtsb m518 = dtsd.m();
        m518.m(5);
        m518.b("replied_to_message_part.media_encryption_key");
        m518.i(30040);
        m518.c(new Supplier() { // from class: bhxz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m518.j(new dtsc() { // from class: bhyk
        });
        m518.a();
        dtsb m519 = dtsd.m();
        m519.m(5);
        m519.b("replied_to_message_part.compressed_media_encryption_key");
        m519.i(30040);
        m519.c(new Supplier() { // from class: bhyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m519.j(new dtsc() { // from class: bhzg
        });
        m519.a();
        dtsb m520 = dtsd.m();
        m520.m(5);
        m520.b("replied_to_message_part.attachment_upload_response");
        m520.i(49010);
        m520.c(new Supplier() { // from class: bhzr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m520.j(new dtsc() { // from class: biac
        });
        m520.a();
        dtsb m521 = dtsd.m();
        m521.m(1);
        m521.b("replied_to_message_part.missing_entry_in_telephony");
        m521.i(52030);
        m521.c(new Supplier() { // from class: bian
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m521.j(new dtsc() { // from class: bibj
        });
        m521.a();
        dtsb m522 = dtsd.m();
        m522.m(1);
        m522.b("replied_to_message_part.awaiting_reverse_sync");
        m522.i(53040);
        m522.c(new Supplier() { // from class: bibv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m522.j(new dtsc() { // from class: bicg
        });
        m522.a();
        dtsb m523 = dtsd.m();
        m523.m(1);
        m523.b("replied_to_message_part.file_size_bytes");
        m523.i(52050);
        m523.c(new Supplier() { // from class: bicr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m523.j(new dtsc() { // from class: bidc
        });
        m523.a();
        dtsb m524 = dtsd.m();
        m524.m(4);
        m524.d(true);
        m524.b("replied_to_message_part.local_cache_path");
        m524.i(52050);
        m524.c(new Supplier() { // from class: bidn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m524.j(new dtsc() { // from class: bidy
        });
        m524.a();
        dtsb m525 = dtsd.m();
        m525.m(1);
        m525.b("replied_to_message_part.media_send_type");
        m525.i(58150);
        m525.c(new Supplier() { // from class: biej
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m525.j(new dtsc() { // from class: bieu
        });
        m525.a();
        dtsb m526 = dtsd.m();
        m526.m(5);
        m526.b("replied_to_message_part.voice_metadata");
        m526.i(59470);
        m526.c(new Supplier() { // from class: biff
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m526.j(new dtsc() { // from class: bgnd
        });
        m526.a();
        dtsb m527 = dtsd.m();
        m527.m(1);
        m527.b("replied_to_message_part.validation_status");
        m527.i(58770);
        m527.c(new Supplier() { // from class: bgno
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m527.j(new dtsc() { // from class: bgnz
        });
        m527.a();
        dtsb m528 = dtsd.m();
        m528.m(4);
        m528.b("replied_to_message_part.processing_id");
        m528.i(60080);
        m528.c(new Supplier() { // from class: bgok
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m528.j(new dtsc() { // from class: bgov
        });
        m528.a();
        dtsb m529 = dtsd.m();
        m529.m(1);
        m529.b("replied_to_message_part.rich_card_media_download_failure_reason");
        m529.i(60230);
        m529.c(new Supplier() { // from class: bgpg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m529.j(new dtsc() { // from class: bgpr
        });
        m529.a();
        dtsb m530 = dtsd.m();
        m530.m(1);
        m530.b("replied_to_message_part.image_display_state");
        m530.i(60240);
        m530.c(new Supplier() { // from class: bgqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m530.j(new dtsc() { // from class: bgqn
        });
        m530.a();
        dtsb m531 = dtsd.m();
        m531.m(1);
        m531.b("replied_to_message_part.preserve_size");
        m531.i(60680);
        m531.c(new Supplier() { // from class: bgqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m531.j(new dtsc() { // from class: bgsg
        });
        m531.a();
        dtsb m532 = dtsd.m();
        m532.m(4);
        m532.b("replied_to_message_link_preview.trigger_url");
        m532.i(-1);
        m532.c(new Supplier() { // from class: bgsr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m532.j(new dtsc() { // from class: bgtc
        });
        m532.a();
        dtsb m533 = dtsd.m();
        m533.m(2);
        m533.b("replied_to_message_link_preview.expiration_time_millis");
        m533.i(-1);
        m533.c(new Supplier() { // from class: bgtn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m533.j(new dtsc() { // from class: bgty
        });
        m533.a();
        dtsb m534 = dtsd.m();
        m534.m(4);
        m534.b("replied_to_message_link_preview.link_title");
        m534.i(-1);
        m534.c(new Supplier() { // from class: bgtz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m534.j(new dtsc() { // from class: bgua
        });
        m534.a();
        dtsb m535 = dtsd.m();
        m535.m(4);
        m535.b("replied_to_message_link_preview.link_image_url");
        m535.i(-1);
        m535.c(new Supplier() { // from class: bgub
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m535.j(new dtsc() { // from class: bgud
        });
        m535.a();
        dtsb m536 = dtsd.m();
        m536.m(2);
        m536.b("replied_to_message_link_preview.link_preview_failed");
        m536.i(22020);
        m536.c(new Supplier() { // from class: bgue
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m536.j(new dtsc() { // from class: bgug
        });
        m536.a();
        dtsb m537 = dtsd.m();
        m537.m(2);
        m537.l(true);
        m537.g(true);
        m537.d(true);
        m537.b("replied_to_message_link_preview._id");
        m537.i(-1);
        m537.c(new Supplier() { // from class: bguh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m537.j(new dtsc() { // from class: bgui
        });
        m537.a();
        dtsb m538 = dtsd.m();
        m538.m(2);
        m538.l(true);
        m538.d(true);
        m538.e(true);
        m538.h(new Supplier() { // from class: bguj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m538.b("replied_to_message_link_preview.message_id");
        m538.i(-1);
        m538.c(new Supplier() { // from class: bguk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m538.j(new dtsc() { // from class: bgul
        });
        m538.a();
        dtsb m539 = dtsd.m();
        m539.m(4);
        m539.b("replied_to_message_link_preview.link_description");
        m539.i(-1);
        m539.c(new Supplier() { // from class: bgum
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m539.j(new dtsc() { // from class: bguo
        });
        m539.a();
        dtsb m540 = dtsd.m();
        m540.m(4);
        m540.b("replied_to_message_link_preview.link_domain");
        m540.i(-1);
        m540.c(new Supplier() { // from class: bgup
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m540.j(new dtsc() { // from class: bguq
        });
        m540.a();
        dtsb m541 = dtsd.m();
        m541.m(4);
        m541.b("replied_to_message_link_preview.link_canonical_url");
        m541.i(-1);
        m541.c(new Supplier() { // from class: bgus
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m541.j(new dtsc() { // from class: bgut
        });
        m541.a();
        dtsb m542 = dtsd.m();
        m542.m(2);
        m542.b("replied_to_message_link_preview.link_preview_prevented");
        m542.i(21010);
        m542.c(new Supplier() { // from class: bguu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m542.j(new dtsc() { // from class: bguv
        });
        m542.a();
        dtsb m543 = dtsd.m();
        m543.m(4);
        m543.b("profiles_table.display_name");
        m543.i(-1);
        m543.c(new Supplier() { // from class: bguw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m543.j(new dtsc() { // from class: bgux
        });
        m543.a();
        dtsb m544 = dtsd.m();
        m544.m(2);
        m544.l(true);
        m544.g(true);
        m544.d(true);
        m544.b("profiles_table._id");
        m544.i(-1);
        m544.c(new Supplier() { // from class: bguz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m544.j(new dtsc() { // from class: bgva
        });
        m544.a();
        dtsb m545 = dtsd.m();
        m545.m(2);
        m545.d(true);
        m545.e(true);
        m545.h(new Supplier() { // from class: bgvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m545.b("profiles_table.participant_id");
        m545.i(-1);
        m545.c(new Supplier() { // from class: bgvc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m545.j(new dtsc() { // from class: bgve
        });
        m545.a();
        dtsb m546 = dtsd.m();
        m546.m(4);
        m546.b("profiles_table.person_id");
        m546.i(60170);
        m546.c(new Supplier() { // from class: bgvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m546.j(new dtsc() { // from class: bgvg
        });
        m546.a();
        dtsb m547 = dtsd.m();
        m547.m(4);
        m547.b("profiles_table.profile_access_token");
        m547.i(60170);
        m547.c(new Supplier() { // from class: bgvh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m547.j(new dtsc() { // from class: bgvi
        });
        m547.a();
        dtsb m548 = dtsd.m();
        m548.m(2);
        m548.b("profiles_table.sending_self_profile_interaction_state");
        m548.i(60200);
        m548.c(new Supplier() { // from class: bgvk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m548.j(new dtsc() { // from class: bgvl
        });
        m548.a();
        dtsb m549 = dtsd.m();
        m549.m(5);
        m549.b("profiles_table.self_profile_sharing_metadata");
        m549.i(60340);
        m549.c(new Supplier() { // from class: bgvm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m549.j(new dtsc() { // from class: bgvn
        });
        m549.a();
        dtsb m550 = dtsd.m();
        m550.m(4);
        m550.b("profiles_table.first_name");
        m550.i(-1);
        m550.c(new Supplier() { // from class: bgvo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m550.j(new dtsc() { // from class: bgvq
        });
        m550.a();
        dtsb m551 = dtsd.m();
        m551.m(4);
        m551.b("profiles_table.last_name");
        m551.i(-1);
        m551.c(new Supplier() { // from class: bgvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m551.j(new dtsc() { // from class: bgvs
        });
        m551.a();
        dtsb m552 = dtsd.m();
        m552.m(4);
        m552.b("profiles_table.photo_uri");
        m552.i(-1);
        m552.c(new Supplier() { // from class: bgvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m552.j(new dtsc() { // from class: bgvv
        });
        m552.a();
        dtsb m553 = dtsd.m();
        m553.m(4);
        m553.b("profiles_table.sender_last_updated_time");
        m553.i(60170);
        m553.c(new Supplier() { // from class: bgvw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m553.j(new dtsc() { // from class: bgvx
        });
        m553.a();
        dtsb m554 = dtsd.m();
        m554.m(4);
        m554.b("profiles_table.sender_last_updated_time_from_rcs");
        m554.i(60200);
        m554.c(new Supplier() { // from class: bgvy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m554.j(new dtsc() { // from class: bgvz
        });
        m554.a();
        dtsb m555 = dtsd.m();
        m555.m(4);
        m555.d(true);
        m555.b("profiles_table.contact_lookup_key");
        m555.i(-1);
        m555.c(new Supplier() { // from class: bgwa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m555.j(new dtsc() { // from class: bgwc
        });
        m555.a();
        dtsb m556 = dtsd.m();
        m556.m(4);
        m556.d(true);
        m556.b("profiles_table.phone_number");
        m556.i(-1);
        m556.c(new Supplier() { // from class: bgwd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m556.j(new dtsc() { // from class: bgwe
        });
        m556.a();
        dtsb m557 = dtsd.m();
        m557.m(1);
        m557.b("profiles_table.is_self_profile_shareable");
        m557.i(60400);
        m557.c(new Supplier() { // from class: bgwg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m557.j(new dtsc() { // from class: bgwh
        });
        m557.a();
        dtsb m558 = dtsd.m();
        m558.m(2);
        m558.b("profiles_table.has_shared_access_token_with_user");
        m558.i(60170);
        m558.c(new Supplier() { // from class: bgwi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m558.j(new dtsc() { // from class: bgwj
        });
        m558.a();
        dtsb m559 = dtsd.m();
        m559.m(1);
        m559.b("profiles_table.name_timestamp");
        m559.i(-1);
        m559.c(new Supplier() { // from class: bgwk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m559.j(new dtsc() { // from class: bgwl
        });
        m559.a();
        dtsb m560 = dtsd.m();
        m560.m(1);
        m560.b("profiles_table.photo_timestamp");
        m560.i(-1);
        m560.c(new Supplier() { // from class: bgwm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m560.j(new dtsc() { // from class: bgwo
        });
        m560.a();
        dtsb m561 = dtsd.m();
        m561.m(1);
        m561.b("profiles_table.belongs_to_self_gaia");
        m561.i(59940);
        m561.c(new Supplier() { // from class: bgwp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m561.j(new dtsc() { // from class: bgwr
        });
        m561.a();
        dtsb m562 = dtsd.m();
        m562.m(1);
        m562.b("profiles_table.gaia_update_timestamp");
        m562.i(59940);
        m562.c(new Supplier() { // from class: bgws
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m562.j(new dtsc() { // from class: bgwt
        });
        m562.a();
        dtsb m563 = dtsd.m();
        m563.m(4);
        m563.b("message_captions.caption");
        m563.i(-1);
        m563.c(new Supplier() { // from class: bgwu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m563.j(new dtsc() { // from class: bgwv
        });
        m563.a();
        dtsb m564 = dtsd.m();
        m564.m(2);
        m564.l(true);
        m564.d(true);
        m564.e(true);
        m564.h(new Supplier() { // from class: bgww
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m564.b("message_captions.message_id");
        m564.f(true);
        m564.i(-1);
        m564.c(new Supplier() { // from class: bgwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bige.b();
            }
        });
        m564.j(new dtsc() { // from class: bgwy
        });
        m564.a();
    }
}

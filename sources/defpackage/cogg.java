package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cogg {
    public final cogh a;
    public final cogh b;

    public cogg() {
        dtsb m = dtsd.m();
        m.m(2);
        m.l(true);
        m.g(true);
        m.d(true);
        m.b("scheduled_send._id");
        m.i(-1);
        m.c(new Supplier() { // from class: cnvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m.j(new dtsc() { // from class: cnwk
        });
        m.a();
        dtsb m2 = dtsd.m();
        m2.m(2);
        m2.l(true);
        m2.d(true);
        m2.e(true);
        m2.h(new Supplier() { // from class: cnzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m2.b("scheduled_send.message_id");
        m2.i(-1);
        m2.c(new Supplier() { // from class: coah
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m2.j(new dtsc() { // from class: coat
        });
        m2.a();
        dtsb m3 = dtsd.m();
        m3.m(2);
        m3.d(true);
        m3.e(true);
        m3.h(new Supplier() { // from class: cobf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m3.b("scheduled_send.conversation_id");
        m3.i(-1);
        m3.c(new Supplier() { // from class: cobr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m3.j(new dtsc() { // from class: cocd
        });
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(2);
        m4.b("scheduled_send.scheduled_time");
        m4.i(-1);
        m4.c(new Supplier() { // from class: cocp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m4.j(new dtsc() { // from class: codb
        });
        this.a = new cogh(m4.a());
        dtsb m5 = dtsd.m();
        m5.m(2);
        m5.d(true);
        m5.b("scheduled_send.status");
        m5.i(-1);
        m5.c(new Supplier() { // from class: cnwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m5.j(new dtsc() { // from class: cobl
        });
        m5.a();
        dtsb m6 = dtsd.m();
        m6.m(2);
        m6.k(true);
        m6.b("scheduled_send.creation_time");
        m6.i(58020);
        m6.c(new Supplier() { // from class: codk
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m6.j(new dtsc() { // from class: codw
        });
        m6.a();
        dtsb m7 = dtsd.m();
        m7.m(2);
        m7.l(true);
        m7.g(true);
        m7.d(true);
        m7.b("messages._id");
        m7.i(-1);
        m7.c(new Supplier() { // from class: coei
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m7.j(new dtsc() { // from class: coeu
        });
        this.b = new cogh(m7.a());
        dtsb m8 = dtsd.m();
        m8.m(1);
        m8.d(true);
        m8.e(true);
        m8.h(new Supplier() { // from class: cofg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m8.b("messages.conversation_id");
        m8.i(-1);
        m8.c(new Supplier() { // from class: cofs
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m8.j(new dtsc() { // from class: coge
        });
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(1);
        m9.d(true);
        m9.e(true);
        m9.h(new Supplier() { // from class: cnwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m9.b("messages.sender_id");
        m9.i(-1);
        m9.c(new Supplier() { // from class: cnww
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m9.j(new dtsc() { // from class: cnxi
        });
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(4);
        m10.b("messages.sender_send_destination");
        m10.i(54040);
        m10.c(new Supplier() { // from class: cnxu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m10.j(new dtsc() { // from class: cnyg
        });
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(4);
        m11.b("messages.msisdn_receiving_rcs_message");
        m11.i(59340);
        m11.c(new Supplier() { // from class: cnys
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m11.j(new dtsc() { // from class: cnze
        });
        m11.a();
        dtsb m12 = dtsd.m();
        m12.m(4);
        m12.b("messages.receiving_network_country");
        m12.i(54040);
        m12.c(new Supplier() { // from class: cnzp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m12.j(new dtsc() { // from class: cnzq
        });
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(1);
        m13.d(true);
        m13.b("messages.sent_timestamp");
        m13.i(-1);
        m13.c(new Supplier() { // from class: cnzr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m13.j(new dtsc() { // from class: cnzt
        });
        m13.a();
        dtsb m14 = dtsd.m();
        m14.m(1);
        m14.b("messages.queue_insert_timestamp");
        m14.i(17030);
        m14.c(new Supplier() { // from class: cnzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m14.j(new dtsc() { // from class: cnzw
        });
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(1);
        m15.d(true);
        m15.b("messages.received_timestamp");
        m15.i(-1);
        m15.c(new Supplier() { // from class: cnzx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m15.j(new dtsc() { // from class: cnzy
        });
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(1);
        m16.b("messages.message_protocol");
        m16.i(-1);
        m16.c(new Supplier() { // from class: cnzz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m16.j(new dtsc() { // from class: coaa
        });
        m16.a();
        dtsb m17 = dtsd.m();
        m17.m(1);
        m17.d(true);
        m17.b("messages.message_status");
        m17.i(-1);
        m17.c(new Supplier() { // from class: coab
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m17.j(new dtsc() { // from class: coac
        });
        m17.a();
        dtsb m18 = dtsd.m();
        m18.m(1);
        m18.b("messages.message_report_status");
        m18.i(13020);
        m18.c(new Supplier() { // from class: coaf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m18.j(new dtsc() { // from class: coag
        });
        m18.a();
        dtsb m19 = dtsd.m();
        m19.m(1);
        m19.d(true);
        m19.b("messages.seen");
        m19.f(true);
        m19.i(-1);
        m19.c(new Supplier() { // from class: coai
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m19.j(new dtsc() { // from class: coaj
        });
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(1);
        m20.d(true);
        m20.b("messages.read");
        m20.i(-1);
        m20.c(new Supplier() { // from class: coak
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m20.j(new dtsc() { // from class: coal
        });
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(4);
        m21.d(true);
        m21.b("messages.sms_message_uri");
        m21.i(-1);
        m21.c(new Supplier() { // from class: coam
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m21.j(new dtsc() { // from class: coan
        });
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(1);
        m22.b("messages.sms_priority");
        m22.i(-1);
        m22.c(new Supplier() { // from class: coao
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m22.j(new dtsc() { // from class: coaq
        });
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(1);
        m23.b("messages.sms_message_size");
        m23.i(-1);
        m23.c(new Supplier() { // from class: coar
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m23.j(new dtsc() { // from class: coas
        });
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(4);
        m24.b("messages.mms_subject");
        m24.i(-1);
        m24.c(new Supplier() { // from class: coau
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m24.j(new dtsc() { // from class: coav
        });
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(4);
        m25.b("messages.mms_transaction_id");
        m25.i(-1);
        m25.c(new Supplier() { // from class: coaw
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m25.j(new dtsc() { // from class: coax
        });
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(4);
        m26.b("messages.mms_content_location");
        m26.i(-1);
        m26.c(new Supplier() { // from class: coay
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m26.j(new dtsc() { // from class: coaz
        });
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(1);
        m27.b("messages.mms_expiry");
        m27.i(-1);
        m27.c(new Supplier() { // from class: cobb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m27.j(new dtsc() { // from class: cobc
        });
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(1);
        m28.d(true);
        m28.b("messages.rcs_expiry");
        m28.i(59890);
        m28.c(new Supplier() { // from class: cobd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m28.j(new dtsc() { // from class: cobe
        });
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(4);
        m29.b("messages.mms_retrieve_text");
        m29.i(9030);
        m29.c(new Supplier() { // from class: cobg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m29.j(new dtsc() { // from class: cobh
        });
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(1);
        m30.b("messages.raw_status");
        m30.i(-1);
        m30.c(new Supplier() { // from class: cobi
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m30.j(new dtsc() { // from class: cobj
        });
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(1);
        m31.d(true);
        m31.e(true);
        m31.h(new Supplier() { // from class: cobk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m31.b("messages.self_id");
        m31.i(-1);
        m31.c(new Supplier() { // from class: cobm
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m31.j(new dtsc() { // from class: cobn
        });
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(4);
        m32.d(true);
        m32.e(true);
        m32.h(new Supplier() { // from class: cobo
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m32.b("messages.my_identity_foreign_key");
        m32.i(60160);
        m32.c(new Supplier() { // from class: cobp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m32.j(new dtsc() { // from class: cobq
        });
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(1);
        m33.b("messages.retry_start_timestamp");
        m33.i(-1);
        m33.c(new Supplier() { // from class: cobs
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m33.j(new dtsc() { // from class: cobt
        });
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(4);
        m34.d(true);
        m34.b("messages.cloud_sync_id");
        m34.i(8500);
        m34.c(new Supplier() { // from class: cobu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m34.j(new dtsc() { // from class: cobv
        });
        m34.a();
        dtsb m35 = dtsd.m();
        m35.m(4);
        m35.d(true);
        m35.b("messages.rcs_message_id_with_text_type");
        m35.f(true);
        m35.i(41040);
        m35.c(new Supplier() { // from class: cobx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m35.j(new dtsc() { // from class: coby
        });
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(1);
        m36.b("messages.etouffee_status");
        m36.i(29060);
        m36.c(new Supplier() { // from class: cobz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m36.j(new dtsc() { // from class: coca
        });
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(1);
        m37.b("messages.verification_status");
        m37.i(29090);
        m37.c(new Supplier() { // from class: cocb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m37.j(new dtsc() { // from class: cocc
        });
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(1);
        m38.b("messages.rcs_ui_status");
        m38.i(39000);
        m38.c(new Supplier() { // from class: coce
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m38.j(new dtsc() { // from class: cocf
        });
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(1);
        m39.d(true);
        m39.b("messages.is_hidden");
        m39.i(30010);
        m39.c(new Supplier() { // from class: cocg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m39.j(new dtsc() { // from class: coci
        });
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(7);
        m40.b("messages.rcs_remote_instance");
        m40.i(10002);
        m40.c(new Supplier() { // from class: cocj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m40.j(new dtsc() { // from class: cock
        });
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(1);
        m41.b("messages.rcs_file_transfer_session_id");
        m41.i(10004);
        m41.c(new Supplier() { // from class: cocl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m41.j(new dtsc() { // from class: cocm
        });
        m41.a();
        dtsb m42 = dtsd.m();
        m42.m(1);
        m42.b("messages.sms_error_code");
        m42.i(9000);
        m42.c(new Supplier() { // from class: cocn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m42.j(new dtsc() { // from class: coco
        });
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(4);
        m43.b("messages.sms_error_desc_map_name");
        m43.i(9000);
        m43.c(new Supplier() { // from class: cocq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m43.j(new dtsc() { // from class: cocr
        });
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(4);
        m44.b("messages.correlation_id");
        m44.i(9010);
        m44.c(new Supplier() { // from class: coct
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m44.j(new dtsc() { // from class: cocu
        });
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(4);
        m45.l(true);
        m45.d(true);
        m45.b("messages.cms_id");
        m45.f(true);
        m45.i(31010);
        m45.c(new Supplier() { // from class: cocv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m45.j(new dtsc() { // from class: cocw
        });
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(2);
        m46.b("messages.cms_last_mod_seq");
        m46.i(37040);
        m46.c(new Supplier() { // from class: cocx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m46.j(new dtsc() { // from class: cocy
        });
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(4);
        m47.d(true);
        m47.b("messages.web_id");
        m47.i(19020);
        m47.c(new Supplier() { // from class: cocz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m47.j(new dtsc() { // from class: coda
        });
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(1);
        m48.b("messages.usage_stats_logging_id");
        m48.i(29100);
        m48.c(new Supplier() { // from class: coae
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m48.j(new dtsc() { // from class: codg
        });
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(1);
        m49.b("messages.send_counter");
        m49.i(35030);
        m49.c(new Supplier() { // from class: codr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m49.j(new dtsc() { // from class: coec
        });
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(4);
        m50.d(true);
        m50.b("messages.original_rcs_message_id");
        m50.i(35030);
        m50.c(new Supplier() { // from class: coen
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m50.j(new dtsc() { // from class: coey
        });
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(4);
        m51.b("messages.custom_delivery_receipt_mime_type");
        m51.i(37020);
        m51.c(new Supplier() { // from class: cofj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m51.j(new dtsc() { // from class: cofu
        });
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(5);
        m52.b("messages.custom_delivery_receipt_content");
        m52.i(37020);
        m52.c(new Supplier() { // from class: cogf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m52.j(new dtsc() { // from class: cnwi
        });
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(1);
        m53.b("messages.report_attempt_acounter");
        m53.i(37030);
        m53.c(new Supplier() { // from class: cnxe
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m53.j(new dtsc() { // from class: cnxp
        });
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(5);
        m54.b("messages.custom_headers");
        m54.i(45020);
        m54.c(new Supplier() { // from class: cnya
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m54.j(new dtsc() { // from class: cnyl
        });
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(4);
        m55.l(true);
        m55.d(true);
        m55.b("messages.cms_correlation_id");
        m55.f(true);
        m55.i(46010);
        m55.c(new Supplier() { // from class: cnyw
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m55.j(new dtsc() { // from class: cnzh
        });
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(1);
        m56.d(true);
        m56.e(true);
        m56.h(new Supplier() { // from class: cnzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m56.b("messages.group_private_participant");
        m56.i(48030);
        m56.c(new Supplier() { // from class: coad
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m56.j(new dtsc() { // from class: coap
        });
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(1);
        m57.d(true);
        m57.e(true);
        m57.h(new Supplier() { // from class: coba
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m57.b("messages.original_message_id");
        m57.i(48030);
        m57.c(new Supplier() { // from class: cobw
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m57.j(new dtsc() { // from class: coch
        });
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(1);
        m58.b("messages.awaiting_reverse_sync");
        m58.i(49060);
        m58.c(new Supplier() { // from class: cocs
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m58.j(new dtsc() { // from class: codc
        });
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(4);
        m59.b("messages.old_sms_message_uri");
        m59.i(49060);
        m59.c(new Supplier() { // from class: codd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m59.j(new dtsc() { // from class: code
        });
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(4);
        m60.l(true);
        m60.d(true);
        m60.b("messages.draft_id");
        m60.f(true);
        m60.i(56000);
        m60.c(new Supplier() { // from class: codf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m60.j(new dtsc() { // from class: codh
        });
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(1);
        m61.b("messages.result_code");
        m61.i(58040);
        m61.c(new Supplier() { // from class: codi
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m61.j(new dtsc() { // from class: codj
        });
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(1);
        m62.b("messages.cms_life_cycle");
        m62.i(58210);
        m62.c(new Supplier() { // from class: codl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m62.j(new dtsc() { // from class: codm
        });
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(1);
        m63.b("messages.mute_priority");
        m63.i(60750);
        m63.c(new Supplier() { // from class: codn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m63.j(new dtsc() { // from class: codo
        });
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(1);
        m64.b("messages.fallback_reason");
        m64.i(58710);
        m64.c(new Supplier() { // from class: codp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m64.j(new dtsc() { // from class: codq
        });
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(1);
        m65.b("messages.auto_retry_counter");
        m65.i(58230);
        m65.c(new Supplier() { // from class: cods
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m65.j(new dtsc() { // from class: codt
        });
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(2);
        m66.b("messages.can_revoke_before_delivered_with_rcs");
        m66.i(58280);
        m66.c(new Supplier() { // from class: codu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m66.j(new dtsc() { // from class: codv
        });
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(5);
        m67.b("messages.trace_id");
        m67.i(58680);
        m67.c(new Supplier() { // from class: codx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m67.j(new dtsc() { // from class: cody
        });
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(1);
        m68.b("messages.outgoing_delivery_report_status");
        m68.i(58720);
        m68.c(new Supplier() { // from class: codz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m68.j(new dtsc() { // from class: coea
        });
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(1);
        m69.b("messages.outgoing_read_report_status");
        m69.i(58720);
        m69.c(new Supplier() { // from class: coeb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m69.j(new dtsc() { // from class: coed
        });
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(1);
        m70.b("messages.xms_transport");
        m70.i(59310);
        m70.c(new Supplier() { // from class: coee
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m70.j(new dtsc() { // from class: coef
        });
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(1);
        m71.b("messages.message_original_protocol");
        m71.i(59430);
        m71.c(new Supplier() { // from class: coeg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m71.j(new dtsc() { // from class: coeh
        });
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(4);
        m72.l(true);
        m72.d(true);
        m72.b("messages.satellite_datagram_id");
        m72.f(true);
        m72.i(59490);
        m72.c(new Supplier() { // from class: coej
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m72.j(new dtsc() { // from class: coek
        });
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(1);
        m73.b("messages.encryption_protocol");
        m73.i(60190);
        m73.c(new Supplier() { // from class: coel
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m73.j(new dtsc() { // from class: coem
        });
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(4);
        m74.l(true);
        m74.d(true);
        m74.b("messages.message_persistence_id");
        m74.f(true);
        m74.i(60370);
        m74.c(new Supplier() { // from class: coeo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m74.j(new dtsc() { // from class: coep
        });
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(2);
        m75.l(true);
        m75.g(true);
        m75.d(true);
        m75.b("parts._id");
        m75.i(-1);
        m75.c(new Supplier() { // from class: coeq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m75.j(new dtsc() { // from class: coer
        });
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(1);
        m76.d(true);
        m76.e(true);
        m76.h(new Supplier() { // from class: coes
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m76.b("parts.message_id");
        m76.i(-1);
        m76.c(new Supplier() { // from class: coet
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m76.j(new dtsc() { // from class: coev
        });
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(4);
        m77.b("parts.text");
        m77.i(-1);
        m77.c(new Supplier() { // from class: coew
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m77.j(new dtsc() { // from class: coex
        });
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(4);
        m78.b("parts.uri");
        m78.i(-1);
        m78.c(new Supplier() { // from class: coez
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m78.j(new dtsc() { // from class: cofa
        });
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(4);
        m79.d(true);
        m79.b("parts.content_type");
        m79.i(-1);
        m79.c(new Supplier() { // from class: cofb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m79.j(new dtsc() { // from class: cofc
        });
        m79.a();
        dtsb m80 = dtsd.m();
        m80.m(4);
        m80.b("parts.original_uri");
        m80.i(10021);
        m80.c(new Supplier() { // from class: cofd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m80.j(new dtsc() { // from class: cofe
        });
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(4);
        m81.b("parts.storage_uri");
        m81.i(29060);
        m81.c(new Supplier() { // from class: coff
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m81.j(new dtsc() { // from class: cofh
        });
        m81.a();
        dtsb m82 = dtsd.m();
        m82.m(1);
        m82.b("parts.width");
        m82.i(-1);
        m82.c(new Supplier() { // from class: cofi
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m82.j(new dtsc() { // from class: cofk
        });
        m82.a();
        dtsb m83 = dtsd.m();
        m83.m(1);
        m83.b("parts.height");
        m83.i(-1);
        m83.c(new Supplier() { // from class: cofl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m83.j(new dtsc() { // from class: cofm
        });
        m83.a();
        dtsb m84 = dtsd.m();
        m84.m(1);
        m84.b("parts.timestamp");
        m84.i(3010);
        m84.c(new Supplier() { // from class: cofn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m84.j(new dtsc() { // from class: cofo
        });
        m84.a();
        dtsb m85 = dtsd.m();
        m85.m(4);
        m85.d(true);
        m85.b("parts.output_uri");
        m85.i(4020);
        m85.c(new Supplier() { // from class: cofp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m85.j(new dtsc() { // from class: cofq
        });
        m85.a();
        dtsb m86 = dtsd.m();
        m86.m(1);
        m86.b("parts.target_size");
        m86.i(4020);
        m86.c(new Supplier() { // from class: cofr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m86.j(new dtsc() { // from class: coft
        });
        m86.a();
        dtsb m87 = dtsd.m();
        m87.m(1);
        m87.b("parts.processing_status");
        m87.i(4020);
        m87.c(new Supplier() { // from class: cofv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m87.j(new dtsc() { // from class: cofw
        });
        m87.a();
        dtsb m88 = dtsd.m();
        m88.m(1);
        m88.b("parts.cms_attachment_processing_status");
        m88.i(44010);
        m88.c(new Supplier() { // from class: cofx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m88.j(new dtsc() { // from class: cofy
        });
        m88.a();
        dtsb m89 = dtsd.m();
        m89.m(1);
        m89.d(true);
        m89.e(true);
        m89.h(new Supplier() { // from class: cofz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m89.b("parts.conversation_id");
        m89.i(-1);
        m89.c(new Supplier() { // from class: coga
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m89.j(new dtsc() { // from class: cogb
        });
        m89.a();
        dtsb m90 = dtsd.m();
        m90.m(1);
        m90.b("parts.sticker_set_id");
        m90.i(5020);
        m90.c(new Supplier() { // from class: cogc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m90.j(new dtsc() { // from class: cogd
        });
        m90.a();
        dtsb m91 = dtsd.m();
        m91.m(1);
        m91.b("parts.sticker_id");
        m91.i(5020);
        m91.c(new Supplier() { // from class: cnvy
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m91.j(new dtsc() { // from class: cnvz
        });
        m91.a();
        dtsb m92 = dtsd.m();
        m92.m(1);
        m92.b("parts.media_modified_timestamp");
        m92.i(7000);
        m92.c(new Supplier() { // from class: cnwa
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m92.j(new dtsc() { // from class: cnwb
        });
        m92.a();
        dtsb m93 = dtsd.m();
        m93.m(3);
        m93.b("parts.longitude");
        m93.i(10005);
        m93.c(new Supplier() { // from class: cnwc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m93.j(new dtsc() { // from class: cnwd
        });
        m93.a();
        dtsb m94 = dtsd.m();
        m94.m(3);
        m94.b("parts.latitude");
        m94.i(10005);
        m94.c(new Supplier() { // from class: cnwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m94.j(new dtsc() { // from class: cnwf
        });
        m94.a();
        dtsb m95 = dtsd.m();
        m95.m(4);
        m95.b("parts.preview_content_uri");
        m95.i(10017);
        m95.c(new Supplier() { // from class: cnwg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m95.j(new dtsc() { // from class: cnwh
        });
        m95.a();
        dtsb m96 = dtsd.m();
        m96.m(4);
        m96.d(true);
        m96.b("parts.preview_content_type");
        m96.i(10017);
        m96.c(new Supplier() { // from class: cnwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m96.j(new dtsc() { // from class: cnwm
        });
        m96.a();
        dtsb m97 = dtsd.m();
        m97.m(4);
        m97.b("parts.fallback_uri");
        m97.i(13000);
        m97.c(new Supplier() { // from class: cnwn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m97.j(new dtsc() { // from class: cnwo
        });
        m97.a();
        dtsb m98 = dtsd.m();
        m98.m(1);
        m98.b("parts.source");
        m98.i(14010);
        m98.c(new Supplier() { // from class: cnwp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m98.j(new dtsc() { // from class: cnwq
        });
        m98.a();
        dtsb m99 = dtsd.m();
        m99.m(1);
        m99.b("parts.bundle_index");
        m99.i(17010);
        m99.c(new Supplier() { // from class: cnwr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m99.j(new dtsc() { // from class: cnws
        });
        m99.a();
        dtsb m100 = dtsd.m();
        m100.m(4);
        m100.b("parts.blob_id");
        m100.i(17020);
        m100.c(new Supplier() { // from class: cnwu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m100.j(new dtsc() { // from class: cnwv
        });
        m100.a();
        dtsb m101 = dtsd.m();
        m101.m(4);
        m101.b("parts.blob_gaia_email");
        m101.i(59570);
        m101.c(new Supplier() { // from class: cnwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m101.j(new dtsc() { // from class: cnwy
        });
        m101.a();
        dtsb m102 = dtsd.m();
        m102.m(4);
        m102.b("parts.cms_full_size_blob_id");
        m102.i(40040);
        m102.c(new Supplier() { // from class: cnwz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m102.j(new dtsc() { // from class: cnxa
        });
        m102.a();
        dtsb m103 = dtsd.m();
        m103.m(5);
        m103.b("parts.cms_media_encryption_key");
        m103.i(42010);
        m103.c(new Supplier() { // from class: cnxb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m103.j(new dtsc() { // from class: cnxc
        });
        m103.a();
        dtsb m104 = dtsd.m();
        m104.m(5);
        m104.b("parts.cms_compressed_media_encryption_key");
        m104.i(42070);
        m104.c(new Supplier() { // from class: cnxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m104.j(new dtsc() { // from class: cnxf
        });
        m104.a();
        dtsb m105 = dtsd.m();
        m105.m(1);
        m105.b("parts.blob_upload_permanent_failure");
        m105.i(18000);
        m105.c(new Supplier() { // from class: cnxg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m105.j(new dtsc() { // from class: cnxh
        });
        m105.a();
        dtsb m106 = dtsd.m();
        m106.m(1);
        m106.b("parts.blob_upload_timestamp");
        m106.i(19030);
        m106.c(new Supplier() { // from class: cnxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m106.j(new dtsc() { // from class: cnxk
        });
        m106.a();
        dtsb m107 = dtsd.m();
        m107.m(4);
        m107.b("parts.expressive_sticker_name");
        m107.i(22060);
        m107.c(new Supplier() { // from class: cnxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m107.j(new dtsc() { // from class: cnxm
        });
        m107.a();
        dtsb m108 = dtsd.m();
        m108.m(4);
        m108.b("parts.file_name");
        m108.i(26000);
        m108.c(new Supplier() { // from class: cnxn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m108.j(new dtsc() { // from class: cnxo
        });
        m108.a();
        dtsb m109 = dtsd.m();
        m109.m(1);
        m109.b("parts.duration");
        m109.i(26040);
        m109.c(new Supplier() { // from class: cnxq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m109.j(new dtsc() { // from class: cnxr
        });
        m109.a();
        dtsb m110 = dtsd.m();
        m110.m(4);
        m110.b("parts.compressed_blob_id");
        m110.i(27000);
        m110.c(new Supplier() { // from class: cnxs
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m110.j(new dtsc() { // from class: cnxt
        });
        m110.a();
        dtsb m111 = dtsd.m();
        m111.m(4);
        m111.b("parts.cms_compressed_blob_id");
        m111.i(40040);
        m111.c(new Supplier() { // from class: cnxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m111.j(new dtsc() { // from class: cnxw
        });
        m111.a();
        dtsb m112 = dtsd.m();
        m112.m(1);
        m112.b("parts.compressed_blob_upload_permanent_failure");
        m112.i(27000);
        m112.c(new Supplier() { // from class: cnxx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m112.j(new dtsc() { // from class: cnxy
        });
        m112.a();
        dtsb m113 = dtsd.m();
        m113.m(1);
        m113.b("parts.compressed_blob_upload_timestamp");
        m113.i(27000);
        m113.c(new Supplier() { // from class: cnxz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m113.j(new dtsc() { // from class: cnyb
        });
        m113.a();
        dtsb m114 = dtsd.m();
        m114.m(5);
        m114.b("parts.media_encryption_key");
        m114.i(30040);
        m114.c(new Supplier() { // from class: cnyc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m114.j(new dtsc() { // from class: cnyd
        });
        m114.a();
        dtsb m115 = dtsd.m();
        m115.m(5);
        m115.b("parts.compressed_media_encryption_key");
        m115.i(30040);
        m115.c(new Supplier() { // from class: cnye
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m115.j(new dtsc() { // from class: cnyf
        });
        m115.a();
        dtsb m116 = dtsd.m();
        m116.m(1);
        m116.b("parts.missing_entry_in_telephony");
        m116.i(52030);
        m116.c(new Supplier() { // from class: cnyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m116.j(new dtsc() { // from class: cnyi
        });
        m116.a();
        dtsb m117 = dtsd.m();
        m117.m(1);
        m117.b("parts.awaiting_reverse_sync");
        m117.i(53040);
        m117.c(new Supplier() { // from class: cnyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m117.j(new dtsc() { // from class: cnyk
        });
        m117.a();
        dtsb m118 = dtsd.m();
        m118.m(1);
        m118.b("parts.file_size_bytes");
        m118.i(52050);
        m118.c(new Supplier() { // from class: cnym
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m118.j(new dtsc() { // from class: cnyn
        });
        m118.a();
        dtsb m119 = dtsd.m();
        m119.m(4);
        m119.d(true);
        m119.b("parts.local_cache_path");
        m119.i(52050);
        m119.c(new Supplier() { // from class: cnyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m119.j(new dtsc() { // from class: cnyp
        });
        m119.a();
        dtsb m120 = dtsd.m();
        m120.m(1);
        m120.b("parts.media_send_type");
        m120.i(58150);
        m120.c(new Supplier() { // from class: cnyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m120.j(new dtsc() { // from class: cnyr
        });
        m120.a();
        dtsb m121 = dtsd.m();
        m121.m(5);
        m121.b("parts.voice_metadata");
        m121.i(59470);
        m121.c(new Supplier() { // from class: cnyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m121.j(new dtsc() { // from class: cnyu
        });
        m121.a();
        dtsb m122 = dtsd.m();
        m122.m(1);
        m122.b("parts.validation_status");
        m122.i(58770);
        m122.c(new Supplier() { // from class: cnyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m122.j(new dtsc() { // from class: cnyx
        });
        m122.a();
        dtsb m123 = dtsd.m();
        m123.m(4);
        m123.b("parts.processing_id");
        m123.i(60080);
        m123.c(new Supplier() { // from class: cnyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m123.j(new dtsc() { // from class: cnyz
        });
        m123.a();
        dtsb m124 = dtsd.m();
        m124.m(1);
        m124.b("parts.rich_card_media_download_failure_reason");
        m124.i(60230);
        m124.c(new Supplier() { // from class: cnza
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m124.j(new dtsc() { // from class: cnzb
        });
        m124.a();
        dtsb m125 = dtsd.m();
        m125.m(1);
        m125.b("parts.image_display_state");
        m125.i(60240);
        m125.c(new Supplier() { // from class: cnzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m125.j(new dtsc() { // from class: cnzd
        });
        m125.a();
        dtsb m126 = dtsd.m();
        m126.m(1);
        m126.b("parts.preserve_size");
        m126.i(60680);
        m126.c(new Supplier() { // from class: cnzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m126.j(new dtsc() { // from class: cnzg
        });
        m126.a();
        dtsb m127 = dtsd.m();
        m127.m(8);
        m127.b("parts__ROWID");
        m127.i(0);
        m127.c(new Supplier() { // from class: cnzi
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m127.j(new dtsc() { // from class: cnzj
        });
        m127.a();
        dtsb m128 = dtsd.m();
        m128.m(4);
        m128.b("message_captions.caption");
        m128.i(-1);
        m128.c(new Supplier() { // from class: cnzk
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m128.j(new dtsc() { // from class: cnzl
        });
        m128.a();
        dtsb m129 = dtsd.m();
        m129.m(2);
        m129.l(true);
        m129.d(true);
        m129.e(true);
        m129.h(new Supplier() { // from class: cnzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m129.b("message_captions.message_id");
        m129.f(true);
        m129.i(-1);
        m129.c(new Supplier() { // from class: cnzn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cogq.b();
            }
        });
        m129.j(new dtsc() { // from class: cnzo
        });
        m129.a();
    }
}

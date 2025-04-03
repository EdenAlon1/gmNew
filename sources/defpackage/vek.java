package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vek {
    public static final String[] a = {"messages._id", "message_reactions._id"};

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("_id", "index_unsent_rcs_report");
        enhdVar.c();
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "messages._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: uxz
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: vdb
        };
        m.a();
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: vdn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar2.a = "messages.conversation_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: vdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: uyg
        };
        m2.a();
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: uys
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar3.a = "messages.sender_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: uze
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: uzq
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "messages.sender_send_destination";
        m4.i(54040);
        dtqsVar4.d = new Supplier() { // from class: vad
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: vap
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "messages.msisdn_receiving_rcs_message";
        m5.i(59340);
        dtqsVar5.d = new Supplier() { // from class: uyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: vax
        };
        m5.a();
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "messages.receiving_network_country";
        m6.i(54040);
        dtqsVar6.d = new Supplier() { // from class: vbj
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: vbv
        };
        m6.a();
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 1;
        m7.d(true);
        dtqsVar7.a = "messages.sent_timestamp";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: vch
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: vct
        };
        m7.a();
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        dtqsVar8.a = "messages.queue_insert_timestamp";
        m8.i(17030);
        dtqsVar8.d = new Supplier() { // from class: vcw
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: vcy
        };
        m8.a();
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        m9.d(true);
        dtqsVar9.a = "messages.received_timestamp";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: vcz
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: vda
        };
        m9.a();
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        dtqsVar10.a = "messages.message_protocol";
        m10.i(-1);
        dtqsVar10.d = new Supplier() { // from class: vdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: vdd
        };
        m10.a();
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 1;
        m11.d(true);
        dtqsVar11.a = "messages.message_status";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: vde
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: vdf
        };
        m11.a();
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 1;
        dtqsVar12.a = "messages.message_report_status";
        m12.i(13020);
        dtqsVar12.d = new Supplier() { // from class: vdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: vdh
        };
        m12.a();
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 1;
        m13.d(true);
        dtqsVar13.a = "messages.seen";
        m13.f(true);
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: vdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: vdk
        };
        m13.a();
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 1;
        m14.d(true);
        dtqsVar14.a = "messages.read";
        m14.i(-1);
        dtqsVar14.d = new Supplier() { // from class: vdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: vdm
        };
        m14.a();
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 4;
        m15.d(true);
        dtqsVar15.a = "messages.sms_message_uri";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: vdo
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: vdp
        };
        m15.a();
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 1;
        dtqsVar16.a = "messages.sms_priority";
        m16.i(-1);
        dtqsVar16.d = new Supplier() { // from class: vdq
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: vdr
        };
        m16.a();
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        dtqsVar17.a = "messages.sms_message_size";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: vds
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: vdu
        };
        m17.a();
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 4;
        dtqsVar18.a = "messages.mms_subject";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: vdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: vdw
        };
        m18.a();
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 4;
        dtqsVar19.a = "messages.mms_transaction_id";
        m19.i(-1);
        dtqsVar19.d = new Supplier() { // from class: vdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: vdy
        };
        m19.a();
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 4;
        dtqsVar20.a = "messages.mms_content_location";
        m20.i(-1);
        dtqsVar20.d = new Supplier() { // from class: vea
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: veb
        };
        m20.a();
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 1;
        dtqsVar21.a = "messages.mms_expiry";
        m21.i(-1);
        dtqsVar21.d = new Supplier() { // from class: vec
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: ved
        };
        m21.a();
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 1;
        m22.d(true);
        dtqsVar22.a = "messages.rcs_expiry";
        m22.i(59890);
        dtqsVar22.d = new Supplier() { // from class: uya
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: uyb
        };
        m22.a();
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 4;
        dtqsVar23.a = "messages.mms_retrieve_text";
        m23.i(9030);
        dtqsVar23.d = new Supplier() { // from class: uyc
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: uyd
        };
        m23.a();
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 1;
        dtqsVar24.a = "messages.raw_status";
        m24.i(-1);
        dtqsVar24.d = new Supplier() { // from class: uye
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: uyf
        };
        m24.a();
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 1;
        m25.d(true);
        m25.e(true);
        dtqsVar25.b = new Supplier() { // from class: uyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar25.a = "messages.self_id";
        m25.i(-1);
        dtqsVar25.d = new Supplier() { // from class: uyi
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: uyj
        };
        m25.a();
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 4;
        m26.d(true);
        dtqsVar26.a = "messages.my_identity";
        m26.i(59810);
        dtqsVar26.d = new Supplier() { // from class: uyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: uym
        };
        m26.a();
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 4;
        m27.d(true);
        m27.e(true);
        dtqsVar27.b = new Supplier() { // from class: uyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar27.a = "messages.my_identity_foreign_key";
        m27.i(60160);
        dtqsVar27.d = new Supplier() { // from class: uyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: uyp
        };
        m27.a();
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 1;
        dtqsVar28.a = "messages.retry_start_timestamp";
        m28.i(-1);
        dtqsVar28.d = new Supplier() { // from class: uyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: uyr
        };
        m28.a();
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 4;
        m29.d(true);
        dtqsVar29.a = "messages.cloud_sync_id";
        m29.i(8500);
        dtqsVar29.d = new Supplier() { // from class: uyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: uyu
        };
        m29.a();
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 7;
        m30.d(true);
        dtqsVar30.a = "messages.rcs_message_id";
        m30.f(true);
        m30.i(10000);
        dtqsVar30.d = new Supplier() { // from class: uyw
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: uyx
        };
        m30.a();
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 4;
        m31.d(true);
        dtqsVar31.a = "messages.rcs_message_id_with_text_type";
        m31.f(true);
        m31.i(41040);
        dtqsVar31.d = new Supplier() { // from class: uyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: uyz
        };
        m31.a();
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 1;
        dtqsVar32.a = "messages.etouffee_status";
        m32.i(29060);
        dtqsVar32.d = new Supplier() { // from class: uza
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: uzb
        };
        m32.a();
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 1;
        dtqsVar33.a = "messages.verification_status";
        m33.i(29090);
        dtqsVar33.d = new Supplier() { // from class: uzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: uzd
        };
        m33.a();
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 1;
        dtqsVar34.a = "messages.rcs_ui_status";
        m34.i(39000);
        dtqsVar34.d = new Supplier() { // from class: uzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: uzh
        };
        m34.a();
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 1;
        m35.d(true);
        dtqsVar35.a = "messages.is_hidden";
        m35.i(30010);
        dtqsVar35.d = new Supplier() { // from class: uzi
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: uzj
        };
        m35.a();
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 7;
        dtqsVar36.a = "messages.rcs_remote_instance";
        m36.i(10002);
        dtqsVar36.d = new Supplier() { // from class: uzk
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: uzl
        };
        m36.a();
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 1;
        dtqsVar37.a = "messages.rcs_file_transfer_session_id";
        m37.i(10004);
        dtqsVar37.d = new Supplier() { // from class: uzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: uzn
        };
        m37.a();
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 1;
        dtqsVar38.a = "messages.sms_error_code";
        m38.i(9000);
        dtqsVar38.d = new Supplier() { // from class: uzo
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: uzp
        };
        m38.a();
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 4;
        dtqsVar39.a = "messages.sms_error_desc_map_name";
        m39.i(9000);
        dtqsVar39.d = new Supplier() { // from class: uzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: uzt
        };
        m39.a();
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 4;
        dtqsVar40.a = "messages.correlation_id";
        m40.i(9010);
        dtqsVar40.d = new Supplier() { // from class: uzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: uzv
        };
        m40.a();
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 4;
        m41.l(true);
        m41.d(true);
        dtqsVar41.a = "messages.cms_id";
        m41.f(true);
        m41.i(31010);
        dtqsVar41.d = new Supplier() { // from class: uzw
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: uzx
        };
        m41.a();
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 2;
        dtqsVar42.a = "messages.cms_last_mod_seq";
        m42.i(37040);
        dtqsVar42.d = new Supplier() { // from class: uzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: uzz
        };
        m42.a();
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 4;
        m43.d(true);
        dtqsVar43.a = "messages.web_id";
        m43.i(19020);
        dtqsVar43.d = new Supplier() { // from class: vaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: vab
        };
        m43.a();
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 1;
        dtqsVar44.a = "messages.usage_stats_logging_id";
        m44.i(29100);
        dtqsVar44.d = new Supplier() { // from class: vae
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: vaf
        };
        m44.a();
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 1;
        dtqsVar45.a = "messages.send_counter";
        m45.i(35030);
        dtqsVar45.d = new Supplier() { // from class: vag
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: vah
        };
        m45.a();
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 4;
        m46.d(true);
        dtqsVar46.a = "messages.original_rcs_message_id";
        m46.i(35030);
        dtqsVar46.d = new Supplier() { // from class: vai
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: vaj
        };
        m46.a();
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 4;
        dtqsVar47.a = "messages.custom_delivery_receipt_mime_type";
        m47.i(37020);
        dtqsVar47.d = new Supplier() { // from class: vak
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: val
        };
        m47.a();
        dtsb m48 = dtsd.m();
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.e = 5;
        dtqsVar48.a = "messages.custom_delivery_receipt_content";
        m48.i(37020);
        dtqsVar48.d = new Supplier() { // from class: vam
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: vao
        };
        m48.a();
        dtsb m49 = dtsd.m();
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.e = 1;
        dtqsVar49.a = "messages.report_attempt_acounter";
        m49.i(37030);
        dtqsVar49.d = new Supplier() { // from class: vau
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: vbf
        };
        m49.a();
        dtsb m50 = dtsd.m();
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.e = 5;
        dtqsVar50.a = "messages.custom_headers";
        m50.i(45020);
        dtqsVar50.d = new Supplier() { // from class: vbq
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: vcb
        };
        m50.a();
        dtsb m51 = dtsd.m();
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.e = 4;
        m51.l(true);
        m51.d(true);
        dtqsVar51.a = "messages.cms_correlation_id";
        m51.f(true);
        m51.i(46010);
        dtqsVar51.d = new Supplier() { // from class: vcm
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: vcx
        };
        m51.a();
        dtsb m52 = dtsd.m();
        dtqs dtqsVar52 = (dtqs) m52;
        dtqsVar52.e = 1;
        m52.d(true);
        m52.e(true);
        dtqsVar52.b = new Supplier() { // from class: vdi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar52.a = "messages.group_private_participant";
        m52.i(48030);
        dtqsVar52.d = new Supplier() { // from class: vdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar52.c = new dtsc() { // from class: vee
        };
        m52.a();
        dtsb m53 = dtsd.m();
        dtqs dtqsVar53 = (dtqs) m53;
        dtqsVar53.e = 1;
        m53.d(true);
        m53.e(true);
        dtqsVar53.b = new Supplier() { // from class: uyk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar53.a = "messages.original_message_id";
        m53.i(48030);
        dtqsVar53.d = new Supplier() { // from class: uzg
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar53.c = new dtsc() { // from class: uzr
        };
        m53.a();
        dtsb m54 = dtsd.m();
        dtqs dtqsVar54 = (dtqs) m54;
        dtqsVar54.e = 1;
        dtqsVar54.a = "messages.awaiting_reverse_sync";
        m54.i(49060);
        dtqsVar54.d = new Supplier() { // from class: vac
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar54.c = new dtsc() { // from class: van
        };
        m54.a();
        dtsb m55 = dtsd.m();
        dtqs dtqsVar55 = (dtqs) m55;
        dtqsVar55.e = 4;
        dtqsVar55.a = "messages.old_sms_message_uri";
        m55.i(49060);
        dtqsVar55.d = new Supplier() { // from class: vaq
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar55.c = new dtsc() { // from class: var
        };
        m55.a();
        dtsb m56 = dtsd.m();
        dtqs dtqsVar56 = (dtqs) m56;
        dtqsVar56.e = 4;
        m56.l(true);
        m56.d(true);
        dtqsVar56.a = "messages.draft_id";
        m56.f(true);
        m56.i(56000);
        dtqsVar56.d = new Supplier() { // from class: vas
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar56.c = new dtsc() { // from class: vat
        };
        m56.a();
        dtsb m57 = dtsd.m();
        dtqs dtqsVar57 = (dtqs) m57;
        dtqsVar57.e = 1;
        dtqsVar57.a = "messages.result_code";
        m57.i(58040);
        dtqsVar57.d = new Supplier() { // from class: vav
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar57.c = new dtsc() { // from class: vaw
        };
        m57.a();
        dtsb m58 = dtsd.m();
        dtqs dtqsVar58 = (dtqs) m58;
        dtqsVar58.e = 1;
        dtqsVar58.a = "messages.cms_life_cycle";
        m58.i(58210);
        dtqsVar58.d = new Supplier() { // from class: vay
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar58.c = new dtsc() { // from class: vaz
        };
        m58.a();
        dtsb m59 = dtsd.m();
        dtqs dtqsVar59 = (dtqs) m59;
        dtqsVar59.e = 1;
        dtqsVar59.a = "messages.mute_priority";
        m59.i(60750);
        dtqsVar59.d = new Supplier() { // from class: vba
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar59.c = new dtsc() { // from class: vbb
        };
        m59.a();
        dtsb m60 = dtsd.m();
        dtqs dtqsVar60 = (dtqs) m60;
        dtqsVar60.e = 1;
        dtqsVar60.a = "messages.fallback_reason";
        m60.i(58710);
        dtqsVar60.d = new Supplier() { // from class: vbc
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar60.c = new dtsc() { // from class: vbd
        };
        m60.a();
        dtsb m61 = dtsd.m();
        dtqs dtqsVar61 = (dtqs) m61;
        dtqsVar61.e = 1;
        dtqsVar61.a = "messages.auto_retry_counter";
        m61.i(58230);
        dtqsVar61.d = new Supplier() { // from class: vbe
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar61.c = new dtsc() { // from class: vbg
        };
        m61.a();
        dtsb m62 = dtsd.m();
        dtqs dtqsVar62 = (dtqs) m62;
        dtqsVar62.e = 2;
        dtqsVar62.a = "messages.can_revoke_before_delivered_with_rcs";
        m62.i(58280);
        dtqsVar62.d = new Supplier() { // from class: vbh
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar62.c = new dtsc() { // from class: vbi
        };
        m62.a();
        dtsb m63 = dtsd.m();
        dtqs dtqsVar63 = (dtqs) m63;
        dtqsVar63.e = 5;
        dtqsVar63.a = "messages.trace_id";
        m63.i(58680);
        dtqsVar63.d = new Supplier() { // from class: vbk
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar63.c = new dtsc() { // from class: vbl
        };
        m63.a();
        dtsb m64 = dtsd.m();
        dtqs dtqsVar64 = (dtqs) m64;
        dtqsVar64.e = 1;
        dtqsVar64.a = "messages.outgoing_delivery_report_status";
        m64.i(58720);
        dtqsVar64.d = new Supplier() { // from class: vbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar64.c = new dtsc() { // from class: vbn
        };
        m64.a();
        dtsb m65 = dtsd.m();
        dtqs dtqsVar65 = (dtqs) m65;
        dtqsVar65.e = 1;
        dtqsVar65.a = "messages.outgoing_read_report_status";
        m65.i(58720);
        dtqsVar65.d = new Supplier() { // from class: vbo
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar65.c = new dtsc() { // from class: vbp
        };
        m65.a();
        dtsb m66 = dtsd.m();
        dtqs dtqsVar66 = (dtqs) m66;
        dtqsVar66.e = 1;
        dtqsVar66.a = "messages.xms_transport";
        m66.i(59310);
        dtqsVar66.d = new Supplier() { // from class: vbr
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar66.c = new dtsc() { // from class: vbs
        };
        m66.a();
        dtsb m67 = dtsd.m();
        dtqs dtqsVar67 = (dtqs) m67;
        dtqsVar67.e = 1;
        dtqsVar67.a = "messages.message_original_protocol";
        m67.i(59430);
        dtqsVar67.d = new Supplier() { // from class: vbt
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar67.c = new dtsc() { // from class: vbu
        };
        m67.a();
        dtsb m68 = dtsd.m();
        dtqs dtqsVar68 = (dtqs) m68;
        dtqsVar68.e = 4;
        m68.l(true);
        m68.d(true);
        dtqsVar68.a = "messages.satellite_datagram_id";
        m68.f(true);
        m68.i(59490);
        dtqsVar68.d = new Supplier() { // from class: vbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar68.c = new dtsc() { // from class: vbx
        };
        m68.a();
        dtsb m69 = dtsd.m();
        dtqs dtqsVar69 = (dtqs) m69;
        dtqsVar69.e = 1;
        dtqsVar69.a = "messages.encryption_protocol";
        m69.i(60190);
        dtqsVar69.d = new Supplier() { // from class: vby
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar69.c = new dtsc() { // from class: vbz
        };
        m69.a();
        dtsb m70 = dtsd.m();
        dtqs dtqsVar70 = (dtqs) m70;
        dtqsVar70.e = 4;
        m70.l(true);
        m70.d(true);
        dtqsVar70.a = "messages.message_persistence_id";
        m70.f(true);
        m70.i(60370);
        dtqsVar70.d = new Supplier() { // from class: vca
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar70.c = new dtsc() { // from class: vcc
        };
        m70.a();
        dtsb m71 = dtsd.m();
        dtqs dtqsVar71 = (dtqs) m71;
        dtqsVar71.e = 2;
        m71.l(true);
        m71.g(true);
        m71.d(true);
        dtqsVar71.a = "message_reactions._id";
        m71.i(-1);
        dtqsVar71.d = new Supplier() { // from class: vcd
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar71.c = new dtsc() { // from class: vce
        };
        m71.a();
        dtsb m72 = dtsd.m();
        dtqs dtqsVar72 = (dtqs) m72;
        dtqsVar72.e = 2;
        m72.l(true);
        m72.d(true);
        m72.e(true);
        dtqsVar72.b = new Supplier() { // from class: vcf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar72.a = "message_reactions.message_id";
        m72.i(-1);
        dtqsVar72.d = new Supplier() { // from class: vcg
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar72.c = new dtsc() { // from class: vci
        };
        m72.a();
        dtsb m73 = dtsd.m();
        dtqs dtqsVar73 = (dtqs) m73;
        dtqsVar73.e = 5;
        dtqsVar73.a = "message_reactions.reactions_data";
        m73.i(-1);
        dtqsVar73.d = new Supplier() { // from class: vcj
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar73.c = new dtsc() { // from class: vck
        };
        m73.a();
        dtsb m74 = dtsd.m();
        dtqs dtqsVar74 = (dtqs) m74;
        dtqsVar74.e = 2;
        m74.d(true);
        m74.e(true);
        dtqsVar74.b = new Supplier() { // from class: vcl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar74.a = "message_reactions.reacted_message_id";
        m74.i(46020);
        dtqsVar74.d = new Supplier() { // from class: vcn
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar74.c = new dtsc() { // from class: vco
        };
        m74.a();
        dtsb m75 = dtsd.m();
        dtqs dtqsVar75 = (dtqs) m75;
        dtqsVar75.e = 2;
        dtqsVar75.a = "message_reactions.reaction";
        m75.i(48000);
        dtqsVar75.d = new Supplier() { // from class: vcp
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar75.c = new dtsc() { // from class: vcq
        };
        m75.a();
        dtsb m76 = dtsd.m();
        dtqs dtqsVar76 = (dtqs) m76;
        dtqsVar76.e = 5;
        dtqsVar76.a = "message_reactions.applied_reaction";
        m76.i(59060);
        dtqsVar76.d = new Supplier() { // from class: vcr
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar76.c = new dtsc() { // from class: vcs
        };
        m76.a();
        dtsb m77 = dtsd.m();
        dtqs dtqsVar77 = (dtqs) m77;
        dtqsVar77.e = 5;
        m77.d(true);
        dtqsVar77.a = "message_reactions.animation_effect";
        m77.i(59520);
        dtqsVar77.d = new Supplier() { // from class: vcu
            @Override // java.util.function.Supplier
            public final Object get() {
                return vek.a();
            }
        };
        dtqsVar77.c = new dtsc() { // from class: vcv
        };
        m77.a();
    }

    public static dtve a() {
        return dtub.e("$primary");
    }
}

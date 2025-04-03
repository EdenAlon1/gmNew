package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyx {
    public final agyy a;

    public agyx() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "messages._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: agsv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: agxo
        };
        m.a();
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: agyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar2.a = "messages.conversation_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: agyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: agsy
        };
        m2.a();
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: agtk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar3.a = "messages.sender_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: agtw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: agui
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "messages.sender_send_destination";
        m4.i(54040);
        dtqsVar4.d = new Supplier() { // from class: aguu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: agvg
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "messages.msisdn_receiving_rcs_message";
        m5.i(59340);
        dtqsVar5.d = new Supplier() { // from class: agtr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: agvp
        };
        m5.a();
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "messages.receiving_network_country";
        m6.i(54040);
        dtqsVar6.d = new Supplier() { // from class: agwb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: agwn
        };
        m6.a();
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 1;
        m7.d(true);
        dtqsVar7.a = "messages.sent_timestamp";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: agwz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: agxj
        };
        m7.a();
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        dtqsVar8.a = "messages.queue_insert_timestamp";
        m8.i(17030);
        dtqsVar8.d = new Supplier() { // from class: agxk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: agxl
        };
        m8.a();
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        m9.d(true);
        dtqsVar9.a = "messages.received_timestamp";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: agxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: agxn
        };
        m9.a();
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        dtqsVar10.a = "messages.message_protocol";
        m10.i(-1);
        dtqsVar10.d = new Supplier() { // from class: agxq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: agxr
        };
        m10.a();
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 1;
        m11.d(true);
        dtqsVar11.a = "messages.message_status";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: agxs
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: agxt
        };
        m11.a();
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 1;
        dtqsVar12.a = "messages.message_report_status";
        m12.i(13020);
        dtqsVar12.d = new Supplier() { // from class: agxu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: agxv
        };
        m12.a();
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 1;
        m13.d(true);
        dtqsVar13.a = "messages.seen";
        m13.f(true);
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: agxw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: agxx
        };
        m13.a();
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 1;
        m14.d(true);
        dtqsVar14.a = "messages.read";
        m14.i(-1);
        dtqsVar14.d = new Supplier() { // from class: agxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: agxz
        };
        m14.a();
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 4;
        m15.d(true);
        dtqsVar15.a = "messages.sms_message_uri";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: agyc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: agyd
        };
        m15.a();
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 1;
        dtqsVar16.a = "messages.sms_priority";
        m16.i(-1);
        dtqsVar16.d = new Supplier() { // from class: agye
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: agyf
        };
        m16.a();
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        dtqsVar17.a = "messages.sms_message_size";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: agyg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: agyh
        };
        m17.a();
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 4;
        dtqsVar18.a = "messages.mms_subject";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: agyi
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: agyj
        };
        m18.a();
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 4;
        dtqsVar19.a = "messages.mms_transaction_id";
        m19.i(-1);
        dtqsVar19.d = new Supplier() { // from class: agyk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: agym
        };
        m19.a();
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 4;
        dtqsVar20.a = "messages.mms_content_location";
        m20.i(-1);
        dtqsVar20.d = new Supplier() { // from class: agyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: agyp
        };
        m20.a();
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 1;
        dtqsVar21.a = "messages.mms_expiry";
        m21.i(-1);
        dtqsVar21.d = new Supplier() { // from class: agyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: agyr
        };
        m21.a();
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 1;
        m22.d(true);
        dtqsVar22.a = "messages.rcs_expiry";
        m22.i(59890);
        dtqsVar22.d = new Supplier() { // from class: agys
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: agyt
        };
        m22.a();
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 4;
        dtqsVar23.a = "messages.mms_retrieve_text";
        m23.i(9030);
        dtqsVar23.d = new Supplier() { // from class: agyu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: agyv
        };
        m23.a();
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 1;
        dtqsVar24.a = "messages.raw_status";
        m24.i(-1);
        dtqsVar24.d = new Supplier() { // from class: agsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: agsx
        };
        m24.a();
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 1;
        m25.d(true);
        m25.e(true);
        dtqsVar25.b = new Supplier() { // from class: agsz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar25.a = "messages.self_id";
        m25.i(-1);
        dtqsVar25.d = new Supplier() { // from class: agta
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: agtb
        };
        m25.a();
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 4;
        m26.d(true);
        m26.e(true);
        dtqsVar26.b = new Supplier() { // from class: agtc
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar26.a = "messages.my_identity_foreign_key";
        m26.i(60160);
        dtqsVar26.d = new Supplier() { // from class: agtd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: agte
        };
        m26.a();
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 1;
        dtqsVar27.a = "messages.retry_start_timestamp";
        m27.i(-1);
        dtqsVar27.d = new Supplier() { // from class: agtf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: agth
        };
        m27.a();
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 4;
        m28.d(true);
        dtqsVar28.a = "messages.cloud_sync_id";
        m28.i(8500);
        dtqsVar28.d = new Supplier() { // from class: agti
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: agtj
        };
        m28.a();
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 4;
        m29.d(true);
        dtqsVar29.a = "messages.rcs_message_id_with_text_type";
        m29.f(true);
        m29.i(41040);
        dtqsVar29.d = new Supplier() { // from class: agtl
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: agtm
        };
        m29.a();
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 1;
        dtqsVar30.a = "messages.etouffee_status";
        m30.i(29060);
        dtqsVar30.d = new Supplier() { // from class: agtn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: agto
        };
        m30.a();
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 1;
        dtqsVar31.a = "messages.verification_status";
        m31.i(29090);
        dtqsVar31.d = new Supplier() { // from class: agtp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: agtq
        };
        m31.a();
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 1;
        dtqsVar32.a = "messages.rcs_ui_status";
        m32.i(39000);
        dtqsVar32.d = new Supplier() { // from class: agts
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: agtt
        };
        m32.a();
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 1;
        m33.d(true);
        dtqsVar33.a = "messages.is_hidden";
        m33.i(30010);
        dtqsVar33.d = new Supplier() { // from class: agtu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: agtv
        };
        m33.a();
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 7;
        dtqsVar34.a = "messages.rcs_remote_instance";
        m34.i(10002);
        dtqsVar34.d = new Supplier() { // from class: agtx
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: agty
        };
        m34.a();
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 1;
        dtqsVar35.a = "messages.rcs_file_transfer_session_id";
        m35.i(10004);
        dtqsVar35.d = new Supplier() { // from class: agtz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: agua
        };
        m35.a();
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 1;
        dtqsVar36.a = "messages.sms_error_code";
        m36.i(9000);
        dtqsVar36.d = new Supplier() { // from class: agub
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: agud
        };
        m36.a();
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 4;
        dtqsVar37.a = "messages.sms_error_desc_map_name";
        m37.i(9000);
        dtqsVar37.d = new Supplier() { // from class: ague
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: aguf
        };
        m37.a();
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 4;
        dtqsVar38.a = "messages.correlation_id";
        m38.i(9010);
        dtqsVar38.d = new Supplier() { // from class: agug
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: aguh
        };
        m38.a();
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 4;
        m39.l(true);
        m39.d(true);
        dtqsVar39.a = "messages.cms_id";
        m39.f(true);
        m39.i(31010);
        dtqsVar39.d = new Supplier() { // from class: aguj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: aguk
        };
        m39.a();
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 2;
        dtqsVar40.a = "messages.cms_last_mod_seq";
        m40.i(37040);
        dtqsVar40.d = new Supplier() { // from class: agul
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: agum
        };
        m40.a();
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 4;
        m41.d(true);
        dtqsVar41.a = "messages.web_id";
        m41.i(19020);
        dtqsVar41.d = new Supplier() { // from class: aguo
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: agup
        };
        m41.a();
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 1;
        dtqsVar42.a = "messages.usage_stats_logging_id";
        m42.i(29100);
        dtqsVar42.d = new Supplier() { // from class: aguq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: agur
        };
        m42.a();
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 1;
        dtqsVar43.a = "messages.send_counter";
        m43.i(35030);
        dtqsVar43.d = new Supplier() { // from class: agus
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: agut
        };
        m43.a();
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 4;
        m44.d(true);
        dtqsVar44.a = "messages.original_rcs_message_id";
        m44.i(35030);
        dtqsVar44.d = new Supplier() { // from class: aguv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: aguw
        };
        m44.a();
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 4;
        dtqsVar45.a = "messages.custom_delivery_receipt_mime_type";
        m45.i(37020);
        dtqsVar45.d = new Supplier() { // from class: agux
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: aguz
        };
        m45.a();
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 5;
        dtqsVar46.a = "messages.custom_delivery_receipt_content";
        m46.i(37020);
        dtqsVar46.d = new Supplier() { // from class: agva
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: agvb
        };
        m46.a();
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 1;
        dtqsVar47.a = "messages.report_attempt_acounter";
        m47.i(37030);
        dtqsVar47.d = new Supplier() { // from class: agvc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: agvd
        };
        m47.a();
        dtsb m48 = dtsd.m();
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.e = 5;
        dtqsVar48.a = "messages.custom_headers";
        m48.i(45020);
        dtqsVar48.d = new Supplier() { // from class: agve
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: agvf
        };
        m48.a();
        dtsb m49 = dtsd.m();
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.e = 4;
        m49.l(true);
        m49.d(true);
        dtqsVar49.a = "messages.cms_correlation_id";
        m49.f(true);
        m49.i(46010);
        dtqsVar49.d = new Supplier() { // from class: agvm
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: agvx
        };
        m49.a();
        dtsb m50 = dtsd.m();
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.e = 1;
        m50.d(true);
        m50.e(true);
        dtqsVar50.b = new Supplier() { // from class: agwi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar50.a = "messages.group_private_participant";
        m50.i(48030);
        dtqsVar50.d = new Supplier() { // from class: agwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: agxe
        };
        m50.a();
        dtsb m51 = dtsd.m();
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.e = 1;
        m51.d(true);
        m51.e(true);
        dtqsVar51.b = new Supplier() { // from class: agxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar51.a = "messages.original_message_id";
        m51.i(48030);
        dtqsVar51.d = new Supplier() { // from class: agya
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: agyl
        };
        m51.a();
        dtsb m52 = dtsd.m();
        dtqs dtqsVar52 = (dtqs) m52;
        dtqsVar52.e = 1;
        dtqsVar52.a = "messages.awaiting_reverse_sync";
        m52.i(49060);
        dtqsVar52.d = new Supplier() { // from class: agyw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar52.c = new dtsc() { // from class: agtg
        };
        m52.a();
        dtsb m53 = dtsd.m();
        dtqs dtqsVar53 = (dtqs) m53;
        dtqsVar53.e = 4;
        dtqsVar53.a = "messages.old_sms_message_uri";
        m53.i(49060);
        dtqsVar53.d = new Supplier() { // from class: aguc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar53.c = new dtsc() { // from class: agun
        };
        m53.a();
        dtsb m54 = dtsd.m();
        dtqs dtqsVar54 = (dtqs) m54;
        dtqsVar54.e = 4;
        m54.l(true);
        m54.d(true);
        dtqsVar54.a = "messages.draft_id";
        m54.f(true);
        m54.i(56000);
        dtqsVar54.d = new Supplier() { // from class: aguy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar54.c = new dtsc() { // from class: agvh
        };
        m54.a();
        dtsb m55 = dtsd.m();
        dtqs dtqsVar55 = (dtqs) m55;
        dtqsVar55.e = 1;
        dtqsVar55.a = "messages.result_code";
        m55.i(58040);
        dtqsVar55.d = new Supplier() { // from class: agvi
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar55.c = new dtsc() { // from class: agvj
        };
        m55.a();
        dtsb m56 = dtsd.m();
        dtqs dtqsVar56 = (dtqs) m56;
        dtqsVar56.e = 1;
        dtqsVar56.a = "messages.cms_life_cycle";
        m56.i(58210);
        dtqsVar56.d = new Supplier() { // from class: agvk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar56.c = new dtsc() { // from class: agvl
        };
        m56.a();
        dtsb m57 = dtsd.m();
        dtqs dtqsVar57 = (dtqs) m57;
        dtqsVar57.e = 1;
        dtqsVar57.a = "messages.mute_priority";
        m57.i(60750);
        dtqsVar57.d = new Supplier() { // from class: agvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar57.c = new dtsc() { // from class: agvo
        };
        m57.a();
        dtsb m58 = dtsd.m();
        dtqs dtqsVar58 = (dtqs) m58;
        dtqsVar58.e = 1;
        dtqsVar58.a = "messages.fallback_reason";
        m58.i(58710);
        dtqsVar58.d = new Supplier() { // from class: agvq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar58.c = new dtsc() { // from class: agvr
        };
        m58.a();
        dtsb m59 = dtsd.m();
        dtqs dtqsVar59 = (dtqs) m59;
        dtqsVar59.e = 1;
        dtqsVar59.a = "messages.auto_retry_counter";
        m59.i(58230);
        dtqsVar59.d = new Supplier() { // from class: agvs
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar59.c = new dtsc() { // from class: agvt
        };
        m59.a();
        dtsb m60 = dtsd.m();
        dtqs dtqsVar60 = (dtqs) m60;
        dtqsVar60.e = 2;
        dtqsVar60.a = "messages.can_revoke_before_delivered_with_rcs";
        m60.i(58280);
        dtqsVar60.d = new Supplier() { // from class: agvu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar60.c = new dtsc() { // from class: agvv
        };
        m60.a();
        dtsb m61 = dtsd.m();
        dtqs dtqsVar61 = (dtqs) m61;
        dtqsVar61.e = 5;
        dtqsVar61.a = "messages.trace_id";
        m61.i(58680);
        dtqsVar61.d = new Supplier() { // from class: agvw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar61.c = new dtsc() { // from class: agvy
        };
        m61.a();
        dtsb m62 = dtsd.m();
        dtqs dtqsVar62 = (dtqs) m62;
        dtqsVar62.e = 1;
        dtqsVar62.a = "messages.outgoing_delivery_report_status";
        m62.i(58720);
        dtqsVar62.d = new Supplier() { // from class: agvz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar62.c = new dtsc() { // from class: agwa
        };
        m62.a();
        dtsb m63 = dtsd.m();
        dtqs dtqsVar63 = (dtqs) m63;
        dtqsVar63.e = 1;
        dtqsVar63.a = "messages.outgoing_read_report_status";
        m63.i(58720);
        dtqsVar63.d = new Supplier() { // from class: agwc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar63.c = new dtsc() { // from class: agwd
        };
        m63.a();
        dtsb m64 = dtsd.m();
        dtqs dtqsVar64 = (dtqs) m64;
        dtqsVar64.e = 1;
        dtqsVar64.a = "messages.xms_transport";
        m64.i(59310);
        dtqsVar64.d = new Supplier() { // from class: agwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar64.c = new dtsc() { // from class: agwf
        };
        m64.a();
        dtsb m65 = dtsd.m();
        dtqs dtqsVar65 = (dtqs) m65;
        dtqsVar65.e = 1;
        dtqsVar65.a = "messages.message_original_protocol";
        m65.i(59430);
        dtqsVar65.d = new Supplier() { // from class: agwg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar65.c = new dtsc() { // from class: agwh
        };
        m65.a();
        dtsb m66 = dtsd.m();
        dtqs dtqsVar66 = (dtqs) m66;
        dtqsVar66.e = 4;
        m66.l(true);
        m66.d(true);
        dtqsVar66.a = "messages.satellite_datagram_id";
        m66.f(true);
        m66.i(59490);
        dtqsVar66.d = new Supplier() { // from class: agwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar66.c = new dtsc() { // from class: agwk
        };
        m66.a();
        dtsb m67 = dtsd.m();
        dtqs dtqsVar67 = (dtqs) m67;
        dtqsVar67.e = 1;
        dtqsVar67.a = "messages.encryption_protocol";
        m67.i(60190);
        dtqsVar67.d = new Supplier() { // from class: agwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar67.c = new dtsc() { // from class: agwm
        };
        m67.a();
        dtsb m68 = dtsd.m();
        dtqs dtqsVar68 = (dtqs) m68;
        dtqsVar68.e = 4;
        m68.l(true);
        m68.d(true);
        dtqsVar68.a = "messages.message_persistence_id";
        m68.f(true);
        m68.i(60370);
        dtqsVar68.d = new Supplier() { // from class: agwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar68.c = new dtsc() { // from class: agwp
        };
        m68.a();
        dtsb m69 = dtsd.m();
        dtqs dtqsVar69 = (dtqs) m69;
        dtqsVar69.e = 2;
        m69.l(true);
        m69.g(true);
        m69.d(true);
        dtqsVar69.a = "message_labels._id";
        m69.i(-1);
        dtqsVar69.d = new Supplier() { // from class: agwq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar69.c = new dtsc() { // from class: agwr
        };
        this.a = new agyy(m69.a());
        dtsb m70 = dtsd.m();
        dtqs dtqsVar70 = (dtqs) m70;
        dtqsVar70.e = 2;
        m70.d(true);
        m70.e(true);
        dtqsVar70.b = new Supplier() { // from class: agws
            @Override // java.util.function.Supplier
            public final Object get() {
                return byfi.b.a;
            }
        };
        dtqsVar70.a = "message_labels.label";
        m70.f(true);
        m70.i(-1);
        dtqsVar70.d = new Supplier() { // from class: agwu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar70.c = new dtsc() { // from class: agwv
        };
        m70.a();
        dtsb m71 = dtsd.m();
        dtqs dtqsVar71 = (dtqs) m71;
        dtqsVar71.e = 2;
        m71.d(true);
        m71.e(true);
        dtqsVar71.b = new Supplier() { // from class: agww
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar71.a = "message_labels.message_id";
        m71.f(true);
        m71.i(-1);
        dtqsVar71.d = new Supplier() { // from class: agwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar71.c = new dtsc() { // from class: agwy
        };
        m71.a();
        dtsb m72 = dtsd.m();
        dtqs dtqsVar72 = (dtqs) m72;
        dtqsVar72.e = 2;
        dtqsVar72.a = "message_labels.confidence";
        m72.i(53060);
        dtqsVar72.d = new Supplier() { // from class: agxa
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar72.c = new dtsc() { // from class: agxb
        };
        m72.a();
        dtsb m73 = dtsd.m();
        dtqs dtqsVar73 = (dtqs) m73;
        dtqsVar73.e = 2;
        dtqsVar73.a = "message_labels.source";
        m73.i(-1);
        dtqsVar73.d = new Supplier() { // from class: agxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar73.c = new dtsc() { // from class: agxd
        };
        m73.a();
        dtsb m74 = dtsd.m();
        dtqs dtqsVar74 = (dtqs) m74;
        dtqsVar74.e = 4;
        m74.d(true);
        dtqsVar74.a = "message_labels.intent";
        m74.i(58590);
        dtqsVar74.d = new Supplier() { // from class: agxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar74.c = new dtsc() { // from class: agxg
        };
        m74.a();
        dtsb m75 = dtsd.m();
        dtqs dtqsVar75 = (dtqs) m75;
        dtqsVar75.e = 4;
        dtqsVar75.a = "message_labels.model_id";
        m75.i(-1);
        dtqsVar75.d = new Supplier() { // from class: agxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agze.b();
            }
        };
        dtqsVar75.c = new dtsc() { // from class: agxi
        };
        m75.a();
    }
}

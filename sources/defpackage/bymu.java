package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bymu {
    public final bymv a;

    public bymu() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversation_suggestions._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bygj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bylv
        };
        this.a = new bymv(m.a());
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bymh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "conversation_suggestions.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bygk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bygw
        };
        m2.a();
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "conversation_suggestions.conversation_suggestion_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: byhi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: byhu
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "conversation_suggestions.properties";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: byig
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: byis
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "conversation_suggestions.post_back_data";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: byje
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: byhf
        };
        m5.a();
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "conversation_suggestions.post_back_encoding";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: byjm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: byjy
        };
        m6.a();
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "conversation_suggestions.rcs_message_id";
        m7.i(11001);
        dtqsVar7.d = new Supplier() { // from class: bykk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bykw
        };
        m7.a();
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 4;
        m8.d(true);
        dtqsVar8.a = "conversation_suggestions.target_rcs_message_id";
        m8.i(12000);
        dtqsVar8.d = new Supplier() { // from class: byli
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bylr
        };
        m8.a();
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        dtqsVar9.a = "conversation_suggestions.read";
        m9.i(12000);
        dtqsVar9.d = new Supplier() { // from class: byls
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bylt
        };
        m9.a();
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        dtqsVar10.a = "conversation_suggestions.received_timestamp";
        m10.i(12000);
        dtqsVar10.d = new Supplier() { // from class: bylu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bylw
        };
        m10.a();
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 1;
        m11.d(true);
        m11.e(true);
        dtqsVar11.b = new Supplier() { // from class: byly
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar11.a = "messages.conversation_id";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: bylz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: byma
        };
        m11.a();
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 2;
        m12.l(true);
        m12.g(true);
        m12.d(true);
        dtqsVar12.a = "messages._id";
        m12.i(-1);
        dtqsVar12.d = new Supplier() { // from class: bymb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bymc
        };
        m12.a();
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 1;
        m13.d(true);
        m13.e(true);
        dtqsVar13.b = new Supplier() { // from class: bymd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar13.a = "messages.sender_id";
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: byme
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bymf
        };
        m13.a();
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 4;
        dtqsVar14.a = "messages.sender_send_destination";
        m14.i(54040);
        dtqsVar14.d = new Supplier() { // from class: bymg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: bymj
        };
        m14.a();
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 4;
        dtqsVar15.a = "messages.msisdn_receiving_rcs_message";
        m15.i(59340);
        dtqsVar15.d = new Supplier() { // from class: bymk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: byml
        };
        m15.a();
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 4;
        dtqsVar16.a = "messages.receiving_network_country";
        m16.i(54040);
        dtqsVar16.d = new Supplier() { // from class: bymm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: bymn
        };
        m16.a();
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        m17.d(true);
        dtqsVar17.a = "messages.sent_timestamp";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: bymo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: bymp
        };
        m17.a();
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 1;
        dtqsVar18.a = "messages.queue_insert_timestamp";
        m18.i(17030);
        dtqsVar18.d = new Supplier() { // from class: bymq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: bymr
        };
        m18.a();
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 1;
        m19.d(true);
        dtqsVar19.a = "messages.received_timestamp";
        m19.i(-1);
        dtqsVar19.d = new Supplier() { // from class: byms
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: bygl
        };
        m19.a();
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 1;
        dtqsVar20.a = "messages.message_protocol";
        m20.i(-1);
        dtqsVar20.d = new Supplier() { // from class: bygm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: bygn
        };
        m20.a();
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 1;
        m21.d(true);
        dtqsVar21.a = "messages.message_status";
        m21.i(-1);
        dtqsVar21.d = new Supplier() { // from class: bygo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: bygp
        };
        m21.a();
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 1;
        dtqsVar22.a = "messages.message_report_status";
        m22.i(13020);
        dtqsVar22.d = new Supplier() { // from class: bygq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: bygr
        };
        m22.a();
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 1;
        m23.d(true);
        dtqsVar23.a = "messages.seen";
        m23.f(true);
        m23.i(-1);
        dtqsVar23.d = new Supplier() { // from class: bygs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: bygt
        };
        m23.a();
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 1;
        m24.d(true);
        dtqsVar24.a = "messages.read";
        m24.i(-1);
        dtqsVar24.d = new Supplier() { // from class: bygv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: bygx
        };
        m24.a();
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 4;
        m25.d(true);
        dtqsVar25.a = "messages.sms_message_uri";
        m25.i(-1);
        dtqsVar25.d = new Supplier() { // from class: bygy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: bygz
        };
        m25.a();
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 1;
        dtqsVar26.a = "messages.sms_priority";
        m26.i(-1);
        dtqsVar26.d = new Supplier() { // from class: byha
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: byhb
        };
        m26.a();
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 1;
        dtqsVar27.a = "messages.sms_message_size";
        m27.i(-1);
        dtqsVar27.d = new Supplier() { // from class: byhc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: byhd
        };
        m27.a();
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 4;
        dtqsVar28.a = "messages.mms_subject";
        m28.i(-1);
        dtqsVar28.d = new Supplier() { // from class: byhe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: byhg
        };
        m28.a();
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 4;
        dtqsVar29.a = "messages.mms_transaction_id";
        m29.i(-1);
        dtqsVar29.d = new Supplier() { // from class: byhh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: byhj
        };
        m29.a();
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 4;
        dtqsVar30.a = "messages.mms_content_location";
        m30.i(-1);
        dtqsVar30.d = new Supplier() { // from class: byhk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: byhl
        };
        m30.a();
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 1;
        dtqsVar31.a = "messages.mms_expiry";
        m31.i(-1);
        dtqsVar31.d = new Supplier() { // from class: byhm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: byhn
        };
        m31.a();
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 1;
        m32.d(true);
        dtqsVar32.a = "messages.rcs_expiry";
        m32.i(59890);
        dtqsVar32.d = new Supplier() { // from class: byho
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: byhp
        };
        m32.a();
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 4;
        dtqsVar33.a = "messages.mms_retrieve_text";
        m33.i(9030);
        dtqsVar33.d = new Supplier() { // from class: byhr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: byhs
        };
        m33.a();
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 1;
        dtqsVar34.a = "messages.raw_status";
        m34.i(-1);
        dtqsVar34.d = new Supplier() { // from class: byht
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: byhv
        };
        m34.a();
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 1;
        m35.d(true);
        m35.e(true);
        dtqsVar35.b = new Supplier() { // from class: byhw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar35.a = "messages.self_id";
        m35.i(-1);
        dtqsVar35.d = new Supplier() { // from class: byhx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: byhy
        };
        m35.a();
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 4;
        m36.d(true);
        dtqsVar36.a = "messages.my_identity";
        m36.i(59810);
        dtqsVar36.d = new Supplier() { // from class: byhz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: byia
        };
        m36.a();
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 4;
        m37.d(true);
        m37.e(true);
        dtqsVar37.b = new Supplier() { // from class: byic
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar37.a = "messages.my_identity_foreign_key";
        m37.i(60160);
        dtqsVar37.d = new Supplier() { // from class: byid
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: byie
        };
        m37.a();
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 1;
        dtqsVar38.a = "messages.retry_start_timestamp";
        m38.i(-1);
        dtqsVar38.d = new Supplier() { // from class: byif
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: byih
        };
        m38.a();
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 4;
        m39.d(true);
        dtqsVar39.a = "messages.cloud_sync_id";
        m39.i(8500);
        dtqsVar39.d = new Supplier() { // from class: byii
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: byij
        };
        m39.a();
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 7;
        m40.d(true);
        dtqsVar40.a = "messages.rcs_message_id";
        m40.f(true);
        m40.i(10000);
        dtqsVar40.d = new Supplier() { // from class: byik
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: byil
        };
        m40.a();
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 4;
        m41.d(true);
        dtqsVar41.a = "messages.rcs_message_id_with_text_type";
        m41.f(true);
        m41.i(41040);
        dtqsVar41.d = new Supplier() { // from class: byin
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: byio
        };
        m41.a();
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 1;
        dtqsVar42.a = "messages.etouffee_status";
        m42.i(29060);
        dtqsVar42.d = new Supplier() { // from class: byip
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: byiq
        };
        m42.a();
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 1;
        dtqsVar43.a = "messages.verification_status";
        m43.i(29090);
        dtqsVar43.d = new Supplier() { // from class: byir
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: byit
        };
        m43.a();
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 1;
        dtqsVar44.a = "messages.rcs_ui_status";
        m44.i(39000);
        dtqsVar44.d = new Supplier() { // from class: byiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: byiv
        };
        m44.a();
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 1;
        m45.d(true);
        dtqsVar45.a = "messages.is_hidden";
        m45.i(30010);
        dtqsVar45.d = new Supplier() { // from class: byiw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: byiy
        };
        m45.a();
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 7;
        dtqsVar46.a = "messages.rcs_remote_instance";
        m46.i(10002);
        dtqsVar46.d = new Supplier() { // from class: byiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: byja
        };
        m46.a();
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 1;
        dtqsVar47.a = "messages.rcs_file_transfer_session_id";
        m47.i(10004);
        dtqsVar47.d = new Supplier() { // from class: byjb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: byjc
        };
        m47.a();
        dtsb m48 = dtsd.m();
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.e = 1;
        dtqsVar48.a = "messages.sms_error_code";
        m48.i(9000);
        dtqsVar48.d = new Supplier() { // from class: byjd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: byjj
        };
        m48.a();
        dtsb m49 = dtsd.m();
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.e = 4;
        dtqsVar49.a = "messages.sms_error_desc_map_name";
        m49.i(9000);
        dtqsVar49.d = new Supplier() { // from class: byju
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: bykf
        };
        m49.a();
        dtsb m50 = dtsd.m();
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.e = 4;
        dtqsVar50.a = "messages.correlation_id";
        m50.i(9010);
        dtqsVar50.d = new Supplier() { // from class: bykq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: bylb
        };
        m50.a();
        dtsb m51 = dtsd.m();
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.e = 4;
        m51.l(true);
        m51.d(true);
        dtqsVar51.a = "messages.cms_id";
        m51.f(true);
        m51.i(31010);
        dtqsVar51.d = new Supplier() { // from class: bylm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: bylx
        };
        m51.a();
        dtsb m52 = dtsd.m();
        dtqs dtqsVar52 = (dtqs) m52;
        dtqsVar52.e = 2;
        dtqsVar52.a = "messages.cms_last_mod_seq";
        m52.i(37040);
        dtqsVar52.d = new Supplier() { // from class: bymi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar52.c = new dtsc() { // from class: bymt
        };
        m52.a();
        dtsb m53 = dtsd.m();
        dtqs dtqsVar53 = (dtqs) m53;
        dtqsVar53.e = 4;
        m53.d(true);
        dtqsVar53.a = "messages.web_id";
        m53.i(19020);
        dtqsVar53.d = new Supplier() { // from class: bygu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar53.c = new dtsc() { // from class: byhq
        };
        m53.a();
        dtsb m54 = dtsd.m();
        dtqs dtqsVar54 = (dtqs) m54;
        dtqsVar54.e = 1;
        dtqsVar54.a = "messages.usage_stats_logging_id";
        m54.i(29100);
        dtqsVar54.d = new Supplier() { // from class: byib
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar54.c = new dtsc() { // from class: byim
        };
        m54.a();
        dtsb m55 = dtsd.m();
        dtqs dtqsVar55 = (dtqs) m55;
        dtqsVar55.e = 1;
        dtqsVar55.a = "messages.send_counter";
        m55.i(35030);
        dtqsVar55.d = new Supplier() { // from class: byix
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar55.c = new dtsc() { // from class: byjf
        };
        m55.a();
        dtsb m56 = dtsd.m();
        dtqs dtqsVar56 = (dtqs) m56;
        dtqsVar56.e = 4;
        m56.d(true);
        dtqsVar56.a = "messages.original_rcs_message_id";
        m56.i(35030);
        dtqsVar56.d = new Supplier() { // from class: byjg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar56.c = new dtsc() { // from class: byjh
        };
        m56.a();
        dtsb m57 = dtsd.m();
        dtqs dtqsVar57 = (dtqs) m57;
        dtqsVar57.e = 4;
        dtqsVar57.a = "messages.custom_delivery_receipt_mime_type";
        m57.i(37020);
        dtqsVar57.d = new Supplier() { // from class: byji
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar57.c = new dtsc() { // from class: byjk
        };
        m57.a();
        dtsb m58 = dtsd.m();
        dtqs dtqsVar58 = (dtqs) m58;
        dtqsVar58.e = 5;
        dtqsVar58.a = "messages.custom_delivery_receipt_content";
        m58.i(37020);
        dtqsVar58.d = new Supplier() { // from class: byjl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar58.c = new dtsc() { // from class: byjn
        };
        m58.a();
        dtsb m59 = dtsd.m();
        dtqs dtqsVar59 = (dtqs) m59;
        dtqsVar59.e = 1;
        dtqsVar59.a = "messages.report_attempt_acounter";
        m59.i(37030);
        dtqsVar59.d = new Supplier() { // from class: byjo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar59.c = new dtsc() { // from class: byjp
        };
        m59.a();
        dtsb m60 = dtsd.m();
        dtqs dtqsVar60 = (dtqs) m60;
        dtqsVar60.e = 5;
        dtqsVar60.a = "messages.custom_headers";
        m60.i(45020);
        dtqsVar60.d = new Supplier() { // from class: byjq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar60.c = new dtsc() { // from class: byjr
        };
        m60.a();
        dtsb m61 = dtsd.m();
        dtqs dtqsVar61 = (dtqs) m61;
        dtqsVar61.e = 4;
        m61.l(true);
        m61.d(true);
        dtqsVar61.a = "messages.cms_correlation_id";
        m61.f(true);
        m61.i(46010);
        dtqsVar61.d = new Supplier() { // from class: byjs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar61.c = new dtsc() { // from class: byjt
        };
        m61.a();
        dtsb m62 = dtsd.m();
        dtqs dtqsVar62 = (dtqs) m62;
        dtqsVar62.e = 1;
        m62.d(true);
        m62.e(true);
        dtqsVar62.b = new Supplier() { // from class: byjv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar62.a = "messages.group_private_participant";
        m62.i(48030);
        dtqsVar62.d = new Supplier() { // from class: byjw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar62.c = new dtsc() { // from class: byjx
        };
        m62.a();
        dtsb m63 = dtsd.m();
        dtqs dtqsVar63 = (dtqs) m63;
        dtqsVar63.e = 1;
        m63.d(true);
        m63.e(true);
        dtqsVar63.b = new Supplier() { // from class: byjz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar63.a = "messages.original_message_id";
        m63.i(48030);
        dtqsVar63.d = new Supplier() { // from class: byka
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar63.c = new dtsc() { // from class: bykb
        };
        m63.a();
        dtsb m64 = dtsd.m();
        dtqs dtqsVar64 = (dtqs) m64;
        dtqsVar64.e = 1;
        dtqsVar64.a = "messages.awaiting_reverse_sync";
        m64.i(49060);
        dtqsVar64.d = new Supplier() { // from class: bykc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar64.c = new dtsc() { // from class: bykd
        };
        m64.a();
        dtsb m65 = dtsd.m();
        dtqs dtqsVar65 = (dtqs) m65;
        dtqsVar65.e = 4;
        dtqsVar65.a = "messages.old_sms_message_uri";
        m65.i(49060);
        dtqsVar65.d = new Supplier() { // from class: byke
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar65.c = new dtsc() { // from class: bykg
        };
        m65.a();
        dtsb m66 = dtsd.m();
        dtqs dtqsVar66 = (dtqs) m66;
        dtqsVar66.e = 4;
        m66.l(true);
        m66.d(true);
        dtqsVar66.a = "messages.draft_id";
        m66.f(true);
        m66.i(56000);
        dtqsVar66.d = new Supplier() { // from class: bykh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar66.c = new dtsc() { // from class: byki
        };
        m66.a();
        dtsb m67 = dtsd.m();
        dtqs dtqsVar67 = (dtqs) m67;
        dtqsVar67.e = 1;
        dtqsVar67.a = "messages.result_code";
        m67.i(58040);
        dtqsVar67.d = new Supplier() { // from class: bykj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar67.c = new dtsc() { // from class: bykl
        };
        m67.a();
        dtsb m68 = dtsd.m();
        dtqs dtqsVar68 = (dtqs) m68;
        dtqsVar68.e = 1;
        dtqsVar68.a = "messages.cms_life_cycle";
        m68.i(58210);
        dtqsVar68.d = new Supplier() { // from class: bykm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar68.c = new dtsc() { // from class: bykn
        };
        m68.a();
        dtsb m69 = dtsd.m();
        dtqs dtqsVar69 = (dtqs) m69;
        dtqsVar69.e = 1;
        dtqsVar69.a = "messages.mute_priority";
        m69.i(60750);
        dtqsVar69.d = new Supplier() { // from class: byko
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar69.c = new dtsc() { // from class: bykp
        };
        m69.a();
        dtsb m70 = dtsd.m();
        dtqs dtqsVar70 = (dtqs) m70;
        dtqsVar70.e = 1;
        dtqsVar70.a = "messages.fallback_reason";
        m70.i(58710);
        dtqsVar70.d = new Supplier() { // from class: bykr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar70.c = new dtsc() { // from class: byks
        };
        m70.a();
        dtsb m71 = dtsd.m();
        dtqs dtqsVar71 = (dtqs) m71;
        dtqsVar71.e = 1;
        dtqsVar71.a = "messages.auto_retry_counter";
        m71.i(58230);
        dtqsVar71.d = new Supplier() { // from class: bykt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar71.c = new dtsc() { // from class: byku
        };
        m71.a();
        dtsb m72 = dtsd.m();
        dtqs dtqsVar72 = (dtqs) m72;
        dtqsVar72.e = 2;
        dtqsVar72.a = "messages.can_revoke_before_delivered_with_rcs";
        m72.i(58280);
        dtqsVar72.d = new Supplier() { // from class: bykv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar72.c = new dtsc() { // from class: bykx
        };
        m72.a();
        dtsb m73 = dtsd.m();
        dtqs dtqsVar73 = (dtqs) m73;
        dtqsVar73.e = 5;
        dtqsVar73.a = "messages.trace_id";
        m73.i(58680);
        dtqsVar73.d = new Supplier() { // from class: byky
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar73.c = new dtsc() { // from class: bykz
        };
        m73.a();
        dtsb m74 = dtsd.m();
        dtqs dtqsVar74 = (dtqs) m74;
        dtqsVar74.e = 1;
        dtqsVar74.a = "messages.outgoing_delivery_report_status";
        m74.i(58720);
        dtqsVar74.d = new Supplier() { // from class: byla
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar74.c = new dtsc() { // from class: bylc
        };
        m74.a();
        dtsb m75 = dtsd.m();
        dtqs dtqsVar75 = (dtqs) m75;
        dtqsVar75.e = 1;
        dtqsVar75.a = "messages.outgoing_read_report_status";
        m75.i(58720);
        dtqsVar75.d = new Supplier() { // from class: byld
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar75.c = new dtsc() { // from class: byle
        };
        m75.a();
        dtsb m76 = dtsd.m();
        dtqs dtqsVar76 = (dtqs) m76;
        dtqsVar76.e = 1;
        dtqsVar76.a = "messages.xms_transport";
        m76.i(59310);
        dtqsVar76.d = new Supplier() { // from class: bylf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar76.c = new dtsc() { // from class: bylg
        };
        m76.a();
        dtsb m77 = dtsd.m();
        dtqs dtqsVar77 = (dtqs) m77;
        dtqsVar77.e = 1;
        dtqsVar77.a = "messages.message_original_protocol";
        m77.i(59430);
        dtqsVar77.d = new Supplier() { // from class: bylh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar77.c = new dtsc() { // from class: bylj
        };
        m77.a();
        dtsb m78 = dtsd.m();
        dtqs dtqsVar78 = (dtqs) m78;
        dtqsVar78.e = 4;
        m78.l(true);
        m78.d(true);
        dtqsVar78.a = "messages.satellite_datagram_id";
        m78.f(true);
        m78.i(59490);
        dtqsVar78.d = new Supplier() { // from class: bylk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar78.c = new dtsc() { // from class: byll
        };
        m78.a();
        dtsb m79 = dtsd.m();
        dtqs dtqsVar79 = (dtqs) m79;
        dtqsVar79.e = 1;
        dtqsVar79.a = "messages.encryption_protocol";
        m79.i(60190);
        dtqsVar79.d = new Supplier() { // from class: byln
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar79.c = new dtsc() { // from class: bylo
        };
        m79.a();
        dtsb m80 = dtsd.m();
        dtqs dtqsVar80 = (dtqs) m80;
        dtqsVar80.e = 4;
        m80.l(true);
        m80.d(true);
        dtqsVar80.a = "messages.message_persistence_id";
        m80.f(true);
        m80.i(60370);
        dtqsVar80.d = new Supplier() { // from class: bylp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bynb.a();
            }
        };
        dtqsVar80.c = new dtsc() { // from class: bylq
        };
        m80.a();
    }
}

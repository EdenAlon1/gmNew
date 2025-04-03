package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnaq {
    public final cnar a;

    public cnaq() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.k(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: cmuk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar.a = "message_reactions.message_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: cmzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: cmzy
        };
        m.a();
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: cnak
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "message_reactions.reacted_message_id";
        m2.i(46020);
        dtqsVar2.d = new Supplier() { // from class: cmur
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: cmvd
        };
        m2.a();
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        dtqsVar3.a = "message_reactions.reaction";
        m3.i(48000);
        dtqsVar3.d = new Supplier() { // from class: cmvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: cmwb
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 5;
        dtqsVar4.a = "message_reactions.applied_reaction";
        m4.i(59060);
        dtqsVar4.d = new Supplier() { // from class: cmwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: cmxa
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.l(true);
        m5.g(true);
        m5.d(true);
        dtqsVar5.a = "message_reactions._id";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: cmvg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: cmxi
        };
        m5.a();
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 5;
        dtqsVar6.a = "message_reactions.reactions_data";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: cmxu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: cmyg
        };
        m6.a();
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 5;
        m7.d(true);
        dtqsVar7.a = "message_reactions.animation_effect";
        m7.i(59520);
        dtqsVar7.d = new Supplier() { // from class: cmys
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: cmze
        };
        m7.a();
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        m8.l(true);
        m8.g(true);
        m8.d(true);
        dtqsVar8.a = "messages._id";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: cmzh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: cmzj
        };
        this.a = new cnar(m8.a());
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        m9.d(true);
        dtqsVar9.a = "messages.message_status";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: cmzk
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: cmzl
        };
        m9.a();
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        m10.d(true);
        m10.e(true);
        dtqsVar10.b = new Supplier() { // from class: cmzn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar10.a = "messages.conversation_id";
        m10.i(-1);
        dtqsVar10.d = new Supplier() { // from class: cmzo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: cmzp
        };
        m10.a();
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 1;
        m11.d(true);
        m11.e(true);
        dtqsVar11.b = new Supplier() { // from class: cmzq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar11.a = "messages.sender_id";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: cmzr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: cmzs
        };
        m11.a();
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 4;
        dtqsVar12.a = "messages.sender_send_destination";
        m12.i(54040);
        dtqsVar12.d = new Supplier() { // from class: cmzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: cmzv
        };
        m12.a();
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 4;
        dtqsVar13.a = "messages.msisdn_receiving_rcs_message";
        m13.i(59340);
        dtqsVar13.d = new Supplier() { // from class: cmzw
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: cmzx
        };
        m13.a();
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 4;
        dtqsVar14.a = "messages.receiving_network_country";
        m14.i(54040);
        dtqsVar14.d = new Supplier() { // from class: cmzz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: cnaa
        };
        m14.a();
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 1;
        m15.d(true);
        dtqsVar15.a = "messages.sent_timestamp";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: cnab
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: cnac
        };
        m15.a();
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 1;
        dtqsVar16.a = "messages.queue_insert_timestamp";
        m16.i(17030);
        dtqsVar16.d = new Supplier() { // from class: cnad
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: cnaf
        };
        m16.a();
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        m17.d(true);
        dtqsVar17.a = "messages.received_timestamp";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: cnag
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: cnah
        };
        m17.a();
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 1;
        dtqsVar18.a = "messages.message_protocol";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: cnai
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: cnaj
        };
        m18.a();
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 1;
        dtqsVar19.a = "messages.message_report_status";
        m19.i(13020);
        dtqsVar19.d = new Supplier() { // from class: cnal
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: cnam
        };
        m19.a();
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 1;
        m20.d(true);
        dtqsVar20.a = "messages.seen";
        m20.f(true);
        m20.i(-1);
        dtqsVar20.d = new Supplier() { // from class: cnan
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: cnao
        };
        m20.a();
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 1;
        m21.d(true);
        dtqsVar21.a = "messages.read";
        m21.i(-1);
        dtqsVar21.d = new Supplier() { // from class: cmul
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: cmum
        };
        m21.a();
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 4;
        m22.d(true);
        dtqsVar22.a = "messages.sms_message_uri";
        m22.i(-1);
        dtqsVar22.d = new Supplier() { // from class: cmun
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: cmuo
        };
        m22.a();
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 1;
        dtqsVar23.a = "messages.sms_priority";
        m23.i(-1);
        dtqsVar23.d = new Supplier() { // from class: cmup
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: cmuq
        };
        m23.a();
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 1;
        dtqsVar24.a = "messages.sms_message_size";
        m24.i(-1);
        dtqsVar24.d = new Supplier() { // from class: cmus
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: cmut
        };
        m24.a();
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 4;
        dtqsVar25.a = "messages.mms_subject";
        m25.i(-1);
        dtqsVar25.d = new Supplier() { // from class: cmuu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: cmuw
        };
        m25.a();
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 4;
        dtqsVar26.a = "messages.mms_transaction_id";
        m26.i(-1);
        dtqsVar26.d = new Supplier() { // from class: cmux
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: cmuy
        };
        m26.a();
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 4;
        dtqsVar27.a = "messages.mms_content_location";
        m27.i(-1);
        dtqsVar27.d = new Supplier() { // from class: cmuz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: cmva
        };
        m27.a();
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 1;
        dtqsVar28.a = "messages.mms_expiry";
        m28.i(-1);
        dtqsVar28.d = new Supplier() { // from class: cmvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: cmvc
        };
        m28.a();
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 1;
        m29.d(true);
        dtqsVar29.a = "messages.rcs_expiry";
        m29.i(59890);
        dtqsVar29.d = new Supplier() { // from class: cmve
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: cmvf
        };
        m29.a();
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 4;
        dtqsVar30.a = "messages.mms_retrieve_text";
        m30.i(9030);
        dtqsVar30.d = new Supplier() { // from class: cmvh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: cmvi
        };
        m30.a();
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 1;
        dtqsVar31.a = "messages.raw_status";
        m31.i(-1);
        dtqsVar31.d = new Supplier() { // from class: cmvj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: cmvk
        };
        m31.a();
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 1;
        m32.d(true);
        m32.e(true);
        dtqsVar32.b = new Supplier() { // from class: cmvl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar32.a = "messages.self_id";
        m32.i(-1);
        dtqsVar32.d = new Supplier() { // from class: cmvm
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: cmvn
        };
        m32.a();
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 4;
        m33.d(true);
        dtqsVar33.a = "messages.my_identity";
        m33.i(59810);
        dtqsVar33.d = new Supplier() { // from class: cmvo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: cmvq
        };
        m33.a();
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 4;
        m34.d(true);
        m34.e(true);
        dtqsVar34.b = new Supplier() { // from class: cmvs
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar34.a = "messages.my_identity_foreign_key";
        m34.i(60160);
        dtqsVar34.d = new Supplier() { // from class: cmvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: cmvu
        };
        m34.a();
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 1;
        dtqsVar35.a = "messages.retry_start_timestamp";
        m35.i(-1);
        dtqsVar35.d = new Supplier() { // from class: cmvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: cmvw
        };
        m35.a();
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 4;
        m36.d(true);
        dtqsVar36.a = "messages.cloud_sync_id";
        m36.i(8500);
        dtqsVar36.d = new Supplier() { // from class: cmvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: cmvy
        };
        m36.a();
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 7;
        m37.d(true);
        dtqsVar37.a = "messages.rcs_message_id";
        m37.f(true);
        m37.i(10000);
        dtqsVar37.d = new Supplier() { // from class: cmvz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: cmwa
        };
        m37.a();
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 4;
        m38.d(true);
        dtqsVar38.a = "messages.rcs_message_id_with_text_type";
        m38.f(true);
        m38.i(41040);
        dtqsVar38.d = new Supplier() { // from class: cmwd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: cmwe
        };
        m38.a();
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 1;
        dtqsVar39.a = "messages.etouffee_status";
        m39.i(29060);
        dtqsVar39.d = new Supplier() { // from class: cmwf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: cmwg
        };
        m39.a();
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 1;
        dtqsVar40.a = "messages.verification_status";
        m40.i(29090);
        dtqsVar40.d = new Supplier() { // from class: cmwh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: cmwi
        };
        m40.a();
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 1;
        dtqsVar41.a = "messages.rcs_ui_status";
        m41.i(39000);
        dtqsVar41.d = new Supplier() { // from class: cmwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: cmwk
        };
        m41.a();
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 1;
        m42.d(true);
        dtqsVar42.a = "messages.is_hidden";
        m42.i(30010);
        dtqsVar42.d = new Supplier() { // from class: cmwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: cmwm
        };
        m42.a();
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 7;
        dtqsVar43.a = "messages.rcs_remote_instance";
        m43.i(10002);
        dtqsVar43.d = new Supplier() { // from class: cmwp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: cmwq
        };
        m43.a();
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 1;
        dtqsVar44.a = "messages.rcs_file_transfer_session_id";
        m44.i(10004);
        dtqsVar44.d = new Supplier() { // from class: cmwr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: cmws
        };
        m44.a();
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 1;
        dtqsVar45.a = "messages.sms_error_code";
        m45.i(9000);
        dtqsVar45.d = new Supplier() { // from class: cmwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: cmwu
        };
        m45.a();
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 4;
        dtqsVar46.a = "messages.sms_error_desc_map_name";
        m46.i(9000);
        dtqsVar46.d = new Supplier() { // from class: cmwv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: cmww
        };
        m46.a();
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 4;
        dtqsVar47.a = "messages.correlation_id";
        m47.i(9010);
        dtqsVar47.d = new Supplier() { // from class: cmwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: cmwz
        };
        m47.a();
        dtsb m48 = dtsd.m();
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.e = 4;
        m48.l(true);
        m48.d(true);
        dtqsVar48.a = "messages.cms_id";
        m48.f(true);
        m48.i(31010);
        dtqsVar48.d = new Supplier() { // from class: cmxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: cmxq
        };
        m48.a();
        dtsb m49 = dtsd.m();
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.e = 2;
        dtqsVar49.a = "messages.cms_last_mod_seq";
        m49.i(37040);
        dtqsVar49.d = new Supplier() { // from class: cmyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: cmym
        };
        m49.a();
        dtsb m50 = dtsd.m();
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.e = 4;
        m50.d(true);
        dtqsVar50.a = "messages.web_id";
        m50.i(19020);
        dtqsVar50.d = new Supplier() { // from class: cmyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: cmzi
        };
        m50.a();
        dtsb m51 = dtsd.m();
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.e = 1;
        dtqsVar51.a = "messages.usage_stats_logging_id";
        m51.i(29100);
        dtqsVar51.d = new Supplier() { // from class: cmzt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: cnae
        };
        m51.a();
        dtsb m52 = dtsd.m();
        dtqs dtqsVar52 = (dtqs) m52;
        dtqsVar52.e = 1;
        dtqsVar52.a = "messages.send_counter";
        m52.i(35030);
        dtqsVar52.d = new Supplier() { // from class: cnap
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar52.c = new dtsc() { // from class: cmuv
        };
        m52.a();
        dtsb m53 = dtsd.m();
        dtqs dtqsVar53 = (dtqs) m53;
        dtqsVar53.e = 4;
        m53.d(true);
        dtqsVar53.a = "messages.original_rcs_message_id";
        m53.i(35030);
        dtqsVar53.d = new Supplier() { // from class: cmvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar53.c = new dtsc() { // from class: cmwc
        };
        m53.a();
        dtsb m54 = dtsd.m();
        dtqs dtqsVar54 = (dtqs) m54;
        dtqsVar54.e = 4;
        dtqsVar54.a = "messages.custom_delivery_receipt_mime_type";
        m54.i(37020);
        dtqsVar54.d = new Supplier() { // from class: cmwn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar54.c = new dtsc() { // from class: cmwy
        };
        m54.a();
        dtsb m55 = dtsd.m();
        dtqs dtqsVar55 = (dtqs) m55;
        dtqsVar55.e = 5;
        dtqsVar55.a = "messages.custom_delivery_receipt_content";
        m55.i(37020);
        dtqsVar55.d = new Supplier() { // from class: cmxb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar55.c = new dtsc() { // from class: cmxc
        };
        m55.a();
        dtsb m56 = dtsd.m();
        dtqs dtqsVar56 = (dtqs) m56;
        dtqsVar56.e = 1;
        dtqsVar56.a = "messages.report_attempt_acounter";
        m56.i(37030);
        dtqsVar56.d = new Supplier() { // from class: cmxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar56.c = new dtsc() { // from class: cmxe
        };
        m56.a();
        dtsb m57 = dtsd.m();
        dtqs dtqsVar57 = (dtqs) m57;
        dtqsVar57.e = 5;
        dtqsVar57.a = "messages.custom_headers";
        m57.i(45020);
        dtqsVar57.d = new Supplier() { // from class: cmxg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar57.c = new dtsc() { // from class: cmxh
        };
        m57.a();
        dtsb m58 = dtsd.m();
        dtqs dtqsVar58 = (dtqs) m58;
        dtqsVar58.e = 4;
        m58.l(true);
        m58.d(true);
        dtqsVar58.a = "messages.cms_correlation_id";
        m58.f(true);
        m58.i(46010);
        dtqsVar58.d = new Supplier() { // from class: cmxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar58.c = new dtsc() { // from class: cmxk
        };
        m58.a();
        dtsb m59 = dtsd.m();
        dtqs dtqsVar59 = (dtqs) m59;
        dtqsVar59.e = 1;
        m59.d(true);
        m59.e(true);
        dtqsVar59.b = new Supplier() { // from class: cmxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar59.a = "messages.group_private_participant";
        m59.i(48030);
        dtqsVar59.d = new Supplier() { // from class: cmxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar59.c = new dtsc() { // from class: cmxn
        };
        m59.a();
        dtsb m60 = dtsd.m();
        dtqs dtqsVar60 = (dtqs) m60;
        dtqsVar60.e = 1;
        m60.d(true);
        m60.e(true);
        dtqsVar60.b = new Supplier() { // from class: cmxo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar60.a = "messages.original_message_id";
        m60.i(48030);
        dtqsVar60.d = new Supplier() { // from class: cmxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar60.c = new dtsc() { // from class: cmxr
        };
        m60.a();
        dtsb m61 = dtsd.m();
        dtqs dtqsVar61 = (dtqs) m61;
        dtqsVar61.e = 1;
        dtqsVar61.a = "messages.awaiting_reverse_sync";
        m61.i(49060);
        dtqsVar61.d = new Supplier() { // from class: cmxs
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar61.c = new dtsc() { // from class: cmxt
        };
        m61.a();
        dtsb m62 = dtsd.m();
        dtqs dtqsVar62 = (dtqs) m62;
        dtqsVar62.e = 4;
        dtqsVar62.a = "messages.old_sms_message_uri";
        m62.i(49060);
        dtqsVar62.d = new Supplier() { // from class: cmxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar62.c = new dtsc() { // from class: cmxw
        };
        m62.a();
        dtsb m63 = dtsd.m();
        dtqs dtqsVar63 = (dtqs) m63;
        dtqsVar63.e = 4;
        m63.l(true);
        m63.d(true);
        dtqsVar63.a = "messages.draft_id";
        m63.f(true);
        m63.i(56000);
        dtqsVar63.d = new Supplier() { // from class: cmxx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar63.c = new dtsc() { // from class: cmxy
        };
        m63.a();
        dtsb m64 = dtsd.m();
        dtqs dtqsVar64 = (dtqs) m64;
        dtqsVar64.e = 1;
        dtqsVar64.a = "messages.result_code";
        m64.i(58040);
        dtqsVar64.d = new Supplier() { // from class: cmxz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar64.c = new dtsc() { // from class: cmya
        };
        m64.a();
        dtsb m65 = dtsd.m();
        dtqs dtqsVar65 = (dtqs) m65;
        dtqsVar65.e = 1;
        dtqsVar65.a = "messages.cms_life_cycle";
        m65.i(58210);
        dtqsVar65.d = new Supplier() { // from class: cmyc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar65.c = new dtsc() { // from class: cmyd
        };
        m65.a();
        dtsb m66 = dtsd.m();
        dtqs dtqsVar66 = (dtqs) m66;
        dtqsVar66.e = 1;
        dtqsVar66.a = "messages.mute_priority";
        m66.i(60750);
        dtqsVar66.d = new Supplier() { // from class: cmye
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar66.c = new dtsc() { // from class: cmyf
        };
        m66.a();
        dtsb m67 = dtsd.m();
        dtqs dtqsVar67 = (dtqs) m67;
        dtqsVar67.e = 1;
        dtqsVar67.a = "messages.fallback_reason";
        m67.i(58710);
        dtqsVar67.d = new Supplier() { // from class: cmyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar67.c = new dtsc() { // from class: cmyi
        };
        m67.a();
        dtsb m68 = dtsd.m();
        dtqs dtqsVar68 = (dtqs) m68;
        dtqsVar68.e = 1;
        dtqsVar68.a = "messages.auto_retry_counter";
        m68.i(58230);
        dtqsVar68.d = new Supplier() { // from class: cmyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar68.c = new dtsc() { // from class: cmyk
        };
        m68.a();
        dtsb m69 = dtsd.m();
        dtqs dtqsVar69 = (dtqs) m69;
        dtqsVar69.e = 2;
        dtqsVar69.a = "messages.can_revoke_before_delivered_with_rcs";
        m69.i(58280);
        dtqsVar69.d = new Supplier() { // from class: cmyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar69.c = new dtsc() { // from class: cmyn
        };
        m69.a();
        dtsb m70 = dtsd.m();
        dtqs dtqsVar70 = (dtqs) m70;
        dtqsVar70.e = 5;
        dtqsVar70.a = "messages.trace_id";
        m70.i(58680);
        dtqsVar70.d = new Supplier() { // from class: cmyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar70.c = new dtsc() { // from class: cmyp
        };
        m70.a();
        dtsb m71 = dtsd.m();
        dtqs dtqsVar71 = (dtqs) m71;
        dtqsVar71.e = 1;
        dtqsVar71.a = "messages.outgoing_delivery_report_status";
        m71.i(58720);
        dtqsVar71.d = new Supplier() { // from class: cmyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar71.c = new dtsc() { // from class: cmyr
        };
        m71.a();
        dtsb m72 = dtsd.m();
        dtqs dtqsVar72 = (dtqs) m72;
        dtqsVar72.e = 1;
        dtqsVar72.a = "messages.outgoing_read_report_status";
        m72.i(58720);
        dtqsVar72.d = new Supplier() { // from class: cmyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar72.c = new dtsc() { // from class: cmyu
        };
        m72.a();
        dtsb m73 = dtsd.m();
        dtqs dtqsVar73 = (dtqs) m73;
        dtqsVar73.e = 1;
        dtqsVar73.a = "messages.xms_transport";
        m73.i(59310);
        dtqsVar73.d = new Supplier() { // from class: cmyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar73.c = new dtsc() { // from class: cmyw
        };
        m73.a();
        dtsb m74 = dtsd.m();
        dtqs dtqsVar74 = (dtqs) m74;
        dtqsVar74.e = 1;
        dtqsVar74.a = "messages.message_original_protocol";
        m74.i(59430);
        dtqsVar74.d = new Supplier() { // from class: cmyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar74.c = new dtsc() { // from class: cmyz
        };
        m74.a();
        dtsb m75 = dtsd.m();
        dtqs dtqsVar75 = (dtqs) m75;
        dtqsVar75.e = 4;
        m75.l(true);
        m75.d(true);
        dtqsVar75.a = "messages.satellite_datagram_id";
        m75.f(true);
        m75.i(59490);
        dtqsVar75.d = new Supplier() { // from class: cmza
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar75.c = new dtsc() { // from class: cmzb
        };
        m75.a();
        dtsb m76 = dtsd.m();
        dtqs dtqsVar76 = (dtqs) m76;
        dtqsVar76.e = 1;
        dtqsVar76.a = "messages.encryption_protocol";
        m76.i(60190);
        dtqsVar76.d = new Supplier() { // from class: cmzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar76.c = new dtsc() { // from class: cmzd
        };
        m76.a();
        dtsb m77 = dtsd.m();
        dtqs dtqsVar77 = (dtqs) m77;
        dtqsVar77.e = 4;
        m77.l(true);
        m77.d(true);
        dtqsVar77.a = "messages.message_persistence_id";
        m77.f(true);
        m77.i(60370);
        dtqsVar77.d = new Supplier() { // from class: cmzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cnaz.b();
            }
        };
        dtqsVar77.c = new dtsc() { // from class: cmzg
        };
        m77.a();
    }
}

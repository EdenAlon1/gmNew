package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buum {
    public final buun A;
    public final buun B;
    public final buun C;
    public final buun D;
    public final buun E;
    public final buun F;
    public final buun G;
    public final buun H;
    public final buun I;
    public final buun J;
    public final buun K;
    public final buun L;
    public final buun M;
    public final buun N;
    public final buun O;
    public final buun P;
    public final buun Q;
    public final buun R;
    public final buun S;
    public final buun T;
    public final buun U;
    public final buun V;
    public final buun W;
    public final buun X;
    public final buun Y;
    public final buun Z;
    public final buun a;
    public final buun aa;
    public final buun ab;
    public final buun ac;
    public final buun ad;
    public final buun ae;
    public final buun af;
    public final buun ag;
    public final buun ah;
    public final buun ai;
    public final buun aj;
    public final buun ak;
    public final buun al;
    public final buun am;
    public final buun an;
    public final buun ao;
    public final buun ap;
    final buun[] aq;
    public final buun b;
    public final buun c;
    public final buun d;
    public final buun e;
    public final buun f;
    public final buun g;
    public final buun h;
    public final buun i;
    public final buun j;
    public final buun k;
    public final buun l;
    public final buun m;
    public final buun n;
    public final buun o;
    public final buun p;
    public final buun q;
    public final buun r;
    public final buun s;
    public final buun t;
    public final buun u;
    public final buun v;
    public final buun w;
    public final buun x;
    public final buun y;
    public final buun z;

    public buum() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "messages._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bupa
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar.c = new dtsc() { // from class: busm
        };
        buun buunVar = new buun(m.a());
        this.a = buunVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: busy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar2.a = "messages.conversation_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: butk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: butw
        };
        buun buunVar2 = new buun(m2.a());
        this.b = buunVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: buui
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar3.a = "messages.sender_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bupj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bupv
        };
        buun buunVar3 = new buun(m3.a());
        this.c = buunVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "messages.sender_send_destination";
        m4.i(54040);
        dtqsVar4.d = new Supplier() { // from class: buqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: buqu
        };
        buun buunVar4 = new buun(m4.a());
        this.d = buunVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "messages.msisdn_receiving_rcs_message";
        m5.i(59340);
        dtqsVar5.d = new Supplier() { // from class: bupw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bure
        };
        buun buunVar5 = new buun(m5.a());
        this.e = buunVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "messages.receiving_network_country";
        m6.i(54040);
        dtqsVar6.d = new Supplier() { // from class: burq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: busc
        };
        buun buunVar6 = new buun(m6.a());
        this.f = buunVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 1;
        m7.d(true);
        dtqsVar7.a = "messages.sent_timestamp";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: busf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: busg
        };
        buun buunVar7 = new buun(m7.a());
        this.g = buunVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        dtqsVar8.a = "messages.queue_insert_timestamp";
        m8.i(17030);
        dtqsVar8.d = new Supplier() { // from class: bush
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: busj
        };
        buun buunVar8 = new buun(m8.a());
        this.h = buunVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        m9.d(true);
        dtqsVar9.a = "messages.received_timestamp";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: busk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: busl
        };
        buun buunVar9 = new buun(m9.a());
        this.i = buunVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        dtqsVar10.a = "messages.message_protocol";
        m10.i(-1);
        dtqsVar10.d = new Supplier() { // from class: busn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: buso
        };
        buun buunVar10 = new buun(m10.a());
        this.j = buunVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 1;
        m11.d(true);
        dtqsVar11.a = "messages.message_status";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: busp
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: busq
        };
        buun buunVar11 = new buun(m11.a());
        this.k = buunVar11;
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 1;
        dtqsVar12.a = "messages.message_report_status";
        m12.i(13020);
        dtqsVar12.d = new Supplier() { // from class: busr
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: buss
        };
        buun buunVar12 = new buun(m12.a());
        this.l = buunVar12;
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 1;
        m13.d(true);
        dtqsVar13.a = "messages.seen";
        m13.f(true);
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: busu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: busv
        };
        buun buunVar13 = new buun(m13.a());
        this.m = buunVar13;
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 1;
        m14.d(true);
        dtqsVar14.a = "messages.read";
        m14.i(-1);
        dtqsVar14.d = new Supplier() { // from class: busw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: busx
        };
        buun buunVar14 = new buun(m14.a());
        this.n = buunVar14;
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 4;
        m15.d(true);
        dtqsVar15.a = "messages.sms_message_uri";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: busz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: buta
        };
        buun buunVar15 = new buun(m15.a());
        this.o = buunVar15;
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 1;
        dtqsVar16.a = "messages.sms_priority";
        m16.i(-1);
        dtqsVar16.d = new Supplier() { // from class: butb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: butc
        };
        buun buunVar16 = new buun(m16.a());
        this.p = buunVar16;
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        dtqsVar17.a = "messages.sms_message_size";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: butd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: butf
        };
        buun buunVar17 = new buun(m17.a());
        this.q = buunVar17;
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 4;
        dtqsVar18.a = "messages.mms_subject";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: butg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: buth
        };
        buun buunVar18 = new buun(m18.a());
        this.r = buunVar18;
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 4;
        dtqsVar19.a = "messages.mms_transaction_id";
        m19.i(-1);
        dtqsVar19.d = new Supplier() { // from class: buti
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: butj
        };
        buun buunVar19 = new buun(m19.a());
        this.s = buunVar19;
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 4;
        dtqsVar20.a = "messages.mms_content_location";
        m20.i(-1);
        dtqsVar20.d = new Supplier() { // from class: butl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: butm
        };
        buun buunVar20 = new buun(m20.a());
        this.t = buunVar20;
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 1;
        dtqsVar21.a = "messages.mms_expiry";
        m21.i(-1);
        dtqsVar21.d = new Supplier() { // from class: butn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: buto
        };
        buun buunVar21 = new buun(m21.a());
        this.u = buunVar21;
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 1;
        m22.d(true);
        dtqsVar22.a = "messages.rcs_expiry";
        m22.i(59890);
        dtqsVar22.d = new Supplier() { // from class: butq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: butr
        };
        buun buunVar22 = new buun(m22.a());
        this.v = buunVar22;
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 4;
        dtqsVar23.a = "messages.mms_retrieve_text";
        m23.i(9030);
        dtqsVar23.d = new Supplier() { // from class: buts
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: butt
        };
        buun buunVar23 = new buun(m23.a());
        this.w = buunVar23;
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 1;
        dtqsVar24.a = "messages.raw_status";
        m24.i(-1);
        dtqsVar24.d = new Supplier() { // from class: butu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: butv
        };
        buun buunVar24 = new buun(m24.a());
        this.x = buunVar24;
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 1;
        m25.d(true);
        m25.e(true);
        dtqsVar25.b = new Supplier() { // from class: butx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar25.a = "messages.self_id";
        m25.i(-1);
        dtqsVar25.d = new Supplier() { // from class: buty
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: butz
        };
        buun buunVar25 = new buun(m25.a());
        this.y = buunVar25;
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 4;
        m26.d(true);
        m26.e(true);
        dtqsVar26.b = new Supplier() { // from class: buub
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar26.a = "messages.my_identity_foreign_key";
        m26.i(60160);
        dtqsVar26.d = new Supplier() { // from class: buuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: buud
        };
        buun buunVar26 = new buun(m26.a());
        this.z = buunVar26;
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 1;
        dtqsVar27.a = "messages.retry_start_timestamp";
        m27.i(-1);
        dtqsVar27.d = new Supplier() { // from class: buue
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: buuf
        };
        buun buunVar27 = new buun(m27.a());
        this.A = buunVar27;
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 4;
        m28.d(true);
        dtqsVar28.a = "messages.cloud_sync_id";
        m28.i(8500);
        dtqsVar28.d = new Supplier() { // from class: buug
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: buuh
        };
        buun buunVar28 = new buun(m28.a());
        this.B = buunVar28;
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 4;
        m29.d(true);
        dtqsVar29.a = "messages.rcs_message_id_with_text_type";
        m29.f(true);
        m29.i(41040);
        dtqsVar29.d = new Supplier() { // from class: buuj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: buuk
        };
        buun buunVar29 = new buun(m29.a());
        this.C = buunVar29;
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 1;
        dtqsVar30.a = "messages.etouffee_status";
        m30.i(29060);
        dtqsVar30.d = new Supplier() { // from class: bupb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: bupc
        };
        buun buunVar30 = new buun(m30.a());
        this.D = buunVar30;
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 1;
        dtqsVar31.a = "messages.verification_status";
        m31.i(29090);
        dtqsVar31.d = new Supplier() { // from class: bupd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: bupe
        };
        buun buunVar31 = new buun(m31.a());
        this.E = buunVar31;
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 1;
        dtqsVar32.a = "messages.rcs_ui_status";
        m32.i(39000);
        dtqsVar32.d = new Supplier() { // from class: bupf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: bupg
        };
        buun buunVar32 = new buun(m32.a());
        this.F = buunVar32;
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 1;
        m33.d(true);
        dtqsVar33.a = "messages.is_hidden";
        m33.i(30010);
        dtqsVar33.d = new Supplier() { // from class: buph
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: bupi
        };
        buun buunVar33 = new buun(m33.a());
        this.G = buunVar33;
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 7;
        dtqsVar34.a = "messages.rcs_remote_instance";
        m34.i(10002);
        dtqsVar34.d = new Supplier() { // from class: bupk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: bupm
        };
        buun buunVar34 = new buun(m34.a());
        this.H = buunVar34;
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 1;
        dtqsVar35.a = "messages.rcs_file_transfer_session_id";
        m35.i(10004);
        dtqsVar35.d = new Supplier() { // from class: bupn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: bupo
        };
        buun buunVar35 = new buun(m35.a());
        this.I = buunVar35;
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 1;
        dtqsVar36.a = "messages.sms_error_code";
        m36.i(9000);
        dtqsVar36.d = new Supplier() { // from class: bupp
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: bupq
        };
        buun buunVar36 = new buun(m36.a());
        this.J = buunVar36;
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 4;
        dtqsVar37.a = "messages.sms_error_desc_map_name";
        m37.i(9000);
        dtqsVar37.d = new Supplier() { // from class: bupr
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: bups
        };
        buun buunVar37 = new buun(m37.a());
        this.K = buunVar37;
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 4;
        dtqsVar38.a = "messages.correlation_id";
        m38.i(9010);
        dtqsVar38.d = new Supplier() { // from class: bupt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: bupu
        };
        buun buunVar38 = new buun(m38.a());
        this.L = buunVar38;
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 4;
        m39.l(true);
        m39.d(true);
        dtqsVar39.a = "messages.cms_id";
        m39.f(true);
        m39.i(31010);
        dtqsVar39.d = new Supplier() { // from class: bupx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: bupy
        };
        buun buunVar39 = new buun(m39.a());
        this.M = buunVar39;
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 2;
        dtqsVar40.a = "messages.cms_last_mod_seq";
        m40.i(37040);
        dtqsVar40.d = new Supplier() { // from class: bupz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: buqa
        };
        buun buunVar40 = new buun(m40.a());
        this.N = buunVar40;
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 4;
        m41.d(true);
        dtqsVar41.a = "messages.web_id";
        m41.i(19020);
        dtqsVar41.d = new Supplier() { // from class: buqb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: buqc
        };
        buun buunVar41 = new buun(m41.a());
        this.O = buunVar41;
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 1;
        dtqsVar42.a = "messages.usage_stats_logging_id";
        m42.i(29100);
        dtqsVar42.d = new Supplier() { // from class: buqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: buqe
        };
        buun buunVar42 = new buun(m42.a());
        this.P = buunVar42;
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 1;
        dtqsVar43.a = "messages.send_counter";
        m43.i(35030);
        dtqsVar43.d = new Supplier() { // from class: buqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: buqg
        };
        buun buunVar43 = new buun(m43.a());
        this.Q = buunVar43;
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 4;
        m44.d(true);
        dtqsVar44.a = "messages.original_rcs_message_id";
        m44.i(35030);
        dtqsVar44.d = new Supplier() { // from class: buqj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: buqk
        };
        buun buunVar44 = new buun(m44.a());
        this.R = buunVar44;
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 4;
        dtqsVar45.a = "messages.custom_delivery_receipt_mime_type";
        m45.i(37020);
        dtqsVar45.d = new Supplier() { // from class: buql
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: buqm
        };
        buun buunVar45 = new buun(m45.a());
        this.S = buunVar45;
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 5;
        dtqsVar46.a = "messages.custom_delivery_receipt_content";
        m46.i(37020);
        dtqsVar46.d = new Supplier() { // from class: buqn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: buqo
        };
        buun buunVar46 = new buun(m46.a());
        this.T = buunVar46;
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 1;
        dtqsVar47.a = "messages.report_attempt_acounter";
        m47.i(37030);
        dtqsVar47.d = new Supplier() { // from class: buqp
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: buqq
        };
        buun buunVar47 = new buun(m47.a());
        this.U = buunVar47;
        dtsb m48 = dtsd.m();
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.e = 5;
        dtqsVar48.a = "messages.custom_headers";
        m48.i(45020);
        dtqsVar48.d = new Supplier() { // from class: buqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: buqt
        };
        buun buunVar48 = new buun(m48.a());
        this.V = buunVar48;
        dtsb m49 = dtsd.m();
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.e = 4;
        m49.l(true);
        m49.d(true);
        dtqsVar49.a = "messages.cms_correlation_id";
        m49.f(true);
        m49.i(46010);
        dtqsVar49.d = new Supplier() { // from class: burb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: burm
        };
        buun buunVar49 = new buun(m49.a());
        this.W = buunVar49;
        dtsb m50 = dtsd.m();
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.e = 1;
        m50.d(true);
        m50.e(true);
        dtqsVar50.b = new Supplier() { // from class: burx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar50.a = "messages.group_private_participant";
        m50.i(48030);
        dtqsVar50.d = new Supplier() { // from class: busi
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: bust
        };
        buun buunVar50 = new buun(m50.a());
        this.X = buunVar50;
        dtsb m51 = dtsd.m();
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.e = 1;
        m51.d(true);
        m51.e(true);
        dtqsVar51.b = new Supplier() { // from class: bute
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar51.a = "messages.original_message_id";
        m51.i(48030);
        dtqsVar51.d = new Supplier() { // from class: butp
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: buua
        };
        buun buunVar51 = new buun(m51.a());
        this.Y = buunVar51;
        dtsb m52 = dtsd.m();
        dtqs dtqsVar52 = (dtqs) m52;
        dtqsVar52.e = 1;
        dtqsVar52.a = "messages.awaiting_reverse_sync";
        m52.i(49060);
        dtqsVar52.d = new Supplier() { // from class: buul
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar52.c = new dtsc() { // from class: bupl
        };
        buun buunVar52 = new buun(m52.a());
        this.Z = buunVar52;
        dtsb m53 = dtsd.m();
        dtqs dtqsVar53 = (dtqs) m53;
        dtqsVar53.e = 4;
        dtqsVar53.a = "messages.old_sms_message_uri";
        m53.i(49060);
        dtqsVar53.d = new Supplier() { // from class: buqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar53.c = new dtsc() { // from class: buqs
        };
        buun buunVar53 = new buun(m53.a());
        this.aa = buunVar53;
        dtsb m54 = dtsd.m();
        dtqs dtqsVar54 = (dtqs) m54;
        dtqsVar54.e = 4;
        m54.l(true);
        m54.d(true);
        dtqsVar54.a = "messages.draft_id";
        m54.f(true);
        m54.i(56000);
        dtqsVar54.d = new Supplier() { // from class: buqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar54.c = new dtsc() { // from class: buqw
        };
        buun buunVar54 = new buun(m54.a());
        this.ab = buunVar54;
        dtsb m55 = dtsd.m();
        dtqs dtqsVar55 = (dtqs) m55;
        dtqsVar55.e = 1;
        dtqsVar55.a = "messages.result_code";
        m55.i(58040);
        dtqsVar55.d = new Supplier() { // from class: buqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar55.c = new dtsc() { // from class: buqy
        };
        buun buunVar55 = new buun(m55.a());
        this.ac = buunVar55;
        dtsb m56 = dtsd.m();
        dtqs dtqsVar56 = (dtqs) m56;
        dtqsVar56.e = 1;
        dtqsVar56.a = "messages.cms_life_cycle";
        m56.i(58210);
        dtqsVar56.d = new Supplier() { // from class: buqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar56.c = new dtsc() { // from class: bura
        };
        buun buunVar56 = new buun(m56.a());
        this.ad = buunVar56;
        dtsb m57 = dtsd.m();
        dtqs dtqsVar57 = (dtqs) m57;
        dtqsVar57.e = 1;
        dtqsVar57.a = "messages.mute_priority";
        m57.i(60750);
        dtqsVar57.d = new Supplier() { // from class: burc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar57.c = new dtsc() { // from class: burd
        };
        buun buunVar57 = new buun(m57.a());
        this.ae = buunVar57;
        dtsb m58 = dtsd.m();
        dtqs dtqsVar58 = (dtqs) m58;
        dtqsVar58.e = 1;
        dtqsVar58.a = "messages.fallback_reason";
        m58.i(58710);
        dtqsVar58.d = new Supplier() { // from class: burf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar58.c = new dtsc() { // from class: burg
        };
        buun buunVar58 = new buun(m58.a());
        this.af = buunVar58;
        dtsb m59 = dtsd.m();
        dtqs dtqsVar59 = (dtqs) m59;
        dtqsVar59.e = 1;
        dtqsVar59.a = "messages.auto_retry_counter";
        m59.i(58230);
        dtqsVar59.d = new Supplier() { // from class: burh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar59.c = new dtsc() { // from class: buri
        };
        buun buunVar59 = new buun(m59.a());
        this.ag = buunVar59;
        dtsb m60 = dtsd.m();
        dtqs dtqsVar60 = (dtqs) m60;
        dtqsVar60.e = 2;
        dtqsVar60.a = "messages.can_revoke_before_delivered_with_rcs";
        m60.i(58280);
        dtqsVar60.d = new Supplier() { // from class: burj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar60.c = new dtsc() { // from class: burk
        };
        buun buunVar60 = new buun(m60.a());
        this.ah = buunVar60;
        dtsb m61 = dtsd.m();
        dtqs dtqsVar61 = (dtqs) m61;
        dtqsVar61.e = 5;
        dtqsVar61.a = "messages.trace_id";
        m61.i(58680);
        dtqsVar61.d = new Supplier() { // from class: burl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar61.c = new dtsc() { // from class: burn
        };
        buun buunVar61 = new buun(m61.a());
        this.ai = buunVar61;
        dtsb m62 = dtsd.m();
        dtqs dtqsVar62 = (dtqs) m62;
        dtqsVar62.e = 1;
        dtqsVar62.a = "messages.outgoing_delivery_report_status";
        m62.i(58720);
        dtqsVar62.d = new Supplier() { // from class: buro
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar62.c = new dtsc() { // from class: burp
        };
        buun buunVar62 = new buun(m62.a());
        this.aj = buunVar62;
        dtsb m63 = dtsd.m();
        dtqs dtqsVar63 = (dtqs) m63;
        dtqsVar63.e = 1;
        dtqsVar63.a = "messages.outgoing_read_report_status";
        m63.i(58720);
        dtqsVar63.d = new Supplier() { // from class: burr
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar63.c = new dtsc() { // from class: burs
        };
        buun buunVar63 = new buun(m63.a());
        this.ak = buunVar63;
        dtsb m64 = dtsd.m();
        dtqs dtqsVar64 = (dtqs) m64;
        dtqsVar64.e = 1;
        dtqsVar64.a = "messages.xms_transport";
        m64.i(59310);
        dtqsVar64.d = new Supplier() { // from class: burt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar64.c = new dtsc() { // from class: buru
        };
        buun buunVar64 = new buun(m64.a());
        this.al = buunVar64;
        dtsb m65 = dtsd.m();
        dtqs dtqsVar65 = (dtqs) m65;
        dtqsVar65.e = 1;
        dtqsVar65.a = "messages.message_original_protocol";
        m65.i(59430);
        dtqsVar65.d = new Supplier() { // from class: burv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar65.c = new dtsc() { // from class: burw
        };
        buun buunVar65 = new buun(m65.a());
        this.am = buunVar65;
        dtsb m66 = dtsd.m();
        dtqs dtqsVar66 = (dtqs) m66;
        dtqsVar66.e = 4;
        m66.l(true);
        m66.d(true);
        dtqsVar66.a = "messages.satellite_datagram_id";
        m66.f(true);
        m66.i(59490);
        dtqsVar66.d = new Supplier() { // from class: bury
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar66.c = new dtsc() { // from class: burz
        };
        buun buunVar66 = new buun(m66.a());
        this.an = buunVar66;
        dtsb m67 = dtsd.m();
        dtqs dtqsVar67 = (dtqs) m67;
        dtqsVar67.e = 1;
        dtqsVar67.a = "messages.encryption_protocol";
        m67.i(60190);
        dtqsVar67.d = new Supplier() { // from class: busa
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar67.c = new dtsc() { // from class: busb
        };
        buun buunVar67 = new buun(m67.a());
        this.ao = buunVar67;
        dtsb m68 = dtsd.m();
        dtqs dtqsVar68 = (dtqs) m68;
        dtqsVar68.e = 4;
        m68.l(true);
        m68.d(true);
        dtqsVar68.a = "messages.message_persistence_id";
        m68.f(true);
        m68.i(60370);
        dtqsVar68.d = new Supplier() { // from class: busd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dtqsVar68.c = new dtsc() { // from class: buse
        };
        buun buunVar68 = new buun(m68.a());
        this.ap = buunVar68;
        this.aq = new buun[]{buunVar, buunVar2, buunVar3, buunVar4, buunVar5, buunVar6, buunVar7, buunVar8, buunVar9, buunVar10, buunVar11, buunVar12, buunVar13, buunVar14, buunVar15, buunVar16, buunVar17, buunVar18, buunVar19, buunVar20, buunVar21, buunVar22, buunVar23, buunVar24, buunVar25, buunVar26, buunVar27, buunVar28, buunVar29, buunVar30, buunVar31, buunVar32, buunVar33, buunVar34, buunVar35, buunVar36, buunVar37, buunVar38, buunVar39, buunVar40, buunVar41, buunVar42, buunVar43, buunVar44, buunVar45, buunVar46, buunVar47, buunVar48, buunVar49, buunVar50, buunVar51, buunVar52, buunVar53, buunVar54, buunVar55, buunVar56, buunVar57, buunVar58, buunVar59, buunVar60, buunVar61, buunVar62, buunVar63, buunVar64, buunVar65, buunVar66, buunVar67, buunVar68};
    }
}

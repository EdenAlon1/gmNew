package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvtg {
    public final bvth A;
    public final bvth B;
    public final bvth C;
    public final bvth D;
    public final bvth E;
    public final bvth F;
    public final bvth G;
    public final bvth H;
    public final bvth I;
    public final bvth J;
    public final bvth K;
    public final bvth L;
    public final bvth M;
    public final bvth N;
    public final bvth O;
    public final bvth P;
    public final bvth Q;
    public final bvth R;
    public final bvth S;
    public final bvth T;
    final bvth[] U;
    public final bvth a;
    public final bvth b;
    public final bvth c;
    public final bvth d;
    public final bvth e;
    public final bvth f;
    public final bvth g;
    public final bvth h;
    public final bvth i;
    public final bvth j;
    public final bvth k;
    public final bvth l;
    public final bvth m;
    public final bvth n;
    public final bvth o;
    public final bvth p;
    public final bvth q;
    public final bvth r;
    public final bvth s;
    public final bvth t;
    public final bvth u;
    public final bvth v;
    public final bvth w;
    public final bvth x;
    public final bvth y;
    public final bvth z;

    public bvtg() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "participants._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bvpq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bvps
        };
        bvth bvthVar = new bvth(m.a());
        this.a = bvthVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "participants.my_identity_token";
        m2.i(59930);
        dtqsVar2.d = new Supplier() { // from class: bvqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bvqq
        };
        bvth bvthVar2 = new bvth(m2.a());
        this.b = bvthVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: bvrc
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar3.a = "participants.my_identity_token_foreign_key";
        m3.i(60160);
        dtqsVar3.d = new Supplier() { // from class: bvro
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bvsa
        };
        bvth bvthVar3 = new bvth(m3.a());
        this.c = bvthVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.d(true);
        dtqsVar4.a = "participants.sub_id";
        m4.f(true);
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bvsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bvsy
        };
        bvth bvthVar4 = new bvth(m4.a());
        this.d = bvthVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "participants.sim_slot_id";
        m5.i(2000);
        dtqsVar5.d = new Supplier() { // from class: bvte
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bvqb
        };
        bvth bvthVar5 = new bvth(m5.a());
        this.e = bvthVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        m6.d(true);
        dtqsVar6.a = "participants.normalized_destination";
        m6.f(true);
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bvqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bvqx
        };
        bvth bvthVar6 = new bvth(m6.a());
        this.f = bvthVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "participants.send_destination";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bvri
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bvrt
        };
        bvth bvthVar7 = new bvth(m7.a());
        this.g = bvthVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 4;
        dtqsVar8.a = "participants.display_destination";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bvse
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bvsp
        };
        bvth bvthVar8 = new bvth(m8.a());
        this.h = bvthVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        m9.l(true);
        m9.d(true);
        dtqsVar9.a = "participants.comparable_destination";
        m9.f(true);
        m9.i(54040);
        dtqsVar9.d = new Supplier() { // from class: bvta
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bvtf
        };
        bvth bvthVar9 = new bvth(m9.a());
        this.i = bvthVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 4;
        dtqsVar10.a = "participants.country_code";
        m10.i(54040);
        dtqsVar10.d = new Supplier() { // from class: bvpr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bvpt
        };
        bvth bvthVar10 = new bvth(m10.a());
        this.j = bvthVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 2;
        m11.l(true);
        m11.d(true);
        dtqsVar11.a = "participants.recipient_id";
        m11.f(true);
        m11.i(58090);
        dtqsVar11.d = new Supplier() { // from class: bvpu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bvpv
        };
        bvth bvthVar11 = new bvth(m11.a());
        this.k = bvthVar11;
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 4;
        dtqsVar12.a = "participants.recipient_canonical_address";
        m12.i(58090);
        dtqsVar12.d = new Supplier() { // from class: bvpw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bvpx
        };
        bvth bvthVar12 = new bvth(m12.a());
        this.l = bvthVar12;
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 4;
        dtqsVar13.a = "participants.full_name";
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: bvpy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bvpz
        };
        bvth bvthVar13 = new bvth(m13.a());
        this.m = bvthVar13;
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 4;
        dtqsVar14.a = "participants.first_name";
        m14.i(-1);
        dtqsVar14.d = new Supplier() { // from class: bvqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: bvqc
        };
        bvth bvthVar14 = new bvth(m14.a());
        this.n = bvthVar14;
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 4;
        dtqsVar15.a = "participants.profile_photo_uri";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: bvqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: bvqf
        };
        bvth bvthVar15 = new bvth(m15.a());
        this.o = bvthVar15;
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 4;
        dtqsVar16.a = "participants.contact_photo_uri";
        m16.i(59850);
        dtqsVar16.d = new Supplier() { // from class: bvqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: bvqh
        };
        bvth bvthVar16 = new bvth(m16.a());
        this.p = bvthVar16;
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        dtqsVar17.a = "participants.contact_id";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: bvqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: bvqj
        };
        bvth bvthVar17 = new bvth(m17.a());
        this.q = bvthVar17;
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 4;
        dtqsVar18.a = "participants.lookup_key";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: bvqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: bvql
        };
        bvth bvthVar18 = new bvth(m18.a());
        this.r = bvthVar18;
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 1;
        dtqsVar19.a = "participants.color_palette_index";
        m19.i(-1);
        dtqsVar19.d = new Supplier() { // from class: bvqn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: bvqo
        };
        bvth bvthVar19 = new bvth(m19.a());
        this.s = bvthVar19;
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 1;
        dtqsVar20.a = "participants.color_type";
        m20.i(1000);
        dtqsVar20.d = new Supplier() { // from class: bvqp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: bvqr
        };
        bvth bvthVar20 = new bvth(m20.a());
        this.t = bvthVar20;
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 1;
        dtqsVar21.a = "participants.extended_color";
        m21.i(10027);
        dtqsVar21.d = new Supplier() { // from class: bvqs
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: bvqt
        };
        bvth bvthVar21 = new bvth(m21.a());
        this.u = bvthVar21;
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 1;
        dtqsVar22.a = "participants.blocked";
        m22.i(-1);
        dtqsVar22.d = new Supplier() { // from class: bvqu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: bvqv
        };
        bvth bvthVar22 = new bvth(m22.a());
        this.v = bvthVar22;
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 4;
        dtqsVar23.a = "participants.subscription_name";
        m23.i(2000);
        dtqsVar23.d = new Supplier() { // from class: bvqw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: bvqy
        };
        bvth bvthVar23 = new bvth(m23.a());
        this.w = bvthVar23;
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 1;
        dtqsVar24.a = "participants.subscription_color";
        m24.i(2000);
        dtqsVar24.d = new Supplier() { // from class: bvqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: bvra
        };
        bvth bvthVar24 = new bvth(m24.a());
        this.x = bvthVar24;
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 4;
        dtqsVar25.a = "participants.contact_destination";
        m25.i(4000);
        dtqsVar25.d = new Supplier() { // from class: bvrb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: bvrd
        };
        bvth bvthVar25 = new bvth(m25.a());
        this.y = bvthVar25;
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 1;
        dtqsVar26.a = "participants.participant_type";
        m26.i(12001);
        dtqsVar26.d = new Supplier() { // from class: bvre
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: bvrf
        };
        bvth bvthVar26 = new bvth(m26.a());
        this.z = bvthVar26;
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 1;
        dtqsVar27.a = "participants.video_reachability";
        m27.i(13050);
        dtqsVar27.d = new Supplier() { // from class: bvrg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: bvrh
        };
        bvth bvthVar27 = new bvth(m27.a());
        this.A = bvthVar27;
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 4;
        dtqsVar28.a = "participants.alias";
        m28.i(20060);
        dtqsVar28.d = new Supplier() { // from class: bvrj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: bvrk
        };
        bvth bvthVar28 = new bvth(m28.a());
        this.B = bvthVar28;
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 1;
        dtqsVar29.a = "participants.is_spam";
        m29.i(24060);
        dtqsVar29.d = new Supplier() { // from class: bvrl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: bvrm
        };
        bvth bvthVar29 = new bvth(m29.a());
        this.C = bvthVar29;
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 1;
        dtqsVar30.a = "participants.is_spam_source";
        m30.i(30000);
        dtqsVar30.d = new Supplier() { // from class: bvrn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: bvrp
        };
        bvth bvthVar30 = new bvth(m30.a());
        this.D = bvthVar30;
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 4;
        m31.l(true);
        m31.d(true);
        dtqsVar31.a = "participants.cms_id";
        m31.f(true);
        m31.i(31020);
        dtqsVar31.d = new Supplier() { // from class: bvrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: bvrr
        };
        bvth bvthVar31 = new bvth(m31.a());
        this.E = bvthVar31;
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 1;
        dtqsVar32.a = "participants.latest_verification_status";
        m32.i(31030);
        dtqsVar32.d = new Supplier() { // from class: bvrs
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: bvru
        };
        bvth bvthVar32 = new bvth(m32.a());
        this.F = bvthVar32;
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 4;
        dtqsVar33.a = "participants.profile_photo_blob_id";
        m33.i(33000);
        dtqsVar33.d = new Supplier() { // from class: bvrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: bvrw
        };
        bvth bvthVar33 = new bvth(m33.a());
        this.G = bvthVar33;
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 5;
        dtqsVar34.a = "participants.profile_photo_encryption_key";
        m34.i(33060);
        dtqsVar34.d = new Supplier() { // from class: bvrx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: bvry
        };
        bvth bvthVar34 = new bvth(m34.a());
        this.H = bvthVar34;
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 1;
        dtqsVar35.a = "participants.directory_id";
        m35.i(35010);
        dtqsVar35.d = new Supplier() { // from class: bvrz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: bvsb
        };
        bvth bvthVar35 = new bvth(m35.a());
        this.I = bvthVar35;
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 1;
        dtqsVar36.a = "participants.is_check_constraint_enabled_via_phenotype";
        m36.i(55010);
        dtqsVar36.d = new Supplier() { // from class: bvsc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: bvsd
        };
        bvth bvthVar36 = new bvth(m36.a());
        this.J = bvthVar36;
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 1;
        dtqsVar37.a = "participants.is_valid_phone_number_data";
        m37.i(55010);
        dtqsVar37.d = new Supplier() { // from class: bvsf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: bvsg
        };
        bvth bvthVar37 = new bvth(m37.a());
        this.K = bvthVar37;
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 2;
        m38.d(true);
        m38.e(true);
        dtqsVar38.b = new Supplier() { // from class: bvsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar38.a = "participants.duplicate_of";
        m38.i(58090);
        dtqsVar38.d = new Supplier() { // from class: bvsi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: bvsj
        };
        bvth bvthVar38 = new bvth(m38.a());
        this.L = bvthVar38;
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 1;
        dtqsVar39.a = "participants.cms_life_cycle";
        m39.i(58210);
        dtqsVar39.d = new Supplier() { // from class: bvsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: bvsl
        };
        bvth bvthVar39 = new bvth(m39.a());
        this.M = bvthVar39;
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 1;
        dtqsVar40.a = "participants.norm_ui_status";
        m40.i(58620);
        dtqsVar40.d = new Supplier() { // from class: bvsn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: bvso
        };
        bvth bvthVar40 = new bvth(m40.a());
        this.N = bvthVar40;
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 4;
        dtqsVar41.a = "participants.last_modified_by_key";
        m41.i(59440);
        dtqsVar41.d = new Supplier() { // from class: bvsq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: bvsr
        };
        bvth bvthVar41 = new bvth(m41.a());
        this.O = bvthVar41;
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 1;
        dtqsVar42.a = "participants.name_source";
        m42.i(59550);
        dtqsVar42.d = new Supplier() { // from class: bvss
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: bvst
        };
        bvth bvthVar42 = new bvth(m42.a());
        this.P = bvthVar42;
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 1;
        dtqsVar43.a = "participants.photo_source";
        m43.i(59550);
        dtqsVar43.d = new Supplier() { // from class: bvsu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: bvsv
        };
        bvth bvthVar43 = new bvth(m43.a());
        this.Q = bvthVar43;
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 1;
        dtqsVar44.a = "participants.profile_photo_user_preference";
        m44.i(60060);
        dtqsVar44.d = new Supplier() { // from class: bvsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: bvsx
        };
        bvth bvthVar44 = new bvth(m44.a());
        this.R = bvthVar44;
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 5;
        dtqsVar45.a = "participants.contact_metadata";
        m45.i(60070);
        dtqsVar45.d = new Supplier() { // from class: bvsz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: bvtb
        };
        bvth bvthVar45 = new bvth(m45.a());
        this.S = bvthVar45;
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 1;
        m46.d(true);
        dtqsVar46.a = "participants.is_enterprise_contact";
        m46.i(60640);
        dtqsVar46.d = new Supplier() { // from class: bvtc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: bvtd
        };
        bvth bvthVar46 = new bvth(m46.a());
        this.T = bvthVar46;
        this.U = new bvth[]{bvthVar, bvthVar2, bvthVar3, bvthVar4, bvthVar5, bvthVar6, bvthVar7, bvthVar8, bvthVar9, bvthVar10, bvthVar11, bvthVar12, bvthVar13, bvthVar14, bvthVar15, bvthVar16, bvthVar17, bvthVar18, bvthVar19, bvthVar20, bvthVar21, bvthVar22, bvthVar23, bvthVar24, bvthVar25, bvthVar26, bvthVar27, bvthVar28, bvthVar29, bvthVar30, bvthVar31, bvthVar32, bvthVar33, bvthVar34, bvthVar35, bvthVar36, bvthVar37, bvthVar38, bvthVar39, bvthVar40, bvthVar41, bvthVar42, bvthVar43, bvthVar44, bvthVar45, bvthVar46};
    }
}

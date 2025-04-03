package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvmq {
    public final bvmr A;
    public final bvmr B;
    public final bvmr C;
    public final bvmr D;
    public final bvmr E;
    public final bvmr F;
    public final bvmr G;
    public final bvmr H;
    public final bvmr I;
    public final bvmr J;
    public final bvmr K;
    public final bvmr L;
    public final bvmr M;
    public final bvmr N;
    public final bvmr O;
    public final bvmr P;
    public final bvmr Q;
    public final bvmr R;
    public final bvmr S;
    public final bvmr T;
    public final bvmr U;
    public final bvmr V;
    public final bvmr W;
    final bvmr[] X;
    public final bvmr a;
    public final bvmr b;
    public final bvmr c;
    public final bvmr d;
    public final bvmr e;
    public final bvmr f;
    public final bvmr g;
    public final bvmr h;
    public final bvmr i;
    public final bvmr j;
    public final bvmr k;
    public final bvmr l;
    public final bvmr m;
    public final bvmr n;
    public final bvmr o;
    public final bvmr p;
    public final bvmr q;
    public final bvmr r;
    public final bvmr s;
    public final bvmr t;
    public final bvmr u;
    public final bvmr v;
    public final bvmr w;
    public final bvmr x;
    public final bvmr y;
    public final bvmr z;

    public bvmq() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "participants_audit_log._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bviv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bvix
        };
        bvmr bvmrVar = new bvmr(m.a());
        this.a = bvmrVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.k(true);
        dtqsVar2.a = "participants_audit_log.operation_datetime";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bvjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bvjv
        };
        bvmr bvmrVar2 = new bvmr(m2.a());
        this.b = bvmrVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        dtqsVar3.a = "participants_audit_log.operation_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bvkh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bvkt
        };
        bvmr bvmrVar3 = new bvmr(m3.a());
        this.c = bvmrVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.k(true);
        dtqsVar4.a = "participants_audit_log.participant_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bvlf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bvlr
        };
        bvmr bvmrVar4 = new bvmr(m4.a());
        this.d = bvmrVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "participants_audit_log.my_identity_token";
        m5.i(59930);
        dtqsVar5.d = new Supplier() { // from class: bvmd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bvmo
        };
        bvmr bvmrVar5 = new bvmr(m5.a());
        this.e = bvmrVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        m6.d(true);
        m6.e(true);
        dtqsVar6.b = new Supplier() { // from class: bvjg
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar6.a = "participants_audit_log.my_identity_token_foreign_key";
        m6.i(60160);
        dtqsVar6.d = new Supplier() { // from class: bvjr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bvkc
        };
        bvmr bvmrVar6 = new bvmr(m6.a());
        this.f = bvmrVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 1;
        dtqsVar7.a = "participants_audit_log.sub_id";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bvkn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bvky
        };
        bvmr bvmrVar7 = new bvmr(m7.a());
        this.g = bvmrVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        dtqsVar8.a = "participants_audit_log.sim_slot_id";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bvlj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bvlu
        };
        bvmr bvmrVar8 = new bvmr(m8.a());
        this.h = bvmrVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        dtqsVar9.a = "participants_audit_log.normalized_destination";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: bvmf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bvmp
        };
        bvmr bvmrVar9 = new bvmr(m9.a());
        this.i = bvmrVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 4;
        dtqsVar10.a = "participants_audit_log.send_destination";
        m10.i(-1);
        dtqsVar10.d = new Supplier() { // from class: bviw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bviy
        };
        bvmr bvmrVar10 = new bvmr(m10.a());
        this.j = bvmrVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 4;
        dtqsVar11.a = "participants_audit_log.display_destination";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: bviz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bvja
        };
        bvmr bvmrVar11 = new bvmr(m11.a());
        this.k = bvmrVar11;
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 4;
        dtqsVar12.a = "participants_audit_log.comparable_destination";
        m12.i(-1);
        dtqsVar12.d = new Supplier() { // from class: bvjb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bvjc
        };
        bvmr bvmrVar12 = new bvmr(m12.a());
        this.l = bvmrVar12;
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 4;
        dtqsVar13.a = "participants_audit_log.country_code";
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: bvjd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bvje
        };
        bvmr bvmrVar13 = new bvmr(m13.a());
        this.m = bvmrVar13;
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 2;
        dtqsVar14.a = "participants_audit_log.recipient_id";
        m14.i(-1);
        dtqsVar14.d = new Supplier() { // from class: bvjf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: bvjh
        };
        bvmr bvmrVar14 = new bvmr(m14.a());
        this.n = bvmrVar14;
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 4;
        dtqsVar15.a = "participants_audit_log.recipient_canonical_address";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: bvji
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: bvjk
        };
        bvmr bvmrVar15 = new bvmr(m15.a());
        this.o = bvmrVar15;
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 4;
        dtqsVar16.a = "participants_audit_log.full_name";
        m16.i(-1);
        dtqsVar16.d = new Supplier() { // from class: bvjl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: bvjm
        };
        bvmr bvmrVar16 = new bvmr(m16.a());
        this.p = bvmrVar16;
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 4;
        dtqsVar17.a = "participants_audit_log.first_name";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: bvjn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: bvjo
        };
        bvmr bvmrVar17 = new bvmr(m17.a());
        this.q = bvmrVar17;
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 4;
        dtqsVar18.a = "participants_audit_log.profile_photo_uri";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: bvjp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: bvjq
        };
        bvmr bvmrVar18 = new bvmr(m18.a());
        this.r = bvmrVar18;
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 4;
        dtqsVar19.a = "participants_audit_log.contact_photo_uri";
        m19.i(59850);
        dtqsVar19.d = new Supplier() { // from class: bvjs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: bvjt
        };
        bvmr bvmrVar19 = new bvmr(m19.a());
        this.s = bvmrVar19;
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 1;
        dtqsVar20.a = "participants_audit_log.contact_id";
        m20.i(-1);
        dtqsVar20.d = new Supplier() { // from class: bvju
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: bvjw
        };
        bvmr bvmrVar20 = new bvmr(m20.a());
        this.t = bvmrVar20;
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 4;
        dtqsVar21.a = "participants_audit_log.lookup_key";
        m21.i(-1);
        dtqsVar21.d = new Supplier() { // from class: bvjx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: bvjy
        };
        bvmr bvmrVar21 = new bvmr(m21.a());
        this.u = bvmrVar21;
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 1;
        dtqsVar22.a = "participants_audit_log.color_palette_index";
        m22.i(-1);
        dtqsVar22.d = new Supplier() { // from class: bvjz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: bvka
        };
        bvmr bvmrVar22 = new bvmr(m22.a());
        this.v = bvmrVar22;
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 1;
        dtqsVar23.a = "participants_audit_log.color_type";
        m23.i(-1);
        dtqsVar23.d = new Supplier() { // from class: bvkb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: bvkd
        };
        bvmr bvmrVar23 = new bvmr(m23.a());
        this.w = bvmrVar23;
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 1;
        dtqsVar24.a = "participants_audit_log.extended_color";
        m24.i(-1);
        dtqsVar24.d = new Supplier() { // from class: bvke
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: bvkf
        };
        bvmr bvmrVar24 = new bvmr(m24.a());
        this.x = bvmrVar24;
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 1;
        dtqsVar25.a = "participants_audit_log.blocked";
        m25.i(-1);
        dtqsVar25.d = new Supplier() { // from class: bvkg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: bvki
        };
        bvmr bvmrVar25 = new bvmr(m25.a());
        this.y = bvmrVar25;
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 4;
        dtqsVar26.a = "participants_audit_log.subscription_name";
        m26.i(-1);
        dtqsVar26.d = new Supplier() { // from class: bvkj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: bvkk
        };
        bvmr bvmrVar26 = new bvmr(m26.a());
        this.z = bvmrVar26;
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 1;
        dtqsVar27.a = "participants_audit_log.subscription_color";
        m27.i(-1);
        dtqsVar27.d = new Supplier() { // from class: bvkl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: bvkm
        };
        bvmr bvmrVar27 = new bvmr(m27.a());
        this.A = bvmrVar27;
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 4;
        dtqsVar28.a = "participants_audit_log.contact_destination";
        m28.i(-1);
        dtqsVar28.d = new Supplier() { // from class: bvko
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: bvkp
        };
        bvmr bvmrVar28 = new bvmr(m28.a());
        this.B = bvmrVar28;
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 1;
        dtqsVar29.a = "participants_audit_log.participant_type";
        m29.i(-1);
        dtqsVar29.d = new Supplier() { // from class: bvkq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: bvkr
        };
        bvmr bvmrVar29 = new bvmr(m29.a());
        this.C = bvmrVar29;
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 1;
        dtqsVar30.a = "participants_audit_log.video_reachability";
        m30.i(-1);
        dtqsVar30.d = new Supplier() { // from class: bvks
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: bvku
        };
        bvmr bvmrVar30 = new bvmr(m30.a());
        this.D = bvmrVar30;
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 4;
        dtqsVar31.a = "participants_audit_log.alias";
        m31.i(-1);
        dtqsVar31.d = new Supplier() { // from class: bvkv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: bvkw
        };
        bvmr bvmrVar31 = new bvmr(m31.a());
        this.E = bvmrVar31;
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 1;
        dtqsVar32.a = "participants_audit_log.is_spam";
        m32.i(-1);
        dtqsVar32.d = new Supplier() { // from class: bvkx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: bvkz
        };
        bvmr bvmrVar32 = new bvmr(m32.a());
        this.F = bvmrVar32;
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 1;
        dtqsVar33.a = "participants_audit_log.is_spam_source";
        m33.i(-1);
        dtqsVar33.d = new Supplier() { // from class: bvla
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: bvlb
        };
        bvmr bvmrVar33 = new bvmr(m33.a());
        this.G = bvmrVar33;
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 4;
        dtqsVar34.a = "participants_audit_log.cms_id";
        m34.i(-1);
        dtqsVar34.d = new Supplier() { // from class: bvlc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: bvld
        };
        bvmr bvmrVar34 = new bvmr(m34.a());
        this.H = bvmrVar34;
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 1;
        dtqsVar35.a = "participants_audit_log.latest_verification_status";
        m35.i(-1);
        dtqsVar35.d = new Supplier() { // from class: bvle
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: bvlg
        };
        bvmr bvmrVar35 = new bvmr(m35.a());
        this.I = bvmrVar35;
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 4;
        dtqsVar36.a = "participants_audit_log.profile_photo_blob_id";
        m36.i(-1);
        dtqsVar36.d = new Supplier() { // from class: bvlh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: bvli
        };
        bvmr bvmrVar36 = new bvmr(m36.a());
        this.J = bvmrVar36;
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 5;
        dtqsVar37.a = "participants_audit_log.profile_photo_encryption_key";
        m37.i(-1);
        dtqsVar37.d = new Supplier() { // from class: bvlk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: bvll
        };
        bvmr bvmrVar37 = new bvmr(m37.a());
        this.K = bvmrVar37;
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 1;
        dtqsVar38.a = "participants_audit_log.directory_id";
        m38.i(-1);
        dtqsVar38.d = new Supplier() { // from class: bvlm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: bvln
        };
        bvmr bvmrVar38 = new bvmr(m38.a());
        this.L = bvmrVar38;
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 1;
        dtqsVar39.a = "participants_audit_log.is_check_constraint_enabled_via_phenotype";
        m39.i(-1);
        dtqsVar39.d = new Supplier() { // from class: bvlo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: bvlp
        };
        bvmr bvmrVar39 = new bvmr(m39.a());
        this.M = bvmrVar39;
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 1;
        dtqsVar40.a = "participants_audit_log.is_valid_phone_number_data";
        m40.i(-1);
        dtqsVar40.d = new Supplier() { // from class: bvlq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: bvls
        };
        bvmr bvmrVar40 = new bvmr(m40.a());
        this.N = bvmrVar40;
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 2;
        dtqsVar41.a = "participants_audit_log.duplicate_of";
        m41.i(-1);
        dtqsVar41.d = new Supplier() { // from class: bvlt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: bvlv
        };
        bvmr bvmrVar41 = new bvmr(m41.a());
        this.O = bvmrVar41;
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 1;
        dtqsVar42.a = "participants_audit_log.cms_life_cycle";
        m42.i(-1);
        dtqsVar42.d = new Supplier() { // from class: bvlw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: bvlx
        };
        bvmr bvmrVar42 = new bvmr(m42.a());
        this.P = bvmrVar42;
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 1;
        dtqsVar43.a = "participants_audit_log.norm_ui_status";
        m43.i(-1);
        dtqsVar43.d = new Supplier() { // from class: bvly
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: bvlz
        };
        bvmr bvmrVar43 = new bvmr(m43.a());
        this.Q = bvmrVar43;
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 4;
        dtqsVar44.a = "participants_audit_log.last_modified_by_key";
        m44.i(59440);
        dtqsVar44.d = new Supplier() { // from class: bvma
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: bvmb
        };
        bvmr bvmrVar44 = new bvmr(m44.a());
        this.R = bvmrVar44;
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 1;
        dtqsVar45.a = "participants_audit_log.name_source";
        m45.i(59550);
        dtqsVar45.d = new Supplier() { // from class: bvmc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: bvme
        };
        bvmr bvmrVar45 = new bvmr(m45.a());
        this.S = bvmrVar45;
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 1;
        dtqsVar46.a = "participants_audit_log.photo_source";
        m46.i(59550);
        dtqsVar46.d = new Supplier() { // from class: bvmg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: bvmh
        };
        bvmr bvmrVar46 = new bvmr(m46.a());
        this.T = bvmrVar46;
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 1;
        dtqsVar47.a = "participants_audit_log.profile_photo_user_preference";
        m47.i(60060);
        dtqsVar47.d = new Supplier() { // from class: bvmi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: bvmj
        };
        bvmr bvmrVar47 = new bvmr(m47.a());
        this.U = bvmrVar47;
        dtsb m48 = dtsd.m();
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.e = 5;
        dtqsVar48.a = "participants_audit_log.contact_metadata";
        m48.i(60070);
        dtqsVar48.d = new Supplier() { // from class: bvmk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: bvml
        };
        bvmr bvmrVar48 = new bvmr(m48.a());
        this.V = bvmrVar48;
        dtsb m49 = dtsd.m();
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.e = 1;
        dtqsVar49.a = "participants_audit_log.is_enterprise_contact";
        m49.i(60640);
        dtqsVar49.d = new Supplier() { // from class: bvmm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvoy.b();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: bvmn
        };
        bvmr bvmrVar49 = new bvmr(m49.a());
        this.W = bvmrVar49;
        this.X = new bvmr[]{bvmrVar, bvmrVar2, bvmrVar3, bvmrVar4, bvmrVar5, bvmrVar6, bvmrVar7, bvmrVar8, bvmrVar9, bvmrVar10, bvmrVar11, bvmrVar12, bvmrVar13, bvmrVar14, bvmrVar15, bvmrVar16, bvmrVar17, bvmrVar18, bvmrVar19, bvmrVar20, bvmrVar21, bvmrVar22, bvmrVar23, bvmrVar24, bvmrVar25, bvmrVar26, bvmrVar27, bvmrVar28, bvmrVar29, bvmrVar30, bvmrVar31, bvmrVar32, bvmrVar33, bvmrVar34, bvmrVar35, bvmrVar36, bvmrVar37, bvmrVar38, bvmrVar39, bvmrVar40, bvmrVar41, bvmrVar42, bvmrVar43, bvmrVar44, bvmrVar45, bvmrVar46, bvmrVar47, bvmrVar48, bvmrVar49};
    }
}

package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcib {
    public final bcic a;
    public final bcic b;
    public final bcic c;
    public final bcic d;
    public final bcic e;
    public final bcic f;
    public final bcic g;
    public final bcic h;
    public final bcic i;
    public final bcic j;
    public final bcic k;
    public final bcic l;
    public final bcic m;
    public final bcic n;
    public final bcic o;
    public final bcic p;
    public final bcic q;
    public final bcic r;
    final bcic[] s;

    public bcib() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "participants_backup._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bcgq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bcgs
        };
        bcic bcicVar = new bcic(m.a());
        this.a = bcicVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bche
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcgh.b.a;
            }
        };
        dtqsVar2.a = "participants_backup.my_identity_token_foreign_key";
        m2.i(110);
        dtqsVar2.d = new Supplier() { // from class: bchn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bcho
        };
        bcic bcicVar2 = new bcic(m2.a());
        this.b = bcicVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.d(true);
        dtqsVar3.a = "participants_backup.normalized_destination";
        m3.i(0);
        dtqsVar3.d = new Supplier() { // from class: bchp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bchq
        };
        bcic bcicVar3 = new bcic(m3.a());
        this.c = bcicVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "participants_backup.send_destination";
        m4.i(0);
        dtqsVar4.d = new Supplier() { // from class: bchr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bchs
        };
        bcic bcicVar4 = new bcic(m4.a());
        this.d = bcicVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "participants_backup.display_destination";
        m5.i(0);
        dtqsVar5.d = new Supplier() { // from class: bcht
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bchb
        };
        bcic bcicVar5 = new bcic(m5.a());
        this.e = bcicVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "participants_backup.first_name";
        m6.i(0);
        dtqsVar6.d = new Supplier() { // from class: bchm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bchu
        };
        bcic bcicVar6 = new bcic(m6.a());
        this.f = bcicVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "participants_backup.full_name";
        m7.i(0);
        dtqsVar7.d = new Supplier() { // from class: bchv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bchw
        };
        bcic bcicVar7 = new bcic(m7.a());
        this.g = bcicVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        dtqsVar8.a = "participants_backup.is_self";
        m8.i(0);
        dtqsVar8.d = new Supplier() { // from class: bchx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bchy
        };
        bcic bcicVar8 = new bcic(m8.a());
        this.h = bcicVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        dtqsVar9.a = "participants_backup.blocked";
        m9.i(0);
        dtqsVar9.d = new Supplier() { // from class: bchz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bcia
        };
        bcic bcicVar9 = new bcic(m9.a());
        this.i = bcicVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        dtqsVar10.a = "participants_backup.participant_type";
        m10.i(0);
        dtqsVar10.d = new Supplier() { // from class: bcgr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bcgt
        };
        bcic bcicVar10 = new bcic(m10.a());
        this.j = bcicVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 1;
        dtqsVar11.a = "participants_backup.is_spam";
        m11.i(0);
        dtqsVar11.d = new Supplier() { // from class: bcgu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bcgv
        };
        bcic bcicVar11 = new bcic(m11.a());
        this.k = bcicVar11;
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 1;
        dtqsVar12.a = "participants_backup.is_spam_source";
        m12.i(0);
        dtqsVar12.d = new Supplier() { // from class: bcgw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bcgx
        };
        bcic bcicVar12 = new bcic(m12.a());
        this.l = bcicVar12;
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 4;
        dtqsVar13.a = "participants_backup.country_code";
        m13.i(0);
        dtqsVar13.d = new Supplier() { // from class: bcgy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bcgz
        };
        bcic bcicVar13 = new bcic(m13.a());
        this.m = bcicVar13;
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 1;
        dtqsVar14.a = "participants_backup.color_palette_index";
        m14.i(0);
        dtqsVar14.d = new Supplier() { // from class: bcha
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: bchc
        };
        bcic bcicVar14 = new bcic(m14.a());
        this.n = bcicVar14;
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 1;
        dtqsVar15.a = "participants_backup.color_type";
        m15.i(0);
        dtqsVar15.d = new Supplier() { // from class: bchd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: bchf
        };
        bcic bcicVar15 = new bcic(m15.a());
        this.o = bcicVar15;
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 1;
        dtqsVar16.a = "participants_backup.extended_color";
        m16.i(0);
        dtqsVar16.d = new Supplier() { // from class: bchg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: bchh
        };
        bcic bcicVar16 = new bcic(m16.a());
        this.p = bcicVar16;
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 4;
        m17.d(true);
        dtqsVar17.a = "participants_backup.cms_id";
        m17.i(0);
        dtqsVar17.d = new Supplier() { // from class: bchi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: bchj
        };
        bcic bcicVar17 = new bcic(m17.a());
        this.q = bcicVar17;
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 1;
        dtqsVar18.a = "participants_backup.cms_life_cycle";
        m18.i(0);
        dtqsVar18.d = new Supplier() { // from class: bchk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.b();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: bchl
        };
        bcic bcicVar18 = new bcic(m18.a());
        this.r = bcicVar18;
        this.s = new bcic[]{bcicVar, bcicVar2, bcicVar3, bcicVar4, bcicVar5, bcicVar6, bcicVar7, bcicVar8, bcicVar9, bcicVar10, bcicVar11, bcicVar12, bcicVar13, bcicVar14, bcicVar15, bcicVar16, bcicVar17, bcicVar18};
    }
}

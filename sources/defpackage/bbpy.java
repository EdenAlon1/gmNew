package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbpy {
    public final bbpz a;
    public final bbpz b;
    public final bbpz c;
    public final bbpz d;
    public final bbpz e;
    public final bbpz f;
    public final bbpz g;
    public final bbpz h;
    public final bbpz i;
    final bbpz[] j;

    public bbpy() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "link_preview_backup._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bbpf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbqu.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bbpg
        };
        bbpz bbpzVar = new bbpz(m.a());
        this.a = bbpzVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bbph
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcba.c.a;
            }
        };
        dtqsVar2.a = "link_preview_backup.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bbpi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbqu.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bbpj
        };
        bbpz bbpzVar2 = new bbpz(m2.a());
        this.b = bbpzVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.k(true);
        dtqsVar3.a = "link_preview_backup.trigger_url";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bbpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbqu.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bbpl
        };
        bbpz bbpzVar3 = new bbpz(m3.a());
        this.c = bbpzVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "link_preview_backup.expiration_time_millis";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bbpm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbqu.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bbpn
        };
        bbpz bbpzVar4 = new bbpz(m4.a());
        this.d = bbpzVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "link_preview_backup.link_title";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bbpo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbqu.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bbpp
        };
        bbpz bbpzVar5 = new bbpz(m5.a());
        this.e = bbpzVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "link_preview_backup.link_description";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bbpq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbqu.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bbpr
        };
        bbpz bbpzVar6 = new bbpz(m6.a());
        this.f = bbpzVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "link_preview_backup.link_image_url";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bbps
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbqu.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bbpt
        };
        bbpz bbpzVar7 = new bbpz(m7.a());
        this.g = bbpzVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 4;
        dtqsVar8.a = "link_preview_backup.link_domain";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bbpu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbqu.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bbpv
        };
        bbpz bbpzVar8 = new bbpz(m8.a());
        this.h = bbpzVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        dtqsVar9.a = "link_preview_backup.link_canonical_url";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: bbpw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbqu.a();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bbpx
        };
        bbpz bbpzVar9 = new bbpz(m9.a());
        this.i = bbpzVar9;
        this.j = new bbpz[]{bbpzVar, bbpzVar2, bbpzVar3, bbpzVar4, bbpzVar5, bbpzVar6, bbpzVar7, bbpzVar8, bbpzVar9};
    }
}

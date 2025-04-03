package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqvx {
    public final bqvy a;
    public final bqvy b;
    public final bqvy c;
    public final bqvy d;
    public final bqvy e;
    final bqvy[] f;

    public bqvx() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 1;
        dtqsVar.a = "cms.key_index";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqws.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqvo
        };
        bqvy bqvyVar = new bqvy(m.a());
        this.a = bqvyVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 5;
        dtqsVar2.a = "cms.encryption_key";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqws.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqvq
        };
        bqvy bqvyVar2 = new bqvy(m2.a());
        this.b = bqvyVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "cms.key_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqws.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqvs
        };
        bqvy bqvyVar3 = new bqvy(m3.a());
        this.c = bqvyVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        m4.l(true);
        m4.d(true);
        dtqsVar4.a = "cms.cms_correlation_id";
        m4.f(true);
        m4.i(42060);
        dtqsVar4.d = new Supplier() { // from class: bqvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqws.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqvu
        };
        bqvy bqvyVar4 = new bqvy(m4.a());
        this.d = bqvyVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        m5.l(true);
        m5.d(true);
        dtqsVar5.a = "cms.cms_id";
        m5.f(true);
        m5.i(35020);
        dtqsVar5.d = new Supplier() { // from class: bqvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqws.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bqvw
        };
        bqvy bqvyVar5 = new bqvy(m5.a());
        this.e = bqvyVar5;
        this.f = new bqvy[]{bqvyVar, bqvyVar2, bqvyVar3, bqvyVar4, bqvyVar5};
    }
}

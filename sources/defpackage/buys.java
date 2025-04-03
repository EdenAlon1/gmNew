package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buys {
    public final buyt a;
    public final buyt b;
    public final buyt c;
    public final buyt d;
    public final buyt e;
    public final buyt f;
    final buyt[] g;

    public buys() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "modified_by._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: buyg
            @Override // java.util.function.Supplier
            public final Object get() {
                return buzh.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: buyl
        };
        buyt buytVar = new buyt(m.a());
        this.a = buytVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "modified_by.am_version_code";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: buym
            @Override // java.util.function.Supplier
            public final Object get() {
                return buzh.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: buyn
        };
        buyt buytVar2 = new buyt(m2.a());
        this.b = buytVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.k(true);
        dtqsVar3.a = "modified_by.stack_trace_hash";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: buyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return buzh.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: buyp
        };
        buyt buytVar3 = new buyt(m3.a());
        this.c = buytVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        m4.k(true);
        dtqsVar4.a = "modified_by.source";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: buyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return buzh.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: buyr
        };
        buyt buytVar4 = new buyt(m4.a());
        this.d = buytVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "modified_by.tiktok_trace";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: buyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return buzh.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: buyi
        };
        buyt buytVar5 = new buyt(m5.a());
        this.e = buytVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "modified_by.stack_trace";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: buyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return buzh.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: buyk
        };
        buyt buytVar6 = new buyt(m6.a());
        this.f = buytVar6;
        this.g = new buyt[]{buytVar, buytVar2, buytVar3, buytVar4, buytVar5, buytVar6};
    }
}

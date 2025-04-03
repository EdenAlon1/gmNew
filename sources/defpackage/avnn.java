package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avnn {
    public final avno a;
    public final avno b;
    public final avno c;
    final avno[] d;

    public avnn() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "rcs_remote_capabilities_cache.msisdn";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: avnh
            @Override // java.util.function.Supplier
            public final Object get() {
                return avod.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: avni
        };
        avno avnoVar = new avno(m.a());
        this.a = avnoVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.k(true);
        dtqsVar2.a = "rcs_remote_capabilities_cache.last_refresh_timestamp";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: avnj
            @Override // java.util.function.Supplier
            public final Object get() {
                return avod.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: avnk
        };
        avno avnoVar2 = new avno(m2.a());
        this.b = avnoVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 5;
        m3.k(true);
        dtqsVar3.a = "rcs_remote_capabilities_cache.rcs_capabilities";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: avnl
            @Override // java.util.function.Supplier
            public final Object get() {
                return avod.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: avnm
        };
        avno avnoVar3 = new avno(m3.a());
        this.c = avnoVar3;
        this.d = new avno[]{avnoVar, avnoVar2, avnoVar3};
    }
}

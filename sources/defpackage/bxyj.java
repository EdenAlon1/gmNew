package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxyj {
    public final bxyk a;
    public final bxyk b;
    public final bxyk c;
    final bxyk[] d;

    public bxyj() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        dtqsVar.a = "sqlite_stat1.tbl";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxyd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxyw.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxye
        };
        bxyk bxykVar = new bxyk(m.a());
        this.a = bxykVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "sqlite_stat1.idx";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxyf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxyw.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxyg
        };
        bxyk bxykVar2 = new bxyk(m2.a());
        this.b = bxykVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "sqlite_stat1.stat";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxyw.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxyi
        };
        bxyk bxykVar3 = new bxyk(m3.a());
        this.c = bxykVar3;
        this.d = new bxyk[]{bxykVar, bxykVar2, bxykVar3};
    }
}

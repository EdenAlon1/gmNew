package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byer {
    public final byes a;
    public final byes b;
    public final byes c;
    final byes[] d;

    public byer() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "supersort_labels._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: byel
            @Override // java.util.function.Supplier
            public final Object get() {
                return byfi.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: byem
        };
        byes byesVar = new byes(m.a());
        this.a = byesVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "supersort_labels.name";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: byen
            @Override // java.util.function.Supplier
            public final Object get() {
                return byfi.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: byeo
        };
        byes byesVar2 = new byes(m2.a());
        this.b = byesVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        dtqsVar3.a = "supersort_labels.status";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: byep
            @Override // java.util.function.Supplier
            public final Object get() {
                return byfi.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: byeq
        };
        byes byesVar3 = new byes(m3.a());
        this.c = byesVar3;
        this.d = new byes[]{byesVar, byesVar2, byesVar3};
    }
}

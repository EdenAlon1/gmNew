package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsrc {
    public final bsrd a;
    public final bsrd b;
    public final bsrd c;
    final bsrd[] d;

    public bsrc() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "data_usage._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bsqw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrn.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bsqx
        };
        bsrd bsrdVar = new bsrd(m.a());
        this.a = bsrdVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        dtqsVar2.a = "data_usage.phone_number";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bsqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrn.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bsqz
        };
        bsrd bsrdVar2 = new bsrd(m2.a());
        this.b = bsrdVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        dtqsVar3.a = "data_usage.data_size";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bsra
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrn.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bsrb
        };
        bsrd bsrdVar3 = new bsrd(m3.a());
        this.c = bsrdVar3;
        this.d = new bsrd[]{bsrdVar, bsrdVar2, bsrdVar3};
    }
}

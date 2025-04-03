package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azdg {
    public final azdh a;
    public final azdh b;
    public final azdh c;
    final azdh[] d;

    public azdg() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "destinations.token";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: azda
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: azdb
        };
        azdh azdhVar = new azdh(m.a());
        this.a = azdhVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "destinations.address";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: azdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: azdd
        };
        azdh azdhVar2 = new azdh(m2.a());
        this.b = azdhVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.k(true);
        dtqsVar3.a = "destinations.address_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: azde
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: azdf
        };
        azdh azdhVar3 = new azdh(m3.a());
        this.c = azdhVar3;
        this.d = new azdh[]{azdhVar, azdhVar2, azdhVar3};
    }
}

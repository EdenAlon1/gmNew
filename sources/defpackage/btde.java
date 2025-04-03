package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btde {
    public final btdf a;
    public final btdf b;
    public final btdf c;
    public final btdf d;
    final btdf[] e;

    public btde() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "events._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btcw
            @Override // java.util.function.Supplier
            public final Object get() {
                return btdw.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btcx
        };
        btdf btdfVar = new btdf(m.a());
        this.a = btdfVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        dtqsVar2.a = "events.timestamp";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: btcy
            @Override // java.util.function.Supplier
            public final Object get() {
                return btdw.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: btcz
        };
        btdf btdfVar2 = new btdf(m2.a());
        this.b = btdfVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "events.event";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: btda
            @Override // java.util.function.Supplier
            public final Object get() {
                return btdw.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btdb
        };
        btdf btdfVar3 = new btdf(m3.a());
        this.c = btdfVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "events.data";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: btdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return btdw.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: btdd
        };
        btdf btdfVar4 = new btdf(m4.a());
        this.d = btdfVar4;
        this.e = new btdf[]{btdfVar, btdfVar2, btdfVar3, btdfVar4};
    }
}

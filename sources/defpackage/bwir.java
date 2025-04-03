package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwir {
    public final bwis a;
    public final bwis b;
    public final bwis c;
    public final bwis d;
    final bwis[] e;

    public bwir() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "pii_hash._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bwij
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwjh.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bwik
        };
        bwis bwisVar = new bwis(m.a());
        this.a = bwisVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        dtqsVar2.a = "pii_hash.timestamp";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bwil
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwjh.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bwim
        };
        bwis bwisVar2 = new bwis(m2.a());
        this.b = bwisVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "pii_hash.hash_value";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bwin
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwjh.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bwio
        };
        bwis bwisVar3 = new bwis(m3.a());
        this.c = bwisVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "pii_hash.hash_key";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bwip
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwjh.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bwiq
        };
        bwis bwisVar4 = new bwis(m4.a());
        this.d = bwisVar4;
        this.e = new bwis[]{bwisVar, bwisVar2, bwisVar3, bwisVar4};
    }
}

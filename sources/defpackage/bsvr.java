package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsvr {
    public final bsvs a;
    public final bsvs b;
    final bsvs[] c;

    public bsvr() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.d(true);
        dtqsVar.a = "disambiguations.lookup_key";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bsvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bswf.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bsvo
        };
        bsvs bsvsVar = new bsvs(m.a());
        this.a = bsvsVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        dtqsVar2.a = "disambiguations.normalized_destination";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bsvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bswf.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bsvq
        };
        bsvs bsvsVar2 = new bsvs(m2.a());
        this.b = bsvsVar2;
        this.c = new bsvs[]{bsvsVar, bsvsVar2};
    }
}

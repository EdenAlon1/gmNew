package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvbh {
    public final bvbi a;
    public final bvbi b;
    public final bvbi c;
    final bvbi[] d;

    public bvbh() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "smarts_personalization_features.feature_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bvbb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvbu.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bvbc
        };
        bvbi bvbiVar = new bvbi(m.a());
        this.a = bvbiVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.d(true);
        dtqsVar2.a = "smarts_personalization_features.feature";
        m2.f(true);
        m2.i(54060);
        dtqsVar2.d = new Supplier() { // from class: bvbd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvbu.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bvbe
        };
        bvbi bvbiVar2 = new bvbi(m2.a());
        this.b = bvbiVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        dtqsVar3.a = "smarts_personalization_features.start_date";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bvbf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvbu.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bvbg
        };
        bvbi bvbiVar3 = new bvbi(m3.a());
        this.c = bvbiVar3;
        this.d = new bvbi[]{bvbiVar, bvbiVar2, bvbiVar3};
    }
}

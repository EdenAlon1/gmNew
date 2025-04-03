package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvck {
    public final bvcl a;
    public final bvcl b;
    final bvcl[] c;

    public bvck() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "smarts_personalization_normalized_feature_values.date";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bvcg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvcy.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bvch
        };
        bvcl bvclVar = new bvcl(m.a());
        this.a = bvclVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 5;
        dtqsVar2.a = "smarts_personalization_normalized_feature_values.features";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bvci
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvcy.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bvcj
        };
        bvcl bvclVar2 = new bvcl(m2.a());
        this.b = bvclVar2;
        this.c = new bvcl[]{bvclVar, bvclVar2};
    }
}

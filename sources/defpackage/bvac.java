package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvac {
    public final bvad a;
    public final bvad b;
    public final bvad c;
    final bvad[] d;

    public bvac() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: buzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvbu.b.a;
            }
        };
        dtqsVar.a = "smarts_personalization_decayed_feature_values.feature_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: buzw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvar.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: buzx
        };
        bvad bvadVar = new bvad(m.a());
        this.a = bvadVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.g(true);
        m2.d(true);
        dtqsVar2.a = "smarts_personalization_decayed_feature_values.date";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: buzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvar.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: buzz
        };
        bvad bvadVar2 = new bvad(m2.a());
        this.b = bvadVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 3;
        dtqsVar3.a = "smarts_personalization_decayed_feature_values.feature_value";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bvaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvar.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bvab
        };
        bvad bvadVar3 = new bvad(m3.a());
        this.c = bvadVar3;
        this.d = new bvad[]{bvadVar, bvadVar2, bvadVar3};
    }
}

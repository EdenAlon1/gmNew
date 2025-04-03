package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfok {
    public final cfol a;
    public final cfol b;
    public final cfol c;
    final cfol[] d;

    public cfok() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "mls_group_states.identity_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: cfoe
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfow.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: cfof
        };
        cfol cfolVar = new cfol(m.a());
        this.a = cfolVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.k(true);
        m2.g(true);
        m2.d(true);
        dtqsVar2.a = "mls_group_states.group_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: cfog
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfow.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: cfoh
        };
        cfol cfolVar2 = new cfol(m2.a());
        this.b = cfolVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 5;
        m3.k(true);
        dtqsVar3.a = "mls_group_states.epoch_data";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: cfoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfow.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: cfoj
        };
        cfol cfolVar3 = new cfol(m3.a());
        this.c = cfolVar3;
        this.d = new cfol[]{cfolVar, cfolVar2, cfolVar3};
    }
}

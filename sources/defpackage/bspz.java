package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bspz {
    public final bsqa a;
    public final bsqa b;
    final bsqa[] c;

    public bspz() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "data_upgrade_workers._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bspv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsqp.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bspw
        };
        bsqa bsqaVar = new bsqa(m.a());
        this.a = bsqaVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        dtqsVar2.a = "data_upgrade_workers.last_update_version";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bspx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsqp.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bspy
        };
        bsqa bsqaVar2 = new bsqa(m2.a());
        this.b = bsqaVar2;
        this.c = new bsqa[]{bsqaVar, bsqaVar2};
    }
}

package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbvr {
    public final bbvs a;
    public final bbvs b;
    final bbvs[] c;

    public bbvr() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "message_star_backup._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bbvm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbwh.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bbvn
        };
        bbvs bbvsVar = new bbvs(m.a());
        this.a = bbvsVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bbvo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcba.c.a;
            }
        };
        dtqsVar2.a = "message_star_backup.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bbvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbwh.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bbvq
        };
        bbvs bbvsVar2 = new bbvs(m2.a());
        this.b = bbvsVar2;
        this.c = new bbvs[]{bbvsVar, bbvsVar2};
    }
}

package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bspa {
    public final bspb a;
    public final bspb b;
    final bspb[] c;

    public bspa() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bsov
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar.a = "custodian_rcs_group_ids.conversation_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bsow
            @Override // java.util.function.Supplier
            public final Object get() {
                return bspl.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bsox
        };
        bspb bspbVar = new bspb(m.a());
        this.a = bspbVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        dtqsVar2.a = "custodian_rcs_group_ids.rcs_group_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bsoy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bspl.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bsoz
        };
        bspb bspbVar2 = new bspb(m2.a());
        this.b = bspbVar2;
        this.c = new bspb[]{bspbVar, bspbVar2};
    }
}

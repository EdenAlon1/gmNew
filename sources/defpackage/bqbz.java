package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqbz {
    public final bqca a;
    public final bqca b;
    public final bqca c;
    final bqca[] d;

    public bqbz() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "add_contact_banner._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqbs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqcp.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqbt
        };
        bqca bqcaVar = new bqca(m.a());
        this.a = bqcaVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bqbu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar2.a = "add_contact_banner.conversation_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqbv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqcp.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqbw
        };
        bqca bqcaVar2 = new bqca(m2.a());
        this.b = bqcaVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "add_contact_banner.banner_status";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqbx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqcp.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqby
        };
        bqca bqcaVar3 = new bqca(m3.a());
        this.c = bqcaVar3;
        this.d = new bqca[]{bqcaVar, bqcaVar2, bqcaVar3};
    }
}

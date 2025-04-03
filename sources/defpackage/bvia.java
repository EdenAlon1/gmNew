package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvia {
    public final bvib a;
    final bvib[] b;

    public bvia() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bvhx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar.a = "parent_disallowed_conversations.conversation_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bvhy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvin.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bvhz
        };
        bvib bvibVar = new bvib(m.a());
        this.a = bvibVar;
        this.b = new bvib[]{bvibVar};
    }
}

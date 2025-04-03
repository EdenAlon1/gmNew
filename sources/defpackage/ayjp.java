package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayjp {
    public final ayjq a;
    public final ayjq b;
    public final ayjq c;
    public final ayjq d;
    final ayjq[] e;

    public ayjp() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversation_matcher_cache._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: ayjg
            @Override // java.util.function.Supplier
            public final Object get() {
                return aykg.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: ayjh
        };
        ayjq ayjqVar = new ayjq(m.a());
        this.a = ayjqVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "conversation_matcher_cache.matcher_version";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: ayji
            @Override // java.util.function.Supplier
            public final Object get() {
                return aykg.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: ayjj
        };
        ayjq ayjqVar2 = new ayjq(m2.a());
        this.b = ayjqVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.k(true);
        dtqsVar3.a = "conversation_matcher_cache.destination_key";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: ayjk
            @Override // java.util.function.Supplier
            public final Object get() {
                return aykg.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: ayjl
        };
        ayjq ayjqVar3 = new ayjq(m3.a());
        this.c = ayjqVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.k(true);
        m4.d(true);
        m4.e(true);
        dtqsVar4.b = new Supplier() { // from class: ayjm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar4.a = "conversation_matcher_cache.conversation_id";
        m4.f(true);
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: ayjn
            @Override // java.util.function.Supplier
            public final Object get() {
                return aykg.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: ayjo
        };
        ayjq ayjqVar4 = new ayjq(m4.a());
        this.d = ayjqVar4;
        this.e = new ayjq[]{ayjqVar, ayjqVar2, ayjqVar3, ayjqVar4};
    }
}

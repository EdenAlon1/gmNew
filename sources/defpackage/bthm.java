package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bthm {
    public final bthn a;
    public final bthn b;
    final bthn[] c;

    public bthm() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.k(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bthh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar.a = "gemini.conversation_id";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bthi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bthy.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bthj
        };
        bthn bthnVar = new bthn(m.a());
        this.a = bthnVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        dtqsVar2.a = "gemini.desired_gemini_state";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bthk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bthy.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bthl
        };
        bthn bthnVar2 = new bthn(m2.a());
        this.b = bthnVar2;
        this.c = new bthn[]{bthnVar, bthnVar2};
    }
}

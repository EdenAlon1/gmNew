package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brxr {
    public final brxs a;
    public final brxs b;
    public final brxs c;
    final brxs[] d;

    public brxr() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversation_pin._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: brxk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bryh.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: brxl
        };
        brxs brxsVar = new brxs(m.a());
        this.a = brxsVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: brxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar2.a = "conversation_pin.conversation_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: brxn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bryh.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: brxo
        };
        brxs brxsVar2 = new brxs(m2.a());
        this.b = brxsVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        dtqsVar3.a = "conversation_pin.pin_status";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: brxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bryh.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: brxq
        };
        brxs brxsVar3 = new brxs(m3.a());
        this.c = brxsVar3;
        this.d = new brxs[]{brxsVar, brxsVar2, brxsVar3};
    }
}

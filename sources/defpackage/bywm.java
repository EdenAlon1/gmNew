package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bywm {
    public final bywn a;
    public final bywn b;
    final bywn[] c;

    public bywm() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "verified_sms_senders.sender_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bywi
            @Override // java.util.function.Supplier
            public final Object get() {
                return byxc.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bywj
        };
        bywn bywnVar = new bywn(m.a());
        this.a = bywnVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "verified_sms_senders.brand_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bywk
            @Override // java.util.function.Supplier
            public final Object get() {
                return byxc.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bywl
        };
        bywn bywnVar2 = new bywn(m2.a());
        this.b = bywnVar2;
        this.c = new bywn[]{bywnVar, bywnVar2};
    }
}

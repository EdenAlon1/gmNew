package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bytw {
    public final bytx a;
    final bytx[] b;

    public bytw() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "verified_sms_blacklisted_senders.sender_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bytu
            @Override // java.util.function.Supplier
            public final Object get() {
                return byuf.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bytv
        };
        bytx bytxVar = new bytx(m.a());
        this.a = bytxVar;
        this.b = new bytx[]{bytxVar};
    }
}

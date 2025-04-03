package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavi {
    public static final void a(final aavf aavfVar, hfd hfdVar, final int i) {
        int i2;
        aavfVar.getClass();
        hfd b = hfdVar.b(1985973183);
        if ((i & 6) == 0) {
            i2 = (true != b.F(aavfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            cru.b(aavfVar.b, null, ctt.k(null, null, 15).a(ctt.l(null, 3)), ctt.q(null, null, 15).a(ctt.m(null, 3)), null, hpx.d(-2050144617, new aavh(aavfVar, hkt.b(aavfVar.c, false, null, b, 2)), b), b, 200064, 18);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aavg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    aavi.a(aavf.this, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

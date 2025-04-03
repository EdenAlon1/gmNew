package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egth {
    public static final void a(int i, final ffjn ffjnVar, hfd hfdVar, final int i2) {
        int i3;
        final int i4;
        ffjnVar.getClass();
        int i5 = i2 & 6;
        hfd b = hfdVar.b(1498199422);
        if (i5 == 0) {
            i3 = (true != b.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.F(ffjnVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            i4 = i;
        } else {
            i4 = i;
            ((dvyu) b.e(egsi.b)).b(i4, null, null, null, hpx.d(-80001900, new egtg(ffjnVar, (dvxi) b.e(egsi.c)), b), b, (i3 & 14) | 12582912, 126);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: egtf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i4;
                    int i7 = i2;
                    egth.a(i6, ffjnVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

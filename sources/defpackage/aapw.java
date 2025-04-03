package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapw {
    public static final void a(final aapu aapuVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1615947374);
        if (i3 == 0) {
            i2 = (true != b.D(aapuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dmiv.c(aapuVar.a, null, b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aapv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aapw.a(aapu.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

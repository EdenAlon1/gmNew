package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zha {
    public static final void a(final dspm dspmVar, final hvi hviVar, final zhq zhqVar, hfd hfdVar, final int i) {
        int i2;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(639489436);
        if (i3 == 0) {
            i2 = (true != b.F(dspmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(zhqVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            gvj b2 = dwkh.b(ibw.g, 0L, 0L, b, 62);
            b = b;
            dweu.a(hpx.d(-1703101864, new zgx(zhqVar), b), hviVar, hpx.d(1088767126, new zgy(zhqVar, dspmVar), b), hpx.d(1379207949, new zgz(zhqVar), b), 0.0f, null, b2, null, b, (i2 & 112) | 3462, 176);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zgw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dspm dspmVar2 = dspm.this;
                    hvi hviVar2 = hviVar;
                    int i4 = i;
                    zha.a(dspmVar2, hviVar2, zhqVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

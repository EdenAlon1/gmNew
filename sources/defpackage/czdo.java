package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czdo {
    public static final void a(final czdj czdjVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(481164401);
        if (i3 == 0) {
            i2 = (true != b.D(czdjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            fub.a(czde.a, null, hpx.d(-1853674389, new czdn(czdjVar), b), null, 0.0f, null, gvl.b(ibw.g, 0L, 0L, 0L, 0L, 0L, hfdVar2, 62), gvl.a(dweu.c(0.0f, b, 384), null, null, null, b, 14), hfdVar2, 390, 58);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: czdm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    czdo.a(czdj.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dlsr dlsrVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(866876089);
        if (i3 == 0) {
            i2 = (true != b.D(dlsrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            b.v(1199419000);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffix() { // from class: czdk
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dlsr dlsrVar2 = dlsr.this;
                        if (dlsrVar2 != null) {
                            dlsrVar2.k.invoke();
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwhl.b((ffix) R, null, false, null, null, czde.b, b, 1572864, 62);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: czdl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    czdo.b(dlsr.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

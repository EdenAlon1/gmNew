package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpmj {
    public static final void a(hvi hviVar, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(842604355);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            final ffsk ffskVar = (ffsk) R;
            b.v(-1289589764);
            boolean F = b.F(ffskVar) | b.F(ffjiVar);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new ffix() { // from class: dpmg
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffqy.d(ffsk.this, null, null, new dpmi(ffjiVar, null), 3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hviVar2 = hviVar;
            dwhl.b((ffix) R2, hviVar2, false, null, null, dpml.a, b, ((i2 << 3) & 112) | 1572864, 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpmh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    int i4 = i;
                    dpmj.a(hviVar3, ffjiVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

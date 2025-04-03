package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmjf {
    public static final void a(final dmjg dmjgVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1178601125);
        if (i3 == 0) {
            i2 = (true != b.D(dmjgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            b.v(42119169);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffix() { // from class: dmjc
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Integer.valueOf(((enou) dmjg.this.a).c);
                    }
                };
                hfmVar.ad(R);
            }
            ffix ffixVar = (ffix) R;
            hfmVar.Z();
            Object[] objArr = new Object[0];
            hrh hrhVar = gxa.a;
            boolean B = b.B(0) | b.D(ffixVar);
            Object R2 = hfmVar.R();
            if (B || R2 == hfc.a) {
                R2 = new gxb(ffixVar);
                hfmVar.ad(R2);
            }
            gxa gxaVar = (gxa) hqr.c(objArr, hrhVar, (ffix) R2, b, 0, 4);
            gxaVar.b.a.b(ffixVar);
            hviVar2 = hviVar;
            gwr.c(gxaVar, hviVar2, enb.a(gxaVar.b, new gwa(), cxd.a(b), cxu.b(0.0f, 400.0f, null, 5), b, 0, 16), 0.0f, 0.0f, null, hpx.d(-1227618563, new dmje(dmjgVar), b), b, ((i2 << 3) & 896) | 100666424);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmjd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmjg dmjgVar2 = dmjg.this;
                    int i5 = i;
                    dmjf.a(dmjgVar2, hviVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

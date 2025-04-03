package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxy {
    public static final void a(lkr lkrVar, ffji ffjiVar, ffix ffixVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1868327245);
        if (i3 == 0) {
            i2 = (true != b.F(lkrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            boolean F = ((i2 & 112) == 32) | b.F(lkrVar);
            boolean z = (i2 & 896) == 256;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z | F) || R == hfc.a) {
                R = new gxu(lkrVar, ffjiVar, ffixVar);
                hfmVar.ad(R);
            }
            hgs.c(lkrVar, (ffji) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gxv(lkrVar, ffjiVar, ffixVar, i);
        }
    }
}

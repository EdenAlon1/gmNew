package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dym {
    public static final void a(hvi hviVar, huo huoVar, ffjn ffjnVar, hfd hfdVar, int i, int i2) {
        int i3;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(1781813501);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(huoVar) ? 16 : 32;
        }
        int i6 = i3 | 384;
        if ((i & 3072) == 0) {
            i6 |= true != b.F(ffjnVar) ? 1024 : 2048;
        }
        if (b.J((i6 & 1171) != 1170, i6 & 1)) {
            if (i4 != 0) {
                hviVar = hvi.e;
            }
            if (i5 != 0) {
                int i7 = huo.a;
                huoVar = hum.a;
            }
            ipn a = dyc.a(huoVar, false);
            boolean D = ((i6 & 7168) == 2048) | b.D(a);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new dyk(a, ffjnVar);
                hfmVar.ad(R);
            }
            ira.a(hviVar, (ffjm) R, b, i6 & 14, 0);
        } else {
            b.s();
        }
        huo huoVar2 = huoVar;
        hio L = b.L();
        if (L != null) {
            L.d = new dyl(hviVar, huoVar2, ffjnVar, i, i2);
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elm {
    public static final void a(ffjn ffjnVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(674185128);
        if (i3 == 0) {
            i2 = (true != b.F(ffjnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (b.J((i2 & 3) != 2, i2 & 1)) {
            hrc hrcVar = (hrc) b.e(hrg.a);
            b.v(-796079677);
            hra hraVar = (hra) hqr.c(new Object[0], hra.a, hrb.a, b, 3072, 4);
            hraVar.d = (hrc) b.e(hrg.a);
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            Object[] objArr = {hrcVar};
            hrk hrkVar = new hrk(ele.a, new elf(hrcVar, hraVar));
            boolean F = b.F(hrcVar) | b.F(hraVar);
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ell(hrcVar, hraVar);
                hfmVar.ad(R);
            }
            eli eliVar = (eli) hqr.c(objArr, hrkVar, (ffix) R, b, 0, 4);
            hfz.a(hrg.a.c(eliVar), hpx.d(1863926504, new elj(ffjnVar, eliVar), b), b, 56);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new elk(ffjnVar, i);
        }
    }
}

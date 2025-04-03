package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fea {
    public static final void a(hvi hviVar, fcy fcyVar, ffji ffjiVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        hvi a;
        hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2078139907);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(fcyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if (b.J((i2 & 1171) != 1170, 1 & i2)) {
            fgi fgiVar = (fgi) hqr.c(new Object[0], fgi.a, fdy.a, b, 3072, 4);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new fft(fgiVar);
                hfmVar.ad(R);
            }
            fft fftVar = (fft) R;
            iyj iyjVar = (iyj) b.e(jdr.c);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = hgs.a(ffhe.a, b);
                hfmVar.ad(R2);
            }
            ffsk ffskVar = (ffsk) R2;
            fftVar.c = (iir) b.e(jdr.h);
            boolean D = b.D(ffskVar) | b.D(iyjVar);
            Object R3 = hfmVar.R();
            if (D || R3 == hfc.a) {
                R3 = new fdo(ffskVar, iyjVar);
                hfmVar.ad(R3);
            }
            fftVar.d = (ffji) R3;
            fftVar.j = (jbw) b.e(jdr.l);
            fftVar.b = new ffq(fftVar, ffjiVar);
            fftVar.t(fcyVar);
            a = dfz.a(hyf.a(hzk.a(ipx.a(ilv.a(hvi.e, ffcu.a, new ffo(fftVar, new ffi(fftVar))), new ffj(fftVar)), fftVar.e), new ffk(fftVar)), true, null);
            hvi a2 = ija.a(fek.b(a, new ffl(fftVar)), new ffm(fftVar));
            if (fftVar.z() && fftVar.B() && !fftVar.D()) {
                hviVar2 = hvi.e;
                if (dhm.a()) {
                    hviVar2 = huz.g(hviVar2, new fgc(fftVar));
                }
            } else {
                hviVar2 = hvi.e;
            }
            fgo.a(a2.a(hviVar2), hpx.d(-1869667463, new fdu(fftVar, fgiVar, ffjmVar), b), b, 48);
            boolean F = b.F(fftVar);
            Object R4 = hfmVar.R();
            if (F || R4 == hfc.a) {
                R4 = new fdw(fftVar);
                hfmVar.ad(R4);
            }
            hgs.c(fftVar, (ffji) R4, b);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fdx(hviVar, fcyVar, ffjiVar, ffjmVar, i);
        }
    }

    public static final void b(hvi hviVar, ffjm ffjmVar, hfd hfdVar, int i) {
        ffjm ffjmVar2;
        int i2 = i & 48;
        int i3 = i | 6;
        hfd b = hfdVar.b(-1075498320);
        if (i2 == 0) {
            i3 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if (b.J((i3 & 19) != 18, i3 & 1)) {
            hve hveVar = hvi.e;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(null, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            fcy fcyVar = (fcy) hhoVar.a();
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new fdl(hhoVar);
                hfmVar.ad(R2);
            }
            ffjmVar2 = ffjmVar;
            a(hveVar, fcyVar, (ffji) R2, ffjmVar2, b, (i3 & 14) | 384 | ((i3 << 6) & 7168));
            hviVar = hveVar;
        } else {
            ffjmVar2 = ffjmVar;
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fdm(hviVar, ffjmVar2, i);
        }
    }
}

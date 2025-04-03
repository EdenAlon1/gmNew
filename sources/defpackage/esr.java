package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esr {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.fhi r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esr.a(fhi, ffgu):java.lang.Object");
    }

    public static final void b(fft fftVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        ffjm ffjmVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(605522716);
        if (i3 == 0) {
            i2 = (true != b.F(fftVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if (b.J((i2 & 19) != 18, i2 & 1)) {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dkl(null);
                hfmVar.ad(R);
            }
            dkl dklVar = (dkl) R;
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new esn(dklVar);
                hfmVar.ad(R2);
            }
            ffjmVar2 = ffjmVar;
            djv.a(dklVar, (ffix) R2, new ffx(dklVar, fftVar), null, false, null, ffjmVar2, b, ((i2 << 15) & 3670016) | 54, 56);
        } else {
            ffjmVar2 = ffjmVar;
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new eso(fftVar, ffjmVar2, i);
        }
    }

    public static final void c(fhi fhiVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        ffjm ffjmVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1985516685);
        if (i3 == 0) {
            i2 = (true != b.F(fhiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if (b.J((i2 & 19) != 18, i2 & 1)) {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dkl(null);
                hfmVar.ad(R);
            }
            dkl dklVar = (dkl) R;
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = hgs.a(ffhe.a, b);
                hfmVar.ad(R2);
            }
            ffsk ffskVar = (ffsk) R2;
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                hic hicVar = new hic(new evp(0), hla.a);
                hfmVar.ad(hicVar);
                R3 = hicVar;
            }
            hho hhoVar = (hho) R3;
            Object R4 = hfmVar.R();
            if (R4 == hfc.a) {
                R4 = new esj(dklVar);
                hfmVar.ad(R4);
            }
            ffix ffixVar = (ffix) R4;
            fhs fhsVar = new fhs(hhoVar, dklVar, fhiVar);
            boolean t = fhiVar.t();
            boolean F = b.F(ffskVar) | b.F(fhiVar);
            Object R5 = hfmVar.R();
            if (F || R5 == hfc.a) {
                R5 = new esl(ffskVar, hhoVar, fhiVar);
                hfmVar.ad(R5);
            }
            ffix ffixVar2 = (ffix) R5;
            ffjmVar2 = ffjmVar;
            djv.a(dklVar, ffixVar, fhsVar, null, t, ffixVar2, ffjmVar2, b, ((i2 << 15) & 3670016) | 54, 8);
        } else {
            ffjmVar2 = ffjmVar;
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new esm(fhiVar, ffjmVar2, i);
        }
    }
}

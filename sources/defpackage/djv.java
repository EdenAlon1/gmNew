package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djv {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.dkl r18, defpackage.ffix r19, defpackage.ffji r20, defpackage.hvi r21, boolean r22, defpackage.ffix r23, defpackage.ffjm r24, defpackage.hfd r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djv.a(dkl, ffix, ffji, hvi, boolean, ffix, ffjm, hfd, int, int):void");
    }

    public static final void b(dkl dklVar, ffix ffixVar, hvi hviVar, ffji ffjiVar, hfd hfdVar, int i) {
        int i2;
        dkl dklVar2;
        int i3;
        int i4 = i & 6;
        hfd b = hfdVar.b(645832757);
        if (i4 == 0) {
            i2 = (true != b.D(dklVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        int i5 = i2 | 384;
        if ((i & 3072) == 0) {
            i5 |= true != b.F(ffjiVar) ? 1024 : 2048;
        }
        if (b.J((i5 & 1171) != 1170, i5 & 1)) {
            hviVar = hvi.e;
            dkk a = dklVar.a();
            if (!(a instanceof dkj)) {
                hio L = b.L();
                if (L != null) {
                    L.d = new djq(dklVar, ffixVar, hviVar, ffjiVar, i);
                    return;
                }
                return;
            }
            dklVar2 = dklVar;
            i3 = i;
            boolean D = b.D(a);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new dkc(kab.c(((dkj) a).a));
                hfmVar.ad(R);
            }
            dku.c((dkc) R, ffixVar, hviVar, ffjiVar, b, i5 & 8176);
        } else {
            dklVar2 = dklVar;
            i3 = i;
            b.s();
        }
        hvi hviVar2 = hviVar;
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new djr(dklVar2, ffixVar, hviVar2, ffjiVar, i3);
        }
    }
}

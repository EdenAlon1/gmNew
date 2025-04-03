package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcg {
    public static final ffji a = kbz.a;

    public static final kcp a(iui iuiVar) {
        kbs kbsVar = iuiVar.m;
        if (kbsVar != null) {
            return (kcp) kbsVar;
        }
        imn.a("Required value was null.");
        throw new ffbx();
    }

    public static final void b(ffji ffjiVar, hvi hviVar, ffji ffjiVar2, hfd hfdVar, int i, int i2) {
        int i3;
        ffji ffjiVar3;
        ffji ffjiVar4;
        hvi hviVar2;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-1783766393);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.F(ffjiVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != b.F(ffjiVar2) ? 128 : 256;
        }
        if (b.J((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            hvi hviVar3 = hviVar;
            ffji ffjiVar5 = i6 != 0 ? a : ffjiVar2;
            ffjiVar3 = ffjiVar;
            c(ffjiVar3, hviVar3, a, ffjiVar5, b, (i3 & 14) | 3072 | (i3 & 112) | (57344 & (i3 << 6)), 4);
            hviVar2 = hviVar3;
            ffjiVar4 = ffjiVar5;
        } else {
            ffjiVar3 = ffjiVar;
            b.s();
            ffjiVar4 = ffjiVar2;
            hviVar2 = hviVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new kbv(ffjiVar3, hviVar2, ffjiVar4, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.ffji r23, defpackage.hvi r24, defpackage.ffji r25, defpackage.ffji r26, defpackage.hfd r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcg.c(ffji, hvi, ffji, ffji, hfd, int, int):void");
    }
}

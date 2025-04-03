package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsuh {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dspc r26, defpackage.hvi r27, final defpackage.dsss r28, defpackage.inp r29, defpackage.hfd r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsuh.a(dspc, hvi, dsss, inp, hfd, int, int):void");
    }

    public static final void b(final dspe dspeVar, final hvi hviVar, final dsum dsumVar, final ffji ffjiVar, hfd hfdVar, final int i) {
        dspe dspeVar2;
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1839600605);
        if (i3 == 0) {
            dspeVar2 = dspeVar;
            i2 = (true != b.F(dspeVar2) ? 2 : 4) | i;
        } else {
            dspeVar2 = dspeVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(dsumVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjiVar) ? 1024 : 2048;
        }
        int i4 = i2;
        if ((i4 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            b.v(863028013);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                dstx dstxVar = new dstx(dspeVar2, new hhw(1.0f), new hic(new kaf(0L), hla.a), new hic(new iak(0L), hla.a), new hic(false, hla.a), new hic(false, hla.a));
                hfmVar.ad(dstxVar);
                R = dstxVar;
            }
            dstx dstxVar2 = (dstx) R;
            hfmVar.Z();
            dsumVar.d.b(Boolean.valueOf(!dstxVar2.b() || ((Boolean) dstxVar2.g.a()).booleanValue()));
            dym.a(hviVar, null, hpx.d(-583000633, new dsub(dspeVar, dsumVar, dspeVar, dstxVar2, ffjiVar), b), b, ((i4 >> 3) & 14) | 3072, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsua
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dspe dspeVar3 = dspe.this;
                    hvi hviVar2 = hviVar;
                    dsum dsumVar2 = dsumVar;
                    dsuh.b(dspeVar3, hviVar2, dsumVar2, ffjiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.dspe r16, final defpackage.hvi r17, final defpackage.dsum r18, final defpackage.ffji r19, final boolean r20, final defpackage.ffjo r21, defpackage.hfd r22, final int r23) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsuh.c(dspe, hvi, dsum, ffji, boolean, ffjo, hfd, int):void");
    }
}

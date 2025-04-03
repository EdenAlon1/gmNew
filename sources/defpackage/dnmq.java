package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmq {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0308 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dnmt r25, defpackage.hvi r26, final defpackage.eqd r27, final boolean r28, final defpackage.ffjo r29, defpackage.hfd r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnmq.a(dnmt, hvi, eqd, boolean, ffjo, hfd, int, int):void");
    }

    public static final void b(final dyh dyhVar, final boolean z, hvi hviVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        ibw ibwVar;
        hvi a;
        final hvi hviVar2;
        long f;
        int i4 = i & 6;
        hfd b = hfdVar.b(-1627311014);
        if (i4 == 0) {
            i3 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.E(z) ? 16 : 32;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            final hvi hviVar3 = hviVar;
            b.v(-1201247307);
            if (z) {
                f = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), 0.5f, ibw.f(gft.a(b).a));
                ibwVar = new ibw(f);
            } else {
                ibwVar = null;
            }
            ((hfm) b).Z();
            if (ibwVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dnmn
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dyh dyhVar2 = dyh.this;
                            boolean z2 = z;
                            dnmq.b(dyhVar2, z2, hviVar3, (hfd) obj, hip.a(i | 1), i2);
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            a = dee.a(dyhVar.b(hviVar3), ibwVar.i, idb.a);
            dyc.b(a, b, 0);
            hviVar2 = hviVar3;
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dnmo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    boolean z2 = z;
                    dnmq.b(dyhVar2, z2, hviVar2, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }
}

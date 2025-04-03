package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cywo {
    public static final void a(final cyxb cyxbVar, hfd hfdVar, final int i) {
        int i2;
        cyxc cyxcVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(133542504);
        if (i3 == 0) {
            i2 = (true != b.D(cyxbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            if (cyxbVar == null || (cyxcVar = cyxbVar.c) == cyxc.a || cyxcVar == cyxc.e) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: cyvx
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            cywo.a(cyxb.this, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            b.v(2030237295);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffix() { // from class: cyvy
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        cyxb.this.e.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            kdc.a((ffix) R, new keh(7), hpx.d(1850459967, new cywc(cyxbVar), b), b, 432, 0);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: cyvz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    cywo.a(cyxb.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.cyxb r33, final long r34, final boolean r36, defpackage.hfd r37, final int r38) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cywo.b(cyxb, long, boolean, hfd, int):void");
    }

    public static final /* synthetic */ long c(int i, hfd hfdVar) {
        hfdVar.v(67726834);
        long a = i == 3 ? ids.a(0.0f, 0.1f) : i == 5 ? ids.a(0.0f, 0.8f) : i == 4 ? ids.a(1.0f, 0.1f) : i == 6 ? ids.a(1.0f, 0.8f) : i == 2 ? hfdVar.e(jdr.j) == kah.a ? ids.a(0.0f, 1.0f) : ids.a(1.0f, 1.0f) : ids.a(0.5f, 0.5f);
        hfdVar.o();
        return a;
    }

    private static final long d(hho hhoVar) {
        return ((kaf) hhoVar.a()).a;
    }

    private static final long e(hho hhoVar) {
        return ((iak) hhoVar.a()).a;
    }
}

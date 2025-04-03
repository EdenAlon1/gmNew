package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwdc {
    public static final doau a(hkx hkxVar) {
        return (doau) hkxVar.a();
    }

    public static final void b(final cwcq cwcqVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(150024628);
        if (i3 == 0) {
            i2 = (true != b.D(cwcqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            if (cwcqVar.a) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: cwcu
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            cwcq cwcqVar2 = cwcq.this;
                            int i4 = i;
                            cwdc.b(cwcqVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            cvww.b(cwcqVar.e, b, 0);
            gpa.c(null, null, 0L, 0L, 0.0f, 0.0f, null, hpx.d(-1435411655, new cwcw(hviVar, cwcqVar), b), b, 127);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: cwcv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cwcq cwcqVar2 = cwcq.this;
                    int i4 = i;
                    cwdc.b(cwcqVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final fgcq fgcqVar, final god godVar, hfd hfdVar, final int i) {
        int i2;
        godVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(876214113);
        if (i3 == 0) {
            i2 = (true != b.F(fgcqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(godVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-166921758);
            boolean F = b.F(fgcqVar) | ((i2 & 112) == 32);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new cwcz(fgcqVar, godVar, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(godVar, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwcr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fgcq fgcqVar2 = fgcq.this;
                    int i4 = i;
                    cwdc.c(fgcqVar2, godVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final cwcq cwcqVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hvi a;
        hvi c2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1851118647);
        if (i3 == 0) {
            i2 = (true != b.D(cwcqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            rva a2 = rvd.a(b);
            cwni.b(a2, ibw.g, false, null, b, 48, 12);
            hkx a3 = hkf.a(cwcqVar.h, b);
            b.v(472846955);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new god();
                hfmVar.ad(R);
            }
            god godVar = (god) R;
            hfmVar.Z();
            c(cwcqVar.i, godVar, b, 48);
            b.v(472856701);
            c = ebs.c(hvi.e, 1.0f);
            a = dee.a(ecm.b(c, new eat(ecv.f(b), 15)), gft.a(b).p, idb.a);
            if (!cwcqVar.j.a) {
                a = a.a(ecm.b(hvi.e, new eat(ecv.f(b), 32)));
            }
            hfmVar.Z();
            b.v(472862134);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffji() { // from class: cwcs
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jks.a(jkvVar);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            c2 = jjs.c(a, false, (ffji) R2);
            hfdVar2 = b;
            dwio.a(c2, null, null, hpx.d(31857807, new cwda(godVar), b), null, 0, 0L, 0L, null, hpx.d(-1788911784, new cwdb(cwcqVar, a2, a3), b), hfdVar2, 805309440, 502);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwct
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cwdc.d(cwcq.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(hfd hfdVar) {
        hfdVar.v(-1528629865);
        hfdVar.o();
    }
}

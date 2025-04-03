package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmi {
    public static final void a(ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-219655286);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            ffixVar2 = ffixVar;
            dwhl.b(ffixVar2, null, false, null, null, dnmb.a, b, (i2 & 14) | 1572864, 62);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnmc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnmi.a(ffix.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dnmk dnmkVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hpn hpnVar;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1399546767);
        if (i3 == 0) {
            i2 = (true != b.D(dnmkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(-1732023548);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            ffix ffixVar = dnmkVar.c;
            b.v(-1732017501);
            d = ebs.d(hviVar, 1.0f);
            hvi i4 = eba.i(d, 16.0f, 0.0f, 2);
            if (dnmkVar.e.a) {
                hve hveVar = hvi.e;
                b.v(-1603932963);
                Object R2 = hfmVar.R();
                if (R2 == hfc.a) {
                    R2 = new ffji() { // from class: dnmd
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            hzo hzoVar = (hzo) obj;
                            hzoVar.getClass();
                            hho.this.b(Boolean.valueOf(hzoVar.b()));
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R2);
                }
                hfmVar.Z();
                i4 = i4.a(hyj.a(hveVar, (ffji) R2));
            }
            hfmVar.Z();
            hvi hviVar2 = i4;
            String str = dnmkVar.b;
            ffji ffjiVar = dnmkVar.d;
            if (dnmkVar.e.a && ffixVar != null && (((Boolean) hhoVar.a()).booleanValue() || dnmkVar.b.length() > 0)) {
                b.v(2142425740);
                hpnVar = hpx.d(855340276, new dnmf(ffixVar), b);
                hfmVar.Z();
            } else if (dnmkVar.e.a || ffixVar == null) {
                b.v(2142607338);
                hfmVar.Z();
                hpnVar = null;
            } else {
                b.v(2142550732);
                hpnVar = hpx.d(-1770807189, new dnmg(ffixVar), b);
                hfmVar.Z();
            }
            hfdVar2 = b;
            dwif.a(str, ffjiVar, hviVar2, false, null, hpx.d(1321871350, new dnmh(dnmkVar), b), hpnVar, null, new euw(3, null, dnmkVar.f + (-1) != 0 ? 1 : 4, 0, 122), null, 0, 0, null, null, hfdVar2, 12582912, 0, 0);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnme
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnmk dnmkVar2 = dnmk.this;
                    int i5 = i;
                    dnmi.b(dnmkVar2, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

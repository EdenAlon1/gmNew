package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czbr {
    public static final hik a = new hky(new ffix() { // from class: czbk
        @Override // defpackage.ffix
        public final Object invoke() {
            hik hikVar = czbr.a;
            throw new IllegalStateException("PopupCameraLoader must be provided");
        }
    });

    public static final czal a(hkx hkxVar) {
        return (czal) hkxVar.a();
    }

    public static final void b(final fgdj fgdjVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1953143001);
        if (i3 == 0) {
            i2 = (true != b.F(fgdjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hkx a2 = hkf.a(fgdjVar, b);
            if (a(a2) == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: czbi
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int a3 = hip.a(i | 1);
                            czbr.b(fgdj.this, (hfd) obj, a3);
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            czal a3 = a(a2);
            a3.getClass();
            czbe czbeVar = a3.a;
            cyyj cyyjVar = czbeVar.i;
            czaj czajVar = cyyjVar != null ? cyyjVar.e : null;
            b.v(-1395870245);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            cyxb cyxbVar = czbeVar.j;
            b.v(-1395865854);
            boolean D = b.D(czbeVar) | b.D(czajVar);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new czbl(czbeVar, czajVar, hhoVar, null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hgs.f(czajVar, cyxbVar, (ffjm) R2, b);
            cwn.b(null, hpx.d(-1090895593, new czbo(hhoVar, czbeVar, a2), b), b, 48);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: czbj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int a4 = hip.a(i | 1);
                    czbr.b(fgdj.this, (hfd) obj, a4);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(cvo cvoVar, czal czalVar, crw crwVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hvi a2;
        hvi c2;
        final czal czalVar2;
        hfd hfdVar2;
        final cvo cvoVar2 = cvoVar;
        final crw crwVar2 = crwVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(714857759);
        if (i3 == 0) {
            i2 = (true != b.D(cvoVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(czalVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(crwVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            czalVar2 = czalVar;
            hfdVar2 = b;
        } else {
            czbe czbeVar = czalVar.a;
            rva a3 = rvd.a(b);
            dji a4 = dix.a(0, b, 6, 0);
            czbe czbeVar2 = czalVar.a;
            jzn jznVar = (jzn) b.e(jdr.e);
            czbd czbdVar = czbeVar2.k;
            float min = Math.min(a4.c() / jznVar.em(true != czbdVar.b ? 64.0f : 96.0f), 1.0f);
            c = ebs.c(hvi.e, 1.0f);
            a2 = dee.a(c, ibw.g, idb.a);
            b.v(33770967);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: czbf
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        hik hikVar = czbr.a;
                        jkvVar.getClass();
                        jks.a(jkvVar);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c2 = jjs.c(a2, false, (ffji) R);
            hpn d = hpx.d(-397212701, new czbp(czbdVar, cvoVar2, czbeVar, crwVar2, min), b);
            b.v(33792414);
            ecd dzhVar = atiz.a() ? new dzh() : dwim.a(b);
            hfmVar.Z();
            czalVar2 = czalVar;
            cvoVar2 = cvoVar;
            crwVar2 = crwVar;
            hfdVar2 = b;
            dwio.a(c2, d, null, null, null, 0, 0L, 0L, dzhVar, hpx.d(-2097726418, new czbq(czalVar2, a4, cvoVar, czbeVar, crwVar, czbdVar, min), b), hfdVar2, 805306416, 252);
            if (!atiz.a()) {
                cwni.a(a3, ibw.g, false, null, hfdVar2, 48, 12);
            }
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: czbg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvo cvoVar3 = cvo.this;
                    int i4 = i;
                    czal czalVar3 = czalVar2;
                    int a5 = hip.a(i4 | 1);
                    czbr.c(cvoVar3, czalVar3, crwVar2, (hfd) obj, a5);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final czbe czbeVar, hfd hfdVar, final int i) {
        int i2;
        cyph cyphVar;
        cyph cyphVar2;
        hfd b = hfdVar.b(1956115426);
        if ((i & 6) == 0) {
            i2 = (true != b.D(czbeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            b.v(-116568591);
            if (czbeVar.k.d && (cyphVar2 = czbeVar.f) != null) {
                cypm.a(cyphVar2, b, 0);
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            czda.a(czbeVar.c, b, 0);
            cyou.a(czbeVar.e, b, 0);
            cyqi.a(czbeVar.d, b, 0);
            cyxq.a(czbeVar.g, b, 0);
            cyrt cyrtVar = (cyrt) hkt.b(czbeVar.h, null, null, b, 2).a();
            b.v(-116551004);
            if (cyrtVar != null) {
                cyrx.a(cyrtVar, b, 0);
            }
            hfmVar.Z();
            if (!czbeVar.k.d && (cyphVar = czbeVar.f) != null) {
                cypm.a(cyphVar, b, 0);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: czbh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int a2 = hip.a(i | 1);
                    czbr.d(czbe.this, (hfd) obj, a2);
                    return ffcu.a;
                }
            };
        }
    }
}

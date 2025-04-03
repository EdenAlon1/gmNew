package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czah {
    public static final float a(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    public static final cjwi b(hho hhoVar) {
        return (cjwi) hhoVar.a();
    }

    public static final void c(final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-176963545);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            b.v(-263087054);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffix() { // from class: cyyr
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffix.this.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwhl.b((ffix) R, null, false, null, null, cyxv.a, b, 1572864, 62);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyys
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    czah.c(ffix.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final eot eotVar, boolean z, hfd hfdVar, final int i, final int i2) {
        int i3;
        long f;
        hvi a;
        String a2;
        hvi a3;
        final boolean z2 = z;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-1886508190);
        int i5 = 4;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(eotVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        boolean z3 = i6 == 0;
        int i7 = 32;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.E(z2) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            z2 &= z3;
            int b2 = eotVar.b();
            final int i8 = 0;
            while (i8 < b2) {
                if (eotVar.j() == i8) {
                    b.v(199602465);
                    f = gft.a(b).q;
                    ((hfm) b).Z();
                } else {
                    b.v(199604299);
                    f = iby.f(ibw.d(r12), ibw.c(r12), ibw.b(r12), 0.35f, ibw.f(gft.a(b).q));
                    ((hfm) b).Z();
                }
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = hgs.a(ffhe.a, b);
                    hfmVar.ad(R);
                }
                final ffsk ffskVar = (ffsk) R;
                b.v(199607754);
                boolean F = b.F(ffskVar) | ((i3 & 112) == i7) | ((i3 & 14) == i5) | b.B(i8);
                Object R2 = hfmVar.R();
                if (F || R2 == hfc.a) {
                    R2 = new ffix() { // from class: cyzb
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            axol.k(ffsk.this, null, new cyzc(z2, eotVar, i8, null), 3);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R2);
                }
                final ffix ffixVar = (ffix) R2;
                hfmVar.Z();
                hvi a4 = hvr.a(hvi.e, 100.0f);
                b.v(199618764);
                boolean D = b.D(ffixVar);
                Object R3 = hfmVar.R();
                if (D || R3 == hfc.a) {
                    R3 = new ffix() { // from class: cyyl
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffix.this.invoke();
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R3);
                }
                hfmVar.Z();
                a = dee.a(hxo.a(eba.d(dfb.d(a4, false, null, (ffix) R3, 7), 12.0f), eqm.a), f, idb.a);
                hvi c = dek.c(ebs.k(a, 24.0f), 1.0f, gft.a(b).q, eqm.a);
                int j = eotVar.j();
                if (j == i8) {
                    b.v(199629835);
                    a2 = jii.a(R.string.current_picture_navigation_button_content_description, b);
                    hfmVar.Z();
                } else if (j == 0) {
                    b.v(199633128);
                    a2 = jii.a(R.string.next_picture_navigation_button_content_description, b);
                    hfmVar.Z();
                } else {
                    b.v(199636940);
                    a2 = jii.a(R.string.previous_picture_navigation_button_content_description, b);
                    hfmVar.Z();
                }
                a3 = dlsj.a(c, a2, true);
                dyc.b(a3, b, 0);
                i8++;
                i5 = 4;
                i7 = 32;
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyym
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    eot eotVar2 = eot.this;
                    int i9 = i;
                    czah.d(eotVar2, z2, (hfd) obj, hip.a(i9 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final cvo cvoVar, final List list, final eot eotVar, final boolean z, final boolean z2, final crw crwVar, hfd hfdVar, final int i) {
        int i2;
        boolean z3;
        hvi d;
        emx emxVar;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-707362796);
        if (i3 == 0) {
            i2 = (true != b.D(cvoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(eotVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.E(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(crwVar) ? 65536 : 131072;
        }
        int i4 = i2;
        if ((74899 & i4) == 74898 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            czai czaiVar = (czai) list.get(eotVar.j());
            b.v(1717313264);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(null, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            jzn jznVar = (jzn) b.e(jdr.e);
            b.v(1717316934);
            hvi hviVar = hvi.e;
            if (z) {
                hve hveVar = hvi.e;
                cvn b2 = cvoVar.b("photoSelector_0", b);
                int i5 = cvm.c;
                z3 = false;
                hviVar = cvg.a(cvoVar, hveVar, b2, crwVar, ctt.l(cxu.c(500, 0, new cyh(0.2f, 0.0f, 0.0f, 1.0f), 2), 2), ctt.m(cxu.c(150, 0, new cyh(0.2f, 0.0f, 0.0f, 1.0f), 2), 2), cvl.a());
            } else {
                z3 = false;
            }
            hfmVar.Z();
            int i6 = huo.a;
            ipn a = dyc.a(hum.a, z3);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b, hviVar);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b3, iss.c);
            d = ebs.d(hvi.e, 1.0f);
            hvi a3 = hvr.a(d, 10.0f);
            if (l(hhoVar) != null) {
                jzq l = l(hhoVar);
                l.getClass();
                emxVar = new emw(l.a);
            } else {
                emxVar = emv.a;
            }
            hfdVar2 = b;
            eno.c(eotVar, a3, null, emxVar, 0, 0.0f, null, null, false, null, null, null, hpx.d(1711609691, new cyzk(eotVar, list, jznVar, hhoVar, z2, czaiVar), b), hfdVar2, ((i4 >> 6) & 14) | 48, 24576, 16372);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyyn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvo cvoVar2 = cvo.this;
                    List list2 = list;
                    eot eotVar2 = eotVar;
                    boolean z4 = z;
                    boolean z5 = z2;
                    czah.e(cvoVar2, list2, eotVar2, z4, z5, crwVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final cvo cvoVar, final cyyj cyyjVar, final crw crwVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(160957385);
        if (i3 == 0) {
            i2 = (true != b.D(cvoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(cyyjVar) : b.F(cyyjVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(crwVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            dwhg.a(dwfv.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15), null, null, hpx.d(871282531, new cyzr(cyyjVar, cvoVar, crwVar), b), b, 3072, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyyk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvo cvoVar2 = cvo.this;
                    cyyj cyyjVar2 = cyyjVar;
                    int i4 = i;
                    czah.f(cvoVar2, cyyjVar2, crwVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0396  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v22 */
    @defpackage.ffbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.cvo r36, final java.util.List r37, final defpackage.cyxt r38, final defpackage.czaj r39, final boolean r40, final defpackage.crw r41, defpackage.hfd r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czah.g(cvo, java.util.List, cyxt, czaj, boolean, crw, hfd, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0304  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final defpackage.cvo r24, final java.util.List r25, final defpackage.cyxt r26, final defpackage.czaj r27, final boolean r28, final defpackage.crw r29, defpackage.hfd r30, final int r31) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czah.h(cvo, java.util.List, cyxt, czaj, boolean, crw, hfd, int):void");
    }

    public static final void i(final boolean z, final cyxt cyxtVar, final cjwi cjwiVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1715959082);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(cyxtVar) : b.F(cyxtVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(cjwiVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else if (z) {
            b.v(989728507);
            b.v(1140306202);
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && b.F(cyxtVar));
            boolean z3 = (i2 & 896) == 256;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z3 | z2) || R == hfc.a) {
                R = new ffix() { // from class: cyyo
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        cyxt.this.b.invoke(cjwiVar);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            ffix ffixVar = (ffix) R;
            hfmVar.Z();
            a = dlsj.a(hvi.e, cyxtVar.a, true);
            dwfj.a(ffixVar, a, false, null, null, null, null, null, hpx.d(-1928920597, new czaf(cyxtVar), b), b, 805306368, 508);
            b = b;
            hfmVar.Z();
        } else {
            b.v(989913918);
            b.v(1140312817);
            hfm hfmVar2 = (hfm) b;
            Object R2 = hfmVar2.R();
            if (R2 == hfc.a) {
                R2 = new ffix() { // from class: cyyp
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return ffcu.a;
                    }
                };
                hfmVar2.ad(R2);
            }
            hfmVar2.Z();
            dwfj.b((ffix) R2, null, false, null, null, null, null, hpx.d(-435577800, new czag(cyxtVar), b), b, 805306758, 506);
            hfmVar2.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyyq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z4 = z;
                    cyxt cyxtVar2 = cyxtVar;
                    int i4 = i;
                    czah.i(z4, cyxtVar2, cjwiVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final String str, final ffix ffixVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(192376337);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            dweu.a(hpx.d(563578837, new czad(z, str), b), null, hpx.d(908406999, new czae(ffixVar), b), null, 0.0f, null, dwkh.b(ibw.g, 0L, 0L, b, 62), null, b, 390, 186);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyyt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    ffix ffixVar2 = ffixVar;
                    int i4 = i;
                    czah.j(str2, ffixVar2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final float k(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    private static final jzq l(hho hhoVar) {
        return (jzq) hhoVar.a();
    }

    private static final jzq m(hho hhoVar) {
        return (jzq) hhoVar.a();
    }

    private static final cjwi n(hho hhoVar) {
        return (cjwi) hhoVar.a();
    }
}

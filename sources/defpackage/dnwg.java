package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwg {
    public static final void a(final dmzz dmzzVar, final long j, final String str, hfd hfdVar, final int i) {
        int i2;
        long j2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(162596898);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= true != b.C(j2) ? 16 : 32;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(str) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            qgx a2 = qgz.a(new qhb[]{qgz.b(qdg.a, Integer.valueOf(iby.b(j2)), new String[]{"**"}, b), qgz.b(qdg.b, Integer.valueOf(iby.b(j2)), new String[]{"**"}, b)}, b);
            qgp d = qhj.d(new qgu(true != ((Boolean) dooy.b(b).f.invoke()).booleanValue() ? R.raw.animated_icons : R.raw.animated_icons_v2), b);
            qci a3 = d.a();
            Map map = dnvt.a;
            ffcf ffcfVar = (ffcf) dnvt.a.get(dmzzVar);
            String str2 = ffcfVar != null ? (String) ffcfVar.a : null;
            ffcf ffcfVar2 = (ffcf) dnvt.a.get(dmzzVar);
            final qgg a4 = qfl.a(a3, false, false, new qgj(str2, ffcfVar2 != null ? (String) ffcfVar2.b : null, 4), 0.0f, 0, b, 0, 1006);
            if (d.a() != null) {
                a = dlsj.a(hvi.e, str, true);
                qci a5 = d.a();
                b.v(47773805);
                boolean D = b.D(a4);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (D || R == hfc.a) {
                    R = new ffix() { // from class: dnwd
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            return Float.valueOf(((Number) qgg.this.a()).floatValue());
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                qgf.c(a5, (ffix) R, a, null, a2, null, null, false, b, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS, 0, 7928);
                b = b;
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnwe
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    long j3 = j;
                    dnwg.a(dmzzVar2, j3, str, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final hvi hviVar, final dnwj dnwjVar, final boolean z, final boolean z2, hfd hfdVar, final int i) {
        hvi hviVar2;
        int i2;
        boolean z3;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(571871857);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnwjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= true != b.E(z3) ? 1024 : 2048;
        } else {
            z3 = z2;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            h(hviVar2, ((Boolean) dooy.b(b).f.invoke()).booleanValue() ? dmzz.dM : dmzz.dL, z, z3, m(dnwjVar, 1, b), new ibw(o(dnwjVar, 1, b)), n(1, dnwjVar, b), jii.a(R.string.delivered_content_description, b), hfdVar2, i2 & 8078);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnvx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dnwj dnwjVar2 = dnwjVar;
                    boolean z4 = z;
                    dnwg.b(hviVar3, dnwjVar2, z4, z2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(long j, hfd hfdVar, final int i) {
        int i2;
        final long j2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1204388466);
        if (i3 == 0) {
            i2 = (true != b.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            j2 = j;
        } else {
            j2 = j;
            dwho.a(dnaa.a(dmzz.dN, b), null, null, j2, b, ((i2 << 9) & 7168) | 48, 4);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnwa
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnwg.c(j2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final hvi hviVar, final dnwj dnwjVar, final boolean z, final boolean z2, hfd hfdVar, final int i) {
        hvi hviVar2;
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-366685281);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnwjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z2) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            h(hviVar2, ((Boolean) dooy.b(b).f.invoke()).booleanValue() ? dmzz.dM : dmzz.dL, z, z2, m(dnwjVar, 2, b), null, n(2, dnwjVar, b), jii.a(R.string.read_content_description, b), hfdVar2, (i2 & 14) | 196608 | (i2 & 896) | (i2 & 7168));
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnvy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dnwj dnwjVar2 = dnwjVar;
                    boolean z3 = z;
                    dnwg.d(hviVar3, dnwjVar2, z3, z2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final hvi hviVar, final dnwj dnwjVar, final boolean z, final boolean z2, hfd hfdVar, final int i) {
        hvi hviVar2;
        int i2;
        boolean z3;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1856655687);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnwjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= true != b.E(z3) ? 1024 : 2048;
        } else {
            z3 = z2;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            h(hviVar2, dmzz.dK, z, z3, m(dnwjVar, 3, b), new ibw(o(dnwjVar, 3, b)), n(3, dnwjVar, b), jii.a(R.string.sending_content_description, b), hfdVar2, (i2 & 14) | 48 | (i2 & 896) | (i2 & 7168));
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnwb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dnwj dnwjVar2 = dnwjVar;
                    boolean z4 = z;
                    dnwg.e(hviVar3, dnwjVar2, z4, z2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final hvi hviVar, final dnwj dnwjVar, final boolean z, final boolean z2, hfd hfdVar, final int i) {
        hvi hviVar2;
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-411623391);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnwjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z2) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            h(hviVar2, dmzz.dR, z, z2, m(dnwjVar, 4, b), new ibw(o(dnwjVar, 4, b)), n(4, dnwjVar, b), jii.a(R.string.sent_content_description, b), hfdVar2, (i2 & 14) | 48 | (i2 & 896) | (i2 & 7168));
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnvv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dnwj dnwjVar2 = dnwjVar;
                    boolean z3 = z;
                    dnwg.f(hviVar3, dnwjVar2, z3, z2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final dmzz dmzzVar, final boolean z, final boolean z2, long j, final String str, hfd hfdVar, final int i) {
        int i2;
        int i3;
        hfm hfmVar;
        long j2 = j;
        int i4 = i & 6;
        hfd b = hfdVar.b(240172413);
        if (i4 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.C(j2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(str) ? 8192 : 16384;
        }
        int i5 = i2;
        if ((i5 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            int i6 = i5 & 14;
            hve hveVar = hvi.e;
            int i7 = huo.a;
            ipn a = dyc.a(hum.a, true);
            int a2 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, hveVar);
            int i8 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            if (z2) {
                b.v(1675835294);
                int i9 = i5 >> 6;
                a(dmzzVar, j2, str, b, i6 | (i9 & 112) | (i9 & 896));
                hfmVar2.Z();
                j2 = j;
                i3 = i5;
                hfmVar = hfmVar2;
            } else {
                b.v(1675943391);
                i3 = i5;
                hfmVar = hfmVar2;
                j2 = j;
                dwho.a(dnaa.a(dmzzVar, b), str, null, j2, b, ((i5 >> 9) & 112) | (i5 & 7168), 4);
                hfmVar.Z();
            }
            b.v(1162444710);
            if (z) {
                c(j2, b, (i3 >> 9) & 14);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            final long j3 = j2;
            L.d = new ffjm() { // from class: dnvz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    boolean z3 = z;
                    boolean z4 = z2;
                    long j4 = j3;
                    dnwg.g(dmzzVar2, z3, z4, j4, str, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final hvi hviVar, final dmzz dmzzVar, final boolean z, final boolean z2, final long j, final ibw ibwVar, final long j2, final String str, hfd hfdVar, final int i) {
        int i2;
        dmzz dmzzVar2;
        boolean z3;
        long j3;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(387706614);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            dmzzVar2 = dmzzVar;
            i2 |= true != b.D(dmzzVar2) ? 16 : 32;
        } else {
            dmzzVar2 = dmzzVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= true != b.E(z3) ? 1024 : 2048;
        } else {
            z3 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(ibwVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            j3 = j2;
            i2 |= true != b.C(j3) ? 524288 : 1048576;
        } else {
            j3 = j2;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.D(str) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((4793491 & i2) == 4793490 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(500906593);
            boolean z4 = (57344 & i2) == 16384;
            boolean z5 = (458752 & i2) == 131072;
            boolean z6 = (i2 & 896) == 256;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z4 | z5 | z6) || R == hfc.a) {
                R = new ffji() { // from class: dnvu
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ifr ifrVar = (ifr) obj;
                        ifrVar.getClass();
                        ifq.e(ifrVar, j, 0.0f, 0L, null, 0, 126);
                        ibw ibwVar2 = ibwVar;
                        if (ibwVar2 != null) {
                            boolean z7 = z;
                            long b2 = ifrVar.b();
                            ifq.d(ifrVar, ibwVar2.i, 75.0f, true != z7 ? 360.0f : 300.0f, 0L, 0L, new ifv(ifrVar.em((Math.max(Float.intBitsToFloat((int) ((b2 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (b2 & 2147483647L))) / ifrVar.em(24.0f)) * 1.2f), 0.0f, 1, 0, 26), 880);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hfdVar2 = b;
            gpa.c(hxs.a(hviVar, (ffji) R), null, ibw.g, 0L, 0.0f, 0.0f, null, hpx.d(-742536751, new dnwf(dmzzVar2, z, z3, j3, str), b), hfdVar2, 122);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnvw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    dmzz dmzzVar3 = dmzzVar;
                    boolean z7 = z;
                    boolean z8 = z2;
                    long j4 = j;
                    ibw ibwVar2 = ibwVar;
                    long j5 = j2;
                    dnwg.h(hviVar2, dmzzVar3, z7, z8, j4, ibwVar2, j5, str, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final dnwi dnwiVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        dnwiVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1141641830);
        if (i3 == 0) {
            i2 = (true != b.D(dnwiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            int i4 = dnwiVar.d - 1;
            int i5 = (i2 >> 3) & 14;
            if (i4 == 0) {
                hviVar2 = hviVar;
                b.v(-587235830);
                b(hviVar2, dnwiVar.a, dnwiVar.b, dnwiVar.c, b, i5);
                ((hfm) b).Z();
            } else if (i4 == 1) {
                hviVar2 = hviVar;
                b.v(-587233019);
                d(hviVar2, dnwiVar.a, dnwiVar.b, dnwiVar.c, b, i5);
                ((hfm) b).Z();
            } else if (i4 != 2) {
                b.v(-587227515);
                hviVar2 = hviVar;
                f(hviVar2, dnwiVar.a, dnwiVar.b, dnwiVar.c, b, i5);
                ((hfm) b).Z();
            } else {
                hviVar2 = hviVar;
                b.v(-587230264);
                e(hviVar2, dnwiVar.a, dnwiVar.b, dnwiVar.c, b, i5);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnwc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnwi dnwiVar2 = dnwi.this;
                    int i6 = i;
                    dnwg.i(dnwiVar2, hviVar2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final long j(dnwj dnwjVar, hfd hfdVar) {
        long f;
        hfdVar.v(-2022087386);
        if (dfq.a(hfdVar)) {
            hfdVar.v(897941245);
            if (dnwjVar == dnwj.c || dnwjVar == dnwj.b || dnwjVar == dnwj.a) {
                f = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.9f, ibw.f(ibw.d));
            } else {
                if (dnwjVar != dnwj.d) {
                    throw new ffcd();
                }
                f = gft.a(hfdVar).r;
            }
            ((hfm) hfdVar).Z();
        } else {
            hfdVar.v(898178395);
            if (dnwjVar == dnwj.c || dnwjVar == dnwj.a) {
                f = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.9f, ibw.f(ibw.d));
            } else {
                if (dnwjVar != dnwj.b && dnwjVar != dnwj.d) {
                    throw new ffcd();
                }
                f = gft.a(hfdVar).s;
            }
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return f;
    }

    private static final long k(dnwj dnwjVar, hfd hfdVar) {
        long f;
        hfdVar.v(1596296434);
        if (dfq.a(hfdVar)) {
            int ordinal = dnwjVar.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                f = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), 0.9f, ibw.f(ibw.d));
            } else {
                if (ordinal != 3) {
                    throw new ffcd();
                }
                f = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.8f, ibw.f(ibw.a));
            }
        } else if (dnwjVar == dnwj.c || dnwjVar == dnwj.a) {
            f = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), 0.9f, ibw.f(ibw.d));
        } else if (dnwjVar == dnwj.b) {
            f = gft.a(hfdVar).s;
        } else {
            if (dnwjVar != dnwj.d) {
                throw new ffcd();
            }
            f = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.8f, ibw.f(ibw.a));
        }
        ((hfm) hfdVar).Z();
        return f;
    }

    private static final long l(dnwj dnwjVar, hfd hfdVar) {
        long j;
        hfdVar.v(439973590);
        if (dfq.a(hfdVar)) {
            hfdVar.v(-75960471);
            int ordinal = dnwjVar.ordinal();
            if (ordinal == 0) {
                hfdVar.v(-1249374459);
                j = gft.a(hfdVar).q;
                ((hfm) hfdVar).Z();
            } else if (ordinal == 1) {
                hfdVar.v(-1249372404);
                j = gft.a(hfdVar).s;
                ((hfm) hfdVar).Z();
            } else if (ordinal == 2) {
                hfdVar.v(-1249370235);
                j = gft.a(hfdVar).q;
                ((hfm) hfdVar).Z();
            } else {
                if (ordinal != 3) {
                    hfdVar.v(-1249376145);
                    ((hfm) hfdVar).Z();
                    throw new ffcd();
                }
                hfdVar.v(-1249368246);
                j = gft.a(hfdVar).r;
                ((hfm) hfdVar).Z();
            }
            ((hfm) hfdVar).Z();
        } else {
            hfdVar.v(-75671520);
            int ordinal2 = dnwjVar.ordinal();
            if (ordinal2 == 0) {
                hfdVar.v(-1249365140);
                j = gft.a(hfdVar).F;
                ((hfm) hfdVar).Z();
            } else if (ordinal2 == 1) {
                hfdVar.v(-1249362868);
                j = gft.a(hfdVar).s;
                ((hfm) hfdVar).Z();
            } else if (ordinal2 == 2) {
                hfdVar.v(-1249360692);
                j = gft.a(hfdVar).F;
                ((hfm) hfdVar).Z();
            } else {
                if (ordinal2 != 3) {
                    hfdVar.v(-1249366824);
                    ((hfm) hfdVar).Z();
                    throw new ffcd();
                }
                hfdVar.v(-1249358491);
                j = gft.a(hfdVar).q;
                ((hfm) hfdVar).Z();
            }
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return j;
    }

    private static final long m(dnwj dnwjVar, int i, hfd hfdVar) {
        long j;
        hfdVar.v(-721876251);
        if (i != 2) {
            j = ibw.g;
        } else if (((Boolean) dooy.b(hfdVar).f.invoke()).booleanValue()) {
            hfdVar.v(-461366520);
            hfdVar.v(2096632330);
            if (dfq.a(hfdVar)) {
                hfdVar.v(911388139);
                int ordinal = dnwjVar.ordinal();
                if (ordinal == 0) {
                    hfdVar.v(1830516801);
                    j = gft.a(hfdVar).q;
                    ((hfm) hfdVar).Z();
                } else if (ordinal == 1) {
                    hfdVar.v(1830518856);
                    j = gft.a(hfdVar).s;
                    ((hfm) hfdVar).Z();
                } else if (ordinal == 2) {
                    hfdVar.v(1830521025);
                    j = gft.a(hfdVar).q;
                    ((hfm) hfdVar).Z();
                } else {
                    if (ordinal != 3) {
                        hfdVar.v(1830515117);
                        ((hfm) hfdVar).Z();
                        throw new ffcd();
                    }
                    hfdVar.v(1830523016);
                    j = gft.a(hfdVar).v;
                    ((hfm) hfdVar).Z();
                }
                ((hfm) hfdVar).Z();
            } else {
                hfdVar.v(911679229);
                int ordinal2 = dnwjVar.ordinal();
                if (ordinal2 == 0) {
                    hfdVar.v(1830526184);
                    j = gft.a(hfdVar).F;
                    ((hfm) hfdVar).Z();
                } else if (ordinal2 == 1) {
                    hfdVar.v(1830528456);
                    j = gft.a(hfdVar).s;
                    ((hfm) hfdVar).Z();
                } else if (ordinal2 == 2) {
                    hfdVar.v(1830530632);
                    j = gft.a(hfdVar).F;
                    ((hfm) hfdVar).Z();
                } else {
                    if (ordinal2 != 3) {
                        hfdVar.v(1830524507);
                        ((hfm) hfdVar).Z();
                        throw new ffcd();
                    }
                    hfdVar.v(1830532840);
                    j = gft.a(hfdVar).s;
                    ((hfm) hfdVar).Z();
                }
                ((hfm) hfdVar).Z();
            }
            hfm hfmVar = (hfm) hfdVar;
            hfmVar.Z();
            hfmVar.Z();
        } else {
            hfdVar.v(-461320950);
            j = j(dnwjVar, hfdVar);
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return j;
    }

    private static final long n(int i, dnwj dnwjVar, hfd hfdVar) {
        long k;
        hfdVar.v(454383993);
        if (i == 2) {
            hfdVar.v(-433421590);
            hfdVar.v(1957173035);
            if (dfq.a(hfdVar)) {
                hfdVar.v(1133809071);
                int ordinal = dnwjVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    hfdVar.v(1133943487);
                    k = gft.a(hfdVar).v;
                    ((hfm) hfdVar).Z();
                } else if (ordinal == 2) {
                    hfdVar.v(1133846922);
                    k = dooy.e(hfdVar).Y;
                    ((hfm) hfdVar).Z();
                } else {
                    if (ordinal != 3) {
                        hfdVar.v(1006405993);
                        ((hfm) hfdVar).Z();
                        throw new ffcd();
                    }
                    hfdVar.v(1134028830);
                    ((hfm) hfdVar).Z();
                    k = ibw.d;
                }
                ((hfm) hfdVar).Z();
            } else {
                hfdVar.v(1134080724);
                int ordinal2 = dnwjVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            hfdVar.v(1134118792);
                            k = gft.a(hfdVar).a;
                            ((hfm) hfdVar).Z();
                        } else if (ordinal2 != 3) {
                            hfdVar.v(1006414756);
                            ((hfm) hfdVar).Z();
                            throw new ffcd();
                        }
                    }
                    hfdVar.v(1134295678);
                    ((hfm) hfdVar).Z();
                    k = ibw.d;
                } else {
                    hfdVar.v(1134191270);
                    k = gft.a(hfdVar).q;
                    ((hfm) hfdVar).Z();
                }
                ((hfm) hfdVar).Z();
            }
            hfm hfmVar = (hfm) hfdVar;
            hfmVar.Z();
            hfmVar.Z();
        } else {
            hfdVar.v(-433373447);
            if (((Boolean) dooy.b(hfdVar).f.invoke()).booleanValue()) {
                hfdVar.v(-433327102);
                k = l(dnwjVar, hfdVar);
                ((hfm) hfdVar).Z();
            } else {
                hfdVar.v(-433274588);
                k = k(dnwjVar, hfdVar);
                ((hfm) hfdVar).Z();
            }
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return k;
    }

    private static final long o(dnwj dnwjVar, int i, hfd hfdVar) {
        long k;
        hfdVar.v(-2067943737);
        if (i == 2) {
            hfdVar.v(1727104407);
            k = j(dnwjVar, hfdVar);
            ((hfm) hfdVar).Z();
        } else {
            hfdVar.v(1727152333);
            if (((Boolean) dooy.b(hfdVar).f.invoke()).booleanValue()) {
                hfdVar.v(1727198709);
                k = l(dnwjVar, hfdVar);
                ((hfm) hfdVar).Z();
            } else {
                hfdVar.v(1727245426);
                k = k(dnwjVar, hfdVar);
                ((hfm) hfdVar).Z();
            }
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return k;
    }
}

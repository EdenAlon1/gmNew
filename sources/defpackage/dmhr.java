package defpackage;

import androidx.compose.foundation.gestures.AnchoredDraggableElement;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmhr {
    public static final void a(final hvi hviVar, final String str, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-201331480);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar, 1.0f);
            hvi e = ebs.e(d, 56.0f);
            eql eqlVar = eqm.a;
            ebe ebeVar = dwfd.a;
            dwfj.a(ffixVar, e, false, eqlVar, dwfd.b(f(b), 0L, b, 14), null, null, null, hpx.d(-1879918376, new dmho(str), b), b, ((i2 >> 6) & 14) | 805306368, 484);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmhg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    String str2 = str;
                    int i4 = i;
                    dmhr.a(hviVar2, str2, ffixVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final hvi hviVar, final dly dlyVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hfm hfmVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1688664918);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dlyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjnVar) ? 128 : 256;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && b.I()) {
            b.s();
        } else {
            final jzn jznVar = (jzn) b.e(jdr.e);
            final long f = f(b);
            final long j = gft.a(b).c;
            d = ebs.d(hviVar, 1.0f);
            hvi a = hxo.a(d, eqm.a);
            b.v(618194431);
            boolean C = b.C(f) | b.C(j);
            boolean z = (i4 & 112) == 32;
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if ((C || z) || R == hfc.a) {
                hfmVar = hfmVar2;
                ffji ffjiVar = new ffji() { // from class: dmhl
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ifr ifrVar = (ifr) obj;
                        ifrVar.getClass();
                        dly dlyVar2 = dlyVar;
                        dmhe dmheVar = dmhe.a;
                        dmhe dmheVar2 = dmhe.b;
                        float a2 = dlyVar2.k().a(dmheVar);
                        float a3 = dlyVar2.k().a(dmheVar2);
                        float e = (ffmk.e(dlyVar2.a(), Math.min(a2, a3), Math.max(a2, a3)) - a2) / (a3 - a2);
                        float f2 = 1.0f;
                        if (!Float.isNaN(e)) {
                            if (e < 1.0E-6f) {
                                f2 = 0.0f;
                            } else if (e <= 0.999999f) {
                                f2 = Math.abs(e);
                            }
                        }
                        ifrVar.r(iby.i(f, j, f2), 0L, (r20 & 4) != 0 ? ifq.c(ifrVar.b(), 0L) : 0L, (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(ffjiVar);
                R = ffjiVar;
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            hvi a2 = hxs.a(a, (ffji) R);
            b.v(618198851);
            boolean D = b.D(jznVar) | z;
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new ffji() { // from class: dmhm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Object g;
                        boolean d2;
                        final kaf kafVar = (kaf) obj;
                        final jzn jznVar2 = jznVar;
                        ffji ffjiVar2 = new ffji() { // from class: dmhf
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                dpd dpdVar = (dpd) obj2;
                                dpdVar.getClass();
                                ffdb ffdbVar = new ffdb(dmhe.d);
                                while (ffdbVar.hasNext()) {
                                    jzn jznVar3 = jznVar2;
                                    kaf kafVar2 = kaf.this;
                                    dmhe dmheVar = (dmhe) ffdbVar.next();
                                    float em = (((int) (kafVar2.a >> 32)) - jznVar3.em(72.0f)) * dmheVar.c;
                                    dpdVar.a.add(dmheVar);
                                    if (dpdVar.b.length < dpdVar.a.size()) {
                                        float[] copyOf = Arrays.copyOf(dpdVar.b, dpdVar.a.size() + 2);
                                        copyOf.getClass();
                                        dpdVar.b = copyOf;
                                    }
                                    dpdVar.b[dpdVar.a.size() - 1] = em;
                                }
                                return ffcu.a;
                            }
                        };
                        dpd dpdVar = new dpd();
                        ffjiVar2.invoke(dpdVar);
                        List list = dpdVar.a;
                        float[] fArr = dpdVar.b;
                        int size = list.size();
                        fArr.getClass();
                        ffdo.a(size, fArr.length);
                        float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
                        copyOfRange.getClass();
                        dmu dmuVar = new dmu(list, copyOfRange);
                        dly dlyVar2 = dly.this;
                        if (Float.isNaN(dlyVar2.a())) {
                            g = dlyVar2.g();
                        } else {
                            g = dmuVar.b(dlyVar2.a());
                            if (g == null) {
                                g = dlyVar2.g();
                            }
                        }
                        if (!ffkj.e(dlyVar2.k(), dmuVar)) {
                            dlyVar2.c.b(dmuVar);
                            dif difVar = dlyVar2.b;
                            d2 = difVar.b.d(null);
                            if (d2) {
                                try {
                                    dlu dluVar = dlyVar2.d;
                                    float a3 = dlyVar2.k().a(g);
                                    if (!Float.isNaN(a3)) {
                                        dkw.a(dluVar, a3);
                                        dlyVar2.i(null);
                                    }
                                    dlyVar2.h(g);
                                    dlyVar2.j(g);
                                } finally {
                                    difVar.d();
                                }
                            } else {
                                dlyVar2.i(g);
                            }
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hvi a3 = iqd.a(a2, (ffji) R2);
            int i5 = i4 << 3;
            int i6 = huo.a;
            ipn a4 = dyc.a(hum.a, false);
            int a5 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a3);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a4, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ffjnVar.a(dyi.a, b, Integer.valueOf((((i5 & 7168) >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmhn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    dly dlyVar2 = dlyVar;
                    int i8 = i;
                    dmhr.b(hviVar2, dlyVar2, ffjnVar, (hfd) obj, hip.a(i8 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dly dlyVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1395994083);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != b.D(dlyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hvi d = eba.d(hvi.e, 4.0f);
            b.v(-801835539);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: dmhh
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((jzn) obj).getClass();
                        return new kaa(ffln.b(dly.this.c()) << 32);
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi g = ebs.g(ebs.j(dee.a(eau.a(d, (ffji) R), gft.a(b).p, eqm.a), 64.0f), 48.0f);
            dqs dqsVar = dqs.b;
            cxt cxtVar = dky.a;
            cyl cylVar = dooy.c(b).p;
            int i5 = dky.c << 9;
            ffji ffjiVar = dky.b;
            jzn jznVar = (jzn) b.e(jdr.e);
            int i6 = i4 | i5;
            boolean D = ((((i6 & 14) ^ 6) > 4 && b.D(dlyVar)) || (i6 & 6) == 4) | b.D(jznVar);
            if ((((i6 & 112) ^ 48) <= 32 || !b.D(ffjiVar)) && (i6 & 48) != 32) {
                z = false;
            }
            boolean D2 = D | z | b.D(cylVar);
            Object R2 = hfmVar.R();
            if (D2 || R2 == hfc.a) {
                R2 = dlj.a(dlyVar, jznVar, ffjiVar, cylVar);
                hfmVar.ad(R2);
            }
            hvi a = jfw.a(g.a(new AnchoredDraggableElement(dlyVar, dqsVar, (dtt) R2)), "slider_test_tag");
            int i7 = huo.a;
            ipn a2 = dyc.a(hum.e, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i8 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dwho.a(dnaa.a(dmzz.ah, b), null, ebs.h(hvi.e, 24.0f), gft.a(b).s, b, 384, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmhi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i9 = i;
                    dmhr.c(dly.this, (hfd) obj, hip.a(i9 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dyh dyhVar, final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1633952583);
        if (i3 == 0) {
            i2 = i | (true != b.D(dyhVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hve hveVar = hvi.e;
            int i4 = huo.a;
            hfdVar2 = b;
            dwjt.b(str, dyhVar.a(hveVar, hum.e), gft.a(b).d, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(b).h, hfdVar2, (i2 >> 3) & 14, 3120, 55288);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmhj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    int i5 = i;
                    dmhr.d(dyhVar2, str, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dmht dmhtVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-787446875);
        if (i3 == 0) {
            i2 = (true != b.D(dmhtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            int i4 = i2 >> 3;
            b.v(275511984);
            boolean z = dmhtVar.c.a && dlsp.b(b);
            int i5 = i4 & 14;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            if (z) {
                b.v(-48996715);
                a(hviVar, dmhtVar.a, dmhtVar.b, b, i5);
                hfmVar.Z();
            } else {
                b.v(-48889486);
                b.v(275517845);
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = new dly(dmhe.a);
                    hfmVar.ad(R);
                }
                dly dlyVar = (dly) R;
                hfmVar.Z();
                b(hviVar, dlyVar, hpx.d(-2123884570, new dmhp(dmhtVar, dlyVar), b), b, i5 | 432);
                Object f = dlyVar.f();
                ffix ffixVar = dmhtVar.b;
                b.v(275526570);
                int i6 = i2 & 14;
                Object R2 = hfmVar.R();
                if (i6 == 4 || R2 == hfc.a) {
                    R2 = new dmhq(dlyVar, dmhtVar, null);
                    hfmVar.ad(R2);
                }
                hfmVar.Z();
                hgs.f(f, ffixVar, (ffjm) R2, b);
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmhk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmht dmhtVar2 = dmht.this;
                    int i7 = i;
                    dmhr.e(dmhtVar2, hviVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final long f(hfd hfdVar) {
        hfdVar.v(-2000060728);
        long j = gft.a(hfdVar).G;
        ((hfm) hfdVar).Z();
        return j;
    }
}

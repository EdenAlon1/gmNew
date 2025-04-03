package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmx {
    public static final void a(final domr domrVar, final cyq cyqVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-336694401);
        if (i3 == 0) {
            i2 = (true != b.D(domrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(cyqVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-1145762475);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            Object obj = R;
            if (R == hfc.a) {
                czq czqVar = new czq(false);
                czqVar.d(true);
                hfmVar.ad(czqVar);
                obj = czqVar;
            }
            czq czqVar2 = (czq) obj;
            hfmVar.Z();
            b.v(-1145755818);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffji() { // from class: abms
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(-((Integer) obj2).intValue());
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            cru.a(czqVar2, null, ctt.e(cyqVar, (ffji) R2), null, null, hpx.d(-826734681, new abmv(domrVar), b), b, 196608, 26);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abmt
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    domr domrVar2 = domr.this;
                    int i4 = i;
                    abmx.a(domrVar2, cyqVar, (hfd) obj2, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        ffixVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1330771994);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            final lkr lkrVar = (lkr) b.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            b.v(-970038638);
            boolean F = b.F(lkrVar) | ((i2 & 14) == 4);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffji() { // from class: abmn
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        final ffix ffixVar2 = ffixVar;
                        lkp lkpVar = new lkp() { // from class: abmu
                            @Override // defpackage.lkp
                            public final void hg(lkr lkrVar2, lki lkiVar) {
                                if (lkiVar == lki.ON_RESUME) {
                                    ffix.this.invoke();
                                }
                            }
                        };
                        lkr lkrVar2 = lkr.this;
                        lkrVar2.P().c(lkpVar);
                        return new abmw(lkrVar2, lkpVar);
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.c(ffixVar, (ffji) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abmo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    abmx.b(ffix.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final domr domrVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(531409262);
        if (i3 == 0) {
            i2 = (true != b.D(domrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            domq.c(domrVar, jfw.a(hvr.a(hvi.e, 2.0f), "results_bar"), b, (i2 & 14) | 48);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abmp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    abmx.c(domr.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final abmm abmmVar, final hvi hviVar, gvo gvoVar, hfd hfdVar, final int i) {
        int i2;
        List list;
        final gvo gvoVar2 = gvoVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1639834145);
        if (i3 == 0) {
            i2 = (true != b.D(abmmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(gvoVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            hkx a = hkf.a(abmmVar.b, b);
            hkf.a(abmmVar.a, b);
            hkx a2 = hkf.a(abmmVar.c, b);
            hkx a3 = hkf.a(abmmVar.d, b);
            hkx a4 = hkf.a(abmmVar.e, b);
            b.v(294016924);
            if (f(a4) && e(a) != null) {
                dotb e = e(a);
                e.getClass();
                dotb e2 = e(a);
                e2.getClass();
                acu.a(e.b.f, e2.b.k, b, 0, 0);
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            b.v(294026677);
            int i4 = i2 & 14;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: abmq
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ioc iocVar = (ioc) obj;
                        iocVar.getClass();
                        abmm.this.f.invoke(Integer.valueOf((int) (iocVar.g() & 4294967295L)));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi a5 = ipx.a(hviVar, (ffji) R);
            dxq dxqVar = dxu.c;
            int i5 = huo.a;
            ipn a6 = dyo.a(dxqVar, hum.j, b, 0);
            int a7 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a5);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a6, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf = Integer.valueOf(a7);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-1970267078);
            dotb e3 = e(a);
            if (e3 == null) {
                gvoVar2 = gvoVar;
            } else {
                gvoVar2 = gvoVar;
                doti.b(e3, hvr.a(hvi.e, 3.0f), gvoVar2, null, (b.e(akfa.a) == akex.b) & (!f(a4)), b, (i2 & 896) | 48, 40);
            }
            hfmVar.Z();
            domr domrVar = (domr) a2.a();
            b.v(-1587567440);
            if (domrVar != null) {
                cyq cyqVar = dooy.c(b).c;
                b.v(1418436108);
                a(domrVar, cyqVar, b, 0);
                hfmVar.Z();
            }
            hfmVar.Z();
            srx.b((srq) a3.a(), hvr.a(hvi.e, 1.0f), b, 48);
            b.n();
            b.v(526156236);
            dotb e4 = e(a);
            if (e4 != null) {
                list = new ArrayList();
                Iterator it = e4.c.iterator();
                while (it.hasNext()) {
                    ffix ffixVar2 = ((dlsr) it.next()).j;
                    if (ffixVar2 != null) {
                        list.add(ffixVar2);
                    }
                }
            } else {
                list = ffel.a;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                b((ffix) it2.next(), b, 0);
            }
            hfmVar.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abmr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    abmm abmmVar2 = abmm.this;
                    hvi hviVar2 = hviVar;
                    int i7 = i;
                    abmx.d(abmmVar2, hviVar2, gvoVar2, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final dotb e(hkx hkxVar) {
        return (dotb) hkxVar.a();
    }

    private static final boolean f(hkx hkxVar) {
        return ((Boolean) hkxVar.a()).booleanValue();
    }
}

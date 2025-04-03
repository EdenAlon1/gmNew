package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dose {
    public static final void a(final dlsr dlsrVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(910636515);
        if (i3 == 0) {
            i2 = (true != b.D(dlsrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dmzz dmzzVar = dlsrVar.b;
            if (dmzzVar != null) {
                b.v(-1643278385);
                d(dlsrVar.c, hpx.d(1155135947, new dorr(dlsrVar, dmzzVar), b), b, 48);
                ((hfm) b).Z();
            } else {
                b.v(-1643177387);
                e(dlsrVar, b, i2 & 14);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dork
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dose.a(dlsr.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dlsr dlsrVar, final dmzz dmzzVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1841323421);
        if (i3 == 0) {
            i2 = (true != b.D(dlsrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmzzVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(1791351190);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            b.v(1791353285);
            int i4 = i2 & 14;
            Object R2 = hfmVar.R();
            if (i4 == 4 || R2 == hfc.a) {
                R2 = new ffix() { // from class: dorf
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dlsr dlsrVar2 = dlsr.this;
                        if (dlsrVar2.g.isEmpty()) {
                            dlsrVar2.k.invoke();
                        } else {
                            dose.c(hhoVar, true);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            ffix ffixVar = (ffix) R2;
            hfmVar.Z();
            hfdVar2 = b;
            dwhl.b(ffixVar, null, dlsrVar.g.isEmpty() ? dlsrVar.f : true, null, null, hpx.d(1258538175, new dors(dmzzVar, dlsrVar), b), hfdVar2, 1572864, 58);
            List list = dlsrVar.g;
            boolean z = dlsrVar.h;
            boolean booleanValue = ((Boolean) hhoVar.a()).booleanValue();
            hfdVar2.v(1791367157);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                R3 = new ffix() { // from class: dorg
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dose.c(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            k(list, z, booleanValue, (ffix) R3, hfdVar2, 3072);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dorh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlsr dlsrVar2 = dlsr.this;
                    int i5 = i;
                    dose.b(dlsrVar2, dmzzVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final void d(final boolean z, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-649054573);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (z) {
            b.v(-1918995078);
            hve hveVar = hvi.e;
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i5 = ist.a;
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
            hlc.b(b, b2, iss.c);
            dyi dyiVar = dyi.a;
            dwew.a(eau.b(dyiVar.a(hvi.e, hum.c), -10.0f, 10.0f), 0L, 0L, b, 0);
            ffjnVar.a(dyiVar, b, Integer.valueOf((i2 & 112) | 6));
            b.n();
            hfmVar.Z();
        } else {
            b.v(-1918781519);
            int i6 = i2 << 6;
            hve hveVar2 = hvi.e;
            int i7 = huo.a;
            ipn a3 = dyc.a(hum.a, false);
            int a4 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai2 = hfmVar2.ai();
            hvi b3 = huz.b(b, hveVar2);
            int i8 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                hfmVar2.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            ffjnVar.a(dyi.a, b, Integer.valueOf((((i6 & 7168) >> 6) & 112) | 6));
            b.n();
            hfmVar2.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dorq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i9 = i;
                    dose.d(z2, ffjnVar, (hfd) obj, hip.a(i9 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dlsr dlsrVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1914539188);
        if (i3 == 0) {
            i2 = (true != b.D(dlsrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            b.v(-111068214);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            b.v(-111066151);
            int i4 = i2 & 14;
            Object R2 = hfmVar.R();
            if (i4 == 4 || R2 == hfc.a) {
                R2 = new ffix() { // from class: doro
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dlsr dlsrVar2 = dlsr.this;
                        if (dlsrVar2.g.isEmpty()) {
                            dlsrVar2.k.invoke();
                        } else {
                            dose.f(hhoVar, true);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            ffix ffixVar = (ffix) R2;
            hfmVar.Z();
            dwfj.e(ffixVar, null, dlsrVar.g.isEmpty() ? dlsrVar.f : true, null, null, null, hpx.d(493951241, new doru(dlsrVar, hhoVar), b), b, 805306368, 506);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dorp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dose.e(dlsr.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final void g(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final void h(final dlsr dlsrVar, final boolean z, final boolean z2, hfd hfdVar, final int i) {
        int i2;
        dmzz dmzzVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1270813441);
        if (i3 == 0) {
            i2 = (true != b.D(dlsrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else if (!z && dlsrVar.f && (dmzzVar = dlsrVar.b) != null) {
            ffix ffixVar = dlsrVar.k;
            hvi hviVar = hvi.e;
            if (z2) {
                hviVar = eau.c(eba.j(hvi.e, 4.0f, 0.0f, 0.0f, 0.0f, 14), -4.0f, 0.0f, 2);
            }
            dwhl.b(ffixVar, hviVar, false, null, null, hpx.d(67325946, new dorx(dmzzVar, dlsrVar), b), b, 1572864, 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dord
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlsr dlsrVar2 = dlsr.this;
                    boolean z3 = z;
                    int i4 = i;
                    dose.h(dlsrVar2, z3, z2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final dlsr dlsrVar, final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        dmzz dmzzVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1384131308);
        if (i3 == 0) {
            i2 = (true != b.D(dlsrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            boolean z2 = dlsrVar.f;
            b.v(1491074785);
            hpn hpnVar = null;
            if (z && (dmzzVar = dlsrVar.b) != null) {
                hpnVar = hpx.d(1667525449, new dosc(dmzzVar, dlsrVar), b);
            }
            ((hfm) b).Z();
            dwhw.a(hpx.d(-1977622716, new dosd(dlsrVar), b), ffixVar, null, hpnVar, z2, null, null, b, ((i2 >> 3) & 112) | 6, 468);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dore
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlsr dlsrVar2 = dlsr.this;
                    boolean z3 = z;
                    int i4 = i;
                    dose.i(dlsrVar2, z3, ffixVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final List list, hfd hfdVar, final int i) {
        int i2 = i & 6;
        hfd b = hfdVar.b(-6680137);
        int i3 = i2 == 0 ? (true != b.F(list) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.E(false) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.v(-1191128863);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((dlsr) obj).d) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            ffcf ffcfVar = new ffcf(arrayList, arrayList2);
            List list2 = (List) ffcfVar.a;
            List list3 = (List) ffcfVar.b;
            b.v(-1191125031);
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                a((dlsr) it.next(), b, 0);
            }
            hfmVar.Z();
            if (!list2.isEmpty()) {
                b.v(-1191121166);
                Object R2 = hfmVar.R();
                if (R2 == hfc.a) {
                    R2 = new ffix() { // from class: dorl
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dose.g(hho.this, true);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R2);
                }
                hfmVar.Z();
                dwhl.b((ffix) R2, null, false, null, null, hpx.d(-451910032, new dorw(list2, hhoVar), b), b, 1572870, 62);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dorm
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    dose.j(list, (hfd) obj2, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(final List list, final boolean z, final boolean z2, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        boolean z3;
        int i3 = i & 6;
        hfd b = hfdVar.b(-381484834);
        if (i3 == 0) {
            i2 = (true != b.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z3 = z2;
            i2 |= true != b.E(z3) ? 128 : 256;
        } else {
            z3 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffixVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            if (list.isEmpty()) {
                hio L = b.L();
                if (L != null) {
                    final boolean z4 = z3;
                    L.d = new ffjm() { // from class: dori
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            List list2 = list;
                            boolean z5 = z;
                            boolean z6 = z4;
                            dose.k(list2, z5, z6, ffixVar, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            dwhw.b(z2, ffixVar, null, 0L, null, null, null, 0L, 0.0f, hpx.d(-357660455, new dorz(list, z, ffixVar), b), b, (i2 >> 6) & 126, 48, 2044);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dorj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    boolean z5 = z;
                    boolean z6 = z2;
                    dose.k(list2, z5, z6, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final List list, final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        idh a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1967271891);
        if (i3 == 0) {
            i2 = (true != b.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffixVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            hvi x = ebs.x(hvi.e, 192.0f, 0.0f, 2);
            if (((Boolean) dooy.b(b).j.invoke()).booleanValue()) {
                b.v(-453333170);
                a = gft.c(b).f;
                ((hfm) b).Z();
            } else {
                b.v(-453275169);
                ebe ebeVar = dwht.a;
                a = dwht.a(b);
                ((hfm) b).Z();
            }
            int i4 = i2 >> 6;
            dwhw.b(z, ffixVar, x, 0L, null, null, a, 0L, 0.0f, hpx.d(-1943447512, new dosb(list, ffixVar), b), b, (i4 & 14) | 384 | (i4 & 112), 48, 1976);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dorn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    boolean z2 = z;
                    int i5 = i;
                    dose.l(list2, z2, ffixVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

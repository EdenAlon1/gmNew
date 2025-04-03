package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmou {
    public static final void a(final dmov dmovVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(366201116);
        if (i3 == 0) {
            i2 = (true != b.D(dmovVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            List list = dmovVar.a;
            Integer num = dmovVar.b;
            dmog dmogVar = num != null ? (dmog) list.get(num.intValue()) : null;
            if (dmogVar == null || list.size() <= 1) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dmoj
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            dmou.a(dmov.this, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            b(dmovVar, dmogVar, b, i2 & 14);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dmok
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmou.a(dmov.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmov dmovVar, final dmog dmogVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-910740396);
        if (i3 == 0) {
            i2 = (true != b.D(dmovVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmogVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(102557143);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            b.v(102558989);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffix() { // from class: dmoh
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dmou.c(hho.this, !dmou.f(r0));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            dwhl.b((ffix) R2, null, false, null, null, hpx.d(1630715250, new dmoq(dmogVar, dmovVar, hhoVar), b), b, 1572870, 62);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmoi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmov dmovVar2 = dmov.this;
                    int i4 = i;
                    dmou.b(dmovVar2, dmogVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final void d(final dmov dmovVar, final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        ffixVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1809627965);
        if (i3 == 0) {
            i2 = (true != b.D(dmovVar) ? 2 : 4) | i;
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
            dwhw.b(z, ffixVar, null, 0L, null, null, null, 0L, 0.0f, hpx.d(-603841240, new dmot(dmovVar, ffixVar), b), b, (i2 >> 3) & 126, 48, 2044);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmol
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmov dmovVar2 = dmov.this;
                    boolean z2 = z;
                    int i4 = i;
                    dmou.d(dmovVar2, z2, ffixVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final String str, String str2, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        final String str3;
        int i3 = i & 6;
        hfd b = hfdVar.b(1903894843);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str2) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && b.I()) {
            b.s();
            str3 = str2;
            hfdVar2 = b;
        } else {
            hvi f = eba.f(hvi.e, 16.0f, 8.0f, 24.0f, 8.0f);
            dxq dxqVar = dxu.c;
            int i5 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, f);
            int i6 = ist.a;
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
            hfdVar2 = b;
            dwjt.b(str, null, gft.a(b).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).j, hfdVar2, i4 & 14, 0, 65530);
            str3 = str2;
            dwjt.b(str3, null, gft.a(hfdVar2).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar2).k, hfdVar2, (i4 >> 3) & 14, 0, 65530);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmon
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str4 = str;
                    int i7 = i;
                    dmou.e(str4, str3, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final boolean f(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }

    public static final void g(final doie doieVar, final String str, final String str2, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1514963409);
        if (i3 == 0) {
            i2 = (true != b.D(doieVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(str2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            h(doieVar, null, eba.j(hvi.e, 16.0f, 0.0f, 0.0f, 0.0f, 14), b, (i2 & 14) | 384);
            e(str, str2, b, (i2 >> 3) & 126);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmoo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doie doieVar2 = doie.this;
                    String str3 = str;
                    int i4 = i;
                    dmou.g(doieVar2, str3, str2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final doie doieVar, final String str, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        String str2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1986870141);
        if (i3 == 0) {
            i2 = (true != b.D(doieVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.v(-473725683);
            int i4 = huo.a;
            ipn a = dyc.a(hum.e, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
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
            if (doieVar == null || (str2 = Character.valueOf(doieVar.a).toString()) == null) {
                str2 = "";
            }
            dolc.a(str2, null, doieVar != null ? iby.c(doieVar.b) : ibw.h, new jyj(3), 0, 0, jpo.y(gft.d(b).n, 0L, 0L, null, null, null, "tnum", 0L, null, 0, 0, 0L, null, null, 0, 16777151), b, 0, 50);
            dmmi.c(dnaa.a(dmzz.aw, b), str, null, doieVar != null ? iby.c(doieVar.b) : ibw.h, b, i2 & 112, 4);
            b.n();
            hfmVar.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmom
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doie doieVar2 = doie.this;
                    String str3 = str;
                    int i6 = i;
                    dmou.h(doieVar2, str3, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

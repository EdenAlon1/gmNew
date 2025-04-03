package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnkk {
    public static final void a(ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1290508453);
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
            dwfj.e(ffixVar2, null, false, null, null, null, dnjw.c, b, (i2 & 14) | 805306368, 510);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnjz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnkk.a(ffix.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final List list, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-5201243);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            ffixVar2 = ffixVar;
            dwhw.b(z, ffixVar2, null, 0L, null, null, gft.c(b).f, 0L, 0.0f, hpx.d(-1654076982, new dnkh(list, ffixVar), b), b, (i2 & 14) | ((i2 >> 3) & 112), 48, 1980);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnjy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    List list2 = list;
                    int i4 = i;
                    dnkk.b(z2, list2, ffixVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dnkm dnkmVar, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(359207359);
        if (i3 == 0) {
            i2 = (true != b.D(dnkmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hpn d = hpx.d(420367343, new dnki(dnkmVar), b);
            b.v(-2000503363);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z | z2) || R == hfc.a) {
                R = new ffix() { // from class: dnkb
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dnkm.this.d.invoke();
                        ffixVar.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwhw.a(d, (ffix) R, null, hpx.d(1766354508, new dnkj(dnkmVar), b), false, null, null, b, 3078, 500);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnkc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnkm dnkmVar2 = dnkm.this;
                    int i4 = i;
                    dnkk.c(dnkmVar2, ffixVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final String str, String str2, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        final String str3;
        int i3 = i & 6;
        hfd b = hfdVar.b(1413944151);
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
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i5 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
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
            dwjt.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar2, i4 & 14, 0, 131070);
            str3 = str2;
            dwjt.b(str3, null, gft.a(hfdVar2).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar2).n, hfdVar2, (i4 >> 3) & 14, 0, 65530);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnka
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str4 = str;
                    int i7 = i;
                    dnkk.d(str4, str3, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dnkl dnklVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(850798860);
        if (i3 == 0) {
            i2 = (true != b.D(dnklVar) ? 2 : 4) | i;
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
            hviVar2 = hviVar;
            dwhr.a(hpx.d(-2143886610, new dnkd(dnklVar), b), hviVar2, dnjw.a, null, dnjw.b, hpx.d(-871939575, new dnkg(dnklVar), b), dwhp.a(ibw.g, b, 510), b, (i2 & 112) | 221574, 392);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnjx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnkl dnklVar2 = dnkl.this;
                    int i4 = i;
                    dnkk.e(dnklVar2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

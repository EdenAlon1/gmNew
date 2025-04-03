package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpwy {
    public static final void a(final float f, final hvi hviVar, final ger gerVar, final boolean z, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        hviVar.getClass();
        ffjiVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1419647807);
        if (i3 == 0) {
            i2 = (true != b.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(gerVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjiVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            int i4 = i2 >> 9;
            gem.e(z, ffjiVar, hviVar, false, eqm.a, gerVar, z ? null : des.a(2.0f, ibw.d), hpx.d(352351253, new dpwx(f), b), b, (i4 & 112) | (i4 & 14) | 100663296 | ((i2 << 3) & 896) | ((i2 << 9) & 458752));
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpwo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    hvi hviVar2 = hviVar;
                    ger gerVar2 = gerVar;
                    boolean z2 = z;
                    dpwy.a(f2, hviVar2, gerVar2, z2, ffjiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dpwn dpwnVar, final boolean z, final boolean z2, final boolean z3, final float f, final hvi hviVar, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        boolean z4;
        boolean z5;
        float f2;
        dpwl dpwlVar;
        hvi c;
        hfd hfdVar2;
        long f3;
        long f4;
        int i3 = i & 6;
        hfd b = hfdVar.b(-892100127);
        if (i3 == 0) {
            i2 = (true != b.F(dpwnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= true != b.E(z4) ? 128 : 256;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            z5 = z3;
            i2 |= true != b.E(z5) ? 1024 : 2048;
        } else {
            z5 = z3;
        }
        if ((i & 24576) == 0) {
            f2 = f;
            i2 |= true != b.A(f2) ? 8192 : 16384;
        } else {
            f2 = f;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(hviVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.F(ffixVar) ? 524288 : 1048576;
        }
        int i4 = i2;
        if ((599187 & i4) == 599186 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            dpwl dpwlVar2 = dpwnVar.b;
            gdx gdxVar = null;
            dszq a = dpwlVar2 != null ? dpwlVar2.a() : null;
            b.v(-2021478562);
            if (a != null) {
                long c2 = iby.c(a.a((Context) b.e(AndroidCompositionLocals_androidKt.b)));
                gdxVar = new gdx(c2, c2, c2, c2);
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            b.v(-2021479412);
            if (gdxVar == null) {
                b.v(1591384183);
                long j = ((ibw) b.e(fzc.a)).i;
                fxz a2 = gft.a(b);
                gdx gdxVar2 = a2.X;
                dpwlVar = dpwlVar2;
                if (gdxVar2 == null) {
                    long j2 = ibw.g;
                    f4 = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), 0.38f, ibw.f(j));
                    gdxVar2 = new gdx(j2, j, j2, f4);
                    j = j;
                    a2.X = gdxVar2;
                }
                gdxVar = gdxVar2;
                if (ffcp.a(gdxVar.b, j)) {
                    hfmVar.Z();
                } else {
                    f3 = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), 0.38f, ibw.f(j));
                    gdxVar = gdx.d(gdxVar, 0L, j, f3, 5);
                    hfmVar.Z();
                }
            } else {
                dpwlVar = dpwlVar2;
            }
            gdx gdxVar3 = gdxVar;
            hfmVar.Z();
            b.v(-2021469790);
            int i5 = i4 & 112;
            Object R = hfmVar.R();
            if (i5 == 32 || R == hfc.a) {
                R = new ffji() { // from class: dpwr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.r(jkvVar, z);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c = jjs.c(hviVar, false, (ffji) R);
            hfdVar2 = b;
            gem.d(ffixVar, c, false, z ? eqm.a : eqm.b(16.0f), gdxVar3, des.a(z ? 4.0f : 2.0f, ibw.d), hpx.d(-1214538558, new dpwt(z4, z, z5, f2, dpwlVar, dpwnVar), b), hfdVar2, ((i4 >> 18) & 14) | 12582912);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpws
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpwn dpwnVar2 = dpwn.this;
                    boolean z6 = z;
                    boolean z7 = z2;
                    boolean z8 = z3;
                    float f5 = f;
                    hvi hviVar2 = hviVar;
                    dpwy.b(dpwnVar2, z6, z7, z8, f5, hviVar2, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final List list, final boolean z, final hvi hviVar, final float f, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1126318634);
        if (i3 == 0) {
            i2 = (true != b.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjiVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            dxi dxiVar = dxu.a;
            int i4 = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, b, 0);
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
            b.v(1786722989);
            boolean F = b.F(list) | ((i2 & 112) == 32);
            boolean z2 = (i2 & 7168) == 2048;
            boolean z3 = (i2 & 57344) == 16384;
            Object R = hfmVar.R();
            if ((F | z2 | z3) || R == hfc.a) {
                R = new ffji() { // from class: dpwp
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        List list2 = list;
                        edpVar.a(list2.size(), null, new dpwv(list2), new hpw(-632812321, true, new dpww(list2, z, f, ffjiVar)));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hfdVar2 = b;
            edh.b(null, null, null, null, null, null, false, null, (ffji) R, hfdVar2, 0, 511);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpwq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    boolean z4 = z;
                    hvi hviVar2 = hviVar;
                    float f2 = f;
                    dpwy.c(list2, z4, hviVar2, f2, ffjiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

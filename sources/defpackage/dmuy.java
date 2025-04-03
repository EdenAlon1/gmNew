package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmuy {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hvi r16, final defpackage.ffix r17, final java.lang.String r18, boolean r19, defpackage.hfd r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmuy.a(hvi, ffix, java.lang.String, boolean, hfd, int, int):void");
    }

    public static final void b(final doas doasVar, final doas doasVar2, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-746255723);
        if (i3 == 0) {
            i2 = (true != b.D(doasVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(doasVar2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hvi j = eba.j(hvi.e, 24.0f, 24.0f, 24.0f, 0.0f, 8);
            dxi dxiVar = dxu.b;
            int i4 = huo.a;
            ipn a2 = ebm.a(dxiVar, hum.m, b, 6);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
            int i5 = ist.a;
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
            a = ebr.a.a(hvi.e, 1.0f, true);
            ebv.a(a, b);
            b.v(-427431601);
            if (doasVar2 != null) {
                a(null, doasVar2.c, doasVar2.a, doasVar2.b, b, 0, 1);
            }
            hfmVar.Z();
            b.v(-427427165);
            if (doasVar != null) {
                a(eba.j(hvi.e, 8.0f, 0.0f, 0.0f, 0.0f, 14), doasVar.c, doasVar.a, doasVar.b, b, 6, 0);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmun
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doas doasVar3 = doas.this;
                    int i6 = i;
                    dmuy.b(doasVar3, doasVar2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dmzz dmzzVar, final ibw ibwVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(2134529896);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(ibwVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                ibwVar = null;
            }
            igq a = dnaa.a(dmzzVar, b);
            b.v(-154630586);
            long j = ibwVar == null ? ((ibw) b.e(fzc.a)).i : ibwVar.i;
            ((hfm) b).Z();
            dwho.a(a, null, null, j, b, 0, 4);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmum
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    int i6 = i;
                    dmuy.c(dmzzVar2, ibwVar, (hfd) obj, hip.a(i6 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.hvi r13, boolean r14, final defpackage.ffix r15, defpackage.keh r16, final defpackage.ffjn r17, defpackage.hfd r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmuy.d(hvi, boolean, ffix, keh, ffjn, hfd, int, int):void");
    }

    public static final void e(final String str, boolean z, hfd hfdVar, final int i, final int i2) {
        int i3;
        hvi d;
        hfd hfdVar2;
        final boolean z2 = z;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-651317604);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.E(z2) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            boolean z4 = z3 & z2;
            d = ebs.d(hvi.e, 1.0f);
            int i6 = i3;
            hfdVar2 = b;
            dwjt.b(str, eba.i(d, 24.0f, 0.0f, 2), dwek.e(hfdVar2), 0L, null, null, 0L, z4 ? new jyj(3) : null, 0L, 0, false, 0, 0, null, gft.d(hfdVar2).f, hfdVar2, (i6 & 14) | 48, 0, 65016);
            z2 = z4;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmur
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i7 = i;
                    dmuy.e(str2, z2, (hfd) obj, hip.a(i7 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final hvi hviVar, final List list, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(978261951);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(list) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            eey a = efb.a(0, b, 3);
            hvi f = ebs.f(eba.j(hviVar, 8.0f, 24.0f, 8.0f, 0.0f, 8), 84.0f, 252.0f);
            b.v(-15657962);
            boolean F = b.F(list);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffji() { // from class: dmuk
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        List list2 = list;
                        edpVar.a(list2.size(), null, new dmuu(list2), new hpw(-632812321, true, new dmuv(list2)));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hfdVar2 = b;
            edh.a(f, a, null, false, null, null, null, false, null, (ffji) R, hfdVar2, 0, 508);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmul
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i4 = i;
                    dmuy.f(hviVar2, list, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final float g(hfd hfdVar) {
        hfdVar.v(-851504799);
        float f = ((Configuration) hfdVar.e(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
        hfdVar.o();
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r30, final java.util.List r31, defpackage.hvi r32, defpackage.hfd r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmuy.h(java.lang.String, java.util.List, hvi, hfd, int, int):void");
    }

    public static final void i(final doas doasVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(1231953501);
        if ((i & 6) == 0) {
            i2 = (true != b.D(doasVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            a(hveVar, doasVar.c, doasVar.a, doasVar.b, b, (i3 >> 3) & 14, 0);
            hviVar = hveVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmuq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doas doasVar2 = doas.this;
                    int i4 = i;
                    dmuy.i(doasVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

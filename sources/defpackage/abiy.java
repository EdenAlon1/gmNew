package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abiy {
    public static final Integer a(hkx hkxVar) {
        return (Integer) hkxVar.a();
    }

    public static final void b(final String str, final List list, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-806978987);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
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
            b.v(-1245856191);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new hic(new jyj(3), hla.a);
                hfmVar.ad(R);
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            dluu dluuVar = new dluu(str, list, (String) null);
            long j = gft.a(b).s;
            jpo y = jpo.y(gft.d(b).k, 0L, 0L, null, null, null, null, 0L, null, ((jyj) hhoVar.a()).a, 0, 0L, null, null, 0, 16744447);
            b.v(-1245845639);
            boolean D = b.D(hhoVar);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new ffji() { // from class: abic
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jpg jpgVar = (jpg) obj;
                        jpgVar.getClass();
                        hho.this.b(new jyj(jpgVar.f() > 3 ? 5 : 3));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hfdVar2 = b;
            dlur.e(dluuVar, null, j, y, null, 0L, (ffji) R2, false, null, hfdVar2, 0, 434);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abid
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    abiy.b(str2, list, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final String str, final List list, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(463280869);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            dlur.e(new dluu(str, list, 4), hviVar, gft.a(b).s, gft.d(b).k, null, 0L, null, false, null, b, (i2 >> 3) & 112, 496);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abif
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    List list2 = list;
                    int i4 = i;
                    abiy.c(str2, list2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dnem dnemVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1195929231);
        if (i3 == 0) {
            i2 = (true != b.D(dnemVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(dnemVar.a, null, gft.a(b).q, 0L, null, null, 0L, null, 0L, 2, false, dnemVar.g, 0, null, gft.d(b).j, hfdVar2, 0, 48, 55290);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abim
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    abiy.d(dnem.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2049081790);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, null, gft.a(b).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).l, hfdVar2, i2 & 14, 0, 65530);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abij
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    abiy.e(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1206716380);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).j, hfdVar2, i2 & 14, 0, 65534);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abii
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    abiy.f(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final dnem dnemVar, dwn dwnVar, hfd hfdVar, final int i) {
        int i2;
        final dwn dwnVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(966942438);
        if (i3 == 0) {
            i2 = (true != b.D(dnemVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dwnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            dwnVar2 = dwnVar;
        } else {
            boolean z = dnemVar.d;
            b.v(1561803070);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: abio
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((Boolean) obj).booleanValue();
                        dnem.this.f.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwnVar2 = dwnVar;
            dwfq.a(z, (ffji) R, null, false, null, dwnVar2, b, (i2 << 12) & 458752, 28);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abip
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnem dnemVar2 = dnem.this;
                    int i5 = i;
                    abiy.g(dnemVar2, dwnVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final hvi hviVar, final dwn dwnVar, final boolean z, final ffix ffixVar, final hus husVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        hvi hviVar2;
        int i2;
        ffix ffixVar2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(1931031385);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dwnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            ffixVar2 = ffixVar;
            i2 |= true != b.F(ffixVar2) ? 1024 : 2048;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(husVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffjnVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar2, 1.0f);
            hvi j = eba.j(dfb.c(hxo.a(ebs.u(d, 56.0f, 0.0f, 2), eqm.b(24.0f)), dwnVar, gkw.a(false, 0.0f, 0L, 7), false, null, null, ffixVar2, 28), z ? 8.0f : 2.0f, 0.0f, z ? 2.0f : 8.0f, 0.0f, 10);
            int i4 = (i2 >> 6) & 8064;
            ipn a = ebm.a(dxu.a, husVar, b, (i4 >> 3) & 112);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
            int i5 = ist.a;
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
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
            ffjnVar.a(ebr.a, b, Integer.valueOf(((i4 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abin
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dwn dwnVar2 = dwnVar;
                    boolean z2 = z;
                    ffix ffixVar4 = ffixVar;
                    hus husVar2 = husVar;
                    abiy.h(hviVar3, dwnVar2, z2, ffixVar4, husVar2, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final dys dysVar, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-247044623);
        if (i3 == 0) {
            i2 = (true != b.D(dysVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            hve hveVar = hvi.e;
            int i4 = huo.a;
            ffixVar2 = ffixVar;
            dwhl.b(ffixVar2, eba.j(dys.a(hveVar, hum.l), 0.0f, 0.0f, 12.0f, 0.0f, 11), false, null, null, abja.a, b, ((i2 >> 3) & 14) | 1572864, 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abil
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dys dysVar2 = dys.this;
                    int i5 = i;
                    abiy.i(dysVar2, ffixVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final hvi hviVar, final dwn dwnVar, final ffix ffixVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(1840581241);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dwnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjnVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar, 1.0f);
            hvi c = dfb.c(eba.e(d, 4.0f, 4.0f), dwnVar, gkw.a(false, 0.0f, 0L, 7), false, null, null, ffixVar, 28);
            int i4 = huo.a;
            int i5 = (i2 & 7168) | 384;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c);
            int i6 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
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
            ffjnVar.a(ebr.a, b, Integer.valueOf(((i5 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abiq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    dwn dwnVar2 = dwnVar;
                    ffix ffixVar3 = ffixVar;
                    abiy.j(hviVar2, dwnVar2, ffixVar3, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(final doas doasVar, final boolean z, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        hfd hfdVar2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(533312919);
        if (i3 == 0) {
            i2 = (true != b.D(doasVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            hfdVar2 = b;
        } else {
            hvi j = eba.j(hviVar, 0.0f, 8.0f, 0.0f, 16.0f, 5);
            hviVar2 = hviVar;
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
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
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-224633225);
            if (doasVar != null) {
                ebe ebeVar = dwfd.a;
                fvo b3 = dwfd.b(gft.a(b).a, 0L, b, 14);
                d = ebs.d(hvi.e, 1.0f);
                dwfj.a(doasVar.c, d, z, null, b3, null, null, null, hpx.d(1402487446, new abir(doasVar), b), b, ((i2 << 3) & 896) | 805306416, 488);
            }
            hfdVar2 = b;
            hfmVar.Z();
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abie
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doas doasVar2 = doas.this;
                    boolean z2 = z;
                    int i6 = i;
                    abiy.k(doasVar2, z2, hviVar2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final abhz abhzVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(446859731);
        if (i3 == 0) {
            i2 = (true != b.D(abhzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            ffsk ffskVar = (ffsk) R;
            gmk f = gim.f(true, b, 6, 2);
            hkx a = lnk.a(abhzVar.d, b);
            b.v(604438700);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R2 = hicVar;
            }
            hfmVar.Z();
            dmff.d(hviVar, f, 0L, 0L, abhzVar, hpx.d(-1564234416, new abiv(abhzVar, ffskVar, f, a, (hho) R2), b), b, ((i4 >> 3) & 14) | 196608 | ((i4 << 12) & 57344), 12);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abia
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    abhz abhzVar2 = abhz.this;
                    int i5 = i;
                    abiy.l(abhzVar2, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void m(final dnem dnemVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-62378329);
        if (i3 == 0) {
            i2 = (true != b.D(dnemVar) ? 2 : 4) | i;
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
            b.v(-471098685);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            dwn dwnVar = (dwn) R;
            hfmVar.Z();
            hviVar2 = hviVar;
            h(hviVar2, dwnVar, dnemVar.e, dnemVar.f, dnemVar.h, hpx.d(562306920, new abiw(dnemVar, dwnVar), b), b, ((i2 >> 3) & 14) | 196656);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abib
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnem dnemVar2 = dnem.this;
                    int i4 = i;
                    abiy.m(dnemVar2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void n(final String str, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        final hvi hviVar2;
        hfd b = hfdVar.b(-563007056);
        if ((i & 6) == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
            hviVar2 = hviVar;
        } else {
            hve hveVar = hvi.e;
            b.v(-1337148961);
            int i4 = i3 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new hic(new jyj(3), hla.a);
                hfmVar.ad(R);
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            long j = gft.a(b).q;
            b.v(-1337144549);
            jpo jpoVar = gft.d(b).f;
            hfmVar.Z();
            jyj jyjVar = new jyj(((jyj) hhoVar.a()).a);
            b.v(-1337141481);
            boolean D = b.D(hhoVar);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new ffji() { // from class: abig
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jpg jpgVar = (jpg) obj;
                        jpgVar.getClass();
                        hho.this.b(new jyj(jpgVar.f() > 3 ? 5 : 3));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hfdVar2 = b;
            hviVar2 = hveVar;
            dwjt.b(str, hviVar2, j, 0L, null, null, 0L, jyjVar, 0L, 0, false, 0, 0, (ffji) R2, jpoVar, hfdVar2, i3 & 126, 0, 32248);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abih
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    abiy.n(str2, hviVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void o(final dnia dniaVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-678727493);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dniaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            b.v(357676733);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            dwn dwnVar = (dwn) R;
            hfmVar.Z();
            j(hveVar, dwnVar, dniaVar.e, hpx.d(-497931308, new abix(dniaVar, dwnVar), b), b, ((i3 >> 3) & 14) | 3120);
            hviVar = hveVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abik
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnia dniaVar2 = dnia.this;
                    int i4 = i;
                    abiy.o(dniaVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

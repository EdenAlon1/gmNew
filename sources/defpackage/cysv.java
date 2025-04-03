package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cysv {
    public static final void a(final dlsr dlsrVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(785894427);
        if (i3 == 0) {
            i2 = (true != b.D(dlsrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            b.v(1657978953);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffix() { // from class: cysq
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dlsr dlsrVar2 = dlsr.this;
                        if (dlsrVar2 != null) {
                            dlsrVar2.k.invoke();
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwhl.b((ffix) R, eau.c(eba.j(hvr.a(hvi.e, 100.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), -4.0f, 0.0f, 2), false, null, null, cysb.b, b, 1572912, 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cysr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    cysv.a(dlsr.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final ffix ffixVar, hvi hviVar, final boolean z, final cysl cyslVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        boolean z2;
        long j;
        long j2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-253482367);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            hviVar2 = hviVar;
            i2 |= true != b.D(hviVar2) ? 16 : 32;
        } else {
            hviVar2 = hviVar;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= true != b.E(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? b.D(cyslVar) : b.F(cyslVar)) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            boolean z3 = cyslVar.b;
            hvi k = ebs.k(gex.a(hviVar2), z3 ? 36.0f : 24.0f);
            if (z3) {
                b.v(-1297948956);
                j = gft.a(b).c;
                ((hfm) b).Z();
            } else {
                b.v(-1297875641);
                j = gft.a(b).D;
                ((hfm) b).Z();
            }
            if (z3) {
                b.v(-1297749502);
                j2 = gft.a(b).d;
                ((hfm) b).Z();
            } else {
                b.v(-1297674389);
                j2 = gft.a(b).q;
                ((hfm) b).Z();
            }
            dwhl.a(ffixVar, k, z2, null, dwhi.a(j, j2, b, 12), hpx.d(212209505, new cyst(z3), b), b, (i2 & 14) | 1572864 | (i2 & 896), 40);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cysp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar2 = ffix.this;
                    hvi hviVar3 = hviVar2;
                    boolean z4 = z;
                    cysv.b(ffixVar2, hviVar3, z4, cyslVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final cvo cvoVar, final cysm cysmVar, final crw crwVar, final float f, final hvi hviVar, final boolean z, final float f2, hfd hfdVar, final int i) {
        int i2;
        crw crwVar2;
        hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1415973921);
        if (i3 == 0) {
            i2 = (true != b.D(cvoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(cysmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            crwVar2 = crwVar;
            i2 |= true != b.F(crwVar2) ? 128 : 256;
        } else {
            crwVar2 = crwVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(hviVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.E(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.A(f2) ? 524288 : 1048576;
        }
        int i4 = i2;
        if ((599187 & i4) == 599186 && b.I()) {
            b.s();
        } else {
            b.v(747770788);
            if (cysmVar.f.a) {
                hviVar2 = hviVar;
            } else {
                hve hveVar = hvi.e;
                cvn b2 = cvoVar.b(z ? "photoSelector_0" : new String(), b);
                int i5 = cvm.c;
                cvm a = cvl.a();
                cyh cyhVar = cyry.a;
                hviVar2 = hviVar.a(cvg.a(cvoVar, hveVar, b2, crwVar2, ctt.l(cxu.c(500, 0, cyry.a, 2), 2), ctt.m(cxu.c(150, 0, cyry.a, 2), 2), a));
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            int i6 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b, hviVar2);
            int i7 = ist.a;
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
            hlc.b(b, b3, iss.c);
            cytv.a(cysmVar.a, f2, f, b, ((i4 >> 15) & 112) | ((i4 >> 3) & 896));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyss
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvo cvoVar2 = cvo.this;
                    cysm cysmVar2 = cysmVar;
                    crw crwVar3 = crwVar;
                    float f3 = f;
                    hvi hviVar3 = hviVar;
                    boolean z2 = z;
                    cysv.c(cvoVar2, cysmVar2, crwVar3, f3, hviVar3, z2, f2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final cvo cvoVar, final cysm cysmVar, final crw crwVar, float f, hfd hfdVar, final int i) {
        cvo cvoVar2;
        int i2;
        hvi d;
        hvi d2;
        hvi a;
        int i3;
        hvi hviVar;
        boolean z;
        hvi a2;
        float f2 = f;
        int i4 = i & 6;
        hfd b = hfdVar.b(1149302044);
        if (i4 == 0) {
            cvoVar2 = cvoVar;
            i2 = (true != b.D(cvoVar2) ? 2 : 4) | i;
        } else {
            cvoVar2 = cvoVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(cysmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(crwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f2) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            int i5 = i2 << 9;
            int i6 = huo.a;
            hun hunVar = hum.k;
            d = ebs.d(hvi.e, 1.0f);
            ipn a3 = dyo.a(dxu.d, hunVar, b, 54);
            int a4 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            int i8 = i5 & 3670016;
            int i9 = i2 & 1022;
            hlc.b(b, b2, iss.c);
            if (cysmVar.f.c) {
                b.v(-1302620941);
                d2 = ebs.d(hvi.e, 1.0f);
                ipn a5 = ebm.a(dxu.a, hum.n, b, 48);
                int a6 = hey.a(b);
                hqb ai2 = hfmVar.ai();
                hvi b3 = huz.b(b, d2);
                ffix ffixVar2 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar2);
                } else {
                    b.z();
                }
                hlc.b(b, a5, iss.e);
                hlc.b(b, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                    Integer valueOf2 = Integer.valueOf(a6);
                    hfmVar.ad(valueOf2);
                    b.h(valueOf2, ffjmVar2);
                }
                hlc.b(b, b3, iss.c);
                ebr ebrVar = ebr.a;
                a = ebrVar.a(hvi.e, 0.1f, true);
                ipn a7 = dyc.a(hum.a, false);
                int a8 = hey.a(b);
                hqb ai3 = hfmVar.ai();
                hvi b4 = huz.b(b, a);
                ffix ffixVar3 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar3);
                } else {
                    b.z();
                }
                hlc.b(b, a7, iss.e);
                hlc.b(b, ai3, iss.d);
                ffjm ffjmVar3 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a8))) {
                    Integer valueOf3 = Integer.valueOf(a8);
                    hfmVar.ad(valueOf3);
                    b.h(valueOf3, ffjmVar3);
                }
                hlc.b(b, b4, iss.c);
                b.n();
                float f3 = true != cysmVar.f.b ? 64.0f : 96.0f;
                hvi a9 = hxe.a(hvi.e, f2);
                if (f2 > 0.0f) {
                    i3 = i8;
                    hviVar = a9;
                    z = true;
                } else {
                    i3 = i8;
                    hviVar = a9;
                    z = false;
                }
                c(cvoVar2, cysmVar, crwVar, f3, hviVar, z, f2, b, i9 | i3);
                a2 = ebrVar.a(hvi.e, 0.1f, true);
                ipn a10 = dyc.a(hum.a, false);
                int a11 = hey.a(b);
                hqb ai4 = hfmVar.ai();
                hvi b5 = huz.b(b, a2);
                ffix ffixVar4 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar4);
                } else {
                    b.z();
                }
                hlc.b(b, a10, iss.e);
                hlc.b(b, ai4, iss.d);
                ffjm ffjmVar4 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a11))) {
                    Integer valueOf4 = Integer.valueOf(a11);
                    hfmVar.ad(valueOf4);
                    b.h(valueOf4, ffjmVar4);
                }
                hlc.b(b, b5, iss.c);
                b.v(468593107);
                ffix ffixVar5 = cysmVar.e;
                if (ffixVar5 != null) {
                    float f4 = ((-0.8f) + f2) * 5.0f;
                    b(ffixVar5, hxe.a(hvi.e, f4), f4 > 0.0f, cysmVar.f, b, 0);
                }
                hfmVar.Z();
                b.n();
                b.n();
                hfmVar.Z();
                f2 = f2;
            } else {
                b.v(-1301422822);
                float f5 = true != cysmVar.f.b ? 64.0f : 96.0f;
                hvi a12 = hxe.a(hvi.e, f2);
                boolean z2 = f2 > 0.0f;
                f2 = f2;
                c(cvoVar, cysmVar, crwVar, f5, a12, z2, f2, b, i9 | i8);
                hfmVar.Z();
            }
            cyui.a(cysmVar.b, hxe.a(hvi.e, f2), b, 0);
            cytj.b(cysmVar.c, b, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            final float f6 = f2;
            L.d = new ffjm() { // from class: cysn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvo cvoVar3 = cvo.this;
                    cysm cysmVar2 = cysmVar;
                    crw crwVar2 = crwVar;
                    cysv.d(cvoVar3, cysmVar2, crwVar2, f6, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final cvo cvoVar, final cysm cysmVar, final crw crwVar, final float f, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1737964265);
        if (i3 == 0) {
            i2 = (true != b.D(cvoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(cysmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(crwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            gvr c = dweu.c(0.0f, b, 384);
            b.v(-1395727882);
            b.v(298156282);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffix() { // from class: dwkf
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return true;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            gvo a = gvl.a(c, (ffix) R, gft.b(b).a(), cxd.a(b), b, 0);
            hfmVar.Z();
            dweu.a(cysb.a, null, hpx.d(142016529, new cysu(cysmVar, cvoVar, crwVar, f), b), null, 0.0f, null, dwkh.b(ibw.g, 0L, 0L, b, 62), a, b, 390, 58);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyso
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvo cvoVar2 = cvo.this;
                    cysm cysmVar2 = cysmVar;
                    crw crwVar2 = crwVar;
                    cysv.e(cvoVar2, cysmVar2, crwVar2, f, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

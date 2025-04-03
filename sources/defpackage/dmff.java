package defpackage;

import java.util.List;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmff {
    public static final void a(final dmfn dmfnVar, final hvi hviVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-1408454495);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dmfnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            if (dmfnVar instanceof dmfm) {
                b.v(1650258744);
                f((dmfm) dmfnVar, hviVar, b, i3 & 112);
                ((hfm) b).Z();
            } else {
                if (!(dmfnVar instanceof dmfh)) {
                    b.v(-381462455);
                    ((hfm) b).Z();
                    throw new IllegalArgumentException("This type of BottomSheetUiData is not supported by BottomSheet(). Did you mean to use CustomBottomSheet() instead?");
                }
                b.v(1650261020);
                k((dmfh) dmfnVar, hviVar, null, b, i3 & 112);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmei
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmfn dmfnVar2 = dmfn.this;
                    int i6 = i;
                    dmff.a(dmfnVar2, hviVar, (hfd) obj, hip.a(i6 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final String str, final List list, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1874672293);
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
            b.v(329671405);
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
            b.v(329681957);
            boolean D = b.D(hhoVar);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new ffji() { // from class: dmef
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
            L.d = new ffjm() { // from class: dmeg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    dmff.b(str2, list, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.dmeb r16, final defpackage.doas r17, final defpackage.doas r18, final boolean r19, defpackage.hvi r20, defpackage.hho r21, defpackage.hfd r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmff.c(dmeb, doas, doas, boolean, hvi, hho, hfd, int, int):void");
    }

    public static final void d(hvi hviVar, gmk gmkVar, long j, long j2, final dmfn dmfnVar, final ffjn ffjnVar, hfd hfdVar, final int i, final int i2) {
        hvi hviVar2;
        int i3;
        gmk gmkVar2;
        long j3;
        long j4;
        ffjn ffjnVar2;
        long j5;
        hvi hviVar3;
        hvi hviVar4;
        long j6;
        hfd hfdVar2;
        final long j7;
        final hvi hviVar5;
        final gmk gmkVar3;
        final long j8;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(1501240780);
        if (i4 != 0) {
            i3 = i | 6;
            hviVar2 = hviVar;
        } else if ((i & 6) == 0) {
            hviVar2 = hviVar;
            i3 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i5 = 16;
            if ((i2 & 2) == 0) {
                gmkVar2 = gmkVar;
                if (b.D(gmkVar2)) {
                    i5 = 32;
                }
            } else {
                gmkVar2 = gmkVar;
            }
            i3 |= i5;
        } else {
            gmkVar2 = gmkVar;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0) {
                j3 = j;
                if (b.C(j3)) {
                    i6 = 256;
                }
            } else {
                j3 = j;
            }
            i3 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            int i7 = 1024;
            if ((i2 & 8) == 0) {
                j4 = j2;
                if (b.C(j4)) {
                    i7 = 2048;
                }
            } else {
                j4 = j2;
            }
            i3 |= i7;
        } else {
            j4 = j2;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b.D(dmfnVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            ffjnVar2 = ffjnVar;
            i3 |= true != b.F(ffjnVar2) ? 65536 : 131072;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if ((74899 & i3) == 74898 && b.I()) {
            b.s();
            hfdVar2 = b;
            hviVar5 = hviVar2;
            gmkVar3 = gmkVar2;
            j8 = j3;
            j7 = j4;
        } else {
            int i8 = i2 & 8;
            int i9 = i2 & 4;
            int i10 = i2 & 2;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hvi hviVar6 = i4 != 0 ? hvi.e : hviVar2;
                if (i10 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    gmkVar2 = gim.f(false, b, 0, 3);
                }
                if (i9 != 0) {
                    j3 = dwfa.a(b);
                    i3 &= -897;
                }
                if (i8 != 0) {
                    i3 &= -7169;
                    j4 = dwfa.a(b);
                }
                j5 = j3;
                hviVar3 = hviVar6;
            } else {
                b.s();
                if (i10 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if (i9 != 0) {
                    i3 &= -897;
                }
                if (i8 != 0) {
                    i3 &= -7169;
                }
                j5 = j3;
                hviVar3 = hviVar2;
            }
            final gmk gmkVar4 = gmkVar2;
            b.l();
            ebe a = eci.a(ecv.e(b), b);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            final ffsk ffskVar = (ffsk) R;
            b.v(-228978191);
            if (dmfnVar.c()) {
                hviVar4 = hviVar3;
                j6 = dooy.a(b).k;
            } else {
                hviVar4 = hviVar3;
                j6 = ibw.g;
            }
            long j9 = j6;
            hfmVar.Z();
            eql c = eqm.c(28.0f, 28.0f, 0.0f, 0.0f);
            dzh dzhVar = new dzh();
            b.v(-228974367);
            boolean F = ((((i3 & 112) ^ 48) > 32 && b.D(gmkVar4)) || (i3 & 48) == 32) | b.F(ffskVar);
            boolean z = (57344 & i3) == 16384;
            Object R2 = hfmVar.R();
            if ((F | z) || R2 == hfc.a) {
                R2 = new ffix() { // from class: dmeo
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffud d = ffqy.d(ffsk.this, null, null, new dmew(gmkVar4, null), 3);
                        final dmfn dmfnVar2 = dmfnVar;
                        d.hZ(new ffji() { // from class: dmek
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                dmfn.this.b().invoke();
                                return ffcu.a;
                            }
                        });
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            long j10 = j4;
            hvi hviVar7 = hviVar4;
            hfdVar2 = b;
            dwhz.a((ffix) R2, hviVar7, gmkVar4, 0.0f, false, c, j5, 0L, 0.0f, j9, null, dzhVar, null, hpx.d(709735982, new dmex(hviVar4, j10, a, ffjnVar2), b), hfdVar2, ((i3 << 3) & 1008) | ((i3 << 12) & 3670016), 3078, 4504);
            j7 = j10;
            hviVar5 = hviVar7;
            gmkVar3 = gmkVar4;
            j8 = j5;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmep
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar8 = hvi.this;
                    gmk gmkVar5 = gmkVar3;
                    long j11 = j8;
                    long j12 = j7;
                    dmfn dmfnVar2 = dmfnVar;
                    dmff.d(hviVar8, gmkVar5, j11, j12, dmfnVar2, ffjnVar, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final boolean r19, final boolean r20, final defpackage.ffix r21, defpackage.hvi r22, final defpackage.ffjn r23, defpackage.hfd r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmff.e(boolean, boolean, ffix, hvi, ffjn, hfd, int, int):void");
    }

    public static final void f(final dmfm dmfmVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1505501397);
        if (i3 == 0) {
            i2 = (true != b.D(dmfmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            gmk f = gim.f(true, b, 6, 2);
            d(hviVar, f, 0L, 0L, dmfmVar, hpx.d(-1458929816, new dmfe(dmfmVar, (ffsk) R, f), b), b, ((i2 >> 3) & 14) | 196608 | ((i2 << 12) & 57344), 12);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmee
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmfm dmfmVar2 = dmfm.this;
                    int i4 = i;
                    dmff.f(dmfmVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final dys dysVar, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-31447233);
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
            dwhl.b(ffixVar2, eba.j(dys.a(hveVar, hum.l), 0.0f, 0.0f, 12.0f, 0.0f, 11), false, null, null, dmfq.b, b, ((i2 >> 3) & 14) | 1572864, 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmed
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dys dysVar2 = dys.this;
                    int i5 = i;
                    dmff.g(dysVar2, ffixVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final doas doasVar, final doas doasVar2, final boolean z, hho hhoVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        boolean z2;
        hho hhoVar2;
        hvi d;
        hvi d2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1538835566);
        if (i3 == 0) {
            i2 = (true != b.D(doasVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(doasVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= true != b.E(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            hhoVar2 = hhoVar;
            i2 |= true != b.D(hhoVar2) ? 1024 : 2048;
        } else {
            hhoVar2 = hhoVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(hviVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            hvi j = eba.j(hviVar, 0.0f, 0.0f, 0.0f, 20.0f, 7);
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
            d = ebs.d(hvi.e, 1.0f);
            dwfj.a(doasVar.c, d, ((Boolean) hhoVar2.a()).booleanValue(), null, null, null, null, null, hpx.d(-242089516, new dmes(doasVar), b), b, 805306416, 504);
            b = b;
            d2 = ebs.d(hvi.e, 1.0f);
            e(z2, ((Boolean) hhoVar2.a()).booleanValue(), doasVar2.c, d2, hpx.d(-1243862981, new dmet(doasVar2), b), b, ((i2 >> 6) & 14) | 27648, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            final hho hhoVar3 = hhoVar2;
            L.d = new ffjm() { // from class: dmec
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doas doasVar3 = doas.this;
                    doas doasVar4 = doasVar2;
                    boolean z3 = z;
                    hho hhoVar4 = hhoVar3;
                    dmff.h(doasVar3, doasVar4, z3, hhoVar4, hviVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final doas doasVar, final doas doasVar2, final dmeb dmebVar, final boolean z, hho hhoVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hho hhoVar2;
        final hvi hviVar2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-124689242);
        if (i3 == 0) {
            i2 = (true != b.D(doasVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(doasVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmebVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            hhoVar2 = hhoVar;
            i2 |= true != b.D(hhoVar2) ? 8192 : 16384;
        } else {
            hhoVar2 = hhoVar;
        }
        if ((196608 & i) == 0) {
            hviVar2 = hviVar;
            i2 |= true != b.D(hviVar2) ? 65536 : 131072;
        } else {
            hviVar2 = hviVar;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar2, 1.0f);
            hvi j = eba.j(d, 0.0f, 0.0f, 0.0f, 20.0f, 7);
            dxi dxiVar = dmebVar == dmeb.a ? dxu.g : dxu.b;
            int i4 = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, b, 0);
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
            e(z, ((Boolean) hhoVar2.a()).booleanValue(), doasVar2.c, null, hpx.d(-1035986037, new dmeu(doasVar2), b), b, ((i2 >> 9) & 14) | 24576, 8);
            ebv.a(ebs.o(hvi.e, 8.0f), b);
            dwfj.a(doasVar.c, null, ((Boolean) hhoVar2.a()).booleanValue(), null, null, null, null, null, hpx.d(2066398418, new dmev(doasVar), b), b, 805306368, 506);
            b = b;
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmel
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doas doasVar3 = doas.this;
                    doas doasVar4 = doasVar2;
                    dmeb dmebVar2 = dmebVar;
                    boolean z2 = z;
                    hho hhoVar3 = hhoVar2;
                    dmff.i(doasVar3, doasVar4, dmebVar2, z2, hhoVar3, hviVar2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final String str, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        final hvi hviVar2;
        hfd b = hfdVar.b(-1300533792);
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
            b.v(252712819);
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
            b.v(252717231);
            jpo jpoVar = gft.d(b).f;
            hfmVar.Z();
            jyj jyjVar = new jyj(((jyj) hhoVar.a()).a);
            b.v(252720299);
            boolean D = b.D(hhoVar);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new ffji() { // from class: dmeq
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
            L.d = new ffjm() { // from class: dmer
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    dmff.j(str2, hviVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(final dmfh dmfhVar, final hvi hviVar, ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        final ffjm ffjmVar2;
        hfd b = hfdVar.b(1827483916);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dmfhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            ffjmVar2 = ffjmVar;
        } else {
            ffjmVar2 = dmfq.a;
            d(hviVar, gim.f(true, b, 6, 2), gft.a(b).p, gft.a(b).p, dmfhVar, hpx.d(-242400311, new dmfa(dmfhVar, ffjmVar2), b), b, ((i3 << 12) & 57344) | ((i3 >> 3) & 14) | 196608, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmen
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmfh dmfhVar2 = dmfh.this;
                    hvi hviVar2 = hviVar;
                    int i4 = i;
                    dmff.k(dmfhVar2, hviVar2, ffjmVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final doat doatVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hfd b = hfdVar.b(-1103336773);
        if ((i & 6) == 0) {
            i2 = (true != b.D(doatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && b.I()) {
            b.s();
        } else {
            hviVar = hvi.e;
            d = ebs.d(hviVar, 1.0f);
            hvi g = ebs.g(d, 192.0f);
            b.v(-1897245495);
            dgx.a(jie.a(doatVar.a, b, 0), null, g, null, null, 0.0f, null, b, 0, 120);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmej
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doat doatVar2 = doat.this;
                    int i3 = i;
                    dmff.l(doatVar2, hviVar, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmds {
    public static final void a(final String str, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(549550847);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            if (str == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dmdb
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            dmds.a(null, z, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            hfdVar2 = b;
            dwjt.b(str, eba.j(hvi.e, 0.0f, z ? 2.0f : 0.0f, 0.0f, 0.0f, 13), gft.a(b).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).k, hfdVar2, i2 & 14, 0, 65528);
        }
        hio L2 = hfdVar2.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dmde
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dmds.a(str2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmck dmckVar, final dmdt dmdtVar, final ffix ffixVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1003523079);
        if (i3 == 0) {
            i2 = (true != b.D(dmckVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmdtVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            boolean z = dmckVar.f != null && dmdtVar == dmdt.a;
            String str = dmckVar.a;
            b.v(1260037642);
            boolean D = b.D(str);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            String str2 = dmckVar.a;
            b.v(385743975);
            b.v(838887117);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffji() { // from class: dmda
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((gpj) obj).getClass();
                        return true;
                    }
                };
                hfmVar.ad(R2);
            }
            ffji ffjiVar = (ffji) R2;
            hfmVar.Z();
            jzn jznVar = (jzn) b.e(jdr.e);
            b.v(-1853326304);
            jzn jznVar2 = (jzn) b.e(jdr.e);
            boolean D2 = b.D(jznVar2);
            Object R3 = hfmVar.R();
            if (D2 || R3 == hfc.a) {
                R3 = new gpb(jznVar2);
                hfmVar.ad(R3);
            }
            ffji ffjiVar2 = (ffji) R3;
            hfmVar.Z();
            b.v(838892401);
            boolean D3 = b.D(str2) | b.D(jznVar);
            Object R4 = hfmVar.R();
            if (D3 || R4 == hfc.a) {
                R4 = new gpi(gpj.c, jznVar, ffjiVar, ffjiVar2);
                hfmVar.ad(R4);
            }
            gpi gpiVar = (gpi) R4;
            hfmVar.Z();
            hfmVar.Z();
            b.v(1260042291);
            boolean F = b.F(gpiVar) | ((i2 & 14) == 4) | b.D(hhoVar);
            Object R5 = hfmVar.R();
            if (F || R5 == hfc.a) {
                R5 = new dmdl(gpiVar, dmckVar, hhoVar, null);
                hfmVar.ad(R5);
            }
            hfmVar.Z();
            hgs.g(gpiVar, (ffjm) R5, b);
            if (!((Boolean) hhoVar.a()).booleanValue()) {
                gpf.a(gpiVar, dmea.a, null, z, z, false, hpx.d(400948783, new dmdn(dmdtVar, ffixVar, ffjmVar), b), b, 1572912);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmcq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmck dmckVar2 = dmck.this;
                    dmdt dmdtVar2 = dmdtVar;
                    ffix ffixVar2 = ffixVar;
                    dmds.b(dmckVar2, dmdtVar2, ffixVar2, ffjmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final ebq ebqVar, final boolean z, final boolean z2, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1513366823);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjnVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            a = ebqVar.a(eba.f(hvi.e, 16.0f, 16.0f, z2 ? 4.0f : 16.0f, z ? 0.0f : 16.0f), 1.0f, true);
            int i4 = i2 & 7168;
            dxq dxqVar = dxu.c;
            int i5 = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, b, 0);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i6 = ist.a;
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
            ffjnVar.a(dys.a, b, Integer.valueOf(((i4 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmcr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    boolean z3 = z;
                    boolean z4 = z2;
                    dmds.c(ebqVar2, z3, z4, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dmck dmckVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1164519877);
        if (i3 == 0) {
            i2 = (true != b.D(dmckVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hvi i4 = eba.i(hvi.e, 0.0f, 16.0f, 1);
            dxi dxiVar = dxu.a;
            int i5 = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, i4);
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
            e(b, 0);
            j(dmckVar.d, false, b, 48);
            ebv.a(ebs.o(hvi.e, 12.0f), b);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmdc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    dmds.d(dmck.this, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.hfd r9, final int r10) {
        /*
            r0 = -1505099279(0xffffffffa64a01f1, float:-7.008546E-16)
            hfd r6 = r9.b(r0)
            if (r10 != 0) goto L15
            boolean r9 = r6.I()
            r10 = 0
            if (r9 != 0) goto L11
            goto L15
        L11:
            r6.s()
            goto L40
        L15:
            hve r0 = defpackage.hvi.e
            r4 = 0
            r5 = 14
            r1 = 1094713344(0x41400000, float:12.0)
            r2 = 0
            r3 = 0
            hvi r9 = defpackage.eba.j(r0, r1, r2, r3, r4, r5)
            r0 = 1103101952(0x41c00000, float:24.0)
            hvi r3 = defpackage.ebs.e(r9, r0)
            dmzz r9 = defpackage.dmzz.ag
            igq r1 = defpackage.dnaa.a(r9, r6)
            fxz r9 = defpackage.gft.a(r6)
            long r4 = r9.q
            r9 = 2132083046(0x7f150166, float:1.9806223E38)
            java.lang.String r2 = defpackage.jii.a(r9, r6)
            r7 = 0
            r8 = 0
            defpackage.dwho.a(r1, r2, r3, r4, r6, r7, r8)
        L40:
            hio r9 = r6.L()
            if (r9 == 0) goto L4d
            dmdd r0 = new dmdd
            r0.<init>()
            r9.d = r0
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmds.e(hfd, int):void");
    }

    public static final void f(final dmzz dmzzVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1001645541);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dwho.a(dnaa.a(dmzzVar, b), null, ebs.h(hvi.e, 24.0f), gft.a(b).b, b, 0, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmcw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmds.f(dmzz.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final dmcj dmcjVar, final dmcj dmcjVar2, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1842873231);
        if (i3 == 0) {
            i2 = (true != b.D(dmcjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmcjVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(false) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            if (dmcjVar == null && dmcjVar2 == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dmcu
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dmds.g(null, null, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            d = ebs.d(hvi.e, 1.0f);
            hvi j = eba.j(d, 0.0f, 12.0f, 8.0f, 6.0f, 1);
            dxi dxiVar = dxu.b;
            int i4 = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, b, 6);
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
            b.v(-1218843925);
            if (dmcjVar2 != null) {
                dwfj.e(dmcjVar2.b, null, false, null, r(b), null, hpx.d(-1942597391, new dmdh(dmcjVar2), b), b, 805306368, 494);
            }
            hfmVar.Z();
            ebv.a(ebs.o(hvi.e, 8.0f), b);
            b.v(-1218838293);
            if (dmcjVar != null) {
                dwfj.e(dmcjVar.b, null, false, null, r(b), null, hpx.d(-855529190, new dmdi(dmcjVar), b), b, 805306368, 494);
            }
            hfmVar.Z();
            b.n();
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dmcv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmcj dmcjVar3 = dmcj.this;
                    int i6 = i;
                    dmds.g(dmcjVar3, dmcjVar2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(ffix ffixVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(481683502);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
            hviVar2 = hviVar;
        } else {
            if (ffixVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dmcx
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            dmds.h(null, hvi.this, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            ffixVar2 = ffixVar;
            hviVar2 = hviVar;
            dwhl.b(ffixVar2, hviVar2, false, null, null, dmea.b, b, (i2 & 14) | 1572864 | (i2 & 112), 60);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dmcy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar3 = ffix.this;
                    int i4 = i;
                    dmds.h(ffixVar3, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final dmzz dmzzVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-582116076);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(false) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else if (z) {
            b.v(1494082906);
            gpa.c(ebs.k(eba.j(hvi.e, 16.0f, 16.0f, 0.0f, 16.0f, 4), 40.0f), eqm.a, q(b), 0L, 0.0f, 0.0f, null, hpx.d(239175582, new dmdo(dmzzVar), b), b, 120);
            ((hfm) b).Z();
        } else {
            b.v(1494462656);
            l(dmzzVar, b, ((i2 >> 3) & 112) | (i2 & 14));
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmct
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    int i4 = i;
                    dmds.i(dmzzVar2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final dmdw dmdwVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(531500198);
        if (i3 == 0) {
            i2 = (true != b.D(dmdwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(false) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else if (dmdwVar instanceof dmdu) {
            b.v(1255692462);
            i(((dmdu) dmdwVar).a, z, b, i2 & 1008);
            ((hfm) b).Z();
        } else {
            if (!(dmdwVar instanceof dmdv)) {
                if (dmdwVar != null) {
                    b.v(1255691043);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(271951992);
                ((hfm) b).Z();
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dmdf
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            dmds.j(null, z, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            b.v(1255695949);
            p(z, b, i2 & 112);
            ((hfm) b).Z();
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dmdg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmdw dmdwVar2 = dmdw.this;
                    int i4 = i;
                    dmds.j(dmdwVar2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1843767654);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            if (str == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dmcm
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dmds.k(null, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            jpo jpoVar = gft.d(b).h;
            b.v(-1462534024);
            long j = gft.a(b).q;
            ((hfm) b).Z();
            hfdVar2 = b;
            dwjt.b(str, null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpoVar, hfdVar2, i2 & 14, 0, 65530);
        }
        hio L2 = hfdVar2.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dmcn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmds.k(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final dmzz dmzzVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1627886219);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dwho.a(dnaa.a(dmzzVar, b), null, jfw.a(ebs.k(eba.j(hvi.e, 12.0f, 0.0f, 8.0f, 0.0f, 10), 24.0f), "Logo"), q(b), b, 0, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmcz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmds.l(dmzz.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void m(final dmck dmckVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1193250576);
        if (i3 == 0) {
            i2 = (true != b.D(dmckVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
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
            hus husVar = (dmckVar.f == null && (dmckVar.a == null || dmckVar.e == null)) ? hum.n : hum.m;
            hve hveVar2 = hvi.e;
            ipn a3 = ebm.a(dxu.a, husVar, b, 0);
            int a4 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, hveVar2);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            dmdw dmdwVar = dmckVar.d;
            ebr ebrVar = ebr.a;
            j(dmdwVar, true, b, 48);
            c(ebrVar, (dmckVar.b == null && dmckVar.c == null) ? false : true, dmckVar.f != null, hpx.d(325530296, new dmdp(dmckVar), b), b, 3078);
            h(dmckVar.f, eba.j(hvi.e, 0.0f, 4.0f, 0.0f, 0.0f, 13), b, 48);
            b.n();
            g(dmckVar.b, dmckVar.c, b, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmco
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dmds.m(dmck.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void n(dmck dmckVar, dmdt dmdtVar, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final dmck dmckVar2;
        final dmdt dmdtVar2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-337028306);
        if (i3 == 0) {
            i2 = (true != b.D(dmckVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmdtVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffixVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            dmckVar2 = dmckVar;
            dmdtVar2 = dmdtVar;
            ffixVar2 = ffixVar;
        } else {
            dmckVar2 = dmckVar;
            dmdtVar2 = dmdtVar;
            ffixVar2 = ffixVar;
            b(dmckVar2, dmdtVar2, ffixVar2, hpx.d(1946717634, new dmdr(dmdtVar, dmckVar), b), b, (i2 & 14) | 3072 | (i2 & 112) | ((i2 >> 3) & 896));
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmcl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmck dmckVar3 = dmck.this;
                    dmdt dmdtVar3 = dmdtVar2;
                    int i4 = i;
                    dmds.n(dmckVar3, dmdtVar3, ffixVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void o(final dmdx dmdxVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        hfd b = hfdVar.b(1537733782);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dmdxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar, 1.0f);
            dxi dxiVar = dxu.a;
            int i4 = huo.a;
            ipn a2 = ebm.a(dxiVar, hum.m, b, 0);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
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
            dmck dmckVar = dmdxVar.c;
            b.v(-1450698800);
            n(dmckVar, dmdxVar.a, dmdxVar.b, b, i3 & 896);
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmcp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmdx dmdxVar2 = dmdx.this;
                    int i6 = i;
                    dmds.o(dmdxVar2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void p(final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1115168592);
        if (i3 == 0) {
            i2 = (true != b.B(R.drawable.product_logo_gshield_color_48) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(1530448649);
            int i4 = i2 & 112;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 32 || R == hfc.a) {
                R = new hic(z ? eba.h(16.0f, 16.0f, 0.0f, 16.0f, 4) : eba.h(12.0f, 0.0f, 8.0f, 0.0f, 10), hla.a);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dgx.a(jie.a(R.drawable.product_logo_gshield_color_48, b, i2 & 14), null, ebs.k(eba.c(hvi.e, (ebe) ((hho) R).a()), true != z ? 24.0f : 40.0f), null, null, 0.0f, null, b, 0, 120);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmcs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dmds.p(z, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final long q(hfd hfdVar) {
        hfdVar.v(1186664705);
        hfdVar.v(1242708593);
        long j = gft.a(hfdVar).a;
        hfm hfmVar = (hfm) hfdVar;
        hfmVar.Z();
        hfmVar.Z();
        return j;
    }

    private static final fvo r(hfd hfdVar) {
        hfdVar.v(-56649089);
        ebe ebeVar = dwfd.a;
        hfdVar.v(762298700);
        long j = gft.a(hfdVar).a;
        hfm hfmVar = (hfm) hfdVar;
        hfmVar.Z();
        fvo f = dwfd.f(j, hfdVar, 13);
        hfmVar.Z();
        return f;
    }
}

package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zdl {
    public static final zch a(hkx hkxVar) {
        return (zch) hkxVar.a();
    }

    public static final zch b(hho hhoVar) {
        return (zch) hhoVar.a();
    }

    public static final void c(final zcj zcjVar, final zch zchVar, final zch zchVar2, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        hfm hfmVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-523252814);
        if (i3 == 0) {
            i2 = (true != b.D(zcjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(zchVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(zchVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            eql eqlVar = zck.a;
            a = dee.a(d, zck.a(b), idb.a);
            hvi e = eba.e(a, 20.0f, 20.0f);
            dxj dxjVar = dxu.g;
            int i4 = huo.a;
            ipn a2 = ebm.a(dxjVar, hum.m, b, 6);
            int a3 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, e);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(1397914326);
            int i6 = i2 & 14;
            Object R = hfmVar2.R();
            if (i6 == 4 || R == hfc.a) {
                R = new ffix() { // from class: zcn
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        zcj zcjVar2 = zcj.this;
                        if (zcjVar2 != null) {
                            zcjVar2.b.invoke();
                        }
                        return ffcu.a;
                    }
                };
                hfmVar2.ad(R);
            }
            hfmVar2.Z();
            dwfj.e((ffix) R, null, true, null, null, null, zcg.b, b, 805306752, 506);
            boolean z = !ffkj.e(zchVar, zchVar2);
            b.v(1397920548);
            boolean F = b.F(zchVar) | (i6 == 4);
            Object R2 = hfmVar2.R();
            if (F || R2 == hfc.a) {
                R2 = new ffix() { // from class: zcw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        zcj zcjVar2 = zcj.this;
                        if (zcjVar2 != null) {
                            zcjVar2.a.invoke(zchVar);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar = hfmVar2;
                hfmVar.ad(R2);
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            dwfj.a((ffix) R2, null, z, null, null, null, null, null, zcg.c, b, 805306368, 506);
            b = b;
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zcx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zcj zcjVar2 = zcj.this;
                    zch zchVar3 = zchVar;
                    int i7 = i;
                    zdl.c(zcjVar2, zchVar3, zchVar2, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dyh dyhVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-303734284);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            String a = jii.a(R.string.default_theme, b);
            hve hveVar = hvi.e;
            int i4 = huo.a;
            hvi j = eba.j(dyhVar.a(hveVar, hum.h), 0.0f, 0.0f, 0.0f, 10.0f, 7);
            eql eqlVar = zck.a;
            hfdVar2 = b;
            dwjt.b(a, eba.i(j, zck.b, 0.0f, 2), gft.a(b).q, kal.c(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, jpo.y((jpo) b.e(grl.a), 0L, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 2, 12582911), hfdVar2, 3072, 0, 65520);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zct
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    zdl.d(dyh.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.hfd r13, final int r14) {
        /*
            r0 = 2140918273(0x7f9bd201, float:NaN)
            hfd r11 = r13.b(r0)
            if (r14 != 0) goto L15
            boolean r13 = r11.I()
            r14 = 0
            if (r13 != 0) goto L11
            goto L15
        L11:
            r11.s()
            goto L3b
        L15:
            eql r13 = defpackage.zck.a
            long r3 = defpackage.zck.b(r11)
            glv r13 = defpackage.gft.c(r11)
            eqd r2 = r13.e
            hve r13 = defpackage.hvi.e
            r0 = 1101004800(0x41a00000, float:20.0)
            r1 = 1098907648(0x41800000, float:16.0)
            hvi r13 = defpackage.eba.e(r13, r0, r1)
            hvi r1 = defpackage.ebs.t(r13)
            ffjm r10 = defpackage.zcg.a
            r12 = 120(0x78, float:1.68E-43)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            defpackage.gpa.c(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
        L3b:
            hio r13 = r11.L()
            if (r13 == 0) goto L48
            zco r0 = new zco
            r0.<init>()
            r13.d = r0
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdl.e(hfd, int):void");
    }

    public static final void f(final dyh dyhVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1316561616);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            long j = gft.a(b).v;
            eql eqlVar = eqm.a;
            eql eqlVar2 = zck.a;
            der a = des.a(2.0f, zck.a(b));
            hvi k = ebs.k(hvi.e, 40.0f);
            int i4 = huo.a;
            hvi a2 = dyhVar.a(k, hum.h);
            b.v(1498502893);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffjn() { // from class: zdb
                    @Override // defpackage.ffjn
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        ipo ei;
                        ipq ipqVar = (ipq) obj;
                        ipl iplVar = (ipl) obj2;
                        ipqVar.getClass();
                        iplVar.getClass();
                        final iqk e = iplVar.e(((jzk) obj3).a);
                        ei = ipqVar.ei(e.a, e.b, ffem.a, new ffji() { // from class: zda
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj4) {
                                iqj iqjVar = (iqj) obj4;
                                iqjVar.getClass();
                                iqk iqkVar = iqk.this;
                                iqjVar.e(iqkVar, 0, iqkVar.b / 2, 0.0f);
                                return ffcu.a;
                            }
                        });
                        return ei;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            gpa.c(iop.a(a2, (ffjn) R), eqlVar, j, 0L, 0.0f, 0.0f, a, zcg.d, b, 56);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zdc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    zdl.f(dyh.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final zcm zcmVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2067937244);
        if (i3 == 0) {
            i2 = (true != b.D(zcmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hkx a = hkf.a(zcmVar.a, b);
            zch a2 = a(a);
            b.v(-191438349);
            boolean D = b.D(a2);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                hic hicVar = new hic(a(a), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            b.v(-191434876);
            boolean D2 = b.D(hhoVar);
            Object R2 = hfmVar.R();
            if (D2 || R2 == hfc.a) {
                R2 = new ffji() { // from class: zcu
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        hho.this.b((zch) obj);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            ffji ffjiVar = (ffji) R2;
            hfmVar.Z();
            zch b2 = b(hhoVar);
            i(b2 != null ? b2.b : null, hpx.d(-1616234550, new zdh(zcmVar, ffjiVar, a, hhoVar), b), b, 48);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zcv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    zdl.g(zcm.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final List list, final zcj zcjVar, final zch zchVar, final zch zchVar2, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi b;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-2068574092);
        if (i3 == 0) {
            i2 = (true != b2.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(zcjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(zchVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(zchVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(ffjiVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b2.I()) {
            b2.s();
        } else {
            hve hveVar = hvi.e;
            eql eqlVar = zck.a;
            d = ebs.d(dee.a(hveVar, zck.a(b2), eqm.c(20.0f, 20.0f, 0.0f, 0.0f)), 1.0f);
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b2, 0);
            int a2 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, d);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, a, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            efg efgVar = new efg();
            dxr dxrVar = dxr.a;
            dxn dxnVar = new dxn(16.0f, true, dxrVar);
            dxn dxnVar2 = new dxn(18.0f, true, dxrVar);
            b = dys.b(eba.i(hvi.e, 20.0f, 0.0f, 2), 1.0f, true);
            hvi a3 = jfw.a(b, "ThemeGrid");
            b2.v(230049865);
            boolean F = b2.F(list) | b2.F(zchVar2);
            boolean z = (57344 & i2) == 16384;
            Object R = hfmVar.R();
            if ((F | z) || R == hfc.a) {
                R = new ffji() { // from class: zdd
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        efr efrVar = (efr) obj;
                        efrVar.getClass();
                        List list2 = list;
                        egr.a(efrVar, list2.size() + 1, null, new hpw(-1549134481, true, new zdk(list2, zchVar2, ffjiVar)), 14);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            efo.b(efgVar, a3, null, null, dxnVar, dxnVar2, null, false, null, (ffji) R, b2, 1769472, 0, 924);
            c(zcjVar, zchVar2, zchVar, b2, (i2 & 896) | ((i2 >> 3) & 14) | ((i2 >> 6) & 112));
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zde
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    zcj zcjVar2 = zcjVar;
                    zch zchVar3 = zchVar;
                    zch zchVar4 = zchVar2;
                    zdl.h(list2, zcjVar2, zchVar3, zchVar4, ffjiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final dwjy dwjyVar, ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        ffjm ffjmVar2;
        final ffjm ffjmVar3;
        int i3 = i & 6;
        hfd b = hfdVar.b(-359584400);
        if (i3 == 0) {
            i2 = (true != b.F(dwjyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            ffjmVar3 = ffjmVar;
        } else {
            b.v(2032244593);
            if (dwjyVar == null) {
                ffjmVar2 = null;
            } else {
                b.v(2032245709);
                boolean F = b.F(dwjyVar);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (F || R == hfc.a) {
                    R = new ffjm() { // from class: zcq
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Boolean) obj2).booleanValue();
                            ((Context) obj).getClass();
                            return dwjy.this;
                        }
                    };
                    hfmVar.ad(R);
                }
                ffjmVar2 = (ffjm) R;
                hfmVar.Z();
            }
            ffjm ffjmVar4 = ffjmVar2;
            ((hfm) b).Z();
            ffjmVar3 = ffjmVar;
            cwoi.a(null, ffjmVar4, dooy.g(b), null, false, ffjmVar3, b, (i2 << 12) & 458752, 25);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zcr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dwjy dwjyVar2 = dwjy.this;
                    int i4 = i;
                    zdl.i(dwjyVar2, ffjmVar3, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final dnsh dnshVar, hvi hviVar, final boolean z, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        hvi hviVar2;
        hvi d;
        hvi d2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-456854885);
        if (i3 == 0) {
            i2 = (true != b.D(dnshVar) ? 2 : 4) | i;
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
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjnVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar2, 1.0f);
            ipn a = dyo.a(dxu.c, dnsi.d(dnshVar), b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
            int i4 = ist.a;
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
            hve hveVar = hvi.e;
            dxi dxiVar = dxu.a;
            int i5 = huo.a;
            ipn a3 = ebm.a(dxiVar, hum.m, b, 0);
            int a4 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, hveVar);
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
            hvi a5 = ebr.a.a(hvi.e, 1.0f, dnshVar.f == dnor.c);
            ipn a6 = dyc.a(dnshVar.f == dnor.c ? hum.c : hum.a, false);
            int a7 = hey.a(b);
            hqb ai3 = hfmVar.ai();
            hvi b4 = huz.b(b, a5);
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a6, iss.e);
            hlc.b(b, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf3 = Integer.valueOf(a7);
                hfmVar.ad(valueOf3);
                b.h(valueOf3, ffjmVar3);
            }
            hlc.b(b, b4, iss.c);
            hvi d3 = ebs.d(hvi.e, 0.8f);
            ipn a8 = dyc.a(dnsi.e(dnshVar), false);
            int a9 = hey.a(b);
            hqb ai4 = hfmVar.ai();
            hvi b5 = huz.b(b, d3);
            ffix ffixVar4 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar4);
            } else {
                b.z();
            }
            hlc.b(b, a8, iss.e);
            hlc.b(b, ai4, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a9))) {
                Integer valueOf4 = Integer.valueOf(a9);
                hfmVar.ad(valueOf4);
                b.h(valueOf4, ffjmVar4);
            }
            hlc.b(b, b5, iss.c);
            hvi hviVar3 = hvi.e;
            if (z) {
                d2 = ebs.d(hviVar3, 1.0f);
                hviVar3 = ebs.g(d2, 28.0f);
            }
            hvi b6 = eao.b(hviVar3, 2);
            ipn a10 = dyo.a(dxu.c, hum.j, b, 0);
            int a11 = hey.a(b);
            hqb ai5 = hfmVar.ai();
            hvi b7 = huz.b(b, b6);
            ffix ffixVar5 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar5);
            } else {
                b.z();
            }
            hlc.b(b, a10, iss.e);
            hlc.b(b, ai5, iss.d);
            ffjm ffjmVar5 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a11))) {
                Integer valueOf5 = Integer.valueOf(a11);
                hfmVar.ad(valueOf5);
                b.h(valueOf5, ffjmVar5);
            }
            hlc.b(b, b7, iss.c);
            ffjnVar.a(dnsi.g(dnshVar), b, Integer.valueOf((i2 >> 6) & 112));
            b.n();
            b.n();
            b.n();
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            final hvi hviVar4 = hviVar2;
            L.d = new ffjm() { // from class: zcs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnsh dnshVar2 = dnsh.this;
                    hvi hviVar5 = hviVar4;
                    boolean z2 = z;
                    zdl.j(dnshVar2, hviVar5, z2, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.hvi r19, java.lang.String r20, boolean r21, defpackage.hfd r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdl.k(hvi, java.lang.String, boolean, hfd, int, int):void");
    }

    public static final void l(final hvi hviVar, final String str, final boolean z, final boolean z2, final String str2, final ffix ffixVar, hfd hfdVar, final int i) {
        hvi hviVar2;
        int i2;
        hvi d;
        hvi d2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1919960412);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(str2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffixVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar2, 1.0f);
            eql eqlVar = zck.a;
            hvi j = eba.j(d, 0.0f, 0.0f, 0.0f, 20.0f, 7);
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
            int i5 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
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
            dyi dyiVar = dyi.a;
            d2 = ebs.d(hvi.e, 1.0f);
            hvi a4 = hxo.a(dee.a(ebs.o(ebs.e(d2, 180.0f), 112.0f), zck.b(b), zck.a), zck.a);
            b.v(1766748124);
            int i6 = i2 & 458752;
            Object R = hfmVar.R();
            if (i6 == 131072 || R == hfc.a) {
                R = new ffix() { // from class: zcy
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffix.this.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            a = dlsj.a(jfw.a(eba.e(dfb.d(a4, false, null, (ffix) R, 7), zck.b, 40.0f), str2), str, true);
            ipn a5 = dyo.a(dxu.c, hum.j, b, 0);
            int a6 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, a);
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
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
            k(eba.j(hvi.e, 0.0f, 0.0f, 0.0f, 8.0f, 7), null, false, b, 6, 14);
            k(null, null, true, b, 3072, 7);
            b.n();
            if (z2 && !z) {
                b.v(-1065029261);
                d(dyiVar, b, 6);
                hfmVar.Z();
            } else if (z) {
                b.v(-1064975662);
                f(dyiVar, b, 6);
                hfmVar.Z();
            } else {
                b.v(-1064943949);
                hfmVar.Z();
            }
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zcz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    String str3 = str;
                    boolean z3 = z;
                    boolean z4 = z2;
                    String str4 = str2;
                    zdl.l(hviVar3, str3, z3, z4, str4, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

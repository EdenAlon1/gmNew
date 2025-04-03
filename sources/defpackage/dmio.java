package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmio {
    public static final void a(final hvi hviVar, final boolean z, final eey eeyVar, final int i, final int i2, final ffjn ffjnVar, hfd hfdVar, final int i3) {
        int i4;
        hvi a;
        int i5 = i3 & 6;
        hfd b = hfdVar.b(400288007);
        if (i5 == 0) {
            i4 = (true != b.D(hviVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != b.E(z) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != b.D(eeyVar) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != b.B(i) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != b.B(i2) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != b.F(ffjnVar) ? 65536 : 131072;
        }
        if ((74899 & i4) == 74898 && b.I()) {
            b.s();
        } else {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            final ffsk ffskVar = (ffsk) R;
            b.v(-534034894);
            hvi a2 = hxo.a(hviVar, eqm.a);
            if (z) {
                a = dee.a(hvi.e, gft.a(b).f, idb.a);
                a2 = a2.a(a);
            }
            hfmVar.Z();
            hvi e = eba.e(a2, 16.0f, 6.0f);
            b.v(-534026422);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new dwn();
                hfmVar.ad(R2);
            }
            dwn dwnVar = (dwn) R2;
            hfmVar.Z();
            b.v(-534023185);
            boolean F = b.F(ffskVar) | ((i4 & 896) == 256);
            boolean z2 = (57344 & i4) == 16384;
            boolean z3 = (i4 & 7168) == 2048;
            Object R3 = hfmVar.R();
            if ((F | z2 | z3) || R3 == hfc.a) {
                R3 = new ffix() { // from class: dmic
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffqy.d(ffsk.this, null, null, new dmie(eeyVar, i2, i, null), 3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            hvi c = dfb.c(e, dwnVar, null, false, null, null, (ffix) R3, 28);
            int i6 = (i4 >> 6) & 7168;
            int i7 = huo.a;
            ipn a3 = dyc.a(hum.a, false);
            int a4 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c);
            int i8 = ist.a;
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
            hlc.b(b, b2, iss.c);
            ffjnVar.a(dyi.a, b, Integer.valueOf(((i6 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmid
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    boolean z4 = z;
                    eey eeyVar2 = eeyVar;
                    int i9 = i;
                    int i10 = i2;
                    dmio.a(hviVar2, z4, eeyVar2, i9, i10, ffjnVar, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final int i, eey eeyVar, final List list, final int i2, hfd hfdVar, final int i3) {
        int i4;
        hvi a;
        eey eeyVar2;
        final int i5;
        final int i6;
        int i7 = i3 & 6;
        hfd b = hfdVar.b(-335217968);
        if (i7 == 0) {
            i4 = (true != b.B(i) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != b.D(eeyVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != b.F(list) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != b.B(i2) ? 1024 : 2048;
        }
        if ((i4 & 1171) == 1170 && b.I()) {
            b.s();
            eeyVar2 = eeyVar;
            i6 = i2;
            i5 = i;
        } else {
            hve hveVar = hvi.e;
            b.v(-678930984);
            int i8 = i4 & 7168;
            boolean F = ((i4 & 14) == 4) | (i8 == 2048) | b.F(list);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffjn() { // from class: dmhw
                    @Override // defpackage.ffjn
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        ipo ei;
                        ipq ipqVar = (ipq) obj;
                        ipl iplVar = (ipl) obj2;
                        ipqVar.getClass();
                        iplVar.getClass();
                        final iqk e = iplVar.e(((jzk) obj3).a);
                        int i9 = i - e.a;
                        int e2 = ffdx.e(list);
                        int i10 = e.a;
                        int i11 = i9 / 2;
                        final int i12 = i2;
                        final int i13 = i12 == 0 ? i11 : 0;
                        int i14 = i10 + i13;
                        int i15 = e.b;
                        ffji ffjiVar = new ffji() { // from class: dmib
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj4) {
                                iqj iqjVar = (iqj) obj4;
                                iqjVar.getClass();
                                iqj.m(iqjVar, e, i12 == 0 ? i13 : 0, 0);
                                return ffcu.a;
                            }
                        };
                        if (i12 != e2) {
                            i11 = 0;
                        }
                        ei = ipqVar.ei(i14 + i11, i15, ffem.a, ffjiVar);
                        return ei;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            a = dlsj.a(iop.a(hveVar, (ffjn) R), ((dmhu) list.get(i2)).b, true);
            eeyVar2 = eeyVar;
            c(a, eeyVar2, i, i2, ((dmhu) list.get(i2)).a, ((dmhu) list.get(i2)).c, b, (i4 & 112) | ((i4 << 6) & 896) | i8);
            i5 = i;
            i6 = i2;
        }
        hio L = b.L();
        if (L != null) {
            final eey eeyVar3 = eeyVar2;
            L.d = new ffjm() { // from class: dmhx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i9 = i5;
                    eey eeyVar4 = eeyVar3;
                    List list2 = list;
                    dmio.b(i9, eeyVar4, list2, i6, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final hvi hviVar, final eey eeyVar, final int i, final int i2, final String str, final ffix ffixVar, hfd hfdVar, final int i3) {
        hvi hviVar2;
        int i4;
        int i5;
        int i6 = i3 & 6;
        hfd b = hfdVar.b(356050140);
        if (i6 == 0) {
            hviVar2 = hviVar;
            i4 = (true != b.D(hviVar2) ? 2 : 4) | i3;
        } else {
            hviVar2 = hviVar;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != b.D(eeyVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 = i;
            i4 |= true != b.B(i5) ? 128 : 256;
        } else {
            i5 = i;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != b.B(i2) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != b.D(str) ? 8192 : 16384;
        }
        if ((i3 & 196608) == 0) {
            i4 |= true != b.F(ffixVar) ? 65536 : 131072;
        }
        int i7 = i4;
        if ((74899 & i7) == 74898 && b.I()) {
            b.s();
        } else {
            b.v(2076250898);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                ffix ffixVar2 = new ffix() { // from class: dmhz
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
                    
                        if (r2 <= r1) goto L19;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:3:0x0014, code lost:
                    
                        if (r3 == 0) goto L19;
                     */
                    @Override // defpackage.ffix
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke() {
                        /*
                            r7 = this;
                            eey r0 = defpackage.eey.this
                            eea r1 = r0.d()
                            java.util.List r1 = r1.i()
                            boolean r2 = r1.isEmpty()
                            int r3 = r2
                            r4 = 1
                            r5 = 0
                            if (r2 == 0) goto L19
                            if (r3 != 0) goto L17
                            goto L4b
                        L17:
                            r4 = r5
                            goto L4b
                        L19:
                            java.util.Iterator r1 = r1.iterator()
                        L1d:
                            boolean r2 = r1.hasNext()
                            if (r2 == 0) goto L2f
                            java.lang.Object r2 = r1.next()
                            r6 = r2
                            eei r6 = (defpackage.eei) r6
                            int r6 = r6.a
                            if (r6 != r3) goto L1d
                            goto L30
                        L2f:
                            r2 = 0
                        L30:
                            eei r2 = (defpackage.eei) r2
                            if (r2 == 0) goto L17
                            int r1 = r2.h
                            eea r0 = r0.d()
                            int r0 = r0.e()
                            int r0 = r0 / 2
                            int r2 = r2.g
                            int r1 = r1 / 2
                            int r2 = r2 + r1
                            int r3 = -r1
                            int r2 = r2 - r0
                            if (r3 > r2) goto L17
                            if (r2 > r1) goto L17
                        L4b:
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmhz.invoke():java.lang.Object");
                    }
                };
                hqg hqgVar = hkg.a;
                hgk hgkVar = new hgk(ffixVar2, null);
                hfmVar.ad(hgkVar);
                R = hgkVar;
            }
            hkx hkxVar = (hkx) R;
            hfmVar.Z();
            int i8 = i7 << 3;
            a(hviVar2, e(hkxVar), eeyVar, i5, i2, hpx.d(633934141, new dmif(str, hkxVar), b), b, (i7 & 14) | 196608 | (i8 & 896) | (i8 & 7168) | (57344 & i8));
            iir iirVar = (iir) b.e(jdr.h);
            Boolean valueOf = Boolean.valueOf(e(hkxVar));
            b.v(2076288252);
            boolean F = b.F(iirVar) | ((458752 & i7) == 131072);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new dmig(iirVar, ffixVar, hkxVar, null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hgs.g(valueOf, (ffjm) R2, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmia
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    eey eeyVar2 = eeyVar;
                    int i9 = i;
                    int i10 = i2;
                    String str2 = str;
                    dmio.c(hviVar3, eeyVar2, i9, i10, str2, ffixVar, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dyh dyhVar, final String str, final boolean z, hfd hfdVar, final int i) {
        int i2;
        long j;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-483883653);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hve hveVar = hvi.e;
            int i4 = huo.a;
            hvi a = dyhVar.a(hveVar, hum.e);
            if (z) {
                b.v(507738678);
                j = gft.a(b).g;
                ((hfm) b).Z();
            } else {
                b.v(507799128);
                j = gft.a(b).q;
                ((hfm) b).Z();
            }
            hfdVar2 = b;
            dwjt.b(str, a, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).m, hfdVar2, (i2 >> 3) & 14, 0, 65528);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmhy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    String str2 = str;
                    int i5 = i;
                    dmio.d(dyhVar2, str2, z, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final boolean e(hkx hkxVar) {
        return ((Boolean) hkxVar.a()).booleanValue();
    }

    public static final void f(final dmip dmipVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(281813848);
        if (i3 == 0) {
            i2 = (true != b.D(dmipVar) ? 2 : 4) | i;
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
            dym.a(hviVar2, null, hpx.d(-990166718, new dmin(dmipVar), b), b, ((i2 >> 3) & 14) | 3072, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmhv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmip dmipVar2 = dmip.this;
                    int i4 = i;
                    dmio.f(dmipVar2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

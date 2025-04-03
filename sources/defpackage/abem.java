package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abem {
    public static final hik a = new hky(new ffix() { // from class: abea
        @Override // defpackage.ffix
        public final Object invoke() {
            hik hikVar = abem.a;
            throw new IllegalStateException("PopupCameraLoader must be provided");
        }
    });

    public static final float a(hho hhoVar) {
        return ((jzq) hhoVar.a()).a;
    }

    public static final void b(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final void c(final abdn abdnVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(864551685);
        if (i3 == 0) {
            i2 = (true != b.D(abdnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            cywo.a((cyxb) hkf.a(abdnVar.n, b).a(), b, 0);
            hkx a2 = hkf.a(abdnVar.d, b);
            doau l = l(a2);
            dmvt dmvtVar = l instanceof dmvt ? (dmvt) l : null;
            b.v(-547455036);
            if (dmvtVar != null) {
                dmva.a(dmvtVar, null, b, 0);
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            doau l2 = l(a2);
            dmfn dmfnVar = l2 instanceof dmfn ? (dmfn) l2 : null;
            b.v(-547452947);
            if (dmfnVar != null) {
                abes.b(dmfnVar, null, b, 0);
            }
            hfmVar.Z();
            doau l3 = l(a2);
            abgs abgsVar = l3 instanceof abgs ? (abgs) l3 : null;
            b.v(-547450081);
            if (abgsVar != null) {
                abgsVar.a.a(b, 0);
            }
            hfmVar.Z();
            doau l4 = l(a2);
            dpld dpldVar = l4 instanceof dpld ? (dpld) l4 : null;
            b.v(-547448131);
            if (dpldVar != null) {
                ((dpla) b.e(a)).a(dpldVar, b);
            }
            hfmVar.Z();
            doau l5 = l(a2);
            abks abksVar = l5 instanceof abks ? (abks) l5 : null;
            if (abksVar != null) {
                abld.a(abksVar, b, 0);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abdp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int a3 = hip.a(i | 1);
                    abem.c(abdn.this, (hfd) obj, a3);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final abdn abdnVar, final god godVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(130331963);
        if ((i & 6) == 0) {
            i2 = (true != b.D(abdnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(godVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            ffxx ffxxVar = abdnVar.o;
            if (ffxxVar != null) {
                dsqb.b((dspo) hkt.b(ffxxVar, null, null, b, 2).a(), true == abdnVar.q.a ? godVar : null, b, 0);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abeb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    abdn abdnVar2 = abdn.this;
                    int a2 = hip.a(i3 | 1);
                    abem.d(abdnVar2, godVar, (hfd) obj, a2);
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.dyh r11, final defpackage.abdn r12, defpackage.hfd r13, final int r14) {
        /*
            r0 = r14 & 6
            r1 = -110886222(0xfffffffff96402b2, float:-7.3993647E34)
            hfd r6 = r13.b(r1)
            r13 = 2
            r1 = 1
            if (r0 != 0) goto L18
            boolean r0 = r6.D(r11)
            if (r1 == r0) goto L15
            r0 = r13
            goto L16
        L15:
            r0 = 4
        L16:
            r0 = r0 | r14
            goto L19
        L18:
            r0 = r14
        L19:
            r2 = r14 & 48
            if (r2 != 0) goto L29
            boolean r2 = r6.D(r12)
            if (r1 == r2) goto L26
            r2 = 16
            goto L28
        L26:
            r2 = 32
        L28:
            r0 = r0 | r2
        L29:
            r2 = r0 & 19
            r3 = 18
            if (r2 != r3) goto L3c
            boolean r2 = r6.I()
            if (r2 != 0) goto L36
            goto L3c
        L36:
            r6.s()
        L39:
            r2 = r11
            goto Lab
        L3c:
            fgdj r2 = r12.i
            hkx r2 = defpackage.hkf.a(r2, r6)
            java.lang.Object r2 = r2.a()
            zek r2 = (defpackage.zek) r2
            r9 = 0
            if (r2 == 0) goto L62
            eylg r2 = r2.a
            if (r2 == 0) goto L62
            eylo r2 = defpackage.eylh.a(r2)
            if (r2 == 0) goto L62
            int r3 = r2.b
            r3 = r3 & r1
            if (r3 == 0) goto L62
            eylm r2 = r2.c
            if (r2 != 0) goto L60
            eylm r2 = defpackage.eylm.a
        L60:
            r10 = r2
            goto L63
        L62:
            r10 = r9
        L63:
            if (r10 == 0) goto L39
            int r2 = r10.b
            r1 = r1 & r2
            if (r1 == 0) goto L72
            eylk r1 = r10.c
            if (r1 != 0) goto L70
            eylk r1 = defpackage.eylk.a
        L70:
            r3 = r1
            goto L73
        L72:
            r3 = r9
        L73:
            r1 = 1239896031(0x49e74fdf, float:1894907.9)
            r6.v(r1)
            if (r3 == 0) goto L85
            r7 = r0 & 14
            r8 = 6
            r4 = 0
            r5 = 0
            r2 = r11
            defpackage.dmxe.a(r2, r3, r4, r5, r6, r7, r8)
            goto L86
        L85:
            r2 = r11
        L86:
            r11 = r6
            hfm r11 = (defpackage.hfm) r11
            r11.Z()
            int r1 = r10.b
            r13 = r13 & r1
            if (r13 == 0) goto L97
            eylk r9 = r10.d
            if (r9 != 0) goto L97
            eylk r9 = defpackage.eylk.a
        L97:
            r3 = r9
            r13 = 1239898815(0x49e75abf, float:1895255.9)
            r6.v(r13)
            if (r3 == 0) goto La8
            r7 = r0 & 14
            r8 = 6
            r4 = 0
            r5 = 0
            defpackage.dmxe.a(r2, r3, r4, r5, r6, r7, r8)
        La8:
            r11.Z()
        Lab:
            hio r11 = r6.L()
            if (r11 == 0) goto Lb8
            abdq r13 = new abdq
            r13.<init>()
            r11.d = r13
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abem.e(dyh, abdn, hfd, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.dyh r9, final defpackage.abdn r10, defpackage.hfd r11, final int r12) {
        /*
            r0 = r12 & 6
            r1 = -1295705785(0xffffffffb2c51947, float:-2.2945313E-8)
            hfd r6 = r11.b(r1)
            r11 = 2
            r1 = 1
            if (r0 != 0) goto L18
            boolean r0 = r6.D(r9)
            if (r1 == r0) goto L15
            r0 = r11
            goto L16
        L15:
            r0 = 4
        L16:
            r0 = r0 | r12
            goto L19
        L18:
            r0 = r12
        L19:
            r2 = r12 & 48
            if (r2 != 0) goto L29
            boolean r2 = r6.D(r10)
            if (r1 == r2) goto L26
            r2 = 16
            goto L28
        L26:
            r2 = 32
        L28:
            r0 = r0 | r2
        L29:
            r2 = r0 & 19
            r3 = 18
            if (r2 != r3) goto L3b
            boolean r2 = r6.I()
            if (r2 != 0) goto L36
            goto L3b
        L36:
            r6.s()
        L39:
            r2 = r9
            goto L88
        L3b:
            fgdj r2 = r10.i
            hkx r2 = defpackage.hkf.a(r2, r6)
            java.lang.Object r2 = r2.a()
            zek r2 = (defpackage.zek) r2
            r3 = 0
            if (r2 == 0) goto L60
            eylg r2 = r2.a
            if (r2 == 0) goto L60
            eylo r2 = defpackage.eylh.a(r2)
            if (r2 == 0) goto L60
            int r4 = r2.b
            r11 = r11 & r4
            if (r11 == 0) goto L60
            eylq r11 = r2.d
            if (r11 != 0) goto L61
            eylq r11 = defpackage.eylq.a
            goto L61
        L60:
            r11 = r3
        L61:
            if (r11 == 0) goto L39
            int r2 = r11.b
            r1 = r1 & r2
            if (r1 == 0) goto L6e
            eylk r3 = r11.c
            if (r3 != 0) goto L6e
            eylk r3 = defpackage.eylk.a
        L6e:
            r11 = -505360984(0xffffffffe1e0cda8, float:-5.1836122E20)
            r6.v(r11)
            if (r3 == 0) goto L81
            ffix r5 = r10.l
            r7 = r0 & 14
            r8 = 2
            r4 = 0
            r2 = r9
            defpackage.dmxe.a(r2, r3, r4, r5, r6, r7, r8)
            goto L82
        L81:
            r2 = r9
        L82:
            r9 = r6
            hfm r9 = (defpackage.hfm) r9
            r9.Z()
        L88:
            hio r9 = r6.L()
            if (r9 == 0) goto L95
            abdw r11 = new abdw
            r11.<init>()
            r9.d = r11
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abem.f(dyh, abdn, hfd, int):void");
    }

    public static final void g(final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1213713004);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            final rva a2 = rvd.a(b);
            b.v(28577777);
            boolean z2 = z && !dfq.a(b);
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            if (z2) {
                b.v(885967912);
                long j = ibw.g;
                b.v(28583146);
                boolean D = b.D(a2);
                Object R = hfmVar.R();
                if (D || R == hfc.a) {
                    R = new ffix() { // from class: abdr
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            hik hikVar = abem.a;
                            rva.this.a(ibw.g, true, rvd.b);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                cwni.b(a2, j, false, (ffix) R, b, 432, 0);
                long j2 = ibw.g;
                b.v(28590542);
                boolean D2 = b.D(a2);
                Object R2 = hfmVar.R();
                if (D2 || R2 == hfc.a) {
                    R2 = new ffix() { // from class: abds
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            hik hikVar = abem.a;
                            rva.this.b(ibw.g, true, rvd.b);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R2);
                }
                hfmVar.Z();
                cwni.a(a2, j2, false, (ffix) R2, b, 432, 0);
                hfmVar.Z();
            } else {
                b.v(886426712);
                cwni.b(a2, ibw.g, false, null, b, 48, 12);
                cwni.a(a2, ibw.g, false, null, b, 48, 12);
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abdt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int a3 = hip.a(i | 1);
                    abem.g(z, (hfd) obj, a3);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final abdn abdnVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-947673567);
        if (i3 == 0) {
            i2 = (true != b.D(abdnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hio L = b.L();
            if (L != null) {
                L.d = new ffjm() { // from class: abdv
                    @Override // defpackage.ffjm
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int i4 = i;
                        abdn abdnVar2 = abdn.this;
                        int a2 = hip.a(i4 | 1);
                        abem.h(abdnVar2, ffjmVar, (hfd) obj, a2);
                        return ffcu.a;
                    }
                };
                return;
            }
            return;
        }
        b.v(656488075);
        ffjmVar.a(b, Integer.valueOf((i2 >> 3) & 14));
        ((hfm) b).Z();
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: abdu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    abdn abdnVar2 = abdn.this;
                    int a2 = hip.a(i4 | 1);
                    abem.h(abdnVar2, ffjmVar, (hfd) obj, a2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final abdn abdnVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int intValue;
        int i3;
        float f;
        hho hhoVar;
        long j;
        hvi c;
        hvi a2;
        hvi c2;
        hfd hfdVar2;
        hfd b = hfdVar.b(-1203075803);
        if ((i & 6) == 0) {
            i2 = (true != b.D(abdnVar) ? 2 : 4) | i;
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
            g(z, b, (i2 >> 3) & 14);
            gvr c3 = dweu.c(-3.4028235E38f, b, 0);
            b.v(-297947049);
            b.v(-2121367903);
            b.v(2097175771);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffix() { // from class: dwkg
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return true;
                    }
                };
                hfmVar.ad(R);
            }
            ffix ffixVar = (ffix) R;
            hfmVar.Z();
            boolean D = b.D(c3) | b.D(ffixVar);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new gkb(c3, ffixVar);
                hfmVar.ad(R2);
            }
            gkb gkbVar = (gkb) R2;
            hfmVar.Z();
            hfmVar.Z();
            b.v(-1949268057);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                R3 = new god();
                hfmVar.ad(R3);
            }
            god godVar = (god) R3;
            hfmVar.Z();
            b.v(-1949265566);
            int i4 = i2 & 14;
            Object R4 = hfmVar.R();
            if (i4 == 4 || R4 == hfc.a) {
                R4 = new abee(abdnVar, godVar, null);
                hfmVar.ad(R4);
            }
            hfmVar.Z();
            hgs.g(godVar, (ffjm) R4, b);
            final jzn jznVar = (jzn) b.e(jdr.e);
            if (abdnVar.q.b) {
                Object e = wpl.d.e();
                e.getClass();
                intValue = ((Number) e).intValue();
            } else {
                Object e2 = wpl.c.e();
                e2.getClass();
                intValue = ((Number) e2).intValue();
            }
            float f2 = intValue;
            b.v(-1949244086);
            Object R5 = hfmVar.R();
            if (R5 == hfc.a) {
                i3 = 0;
                hic hicVar = new hic(new jzq(480.0f), hla.a);
                hfmVar.ad(hicVar);
                R5 = hicVar;
            } else {
                i3 = 0;
            }
            final hho hhoVar2 = (hho) R5;
            hfmVar.Z();
            jznVar.getClass();
            b.v(1086948913);
            hkx a3 = hku.a(new jzq(new eal(ecv.d(b), jznVar).a()), b);
            hfmVar.Z();
            b.v(-1949239874);
            float f3 = abdnVar.q.b ? ((jzq) ffmk.m(new jzq(((jzn) b.e(jdr.e)).ek(((Number) hkt.b(abdnVar.h, Integer.valueOf(i3), null, b, 2).a()).intValue())), new jzq(0.0f))).a : ((jzq) a3.a()).a;
            hfmVar.Z();
            b.v(-1949227288);
            Object R6 = hfmVar.R();
            if (R6 == hfc.a) {
                hic hicVar2 = new hic(true, hla.a);
                hfmVar.ad(hicVar2);
                R6 = hicVar2;
            }
            hho hhoVar3 = (hho) R6;
            hfmVar.Z();
            if (abdnVar.m) {
                b.v(-296413913);
                f = f3;
                hhoVar = hhoVar3;
                j = dooy.a(b).E;
                hfmVar.Z();
            } else {
                f = f3;
                hhoVar = hhoVar3;
                b.v(-296356532);
                j = gft.a(b).p;
                hfmVar.Z();
            }
            long j2 = j;
            c = ebs.c(hvi.e, 1.0f);
            float f4 = f;
            a2 = ijk.a(ecm.b(c, new eat(ecv.f(b), 15)), gkbVar.c, null);
            b.v(-1949213518);
            Object R7 = hfmVar.R();
            if (R7 == hfc.a) {
                R7 = new ffji() { // from class: abdx
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        hik hikVar = abem.a;
                        jkvVar.getClass();
                        jks.a(jkvVar);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R7);
            }
            hfmVar.Z();
            c2 = jjs.c(a2, false, (ffji) R7);
            b.v(-1949203905);
            int i5 = (b.D(jznVar) ? 1 : 0) | (i4 == 4 ? 1 : i3);
            Object R8 = hfmVar.R();
            if (i5 != 0 || R8 == hfc.a) {
                R8 = new ffji() { // from class: abdy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ioc iocVar = (ioc) obj;
                        hik hikVar = abem.a;
                        iocVar.getClass();
                        iam c4 = iod.c(iocVar);
                        abdnVar.j.a(Integer.valueOf((int) c4.b), Integer.valueOf((int) c4.c), Integer.valueOf((int) c4.d), Integer.valueOf((int) c4.e));
                        hhoVar2.b(new jzq(jzn.this.ek((int) (iocVar.g() & 4294967295L))));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R8);
            }
            hfmVar.Z();
            hfdVar2 = b;
            dwio.a(ipx.a(c2, (ffji) R8), hpx.d(-1761635615, new abeg(f4, f2, jznVar, abdnVar, gkbVar, hhoVar2, hhoVar), b), null, hpx.d(-1252856801, new abeh(godVar, abdnVar, f4), b), null, 0, j2, 0L, null, hpx.d(1352036598, new abel(abdnVar, godVar, hhoVar2), b), hfdVar2, 805309488, 436);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abdz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    abdn abdnVar2 = abdn.this;
                    int a4 = hip.a(i6 | 1);
                    abem.i(abdnVar2, z, (hfd) obj, a4);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-237202428);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dwho.a(jie.a(R.drawable.gs_sports_and_outdoors_vd_theme_24, b, 0), null, jfw.a(hviVar, "mlsWatermark"), gft.a(b).s, b, 48, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abdo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int a2 = hip.a(i | 1);
                    abem.j(hvi.this, (hfd) obj, a2);
                    return ffcu.a;
                }
            };
        }
    }

    private static final doau l(hkx hkxVar) {
        return (doau) hkxVar.a();
    }
}

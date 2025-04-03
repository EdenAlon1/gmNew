package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnrv {
    public static final float a(float f) {
        return Math.min(Math.abs(f) / 250.0f, 1.0f);
    }

    public static final hvi b(hvi hviVar, dnsh dnshVar, ffix ffixVar, iir iirVar) {
        hvi a;
        a = hviVar.a(new hva("com.google.android.libraries.communications.ux.components.message.bubble.addBubbleTouchGestures", dnshVar, new dnre(dnshVar, iirVar, ffixVar)));
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.dnsh r20, defpackage.hvi r21, boolean r22, defpackage.cxj r23, defpackage.dntj r24, final defpackage.ffjn r25, defpackage.hfd r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnrv.c(dnsh, hvi, boolean, cxj, dntj, ffjn, hfd, int, int):void");
    }

    public static final void d(final ebq ebqVar, final dnsh dnshVar, final boolean z, final ffix ffixVar, final hho hhoVar, final float f, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        ffix ffixVar2;
        hho hhoVar2;
        float f2;
        ffjn ffjnVar2;
        huo huoVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1993637418);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnshVar) ? 16 : 32;
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
            hhoVar2 = hhoVar;
            i2 |= true != b.D(hhoVar2) ? 8192 : 16384;
        } else {
            hhoVar2 = hhoVar;
        }
        if ((196608 & i) == 0) {
            f2 = f;
            i2 |= true != b.A(f2) ? 65536 : 131072;
        } else {
            f2 = f;
        }
        if ((1572864 & i) == 0) {
            ffjnVar2 = ffjnVar;
            i2 |= true != b.F(ffjnVar2) ? 524288 : 1048576;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if ((599187 & i2) == 599186 && b.I()) {
            b.s();
        } else {
            iir iirVar = (iir) b.e(jdr.h);
            b.v(1339470101);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new hhw(1.0f);
                hfmVar.ad(R);
            }
            hjx hjxVar = (hjx) R;
            hfmVar.Z();
            hvi a = hxe.a(ebqVar.a(hvi.e, 1.0f, dnshVar.f == dnor.c || dnshVar.f == dnor.b), true != dnshVar.p ? 1.0f : 0.6f);
            int ordinal = dnshVar.f.ordinal();
            if (ordinal == 0) {
                int i4 = huo.a;
                huoVar = hum.a;
            } else if (ordinal == 1) {
                int i5 = huo.a;
                huoVar = hum.b;
            } else {
                if (ordinal != 2) {
                    throw new ffcd();
                }
                int i6 = huo.a;
                huoVar = hum.c;
            }
            ipn a2 = dyc.a(huoVar, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i7 = ist.a;
            ffix ffixVar3 = iss.a;
            b.x();
            int i8 = i2;
            if (hfmVar.z) {
                b.j(ffixVar3);
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
            hus husVar = hum.o;
            hve hveVar = hvi.e;
            ipn a4 = ebm.a(dxu.a, husVar, b, 48);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, hveVar);
            ffix ffixVar4 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar4);
            } else {
                b.z();
            }
            hlc.b(b, a4, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            b.v(-1221907994);
            if (dnshVar.f == dnor.c) {
                m(dnshVar, b, (i8 >> 3) & 14);
            }
            hfmVar.Z();
            n(((jgi) b.e(jdr.n)).d() * dnshVar.B.b, hpx.d(-1204088498, new dnqr(dnshVar, ffixVar2, iirVar, hhoVar2, z, hjxVar, f2, ffjnVar2), b), b, 48);
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnpx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    dnsh dnshVar2 = dnshVar;
                    boolean z2 = z;
                    ffix ffixVar5 = ffixVar;
                    hho hhoVar3 = hhoVar;
                    float f3 = f;
                    dnrv.d(ebqVar2, dnshVar2, z2, ffixVar5, hhoVar3, f3, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final hvi hviVar, final dnsh dnshVar, final boolean z, final dnoo dnooVar, final cxj cxjVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1610783045);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnshVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(dnooVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((i & 32768) == 0 ? b.D(cxjVar) : b.F(cxjVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffjnVar) ? 65536 : 131072;
        }
        int i4 = i2;
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
            b.v(1116884641);
            final boolean z2 = (((Boolean) dooy.b(b).c.invoke()).booleanValue() && z) || (!((Boolean) dooy.b(b).c.invoke()).booleanValue() && dlsp.b(b));
            hfmVar.Z();
            d = ebs.d(hviVar, 1.0f);
            hvi f = eba.f(d, dnsi.b(dnshVar), dnsi.c(dnshVar), 8.0f, dnsi.a(dnshVar, ((Boolean) dooy.b(b).e.invoke()).booleanValue() && z2 && dnshVar.n != null));
            if (dnshVar.y != null) {
                f = f.a(hvr.a(hvi.e, 1.0f));
            }
            hvi hviVar2 = f;
            b.v(1116909175);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new dwn();
                hfmVar.ad(R2);
            }
            dwn dwnVar = (dwn) R2;
            hfmVar.Z();
            b.v(1116911604);
            boolean E = ((i4 & 112) == 32) | b.E(z2) | b.F(ffskVar) | ((57344 & i4) == 16384 || ((i4 & 32768) != 0 && b.F(cxjVar)));
            boolean z3 = (i4 & 7168) == 2048;
            Object R3 = hfmVar.R();
            if ((E | z3) || R3 == hfc.a) {
                ffix ffixVar = new ffix() { // from class: dnos
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dnto dntoVar;
                        dnsh dnshVar2 = dnsh.this;
                        if (!dnrv.o(dnshVar2) || ((dnshVar2.B.g && z2) || !((dntoVar = dnshVar2.l) == null || dntoVar.b().isEmpty()))) {
                            dnooVar.a();
                        } else if (dnshVar2.A) {
                            ffqy.d(ffskVar, null, null, new dnqs(cxjVar, null), 3);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(ffixVar);
                R3 = ffixVar;
            }
            hfmVar.Z();
            hvi c = dfb.c(hviVar2, dwnVar, null, false, null, null, (ffix) R3, 28);
            int i5 = (i4 >> 6) & 7168;
            ipn a = dyo.a(dxu.c, dnsi.d(dnshVar), b, 0);
            int a2 = hey.a(b);
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
            ffjnVar.a(dys.a, b, Integer.valueOf(((i5 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnpc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dnsh dnshVar2 = dnshVar;
                    boolean z4 = z;
                    dnoo dnooVar2 = dnooVar;
                    cxj cxjVar2 = cxjVar;
                    dnrv.e(hviVar3, dnshVar2, z4, dnooVar2, cxjVar2, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0378  */
    /* JADX WARN: Type inference failed for: r14v1, types: [cyq, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.dnsh r23, final boolean r24, final defpackage.dnoo r25, final defpackage.cxj r26, defpackage.hvi r27, final defpackage.ffjn r28, defpackage.hfd r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 1303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnrv.f(dnsh, boolean, dnoo, cxj, hvi, ffjn, hfd, int, int):void");
    }

    public static final void g(final hvi hviVar, final dnsh dnshVar, final dnto dntoVar, final dntj dntjVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1548232062);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnshVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dntoVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(dntjVar) ? 1024 : 2048;
        }
        int i4 = i2;
        if ((i4 & 1171) == 1170 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            if (dntoVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dnpm
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            hvi hviVar2 = hvi.this;
                            dnsh dnshVar2 = dnshVar;
                            dnrv.g(hviVar2, dnshVar2, null, dntjVar, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            hfdVar2 = b;
            q(dnshVar, dntoVar, dntjVar, eba.j(hviVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), hfdVar2, (i4 >> 3) & 1022);
        }
        hio L2 = hfdVar2.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dnpo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    dnsh dnshVar2 = dnshVar;
                    dnto dntoVar2 = dntoVar;
                    dnrv.g(hviVar2, dnshVar2, dntoVar2, dntjVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final dyh dyhVar, eylk eylkVar, final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        eylk eylkVar2;
        final dyh dyhVar2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1131582538);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(eylkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffixVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            eylkVar2 = eylkVar;
            ffixVar2 = ffixVar;
            dyhVar2 = dyhVar;
        } else {
            if (eylkVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dnpp
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dyh dyhVar3 = dyh.this;
                            boolean z2 = z;
                            dnrv.h(dyhVar3, null, z2, ffixVar, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            int i4 = (i2 & 14) | 384;
            int i5 = i2 & 112;
            int i6 = i2 & 7168;
            eylkVar2 = eylkVar;
            dmxe.a(dyhVar, eylkVar2, true, ffixVar, b, i4 | i5 | i6, 0);
            dyhVar2 = dyhVar;
            ffixVar2 = ffixVar;
            if (z) {
                Object e = b.e(lnr.a);
                b.v(1778292784);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (i6 == 2048 || R == hfc.a) {
                    R = new ffji() { // from class: dnpq
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ((hgp) obj).getClass();
                            return new dnqv(ffix.this);
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                hgs.c(e, (ffji) R, b);
            }
        }
        hio L2 = b.L();
        if (L2 != null) {
            final eylk eylkVar3 = eylkVar2;
            L2.d = new ffjm() { // from class: dnpr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar3 = dyh.this;
                    eylk eylkVar4 = eylkVar3;
                    boolean z2 = z;
                    dnrv.h(dyhVar3, eylkVar4, z2, ffixVar2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final dyh dyhVar, final dnsh dnshVar, hfd hfdVar, final int i) {
        int i2;
        huo huoVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(513315059);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnshVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-1472148059);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(null, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            dnve dnveVar = dnshVar.j;
            if (dnveVar != null) {
                j(hhoVar, dnveVar);
            }
            dnve dnveVar2 = (dnve) hhoVar.a();
            if (dnveVar2 == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dnqc
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dyh dyhVar2 = dyh.this;
                            int i4 = i;
                            dnrv.i(dyhVar2, dnshVar, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            hvi k = ebs.k(hvi.e, 0.0f);
            if (dnshVar.f == dnor.a) {
                int i4 = huo.a;
                huoVar = hum.a;
            } else {
                int i5 = huo.a;
                huoVar = hum.c;
            }
            hvi a = dyhVar.a(k, huoVar);
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
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
            boolean z = dnshVar.j == null;
            b.v(1914683817);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffix() { // from class: dnqd
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dnrv.j(hho.this, null);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            dnvb.a(dnveVar2, (ffix) R2, z, b, 48);
            b.n();
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dnot
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    int i7 = i;
                    dnrv.i(dyhVar2, dnshVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(hho hhoVar, dnve dnveVar) {
        hhoVar.b(dnveVar);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [cyq, java.lang.Object] */
    public static final void k(final dyh dyhVar, final dnsh dnshVar, final hho hhoVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3;
        Object e;
        int i4;
        huo huoVar;
        int i5 = i & 6;
        hfd b = hfdVar.b(319961404);
        if (i5 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnshVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hhoVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            if (dnshVar.v == null || !z) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dnpi
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dyh dyhVar2 = dyh.this;
                            dnsh dnshVar2 = dnshVar;
                            hho hhoVar2 = hhoVar;
                            dnrv.k(dyhVar2, dnshVar2, hhoVar2, z, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            b.v(-1314083096);
            b.v(716119235);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            Object obj = R;
            if (R == hfc.a) {
                czq czqVar = new czq(hhoVar.a());
                czqVar.d(Float.valueOf(0.0f));
                hfmVar.ad(czqVar);
                obj = czqVar;
            }
            hfmVar.Z();
            dbe d = dbs.d((czq) obj, null, b, 0, 2);
            dnrh dnrhVar = dnrh.a;
            dbv dbvVar = dcp.a;
            if (d.t()) {
                i3 = 0;
                b.v(1888611722);
                hfmVar.Z();
                e = d.e();
            } else {
                b.v(1888357677);
                boolean D = b.D(d);
                i3 = 0;
                e = hfmVar.R();
                if (D || e == hfc.a) {
                    hrw a = hrv.a();
                    ffji k = a != null ? a.k() : null;
                    hrw b2 = hrv.b(a);
                    try {
                        Object e2 = d.e();
                        hrv.e(a, b2, k);
                        hfmVar.ad(e2);
                        e = e2;
                    } catch (Throwable th) {
                        hrv.e(a, b2, k);
                        throw th;
                    }
                }
                hfmVar.Z();
            }
            b.v(343572223);
            ((Number) ((czq) e).b()).floatValue();
            float floatValue = ((Number) hhoVar.a()).floatValue();
            hfmVar.Z();
            Float valueOf = Float.valueOf(floatValue);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                dnrf dnrfVar = new dnrf(d);
                hqg hqgVar = hkg.a;
                hgk hgkVar = new hgk(dnrfVar, null);
                hfmVar.ad(hgkVar);
                R2 = hgkVar;
            }
            czq czqVar2 = (czq) ((hkx) R2).a();
            b.v(343572223);
            ((Number) czqVar2.b()).floatValue();
            float floatValue2 = ((Number) hhoVar.a()).floatValue();
            hfmVar.Z();
            Float valueOf2 = Float.valueOf(floatValue2);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                dnrg dnrgVar = new dnrg(d);
                hqg hqgVar2 = hkg.a;
                hgk hgkVar2 = new hgk(dnrgVar, null);
                hfmVar.ad(hgkVar2);
                R3 = hgkVar2;
            }
            int i6 = i3;
            float floatValue3 = ((Number) dbs.f(d, valueOf, valueOf2, dnrhVar.a(((hkx) R3).a(), b, Integer.valueOf(i3)), dbvVar, b, 196608).a()).floatValue();
            hfmVar.Z();
            b.v(-1563757615);
            int i7 = (!o(dnshVar) || v(dnshVar, b)) ? i6 : 1;
            hfmVar.Z();
            if (i7 != 0) {
                i4 = -60;
            } else {
                i4 = (dnshVar.f == dnor.a ? -1 : 1) * 60;
            }
            b.v(-1563750063);
            int i8 = (!o(dnshVar) || v(dnshVar, b)) ? i6 : 1;
            hfmVar.Z();
            if (i8 != 0) {
                int i9 = huo.a;
                huoVar = hum.d;
            } else if (dnshVar.f == dnor.a) {
                int i10 = huo.a;
                huoVar = hum.d;
            } else {
                int i11 = huo.a;
                huoVar = hum.f;
            }
            dwho.a(dnaa.a(dmzz.da, b), null, eba.d(dyhVar.a(ebs.k(dee.a(hxe.a(eau.c(hvi.e, i4, 0.0f, 2), floatValue3), gft.a(b).a, eqm.a), 40.0f), huoVar), 8.0f), gft.a(b).b, b, 48, 0);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dnpj
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dyh dyhVar2 = dyh.this;
                    dnsh dnshVar2 = dnshVar;
                    hho hhoVar2 = hhoVar;
                    dnrv.k(dyhVar2, dnshVar2, hhoVar2, z, (hfd) obj2, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final dnsh dnshVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-1582085528);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dnshVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dofn dofnVar = dnshVar.o;
            if (dofnVar != null) {
                dofm.a(dofnVar, true != dnshVar.i ? 0.0f : 162.0f, dnrx.b(0.0f, o(dnshVar), dnshVar.d != null, b, 1), dnop.a(dnsi.g(dnshVar)), b, 0);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnph
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    dnrv.l(dnsh.this, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void m(final dnsh dnshVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1402072831);
        if (i3 == 0) {
            i2 = (true != b.D(dnshVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dnsj dnsjVar = dnshVar.d;
            if (dnsjVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dnqa
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            dnrv.m(dnsh.this, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            b.v(-1791803446);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            dwn dwnVar = (dwn) R;
            hfmVar.Z();
            hve hveVar = hvi.e;
            hveVar.getClass();
            b.v(1005712476);
            b.v(-266083880);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffji() { // from class: dnnv
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        czn cznVar = (czn) obj;
                        cznVar.getClass();
                        cznVar.a = 450;
                        Float valueOf = Float.valueOf(1.0f);
                        cznVar.a(valueOf, 0);
                        czm a2 = cznVar.a(Float.valueOf(0.9754f), 100);
                        cyh cyhVar = dnnu.a;
                        a2.b = dnnu.a;
                        cznVar.a(Float.valueOf(1.0377f), 267).b = dnnu.b;
                        cznVar.a(valueOf, 450).b = dnnu.c;
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            czo a2 = cxu.a((ffji) R2);
            b.v(-266072606);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                R3 = cxk.a(0.0f);
                hfmVar.ad(R3);
            }
            cxj cxjVar = (cxj) R3;
            hfmVar.Z();
            b.v(-266070129);
            boolean F = b.F(cxjVar);
            Object R4 = hfmVar.R();
            if (F || R4 == hfc.a) {
                R4 = new dnnw(cxjVar, a2, null);
                hfmVar.ad(R4);
            }
            hfmVar.Z();
            hgs.g("suggestionShortcutAnimation", (ffjm) R4, b);
            float floatValue = ((Number) cxjVar.d()).floatValue();
            hvi a3 = hya.a(hveVar, floatValue, floatValue);
            hfmVar.Z();
            a = dlsj.a(a3, dnsjVar.b, true);
            hvi f = eba.f(dfb.c(ebs.a(a, 48.0f, 40.0f), dwnVar, null, false, null, null, dnsjVar.c, 28), 8.0f, 2.0f, 8.0f, 2.0f);
            int i4 = huo.a;
            ipn a4 = dyc.a(hum.e, false);
            int a5 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, f);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a4, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            hvi c = dek.c(dfb.c(hxo.a(ebs.h(hvi.e, 36.0f), eqm.a), dwnVar, gkw.a(false, 0.0f, 0L, 7), false, null, null, dnsjVar.c, 28), 1.0f, gft.a(b).B, eqm.a);
            ipn a6 = dyc.a(hum.e, false);
            int a7 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, c);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a6, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf2 = Integer.valueOf(a7);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            dwho.a(dnaa.a(dnsjVar.a, b), null, ebs.k(hvi.e, 22.0f), gft.a(b).a, b, 384, 0);
            b.n();
            b.n();
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dnqb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dnrv.m(dnsh.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void n(final float f, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        ffjmVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1255066995);
        if (i3 == 0) {
            i2 = (true != b.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hfz.a(jdr.n.c(new dnqw(b, f)), ffjmVar, b, (i2 & 112) | 8);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnpu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    int i4 = i;
                    dnrv.n(f2, ffjmVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final boolean o(dnsh dnshVar) {
        return dnshVar.B.c && dnshVar.f != dnor.b;
    }

    public static final void p(final dys dysVar, final dnsh dnshVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(834215989);
        if (i3 == 0) {
            i2 = (true != b.D(dysVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnshVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dmcg dmcgVar = dnshVar.n;
            if (dmcgVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dnpy
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dys dysVar2 = dys.this;
                            int i4 = i;
                            dnrv.p(dysVar2, dnshVar, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            hve hveVar = hvi.e;
            int i4 = huo.a;
            hvi j = eba.j(dys.a(hveVar, hum.l), 0.0f, 0.0f, 0.0f, 2.0f, 7);
            if (((Boolean) dooy.b(b).e.invoke()).booleanValue() && dlsp.b(b)) {
                j = j.a(eau.c(hvi.e, 0.0f, -9.0f, 1));
            }
            dmcf.p(dmcgVar, j, b, 0);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dnpz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dys dysVar2 = dys.this;
                    int i5 = i;
                    dnrv.p(dysVar2, dnshVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void q(final dnsh dnshVar, final dnto dntoVar, final dntj dntjVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final dnsh dnshVar2;
        final dnto dntoVar2;
        final dntj dntjVar2;
        final hvi hviVar2;
        final int i3;
        int i4 = i & 6;
        hfd b = hfdVar.b(-26539395);
        if (i4 == 0) {
            i2 = (true != b.D(dnshVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dntoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dntjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            dnshVar2 = dnshVar;
            dntoVar2 = dntoVar;
            dntjVar2 = dntjVar;
            hviVar2 = hviVar;
            i3 = i;
        } else {
            if (dntoVar.b().isEmpty()) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dnpv
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dnsh dnshVar3 = dnsh.this;
                            dnto dntoVar3 = dntoVar;
                            dntj dntjVar3 = dntjVar;
                            dnrv.q(dnshVar3, dntoVar3, dntjVar3, hviVar, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            dnshVar2 = dnshVar;
            dntoVar2 = dntoVar;
            dntjVar2 = dntjVar;
            hviVar2 = hviVar;
            i3 = i;
            int i5 = i2 >> 3;
            boolean z = dnshVar2.w;
            hvi hviVar3 = hvi.e;
            if (!z) {
                hviVar3 = dlsj.c(hviVar3);
            }
            hvi a = hviVar3.a(hviVar2);
            int i6 = huo.a;
            ipn a2 = ebm.a(dxu.a, hum.o, b, 48);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
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
            int i8 = i5 & 14;
            hlc.b(b, b2, iss.c);
            if (dntjVar2 != null) {
                b.v(1443528829);
                dnte.b(dntoVar2, dntjVar2, b, i5 & 126, 0);
                hfmVar.Z();
            } else {
                b.v(1443580816);
                dnte.b(dntoVar2, null, b, i8, 2);
                hfmVar.Z();
            }
            b.n();
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dnpw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnsh dnshVar3 = dnsh.this;
                    dnto dntoVar3 = dntoVar2;
                    dntj dntjVar3 = dntjVar2;
                    dnrv.q(dnshVar3, dntoVar3, dntjVar3, hviVar2, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void r(dnsh dnshVar, dntj dntjVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi hviVar2;
        final dnsh dnshVar2 = dnshVar;
        final dntj dntjVar2 = dntjVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1575306430);
        if (i3 == 0) {
            i2 = (true != b.D(dnshVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dntjVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            int i4 = i2;
            final dnto dntoVar = dnshVar2.k;
            if (dntoVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dnou
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dnsh dnshVar3 = dnsh.this;
                            dntj dntjVar3 = dntjVar2;
                            int i5 = i;
                            dnrv.r(dnshVar3, dntjVar3, hviVar, (hfd) obj, hip.a(i5 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            dnsl dnslVar = (dnsl) dntoVar;
            boolean z = dnslVar.c != null;
            final fflb fflbVar = new fflb();
            b.v(-369406597);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = fgdm.a(new kaa(0L));
                hfmVar.ad(R);
            }
            hfmVar.Z();
            fflbVar.a = (fgcm) R;
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = hgs.a(ffhe.a, b);
                hfmVar.ad(R2);
            }
            final ffsk ffskVar = (ffsk) R2;
            b.v(-369402795);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                hic hicVar = new hic(null, hla.a);
                hfmVar.ad(hicVar);
                R3 = hicVar;
            }
            final hho hhoVar = (hho) R3;
            hfmVar.Z();
            b.v(-369398192);
            if (z) {
                hvi b2 = icf.b(ebs.e(hvi.e, 40.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0, 126975);
                b.v(-1360701772);
                Object R4 = hfmVar.R();
                if (R4 == hfc.a) {
                    R4 = new ffjn() { // from class: dnov
                        @Override // defpackage.ffjn
                        public final Object a(Object obj, Object obj2, Object obj3) {
                            ipo ei;
                            final ipq ipqVar = (ipq) obj;
                            ipl iplVar = (ipl) obj2;
                            ipqVar.getClass();
                            iplVar.getClass();
                            long j = ((jzk) obj3).a;
                            int eo = ipqVar.eo(48.0f);
                            final iqk e = iplVar.e(jzk.m(j, 0, 0, eo, eo, 3));
                            ei = ipqVar.ei(e.a, e.b, ffem.a, new ffji() { // from class: dnpn
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj4) {
                                    iqj iqjVar = (iqj) obj4;
                                    iqjVar.getClass();
                                    iqjVar.e(iqk.this, 0, ipqVar.eo(-4.0f), 0.0f);
                                    return ffcu.a;
                                }
                            });
                            return ei;
                        }
                    };
                    hfmVar.ad(R4);
                }
                hfmVar.Z();
                hviVar2 = hviVar.a(iop.a(b2, (ffjn) R4));
            } else {
                hviVar2 = hviVar;
            }
            hfmVar.Z();
            int i5 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b, hviVar2);
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
            hlc.b(b, b3, iss.c);
            b.v(-1360650083);
            b.v(-1360675603);
            hvi j = eba.j(hvi.e, 0.0f, true != z ? 12.0f : 0.0f, 0.0f, 0.0f, 13);
            if (z && dnslVar.b.b) {
                hvi a3 = ipx.a(ebs.e(hvi.e, 48.0f), new ffji() { // from class: dnow
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ioc iocVar = (ioc) obj;
                        iocVar.getClass();
                        ((fgcm) fflb.this.a).f(new kaa(kab.c(iod.b(iocVar))));
                        return ffcu.a;
                    }
                });
                b.v(-1704925325);
                Object R5 = hfmVar.R();
                if (R5 == hfc.a) {
                    R5 = new dwn();
                    hfmVar.ad(R5);
                }
                hfmVar.Z();
                j = j.a(dfb.c(a3, (dwn) R5, null, false, null, null, new ffix() { // from class: dnox
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dnto dntoVar2 = dnto.this;
                        dnsl dnslVar2 = (dnsl) dntoVar2;
                        ffji ffjiVar = dnslVar2.c;
                        fflb fflbVar2 = fflbVar;
                        if (ffjiVar != null) {
                            ffjiVar.invoke(((fgcm) fflbVar2.a).c());
                        }
                        if (dnslVar2.d != null) {
                            hho hhoVar2 = hhoVar;
                            ffud ffudVar = (ffud) hhoVar2.a();
                            if (ffudVar != null) {
                                ffudVar.t(null);
                            }
                            hhoVar2.b(dnslVar2.d != null ? ffqy.d(ffskVar, null, null, new dnru(dntoVar2, (fgcm) fflbVar2.a, null), 3) : null);
                        }
                        return ffcu.a;
                    }
                }, 28));
            }
            hfmVar.Z();
            if (z && !dnslVar.b.b) {
                hvi e = ebs.e(hvi.e, 48.0f);
                b.v(-1704904429);
                Object R6 = hfmVar.R();
                if (R6 == hfc.a) {
                    R6 = new dwn();
                    hfmVar.ad(R6);
                }
                dwn dwnVar = (dwn) R6;
                hfmVar.Z();
                b.v(-1704901569);
                boolean D = b.D(dntoVar);
                Object R7 = hfmVar.R();
                if (D || R7 == hfc.a) {
                    R7 = new ffix() { // from class: dnoy
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffji ffjiVar = ((dnsl) dnto.this).c;
                            if (ffjiVar != null) {
                                ffjiVar.invoke(null);
                            }
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R7);
                }
                hfmVar.Z();
                j = j.a(dfb.c(e, dwnVar, null, false, null, null, (ffix) R7, 28));
            }
            hfmVar.Z();
            dnshVar2 = dnshVar;
            dntjVar2 = dntjVar;
            q(dnshVar2, dntoVar, dntjVar2, eba.j(j, 0.0f, 0.0f, 0.0f, 4.0f, 7), b, (i4 & 14) | ((i4 << 3) & 896));
            b.n();
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dnoz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnsh dnshVar3 = dnsh.this;
                    dntj dntjVar3 = dntjVar2;
                    int i7 = i;
                    dnrv.r(dnshVar3, dntjVar3, hviVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final boolean v(dnsh dnshVar, hfd hfdVar) {
        hfdVar.v(655456768);
        boolean z = false;
        if (dnshVar.B.g && dlsp.b(hfdVar)) {
            z = true;
        }
        hfdVar.o();
        return z;
    }
}

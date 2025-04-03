package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dohp {
    public static final float a(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.hfd r9, final int r10) {
        /*
            r0 = -1869127044(0xffffffff9097627c, float:-5.971074E-29)
            hfd r6 = r9.b(r0)
            if (r10 != 0) goto L15
            boolean r9 = r6.I()
            r10 = 0
            if (r9 != 0) goto L11
            goto L15
        L11:
            r6.s()
            goto L29
        L15:
            dmzz r9 = defpackage.dmzz.q
            igq r1 = defpackage.dnaa.a(r9, r6)
            fxz r9 = defpackage.gft.a(r6)
            long r4 = r9.q
            r7 = 48
            r8 = 4
            r2 = 0
            r3 = 0
            defpackage.dwho.a(r1, r2, r3, r4, r6, r7, r8)
        L29:
            hio r9 = r6.L()
            if (r9 == 0) goto L36
            dohh r0 = new dohh
            r0.<init>()
            r9.d = r0
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dohp.b(hfd, int):void");
    }

    public static final void c(final boolean z, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(112078769);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hvi hviVar = hvi.e;
            if (z) {
                hviVar = ebs.e(hvi.e, 36.0f);
            }
            if (!z) {
                hviVar = hviVar.a(ebs.k(hvi.e, 44.0f));
            }
            if (z) {
                hviVar = hviVar.a(eba.i(hvi.e, 16.0f, 0.0f, 2));
            }
            dxj dxjVar = dxu.e;
            int i4 = huo.a;
            int i5 = ((i2 << 6) & 7168) | 432;
            ipn a = ebm.a(dxjVar, hum.n, b, 54);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
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
            ffjnVar.a(ebr.a, b, Integer.valueOf(((i5 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dohl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i7 = i;
                    dohp.c(z2, ffjnVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final hvi hviVar, final boolean z, final boolean z2, final String str, final ffix ffixVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        float f;
        hvi a;
        long j;
        int i3 = i & 6;
        hfd b = hfdVar.b(-992314483);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
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
            i2 |= true != b.D(str) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffixVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffjmVar) ? 65536 : 131072;
        }
        if ((i2 & 74899) == 74898 && b.I()) {
            b.s();
        } else {
            float f2 = 1.0f;
            if (true != z) {
                f = 1.0f;
                f2 = 0.0f;
            } else {
                f = 1.0f;
            }
            final hkx c = cxo.c(f2, null, null, b, 0, 30);
            b.v(-1687758434);
            boolean D = b.D(c);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dohi
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        idd iddVar = (idd) obj;
                        iddVar.getClass();
                        hkx hkxVar = hkx.this;
                        iddVar.x(dohp.a(hkxVar));
                        iddVar.y(dohp.a(hkxVar));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            a = dlsj.a(cry.b(icf.a(hviVar, (ffji) R)), str, true);
            hvi i4 = eba.i(a, f, 0.0f, 2);
            if (z2) {
                b.v(-780649979);
                j = gft.a(b).F;
                hfmVar.Z();
            } else {
                b.v(-780583918);
                boolean f3 = dooy.f(b);
                b.v(-628805689);
                if (f3) {
                    b.v(77941349);
                    j = gft.a(b).G;
                    hfmVar.Z();
                } else {
                    b.v(78002450);
                    j = gft.a(b).p;
                    hfmVar.Z();
                }
                hfmVar.Z();
                hfmVar.Z();
            }
            gpa.e(ffixVar, i4, false, eqm.a, j, 0L, 1.0f, null, null, ffjmVar, b, 868);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dohj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    boolean z3 = z;
                    boolean z4 = z2;
                    String str2 = str;
                    ffix ffixVar2 = ffixVar;
                    dohp.d(hviVar2, z3, z4, str2, ffixVar2, ffjmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(982574239);
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
            dwjt.b(str, null, gft.a(b).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).m, hfdVar2, i2 & 14, 0, 65530);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dohm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dohp.e(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final dohr dohrVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        dohrVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-161639777);
        if (i3 == 0) {
            i2 = (true != b.D(dohrVar) ? 2 : 4) | i;
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
            d(hviVar2, dohrVar.a, dohrVar.d, dohrVar.b, dohrVar.e, hpx.d(-1895237751, new doho(dohrVar), b), b, ((i2 >> 3) & 14) | 196608);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dohk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dohr dohrVar2 = dohr.this;
                    int i4 = i;
                    dohp.f(dohrVar2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

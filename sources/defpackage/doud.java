package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doud {
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hfd r25, int r26) {
        /*
            r0 = -2026850555(0xffffffff8730b705, float:-1.3294553E-34)
            r1 = r25
            hfd r0 = r1.b(r0)
            r1 = 0
            if (r26 != 0) goto L1b
            boolean r2 = r0.I()
            if (r2 != 0) goto L15
            r24 = r1
            goto L1d
        L15:
            r0.s()
            r20 = r0
            goto L5a
        L1b:
            r24 = r26
        L1d:
            hve r2 = defpackage.hvi.e
            r3 = 1098907648(0x41800000, float:16.0)
            hvi r2 = defpackage.eba.d(r2, r3)
            r3 = 2132083058(0x7f150172, float:1.9806248E38)
            java.lang.String r3 = defpackage.jii.a(r3, r0)
            gvs r4 = defpackage.gft.d(r0)
            jpo r4 = r4.h
            r5 = 1
            long r5 = j(r5, r0, r1)
            r22 = 0
            r23 = 65528(0xfff8, float:9.1824E-41)
            r1 = r3
            r19 = r4
            r3 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 48
            r20 = r0
            defpackage.dwjt.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r24
        L5a:
            hio r0 = r20.L()
            if (r0 == 0) goto L67
            dott r2 = new dott
            r2.<init>()
            r0.d = r2
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doud.a(hfd, int):void");
    }

    public static final void b(final doui douiVar, final doue doueVar, hvi hviVar, ibw ibwVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-1194533610);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(douiVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.F(doueVar) ? 16 : 32;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != b.D(hviVar) ? 128 : 256;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != b.D(ibwVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            if (i6 != 0) {
                ibwVar = null;
            }
            hik hikVar = fzc.a;
            b.v(980892231);
            long j = ibwVar == null ? gft.a(b).q : ibwVar.i;
            ((hfm) b).Z();
            hfz.a(hikVar.c(new ibw(j)), hpx.d(-845639210, new doub(douiVar, hviVar, doueVar), b), b, 56);
        }
        final hvi hviVar2 = hviVar;
        final ibw ibwVar2 = ibwVar;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dotu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doui douiVar2 = doui.this;
                    doue doueVar2 = doueVar;
                    hvi hviVar3 = hviVar2;
                    doud.b(douiVar2, doueVar2, hviVar3, ibwVar2, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final hvi hviVar, final dmzz dmzzVar, final String str, final ffix ffixVar, hfd hfdVar, final int i) {
        hvi hviVar2;
        int i2;
        hfd b = hfdVar.b(603151941);
        if ((i & 6) == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmzzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffixVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            ebe ebeVar = dwfd.a;
            dwfj.a(ffixVar, hviVar2, false, null, dwfd.b(k(b), j(false, b, 1), b, 12), null, null, null, hpx.d(-233620939, new douc(dmzzVar, str), b), b, ((i2 >> 9) & 14) | 805306368 | ((i2 << 3) & 112), 492);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dotv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dmzz dmzzVar2 = dmzzVar;
                    String str2 = str;
                    doud.c(hviVar3, dmzzVar2, str2, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.dmzz r28, final java.lang.String r29, defpackage.hvi r30, defpackage.hfd r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doud.d(dmzz, java.lang.String, hvi, hfd, int, int):void");
    }

    public static final void e(final hvi hviVar, final douf doufVar, final doue doueVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        hvi d;
        hfd b = hfdVar.b(648096281);
        if ((i & 6) == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(doufVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(doueVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hvi a = dee.a(hviVar, k(b), gft.c(b).d);
            dxq dxqVar = dxu.c;
            int i3 = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, b, 0);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i4 = ist.a;
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
            if (doufVar.a.length() > 0) {
                b.v(918900714);
                i(doufVar, b, (i2 >> 3) & 14);
            } else {
                b.v(918901860);
                a(b, 0);
            }
            hfmVar.Z();
            boolean z = doufVar.b;
            hvi hviVar2 = hvi.e;
            if (z) {
                d = ebs.d(hvi.e, 1.0f);
                hviVar2 = eba.i(d, 4.0f, 0.0f, 2);
            }
            ipn a4 = ebm.a(dxu.g, hum.m, b, 6);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, hviVar2);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
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
            ebe ebeVar = dwfd.a;
            fvo f = dwfd.f(j(false, b, 1), b, 13);
            b.v(-2126398037);
            boolean F = b.F(doueVar);
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffix() { // from class: dotx
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        doue.this.a(false);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwfj.e((ffix) R, null, false, null, f, null, dotm.b, b, 805306368, 494);
            b.v(-2126390067);
            boolean F2 = b.F(doueVar);
            Object R2 = hfmVar.R();
            if (F2 || R2 == hfc.a) {
                R2 = new ffix() { // from class: doty
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        doue.this.b();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            dwhl.b((ffix) R2, null, false, null, null, dotm.c, b, 1572864, 62);
            hfdVar2 = b;
            hfdVar2.n();
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dotz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    douf doufVar2 = doufVar;
                    int i5 = i;
                    doud.e(hviVar3, doufVar2, doueVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(hvi hviVar, final douf doufVar, final doue doueVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1407026451);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(doufVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(doueVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            int i4 = i2 & 14;
            if (doufVar.b) {
                hviVar2 = hviVar;
                b.v(721098026);
                e(hviVar2, doufVar, doueVar, b, i2 & 1022);
                ((hfm) b).Z();
            } else {
                b.v(720881832);
                dmzz dmzzVar = dmzz.cx;
                String a = jii.a(R.string.view_transcript_button_text, b);
                b.v(1547280320);
                boolean F = b.F(doueVar);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (F || R == hfc.a) {
                    R = new ffix() { // from class: dotr
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            doue.this.a(true);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                hviVar2 = hviVar;
                c(hviVar2, dmzzVar, a, (ffix) R, b, i4 | 48);
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dots
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    douf doufVar2 = doufVar;
                    int i5 = i;
                    doud.f(hviVar3, doufVar2, doueVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(831246239);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            gpa.c(eba.i(hviVar, 0.0f, 4.0f, 1), eqm.b(24.0f), k(b), 0L, 0.0f, 0.0f, null, dotm.a, b, 120);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doto
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    doud.g(hvi.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(hvi hviVar, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1265100009);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            ffixVar2 = ffixVar;
        } else {
            hviVar2 = hviVar;
            ffixVar2 = ffixVar;
            c(hviVar2, dmzz.dz, jii.a(R.string.trigger_transcription_button_text, b), ffixVar2, b, (i2 & 14) | 48 | ((i2 << 6) & 7168));
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dotp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    int i4 = i;
                    doud.h(hviVar3, ffixVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final douf doufVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(2068487702);
        if ((i & 6) == 0) {
            i2 = (true != b.D(doufVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dlur.e(doufVar, eba.d(hvi.e, 16.0f), j(false, b, 1), gft.d(b).h, null, 0L, null, false, null, b, (i2 & 14) | 48, 496);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dotw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    doud.i(douf.this, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final long j(boolean z, hfd hfdVar, int i) {
        long f;
        hfdVar.v(136540851);
        f = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), 1 != ((z ? 1 : 0) & (i ^ 1)) ? 0.8f : 0.38f, ibw.f(((ibw) hfdVar.e(fzc.a)).i));
        hfdVar.o();
        return f;
    }

    private static final long k(hfd hfdVar) {
        long f;
        hfdVar.v(745422221);
        float f2 = 0.7f;
        if (dooy.g(hfdVar)) {
            hfdVar.v(-2143893780);
            f = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.7f, ibw.f(gft.a(hfdVar).I));
            ((hfm) hfdVar).Z();
        } else {
            hfdVar.v(-2143809770);
            long j = ibw.d;
            hfdVar.v(2009056691);
            boolean a = ffcp.a(((ibw) hfdVar.e(fzc.a)).i, gft.a(hfdVar).v);
            hfm hfmVar = (hfm) hfdVar;
            hfmVar.Z();
            if (!a) {
                hfdVar.v(2009059799);
                boolean f3 = dooy.f(hfdVar);
                hfmVar.Z();
                if (f3) {
                    f2 = 0.1f;
                }
            }
            f = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), f2, ibw.f(j));
            hfmVar.Z();
        }
        ((hfm) hfdVar).Z();
        return f;
    }
}

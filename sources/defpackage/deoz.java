package defpackage;

import android.accounts.Account;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deoz {
    public static final void a(final dend dendVar, final String str, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1480867016);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(dendVar) : b.F(dendVar)) ? 2 : 4) | i;
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
        } else {
            d = ebs.d(hvi.e, 1.0f);
            a = dee.a(hxo.a(d, eqm.c(4.0f, 4.0f, 74.0f, 74.0f)), gft.a(b).J, idb.a);
            hvi d2 = eba.d(a, 16.0f);
            dxj dxjVar = dxu.e;
            int i4 = huo.a;
            ipn a2 = ebm.a(dxjVar, hum.n, b, 54);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d2);
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
            f(dendVar, str, z, b, (i2 & 896) | (i2 & 14) | 8 | (i2 & 112));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: deoq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dend dendVar2 = dend.this;
                    String str2 = str;
                    int i6 = i;
                    deoz.a(dendVar2, str2, z, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final String str, String str2, hfd hfdVar, final int i) {
        int i2;
        jpo y;
        hfd hfdVar2;
        final String str3;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1676946528);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str2) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && b.I()) {
            b.s();
            str3 = str2;
            hfdVar2 = b;
        } else {
            if (str2 != null) {
                b.v(815930699);
                y = gft.d(b).b;
                ((hfm) b).Z();
            } else {
                b.v(815992947);
                y = jpo.y(gft.d(b).c, 0L, 0L, null, null, null, null, 0L, null, 0, 0, kal.c(40), null, null, 0, 16646143);
                ((hfm) b).Z();
            }
            jpo jpoVar = y;
            dwjt.b(str, eba.j(hvi.e, 0.0f, str2 == null ? 16.0f : 12.0f, 0.0f, 0.0f, 13), gft.a(b).q, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, jpoVar, b, i4 & 14, 0, 65016);
            if (str2 != null) {
                ebv.a(ebs.e(hvi.e, 2.0f), b);
                hfdVar2 = b;
                str3 = str2;
                dwjt.b(str3, null, gft.a(b).q, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(b).g, hfdVar2, (i4 >> 3) & 14, 0, 65018);
            } else {
                hfdVar2 = b;
                str3 = str2;
            }
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: deov
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str4 = str;
                    int i5 = i;
                    deoz.b(str4, str3, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final deng dengVar, final eixz eixzVar, final Account account, final god godVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1133761339);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(dengVar) : b.F(dengVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(eixzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(account) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(godVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            b.v(1672433007);
            ael aelVar = new ael();
            b.v(-882802605);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: denb
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((ade) obj).getClass();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            ada a2 = aco.a(aelVar, (ffji) R, b);
            b.v(-882802133);
            boolean D = b.D(a2);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new dena(a2);
                hfmVar.ad(R2);
            }
            dena denaVar = (dena) R2;
            hfmVar.Z();
            hfmVar.Z();
            d = ebs.d(hvi.e, 1.0f);
            a = dee.a(hxo.a(d, eqm.c(74.0f, 74.0f, 4.0f, 4.0f)), gft.a(b).J, idb.a);
            hvi j = eba.j(a, 0.0f, 32.0f, 0.0f, 16.0f, 5);
            int i4 = huo.a;
            ipn a3 = dyo.a(dxu.e, hum.k, b, 54);
            int a4 = hey.a(b);
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
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            if (!dengVar.g.a || account == null) {
                b.v(-2097524959);
                int i6 = ((i2 >> 3) & 14) | 64;
                e(eixzVar, denaVar, dengVar.e, dengVar.h, b, i6);
                ebv.a(ebs.e(hvi.e, 10.0f), b);
                d(eixzVar, denaVar, dengVar.f, b, i6);
                ebv.a(ebs.e(hvi.e, 10.0f), b);
                hfmVar.Z();
            } else {
                b.v(-2097752964);
                new egvy((Context) b.e(AndroidCompositionLocals_androidKt.b), account, godVar, dengVar.h == cvjl.WELCOME_FLOW_SETTINGS ? fapp.ANDROID_MESSAGES : fapp.ANDROID_MESSAGES_ONBOARDING).d(b);
                hfmVar.Z();
            }
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: deow
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    deng dengVar2 = deng.this;
                    eixz eixzVar2 = eixzVar;
                    Account account2 = account;
                    deoz.c(dengVar2, eixzVar2, account2, godVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final eixz eixzVar, final dena denaVar, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        hfm hfmVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1291242498);
        if (i3 == 0) {
            i2 = (true != b.F(eixzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(denaVar) : b.F(denaVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            int i4 = huo.a;
            hus husVar = hum.n;
            dxj dxjVar = dxu.e;
            hvi i5 = eba.i(hvi.e, 8.0f, 0.0f, 2);
            ipn a = ebm.a(dxjVar, husVar, b, 54);
            int a2 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, i5);
            int i6 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ebr ebrVar = ebr.a;
            String str = eixzVar.d;
            str.getClass();
            dwjt.b(str, ebrVar.a(hvi.e, 1.0f, false), gft.a(b).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(b).e, b, 0, 3120, 55288);
            b = b;
            b.v(-2126011021);
            boolean F = ((i2 & 896) == 256) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && b.F(denaVar))) | b.F(eixzVar);
            Object R = hfmVar2.R();
            if (F || R == hfc.a) {
                R = new ffix() { // from class: deom
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffix.this.invoke();
                        denaVar.a(demz.c, eixzVar);
                        return ffcu.a;
                    }
                };
                hfmVar = hfmVar2;
                hfmVar.ad(R);
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            dwhl.b((ffix) R, null, false, null, null, demx.b, b, 1572864, 62);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: deon
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    eixz eixzVar2 = eixz.this;
                    dena denaVar2 = denaVar;
                    int i7 = i;
                    deoz.d(eixzVar2, denaVar2, ffixVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final eixz eixzVar, final dena denaVar, final ffix ffixVar, final cvjl cvjlVar, hfd hfdVar, final int i) {
        int i2;
        hfm hfmVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(436321343);
        if (i3 == 0) {
            i2 = (true != b.F(eixzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(denaVar) : b.F(denaVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(cvjlVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, hveVar);
            int i5 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dyi dyiVar = dyi.a;
            int i6 = ejfs.b;
            ejft ejftVar = new ejft(eixzVar);
            hvi k = ebs.k(hxo.a(hvi.e, eqm.a), 170.0f);
            jku jkuVar = qrv.b;
            boolean z = false;
            qrv.a(ejftVar, null, k, null, null, 0.0f, null, new qsb(), null, b, 48, 760);
            b = b;
            hvi k2 = ebs.k(dyiVar.a(hvi.e, new hut(1.0f, 0.85f)), 56.0f);
            ebf ebfVar = new ebf(0.0f, 0.0f, 0.0f, 0.0f);
            eql eqlVar = eqm.a;
            ebe ebeVar = dwfd.a;
            fvt c = dwfd.c(3.0f, b, 30);
            b.v(1277287963);
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 7168) == 2048;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && b.F(denaVar))) {
                z = true;
            }
            boolean F = z2 | z3 | z | b.F(eixzVar);
            Object R = hfmVar2.R();
            if (F || R == hfc.a) {
                R = new ffix() { // from class: deor
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffix.this.invoke();
                        cvjl cvjlVar2 = cvjlVar;
                        dena denaVar2 = denaVar;
                        eixz eixzVar2 = eixzVar;
                        if (cvjlVar2 == cvjl.WELCOME_FLOW_SETTINGS) {
                            denaVar2.a(demz.b, eixzVar2);
                        } else {
                            denaVar2.a(demz.a, eixzVar2);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar = hfmVar2;
                hfmVar.ad(R);
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            dwfj.b((ffix) R, k2, false, eqlVar, null, c, ebfVar, demx.a, b, 817889280, 340);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: deos
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    eixz eixzVar2 = eixz.this;
                    dena denaVar2 = denaVar;
                    ffix ffixVar3 = ffixVar;
                    deoz.e(eixzVar2, denaVar2, ffixVar3, cvjlVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x024a, code lost:
    
        if (r11.F(r0) != false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.dend r34, final java.lang.String r35, final boolean r36, defpackage.hfd r37, final int r38) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deoz.f(dend, java.lang.String, boolean, hfd, int):void");
    }

    public static final void g(final dys dysVar, deng dengVar, final dekg dekgVar, final god godVar, hfd hfdVar, final int i) {
        int i2;
        deng dengVar2;
        final god godVar2;
        dekgVar.getClass();
        godVar.getClass();
        int i3 = i & 48;
        hfd b = hfdVar.b(2033119715);
        if (i3 == 0) {
            i2 = (true != ((i & 64) == 0 ? b.D(dengVar) : b.F(dengVar)) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(dekgVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(godVar) ? 1024 : 2048;
        }
        if ((i2 & 1169) == 1168 && b.I()) {
            b.s();
            dengVar2 = dengVar;
            godVar2 = godVar;
        } else {
            if (dengVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: deot
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dys dysVar2 = dys.this;
                            dekg dekgVar2 = dekgVar;
                            deoz.g(dysVar2, null, dekgVar2, godVar, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            b(dengVar.a, dengVar.b, b, 0);
            ebv.a(ebs.e(hvi.e, 48.0f), b);
            dengVar2 = dengVar;
            c(dengVar2, dekgVar.a.b(), dekgVar.b, godVar, b, ((i2 >> 3) & 14) | 8 | (i2 & 7168));
            godVar2 = godVar;
            ebv.a(ebs.e(hvi.e, 2.0f), b);
            a(dengVar2.d, dengVar2.c, dengVar2.g.b, b, 8);
        }
        hio L2 = b.L();
        if (L2 != null) {
            final deng dengVar3 = dengVar2;
            L2.d = new ffjm() { // from class: deou
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dys dysVar2 = dys.this;
                    deng dengVar4 = dengVar3;
                    dekg dekgVar2 = dekgVar;
                    deoz.g(dysVar2, dengVar4, dekgVar2, godVar2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

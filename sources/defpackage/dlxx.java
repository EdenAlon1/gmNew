package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlxx {
    public static final void a(final hvi hviVar, final dnwq dnwqVar, final String str, final dnwi dnwiVar, final boolean z, final boolean z2, hfd hfdVar, final int i) {
        int i2;
        dnwq dnwqVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-602627143);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            dnwqVar2 = dnwqVar;
            i2 |= true != b.D(dnwqVar2) ? 16 : 32;
        } else {
            dnwqVar2 = dnwqVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(dnwiVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.E(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.E(z2) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
        } else {
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
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
            dyi dyiVar = dyi.a;
            hvi b3 = eao.b(eba.e(hvi.e, 16.0f, 18.0f), 2);
            ipn a3 = ebm.a(dxu.a, hum.n, b, 48);
            int a4 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b, b3);
            ffix ffixVar2 = iss.a;
            b.x();
            int i6 = i2;
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
            hlc.b(b, b4, iss.c);
            dnxw.e(dnwqVar2, null, ebs.k(hvi.e, 36.0f), null, null, b, ((i6 >> 3) & 14) | 432, 24);
            ebv.a(ebs.o(hvi.e, 12.0f), b);
            hve hveVar = hvi.e;
            ipn a5 = dyo.a(dxu.c, hum.j, b, 0);
            int a6 = hey.a(b);
            hqb ai3 = hfmVar.ai();
            hvi b5 = huz.b(b, hveVar);
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf3 = Integer.valueOf(a6);
                hfmVar.ad(valueOf3);
                b.h(valueOf3, ffjmVar3);
            }
            hlc.b(b, b5, iss.c);
            dwjt.b(str, null, gft.a(b).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(b).i, b, (i6 >> 6) & 14, 3120, 55290);
            b = b;
            b.v(959451049);
            if (((jzn) b.e(jdr.e)).ed() <= 1.0f) {
                d(b, 0);
            }
            hfmVar.Z();
            b.n();
            b.v(214092160);
            if (z) {
                ebv.a(ebs.o(ebs.e(hvi.e, 1.0f), 20.0f), b);
            }
            hfmVar.Z();
            b.n();
            b.v(2140897791);
            if (dnwiVar != null) {
                hvi k = ebs.k(dyiVar.a(eba.j(hvi.e, 0.0f, 0.0f, 8.0f, 8.0f, 3), hum.i), 16.0f);
                if (z2 && dlsp.b(b)) {
                    k = k.a(dlsj.c(hvi.e));
                }
                dnwg.i(dnwiVar, k, b, 0);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlxu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    dnwq dnwqVar3 = dnwqVar;
                    String str2 = str;
                    dnwi dnwiVar2 = dnwiVar;
                    boolean z3 = z;
                    dlxx.a(hviVar2, dnwqVar3, str2, dnwiVar2, z3, z2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1367865687);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dnch.d(new dncj(dmzz.aV, jii.a(R.string.contact_view_fetch_failed_text, b), null, false, false, 124), hviVar, b, (i2 << 3) & 112);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlxq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlxx.b(hvi.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1215268299);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            eqd eqdVar = gft.c(b).f;
            hvi e = eba.e(hviVar, 16.0f, 18.0f);
            int i4 = huo.a;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, e);
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
            f(hxo.a(ebs.k(hvi.e, 36.0f), eqm.a), b, 0);
            ebv.a(ebs.o(hvi.e, 12.0f), b);
            hve hveVar = hvi.e;
            ipn a3 = dyo.a(dxu.c, hum.j, b, 0);
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
            f(hxo.a(ebs.e(ebs.o(hvi.e, 82.0f), 14.0f), eqdVar), b, 0);
            ebv.a(ebs.e(hvi.e, 4.0f), b);
            f(hxo.a(ebs.e(ebs.o(hvi.e, 44.0f), 14.0f), eqdVar), b, 0);
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlxw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dlxx.c(hvi.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.hfd r25, int r26) {
        /*
            r0 = -1815542279(0xffffffff93c905f9, float:-5.0745423E-27)
            r1 = r25
            hfd r0 = r1.b(r0)
            if (r26 != 0) goto L1b
            boolean r1 = r0.I()
            r2 = 0
            if (r1 != 0) goto L15
            r24 = r2
            goto L1d
        L15:
            r0.s()
            r20 = r0
            goto L52
        L1b:
            r24 = r26
        L1d:
            r1 = 2132083558(0x7f150366, float:1.9807262E38)
            java.lang.String r1 = defpackage.jii.a(r1, r0)
            gvs r2 = defpackage.gft.d(r0)
            jpo r2 = r2.l
            fxz r3 = defpackage.gft.a(r0)
            long r3 = r3.s
            r22 = 3120(0xc30, float:4.372E-42)
            r23 = 55290(0xd7fa, float:7.7478E-41)
            r19 = r2
            r2 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 2
            r15 = 0
            r16 = 1
            r17 = 0
            r18 = 0
            r21 = 0
            r20 = r0
            defpackage.dwjt.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = r24
        L52:
            hio r0 = r20.L()
            if (r0 == 0) goto L5f
            dlxt r1 = new dlxt
            r1.<init>()
            r0.d = r1
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlxx.d(hfd, int):void");
    }

    public static final void e(final hvi hviVar, final String str, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-328943889);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dnch.d(new dncj(dmzz.aK, jii.a(R.string.contact_downloadable_title, b), jii.b(R.string.contact_downloadable_subtitle, new Object[]{str}, b), true, false, 104), hviVar, b, (i2 << 3) & 112);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlxv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i4 = i;
                    dlxx.e(hviVar2, str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-161938889);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dyc.b(doaq.d(hviVar, null, 7), b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlxr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlxx.f(hvi.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final dlvw dlvwVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(1644049492);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dlvwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            boolean z = dlvwVar instanceof dlvv;
            hve hveVar = hvi.e;
            if (z) {
                b.v(1559178979);
                c(hveVar, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            } else if (dlvwVar instanceof dlvs) {
                b.v(1559181633);
                b(hveVar, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            } else if (dlvwVar instanceof dlvu) {
                b.v(1559184671);
                dlvu dlvuVar = (dlvu) dlvwVar;
                a(hveVar, dlvuVar.b, dlvuVar.a, dlvuVar.c, dlvuVar.d, dlvuVar.e, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            } else {
                if (!(dlvwVar instanceof dlvr)) {
                    b.v(1559177724);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(1559196568);
                e(hveVar, ((dlvr) dlvwVar).a, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            }
            hviVar = hveVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlxs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlvw dlvwVar2 = dlvw.this;
                    int i4 = i;
                    dlxx.g(dlvwVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

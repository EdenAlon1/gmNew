package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emfy {
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hfd r12, int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emfy.a(hfd, int):void");
    }

    public static final void b(final emge emgeVar, hfd hfdVar, final int i) {
        int i2;
        emgeVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(649063004);
        if (i3 == 0) {
            i2 = (true != b.F(emgeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            c(hpx.d(-924132166, new emfu(emgeVar, hkf.a(emgeVar.g, b), hkf.a(emgeVar.h, b)), b), b, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: emfk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    emfy.b(emge.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(1505318404);
        if (i3 == 0) {
            i2 = (true != b.F(ffjnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            a = dee.a(hvi.e, ibw.a, idb.a);
            int i4 = huo.a;
            huo huoVar = hum.e;
            c = ebs.c(a, 1.0f);
            ipn a2 = dyc.a(huoVar, false);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c);
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
            ffjnVar.a(dyi.a, b, Integer.valueOf(((i2 << 3) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: emfs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    emfy.c(ffjn.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final ffix ffixVar, final emgv emgvVar, hfd hfdVar, final int i) {
        int i2;
        String a;
        hfd hfdVar2;
        ffixVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1781942150);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(emgvVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            int ordinal = emgvVar.ordinal();
            if (ordinal == 0) {
                b.v(2116842701);
                a = jii.a(R.string.dialog_body_segmentation_empty_result, b);
                ((hfm) b).Z();
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                    b.v(2116831361);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(2116839174);
                a = jii.a(R.string.dialog_body_segmentation_error, b);
                ((hfm) b).Z();
            }
            keh kehVar = new keh(false, 5);
            b.v(2116846065);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffix() { // from class: emfm
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hfdVar2 = b;
            ftd.a((ffix) R, hpx.d(1638961346, new emfw(ffixVar), b), null, null, null, null, hpx.d(-1306105593, new emfx(a), b), null, 0L, 0L, 0L, 0L, 0.0f, kehVar, hfdVar2, 1572918, 3072, 8124);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: emfn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar2 = ffix.this;
                    int i4 = i;
                    emfy.d(ffixVar2, emgvVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dyh dyhVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(692654656);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            int i4 = huo.a;
            hvi j = eba.j(dyhVar.a(d, hum.h), 0.0f, 0.0f, 0.0f, 32.0f, 7);
            ipn a = ebm.a(dxu.a, hum.m, b, 0);
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
            ffjnVar.a(ebr.a, b, Integer.valueOf((i2 & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: emfo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    int i6 = i;
                    emfy.e(dyhVar2, ffjnVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final dyh dyhVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1569104243);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            int i4 = huo.a;
            d = ebs.d(dyhVar.a(hveVar, hum.b), 1.0f);
            ipn a = ebm.a(dxu.a, hum.m, b, 0);
            int a2 = hey.a(b);
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
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            hlc.b(b, b2, iss.c);
            ffjmVar.a(b, Integer.valueOf((i2 >> 3) & 14));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: emfl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    int i6 = i;
                    emfy.f(dyhVar2, ffjmVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1923824034);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            c = ebs.c(hvi.e, 1.0f);
            long j = emgp.a;
            a = dee.a(c, emgp.b, idb.a);
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.e, false);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
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
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            hlc.b(b, b2, iss.c);
            ffjmVar.a(b, Integer.valueOf(i2 & 14));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: emfp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    emfy.g(ffjm.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvye {
    public static final int a(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final void b(final cvxm cvxmVar, boolean z, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final boolean z2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-566364287);
        if (i3 == 0) {
            i2 = (true != b.D(cvxmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            z2 = z;
        } else {
            dooq dooqVar = dooy.c(b).q;
            cue k = ctt.k(cxu.c(300, 0, dooy.c(b).r.e, 2), null, 14);
            dooq dooqVar2 = dooy.c(b).q;
            z2 = z;
            cru.b(z2, null, k, ctt.q(cxu.c(300, 0, dooy.c(b).r.e, 2), null, 14), null, hpx.d(-1378860967, new cvxv(cvxmVar, hviVar), b), b, ((i2 >> 3) & 14) | 196608, 18);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvxq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvxm cvxmVar2 = cvxm.this;
                    boolean z3 = z2;
                    int i4 = i;
                    cvye.b(cvxmVar2, z3, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final cvxk cvxkVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1510951244);
        if (i3 == 0) {
            i2 = (true != b.D(cvxkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar, 1.0f);
            long k = k(b);
            b.v(25399912);
            float f = true != dooy.g(b) ? 0.0f : 1.0f;
            ((hfm) b).Z();
            gpa.c(d, null, k, 0L, 0.0f, f, null, hpx.d(-1487903985, new cvxz(cvxkVar), b), b, 90);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvxr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvxk cvxkVar2 = cvxk.this;
                    int i4 = i;
                    cvye.c(cvxkVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.hfd r9, int r10) {
        /*
            r0 = 1916131773(0x7235d9bd, float:3.601921E30)
            hfd r6 = r9.b(r0)
            r9 = 0
            if (r10 != 0) goto L16
            boolean r10 = r6.I()
            if (r10 != 0) goto L12
            r10 = r9
            goto L16
        L12:
            r6.s()
            goto L31
        L16:
            hve r0 = defpackage.hvi.e
            r1 = 1103101952(0x41c00000, float:24.0)
            hvi r3 = defpackage.ebs.k(r0, r1)
            r0 = 2131231918(0x7f0804ae, float:1.807993E38)
            igq r1 = defpackage.jie.a(r0, r6, r9)
            long r4 = h(r6)
            r7 = 384(0x180, float:5.38E-43)
            r8 = 0
            r2 = 0
            defpackage.dwho.a(r1, r2, r3, r4, r6, r7, r8)
            r9 = r10
        L31:
            hio r10 = r6.L()
            if (r10 == 0) goto L3e
            cvxo r0 = new cvxo
            r0.<init>()
            r10.d = r0
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvye.d(hfd, int):void");
    }

    public static final void e(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1234038522);
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
            dwjt.b(str, null, h(hfdVar2), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar2).k, hfdVar2, i2 & 14, 0, 65530);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvxt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvye.e(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final cvxm cvxmVar, boolean z, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final boolean z2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1013695481);
        if (i3 == 0) {
            i2 = (true != b.D(cvxmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            z2 = z;
        } else {
            dooq dooqVar = dooy.c(b).q;
            z2 = z;
            cru.b(z2, null, ctt.n(cxu.c(300, 0, dooy.c(b).r.e, 2), 0.0f, 0L, 6), ctt.o(cxu.c(0, 0, null, 6), 0.0f, 0L, 6), null, hpx.d(-1826192161, new cvxw(cvxmVar, hviVar), b), b, ((i2 >> 3) & 14) | 199680, 18);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvxu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvxm cvxmVar2 = cvxm.this;
                    boolean z3 = z2;
                    int i4 = i;
                    cvye.f(cvxmVar2, z3, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final cvxl cvxlVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1033490804);
        if (i3 == 0) {
            i2 = (true != b.D(cvxlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hvi j = eba.j(hviVar, 16.0f, 18.0f, 16.0f, 0.0f, 8);
            ebe ebeVar = dwfd.a;
            fvo d = dwfd.d(b);
            hfdVar2 = b;
            dwfj.c(cvxlVar.b, j, false, null, d.a(k(b), d.b, d.c, d.d), null, null, hpx.d(-1809924538, new cvya(cvxlVar), b), hfdVar2, 805306368, 492);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvxp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvxl cvxlVar2 = cvxl.this;
                    int i4 = i;
                    cvye.g(cvxlVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final long h(hfd hfdVar) {
        long a;
        hfdVar.v(866521451);
        if (dooy.f(hfdVar)) {
            hfdVar.v(-1443572909);
            a = jhz.a(R.color.gm3_ref_palette_error90, hfdVar);
            hfdVar.o();
        } else {
            hfdVar.v(-1443571181);
            a = jhz.a(R.color.gm3_ref_palette_error30, hfdVar);
            hfdVar.o();
        }
        hfdVar.o();
        return a;
    }

    public static final void i(final cvxm cvxmVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-261843908);
        if ((i & 6) == 0) {
            i2 = (true != b.D(cvxmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hviVar = hvi.e;
            b.v(-1427495290);
            b.v(-180215787);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(cvxmVar, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            if (cvxmVar != null && !ffkj.e(cvxmVar, j(hhoVar))) {
                hhoVar.b(cvxmVar);
            }
            ffcf ffcfVar = new ffcf(j(hhoVar), Boolean.valueOf(cvxmVar != null));
            hfmVar.Z();
            cvxm cvxmVar2 = (cvxm) ffcfVar.a;
            boolean booleanValue = ((Boolean) ffcfVar.b).booleanValue();
            int i4 = (i3 << 3) & 896;
            f(cvxmVar2, booleanValue && (cvxmVar2 instanceof cvxl), hviVar, b, i4);
            b(cvxmVar2, booleanValue && (cvxmVar2 instanceof cvxk), hviVar, b, i4);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvxs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvxm cvxmVar3 = cvxm.this;
                    int i5 = i;
                    cvye.i(cvxmVar3, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final cvxm j(hho hhoVar) {
        return (cvxm) hhoVar.a();
    }

    private static final long k(hfd hfdVar) {
        long a;
        hfdVar.v(-850744630);
        if (dooy.f(hfdVar)) {
            hfdVar.v(-1125909230);
            a = jhz.a(R.color.gm3_ref_palette_error30, hfdVar);
            ((hfm) hfdVar).Z();
        } else {
            hfdVar.v(-1125907502);
            a = jhz.a(R.color.gm3_ref_palette_error90, hfdVar);
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return a;
    }
}

package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnuj {
    public static final void a(final hvi hviVar, final dnus dnusVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        hfm hfmVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1054949906);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnusVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            f = iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), 0.3f, ibw.f(ibw.a));
            long j = ibw.d;
            int i4 = huo.a;
            ipn a = dyo.a(dxu.c, hum.k, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, hviVar);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
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
            dwhl.b(dnusVar.b, null, false, dwhi.b(f, j, 0L, b, 12), null, dntv.a, b, 1572864, 54);
            String str = dnusVar.a;
            b.v(211963997);
            if (str != null) {
                hfmVar = hfmVar2;
                gpa.c(null, eqm.a, f, 0L, 0.0f, 0.0f, null, hpx.d(-988235861, new dnuh(str, j), b), b, 121);
                b = b;
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnub
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i6 = i;
                    dnuj.a(hviVar2, dnusVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final long j, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(469795730);
        if (i3 == 0) {
            i2 = (true != b.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            a = dlsj.a(ebs.k(hvi.e, 26.0f), jii.a(R.string.progress_bar_overlay_infinite_spinner_content_description, b), true);
            dwij.a(a, j, 2.0f, ibw.g, 0, 0.0f, b, ((i2 << 3) & 112) | 3456, 48);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dntx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnuj.b(j, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final float f, final long j, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-349775352);
        if (i3 == 0) {
            i2 = (true != b.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            a = dlsj.a(ebs.k(hvi.e, 26.0f), jii.b(R.string.progress_bar_overlay_finite_spinner_content_description, new Object[]{Integer.valueOf((int) (100.0f * f))}, b), true);
            long j2 = ibw.g;
            b.v(-187745597);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffix() { // from class: dnuc
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Float.valueOf(f);
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwij.b((ffix) R, a, j, 2.0f, j2, 0, 0.0f, b, ((i2 << 3) & 896) | 27648, 96);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnud
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    int i5 = i;
                    dnuj.c(f2, j, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        int i3 = i & 6;
        hfd b = hfdVar.b(884893939);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hvi k = ebs.k(hviVar, 24.0f);
            eql eqlVar = eqm.a;
            f = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.3f, ibw.f(ibw.a));
            gpa.c(k, eqlVar, f, 0L, 0.0f, 0.0f, null, dntv.b, b, 120);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnug
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnuj.d(hvi.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dnux dnuxVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1144319454);
        if (i3 == 0) {
            i2 = (true != b.D(dnuxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (dnuxVar instanceof dnuu) {
            b.v(-1997678172);
            i((dnuu) dnuxVar, hviVar, b, i2 & 112);
            ((hfm) b).Z();
        } else if (dnuxVar instanceof dnuw) {
            b.v(-1997675324);
            j((dnuw) dnuxVar, hviVar, b, i2 & 112);
            ((hfm) b).Z();
        } else if (dnuxVar instanceof dnur) {
            b.v(-1997672575);
            f((dnur) dnuxVar, hviVar, b, i2 & 112);
            ((hfm) b).Z();
        } else if (dnuxVar instanceof dnus) {
            b.v(-1997669837);
            a(hviVar, (dnus) dnuxVar, b, (i2 >> 3) & 14);
            ((hfm) b).Z();
        } else {
            if (!(dnuxVar instanceof dnuv)) {
                b.v(-1997679620);
                ((hfm) b).Z();
                throw new ffcd();
            }
            b.v(-1997667596);
            d(hviVar, b, (i2 >> 3) & 14);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnuf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnux dnuxVar2 = dnux.this;
                    int i4 = i;
                    dnuj.e(dnuxVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final dnur dnurVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1436699874);
        if (i3 == 0) {
            i2 = (true != b.D(dnurVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            int i4 = i2 & 126;
            if (dnurVar.c.a) {
                b.v(-1421559000);
                h(dnurVar, hviVar, b, i4);
                ((hfm) b).Z();
            } else {
                b.v(-1421477656);
                g(dnurVar, hviVar, b, i4);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnue
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnur dnurVar2 = dnur.this;
                    int i5 = i;
                    dnuj.f(dnurVar2, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final dnur dnurVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1745940039);
        if (i3 == 0) {
            i2 = (true != b.D(dnurVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            igq a = dnaa.a(dnurVar.b, b);
            hvi k = ebs.k(hviVar, 48.0f);
            f = iby.f(ibw.d(r4), ibw.c(r4), ibw.b(r4), 0.52f, ibw.f(ibw.a));
            hvi a2 = dee.a(k, f, eqm.a);
            c = ebs.c(hvi.e, 1.0f);
            dnmv.a(a2, c, 0.0f, a, jii.a(R.string.progress_bar_overlay_retry_button_content_description, b), ibw.d, dnurVar.a, b, 48, 4);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dntw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnur dnurVar2 = dnur.this;
                    int i4 = i;
                    dnuj.g(dnurVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final dnur dnurVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(184290810);
        if (i3 == 0) {
            i2 = (true != b.D(dnurVar) ? 2 : 4) | i;
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
            dwhl.b(dnurVar.a, hviVar2, false, dwhi.b(gft.a(b).y, gft.a(b).z, 0L, b, 12), null, hpx.d(460632220, new dnui(dnurVar), b), b, (i2 & 112) | 1572864, 52);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dntz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnur dnurVar2 = dnur.this;
                    int i4 = i;
                    dnuj.h(dnurVar2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final dnuu dnuuVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(527410632);
        if (i3 == 0) {
            i2 = (true != b.D(dnuuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            j(new dnuw(null, dnuuVar.a), hviVar, b, i2 & 112);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnua
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnuu dnuuVar2 = dnuu.this;
                    int i4 = i;
                    dnuj.i(dnuuVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final dnuw dnuwVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1606141880);
        if (i3 == 0) {
            i2 = (true != b.D(dnuwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            f = iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), 0.3f, ibw.f(ibw.a));
            hvi d = eba.d(dee.a(hviVar, f, eqm.a), 3.0f);
            int i4 = huo.a;
            ipn a = dyc.a(hum.e, false);
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
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dnmv.a(ebs.k(hvi.e, 20.0f), null, 0.0f, dnaa.a(dmzz.ai, b), jii.a(R.string.progress_bar_overlay_cancel_button_content_description, b), ibw.d, dnuwVar.b, b, 6, 6);
            Float f2 = dnuwVar.a;
            b.v(2091232531);
            if (f2 != null) {
                float floatValue = f2.floatValue();
                if (floatValue == Float.POSITIVE_INFINITY) {
                    b.v(1619214223);
                    b(ibw.d, b, 0);
                    hfmVar.Z();
                } else {
                    b.v(1619303038);
                    c(floatValue, ibw.d, b, 0);
                    hfmVar.Z();
                }
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnty
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnuw dnuwVar2 = dnuw.this;
                    int i6 = i;
                    dnuj.j(dnuwVar2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnla {
    public static final void a(final dmzz dmzzVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1505284584);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dwho.a(dnaa.a(dmzzVar, b), null, ebs.k(hvi.e, 24.0f), gft.a(b).s, b, 384, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnkt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnla.a(dmzz.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmzz dmzzVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1445249484);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dwho.a(dnaa.a(dmzzVar, b), null, null, 0L, b, 0, 12);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnku
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnla.b(dmzz.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dnlc dnlcVar, dwn dwnVar, hfd hfdVar, final int i) {
        int i2;
        final dwn dwnVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(76157806);
        if (i3 == 0) {
            i2 = (true != b.D(dnlcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dwnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            dwnVar2 = dwnVar;
        } else {
            boolean z = dnlcVar.d;
            b.v(832792518);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: dnkp
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((Boolean) obj).booleanValue();
                        dnlc.this.e.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwnVar2 = dwnVar;
            dwjd.a(z, (ffji) R, null, null, dwnVar2, b, (i2 << 15) & 3670016, 44);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnkq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnlc dnlcVar2 = dnlc.this;
                    int i5 = i;
                    dnla.c(dnlcVar2, dwnVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final hvi hviVar, final dwn dwnVar, final ffix ffixVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        hvi hviVar2;
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1798202820);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dwnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjnVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar2, 1.0f);
            hvi i4 = eba.i(dfb.c(eba.i(ebs.u(d, 56.0f, 0.0f, 2), 0.0f, 2.0f, 1), dwnVar, gkw.a(false, 0.0f, 0L, 7), false, null, null, ffixVar, 28), 16.0f, 0.0f, 2);
            int i5 = huo.a;
            int i6 = (i2 & 7168) | 384;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, i4);
            int i7 = ist.a;
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
            ffjnVar.a(ebr.a, b, Integer.valueOf(((i6 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnks
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dwn dwnVar2 = dwnVar;
                    ffix ffixVar3 = ffixVar;
                    dnla.d(hviVar3, dwnVar2, ffixVar3, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dnlc dnlcVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        final hvi hviVar2 = hviVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(758838255);
        if (i3 == 0) {
            i2 = (true != b.D(dnlcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else if (((Boolean) dooy.b(b).t.invoke()).booleanValue()) {
            b.v(463398750);
            b.v(1400423979);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi c = dfb.c(hviVar2, (dwn) R, gkw.a(false, 0.0f, 0L, 7), false, null, null, dnlcVar.e, 28);
            dmzz dmzzVar = dnlcVar.b;
            b.v(1400428902);
            hpn d = dmzzVar == null ? null : hpx.d(1984977543, new dnkv(dmzzVar), b);
            hfmVar.Z();
            b.v(1400434495);
            hfmVar.Z();
            dwhr.a(hpx.d(-889403690, new dnkw(dnlcVar), b), c, null, null, d, hpx.d(291445425, new dnky(dnlcVar), b), null, b, 196614, 452);
            hfdVar2 = b;
            hfmVar.Z();
            hviVar2 = hviVar;
        } else {
            hfdVar2 = b;
            hfdVar2.v(464034870);
            hfdVar2.v(1400442699);
            hfm hfmVar2 = (hfm) hfdVar2;
            Object R2 = hfmVar2.R();
            if (R2 == hfc.a) {
                R2 = new dwn();
                hfmVar2.ad(R2);
            }
            dwn dwnVar = (dwn) R2;
            hfmVar2.Z();
            hviVar2 = hviVar;
            d(hviVar2, dwnVar, dnlcVar.e, hpx.d(-1115436805, new dnkz(dnlcVar, dwnVar), hfdVar2), hfdVar2, ((i2 >> 3) & 14) | 3120);
            hfmVar2.Z();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnko
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnlc dnlcVar2 = dnlc.this;
                    int i4 = i;
                    dnla.e(dnlcVar2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-784300445);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, null, gft.a(b).q, 0L, null, null, 0L, null, 0L, 2, false, Alert.DURATION_SHOW_INDEFINITELY, 0, null, gft.d(b).j, hfdVar2, i2 & 14, 48, 55290);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnkr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnla.f(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(970133085);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, Alert.DURATION_SHOW_INDEFINITELY, 0, null, null, hfdVar2, i2 & 14, 48, 120830);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnkn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnla.g(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

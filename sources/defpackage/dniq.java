package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dniq {
    public static final void a(final ebq ebqVar, final dnir dnirVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2051979187);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnirVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dnxw.e(dnirVar.a, null, ebs.k(hvi.e, 40.0f), null, null, b, 432, 24);
            a = ebqVar.a(hvi.e, 1.0f, true);
            hvi i4 = eba.i(a, 16.0f, 0.0f, 2);
            dxq dxqVar = dxu.c;
            int i5 = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, b, 0);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, i4);
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
            h(dnirVar.b, b, 0);
            String str = dnirVar.d;
            b.v(-792889485);
            if (str != null) {
                f(str, b, 0);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnil
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    int i7 = i;
                    dniq.a(ebqVar2, dnirVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dnir dnirVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1249244177);
        if (i3 == 0) {
            i2 = (true != b.D(dnirVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (((Boolean) dooy.b(b).q.invoke()).booleanValue()) {
            b.v(328341224);
            b.v(1811707949);
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            String str = dnirVar.d;
            b.v(1811724545);
            hpn d2 = str == null ? null : hpx.d(-1522636559, new dnim(str), b);
            hfmVar.Z();
            dwhr.a(hpx.d(-135370648, new dnin(dnirVar), b), hviVar, null, d2, hpx.d(-1570708, new dnio(dnirVar), b), hpx.d(-1041862547, new dnip(dnirVar), b), dwhp.a(ibw.g, b, 510), b, 221190, 388);
            hfmVar.Z();
        } else {
            b.v(329172737);
            b.v(1811741480);
            d = ebs.d(hviVar, 1.0f);
            hvi a = hxo.a(eba.i(ebs.u(d, 68.0f, 0.0f, 2), 0.0f, 2.0f, 1), eqm.b(24.0f));
            hfm hfmVar2 = (hfm) b;
            hfmVar2.Z();
            hvi i4 = eba.i(a, 16.0f, 0.0f, 2);
            int i5 = huo.a;
            ipn a2 = ebm.a(dxu.a, hum.n, b, 48);
            int a3 = hey.a(b);
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, i4);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            a(ebr.a, dnirVar, b, ((i2 << 3) & 112) | 6);
            dwjt.b(((dnib) dnirVar.c).a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).g, b, 0, 0, 65534);
            b.n();
            hfmVar2.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnih
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnir dnirVar2 = dnir.this;
                    int i7 = i;
                    dniq.b(dnirVar2, hviVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final String str, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(340501333);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
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
            int a = doxh.a(BasePaymentResult.ERROR_REQUEST_FAILED);
            int i4 = i2;
            Uri parse = Uri.parse(str);
            int i5 = inp.a;
            inp inpVar = ino.b;
            Integer valueOf = Integer.valueOf(a);
            hfdVar2 = b;
            dnac.a(parse, "custom sticker", hviVar, null, null, null, inpVar, null, 0.0f, valueOf, valueOf, null, null, null, null, null, hfdVar2, ((i4 << 3) & 896) | 12582960, 0, 518008);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnik
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i6 = i;
                    dniq.c(str2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dnir dnirVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi d2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1424455496);
        if (i3 == 0) {
            i2 = (true != b.D(dnirVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(62707973);
            d = ebs.d(hviVar, 1.0f);
            hvi a = hxo.a(eba.i(ebs.u(d, 68.0f, 0.0f, 2), 0.0f, 2.0f, 1), eqm.b(24.0f));
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            hvi i4 = eba.i(a, 16.0f, 0.0f, 2);
            int i5 = huo.a;
            ipn a2 = ebm.a(dxu.a, hum.n, b, 48);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, i4);
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
            d2 = ebs.d(hviVar, 1.0f);
            ipn a4 = dyo.a(dxu.c, hum.j, b, 0);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, d2);
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
            hus husVar = hum.n;
            hve hveVar = hvi.e;
            ipn a6 = ebm.a(dxu.a, husVar, b, 48);
            int a7 = hey.a(b);
            hqb ai3 = hfmVar.ai();
            hvi b4 = huz.b(b, hveVar);
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a6, iss.e);
            hlc.b(b, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf3 = Integer.valueOf(a7);
                hfmVar.ad(valueOf3);
                b.h(valueOf3, ffjmVar3);
            }
            hlc.b(b, b4, iss.c);
            a(ebr.a, dnirVar, b, ((i2 << 3) & 112) | 6);
            b.n();
            c(((dnic) dnirVar.c).a, eba.j(dys.a(hvi.e, hum.j), 0.0f, 8.0f, 0.0f, 0.0f, 13), b, 0);
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnii
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnir dnirVar2 = dnir.this;
                    int i7 = i;
                    dniq.d(dnirVar2, hviVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dnir dnirVar, final hvi hviVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        dnirVar.getClass();
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-1538181723);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dnirVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            dnid dnidVar = dnirVar.c;
            if (dnidVar instanceof dnic) {
                b.v(2041228075);
                d(dnirVar, hviVar, b, i3 & 126);
                ((hfm) b).Z();
            } else {
                if (!(dnidVar instanceof dnib)) {
                    b.v(2041226862);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(2041229865);
                b(dnirVar, hviVar, b, i3 & 126);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnig
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnir dnirVar2 = dnir.this;
                    int i6 = i;
                    dniq.e(dnirVar2, hviVar, (hfd) obj, hip.a(i6 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1626376179);
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
            dwjt.b(str, null, gft.a(b).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(b).l, hfdVar2, i2 & 14, 3120, 55290);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnie
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dniq.f(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1215071742);
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
            dwjt.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, hfdVar2, i2 & 14, 3120, 120830);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnij
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dniq.g(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1678108803);
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
            dwjt.b(str, null, gft.a(b).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(b).j, hfdVar2, i2 & 14, 3120, 55290);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnif
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dniq.h(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

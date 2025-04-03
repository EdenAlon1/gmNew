package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvvp {
    public static final void a(final String str, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        final hvi hviVar2;
        hfd b = hfdVar.b(1425569846);
        if ((i & 6) == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
            hviVar2 = hviVar;
        } else {
            hve hveVar = hvi.e;
            hfdVar2 = b;
            dwjt.a(new jlm(str), eba.j(hveVar, 0.0f, 2.0f, 0.0f, 0.0f, 13), gft.a(b).s, 0L, 0L, null, 0L, 2, false, 2, null, null, gft.d(b).k, hfdVar2, 0, 3120, 55288);
            hviVar2 = hveVar;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvvn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i3 = i;
                    cvvp.a(str2, hviVar2, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final String str, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        hfd hfdVar2;
        hfd b = hfdVar.b(-1131826504);
        if ((i & 6) == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            hfdVar2 = b;
        } else {
            hviVar2 = hvi.e;
            hfdVar2 = b;
            dwjt.a(new jlm(str), hviVar2, gft.a(b).q, 0L, 0L, null, 0L, 2, false, 1, null, null, gft.d(b).j, hfdVar2, i3 & 112, 3120, 55288);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvvo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    cvvp.b(str2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final cvvl cvvlVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        hvi d;
        hvi a;
        hfd b = hfdVar.b(-1616578040);
        if ((i & 6) == 0) {
            i2 = (true != b.D(cvvlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != b.E(false) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hvi.e;
            b.v(294207466);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi a2 = dfb.c(hxo.a(eba.e(hvi.e, 8.0f, 2.0f), eqm.b(24.0f)), (dwn) R, fmn.a(true, 0.0f, 6), false, null, null, cvvlVar.d, 28).a(eba.f(hvi.e, 8.0f, 12.0f, 8.0f, 12.0f));
            int i4 = huo.a;
            ipn a3 = dyc.a(hum.a, false);
            int a4 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a2);
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
            d = ebs.d(hviVar2, 1.0f);
            ipn a5 = ebm.a(dxu.a, hum.n, b, 48);
            int a6 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, d);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            ebr ebrVar = ebr.a;
            dnxw.j(cvvlVar.c, ebs.k(hvi.e, 40.0f), b, 48);
            a = ebrVar.a(hvi.e, 1.0f, true);
            hvi j = eba.j(a, 16.0f, 0.0f, 16.0f, 0.0f, 10);
            ipn a7 = dyo.a(dxu.c, hum.j, b, 0);
            int a8 = hey.a(b);
            hqb ai3 = hfmVar.ai();
            hvi b4 = huz.b(b, j);
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a7, iss.e);
            hlc.b(b, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a8))) {
                Integer valueOf3 = Integer.valueOf(a8);
                hfmVar.ad(valueOf3);
                b.h(valueOf3, ffjmVar3);
            }
            hlc.b(b, b4, iss.c);
            b(cvvlVar.a, null, b, 0);
            a(cvvlVar.b, null, b, 0);
            b.n();
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvvm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvvl cvvlVar2 = cvvl.this;
                    int i6 = i;
                    cvvp.c(cvvlVar2, hviVar2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

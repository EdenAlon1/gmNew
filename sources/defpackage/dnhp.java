package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnhp {
    public static final void a(hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-1752958801);
        if ((i & 6) == 0) {
            i2 = (true != b.D(null) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dyc.b(doaq.d(hxo.a(ebs.k(hvi.e, 40.0f), eqm.a), null, 4), b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnhi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnhp.a((hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final float f, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-1389127572);
        if ((i & 6) == 0) {
            i2 = (true != b.D(null) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.A(f) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            dyc.b(doaq.d(hxo.a(ebs.e(ebs.d(hvi.e, f), 18.0f), gft.c(b).c), null, 4), b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnhk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    dnhp.b(f, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(hfd hfdVar, final int i) {
        hvi d;
        hvi a;
        int i2 = i | 54;
        int i3 = i2 & 19;
        hfd b = hfdVar.b(-411525320);
        if (i3 == 18 && b.I()) {
            b.s();
        } else if (((Boolean) dooy.b(b).o.invoke()).booleanValue()) {
            b.v(1269745561);
            dwhr.a(hpx.d(942607793, new dnhl(), b), null, null, hpx.d(-953635916, new dnhm(), b), hpx.d(-154061387, new dnhn(), b), hpx.d(645513142, new dnho(), b), null, b, 224262, 454);
            ((hfm) b).Z();
        } else {
            b.v(1270448145);
            d = ebs.d(hvi.e, 1.0f);
            hvi f = eba.f(d, 16.0f, 14.0f, 24.0f, 14.0f);
            dxi dxiVar = dxu.a;
            int i4 = huo.a;
            ipn a2 = ebm.a(dxiVar, hum.m, b, 0);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, f);
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
            int i6 = i2 & 14;
            int i7 = i2 & 112;
            ebr ebrVar = ebr.a;
            a(b, i2 & 126);
            a = ebrVar.a(hvi.e, 1.0f, true);
            hvi j = eba.j(a, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            ipn a4 = dyo.a(dxu.c, hum.j, b, 0);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, j);
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
            int i8 = i6 | 384 | i7;
            b(0.35f, b, i8);
            ebv.a(ebs.e(hvi.e, 2.0f), b);
            b(0.55f, b, i8);
            b.n();
            b(0.15f, b, i8);
            b.n();
            hfmVar.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnhj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnhp.d((hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnum {
    public static final void a(final dnuo dnuoVar, final hvi hviVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        huo huoVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(491705083);
        if (i3 == 0) {
            i2 = (true != b.D(dnuoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            int i4 = dnuoVar.c - 1;
            if (i4 == 0) {
                int i5 = huo.a;
                huoVar = hum.g;
            } else if (i4 != 1) {
                int i6 = huo.a;
                huoVar = hum.e;
            } else {
                int i7 = huo.a;
                huoVar = hum.i;
            }
            hve hveVar = hvi.e;
            ipn a = dyc.a(huoVar, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i8 = ist.a;
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
            ffjmVar.a(b, Integer.valueOf((i2 >> 6) & 14));
            dnuj.e(dnuoVar.a, hviVar, b, i2 & 112);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnul
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnuo dnuoVar2 = dnuo.this;
                    hvi hviVar2 = hviVar;
                    int i9 = i;
                    dnum.a(dnuoVar2, hviVar2, ffjmVar, (hfd) obj, hip.a(i9 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dnuo dnuoVar, final hvi hviVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(1332884603);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dnuoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            hviVar = hvi.e;
            if (dnuoVar == null) {
                b.v(379046708);
                ffjmVar.a(b, Integer.valueOf((i3 >> 6) & 14));
                ((hfm) b).Z();
            } else {
                b.v(379086388);
                a(dlsp.b(b) ? new dnuo(2, dnuoVar.a, dnuoVar.b) : dnuoVar, eba.c(hviVar, new ebf(8.0f, 8.0f, 8.0f, 8.0f)), ffjmVar, b, i3 & 896);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnuk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnuo dnuoVar2 = dnuo.this;
                    hvi hviVar2 = hviVar;
                    int i4 = i;
                    dnum.b(dnuoVar2, hviVar2, ffjmVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

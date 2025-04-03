package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokz {
    public static final void a(final hvi hviVar, hfd hfdVar, final int i) {
        int i2 = (i | 6) & 3;
        hfd b = hfdVar.b(-194005086);
        if (i2 == 2 && b.I()) {
            b.s();
        } else {
            hviVar = hvi.e;
            eql b2 = eqm.b(20.0f);
            hvi c = dek.c(dee.a(ebs.m(hviVar, 64.0f, 40.0f), gft.a(b).n, b2), 1.0f, gft.a(b).a, b2);
            int i3 = huo.a;
            ipn a = dyc.a(hum.e, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b, c);
            int i4 = ist.a;
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
            hlc.b(b, b3, iss.c);
            doul.a(new doun(ffel.a, null, new ffix() { // from class: doum
                @Override // defpackage.ffix
                public final Object invoke() {
                    return ffcu.a;
                }
            }), ebs.k(hvi.e, 40.0f), gft.a(b).a, b, 54, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doky
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dokz.a(hvi.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

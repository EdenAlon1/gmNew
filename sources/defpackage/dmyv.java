package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyv {
    public static final void a(final dmyw dmywVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hfm hfmVar;
        final hvi hviVar2;
        hfd b = hfdVar.b(1081593243);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dmywVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            List list = dmywVar.b;
            final hve hveVar = hvi.e;
            if (list.isEmpty()) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dmyq
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dmyw dmywVar2 = dmyw.this;
                            int i4 = i;
                            dmyv.a(dmywVar2, hveVar, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            d = ebs.d(hveVar, 1.0f);
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, d);
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
            dwjt.b(dmywVar.a, eba.j(hvi.e, 16.0f, 16.0f, 0.0f, 0.0f, 12), gft.a(b).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).m, b, 48, 0, 65528);
            b = b;
            hvi j = eba.j(hvi.e, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            ebe g = eba.g(8.0f, 0.0f, 2);
            b.v(-259311628);
            int i6 = i3 & 14;
            Object R = hfmVar2.R();
            if (i6 == 4 || R == hfc.a) {
                R = new ffji() { // from class: dmyr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        List list2 = dmyw.this.b;
                        edpVar.a(list2.size(), null, new dmyt(list2), new hpw(-632812321, true, new dmyu(list2)));
                        return ffcu.a;
                    }
                };
                hfmVar = hfmVar2;
                hfmVar.ad(R);
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            edh.b(j, null, g, dxnVar, null, null, false, null, (ffji) R, b, 24966, 490);
            b.n();
            hviVar2 = hveVar;
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dmys
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmyw dmywVar2 = dmyw.this;
                    int i7 = i;
                    dmyv.a(dmywVar2, hviVar2, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

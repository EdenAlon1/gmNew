package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqx {
    public static final void a(final aaqu aaquVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1737424071);
        if (i3 == 0) {
            i2 = (true != b.D(aaquVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
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
            dnvp.a(aaquVar.b, null, false, b, 0, 6);
            b.v(-265631542);
            hvi hviVar = hvi.e;
            if (dooy.g(b)) {
                hviVar = eba.j(hvi.e, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            }
            doqd doqdVar = aaquVar.a;
            if (doqdVar instanceof doqc) {
                hviVar = hviVar.a(jfw.a(hvi.e, ((doqc) doqdVar).a.a));
            }
            doqd doqdVar2 = aaquVar.a;
            if (doqdVar2 instanceof doqb) {
                hve hveVar2 = hvi.e;
                List list = ((doqb) doqdVar2).a;
                b.v(-1016192150);
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = new ffji() { // from class: aaqv
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            doqa doqaVar = (doqa) obj;
                            doqaVar.getClass();
                            return doqaVar.a;
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                hviVar = hviVar.a(jfw.a(hveVar2, ffdx.aA(list, "\n", null, null, (ffji) R, 30)));
            }
            hfmVar.Z();
            dopz.c(aaquVar.a, hviVar, !dooy.g(b), b, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aaqw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    aaqx.a(aaqu.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

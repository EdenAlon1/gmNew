package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnct {
    public static final void a(final Integer num, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        ffjnVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1455696825);
        if (i3 == 0) {
            i2 = (true != b.D(num) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
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
            dyi dyiVar = dyi.a;
            b.v(2035849496);
            if (num != null) {
                hvi b3 = dyiVar.b(hvi.e);
                b.v(2035852767);
                int i6 = i2 & 14;
                Object R = hfmVar.R();
                if (i6 == 4 || R == hfc.a) {
                    R = new ffji() { // from class: dncr
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            Context context = (Context) obj;
                            context.getClass();
                            View view = new View(context);
                            view.setId(num.intValue());
                            return view;
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                kcg.b((ffji) R, b3, null, b, 0, 4);
            }
            hfmVar.Z();
            ffjnVar.a(dyiVar, b, Integer.valueOf((i2 & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dncs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Integer num2 = num;
                    int i7 = i;
                    dnct.a(num2, ffjnVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

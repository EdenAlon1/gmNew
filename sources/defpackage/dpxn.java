package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpxn {
    public static final void a(final List list, final hvi hviVar, final float f, hfd hfdVar, final int i) {
        int i2;
        long f2;
        hvi a;
        hfd b = hfdVar.b(-246728506);
        if ((i & 6) == 0) {
            i2 = (true != b.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != b.A(f) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            hviVar = hvi.e;
            if (list.isEmpty()) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dpxl
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            List list2 = list;
                            hvi hviVar2 = hviVar;
                            int i4 = i;
                            dpxn.a(list2, hviVar2, f, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            hvi a2 = hxo.a(hviVar, eqm.b(24.0f));
            f2 = iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), 0.86f, ibw.f(iby.d(4280427042L)));
            a = dee.a(a2, f2, idb.a);
            hvi d = eba.d(a, 5.0f);
            dxn dxnVar = new dxn(16.0f, true, dxr.a);
            int i4 = huo.a;
            ipn a3 = ebm.a(dxnVar, hum.n, b, 54);
            int a4 = hey.a(b);
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
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-1072036572);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dpxi.a((dpxk) it.next(), f, b, (i3 >> 3) & 112);
            }
            hfmVar.Z();
            b.n();
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dpxm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    hvi hviVar2 = hviVar;
                    int i6 = i;
                    dpxn.a(list2, hviVar2, f, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

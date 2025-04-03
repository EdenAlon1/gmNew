package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfl {
    public static final void a(final zdq zdqVar, final ffix ffixVar, hfd hfdVar, final int i) {
        zdqVar.getClass();
        int i2 = i & 6;
        hfd b = hfdVar.b(864594986);
        int i3 = i2 == 0 ? (true != b.D(zdqVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-467793993);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            dmzz dmzzVar = d(hhoVar) ? dmzz.s : dmzz.r;
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i5 = ist.a;
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
            String str = zdqVar.a;
            dnlf dnlfVar = new dnlf(dmzzVar);
            b.v(52768400);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffix() { // from class: abfh
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        hho.this.b(Boolean.valueOf(!abfl.d(r0)));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            dnly.a(new dnlz(str, null, null, null, null, null, dnlfVar, (ffix) R2, 62), null, b, 0, 2);
            b.v(52772035);
            if (d(hhoVar)) {
                hvi i6 = eba.i(hvi.e, 8.0f, 0.0f, 2);
                ipn a3 = dyo.a(dxu.c, hum.j, b, 0);
                int a4 = hey.a(b);
                hqb ai2 = hfmVar.ai();
                hvi b3 = huz.b(b, i6);
                ffix ffixVar3 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar3);
                } else {
                    b.z();
                }
                hlc.b(b, a3, iss.e);
                hlc.b(b, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                    Integer valueOf2 = Integer.valueOf(a4);
                    hfmVar.ad(valueOf2);
                    b.h(valueOf2, ffjmVar2);
                }
                hlc.b(b, b3, iss.c);
                b.v(1089309563);
                List list = zdqVar.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((zdq) obj).b) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b((zdq) it.next(), ffixVar, b, i3 & 112);
                }
                hfmVar.Z();
                b.n();
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abfi
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    zdq zdqVar2 = zdq.this;
                    int i7 = i;
                    abfl.a(zdqVar2, ffixVar, (hfd) obj2, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final zdq zdqVar, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        zdqVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(418075945);
        if (i3 == 0) {
            i2 = (true != b.D(zdqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (zdqVar.b) {
            String str = zdqVar.a;
            b.v(1685170878);
            boolean z = (i2 & 112) == 32;
            boolean z2 = (i2 & 14) == 4;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z2 | z) || R == hfc.a) {
                R = new ffix() { // from class: abfd
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffix.this.invoke();
                        zdqVar.d.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dnly.a(new dnlz(str, null, null, null, null, null, null, (ffix) R, 126), null, b, 0, 2);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abfe
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zdq zdqVar2 = zdq.this;
                    int i4 = i;
                    abfl.b(zdqVar2, ffixVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final abfc abfcVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(87463934);
        if (i3 == 0) {
            i2 = (true != b.D(abfcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            ebe h = eba.h(0.0f, 8.0f, 0.0f, 8.0f, 5);
            b.v(319616371);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: abff
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        eek.a(edpVar, null, abfb.a, 3);
                        ArrayList arrayList = new ArrayList();
                        abfc abfcVar2 = abfc.this;
                        for (Object obj2 : abfcVar2.a) {
                            if (((zdq) obj2).b) {
                                arrayList.add(obj2);
                            }
                        }
                        edpVar.a(arrayList.size(), null, new abfj(arrayList), new hpw(-632812321, true, new abfk(arrayList, abfcVar2)));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            edh.a(null, null, h, false, null, null, null, false, null, (ffji) R, b, 384, 507);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abfg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    abfl.c(abfc.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final boolean d(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }
}

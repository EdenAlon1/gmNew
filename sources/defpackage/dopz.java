package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dopz {
    public static final void a(final hvi hviVar, final List list, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(883360582);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            float f = 0.0f;
            hvi i4 = eba.i(hviVar, 0.0f, 8.0f, 1);
            b.v(-594100036);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: dopw
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((jkv) obj).getClass();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi c = jjs.c(i4, true, (ffji) R);
            dxi dxiVar = dxu.a;
            int i5 = huo.a;
            ipn a2 = ebm.a(dxiVar, hum.m, b, 0);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c);
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
            hve hveVar = hvi.e;
            b.v(88871036);
            long j = z ? gft.a(b).I : ibw.g;
            hfmVar.Z();
            a = dee.a(hveVar, j, idb.a);
            d = ebs.d(a, 1.0f);
            if (z) {
                f = 10.0f;
                z = true;
            } else {
                z = false;
            }
            hvi e = eba.e(d, 24.0f, f);
            ipn a4 = dyo.a(dxu.c, hum.j, b, 0);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, e);
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
            b.v(-2132887791);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b((doqa) it.next(), b, 0);
            }
            hfmVar.Z();
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dopx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    List list2 = list;
                    int i7 = i;
                    dopz.a(hviVar2, list2, z, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final doqa doqaVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2053730280);
        if (i3 == 0) {
            i2 = (true != b.D(doqaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            dxj dxjVar = dxu.e;
            int i4 = huo.a;
            ipn a = ebm.a(dxjVar, hum.m, b, 54);
            int a2 = hey.a(b);
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
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dmzz dmzzVar = doqaVar.b;
            b.v(1399278239);
            if (dmzzVar != null) {
                d(dmzzVar, b, 0);
            }
            hfmVar.Z();
            dlur.e(doqaVar, null, gft.a(b).s, jpo.y(gft.d(b).l, 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 0, 16744447), null, 0L, null, false, null, b, i2 & 14, 498);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dopv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dopz.b(doqa.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final doqd doqdVar, final hvi hviVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2049216313);
        if (i3 == 0) {
            i2 = (true != b.D(doqdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else if (doqdVar instanceof doqc) {
            b.v(-1237634434);
            a(hviVar, ffdx.b(((doqc) doqdVar).a), z, b, ((i2 >> 3) & 14) | (i2 & 896));
            ((hfm) b).Z();
        } else {
            if (!(doqdVar instanceof doqb)) {
                b.v(-594114551);
                ((hfm) b).Z();
                throw new ffcd();
            }
            b.v(-1237520571);
            a(hviVar, ((doqb) doqdVar).a, z, b, ((i2 >> 3) & 14) | (i2 & 896));
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dopy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doqd doqdVar2 = doqd.this;
                    hvi hviVar2 = hviVar;
                    int i4 = i;
                    dopz.c(doqdVar2, hviVar2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dmzz dmzzVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(281482614);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dwho.a(dnaa.a(dmzzVar, b), null, ebs.k(eba.j(hvi.e, 0.0f, 2.0f, 4.0f, 0.0f, 9), ((jzn) b.e(jdr.e)).ed() * 12.0f), gft.a(b).s, b, i2 & 112, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dopu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dopz.d(dmzz.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

package defpackage;

import androidx.car.app.model.Alert;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dodp {
    public static final int a(ipl iplVar, dodr dodrVar) {
        return iplVar.c(jzk.b(dodrVar.a));
    }

    public static final int b(ipl iplVar) {
        return iplVar.c(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public static final iqk c(ipl iplVar, dodr dodrVar, int i) {
        return iplVar.e(jzk.m(dodrVar.a, 0, 0, 0, i, 7));
    }

    public static final void d(final List list, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1805979586);
        if (i3 == 0) {
            i2 = (true != b.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            Iterator it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                int i5 = i4 + 1;
                dobi dobiVar = (dobi) it.next();
                int e = ffdx.e(list);
                d = ebs.d(eba.i(hvi.e, 16.0f, 0.0f, 2), 1.0f);
                i(dobiVar.b, dobiVar.a, dobiVar.c, jfw.a(d, "rich_card_action"), b, 3072);
                b.v(-166279325);
                if (i4 != e) {
                    j(eba.i(hvi.e, 16.0f, 0.0f, 2), b, 6);
                }
                ((hfm) b).Z();
                i4 = i5;
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dodc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dodp.d(list, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1217662866);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(-130880466);
            if (str == null) {
                ebv.a(ebs.k(hvi.e, 0.0f), b);
                ((hfm) b).Z();
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dodk
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dodp.e(null, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            ((hfm) b).Z();
            hfdVar2 = b;
            dwjt.b(str, eba.j(eba.i(hvi.e, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 2, false, 0, 0, null, gft.d(b).j, hfdVar2, (i2 & 14) | 48, 48, 63484);
        }
        hio L2 = hfdVar2.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dodl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dodp.e(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final dodz dodzVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(713028859);
        if (i3 == 0) {
            i2 = (true != b.D(dodzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            g(hpx.d(-1097106788, new dodn(dodzVar), b), b, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dodi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dodp.f(dodz.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1837500186);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            b.v(-1729280199);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = dodo.a;
                hfmVar.ad(R);
            }
            ipn ipnVar = (ipn) R;
            hfmVar.Z();
            hve hveVar = hvi.e;
            int a = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i4 = ist.a;
            int i5 = ((((i2 & 14) | 384) << 6) & 896) | 6;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, ipnVar, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            hlc.b(b, b2, iss.c);
            ffjmVar.a(b, Integer.valueOf((i5 >> 6) & 14));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dode
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dodp.g(ffjm.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1911384266);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(-2044898614);
            if (str == null) {
                ebv.a(ebs.k(hvi.e, 0.0f), b);
                ((hfm) b).Z();
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dodg
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dodp.h(null, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            ((hfm) b).Z();
            hfdVar2 = b;
            dwjt.b(str, eba.j(eba.i(hvi.e, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 2, false, 0, 0, null, gft.d(b).h, hfdVar2, (i2 & 14) | 48, 48, 63484);
        }
        hio L2 = hfdVar2.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dodh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dodp.h(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final dobm dobmVar, final String str, final ffix ffixVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(410548694);
        if (i3 == 0) {
            i2 = (true != b.D(dobmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            hviVar2 = hviVar;
            i2 |= true != b.D(hviVar2) ? 1024 : 2048;
        } else {
            hviVar2 = hviVar;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            int i4 = i2 >> 6;
            dwfj.e(ffixVar, hviVar2, false, null, null, null, hpx.d(1826607507, new dodm(dobmVar, str), b), b, (i4 & 14) | 805306368 | (i4 & 112), 508);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dodd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dobm dobmVar2 = dobm.this;
                    String str2 = str;
                    ffix ffixVar2 = ffixVar;
                    dodp.i(dobmVar2, str2, ffixVar2, hviVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-349143119);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hviVar;
            dwgw.a(hviVar2, 0.0f, 0L, b, i2 & 14, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dodf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dodp.j(hvi.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(final dobm dobmVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2 = hviVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1752570556);
        if (i3 == 0) {
            i2 = i | (true != b.D(dobmVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (dobmVar instanceof dobj) {
            int i4 = (i2 << 3) & 896;
            b.v(-1960417670);
            igq a = jie.a(((dobj) dobmVar).a, b, 0);
            b.v(-340329303);
            long j = ((ibw) b.e(fzc.a)).i;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            dwho.a(a, null, hviVar2, j, b, i4, 0);
            hfmVar.Z();
            hviVar2 = hviVar;
        } else if (dobmVar instanceof dobl) {
            b.v(-1960144188);
            hviVar2 = hviVar;
            dnac.a(((dobl) dobmVar).a, null, hviVar2, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, b, (i2 << 3) & 896, 0, 524280);
            b = b;
            ((hfm) b).Z();
        } else {
            if (!(dobmVar instanceof dobk)) {
                b.v(-340335889);
                ((hfm) b).Z();
                throw new ffcd();
            }
            int i5 = (i2 << 3) & 896;
            b.v(-1959996628);
            igq a2 = dnaa.a(((dobk) dobmVar).a, b);
            b.v(-340316279);
            long j2 = ((ibw) b.e(fzc.a)).i;
            hfm hfmVar2 = (hfm) b;
            hfmVar2.Z();
            hviVar2 = hviVar;
            dwho.a(a2, null, hviVar2, j2, b, i5, 0);
            hfmVar2.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doda
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dobm dobmVar2 = dobm.this;
                    int i6 = i;
                    dodp.k(dobmVar2, hviVar2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

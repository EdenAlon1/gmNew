package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngm {
    public static final long a(hho hhoVar) {
        return ((kaa) hhoVar.a()).a;
    }

    public static final void b(final List list, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-663546648);
        if (i3 == 0) {
            i2 = (true != b.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            b.v(-769789301);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            b.v(-769787453);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffix() { // from class: dnfe
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dngm.c(hho.this, true);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            dwhl.b((ffix) R2, null, false, null, null, hpx.d(1534411142, new dnga(hhoVar, list), b), b, 1572870, 62);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnff
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dngm.b(list, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final void d(hho hhoVar, long j) {
        hhoVar.b(new kaa(j));
    }

    public static final void e(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final void f(final String str, final String str2, final List list, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(678071983);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(list) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi j = eba.j(d, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
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
            int i6 = i2 & 896;
            v(str, null, list, b, i2 & 910);
            b.v(-288300477);
            if (str2 != null) {
                u(str2, null, list, b, i6);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dneq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str3 = str;
                    String str4 = str2;
                    int i7 = i;
                    dngm.f(str3, str4, list, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final String str, final List list, hfd hfdVar, final int i) {
        hfd hfdVar2;
        int i2 = i & 6;
        hfd b = hfdVar.b(-1104550916);
        int i3 = i2 == 0 ? (true != b.D(str) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.F(list) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((dnep) obj).d == 2) {
                    arrayList.add(obj);
                }
            }
            hfdVar2 = b;
            dwjt.a(y(str, arrayList, b), null, 0L, 0L, 0L, null, 0L, 2, false, 1, null, null, null, hfdVar2, 0, 3120, 120830);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnfd
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str2 = str;
                    int i4 = i;
                    dngm.g(str2, list, (hfd) obj2, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1862385131);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, ebs.x(hvi.e, 0.0f, 72.0f, 1), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, hfdVar2, (i2 & 14) | 48, 3120, 120828);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnfj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dngm.h(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final String str, final List list, hfd hfdVar, final int i) {
        hfd hfdVar2;
        int i2 = i & 6;
        hfd b = hfdVar.b(1984452826);
        int i3 = i2 == 0 ? (true != b.D(str) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.F(list) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((dnep) obj).d == 1) {
                    arrayList.add(obj);
                }
            }
            hfdVar2 = b;
            dwjt.a(y(str, arrayList, b), null, 0L, 0L, 0L, null, 0L, 2, false, 1, null, null, null, hfdVar2, 0, 3120, 120830);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnfc
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str2 = str;
                    int i4 = i;
                    dngm.i(str2, list, (hfd) obj2, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final dngr dngrVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-854056214);
        if (i3 == 0) {
            i2 = (true != b.D(dngrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(dngrVar.a, eba.j(hviVar, 30.0f, 14.0f, 0.0f, 6.0f, 4), gft.a(hfdVar2).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar2).m, hfdVar2, 0, 0, 65528);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnfm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dngr dngrVar2 = dngr.this;
                    int i4 = i;
                    dngm.j(dngrVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(final dngw dngwVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(2010349802);
        if (i3 == 0) {
            i2 = (true != b.D(dngwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hio L = b.L();
            if (L != null) {
                L.d = new ffjm() { // from class: dner
                    @Override // defpackage.ffjm
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        dngw dngwVar2 = dngw.this;
                        int i4 = i;
                        dngm.k(dngwVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                        return ffcu.a;
                    }
                };
                return;
            }
            return;
        }
        d = ebs.d(hviVar, 1.0f);
        a = dee.a(d, gft.a(b).F, idb.a);
        int i4 = huo.a;
        ipn a2 = dyc.a(hum.a, false);
        int a3 = hey.a(b);
        hfm hfmVar = (hfm) b;
        hqb ai = hfmVar.ai();
        hvi b2 = huz.b(b, a);
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
        eba.j(hviVar, 30.0f, 4.0f, 0.0f, 4.0f, 4);
        throw null;
    }

    public static final void l(final String str, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1208124056);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, ebs.x(hviVar, 0.0f, 72.0f, 1), gft.a(b).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(b).l, hfdVar2, i2 & 14, 3120, 55288);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnfg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dngm.l(str2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final String q(boolean z, hfd hfdVar) {
        String a;
        hfdVar.v(-723587255);
        if (z) {
            hfdVar.v(1358815266);
            a = jii.a(R.string.list_item_selected, hfdVar);
            hfdVar.o();
        } else {
            hfdVar.v(1358873856);
            a = jii.a(R.string.list_item_unselected, hfdVar);
            hfdVar.o();
        }
        hfdVar.o();
        return a;
    }

    public static final void r(final dngn dngnVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi b;
        hvi a;
        hvi hviVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(776857518);
        if (i3 == 0) {
            i2 = (true != b2.D(dngnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.D(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(null) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b2.I()) {
            b2.s();
        } else {
            b2.v(708869109);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(new kaa(0L), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            if (((Boolean) dooy.b(b2).m.invoke()).booleanValue()) {
                b2.v(500249834);
                if (dngnVar.g != null) {
                    int i4 = i2 & 14;
                    hve hveVar = hvi.e;
                    b2.v(708878062);
                    Object R2 = hfmVar.R();
                    if (R2 == hfc.a) {
                        R2 = new ffji() { // from class: dnet
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                ioc iocVar = (ioc) obj;
                                iocVar.getClass();
                                dngm.d(hho.this, kab.c(iod.b(iocVar)));
                                return ffcu.a;
                            }
                        };
                        hfmVar.ad(R2);
                    }
                    hfmVar.Z();
                    hvi a2 = ipx.a(hveVar, (ffji) R2);
                    b2.v(708883291);
                    Object R3 = hfmVar.R();
                    if (i4 == 4 || R3 == hfc.a) {
                        R3 = new ffix() { // from class: dneu
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                hho hhoVar2 = hhoVar;
                                dngn.this.g.invoke(new dngs(kaa.a(dngm.a(hhoVar2)), kaa.b(dngm.a(hhoVar2))));
                                return ffcu.a;
                            }
                        };
                        hfmVar.ad(R3);
                    }
                    hfmVar.Z();
                    hviVar2 = dfb.d(a2, false, null, (ffix) R3, 7);
                } else {
                    hviVar2 = hvi.e;
                }
                hvi a3 = hviVar.a(hviVar2);
                String str = dngnVar.d;
                b2.v(708905394);
                hpn d2 = str != null ? hpx.d(-1806370000, new dnfs(str, dngnVar), b2) : null;
                hfmVar.Z();
                dwhr.a(hpx.d(-741391001, new dnft(dngnVar), b2), a3, null, d2, hpx.d(-173419925, new dnfu(dngnVar), b2), hpx.d(2116056492, new dnfv(dngnVar), b2), dwhp.a(ibw.g, b2, 510), b2, 221190, 388);
                hfmVar.Z();
            } else {
                b2.v(501903126);
                b2.v(708924940);
                Object R4 = hfmVar.R();
                if (R4 == hfc.a) {
                    hic hicVar2 = new hic(false, hla.a);
                    hfmVar.ad(hicVar2);
                    R4 = hicVar2;
                }
                final hho hhoVar2 = (hho) R4;
                hfmVar.Z();
                d = ebs.d(hviVar, 1.0f);
                if (dngnVar.g != null) {
                    int i5 = i2 & 14;
                    b2.v(708936536);
                    hve hveVar2 = hvi.e;
                    b2.v(708932558);
                    Object R5 = hfmVar.R();
                    if (R5 == hfc.a) {
                        R5 = new ffji() { // from class: dnev
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                ioc iocVar = (ioc) obj;
                                iocVar.getClass();
                                dngm.d(hho.this, kab.c(iod.b(iocVar)));
                                return ffcu.a;
                            }
                        };
                        hfmVar.ad(R5);
                    }
                    hfmVar.Z();
                    hvi a4 = ipx.a(hveVar2, (ffji) R5);
                    b2.v(708937787);
                    Object R6 = hfmVar.R();
                    if (i5 == 4 || R6 == hfc.a) {
                        R6 = new ffix() { // from class: dnew
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                hho hhoVar3 = hhoVar;
                                dngn.this.g.invoke(new dngs(kaa.a(dngm.a(hhoVar3)), kaa.b(dngm.a(hhoVar3))));
                                return ffcu.a;
                            }
                        };
                        hfmVar.ad(R6);
                    }
                    hfmVar.Z();
                    b = dfb.d(a4, false, null, (ffix) R6, 7);
                    hfmVar.Z();
                } else {
                    b2.v(708953084);
                    hfmVar.Z();
                    b = dlsj.b(hvi.e);
                }
                hvi f = eba.f(d.a(b), 16.0f, 13.0f, 4.0f, 13.0f);
                int i6 = huo.a;
                ipn a5 = ebm.a(dxu.a, hum.n, b2, 48);
                int a6 = hey.a(b2);
                hqb ai = hfmVar.ai();
                hvi b3 = huz.b(b2, f);
                int i7 = ist.a;
                ffix ffixVar = iss.a;
                b2.x();
                if (hfmVar.z) {
                    b2.j(ffixVar);
                } else {
                    b2.z();
                }
                hlc.b(b2, a5, iss.e);
                hlc.b(b2, ai, iss.d);
                ffjm ffjmVar = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                    Integer valueOf = Integer.valueOf(a6);
                    hfmVar.ad(valueOf);
                    b2.h(valueOf, ffjmVar);
                }
                hlc.b(b2, b3, iss.c);
                ebr ebrVar = ebr.a;
                dnxw.j(dngnVar.a, ebs.k(hvi.e, 40.0f), b2, 48);
                a = ebrVar.a(hvi.e, 1.0f, true);
                hvi j = eba.j(a, 16.0f, 0.0f, 8.0f, 0.0f, 10);
                ipn a7 = dyo.a(dxu.c, hum.j, b2, 0);
                int a8 = hey.a(b2);
                hqb ai2 = hfmVar.ai();
                hvi b4 = huz.b(b2, j);
                ffix ffixVar2 = iss.a;
                b2.x();
                if (hfmVar.z) {
                    b2.j(ffixVar2);
                } else {
                    b2.z();
                }
                hlc.b(b2, a7, iss.e);
                hlc.b(b2, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a8))) {
                    Integer valueOf2 = Integer.valueOf(a8);
                    hfmVar.ad(valueOf2);
                    b2.h(valueOf2, ffjmVar2);
                }
                hlc.b(b2, b4, iss.c);
                v(dngnVar.b, null, dngnVar.e, b2, 0);
                String str2 = dngnVar.d;
                b2.v(-1232447281);
                if (str2 != null) {
                    u(str2, null, dngnVar.e, b2, 0);
                }
                hfmVar.Z();
                b2.n();
                String str3 = dngnVar.f;
                b2.v(1988495759);
                if (str3 != null) {
                    l(str3, eba.j(hvi.e, 0.0f, 0.0f, 4.0f, 0.0f, 11), b2, 48);
                }
                hfmVar.Z();
                b2.v(1988499843);
                Object R7 = hfmVar.R();
                if (R7 == hfc.a) {
                    R7 = new ffix() { // from class: dnex
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dngm.e(hho.this, true);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R7);
                }
                hfmVar.Z();
                dwhl.b((ffix) R7, null, false, null, null, hpx.d(-504656556, new dnfr(hhoVar2, dngnVar), b2), b2, 1572870, 62);
                b2 = b2;
                b2.n();
                hfmVar.Z();
            }
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dney
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dngn dngnVar2 = dngn.this;
                    int i8 = i;
                    dngm.r(dngnVar2, hviVar, (hfd) obj, hip.a(i8 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void s(final dngp dngpVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1503716548);
        if (i3 == 0) {
            i2 = (true != b.D(dngpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(null) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else if (((Boolean) dooy.b(b).m.invoke()).booleanValue()) {
            b.v(-79508633);
            hvi d = dfb.d(hviVar, false, null, dngpVar.e, 7);
            String str = dngpVar.c;
            b.v(1798564702);
            hpn d2 = str != null ? hpx.d(1463595327, new dngb(str, dngpVar), b) : null;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            b.v(1798568418);
            hfmVar.Z();
            dwhr.a(hpx.d(-1630626763, new dngc(dngpVar), b), d, null, d2, hpx.d(-1384063431, new dngd(dngpVar), b), null, dwhp.a(ibw.g, b, 510), b, 24582, 388);
            hfmVar.Z();
        } else {
            b.v(-78595125);
            hvi a = hxo.a(eba.e(hviVar, 8.0f, 2.0f), eqm.b(24.0f));
            b.v(1798587549);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar2.ad(R);
            }
            hfmVar2.Z();
            hvi f = eba.f(dfb.c(a, (dwn) R, gkw.a(false, 0.0f, 0L, 7), false, null, null, dngpVar.e, 28), 8.0f, 12.0f, 16.0f, 12.0f);
            int i4 = huo.a;
            ipn a2 = ebm.a(dxu.a, hum.n, b, 48);
            int a3 = hey.a(b);
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, f);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dnxw.j(dngpVar.a, ebs.k(hvi.e, 40.0f), b, 48);
            b.v(-1115504730);
            f(dngpVar.b, dngpVar.c, dngpVar.d, b, 0);
            hfmVar2.Z();
            b.n();
            hfmVar2.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnez
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dngp dngpVar2 = dngp.this;
                    int i6 = i;
                    dngm.s(dngpVar2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void t(final dngx dngxVar, final hvi hviVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        dngxVar.getClass();
        int i4 = i2 & 1;
        hfd b = hfdVar.b(2070809935);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dngxVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != b.D(null) ? 128 : 256;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != b.D(null) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            if (dngxVar instanceof dngr) {
                b.v(2053101804);
                j((dngr) dngxVar, hviVar, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dngxVar instanceof dngw) {
                b.v(2053104428);
                k((dngw) dngxVar, hviVar, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dngxVar instanceof dngp) {
                b.v(2053106844);
                s((dngp) dngxVar, hviVar, b, i3 & 8176);
                ((hfm) b).Z();
            } else if (dngxVar instanceof dngv) {
                b.v(2053109921);
                x((dngv) dngxVar, hviVar, b, i3 & 8176);
                ((hfm) b).Z();
            } else if (dngxVar instanceof dngt) {
                b.v(2053113378);
                w((dngt) dngxVar, hviVar, b, i3 & 8176);
                ((hfm) b).Z();
            } else {
                if (!(dngxVar instanceof dngn)) {
                    b.v(2053100463);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(2053116641);
                r((dngn) dngxVar, hviVar, b, i3 & 8176);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnfb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dngx dngxVar2 = dngx.this;
                    int i6 = i;
                    dngm.t(dngxVar2, hviVar, (hfd) obj, hip.a(i6 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void u(final String str, hvi hviVar, final List list, hfd hfdVar, final int i) {
        hfd hfdVar2;
        final hvi hviVar2;
        hfd b = hfdVar.b(-293776775);
        int i2 = ((i & 6) == 0 ? (true != b.D(str) ? 2 : 4) | i : i) | 48;
        if ((i & 384) == 0) {
            i2 |= true != b.F(list) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
            hviVar2 = hviVar;
        } else {
            hve hveVar = hvi.e;
            hvi j = eba.j(hveVar, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((dnep) obj).d == 2) {
                    arrayList.add(obj);
                }
            }
            hfdVar2 = b;
            dwjt.a(y(str, arrayList, b), j, gft.a(b).s, 0L, 0L, null, 0L, 2, false, 1, null, null, gft.d(b).k, hfdVar2, 0, 3120, 55288);
            hviVar2 = hveVar;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnes
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str2 = str;
                    hvi hviVar3 = hviVar2;
                    int i3 = i;
                    dngm.u(str2, hviVar3, list, (hfd) obj2, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void v(final String str, hvi hviVar, final List list, hfd hfdVar, final int i) {
        final hvi hviVar2;
        hfd hfdVar2;
        hfd b = hfdVar.b(935140663);
        int i2 = ((i & 6) == 0 ? (true != b.D(str) ? 2 : 4) | i : i) | 48;
        if ((i & 384) == 0) {
            i2 |= true != b.F(list) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            hfdVar2 = b;
        } else {
            hve hveVar = hvi.e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((dnep) obj).d == 1) {
                    arrayList.add(obj);
                }
            }
            hviVar2 = hveVar;
            hfdVar2 = b;
            dwjt.a(y(str, arrayList, b), hviVar2, gft.a(b).q, 0L, 0L, null, 0L, 2, false, 1, null, null, gft.d(b).j, hfdVar2, i2 & 112, 3120, 55288);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnfi
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str2 = str;
                    hvi hviVar3 = hviVar2;
                    int i3 = i;
                    dngm.v(str2, hviVar3, list, (hfd) obj2, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void w(final dngt dngtVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2129208404);
        if (i3 == 0) {
            i2 = (true != b.D(dngtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(null) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else if (((Boolean) dooy.b(b).m.invoke()).booleanValue()) {
            b.v(-739584906);
            hvi d2 = dfb.d(hviVar, false, null, dngtVar.e, 7);
            b.v(-738720347);
            gez a2 = dwhp.a(0L, b, 511);
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            dwhr.a(hpx.d(-877154523, new dnge(dngtVar), b), d2, null, hpx.d(-1681378264, new dngf(dngtVar), b), hpx.d(-517797079, new dngg(dngtVar), b), dneo.a, a2, b, 224262, 388);
            hfmVar.Z();
        } else {
            b.v(-738621209);
            d = ebs.d(hviVar, 1.0f);
            b.v(1777291669);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar2.ad(R);
            }
            hfmVar2.Z();
            hvi f = eba.f(dfb.c(d, (dwn) R, gkw.a(false, 0.0f, 0L, 7), false, null, null, dngtVar.e, 28), 16.0f, 14.0f, 14.0f, 14.0f);
            int i4 = huo.a;
            ipn a3 = ebm.a(dxu.a, hum.n, b, 48);
            int a4 = hey.a(b);
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, f);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ebr ebrVar = ebr.a;
            dnxw.j(dngtVar.a, ebs.k(hvi.e, 40.0f), b, 48);
            a = ebrVar.a(hvi.e, 1.0f, true);
            hvi j = eba.j(a, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            ipn a5 = dyo.a(dxu.c, hum.j, b, 0);
            int a6 = hey.a(b);
            hqb ai2 = hfmVar2.ai();
            hvi b3 = huz.b(b, j);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfmVar2.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            v(dngtVar.b, null, dngtVar.d, b, 0);
            u(dngtVar.c, null, dngtVar.d, b, 0);
            b.n();
            dwho.a(dnaa.a(dmzz.ah, b), jii.a(R.string.list_item_redirect_caret, b), ebs.k(hvi.e, 24.0f), gft.a(b).s, b, 384, 0);
            b = b;
            b.n();
            hfmVar2.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnfh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dngt dngtVar2 = dngt.this;
                    int i6 = i;
                    dngm.w(dngtVar2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void x(final dngv dngvVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        long j;
        hvi d;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1895396846);
        if (i3 == 0) {
            i2 = (true != b.D(dngvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(null) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            if (((dnyo) dngvVar.a).a == 3) {
                throw new IllegalStateException("Monograms with the selected icon override should not be used in selectable list items. The checkbox is already included as part of the list item.");
            }
            if (((Boolean) dooy.b(b).m.invoke()).booleanValue()) {
                b.v(-783448266);
                b.v(806013047);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = new dwn();
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                hvi c = dfb.c(hviVar, (dwn) R, null, false, null, null, dngvVar.f, 28);
                if (dngvVar.d) {
                    hve hveVar = hvi.e;
                    b.v(43084099);
                    final long j2 = gft.a(b).F;
                    b.v(1428027781);
                    boolean C = b.C(j2);
                    Object R2 = hfmVar.R();
                    if (C || R2 == hfc.a) {
                        R2 = new ffji() { // from class: dnfa
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                ifr ifrVar = (ifr) obj;
                                ifrVar.getClass();
                                float em = ifrVar.em(8.0f);
                                float em2 = ifrVar.em(2.0f);
                                long floatToRawIntBits = Float.floatToRawIntBits(em);
                                long floatToRawIntBits2 = Float.floatToRawIntBits(em2);
                                ifrVar.b();
                                float intBitsToFloat = Float.intBitsToFloat((int) (ifrVar.b() >> 32));
                                float em3 = ifrVar.em(8.0f);
                                float f = intBitsToFloat - (em3 + em3);
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (ifrVar.b() & 4294967295L));
                                float em4 = ifrVar.em(2.0f);
                                float f2 = intBitsToFloat2 - (em4 + em4);
                                ifq.k(ifrVar, j2, (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(r1) & 4294967295L) | (Float.floatToRawIntBits(ifrVar.em(24.0f)) << 32), null, 0.0f, 240);
                                return ffcu.a;
                            }
                        };
                        hfmVar.ad(R2);
                    }
                    hfmVar.Z();
                    hvi a2 = hxs.a(hveVar, (ffji) R2);
                    hfmVar.Z();
                    c = c.a(a2);
                }
                b.v(806056676);
                long j3 = ibw.g;
                hfmVar.Z();
                dwhr.a(hpx.d(377148327, new dngh(dngvVar), b), c, null, hpx.d(-1344357014, new dngi(dngvVar), b), hpx.d(945119403, new dngj(dngvVar), b), hpx.d(-1060371476, new dngl(dngvVar), b), dwhp.a(j3, b, 510), b, 224262, 388);
                hfdVar2 = b;
                hfmVar.Z();
            } else {
                hfdVar2 = b;
                hfdVar2.v(-781662015);
                hfdVar2.v(806068087);
                hfm hfmVar2 = (hfm) hfdVar2;
                Object R3 = hfmVar2.R();
                if (R3 == hfc.a) {
                    R3 = new dwn();
                    hfmVar2.ad(R3);
                }
                dwn dwnVar = (dwn) R3;
                hfmVar2.Z();
                if (dngvVar.d) {
                    hfdVar2.v(-781600170);
                    j = gft.a(hfdVar2).F;
                    hfmVar2.Z();
                } else {
                    hfdVar2.v(-781534977);
                    j = gft.a(hfdVar2).p;
                    hfmVar2.Z();
                }
                hvi f = eba.f(dfb.c(hxo.a(dee.a(eba.e(hvi.e, 8.0f, 2.0f), j, eqm.b(24.0f)), eqm.b(24.0f)), dwnVar, null, false, null, null, dngvVar.f, 28), 8.0f, 12.0f, 8.0f, 12.0f);
                int i4 = huo.a;
                ipn a3 = dyc.a(hum.a, false);
                int a4 = hey.a(hfdVar2);
                hqb ai = hfmVar2.ai();
                hvi b2 = huz.b(hfdVar2, f);
                int i5 = ist.a;
                ffix ffixVar = iss.a;
                hfdVar2.x();
                if (hfmVar2.z) {
                    hfdVar2.j(ffixVar);
                } else {
                    hfdVar2.z();
                }
                hlc.b(hfdVar2, a3, iss.e);
                hlc.b(hfdVar2, ai, iss.d);
                ffjm ffjmVar = iss.f;
                if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a4))) {
                    Integer valueOf = Integer.valueOf(a4);
                    hfmVar2.ad(valueOf);
                    hfdVar2.h(valueOf, ffjmVar);
                }
                hlc.b(hfdVar2, b2, iss.c);
                d = ebs.d(hviVar, 1.0f);
                ipn a5 = ebm.a(dxu.a, hum.n, hfdVar2, 48);
                int a6 = hey.a(hfdVar2);
                hqb ai2 = hfmVar2.ai();
                hvi b3 = huz.b(hfdVar2, d);
                ffix ffixVar2 = iss.a;
                hfdVar2.x();
                if (hfmVar2.z) {
                    hfdVar2.j(ffixVar2);
                } else {
                    hfdVar2.z();
                }
                hlc.b(hfdVar2, a5, iss.e);
                hlc.b(hfdVar2, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a6))) {
                    Integer valueOf2 = Integer.valueOf(a6);
                    hfmVar2.ad(valueOf2);
                    hfdVar2.h(valueOf2, ffjmVar2);
                }
                hlc.b(hfdVar2, b3, iss.c);
                ebr ebrVar = ebr.a;
                dnxw.j(dngvVar.a, ebs.k(hvi.e, 40.0f), hfdVar2, 48);
                a = ebrVar.a(hvi.e, 1.0f, true);
                hvi j4 = eba.j(a, 16.0f, 0.0f, 8.0f, 0.0f, 10);
                ipn a7 = dyo.a(dxu.c, hum.j, hfdVar2, 0);
                int a8 = hey.a(hfdVar2);
                hqb ai3 = hfmVar2.ai();
                hvi b4 = huz.b(hfdVar2, j4);
                ffix ffixVar3 = iss.a;
                hfdVar2.x();
                if (hfmVar2.z) {
                    hfdVar2.j(ffixVar3);
                } else {
                    hfdVar2.z();
                }
                hlc.b(hfdVar2, a7, iss.e);
                hlc.b(hfdVar2, ai3, iss.d);
                ffjm ffjmVar3 = iss.f;
                if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a8))) {
                    Integer valueOf3 = Integer.valueOf(a8);
                    hfmVar2.ad(valueOf3);
                    hfdVar2.h(valueOf3, ffjmVar3);
                }
                hlc.b(hfdVar2, b4, iss.c);
                v(dngvVar.b, null, dngvVar.e, hfdVar2, 0);
                u(dngvVar.c, null, dngvVar.e, hfdVar2, 0);
                hfdVar2.n();
                hvi k = ebs.k(hvi.e, 30.0f);
                boolean z = dngvVar.d;
                String q = q(z, hfdVar2);
                hfdVar2.v(1755171624);
                int i6 = i2 & 14;
                Object R4 = hfmVar2.R();
                if (i6 == 4 || R4 == hfc.a) {
                    R4 = new ffji() { // from class: dnfk
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ((Boolean) obj).booleanValue();
                            dngv.this.f.invoke();
                            return ffcu.a;
                        }
                    };
                    hfmVar2.ad(R4);
                }
                hfmVar2.Z();
                dmkb.b(new dmke(q, z, (ffji) R4, false), k, hfdVar2, 48, 0);
                hfdVar2.n();
                hfdVar2.n();
                hfmVar2.Z();
            }
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnfl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dngv dngvVar2 = dngv.this;
                    int i7 = i;
                    dngm.x(dngvVar2, hviVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final jlm y(String str, List list, hfd hfdVar) {
        jlm b;
        hfdVar.v(118183403);
        if (list.isEmpty()) {
            b = new jlm(str);
        } else {
            jou jouVar = new jou(gft.a(hfdVar).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
            jlj jljVar = new jlj((byte[]) null);
            jljVar.f(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dnep dnepVar = (dnep) it.next();
                if (dnepVar.c - 1 != 0) {
                    String substring = str.substring(dnepVar.a, dnepVar.b);
                    substring.getClass();
                    jljVar.a.add(new jli(new jps(substring), dnepVar.a, dnepVar.b, null, 8));
                } else {
                    jljVar.d(jouVar, dnepVar.a, dnepVar.b);
                }
            }
            b = jljVar.b();
        }
        ((hfm) hfdVar).Z();
        return b;
    }
}

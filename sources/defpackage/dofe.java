package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dofe {
    public static final float a(qgg qggVar) {
        return ((Number) qggVar.a()).floatValue();
    }

    public static final void b(final dofg dofgVar, final boolean z, final float f, hfd hfdVar, final int i) {
        doef doefVar;
        boolean z2;
        int i2 = i & 6;
        hfd b = hfdVar.b(2098216031);
        int i3 = i2 == 0 ? (true != b.D(dofgVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.A(f) ? 128 : 256;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && b.I()) {
            b.s();
        } else {
            List list = dofgVar.a;
            if (dofgVar.h.a) {
                ffmj ffmjVar = new ffmj(0, list.size() - 2);
                list = ffmjVar.a() ? ffel.a : ffdx.ak(list.subList(ffmjVar.d().intValue(), ffmjVar.c().intValue() + 1));
            }
            int size = list.size();
            int i5 = size + 1;
            hvi i6 = eba.i(hvi.e, f, 0.0f, 2);
            dxi dxiVar = dxu.a;
            int i7 = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, i6);
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
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-1843394768);
            int i9 = 0;
            for (Object obj : list) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    ffdx.l();
                }
                doef doefVar2 = (doef) obj;
                Integer num = dofgVar.b;
                if (num != null && num.intValue() == i9) {
                    doefVar = doefVar2;
                    z2 = true;
                } else {
                    doefVar = doefVar2;
                    z2 = false;
                }
                n(doefVar, z2, o(i9, i5), z, b, (i4 << 6) & 7168);
                i9 = i10;
            }
            hfmVar.Z();
            d(dofgVar.d, o(size, i5), b, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doet
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dofg dofgVar2 = dofg.this;
                    boolean z3 = z;
                    int i11 = i;
                    dofe.b(dofgVar2, z3, f, (hfd) obj2, hip.a(i11 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dofi dofiVar, final hvi hviVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-744769197);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.F(dofiVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            if (dofiVar instanceof dofg) {
                b.v(-1283303021);
                e((dofg) dofiVar, hviVar, b, i3 & 112);
                ((hfm) b).Z();
            } else {
                if (!(dofiVar instanceof dofh)) {
                    b.v(-1283304619);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(-1283300624);
                f((dofh) dofiVar, hviVar, b, i3 & 112);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doek
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dofi dofiVar2 = dofi.this;
                    int i6 = i;
                    dofe.c(dofiVar2, hviVar, (hfd) obj, hip.a(i6 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(ffix ffixVar, int i, hfd hfdVar, final int i2) {
        int i3;
        final ffix ffixVar2;
        final int i4;
        int i5 = i2 & 6;
        hfd b = hfdVar.b(57748044);
        if (i5 == 0) {
            i3 = (true != b.F(ffixVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.B(i) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
            i4 = i;
        } else {
            ffixVar2 = ffixVar;
            i4 = i;
            m(jii.a(R.string.custom_reaction_button_content_description, b), false, ffixVar2, i4, null, doeb.a, b, ((i3 << 6) & 896) | 1575984 | ((i3 << 9) & 57344), 32);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doer
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar3 = ffix.this;
                    int i6 = i2;
                    dofe.d(ffixVar3, i4, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dofg dofgVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        float f;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1166131233);
        if (i3 == 0) {
            i2 = (true != b.D(dofgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            int i4 = (i2 & 14) | 48;
            boolean z = dofgVar.h.a;
            int size = z ? dofgVar.a.size() : dofgVar.a.size() + 1;
            b.v(1040026569);
            float f2 = (size * 48.0f) + 16.0f;
            float f3 = z ? ((Configuration) b.e(AndroidCompositionLocals_androidKt.a)).screenWidthDp : f2;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            dji a = dix.a(0, b, 0, 1);
            c = dix.c(hviVar, a, false, true, false);
            b.v(1040036947);
            if (z) {
                f = 0.0f;
            } else {
                b.v(46095896);
                f = ((((Configuration) b.e(AndroidCompositionLocals_androidKt.a)).screenWidthDp - f3) / 2.0f) - 0.5f;
                if (Float.compare(f, 3.0f) <= 0 || Float.compare(f, 12.0f) >= 0) {
                    f = 12.0f;
                }
                hfmVar.Z();
            }
            hfmVar.Z();
            hvi o = ebs.o(eba.e(c, f, 12.0f), f3);
            ipn a2 = dyc.a(dofgVar.e, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, o);
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
            if (z) {
                b.v(-1555953870);
                l(dofgVar, a, f2, b, i4);
                hfmVar.Z();
            } else {
                b.v(-1555862668);
                j(dofgVar, a, f2, b, i4);
                hfmVar.Z();
            }
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doel
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dofg dofgVar2 = dofg.this;
                    int i6 = i;
                    dofe.e(dofgVar2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final dofh dofhVar, final hvi hviVar, hfd hfdVar, final int i) {
        hvi d;
        doef doefVar;
        boolean z;
        int i2 = i & 6;
        hfd b = hfdVar.b(-540195757);
        int i3 = i2 == 0 ? (true != b.D(dofhVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-2103162309);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(new jzq(0.0f), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            final jzn jznVar = (jzn) b.e(jdr.e);
            b.v(-2103157999);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                ffix ffixVar = new ffix() { // from class: doeg
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Integer.valueOf(ffmk.f(((int) ((((jzq) hho.this.a()).a - 16.0f) / 48.0f)) - 1, 0));
                    }
                };
                hqg hqgVar = hkg.a;
                hgk hgkVar = new hgk(ffixVar, null);
                hfmVar.ad(hgkVar);
                R2 = hgkVar;
            }
            hfmVar.Z();
            List ai = ffdx.ai(dofhVar.a, ((Number) ((hkx) R2).a()).intValue());
            d = ebs.d(hviVar, 1.0f);
            b.v(-2103146276);
            boolean D = b.D(jznVar);
            Object R3 = hfmVar.R();
            if (D || R3 == hfc.a) {
                R3 = new ffji() { // from class: doem
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ioc iocVar = (ioc) obj;
                        iocVar.getClass();
                        hhoVar.b(new jzq(jzn.this.ek((int) (iocVar.g() >> 32))));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            hvi e = eba.e(ipx.a(d, (ffji) R3), 8.0f, 12.0f);
            dxj dxjVar = dxu.e;
            int i4 = huo.a;
            ipn a = ebm.a(dxjVar, hum.m, b, 6);
            int a2 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b2 = huz.b(b, e);
            int i5 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-396660677);
            int i6 = 0;
            for (Object obj : ai) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    ffdx.l();
                }
                doef doefVar2 = (doef) obj;
                Integer num = dofhVar.b;
                if (num != null && num.intValue() == i6) {
                    doefVar = doefVar2;
                    z = true;
                } else {
                    doefVar = doefVar2;
                    z = false;
                }
                n(doefVar, z, 65, false, b, 3456);
                i6 = i7;
            }
            hfmVar.Z();
            d(dofhVar.c, 65, b, 48);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doen
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dofh dofhVar2 = dofh.this;
                    int i8 = i;
                    dofe.f(dofhVar2, hviVar, (hfd) obj2, hip.a(i8 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final hvi g(hvi hviVar, boolean z, hfd hfdVar, int i) {
        long j;
        hvi a;
        hfdVar.v(-747147502);
        int i2 = (z ? 1 : 0) | i;
        eql a2 = eqm.a(50);
        if (i2 != 0) {
            hviVar = hvi.e.a(new hva("com.google.android.libraries.communications.ux.components.reactionsbar.reactionsBarShadow", a2, new dofd(a2)));
        }
        hvi a3 = hxo.a(hviVar, a2);
        if (dooy.f(hfdVar)) {
            hfdVar.v(1581136730);
            j = gft.a(hfdVar).H;
            hfdVar.o();
        } else {
            hfdVar.v(1581208743);
            j = gft.a(hfdVar).n;
            hfdVar.o();
        }
        a = dee.a(a3, j, idb.a);
        hfdVar.o();
        return a;
    }

    public static final void h(final doec doecVar, final boolean z, final boolean z2, final int i, hfd hfdVar, final int i2) {
        int i3;
        boolean z3;
        hho hhoVar;
        hfd b = hfdVar.b(1745336377);
        if ((i2 & 6) == 0) {
            i3 = (true != b.D(doecVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z3 = z;
            i3 |= true != b.E(z3) ? 16 : 32;
        } else {
            z3 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.E(z2) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b.E(true) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != b.B(i) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            b.v(-310055362);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(true, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar2 = (hho) R;
            hfmVar.Z();
            qgp d = qhj.d(doecVar.a, b);
            qgg a = qfl.a(d.a(), q(hhoVar2), true, null, 0.0f, 1, b, 1573248, 952);
            m(doecVar.b, z3, doecVar.c, i, null, hpx.d(-250444528, new doev(d, a), b), b, (i3 & 112) | 1572864 | (i3 & 7168) | (i3 & 57344), 32);
            if (q(hhoVar2) && a(a) == 1.0f) {
                hhoVar = hhoVar2;
                p(hhoVar, false);
            } else {
                hhoVar = hhoVar2;
            }
            if (!q(hhoVar) && z2) {
                p(hhoVar, true);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: does
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doec doecVar2 = doec.this;
                    boolean z4 = z;
                    boolean z5 = z2;
                    dofe.h(doecVar2, z4, z5, i, (hfd) obj, hip.a(i2 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final doed doedVar, final boolean z, final int i, hfd hfdVar, final int i2) {
        int i3;
        hfd b = hfdVar.b(598836881);
        if ((i2 & 6) == 0) {
            i3 = (true != b.D(doedVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.E(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.E(true) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b.B(i) ? 1024 : 2048;
        }
        if ((i3 & 1171) != 1170 || !b.I()) {
            throw null;
        }
        b.s();
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doeq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doed doedVar2 = doed.this;
                    boolean z2 = z;
                    int i4 = i2;
                    dofe.i(doedVar2, z2, i, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final dofg dofgVar, final dji djiVar, final float f, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-815497695);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dofgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(8.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(djiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            hvi o = ebs.o(hvi.e, f);
            int i3 = huo.a;
            ipn a = dyc.a(hum.e, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, o);
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
            hlc.b(b, b2, iss.c);
            b.v(-2057120244);
            hvi g = g(hvi.e, false, b, 1);
            hfmVar.Z();
            hvi i5 = eba.i(g, true == dofgVar.h.a ? 0.0f : 8.0f, 0.0f, 2);
            ipn a3 = dyc.a(hum.a, false);
            int a4 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, i5);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
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
            b.v(-1241425327);
            Object R = hfmVar.R();
            Object obj = R;
            if (R == hfc.a) {
                czq czqVar = new czq(false);
                czqVar.d(true);
                hfmVar.ad(czqVar);
                obj = czqVar;
            }
            hfmVar.Z();
            b.v(1710547341);
            cue j = ctt.j(cxu.c(310, 0, null, 6), hum.k, 12);
            hfmVar.Z();
            cru.a((czq) obj, null, j, null, null, hpx.d(493306173, new doew(dofgVar, djiVar), b), b, 196608, 26);
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doeu
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dofg dofgVar2 = dofg.this;
                    dji djiVar2 = djiVar;
                    int i6 = i;
                    dofe.j(dofgVar2, djiVar2, f, (hfd) obj2, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(final doee doeeVar, boolean z, int i, hfd hfdVar, final int i2) {
        int i3;
        final boolean z2;
        final int i4;
        hfd b = hfdVar.b(-1266063681);
        if ((i2 & 6) == 0) {
            i3 = (true != b.D(doeeVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.E(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.E(true) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b.B(i) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
            z2 = z;
            i4 = i;
        } else {
            int i5 = i3 & 112;
            int i6 = i3 << 3;
            z2 = z;
            i4 = i;
            m(doeeVar.b, z2, doeeVar.c, i4, Float.valueOf(30.0f), hpx.d(-562594282, new doex(doeeVar), b), b, i5 | 1769472 | (i6 & 7168) | (i6 & 57344), 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doei
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doee doeeVar2 = doee.this;
                    boolean z3 = z2;
                    int i7 = i2;
                    dofe.k(doeeVar2, z3, i4, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final dofg dofgVar, final dji djiVar, final float f, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1952081288);
        if (i3 == 0) {
            i2 = (true != b.D(dofgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(8.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(djiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            c = dix.c(hvi.e, dix.a(0, b, 0, 1), false, true, false);
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            int i4 = huo.a;
            ipn a = ebm.a(dxnVar, hum.m, b, 6);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c);
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
            ebr ebrVar = ebr.a;
            ebv.a(hvi.e, b);
            j(dofgVar, djiVar, f, b, i2 & 8190);
            b.v(-1796572293);
            Object R = hfmVar.R();
            Object obj = R;
            if (R == hfc.a) {
                czq czqVar = new czq(false);
                czqVar.d(true);
                hfmVar.ad(czqVar);
                obj = czqVar;
            }
            hfmVar.Z();
            b.v(-1629954327);
            cue n = ctt.n(cxu.c(210, 100, null, 4), 0.0f, 0L, 6);
            hfmVar.Z();
            cru.i(ebrVar, (czq) obj, null, n, null, null, hpx.d(-1356878148, new doey(dofgVar), b), b, 1572870);
            ebv.a(ebs.o(hvi.e, 4.0f), b);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doej
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dofg dofgVar2 = dofg.this;
                    dji djiVar2 = djiVar;
                    int i6 = i;
                    dofe.l(dofgVar2, djiVar2, f, (hfd) obj2, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final java.lang.String r26, boolean r27, defpackage.ffix r28, int r29, java.lang.Float r30, final defpackage.ffjn r31, defpackage.hfd r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dofe.m(java.lang.String, boolean, ffix, int, java.lang.Float, ffjn, hfd, int, int):void");
    }

    public static final void n(final doef doefVar, boolean z, int i, boolean z2, hfd hfdVar, final int i2) {
        int i3;
        boolean z3;
        final int i4;
        final boolean z4;
        hfd b = hfdVar.b(-1662958543);
        if ((i2 & 6) == 0) {
            i3 = (true != b.D(doefVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.E(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.B(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b.E(z2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != b.E(true) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && b.I()) {
            b.s();
            z3 = z2;
            i4 = i;
            z4 = z;
        } else if (doefVar instanceof doec) {
            b.v(-1312107145);
            int i5 = i3 >> 3;
            z3 = z2;
            h((doec) doefVar, z, z3, i, b, (i3 & 112) | (i5 & 896) | (i5 & 7168) | ((i3 << 6) & 57344));
            z4 = z;
            i4 = i;
            ((hfm) b).Z();
        } else {
            z3 = z2;
            i4 = i;
            z4 = z;
            if (doefVar instanceof doed) {
                b.v(-1311795316);
                i((doed) doefVar, z4, i4, b, ((i3 << 3) & 7168) | (i3 & 112) | ((i3 >> 6) & 896));
                ((hfm) b).Z();
            } else {
                if (!(doefVar instanceof doee)) {
                    b.v(-42327270);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(-1311532374);
                k((doee) doefVar, z4, i4, b, ((i3 << 3) & 7168) | (i3 & 112) | ((i3 >> 6) & 896));
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            final boolean z5 = z3;
            L.d = new ffjm() { // from class: doeh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doef doefVar2 = doef.this;
                    boolean z6 = z4;
                    int i6 = i4;
                    dofe.n(doefVar2, z6, i6, z5, (hfd) obj, hip.a(i2 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final int o(int i, int i2) {
        int abs;
        if (i2 % 2 == 0) {
            int i3 = i2 / 2;
            abs = Math.min(Math.abs(i - i3), Math.abs(i - (i3 - 1)));
        } else {
            abs = (int) Math.abs(i - Math.floor(i2 / 2.0d));
        }
        return (abs * 65) + 25;
    }

    private static final void p(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    private static final boolean q(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }
}

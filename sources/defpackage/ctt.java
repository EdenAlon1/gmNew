package defpackage;

import androidx.compose.animation.EnterExitTransitionElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctt {
    public static final dac b;
    public static final dac c;
    private static final dbv d = new dbw(csv.a, csw.a);
    public static final dac a = cxu.b(0.0f, 400.0f, null, 5);

    static {
        iam iamVar = ddh.a;
        b = cxu.b(0.0f, 400.0f, new kaa(4294967297L), 1);
        c = cxu.b(0.0f, 400.0f, new kaf(4294967297L), 1);
    }

    public static final cue a(cyq cyqVar, huo huoVar, boolean z, ffji ffjiVar) {
        return new cuf(new cxe(null, null, new csd(huoVar, ffjiVar, cyqVar, z), null, false, null, 59));
    }

    public static final cue b(cyq cyqVar, float f) {
        return new cuf(new cxe(new cui(f, cyqVar), null, null, null, false, null, 62));
    }

    public static final cue c(cyq cyqVar, float f, long j) {
        return new cuf(new cxe(null, null, null, new cup(f, j, cyqVar), false, null, 55));
    }

    public static final cue d(cyq cyqVar, ffji ffjiVar) {
        return new cuf(new cxe(null, new cxa(ffjiVar, cyqVar), null, null, false, null, 61));
    }

    public static final cue e(cyq cyqVar, ffji ffjiVar) {
        return d(cyqVar, new ctr(ffjiVar));
    }

    public static final cug f(cyq cyqVar, float f, long j) {
        return new cuh(new cxe(null, null, null, new cup(f, j, cyqVar), false, null, 55));
    }

    public static final cug g(cyq cyqVar, huo huoVar, boolean z, ffji ffjiVar) {
        return new cuh(new cxe(null, null, new csd(huoVar, ffjiVar, cyqVar, z), null, false, null, 59));
    }

    public static final cug h(cyq cyqVar, ffji ffjiVar) {
        return new cuh(new cxe(null, new cxa(new cts(ffjiVar), cyqVar), null, null, false, null, 61));
    }

    public static final hvi i(dbe dbeVar, cue cueVar, cug cugVar, ffix ffixVar, String str, hfd hfdVar, int i, int i2) {
        das dasVar;
        das dasVar2;
        das dasVar3;
        csd csdVar;
        int i3;
        das dasVar4;
        das dasVar5;
        das dasVar6;
        das dasVar7;
        das dasVar8;
        cug cugVar2;
        cue cueVar2;
        ffix ffixVar2 = (i2 & 4) != 0 ? cte.a : ffixVar;
        int i4 = i & 14;
        boolean z = (((i & 14) ^ 6) > 4 && hfdVar.D(dbeVar)) || (i & 6) == 4;
        Object f = hfdVar.f();
        if (z || f == hfc.a) {
            f = new hic(cueVar, hla.a);
            hfdVar.y(f);
        }
        hho hhoVar = (hho) f;
        if (dbeVar.e() == dbeVar.f() && dbeVar.e() == cst.b) {
            if (dbeVar.t()) {
                x(hhoVar, cueVar);
            } else {
                x(hhoVar, cue.a);
            }
        } else if (dbeVar.f() == cst.b) {
            x(hhoVar, u(hhoVar).a(cueVar));
        }
        cue u = u(hhoVar);
        int i5 = i >> 3;
        int i6 = (i5 & 112) | i4;
        boolean z2 = (((i6 & 14) ^ 6) > 4 && hfdVar.D(dbeVar)) || (i6 & 6) == 4;
        Object f2 = hfdVar.f();
        if (z2 || f2 == hfc.a) {
            f2 = new hic(cugVar, hla.a);
            hfdVar.y(f2);
        }
        hho hhoVar2 = (hho) f2;
        if (dbeVar.e() == dbeVar.f() && dbeVar.e() == cst.b) {
            if (dbeVar.t()) {
                y(hhoVar2, cugVar);
            } else {
                y(hhoVar2, cug.a);
            }
        } else if (dbeVar.f() != cst.b) {
            y(hhoVar2, v(hhoVar2).a(cugVar));
        }
        cug v = v(hhoVar2);
        boolean z3 = (u.b().b == null && v.b().b == null) ? false : true;
        boolean z4 = (u.b().c == null && v.b().c == null) ? false : true;
        if (z3) {
            int i7 = i4 | 384;
            hfdVar.v(-821159459);
            dbv dbvVar = dcp.g;
            Object f3 = hfdVar.f();
            if (f3 == hfc.a) {
                f3 = str.concat(" slide");
                hfdVar.y(f3);
            }
            dasVar = dbs.g(dbeVar, dbvVar, hfdVar, i7);
            hfdVar.o();
        } else {
            hfdVar.v(-821053656);
            hfdVar.o();
            dasVar = null;
        }
        if (z4) {
            int i8 = i4 | 384;
            hfdVar.v(-820961865);
            dbv dbvVar2 = dcp.h;
            Object f4 = hfdVar.f();
            if (f4 == hfc.a) {
                f4 = str.concat(" shrink/expand");
                hfdVar.y(f4);
            }
            dasVar2 = dbs.g(dbeVar, dbvVar2, hfdVar, i8);
            hfdVar.o();
        } else {
            hfdVar.v(-820851041);
            hfdVar.o();
            dasVar2 = null;
        }
        if (z4) {
            int i9 = i4 | 384;
            hfdVar.v(-820777446);
            dbv dbvVar3 = dcp.g;
            Object f5 = hfdVar.f();
            if (f5 == hfc.a) {
                f5 = str.concat(" InterruptionHandlingOffset");
                hfdVar.y(f5);
            }
            das g = dbs.g(dbeVar, dbvVar3, hfdVar, i9);
            hfdVar.o();
            dasVar3 = g;
        } else {
            hfdVar.v(-820608001);
            hfdVar.o();
            dasVar3 = null;
        }
        csd csdVar2 = u.b().c;
        boolean z5 = ((csdVar2 == null || csdVar2.d) && ((csdVar = v.b().c) == null || csdVar.d) && z4) ? false : true;
        int i10 = i5 & 7168;
        boolean z6 = (u.b().a == null && v.b().a == null) ? false : true;
        boolean z7 = (u.b().d == null && v.b().d == null) ? false : true;
        int i11 = i10 | i4;
        int i12 = i11 & 14;
        if (z6) {
            int i13 = i12 | 384;
            hfdVar.v(-675026101);
            dbv dbvVar4 = dcp.a;
            i3 = i11;
            Object f6 = hfdVar.f();
            dasVar4 = dasVar;
            if (f6 == hfc.a) {
                f6 = str.concat(" alpha");
                hfdVar.y(f6);
            }
            dasVar5 = dbs.g(dbeVar, dbvVar4, hfdVar, i13);
            hfdVar.o();
        } else {
            i3 = i11;
            dasVar4 = dasVar;
            hfdVar.v(-674857617);
            hfdVar.o();
            dasVar5 = null;
        }
        if (z7) {
            int i14 = i12 | 384;
            hfdVar.v(-674790005);
            dbv dbvVar5 = dcp.a;
            Object f7 = hfdVar.f();
            dasVar6 = dasVar2;
            if (f7 == hfc.a) {
                f7 = str.concat(" scale");
                hfdVar.y(f7);
            }
            dasVar7 = dbs.g(dbeVar, dbvVar5, hfdVar, i14);
            hfdVar.o();
        } else {
            dasVar6 = dasVar2;
            hfdVar.v(-674621521);
            hfdVar.o();
            dasVar7 = null;
        }
        if (z7) {
            hfdVar.v(-674543896);
            das g2 = dbs.g(dbeVar, d, hfdVar, i12 | 384);
            hfdVar.o();
            dasVar8 = g2;
        } else {
            hfdVar.v(-674372529);
            hfdVar.o();
            dasVar8 = null;
        }
        boolean F = (((i12 ^ 6) > 4 && hfdVar.D(dbeVar)) || (i3 & 6) == 4) | hfdVar.F(dasVar5) | hfdVar.D(u) | hfdVar.D(v) | hfdVar.F(dasVar7) | hfdVar.F(dasVar8);
        Object f8 = hfdVar.f();
        if (F || f8 == hfc.a) {
            Object csuVar = new csu(dasVar5, dasVar7, dbeVar, u, v, dasVar8);
            cugVar2 = v;
            cueVar2 = u;
            hfdVar.y(csuVar);
            f8 = csuVar;
        } else {
            cueVar2 = u;
            cugVar2 = v;
        }
        csu csuVar2 = (csu) f8;
        hve hveVar = hvi.e;
        boolean E = hfdVar.E(z5) | ((((i & 7168) ^ 3072) > 2048 && hfdVar.D(ffixVar2)) || (i & 3072) == 2048);
        Object f9 = hfdVar.f();
        if (E || f9 == hfc.a) {
            f9 = new ctf(z5, ffixVar2);
            hfdVar.y(f9);
        }
        return icf.a(hveVar, (ffji) f9).a(new EnterExitTransitionElement(dbeVar, dasVar6, dasVar3, dasVar4, cueVar2, cugVar2, ffixVar2, csuVar2));
    }

    public static /* synthetic */ cue j(cyq cyqVar, hun hunVar, int i) {
        if ((i & 1) != 0) {
            iam iamVar = ddh.a;
            cyqVar = cxu.b(0.0f, 400.0f, new kaf(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            int i2 = huo.a;
            hunVar = hum.l;
        }
        return a(cyqVar, w(hunVar), (i & 4) != 0, new cth(ctg.a));
    }

    public static /* synthetic */ cue k(cyq cyqVar, hus husVar, int i) {
        if ((i & 1) != 0) {
            iam iamVar = ddh.a;
            cyqVar = cxu.b(0.0f, 400.0f, new kaf(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            int i2 = huo.a;
            husVar = hum.o;
        }
        return a(cyqVar, z(husVar), (i & 4) != 0, new ctk(ctj.a));
    }

    public static /* synthetic */ cue l(cyq cyqVar, int i) {
        if ((i & 1) != 0) {
            cyqVar = cxu.b(0.0f, 400.0f, null, 5);
        }
        return b(cyqVar, 0.0f);
    }

    public static /* synthetic */ cug m(cyq cyqVar, int i) {
        if ((i & 1) != 0) {
            cyqVar = cxu.b(0.0f, 400.0f, null, 5);
        }
        return new cuh(new cxe(new cui(0.0f, cyqVar), null, null, null, false, null, 62));
    }

    public static /* synthetic */ cue n(cyq cyqVar, float f, long j, int i) {
        if ((i & 1) != 0) {
            cyqVar = cxu.b(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = idr.a;
        }
        return c(cyqVar, f, j);
    }

    public static /* synthetic */ cug o(cyq cyqVar, float f, long j, int i) {
        if ((i & 1) != 0) {
            cyqVar = cxu.b(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = idr.a;
        }
        return f(cyqVar, f, j);
    }

    public static /* synthetic */ cug p(cyq cyqVar, hun hunVar, int i) {
        if ((i & 1) != 0) {
            iam iamVar = ddh.a;
            cyqVar = cxu.b(0.0f, 400.0f, new kaf(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            int i2 = huo.a;
            hunVar = hum.l;
        }
        return g(cyqVar, w(hunVar), (i & 4) != 0, new ctm(ctl.a));
    }

    public static /* synthetic */ cug q(cyq cyqVar, hus husVar, int i) {
        if ((i & 1) != 0) {
            iam iamVar = ddh.a;
            cyqVar = cxu.b(0.0f, 400.0f, new kaf(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            int i2 = huo.a;
            husVar = hum.o;
        }
        return g(cyqVar, z(husVar), (i & 4) != 0, new ctp(cto.a));
    }

    public static /* synthetic */ cue r(ffji ffjiVar) {
        iam iamVar = ddh.a;
        return e(cxu.b(0.0f, 400.0f, new kaa(4294967297L), 1), ffjiVar);
    }

    public static /* synthetic */ cue s(cyq cyqVar, huo huoVar, int i) {
        if ((i & 1) != 0) {
            iam iamVar = ddh.a;
            cyqVar = cxu.b(0.0f, 400.0f, new kaf(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            int i2 = huo.a;
            huoVar = hum.i;
        }
        return a(cyqVar, huoVar, (i & 4) != 0, cti.a);
    }

    public static /* synthetic */ cug t(cyq cyqVar, huo huoVar, int i) {
        if ((i & 1) != 0) {
            iam iamVar = ddh.a;
            cyqVar = cxu.b(0.0f, 400.0f, new kaf(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            int i2 = huo.a;
            huoVar = hum.i;
        }
        return g(cyqVar, huoVar, (i & 4) != 0, ctn.a);
    }

    private static final cue u(hho hhoVar) {
        return (cue) hhoVar.a();
    }

    private static final cug v(hho hhoVar) {
        return (cug) hhoVar.a();
    }

    private static final huo w(hun hunVar) {
        int i = huo.a;
        return ffkj.e(hunVar, hum.j) ? hum.d : ffkj.e(hunVar, hum.l) ? hum.f : hum.e;
    }

    private static final void x(hho hhoVar, cue cueVar) {
        hhoVar.b(cueVar);
    }

    private static final void y(hho hhoVar, cug cugVar) {
        hhoVar.b(cugVar);
    }

    private static final huo z(hus husVar) {
        int i = huo.a;
        return ffkj.e(husVar, hum.m) ? hum.b : ffkj.e(husVar, hum.o) ? hum.h : hum.e;
    }
}

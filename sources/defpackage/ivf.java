package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivf {
    public final iui a;
    public boolean c;
    public boolean d;
    public jzk h;
    public final itd b = new itd();
    public final iws e = new iws();
    public final hne f = new hne(new iww[16]);
    public final hne g = new hne(new ive[16]);
    public final iup i = null;

    public ivf(iui iuiVar) {
        this.a = iuiVar;
    }

    public static final boolean l(iui iuiVar, jzk jzkVar) {
        if (iuiVar.k == null) {
            return false;
        }
        boolean ar = jzkVar != null ? iuiVar.ar(jzkVar) : iuiVar.ar(iuiVar.y.c());
        iui u = iuiVar.u();
        if (ar && u != null) {
            if (u.k == null) {
                iui.az(u, false, 3);
                return ar;
            }
            if (iuiVar.aF() == 1) {
                iui.ax(u, false, 3);
                return ar;
            }
            if (iuiVar.aF() == 2) {
                u.ad(false);
                return true;
            }
        }
        return ar;
    }

    public static final boolean m(iui iuiVar, jzk jzkVar) {
        boolean as = jzkVar != null ? iuiVar.as(jzkVar) : iuiVar.as(iuiVar.y.b());
        iui u = iuiVar.u();
        if (as && u != null) {
            if (iuiVar.aE() == 1) {
                iui.az(u, false, 3);
                return as;
            }
            if (iuiVar.aE() == 2) {
                u.ae(false);
                return true;
            }
        }
        return as;
    }

    public static final boolean n(iui iuiVar) {
        return iuiVar.ao() && s(iuiVar);
    }

    public static final boolean o(iui iuiVar) {
        return iuiVar.an() && t(iuiVar);
    }

    private final void p(iui iuiVar, boolean z) {
        hne s = iuiVar.s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar2 = (iui) objArr[i2];
            if ((!z && s(iuiVar2)) || (z && t(iuiVar2))) {
                if (iuo.a(iuiVar2) && !z) {
                    if (iuiVar2.an() && this.b.b(iuiVar2, true)) {
                        r(iuiVar2, true, false);
                    } else {
                        e(iuiVar2, true);
                    }
                }
                q(iuiVar2, z);
                if (!u(iuiVar2, z)) {
                    p(iuiVar2, z);
                }
            }
        }
        q(iuiVar, z);
    }

    private final void q(iui iuiVar, boolean z) {
        if (u(iuiVar, z) && this.b.b(iuiVar, z)) {
            r(iuiVar, z, false);
        }
    }

    private final boolean r(iui iuiVar, boolean z, boolean z2) {
        jzk jzkVar;
        boolean z3;
        iqj iqfVar;
        iui u;
        ivd ivdVar;
        isa isaVar;
        if (iuiVar.D) {
            return false;
        }
        if (!iuiVar.g() && !iuiVar.ap() && !n(iuiVar) && !ffkj.e(iuiVar.D(), true) && !o(iuiVar)) {
            iun iunVar = iuiVar.y;
            if (!iunVar.o.w.j() && ((ivdVar = iunVar.p) == null || (isaVar = ivdVar.p) == null || !isaVar.j())) {
                return false;
            }
        }
        if (iuiVar == this.a) {
            jzkVar = this.h;
            jzkVar.getClass();
        } else {
            jzkVar = null;
        }
        if (z) {
            z3 = iuiVar.an() ? l(iuiVar, jzkVar) : false;
            if (z2 && ((z3 || iuiVar.am()) && ffkj.e(iuiVar.D(), true))) {
                iuiVar.U();
            }
        } else {
            boolean m = iuiVar.ao() ? m(iuiVar, jzkVar) : false;
            if (z2 && iuiVar.al() && (iuiVar == this.a || ((u = iuiVar.u()) != null && u.g() && iuiVar.ap()))) {
                if (iuiVar == this.a) {
                    if (iuiVar.E == 3) {
                        iuiVar.L();
                    }
                    iui u2 = iuiVar.u();
                    if (u2 == null || (iqfVar = u2.y().l) == null) {
                        iwx a = ium.a(iuiVar);
                        ffji ffjiVar = iqm.a;
                        iqfVar = new iqf(a);
                    }
                    iqj.m(iqfVar, iuiVar.x(), 0, 0);
                } else {
                    iuiVar.ac();
                }
                this.e.b(iuiVar);
                ((AndroidComposeView) ium.a(iuiVar)).k.c(iuiVar);
            }
            z3 = m;
        }
        c();
        return z3;
    }

    private static final boolean s(iui iuiVar) {
        return iuiVar.aE() == 1 || iuiVar.y.o.w.j();
    }

    private static final boolean t(iui iuiVar) {
        isa isaVar;
        if (iuiVar.aF() == 1) {
            return true;
        }
        ivd ivdVar = iuiVar.y.p;
        return (ivdVar == null || (isaVar = ivdVar.p) == null || !isaVar.j()) ? false : true;
    }

    private static final boolean u(iui iuiVar, boolean z) {
        return z ? iuiVar.an() : iuiVar.ao();
    }

    public final void a() {
        hne hneVar = this.f;
        Object[] objArr = hneVar.a;
        int i = hneVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((iww) objArr[i2]).ev();
        }
        this.f.g();
    }

    public final void b(boolean z) {
        if (z) {
            iws iwsVar = this.e;
            iui iuiVar = this.a;
            iwsVar.a.g();
            iwsVar.a.n(iuiVar);
            iuiVar.C = true;
        }
        iws iwsVar2 = this.e;
        iwsVar2.a.j(iwr.a);
        int i = iwsVar2.a.b;
        iui[] iuiVarArr = iwsVar2.b;
        if (iuiVarArr == null || iuiVarArr.length < i) {
            iuiVarArr = new iui[Math.max(16, i)];
        }
        iwsVar2.b = null;
        for (int i2 = 0; i2 < i; i2++) {
            iuiVarArr[i2] = (iui) iwsVar2.a.a[i2];
        }
        iwsVar2.a.g();
        while (true) {
            i--;
            if (i < 0) {
                iwsVar2.b = iuiVarArr;
                return;
            }
            iui iuiVar2 = iuiVarArr[i];
            iuiVar2.getClass();
            if (iuiVar2.C) {
                iwsVar2.a(iuiVar2);
            }
        }
    }

    public final void c() {
        hne hneVar = this.g;
        int i = hneVar.b;
        if (i != 0) {
            Object[] objArr = hneVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                ive iveVar = (ive) objArr[i2];
                if (iveVar.a.e()) {
                    if (iveVar.b) {
                        iui.ax(iveVar.a, iveVar.c, 2);
                    } else {
                        iui.az(iveVar.a, iveVar.c, 2);
                    }
                }
            }
            this.g.g();
        }
    }

    public final void d(iui iuiVar) {
        hne s = iuiVar.s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar2 = (iui) objArr[i2];
            if (ffkj.e(iuiVar2.D(), true) && !iuiVar2.D) {
                if (this.b.b(iuiVar2, true)) {
                    iuiVar2.U();
                }
                d(iuiVar2);
            }
        }
    }

    public final void e(iui iuiVar, boolean z) {
        if (this.b.c(z)) {
            return;
        }
        if (!this.c) {
            imn.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (u(iuiVar, z)) {
            imn.b("node not yet measured");
        }
        p(iuiVar, z);
    }

    public final void f(iui iuiVar) {
        hne s = iuiVar.s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar2 = (iui) objArr[i2];
            if (s(iuiVar2)) {
                if (iuo.a(iuiVar2)) {
                    g(iuiVar2, true);
                } else {
                    f(iuiVar2);
                }
            }
        }
    }

    public final void g(iui iuiVar, boolean z) {
        jzk jzkVar;
        if (iuiVar.D) {
            return;
        }
        if (iuiVar == this.a) {
            jzkVar = this.h;
            jzkVar.getClass();
        } else {
            jzkVar = null;
        }
        if (z) {
            l(iuiVar, jzkVar);
        } else {
            m(iuiVar, jzkVar);
        }
    }

    public final boolean h() {
        return this.b.d();
    }

    public final boolean i(ffix ffixVar) {
        boolean z;
        if (!this.a.e()) {
            imn.b("performMeasureAndLayout called with unattached root");
        }
        if (!this.a.g()) {
            imn.b("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            imn.b("performMeasureAndLayout called during measure layout");
        }
        boolean z2 = false;
        if (this.h != null) {
            this.c = true;
            this.d = true;
            try {
                if (this.b.d()) {
                    itd itdVar = this.b;
                    z = false;
                    while (itdVar.d()) {
                        boolean d = itdVar.a.d();
                        boolean z3 = !d;
                        iui a = (!d ? itdVar.a : itdVar.b).a();
                        boolean r = r(a, z3, true);
                        if (a == this.a && r) {
                            z = true;
                        }
                    }
                    if (ffixVar != null) {
                        ffixVar.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
                z2 = z;
            } finally {
            }
        }
        a();
        return z2;
    }

    public final boolean j(iui iuiVar, boolean z) {
        int aD = iuiVar.aD();
        int i = aD - 1;
        if (aD == 0) {
            throw null;
        }
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                this.g.n(new ive(iuiVar, false, z));
            } else {
                if (i != 4) {
                    throw new ffcd();
                }
                if (!iuiVar.ao() || z) {
                    iuiVar.X();
                    if (!iuiVar.D && (iuiVar.g() || n(iuiVar))) {
                        iui u = iuiVar.u();
                        if (u == null || !u.ao()) {
                            this.b.a(iuiVar, false);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

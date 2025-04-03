package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class axv {
    private bhh b;
    private bhh c;
    private bhh d;
    private bct e;
    public bhh k;
    public bgr l;
    public Rect m;
    public atd o;
    public final Set j = new HashSet();
    private final Object a = new Object();
    public int r = 2;
    public Matrix n = new Matrix();
    public bgk p = bgk.d();
    public bgk q = bgk.d();

    protected axv(bhh bhhVar) {
        this.c = bhhVar;
        this.k = bhhVar;
    }

    protected final int A(bct bctVar) {
        return B(bctVar, false);
    }

    protected final int B(bct bctVar, boolean z) {
        int c = bctVar.f().c(C());
        return (bctVar.H() || !z) ? c : bix.b(-c);
    }

    public final int C() {
        return ((bet) this.k).B(0);
    }

    public final Size D() {
        bgr bgrVar = this.l;
        if (bgrVar != null) {
            return bgrVar.c();
        }
        return null;
    }

    public final bcm E() {
        synchronized (this.a) {
            bct bctVar = this.e;
            if (bctVar == null) {
                return bcm.m;
            }
            return bctVar.e();
        }
    }

    public final bct F() {
        bct bctVar;
        synchronized (this.a) {
            bctVar = this.e;
        }
        return bctVar;
    }

    public final bhh G(bcq bcqVar, bhh bhhVar, bhh bhhVar2) {
        bfh a;
        if (bhhVar2 != null) {
            a = bfh.b(bhhVar2);
            a.e(bli.m);
        } else {
            a = bfh.a();
        }
        if ((this.c.s(bet.E) || this.c.s(bet.I)) && a.s(bet.M)) {
            a.e(bet.M);
        }
        if (this.c.s(bet.M) && a.s(bet.K) && ((boy) this.c.l(bet.M)).b != null) {
            a.e(bet.K);
        }
        Iterator it = this.c.r().iterator();
        while (it.hasNext()) {
            bdm.b(a, a, this.c, (bdn) it.next());
        }
        if (bhhVar != null) {
            for (bdn bdnVar : bhhVar.r()) {
                if (!bdnVar.c().equals(((bbf) bli.m).a)) {
                    bdm.b(a, a, bhhVar, bdnVar);
                }
            }
        }
        if (a.s(bet.I) && a.s(bet.E)) {
            a.e(bet.E);
        }
        if (a.s(bet.M)) {
        }
        return g(bcqVar, e(a));
    }

    protected final String H() {
        bct F = F();
        toString();
        ksw.i(F, "No camera attached to use case: ".concat(toString()));
        return F.f().k();
    }

    public final String I() {
        String p = this.k.p("<UnknownUseCase-" + hashCode() + ">");
        p.getClass();
        return p;
    }

    protected final void J(bgc bgcVar, bgr bgrVar) {
        if (!bgr.g.equals(bgrVar.a())) {
            bgcVar.q(bgrVar.a());
            return;
        }
        synchronized (this.a) {
            bct bctVar = this.e;
            ksw.h(bctVar);
            List c = bctVar.f().g().c(AeFpsRangeQuirk.class);
            boolean z = true;
            if (c.size() > 1) {
                z = false;
            }
            ksw.b(z, "There should not have more than one AeFpsRangeQuirk.");
            if (!c.isEmpty()) {
                bgcVar.q(((AeFpsRangeQuirk) c.get(0)).a());
            }
        }
    }

    protected final void K() {
        this.r = 1;
        M();
    }

    public final void L() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((axu) it.next()).w(this);
        }
    }

    public final void M() {
        int i = this.r;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((axu) it.next()).u(this);
            }
        } else {
            if (i2 != 1) {
                return;
            }
            Iterator it2 = this.j.iterator();
            while (it2.hasNext()) {
                ((axu) it2.next()).v(this);
            }
        }
    }

    public final void O(atd atdVar) {
        boolean z = true;
        if (atdVar != null && !S(atdVar.a)) {
            z = false;
        }
        ksw.a(z);
        this.o = atdVar;
    }

    public final void P(bct bctVar) {
        j();
        synchronized (this.a) {
            bct bctVar2 = this.e;
            if (bctVar == bctVar2) {
                this.j.remove(bctVar2);
                this.e = null;
            }
        }
        this.l = null;
        this.m = null;
        this.k = this.c;
        this.b = null;
        this.d = null;
    }

    public final void Q(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.p = (bgk) list.get(0);
        if (list.size() > 1) {
            this.q = (bgk) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (bdy bdyVar : ((bgk) it.next()).f()) {
                if (bdyVar.n == null) {
                    bdyVar.n = getClass();
                }
            }
        }
    }

    public final void R(bgr bgrVar, bgr bgrVar2) {
        p(bgrVar, null);
        this.l = bgrVar;
    }

    public final boolean S(int i) {
        Iterator it = af().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if ((i & intValue) == intValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean T(bct bctVar) {
        int z = z();
        if (z == -1 || z == 0) {
            return false;
        }
        if (z == 1) {
            return true;
        }
        if (z == 2) {
            return bctVar.I();
        }
        throw new AssertionError(a.h(z, "Unknown mirrorMode: "));
    }

    public final boolean U(int i) {
        Size N;
        int B = ((bet) this.k).B(-1);
        if (B != -1 && B == i) {
            return false;
        }
        bhg e = e(this.c);
        bet betVar = (bet) e.c();
        int B2 = betVar.B(-1);
        if (B2 == -1 || B2 != i) {
            ((bes) e).h(i);
        }
        if (B2 != -1 && B2 != i) {
            if (Math.abs(bhp.b(i) - bhp.b(B2)) % 180 == 90 && (N = betVar.N()) != null) {
                ((bes) e).g(new Size(N.getHeight(), N.getWidth()));
            }
        }
        this.c = e.c();
        bct F = F();
        if (F == null) {
            this.k = this.c;
            return true;
        }
        this.k = G(F.f(), this.b, this.d);
        return true;
    }

    public final void V(bct bctVar, bhh bhhVar, bhh bhhVar2) {
        synchronized (this.a) {
            this.e = bctVar;
            this.j.add(bctVar);
        }
        this.b = bhhVar;
        this.d = bhhVar2;
        this.k = G(bctVar.f(), this.b, this.d);
        ag();
    }

    public final void W() {
        synchronized (this.a) {
        }
    }

    protected Set af() {
        return Collections.EMPTY_SET;
    }

    public bgr d(bdp bdpVar) {
        throw null;
    }

    public abstract bhg e(bdp bdpVar);

    public abstract bhh f(boolean z, bhl bhlVar);

    protected bhh g(bcq bcqVar, bhg bhgVar) {
        throw null;
    }

    public void k(Matrix matrix) {
        this.n = new Matrix(matrix);
    }

    public void l(Rect rect) {
        this.m = rect;
    }

    protected void p(bgr bgrVar, bgr bgrVar2) {
        throw null;
    }

    protected final int x() {
        return ((bet) this.k).F();
    }

    public final int y() {
        return this.k.a();
    }

    protected final int z() {
        return ((bet) this.k).K();
    }

    public void N() {
    }

    public void ag() {
    }

    public void ah() {
    }

    public void j() {
    }

    public void q() {
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mil {
    public final mig a;
    public final int b;
    public final mig c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public mil(mig migVar, mig migVar2, int i) {
        this.a = migVar;
        this.b = i;
        this.c = migVar2;
    }

    public static boolean o(mig migVar) {
        return migVar.eK() != 0;
    }

    public static lqc[] q(mxf mxfVar) {
        int d = mxfVar != null ? mxfVar.d() : 0;
        lqc[] lqcVarArr = new lqc[d];
        for (int i = 0; i < d; i++) {
            lti.f(mxfVar);
            lqcVarArr[i] = mxfVar.e(i);
        }
        return lqcVarArr;
    }

    public static final void r(mig migVar) {
        if (migVar.eK() == 2) {
            migVar.L();
        }
    }

    public static final void s(mig migVar, long j) {
        migVar.G();
        if (migVar instanceof mvz) {
            mvz mvzVar = (mvz) migVar;
            lti.c(mvzVar.g);
            mvzVar.j = j;
        }
    }

    private final boolean t() {
        int i = this.d;
        return i == 2 || i == 4;
    }

    private final boolean u() {
        return this.d == 3;
    }

    public final int a() {
        mig migVar = this.c;
        boolean o = o(this.a);
        int i = 0;
        if (migVar != null && o(migVar)) {
            i = 1;
        }
        return (o ? 1 : 0) + i;
    }

    public final int b() {
        return this.a.eL();
    }

    public final int c(mig migVar, mhe mheVar, mxm mxmVar, mei meiVar) {
        if (migVar == null || !o(migVar) || ((migVar == this.a && t()) || (migVar == this.c && u()))) {
            return 1;
        }
        mvc n = migVar.n();
        mvc[] mvcVarArr = mheVar.c;
        int i = this.b;
        mvc mvcVar = mvcVarArr[i];
        boolean b = mxmVar.b(i);
        if (b && n == mvcVar) {
            return 1;
        }
        if (!migVar.N()) {
            lqc[] q = q(mxmVar.c[this.b]);
            mvc mvcVar2 = mheVar.c[this.b];
            lti.f(mvcVar2);
            migVar.D(q, mvcVar2, mheVar.d(), mheVar.l, mheVar.g.a);
            return 3;
        }
        if (!migVar.T()) {
            return 0;
        }
        e(migVar, meiVar);
        if (!b || l()) {
            g(migVar == this.a);
        }
        return 1;
    }

    public final mig d(mhe mheVar) {
        if (mheVar == null) {
            return null;
        }
        int i = this.b;
        mvc[] mvcVarArr = mheVar.c;
        if (mvcVarArr[i] == null) {
            return null;
        }
        if (this.a.n() == mvcVarArr[i]) {
            return this.a;
        }
        mig migVar = this.c;
        if (migVar == null) {
            return null;
        }
        if (migVar.n() == mheVar.c[this.b]) {
            return migVar;
        }
        return null;
    }

    public final void e(mig migVar, mei meiVar) {
        lti.c(this.a == migVar || this.c == migVar);
        if (o(migVar)) {
            if (migVar == meiVar.c) {
                meiVar.d = null;
                meiVar.c = null;
                meiVar.e = true;
            }
            r(migVar);
            migVar.p();
        }
    }

    public final void f(mig migVar, mvc mvcVar, mei meiVar, long j, boolean z) {
        if (o(migVar)) {
            if (mvcVar != migVar.n()) {
                e(migVar, meiVar);
            } else if (z) {
                migVar.F(j);
            }
        }
    }

    public final void g(boolean z) {
        if (z) {
            if (this.e) {
                this.a.E();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            mig migVar = this.c;
            lti.f(migVar);
            migVar.E();
            this.f = false;
        }
    }

    public final void h() {
        if (!o(this.a)) {
            g(true);
        }
        mig migVar = this.c;
        if (migVar == null || o(migVar)) {
            return;
        }
        g(false);
    }

    public final void i() {
        if (this.a.eK() == 1 && this.d != 4) {
            this.a.K();
            return;
        }
        mig migVar = this.c;
        if (migVar == null || migVar.eK() != 1 || this.d == 3) {
            return;
        }
        migVar.K();
    }

    public final void j(boolean z) {
        if (z) {
            mig migVar = this.c;
            lti.f(migVar);
            migVar.r(17, this.a);
        } else {
            mig migVar2 = this.a;
            mig migVar3 = this.c;
            lti.f(migVar3);
            migVar2.r(17, migVar3);
        }
    }

    public final boolean k(mhe mheVar, mig migVar) {
        if (migVar == null) {
            return true;
        }
        mvc[] mvcVarArr = mheVar.c;
        int i = this.b;
        mvc mvcVar = mvcVarArr[i];
        if (migVar.n() != null) {
            if (migVar.n() == mvcVar) {
                if (mvcVar != null && !migVar.M()) {
                    boolean z = mheVar.g.g;
                }
            }
            mhe mheVar2 = mheVar.i;
            return mheVar2 != null && mheVar2.c[i] == migVar.n();
        }
        return true;
    }

    public final boolean l() {
        return t() || u();
    }

    public final boolean m(mhe mheVar) {
        return d(mheVar) != null;
    }

    public final boolean n() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return o(this.a);
        }
        mig migVar = this.c;
        lti.f(migVar);
        return o(migVar);
    }

    public final boolean p(int i) {
        return (t() && i == this.b) || (u() && i != this.b);
    }
}

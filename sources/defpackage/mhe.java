package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mhe {
    public final mtj a;
    public final Object b;
    public final mvc[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public mhf g;
    public boolean h;
    public mhe i;
    public mvo j = mvo.a;
    public mxm k;
    public long l;
    private final boolean[] m;
    private final mij[] n;
    private final mxl o;
    private final mhy p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [msf] */
    public mhe(mij[] mijVarArr, long j, mxl mxlVar, mxt mxtVar, mhy mhyVar, mhf mhfVar, mxm mxmVar) {
        this.n = mijVarArr;
        this.l = j;
        this.o = mxlVar;
        this.p = mhyVar;
        this.b = mhfVar.a.a;
        this.g = mhfVar;
        this.k = mxmVar;
        int length = mijVarArr.length;
        this.c = new mvc[length];
        this.m = new boolean[length];
        mtl mtlVar = mhfVar.a;
        long j2 = mhfVar.b;
        long j3 = mhfVar.d;
        Object y = mif.y(mtlVar.a);
        mtl a = mtlVar.a(mif.x(mtlVar.a));
        mhw mhwVar = (mhw) mhyVar.c.get(y);
        lti.f(mhwVar);
        mhyVar.f.add(mhwVar);
        mhv mhvVar = (mhv) mhyVar.e.get(mhwVar);
        if (mhvVar != null) {
            mhvVar.a.h(mhvVar.b);
        }
        mhwVar.c.add(a);
        mtd w = mhwVar.a.w(a, mxtVar, j2);
        mhyVar.b.put(w, mhwVar);
        mhyVar.c();
        this.a = j3 != -9223372036854775807L ? new msf(w, true, 0L, j3) : w;
    }

    private final void r() {
        if (!n()) {
            return;
        }
        int i = 0;
        while (true) {
            mxm mxmVar = this.k;
            if (i >= mxmVar.a) {
                return;
            }
            mxmVar.b(i);
            mxf mxfVar = this.k.c[i];
            i++;
        }
    }

    private final void s() {
        if (!n()) {
            return;
        }
        int i = 0;
        while (true) {
            mxm mxmVar = this.k;
            if (i >= mxmVar.a) {
                return;
            }
            mxmVar.b(i);
            mxf mxfVar = this.k.c[i];
            i++;
        }
    }

    public final long a(mxm mxmVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= mxmVar.a) {
                break;
            }
            boolean[] zArr2 = this.m;
            if (z || !mxmVar.a(this.k, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            mij[] mijVarArr = this.n;
            if (i2 >= mijVarArr.length) {
                break;
            }
            mijVarArr[i2].eL();
            i2++;
        }
        r();
        this.k = mxmVar;
        s();
        long h = this.a.h(mxmVar.c, this.m, this.c, zArr, j);
        int i3 = 0;
        while (true) {
            mij[] mijVarArr2 = this.n;
            if (i3 >= mijVarArr2.length) {
                break;
            }
            mijVarArr2[i3].eL();
            i3++;
        }
        this.f = false;
        int i4 = 0;
        while (true) {
            mvc[] mvcVarArr = this.c;
            if (i4 >= mvcVarArr.length) {
                return h;
            }
            if (mvcVarArr[i4] != null) {
                lti.c(mxmVar.b(i4));
                this.n[i4].eL();
                this.f = true;
            } else {
                lti.c(mxmVar.c[i4] == null);
            }
            i4++;
        }
    }

    public final long b() {
        if (!this.e) {
            return this.g.b;
        }
        long d = this.f ? this.a.d() : Long.MIN_VALUE;
        return d == Long.MIN_VALUE ? this.g.e : d;
    }

    public final long c() {
        if (this.e) {
            return this.a.e();
        }
        return 0L;
    }

    public final long d() {
        return this.g.b + this.l;
    }

    public final long e(long j) {
        return j - this.l;
    }

    public final long f(long j) {
        return j + this.l;
    }

    public final void g(mhc mhcVar) {
        lti.c(n());
        this.a.n(mhcVar);
    }

    public final void h(mti mtiVar, long j) {
        this.d = true;
        this.a.k(mtiVar, j);
    }

    public final void i() {
        r();
        mtj mtjVar = this.a;
        try {
            boolean z = mtjVar instanceof msf;
            mhy mhyVar = this.p;
            if (z) {
                mhyVar.e(((msf) mtjVar).a);
            } else {
                mhyVar.e(mtjVar);
            }
        } catch (RuntimeException e) {
            luj.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void j(mhe mheVar) {
        if (mheVar == this.i) {
            return;
        }
        r();
        this.i = mheVar;
        s();
    }

    public final void k() {
        mtj mtjVar = this.a;
        if (mtjVar instanceof msf) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((msf) mtjVar).m(0L, j);
        }
    }

    public final boolean l() {
        if (this.e) {
            return !this.f || this.a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean m() {
        if (this.e) {
            return l() || b() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final boolean n() {
        return this.i == null;
    }

    public final long o(mxm mxmVar, long j) {
        return a(mxmVar, j, false, new boolean[this.n.length]);
    }

    public final void p(lru lruVar) {
        this.e = true;
        this.j = this.a.i();
        mxm q = q();
        mhf mhfVar = this.g;
        long j = mhfVar.b;
        long j2 = mhfVar.e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long o = o(q, j);
        long j3 = this.l;
        mhf mhfVar2 = this.g;
        this.l = j3 + (mhfVar2.b - o);
        this.g = mhfVar2.b(o);
    }

    public final mxm q() {
        mvo mvoVar = this.j;
        mtl mtlVar = this.g.a;
        mxm n = this.o.n(this.n, mvoVar);
        for (int i = 0; i < n.a; i++) {
            if (n.b(i)) {
                if (n.c[i] == null) {
                    this.n[i].eL();
                    r4 = false;
                }
                lti.c(r4);
            } else {
                lti.c(n.c[i] == null);
            }
        }
        for (mxf mxfVar : n.c) {
        }
        return n;
    }
}

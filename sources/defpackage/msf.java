package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msf implements mtj, mti {
    public final mtj a;
    long b;
    long c;
    public msi d;
    private mti e;
    private mse[] f = new mse[0];
    private long g;

    public msf(mtj mtjVar, boolean z, long j, long j2) {
        this.a = mtjVar;
        this.g = true != z ? -9223372036854775807L : j;
        this.b = j;
        this.c = j2;
    }

    private static long r(long j, long j2, long j3) {
        long max = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    @Override // defpackage.mtj
    public final long a(long j, min minVar) {
        long j2 = this.b;
        if (j == j2) {
            return j2;
        }
        long q = lvf.q(minVar.c, 0L, j - j2);
        long j3 = minVar.d;
        long j4 = this.c;
        long q2 = lvf.q(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (q != minVar.c || q2 != minVar.d) {
            minVar = new min(q, q2);
        }
        return this.a.a(j, minVar);
    }

    @Override // defpackage.mvd
    public final /* bridge */ /* synthetic */ void b(mve mveVar) {
        mti mtiVar = this.e;
        lti.f(mtiVar);
        mtiVar.b(this);
    }

    @Override // defpackage.mti
    public final void c(mtj mtjVar) {
        if (this.d != null) {
            return;
        }
        mti mtiVar = this.e;
        lti.f(mtiVar);
        mtiVar.c(this);
    }

    @Override // defpackage.mtj, defpackage.mve
    public final long d() {
        long d = this.a.d();
        if (d != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.mtj, defpackage.mve
    public final long e() {
        long e = this.a.e();
        if (e != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || e < j) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.mtj
    public final long f() {
        if (p()) {
            long j = this.g;
            this.g = -9223372036854775807L;
            long f = f();
            return f != -9223372036854775807L ? f : j;
        }
        long f2 = this.a.f();
        if (f2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return r(f2, this.b, this.c);
    }

    @Override // defpackage.mtj
    public final long g(long j) {
        this.g = -9223372036854775807L;
        for (mse mseVar : this.f) {
            if (mseVar != null) {
                mseVar.b = false;
            }
        }
        return r(this.a.g(j), this.b, this.c);
    }

    @Override // defpackage.mtj
    public final long h(mxf[] mxfVarArr, boolean[] zArr, mvc[] mvcVarArr, boolean[] zArr2, long j) {
        int length = mvcVarArr.length;
        this.f = new mse[length];
        mvc[] mvcVarArr2 = new mvc[length];
        int i = 0;
        while (true) {
            mvc mvcVar = null;
            if (i >= mvcVarArr.length) {
                break;
            }
            mse[] mseVarArr = this.f;
            mse mseVar = (mse) mvcVarArr[i];
            mseVarArr[i] = mseVar;
            if (mseVar != null) {
                mvcVar = mseVar.a;
            }
            mvcVarArr2[i] = mvcVar;
            i++;
        }
        long h = this.a.h(mxfVarArr, zArr, mvcVarArr2, zArr2, j);
        long r = r(h, j, this.c);
        long j2 = -9223372036854775807L;
        if (p()) {
            if (h >= j) {
                if (h != 0) {
                    for (mxf mxfVar : mxfVarArr) {
                        if (mxfVar != null) {
                            lqc f = mxfVar.f();
                            if (!lre.g(f.o, f.k)) {
                            }
                        }
                    }
                }
            }
            j2 = r;
            break;
        }
        this.g = j2;
        for (int i2 = 0; i2 < mvcVarArr.length; i2++) {
            mvc mvcVar2 = mvcVarArr2[i2];
            if (mvcVar2 == null) {
                this.f[i2] = null;
            } else {
                mse[] mseVarArr2 = this.f;
                mse mseVar2 = mseVarArr2[i2];
                if (mseVar2 == null || mseVar2.a != mvcVar2) {
                    mseVarArr2[i2] = new mse(this, mvcVar2);
                }
            }
            mvcVarArr[i2] = this.f[i2];
        }
        return r;
    }

    @Override // defpackage.mtj
    public final mvo i() {
        return this.a.i();
    }

    @Override // defpackage.mtj
    public final void j() {
        msi msiVar = this.d;
        if (msiVar != null) {
            throw msiVar;
        }
        this.a.j();
    }

    @Override // defpackage.mtj
    public final void k(mti mtiVar, long j) {
        this.e = mtiVar;
        this.a.k(this, j);
    }

    @Override // defpackage.mtj, defpackage.mve
    public final void l(long j) {
        this.a.l(j);
    }

    public final void m(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.mtj, defpackage.mve
    public final boolean n(mhc mhcVar) {
        return this.a.n(mhcVar);
    }

    @Override // defpackage.mtj, defpackage.mve
    public final boolean o() {
        return this.a.o();
    }

    final boolean p() {
        return this.g != -9223372036854775807L;
    }

    @Override // defpackage.mtj
    public final void q(long j) {
        this.a.q(j);
    }
}

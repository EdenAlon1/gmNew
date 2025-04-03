package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mvl implements mtj, mti {
    public final mtj a;
    private final long b;
    private mti c;

    public mvl(mtj mtjVar, long j) {
        this.a = mtjVar;
        this.b = j;
    }

    @Override // defpackage.mtj
    public final long a(long j, min minVar) {
        long j2 = this.b;
        return this.a.a(j - j2, minVar) + j2;
    }

    @Override // defpackage.mvd
    public final /* bridge */ /* synthetic */ void b(mve mveVar) {
        mti mtiVar = this.c;
        lti.f(mtiVar);
        mtiVar.b(this);
    }

    @Override // defpackage.mti
    public final void c(mtj mtjVar) {
        mti mtiVar = this.c;
        lti.f(mtiVar);
        mtiVar.c(this);
    }

    @Override // defpackage.mtj, defpackage.mve
    public final long d() {
        long d = this.a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.b;
    }

    @Override // defpackage.mtj, defpackage.mve
    public final long e() {
        long e = this.a.e();
        if (e == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e + this.b;
    }

    @Override // defpackage.mtj
    public final long f() {
        long f = this.a.f();
        if (f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return f + this.b;
    }

    @Override // defpackage.mtj
    public final long g(long j) {
        long j2 = this.b;
        return this.a.g(j - j2) + j2;
    }

    @Override // defpackage.mtj
    public final long h(mxf[] mxfVarArr, boolean[] zArr, mvc[] mvcVarArr, boolean[] zArr2, long j) {
        mvc[] mvcVarArr2 = new mvc[mvcVarArr.length];
        int i = 0;
        while (true) {
            mvc mvcVar = null;
            if (i >= mvcVarArr.length) {
                break;
            }
            mvk mvkVar = (mvk) mvcVarArr[i];
            if (mvkVar != null) {
                mvcVar = mvkVar.a;
            }
            mvcVarArr2[i] = mvcVar;
            i++;
        }
        long h = this.a.h(mxfVarArr, zArr, mvcVarArr2, zArr2, j - this.b);
        for (int i2 = 0; i2 < mvcVarArr.length; i2++) {
            mvc mvcVar2 = mvcVarArr2[i2];
            if (mvcVar2 == null) {
                mvcVarArr[i2] = null;
            } else {
                mvc mvcVar3 = mvcVarArr[i2];
                if (mvcVar3 == null || ((mvk) mvcVar3).a != mvcVar2) {
                    mvcVarArr[i2] = new mvk(mvcVar2, this.b);
                }
            }
        }
        return h + this.b;
    }

    @Override // defpackage.mtj
    public final mvo i() {
        return this.a.i();
    }

    @Override // defpackage.mtj
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.mtj
    public final void k(mti mtiVar, long j) {
        this.c = mtiVar;
        this.a.k(this, j - this.b);
    }

    @Override // defpackage.mtj, defpackage.mve
    public final void l(long j) {
        this.a.l(j - this.b);
    }

    @Override // defpackage.mtj, defpackage.mve
    public final boolean n(mhc mhcVar) {
        mhb mhbVar = new mhb(mhcVar);
        mhbVar.a = mhcVar.a - this.b;
        return this.a.n(new mhc(mhbVar));
    }

    @Override // defpackage.mtj, defpackage.mve
    public final boolean o() {
        return this.a.o();
    }

    @Override // defpackage.mtj
    public final void q(long j) {
        this.a.q(j - this.b);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtd implements mtj, mti {
    public final mtl a;
    public final long b;
    public mtn c;
    public mtj d;
    public long e = -9223372036854775807L;
    private mti f;
    private final mxt g;

    public mtd(mtl mtlVar, mxt mxtVar, long j) {
        this.a = mtlVar;
        this.g = mxtVar;
        this.b = j;
    }

    private final long p(long j) {
        long j2 = this.e;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // defpackage.mtj
    public final long a(long j, min minVar) {
        mtj mtjVar = this.d;
        int i = lvf.a;
        return mtjVar.a(j, minVar);
    }

    @Override // defpackage.mvd
    public final /* bridge */ /* synthetic */ void b(mve mveVar) {
        mti mtiVar = this.f;
        int i = lvf.a;
        mtiVar.b(this);
    }

    @Override // defpackage.mti
    public final void c(mtj mtjVar) {
        mti mtiVar = this.f;
        int i = lvf.a;
        mtiVar.c(this);
    }

    @Override // defpackage.mtj, defpackage.mve
    public final long d() {
        mtj mtjVar = this.d;
        int i = lvf.a;
        return mtjVar.d();
    }

    @Override // defpackage.mtj, defpackage.mve
    public final long e() {
        mtj mtjVar = this.d;
        int i = lvf.a;
        return mtjVar.e();
    }

    @Override // defpackage.mtj
    public final long f() {
        mtj mtjVar = this.d;
        int i = lvf.a;
        return mtjVar.f();
    }

    @Override // defpackage.mtj
    public final long g(long j) {
        mtj mtjVar = this.d;
        int i = lvf.a;
        return mtjVar.g(j);
    }

    @Override // defpackage.mtj
    public final long h(mxf[] mxfVarArr, boolean[] zArr, mvc[] mvcVarArr, boolean[] zArr2, long j) {
        long j2 = this.e;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.e = -9223372036854775807L;
        mtj mtjVar = this.d;
        int i = lvf.a;
        return mtjVar.h(mxfVarArr, zArr, mvcVarArr, zArr2, j3);
    }

    @Override // defpackage.mtj
    public final mvo i() {
        mtj mtjVar = this.d;
        int i = lvf.a;
        return mtjVar.i();
    }

    @Override // defpackage.mtj
    public final void j() {
        mtj mtjVar = this.d;
        if (mtjVar != null) {
            mtjVar.j();
            return;
        }
        mtn mtnVar = this.c;
        if (mtnVar != null) {
            mtnVar.t();
        }
    }

    @Override // defpackage.mtj
    public final void k(mti mtiVar, long j) {
        this.f = mtiVar;
        mtj mtjVar = this.d;
        if (mtjVar != null) {
            mtjVar.k(this, p(this.b));
        }
    }

    @Override // defpackage.mtj, defpackage.mve
    public final void l(long j) {
        mtj mtjVar = this.d;
        int i = lvf.a;
        mtjVar.l(j);
    }

    public final void m(mtl mtlVar) {
        long p = p(this.b);
        mtn mtnVar = this.c;
        lti.f(mtnVar);
        mtj w = mtnVar.w(mtlVar, this.g, p);
        this.d = w;
        if (this.f != null) {
            w.k(this, p);
        }
    }

    @Override // defpackage.mtj, defpackage.mve
    public final boolean n(mhc mhcVar) {
        mtj mtjVar = this.d;
        return mtjVar != null && mtjVar.n(mhcVar);
    }

    @Override // defpackage.mtj, defpackage.mve
    public final boolean o() {
        mtj mtjVar = this.d;
        return mtjVar != null && mtjVar.o();
    }

    @Override // defpackage.mtj
    public final void q(long j) {
        mtj mtjVar = this.d;
        int i = lvf.a;
        mtjVar.q(j);
    }
}

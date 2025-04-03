package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mei implements mhd {
    public final meh b;
    public mig c;
    public mhd d;
    public boolean f;
    public final mio a = new mio();
    public boolean e = true;

    public mei(meh mehVar) {
        this.b = mehVar;
    }

    @Override // defpackage.mhd
    public final long a() {
        if (this.e) {
            return this.a.a();
        }
        mhd mhdVar = this.d;
        lti.f(mhdVar);
        return mhdVar.a();
    }

    @Override // defpackage.mhd
    public final lri b() {
        mhd mhdVar = this.d;
        return mhdVar != null ? mhdVar.b() : this.a.a;
    }

    public final void c(mig migVar) {
        mhd mhdVar;
        mhd k = migVar.k();
        if (k == null || k == (mhdVar = this.d)) {
            return;
        }
        if (mhdVar != null) {
            throw new mel(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = k;
        this.c = migVar;
        k.d(this.a.a);
    }

    @Override // defpackage.mhd
    public final void d(lri lriVar) {
        mhd mhdVar = this.d;
        if (mhdVar != null) {
            mhdVar.d(lriVar);
            lriVar = this.d.b();
        }
        this.a.d(lriVar);
    }

    public final void e() {
        this.f = true;
        this.a.e();
    }

    public final void f() {
        this.f = false;
        this.a.f();
    }

    @Override // defpackage.mhd
    public final boolean g() {
        if (this.e) {
            return false;
        }
        mhd mhdVar = this.d;
        lti.f(mhdVar);
        return mhdVar.g();
    }
}

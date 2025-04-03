package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idd implements jzn {
    public int a;
    public float e;
    public float f;
    public float g;
    public float j;
    public float k;
    public float l;
    public boolean p;
    public idc u;
    public ibx v;
    public icr x;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public long h = icg.a;
    public long i = icg.a;
    public float m = 8.0f;
    public long n = idr.a;
    public idh o = idb.a;
    public int q = 0;
    public long r = 9205357640488583168L;
    public jzn s = new jzo(1.0f);
    public kah t = kah.a;
    public int w = 3;

    public final void A(idh idhVar) {
        if (ffkj.e(this.o, idhVar)) {
            return;
        }
        this.a |= 8192;
        this.o = idhVar;
    }

    public final void B(long j) {
        long j2 = this.i;
        long j3 = ibw.a;
        if (ffcp.a(j2, j)) {
            return;
        }
        this.a |= 128;
        this.i = j;
    }

    public final void C(long j) {
        if (idr.d(this.n, j)) {
            return;
        }
        this.a |= 4096;
        this.n = j;
    }

    public final void D(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public final void E(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    public final void F() {
        if (ffkj.e(null, null)) {
            return;
        }
        this.a |= 262144;
        this.v = null;
    }

    public final void a(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void b(long j) {
        long j2 = this.h;
        long j3 = ibw.a;
        if (ffcp.a(j2, j)) {
            return;
        }
        this.a |= 64;
        this.h = j;
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.s.ec();
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.s.ed();
    }

    @Override // defpackage.jzx
    public final /* synthetic */ float ef(long j) {
        return jzw.a(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float eg(float f) {
        return jzm.a(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float ek(int i) {
        return jzm.b(this, i);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float el(long j) {
        return jzm.c(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float em(float f) {
        return jzm.d(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int en(long j) {
        return jzm.e(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int eo(float f) {
        return jzm.f(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long ep(long j) {
        return jzm.g(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long eq(long j) {
        return jzm.h(this, j);
    }

    @Override // defpackage.jzx
    public final /* synthetic */ long er(float f) {
        return jzw.b(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long es(float f) {
        return jzm.i(this, f);
    }

    public final void p(int i) {
        if (ibk.b(this.w, i)) {
            return;
        }
        this.a |= 524288;
        this.w = i;
    }

    public final void q(float f) {
        if (this.m == f) {
            return;
        }
        this.a |= 2048;
        this.m = f;
    }

    public final void r(boolean z) {
        if (this.p != z) {
            this.a |= 16384;
            this.p = z;
        }
    }

    public final void s(int i) {
        if (icc.b(this.q, i)) {
            return;
        }
        this.a |= 32768;
        this.q = i;
    }

    public final void t(idc idcVar) {
        if (ffkj.e(this.u, idcVar)) {
            return;
        }
        this.a |= 131072;
        this.u = idcVar;
    }

    public final void u(float f) {
        if (this.j == f) {
            return;
        }
        this.a |= 256;
        this.j = f;
    }

    public final void v(float f) {
        if (this.k == f) {
            return;
        }
        this.a |= 512;
        this.k = f;
    }

    public final void w(float f) {
        if (this.l == f) {
            return;
        }
        this.a |= 1024;
        this.l = f;
    }

    public final void x(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void y(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void z(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }
}

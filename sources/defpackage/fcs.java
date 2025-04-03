package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcs implements fcv {
    public final long a;
    private final ffix b;
    private final ffix c;
    private jpg e;
    private final Object d = this;
    private int f = -1;

    public fcs(long j, ffix ffixVar, ffix ffixVar2) {
        this.a = j;
        this.b = ffixVar;
        this.c = ffixVar2;
    }

    private final int n(jpg jpgVar) {
        int i;
        int f;
        synchronized (this.d) {
            if (this.e != jpgVar) {
                if (jpgVar.s() && !jpgVar.b.c) {
                    int g = ffmk.g(jpgVar.i((int) (jpgVar.c & 4294967295L)), jpgVar.f() - 1);
                    while (g >= 0 && jpgVar.e(g) >= ((int) (jpgVar.c & 4294967295L))) {
                        g--;
                    }
                    f = ffmk.f(g, 0);
                    this.f = jpgVar.g(f, true);
                    this.e = jpgVar;
                }
                f = jpgVar.f() - 1;
                this.f = jpgVar.g(f, true);
                this.e = jpgVar;
            }
            i = this.f;
        }
        return i;
    }

    @Override // defpackage.fcv
    public final float a(int i) {
        jpg jpgVar;
        int h;
        Object invoke = this.c.invoke();
        if (invoke == null || (h = (jpgVar = (jpg) invoke).h(i)) >= jpgVar.f()) {
            return -1.0f;
        }
        float e = jpgVar.e(h);
        return ((jpgVar.b(h) - e) / 2.0f) + e;
    }

    @Override // defpackage.fcv
    public final float b(int i) {
        Object invoke = this.c.invoke();
        if (invoke != null) {
            return exp.a((jpg) invoke, i);
        }
        return 0.0f;
    }

    @Override // defpackage.fcv
    public final float c(int i) {
        jpg jpgVar;
        int h;
        Object invoke = this.c.invoke();
        if (invoke != null && (h = (jpgVar = (jpg) invoke).h(i)) < jpgVar.f()) {
            return jpgVar.c(h);
        }
        return -1.0f;
    }

    @Override // defpackage.fcv
    public final float d(int i) {
        jpg jpgVar;
        int h;
        Object invoke = this.c.invoke();
        if (invoke != null && (h = (jpgVar = (jpg) invoke).h(i)) < jpgVar.f()) {
            return jpgVar.d(h);
        }
        return -1.0f;
    }

    @Override // defpackage.fcv
    public final int e() {
        Object invoke = this.c.invoke();
        if (invoke == null) {
            return 0;
        }
        return n((jpg) invoke);
    }

    @Override // defpackage.fcv
    public final long f(fcy fcyVar, boolean z) {
        Object invoke;
        if (z) {
            if (fcyVar.a.c != this.a) {
                return 9205357640488583168L;
            }
        }
        if (!z) {
            if (fcyVar.b.c != this.a) {
                return 9205357640488583168L;
            }
        }
        if (k() == null || (invoke = this.c.invoke()) == null) {
            return 9205357640488583168L;
        }
        jpg jpgVar = (jpg) invoke;
        return fic.a(jpgVar, ffmk.i(z ? fcyVar.a.b : fcyVar.b.b, 0, n(jpgVar)), z, fcyVar.c);
    }

    @Override // defpackage.fcv
    public final long g(int i) {
        Object invoke = this.c.invoke();
        if (invoke == null) {
            return jpm.a;
        }
        jpg jpgVar = (jpg) invoke;
        int n = n(jpgVar);
        if (n <= 0) {
            return jpm.a;
        }
        int h = jpgVar.h(ffmk.i(i, 0, n - 1));
        long a = jpn.a(jpgVar.j(h), jpgVar.g(h, true));
        long j = jpm.a;
        return a;
    }

    @Override // defpackage.fcv
    public final long h() {
        return this.a;
    }

    @Override // defpackage.fcv
    public final fcy i() {
        Object invoke = this.c.invoke();
        if (invoke == null) {
            return null;
        }
        jpg jpgVar = (jpg) invoke;
        int a = jpgVar.a.a.a();
        return new fcy(new fcx(jpgVar.q(0), 0, this.a), new fcx(jpgVar.q(Math.max(a - 1, 0)), a, this.a), false);
    }

    @Override // defpackage.fcv
    public final iam j(int i) {
        Object invoke = this.c.invoke();
        if (invoke != null) {
            jpg jpgVar = (jpg) invoke;
            int a = jpgVar.a.a.a();
            if (a > 0) {
                return jpgVar.m(ffmk.i(i, 0, a - 1));
            }
        }
        return iam.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ioc, java.lang.Object] */
    @Override // defpackage.fcv
    public final ioc k() {
        ?? invoke = this.b.invoke();
        if (invoke == 0 || !invoke.t()) {
            return null;
        }
        return invoke;
    }

    @Override // defpackage.fcv
    public final jlm l() {
        Object invoke = this.c.invoke();
        return invoke == null ? new jlm("") : ((jpg) invoke).a.a;
    }

    @Override // defpackage.fcv
    public final void m(feo feoVar) {
        Object invoke;
        int i;
        int i2;
        long j;
        int c;
        int i3;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        fcx fcxVar;
        fcx fcxVar2;
        ioc k = k();
        if (k == null || (invoke = this.c.invoke()) == null) {
            return;
        }
        ioc iocVar = feoVar.c;
        long j3 = feoVar.a;
        long h = iocVar.h(k, 0L);
        long e = iak.e(j3, h);
        long j4 = feoVar.b;
        long e2 = (j4 & 9223372034707292159L) == 9205357640488583168L ? 9205357640488583168L : iak.e(j4, h);
        long j5 = this.a;
        jpg jpgVar = (jpg) invoke;
        long j6 = jpgVar.c;
        iam iamVar = new iam(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
        int i9 = (int) (e >> 32);
        int i10 = Float.intBitsToFloat(i9) < iamVar.b ? 1 : Float.intBitsToFloat(i9) > iamVar.d ? 3 : 2;
        int i11 = (int) (e & 4294967295L);
        int i12 = Float.intBitsToFloat(i11) < iamVar.c ? 1 : Float.intBitsToFloat(i11) > iamVar.e ? 3 : 2;
        if (feoVar.d) {
            fcy fcyVar = feoVar.e;
            fcx fcxVar3 = fcyVar != null ? fcyVar.b : null;
            i = i10;
            fcx fcxVar4 = fcxVar3;
            i2 = i12;
            j = j5;
            i5 = i2;
            i4 = fct.c(i, i2, feoVar, j, fcxVar4);
            i3 = i4;
            j2 = 9205357640488583168L;
            c = i;
            i6 = i3;
        } else {
            i = i10;
            i2 = i12;
            fcy fcyVar2 = feoVar.e;
            j = j5;
            c = fct.c(i, i2, feoVar, j, fcyVar2 != null ? fcyVar2.a : null);
            i3 = i;
            i4 = c;
            i5 = i4;
            j2 = 9205357640488583168L;
            i6 = i2;
        }
        int b = feq.b(i, i2);
        if (b == 2 || b != i4) {
            jpf jpfVar = jpgVar.a;
            boolean z = feoVar.d;
            int a = jpfVar.a.a();
            if (z) {
                int a2 = fct.a(e, jpgVar);
                fcy fcyVar3 = feoVar.e;
                i8 = (fcyVar3 == null || (fcxVar2 = fcyVar3.b) == null) ? a2 : fct.b(fcxVar2, feoVar.f, j, a);
                i7 = a2;
            } else {
                int a3 = fct.a(e, jpgVar);
                fcy fcyVar4 = feoVar.e;
                if (fcyVar4 == null || (fcxVar = fcyVar4.a) == null) {
                    i7 = a3;
                    i8 = i7;
                } else {
                    i7 = fct.b(fcxVar, feoVar.f, j, a);
                    i8 = a3;
                }
            }
            int a4 = (e2 & 9223372034707292159L) == j2 ? -1 : fct.a(e2, jpgVar);
            int i13 = feoVar.k + 2;
            feoVar.k = i13;
            fcw fcwVar = new fcw(j, i13, i7, i8, a4, jpgVar);
            feoVar.i = feoVar.a(feoVar.i, c, i5);
            feoVar.j = feoVar.a(feoVar.j, i3, i6);
            feoVar.g.c(j, feoVar.h.size());
            feoVar.h.add(fcwVar);
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kiy extends kiu {
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public kit d = this.U;
    public int e = 0;
    private boolean f;

    public kiy() {
        this.ac.clear();
        this.ac.add(this.d);
        int length = this.ab.length;
        for (int i = 0; i < 6; i++) {
            this.ab[i] = this.d;
        }
    }

    @Override // defpackage.kiu
    public final kit V(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.e != 0) {
                return null;
            }
            return this.d;
        }
        if (this.e != 1) {
            return null;
        }
        return this.d;
    }

    @Override // defpackage.kiu
    public final void a(kgz kgzVar, boolean z) {
        kiv kivVar = (kiv) this.ae;
        if (kivVar == null) {
            return;
        }
        Object V = kivVar.V(2);
        Object V2 = kivVar.V(4);
        kiu kiuVar = this.ae;
        boolean z2 = kiuVar != null && kiuVar.aA[0] == 2;
        if (this.e == 0) {
            V = kivVar.V(3);
            V2 = kivVar.V(5);
            z2 = kiuVar != null && kiuVar.aA[1] == 2;
        }
        if (this.f) {
            kit kitVar = this.d;
            if (kitVar.c) {
                khe b = kgzVar.b(kitVar);
                kgzVar.f(b, this.d.a());
                if (this.b != -1) {
                    if (z2) {
                        kgzVar.g(kgzVar.b(V2), b, 0, 5);
                    }
                } else if (this.c != -1 && z2) {
                    khe b2 = kgzVar.b(V2);
                    kgzVar.g(b, kgzVar.b(V), 0, 5);
                    kgzVar.g(b2, b, 0, 5);
                }
                this.f = false;
                return;
            }
        }
        if (this.b != -1) {
            khe b3 = kgzVar.b(this.d);
            kgzVar.m(b3, kgzVar.b(V), this.b, 8);
            if (z2) {
                kgzVar.g(kgzVar.b(V2), b3, 0, 5);
                return;
            }
            return;
        }
        if (this.c != -1) {
            khe b4 = kgzVar.b(this.d);
            khe b5 = kgzVar.b(V2);
            kgzVar.m(b4, b5, -this.c, 8);
            if (z2) {
                kgzVar.g(b4, kgzVar.b(V), 0, 5);
                kgzVar.g(b5, b4, 0, 5);
                return;
            }
            return;
        }
        if (this.a != -1.0f) {
            khe b6 = kgzVar.b(this.d);
            khe b7 = kgzVar.b(V2);
            float f = this.a;
            kgx a = kgzVar.a();
            a.e.g(b6, -1.0f);
            a.e.g(b7, f);
            kgzVar.e(a);
        }
    }

    @Override // defpackage.kiu
    public final void ad(boolean z) {
        if (this.ae == null) {
            return;
        }
        int o = kgz.o(this.d);
        if (this.e == 1) {
            this.aj = o;
            this.ak = 0;
            C(this.ae.h());
            N(0);
            return;
        }
        this.aj = 0;
        this.ak = o;
        N(this.ae.j());
        C(0);
    }

    public final void ae(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = -1;
            this.c = i;
        }
    }

    public final void af(float f) {
        if (f > -1.0f) {
            this.a = f;
            this.b = -1;
            this.c = -1;
        }
    }

    public final void ag(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        this.ac.clear();
        if (this.e == 1) {
            this.d = this.T;
        } else {
            this.d = this.U;
        }
        this.ac.add(this.d);
        int length = this.ab.length;
        for (int i2 = 0; i2 < 6; i2++) {
            this.ab[i2] = this.d;
        }
    }

    @Override // defpackage.kiu
    public final boolean ay() {
        return true;
    }

    public final void b(int i) {
        this.d.f(i);
        this.f = true;
    }

    public final void c(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = i;
            this.c = -1;
        }
    }

    @Override // defpackage.kiu
    public final boolean e() {
        return this.f;
    }

    @Override // defpackage.kiu
    public final boolean f() {
        return this.f;
    }
}

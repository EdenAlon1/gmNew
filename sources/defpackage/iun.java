package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iun {
    public final iui a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public ivd p;
    public int q = 5;
    public final ivm o = new ivm(this);

    public iun(iui iuiVar) {
        this.a = iuiVar;
    }

    public final iwi a() {
        return this.a.x.c;
    }

    public final jzk b() {
        ivm ivmVar = this.o;
        if (ivmVar.j) {
            return new jzk(ivmVar.d);
        }
        return null;
    }

    public final jzk c() {
        ivd ivdVar = this.p;
        if (ivdVar != null) {
            return ivdVar.l;
        }
        return null;
    }

    public final void d() {
        this.o.x = true;
        ivd ivdVar = this.p;
        if (ivdVar != null) {
            ivdVar.r = true;
        }
    }

    public final void e() {
        this.e = true;
        this.f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r4 = this;
            iui r0 = r4.a
            int r0 = r0.aD()
            r1 = 3
            r2 = 4
            r3 = 1
            if (r0 == r1) goto Le
            if (r0 != r2) goto L1b
            r0 = r2
        Le:
            ivm r1 = r4.o
            boolean r1 = r1.y
            if (r1 == 0) goto L18
            r4.j(r3)
            goto L1b
        L18:
            r4.i(r3)
        L1b:
            if (r0 != r2) goto L2c
            ivd r0 = r4.p
            if (r0 == 0) goto L29
            boolean r0 = r0.s
            if (r0 != r3) goto L29
            r4.l(r3)
            return
        L29:
            r4.k(r3)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iun.f():void");
    }

    public final void g(int i) {
        int i2 = this.k;
        this.k = i;
        if ((i2 == 0) != (i == 0)) {
            iui u = this.a.u();
            iun iunVar = u != null ? u.y : null;
            if (iunVar != null) {
                if (i == 0) {
                    iunVar.g(iunVar.k - 1);
                } else {
                    iunVar.g(iunVar.k + 1);
                }
            }
        }
    }

    public final void h(int i) {
        int i2 = this.n;
        this.n = i;
        if ((i2 == 0) != (i == 0)) {
            iui u = this.a.u();
            iun iunVar = u != null ? u.y : null;
            if (iunVar != null) {
                if (i == 0) {
                    iunVar.h(iunVar.n - 1);
                } else {
                    iunVar.h(iunVar.n + 1);
                }
            }
        }
    }

    public final void i(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z) {
                if (this.i) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (this.i) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void j(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (z) {
                if (this.j) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (this.j) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void k(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z) {
                if (this.l) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (this.l) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void l(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z) {
                if (this.m) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (this.m) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void m() {
        ivm ivmVar = this.o;
        if ((ivmVar.r != null || ivmVar.p().f() != null) && ivmVar.q) {
            ivmVar.q = false;
            ivmVar.r = ivmVar.p().f();
            iui u = this.a.u();
            if (u != null) {
                iui.az(u, false, 7);
            }
        }
        ivd ivdVar = this.p;
        if (ivdVar != null) {
            if (ivdVar.u == null) {
                iuw C = ivdVar.q().C();
                C.getClass();
                if (C.f() == null) {
                    return;
                }
            }
            if (ivdVar.t) {
                ivdVar.t = false;
                iuw C2 = ivdVar.q().C();
                C2.getClass();
                ivdVar.u = C2.f();
                if (iuo.a(this.a)) {
                    iui u2 = this.a.u();
                    if (u2 != null) {
                        iui.az(u2, false, 7);
                        return;
                    }
                    return;
                }
                iui u3 = this.a.u();
                if (u3 != null) {
                    iui.ax(u3, false, 7);
                }
            }
        }
    }

    public final boolean n() {
        return this.o.v;
    }
}

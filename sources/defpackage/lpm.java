package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lpm implements lro {
    protected final lrt a = new lrt();

    protected lpm() {
    }

    private final int ad() {
        int w = w();
        if (w == 1) {
            return 0;
        }
        return w;
    }

    private final void ae() {
        int b = b();
        if (b == -1) {
            af();
        } else if (b == aI()) {
            ag();
        } else {
            ah(b);
        }
    }

    private final void af() {
        s(-1, -9223372036854775807L, false);
    }

    private final void ag() {
        s(aI(), -9223372036854775807L, true);
    }

    private final void ah(int i) {
        s(i, -9223372036854775807L, false);
    }

    private final void ai(long j) {
        long z = z() + j;
        long A = A();
        if (A != -9223372036854775807L) {
            z = Math.min(z, A);
        }
        t(Math.max(z, 0L));
    }

    public final int a() {
        lru I = I();
        if (I.q()) {
            return -1;
        }
        return I.j(aI(), ad(), Z());
    }

    public final int b() {
        lru I = I();
        if (I.q()) {
            return -1;
        }
        return I.k(aI(), ad(), Z());
    }

    @Override // defpackage.lro
    public final long c() {
        lru I = I();
        if (I.q()) {
            return -9223372036854775807L;
        }
        return I.p(aI(), this.a).b();
    }

    @Override // defpackage.lro
    public final void d() {
        S(false);
    }

    @Override // defpackage.lro
    public final void e() {
        S(true);
    }

    @Override // defpackage.lro
    public final void f() {
        ai(-C());
    }

    @Override // defpackage.lro
    public final void g() {
        ai(D());
    }

    @Override // defpackage.lro
    public final void h(int i, long j) {
        s(i, j, false);
    }

    @Override // defpackage.lro
    public final void i() {
        ah(aI());
    }

    @Override // defpackage.lro
    public final void j() {
        if (I().q() || aa()) {
            af();
            return;
        }
        if (!l()) {
            if (p() && o()) {
                ah(aI());
                return;
            } else {
                af();
                return;
            }
        }
        int a = a();
        if (a == -1) {
            af();
        } else if (a == aI()) {
            ag();
        } else {
            ah(a);
        }
    }

    @Override // defpackage.lro
    public final void k() {
        if (I().q() || aa()) {
            af();
            return;
        }
        boolean m = m();
        if (p() && !q()) {
            if (m) {
                ae();
                return;
            } else {
                af();
                return;
            }
        }
        if (!m || z() > B()) {
            t(0L);
        } else {
            ae();
        }
    }

    @Override // defpackage.lro
    public final boolean l() {
        return a() != -1;
    }

    @Override // defpackage.lro
    public final boolean m() {
        return b() != -1;
    }

    @Override // defpackage.lro
    public final boolean n(int i) {
        return H().a.c(i);
    }

    @Override // defpackage.lro
    public final boolean o() {
        lru I = I();
        return !I.q() && I.p(aI(), this.a).i;
    }

    @Override // defpackage.lro
    public final boolean p() {
        lru I = I();
        return !I.q() && I.p(aI(), this.a).c();
    }

    @Override // defpackage.lro
    public final boolean q() {
        lru I = I();
        return !I.q() && I.p(aI(), this.a).h;
    }

    @Override // defpackage.lro
    public final boolean r() {
        return u() == 3 && Y() && v() == 0;
    }

    protected abstract void s(int i, long j, boolean z);

    public final void t(long j) {
        s(aI(), j, false);
    }
}

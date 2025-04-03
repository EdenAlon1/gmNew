package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisk extends fitg {
    private final fise a;

    public fisk(fise fiseVar) {
        super(firf.k, 31556952000L);
        this.a = fiseVar;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int a(long j) {
        return this.a.X(j);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int c() {
        return 292278993;
    }

    @Override // defpackage.fird
    public final int d() {
        return -292275054;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long e(long j, int i) {
        return i == 0 ? j : h(j, a(j) + i);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long g(long j) {
        long g = this.a.l.g(j);
        return this.a.U(g) > 1 ? g - ((r0 - 1) * 604800000) : g;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long h(long j, int i) {
        fite.c(this, Math.abs(i), -292275054, 292278993);
        int a = a(j);
        if (a == i) {
            return j;
        }
        int O = this.a.O(j);
        fise fiseVar = this.a;
        int W = fiseVar.W(a);
        int W2 = fiseVar.W(i);
        if (W2 < W) {
            W = W2;
        }
        int U = this.a.U(j);
        if (U <= W) {
            W = U;
        }
        long ae = this.a.ae(j, i);
        int a2 = a(ae);
        if (a2 < i) {
            ae += 604800000;
        } else if (a2 > i) {
            ae -= 604800000;
        }
        return this.a.j.h(ae + ((W - this.a.U(ae)) * 604800000), O);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final firl r() {
        return this.a.d;
    }

    @Override // defpackage.fird
    public final firl s() {
        return null;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final boolean t(long j) {
        fise fiseVar = this.a;
        return fiseVar.W(fiseVar.X(j)) > 52;
    }

    @Override // defpackage.fitg
    public final long x(long j, long j2) {
        return e(j, fite.a(j2));
    }

    @Override // defpackage.fird
    public final void v() {
    }
}

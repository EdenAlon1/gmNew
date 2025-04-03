package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisl extends fitg {
    protected final fise a;

    public fisl(fise fiseVar) {
        super(firf.f, 31556952000L);
        this.a = fiseVar;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int a(long j) {
        return this.a.Y(j);
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
        if (i == 0) {
            return j;
        }
        int a = a(j);
        int i2 = a + i;
        if ((a ^ i2) >= 0 || (a ^ i) < 0) {
            return h(j, i2);
        }
        throw new ArithmeticException(a.r(i, a, "The calculation caused an overflow: ", " + "));
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long g(long j) {
        return this.a.ac(a(j));
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long h(long j, int i) {
        fite.c(this, i, -292275054, 292278993);
        return this.a.ae(j, i);
    }

    @Override // defpackage.fird
    public final long j(long j, int i) {
        fite.c(this, i, -292275055, 292278994);
        return this.a.ae(j, i);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final firl r() {
        return this.a.c;
    }

    @Override // defpackage.fird
    public final firl s() {
        return null;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final boolean t(long j) {
        return this.a.ag(a(j));
    }

    @Override // defpackage.fitg
    public final long x(long j, long j2) {
        return e(j, fite.a(j2));
    }

    @Override // defpackage.fird
    public final void v() {
    }
}

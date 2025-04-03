package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisu extends fitb {
    static final fird a = new fisu();

    private fisu() {
        super(fisr.H.n, firf.c);
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int a(long j) {
        int a2 = this.b.a(j);
        return a2 < 0 ? -a2 : a2;
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.fitb, defpackage.fird
    public final int d() {
        return 0;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long e(long j, int i) {
        return this.b.e(j, i);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final long h(long j, int i) {
        fite.c(this, i, 0, c());
        if (this.b.a(j) < 0) {
            i = -i;
        }
        return super.h(j, i);
    }

    @Override // defpackage.fitb, defpackage.fird
    public final firl s() {
        return fisr.H.h;
    }
}

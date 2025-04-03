package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisq extends fitb {
    private final fise a;

    public fisq(fird firdVar, fise fiseVar) {
        super(firdVar, firf.c);
        this.a = fiseVar;
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int a(long j) {
        int a = this.b.a(j);
        return a <= 0 ? 1 - a : a;
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.fitb, defpackage.fird
    public final int d() {
        return 1;
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
        fite.c(this, i, 1, c());
        if (this.a.Y(j) <= 0) {
            i = 1 - i;
        }
        return super.h(j, i);
    }

    @Override // defpackage.fitb, defpackage.fird
    public final firl s() {
        return this.a.h;
    }
}

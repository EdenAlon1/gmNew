package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fitq extends fitb {
    public fitq(fird firdVar, firf firfVar) {
        super(firdVar, firfVar);
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int a(long j) {
        int a = this.b.a(j);
        return a == 0 ? c() : a;
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int c() {
        return this.b.c() + 1;
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
        int c = c();
        fite.c(this, i, 1, c);
        if (i == c) {
            i = 0;
        }
        return this.b.h(j, i);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final firl r() {
        return this.b.r();
    }

    @Override // defpackage.fisz, defpackage.fird
    public final boolean t(long j) {
        return this.b.t(j);
    }
}

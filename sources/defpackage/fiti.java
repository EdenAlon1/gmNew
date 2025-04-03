package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiti extends fitb {
    private final int a;
    private final int c;
    private final int d;

    public fiti(fird firdVar, firf firfVar) {
        this(firdVar, firfVar, 1);
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int a(long j) {
        return this.b.a(j) + this.a;
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int c() {
        return this.d;
    }

    @Override // defpackage.fitb, defpackage.fird
    public final int d() {
        return this.c;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long e(long j, int i) {
        long e = super.e(j, i);
        fite.c(this, a(e), this.c, this.d);
        return e;
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
        fite.c(this, i, this.c, this.d);
        return super.h(j, i - this.a);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final firl r() {
        return this.b.r();
    }

    @Override // defpackage.fisz, defpackage.fird
    public final boolean t(long j) {
        return this.b.t(j);
    }

    public fiti(fird firdVar, firf firfVar, int i) {
        super(firdVar, firfVar);
        this.a = i;
        if (firdVar.d() + i > Integer.MIN_VALUE) {
            this.c = firdVar.d() + i;
        } else {
            this.c = Integer.MIN_VALUE;
        }
        if (firdVar.c() + i < Integer.MAX_VALUE) {
            this.d = firdVar.c() + i;
        } else {
            this.d = Alert.DURATION_SHOW_INDEFINITELY;
        }
    }
}

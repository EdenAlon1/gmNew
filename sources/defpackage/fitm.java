package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fitm extends fitb {
    final firl a;
    final firl c;

    public fitm(fird firdVar, firl firlVar, firf firfVar) {
        super(firdVar, firfVar);
        this.c = firlVar;
        this.a = firdVar.q();
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int a(long j) {
        int a = this.b.a(j);
        return a >= 0 ? a % 100 : ((a + 1) % 100) + 99;
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int c() {
        return 99;
    }

    @Override // defpackage.fitb, defpackage.fird
    public final int d() {
        return 0;
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
        fite.c(this, i, 0, 99);
        int a = this.b.a(j);
        return this.b.h(j, ((a >= 0 ? a / 100 : ((a + 1) / 100) - 1) * 100) + i);
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final firl q() {
        return this.a;
    }

    @Override // defpackage.fitb, defpackage.fird
    public final firl s() {
        return this.c;
    }

    public fitm(fitd fitdVar, firf firfVar) {
        this(fitdVar, fitdVar.b.q(), firfVar);
    }

    public fitm(fitd fitdVar, firl firlVar, firf firfVar) {
        super(fitdVar.b, firfVar);
        int i = fitdVar.a;
        this.a = firlVar;
        this.c = fitdVar.c;
    }
}

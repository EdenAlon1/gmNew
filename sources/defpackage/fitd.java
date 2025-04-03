package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fitd extends fitb {
    final int a;
    final firl c;
    final firl d;
    private final int e;
    private final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fitd(fird firdVar, firf firfVar) {
        super(firdVar, firfVar);
        firl s = firdVar.s();
        firl q = firdVar.q();
        if (q == null) {
            this.c = null;
        } else {
            this.c = new fitn(q, ((fire) firfVar).a);
        }
        this.d = s;
        this.a = 100;
        int d = firdVar.d();
        int i = d >= 0 ? d / 100 : ((d + 1) / 100) - 1;
        int c = firdVar.c();
        int i2 = c >= 0 ? c / 100 : ((c + 1) / 100) - 1;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int a(long j) {
        int a = this.b.a(j);
        return a >= 0 ? a / 100 : ((a + 1) / 100) - 1;
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final int c() {
        return this.f;
    }

    @Override // defpackage.fitb, defpackage.fird
    public final int d() {
        return this.e;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long e(long j, int i) {
        return this.b.e(j, i * 100);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long f(long j) {
        return h(j, a(this.b.f(j)));
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final long g(long j) {
        int a = a(j) * 100;
        fird firdVar = this.b;
        return firdVar.g(firdVar.h(j, a));
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final long h(long j, int i) {
        fite.c(this, i, this.e, this.f);
        int a = this.b.a(j);
        return this.b.h(j, (i * 100) + (a >= 0 ? a % 100 : ((a + 1) % 100) + 99));
    }

    @Override // defpackage.fitb, defpackage.fisz, defpackage.fird
    public final firl q() {
        return this.c;
    }

    @Override // defpackage.fitb, defpackage.fird
    public final firl s() {
        firl firlVar = this.d;
        return firlVar != null ? firlVar : super.s();
    }
}

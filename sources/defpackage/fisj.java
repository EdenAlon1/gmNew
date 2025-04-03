package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisj extends fitk {
    private final fise b;

    public fisj(fise fiseVar, firl firlVar) {
        super(firf.l, firlVar);
        this.b = fiseVar;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int a(long j) {
        return this.b.U(j);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int c() {
        return 53;
    }

    @Override // defpackage.fitk, defpackage.fird
    public final int d() {
        return 1;
    }

    @Override // defpackage.fitk, defpackage.fisz, defpackage.fird
    public final long f(long j) {
        return super.f(j + 259200000);
    }

    @Override // defpackage.fitk, defpackage.fisz, defpackage.fird
    public final long g(long j) {
        return super.g(j + 259200000) - 259200000;
    }

    @Override // defpackage.fird
    public final firl s() {
        return this.b.e;
    }

    @Override // defpackage.fisz
    public final int w(long j) {
        fise fiseVar = this.b;
        return fiseVar.W(fiseVar.X(j));
    }

    @Override // defpackage.fitk
    protected final int x(long j, int i) {
        if (i > 52) {
            return w(j);
        }
        return 52;
    }
}

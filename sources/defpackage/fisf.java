package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisf extends fitk {
    private final fise b;

    public fisf(fise fiseVar, firl firlVar) {
        super(firf.i, firlVar);
        this.b = fiseVar;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int a(long j) {
        fise fiseVar = this.b;
        int Y = fiseVar.Y(j);
        return fiseVar.N(j, Y, fiseVar.T(j, Y));
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int c() {
        return 31;
    }

    @Override // defpackage.fitk, defpackage.fird
    public final int d() {
        return 1;
    }

    @Override // defpackage.fird
    public final firl s() {
        return this.b.f;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final boolean t(long j) {
        return this.b.af(j);
    }

    @Override // defpackage.fisz
    public final int w(long j) {
        return this.b.Q(j);
    }

    @Override // defpackage.fitk
    protected final int x(long j, int i) {
        if (i > 28 || i <= 0) {
            return this.b.Q(j);
        }
        return 28;
    }
}

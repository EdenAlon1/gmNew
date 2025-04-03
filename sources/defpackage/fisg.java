package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisg extends fitk {
    private final fise b;

    public fisg(fise fiseVar, firl firlVar) {
        super(firf.g, firlVar);
        this.b = fiseVar;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int a(long j) {
        fise fiseVar = this.b;
        return fiseVar.P(j, fiseVar.Y(j));
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int c() {
        return 366;
    }

    @Override // defpackage.fitk, defpackage.fird
    public final int d() {
        return 1;
    }

    @Override // defpackage.fird
    public final firl s() {
        return this.b.g;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final boolean t(long j) {
        return this.b.af(j);
    }

    @Override // defpackage.fisz
    public final int w(long j) {
        fise fiseVar = this.b;
        return fiseVar.ag(fiseVar.Y(j)) ? 366 : 365;
    }

    @Override // defpackage.fitk
    protected final int x(long j, int i) {
        if (i > 365 || i <= 0) {
            return w(j);
        }
        return 365;
    }
}

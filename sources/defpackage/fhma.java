package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhma extends fhmg {
    final fhmt a;
    long b;

    public fhma(long j) {
        fhmt fhmtVar = new fhmt();
        this.a = fhmtVar;
        this.b = -1L;
        f(fhmtVar, j);
    }

    @Override // defpackage.fhmg, defpackage.fhgz
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fhgz
    public final void c(fhmu fhmuVar) {
        fhmt fhmtVar = this.a;
        fhmtVar.H(fhmuVar.q(), 0L, fhmtVar.b);
    }

    @Override // defpackage.fhmg
    public final fhgv e(fhgv fhgvVar) {
        if (fhgvVar.a("Content-Length") != null) {
            return fhgvVar;
        }
        this.e.close();
        this.b = this.a.b;
        fhgu fhguVar = new fhgu(fhgvVar);
        fhguVar.e("Transfer-Encoding");
        fhguVar.b("Content-Length", Long.toString(this.a.b));
        return fhguVar.a();
    }
}

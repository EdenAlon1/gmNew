package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nfd extends nda {
    private final long a;

    public nfd(ncp ncpVar, long j) {
        super(ncpVar);
        lti.a(((nce) ncpVar).b >= j);
        this.a = j;
    }

    @Override // defpackage.nda, defpackage.ncp
    public final long d() {
        return super.d() - this.a;
    }

    @Override // defpackage.nda, defpackage.ncp
    public final long e() {
        return super.e() - this.a;
    }

    @Override // defpackage.nda, defpackage.ncp
    public final long f() {
        return super.f() - this.a;
    }
}

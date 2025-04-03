package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class niz implements nje {
    private final ncz b;
    private final ncy c;
    public long a = -1;
    private long d = -1;

    public niz(ncz nczVar, ncy ncyVar) {
        this.b = nczVar;
        this.c = ncyVar;
    }

    @Override // defpackage.nje
    public final long a(ncp ncpVar) {
        long j = this.d;
        if (j < 0) {
            return -1L;
        }
        this.d = -1L;
        return -(j + 2);
    }

    @Override // defpackage.nje
    public final ndn b() {
        lti.c(this.a != -1);
        return new ncx(this.b, this.a);
    }

    @Override // defpackage.nje
    public final void c(long j) {
        long[] jArr = this.c.a;
        this.d = jArr[lvf.ak(jArr, j, true)];
    }
}

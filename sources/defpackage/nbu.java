package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbu implements ndn {
    public final nbx a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    private final long f;

    public nbu(nbx nbxVar, long j, long j2, long j3, long j4, long j5) {
        this.a = nbxVar;
        this.f = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        ndo ndoVar = new ndo(j, nbw.a(this.a.a(j), 0L, this.b, this.c, this.d, this.e));
        return new ndl(ndoVar, ndoVar);
    }

    @Override // defpackage.ndn
    public final long w() {
        return this.f;
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return true;
    }
}

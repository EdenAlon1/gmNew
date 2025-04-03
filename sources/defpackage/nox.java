package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nox implements ndn {
    public final long a;
    private final nou b;
    private final int c;
    private final long d;
    private final long e;

    public nox(nou nouVar, int i, long j, long j2) {
        this.b = nouVar;
        this.c = i;
        this.d = j;
        long j3 = (j2 - j) / nouVar.d;
        this.e = j3;
        this.a = d(j3);
    }

    private final long d(long j) {
        return lvf.w(j * this.c, 1000000L, this.b.c);
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        long q = lvf.q((this.b.c * j) / (this.c * 1000000), 0L, this.e - 1);
        long d = d(q);
        ndo ndoVar = new ndo(d, this.d + (this.b.d * q));
        if (d >= j || q == this.e - 1) {
            return new ndl(ndoVar, ndoVar);
        }
        long j2 = q + 1;
        return new ndl(ndoVar, new ndo(d(j2), this.d + (j2 * this.b.d)));
    }

    @Override // defpackage.ndn
    public final long w() {
        return this.a;
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return true;
    }
}

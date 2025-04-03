package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ncd implements ndn {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public ncd(long j, long j2, int i, int i2) {
        long e;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            e = -9223372036854775807L;
        } else {
            this.d = j - j2;
            e = e(j, j2, i);
        }
        this.f = e;
    }

    private static long e(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            ndo ndoVar = new ndo(0L, this.b);
            return new ndl(ndoVar, ndoVar);
        }
        long j3 = this.c;
        long j4 = (((this.e * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            j4 = Math.min(j4, j2 - j3);
        }
        long max = this.b + Math.max(j4, 0L);
        long d = d(max);
        ndo ndoVar2 = new ndo(d, max);
        if (this.d != -1 && d < j) {
            long j5 = max + this.c;
            if (j5 < this.a) {
                return new ndl(ndoVar2, new ndo(d(j5), j5));
            }
        }
        return new ndl(ndoVar2, ndoVar2);
    }

    public final long d(long j) {
        return e(j, this.b, this.e);
    }

    @Override // defpackage.ndn
    public final long w() {
        return this.f;
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return this.d != -1;
    }
}

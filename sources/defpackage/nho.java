package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nho implements nhl {
    private final long a;
    private final int b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;
    private final long[] g;

    public nho(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    private final long d(int i) {
        return (this.c * i) / 100;
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        if (!y()) {
            ndo ndoVar = new ndo(0L, this.a + this.b);
            return new ndl(ndoVar, ndoVar);
        }
        long q = lvf.q(j, 0L, this.c);
        double d = (q * 100.0d) / this.c;
        double d2 = eobe.a;
        if (d > eobe.a) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.g;
                lti.g(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j2 = this.e;
        ndo ndoVar2 = new ndo(q, this.a + lvf.q(Math.round((d2 / 256.0d) * j2), this.b, j2 - 1));
        return new ndl(ndoVar2, ndoVar2);
    }

    @Override // defpackage.nhl
    public final int e() {
        return this.d;
    }

    @Override // defpackage.nhl
    public final long f() {
        return this.f;
    }

    @Override // defpackage.nhl
    public final long g(long j) {
        if (!y()) {
            return 0L;
        }
        long j2 = j - this.a;
        if (j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        lti.g(jArr);
        double d = (j2 * 256.0d) / this.e;
        int ak = lvf.ak(jArr, (long) d, true);
        long d2 = d(ak);
        long j3 = jArr[ak];
        int i = ak + 1;
        long d3 = d(i);
        return d2 + Math.round((j3 == (ak == 99 ? 256L : jArr[i]) ? eobe.a : (d - j3) / (r0 - j3)) * (d3 - d2));
    }

    @Override // defpackage.ndn
    public final long w() {
        return this.c;
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return this.g != null;
    }
}

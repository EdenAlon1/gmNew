package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhm implements nhl {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;
    private final int e;

    public nhm(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        long[] jArr = this.a;
        int ak = lvf.ak(jArr, j, true);
        ndo ndoVar = new ndo(jArr[ak], this.b[ak]);
        if (ndoVar.b < j) {
            long[] jArr2 = this.a;
            if (ak != jArr2.length - 1) {
                int i = ak + 1;
                return new ndl(ndoVar, new ndo(jArr2[i], this.b[i]));
            }
        }
        return new ndl(ndoVar, ndoVar);
    }

    @Override // defpackage.nhl
    public final int e() {
        return this.e;
    }

    @Override // defpackage.nhl
    public final long f() {
        return this.d;
    }

    @Override // defpackage.nhl
    public final long g(long j) {
        return this.a[lvf.ak(this.b, j, true)];
    }

    @Override // defpackage.ndn
    public final long w() {
        return this.c;
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return true;
    }
}

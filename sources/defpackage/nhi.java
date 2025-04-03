package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhi implements nhl {
    private final long[] a;
    private final long[] b;
    private final long c;

    public nhi(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? lvf.u(jArr2[jArr2.length - 1]) : j;
    }

    private static Pair d(long j, long[] jArr, long[] jArr2) {
        int ak = lvf.ak(jArr, j, true);
        long j2 = jArr[ak];
        long j3 = jArr2[ak];
        int i = ak + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? eobe.a : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        Pair d = d(lvf.z(lvf.q(j, 0L, this.c)), this.b, this.a);
        ndo ndoVar = new ndo(lvf.u(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new ndl(ndoVar, ndoVar);
    }

    @Override // defpackage.nhl
    public final int e() {
        return -2147483647;
    }

    @Override // defpackage.nhl
    public final long f() {
        return -1L;
    }

    @Override // defpackage.nhl
    public final long g(long j) {
        return lvf.u(((Long) d(j, this.a, this.b).second).longValue());
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

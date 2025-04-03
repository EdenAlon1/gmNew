package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncc implements ndn {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public ncc(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        long[] jArr = this.e;
        int ak = lvf.ak(jArr, j, true);
        ndo ndoVar = new ndo(jArr[ak], this.c[ak]);
        if (ndoVar.b >= j || ak == this.a - 1) {
            return new ndl(ndoVar, ndoVar);
        }
        int i = ak + 1;
        return new ndl(ndoVar, new ndo(this.e[i], this.c[i]));
    }

    public final String toString() {
        long[] jArr = this.d;
        long[] jArr2 = this.e;
        long[] jArr3 = this.c;
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
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

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class niv {
    public final nis a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public niv(nis nisVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        lti.a(length == length2);
        int length3 = jArr.length;
        lti.a(length3 == length2);
        int length4 = iArr2.length;
        lti.a(length4 == length2);
        this.a = nisVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        for (int ak = lvf.ak(this.f, j, false); ak >= 0; ak--) {
            if ((this.g[ak] & 1) != 0) {
                return ak;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int aj = lvf.aj(this.f, j, true); aj < this.f.length; aj++) {
            if ((this.g[aj] & 1) != 0) {
                return aj;
            }
        }
        return -1;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqi {
    public final int a;
    public final long[] b;
    public final Object[] c;

    public hqi(int i, long[] jArr, Object[] objArr) {
        this.a = i;
        this.b = jArr;
        this.c = objArr;
    }

    public final int a(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = this.b[0];
            if (j2 == j) {
                return 0;
            }
            return j2 <= j ? -1 : -2;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = this.b[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }
}

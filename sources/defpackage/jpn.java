package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpn {
    public static final long a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            jwo.b("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long b(long j, int i) {
        int a = jpm.a(j);
        if (a < 0) {
            a = 0;
        }
        if (a > i) {
            a = i;
        }
        int e = jpm.e(j);
        int i2 = e >= 0 ? e : 0;
        if (i2 <= i) {
            i = i2;
        }
        return (i == jpm.e(j) && a == jpm.a(j)) ? j : a(i, a);
    }
}

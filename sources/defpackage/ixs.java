package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixs {
    public static final int a(long j, int i) {
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static final long b(int i, int i2, int i3, int i4) {
        return c(i2, 1) | c(i, 0) | c(i3, 2) | c(i4, 3) | Long.MIN_VALUE;
    }

    private static final long c(int i, int i2) {
        return (i & 32767) << (i2 * 15);
    }
}

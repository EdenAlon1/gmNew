package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflz {
    public static final int a(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final int b(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static final String c(Object obj, Object obj2) {
        return a.k(obj2, obj, "Random range is empty: [", ", ", ").");
    }

    public static final ffly d(long j) {
        return new ffma((int) j, (int) (j >> 32));
    }
}

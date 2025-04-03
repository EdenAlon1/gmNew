package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxi {
    public static int a(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static int b(long j) {
        return c(j >>> 1);
    }

    public static int c(long j) {
        long j2 = j & 6148914691236517205L;
        long j3 = (j2 | (j2 >>> 1)) & 3689348814741910323L;
        long j4 = (j3 | (j3 >>> 2)) & 1085102592571150095L;
        long j5 = (j4 | (j4 >>> 4)) & 71777214294589695L;
        long j6 = (j5 | (j5 >>> 8)) & 281470681808895L;
        return (int) (j6 | (j6 >>> 16));
    }
}

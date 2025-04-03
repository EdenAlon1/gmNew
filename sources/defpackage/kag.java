package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kag {
    public static final long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long b(long j) {
        return ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
    }

    public static final long c(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final long d(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }
}

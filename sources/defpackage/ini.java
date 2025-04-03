package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ini implements inp {
    @Override // defpackage.inp
    public final long a(long j, long j2) {
        float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long floatToRawIntBits = Float.floatToRawIntBits(max);
        long floatToRawIntBits2 = Float.floatToRawIntBits(max);
        int i = iqu.a;
        return (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
    }
}

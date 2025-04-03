package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ink implements inp {
    @Override // defpackage.inp
    public final long a(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
        long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
        int i = iqu.a;
        return (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
    }
}

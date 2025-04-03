package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inn implements inp {
    @Override // defpackage.inp
    public final long a(long j, long j2) {
        long j3;
        long j4;
        if (Float.intBitsToFloat((int) (j >> 32)) > Float.intBitsToFloat((int) (j2 >> 32)) || Float.intBitsToFloat((int) (j & 4294967295L)) > Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            float a = inq.a(j, j2);
            long floatToRawIntBits = Float.floatToRawIntBits(a);
            long floatToRawIntBits2 = Float.floatToRawIntBits(a);
            j3 = floatToRawIntBits << 32;
            j4 = floatToRawIntBits2 & 4294967295L;
            int i = iqu.a;
        } else {
            j3 = Float.floatToRawIntBits(1.0f) << 32;
            j4 = Float.floatToRawIntBits(1.0f) & 4294967295L;
            int i2 = iqu.a;
        }
        return j3 | j4;
    }
}

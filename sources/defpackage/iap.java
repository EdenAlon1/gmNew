package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iap {
    public static final iao a(iam iamVar, long j, long j2, long j3, long j4) {
        return new iao(iamVar.b, iamVar.c, iamVar.d, iamVar.e, j, j2, j3, j4);
    }

    public static final iao b(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new iao(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final boolean c(iao iaoVar) {
        long j = iaoVar.e;
        return (j >>> 32) == (4294967295L & j) && j == iaoVar.f && j == iaoVar.g && j == iaoVar.h;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ids {
    public static final long a(float f, float f2) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        long floatToRawIntBits2 = Float.floatToRawIntBits(f2);
        long j = idr.a;
        return (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ins implements inp {
    private final float b = 1.0f;

    @Override // defpackage.inp
    public final long a(long j, long j2) {
        long floatToRawIntBits = Float.floatToRawIntBits(1.0f);
        long floatToRawIntBits2 = Float.floatToRawIntBits(1.0f);
        int i = iqu.a;
        return (floatToRawIntBits << 32) | (4294967295L & floatToRawIntBits2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ins)) {
            return false;
        }
        float f = ((ins) obj).b;
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}

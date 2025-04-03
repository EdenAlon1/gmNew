package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imm {
    private final float a;
    private final float b;
    private final long c;
    private final int d;

    public imm(float f, float f2, long j, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof imm)) {
            return false;
        }
        imm immVar = (imm) obj;
        return immVar.a == this.a && immVar.b == this.b && immVar.c == this.c && immVar.d == this.d;
    }

    public final int hashCode() {
        int floatToIntBits = (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        long j = this.c;
        return (((floatToIntBits * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.d;
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ",deviceId=" + this.d + ')';
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huq implements huo {
    private final float b;
    private final float c = -1.0f;

    public huq(float f) {
        this.b = f;
    }

    @Override // defpackage.huo
    public final long a(long j, long j2, kah kahVar) {
        long j3 = ((-((int) (j >> 32))) << 32) | ((-((int) (j & 4294967295L))) & 4294967295L);
        return (Math.round((((int) (j3 & 4294967295L)) / 2.0f) * 0.0f) & 4294967295L) | (Math.round((((int) (j3 >> 32)) / 2.0f) * (this.b + 1.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huq)) {
            return false;
        }
        huq huqVar = (huq) obj;
        if (Float.compare(this.b, huqVar.b) != 0) {
            return false;
        }
        float f = huqVar.c;
        return Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(-1.0f);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.b + ", verticalBias=-1.0)";
    }
}

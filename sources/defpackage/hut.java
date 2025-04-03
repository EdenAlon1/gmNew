package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hut implements huo {
    private final float b;
    private final float c;

    public hut(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.huo
    public final long a(long j, long j2, kah kahVar) {
        float f = kahVar == kah.a ? this.b : -this.b;
        return (Math.round(((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) * (this.c + 1.0f)) & 4294967295L) | (Math.round(((((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f) * (f + 1.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hut)) {
            return false;
        }
        hut hutVar = (hut) obj;
        return Float.compare(this.b, hutVar.b) == 0 && Float.compare(this.c, hutVar.c) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.b + ", verticalBias=" + this.c + ')';
    }
}

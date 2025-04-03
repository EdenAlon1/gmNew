package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuj {
    public final float a;
    public final float b;
    public final long c;

    public cuj(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuj)) {
            return false;
        }
        cuj cujVar = (cuj) obj;
        return Float.compare(this.a, cujVar.a) == 0 && Float.compare(this.b, cujVar.b) == 0 && this.c == cujVar.c;
    }

    public final int hashCode() {
        int floatToIntBits = (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        long j = this.c;
        return (floatToIntBits * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}

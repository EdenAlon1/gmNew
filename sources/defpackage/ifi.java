package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifi {
    public final float a;
    public final float b;

    public ifi(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifi)) {
            return false;
        }
        ifi ifiVar = (ifi) obj;
        return Float.compare(this.a, ifiVar.a) == 0 && Float.compare(this.b, ifiVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.a + ", y=" + this.b + ')';
    }
}

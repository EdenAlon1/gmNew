package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phd extends phe {
    private final float b;
    private final float c;

    public phd(float f, float f2) {
        this.b = f;
        this.c = f2;
        double d = f;
        if (d <= eobe.a || d >= 1.0d) {
            throw new IllegalArgumentException("minRatio must be in the interval (0.0, 1.0)");
        }
        double d2 = f2;
        if (d2 <= eobe.a || d2 >= 1.0d) {
            throw new IllegalArgumentException("maxRatio must be in the interval (0.0, 1.0)");
        }
        if (f > f2) {
            throw new IllegalArgumentException("minRatio must be less than or equal to maxRatio");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phd)) {
            return false;
        }
        phd phdVar = (phd) obj;
        return this.b == phdVar.b && this.c == phdVar.c;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "SplitRatioDragRange[" + this.b + ", " + this.c + ']';
    }
}

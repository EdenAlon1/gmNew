package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpy {
    public final float a;
    public final float b;

    public cpy(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpy)) {
            return false;
        }
        cpy cpyVar = (cpy) obj;
        return Float.compare(this.a, cpyVar.a) == 0 && Float.compare(this.b, cpyVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ')';
    }
}

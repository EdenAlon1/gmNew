package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihv extends ihy {
    public final float a;
    public final float b;

    public ihv(float f, float f2) {
        super(false, true, 1);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihv)) {
            return false;
        }
        ihv ihvVar = (ihv) obj;
        return Float.compare(this.a, ihvVar.a) == 0 && Float.compare(this.b, ihvVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.a + ", dy=" + this.b + ')';
    }
}

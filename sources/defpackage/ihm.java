package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihm extends ihy {
    public final float a;
    public final float b;

    public ihm(float f, float f2) {
        super(false, true, 1);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihm)) {
            return false;
        }
        ihm ihmVar = (ihm) obj;
        return Float.compare(this.a, ihmVar.a) == 0 && Float.compare(this.b, ihmVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "ReflectiveQuadTo(x=" + this.a + ", y=" + this.b + ')';
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jys {
    public static final jys a = new jys(1.0f, 0.0f);
    public final float b;
    public final float c;

    public jys(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jys)) {
            return false;
        }
        jys jysVar = (jys) obj;
        return this.b == jysVar.b && this.c == jysVar.c;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.b + ", skewX=" + this.c + ')';
    }

    public jys() {
        this(1.0f, 0.0f);
    }
}

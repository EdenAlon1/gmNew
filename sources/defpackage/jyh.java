package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyh {
    public static final jyh a = new jyh(jye.b, 17, 0);
    public final float b;
    public final int c;
    public final int d;

    public jyh(float f, int i, int i2) {
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyh)) {
            return false;
        }
        float f = this.b;
        jyh jyhVar = (jyh) obj;
        float f2 = jyhVar.b;
        float f3 = jye.a;
        return Float.compare(f, f2) == 0 && this.c == jyhVar.c && jyf.b(this.d, jyhVar.d);
    }

    public final int hashCode() {
        float f = jye.a;
        return (((Float.floatToIntBits(this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "LineHeightStyle(alignment=" + ((Object) jye.a(this.b)) + ", trim=" + ((Object) jyg.a(this.c)) + ",mode=" + ((Object) jyf.a(this.d)) + ')';
    }

    public jyh(float f, int i) {
        this(f, i, 0);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class der {
    public final float a;
    public final ibq b;

    public der(float f, ibq ibqVar) {
        this.a = f;
        this.b = ibqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof der)) {
            return false;
        }
        der derVar = (der) obj;
        return jzq.b(this.a, derVar.a) && ffkj.e(this.b, derVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) jzq.a(this.a)) + ", brush=" + this.b + ')';
    }
}

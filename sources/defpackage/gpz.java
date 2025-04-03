package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpz {
    public final float a;
    public final float b;
    private final float c;

    public gpz(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final float a() {
        return this.a + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpz)) {
            return false;
        }
        gpz gpzVar = (gpz) obj;
        return jzq.b(this.a, gpzVar.a) && jzq.b(this.b, gpzVar.b) && jzq.b(this.c, gpzVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "TabPosition(left=" + ((Object) jzq.a(this.a)) + ", right=" + ((Object) jzq.a(a())) + ", width=" + ((Object) jzq.a(this.b)) + ", contentWidth=" + ((Object) jzq.a(this.c)) + ')';
    }
}

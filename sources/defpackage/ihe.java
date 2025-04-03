package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihe extends ihy {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final float g;

    public ihe(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(false, false, 3);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihe)) {
            return false;
        }
        ihe iheVar = (ihe) obj;
        return Float.compare(this.a, iheVar.a) == 0 && Float.compare(this.b, iheVar.b) == 0 && Float.compare(this.c, iheVar.c) == 0 && this.d == iheVar.d && this.e == iheVar.e && Float.compare(this.f, iheVar.f) == 0 && Float.compare(this.g, iheVar.g) == 0;
    }

    public final int hashCode() {
        int floatToIntBits = (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
        float f = this.f;
        return (((((((floatToIntBits * 31) + ihd.a(this.d)) * 31) + ihd.a(this.e)) * 31) + Float.floatToIntBits(f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final String toString() {
        return "ArcTo(horizontalEllipseRadius=" + this.a + ", verticalEllipseRadius=" + this.b + ", theta=" + this.c + ", isMoreThanHalf=" + this.d + ", isPositiveArc=" + this.e + ", arcStartX=" + this.f + ", arcStartY=" + this.g + ')';
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxd {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final float g;

    public gxd(float f, float f2, float f3, boolean z, boolean z2, boolean z3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxd)) {
            return false;
        }
        gxd gxdVar = (gxd) obj;
        return Float.compare(this.a, gxdVar.a) == 0 && Float.compare(this.b, gxdVar.b) == 0 && Float.compare(this.c, gxdVar.c) == 0 && this.d == gxdVar.d && this.e == gxdVar.e && this.f == gxdVar.f && Float.compare(this.g, gxdVar.g) == 0;
    }

    public final int hashCode() {
        int floatToIntBits = (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
        float f = this.g;
        boolean z = this.f;
        return (((((((floatToIntBits * 31) + gxc.a(this.d)) * 31) + gxc.a(this.e)) * 31) + gxc.a(z)) * 31) + Float.floatToIntBits(f);
    }

    public final String toString() {
        return "Keyline(size=" + this.a + ", offset=" + this.b + ", unadjustedOffset=" + this.c + ", isFocal=" + this.d + ", isAnchor=" + this.e + ", isPivot=" + this.f + ", cutoff=" + this.g + ')';
    }
}

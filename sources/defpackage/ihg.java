package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihg extends ihy {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ihg(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false, 2);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihg)) {
            return false;
        }
        ihg ihgVar = (ihg) obj;
        return Float.compare(this.a, ihgVar.a) == 0 && Float.compare(this.b, ihgVar.b) == 0 && Float.compare(this.c, ihgVar.c) == 0 && Float.compare(this.d, ihgVar.d) == 0 && Float.compare(this.e, ihgVar.e) == 0 && Float.compare(this.f, ihgVar.f) == 0;
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        return "CurveTo(x1=" + this.a + ", y1=" + this.b + ", x2=" + this.c + ", y2=" + this.d + ", x3=" + this.e + ", y3=" + this.f + ')';
    }
}

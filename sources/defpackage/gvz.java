package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvz {
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final float e;
    public final int f;
    private final int g;

    public gvz(int i, float f, int i2, float f2, int i3, float f3, int i4) {
        this.g = i;
        this.a = f;
        this.b = i2;
        this.c = f2;
        this.d = i3;
        this.e = f3;
        this.f = i4;
    }

    public final float a(float f) {
        int i = this.f;
        if (i > 0 && this.b > 0 && this.d > 0) {
            float f2 = this.e;
            float f3 = this.c;
            if (f2 <= f3 || f3 <= this.a) {
                return Float.MAX_VALUE;
            }
        } else if (i > 0 && this.b > 0 && this.e <= this.a) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f - this.e) * this.g;
    }

    public final int b() {
        return this.f + this.d + this.b;
    }
}

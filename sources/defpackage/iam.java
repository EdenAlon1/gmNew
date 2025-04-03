package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iam {
    public static final iam a = new iam(0.0f, 0.0f, 0.0f, 0.0f);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public iam(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public static /* synthetic */ iam j(iam iamVar, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = iamVar.b;
        }
        float f4 = (i & 2) != 0 ? iamVar.c : 0.0f;
        if ((i & 4) != 0) {
            f2 = iamVar.d;
        }
        if ((i & 8) != 0) {
            f3 = iamVar.e;
        }
        return new iam(f, f4, f2, f3);
    }

    public final long a() {
        float f = this.d;
        float f2 = this.b;
        long floatToRawIntBits = Float.floatToRawIntBits(f2 + ((f - f2) / 2.0f));
        float f3 = this.e;
        float f4 = this.c;
        return (floatToRawIntBits << 32) | (Float.floatToRawIntBits(f4 + ((f3 - f4) / 2.0f)) & 4294967295L);
    }

    public final long b() {
        return (Float.floatToRawIntBits(this.d - this.b) << 32) | (Float.floatToRawIntBits(this.e - this.c) & 4294967295L);
    }

    public final long c() {
        return (Float.floatToRawIntBits(this.b) << 32) | (Float.floatToRawIntBits(this.c) & 4294967295L);
    }

    public final iam d(iam iamVar) {
        return new iam(Math.max(this.b, iamVar.b), Math.max(this.c, iamVar.c), Math.min(this.d, iamVar.d), Math.min(this.e, iamVar.e));
    }

    public final iam e(float f, float f2) {
        float f3 = this.e;
        float f4 = this.d;
        return new iam(this.b + f, this.c + f2, f4 + f, f3 + f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iam)) {
            return false;
        }
        iam iamVar = (iam) obj;
        return Float.compare(this.b, iamVar.b) == 0 && Float.compare(this.c, iamVar.c) == 0 && Float.compare(this.d, iamVar.d) == 0 && Float.compare(this.e, iamVar.e) == 0;
    }

    public final iam f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new iam(this.b + Float.intBitsToFloat(i), this.c + Float.intBitsToFloat(i2), this.d + Float.intBitsToFloat(i), this.e + Float.intBitsToFloat(i2));
    }

    public final boolean g(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float f = this.b;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (intBitsToFloat < this.d) & (intBitsToFloat >= f) & (intBitsToFloat2 >= this.c) & (intBitsToFloat2 < this.e);
    }

    public final boolean h() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
    }

    public final boolean i(iam iamVar) {
        return (this.b < iamVar.d) & (iamVar.b < this.d) & (this.c < iamVar.e) & (iamVar.c < this.e);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + iag.a(this.b) + ", " + iag.a(this.c) + ", " + iag.a(this.d) + ", " + iag.a(this.e) + ')';
    }
}

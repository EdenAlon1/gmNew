package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iao {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        iap.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public iao(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iao)) {
            return false;
        }
        iao iaoVar = (iao) obj;
        return Float.compare(this.a, iaoVar.a) == 0 && Float.compare(this.b, iaoVar.b) == 0 && Float.compare(this.c, iaoVar.c) == 0 && Float.compare(this.d, iaoVar.d) == 0 && iae.b(this.e, iaoVar.e) && iae.b(this.f, iaoVar.f) && iae.b(this.g, iaoVar.g) && iae.b(this.h, iaoVar.h);
    }

    public final int hashCode() {
        int floatToIntBits = (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
        long j = this.h;
        long j2 = this.g;
        return (((((((floatToIntBits * 31) + iad.a(this.e)) * 31) + iad.a(this.f)) * 31) + iad.a(j2)) * 31) + iad.a(j);
    }

    public final String toString() {
        String str = iag.a(this.a) + ", " + iag.a(this.b) + ", " + iag.a(this.c) + ", " + iag.a(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean b = iae.b(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!b || !iae.b(j2, j3) || !iae.b(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) iae.a(j)) + ", topRight=" + ((Object) iae.a(j2)) + ", bottomRight=" + ((Object) iae.a(j3)) + ", bottomLeft=" + ((Object) iae.a(j4)) + ')';
        }
        long j5 = j >> 32;
        int i = (int) (j & 4294967295L);
        int i2 = (int) j5;
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
            return "RoundRect(rect=" + str + ", radius=" + iag.a(Float.intBitsToFloat(i2)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + iag.a(Float.intBitsToFloat(i2)) + ", y=" + iag.a(Float.intBitsToFloat(i)) + ')';
    }
}

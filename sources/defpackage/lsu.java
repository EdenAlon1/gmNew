package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsu {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    private final float[] e;

    public lsu(int i, int i2, float[] fArr) {
        lti.b(i > 0, "Input channel count must be positive.");
        lti.b(i2 > 0, "Output channel count must be positive.");
        lti.b(fArr.length == i * i2, "Coefficient array length is invalid.");
        this.a = i;
        this.b = i2;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (fArr[i3] < 0.0f) {
                throw new IllegalArgumentException(a.f(i3, "Coefficient at index ", " is negative."));
            }
        }
        this.e = fArr;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        int i4 = 0;
        while (i4 < i) {
            int i5 = 0;
            while (i5 < i2) {
                float a = a(i4, i5);
                boolean z4 = i4 == i5;
                if (a != 1.0f && z4) {
                    z3 = false;
                }
                if (a != 0.0f) {
                    z = false;
                    if (!z4) {
                        z2 = false;
                    }
                }
                i5++;
            }
            i4++;
        }
        this.c = z;
        this.d = this.a == this.b && z2 && z3;
    }

    public static lsu b(int i, int i2) {
        float[] fArr;
        if (i != i2) {
            int i3 = 2;
            if (i == 1) {
                if (i2 == 2) {
                    i2 = 2;
                    fArr = new float[]{1.0f, 1.0f};
                    i = 1;
                } else {
                    i = 1;
                }
            }
            int i4 = i;
            if (i != 2) {
                i3 = i;
            } else if (i2 == 1) {
                fArr = new float[]{0.5f, 0.5f};
                i = i4;
            }
            throw new UnsupportedOperationException(a.x(i2, i3, "Default channel mixing coefficients for ", "->", " are not yet implemented."));
        }
        fArr = new float[i2 * i2];
        for (int i5 = 0; i5 < i2; i5++) {
            fArr[(i2 * i5) + i5] = 1.0f;
        }
        return new lsu(i, i2, fArr);
    }

    public final float a(int i, int i2) {
        return this.e[(i * this.b) + i2];
    }
}

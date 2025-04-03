package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyh implements cym {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    public cyh(float f, float f2, float f3, float f4) {
        int a;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            czx.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        float[] fArr = new float[5];
        float f5 = (f4 - f2) * 3.0f;
        double d = f5;
        float f6 = (f2 + 0.0f) * 3.0f;
        double d2 = f6;
        double d3 = d + d;
        float f7 = (1.0f - f4) * 3.0f;
        double d4 = f7;
        double d5 = (d2 - d3) + d4;
        if (d5 == eobe.a) {
            a = d == d4 ? 0 : ibj.a((float) ((d3 - d4) / (d3 - (d4 + d4))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d * d) - (d4 * d2));
            double d7 = (-d2) + d;
            int a2 = ibj.a((float) ((-(d6 + d7)) / d5), fArr, 0);
            a = ibj.a((float) ((d6 - d7) / d5), fArr, a2) + a2;
            if (a > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    a = 1;
                }
            }
        }
        float f10 = f5 - f6;
        float f11 = f7 - f5;
        float f12 = f10 + f10;
        int a3 = a + ibj.a((-f12) / ((f11 + f11) - f12), fArr, a);
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i = 0; i < a3; i++) {
            float f13 = fArr[i];
            float f14 = ((((((((f2 - f4) * 3.0f) + 1.0f + 0.0f) * f13) + (((f4 - (f2 + f2)) + 0.0f) * 3.0f)) * f13) + f6) * f13) + 0.0f;
            min = Math.min(min, f14);
            max = Math.max(max, f14);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.e = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ef, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0222, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0226, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d1, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a2, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L12;
     */
    @Override // defpackage.cym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r25) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyh.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cyh)) {
            return false;
        }
        cyh cyhVar = (cyh) obj;
        return this.a == cyhVar.a && this.b == cyhVar.b && this.c == cyhVar.c && this.d == cyhVar.d;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ')';
    }
}

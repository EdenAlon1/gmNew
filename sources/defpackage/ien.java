package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ien extends idy {
    public ien() {
        super("Generic L*a*b*", 12884901890L, 15);
    }

    @Override // defpackage.idy
    public final float a(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // defpackage.idy
    public final float b(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // defpackage.idy
    public final float c(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
        float f5 = f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f);
        ifi ifiVar = iem.a;
        return f5 * iem.e[2];
    }

    @Override // defpackage.idy
    public final long d(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        float f4 = (f + 16.0f) / 116.0f;
        float f5 = (f2 * 0.002f) + f4;
        float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
        float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
        ifi ifiVar = iem.a;
        float f8 = f6 * iem.e[0];
        return (Float.floatToRawIntBits(f7 * r5[1]) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    @Override // defpackage.idy
    public final long e(float f, float f2, float f3, float f4, idy idyVar) {
        ifi ifiVar = iem.a;
        float[] fArr = iem.e;
        float f5 = f / fArr[0];
        float f6 = f2 / fArr[1];
        float f7 = f3 / fArr[2];
        float cbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
        float cbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
        float f8 = 116.0f * cbrt2;
        float f9 = cbrt - cbrt2;
        float cbrt3 = cbrt2 - (f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f);
        float f10 = f8 - 16.0f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        float f11 = f9 * 500.0f;
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f12 = cbrt3 * 200.0f;
        float f13 = f12 >= -128.0f ? f12 : -128.0f;
        return iby.f(f10, f11, f13 <= 128.0f ? f13 : 128.0f, f4, idyVar);
    }
}

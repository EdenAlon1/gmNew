package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koy {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public koy(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    static koy b(int i) {
        kpr kprVar = kpr.a;
        int i2 = koz.e;
        float a = koz.a(Color.red(i));
        float a2 = koz.a(Color.green(i));
        float a3 = koz.a(Color.blue(i));
        float[][] fArr = koz.d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[0] * a) + (fArr2[1] * a2);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[0] * a) + (fArr3[1] * a2);
        float[] fArr4 = fArr[2];
        float f3 = (a * fArr4[0]) + (a2 * fArr4[1]) + (a3 * fArr4[2]);
        float[] fArr5 = {f + (fArr2[2] * a3), f2 + (fArr3[2] * a3), f3};
        float[][] fArr6 = koz.a;
        float f4 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f5 = fArr7[0] * f4;
        float f6 = fArr5[1];
        float f7 = fArr7[1] * f6;
        float f8 = fArr7[2] * f3;
        float[] fArr8 = fArr6[1];
        float f9 = fArr8[0] * f4;
        float f10 = fArr8[1] * f6;
        float f11 = fArr8[2] * f3;
        float[] fArr9 = fArr6[2];
        float f12 = f4 * fArr9[0];
        float f13 = f6 * fArr9[1];
        float f14 = f3 * fArr9[2];
        float[] fArr10 = kprVar.g;
        float f15 = fArr10[0] * (f5 + f7 + f8);
        float f16 = fArr10[1] * (f9 + f10 + f11);
        float f17 = fArr10[2] * (f12 + f13 + f14);
        float pow = (float) Math.pow((kprVar.h * Math.abs(f15)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((kprVar.h * Math.abs(f16)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((kprVar.h * Math.abs(f17)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float atan2 = (((float) Math.atan2(((float) ((signum + signum2) - (d + d))) / 9.0f, ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f18 = signum2 * 20.0f;
        float f19 = (3.1415927f * atan2) / 180.0f;
        float f20 = (((((40.0f * signum) + f18) + signum3) / 20.0f) * kprVar.c) / kprVar.b;
        float f21 = kprVar.e;
        float pow4 = (float) Math.pow(f20, kprVar.j * 0.69f);
        float f22 = kprVar.e;
        float f23 = pow4 * 100.0f;
        float sqrt = ((float) Math.sqrt(f23 / 100.0f)) * 5.7971015f * (kprVar.b + 4.0f) * kprVar.i;
        float f24 = (((signum * 20.0f) + f18) + (signum3 * 21.0f)) / 20.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kprVar.f), 0.73d)) * ((float) Math.pow(((((((float) (Math.cos((((((double) atan2) < 20.14d ? atan2 + 360.0f : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kprVar.d) * ((float) Math.sqrt((r3 * r3) + (r0 * r0)))) / (f24 + 0.305f), 0.9d)) * ((float) Math.sqrt(f23 / 100.0d));
        float f25 = kprVar.i * pow5;
        float f26 = kprVar.e;
        float sqrt2 = (float) Math.sqrt((r9 * 0.69f) / (kprVar.b + 4.0f));
        double d2 = f19;
        float log = ((float) Math.log((0.0228f * f25) + 1.0f)) * 43.85965f;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        fArr5[0] = atan2;
        fArr5[1] = pow5;
        float f27 = log * sin;
        float[] fArr11 = {f23, sqrt, f25, sqrt2 * 50.0f, (1.7f * f23) / ((0.007f * f23) + 1.0f), cos * log, f27};
        return new koy(atan2, pow5, fArr11[0], fArr11[4], fArr11[5], f27);
    }

    public static koy c(float f, float f2, float f3) {
        kpr kprVar = kpr.a;
        float f4 = kprVar.e;
        double d = f / 100.0d;
        Math.sqrt(d);
        float f5 = kprVar.b;
        float f6 = kprVar.i * f2;
        float sqrt = (float) Math.sqrt(d);
        float f7 = kprVar.e;
        Math.sqrt(((f2 / sqrt) * 0.69f) / (kprVar.b + 4.0f));
        double d2 = (3.1415927f * f3) / 180.0f;
        float log = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        return new koy(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    final int a(kpr kprVar) {
        float f = this.b;
        float f2 = 0.0f;
        if (f != eobe.a) {
            double d = this.c;
            if (d != eobe.a) {
                f2 = f / ((float) Math.sqrt(d / 100.0d));
            }
        }
        float pow = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, kprVar.f), 0.73d), 1.1111111111111112d);
        double d2 = (this.a * 3.1415927f) / 180.0f;
        double cos = Math.cos(2.0d + d2) + 3.8d;
        float f3 = kprVar.e;
        float pow2 = kprVar.b * ((float) Math.pow(this.c / 100.0d, 1.4492753673265821d / kprVar.j));
        float f4 = ((float) cos) * 0.25f * 3846.1538f * kprVar.d;
        float f5 = pow2 / kprVar.c;
        float sin = (float) Math.sin(d2);
        float cos2 = (float) Math.cos(d2);
        float f6 = (((0.305f + f5) * 23.0f) * pow) / (((f4 * 23.0f) + ((11.0f * pow) * cos2)) + ((108.0f * pow) * sin));
        float f7 = cos2 * f6;
        float f8 = f6 * sin;
        float f9 = f5 * 460.0f;
        float max = (float) Math.max(eobe.a, (Math.abs(r2) * 27.13d) / (400.0d - Math.abs(r2)));
        float signum = Math.signum((((451.0f * f7) + f9) + (288.0f * f8)) / 1403.0f) * (100.0f / kprVar.h);
        float pow3 = (float) Math.pow(max, 2.380952380952381d);
        float max2 = (float) Math.max(eobe.a, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8)));
        float signum2 = Math.signum(((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f) * (100.0f / kprVar.h);
        float pow4 = (float) Math.pow(max2, 2.380952380952381d);
        float f10 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
        float max3 = (float) Math.max(eobe.a, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10)));
        float signum3 = Math.signum(f10) * (100.0f / kprVar.h);
        float pow5 = (float) Math.pow(max3, 2.380952380952381d);
        float[] fArr = kprVar.g;
        float f11 = (signum * pow3) / fArr[0];
        float f12 = (signum2 * pow4) / fArr[1];
        float f13 = (signum3 * pow5) / fArr[2];
        float[][] fArr2 = koz.b;
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f11;
        float f15 = fArr3[1] * f12;
        float f16 = fArr3[2] * f13;
        float[] fArr4 = fArr2[1];
        float f17 = fArr4[0] * f11;
        float f18 = fArr4[1] * f12;
        float f19 = fArr4[2] * f13;
        float[] fArr5 = fArr2[2];
        return kps.d(f14 + f15 + f16, f17 + f18 + f19, (f11 * fArr5[0]) + (f12 * fArr5[1]) + (f13 * fArr5[2]));
    }
}

package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdl {
    public static final hdm a(int i) {
        hdo hdoVar = hdo.a;
        float[][] fArr = hdn.a;
        double b = hdn.b((i >> 16) & PrivateKeyType.INVALID);
        float b2 = hdn.b((i >> 8) & PrivateKeyType.INVALID);
        float b3 = hdn.b(i & PrivateKeyType.INVALID);
        double[][] dArr = hdn.d;
        double[] dArr2 = dArr[0];
        double d = dArr2[0] * b;
        double d2 = b2;
        double d3 = dArr2[1] * d2;
        double d4 = b3;
        double d5 = dArr2[2] * d4;
        double[] dArr3 = dArr[1];
        double d6 = dArr3[0] * b;
        double d7 = dArr3[1] * d2;
        double d8 = dArr3[2] * d4;
        double[] dArr4 = dArr[2];
        float f = (float) ((b * dArr4[0]) + (d2 * dArr4[1]) + (d4 * dArr4[2]));
        float[] fArr2 = {(float) (d + d3 + d5), (float) (d6 + d7 + d8), f};
        float[][] fArr3 = hdn.a;
        float f2 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f3 = fArr4[0] * f2;
        float f4 = fArr2[1];
        float f5 = fArr4[1] * f4;
        float f6 = fArr4[2] * f;
        float[] fArr5 = fArr3[1];
        float f7 = fArr5[0] * f2;
        float f8 = fArr5[1] * f4;
        float f9 = fArr5[2] * f;
        float[] fArr6 = fArr3[2];
        float f10 = f2 * fArr6[0];
        float f11 = f4 * fArr6[1];
        float f12 = f * fArr6[2];
        float[] fArr7 = hdoVar.g;
        float f13 = fArr7[0] * (f3 + f5 + f6);
        float f14 = fArr7[1] * (f7 + f8 + f9);
        float f15 = fArr7[2] * (f10 + f11 + f12);
        float pow = (float) Math.pow((hdoVar.h * Math.abs(f13)) / 100.0f, 0.41999998688697815d);
        float pow2 = (float) Math.pow((hdoVar.h * Math.abs(f14)) / 100.0f, 0.41999998688697815d);
        float pow3 = (float) Math.pow((hdoVar.h * Math.abs(f15)) / 100.0f, 0.41999998688697815d);
        float signum = ((Math.signum(f13) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f14) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f15) * 400.0f) * pow3) / (pow3 + 27.13f);
        float atan2 = (((float) Math.atan2(((signum + signum2) - (signum3 + signum3)) / 9.0f, (((signum * 11.0f) + ((-12.0f) * signum2)) + signum3) / 11.0f)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = atan2;
        float f17 = (f16 * 3.1415927f) / 180.0f;
        float f18 = (((((40.0f * signum) + (signum2 * 20.0f)) + signum3) / 20.0f) * hdoVar.d) / hdoVar.c;
        float f19 = hdoVar.f;
        float pow4 = ((float) Math.pow(f18, hdoVar.j * 0.69000006f)) * 100.0f;
        float pow5 = ((float) Math.pow((((((((float) Math.cos((((((double) f16) < 20.14d ? 360.0f + f16 : f16) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * hdoVar.e) * ((float) Math.sqrt((r9 * r9) + (r2 * r2)))) / (((((signum * 20.0f) + r4) + (signum3 * 21.0f)) / 20.0f) + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, hdoVar.b)), 0.7300000190734863d)) * ((float) Math.sqrt(pow4 / 100.0f));
        float f20 = hdoVar.i * pow5;
        float f21 = hdoVar.f;
        Math.sqrt((r0 * 0.69000006f) / (hdoVar.c + 4.0f));
        float log = (float) Math.log((f20 * 0.0228f) + 1.0f);
        double d9 = f17;
        float f22 = log * 43.85965f;
        return new hdm(f16, pow5, pow4, (1.7f * pow4) / ((0.007f * pow4) + 1.0f), f22 * ((float) Math.cos(d9)), f22 * ((float) Math.sin(d9)));
    }

    public static final hdm b(float f, float f2, float f3) {
        hdo hdoVar = hdo.a;
        float f4 = hdoVar.i * f2;
        float sqrt = (float) Math.sqrt(f / 100.0d);
        float f5 = hdoVar.f;
        Math.sqrt(((f2 / sqrt) * 0.69000006f) / (hdoVar.c + 4.0f));
        float log = (float) Math.log((f4 * 0.0228d) + 1.0d);
        double d = (3.1415927f * f3) / 180.0f;
        float f6 = log * 43.85965f;
        return new hdm(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), f6 * ((float) Math.cos(d)), f6 * ((float) Math.sin(d)));
    }
}

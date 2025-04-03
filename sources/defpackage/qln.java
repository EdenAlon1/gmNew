package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qln {
    public static int a(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        int i3 = i >> 24;
        int i4 = i >> 16;
        int i5 = i >> 8;
        int i6 = i & PrivateKeyType.INVALID;
        int i7 = i2 >> 24;
        int i8 = i2 >> 16;
        int i9 = i2 >> 8;
        int i10 = i2 & PrivateKeyType.INVALID;
        float f2 = (i3 & PrivateKeyType.INVALID) / 255.0f;
        float f3 = (((i7 & PrivateKeyType.INVALID) / 255.0f) - f2) * f;
        float b = b((i4 & PrivateKeyType.INVALID) / 255.0f);
        float b2 = b((i5 & PrivateKeyType.INVALID) / 255.0f);
        float b3 = b(i6 / 255.0f);
        float b4 = b + ((b((i8 & PrivateKeyType.INVALID) / 255.0f) - b) * f);
        float b5 = b2 + ((b((i9 & PrivateKeyType.INVALID) / 255.0f) - b2) * f);
        float b6 = b3 + (f * (b(i10 / 255.0f) - b3));
        float c = c(b4) * 255.0f;
        float c2 = c(b5) * 255.0f;
        float c3 = c(b6) * 255.0f;
        return (Math.round(c) << 16) | (Math.round((f2 + f3) * 255.0f) << 24) | (Math.round(c2) << 8) | Math.round(c3);
    }

    private static float b(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float c(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}

package defpackage;

import android.os.Build;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgx {
    public static final long a(long j, float f) {
        long e;
        double d = f;
        if (!(d < 1.0E-4d) && !(d > 99.9999d)) {
            float[] fArr = ieg.a;
            long e2 = ibw.e(j, ieg.t);
            return ibw.e(iby.j(f, ibw.c(e2), ibw.b(e2), 0.0f, ieg.t, 8), ieg.e);
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f2 * f2 * f2;
        if (f3 <= 0.008856452f) {
            f3 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        double d2 = (f3 * 100.0f) / 100.0f;
        int b = kqp.b(ffln.a((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0, PrivateKeyType.INVALID);
        e = iby.e(b, b, b, PrivateKeyType.INVALID);
        return e;
    }

    public static final boolean b() {
        return Build.VERSION.SDK_INT >= 31;
    }
}

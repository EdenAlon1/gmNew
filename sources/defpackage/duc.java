package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duc {
    public static final float a(iki ikiVar, boolean z) {
        long d = d(ikiVar, z);
        float f = 0.0f;
        if (iak.i(d, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = ikiVar.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iku ikuVar = (iku) list.get(i2);
            if (ikuVar.d && ikuVar.h) {
                f += iak.a(iak.e(z ? ikuVar.c : ikuVar.g, d));
                i++;
            }
        }
        return f / i;
    }

    public static final float b(iki ikiVar) {
        float f;
        List list = ikiVar.a;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            iku ikuVar = (iku) list.get(i);
            if (!ikuVar.h || !ikuVar.d) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long d = d(ikiVar, true);
            long d2 = d(ikiVar, false);
            List list2 = ikiVar.a;
            int size2 = list2.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                iku ikuVar2 = (iku) list2.get(i4);
                if (ikuVar2.d && ikuVar2.h) {
                    long j = ikuVar2.c;
                    long e = iak.e(ikuVar2.g, d2);
                    long e2 = iak.e(j, d);
                    float g = g(e2) - g(e);
                    float a = iak.a(iak.f(e2, e)) / 2.0f;
                    if (g <= 180.0f) {
                        f = g < -180.0f ? 360.0f : -360.0f;
                        f3 += g * a;
                        f2 += a;
                    }
                    g += f;
                    f3 += g * a;
                    f2 += a;
                }
            }
            if (f2 != 0.0f) {
                return f3 / f2;
            }
        }
        return 0.0f;
    }

    public static final float c(iki ikiVar) {
        float a = a(ikiVar, true);
        float a2 = a(ikiVar, false);
        if (a == 0.0f || a2 == 0.0f) {
            return 1.0f;
        }
        return a / a2;
    }

    public static final long d(iki ikiVar, boolean z) {
        List list = ikiVar.a;
        int size = list.size();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iku ikuVar = (iku) list.get(i2);
            if (ikuVar.d && ikuVar.h) {
                j = iak.f(j, z ? ikuVar.c : ikuVar.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return iak.d(j, i);
    }

    public static final long e(iki ikiVar) {
        long d = d(ikiVar, true);
        if (iak.i(d, 9205357640488583168L)) {
            return 0L;
        }
        return iak.e(d, d(ikiVar, false));
    }

    public static /* synthetic */ Object f(ild ildVar, ffjo ffjoVar, ffgu ffguVar) {
        Object b = dpu.b(ildVar, new dub(ffjoVar, null), ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    private static final float g(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == 0.0f && Float.intBitsToFloat(i2) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)))) * 180.0f) / 3.1415927f;
    }
}

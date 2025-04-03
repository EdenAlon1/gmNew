package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffu {
    public static final iam a = new iam(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final long a(fft fftVar, long j, fcx fcxVar) {
        ioc iocVar;
        ioc k;
        int i;
        float e;
        fcv e2 = fftVar.e(fcxVar);
        if (e2 == null || (iocVar = fftVar.g) == null || (k = e2.k()) == null || (i = fcxVar.b) > e2.e()) {
            return 9205357640488583168L;
        }
        iak iakVar = (iak) fftVar.h.a();
        iakVar.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (k.h(iocVar, iakVar.a) >> 32));
        long g = e2.g(i);
        if (jpm.i(g)) {
            e = e2.c(i);
        } else {
            float c = e2.c(jpm.e(g));
            float d = e2.d(jpm.a(g) - 1);
            e = ffmk.e(intBitsToFloat, Math.min(c, d), Math.max(c, d));
        }
        if (e == -1.0f) {
            return 9205357640488583168L;
        }
        if (!kaf.e(j, 0L) && Math.abs(intBitsToFloat - e) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        if (e2.a(i) != -1.0f) {
            return iocVar.h(k, (Float.floatToRawIntBits(e) << 32) | (4294967295L & Float.floatToRawIntBits(r9)));
        }
        return 9205357640488583168L;
    }

    public static final iam b(ioc iocVar) {
        iam e = iod.e(iocVar);
        long m = iocVar.m(e.c());
        float f = e.d;
        float f2 = e.e;
        long j = m >> 32;
        long m2 = iocVar.m((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        return new iam(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) (m & 4294967295L)), Float.intBitsToFloat((int) (m2 >> 32)), Float.intBitsToFloat((int) (m2 & 4294967295L)));
    }

    public static final boolean c(iam iamVar, long j) {
        float f = iamVar.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > intBitsToFloat || intBitsToFloat > iamVar.d) {
            return false;
        }
        float f2 = iamVar.c;
        float f3 = iamVar.e;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f2 <= intBitsToFloat2 && intBitsToFloat2 <= f3;
    }
}

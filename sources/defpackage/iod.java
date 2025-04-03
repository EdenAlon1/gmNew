package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iod {
    public static final long a(ioc iocVar) {
        return iocVar.i(0L);
    }

    public static final long b(ioc iocVar) {
        return iocVar.k(0L);
    }

    public static final iam c(ioc iocVar) {
        iam n;
        ioc p = iocVar.p();
        if (p != null) {
            n = p.n(iocVar, true);
            return n;
        }
        return new iam(0.0f, 0.0f, (int) (iocVar.g() >> 32), (int) (iocVar.g() & 4294967295L));
    }

    public static final iam d(ioc iocVar) {
        iam n;
        n = f(iocVar).n(iocVar, true);
        return n;
    }

    public static final iam e(ioc iocVar) {
        iam n;
        ioc f = f(iocVar);
        long g = f.g() >> 32;
        long g2 = f.g() & 4294967295L;
        n = f.n(iocVar, true);
        float f2 = n.b;
        float f3 = n.c;
        float f4 = n.d;
        float f5 = n.e;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float f6 = (int) g;
        if (f2 > f6) {
            f2 = f6;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 <= f6) {
            f6 = f4;
        }
        if (f2 != f6) {
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            float f7 = (int) g2;
            if (f3 > f7) {
                f3 = f7;
            }
            if (f5 > f7) {
                f5 = f7;
            }
            if (f3 != f5) {
                long k = f.k((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
                long k2 = f.k((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
                long k3 = f.k((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
                long k4 = f.k((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                float intBitsToFloat = Float.intBitsToFloat((int) (k >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (k2 >> 32));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (k4 >> 32));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (k3 >> 32));
                float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
                float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
                float intBitsToFloat5 = Float.intBitsToFloat((int) (k & 4294967295L));
                float intBitsToFloat6 = Float.intBitsToFloat((int) (k2 & 4294967295L));
                float intBitsToFloat7 = Float.intBitsToFloat((int) (k4 & 4294967295L));
                float intBitsToFloat8 = Float.intBitsToFloat((int) (k3 & 4294967295L));
                return new iam(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
            }
        }
        return iam.a;
    }

    public static final ioc f(ioc iocVar) {
        ioc iocVar2;
        iwi iwiVar;
        ioc p = iocVar.p();
        while (true) {
            ioc iocVar3 = p;
            iocVar2 = iocVar;
            iocVar = iocVar3;
            if (iocVar == null) {
                break;
            }
            p = iocVar.p();
        }
        iwi iwiVar2 = iocVar2 instanceof iwi ? (iwi) iocVar2 : null;
        if (iwiVar2 == null) {
            return iocVar2;
        }
        do {
            iwiVar = iwiVar2;
            iwiVar2 = iwiVar2.v;
        } while (iwiVar2 != null);
        return iwiVar;
    }
}

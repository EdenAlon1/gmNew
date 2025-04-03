package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfv {
    public static final boolean a(icr icrVar, float f, float f2) {
        if (icrVar instanceof icp) {
            iam iamVar = ((icp) icrVar).a;
            return iamVar.b <= f && f < iamVar.d && iamVar.c <= f2 && f2 < iamVar.e;
        }
        if (!(icrVar instanceof icq)) {
            if (icrVar instanceof ico) {
                return c(((ico) icrVar).a, f, f2);
            }
            throw new ffcd();
        }
        iao iaoVar = ((icq) icrVar).a;
        if (f < iaoVar.a || f >= iaoVar.c || f2 < iaoVar.b || f2 >= iaoVar.d) {
            return false;
        }
        if (Float.intBitsToFloat((int) (iaoVar.e >> 32)) + Float.intBitsToFloat((int) (iaoVar.f >> 32)) <= iaoVar.b()) {
            if (Float.intBitsToFloat((int) (iaoVar.h >> 32)) + Float.intBitsToFloat((int) (iaoVar.g >> 32)) <= iaoVar.b()) {
                if (Float.intBitsToFloat((int) (iaoVar.e & 4294967295L)) + Float.intBitsToFloat((int) (iaoVar.h & 4294967295L)) <= iaoVar.a()) {
                    if (Float.intBitsToFloat((int) (iaoVar.f & 4294967295L)) + Float.intBitsToFloat((int) (iaoVar.g & 4294967295L)) <= iaoVar.a()) {
                        float intBitsToFloat = iaoVar.a + Float.intBitsToFloat((int) (iaoVar.e >> 32));
                        float intBitsToFloat2 = iaoVar.b + Float.intBitsToFloat((int) (iaoVar.e & 4294967295L));
                        float intBitsToFloat3 = iaoVar.c - Float.intBitsToFloat((int) (iaoVar.f >> 32));
                        float intBitsToFloat4 = iaoVar.b + Float.intBitsToFloat((int) (iaoVar.f & 4294967295L));
                        float intBitsToFloat5 = iaoVar.c - Float.intBitsToFloat((int) (iaoVar.g >> 32));
                        float intBitsToFloat6 = iaoVar.d - Float.intBitsToFloat((int) (iaoVar.g & 4294967295L));
                        float intBitsToFloat7 = iaoVar.d - Float.intBitsToFloat((int) (4294967295L & iaoVar.h));
                        float intBitsToFloat8 = iaoVar.a + Float.intBitsToFloat((int) (iaoVar.h >> 32));
                        if (f < intBitsToFloat && f2 < intBitsToFloat2) {
                            return b(f, f2, iaoVar.e, intBitsToFloat, intBitsToFloat2);
                        }
                        if (f < intBitsToFloat8 && f2 > intBitsToFloat7) {
                            return b(f, f2, iaoVar.h, intBitsToFloat8, intBitsToFloat7);
                        }
                        if (f > intBitsToFloat3 && f2 < intBitsToFloat4) {
                            return b(f, f2, iaoVar.f, intBitsToFloat3, intBitsToFloat4);
                        }
                        if (f <= intBitsToFloat5 || f2 <= intBitsToFloat6) {
                            return true;
                        }
                        return b(f, f2, iaoVar.g, intBitsToFloat5, intBitsToFloat6);
                    }
                }
            }
        }
        ibc ibcVar = new ibc((byte[]) null);
        ibcVar.s(iaoVar);
        return c(ibcVar, f, f2);
    }

    private static final boolean b(float f, float f2, long j, float f3, float f4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f5 = f2 - f4;
        float f6 = f - f3;
        return ((f6 * f6) / (intBitsToFloat * intBitsToFloat)) + ((f5 * f5) / (intBitsToFloat2 * intBitsToFloat2)) <= 1.0f;
    }

    private static final boolean c(icv icvVar, float f, float f2) {
        iam iamVar = new iam(f - 0.005f, (-0.005f) + f2, f + 0.005f, f2 + 0.005f);
        ibc ibcVar = new ibc((byte[]) null);
        ibcVar.r(iamVar);
        ibc ibcVar2 = new ibc((byte[]) null);
        ibcVar2.p(icvVar, ibcVar, 1);
        boolean isEmpty = ibcVar2.a.isEmpty();
        ibcVar2.k();
        ibcVar.k();
        return !isEmpty;
    }
}

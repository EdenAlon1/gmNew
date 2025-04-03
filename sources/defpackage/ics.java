package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ics {
    public static /* synthetic */ void a(ifr ifrVar, icr icrVar, ibq ibqVar, float f) {
        ifu ifuVar = ifu.a;
        if (icrVar instanceof icp) {
            iam iamVar = ((icp) icrVar).a;
            ifrVar.y(ibqVar, e(iamVar), c(iamVar), f, ifuVar, 3);
            return;
        }
        if (!(icrVar instanceof icq)) {
            if (!(icrVar instanceof ico)) {
                throw new ffcd();
            }
            ifrVar.x(((ico) icrVar).a, ibqVar, f, ifuVar, 3);
            return;
        }
        icq icqVar = (icq) icrVar;
        icv icvVar = icqVar.b;
        if (icvVar != null) {
            ifrVar.x(icvVar, ibqVar, f, ifuVar, 3);
            return;
        }
        iao iaoVar = icqVar.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (iaoVar.h >> 32));
        ifrVar.H(ibqVar, f(iaoVar), d(iaoVar), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), f, ifuVar);
    }

    public static /* synthetic */ void b(ifr ifrVar, icr icrVar, long j) {
        boolean z = icrVar instanceof icp;
        ifu ifuVar = ifu.a;
        if (z) {
            iam iamVar = ((icp) icrVar).a;
            ifrVar.r(j, e(iamVar), c(iamVar), 1.0f, ifuVar, null, 3);
            return;
        }
        if (!(icrVar instanceof icq)) {
            if (!(icrVar instanceof ico)) {
                throw new ffcd();
            }
            ifrVar.G(((ico) icrVar).a, j, 1.0f, ifuVar);
            return;
        }
        icq icqVar = (icq) icrVar;
        icv icvVar = icqVar.b;
        if (icvVar != null) {
            ifrVar.G(icvVar, j, 1.0f, ifuVar);
            return;
        }
        iao iaoVar = icqVar.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (iaoVar.h >> 32));
        ifrVar.I(j, f(iaoVar), d(iaoVar), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), ifuVar, 1.0f);
    }

    private static final long c(iam iamVar) {
        float f = iamVar.d - iamVar.b;
        float f2 = iamVar.e - iamVar.c;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    private static final long d(iao iaoVar) {
        float b = iaoVar.b();
        float a = iaoVar.a();
        return (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
    }

    private static final long e(iam iamVar) {
        return (Float.floatToRawIntBits(iamVar.b) << 32) | (Float.floatToRawIntBits(iamVar.c) & 4294967295L);
    }

    private static final long f(iao iaoVar) {
        return (Float.floatToRawIntBits(iaoVar.a) << 32) | (Float.floatToRawIntBits(iaoVar.b) & 4294967295L);
    }
}

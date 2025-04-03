package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfd {
    public static final ebe a;
    public static final ebe b;
    public static final float c;
    public static final float d;
    private static final float e;

    static {
        ebf ebfVar = new ebf(24.0f, 8.0f, 24.0f, 8.0f);
        a = ebfVar;
        new ebf(16.0f, 8.0f, 24.0f, 8.0f);
        e = 12.0f;
        b = new ebf(12.0f, ebfVar.a, 12.0f, ebfVar.b);
        new ebf(12.0f, ebfVar.a, 16.0f, ebfVar.b);
        c = 18.0f;
        d = 8.0f;
    }

    public static final idh a(hfd hfdVar) {
        hfdVar.v(2031760353);
        idh b2 = dwiq.b(7, hfdVar);
        ((hfm) hfdVar).Z();
        return b2;
    }

    public static final fvo b(long j, long j2, hfd hfdVar, int i) {
        long f;
        long f2;
        hfdVar.v(-1814124481);
        if ((i & 1) != 0) {
            j = dwfv.c(26, hfdVar);
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = dwfv.c(10, hfdVar);
        }
        f = iby.f(ibw.d(r11), ibw.c(r11), ibw.b(r11), 0.1f, ibw.f(dwfv.c(18, hfdVar)));
        f2 = iby.f(ibw.d(r10), ibw.c(r10), ibw.b(r10), 0.38f, ibw.f(dwfv.c(18, hfdVar)));
        ebe ebeVar = fvp.a;
        fvo c2 = fvp.c(j3, j2, f, f2, hfdVar, 0);
        ((hfm) hfdVar).Z();
        return c2;
    }

    public static final fvt c(float f, hfd hfdVar, int i) {
        hfdVar.v(1410833095);
        ebe ebeVar = fvp.a;
        if (1 == (i & 1)) {
            f = 1.0f;
        }
        fvt d2 = fvp.d(f, 1.0f, 1.0f, 1.0f, 0);
        hfdVar.o();
        return d2;
    }

    public static final fvo d(hfd hfdVar) {
        long f;
        long f2;
        hfdVar.v(-1496735361);
        long c2 = dwfv.c(32, hfdVar);
        long c3 = dwfv.c(15, hfdVar);
        f = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.1f, ibw.f(dwfv.c(18, hfdVar)));
        f2 = iby.f(ibw.d(r7), ibw.c(r7), ibw.b(r7), 0.38f, ibw.f(dwfv.c(18, hfdVar)));
        ebe ebeVar = fvp.a;
        fvo c4 = fvp.c(c2, c3, f, f2, hfdVar, 0);
        ((hfm) hfdVar).Z();
        return c4;
    }

    public static final fvo e(long j, hfd hfdVar, int i) {
        long f;
        hfdVar.v(1137425277);
        if ((i & 1) != 0) {
            j = ibw.g;
        }
        long j2 = j;
        long c2 = dwfv.c(19, hfdVar);
        long j3 = ibw.g;
        f = iby.f(ibw.d(r10), ibw.c(r10), ibw.b(r10), 0.38f, ibw.f(dwfv.c(18, hfdVar)));
        ebe ebeVar = fvp.a;
        fvo c3 = fvp.c(j2, c2, j3, f, hfdVar, 0);
        ((hfm) hfdVar).Z();
        return c3;
    }

    public static final fvo f(long j, hfd hfdVar, int i) {
        long f;
        hfdVar.v(1389225298);
        long j2 = (i & 1) != 0 ? ibw.g : 0L;
        if ((i & 2) != 0) {
            j = dwfv.c(26, hfdVar);
        }
        long j3 = j;
        long j4 = ibw.g;
        f = iby.f(ibw.d(r12), ibw.c(r12), ibw.b(r12), 0.38f, ibw.f(dwfv.c(18, hfdVar)));
        ebe ebeVar = fvp.a;
        fvo c2 = fvp.c(j2, j3, j4, f, hfdVar, 0);
        ((hfm) hfdVar).Z();
        return c2;
    }
}

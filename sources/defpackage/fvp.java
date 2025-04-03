package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvp {
    public static final ebe a;
    public static final ebe b;
    public static final float c;
    public static final float d;
    public static final float e;
    private static final float f;

    static {
        ebf ebfVar = new ebf(24.0f, 8.0f, 24.0f, 8.0f);
        a = ebfVar;
        new ebf(16.0f, 8.0f, 24.0f, 8.0f);
        f = 12.0f;
        b = new ebf(12.0f, ebfVar.a, 12.0f, ebfVar.b);
        new ebf(12.0f, ebfVar.a, 16.0f, ebfVar.b);
        c = 58.0f;
        d = 40.0f;
        e = 8.0f;
    }

    public static final fvo a(fxz fxzVar) {
        long f2;
        long f3;
        fvo fvoVar = fxzVar.K;
        if (fvoVar != null) {
            return fvoVar;
        }
        long g = fyc.g(fxzVar, 26);
        long g2 = fyc.g(fxzVar, 10);
        f2 = iby.f(ibw.d(r6), ibw.c(r6), ibw.b(r6), 0.1f, ibw.f(fyc.g(fxzVar, 18)));
        f3 = iby.f(ibw.d(r8), ibw.c(r8), ibw.b(r8), 0.38f, ibw.f(fyc.g(fxzVar, 19)));
        fvo fvoVar2 = new fvo(g, g2, f2, f3);
        fxzVar.K = fvoVar2;
        return fvoVar2;
    }

    public static final fvo b(fxz fxzVar) {
        long f2;
        fvo fvoVar = fxzVar.M;
        if (fvoVar != null) {
            return fvoVar;
        }
        long j = ibw.g;
        long g = fyc.g(fxzVar, 26);
        long j2 = ibw.g;
        f2 = iby.f(ibw.d(r8), ibw.c(r8), ibw.b(r8), 0.38f, ibw.f(fyc.g(fxzVar, 19)));
        fvo fvoVar2 = new fvo(j, g, j2, f2);
        fxzVar.M = fvoVar2;
        return fvoVar2;
    }

    public static final fvo c(long j, long j2, long j3, long j4, hfd hfdVar, int i) {
        if ((i & 1) != 0) {
            j = ibw.h;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = ibw.h;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = ibw.h;
        }
        return a(gft.a(hfdVar)).a(j5, j6, j3, (i & 8) != 0 ? ibw.h : j4);
    }

    public static final fvt d(float f2, float f3, float f4, float f5, int i) {
        if ((i & 8) != 0) {
            f5 = 1.0f;
        }
        if ((i & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i & 1)) {
            f2 = 0.0f;
        }
        return new fvt(f2, f3, f4, f5);
    }

    public static final fvo e(long j, long j2, hfd hfdVar, int i) {
        if ((i & 1) != 0) {
            j = ibw.h;
        }
        long j3 = j;
        long j4 = ibw.h;
        return b(gft.a(hfdVar)).a(j3, j2, j4, j4);
    }
}

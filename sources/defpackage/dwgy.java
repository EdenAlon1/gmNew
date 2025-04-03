package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgy {
    public static final glp a(long j, long j2, long j3, hfd hfdVar, int i) {
        long j4;
        long j5;
        long f;
        long f2;
        long f3;
        long f4;
        long f5;
        long f6;
        hfdVar.v(1329529049);
        long j6 = (i & 1) != 0 ? ibw.g : 0L;
        long c = (i & 2) != 0 ? dwfv.c(19, hfdVar) : 0L;
        long c2 = (i & 4) != 0 ? dwfv.c(26, hfdVar) : 0L;
        long j7 = (i & 8) != 0 ? ibw.g : 0L;
        long f7 = (i & 16) != 0 ? iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), 0.38f, ibw.f(dwfv.c(18, hfdVar))) : 0L;
        if ((i & 32) != 0) {
            f6 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(dwfv.c(18, hfdVar)));
            j4 = f6;
        } else {
            j4 = 0;
        }
        long j8 = (i & 64) != 0 ? j4 : 0L;
        long c3 = (i & 128) != 0 ? dwfv.c(32, hfdVar) : j;
        if ((i & 256) != 0) {
            f5 = iby.f(ibw.d(r6), ibw.c(r6), ibw.b(r6), 0.12f, ibw.f(dwfv.c(18, hfdVar)));
            j5 = f5;
        } else {
            j5 = 0;
        }
        long c4 = (i & 512) != 0 ? dwfv.c(15, hfdVar) : j2;
        long c5 = (i & 1024) != 0 ? dwfv.c(15, hfdVar) : j3;
        fxz a = gft.a(hfdVar);
        glp glpVar = a.P;
        if (glpVar == null) {
            long j9 = ibw.g;
            long g = fyc.g(a, 19);
            long g2 = fyc.g(a, 26);
            long g3 = fyc.g(a, 19);
            long j10 = ibw.g;
            f = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(fyc.g(a, 18)));
            f2 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(fyc.g(a, 18)));
            f3 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(fyc.g(a, 18)));
            long g4 = fyc.g(a, 32);
            f4 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.12f, ibw.f(fyc.g(a, 18)));
            glpVar = new glp(j9, g, g2, g3, j10, f, f2, f3, g4, f4, fyc.g(a, 15), fyc.g(a, 15), fyc.g(a, 15));
            a.P = glpVar;
        }
        glp a2 = glpVar.a(j6, c, c2, c2, j7, f7, j4, j8, c3, j5, c4, c5, c5);
        ((hfm) hfdVar).Z();
        return a2;
    }
}

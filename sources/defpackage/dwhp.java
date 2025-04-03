package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwhp {
    public static final gez a(long j, hfd hfdVar, int i) {
        long f;
        long f2;
        long f3;
        long j2;
        long f4;
        long f5;
        long f6;
        hfdVar.v(408210655);
        long c = (i & 1) != 0 ? dwfv.c(35, hfdVar) : j;
        long c2 = dwfv.c(18, hfdVar);
        long c3 = dwfv.c(19, hfdVar);
        long c4 = dwfv.c(19, hfdVar);
        long c5 = dwfv.c(19, hfdVar);
        long c6 = dwfv.c(19, hfdVar);
        f = iby.f(ibw.d(r7), ibw.c(r7), ibw.b(r7), 0.38f, ibw.f(dwfv.c(18, hfdVar)));
        long j3 = c;
        f2 = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.38f, ibw.f(dwfv.c(18, hfdVar)));
        f3 = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.38f, ibw.f(dwfv.c(18, hfdVar)));
        fxz a = gft.a(hfdVar);
        gez gezVar = a.Y;
        if (gezVar == null) {
            long g = fyc.g(a, 35);
            long g2 = fyc.g(a, 18);
            long g3 = fyc.g(a, 19);
            long g4 = fyc.g(a, 19);
            long g5 = fyc.g(a, 19);
            long g6 = fyc.g(a, 19);
            j2 = f3;
            f4 = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.38f, ibw.f(fyc.g(a, 18)));
            f5 = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.38f, ibw.f(fyc.g(a, 18)));
            f6 = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.38f, ibw.f(fyc.g(a, 18)));
            gezVar = new gez(g, g2, g3, g4, g5, g6, f4, f5, f6);
            a.Y = gezVar;
        } else {
            j2 = f3;
        }
        long j4 = j3 != 16 ? j3 : gezVar.a;
        if (c2 == 16) {
            c2 = gezVar.b;
        }
        long j5 = c2;
        long j6 = c3 == 16 ? gezVar.c : c3;
        if (c4 == 16) {
            c4 = gezVar.d;
        }
        long j7 = c4;
        if (c5 == 16) {
            c5 = gezVar.e;
        }
        long j8 = c5;
        if (c6 == 16) {
            c6 = gezVar.f;
        }
        long j9 = c6;
        if (f == 16) {
            f = gezVar.g;
        }
        gez gezVar2 = new gez(j4, j5, j6, j7, j8, j9, f, f2 != 16 ? f2 : gezVar.h, j2 != 16 ? j2 : gezVar.i);
        ((hfm) hfdVar).Z();
        return gezVar2;
    }
}

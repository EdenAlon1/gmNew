package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwe {
    public static final fwd a(long j, long j2, long j3, long j4, hfd hfdVar) {
        long f;
        long f2;
        fxz a = gft.a(hfdVar);
        fwd fwdVar = a.N;
        if (fwdVar == null) {
            long g = fyc.g(a, 39);
            long a2 = fyc.a(a, fyc.g(a, 39));
            f = iby.f(ibw.d(r7), ibw.c(r7), ibw.b(r7), 0.38f, ibw.f(fyc.g(a, 44)));
            long h = iby.h(f, fyc.g(a, 39));
            f2 = iby.f(ibw.d(r10), ibw.c(r10), ibw.b(r10), 0.38f, ibw.f(fyc.a(a, fyc.g(a, 39))));
            fwd fwdVar2 = new fwd(g, a2, h, f2);
            a.N = fwdVar2;
            fwdVar = fwdVar2;
        }
        return new fwd(j != 16 ? j : fwdVar.a, j2 != 16 ? j2 : fwdVar.b, j3 != 16 ? j3 : fwdVar.c, j4 != 16 ? j4 : fwdVar.d);
    }
}

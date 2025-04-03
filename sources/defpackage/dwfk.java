package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfk {
    public static final fwi a(hfd hfdVar) {
        hfdVar.v(-347913265);
        fwi fwiVar = new fwi(1.0f);
        ((hfm) hfdVar).Z();
        return fwiVar;
    }

    public static final fwd b(long j, long j2, hfd hfdVar, int i) {
        long f;
        long f2;
        long h;
        long f3;
        hfdVar.v(-860673981);
        if ((i & 1) != 0) {
            j = dwfv.c(39, hfdVar);
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = dwfv.a(j3, hfdVar);
        }
        long j4 = j2;
        f = iby.f(ibw.d(r9), ibw.c(r9), ibw.b(r9), 0.38f, ibw.f(dwfv.c(43, hfdVar)));
        fxz a = gft.a(hfdVar);
        a.getClass();
        if (jzq.b(0.0f, 0.0f)) {
            h = a.p;
        } else {
            float log = (float) Math.log(1.0d);
            long j5 = a.t;
            long j6 = a.p;
            f2 = iby.f(ibw.d(j5), ibw.c(j5), ibw.b(j5), ((log * 4.5f) + 2.0f) / 100.0f, ibw.f(j5));
            h = iby.h(f2, j6);
        }
        long h2 = iby.h(f, h);
        f3 = iby.f(ibw.d(r9), ibw.c(r9), ibw.b(r9), 0.38f, ibw.f(dwfv.a(j3, hfdVar)));
        fwd a2 = fwe.a(j3, j4, h2, f3, hfdVar);
        hfdVar.o();
        return a2;
    }
}

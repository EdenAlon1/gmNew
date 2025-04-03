package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwhi {
    public static final gdx a(long j, long j2, hfd hfdVar, int i) {
        long f;
        long f2;
        hfdVar.v(1183243193);
        if ((i & 1) != 0) {
            j = dwfv.c(26, hfdVar);
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = dwfv.a(j3, hfdVar);
        }
        f = iby.f(ibw.d(r10), ibw.c(r10), ibw.b(r10), 0.1f, ibw.f(dwfv.c(18, hfdVar)));
        f2 = iby.f(ibw.d(r9), ibw.c(r9), ibw.b(r9), 0.38f, ibw.f(dwfv.c(18, hfdVar)));
        gdx c = gdz.b(gft.a(hfdVar)).c(j3, j2, f, f2);
        ((hfm) hfdVar).Z();
        return c;
    }

    public static final gdx b(long j, long j2, long j3, hfd hfdVar, int i) {
        hfdVar.v(518957819);
        if ((i & 1) != 0) {
            j = ibw.g;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = ((ibw) hfdVar.e(fzc.a)).i;
        }
        long j5 = j2;
        long j6 = (i & 4) != 0 ? ibw.g : 0L;
        if ((i & 8) != 0) {
            j3 = iby.f(ibw.d(j5), ibw.c(j5), ibw.b(j5), 0.38f, ibw.f(j5));
        }
        gdx d = gdz.d(j4, j5, j6, j3, hfdVar, 0);
        ((hfm) hfdVar).Z();
        return d;
    }
}

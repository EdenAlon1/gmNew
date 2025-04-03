package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdz {
    public static final gdx a(fxz fxzVar, long j) {
        long f;
        gdx gdxVar = fxzVar.U;
        if (gdxVar != null) {
            return gdxVar;
        }
        long j2 = ibw.g;
        f = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), 0.38f, ibw.f(j));
        gdx gdxVar2 = new gdx(j2, j, j2, f);
        fxzVar.U = gdxVar2;
        return gdxVar2;
    }

    public static final gdx b(fxz fxzVar) {
        long f;
        long f2;
        gdx gdxVar = fxzVar.W;
        if (gdxVar != null) {
            return gdxVar;
        }
        long g = fyc.g(fxzVar, 26);
        long g2 = fyc.g(fxzVar, 10);
        f = iby.f(ibw.d(r6), ibw.c(r6), ibw.b(r6), 0.1f, ibw.f(fyc.g(fxzVar, 18)));
        f2 = iby.f(ibw.d(r8), ibw.c(r8), ibw.b(r8), 0.38f, ibw.f(fyc.g(fxzVar, 18)));
        gdx gdxVar2 = new gdx(g, g2, f, f2);
        fxzVar.W = gdxVar2;
        return gdxVar2;
    }

    public static final gdx d(long j, long j2, long j3, long j4, hfd hfdVar, int i) {
        if ((i & 1) != 0) {
            j = ibw.h;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = ((ibw) hfdVar.e(fzc.a)).i;
        }
        return a(gft.a(hfdVar), ((ibw) hfdVar.e(fzc.a)).i).c(j5, j2, (i & 4) != 0 ? ibw.h : j3, j4);
    }
}

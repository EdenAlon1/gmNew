package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dppp implements ffjn {
    final /* synthetic */ float a;
    final /* synthetic */ hho b;

    public dppp(float f, hho hhoVar) {
        this.a = f;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long f;
        long f2;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        hve hveVar = hvi.e;
        long j = dptv.a;
        hvi k = ebs.k(hveVar, 52.0f);
        long j2 = dptv.c;
        long j3 = ibw.d;
        long j4 = gft.a(hfdVar).a;
        long j5 = gft.a(hfdVar).b;
        long j6 = ibw.h;
        f = iby.f(ibw.d(j3), ibw.c(j3), ibw.b(j3), 0.38f, ibw.f(j3));
        fxz a = gft.a(hfdVar);
        long j7 = ((ibw) hfdVar.e(fzc.a)).i;
        ger gerVar = a.V;
        if (gerVar == null) {
            long j8 = ibw.g;
            f2 = iby.f(ibw.d(j7), ibw.c(j7), ibw.b(j7), 0.38f, ibw.f(j7));
            gerVar = new ger(j8, j7, j8, f2, ibw.g, fyc.g(a, 26));
            a.V = gerVar;
        }
        long j9 = j2 == 16 ? gerVar.a : j2;
        if (j3 == 16) {
            j3 = gerVar.b;
        }
        long j10 = j3;
        if (j6 == 16) {
            j6 = gerVar.c;
        }
        long j11 = j6;
        if (f == 16) {
            f = gerVar.d;
        }
        long j12 = f;
        if (j4 == 16) {
            j4 = gerVar.e;
        }
        long j13 = j4;
        if (j5 == 16) {
            j5 = gerVar.f;
        }
        ger gerVar2 = new ger(j9, j10, j11, j12, j13, j5);
        boolean f3 = dpqe.f(this.b);
        hfdVar.v(-2141123307);
        final hho hhoVar = this.b;
        Object f4 = hfdVar.f();
        if (f4 == hfc.a) {
            f4 = new ffji() { // from class: dppo
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    Boolean bool = (Boolean) obj4;
                    bool.booleanValue();
                    hho.this.b(bool);
                    return ffcu.a;
                }
            };
            hfdVar.y(f4);
        }
        hfdVar.o();
        dpwy.a(this.a, k, gerVar2, f3, (ffji) f4, hfdVar, 24624);
        return ffcu.a;
    }
}

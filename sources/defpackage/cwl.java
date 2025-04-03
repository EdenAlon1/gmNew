package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwl extends ffkk implements ffjn {
    final /* synthetic */ ffjo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwl(ffjo ffjoVar) {
        super(3);
        this.a = ffjoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ipe ipeVar = (ipe) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = hgs.a(ffhe.a, hfdVar);
            hfdVar.y(f);
        }
        ffsk ffskVar = (ffsk) f;
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = new cwb(ipeVar, ffskVar);
            hfdVar.y(f2);
        }
        ffjo ffjoVar = this.a;
        cwb cwbVar = (cwb) f2;
        hve hveVar = hvi.e;
        Object f3 = hfdVar.f();
        if (f3 == hfc.a) {
            f3 = new cwh(cwbVar);
            hfdVar.y(f3);
        }
        hvi a = iop.a(hveVar, (ffjn) f3);
        Object f4 = hfdVar.f();
        if (f4 == hfc.a) {
            f4 = new cwi(cwbVar);
            hfdVar.y(f4);
        }
        ffjoVar.a(cwbVar, hxs.c(a, (ffji) f4), hfdVar, 6);
        ffcu ffcuVar = ffcu.a;
        Object f5 = hfdVar.f();
        if (f5 == hfc.a) {
            f5 = new cwk(cwbVar);
            hfdVar.y(f5);
        }
        hgs.c(ffcuVar, (ffji) f5, hfdVar);
        return ffcu.a;
    }
}

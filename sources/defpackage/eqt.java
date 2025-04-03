package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqt extends ffkk implements ffjn {
    public static final eqt a = new eqt();

    public eqt() {
        super(3);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-2126899193);
        long j = ((fhz) hfdVar.e(fib.a)).a;
        hve hveVar = hvi.e;
        boolean C = hfdVar.C(j);
        Object f = hfdVar.f();
        if (C || f == hfc.a) {
            f = new eqs(j);
            hfdVar.y(f);
        }
        hvi a2 = hviVar.a(hxs.b(hveVar, (ffji) f));
        hfdVar.o();
        return a2;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewt extends ffkk implements ffjn {
    final /* synthetic */ eva a;
    final /* synthetic */ fhi b;
    final /* synthetic */ jvu c;
    final /* synthetic */ boolean d;
    final /* synthetic */ jvj e;
    final /* synthetic */ eyo f;
    final /* synthetic */ ffji g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewt(eva evaVar, fhi fhiVar, jvu jvuVar, boolean z, jvj jvjVar, eyo eyoVar, ffji ffjiVar, int i) {
        super(3);
        this.a = evaVar;
        this.b = fhiVar;
        this.c = jvuVar;
        this.d = z;
        this.e = jvjVar;
        this.f = eyoVar;
        this.g = ffjiVar;
        this.h = i;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(851809892);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = new fhy();
            hfdVar.y(f);
        }
        fhy fhyVar = (fhy) f;
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = new euc();
            hfdVar.y(f2);
        }
        ewr ewrVar = new ewr(this.a, this.b, this.c, this.d, fhyVar, this.e, this.f, (euc) f2, eus.a, this.g, this.h);
        hve hveVar = hvi.e;
        boolean F = hfdVar.F(ewrVar);
        Object f3 = hfdVar.f();
        if (F || f3 == hfc.a) {
            f3 = new ews(ewrVar);
            hfdVar.y(f3);
        }
        hvi a = ija.a(hveVar, (ffji) ((ffmq) f3));
        hfdVar.o();
        return a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dspz implements ffjn {
    final /* synthetic */ dspo a;
    final /* synthetic */ god b;

    public dspz(dspo dspoVar, god godVar) {
        this.a = dspoVar;
        this.b = godVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        keh kehVar = new keh(5);
        hfdVar.v(-508295921);
        boolean D = hfdVar.D(this.a);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            final dspo dspoVar = this.a;
            f = new ffix() { // from class: dspt
                @Override // defpackage.ffix
                public final Object invoke() {
                    dspo dspoVar2 = dspo.this;
                    if (dspoVar2 != null) {
                        dspoVar2.c.e();
                    }
                    return ffcu.a;
                }
            };
            hfdVar.y(f);
        }
        hfdVar.o();
        kdc.a((ffix) f, kehVar, hpx.d(676622370, new dspy(this.a, this.b), hfdVar), hfdVar, 432, 0);
        return ffcu.a;
    }
}

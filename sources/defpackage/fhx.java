package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhx extends ffkk implements ffjn {
    final /* synthetic */ fhi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhx(fhi fhiVar) {
        super(3);
        this.a = fhiVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(1980580247);
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            hic hicVar = new hic(new kaf(0L), hla.a);
            hfdVar.y(hicVar);
            f = hicVar;
        }
        hho hhoVar = (hho) f;
        boolean F = hfdVar.F(this.a);
        fhi fhiVar = this.a;
        Object f2 = hfdVar.f();
        if (F || f2 == hfc.a) {
            f2 = new fht(fhiVar, hhoVar);
            hfdVar.y(f2);
        }
        ffix ffixVar = (ffix) f2;
        boolean D = hfdVar.D(jznVar);
        Object f3 = hfdVar.f();
        if (D || f3 == hfc.a) {
            f3 = new fhw(jznVar, hhoVar);
            hfdVar.y(f3);
        }
        hvi b = fez.b(hviVar, ffixVar, (ffji) f3);
        hfdVar.o();
        return b;
    }
}

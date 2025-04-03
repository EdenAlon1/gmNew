package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhb extends ffkk implements ffjn {
    final /* synthetic */ dgz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhb(dgz dgzVar) {
        super(3);
        this.a = dgzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-353972293);
        boolean D = hfdVar.D(this.a.b(hfdVar));
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new dhd();
            hfdVar.y(f);
        }
        dhd dhdVar = (dhd) f;
        hfdVar.o();
        return dhdVar;
    }
}

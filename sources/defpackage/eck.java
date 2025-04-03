package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eck extends ffkk implements ffjn {
    final /* synthetic */ ffji a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eck(ffji ffjiVar) {
        super(3);
        this.a = ffjiVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-1608161351);
        boolean D = hfdVar.D(this.a);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new dyt(this.a);
            hfdVar.y(f);
        }
        dyt dytVar = (dyt) f;
        hfdVar.o();
        return dytVar;
    }
}

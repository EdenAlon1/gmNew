package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ecl extends ffkk implements ffjn {
    final /* synthetic */ ecd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecl(ecd ecdVar) {
        super(3);
        this.a = ecdVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-1415685722);
        boolean D = hfdVar.D(this.a);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new eak(this.a);
            hfdVar.y(f);
        }
        eak eakVar = (eak) f;
        hfdVar.o();
        return eakVar;
    }
}

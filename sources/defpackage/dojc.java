package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dojc implements ffjn {
    final /* synthetic */ dokx a;
    final /* synthetic */ hho b;

    public dojc(dokx dokxVar, hho hhoVar) {
        this.a = dokxVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dojg.f(this.a, this.b, hfdVar, 48, 0);
        }
        return ffcu.a;
    }
}

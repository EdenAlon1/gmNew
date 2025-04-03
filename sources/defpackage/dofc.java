package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dofc implements ffjn {
    final /* synthetic */ ffjn a;

    public dofc(ffjn ffjnVar) {
        this.a = ffjnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dyn dynVar = (dyn) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dynVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dynVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.a(Float.valueOf(dynVar.d()), hfdVar, 0);
        }
        return ffcu.a;
    }
}

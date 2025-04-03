package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsv implements ffjn {
    final /* synthetic */ dmte a;
    final /* synthetic */ hzi b;

    public dmsv(dmte dmteVar, hzi hziVar) {
        this.a = dmteVar;
        this.b = hziVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        eag eagVar = (eag) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        eagVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(eagVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmsz.d(eagVar, this.a, this.b, hfdVar, intValue & 14);
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmhp implements ffjn {
    final /* synthetic */ dmht a;
    final /* synthetic */ dly b;

    public dmhp(dmht dmhtVar, dly dlyVar) {
        this.a = dmhtVar;
        this.b = dlyVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dyh dyhVar = (dyh) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dyhVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dyhVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmhr.d(dyhVar, this.a.a, hfdVar, intValue & 14);
            dmhr.c(this.b, hfdVar, 6);
        }
        return ffcu.a;
    }
}

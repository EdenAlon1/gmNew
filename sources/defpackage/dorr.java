package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dorr implements ffjn {
    final /* synthetic */ dlsr a;
    final /* synthetic */ dmzz b;

    public dorr(dlsr dlsrVar, dmzz dmzzVar) {
        this.a = dlsrVar;
        this.b = dmzzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dyh) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dose.b(this.a, this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}

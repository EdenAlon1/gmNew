package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnxs implements ffjn {
    final /* synthetic */ dnwq a;
    final /* synthetic */ String b;

    public dnxs(dnwq dnwqVar, String str) {
        this.a = dnwqVar;
        this.b = str;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dyh) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnxw.a(this.a, this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class douc implements ffjn {
    final /* synthetic */ dmzz a;
    final /* synthetic */ String b;

    public douc(dmzz dmzzVar, String str) {
        this.a = dmzzVar;
        this.b = str;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            doud.d(this.a, this.b, null, hfdVar, 0, 4);
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dovq implements ffjm {
    final /* synthetic */ dmzz a;
    final /* synthetic */ String b;

    public dovq(dmzz dmzzVar, String str) {
        this.a = dmzzVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dovr.b(this.a, this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}

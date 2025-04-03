package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmtg implements ffjm {
    final /* synthetic */ dmzz a;

    public dmtg(dmzz dmzzVar) {
        this.a = dmzzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmuy.c(this.a, null, hfdVar, 0, 2);
        }
        return ffcu.a;
    }
}

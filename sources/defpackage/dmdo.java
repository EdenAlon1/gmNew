package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmdo implements ffjm {
    final /* synthetic */ dmzz a;

    public dmdo(dmzz dmzzVar) {
        this.a = dmzzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmds.f(this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}

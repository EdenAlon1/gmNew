package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmtj implements ffjm {
    final /* synthetic */ dmve a;

    public dmtj(dmve dmveVar) {
        this.a = dmveVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmve dmveVar = this.a;
            dmuy.h(dmveVar.a, dmveVar.b, null, hfdVar, 0, 12);
        }
        return ffcu.a;
    }
}

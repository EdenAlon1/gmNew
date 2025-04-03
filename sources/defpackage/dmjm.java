package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmjm implements ffjm {
    final /* synthetic */ dnwq a;

    public dmjm(dnwq dnwqVar) {
        this.a = dnwqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmjp.d(this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}

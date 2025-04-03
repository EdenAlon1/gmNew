package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnkj implements ffjm {
    final /* synthetic */ dnkm a;

    public dnkj(dnkm dnkmVar) {
        this.a = dnkmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            doid.a(this.a.e, null, hfdVar, 0, 2);
        }
        return ffcu.a;
    }
}

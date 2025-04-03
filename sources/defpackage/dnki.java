package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnki implements ffjm {
    final /* synthetic */ dnkm a;

    public dnki(dnkm dnkmVar) {
        this.a = dnkmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnkm dnkmVar = this.a;
            dnkk.d(dnkmVar.b, dnkmVar.c, hfdVar, 0);
        }
        return ffcu.a;
    }
}

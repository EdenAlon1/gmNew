package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnfs implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ dngn b;

    public dnfs(String str, dngn dngnVar) {
        this.a = str;
        this.b = dngnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dngm.g(this.a, this.b.e, hfdVar, 0);
        }
        return ffcu.a;
    }
}

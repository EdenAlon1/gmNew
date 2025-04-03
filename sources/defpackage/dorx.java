package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dorx implements ffjm {
    final /* synthetic */ dmzz a;
    final /* synthetic */ dlsr b;

    public dorx(dmzz dmzzVar, dlsr dlsrVar) {
        this.a = dmzzVar;
        this.b = dlsrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.a(dnaa.a(this.a, hfdVar), this.b.a, null, 0L, hfdVar, 0, 12);
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dosc implements ffjm {
    final /* synthetic */ dmzz a;
    final /* synthetic */ dlsr b;

    public dosc(dmzz dmzzVar, dlsr dlsrVar) {
        this.a = dmzzVar;
        this.b = dlsrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            igq a = dnaa.a(this.a, hfdVar);
            dlsr dlsrVar = this.b;
            hfdVar.v(-1438909129);
            long j = this.b.i ? ((ibw) hfdVar.e(fzc.a)).i : ibw.h;
            String str = dlsrVar.a;
            hfdVar.o();
            dwho.a(a, str, null, j, hfdVar, 0, 4);
        }
        return ffcu.a;
    }
}

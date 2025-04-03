package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dncg implements ffjm {
    final /* synthetic */ dmzz a;
    final /* synthetic */ boolean b;

    public dncg(dmzz dmzzVar, boolean z) {
        this.a = dmzzVar;
        this.b = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi k = ebs.k(eba.d(hvi.e, 8.0f), 20.0f);
            igq a = dnaa.a(this.a, hfdVar);
            if (this.b) {
                hfdVar.v(-1508663773);
                j = gft.a(hfdVar).g;
                hfdVar.o();
            } else {
                hfdVar.v(-1508599138);
                j = gft.a(hfdVar).s;
                hfdVar.o();
            }
            dwho.a(a, null, k, j, hfdVar, 384, 0);
        }
        return ffcu.a;
    }
}

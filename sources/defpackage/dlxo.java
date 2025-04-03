package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxo implements ffjm {
    final /* synthetic */ dmzz a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;

    public dlxo(dmzz dmzzVar, int i, long j) {
        this.a = dmzzVar;
        this.b = i;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            c = ebs.c(hvi.e, 1.0f);
            dwho.a(dnaa.a(this.a, hfdVar), jii.a(this.b, hfdVar), dmzy.a(c, (kah) hfdVar.e(jdr.j)), this.c, hfdVar, 0, 0);
        }
        return ffcu.a;
    }
}

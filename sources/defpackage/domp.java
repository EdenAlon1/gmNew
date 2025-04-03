package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class domp implements ffjm {
    final /* synthetic */ dmzz a;
    final /* synthetic */ String b;

    public domp(dmzz dmzzVar, String str) {
        this.a = dmzzVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.a(dnaa.a(this.a, hfdVar), this.b, null, gft.a(hfdVar).s, hfdVar, 0, 4);
        }
        return ffcu.a;
    }
}

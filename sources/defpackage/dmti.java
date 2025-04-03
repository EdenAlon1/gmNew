package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmti implements ffjm {
    final /* synthetic */ String a;

    public dmti(String str) {
        this.a = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            fea.b(null, hpx.d(2017082452, new dmth(this.a), hfdVar), hfdVar, 48);
        }
        return ffcu.a;
    }
}

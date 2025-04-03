package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drin implements ffjm {
    final /* synthetic */ igq a;
    final /* synthetic */ String b;

    public drin(igq igqVar, String str) {
        this.a = igqVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.a(this.a, this.b, ebs.k(hvi.e, 24.0f), 0L, hfdVar, 384, 8);
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpmc implements ffjn {
    final /* synthetic */ igq a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public dpmc(igq igqVar, String str, String str2) {
        this.a = igqVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            igq igqVar = this.a;
            String str = this.b;
            hve hveVar = hvi.e;
            ebe ebeVar = dwfd.a;
            dwho.a(igqVar, str, ebs.k(hveVar, dwfd.c), 0L, hfdVar, 0, 8);
            dwjt.b(this.c, eba.j(hvi.e, dwfd.d, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, hfdVar, 0, 3120, 120828);
        }
        return ffcu.a;
    }
}

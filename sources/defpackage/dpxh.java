package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpxh implements ffjn {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public dpxh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            long g = gft.d(hfdVar).o.g();
            hve hveVar = hvi.e;
            hfdVar.v(1486379252);
            boolean D = hfdVar.D(this.a);
            final String str = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffji() { // from class: dpxg
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        jkv jkvVar = (jkv) obj4;
                        jkvVar.getClass();
                        jkr.k(jkvVar, str);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            c = jjs.c(hveVar, false, (ffji) f);
            grl.b(this.b, c, 0L, g, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131060);
        }
        return ffcu.a;
    }
}

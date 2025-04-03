package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egvc implements ffjn {
    final /* synthetic */ ffix a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;

    public egvc(ffix ffixVar, String str, int i) {
        this.a = ffixVar;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        egtj egtjVar = (egtj) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        egtjVar.getClass();
        hpn d = hpx.d(953746485, new egvb(this.c), hfdVar);
        hfdVar.v(1229317402);
        boolean D = hfdVar.D(this.a);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            final ffix ffixVar = this.a;
            f = new ffix() { // from class: eguz
                @Override // defpackage.ffix
                public final Object invoke() {
                    ffix.this.invoke();
                    return ffcu.a;
                }
            };
            hfdVar.y(f);
        }
        hfdVar.o();
        ffix a = egtjVar.a((ffix) f);
        hve hveVar = hvi.e;
        hfdVar.v(1229319045);
        boolean D2 = hfdVar.D(this.b);
        final String str = this.b;
        Object f2 = hfdVar.f();
        if (D2 || f2 == hfc.a) {
            f2 = new ffji() { // from class: egva
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    jkv jkvVar = (jkv) obj4;
                    jkvVar.getClass();
                    jkr.u(jkvVar, str);
                    return ffcu.a;
                }
            };
            hfdVar.y(f2);
        }
        hfdVar.o();
        c = jjs.c(hveVar, false, (ffji) f2);
        dwhw.a(d, a, c, null, false, null, null, hfdVar, 6, 504);
        return ffcu.a;
    }
}

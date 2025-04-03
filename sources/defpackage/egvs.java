package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egvs implements ffjn {
    final /* synthetic */ hho a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffji c;
    final /* synthetic */ egse d;

    public egvs(hho hhoVar, boolean z, ffji ffjiVar, egse egseVar) {
        this.a = hhoVar;
        this.b = z;
        this.c = ffjiVar;
        this.d = egseVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        egtj egtjVar = (egtj) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        egtjVar.getClass();
        hfdVar.v(-452060209);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            final hho hhoVar = this.a;
            ffix ffixVar = new ffix() { // from class: egvi
                @Override // defpackage.ffix
                public final Object invoke() {
                    egvv.c(hho.this, true);
                    return ffcu.a;
                }
            };
            hfdVar.y(ffixVar);
            f = ffixVar;
        }
        hfdVar.o();
        ffix a = egtjVar.a((ffix) f);
        hve hveVar = hvi.e;
        hfdVar.v(-452057807);
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = new ffji() { // from class: egvj
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    jkv jkvVar = (jkv) obj4;
                    jkvVar.getClass();
                    jkr.u(jkvVar, "dropdownButton");
                    return ffcu.a;
                }
            };
            hfdVar.y(f2);
        }
        hfdVar.o();
        c = jjs.c(hveVar, false, (ffji) f2);
        dwhl.b(a, ebs.h(c, 48.0f), false, null, null, hpx.d(-2053179218, new egvr(this.a, this.b, this.c, this.d), hfdVar), hfdVar, 1572864, 60);
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egwk implements ffjn {
    final /* synthetic */ ffix a;
    final /* synthetic */ boolean b;

    public egwk(ffix ffixVar, boolean z) {
        this.a = ffixVar;
        this.b = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        egtj egtjVar = (egtj) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        egtjVar.getClass();
        hfdVar.v(-1416899641);
        boolean D = hfdVar.D(this.a);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            final ffix ffixVar = this.a;
            f = new ffix() { // from class: egwi
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
        boolean z = this.b;
        hve hveVar = hvi.e;
        hfdVar.v(-1416896591);
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = new ffji() { // from class: egwj
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    jkv jkvVar = (jkv) obj4;
                    jkvVar.getClass();
                    jkr.u(jkvVar, "nameEdit");
                    return ffcu.a;
                }
            };
            hfdVar.y(f2);
        }
        hfdVar.o();
        c = jjs.c(hveVar, false, (ffji) f2);
        dwhl.b(a, c, !z, null, null, eguk.f, hfdVar, 1572864, 56);
        return ffcu.a;
    }
}

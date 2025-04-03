package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbhw implements ffjm {
    final /* synthetic */ igz a;
    final /* synthetic */ hho b;

    public dbhw(igz igzVar, hho hhoVar) {
        this.a = igzVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long f;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            igz igzVar = this.a;
            hve hveVar = hvi.e;
            hfdVar.v(262164302);
            final hho hhoVar = this.b;
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                f2 = new ffix() { // from class: dbhv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dbip.f(hho.this, !dbip.g(r0));
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            hvi a = jfw.a(dfb.d(hveVar, false, null, (ffix) f2, 7), "accountDropDownIcon");
            int i = fkv.a;
            f = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), ((Number) hfdVar.e(fiz.a)).floatValue(), ibw.f(((ibw) hfdVar.e(fjb.a)).i));
            fkv.a(iim.b(igzVar, hfdVar), a, f, hfdVar, 56);
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dazw implements ffjm {
    final /* synthetic */ dbac a;

    public dazw(dbac dbacVar) {
        this.a = dbacVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(1579953180);
            boolean F = hfdVar.F(this.a);
            final dbac dbacVar = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ffix() { // from class: dazv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        eg G = dbac.this.a.G();
                        if (G != null) {
                            G.finish();
                        }
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dwhl.b((ffix) f, null, false, null, null, dbaf.b, hfdVar, 1572864, 62);
        }
        return ffcu.a;
    }
}

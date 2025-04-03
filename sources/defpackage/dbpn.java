package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbpn implements ffjm {
    final /* synthetic */ dbpr a;

    public dbpn(dbpr dbprVar) {
        this.a = dbprVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-1724795182);
            boolean F = hfdVar.F(this.a);
            final dbpr dbprVar = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ffix() { // from class: dbpm
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        eg G = ((dbpf) dbpr.this.a.b()).G();
                        if (G != null) {
                            G.finish();
                        }
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dwhl.b((ffix) f, null, false, null, null, dboc.b, hfdVar, 1572864, 62);
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbfa implements ffjm {
    final /* synthetic */ dbfg a;

    public dbfa(dbfg dbfgVar) {
        this.a = dbfgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-1123206218);
            boolean F = hfdVar.F(this.a);
            final dbfg dbfgVar = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ffix() { // from class: dbez
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        eg G = ((dbet) dbfg.this.a.b()).G();
                        if (G != null) {
                            G.finish();
                        }
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dwhl.b((ffix) f, null, false, null, null, dbeo.b, hfdVar, 1572864, 62);
        }
        return ffcu.a;
    }
}

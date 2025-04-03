package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dndf implements ffjm {
    final /* synthetic */ dndq a;

    public dndf(dndq dndqVar) {
        this.a = dndqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dndq dndqVar = this.a;
            if (dndqVar instanceof dndl) {
                hfdVar.v(1534827115);
                dndg.b((dndl) this.a, hfdVar, 0);
                hfdVar.o();
            } else if (dndqVar instanceof dndp) {
                hfdVar.v(1534829448);
                dndg.d(hfdVar, 0);
                hfdVar.o();
            } else if (dndqVar instanceof dndi) {
                hfdVar.v(1534831556);
                dndg.a(hfdVar, 0);
                hfdVar.o();
            } else {
                if (!(dndqVar instanceof dndn)) {
                    hfdVar.v(1534825676);
                    hfdVar.o();
                    throw new ffcd();
                }
                hfdVar.v(1534833606);
                dndg.c(hfdVar, 0);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}

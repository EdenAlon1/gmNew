package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czqn implements ffjm {
    final /* synthetic */ dokm a;
    final /* synthetic */ ffix b;

    public czqn(dokm dokmVar, ffix ffixVar) {
        this.a = dokmVar;
        this.b = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi j = eba.j(hvi.e, 8.0f, 0.0f, 0.0f, 4.0f, 6);
            dokm dokmVar = this.a;
            if (dokmVar instanceof dokq) {
                hfdVar.v(17942625);
                dojg.e(dokq.e((dokq) this.a, this.b), j, hfdVar, 48, 0);
                hfdVar.o();
            } else if (dokmVar instanceof dokw) {
                hfdVar.v(17946497);
                dojg.e(dokw.e((dokw) this.a, this.b), j, hfdVar, 48, 0);
                hfdVar.o();
            } else if (dokmVar instanceof doip) {
                hfdVar.v(17950120);
                doim.a(doip.b((doip) this.a, this.b), j, hfdVar, 48, 0);
                hfdVar.o();
            } else {
                hfdVar.v(556533299);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}

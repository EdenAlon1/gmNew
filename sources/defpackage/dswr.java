package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dswr implements ffjn {
    final /* synthetic */ gmm a;

    public dswr(gmm gmmVar) {
        this.a = gmmVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        gnn gnnVar = (gnn) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        gnnVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != ((intValue & 8) == 0 ? hfdVar.D(gnnVar) : hfdVar.F(gnnVar)) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwiv.a.a(gnnVar, hxo.a(ebs.e(hvi.e, 2.0f), eqm.b(100.0f)), false, this.a, null, 0.0f, 0.0f, hfdVar, (intValue & 14) | 14376968, 4);
        }
        return ffcu.a;
    }
}

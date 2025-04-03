package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doig implements ffjn {
    public static final doig a = new doig();

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dokm dokmVar = (dokm) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dokmVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dokmVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else if (dokmVar instanceof dokx) {
            hfdVar.v(872357565);
            dojg.e((dokx) dokmVar, null, hfdVar, 0, 2);
            hfdVar.o();
        } else {
            if (!(dokmVar instanceof doip)) {
                hfdVar.v(872355698);
                hfdVar.o();
                throw new ffcd();
            }
            hfdVar.v(872359780);
            doim.a((doip) dokmVar, null, hfdVar, 0, 2);
            hfdVar.o();
        }
        return ffcu.a;
    }
}

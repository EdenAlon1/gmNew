package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dogs implements ffjn {
    final /* synthetic */ hvi a;

    public dogs(hvi hviVar) {
        this.a = hviVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dogx dogxVar = (dogx) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dogxVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dogxVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwfo.a(this.a, eqm.b(30.0f), dwfk.b(gft.a(hfdVar).y, gft.a(hfdVar).q, hfdVar, 12), null, null, hpx.d(927214484, new dogr(dogxVar), hfdVar), hfdVar, 196608, 24);
        }
        return ffcu.a;
    }
}

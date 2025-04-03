package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doch implements ffjn {
    final /* synthetic */ dodv a;

    public doch(dodv dodvVar) {
        this.a = dodvVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dys dysVar = (dys) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dysVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dysVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            docn.b(docn.m(hvi.e, this.a.b, hfdVar), hpx.d(2092907567, new docg(this.a, dysVar), hfdVar), hfdVar, 48);
        }
        return ffcu.a;
    }
}

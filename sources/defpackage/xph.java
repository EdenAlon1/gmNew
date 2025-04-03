package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xph implements ffjp {
    final /* synthetic */ xpi a;
    final /* synthetic */ hho b;

    public xph(xpi xpiVar, hho hhoVar) {
        this.a = xpiVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dsrm dsrmVar = (dsrm) obj;
        hvi hviVar = (hvi) obj2;
        xqb xqbVar = (xqb) obj3;
        hfd hfdVar = (hfd) obj4;
        int intValue = ((Number) obj5).intValue();
        dsrmVar.getClass();
        hviVar.getClass();
        xqbVar.getClass();
        this.a.i(dsrmVar, hviVar, xqbVar, xpi.j(dsrmVar, hfdVar), hfdVar, (intValue & 126) | 512 | (intValue & 896));
        this.a.c(xqbVar.e, this.b, hfdVar, 0);
        return ffcu.a;
    }
}

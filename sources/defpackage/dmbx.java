package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmbx implements ffjn {
    final /* synthetic */ dmas a;

    public dmbx(dmas dmasVar) {
        this.a = dmasVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dmba dmbaVar = (dmba) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dmbaVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dmbaVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmas dmasVar = this.a;
            dmcf.b(dmbaVar, dmasVar.e.a, dmasVar.c, hfdVar, intValue & 14);
        }
        return ffcu.a;
    }
}

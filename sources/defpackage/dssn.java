package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dssn implements ffjo {
    final /* synthetic */ ffjp a;
    final /* synthetic */ int b;

    public dssn(ffjp ffjpVar, int i) {
        this.a = ffjpVar;
        this.b = i;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        kgc kgcVar = (kgc) obj;
        kfr kfrVar = (kfr) obj2;
        hfd hfdVar = (hfd) obj3;
        int intValue = ((Number) obj4).intValue();
        kgcVar.getClass();
        kfrVar.getClass();
        if ((intValue & 6) == 0) {
            i = (true != ((intValue & 8) == 0 ? hfdVar.D(kgcVar) : hfdVar.F(kgcVar)) ? 2 : 4) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= true != hfdVar.D(kfrVar) ? 16 : 32;
        }
        if ((i & 147) == 146 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.f(kgcVar, kfrVar, Integer.valueOf(this.b), hfdVar, Integer.valueOf((i & 112) | (i & 14) | 8));
        }
        return ffcu.a;
    }
}

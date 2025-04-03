package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkr extends ffkk implements ffjn {
    final /* synthetic */ ffji a;
    final /* synthetic */ djw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkr(ffji ffjiVar, djw djwVar) {
        super(3);
        this.a = ffjiVar;
        this.b = djwVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        int i = intValue & 17;
        if (hfdVar.J(i != 16, intValue & 1)) {
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new dkg();
                hfdVar.y(f);
            }
            ffji ffjiVar = this.a;
            djw djwVar = this.b;
            dkg dkgVar = (dkg) f;
            dkgVar.a.clear();
            ffjiVar.invoke(dkgVar);
            dkgVar.a(djwVar, hfdVar, 0);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class domd implements ffjm {
    final /* synthetic */ dyh a;
    final /* synthetic */ doml b;
    final /* synthetic */ kak c;

    public domd(dyh dyhVar, doml domlVar, kak kakVar) {
        this.a = dyhVar;
        this.b = domlVar;
        this.c = kakVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dyh dyhVar = this.a;
            doml domlVar = this.b;
            domg.d(dyhVar, domlVar, this.c, domlVar.o, hfdVar, 0);
        }
        return ffcu.a;
    }
}

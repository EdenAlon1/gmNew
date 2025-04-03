package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsz implements ffjm {
    final /* synthetic */ dnoq a;
    final /* synthetic */ eqd b;

    public zsz(dnoq dnoqVar, eqd eqdVar) {
        this.a = dnoqVar;
        this.b = eqdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            zta.b(((doml) this.a).c, this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}

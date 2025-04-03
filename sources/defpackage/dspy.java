package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dspy implements ffjm {
    final /* synthetic */ dspo a;
    final /* synthetic */ god b;

    public dspy(dspo dspoVar, god godVar) {
        this.a = dspoVar;
        this.b = godVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dsqb.a(hpx.d(1341697052, new dspx(this.a, this.b), hfdVar), hfdVar, 6);
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dome implements ffjm {
    final /* synthetic */ doml a;
    final /* synthetic */ cxj b;

    public dome(doml domlVar, cxj cxjVar) {
        this.a = domlVar;
        this.b = cxjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            done.c(this.a, ((ibw) this.b.d()).i, hfdVar, 0);
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpqa implements ffjm {
    final /* synthetic */ dptl a;

    public dpqa(dptl dptlVar) {
        this.a = dptlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dpqe.n(this.a.n, null, hfdVar, 0);
        }
        return ffcu.a;
    }
}

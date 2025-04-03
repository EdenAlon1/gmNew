package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ioz extends ffkk implements ffjm {
    final /* synthetic */ ior a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioz(ior iorVar, ffjm ffjmVar) {
        super(2);
        this.a = iorVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            ior iorVar = this.a;
            ffjm ffjmVar = this.b;
            boolean a = iorVar.a();
            hfdVar.K(Boolean.valueOf(a));
            boolean E = hfdVar.E(a);
            if (a) {
                ffjmVar.a(hfdVar, 0);
            } else {
                hfdVar.k(E);
            }
            hfdVar.q();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfy extends ffkk implements ffjm {
    final /* synthetic */ gvs a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfy(gvs gvsVar, ffjm ffjmVar) {
        super(2);
        this.a = gvsVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gvs gvsVar = this.a;
            grl.a(gvsVar.j, this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}

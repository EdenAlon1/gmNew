package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfe extends ffkk implements ffjm {
    final /* synthetic */ gez a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfe(gez gezVar, ffjm ffjmVar) {
        super(2);
        this.a = gezVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi j = eba.j(hvi.e, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            gez gezVar = this.a;
            ffjm ffjmVar = this.b;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, j);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b, iss.c);
            hfz.a(fzc.a.c(new ibw(gezVar.c)), ffjmVar, hfdVar, 8);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

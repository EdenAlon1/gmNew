package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gut extends ffkk implements ffjm {
    final /* synthetic */ dbe a;
    final /* synthetic */ ffjn b;
    final /* synthetic */ gve c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gut(dbe dbeVar, ffjn ffjnVar, gve gveVar) {
        super(2);
        this.a = dbeVar;
        this.b = ffjnVar;
        this.c = gveVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dbe dbeVar = this.a;
            hve hveVar = hvi.e;
            float f = gvc.a;
            hvi g = huz.g(hveVar, new gva(dbeVar));
            ffjn ffjnVar = this.b;
            gve gveVar = this.c;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, g);
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
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            ffjnVar.a(gveVar, hfdVar, 6);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwj extends ffkk implements ffjo {
    final /* synthetic */ gxa a;
    final /* synthetic */ gws b;
    final /* synthetic */ ffjo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwj(gxa gxaVar, gws gwsVar, ffjo ffjoVar) {
        super(4);
        this.a = gxaVar;
        this.b = gwsVar;
        this.c = ffjoVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = new gwb();
            hfdVar.y(f);
        }
        gwb gwbVar = (gwb) f;
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = new gwd(gwbVar);
            hfdVar.y(f2);
        }
        gwd gwdVar = (gwd) f2;
        Object f3 = hfdVar.f();
        if (f3 == hfc.a) {
            f3 = new gwi(gwbVar);
            hfdVar.y(f3);
        }
        gxa gxaVar = this.a;
        gws gwsVar = this.b;
        gwi gwiVar = (gwi) f3;
        hve hveVar = hvi.e;
        boolean D = hfdVar.D(gwsVar);
        gws gwsVar2 = this.b;
        Object f4 = hfdVar.f();
        if (D || f4 == hfc.a) {
            f4 = new gwh(gwsVar2);
            hfdVar.y(f4);
        }
        hvi a = gwr.a(hveVar, intValue, gxaVar, (ffix) f4, gwbVar, gwiVar);
        ffjo ffjoVar = this.c;
        int i = huo.a;
        ipn a2 = dyc.a(hum.a, false);
        int a3 = hey.a(hfdVar);
        hgb c = hfdVar.c();
        hvi b = huz.b(hfdVar, a);
        int i2 = ist.a;
        ffix ffixVar = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a2, iss.e);
        hlc.b(hfdVar, c, iss.d);
        ffjm ffjmVar = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
            Integer valueOf = Integer.valueOf(a3);
            hfdVar.y(valueOf);
            hfdVar.h(valueOf, ffjmVar);
        }
        hlc.b(hfdVar, b, iss.c);
        ffjoVar.a(gwdVar, Integer.valueOf(intValue), hfdVar, Integer.valueOf(intValue2 & 112));
        hfdVar.n();
        return ffcu.a;
    }
}

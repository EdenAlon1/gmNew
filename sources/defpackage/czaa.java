package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czaa implements ffjn {
    final /* synthetic */ float a;
    final /* synthetic */ czai b;
    final /* synthetic */ cyxt c;

    public czaa(float f, czai czaiVar, cyxt cyxtVar) {
        this.a = f;
        this.b = czaiVar;
        this.c = cyxtVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        d = ebs.d(hxe.a(hvi.e, this.a), 1.0f);
        hvi j = eba.j(d, 0.0f, 0.0f, 0.0f, 80.0f, 7);
        int i = huo.a;
        ipn a = dyc.a(hum.e, false);
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
        ffjm ffjmVar = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
            Integer valueOf = Integer.valueOf(a2);
            hfdVar.y(valueOf);
            hfdVar.h(valueOf, ffjmVar);
        }
        cyxt cyxtVar = this.c;
        czai czaiVar = this.b;
        hlc.b(hfdVar, b, iss.c);
        czah.i(!czaiVar.d, cyxtVar, czaiVar.b, hfdVar, 0);
        hfdVar.n();
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dswo implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d = true;
    final /* synthetic */ boolean e;
    final /* synthetic */ ffji f;
    final /* synthetic */ ffix g;
    final /* synthetic */ String h;
    final /* synthetic */ String i;
    final /* synthetic */ dyn j;

    public dswo(dyn dynVar, boolean z, ffix ffixVar, float f, boolean z2, boolean z3, ffji ffjiVar, ffix ffixVar2, String str, String str2) {
        this.j = dynVar;
        this.a = z;
        this.b = ffixVar;
        this.c = f;
        this.e = z3;
        this.f = ffjiVar;
        this.g = ffixVar2;
        this.h = str;
        this.i = str2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        hve hveVar = hvi.e;
        dyn dynVar = this.j;
        hvi m = ebs.m(hveVar, dynVar.d(), dynVar.c());
        int i = huo.a;
        ipn a = dyc.a(hum.a, false);
        int a2 = hey.a(hfdVar);
        hgb c = hfdVar.c();
        hvi b = huz.b(hfdVar, m);
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
        String str = this.i;
        String str2 = this.h;
        ffix ffixVar2 = this.g;
        ffji ffjiVar = this.f;
        boolean z = this.e;
        float f = this.c;
        ffix ffixVar3 = this.b;
        boolean z2 = this.a;
        hlc.b(hfdVar, b, iss.c);
        dyi dyiVar = dyi.a;
        dswt.d(dyiVar, z2, ffixVar3, hfdVar, 6);
        dswt.e(eba.d(dyiVar.a(hvi.e, hum.h), 16.0f), f, true, z, ffjiVar, ffixVar2, hfdVar, 0);
        dswt.a(dyiVar, str2, str, true, hfdVar, 6);
        hfdVar.n();
        return ffcu.a;
    }
}

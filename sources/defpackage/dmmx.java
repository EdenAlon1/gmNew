package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmx implements ffjm {
    final /* synthetic */ dmnb a;
    final /* synthetic */ ibw b;
    final /* synthetic */ boolean c;

    public dmmx(dmnb dmnbVar, ibw ibwVar, boolean z) {
        this.a = dmnbVar;
        this.b = ibwVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int i = huo.a;
            dmnb dmnbVar = this.a;
            ibw ibwVar = this.b;
            boolean z = this.c;
            hus husVar = hum.n;
            hve hveVar = hvi.e;
            ipn a = ebm.a(dxu.a, husVar, hfdVar, 48);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, hveVar);
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
            dmna.d(ebr.a, dmnbVar.a, ibwVar, hfdVar, 6);
            dmna.b(dmnbVar.d, dmnbVar.b, !z, hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

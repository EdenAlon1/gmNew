package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmrg implements ffjm {
    final /* synthetic */ dmms a;
    final /* synthetic */ dmpg b;
    final /* synthetic */ float c;
    final /* synthetic */ hzi d;
    final /* synthetic */ dmpi e;
    final /* synthetic */ dmov f;

    public dmrg(dmms dmmsVar, dmpg dmpgVar, float f, hzi hziVar, dmpi dmpiVar, dmov dmovVar) {
        this.a = dmmsVar;
        this.b = dmpgVar;
        this.c = f;
        this.d = hziVar;
        this.e = dmpiVar;
        this.f = dmovVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmms dmmsVar = this.a;
            dmpg dmpgVar = this.b;
            float f = this.c;
            hzi hziVar = this.d;
            dmpi dmpiVar = this.e;
            dmov dmovVar = this.f;
            dxq dxqVar = dxu.d;
            hve hveVar = hvi.e;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 6);
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
            dmmi.a(dmmsVar.b, false, dmpgVar, f, null, hfdVar, 48, 16);
            hvi j = eba.j(hvi.e, 16.0f, 0.0f, 4.0f, 0.0f, 10);
            ipn a3 = ebm.a(dxu.a, hum.o, hfdVar, 48);
            int a4 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, j);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a3, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            dmmi.o(ebr.a, dmmsVar, hziVar, dmpgVar, f, null, dmpiVar, hfdVar, 6, 112);
            dmrh.a(dmmsVar, dmovVar, hfdVar, 0);
            hfdVar.n();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

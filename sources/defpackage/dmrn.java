package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmrn implements ffjm {
    final /* synthetic */ dmms a;
    final /* synthetic */ float b;
    final /* synthetic */ dmpg c;
    final /* synthetic */ hzi d;
    final /* synthetic */ dmpi e;

    public dmrn(dmms dmmsVar, float f, dmpg dmpgVar, hzi hziVar, dmpi dmpiVar) {
        this.a = dmmsVar;
        this.b = f;
        this.c = dmpgVar;
        this.d = hziVar;
        this.e = dmpiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmms dmmsVar = this.a;
            float f = this.b;
            dmpg dmpgVar = this.c;
            hzi hziVar = this.d;
            dmpi dmpiVar = this.e;
            hve hveVar = hvi.e;
            dxi dxiVar = dxu.a;
            int i = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, hfdVar, 0);
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
            hve hveVar2 = hvi.e;
            ipn a3 = dyo.a(dxu.c, hum.j, hfdVar, 0);
            int a4 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, hveVar2);
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
            dmmi.h(dmmsVar.c, null, f, true, hfdVar, 3120, 0);
            dmmi.a(dmmsVar.b, false, dmpgVar, f, null, hfdVar, 48, 16);
            dmro.a(dmmsVar, hziVar, dmpgVar, f, dmpiVar, hfdVar, 0);
            hfdVar.n();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

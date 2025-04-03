package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmqn implements ffjm {
    final /* synthetic */ dmms a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dmpg c;
    final /* synthetic */ float d;
    final /* synthetic */ hzi e;
    final /* synthetic */ dmpi f;
    final /* synthetic */ dmov g;
    final /* synthetic */ dmnh h;
    final /* synthetic */ hho i;
    final /* synthetic */ boolean j;
    final /* synthetic */ hho k;

    public dmqn(dmms dmmsVar, boolean z, dmpg dmpgVar, float f, hzi hziVar, dmpi dmpiVar, dmov dmovVar, dmnh dmnhVar, hho hhoVar, boolean z2, hho hhoVar2) {
        this.a = dmmsVar;
        this.b = z;
        this.c = dmpgVar;
        this.d = f;
        this.e = hziVar;
        this.f = dmpiVar;
        this.g = dmovVar;
        this.h = dmnhVar;
        this.i = hhoVar;
        this.j = z2;
        this.k = hhoVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmms dmmsVar = this.a;
            boolean z = this.b;
            dmpg dmpgVar = this.c;
            float f = this.d;
            hzi hziVar = this.e;
            dmpi dmpiVar = this.f;
            dmov dmovVar = this.g;
            dmnh dmnhVar = this.h;
            hho hhoVar = this.i;
            boolean z2 = this.j;
            final hho hhoVar2 = this.k;
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
            dmml dmmlVar = dmmsVar.e;
            dmmi.a(dmmsVar.b, z, dmpgVar, f, dmmlVar != null ? dmmlVar.a : null, hfdVar, 0, 0);
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
            ebr ebrVar = ebr.a;
            hfdVar.v(-1711097930);
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                f2 = new ffji() { // from class: dmqm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        hzo hzoVar = (hzo) obj3;
                        hzoVar.getClass();
                        hho.this.b(Boolean.valueOf(hzoVar.b()));
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            dmmi.o(ebrVar, dmmsVar, hziVar, dmpgVar, f, (ffji) f2, dmpiVar, hfdVar, 196614, 96);
            dmqo.b(dmmsVar, dmovVar, dmnhVar, hhoVar, z2, dmpgVar, dmpiVar, hfdVar, 3072);
            hfdVar.n();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

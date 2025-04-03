package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doln implements ffjn {
    final /* synthetic */ float a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ hus c;

    public doln(float f, hus husVar, ffjm ffjmVar) {
        this.a = f;
        this.c = husVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        hvi a;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((String) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            c = ebs.c(eba.j(hvi.e, this.a, 0.0f, 0.0f, 0.0f, 10), 1.0f);
            hus husVar = this.c;
            ffjm ffjmVar = this.b;
            dxi dxiVar = dxu.a;
            int i = huo.a;
            ipn a2 = ebm.a(dxiVar, hum.m, hfdVar, 0);
            int a3 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
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
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b, iss.c);
            ebr ebrVar = ebr.a;
            a = ebrVar.a(ebs.e(hvi.e, 1.0f), 1.0f, true);
            ebv.a(a, hfdVar);
            hvi b2 = ebrVar.b(hvi.e, husVar);
            ipn a4 = dyc.a(hum.a, false);
            int a5 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b3 = huz.b(hfdVar, b2);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a4, iss.e);
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar3);
            }
            hlc.b(hfdVar, b3, iss.c);
            ffjmVar.a(hfdVar, 0);
            hfdVar.n();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

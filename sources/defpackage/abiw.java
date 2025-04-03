package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abiw implements ffjn {
    final /* synthetic */ dnem a;
    final /* synthetic */ dwn b;

    public abiw(dnem dnemVar, dwn dwnVar) {
        this.a = dnemVar;
        this.b = dwnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi a;
        hvi d;
        ebq ebqVar = (ebq) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ebqVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(ebqVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            a = ebqVar.a(hvi.e, 1.0f, true);
            hvi i = eba.i(a, 0.0f, 0.0f, 2);
            int i2 = huo.a;
            dnem dnemVar = this.a;
            dwn dwnVar = this.b;
            ipn a2 = dyo.a(dxu.c, hum.j, hfdVar, 48);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, i);
            int i3 = ist.a;
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
            d = ebs.d(hvi.e, 1.0f);
            ipn a4 = ebm.a(dxu.a, hum.n, hfdVar, 48);
            int a5 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, d);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a4, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            abiy.g(dnemVar, dwnVar, hfdVar, 48);
            abiy.d(dnemVar, hfdVar, 0);
            hfdVar.n();
            String str = dnemVar.b;
            hfdVar.v(-2030800680);
            if (str != null) {
                ebv.a(ebs.e(hvi.e, 2.0f), hfdVar);
                abiy.c(str, dnemVar.c, eba.j(hvi.e, 12.0f, 0.0f, 0.0f, 0.0f, 14), hfdVar, 384);
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

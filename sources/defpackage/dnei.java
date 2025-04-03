package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnei implements ffjn {
    final /* synthetic */ dnem a;
    final /* synthetic */ dwn b;

    public dnei(dnem dnemVar, dwn dwnVar) {
        this.a = dnemVar;
        this.b = dwnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi a;
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
            hfdVar.v(-1024512893);
            dnem dnemVar = this.a;
            if (!dnemVar.e) {
                dnej.f(dnemVar, this.b, hfdVar, 48);
            }
            hfdVar.o();
            a = ebqVar.a(hvi.e, 1.0f, true);
            hvi i = eba.i(a, 8.0f, 0.0f, 2);
            dnem dnemVar2 = this.a;
            dxq dxqVar = dxu.c;
            int i2 = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, hfdVar, 0);
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
            dnej.d(dnemVar2, hfdVar, 0);
            String str = dnemVar2.b;
            hfdVar.v(-1324454702);
            if (str != null) {
                ebv.a(ebs.e(hvi.e, 2.0f), hfdVar);
                dnej.b(str, dnemVar2.c, hfdVar, 0);
            }
            hfdVar.o();
            hfdVar.n();
            dnem dnemVar3 = this.a;
            if (dnemVar3.e) {
                dnej.f(dnemVar3, this.b, hfdVar, 48);
            }
        }
        return ffcu.a;
    }
}

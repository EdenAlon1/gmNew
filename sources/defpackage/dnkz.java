package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnkz implements ffjn {
    final /* synthetic */ dnlc a;
    final /* synthetic */ dwn b;

    public dnkz(dnlc dnlcVar, dwn dwnVar) {
        this.a = dnlcVar;
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
            dnlc dnlcVar = this.a;
            hfdVar.v(1906712313);
            dmzz dmzzVar = dnlcVar.b;
            if (dmzzVar != null) {
                dnla.a(dmzzVar, hfdVar, 0);
            }
            hfdVar.o();
            a = ebqVar.a(hvi.e, 1.0f, true);
            hvi i = eba.i(a, 16.0f, 0.0f, 2);
            dnlc dnlcVar2 = this.a;
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
            dnla.f(dnlcVar2.a, hfdVar, 0);
            hfdVar.v(-1179242564);
            hfdVar.o();
            hfdVar.n();
            dnla.c(this.a, this.b, hfdVar, 48);
        }
        return ffcu.a;
    }
}

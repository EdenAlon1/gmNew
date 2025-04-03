package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abix implements ffjn {
    final /* synthetic */ dnia a;
    final /* synthetic */ dwn b;

    public abix(dnia dniaVar, dwn dwnVar) {
        this.a = dniaVar;
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
            dnia dniaVar = this.a;
            dwil.a(dniaVar.d, dniaVar.e, null, false, null, this.b, hfdVar, 196608, 28);
            a = ebqVar.a(hvi.e, 1.0f, true);
            hvi j = eba.j(a, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            dnia dniaVar2 = this.a;
            dxj dxjVar = dxu.e;
            int i = huo.a;
            ipn a2 = dyo.a(dxjVar, hum.j, hfdVar, 6);
            int a3 = hey.a(hfdVar);
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
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            abiy.f(dniaVar2.a, hfdVar, 0);
            String str = dniaVar2.b;
            hfdVar.v(1412985146);
            if (str != null) {
                abiy.e(str, hfdVar, 0);
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

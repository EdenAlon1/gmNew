package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dobf implements ffjn {
    final /* synthetic */ dobh a;

    public dobf(dobh dobhVar) {
        this.a = dobhVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi i = eba.i(d, 0.0f, 16.0f, 1);
            int i2 = huo.a;
            dobh dobhVar = this.a;
            ipn a = dyo.a(dxu.c, hum.k, hfdVar, 48);
            int a2 = hey.a(hfdVar);
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
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            dnxw.j(dobhVar.a, ebs.k(hvi.e, 72.0f), hfdVar, 48);
            hfdVar.v(-974246480);
            hfdVar.o();
            dobg.b(dobhVar.b, eba.j(hvi.e, 0.0f, 12.0f, 0.0f, 0.0f, 13), hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmuw implements ffjm {
    final /* synthetic */ ffjn a;

    public dmuw(ffjn ffjnVar) {
        this.a = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi i = eba.i(ebs.w(hvi.e, 280.0f, 0.0f, 560.0f, 0.0f, 10), 0.0f, 24.0f, 1);
            ffjn ffjnVar = this.a;
            dxq dxqVar = dxu.c;
            int i2 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
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
            ffjnVar.a(dys.a, hfdVar, 6);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

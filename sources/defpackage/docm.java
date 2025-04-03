package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class docm implements ffjn {
    final /* synthetic */ dody a;

    public docm(dody dodyVar) {
        this.a = dodyVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi u = ebs.u(docn.m(hvi.e, this.a.e, hfdVar), 112.0f, 0.0f, 2);
            dody dodyVar = this.a;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, u);
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
            docp docpVar = dodyVar.c;
            hfdVar.v(-1289710052);
            if (docpVar != null) {
                docn.c(docpVar, null, hfdVar, 0, 2);
            }
            hfdVar.o();
            hfdVar.v(-1289708350);
            if (dodyVar.a != null || dodyVar.b != null || !dodyVar.d.isEmpty()) {
                dodp.f(dodyVar, hfdVar, 0);
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

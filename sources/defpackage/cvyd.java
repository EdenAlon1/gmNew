package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvyd implements ffjm {
    final /* synthetic */ cvxk a;

    public cvyd(cvxk cvxkVar) {
        this.a = cvxkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dxj dxjVar = dxu.e;
            int i = huo.a;
            cvxk cvxkVar = this.a;
            hus husVar = hum.n;
            hve hveVar = hvi.e;
            ipn a = ebm.a(dxjVar, husVar, hfdVar, 54);
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
            cvye.d(hfdVar, 0);
            ebv.a(ebs.o(hvi.e, 16.0f), hfdVar);
            cvye.e(cvxkVar.a, hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

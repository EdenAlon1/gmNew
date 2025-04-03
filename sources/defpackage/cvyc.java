package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvyc implements ffjm {
    final /* synthetic */ cvxk a;

    public cvyc(cvxk cvxkVar) {
        this.a = cvxkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cvxk cvxkVar = this.a;
            hve hveVar = hvi.e;
            dxi dxiVar = dxu.a;
            int i = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, hfdVar, 0);
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
            ebv.a(ebs.o(hvi.e, 16.0f), hfdVar);
            dwfj.e(cvxkVar.c, null, false, null, null, null, hpx.d(-889573057, new cvyb(cvxkVar), hfdVar), hfdVar, 805306368, 510);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

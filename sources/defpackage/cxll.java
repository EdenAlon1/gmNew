package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxll implements ffjm {
    final /* synthetic */ cxlf a;

    public cxll(cxlf cxlfVar) {
        this.a = cxlfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hvi c2;
        hvi b;
        hvi b2;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            c = ebs.c(hvi.e, 1.0f);
            c2 = dix.c(eba.d(c, 28.0f), dix.a(0, hfdVar, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            cxlf cxlfVar = this.a;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b3 = huz.b(hfdVar, c2);
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
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b3, iss.c);
            dys dysVar = dys.a;
            b = dys.b(hvi.e, 1.0f, true);
            ebv.a(b, hfdVar);
            cxlm.d(dysVar, hfdVar, 6);
            b2 = dys.b(hvi.e, 1.0f, true);
            ebv.a(b2, hfdVar);
            cxlm.a(cxlfVar.b, cxlfVar.a, hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

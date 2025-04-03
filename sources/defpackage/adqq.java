package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adqq implements ffjm {
    final /* synthetic */ adqf a;

    public adqq(adqf adqfVar) {
        this.a = adqfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hvi c2;
        hvi b;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            c = ebs.c(hvi.e, 1.0f);
            c2 = dix.c(eba.i(c, 20.0f, 0.0f, 2), dix.a(0, hfdVar, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            int i = huo.a;
            adqf adqfVar = this.a;
            ipn a = dyo.a(dxu.c, hum.k, hfdVar, 48);
            int a2 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, c2);
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
            hlc.b(hfdVar, b2, iss.c);
            dys dysVar = dys.a;
            ebv.a(ebs.e(hvi.e, 20.0f), hfdVar);
            adqr.h(dysVar, hfdVar, 6);
            ebv.a(ebs.e(hvi.e, 72.0f), hfdVar);
            adqr.g(dysVar, adqfVar, hfdVar, 6);
            b = dys.b(hvi.e, 1.0f, true);
            ebv.a(ebs.u(b, 20.0f, 0.0f, 2), hfdVar);
            adqr.a(adqfVar.d, adqfVar.c, adqfVar.a, hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

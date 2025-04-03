package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgj implements ffjp {
    final /* synthetic */ zgm a;

    public zgj(zgm zgmVar) {
        this.a = zgmVar;
    }

    @Override // defpackage.ffjp
    public final /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dspk dspkVar = (dspk) obj;
        hvi hviVar = (hvi) obj2;
        zgv zgvVar = (zgv) obj3;
        hfd hfdVar = (hfd) obj4;
        int intValue = ((Number) obj5).intValue();
        dspkVar.getClass();
        hviVar.getClass();
        zgvVar.getClass();
        zfw zfwVar = (zfw) hkf.a(zgvVar.d, hfdVar).a();
        hve hveVar = hvi.e;
        int i = huo.a;
        ipn a = dyc.a(hum.a, false);
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
        zgm zgmVar = this.a;
        hlc.b(hfdVar, b, iss.c);
        dyi dyiVar = dyi.a;
        boolean h = zgm.h(zgvVar);
        int i3 = dsrp.a;
        cru.b(h, null, dsrq.a, dsrq.b, null, hpx.d(1425034555, new zgi(zgmVar), hfdVar), hfdVar, 196608, 18);
        zfv.c(dspkVar, dyiVar.a(hviVar, hum.h), zfwVar, hfdVar, (intValue & 14) | 512);
        hfdVar.n();
        return ffcu.a;
    }
}

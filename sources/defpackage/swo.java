package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swo implements ffjn {
    final /* synthetic */ sxh a;
    final /* synthetic */ fnx b;

    public swo(sxh sxhVar, fnx fnxVar) {
        this.a = sxhVar;
        this.b = fnxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi b;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebe) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            sxh sxhVar = this.a;
            fnx fnxVar = this.b;
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b2 = huz.b(hfdVar, hveVar);
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
            hlc.b(hfdVar, b2, iss.c);
            b = dys.b(hvi.e, 1.0f, true);
            C0001for.a(b, null, gft.a(hfdVar).p, 0L, 0.0f, hpx.d(-1335315746, new swn(sxhVar, fnxVar), hfdVar), hfdVar, 1572864, 58);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyqh implements ffjn {
    final /* synthetic */ cyqe a;

    public cyqh(cyqe cyqeVar) {
        this.a = cyqeVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cyqe cyqeVar = this.a;
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
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
            hfdVar.v(1090877176);
            enqv it = cyqeVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                dndt dndtVar = (dndt) it.next();
                dndtVar.getClass();
                dnds.a(dndtVar, null, hfdVar, 0, 2);
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

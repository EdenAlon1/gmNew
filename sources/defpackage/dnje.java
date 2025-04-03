package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnje implements ffjn {
    final /* synthetic */ dnjg a;

    public dnje(dnjg dnjgVar) {
        this.a = dnjgVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnjf.f(this.a.d, hfdVar, 0);
            hvi j = eba.j(hvi.e, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            dnjg dnjgVar = this.a;
            dxj dxjVar = dxu.e;
            int i = huo.a;
            ipn a = dyo.a(dxjVar, hum.j, hfdVar, 6);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, j);
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
            dnjf.b(dnjgVar.a, hfdVar, 0);
            String str = dnjgVar.b;
            hfdVar.v(1001738387);
            if (str != null) {
                dnjf.a(str, hfdVar, 0);
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

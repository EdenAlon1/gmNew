package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbaq implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ List b;
    final /* synthetic */ dbbj c;

    public dbaq(String str, List list, dbbj dbbjVar) {
        this.a = str;
        this.b = list;
        this.c = dbbjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi d = eba.d(hvi.e, 10.0f);
            String str = this.a;
            List<dbar> list = this.b;
            dbbj dbbjVar = this.c;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, d);
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
            jpo jpoVar = gft.d(hfdVar).f;
            dwjt.b(str, eba.j(hvi.e, 0.0f, 10.0f, 0.0f, 30.0f, 5), gft.a(hfdVar).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpoVar, hfdVar, 0, 0, 65528);
            fjp.a(null, 0L, 0.0f, hfdVar, 0, 15);
            hfdVar.v(1574413612);
            for (dbar dbarVar : list) {
                dbbjVar.d(dbarVar.a, (ddyq) dbarVar.b.a(), hfdVar, 0);
                fjp.a(null, 0L, 0.0f, hfdVar, 0, 15);
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

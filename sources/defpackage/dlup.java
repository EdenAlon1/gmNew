package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlup implements ffjm {
    final /* synthetic */ String a;

    public dlup(String str) {
        this.a = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            c = dix.c(hvi.e, dix.a(0, hfdVar, 6, 0), false, true, false);
            String str = this.a;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
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
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            dwjt.b(str, eba.e(hvi.e, 12.0f, 8.0f), gft.a(hfdVar).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpo.y(gft.d(hfdVar).j, 0L, 0L, null, null, jsf.c, null, 0L, null, 0, 0, kal.c(20), null, null, 0, 16646111), hfdVar, 48, 0, 65528);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyot implements ffjn {
    final /* synthetic */ cyor a;

    public cyot(cyor cyorVar) {
        this.a = cyorVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cyor cyorVar = this.a;
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
            hfdVar.v(1452394926);
            enqv it = cyorVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                cypu cypuVar = (cypu) it.next();
                if (cypuVar.a instanceof dnlz) {
                    hfdVar.v(2074684789);
                    dnlz dnlzVar = (dnlz) cypuVar.a;
                    long a3 = cypt.a(cypuVar.b, hfdVar);
                    long a4 = cypt.a(cypuVar.b, hfdVar);
                    String str = ((dnlz) cypuVar.a).a;
                    dnly.k(dnlzVar, dlsj.a(jfw.a(hvi.e, str), str, true), null, new ibw(a4), new ibw(a3), null, null, null, hfdVar, 0, 0, 1948);
                    hfdVar.o();
                } else {
                    hfdVar.v(1452411303);
                    dnds.a(cypuVar.a, null, hfdVar, 0, 2);
                    hfdVar.o();
                }
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

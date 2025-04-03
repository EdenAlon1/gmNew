package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbpy implements ffjm {
    final /* synthetic */ dbqe a;

    public dbpy(dbqe dbqeVar) {
        this.a = dbqeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int i = huo.a;
            dbqe dbqeVar = this.a;
            hus husVar = hum.n;
            hve hveVar = hvi.e;
            ipn a = ebm.a(dxu.a, husVar, hfdVar, 48);
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
            dbqc dbqcVar = (dbqc) dbqeVar;
            dbqa.b("Queued", dbqcVar.c, hfdVar, 6);
            dbqa.c(hfdVar, 0);
            dbqa.b("Running", dbqcVar.d, hfdVar, 6);
            dbqa.c(hfdVar, 0);
            dbqa.b("Done", dbqcVar.e, hfdVar, 6);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

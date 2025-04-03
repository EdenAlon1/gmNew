package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmiu implements ffjm {
    final /* synthetic */ dmiq a;
    final /* synthetic */ long b;

    public dmiu(dmiq dmiqVar, long j) {
        this.a = dmiqVar;
        this.b = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi e = eba.e(hvi.e, 16.0f, 10.0f);
            int i = huo.a;
            dmiq dmiqVar = this.a;
            long j = this.b;
            ipn a = ebm.a(dxu.a, hum.n, hfdVar, 48);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, e);
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
            hfdVar.v(-1416451420);
            hfdVar.o();
            dwjt.b(dmiqVar.a, null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar).m, hfdVar, 0, 0, 65530);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

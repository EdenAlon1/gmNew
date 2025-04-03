package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmfs implements ffjm {
    final /* synthetic */ dmfu a;

    public dmfs(dmfu dmfuVar) {
        this.a = dmfuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi e = eba.e(hvi.e, 16.0f, 8.0f);
            int i = huo.a;
            dmfu dmfuVar = this.a;
            ipn a = dyc.a(hum.d, false);
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
            String str = dmfuVar.a;
            jpo jpoVar = dooy.d(hfdVar).g;
            hfdVar.v(-148439518);
            if (dmfuVar.c) {
                hfdVar.v(1920766927);
                j = dooy.a(hfdVar).b.k;
                hfdVar.o();
            } else {
                hfdVar.v(1920826168);
                j = gft.a(hfdVar).q;
                hfdVar.o();
            }
            hfdVar.o();
            dwjt.b(str, null, j, 0L, new jss(1), null, 0L, null, 0L, 0, false, 0, 0, null, jpoVar, hfdVar, 0, 0, 65514);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

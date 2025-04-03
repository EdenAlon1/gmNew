package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwcw implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ cwcq b;

    public cwcw(hvi hviVar, cwcq cwcqVar) {
        this.a = hviVar;
        this.b = cwcqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi hviVar = this.a;
            cwdc.e(hfdVar);
            cwcq cwcqVar = this.b;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, hviVar);
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
            cwiq.c(cwcqVar.b, hfdVar, 8);
            cvtz.b(cwcqVar.c, hfdVar, 8);
            cwgu.a(cwcqVar.g, hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

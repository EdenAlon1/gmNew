package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grw extends ffkk implements ffjm {
    final /* synthetic */ gul a;
    final /* synthetic */ grs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grw(gul gulVar, grs grsVar) {
        super(2);
        this.a = gulVar;
        this.b = grsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gul gulVar = this.a;
            grs grsVar = this.b;
            hve hveVar = hvi.e;
            dxi dxiVar = dxu.a;
            int i = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, hfdVar, 0);
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
            guj.q(ebs.m(hvi.e, 96.0f, 80.0f), guj.b(gulVar), gulVar, 0, grsVar, hfdVar, 3078);
            guj.l(ebs.m(hvi.e, 24.0f, 80.0f), hfdVar, 6);
            guj.q(ebs.m(hvi.e, 96.0f, 80.0f), ((ftb) gulVar).a.e(), gulVar, 1, grsVar, hfdVar, 3078);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

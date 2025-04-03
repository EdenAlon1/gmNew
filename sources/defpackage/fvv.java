package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvv extends ffkk implements ffjm {
    final /* synthetic */ ebe a;
    final /* synthetic */ ffjn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvv(ebe ebeVar, ffjn ffjnVar) {
        super(2);
        this.a = ebeVar;
        this.b = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hve hveVar = hvi.e;
            ebe ebeVar = fvp.a;
            hvi c = eba.c(ebs.a(hveVar, fvp.c, fvp.d), this.a);
            dxj dxjVar = dxu.e;
            int i = huo.a;
            ffjn ffjnVar = this.b;
            ipn a = ebm.a(dxjVar, hum.n, hfdVar, 54);
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
            ffjnVar.a(ebr.a, hfdVar, 6);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpb extends ffkk implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ ebe b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpb(hho hhoVar, ebe ebeVar, ffjm ffjmVar) {
        super(2);
        this.a = hhoVar;
        this.b = ebeVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            hvi a = ioe.a(hvi.e, "border");
            long j = ((iar) this.a.a()).a;
            ebe ebeVar = this.b;
            int i2 = flu.a;
            hvi c = hxs.c(a, new flt(j, ebeVar));
            ffjm ffjmVar = this.c;
            int i3 = huo.a;
            ipn a2 = dyc.a(hum.a, true);
            int a3 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
            int i4 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b, iss.c);
            if (ffjmVar == null) {
                hfdVar.v(720285106);
            } else {
                hfdVar.v(-392406993);
                ffjmVar.a(hfdVar, 0);
            }
            hfdVar.o();
            hfdVar.n();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}

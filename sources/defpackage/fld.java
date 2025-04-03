package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fld extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ dji b;
    final /* synthetic */ ffjn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fld(hvi hviVar, dji djiVar, ffjn ffjnVar) {
        super(2);
        this.a = hviVar;
        this.b = djiVar;
        this.c = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            c = dix.c(eao.b(eba.i(this.a, 0.0f, 8.0f, 1), 2), this.b, false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            ffjn ffjnVar = this.c;
            dxq dxqVar = dxu.c;
            int i2 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
            int i3 = ist.a;
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
            ffjnVar.a(dys.a, hfdVar, 6);
            hfdVar.n();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}

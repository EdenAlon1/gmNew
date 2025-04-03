package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwe extends ffkk implements ffjo {
    final /* synthetic */ ffjn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwe(ffjn ffjnVar) {
        super(4);
        this.a = ffjnVar;
    }

    @Override // defpackage.ffjo
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        cvo cvoVar = (cvo) obj;
        hvi hviVar = (hvi) obj2;
        hfd hfdVar = (hfd) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = (true != hfdVar.D(cvoVar) ? 2 : 4) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= true != hfdVar.D(hviVar) ? 16 : 32;
        }
        if (hfdVar.J((i & 147) != 146, i & 1)) {
            ffjn ffjnVar = this.a;
            int i2 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, hviVar);
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
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            ffjnVar.a(cvoVar, hfdVar, Integer.valueOf(i & 14));
            hfdVar.n();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}

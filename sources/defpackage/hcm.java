package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcm extends ffkk implements ffjn {
    final /* synthetic */ hkx a;
    final /* synthetic */ long b;
    final /* synthetic */ jpo c;
    final /* synthetic */ ffjm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcm(hkx hkxVar, long j, jpo jpoVar, ffjm ffjmVar) {
        super(3);
        this.a = hkxVar;
        this.b = j;
        this.c = jpoVar;
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(hviVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            boolean D = hfdVar.D(this.a);
            hkx hkxVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new hcl(hkxVar);
                hfdVar.y(f);
            }
            hvi a = icf.a(hviVar, (ffji) f);
            long j = this.b;
            jpo jpoVar = this.c;
            ffjm ffjmVar = this.d;
            int i = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, a);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b, iss.c);
            hdh.c(j, jpoVar, ffjmVar, hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

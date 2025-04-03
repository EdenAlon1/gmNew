package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpq extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dhf c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ffix e;
    final /* synthetic */ ffjn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpq(hvi hviVar, boolean z, dhf dhfVar, boolean z2, ffix ffixVar, ffjn ffjnVar) {
        super(2);
        this.a = hviVar;
        this.b = z;
        this.c = dhfVar;
        this.d = z2;
        this.e = ffixVar;
        this.f = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi d;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            d = ebs.d(eps.a(this.a, this.b, null, this.c, this.d, new jjj(4), this.e), 1.0f);
            int i = huo.a;
            ffjn ffjnVar = this.f;
            ipn a = dyo.a(dxu.e, hum.k, hfdVar, 54);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, d);
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
            ffjnVar.a(dys.a, hfdVar, 6);
            hfdVar.n();
        }
        return ffcu.a;
    }
}

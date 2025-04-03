package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnzi implements ffjm {
    final /* synthetic */ dnyr a;
    final /* synthetic */ int b;

    public dnzi(dnyr dnyrVar, int i) {
        this.a = dnyrVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi d = eba.d(hvi.e, 12.0f);
            dxn dxnVar = new dxn(10.0f, true, dxr.a);
            dnyr dnyrVar = this.a;
            int i = this.b;
            int i2 = huo.a;
            ipn a = dyo.a(dxnVar, hum.j, hfdVar, 6);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, d);
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
            if (dnyrVar instanceof dnyp) {
                hfdVar.v(2120223436);
                dnzj.a((dnyp) dnyrVar, i, hfdVar, 0);
                hfdVar.o();
            } else {
                if (!(dnyrVar instanceof dnyq)) {
                    hfdVar.v(2120220721);
                    hfdVar.o();
                    throw new ffcd();
                }
                hfdVar.v(2120226665);
                dnzj.b((dnyq) dnyrVar, i, hfdVar, 0);
                hfdVar.o();
            }
            hfdVar.n();
        }
        return ffcu.a;
    }
}

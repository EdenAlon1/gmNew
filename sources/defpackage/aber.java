package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aber implements ffjn {
    final /* synthetic */ dmfn a;

    public aber(dmfn dmfnVar) {
        this.a = dmfnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar;
        hfd hfdVar2 = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar2.I()) {
            hfdVar2.s();
        } else {
            dmfn dmfnVar = this.a;
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar2, 0);
            int a2 = hey.a(hfdVar2);
            hgb c = hfdVar2.c();
            hvi b = huz.b(hfdVar2, hveVar);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar2.M();
            hfdVar2.x();
            if (hfdVar2.H()) {
                hfdVar2.j(ffixVar);
            } else {
                hfdVar2.z();
            }
            hlc.b(hfdVar2, a, iss.e);
            hlc.b(hfdVar2, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar2.H() || !ffkj.e(hfdVar2.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar2.y(valueOf);
                hfdVar2.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar2, b, iss.c);
            if (dmfnVar instanceof abhr) {
                hfdVar2.v(898705956);
                abhw.a((abhr) dmfnVar, hfdVar2, 0);
                hfdVar2.o();
            } else if (dmfnVar instanceof abfu) {
                hfdVar2.v(898708004);
                abgc.a((abfu) dmfnVar, hfdVar2, 0);
                hfdVar2.o();
            } else if (dmfnVar instanceof abfn) {
                hfdVar2.v(898709986);
                abfp.a((abfn) dmfnVar, hfdVar2, 0);
                hfdVar2.o();
            } else if (dmfnVar instanceof abet) {
                hfdVar2.v(898711939);
                abez.a((abet) dmfnVar, hfdVar2, 0);
                hfdVar2.o();
            } else if (dmfnVar instanceof abfc) {
                hfdVar2.v(898714176);
                abfl.c((abfc) dmfnVar, hfdVar2, 0);
                hfdVar2.o();
            } else {
                hfdVar2.v(898715439);
                hfdVar = hfdVar2;
                dwjt.b("Unhandled bottom sheet", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 6, 0, 131070);
                hfdVar.o();
                hfdVar.n();
            }
            hfdVar = hfdVar2;
            hfdVar.n();
        }
        return ffcu.a;
    }
}

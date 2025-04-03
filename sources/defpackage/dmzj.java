package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmzj implements ffjm {
    final /* synthetic */ eqd a;
    final /* synthetic */ dmzr b;

    public dmzj(eqd eqdVar, dmzr dmzrVar) {
        this.a = eqdVar;
        this.b = dmzrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi a = hxo.a(hvi.e, this.a);
            dmzr dmzrVar = this.b;
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
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            hfdVar.v(601289578);
            List list = dmzrVar.a;
            int size = list.size();
            if (size == 2) {
                hfdVar.v(-1297552105);
                dmzm.e((dmzt) list.get(0), (dmzt) list.get(1), hfdVar, 0);
                hfdVar.o();
            } else if (size == 3) {
                hfdVar.v(-1297549263);
                dmzm.d((dmzt) list.get(0), (dmzt) list.get(1), (dmzt) list.get(2), hfdVar, 0);
                hfdVar.o();
            } else if (size == 4) {
                hfdVar.v(-1297543590);
                dmzm.b((dmzt) list.get(0), (dmzt) list.get(1), (dmzt) list.get(2), (dmzt) list.get(3), 0, hfdVar, 0, 16);
                hfdVar.o();
            } else if (size == 5) {
                hfdVar.v(-1297537149);
                dmzm.a((dmzt) list.get(0), list.subList(1, 5), 0, hfdVar, 0, 4);
                hfdVar.o();
            } else if (size >= 6) {
                hfdVar.v(-1297533357);
                dmzm.a((dmzt) list.get(0), list.subList(1, 5), list.size() - 5, hfdVar, 0, 0);
                hfdVar.o();
            } else {
                hfdVar.v(-1568674331);
                hfdVar.o();
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}

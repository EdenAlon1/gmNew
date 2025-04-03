package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmfa implements ffjn {
    final /* synthetic */ dmfh a;
    final /* synthetic */ ffjm b;

    public dmfa(dmfh dmfhVar, ffjm ffjmVar) {
        this.a = dmfhVar;
        this.b = ffjmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v3, types: [dnyp] */
    /* JADX WARN: Type inference failed for: r8v1, types: [hfd] */
    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hun hunVar;
        dnyq dnyqVar;
        Integer num;
        ?? r8 = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && r8.I()) {
            r8.s();
        } else {
            boolean z = this.a.o.a;
            if (z) {
                int i = huo.a;
                hunVar = hum.j;
            } else {
                int i2 = huo.a;
                hunVar = hum.k;
            }
            dmfh dmfhVar = this.a;
            ffjm ffjmVar = this.b;
            hve hveVar = hvi.e;
            ipn a = dyo.a(dxu.c, hunVar, r8, 0);
            int a2 = hey.a(r8);
            hgb c = r8.c();
            hvi b = huz.b(r8, hveVar);
            int i3 = ist.a;
            ffix ffixVar = iss.a;
            r8.M();
            r8.x();
            if (r8.H()) {
                r8.j(ffixVar);
            } else {
                r8.z();
            }
            hlc.b(r8, a, iss.e);
            hlc.b(r8, c, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (r8.H() || !ffkj.e(r8.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                r8.y(valueOf);
                r8.h(valueOf, ffjmVar2);
            }
            hlc.b(r8, b, iss.c);
            dys dysVar = dys.a;
            final dji a3 = dix.a(0, r8, 0, 1);
            int b2 = a3.b() - a3.c();
            r8.v(-1227942116);
            float el = ((jzn) r8.e(jdr.e)).el(gft.d(r8).k.i());
            r8.o();
            r8.v(-1227938537);
            boolean D = r8.D(a3);
            Object f = r8.f();
            if (D || f == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                r8.y(hicVar);
                f = hicVar;
            }
            hho hhoVar = (hho) f;
            r8.o();
            if (b2 < el || !a3.h()) {
                hhoVar.b(true);
            }
            String str = dmfhVar.a;
            Integer num2 = dmfhVar.b;
            Integer num3 = dmfhVar.c;
            String str2 = dmfhVar.d;
            String str3 = dmfhVar.e;
            String str4 = dmfhVar.f;
            List list = dmfhVar.i;
            List list2 = dmfhVar.j;
            ArrayList arrayList = new ArrayList(ffdx.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                dmfk dmfkVar = (dmfk) it.next();
                Iterator it2 = it;
                if (dmfkVar instanceof dmfi) {
                    dmfi dmfiVar = (dmfi) dmfkVar;
                    dnyqVar = new dnyp(dmfiVar.a, dmfiVar.b, dmfiVar.c, dmfiVar.d, dmfiVar.e);
                    num = num2;
                } else {
                    if (!(dmfkVar instanceof dmfj)) {
                        throw new ffcd();
                    }
                    dmfj dmfjVar = (dmfj) dmfkVar;
                    num = num2;
                    dnyqVar = new dnyq(dmfjVar.a, dmfjVar.b);
                }
                arrayList.add(dnyqVar);
                it = it2;
                num2 = num;
            }
            dnzj.f(dysVar, new dnzm(str, num2, num3, str2, str3, str4, list, arrayList, new dnzl(z)), dmfhVar.m, 5, a3, ffjmVar, r8, 6, 0);
            dohr dohrVar = dmfhVar.n;
            r8.v(-1227891782);
            Object f2 = r8.f();
            if (f2 == hfc.a) {
                f2 = hgs.a(ffhe.a, r8);
                r8.y(f2);
            }
            final ffsk ffskVar = (ffsk) f2;
            if (!((Boolean) hhoVar.a()).booleanValue()) {
                r8.v(-1227881906);
                boolean F = r8.F(ffskVar) | r8.D(a3);
                Object f3 = r8.f();
                if (F || f3 == hfc.a) {
                    f3 = new ffix() { // from class: dmey
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffqy.d(ffsk.this, null, null, new dmez(a3, null), 3);
                            return ffcu.a;
                        }
                    };
                    r8.y(f3);
                }
                r8.o();
                dohp.f(dohr.a(dohrVar, true, null, null, (ffix) f3, 14), eau.b(dys.a(jfw.a(hvi.e, "bottom_sheet_scroll_to_bottom"), hum.k), 0.0f, -8.0f), r8, 0);
            }
            r8.o();
            dmff.c(dmfhVar.k, dmfhVar.g, dmfhVar.h, true, eba.i(hvi.e, 24.0f, 0.0f, 2), hhoVar, r8, 24576, 0);
            r8.n();
        }
        return ffcu.a;
    }
}

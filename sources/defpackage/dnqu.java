package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnqu implements ffjn {
    final /* synthetic */ dnsh a;
    final /* synthetic */ ffjn b;
    final /* synthetic */ boolean c;

    public dnqu(dnsh dnshVar, ffjn ffjnVar, boolean z) {
        this.a = dnshVar;
        this.b = ffjnVar;
        this.c = z;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        eylk eylkVar;
        eylk eylkVar2;
        eqd g;
        int i;
        dyi dyiVar;
        dyi dyiVar2;
        int i2;
        eykz b;
        eykr a;
        dys dysVar = (dys) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dysVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dysVar) ? 2 : 4;
        }
        int i3 = intValue;
        if ((i3 & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            eykv eykvVar = this.a.y;
            if (eykvVar == null || (a = eykw.a(eykvVar)) == null || (a.b & 1) == 0) {
                eylkVar = null;
            } else {
                eylkVar = a.c;
                if (eylkVar == null) {
                    eylkVar = eylk.a;
                }
            }
            eykv eykvVar2 = this.a.y;
            if (eykvVar2 == null || (b = eykw.b(eykvVar2)) == null || (b.b & 1) == 0) {
                eylkVar2 = null;
            } else {
                eylk eylkVar3 = b.c;
                if (eylkVar3 == null) {
                    eylkVar3 = eylk.a;
                }
                eylkVar2 = eylkVar3;
            }
            dnsh dnshVar = this.a;
            ffjn ffjnVar = this.b;
            boolean z = this.c;
            hve hveVar = hvi.e;
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b2 = huz.b(hfdVar, hveVar);
            int i5 = ist.a;
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
            hlc.b(hfdVar, b2, iss.c);
            dnsg dnsgVar = dnshVar.B;
            dyi dyiVar3 = dyi.a;
            dnrv.h(dyiVar3, eylkVar, dnsgVar.f, eylkVar2 == null ? dnshVar.z : null, hfdVar, 6);
            hfdVar.v(-866789896);
            if (dnshVar.B.d) {
                g = dnshVar.o != null ? dnop.b(dnsi.g(dnshVar)) : dnsi.g(dnshVar);
                hfdVar.o();
                i = 0;
                dyiVar = dyiVar3;
            } else {
                if (dnshVar.o != null) {
                    g = dnop.b(dnsi.g(dnshVar));
                } else {
                    dnto dntoVar = dnshVar.k;
                    if (dntoVar != null) {
                        List list = ((dnsl) dntoVar).a;
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((dnsp) it.next()) instanceof dntg) {
                                    g = eqd.d(dnsi.g(dnshVar), new eqh(4.0f), null, null, null, 14);
                                    break;
                                }
                            }
                        }
                    }
                    g = dnsi.g(dnshVar);
                }
                if (dnshVar.h) {
                    eqd eqdVar = g;
                    i = 0;
                    dyiVar = dyiVar3;
                    g = eqd.d(eqdVar, null, null, new eqk(((Number) cxo.c(eqdVar.c.a(9205357640488583168L, (jzn) hfdVar.e(jdr.e)), null, null, hfdVar, 3072, 22).a()).floatValue()), new eqk(((Number) cxo.c(g.d.a(9205357640488583168L, (jzn) hfdVar.e(jdr.e)), null, null, hfdVar, 3072, 22).a()).floatValue()), 3);
                } else {
                    i = 0;
                    dyiVar = dyiVar3;
                }
                hfdVar.o();
            }
            ffjnVar.a(g, hfdVar, Integer.valueOf(i));
            dnwi dnwiVar = dnshVar.C;
            hfdVar.v(-771016914);
            if (dnwiVar == null) {
                i2 = i;
                dyiVar2 = dyiVar;
            } else {
                dyiVar2 = dyiVar;
                hvi k = ebs.k(dyiVar2.a(eba.j(hvi.e, 0.0f, 0.0f, 8.0f, 8.0f, 3), hum.i), 16.0f);
                if (dnshVar.B.g && ((((Boolean) dooy.b(hfdVar).c.invoke()).booleanValue() && z) || (!((Boolean) dooy.b(hfdVar).c.invoke()).booleanValue() && dlsp.b(hfdVar)))) {
                    k = k.a(jfw.a(dlsj.c(hvi.e), dnwiVar.toString()));
                }
                i2 = i;
                dnwg.i(dnwiVar, k, hfdVar, i2);
            }
            hfdVar.o();
            dnrv.h(dyiVar2, eylkVar2, dnshVar.B.f, dnshVar.z, hfdVar, 6);
            hfdVar.n();
            hfdVar.v(1368730366);
            int i6 = (((Boolean) dooy.b(hfdVar).e.invoke()).booleanValue() && dlsp.b(hfdVar)) ? 1 : i2;
            hfdVar.o();
            if (i6 != 0) {
                dnrv.p(dysVar, this.a, hfdVar, i3 & 14);
            }
        }
        return ffcu.a;
    }
}

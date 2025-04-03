package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmin implements ffjn {
    final /* synthetic */ dmip a;

    public dmin(dmip dmipVar) {
        this.a = dmipVar;
    }

    public static final Integer b(hho hhoVar) {
        return (Integer) hhoVar.a();
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dyn dynVar = (dyn) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dynVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dynVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            final eey a = efb.a(0, hfdVar, 3);
            dvx dvxVar = dvx.a;
            boolean D = hfdVar.D(a);
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new dvg(a, dvxVar);
                hfdVar.y(f);
            }
            dvw dvwVar = (dvw) f;
            Object obj4 = (jzn) hfdVar.e(jdr.e);
            cyj a2 = cxd.a(hfdVar);
            boolean D2 = hfdVar.D(obj4) | hfdVar.D(dvwVar) | hfdVar.D(a2);
            Object f2 = hfdVar.f();
            if (D2 || f2 == hfc.a) {
                f2 = new dvq(dvwVar, a2, cxu.b(0.0f, 400.0f, null, 5));
                hfdVar.y(f2);
            }
            dtt dttVar = (dtt) f2;
            hfdVar.v(1009941453);
            Object f3 = hfdVar.f();
            if (f3 == hfc.a) {
                Object hicVar = new hic(null, hla.a);
                hfdVar.y(hicVar);
                f3 = hicVar;
            }
            final hho hhoVar = (hho) f3;
            hfdVar.o();
            final int eo = ((jzn) hfdVar.e(jdr.e)).eo(dynVar.d());
            hfdVar.v(1009946775);
            hvi hviVar = hvi.e;
            if (b(hhoVar) == null) {
                hve hveVar = hvi.e;
                hfdVar.v(1217707399);
                Object f4 = hfdVar.f();
                if (f4 == hfc.a) {
                    f4 = new ffji() { // from class: dmih
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj5) {
                            ioc iocVar = (ioc) obj5;
                            iocVar.getClass();
                            hho.this.b(Integer.valueOf((int) (iocVar.g() >> 32)));
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f4);
                }
                hfdVar.o();
                hviVar = ipx.a(hveVar, (ffji) f4);
            }
            hfdVar.o();
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            hfdVar.v(1009958433);
            boolean D3 = hfdVar.D(this.a) | hfdVar.B(eo) | hfdVar.D(a);
            final dmip dmipVar = this.a;
            Object f5 = hfdVar.f();
            if (D3 || f5 == hfc.a) {
                f5 = new ffji() { // from class: dmii
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj5) {
                        edp edpVar = (edp) obj5;
                        edpVar.getClass();
                        ffjm ffjmVar = new ffjm() { // from class: dmij
                            @Override // defpackage.ffjm
                            public final Object a(Object obj6, Object obj7) {
                                Integer num = (Integer) obj6;
                                num.intValue();
                                ((dmhu) obj7).getClass();
                                return num;
                            }
                        };
                        dmip dmipVar2 = dmip.this;
                        List list = dmipVar2.a;
                        edpVar.a(list.size(), new dmik(ffjmVar, list), new dmil(list), new hpw(-1091073711, true, new dmim(list, eo, a, dmipVar2, hhoVar)));
                        return ffcu.a;
                    }
                };
                hfdVar.y(f5);
            }
            hfdVar.o();
            edh.b(hviVar, a, null, dxnVar, null, dttVar, false, null, (ffji) f5, hfdVar, 24576, 428);
        }
        return ffcu.a;
    }
}

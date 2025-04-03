package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfq implements ipu {
    private static final int f(iny inyVar, List list, int i, ffjm ffjmVar) {
        int i2;
        int i3;
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        List list6 = (List) list.get(4);
        int c = hbm.c(i, inyVar.eo(32.0f));
        inx inxVar = (inx) ffdx.M(list5);
        if (inxVar != null) {
            i2 = ((Number) ffjmVar.a(inxVar, Integer.valueOf(c))).intValue();
            c = hbm.c(c, inxVar.b(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            i2 = 0;
        }
        inx inxVar2 = (inx) ffdx.M(list6);
        if (inxVar2 != null) {
            i3 = ((Number) ffjmVar.a(inxVar2, Integer.valueOf(c))).intValue();
            c = hbm.c(c, inxVar2.b(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            i3 = 0;
        }
        Object obj = (inx) ffdx.M(list3);
        int intValue = obj != null ? ((Number) ffjmVar.a(obj, Integer.valueOf(c))).intValue() : 0;
        Object obj2 = (inx) ffdx.M(list2);
        int intValue2 = obj2 != null ? ((Number) ffjmVar.a(obj2, Integer.valueOf(c))).intValue() : 0;
        Object obj3 = (inx) ffdx.M(list4);
        int intValue3 = obj3 != null ? ((Number) ffjmVar.a(obj3, Integer.valueOf(c))).intValue() : 0;
        int a = gfr.a(intValue > 0, intValue3 > 0, gfl.e(inyVar, intValue3));
        float a2 = gfl.a(a);
        return gfl.b(inyVar, i2, i3, intValue2, intValue, intValue3, a, inyVar.eo(a2 + a2), jzl.k(0, 0, 0, 15));
    }

    private static final int g(iny inyVar, List list, int i, ffjm ffjmVar) {
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        List list6 = (List) list.get(4);
        inx inxVar = (inx) ffdx.M(list5);
        int intValue = inxVar != null ? ((Number) ffjmVar.a(inxVar, Integer.valueOf(i))).intValue() : 0;
        inx inxVar2 = (inx) ffdx.M(list6);
        int intValue2 = inxVar2 != null ? ((Number) ffjmVar.a(inxVar2, Integer.valueOf(i))).intValue() : 0;
        inx inxVar3 = (inx) ffdx.M(list2);
        int intValue3 = inxVar3 != null ? ((Number) ffjmVar.a(inxVar3, Integer.valueOf(i))).intValue() : 0;
        inx inxVar4 = (inx) ffdx.M(list3);
        int intValue4 = inxVar4 != null ? ((Number) ffjmVar.a(inxVar4, Integer.valueOf(i))).intValue() : 0;
        inx inxVar5 = (inx) ffdx.M(list4);
        return gfl.f(intValue, intValue2, intValue3, intValue4, inxVar5 != null ? ((Number) ffjmVar.a(inxVar5, Integer.valueOf(i))).intValue() : 0, inyVar.eo(32.0f), jzl.k(0, 0, 0, 15));
    }

    @Override // defpackage.ipu
    public final int a(iny inyVar, List list, int i) {
        return f(inyVar, list, i, gfm.a);
    }

    @Override // defpackage.ipu
    public final int b(iny inyVar, List list, int i) {
        return g(inyVar, list, i, gfn.a);
    }

    @Override // defpackage.ipu
    public final int c(iny inyVar, List list, int i) {
        return f(inyVar, list, i, gfo.a);
    }

    @Override // defpackage.ipu
    public final int d(iny inyVar, List list, int i) {
        return g(inyVar, list, i, gfp.a);
    }

    @Override // defpackage.ipu
    public final ipo e(ipq ipqVar, List list, long j) {
        List list2;
        iqk iqkVar;
        ipo ei;
        List list3 = (List) list.get(0);
        List list4 = (List) list.get(1);
        List list5 = (List) list.get(2);
        List list6 = (List) list.get(3);
        List list7 = (List) list.get(4);
        long m = jzk.m(j, 0, 0, 0, 0, 10);
        int eo = ipqVar.eo(32.0f);
        ipl iplVar = (ipl) ffdx.M(list6);
        int d = iplVar != null ? iplVar.d(jzk.a(j)) : 0;
        ipl iplVar2 = (ipl) ffdx.M(list7);
        int d2 = iplVar2 != null ? iplVar2.d(jzk.a(j)) : 0;
        int b = jzk.b(m);
        int i = d + d2 + eo;
        ipl iplVar3 = (ipl) ffdx.M(list5);
        float a = gfl.a(gfr.a(ffdx.M(list4) != null, ffdx.M(list5) != null, gfl.e(ipqVar, iplVar3 != null ? iplVar3.c(hbm.c(b, i)) : 0)));
        long h = jzl.h(m, -eo, -ipqVar.eo(a + a));
        ipl iplVar4 = (ipl) ffdx.M(list6);
        iqk e = iplVar4 != null ? iplVar4.e(h) : null;
        int b2 = hbm.b(e);
        ipl iplVar5 = (ipl) ffdx.M(list7);
        if (iplVar5 != null) {
            list2 = list4;
            iqkVar = iplVar5.e(jzl.l(h, -b2, 0, 2));
        } else {
            list2 = list4;
            iqkVar = null;
        }
        int b3 = b2 + hbm.b(iqkVar);
        ipl iplVar6 = (ipl) ffdx.M(list3);
        iqk e2 = iplVar6 != null ? iplVar6.e(jzl.l(h, -b3, 0, 2)) : null;
        int a2 = hbm.a(e2);
        ipl iplVar7 = (ipl) ffdx.M(list5);
        iqk e3 = iplVar7 != null ? iplVar7.e(jzl.h(h, -b3, -a2)) : null;
        int a3 = a2 + hbm.a(e3);
        boolean z = (e3 == null || e3.eh(imt.a) == e3.eh(imt.b)) ? false : true;
        ipl iplVar8 = (ipl) ffdx.M(list2);
        iqk e4 = iplVar8 != null ? iplVar8.e(jzl.h(h, -b3, -a3)) : null;
        int a4 = gfr.a(e4 != null, e3 != null, z);
        int f = gfl.f(hbm.b(e), hbm.b(iqkVar), hbm.b(e2), hbm.b(e4), hbm.b(e3), eo, j);
        int a5 = hbm.a(e);
        int a6 = hbm.a(iqkVar);
        iqk iqkVar2 = e3;
        int a7 = hbm.a(e2);
        int a8 = hbm.a(e4);
        int a9 = hbm.a(iqkVar2);
        float a10 = gfl.a(a4);
        int b4 = gfl.b(ipqVar, a5, a6, a7, a8, a9, a4, ipqVar.eo(a10 + a10), j);
        ei = ipqVar.ei(f, b4, ffem.a, new gfk(e, ipqVar.eo(16.0f), gfs.a(a4, 3), ipqVar.eo(a10), e2, e4, iqkVar2, b4, iqkVar, f, ipqVar.eo(16.0f)));
        return ei;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eank implements eamg {
    private final eajw a;
    private final eajz b;

    public eank(eajw eajwVar, eajz eajzVar) {
        eajwVar.getClass();
        eajzVar.getClass();
        this.a = eajwVar;
        this.b = eajzVar;
    }

    @Override // defpackage.eamg
    public final void a(Map map, eafl eaflVar) {
        map.getClass();
        eaflVar.getClass();
        if (eaflVar instanceof eafo) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                b((eagt) it.next());
            }
            return;
        }
        if (!(eaflVar instanceof eafh)) {
            throw new ffcd();
        }
        eafh eafhVar = (eafh) eaflVar;
        int i = 2;
        if (!(eafhVar instanceof eaon) && !(eafhVar instanceof eaol)) {
            i = 4;
            if (!(eafhVar instanceof eaot) && !(eafhVar instanceof eaor)) {
                i = eafhVar instanceof eamj ? 3 : 1;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            easy easyVar = (easy) entry.getKey();
            eagt eagtVar = (eagt) entry.getValue();
            easyVar.getClass();
            int i2 = 15;
            if (eafhVar instanceof eaom) {
                if (!ffkj.e(((eaom) eafhVar).i(), easyVar)) {
                    i2 = 64;
                }
            } else if ((eafhVar instanceof eaou) && !((eaou) eafhVar).a.contains(easyVar)) {
                i2 = 0;
            }
            if (i2 != 0) {
                eajw eajwVar = this.a;
                eajx a = this.b.a(i2);
                a.b(eagtVar);
                eaka eakaVar = (eaka) a;
                eakaVar.u = i;
                String simpleName = eafhVar.a().getClass().getSimpleName();
                simpleName.getClass();
                eakaVar.m = simpleName;
                eajwVar.a(a);
            } else {
                b(eagtVar);
            }
        }
    }

    public final void b(eagt eagtVar) {
        eagtVar.getClass();
        eajx b = this.b.b(33);
        b.b(eagtVar);
        this.a.a(b);
    }
}

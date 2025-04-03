package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class earx implements earw {
    private final eaqc a;

    public earx(eaqc eaqcVar) {
        this.a = eaqcVar;
    }

    @Override // defpackage.earw
    public final synchronized engw a(List list, Map map, eagp eagpVar) {
        efbd.b();
        if (list.isEmpty()) {
            int i = engw.d;
            return enou.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            easy easyVar = (easy) it.next();
            easw easwVar = (easw) map.get(easyVar);
            if (easwVar != null) {
                eags r = eagt.r();
                r.m(easyVar);
                ((eagq) r).e = enip.o(easwVar.a);
                if (!TextUtils.isEmpty(null)) {
                    r.k();
                }
                arrayList.add(r.a());
            }
        }
        Long[] g = this.a.a(eagpVar).g(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            eags h = ((eagt) arrayList.get(i2)).h();
            h.e(g[i2].longValue());
            arrayList2.add(h.a());
        }
        return engw.n(arrayList2);
    }
}

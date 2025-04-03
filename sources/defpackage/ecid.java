package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ecid {
    public abstract eyhs a(String str, Object obj);

    public abstract eyhs b(eyhs eyhsVar, eyhs eyhsVar2);

    public abstract String c(eyhs eyhsVar);

    final List d(Map map) {
        eyhs a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (a = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    final List e(List list, List list2) {
        eyhs eyhsVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eyhs eyhsVar2 = (eyhs) it.next();
            String c = c(eyhsVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    eyhsVar = null;
                    break;
                }
                eyhsVar = (eyhs) it2.next();
                if (c.equals(c(eyhsVar))) {
                    break;
                }
            }
            eyhs b = b(eyhsVar2, eyhsVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}

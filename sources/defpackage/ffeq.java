package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ffeq {
    public static final Map a(ffeo ffeoVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b = ffeoVar.b();
        while (b.hasNext()) {
            Object a = ffeoVar.a(b.next());
            Object obj = linkedHashMap.get(a);
            if (obj == null && !linkedHashMap.containsKey(a)) {
                obj = new ffkz();
            }
            ffkz ffkzVar = (ffkz) obj;
            ffkzVar.a++;
            linkedHashMap.put(a, ffkzVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getClass();
            if ((entry instanceof fflg) && !(entry instanceof fflj)) {
                fflf.a(entry, "kotlin.collections.MutableMap.MutableEntry");
            }
            entry.setValue(Integer.valueOf(((ffkz) entry.getValue()).a));
        }
        fflf.g(linkedHashMap);
        return linkedHashMap;
    }
}

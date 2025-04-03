package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feda {
    public static final fedb a(String str, fedg fedgVar, Map map) {
        if (fedgVar == null) {
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((fecz) it.next()).a);
            }
            fedf fedfVar = new fedf(str);
            fedfVar.b.addAll(arrayList);
            fedgVar = new fedg(fedfVar);
        }
        HashMap hashMap = new HashMap(map);
        for (febs febsVar : fedgVar.b) {
            fecz feczVar = (fecz) hashMap.remove(febsVar.b);
            if (feczVar == null) {
                throw new IllegalStateException("No method bound for descriptor entry ".concat(febsVar.b));
            }
            if (feczVar.a != febsVar) {
                throw new IllegalStateException("Bound method for " + febsVar.b + " not same instance as method in service descriptor");
            }
        }
        if (hashMap.size() <= 0) {
            return new fedb(fedgVar, map);
        }
        throw new IllegalStateException("No entry in descriptor matching bound method ".concat(((fecz) hashMap.values().iterator().next()).a.b));
    }

    public static final void b(febs febsVar, fecv fecvVar, String str, fedg fedgVar, Map map) {
        c(new fecz(febsVar, fecvVar), str, map);
    }

    public static final void c(fecz feczVar, String str, Map map) {
        febs febsVar = feczVar.a;
        emxf.i(str.equals(febsVar.c), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", str, febsVar.b);
        String str2 = febsVar.b;
        emxf.p(!map.containsKey(str2), "Method by same name already registered: %s", str2);
        map.put(str2, feczVar);
    }
}

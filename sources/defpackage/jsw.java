package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsw {
    public final List a;

    public jsw(jsv... jsvVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (jsv jsvVar : jsvVarArr) {
            String str = jsvVar.a;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(jsvVar);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException("'" + str2 + "' must be unique. Actual [ [" + ffdx.aA(list, null, null, null, null, 63) + ']');
            }
            ffdx.w(arrayList, list);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.a = arrayList2;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsw) && ffkj.e(this.a, ((jsw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

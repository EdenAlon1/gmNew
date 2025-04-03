package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drrw {
    public static final Map a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            edew edewVar = ((edez) obj).b;
            if (edewVar == null) {
                edewVar = edew.a;
            }
            String str = edewVar.c;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffew.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            if (((List) entry.getValue()).size() != 1) {
                Object key2 = entry.getKey();
                Objects.toString(key2);
                throw new IllegalStateException("Illegal duplicated upload failure for ".concat(String.valueOf(key2)));
            }
            edfb b = edfb.b(((edez) ffdx.K((List) entry.getValue())).c);
            if (b == null) {
                b = edfb.UNRECOGNIZED;
            }
            linkedHashMap2.put(key, b);
        }
        return linkedHashMap2;
    }
}

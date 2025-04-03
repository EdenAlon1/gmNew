package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enui extends enuj {
    private final Map a;

    public enui(ents entsVar, ents entsVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(linkedHashMap, entsVar);
        e(linkedHashMap, entsVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((ensn) entry.getKey()).b) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void e(Map map, ents entsVar) {
        for (int i = 0; i < entsVar.b(); i++) {
            ensn c = entsVar.c(i);
            Object obj = map.get(c);
            if (c.b) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    map.put(c, list);
                }
                list.add(c.c(entsVar.e(i)));
            } else {
                map.put(c, c.c(entsVar.e(i)));
            }
        }
    }

    @Override // defpackage.enuj
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.enuj
    public final Object b(ensn ensnVar) {
        enxb.a(!ensnVar.b, "key must be single valued");
        Object obj = this.a.get(ensnVar);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    @Override // defpackage.enuj
    public final Set c() {
        return this.a.keySet();
    }

    @Override // defpackage.enuj
    public final void d(entz entzVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            ensn ensnVar = (ensn) entry.getKey();
            Object value = entry.getValue();
            if (ensnVar.b) {
                entzVar.b(ensnVar, ((List) value).iterator(), obj);
            } else {
                entzVar.a(ensnVar, value, obj);
            }
        }
    }
}

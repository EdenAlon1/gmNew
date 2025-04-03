package defpackage;

import androidx.car.app.model.Alert;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ennc {
    static int a(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(i / 0.75d) : Alert.DURATION_SHOW_INDEFINITELY;
        }
        endr.c(i, "expectedSize");
        return i + 1;
    }

    static emwl b(final enmu enmuVar) {
        enmuVar.getClass();
        return new emwl() { // from class: enmf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new enmp(entry, enmu.this);
            }
        };
    }

    public static enhk c(Map map) {
        if (map instanceof engl) {
            return (engl) map;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return enoz.a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum r1 = (Enum) entry.getKey();
        Object value = entry.getValue();
        endr.a(r1, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(r1, value));
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum r12 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            endr.a(r12, value2);
            enumMap.put((EnumMap) r12, (Enum) value2);
        }
        int size = enumMap.size();
        if (size == 0) {
            return enoz.a;
        }
        if (size != 1) {
            return new engl(enumMap);
        }
        Map.Entry entry3 = (Map.Entry) enjk.l(enumMap.entrySet());
        return enhk.l((Enum) entry3.getKey(), entry3.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static enhk d(Iterable iterable, emwl emwlVar) {
        return iterable instanceof Collection ? n(iterable.iterator(), emwlVar, enhk.h(iterable.size())) : n(iterable.iterator(), emwlVar, new enhd());
    }

    static Object e(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    static Object f(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String g(Map map) {
        int size = map.size();
        endr.c(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static HashMap h(int i) {
        return new HashMap(a(i));
    }

    static Iterator i(Set set, emwl emwlVar) {
        return new enml(set.iterator(), emwlVar);
    }

    public static LinkedHashMap j(int i) {
        return new LinkedHashMap(a(i));
    }

    static Map.Entry k(Map.Entry entry) {
        entry.getClass();
        return new enmn(entry);
    }

    public static Map l(Map map, emwl emwlVar) {
        return new enmy(map, new enmg(emwlVar));
    }

    public static boolean m(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    private static enhk n(Iterator it, emwl emwlVar, enhd enhdVar) {
        while (it.hasNext()) {
            Object next = it.next();
            enhdVar.k(emwlVar.apply(next), next);
        }
        try {
            return enhdVar.c();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }
}

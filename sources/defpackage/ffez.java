package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffez extends ffey {
    public static final Object e(Map map, Object obj) {
        map.getClass();
        if (map instanceof fffd) {
            fffd fffdVar = (fffd) map;
            Map map2 = fffdVar.a;
            Object obj2 = map2.get(obj);
            return (obj2 != null || map2.containsKey(obj)) ? obj2 : fffdVar.b.invoke(obj);
        }
        Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        throw new NoSuchElementException(a.i(obj, "Key ", " is missing in the map."));
    }

    public static final LinkedHashMap f(ffcf... ffcfVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(ffcfVarArr.length));
        ffew.o(linkedHashMap, ffcfVarArr);
        return linkedHashMap;
    }

    public static final Map g(ffcf... ffcfVarArr) {
        ffcfVarArr.getClass();
        int length = ffcfVarArr.length;
        if (length <= 0) {
            return ffem.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(length));
        ffew.o(linkedHashMap, ffcfVarArr);
        return linkedHashMap;
    }

    public static final Map h(ffcf... ffcfVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(ffcfVarArr.length));
        ffew.o(linkedHashMap, ffcfVarArr);
        return linkedHashMap;
    }

    public static final Map i(Map map) {
        int size = map.size();
        return size != 0 ? size != 1 ? map : ffew.d(map) : ffem.a;
    }

    public static final Map j(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final Map k(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ffew.n(linkedHashMap, iterable);
            return ffew.i(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ffem.a;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffew.a(collection.size()));
            ffew.n(linkedHashMap2, iterable);
            return linkedHashMap2;
        }
        ffcf[] ffcfVarArr = new ffcf[1];
        ffcfVarArr[0] = (ffcf) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        return ffew.g(ffcfVarArr);
    }

    public static final Map l(Map map) {
        map.getClass();
        int size = map.size();
        return size != 0 ? size != 1 ? ffew.m(map) : ffew.d(map) : ffem.a;
    }

    public static final Map m(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static final void n(Map map, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ffcf ffcfVar = (ffcf) it.next();
            map.put(ffcfVar.a, ffcfVar.b);
        }
    }

    public static final void o(Map map, ffcf[] ffcfVarArr) {
        for (ffcf ffcfVar : ffcfVarArr) {
            map.put(ffcfVar.a, ffcfVar.b);
        }
    }
}

package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class ljr {
    final Map a = new HashMap();
    final Map b;

    public ljr(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            lki lkiVar = (lki) entry.getValue();
            List list = (List) this.a.get(lkiVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(lkiVar, list);
            }
            list.add((ljs) entry.getKey());
        }
    }

    public static void a(List list, lkr lkrVar, lki lkiVar, Object obj) {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ljs ljsVar = (ljs) list.get(size);
            try {
                int i = ljsVar.a;
                if (i == 0) {
                    ljsVar.b.invoke(obj, new Object[0]);
                } else if (i != 1) {
                    ljsVar.b.invoke(obj, lkrVar, lkiVar);
                } else {
                    ljsVar.b.invoke(obj, lkrVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }
}

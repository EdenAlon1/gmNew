package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exdj {
    public static Map a(Map map, Map map2) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Integer num = (Integer) map2.get(entry.getKey());
            if (num == null || num.intValue() != 0) {
                hashMap.put((String) entry.getKey(), ((List) entry.getValue()).subList(0, num == null ? ((List) entry.getValue()).size() : Math.min(num.intValue(), ((List) entry.getValue()).size())));
            }
        }
        return hashMap;
    }
}

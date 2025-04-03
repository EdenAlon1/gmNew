package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebyo {
    public static final void a(String str, List list, Map map) {
        if (map.containsKey(str)) {
            return;
        }
        list.add(str);
        ebwl m = ebwn.m();
        m.b(str);
        map.put(str, m);
    }
}

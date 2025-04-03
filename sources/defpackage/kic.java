package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kic {
    SPREAD,
    SPREAD_INSIDE,
    PACKED;

    public static final Map d;
    public static final Map e;

    static {
        kic kicVar = SPREAD;
        kic kicVar2 = SPREAD_INSIDE;
        kic kicVar3 = PACKED;
        HashMap hashMap = new HashMap();
        d = hashMap;
        HashMap hashMap2 = new HashMap();
        e = hashMap2;
        hashMap.put("packed", kicVar3);
        hashMap.put("spread_inside", kicVar2);
        hashMap.put("spread", kicVar);
        hashMap2.put("packed", 2);
        hashMap2.put("spread_inside", 1);
        hashMap2.put("spread", 0);
    }

    public static int a(String str) {
        Map map = e;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        return -1;
    }
}

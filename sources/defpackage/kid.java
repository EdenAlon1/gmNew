package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kid {
    NONE,
    CHAIN,
    ALIGNED;

    public static final Map d;
    public static final Map e;

    static {
        kid kidVar = NONE;
        kid kidVar2 = CHAIN;
        kid kidVar3 = ALIGNED;
        HashMap hashMap = new HashMap();
        d = hashMap;
        HashMap hashMap2 = new HashMap();
        e = hashMap2;
        hashMap.put("none", kidVar);
        hashMap.put("chain", kidVar2);
        hashMap.put("aligned", kidVar3);
        hashMap2.put("none", 0);
        hashMap2.put("chain", 3);
        hashMap2.put("aligned", 2);
    }
}

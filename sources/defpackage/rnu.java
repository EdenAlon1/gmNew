package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rnu {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap(10);
        a = hashMap;
        hashMap.put("none", rlc.None);
        hashMap.put("xMinYMin", rlc.XMinYMin);
        hashMap.put("xMidYMin", rlc.XMidYMin);
        hashMap.put("xMaxYMin", rlc.XMaxYMin);
        hashMap.put("xMinYMid", rlc.XMinYMid);
        hashMap.put("xMidYMid", rlc.XMidYMid);
        hashMap.put("xMaxYMid", rlc.XMaxYMid);
        hashMap.put("xMinYMax", rlc.XMinYMax);
        hashMap.put("xMidYMax", rlc.XMidYMax);
        hashMap.put("xMaxYMax", rlc.XMaxYMax);
    }
}

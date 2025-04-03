package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bclk {
    public static final bckl a;
    private static final Set b = fffi.b(new bckm(bbln.c.b, bryh.c.b, bckf.a));
    private static final Map c;

    static {
        bblo bbloVar = bblo.a;
        Map map = bblo.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            bbkx bbkxVar = (bbkx) entry.getKey();
            if (!ffkj.e(bbkxVar, bbln.c.a) && !ffkj.e(bbkxVar, bbln.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new bckl(bcks.a, bckz.a, bclj.a, linkedHashMap, null, b, 0, 80);
    }
}

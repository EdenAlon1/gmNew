package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcnx {
    public static final bckl a;
    private static final Set b = fffi.b(new bckm(bbwh.c.b, bumm.c.b, bckf.b));
    private static final Map c;

    static {
        bbwi bbwiVar = bbwi.a;
        Map map = bbwi.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            bbvs bbvsVar = (bbvs) entry.getKey();
            if (!ffkj.e(bbvsVar, bbwh.c.a) && !ffkj.e(bbvsVar, bbwh.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new bckl(bcmh.a, bcmp.a, bcnw.a, linkedHashMap, null, b, 0, 80);
    }
}

package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcnn {
    public static final bckl a;
    private static final Set b = fffi.d(new bckm(bbtp.c.b, bueg.c.b, bckf.b), new bckm(bbtp.c.d, bueg.c.d, bckf.b, true));
    private static final Map c;

    static {
        bbtq bbtqVar = bbtq.a;
        Map map = bbtq.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            bbsw bbswVar = (bbsw) entry.getKey();
            if (!ffkj.e(bbswVar, bbtp.c.a) && !ffkj.e(bbswVar, bbtp.c.b) && !ffkj.e(bbswVar, bbtp.c.d)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new bckl(bcmf.a, bcmn.a, bcnm.a, linkedHashMap, null, b, 0, 80);
    }
}

package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bclh {
    public static final bckl a;
    private static final Set b = fffi.d(new bckm(bbke.c.b, brww.c.b, bckf.a), new bckm(bbke.c.c, brww.c.c, bckf.c));
    private static final Map c;

    static {
        Map map = bbkg.a;
        Map map2 = bbkg.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            bbjl bbjlVar = (bbjl) entry.getKey();
            if (!ffkj.e(bbjlVar, bbke.c.a) && !ffkj.e(bbjlVar, bbke.c.b) && !ffkj.e(bbjlVar, bbke.c.c)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new bckl(bckr.a, bcky.a, bclg.a, linkedHashMap, null, b, 0, 80);
    }
}

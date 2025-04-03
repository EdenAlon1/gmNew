package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcnu {
    public static final Set a = fffi.d(new bckm(bbvc.c.a, bufy.c.a, bckf.b), new bckm(bbvc.c.b, bufy.c.b, bckf.b));
    public static final Map b;
    public static final bcnt c;

    static {
        bbvd bbvdVar = bbvd.a;
        Map map = bbvd.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            bbul bbulVar = (bbul) entry.getKey();
            if (!ffkj.e(bbulVar, bbvc.c.a) && !ffkj.e(bbulVar, bbvc.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        b = linkedHashMap;
        c = new bcnt();
    }
}

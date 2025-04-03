package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bclp {
    public static final bckl a;
    private static final Map b;
    private static final dtzj c;
    private static final dtzj d;
    private static final Map e;

    static {
        bbow bbowVar = bbow.a;
        Map map = bbow.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            bbno bbnoVar = (bbno) entry.getKey();
            if (!ffkj.e(bbnoVar, bbov.c.a) && !ffkj.e(bbnoVar, bbov.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        b = linkedHashMap;
        dtzq dtzqVar = new dtzq("SELECT IFNULL((SELECT $V FROM $V WHERE $V = $V LIMIT 1), \"\" )", new Object[]{ParticipantsTable.c.a, "participants", ParticipantsTable.c.d, -1});
        c = dtzqVar;
        dtzq dtzqVar2 = new dtzq("$V", new Object[]{-1L});
        d = dtzqVar2;
        Map g = ffew.g(new ffcf(bsom.c.A, dtzqVar), new ffcf(bsom.c.b, dtzqVar2));
        e = g;
        a = new bckl(bcku.a, bclb.a, bclo.b, linkedHashMap, g, ffen.a, 0, 64);
    }
}

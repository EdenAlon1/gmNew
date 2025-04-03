package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcpq {
    public static final Map a;
    public static final Map b;

    static {
        bcjj bcjjVar = bcjj.a;
        Map map = bcjj.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!ffkj.e(entry.getKey(), bcjh.c.a) && !ffkj.e(entry.getKey(), bcjh.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a = ffew.l(linkedHashMap);
        b = ffew.c(new ffcf(ParticipantsTable.c.d, bcpl.a));
    }
}

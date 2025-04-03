package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcpa {
    public static final Map a;
    public static final Set b;

    static {
        bcbb bcbbVar = bcbb.a;
        Map map = bcbb.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!ffkj.e(entry.getKey(), bcba.c.a) && !ffkj.e(entry.getKey(), bcba.c.g) && !ffkj.e(entry.getKey(), bcba.c.h) && !ffkj.e(entry.getKey(), bcba.c.k) && !ffkj.e(entry.getKey(), bcba.c.c)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a = ffew.l(linkedHashMap);
        b = fffi.d(new bckm(bcba.c.g, MessagesTable.c.b, bckf.a), new bckm(bcba.c.h, MessagesTable.c.c, bckf.c), new bckm(bcba.c.k, MessagesTable.c.y, bckf.c));
    }
}

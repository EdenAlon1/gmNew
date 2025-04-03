package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ota {
    public final Map a = new LinkedHashMap();

    public final void a(ovj ovjVar) {
        ovjVar.getClass();
        int i = ovjVar.a;
        Map map = this.a;
        Integer valueOf = Integer.valueOf(i);
        Object obj = map.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            map.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        Integer valueOf2 = Integer.valueOf(ovjVar.b);
        if (treeMap.containsKey(valueOf2)) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(valueOf2) + " with " + ovjVar);
        }
        treeMap.put(valueOf2, ovjVar);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enuc {
    private static final enty a = new enua();
    private static final entx b = new enub();

    public static entz a(Set set) {
        entv entvVar = new entv(a);
        entvVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ensn ensnVar = (ensn) it.next();
            ensnVar.getClass();
            if (ensnVar.b) {
                entx entxVar = entv.b;
                enxb.a(true, "key must be repeating");
                entvVar.c.remove(ensnVar);
                entvVar.d.put(ensnVar, entxVar);
            } else {
                Map map = entvVar.d;
                enty entyVar = entv.a;
                map.remove(ensnVar);
                entvVar.c.put(ensnVar, entyVar);
            }
        }
        return new entw(entvVar);
    }
}

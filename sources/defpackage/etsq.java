package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsq {
    public static final void a(eujt eujtVar, Object obj, Map map) {
        List list;
        if (eujtVar.a() != 0 && eujtVar.a() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        if (map.containsKey(eujtVar)) {
            list = (List) map.get(eujtVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(eujtVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
    }
}

package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cggs {
    public static final String a(aoku aokuVar) {
        aokuVar.getClass();
        String p = aokuVar.p(true);
        return p == null ? "" : p;
    }

    public static final Map b(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((Uri) entry.getKey()).getSchemeSpecificPart(), entry.getValue());
        }
        return linkedHashMap;
    }
}

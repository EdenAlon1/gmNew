package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class ccuf {
    public static /* synthetic */ Object a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ccui(entry.getValue()));
        }
        return linkedHashMap;
    }
}

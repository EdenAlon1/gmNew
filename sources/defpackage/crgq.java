package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgq implements fbba {
    public static eniz a(Map map) {
        TreeMap treeMap = new TreeMap(new crge());
        treeMap.putAll(map);
        Comparator comparator = eniz.a;
        Comparator comparator2 = treeMap.comparator();
        if (comparator2 == null) {
            comparator2 = eniz.a;
        }
        eniz x = eniz.x(comparator2, true, treeMap.entrySet());
        x.getClass();
        return x;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}

package defpackage;

import android.util.ArrayMap;
import j$.util.Objects;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfh extends bfn implements bdp {
    private static final bdo d = bdo.OPTIONAL;

    private bfh(TreeMap treeMap) {
        super(treeMap);
    }

    public static bfh a() {
        return new bfh(new TreeMap(a));
    }

    public static bfh b(bdp bdpVar) {
        TreeMap treeMap = new TreeMap(a);
        for (bdn bdnVar : bdpVar.r()) {
            Set<bdo> q = bdpVar.q(bdnVar);
            ArrayMap arrayMap = new ArrayMap();
            for (bdo bdoVar : q) {
                arrayMap.put(bdoVar, bdpVar.n(bdnVar, bdoVar));
            }
            treeMap.put(bdnVar, arrayMap);
        }
        return new bfh(treeMap);
    }

    public final void c(bdn bdnVar, Object obj) {
        d(bdnVar, d, obj);
    }

    public final void d(bdn bdnVar, bdo bdoVar, Object obj) {
        bdo bdoVar2;
        Map map = (Map) this.c.get(bdnVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.c.put(bdnVar, arrayMap);
            arrayMap.put(bdoVar, obj);
            return;
        }
        bdo bdoVar3 = (bdo) Collections.min(map.keySet());
        if (Objects.equals(map.get(bdoVar3), obj) || bdoVar3 != (bdoVar2 = bdo.REQUIRED) || bdoVar != bdoVar2) {
            map.put(bdoVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + bdnVar.c() + ", existing value (" + bdoVar3 + ")=" + map.get(bdoVar3) + ", conflicting (" + bdoVar + ")=" + obj);
    }

    public final void e(bdn bdnVar) {
        this.c.remove(bdnVar);
    }
}

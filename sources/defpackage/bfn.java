package defpackage;

import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bfn implements bdp {
    protected static final Comparator a;
    public static final bfn b;
    protected final TreeMap c;

    static {
        Comparator comparator = new Comparator() { // from class: bfm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                bfn bfnVar = bfn.b;
                return ((bdn) obj).c().compareTo(((bdn) obj2).c());
            }
        };
        a = comparator;
        b = new bfn(new TreeMap(comparator));
    }

    public bfn(TreeMap treeMap) {
        this.c = treeMap;
    }

    public static bfn f(bdp bdpVar) {
        if (bfn.class.equals(bdpVar.getClass())) {
            return (bfn) bdpVar;
        }
        TreeMap treeMap = new TreeMap(a);
        for (bdn bdnVar : bdpVar.r()) {
            Set<bdo> q = bdpVar.q(bdnVar);
            ArrayMap arrayMap = new ArrayMap();
            for (bdo bdoVar : q) {
                arrayMap.put(bdoVar, bdpVar.n(bdnVar, bdoVar));
            }
            treeMap.put(bdnVar, arrayMap);
        }
        return new bfn(treeMap);
    }

    @Override // defpackage.bdp
    public final bdo h(bdn bdnVar) {
        Map map = (Map) this.c.get(bdnVar);
        if (map != null) {
            return (bdo) Collections.min(map.keySet());
        }
        Objects.toString(bdnVar);
        throw new IllegalArgumentException("Option does not exist: ".concat(String.valueOf(bdnVar)));
    }

    @Override // defpackage.bdp
    public final Object l(bdn bdnVar) {
        Map map = (Map) this.c.get(bdnVar);
        if (map != null) {
            return map.get((bdo) Collections.min(map.keySet()));
        }
        Objects.toString(bdnVar);
        throw new IllegalArgumentException("Option does not exist: ".concat(String.valueOf(bdnVar)));
    }

    @Override // defpackage.bdp
    public final Object m(bdn bdnVar, Object obj) {
        try {
            return l(bdnVar);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // defpackage.bdp
    public final Object n(bdn bdnVar, bdo bdoVar) {
        Map map = (Map) this.c.get(bdnVar);
        if (map == null) {
            Objects.toString(bdnVar);
            throw new IllegalArgumentException("Option does not exist: ".concat(String.valueOf(bdnVar)));
        }
        if (map.containsKey(bdoVar)) {
            return map.get(bdoVar);
        }
        throw new IllegalArgumentException(a.j(bdoVar, bdnVar, "Option does not exist: ", " with priority="));
    }

    @Override // defpackage.bdp
    public final Set q(bdn bdnVar) {
        Map map = (Map) this.c.get(bdnVar);
        return map == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.bdp
    public final Set r() {
        return DesugarCollections.unmodifiableSet(this.c.keySet());
    }

    @Override // defpackage.bdp
    public final boolean s(bdn bdnVar) {
        return this.c.containsKey(bdnVar);
    }

    @Override // defpackage.bdp
    public final void u(ask askVar) {
        for (Map.Entry entry : this.c.tailMap(new bbf("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((bdn) entry.getKey()).c().startsWith("camera2.captureRequest.option.")) {
                return;
            }
            bdn bdnVar = (bdn) entry.getKey();
            asl aslVar = askVar.a;
            bdp bdpVar = askVar.b;
            aslVar.a.d(bdnVar, bdpVar.h(bdnVar), bdpVar.l(bdnVar));
        }
    }
}

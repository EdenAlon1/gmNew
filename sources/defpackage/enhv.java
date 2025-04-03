package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class enhv {
    Map a;

    public engh e(int i) {
        return engw.d(i);
    }

    public final enhz f() {
        Map map = this.a;
        if (map == null) {
            return enet.a;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return enet.a;
        }
        enhd enhdVar = new enhd(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            engw g = ((engr) entry.getValue()).g();
            enhdVar.k(key, g);
            i += ((enou) g).c;
        }
        return new engy(enhdVar.c(), i);
    }

    final Map g() {
        Map map = this.a;
        if (map != null) {
            return map;
        }
        ened enedVar = new ened();
        this.a = enedVar;
        return enedVar;
    }

    public final void h(Object obj, Object obj2) {
        endr.a(obj, obj2);
        engh enghVar = (engh) g().get(obj);
        if (enghVar == null) {
            enghVar = e(4);
            g().put(obj, enghVar);
        }
        enghVar.c(obj2);
    }

    public final void i(Map.Entry entry) {
        h(entry.getKey(), entry.getValue());
    }

    public final void j(ennd enndVar) {
        for (Map.Entry entry : enndVar.w().entrySet()) {
            k(entry.getKey(), (Iterable) entry.getValue());
        }
    }

    public final void k(Object obj, Iterable iterable) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(enjk.n(iterable)));
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            engh enghVar = (engh) g().get(obj);
            if (enghVar == null) {
                enghVar = e(l(iterable));
                g().put(obj, enghVar);
            }
            while (it.hasNext()) {
                Object next = it.next();
                endr.a(obj, next);
                enghVar.c(next);
            }
        }
    }

    public int l(Iterable iterable) {
        if (iterable instanceof Collection) {
            return Math.max(4, ((Collection) iterable).size());
        }
        return 4;
    }
}

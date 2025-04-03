package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fffl extends fffk {
    public static final Set e(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Collection<?> t = ffdx.t(iterable);
        if (t.isEmpty()) {
            return ffdx.ar(set);
        }
        if (!(t instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(t);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) t).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static final Set f(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(ffew.a(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && ffkj.e(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static final Set g(Set set, Iterable iterable) {
        int i;
        set.getClass();
        iterable.getClass();
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (valueOf != null) {
            i = set.size() + valueOf.intValue();
        } else {
            int size = set.size();
            i = size + size;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(ffew.a(i));
        linkedHashSet.addAll(set);
        ffdx.w(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static final Set h(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(ffew.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}

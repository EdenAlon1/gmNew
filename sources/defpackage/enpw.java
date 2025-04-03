package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpw {
    public static int a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static enpv b(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new enpp(set, set2);
    }

    public static enpv c(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new enpn(set, set2);
    }

    public static enpv d(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new enpl(set, set2);
    }

    public static HashSet e(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new HashSet((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        HashSet hashSet = new HashSet();
        enju.l(hashSet, it);
        return hashSet;
    }

    public static HashSet f(Object... objArr) {
        HashSet g = g(objArr.length);
        Collections.addAll(g, objArr);
        return g;
    }

    public static HashSet g(int i) {
        return new HashSet(ennc.a(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set h(Set set, emxg emxgVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof enps)) {
                set.getClass();
                return new enps(set, emxgVar);
            }
            enps enpsVar = (enps) set;
            return new enps(enpsVar.a, emxm.a(enpsVar.b, emxgVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof enps)) {
            sortedSet.getClass();
            return new enpt(sortedSet, emxgVar);
        }
        enps enpsVar2 = (enps) sortedSet;
        return new enpt((SortedSet) enpsVar2.a, emxm.a(enpsVar2.b, emxgVar));
    }

    public static Set i() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set j() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static TreeSet k(Iterable iterable) {
        TreeSet treeSet = new TreeSet();
        enjk.o(treeSet, iterable);
        return treeSet;
    }

    static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean m(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof enny) {
            collection = ((enny) collection).i();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? n(set, collection.iterator()) : enju.n(set.iterator(), collection);
    }

    static boolean n(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}

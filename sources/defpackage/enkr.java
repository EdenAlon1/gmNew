package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enkr {
    public static ArrayList a(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? new ArrayList((Collection) iterable) : b(iterable.iterator());
    }

    public static ArrayList b(Iterator it) {
        ArrayList arrayList = new ArrayList();
        enju.l(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    public static ArrayList c(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        endr.c(length, "arraySize");
        ArrayList arrayList = new ArrayList(ermn.g(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList d(int i) {
        endr.c(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List e(List list, int i) {
        list.getClass();
        emxf.a(i > 0);
        return list instanceof RandomAccess ? new enkj(list, i) : new enki(list, i);
    }

    public static List f(List list) {
        return list instanceof engw ? ((engw) list).a() : list instanceof enkm ? ((enkm) list).a : list instanceof RandomAccess ? new enkk(list) : new enkm(list);
    }

    public static List g(List list, emwl emwlVar) {
        return list instanceof RandomAccess ? new enko(list, emwlVar) : new enkq(list, emwlVar);
    }

    public static boolean h(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!emxb.a(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it2.hasNext() || !emxb.a(it.next(), it2.next())) {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }
}

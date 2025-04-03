package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffee extends ffed {
    public static final Object r(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static final Object s(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(ffdx.e(list));
    }

    public static final Collection t(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : ffdx.ak(iterable);
    }

    public static final boolean u(Iterable iterable, ffji ffjiVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) ffjiVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final boolean v(List list, ffji ffjiVar) {
        int i;
        list.getClass();
        ffjiVar.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof fflg) && !(list instanceof ffli)) {
                fflf.a(list, "kotlin.collections.MutableIterable");
            }
            return u(list, ffjiVar, true);
        }
        int e = ffdx.e(list);
        if (e >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) ffjiVar.invoke(obj)).booleanValue()) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == e) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int e2 = ffdx.e(list);
        if (i <= e2) {
            while (true) {
                list.remove(e2);
                if (e2 == i) {
                    break;
                }
                e2--;
            }
        }
        return true;
    }

    public static final void w(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final void x(Collection collection, Object[] objArr) {
        objArr.getClass();
        collection.addAll(ffdo.c(objArr));
    }

    public static final void y(Iterable iterable, ffji ffjiVar) {
        iterable.getClass();
        u(iterable, ffjiVar, true);
    }

    public static final void z(Collection collection, Iterable iterable) {
        collection.getClass();
        collection.removeAll(ffdx.t(iterable));
    }
}

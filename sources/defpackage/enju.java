package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enju {
    public static int a(Iterator it, int i) {
        it.getClass();
        int i2 = 0;
        emxf.b(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static int b(Iterator it, emxg emxgVar) {
        emxgVar.getClass();
        int i = 0;
        while (it.hasNext()) {
            if (emxgVar.a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static enqu c(Iterator it, emxg emxgVar) {
        it.getClass();
        emxgVar.getClass();
        return new enjm(it, emxgVar);
    }

    public static enqu d(Iterator it) {
        it.getClass();
        return it instanceof enqu ? (enqu) it : new enjl(it);
    }

    public static Object e(Iterator it, emxg emxgVar) {
        it.getClass();
        emxgVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (emxgVar.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object f(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object g(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object h(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    static Object i(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static Iterator j(Iterator it, emwl emwlVar) {
        emwlVar.getClass();
        return new enjn(it, emwlVar);
    }

    static void k(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean l(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static boolean m(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean o(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}

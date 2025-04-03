package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enjk {
    public static int a(Iterable iterable, emxg emxgVar) {
        return enju.b(iterable.iterator(), emxgVar);
    }

    public static int b(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return ermn.g(j);
    }

    public static emxc c(Iterable iterable, emxg emxgVar) {
        Iterator it = iterable.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (emxgVar.a(next)) {
                return emxc.j(next);
            }
        }
        return emux.a;
    }

    public static Iterable d(Iterable iterable, emxg emxgVar) {
        iterable.getClass();
        return new enjf(iterable, emxgVar);
    }

    public static Iterable e(Iterable iterable, int i) {
        iterable.getClass();
        emxf.b(i >= 0, "number to skip cannot be negative");
        return new enji(iterable, i);
    }

    public static Iterable f(Iterable iterable, emwl emwlVar) {
        iterable.getClass();
        return new enjg(iterable, emwlVar);
    }

    public static Object g(Iterable iterable, emxg emxgVar) {
        return enju.e(iterable.iterator(), emxgVar);
    }

    public static Object h(Iterable iterable, int i) {
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        Iterator it = iterable.iterator();
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.f(i, "position (", ") must not be negative"));
        }
        int a = enju.a(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException(a.x(a, i, "position (", ") must be less than the number of elements that remained (", ")"));
    }

    public static Object i(Iterable iterable, Object obj) {
        return enju.g(iterable.iterator(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object j(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return enju.f(iterable.iterator());
        }
        if (iterable.isEmpty()) {
            throw new NoSuchElementException();
        }
        return k(iterable);
    }

    public static Object k(List list) {
        return list.get(list.size() - 1);
    }

    public static Object l(Iterable iterable) {
        return enju.h(iterable.iterator());
    }

    public static Object m(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        return it.hasNext() ? enju.h(it) : obj;
    }

    public static String n(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static boolean o(Collection collection, Iterable iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : enju.l(collection, iterable.iterator());
    }

    public static boolean p(Iterable iterable, emxg emxgVar) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!emxgVar.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean q(Iterable iterable, emxg emxgVar) {
        return enju.b(iterable.iterator(), emxgVar) != -1;
    }

    public static Object[] r(Iterable iterable) {
        return v(iterable).toArray();
    }

    public static Object[] s(Iterable iterable, Class cls) {
        return t(iterable, enoh.c(cls, 0));
    }

    static Object[] t(Iterable iterable, Object[] objArr) {
        return v(iterable).toArray(objArr);
    }

    public static void u(List list, emxg emxgVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!emxgVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        w(list, emxgVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        w(list, emxgVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    private static Collection v(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : enkr.b(iterable.iterator());
    }

    private static void w(List list, emxg emxgVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (emxgVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }
}

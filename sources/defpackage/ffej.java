package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffej extends ffeg {
    public static final int C(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                ffdx.k();
            }
        }
        return i;
    }

    public static final int D(List list, Object obj) {
        list.getClass();
        return list.indexOf(obj);
    }

    public static final int E(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return i;
    }

    public static final Comparable F(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final Comparable G(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final Float H(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final Iterable I(Iterable iterable) {
        return new ffet(new ffei(iterable));
    }

    public static final Object J(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ffdx.K((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object K(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final Object L(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final Object M(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object N(List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final Object O(Iterable iterable) {
        if (iterable instanceof List) {
            return ffdx.P((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final Object P(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(ffdx.e(list));
    }

    public static final Object Q(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Object R(Iterable iterable, Comparator comparator) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final Object S(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ffdx.T((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final Object T(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final Object U(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final HashSet V(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(ffew.a(ffdx.n(iterable, 12)));
        ffdx.aB(iterable, hashSet);
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List W(Iterable iterable, int i) {
        iterable.getClass();
        fffn.b(i, i);
        if (!(iterable instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator a = fffn.a(iterable.iterator(), i, i, true, false);
            while (a.hasNext()) {
                arrayList.add((List) a.next());
            }
            return arrayList;
        }
        int size = iterable.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int g = ffmk.g(i, size - i2);
            ArrayList arrayList3 = new ArrayList(g);
            for (int i3 = 0; i3 < g; i3++) {
                arrayList3.add(iterable.get(i3 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static final List X(Iterable iterable) {
        iterable.getClass();
        return ffdx.ak(ffdx.aq(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List Y(Iterable iterable, int i) {
        iterable.getClass();
        int size = iterable.size() - i;
        if (size <= 0) {
            return ffel.a;
        }
        if (size == 1) {
            return ffdx.g(ffdx.O(iterable));
        }
        ArrayList arrayList = new ArrayList(size);
        if (iterable instanceof RandomAccess) {
            int size2 = iterable.size();
            while (i < size2) {
                arrayList.add(iterable.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = iterable.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final List Z(List list, int i) {
        if (i >= 0) {
            return ffdx.ai(list, ffmk.f(list.size() - i, 0));
        }
        throw new IllegalArgumentException(a.f(i, "Requested element count ", " is less than zero."));
    }

    public static /* synthetic */ String aA(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ffji ffjiVar, int i) {
        iterable.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        charSequence4.getClass();
        CharSequence charSequence5 = (i & 2) != 0 ? "" : charSequence2;
        charSequence5.getClass();
        CharSequence charSequence6 = (i & 4) != 0 ? "" : charSequence3;
        charSequence6.getClass();
        CharSequence charSequence7 = (i & 16) != 0 ? "..." : null;
        charSequence7.getClass();
        StringBuilder sb = new StringBuilder();
        ffdx.az(iterable, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : ffjiVar);
        return sb.toString();
    }

    public static final void aB(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final List aC(Iterable iterable, int i, boolean z, ffji ffjiVar) {
        fffn.b(2, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator a = fffn.a(iterable.iterator(), 2, i, z, true);
            while (a.hasNext()) {
                arrayList.add(ffjiVar.invoke((List) a.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        fffc fffcVar = new fffc(list);
        while (i2 >= 0 && i2 < size) {
            int g = ffmk.g(2, size - i2);
            if (!z && g < 2) {
                break;
            }
            int i3 = g + i2;
            ffda.d(i2, i3, fffcVar.a.size());
            fffcVar.b = i2;
            fffcVar.c = i3 - i2;
            arrayList2.add(ffjiVar.invoke(fffcVar));
            i2 += i;
        }
        return arrayList2;
    }

    public static /* synthetic */ void aD(Iterable iterable, Appendable appendable, ffji ffjiVar, int i) {
        ffji ffjiVar2 = (i & 64) != 0 ? null : ffjiVar;
        CharSequence charSequence = (i & 32) != 0 ? "..." : null;
        int i2 = (i & 16) != 0 ? -1 : 0;
        CharSequence charSequence2 = (i & 8) != 0 ? "" : null;
        ffdx.az(iterable, appendable, (i & 2) != 0 ? ", " : "\n", (i & 4) != 0 ? "" : null, charSequence2, i2, charSequence, ffjiVar2);
    }

    public static final List aa(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List ab(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection t = ffdx.t(iterable2);
        if (t.isEmpty()) {
            return ffdx.ak(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!t.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List ac(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && ffkj.e(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final List ad(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            ffdx.w(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static final List ae(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List af(Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return ffdx.ak(iterable);
        }
        List al = ffdx.al(iterable);
        Collections.reverse(al);
        return al;
    }

    public static final List ag(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List al = ffdx.al(iterable);
            ffdx.p(al);
            return al;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return ffdx.ak(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return ffdo.c(array);
    }

    public static final List ah(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List al = ffdx.al(iterable);
            ffdx.q(al, comparator);
            return al;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return ffdx.ak(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        ffdo.e(array, comparator);
        return ffdo.c(array);
    }

    public static final List ai(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.f(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return ffel.a;
        }
        int i2 = 0;
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return ffdx.ak(iterable);
            }
            if (i == 1) {
                return ffdx.g(ffdx.J(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return ffdx.j(arrayList);
    }

    public static final List aj(List list, int i) {
        list.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.f(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return ffel.a;
        }
        int size = list.size();
        if (i >= size) {
            return ffdx.ak(list);
        }
        if (i == 1) {
            return ffdx.g(ffdx.P(list));
        }
        int i2 = size - i;
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            while (i2 < size) {
                arrayList.add(list.get(i2));
                i2++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i2);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final List ak(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return ffdx.j(ffdx.al(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ffel.a;
        }
        if (size != 1) {
            return ffdx.am(collection);
        }
        return ffdx.g(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final List al(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ffdx.am((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        ffdx.aB(iterable, arrayList);
        return arrayList;
    }

    public static final List am(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List an(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(ffdx.n(iterable, 10), ffdx.n(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new ffcf(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final Set ao(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set aq = ffdx.aq(iterable);
        aq.retainAll(ffdx.t(iterable2));
        return aq;
    }

    public static final Set ap(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set aq = ffdx.aq(iterable);
        ffdx.z(aq, iterable2);
        return aq;
    }

    public static final Set aq(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ffdx.aB(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final Set ar(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ffdx.aB(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : fffi.d(linkedHashSet.iterator().next()) : ffen.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return ffen.a;
        }
        if (size2 == 1) {
            return fffi.d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(ffew.a(collection.size()));
        ffdx.aB(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static final ffnl as(Iterable iterable) {
        iterable.getClass();
        return new ffeh(iterable);
    }

    public static final boolean at(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static final boolean au(Iterable iterable, Object obj) {
        int i;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            int i2 = 0;
            for (Object obj2 : iterable) {
                if (i2 < 0) {
                    ffdx.l();
                }
                if (ffkj.e(obj, obj2)) {
                    i = i2;
                } else {
                    i2++;
                }
            }
        }
        i = ((List) iterable).indexOf(obj);
        return i >= 0;
    }

    public static final double[] av(Collection collection) {
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            dArr[i] = ((Number) it.next()).doubleValue();
            i++;
        }
        return dArr;
    }

    public static final float[] aw(Collection collection) {
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static final int[] ax(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static final long[] ay(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static final void az(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ffji ffjiVar) {
        iterable.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        appendable.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            ffpc.a(appendable, next, ffjiVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }
}

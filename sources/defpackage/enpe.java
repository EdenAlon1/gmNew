package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpe extends enjc {
    public static final enpe c;
    public final transient engw d;

    static {
        int i = engw.d;
        c = new enpe(enou.a, enoe.a);
    }

    public enpe(engw engwVar, Comparator comparator) {
        super(comparator);
        this.d = engwVar;
    }

    @Override // defpackage.enjc
    public final enjc B(Object obj, boolean z) {
        return K(0, I(obj, z));
    }

    @Override // defpackage.enjc
    public final enjc D(Object obj, boolean z, Object obj2, boolean z2) {
        return F(obj, z).B(obj2, z2);
    }

    @Override // defpackage.enjc
    public final enjc F(Object obj, boolean z) {
        return K(J(obj, z), size());
    }

    @Override // defpackage.enjc, java.util.NavigableSet
    /* renamed from: H */
    public final enqu descendingIterator() {
        return this.d.a().iterator();
    }

    final int I(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.d, obj, ((enjc) this).a);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    final int J(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.d, obj, ((enjc) this).a);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    final enpe K(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return G(this.a);
        }
        engw engwVar = this.d;
        return new enpe(engwVar.subList(i, i2), this.a);
    }

    @Override // defpackage.engi
    public final int c(Object[] objArr, int i) {
        return this.d.c(objArr, i);
    }

    @Override // defpackage.enjc, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int J = J(obj, true);
        if (J == size()) {
            return null;
        }
        return this.d.get(J);
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof enny) {
            collection = ((enny) collection).i();
        }
        if (!enpz.a(((enjc) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        enqu listIterator = listIterator();
        Iterator it = collection.iterator();
        if (!listIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = listIterator.next();
        while (true) {
            try {
                int a = a(next2, next);
                if (a >= 0) {
                    if (a != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!listIterator.hasNext()) {
                        return false;
                    }
                    next2 = listIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.engi
    public final int e() {
        return this.d.e();
    }

    @Override // defpackage.enip, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!enpz.a(this.a, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            enqu listIterator = listIterator();
            while (listIterator.hasNext()) {
                Object next = listIterator.next();
                Object next2 = it.next();
                if (next2 == null || a(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.engi
    public final int f() {
        return this.d.f();
    }

    @Override // defpackage.enjc, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.enjc, java.util.NavigableSet
    public final Object floor(Object obj) {
        int I = I(obj, true) - 1;
        if (I == -1) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.enip, defpackage.engi
    public final engw g() {
        return this.d;
    }

    @Override // defpackage.enjc, java.util.NavigableSet
    public final Object higher(Object obj) {
        int J = J(obj, false);
        if (J == size()) {
            return null;
        }
        return this.d.get(J);
    }

    @Override // defpackage.enjc, defpackage.enip, defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final enqu listIterator() {
        return this.d.iterator();
    }

    @Override // defpackage.engi
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.enjc, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.enjc, java.util.NavigableSet
    public final Object lower(Object obj) {
        int I = I(obj, false) - 1;
        if (I == -1) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.engi
    public final Object[] m() {
        return this.d.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.enjc, defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.enjc
    public final enjc y() {
        Comparator reverseOrder = Collections.reverseOrder(this.a);
        return isEmpty() ? G(reverseOrder) : new enpe(this.d.a(), reverseOrder);
    }
}

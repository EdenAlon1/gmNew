package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hnb<T> implements List<T>, fflh {
    private final hne a;

    public hnb(hne hneVar) {
        this.a = hneVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.a.f(i, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.a.k(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.l(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hnf.a(this, i);
        return this.a.a[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.b == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new hnd(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        hne hneVar = this.a;
        Object[] objArr = hneVar.a;
        for (int i = hneVar.b - 1; i >= 0; i--) {
            if (ffkj.e(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new hnd(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        hnf.a(this, i);
        return this.a.c(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        hne hneVar = this.a;
        int i = hneVar.b;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            hneVar.m(it.next());
        }
        return i != hneVar.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        hne hneVar = this.a;
        int i = hneVar.b;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(hneVar.a[i2])) {
                hneVar.c(i2);
            }
        }
        return i != hneVar.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        hnf.a(this, i);
        return this.a.d(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        hnf.b(this, i, i2);
        return new hnc(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ffkc.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.n(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        hne hneVar = this.a;
        return hneVar.k(hneVar.b, collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new hnd(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ffkc.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.m(obj);
    }
}

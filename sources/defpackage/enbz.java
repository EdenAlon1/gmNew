package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enbz extends AbstractCollection {
    final Object a;
    Collection b;
    final enbz c;
    final Collection d;
    final /* synthetic */ encd e;

    public enbz(encd encdVar, Object obj, Collection collection, enbz enbzVar) {
        this.e = encdVar;
        this.a = obj;
        this.b = collection;
        this.c = enbzVar;
        this.d = enbzVar == null ? null : enbzVar.b;
    }

    final void a() {
        enbz enbzVar = this.c;
        if (enbzVar != null) {
            enbzVar.a();
            return;
        }
        encd encdVar = this.e;
        encdVar.a.put(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            this.e.b++;
            if (isEmpty) {
                a();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.b.size();
        this.e.b += size2 - size;
        if (size != 0) {
            return addAll;
        }
        a();
        return true;
    }

    final void b() {
        enbz enbzVar = this.c;
        if (enbzVar != null) {
            enbzVar.b();
            enbz enbzVar2 = this.c;
            if (enbzVar2.b != this.d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.b.isEmpty()) {
            encd encdVar = this.e;
            Collection collection = (Collection) encdVar.a.get(this.a);
            if (collection != null) {
                this.b = collection;
            }
        }
    }

    final void c() {
        enbz enbzVar = this.c;
        if (enbzVar != null) {
            enbzVar.c();
        } else if (this.b.isEmpty()) {
            encd encdVar = this.e;
            encdVar.a.remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.e.b -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new enby(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.b.remove(obj);
        if (remove) {
            encd encdVar = this.e;
            encdVar.b--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.b.toString();
    }
}

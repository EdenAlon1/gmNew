package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coi<T> implements List<T>, fflh {
    private final cok a;

    public coi(cok cokVar) {
        this.a = cokVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        cok cokVar = this.a;
        if (i < 0 || i > cokVar.c) {
            cokVar.f(i);
        }
        int i2 = cokVar.c + 1;
        Object[] objArr = cokVar.b;
        if (objArr.length < i2) {
            cokVar.e(i2, objArr);
        }
        Object[] objArr2 = cokVar.b;
        int i3 = cokVar.c;
        if (i != i3) {
            ffdo.n(objArr2, objArr2, i + 1, i, i3);
        }
        objArr2[i] = obj;
        cokVar.c++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        cok cokVar = this.a;
        if (i < 0 || i > cokVar.c) {
            cokVar.f(i);
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = cokVar.c + collection.size();
        Object[] objArr = cokVar.b;
        if (objArr.length < size) {
            cokVar.e(size, objArr);
        }
        Object[] objArr2 = cokVar.b;
        if (i != cokVar.c) {
            ffdo.n(objArr2, objArr2, collection.size() + i, i, cokVar.c);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ffdx.l();
            }
            objArr2[i2 + i] = t;
            i2 = i3;
        }
        cokVar.c += collection.size();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.c();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.n(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.n(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        coz.b(this, i);
        return this.a.l(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.o();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new coh(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        cok cokVar = this.a;
        if (obj == null) {
            Object[] objArr = cokVar.b;
            for (int i = cokVar.c - 1; i >= 0; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
            return -1;
        }
        Object[] objArr2 = cokVar.b;
        for (int i2 = cokVar.c - 1; i2 >= 0; i2--) {
            if (obj.equals(objArr2[i2])) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new coh(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        coz.b(this, i);
        return this.a.a(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        cok cokVar = this.a;
        int i = cokVar.c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            cokVar.g(it.next());
        }
        return i != cokVar.c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        cok cokVar = this.a;
        int i = cokVar.c;
        Object[] objArr = cokVar.b;
        int i2 = cokVar.c;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            if (!collection.contains(objArr[i2])) {
                cokVar.a(i2);
            }
        }
        return i != cokVar.c;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        coz.b(this, i);
        return this.a.b(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.c;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        coz.c(this, i, i2);
        return new coj(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ffkc.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new coh(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ffkc.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.g(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.h(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        cok cokVar = this.a;
        int i = cokVar.c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            cokVar.h(it.next());
        }
        return i != cokVar.c;
    }
}

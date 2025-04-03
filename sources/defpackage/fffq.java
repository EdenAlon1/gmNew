package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffq<E> extends ffdi<E> implements List<E>, RandomAccess, Serializable, fflh {
    public Object[] a;
    public final int b;
    public int c;
    public final fffs d;
    private final fffq e;

    public fffq(Object[] objArr, int i, int i2, fffq fffqVar, fffs fffsVar) {
        objArr.getClass();
        fffsVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = fffqVar;
        this.d = fffsVar;
        this.modCount = fffsVar.modCount;
    }

    private final int b(int i, int i2, Collection collection, boolean z) {
        int b;
        fffq fffqVar = this.e;
        if (fffqVar != null) {
            b = fffqVar.b(i, i2, collection, z);
        } else {
            fffs fffsVar = this.d;
            fffs fffsVar2 = fffs.a;
            b = fffsVar.b(i, i2, collection, z);
        }
        if (b > 0) {
            j();
        }
        this.c -= b;
        return b;
    }

    private final Object e(int i) {
        Object e;
        j();
        fffq fffqVar = this.e;
        if (fffqVar != null) {
            e = fffqVar.e(i);
        } else {
            fffs fffsVar = this.d;
            fffs fffsVar2 = fffs.a;
            e = fffsVar.e(i);
        }
        this.c--;
        return e;
    }

    private final void f(int i, Collection collection, int i2) {
        j();
        fffq fffqVar = this.e;
        if (fffqVar != null) {
            fffqVar.f(i, collection, i2);
        } else {
            fffs fffsVar = this.d;
            fffs fffsVar2 = fffs.a;
            fffsVar.f(i, collection, i2);
        }
        fffs fffsVar3 = this.d;
        fffs fffsVar4 = fffs.a;
        this.a = fffsVar3.b;
        this.c += i2;
    }

    private final void g(int i, Object obj) {
        j();
        fffq fffqVar = this.e;
        if (fffqVar != null) {
            fffqVar.g(i, obj);
        } else {
            fffs fffsVar = this.d;
            fffs fffsVar2 = fffs.a;
            fffsVar.g(i, obj);
        }
        fffs fffsVar3 = this.d;
        fffs fffsVar4 = fffs.a;
        this.a = fffsVar3.b;
        this.c++;
    }

    private final void h() {
        fffs fffsVar = fffs.a;
        if (this.d.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (l()) {
            throw new UnsupportedOperationException();
        }
    }

    private final void j() {
        this.modCount++;
    }

    private final void k(int i, int i2) {
        if (i2 > 0) {
            j();
        }
        fffq fffqVar = this.e;
        if (fffqVar != null) {
            fffqVar.k(i, i2);
        } else {
            fffs fffsVar = this.d;
            fffs fffsVar2 = fffs.a;
            fffsVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final boolean l() {
        fffs fffsVar = fffs.a;
        return this.d.d;
    }

    private final Object writeReplace() {
        if (l()) {
            return new ffge(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        ffda.c(i, this.c);
        g(this.b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        i();
        h();
        ffda.c(i, this.c);
        int i2 = this.b + i;
        int size = collection.size();
        f(i2, collection, size);
        return size > 0;
    }

    @Override // defpackage.ffdi
    public final int c() {
        h();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.b, this.c);
    }

    @Override // defpackage.ffdi
    public final Object d(int i) {
        i();
        h();
        ffda.b(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (ffft.e(this.a, this.b, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        ffda.b(i, this.c);
        return this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return ffft.a(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (ffkj.e(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (ffkj.e(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            d(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return b(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return b(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        ffda.b(i, this.c);
        int i2 = this.b;
        Object[] objArr = this.a;
        int i3 = i2 + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ffda.d(i, i2, this.c);
        return new fffq(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.a;
        int i = this.b;
        return ffdo.g(objArr, i, this.c + i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return ffft.b(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        ffda.c(i, this.c);
        return new fffp(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        Object[] objArr3 = this.a;
        int i3 = this.b;
        ffdo.n(objArr3, objArr, 0, i3, i + i3);
        ffdx.d(this.c, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }
}

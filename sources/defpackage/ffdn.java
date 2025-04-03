package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffdn extends ffdi {
    private static final Object[] b = new Object[0];
    public int a;
    private int c;
    private Object[] d;

    public ffdn() {
        this.d = b;
    }

    private final int h(int i) {
        return i == 0 ? ffdo.B(this.d) : i - 1;
    }

    private final int i(int i) {
        if (i == ffdo.B(this.d)) {
            return 0;
        }
        return i + 1;
    }

    private final int j(int i) {
        return i < 0 ? i + this.d.length : i;
    }

    private final int k(int i) {
        int length = this.d.length;
        return i >= length ? i - length : i;
    }

    private final void l(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.a += collection.size();
    }

    private final void m(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.d;
        int length = objArr.length;
        if (i <= length) {
            return;
        }
        if (objArr == b) {
            this.d = new Object[ffmk.f(i, 10)];
            return;
        }
        Object[] objArr2 = new Object[ffda.e(length, i)];
        ffdo.n(objArr, objArr2, 0, this.c, length);
        Object[] objArr3 = this.d;
        int length2 = objArr3.length;
        int i2 = this.c;
        ffdo.n(objArr3, objArr2, length2 - i2, 0, i2);
        this.c = 0;
        this.d = objArr2;
    }

    private final void n(int i, int i2) {
        Object[] objArr = this.d;
        if (i < i2) {
            ffdo.d(objArr, null, i, i2);
        } else {
            ffdo.d(objArr, null, i, objArr.length);
            ffdo.d(this.d, null, 0, i2);
        }
    }

    private final void o() {
        this.modCount++;
    }

    public final Object a() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[this.c];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ffda.c(i, this.a);
        if (i == this.a) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        o();
        m(this.a + 1);
        int k = k(this.c + i);
        int i2 = this.a;
        if (i < ((i2 + 1) >> 1)) {
            int h = h(k);
            int h2 = h(this.c);
            int i3 = this.c;
            if (h >= i3) {
                Object[] objArr = this.d;
                objArr[h2] = objArr[i3];
                ffdo.n(objArr, objArr, i3, i3 + 1, h + 1);
            } else {
                Object[] objArr2 = this.d;
                ffdo.n(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                Object[] objArr3 = this.d;
                objArr3[objArr3.length - 1] = objArr3[0];
                ffdo.n(objArr3, objArr3, 0, 1, h + 1);
            }
            this.d[h] = obj;
            this.c = h2;
        } else {
            int k2 = k(this.c + i2);
            if (k < k2) {
                Object[] objArr4 = this.d;
                ffdo.n(objArr4, objArr4, k + 1, k, k2);
            } else {
                Object[] objArr5 = this.d;
                ffdo.n(objArr5, objArr5, 1, 0, k2);
                Object[] objArr6 = this.d;
                int length = objArr6.length - 1;
                objArr6[0] = objArr6[length];
                ffdo.n(objArr6, objArr6, k + 1, k, length);
            }
            this.d[k] = obj;
        }
        this.a++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        ffda.c(i, this.a);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.a) {
            return addAll(collection);
        }
        o();
        m(this.a + collection.size());
        int k = k(this.c + this.a);
        int k2 = k(this.c + i);
        int size = collection.size();
        if (i < ((this.a + 1) >> 1)) {
            int i2 = this.c;
            int i3 = i2 - size;
            if (k2 < i2) {
                Object[] objArr = this.d;
                ffdo.n(objArr, objArr, i3, i2, objArr.length);
                if (size >= k2) {
                    Object[] objArr2 = this.d;
                    ffdo.n(objArr2, objArr2, objArr2.length - size, 0, k2);
                } else {
                    Object[] objArr3 = this.d;
                    ffdo.n(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.d;
                    ffdo.n(objArr4, objArr4, 0, size, k2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.d;
                ffdo.n(objArr5, objArr5, i3, i2, k2);
            } else {
                Object[] objArr6 = this.d;
                int length = objArr6.length;
                i3 += length;
                int i4 = length - i3;
                if (i4 >= k2 - i2) {
                    ffdo.n(objArr6, objArr6, i3, i2, k2);
                } else {
                    ffdo.n(objArr6, objArr6, i3, i2, i2 + i4);
                    Object[] objArr7 = this.d;
                    ffdo.n(objArr7, objArr7, 0, this.c + i4, k2);
                }
            }
            this.c = i3;
            l(j(k2 - size), collection);
        } else {
            int i5 = k2 + size;
            if (k2 < k) {
                int i6 = size + k;
                Object[] objArr8 = this.d;
                int length2 = objArr8.length;
                if (i6 <= length2) {
                    ffdo.n(objArr8, objArr8, i5, k2, k);
                } else if (i5 >= length2) {
                    ffdo.n(objArr8, objArr8, i5 - length2, k2, k);
                } else {
                    int i7 = k - (i6 - length2);
                    ffdo.n(objArr8, objArr8, 0, i7, k);
                    Object[] objArr9 = this.d;
                    ffdo.n(objArr9, objArr9, i5, k2, i7);
                }
            } else {
                Object[] objArr10 = this.d;
                ffdo.n(objArr10, objArr10, size, 0, k);
                Object[] objArr11 = this.d;
                int length3 = objArr11.length;
                if (i5 >= length3) {
                    ffdo.n(objArr11, objArr11, i5 - length3, k2, length3);
                } else {
                    ffdo.n(objArr11, objArr11, 0, length3 - size, length3);
                    Object[] objArr12 = this.d;
                    ffdo.n(objArr12, objArr12, i5, k2, objArr12.length - size);
                }
            }
            l(k2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        m(this.a + 1);
        int h = h(this.c);
        this.c = h;
        this.d[h] = obj;
        this.a++;
    }

    public final void addLast(Object obj) {
        o();
        m(this.a + 1);
        this.d[k(this.c + this.a)] = obj;
        this.a++;
    }

    public final Object b() {
        if (isEmpty()) {
            return null;
        }
        return this.d[this.c];
    }

    @Override // defpackage.ffdi
    public final int c() {
        return this.a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            n(this.c, k(this.c + this.a));
        }
        this.c = 0;
        this.a = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.ffdi
    public final Object d(int i) {
        ffda.b(i, this.a);
        if (i == ffdx.e(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int k = k(this.c + i);
        Object[] objArr = this.d;
        Object obj = objArr[k];
        if (i < (this.a >> 1)) {
            int i2 = this.c;
            if (k >= i2) {
                ffdo.n(objArr, objArr, i2 + 1, i2, k);
            } else {
                ffdo.n(objArr, objArr, 1, 0, k);
                Object[] objArr2 = this.d;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i3 = this.c;
                ffdo.n(objArr2, objArr2, i3 + 1, i3, length);
            }
            Object[] objArr3 = this.d;
            int i4 = this.c;
            objArr3[i4] = null;
            this.c = i(i4);
        } else {
            int k2 = k(this.c + ffdx.e(this));
            if (k <= k2) {
                Object[] objArr4 = this.d;
                ffdo.n(objArr4, objArr4, k, k + 1, k2 + 1);
            } else {
                Object[] objArr5 = this.d;
                ffdo.n(objArr5, objArr5, k, k + 1, objArr5.length);
                Object[] objArr6 = this.d;
                objArr6[objArr6.length - 1] = objArr6[0];
                ffdo.n(objArr6, objArr6, 0, 1, k2 + 1);
            }
            this.d[k2] = null;
        }
        this.a--;
        return obj;
    }

    public final Object e() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[k(this.c + ffdx.e(this))];
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.d[k(this.c + ffdx.e(this))];
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ffda.b(i, this.a);
        return this.d[k(this.c + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int k = k(this.c + this.a);
        int i2 = this.c;
        if (i2 < k) {
            while (i2 < k) {
                if (!ffkj.e(obj, this.d[i2])) {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < k) {
            return -1;
        }
        int length = this.d.length;
        while (i2 < length) {
            if (!ffkj.e(obj, this.d[i2])) {
                i2++;
            }
        }
        for (int i3 = 0; i3 < k; i3++) {
            if (ffkj.e(obj, this.d[i3])) {
                i2 = i3 + this.d.length;
                i = this.c;
                return i2 - i;
            }
        }
        return -1;
        i = this.c;
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int B;
        int i;
        int k = k(this.c + this.a);
        int i2 = this.c;
        if (i2 < k) {
            B = k - 1;
            if (i2 <= B) {
                while (!ffkj.e(obj, this.d[B])) {
                    if (B != i2) {
                        B--;
                    }
                }
                i = this.c;
            }
            return -1;
        }
        if (i2 > k) {
            for (int i3 = k - 1; i3 >= 0; i3--) {
                if (ffkj.e(obj, this.d[i3])) {
                    B = i3 + this.d.length;
                    i = this.c;
                    break;
                }
            }
            B = ffdo.B(this.d);
            int i4 = this.c;
            if (i4 <= B) {
                while (!ffkj.e(obj, this.d[B])) {
                    if (B != i4) {
                        B--;
                    }
                }
                i = this.c;
            }
        }
        return -1;
        return B - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        d(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int k;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int k2 = k(this.c + this.a);
        int i = this.c;
        if (i < k2) {
            k = i;
            while (i < k2) {
                Object obj = this.d[i];
                if (collection.contains(obj)) {
                    z = true;
                } else {
                    this.d[k] = obj;
                    k++;
                }
                i++;
            }
            ffdo.d(this.d, null, k, k2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr = this.d;
                Object obj2 = objArr[i];
                objArr[i] = null;
                if (collection.contains(obj2)) {
                    z2 = true;
                } else {
                    this.d[i2] = obj2;
                    i2++;
                }
                i++;
            }
            k = k(i2);
            for (int i3 = 0; i3 < k2; i3++) {
                Object[] objArr2 = this.d;
                Object obj3 = objArr2[i3];
                objArr2[i3] = null;
                if (collection.contains(obj3)) {
                    z2 = true;
                } else {
                    this.d[k] = obj3;
                    k = i(k);
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        o();
        this.a = j(k - this.c);
        return true;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        Object[] objArr = this.d;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = i(i);
        this.a--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int k = k(this.c + ffdx.e(this));
        Object[] objArr = this.d;
        Object obj = objArr[k];
        objArr[k] = null;
        this.a--;
        return obj;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ffda.d(i, i2, this.a);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.a) {
                clear();
                return;
            }
            if (i3 == 1) {
                d(i);
                return;
            }
            o();
            if (i < this.a - i2) {
                int k = k(this.c + (i - 1));
                int k2 = k(this.c + (i2 - 1));
                while (i > 0) {
                    int i4 = k + 1;
                    int min = Math.min(i, Math.min(i4, k2 + 1));
                    Object[] objArr = this.d;
                    int i5 = k2 - min;
                    int i6 = k - min;
                    ffdo.n(objArr, objArr, i5 + 1, i6 + 1, i4);
                    k = j(i6);
                    k2 = j(i5);
                    i -= min;
                }
                int k3 = k(this.c + i3);
                n(this.c, k3);
                this.c = k3;
            } else {
                int k4 = k(this.c + i2);
                int k5 = k(this.c + i);
                int i7 = this.a;
                while (true) {
                    i7 -= i2;
                    if (i7 <= 0) {
                        break;
                    }
                    int length = this.d.length;
                    i2 = Math.min(i7, Math.min(length - k4, length - k5));
                    Object[] objArr2 = this.d;
                    int i8 = k4 + i2;
                    ffdo.n(objArr2, objArr2, k5, k4, i8);
                    k4 = k(i8);
                    k5 = k(k5 + i2);
                }
                int k6 = k(this.c + this.a);
                n(j(k6 - i3), k6);
            }
            this.a -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int k;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int k2 = k(this.c + this.a);
        int i = this.c;
        if (i < k2) {
            k = i;
            while (i < k2) {
                Object obj = this.d[i];
                if (collection.contains(obj)) {
                    this.d[k] = obj;
                    k++;
                } else {
                    z = true;
                }
                i++;
            }
            ffdo.d(this.d, null, k, k2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr = this.d;
                Object obj2 = objArr[i];
                objArr[i] = null;
                if (collection.contains(obj2)) {
                    this.d[i2] = obj2;
                    i2++;
                } else {
                    z2 = true;
                }
                i++;
            }
            k = k(i2);
            for (int i3 = 0; i3 < k2; i3++) {
                Object[] objArr2 = this.d;
                Object obj3 = objArr2[i3];
                objArr2[i3] = null;
                if (collection.contains(obj3)) {
                    this.d[k] = obj3;
                    k = i(k);
                } else {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        o();
        this.a = j(k - this.c);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ffda.b(i, this.a);
        int k = k(this.c + i);
        Object[] objArr = this.d;
        Object obj2 = objArr[k];
        objArr[k] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.a]);
    }

    public ffdn(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = b;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException(a.h(i, "Illegal Capacity: "));
            }
            objArr = new Object[i];
        }
        this.d = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.a;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int k = k(this.c + this.a);
        int i2 = this.c;
        if (i2 < k) {
            ffdo.w(this.d, objArr, i2, k, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.d;
            ffdo.n(objArr2, objArr, 0, i2, objArr2.length);
            Object[] objArr3 = this.d;
            ffdo.n(objArr3, objArr, objArr3.length - this.c, 0, k);
        }
        ffdx.d(this.a, objArr);
        return objArr;
    }

    public ffdn(Collection collection) {
        collection.getClass();
        Object[] array = collection.toArray(new Object[0]);
        this.d = array;
        int length = array.length;
        this.a = length;
        if (length == 0) {
            this.d = b;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        o();
        m(this.a + collection.size());
        l(k(this.c + this.a), collection);
        return true;
    }
}

package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enef<E> extends AbstractSet<E> implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    enef() {
        f(3);
    }

    private final int h() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object g = eneg.g(i2);
        if (i4 != 0) {
            eneg.i(g, i3 & i5, i4 + 1);
        }
        Object j = j();
        int[] l = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int e = eneg.e(j, i6);
            while (e != 0) {
                int i7 = e - 1;
                int i8 = l[i7];
                int a = eneg.a(i8, i) | i6;
                int i9 = a & i5;
                int e2 = eneg.e(g, i9);
                eneg.i(g, i9, e);
                l[i7] = eneg.b(a, e2, i5);
                e = i8 & i;
            }
        }
        this.c = g;
        k(i5);
        return i5;
    }

    private final Object j() {
        Object obj = this.c;
        obj.getClass();
        return obj;
    }

    private final void k(int i) {
        this.b = eneg.b(this.b, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private final int[] l() {
        int[] iArr = this.d;
        iArr.getClass();
        return iArr;
    }

    private final Object[] m() {
        Object[] objArr = this.a;
        objArr.getClass();
        return objArr;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a.h(readInt, "Invalid size: "));
        }
        f(readInt);
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int min;
        if (g()) {
            emxf.m(g(), "Arrays already allocated");
            int i = this.b;
            int f = eneg.f(i);
            this.c = eneg.g(f);
            k(f - 1);
            this.d = new int[i];
            this.a = new Object[i];
        }
        Set d = d();
        if (d != null) {
            return d.add(obj);
        }
        int[] l = l();
        Object[] m = m();
        int i2 = this.e;
        int i3 = i2 + 1;
        int b = engc.b(obj);
        int h = h();
        int i4 = b & h;
        int e = eneg.e(j(), i4);
        if (e != 0) {
            int a = eneg.a(b, h);
            int i5 = 0;
            while (true) {
                int i6 = e - 1;
                int i7 = l[i6];
                if (eneg.a(i7, h) == a && emxb.a(obj, m[i6])) {
                    return false;
                }
                int i8 = i7 & h;
                i5++;
                if (i8 != 0) {
                    e = i8;
                } else {
                    if (i5 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(h() + 1, 1.0f);
                        int a2 = a();
                        while (a2 >= 0) {
                            linkedHashSet.add(c(a2));
                            a2 = b(a2);
                        }
                        this.c = linkedHashSet;
                        this.d = null;
                        this.a = null;
                        e();
                        return linkedHashSet.add(obj);
                    }
                    if (i3 > h) {
                        h = i(h, eneg.c(h), b, i2);
                    } else {
                        l[i6] = eneg.b(i7, i3, h);
                    }
                }
            }
        } else if (i3 > h) {
            h = i(h, eneg.c(h), b, i2);
        } else {
            eneg.i(j(), i4, i3);
        }
        int length = l().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.d = Arrays.copyOf(l(), min);
            this.a = Arrays.copyOf(m(), min);
        }
        l()[i2] = eneg.b(b, 0, h);
        m()[i2] = obj;
        this.e = i3;
        e();
        return true;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    public final Object c(int i) {
        return m()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (g()) {
            return;
        }
        e();
        Set d = d();
        if (d != null) {
            this.b = ermn.b(size(), 3, 1073741823);
            d.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(m(), 0, this.e, (Object) null);
        eneg.h(j());
        Arrays.fill(l(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (g()) {
            return false;
        }
        Set d = d();
        if (d != null) {
            return d.contains(obj);
        }
        int b = engc.b(obj);
        int h = h();
        int e = eneg.e(j(), b & h);
        if (e == 0) {
            return false;
        }
        int a = eneg.a(b, h);
        do {
            int i = e - 1;
            int i2 = l()[i];
            if (eneg.a(i2, h) == a && emxb.a(obj, c(i))) {
                return true;
            }
            e = i2 & h;
        } while (e != 0);
        return false;
    }

    final Set d() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    final void e() {
        this.b += 32;
    }

    final void f(int i) {
        emxf.b(true, "Expected size must be >= 0");
        this.b = ermn.b(i, 1, 1073741823);
    }

    final boolean g() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        Set d = d();
        return d != null ? d.iterator() : new enee(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!g()) {
            Set d = d();
            if (d != null) {
                return d.remove(obj);
            }
            int h = h();
            int d2 = eneg.d(obj, null, h, j(), l(), m(), null);
            if (d2 != -1) {
                Object j = j();
                int[] l = l();
                Object[] m = m();
                int size = size();
                int i3 = size - 1;
                if (d2 < i3) {
                    int i4 = d2 + 1;
                    Object obj2 = m[i3];
                    m[d2] = obj2;
                    m[i3] = null;
                    l[d2] = l[i3];
                    l[i3] = 0;
                    int b = engc.b(obj2) & h;
                    int e = eneg.e(j, b);
                    if (e == size) {
                        eneg.i(j, b, i4);
                    } else {
                        while (true) {
                            i = e - 1;
                            i2 = l[i];
                            int i5 = i2 & h;
                            if (i5 == size) {
                                break;
                            }
                            e = i5;
                        }
                        l[i] = eneg.b(i2, i4, h);
                    }
                } else {
                    m[d2] = null;
                    l[d2] = 0;
                }
                this.e--;
                e();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set d = d();
        return d != null ? d.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (g()) {
            return new Object[0];
        }
        Set d = d();
        return d != null ? d.toArray() : Arrays.copyOf(m(), this.e);
    }

    public enef(int i) {
        f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (g()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set d = d();
        if (d != null) {
            return d.toArray(objArr);
        }
        Object[] m = m();
        int i = this.e;
        emxf.k(0, i, m.length);
        int length = objArr.length;
        if (length < i) {
            objArr = enon.a(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(m, 0, objArr, 0, i);
        return objArr;
    }
}

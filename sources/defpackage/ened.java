package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ened extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public ened() {
        p(3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a.h(readInt, "Invalid size: "));
        }
        p(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator k = k();
        while (k.hasNext()) {
            Map.Entry entry = (Map.Entry) k.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private final int y(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object g = eneg.g(i2);
        if (i4 != 0) {
            eneg.i(g, i3 & i5, i4 + 1);
        }
        Object i6 = i();
        int[] v = v();
        for (int i7 = 0; i7 <= i; i7++) {
            int e = eneg.e(i6, i7);
            while (e != 0) {
                int i8 = e - 1;
                int i9 = v[i8];
                int a2 = eneg.a(i9, i) | i7;
                int i10 = a2 & i5;
                int e2 = eneg.e(g, i10);
                eneg.i(g, i10, e);
                v[i8] = eneg.b(a2, e2, i5);
                e = i9 & i;
            }
        }
        this.g = g;
        z(i5);
        return i5;
    }

    private final void z(int i) {
        this.e = eneg.b(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    public int a(int i, int i2) {
        return i - 1;
    }

    public int b() {
        emxf.m(u(), "Arrays already allocated");
        int i = this.e;
        int f = eneg.f(i);
        this.g = eneg.g(f);
        z(f - 1);
        this.b = new int[i];
        this.c = new Object[i];
        this.d = new Object[i];
        return i;
    }

    public int c() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (u()) {
            return;
        }
        o();
        Map n = n();
        if (n != null) {
            this.e = ermn.b(size(), 3, 1073741823);
            n.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(w(), 0, this.f, (Object) null);
        Arrays.fill(x(), 0, this.f, (Object) null);
        eneg.h(i());
        Arrays.fill(v(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map n = n();
        return n != null ? n.containsKey(obj) : f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map n = n();
        if (n != null) {
            return n.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (emxb.a(obj, j(i))) {
                return true;
            }
        }
        return false;
    }

    public int d(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int e() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        endy endyVar = new endy(this);
        this.i = endyVar;
        return endyVar;
    }

    public final int f(Object obj) {
        if (u()) {
            return -1;
        }
        int b = engc.b(obj);
        int e = e();
        int e2 = eneg.e(i(), b & e);
        if (e2 == 0) {
            return -1;
        }
        int a2 = eneg.a(b, e);
        do {
            int i = e2 - 1;
            int i2 = v()[i];
            if (eneg.a(i2, e) == a2 && emxb.a(obj, g(i))) {
                return i;
            }
            e2 = i2 & e;
        } while (e2 != 0);
        return -1;
    }

    public final Object g(int i) {
        return w()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map n = n();
        if (n != null) {
            return n.get(obj);
        }
        int f = f(obj);
        if (f == -1) {
            return null;
        }
        return j(f);
    }

    public final Object h(Object obj) {
        int e;
        int d;
        if (u() || (d = eneg.d(obj, null, (e = e()), i(), v(), w(), null)) == -1) {
            return a;
        }
        Object j = j(d);
        r(d, e);
        this.f--;
        o();
        return j;
    }

    public final Object i() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(int i) {
        return x()[i];
    }

    final Iterator k() {
        Map n = n();
        return n != null ? n.entrySet().iterator() : new endw(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        enea eneaVar = new enea(this);
        this.h = eneaVar;
        return eneaVar;
    }

    public Map l() {
        Map m = m(e() + 1);
        int c = c();
        while (c >= 0) {
            m.put(g(c), j(c));
            c = d(c);
        }
        this.g = m;
        this.b = null;
        this.c = null;
        this.d = null;
        o();
        return m;
    }

    public Map m(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    final Map n() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void o() {
        this.e += 32;
    }

    public void p(int i) {
        emxf.b(i >= 0, "Expected size must be >= 0");
        this.e = ermn.b(i, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (u()) {
            b();
        }
        Map n = n();
        if (n != null) {
            return n.put(obj, obj2);
        }
        int[] v = v();
        Object[] w = w();
        Object[] x = x();
        int i = this.f;
        int i2 = i + 1;
        int b = engc.b(obj);
        int e = e();
        int i3 = b & e;
        int e2 = eneg.e(i(), i3);
        if (e2 != 0) {
            int a2 = eneg.a(b, e);
            int i4 = 0;
            while (true) {
                int i5 = e2 - 1;
                int i6 = v[i5];
                if (eneg.a(i6, e) == a2 && emxb.a(obj, w[i5])) {
                    Object obj3 = x[i5];
                    x[i5] = obj2;
                    return obj3;
                }
                int i7 = i6 & e;
                i4++;
                if (i7 != 0) {
                    obj = obj;
                    obj2 = obj2;
                    e2 = i7;
                } else {
                    if (i4 >= 9) {
                        return l().put(obj, obj2);
                    }
                    if (i2 > e) {
                        e = y(e, eneg.c(e), b, i);
                    } else {
                        v[i5] = eneg.b(i6, i2, e);
                    }
                }
            }
        } else if (i2 > e) {
            e = y(e, eneg.c(e), b, i);
        } else {
            eneg.i(i(), i3, i2);
        }
        int length = v().length;
        if (i2 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            s(min);
        }
        q(i, obj, obj2, b, e);
        this.f = i2;
        o();
        return null;
    }

    public void q(int i, Object obj, Object obj2, int i2, int i3) {
        v()[i] = eneg.b(i2, 0, i3);
        w()[i] = obj;
        t(i, obj2);
    }

    public void r(int i, int i2) {
        Object i3 = i();
        int[] v = v();
        Object[] w = w();
        Object[] x = x();
        int size = size();
        int i4 = size - 1;
        if (i >= i4) {
            w[i] = null;
            x[i] = null;
            v[i] = 0;
            return;
        }
        int i5 = i + 1;
        Object obj = w[i4];
        w[i] = obj;
        x[i] = x[i4];
        w[i4] = null;
        x[i4] = null;
        v[i] = v[i4];
        v[i4] = 0;
        int b = engc.b(obj) & i2;
        int e = eneg.e(i3, b);
        if (e == size) {
            eneg.i(i3, b, i5);
            return;
        }
        while (true) {
            int i6 = e - 1;
            int i7 = v[i6];
            int i8 = i7 & i2;
            if (i8 == size) {
                v[i6] = eneg.b(i7, i5, i2);
                return;
            }
            e = i8;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map n = n();
        if (n != null) {
            return n.remove(obj);
        }
        Object h = h(obj);
        if (h == a) {
            return null;
        }
        return h;
    }

    public void s(int i) {
        this.b = Arrays.copyOf(v(), i);
        this.c = Arrays.copyOf(w(), i);
        this.d = Arrays.copyOf(x(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map n = n();
        return n != null ? n.size() : this.f;
    }

    public final void t(int i, Object obj) {
        x()[i] = obj;
    }

    final boolean u() {
        return this.g == null;
    }

    public final int[] v() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection != null) {
            return collection;
        }
        enec enecVar = new enec(this);
        this.j = enecVar;
        return enecVar;
    }

    public final Object[] w() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    public final Object[] x() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    public ened(int i) {
        p(i);
    }
}

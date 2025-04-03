package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enfy extends AbstractMap implements Serializable, encw {
    transient Object[] a;
    transient Object[] b;
    public transient int c;
    transient int d;
    public transient int e;
    public transient int[] f;
    public transient encw g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient Set n;
    private transient Set o;
    private transient Set p;

    public enfy() {
        j();
    }

    private final int n(int i) {
        return i & (this.h.length - 1);
    }

    private final void o(int i, int i2) {
        emxf.a(i != -1);
        int n = n(i2);
        int[] iArr = this.h;
        int i3 = iArr[n];
        if (i3 == i) {
            int[] iArr2 = this.j;
            iArr[n] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.j[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(String.valueOf(this.a[i]))));
            }
            if (i3 == i) {
                int[] iArr3 = this.j;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.j[i3];
        }
    }

    private final void p(int i, int i2) {
        emxf.a(i != -1);
        int n = n(i2);
        int[] iArr = this.i;
        int i3 = iArr[n];
        if (i3 == i) {
            int[] iArr2 = this.k;
            iArr[n] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.k[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(String.valueOf(this.b[i]))));
            }
            if (i3 == i) {
                int[] iArr3 = this.k;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.k[i3];
        }
    }

    private final void q(int i) {
        int length = this.j.length;
        if (length < i) {
            int f = engh.f(length, i);
            this.a = Arrays.copyOf(this.a, f);
            this.b = Arrays.copyOf(this.b, f);
            this.j = w(this.j, f);
            this.k = w(this.k, f);
            this.m = w(this.m, f);
            this.f = w(this.f, f);
        }
        if (this.h.length < i) {
            int c = engc.c(i);
            this.h = v(c);
            this.i = v(c);
            for (int i2 = 0; i2 < this.c; i2++) {
                int n = n(engc.b(this.a[i2]));
                int[] iArr = this.j;
                int[] iArr2 = this.h;
                iArr[i2] = iArr2[n];
                iArr2[n] = i2;
                int n2 = n(engc.b(this.b[i2]));
                int[] iArr3 = this.k;
                int[] iArr4 = this.i;
                iArr3[i2] = iArr4[n2];
                iArr4[n2] = i2;
            }
        }
    }

    private final void r(int i, int i2) {
        emxf.a(i != -1);
        int n = n(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[n];
        iArr2[n] = i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        j();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final void s(int i, int i2) {
        emxf.a(i != -1);
        int n = n(i2);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i] = iArr2[n];
        iArr2[n] = i;
    }

    private final void t(int i, int i2, int i3) {
        int i4;
        int i5;
        emxf.a(i != -1);
        o(i, i2);
        p(i, i3);
        u(this.m[i], this.f[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.m[i6];
            int i8 = this.f[i6];
            u(i7, i);
            u(i, i8);
            Object[] objArr = this.a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int n = n(engc.b(obj));
            int[] iArr = this.h;
            int i9 = iArr[n];
            if (i9 == i6) {
                iArr[n] = i;
            } else {
                int i10 = this.j[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = this.j[i9];
                    }
                }
                this.j[i4] = i;
            }
            int[] iArr2 = this.j;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int n2 = n(engc.b(obj2));
            int[] iArr3 = this.i;
            int i11 = iArr3[n2];
            if (i11 == i6) {
                iArr3[n2] = i;
            } else {
                int i12 = this.k[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = this.k[i11];
                    }
                }
                this.k[i5] = i;
            }
            int[] iArr4 = this.k;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        Object[] objArr3 = this.a;
        int i13 = this.c - 1;
        objArr3[i13] = null;
        this.b[i13] = null;
        this.c = i13;
        this.d++;
    }

    private final void u(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            this.f[i] = i2;
        }
        if (i2 == -2) {
            this.l = i;
        } else {
            this.m[i2] = i;
        }
    }

    private static int[] v(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] w(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.encw
    public final encw a() {
        encw encwVar = this.g;
        if (encwVar != null) {
            return encwVar;
        }
        enfs enfsVar = new enfs(this);
        this.g = enfsVar;
        return enfsVar;
    }

    final int b(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[n(i)];
        while (i2 != -1) {
            if (emxb.a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    final int c(Object obj) {
        return d(obj, engc.b(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.m, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return e(obj) != -1;
    }

    final int d(Object obj, int i) {
        return b(obj, i, this.h, this.j, this.a);
    }

    final int e(Object obj) {
        return f(obj, engc.b(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.p;
        if (set != null) {
            return set;
        }
        enfr enfrVar = new enfr(this);
        this.p = enfrVar;
        return enfrVar;
    }

    final int f(Object obj, int i) {
        return b(obj, i, this.i, this.k, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.o;
        if (set != null) {
            return set;
        }
        enfv enfvVar = new enfv(this);
        this.o = enfvVar;
        return enfvVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int c = c(obj);
        if (c == -1) {
            return null;
        }
        return this.b[c];
    }

    final void h(int i, int i2) {
        t(i, i2, engc.b(this.b[i]));
    }

    final void i(int i, int i2) {
        t(i, engc.b(this.a[i]), i2);
    }

    final void j() {
        endr.c(16, "expectedSize");
        int c = engc.c(16);
        this.c = 0;
        this.a = new Object[16];
        this.b = new Object[16];
        this.h = v(c);
        this.i = v(c);
        this.j = v(16);
        this.k = v(16);
        this.e = -2;
        this.l = -2;
        this.m = v(16);
        this.f = v(16);
    }

    final Object k(Object obj, Object obj2) {
        int b = engc.b(obj);
        int f = f(obj, b);
        if (f != -1) {
            Object obj3 = this.a[f];
            if (emxb.a(obj3, obj2)) {
                return obj2;
            }
            l(f, obj2);
            return obj3;
        }
        int i = this.l;
        int b2 = engc.b(obj2);
        emxf.f(d(obj2, b2) == -1, "Key already present: %s", obj2);
        q(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj2;
        this.b[i2] = obj;
        r(i2, b2);
        s(this.c, b);
        int i3 = i == -2 ? this.e : this.f[i];
        u(i, this.c);
        u(this.c, i3);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.n;
        if (set != null) {
            return set;
        }
        enfu enfuVar = new enfu(this);
        this.n = enfuVar;
        return enfuVar;
    }

    public final void l(int i, Object obj) {
        emxf.a(i != -1);
        int d = d(obj, engc.b(obj));
        int i2 = this.l;
        if (d != -1) {
            throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(String.valueOf(obj))));
        }
        if (i2 == i) {
            i2 = this.m[i];
        } else if (i2 == this.c) {
            i2 = d;
        }
        if (i == -2) {
            d = this.f[-2];
        } else if (this.c != -2) {
            d = -2;
        }
        u(this.m[i], this.f[i]);
        o(i, engc.b(this.a[i]));
        this.a[i] = obj;
        r(i, engc.b(obj));
        u(i2, i);
        u(i, d);
    }

    public final void m(int i, Object obj) {
        emxf.a(i != -1);
        int b = engc.b(obj);
        if (f(obj, b) != -1) {
            throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(String.valueOf(obj))));
        }
        p(i, engc.b(this.b[i]));
        this.b[i] = obj;
        s(i, b);
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.encw
    public final Object put(Object obj, Object obj2) {
        int b = engc.b(obj);
        int d = d(obj, b);
        if (d != -1) {
            Object obj3 = this.b[d];
            if (emxb.a(obj3, obj2)) {
                return obj2;
            }
            m(d, obj2);
            return obj3;
        }
        int b2 = engc.b(obj2);
        emxf.f(f(obj2, b2) == -1, "Value already present: %s", obj2);
        q(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        r(i, b);
        s(this.c, b2);
        u(this.l, this.c);
        u(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int b = engc.b(obj);
        int d = d(obj, b);
        if (d == -1) {
            return null;
        }
        Object obj2 = this.b[d];
        h(d, b);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }
}

package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eyiq extends AbstractMap {
    public Object[] a;
    public int b;
    public boolean d;
    private volatile eyip f;
    public Map c = Collections.EMPTY_MAP;
    public Map e = Collections.EMPTY_MAP;

    private final int f(Comparable comparable) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((eyin) this.a[i2]).a);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((eyin) this.a[i4]).a);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    private final SortedMap g() {
        e();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.e = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    public final Iterable a() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        e();
        int f = f(comparable);
        if (f >= 0) {
            return ((eyin) this.a[f]).setValue(obj);
        }
        e();
        if (this.a == null) {
            this.a = new Object[16];
        }
        int i = -(f + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.b == 16) {
            eyin eyinVar = (eyin) this.a[15];
            this.b = 15;
            g().put(eyinVar.a, eyinVar.b);
        }
        Object[] objArr = this.a;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.a[i] = new eyin(this, comparable, obj);
        this.b++;
        return null;
    }

    public final Object c(int i) {
        e();
        Object[] objArr = this.a;
        Object obj = ((eyin) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new eyin(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        e();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Map.Entry d(int i) {
        if (i < this.b) {
            return (eyin) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void e() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f == null) {
            this.f = new eyip(this);
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyiq)) {
            return super.equals(obj);
        }
        eyiq eyiqVar = (eyiq) obj;
        int size = size();
        if (size != eyiqVar.size()) {
            return false;
        }
        int i = this.b;
        if (i != eyiqVar.b) {
            return entrySet().equals(eyiqVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!d(i2).equals(eyiqVar.d(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.c.equals(eyiqVar.c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        return f >= 0 ? ((eyin) this.a[f]).b : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.a[i3].hashCode();
        }
        return this.c.size() > 0 ? i2 + this.c.hashCode() : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        if (f >= 0) {
            return c(f);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b + this.c.size();
    }
}

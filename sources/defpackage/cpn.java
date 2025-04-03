package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpn {
    private int[] a;
    private Object[] b;
    public int d;

    public cpn() {
        this((byte[]) null);
    }

    private final int a(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int a = cpu.a(this.a, i2, i);
        if (a < 0 || ffkj.e(obj, this.b[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (ffkj.e(obj, this.b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (ffkj.e(obj, this.b[i4 + i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int j() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int a = cpu.a(this.a, i, 0);
        if (a < 0 || this.b[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 + i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int b(Object obj) {
        int i = this.d;
        int i2 = i + i;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (ffkj.e(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final int c(Object obj) {
        return obj == null ? j() : a(obj, obj.hashCode());
    }

    public void clear() {
        if (this.d > 0) {
            this.a = cpu.a;
            this.b = cpu.c;
            this.d = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final Object d(int i) {
        if (i < 0 || i >= this.d) {
            cpx.a(a.h(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i];
    }

    public Object e(int i) {
        if (i < 0 || i >= this.d) {
            cpx.a(a.h(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.d;
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i4 = i3 - 1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (length <= 8 || i3 >= length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                ffdo.l(iArr, iArr, i, i5, i3);
                Object[] objArr2 = this.b;
                ffdo.n(objArr2, objArr2, i2, i5 + i5, i3 + i3);
            }
            Object[] objArr3 = this.b;
            int i6 = i4 + i4;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i7);
            copyOf.getClass();
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i7 + i7);
            copyOf2.getClass();
            this.b = copyOf2;
            if (i3 != this.d) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                ffdo.l(iArr, this.a, 0, 0, i);
                ffdo.n(objArr, this.b, 0, 0, i2);
            }
            if (i < i4) {
                int i8 = i + 1;
                ffdo.l(iArr, this.a, i, i8, i3);
                ffdo.n(objArr, this.b, i2, i8 + i8, i3 + i3);
            }
        }
        if (i3 != this.d) {
            throw new ConcurrentModificationException();
        }
        this.d = i4;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof cpn) {
                int i = this.d;
                cpn cpnVar = (cpn) obj;
                if (i != cpnVar.d) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object d = d(i2);
                    Object g = g(i2);
                    Object obj2 = cpnVar.get(d);
                    if (g == null) {
                        if (obj2 != null || !cpnVar.containsKey(d)) {
                            return false;
                        }
                    } else if (!ffkj.e(g, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.d != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.d;
            for (int i4 = 0; i4 < i3; i4++) {
                Object d2 = d(i4);
                Object g2 = g(i4);
                Map map = (Map) obj;
                Object obj3 = map.get(d2);
                if (g2 == null) {
                    if (obj3 != null || !map.containsKey(d2)) {
                        return false;
                    }
                } else if (!ffkj.e(g2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i, Object obj) {
        if (i < 0 || i >= this.d) {
            cpx.a(a.h(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i2 = i + i + 1;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object g(int i) {
        if (i < 0 || i >= this.d) {
            cpx.a(a.h(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i + 1];
    }

    public final Object get(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return this.b[c + c + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c = c(obj);
        return c >= 0 ? this.b[c + c + 1] : obj2;
    }

    public final void h(int i) {
        int i2 = this.d;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            copyOf.getClass();
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i + i);
            copyOf2.getClass();
            this.b = copyOf2;
        }
        if (this.d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public void i(cpn cpnVar) {
        int i = cpnVar.d;
        h(this.d + i);
        if (this.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(cpnVar.d(i2), cpnVar.g(i2));
            }
        } else if (i > 0) {
            ffdo.l(cpnVar.a, this.a, 0, 0, i);
            ffdo.n(cpnVar.b, this.b, 0, 0, i + i);
            this.d = i;
        }
    }

    public final boolean isEmpty() {
        return this.d <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.d;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int a = obj != null ? a(obj, hashCode) : j();
        if (a >= 0) {
            int i2 = a + a + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~a;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            copyOf.getClass();
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i4 + i4);
            copyOf2.getClass();
            this.b = copyOf2;
            if (i != this.d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            ffdo.l(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.b;
            int i6 = this.d;
            ffdo.n(objArr2, objArr2, i5 + i5, i3 + i3, i6 + i6);
        }
        int i7 = this.d;
        if (i == i7) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.b;
                int i8 = i3 + i3;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return e(c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c = c(obj);
        if (c >= 0) {
            return f(c, obj2);
        }
        return null;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object d = d(i2);
            if (d != sb) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object g = g(i2);
            if (g != sb) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public cpn(int i) {
        this.a = i == 0 ? cpu.a : new int[i];
        this.b = i == 0 ? cpu.c : new Object[i + i];
    }

    public final boolean remove(Object obj, Object obj2) {
        int c = c(obj);
        if (c < 0 || !ffkj.e(obj2, g(c))) {
            return false;
        }
        e(c);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c = c(obj);
        if (c < 0 || !ffkj.e(obj2, g(c))) {
            return false;
        }
        f(c, obj3);
        return true;
    }

    public /* synthetic */ cpn(byte[] bArr) {
        this(0);
    }
}

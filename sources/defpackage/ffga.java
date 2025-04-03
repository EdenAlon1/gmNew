package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffga implements Map, Serializable, fflk {
    public static final ffga a;
    public Object[] b;
    public Object[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int[] i;
    private int j;
    private int k;
    private ffgc l;
    private ffgd m;
    private ffgb n;

    static {
        ffga ffgaVar = new ffga(0);
        ffgaVar.h = true;
        a = ffgaVar;
    }

    public ffga() {
        this(8);
    }

    private final int l() {
        return this.i.length;
    }

    private final int m(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    private final void n(boolean z) {
        int i;
        Object[] objArr = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.e;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.d;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                int i5 = i3 + 1;
                Object[] objArr2 = this.b;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.i[i4] = i5;
                }
                i3 = i5;
            }
            i2++;
        }
        ffft.d(this.b, i3, i);
        if (objArr != null) {
            ffft.d(objArr, i3, this.e);
        }
        this.e = i3;
    }

    private final void o(int i) {
        int d = d();
        int i2 = this.e;
        int i3 = d - i2;
        int i4 = i2 - this.g;
        if (i3 < i && i3 + i4 >= i && i4 >= (d() >> 2)) {
            n(true);
            return;
        }
        int i5 = this.e + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > d()) {
            int e = ffda.e(d(), i5);
            this.b = ffft.g(this.b, e);
            Object[] objArr = this.c;
            this.c = objArr != null ? ffft.g(objArr, e) : null;
            int[] copyOf = Arrays.copyOf(this.d, e);
            copyOf.getClass();
            this.d = copyOf;
            int a2 = fffu.a(e);
            if (a2 > l()) {
                q(a2);
            }
        }
    }

    private final void p() {
        this.f++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r3[r0] = r6;
        r5.d[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(int r6) {
        /*
            r5 = this;
            r5.p()
            int r0 = r5.e
            int r1 = r5.g
            r2 = 0
            if (r0 <= r1) goto Ld
            r5.n(r2)
        Ld:
            int[] r0 = new int[r6]
            r5.i = r0
            int r6 = defpackage.fffu.b(r6)
            r5.k = r6
        L17:
            int r6 = r5.e
            if (r2 >= r6) goto L4e
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.b
            r0 = r0[r2]
            int r0 = r5.m(r0)
            int r1 = r5.j
        L27:
            int[] r3 = r5.i
            r4 = r3[r0]
            if (r4 != 0) goto L35
            r3[r0] = r6
            int[] r1 = r5.d
            r1[r2] = r0
            r2 = r6
            goto L17
        L35:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L46
            int r3 = r0 + (-1)
            if (r0 != 0) goto L44
            int r0 = r5.l()
            int r0 = r0 + (-1)
            goto L27
        L44:
            r0 = r3
            goto L27
        L46:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffga.q(int):void");
    }

    private final Object writeReplace() {
        if (this.h) {
            return new ffgf(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        f();
        while (true) {
            int m = m(obj);
            int i = this.j;
            int i2 = i + i;
            int l = l() >> 1;
            int i3 = 0;
            while (true) {
                int i4 = this.i[m];
                if (i4 <= 0) {
                    if (this.e < d()) {
                        int i5 = this.e;
                        int i6 = i5 + 1;
                        this.e = i6;
                        this.b[i5] = obj;
                        this.d[i5] = m;
                        this.i[m] = i6;
                        this.g++;
                        p();
                        if (i3 > this.j) {
                            this.j = i3;
                        }
                        return i5;
                    }
                    o(1);
                } else {
                    if (ffkj.e(this.b[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > ffmk.g(i2, l)) {
                        int l2 = l();
                        q(l2 + l2);
                        break;
                    }
                    m = m == 0 ? l() - 1 : m - 1;
                }
            }
        }
    }

    public final int b(Object obj) {
        int m = m(obj);
        int i = this.j;
        while (true) {
            int i2 = this.i[m];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (ffkj.e(this.b[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            m = m == 0 ? l() - 1 : m - 1;
        }
    }

    public final int c(Object obj) {
        int i = this.e;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.d[i] >= 0) {
                Object[] objArr = this.c;
                objArr.getClass();
                if (ffkj.e(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        f();
        int i = this.e - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.i[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ffft.d(this.b, 0, this.e);
        Object[] objArr = this.c;
        if (objArr != null) {
            ffft.d(objArr, 0, this.e);
        }
        this.g = 0;
        this.e = 0;
        p();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c(obj) >= 0;
    }

    public final int d() {
        return this.b.length;
    }

    public final Map e() {
        f();
        this.h = true;
        if (this.g > 0) {
            return this;
        }
        ffga ffgaVar = a;
        ffgaVar.getClass();
        return ffgaVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        ffgb ffgbVar = this.n;
        if (ffgbVar != null) {
            return ffgbVar;
        }
        ffgb ffgbVar2 = new ffgb(this);
        this.n = ffgbVar2;
        return ffgbVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.g == map.size() && h(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:5:0x0021->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r11) {
        /*
            r10 = this;
            java.lang.Object[] r0 = r10.b
            defpackage.ffft.c(r0, r11)
            java.lang.Object[] r0 = r10.c
            if (r0 == 0) goto Lc
            defpackage.ffft.c(r0, r11)
        Lc:
            int[] r0 = r10.d
            r0 = r0[r11]
            int r1 = r10.j
            int r1 = r1 + r1
            int r2 = r10.l()
            int r2 = r2 >> 1
            int r1 = defpackage.ffmk.g(r1, r2)
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L21:
            r5 = -1
            if (r0 != 0) goto L2a
            int r0 = r10.l()
            int r0 = r0 + r5
            goto L2c
        L2a:
            int r0 = r0 + (-1)
        L2c:
            int r4 = r4 + 1
            int r6 = r10.j
            if (r4 <= r6) goto L37
            int[] r0 = r10.i
            r0[r1] = r2
            goto L6a
        L37:
            int[] r6 = r10.i
            r7 = r6[r0]
            if (r7 != 0) goto L40
            r6[r1] = r2
            goto L6a
        L40:
            if (r7 >= 0) goto L47
            r6[r1] = r5
        L44:
            r1 = r0
            r4 = r2
            goto L63
        L47:
            java.lang.Object[] r6 = r10.b
            int r8 = r7 + (-1)
            r6 = r6[r8]
            int r6 = r10.m(r6)
            int r6 = r6 - r0
            int r9 = r10.l()
            int r9 = r9 + r5
            r6 = r6 & r9
            if (r6 < r4) goto L63
            int[] r4 = r10.i
            r4[r1] = r7
            int[] r4 = r10.d
            r4[r8] = r1
            goto L44
        L63:
            int r3 = r3 + r5
            if (r3 >= 0) goto L21
            int[] r0 = r10.i
            r0[r1] = r5
        L6a:
            int[] r0 = r10.d
            r0[r11] = r5
            int r11 = r10.g
            int r11 = r11 + r5
            r10.g = r11
            r10.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffga.g(int):void");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int b = b(obj);
        if (b < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr[b];
    }

    public final boolean h(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!i((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        fffv fffvVar = new fffv(this);
        int i = 0;
        while (fffvVar.hasNext()) {
            int i2 = fffvVar.b;
            ffga ffgaVar = fffvVar.a;
            if (i2 >= ffgaVar.e) {
                throw new NoSuchElementException();
            }
            fffvVar.b = i2 + 1;
            fffvVar.c = i2;
            Object obj = ffgaVar.b[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fffvVar.a.c;
            objArr.getClass();
            Object obj2 = objArr[fffvVar.c];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            fffvVar.b();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final boolean i(Map.Entry entry) {
        int b = b(entry.getKey());
        if (b < 0) {
            return false;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return ffkj.e(objArr[b], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.g == 0;
    }

    public final boolean j(Object obj) {
        f();
        int b = b(obj);
        if (b < 0) {
            return false;
        }
        g(b);
        return true;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        if (objArr != null) {
            return objArr;
        }
        Object[] f = ffft.f(d());
        this.c = f;
        return f;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        ffgc ffgcVar = this.l;
        if (ffgcVar != null) {
            return ffgcVar;
        }
        ffgc ffgcVar2 = new ffgc(this);
        this.l = ffgcVar2;
        return ffgcVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        f();
        int a2 = a(obj);
        Object[] k = k();
        if (a2 >= 0) {
            k[a2] = obj2;
            return null;
        }
        int i = (-a2) - 1;
        Object obj3 = k[i];
        k[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        f();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        o(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a2 = a(entry.getKey());
            Object[] k = k();
            if (a2 >= 0) {
                k[a2] = entry.getValue();
            } else {
                int i = (-a2) - 1;
                if (!ffkj.e(entry.getValue(), k[i])) {
                    k[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        f();
        int b = b(obj);
        if (b < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        Object obj2 = objArr[b];
        g(b);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.g * 3) + 2);
        sb.append("{");
        fffv fffvVar = new fffv(this);
        int i = 0;
        while (fffvVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = fffvVar.b;
            ffga ffgaVar = fffvVar.a;
            if (i2 >= ffgaVar.e) {
                throw new NoSuchElementException();
            }
            fffvVar.b = i2 + 1;
            fffvVar.c = i2;
            Object obj = ffgaVar.b[i2];
            if (obj == ffgaVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            ffga ffgaVar2 = fffvVar.a;
            Object[] objArr = ffgaVar2.c;
            objArr.getClass();
            Object obj2 = objArr[fffvVar.c];
            if (obj2 == ffgaVar2) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            fffvVar.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        ffgd ffgdVar = this.m;
        if (ffgdVar != null) {
            return ffgdVar;
        }
        ffgd ffgdVar2 = new ffgd(this);
        this.m = ffgdVar2;
        return ffgdVar2;
    }

    public ffga(int i) {
        Object[] f = ffft.f(i);
        int[] iArr = new int[i];
        int[] iArr2 = new int[fffu.a(i)];
        this.b = f;
        this.c = null;
        this.d = iArr;
        this.i = iArr2;
        this.j = 2;
        this.e = 0;
        this.k = fffu.b(l());
    }
}

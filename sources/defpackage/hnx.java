package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnx<E> extends ffdi<E> implements hnm<E> {
    public int a;
    public Object[] b;
    public Object[] c;
    public int d;
    private hnn e;
    private Object[] f;
    private Object[] g;
    private hpl h = new hpl();

    public hnx(hnn hnnVar, Object[] objArr, Object[] objArr2, int i) {
        this.e = hnnVar;
        this.f = objArr;
        this.g = objArr2;
        this.a = i;
        this.b = this.f;
        this.c = this.g;
        this.d = this.e.size();
    }

    private final Object[] A(Object[] objArr, int i, Object[][] objArr2) {
        Iterator a = ffjw.a(objArr2);
        int i2 = this.a;
        Object[] z = (i >> 5) < (1 << i2) ? z(objArr, i, i2, a) : t(objArr);
        while (a.hasNext()) {
            this.a += 5;
            z = w(z);
            int i3 = this.a;
            z(z, 1 << i3, i3, a);
        }
        return z;
    }

    private final Object[] B(Object[] objArr, Object[] objArr2, int i) {
        int i2 = this.d - 1;
        Object[] t = t(objArr);
        int a = hod.a(i2, i);
        if (i == 5) {
            t[a] = objArr2;
            return t;
        }
        t[a] = B((Object[]) t[a], objArr2, i - 5);
        return t;
    }

    private final Object[] C(Object[] objArr, int i, int i2, hnu hnuVar) {
        int a = hod.a(i2, i);
        int i3 = a + 1;
        if (i == 0) {
            Object obj = objArr[a];
            Object[] t = t(objArr);
            ffdo.n(objArr, t, a, i3, 32);
            t[31] = hnuVar.a;
            hnuVar.a = obj;
            return t;
        }
        int a2 = objArr[31] == null ? hod.a(i() - 1, i) : 31;
        Object[] t2 = t(objArr);
        int i4 = i - 5;
        if (i3 <= a2) {
            while (true) {
                Object obj2 = t2[a2];
                obj2.getClass();
                t2[a2] = C((Object[]) obj2, i4, 0, hnuVar);
                if (a2 == i3) {
                    break;
                }
                a2--;
            }
        }
        Object obj3 = t2[a];
        obj3.getClass();
        t2[a] = C((Object[]) obj3, i4, i2, hnuVar);
        return t2;
    }

    private final Object[] D(Object[] objArr, int i, int i2, Object obj, hnu hnuVar) {
        Object[] t = t(objArr);
        int a = hod.a(i2, i);
        if (i == 0) {
            if (t != objArr) {
                this.modCount++;
            }
            hnuVar.a = t[a];
            t[a] = obj;
            return t;
        }
        Object obj2 = t[a];
        obj2.getClass();
        t[a] = D((Object[]) obj2, i - 5, i2, obj, hnuVar);
        return t;
    }

    private static final void E(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private static final int F(int i) {
        return i <= 32 ? i : i - hod.b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int f(ffji ffjiVar, Object[] objArr, int i, int i2, hnu hnuVar, List list, List list2) {
        if (r(objArr)) {
            list.add(objArr);
        }
        Object obj = hnuVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) ffjiVar.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : v();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        hnuVar.a = objArr3;
        if (objArr2 != hnuVar.a) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final int g(ffji ffjiVar, Object[] objArr, int i, hnu hnuVar) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) ffjiVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = t(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        hnuVar.a = objArr2;
        return i2;
    }

    private final int h(ffji ffjiVar, int i, hnu hnuVar) {
        int g = g(ffjiVar, this.c, i, hnuVar);
        if (g == i) {
            return i;
        }
        Object obj = hnuVar.a;
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        ffdo.d(objArr, null, g, i);
        this.c = objArr;
        this.d -= i - g;
        return g;
    }

    private final int i() {
        int i = this.d;
        if (i <= 32) {
            return 0;
        }
        return hod.b(i);
    }

    private final int j() {
        return F(this.d);
    }

    private final Object k(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d - i;
        if (i4 == 1) {
            Object obj = this.c[0];
            o(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.c;
        Object obj2 = objArr2[i3];
        Object[] t = t(objArr2);
        ffdo.n(objArr2, t, i3, i3 + 1, i4);
        t[i4 - 1] = null;
        this.b = objArr;
        this.c = t;
        this.d = (i + i4) - 1;
        this.a = i2;
        return obj2;
    }

    private final ListIterator l(int i) {
        Object[] objArr = this.b;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int i2 = i() >> 5;
        hpk.b(i, i2);
        int i3 = this.a;
        return i3 == 0 ? new hoa(objArr, i) : new hoc(objArr, i, i2, i3 / 5);
    }

    private final void m(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.b == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        ListIterator l = l(i() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (l.previousIndex() != i4) {
            Object[] objArr4 = (Object[]) l.previous();
            ffdo.n(objArr4, objArr3, 0, 32 - i2, 32);
            objArr3 = u(objArr4, i2);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) l.previous();
        int i6 = i3 - (((i() >> 5) - 1) - i4);
        if (i6 < i3) {
            objArr2 = objArr[i6];
            objArr2.getClass();
        }
        q(collection, i, objArr5, 32, objArr, i6, objArr2);
    }

    private final void n(Object[] objArr, int i, Object obj) {
        int j = j();
        Object[] t = t(this.c);
        int i2 = i + 1;
        if (j < 32) {
            ffdo.n(this.c, t, i2, i, j);
            t[i] = obj;
            this.b = objArr;
            this.c = t;
            this.d++;
            return;
        }
        Object[] objArr2 = this.c;
        Object obj2 = objArr2[31];
        ffdo.n(objArr2, t, i2, i, 31);
        t[i] = obj;
        p(objArr, t, w(obj2));
    }

    private final void o(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.b = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.c = objArr;
            this.d = i;
            this.a = 0;
            return;
        }
        hnu hnuVar = new hnu(null);
        objArr.getClass();
        Object[] y = y(objArr, i2, i, hnuVar);
        y.getClass();
        Object obj = hnuVar.a;
        obj.getClass();
        this.c = (Object[]) obj;
        this.d = i;
        if (y[1] == null) {
            this.b = (Object[]) y[0];
            this.a = i2 - 5;
        } else {
            this.b = y;
            this.a = i2;
        }
    }

    private final void p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.a;
        if (i2 > (1 << i3)) {
            this.b = B(w(objArr), objArr2, this.a + 5);
            this.c = objArr3;
            this.a += 5;
            this.d++;
            return;
        }
        if (objArr == null) {
            this.b = objArr2;
            this.c = objArr3;
            this.d = i + 1;
        } else {
            this.b = B(objArr, objArr2, i3);
            this.c = objArr3;
            this.d++;
        }
    }

    private final void q(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] v;
        if (i3 <= 0) {
            hih.a("requires at least one nullBuffer");
        }
        Object[] t = t(objArr);
        objArr2[0] = t;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        int i6 = size + 1;
        if (i5 < 32) {
            ffdo.n(t, objArr3, i6, i4, i2);
        } else {
            int i7 = i5 - 31;
            if (i3 == 1) {
                v = t;
            } else {
                v = v();
                i3--;
                objArr2[i3] = v;
            }
            int i8 = i2 - i7;
            ffdo.n(t, objArr3, 0, i8, i2);
            ffdo.n(t, v, i6, i4, i8);
            objArr3 = v;
        }
        Iterator<E> it = collection.iterator();
        E(t, i4, it);
        for (int i9 = 1; i9 < i3; i9++) {
            Object[] v2 = v();
            E(v2, 0, it);
            objArr2[i9] = v2;
        }
        E(objArr3, 0, it);
    }

    private final boolean r(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.h;
    }

    private final Object[] s(Object[] objArr, int i, int i2, Object obj, hnu hnuVar) {
        Object obj2;
        int a = hod.a(i2, i);
        int i3 = a + 1;
        if (i == 0) {
            hnuVar.a = objArr[31];
            Object[] t = t(objArr);
            ffdo.n(objArr, t, i3, a, 31);
            t[a] = obj;
            return t;
        }
        Object[] t2 = t(objArr);
        int i4 = i - 5;
        Object obj3 = t2[a];
        obj3.getClass();
        t2[a] = s((Object[]) obj3, i4, i2, obj, hnuVar);
        while (i3 < 32 && (obj2 = t2[i3]) != null) {
            t2[i3] = s((Object[]) obj2, i4, 0, hnuVar.a, hnuVar);
            i3++;
        }
        return t2;
    }

    private final Object[] t(Object[] objArr) {
        if (objArr == null) {
            return v();
        }
        if (r(objArr)) {
            return objArr;
        }
        Object[] v = v();
        ffdo.w(objArr, v, 0, ffmk.g(objArr.length, 32), 6);
        return v;
    }

    private final Object[] u(Object[] objArr, int i) {
        int i2 = 32 - i;
        if (r(objArr)) {
            ffdo.n(objArr, objArr, i, 0, i2);
            return objArr;
        }
        Object[] v = v();
        ffdo.n(objArr, v, i, 0, i2);
        return v;
    }

    private final Object[] v() {
        Object[] objArr = new Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    private final Object[] w(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    private final Object[] x(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            hih.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int a = hod.a(i, i2);
        Object obj = objArr[a];
        obj.getClass();
        Object x = x((Object[]) obj, i, i2 - 5);
        if (a < 31) {
            int i3 = a + 1;
            if (objArr[i3] != null) {
                if (r(objArr)) {
                    ffdo.d(objArr, null, i3, 32);
                }
                Object[] v = v();
                ffdo.n(objArr, v, 0, 0, i3);
                objArr = v;
            }
        }
        if (x == objArr[a]) {
            return objArr;
        }
        Object[] t = t(objArr);
        t[a] = x;
        return t;
    }

    private final Object[] y(Object[] objArr, int i, int i2, hnu hnuVar) {
        Object[] y;
        int a = hod.a(i2 - 1, i);
        if (i == 5) {
            hnuVar.a = objArr[a];
            y = null;
        } else {
            Object obj = objArr[a];
            obj.getClass();
            y = y((Object[]) obj, i - 5, i2, hnuVar);
        }
        if (y == null && a == 0) {
            return null;
        }
        Object[] t = t(objArr);
        t[a] = y;
        return t;
    }

    private final Object[] z(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            hih.a("invalid buffersIterator");
        }
        if (i2 < 0) {
            hih.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] t = t(objArr);
        int a = hod.a(i, i2);
        int i3 = i2 - 5;
        t[a] = z((Object[]) t[a], i, i3, it);
        while (true) {
            a++;
            if (a >= 32 || !it.hasNext()) {
                break;
            }
            t[a] = z((Object[]) t[a], 0, i3, it);
        }
        return t;
    }

    @Override // defpackage.hnm
    public final hnn a() {
        hnn hnvVar;
        Object[] objArr = this.b;
        if (objArr == this.f && this.c == this.g) {
            hnvVar = this.e;
        } else {
            this.h = new hpl();
            this.f = objArr;
            Object[] objArr2 = this.c;
            this.g = objArr2;
            if (objArr != null) {
                hnvVar = new hnv(objArr, objArr2, this.d, this.a);
            } else if (objArr2.length == 0) {
                hnvVar = hob.a;
            } else {
                Object[] copyOf = Arrays.copyOf(this.c, this.d);
                copyOf.getClass();
                hnvVar = new hob(copyOf);
            }
        }
        this.e = hnvVar;
        return hnvVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        hpk.b(i, this.d);
        if (i == this.d) {
            add(obj);
            return;
        }
        this.modCount++;
        int i2 = i();
        if (i >= i2) {
            n(this.b, i - i2, obj);
            return;
        }
        hnu hnuVar = new hnu(null);
        Object[] objArr = this.b;
        objArr.getClass();
        n(s(objArr, this.a, i, obj, hnuVar), 0, hnuVar.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        hnx<E> hnxVar;
        Collection collection2;
        Object[] v;
        Object[][] objArr;
        hpk.b(i, this.d);
        if (i == this.d) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((this.d - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = (i + collection.size()) - 1;
            Object[] objArr2 = this.c;
            Object[] t = t(objArr2);
            ffdo.n(objArr2, t, (size2 & 31) + 1, i3, j());
            E(t, i3, collection.iterator());
            this.c = t;
            this.d += collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int j = j();
        int size3 = this.d + collection.size();
        if (i >= i()) {
            v = v();
            objArr = objArr3;
            hnxVar = this;
            collection2 = collection;
            hnxVar.q(collection2, i, this.c, j, objArr, size, v);
        } else {
            hnxVar = this;
            collection2 = collection;
            int F = F(size3);
            if (F > j) {
                int i4 = F - j;
                Object[] u = u(hnxVar.c, i4);
                hnxVar.m(collection2, i, i4, objArr3, size, u);
                objArr = objArr3;
                v = u;
            } else {
                Object[] objArr4 = hnxVar.c;
                v = v();
                int i5 = j - F;
                ffdo.n(objArr4, v, 0, i5, j);
                int i6 = 32 - i5;
                Object[] u2 = u(hnxVar.c, i6);
                int i7 = size - 1;
                objArr3[i7] = u2;
                hnxVar.m(collection2, i, i6, objArr3, i7, u2);
                collection2 = collection2;
                objArr = objArr3;
                hnxVar = hnxVar;
            }
        }
        hnxVar.b = A(hnxVar.b, i2, objArr);
        hnxVar.c = v;
        hnxVar.d += collection2.size();
        return true;
    }

    public final int b() {
        return this.modCount;
    }

    @Override // defpackage.ffdi
    public final int c() {
        return this.d;
    }

    @Override // defpackage.ffdi
    public final Object d(int i) {
        hpk.a(i, this.d);
        this.modCount++;
        int i2 = i();
        if (i >= i2) {
            return k(this.b, i2, this.a, i - i2);
        }
        hnu hnuVar = new hnu(this.c[0]);
        Object[] objArr = this.b;
        objArr.getClass();
        k(C(objArr, this.a, i, hnuVar), i2, this.a, 0);
        return hnuVar.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (h(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.ffji r16) {
        /*
            r15 = this;
            r1 = r16
            int r8 = r15.j()
            hnu r5 = new hnu
            r9 = 0
            r5.<init>(r9)
            java.lang.Object[] r0 = r15.b
            r10 = 1
            r11 = 0
            if (r0 != 0) goto L1b
            int r0 = r15.h(r1, r8, r5)
            if (r0 == r8) goto Ld5
        L18:
            r11 = r10
            goto Ld5
        L1b:
            java.util.ListIterator r12 = r15.l(r11)
            r13 = 32
            r0 = r13
        L22:
            if (r0 != r13) goto L36
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r15.g(r1, r0, r13, r5)
            goto L22
        L35:
            r0 = r13
        L36:
            if (r0 != r13) goto L4b
            int r0 = r15.h(r1, r8, r5)
            if (r0 != 0) goto L48
            java.lang.Object[] r0 = r15.b
            int r1 = r15.d
            int r2 = r15.a
            r15.o(r0, r1, r2)
            r0 = r11
        L48:
            if (r0 == r8) goto Ld5
            goto L18
        L4b:
            int r2 = r12.previousIndex()
            int r14 = r2 << 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r0
        L5c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r15
            int r4 = r0.f(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            goto L5c
        L73:
            java.lang.Object[] r2 = r15.c
            r0 = r15
            r1 = r16
            r3 = r8
            int r1 = r0.f(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.a
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            defpackage.ffdo.d(r2, r9, r1, r13)
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L93
            java.lang.Object[] r3 = r15.b
            r3.getClass()
            goto L9f
        L93:
            java.lang.Object[] r3 = r15.b
            int r4 = r15.a
            java.util.Iterator r5 = r7.iterator()
            java.lang.Object[] r3 = r15.z(r3, r14, r4, r5)
        L9f:
            int r4 = r7.size()
            int r4 = r4 << 5
            int r14 = r14 + r4
            r4 = r14 & 31
            if (r4 == 0) goto Laf
            java.lang.String r4 = "invalid size"
            defpackage.hih.a(r4)
        Laf:
            if (r14 != 0) goto Lb4
            r15.a = r11
            goto Lcc
        Lb4:
            int r4 = r14 + (-1)
        Lb6:
            int r5 = r15.a
            int r6 = r4 >> r5
            if (r6 != 0) goto Lc8
            int r5 = r5 + (-5)
            r15.a = r5
            r3 = r3[r11]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            goto Lb6
        Lc8:
            java.lang.Object[] r9 = r15.x(r3, r4, r5)
        Lcc:
            r15.b = r9
            r15.c = r2
            int r14 = r14 + r1
            r15.d = r14
            goto L18
        Ld5:
            if (r11 == 0) goto Ldc
            int r1 = r15.modCount
            int r1 = r1 + r10
            r15.modCount = r1
        Ldc:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnx.e(ffji):boolean");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        hpk.a(i, this.d);
        if (i() <= i) {
            objArr = this.c;
        } else {
            objArr = this.b;
            objArr.getClass();
            for (int i2 = this.a; i2 > 0; i2 -= 5) {
                Object obj = objArr[hod.a(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return e(new hnw(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        hpk.a(i, this.d);
        if (i() > i) {
            hnu hnuVar = new hnu(null);
            Object[] objArr = this.b;
            objArr.getClass();
            this.b = D(objArr, this.a, i, obj, hnuVar);
            return hnuVar.a;
        }
        Object[] t = t(this.c);
        if (t != this.c) {
            this.modCount++;
        }
        int i2 = i & 31;
        Object obj2 = t[i2];
        t[i2] = obj;
        this.c = t;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        hpk.b(i, this.d);
        return new hnz(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        this.modCount++;
        int j = j();
        if (j < 32) {
            Object[] t = t(this.c);
            t[j] = obj;
            this.c = t;
            this.d++;
        } else {
            p(this.b, this.c, w(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int j = j();
        Iterator<E> it = collection.iterator();
        if (32 - j >= collection.size()) {
            Object[] t = t(this.c);
            E(t, j, it);
            this.c = t;
            this.d += collection.size();
        } else {
            int size = ((collection.size() + j) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] t2 = t(this.c);
            E(t2, j, it);
            objArr[0] = t2;
            for (int i = 1; i < size; i++) {
                Object[] v = v();
                E(v, 0, it);
                objArr[i] = v;
            }
            this.b = A(this.b, i(), objArr);
            Object[] v2 = v();
            E(v2, 0, it);
            this.c = v2;
            this.d += collection.size();
        }
        return true;
    }
}

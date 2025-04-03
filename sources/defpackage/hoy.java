package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoy {
    public static final hoy a = new hoy(0, 0, new Object[0]);
    public Object[] b;
    private int c;
    private int d;
    private final hpl e;

    public hoy(int i, int i2, Object[] objArr, hpl hplVar) {
        this.c = i;
        this.d = i2;
        this.e = hplVar;
        this.b = objArr;
    }

    private final int n() {
        if (this.d == 0) {
            return this.b.length >> 1;
        }
        int bitCount = Integer.bitCount(this.c);
        int length = this.b.length;
        for (int i = bitCount + bitCount; i < length; i++) {
            bitCount += i(i).n();
        }
        return bitCount;
    }

    private final hoy o(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, hpl hplVar) {
        if (i3 > 30) {
            return new hoy(0, 0, new Object[]{obj, obj2, obj3, obj4}, hplVar);
        }
        int a2 = hpc.a(i, i3);
        int a3 = hpc.a(i2, i3);
        if (a2 == a3) {
            return new hoy(0, 1 << a2, new Object[]{o(i, obj, obj2, i2, obj3, obj4, i3 + 5, hplVar)}, hplVar);
        }
        Object[] objArr = new Object[4];
        if (a2 < a3) {
            objArr[0] = obj;
            objArr[1] = obj2;
            objArr[2] = obj3;
            objArr[3] = obj4;
        } else {
            objArr[0] = obj3;
            objArr[1] = obj4;
            objArr[2] = obj;
            objArr[3] = obj2;
        }
        return new hoy((1 << a2) | (1 << a3), 0, objArr, hplVar);
    }

    private final hoy p(int i, hoj hojVar) {
        hojVar.g(hojVar.b() - 1);
        hojVar.c = v(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != hojVar.a) {
            return new hoy(0, 0, hpc.c(objArr, i), hojVar.a);
        }
        this.b = hpc.c(objArr, i);
        return this;
    }

    private final hoy q(int i, int i2, hoj hojVar) {
        hojVar.g(hojVar.b() - 1);
        hojVar.c = v(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != hojVar.a) {
            return new hoy(i2 ^ this.c, this.d, hpc.c(objArr, i), hojVar.a);
        }
        this.b = hpc.c(objArr, i);
        this.c ^= i2;
        return this;
    }

    private final hoy r(hoy hoyVar, hoy hoyVar2, int i, int i2, hpl hplVar) {
        if (hoyVar2 != null) {
            return (this.e == hplVar || hoyVar != hoyVar2) ? s(i, hoyVar2, hplVar) : this;
        }
        Object[] objArr = this.b;
        if (objArr.length == 1) {
            return null;
        }
        if (this.e != hplVar) {
            return new hoy(this.c, i2 ^ this.d, hpc.d(objArr, i), hplVar);
        }
        this.b = hpc.d(objArr, i);
        this.d ^= i2;
        return this;
    }

    private final hoy s(int i, hoy hoyVar, hpl hplVar) {
        Object[] objArr = this.b;
        int length = objArr.length;
        if (length == 1) {
            if (hoyVar.b.length == 2 && hoyVar.d == 0) {
                hoyVar.c = this.d;
                return hoyVar;
            }
            length = 1;
        }
        if (this.e == hplVar) {
            objArr[i] = hoyVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, length);
        copyOf.getClass();
        copyOf[i] = hoyVar;
        return new hoy(this.c, this.d, copyOf, hplVar);
    }

    private final hoy t(int i, int i2, hoy hoyVar) {
        Object[] objArr = hoyVar.b;
        if (objArr.length != 2 || hoyVar.d != 0) {
            Object[] objArr2 = this.b;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf.getClass();
            copyOf[i] = hoyVar;
            return new hoy(this.c, this.d, copyOf);
        }
        if (this.b.length == 1) {
            hoyVar.c = this.d;
            return hoyVar;
        }
        int b = b(i2);
        Object[] objArr3 = this.b;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int length = objArr3.length;
        Object[] copyOf2 = Arrays.copyOf(objArr3, length + 1);
        copyOf2.getClass();
        ffdo.n(copyOf2, copyOf2, i + 2, i + 1, length);
        ffdo.n(copyOf2, copyOf2, b + 2, b, i);
        copyOf2[b] = obj;
        copyOf2[b + 1] = obj2;
        return new hoy(this.c ^ i2, i2 ^ this.d, copyOf2);
    }

    private final Object u(int i) {
        return this.b[i];
    }

    private final Object v(int i) {
        return this.b[i + 1];
    }

    private final boolean w(Object obj) {
        ffmh p = ffmk.p(ffmk.q(0, this.b.length), 2);
        int i = p.a;
        int i2 = p.b;
        int i3 = p.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!ffkj.e(obj, this.b[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean x(hoy hoyVar) {
        if (this == hoyVar) {
            return true;
        }
        if (this.d != hoyVar.d || this.c != hoyVar.c) {
            return false;
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            if (this.b[i] != hoyVar.b[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean y(int i) {
        return (i & this.d) != 0;
    }

    private final Object[] z(int i, int i2, int i3, Object obj, Object obj2, int i4, hpl hplVar) {
        Object u = u(i);
        hoy o = o(u != null ? u.hashCode() : 0, u, v(i), i3, obj, obj2, i4 + 5, hplVar);
        int c = c(i2);
        int i5 = c + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        ffdo.w(objArr, objArr2, 0, i, 6);
        ffdo.n(objArr, objArr2, i, i + 2, i5);
        objArr2[c - 1] = o;
        ffdo.n(objArr, objArr2, c, i5, length);
        return objArr2;
    }

    public final int a() {
        return Integer.bitCount(this.c);
    }

    public final int b(int i) {
        int bitCount = Integer.bitCount((i - 1) & this.c);
        return bitCount + bitCount;
    }

    public final int c(int i) {
        return (this.b.length - 1) - Integer.bitCount((i - 1) & this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        if (r13 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        r13.a = t(r11, r4, r13.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
    
        if (r13 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hox d(int r11, java.lang.Object r12, java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hoy.d(int, java.lang.Object, java.lang.Object, int):hox");
    }

    public final hoy e(int i, Object obj, Object obj2, int i2, hoj hojVar) {
        hoj hojVar2;
        hoy e;
        int a2 = 1 << hpc.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (!ffkj.e(obj, u(b))) {
                hojVar.g(hojVar.b() + 1);
                hpl hplVar = hojVar.a;
                if (this.e != hplVar) {
                    return new hoy(this.c ^ a2, this.d | a2, z(b, a2, i, obj, obj2, i2, hplVar), hplVar);
                }
                this.b = z(b, a2, i, obj, obj2, i2, hplVar);
                this.c ^= a2;
                this.d |= a2;
                return this;
            }
            hojVar.c = v(b);
            if (v(b) == obj2) {
                return this;
            }
            int i3 = b + 1;
            if (this.e == hojVar.a) {
                this.b[i3] = obj2;
                return this;
            }
            hojVar.d++;
            Object[] objArr = this.b;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf.getClass();
            copyOf[i3] = obj2;
            return new hoy(this.c, this.d, copyOf, hojVar.a);
        }
        if (!y(a2)) {
            hojVar.g(hojVar.b() + 1);
            hpl hplVar2 = hojVar.a;
            int b2 = b(a2);
            if (this.e != hplVar2) {
                return new hoy(this.c | a2, this.d, hpc.b(this.b, b2, obj, obj2), hplVar2);
            }
            this.b = hpc.b(this.b, b2, obj, obj2);
            this.c |= a2;
            return this;
        }
        int c = c(a2);
        hoy i4 = i(c);
        if (i2 == 30) {
            ffmh p = ffmk.p(ffmk.q(0, i4.b.length), 2);
            int i5 = p.a;
            int i6 = p.b;
            int i7 = p.c;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!ffkj.e(obj, i4.u(i5))) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                int i8 = i5 + 1;
                hojVar.c = i4.v(i5);
                if (i4.e == hojVar.a) {
                    i4.b[i8] = obj2;
                    hojVar2 = hojVar;
                    e = i4;
                } else {
                    hojVar.d++;
                    Object[] objArr2 = i4.b;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    copyOf2.getClass();
                    copyOf2[i8] = obj2;
                    e = new hoy(0, 0, copyOf2, hojVar.a);
                    hojVar2 = hojVar;
                }
            }
            hojVar.g(hojVar.b() + 1);
            e = new hoy(0, 0, hpc.b(i4.b, 0, obj, obj2), hojVar.a);
            hojVar2 = hojVar;
        } else {
            hojVar2 = hojVar;
            e = i4.e(i, obj, obj2, i2 + 5, hojVar2);
        }
        return i4 != e ? s(c, e, hojVar2.a) : this;
    }

    public final hoy f(hoy hoyVar, int i, hpi hpiVar, hoj hojVar) {
        hoy hoyVar2;
        hoj hojVar2;
        Object[] objArr;
        int i2;
        hoy o;
        int i3;
        int i4;
        hoj hojVar3 = hojVar;
        if (this == hoyVar) {
            hpiVar.a += n();
            return this;
        }
        int i5 = 0;
        if (i > 30) {
            hpl hplVar = hojVar3.a;
            Object[] objArr2 = this.b;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + hoyVar.b.length);
            copyOf.getClass();
            int length = this.b.length;
            ffmh p = ffmk.p(ffmk.q(0, hoyVar.b.length), 2);
            int i6 = p.a;
            int i7 = p.b;
            int i8 = p.c;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    if (w(hoyVar.b[i6])) {
                        hpiVar.a++;
                    } else {
                        Object[] objArr3 = hoyVar.b;
                        copyOf[length] = objArr3[i6];
                        copyOf[length + 1] = objArr3[i6 + 1];
                        length += 2;
                    }
                    if (i6 == i7) {
                        break;
                    }
                    i6 += i8;
                }
            }
            if (length != this.b.length) {
                if (length != hoyVar.b.length) {
                    if (length == copyOf.length) {
                        return new hoy(0, 0, copyOf, hplVar);
                    }
                    Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                    copyOf2.getClass();
                    return new hoy(0, 0, copyOf2, hplVar);
                }
            }
            return this;
        }
        int i9 = this.d | hoyVar.d;
        int i10 = this.c;
        int i11 = hoyVar.c;
        int i12 = i10 ^ i11;
        int i13 = i10 & i11;
        int i14 = (~i9) & i12;
        while (i13 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i13);
            if (ffkj.e(u(b(lowestOneBit)), hoyVar.u(hoyVar.b(lowestOneBit)))) {
                i14 |= lowestOneBit;
            } else {
                i9 |= lowestOneBit;
            }
            i13 ^= lowestOneBit;
        }
        if ((i9 & i14) != 0) {
            hih.b("Check failed.");
        }
        if (ffkj.e(this.e, hojVar3.a) && this.c == i14 && this.d == i9) {
            hoyVar2 = this;
        } else {
            int bitCount = Integer.bitCount(i14);
            hoyVar2 = new hoy(i14, i9, new Object[bitCount + bitCount + Integer.bitCount(i9)]);
        }
        int i15 = i9;
        int i16 = 0;
        while (i15 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i15);
            Object[] objArr4 = hoyVar2.b;
            int length2 = (objArr4.length - 1) - i16;
            if (y(lowestOneBit2)) {
                o = i(c(lowestOneBit2));
                if (hoyVar.y(lowestOneBit2)) {
                    o = o.f(hoyVar.i(hoyVar.c(lowestOneBit2)), i + 5, hpiVar, hojVar3);
                    hojVar2 = hojVar3;
                } else {
                    if (hoyVar.m(lowestOneBit2)) {
                        int i17 = i + 5;
                        int b = hoyVar.b(lowestOneBit2);
                        Object u = hoyVar.u(b);
                        Object v = hoyVar.v(b);
                        int b2 = hojVar3.b();
                        if (u != null) {
                            i3 = b2;
                            i4 = u.hashCode();
                        } else {
                            int i18 = i5;
                            i3 = b2;
                            i4 = i18;
                        }
                        o = o.e(i4, u, v, i17, hojVar3);
                        if (hojVar.b() == i3) {
                            hpiVar.a++;
                        }
                    }
                    hojVar2 = hojVar;
                }
            } else if (hoyVar.y(lowestOneBit2)) {
                o = hoyVar.i(hoyVar.c(lowestOneBit2));
                if (m(lowestOneBit2)) {
                    int i19 = i + 5;
                    int b3 = b(lowestOneBit2);
                    Object u2 = u(b3);
                    if (o.l(u2 != null ? u2.hashCode() : 0, u2, i19)) {
                        hpiVar.a++;
                    } else {
                        hojVar3 = hojVar;
                        o = o.e(u2 != null ? u2.hashCode() : 0, u2, v(b3), i19, hojVar3);
                        hojVar2 = hojVar3;
                    }
                }
                hojVar2 = hojVar;
            } else {
                hojVar2 = hojVar;
                int i20 = i + 5;
                int b4 = b(lowestOneBit2);
                Object u3 = u(b4);
                Object v2 = v(b4);
                int b5 = hoyVar.b(lowestOneBit2);
                Object u4 = hoyVar.u(b5);
                objArr = objArr4;
                i2 = lowestOneBit2;
                o = o(u3 != null ? u3.hashCode() : 0, u3, v2, u4 != null ? u4.hashCode() : 0, u4, hoyVar.v(b5), i20, hojVar2.a);
                objArr[length2] = o;
                i15 ^= i2;
                i16++;
                hojVar3 = hojVar2;
                i5 = 0;
            }
            i2 = lowestOneBit2;
            objArr = objArr4;
            objArr[length2] = o;
            i15 ^= i2;
            i16++;
            hojVar3 = hojVar2;
            i5 = 0;
        }
        int i21 = 0;
        while (i14 != 0) {
            int i22 = i21 + i21;
            int i23 = i22 + 1;
            int lowestOneBit3 = Integer.lowestOneBit(i14);
            if (hoyVar.m(lowestOneBit3)) {
                int b6 = hoyVar.b(lowestOneBit3);
                hoyVar2.b[i22] = hoyVar.u(b6);
                hoyVar2.b[i23] = hoyVar.v(b6);
                if (m(lowestOneBit3)) {
                    hpiVar.a++;
                }
            } else {
                int b7 = b(lowestOneBit3);
                hoyVar2.b[i22] = u(b7);
                hoyVar2.b[i23] = v(b7);
            }
            i14 ^= lowestOneBit3;
            i21++;
        }
        if (!x(hoyVar2)) {
            return hoyVar.x(hoyVar2) ? hoyVar : hoyVar2;
        }
        return this;
    }

    public final hoy g(int i, Object obj, int i2, hoj hojVar) {
        hoy g;
        hoy hoyVar;
        int a2 = 1 << hpc.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (ffkj.e(obj, u(b))) {
                return q(b, a2, hojVar);
            }
        } else if (y(a2)) {
            int c = c(a2);
            hoy i3 = i(c);
            if (i2 == 30) {
                ffmh p = ffmk.p(ffmk.q(0, i3.b.length), 2);
                int i4 = p.a;
                int i5 = p.b;
                int i6 = p.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!ffkj.e(obj, i3.u(i4))) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    g = i3.p(i4, hojVar);
                }
                hoyVar = i3;
                return r(i3, hoyVar, c, a2, hojVar.a);
            }
            g = i3.g(i, obj, i2 + 5, hojVar);
            hoyVar = g;
            return r(i3, hoyVar, c, a2, hojVar.a);
        }
        return this;
    }

    public final hoy h(int i, Object obj, Object obj2, int i2, hoj hojVar) {
        hoy hoyVar;
        int a2 = 1 << hpc.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (ffkj.e(obj, u(b)) && ffkj.e(obj2, v(b))) {
                return q(b, a2, hojVar);
            }
        } else if (y(a2)) {
            int c = c(a2);
            hoy i3 = i(c);
            if (i2 == 30) {
                ffmh p = ffmk.p(ffmk.q(0, i3.b.length), 2);
                int i4 = p.a;
                int i5 = p.b;
                int i6 = p.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!ffkj.e(obj, i3.u(i4)) || !ffkj.e(obj2, i3.v(i4))) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else {
                            hoy p2 = i3.p(i4, hojVar);
                            hoyVar = i3;
                            i3 = p2;
                            break;
                        }
                    }
                }
                hoyVar = i3;
            } else {
                hoyVar = i3;
                i3 = hoyVar.h(i, obj, obj2, i2 + 5, hojVar);
            }
            hoy hoyVar2 = i3;
            return r(hoyVar, hoyVar2, c, a2, hojVar.a);
        }
        return this;
    }

    public final hoy i(int i) {
        Object obj = this.b[i];
        obj.getClass();
        return (hoy) obj;
    }

    public final hoy j(int i, Object obj, int i2) {
        hoy j;
        int a2 = 1 << hpc.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (ffkj.e(obj, u(b))) {
                Object[] objArr = this.b;
                if (objArr.length == 2) {
                    return null;
                }
                return new hoy(this.c ^ a2, this.d, hpc.c(objArr, b));
            }
        } else if (y(a2)) {
            int c = c(a2);
            hoy i3 = i(c);
            if (i2 == 30) {
                ffmh p = ffmk.p(ffmk.q(0, i3.b.length), 2);
                int i4 = p.a;
                int i5 = p.b;
                int i6 = p.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!ffkj.e(obj, i3.u(i4))) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    Object[] objArr2 = i3.b;
                    j = objArr2.length == 2 ? null : new hoy(0, 0, hpc.c(objArr2, i4));
                }
                j = i3;
                break;
            }
            j = i3.j(i, obj, i2 + 5);
            if (j == null) {
                Object[] objArr3 = this.b;
                if (objArr3.length == 1) {
                    return null;
                }
                return new hoy(this.c, a2 ^ this.d, hpc.d(objArr3, c));
            }
            if (i3 != j) {
                return t(c, a2, j);
            }
        }
        return this;
    }

    public final Object k(int i, Object obj, int i2) {
        int a2 = 1 << hpc.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (ffkj.e(obj, u(b))) {
                return v(b);
            }
            return null;
        }
        if (!y(a2)) {
            return null;
        }
        hoy i3 = i(c(a2));
        if (i2 != 30) {
            return i3.k(i, obj, i2 + 5);
        }
        ffmh p = ffmk.p(ffmk.q(0, i3.b.length), 2);
        int i4 = p.a;
        int i5 = p.b;
        int i6 = p.c;
        if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
            while (!ffkj.e(obj, i3.u(i4))) {
                if (i4 != i5) {
                    i4 += i6;
                }
            }
            return i3.v(i4);
        }
        return null;
    }

    public final boolean l(int i, Object obj, int i2) {
        int a2 = 1 << hpc.a(i, i2);
        if (m(a2)) {
            return ffkj.e(obj, u(b(a2)));
        }
        if (!y(a2)) {
            return false;
        }
        hoy i3 = i(c(a2));
        return i2 == 30 ? i3.w(obj) : i3.l(i, obj, i2 + 5);
    }

    public final boolean m(int i) {
        return (i & this.c) != 0;
    }

    public hoy(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }
}

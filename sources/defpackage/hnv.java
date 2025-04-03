package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnv extends hns implements List, hnn {
    private final Object[] a;
    private final Object[] b;
    private final int c;
    private final int d;

    public hnv(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (i <= 32) {
            hih.a("Trie-based persistent vector should have at least 33 elements, got " + i);
        }
        int length = objArr2.length;
    }

    private final int l() {
        return hod.b(this.c);
    }

    private final hnn m(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        if (i4 != 1) {
            Object[] copyOf = Arrays.copyOf(this.b, 32);
            copyOf.getClass();
            int i5 = i4 - 1;
            if (i3 < i5) {
                ffdo.n(this.b, copyOf, i3, i3 + 1, i4);
            }
            copyOf[i5] = null;
            return new hnv(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                objArr.getClass();
            }
            return new hob(objArr);
        }
        hnu hnuVar = new hnu(null);
        Object[] q = q(objArr, i2, i - 1, hnuVar);
        q.getClass();
        Object obj = hnuVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        if (q[1] != null) {
            return new hnv(q, objArr2, i, i2);
        }
        Object obj2 = q[0];
        obj2.getClass();
        return new hnv((Object[]) obj2, objArr2, i, i2 - 5);
    }

    private final hnv n(Object[] objArr, int i, Object obj) {
        int l = this.c - l();
        Object[] copyOf = Arrays.copyOf(this.b, 32);
        copyOf.getClass();
        int i2 = i + 1;
        if (l < 32) {
            ffdo.n(this.b, copyOf, i2, i, l);
            copyOf[i] = obj;
            return new hnv(objArr, copyOf, this.c + 1, this.d);
        }
        Object[] objArr2 = this.b;
        Object obj2 = objArr2[31];
        ffdo.n(objArr2, copyOf, i2, i, l - 1);
        copyOf[i] = obj;
        return o(objArr, copyOf, hod.c(obj2));
    }

    private final hnv o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = this.d;
        if ((i >> 5) <= (1 << i2)) {
            return new hnv(r(objArr, i2, objArr2), objArr3, this.c + 1, this.d);
        }
        Object[] c = hod.c(objArr);
        int i3 = this.d + 5;
        return new hnv(r(c, i3, objArr2), objArr3, this.c + 1, i3);
    }

    private final Object[] p(Object[] objArr, int i, int i2, Object obj, hnu hnuVar) {
        Object[] copyOf;
        int a = hod.a(i2, i);
        if (i == 0) {
            if (a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                copyOf.getClass();
            }
            ffdo.n(objArr, copyOf, a + 1, a, 31);
            hnuVar.a = objArr[31];
            copyOf[a] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        copyOf2.getClass();
        int i3 = i - 5;
        Object obj2 = objArr[a];
        obj2.getClass();
        copyOf2[a] = p((Object[]) obj2, i3, i2, obj, hnuVar);
        while (true) {
            a++;
            if (a >= 32 || copyOf2[a] == null) {
                break;
            }
            Object obj3 = objArr[a];
            obj3.getClass();
            copyOf2[a] = p((Object[]) obj3, i3, 0, hnuVar.a, hnuVar);
        }
        return copyOf2;
    }

    private final Object[] q(Object[] objArr, int i, int i2, hnu hnuVar) {
        Object[] q;
        int a = hod.a(i2, i);
        if (i == 5) {
            hnuVar.a = objArr[a];
            q = null;
        } else {
            Object obj = objArr[a];
            obj.getClass();
            q = q((Object[]) obj, i - 5, i2, hnuVar);
        }
        if (q == null && a == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf.getClass();
        copyOf[a] = q;
        return copyOf;
    }

    private final Object[] r(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArr3;
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            objArr3.getClass();
        } else {
            objArr3 = new Object[32];
        }
        int a = hod.a(this.c - 1, i);
        if (i == 5) {
            objArr3[a] = objArr2;
            return objArr3;
        }
        objArr3[a] = r((Object[]) objArr3[a], i - 5, objArr2);
        return objArr3;
    }

    private final Object[] s(Object[] objArr, int i, int i2, hnu hnuVar) {
        Object[] copyOf;
        int a = hod.a(i2, i);
        if (i == 0) {
            if (a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                copyOf.getClass();
            }
            ffdo.n(objArr, copyOf, a, a + 1, 32);
            copyOf[31] = hnuVar.a;
            hnuVar.a = objArr[a];
            return copyOf;
        }
        int a2 = objArr[31] == null ? hod.a(l() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        copyOf2.getClass();
        int i3 = i - 5;
        int i4 = a + 1;
        if (i4 <= a2) {
            while (true) {
                Object obj = copyOf2[a2];
                obj.getClass();
                copyOf2[a2] = s((Object[]) obj, i3, 0, hnuVar);
                if (a2 == i4) {
                    break;
                }
                a2--;
            }
        }
        Object obj2 = copyOf2[a];
        obj2.getClass();
        copyOf2[a] = s((Object[]) obj2, i3, i2, hnuVar);
        return copyOf2;
    }

    private final Object[] t(Object[] objArr, int i, int i2, Object obj) {
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf.getClass();
        int a = hod.a(i2, i);
        if (i == 0) {
            copyOf[a] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[a];
        obj2.getClass();
        copyOf[a] = t((Object[]) obj2, i - 5, i2, obj);
        return copyOf;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.c;
    }

    @Override // defpackage.hnn
    public final hnn c(Object obj) {
        int l = this.c - l();
        if (l >= 32) {
            return o(this.a, this.b, hod.c(obj));
        }
        Object[] copyOf = Arrays.copyOf(this.b, 32);
        copyOf.getClass();
        copyOf[l] = obj;
        return new hnv(this.a, copyOf, this.c + 1, this.d);
    }

    @Override // defpackage.hnn
    public final hnn d(int i, Object obj) {
        hpk.b(i, this.c);
        if (i == this.c) {
            return c(obj);
        }
        int l = l();
        if (i >= l) {
            return n(this.a, i - l, obj);
        }
        hnu hnuVar = new hnu(null);
        return n(p(this.a, this.d, i, obj, hnuVar), 0, hnuVar.a);
    }

    @Override // defpackage.ffde, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        hpk.a(i, this.c);
        if (l() <= i) {
            objArr = this.b;
        } else {
            objArr = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object obj = objArr[hod.a(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // defpackage.hnn
    public final hnn h(ffji ffjiVar) {
        hnx b = b();
        b.e(ffjiVar);
        return b.a();
    }

    @Override // defpackage.hnn
    public final hnn i(int i) {
        hpk.a(i, this.c);
        int l = l();
        return i >= l ? m(this.a, l, this.d, i - l) : m(s(this.a, this.d, i, new hnu(this.b[0])), l, this.d, 0);
    }

    @Override // defpackage.hnn
    public final hnn j(int i, Object obj) {
        hpk.a(i, this.c);
        if (l() > i) {
            return new hnv(t(this.a, this.d, i, obj), this.b, this.c, this.d);
        }
        Object[] copyOf = Arrays.copyOf(this.b, 32);
        copyOf.getClass();
        copyOf[i & 31] = obj;
        return new hnv(this.a, copyOf, this.c, this.d);
    }

    @Override // defpackage.hnn
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final hnx b() {
        return new hnx(this, this.a, this.b, this.d);
    }

    @Override // defpackage.ffde, java.util.List
    public final ListIterator listIterator(int i) {
        hpk.b(i, this.c);
        return new hny(this.a, this.b, i, this.c, (this.d / 5) + 1);
    }
}

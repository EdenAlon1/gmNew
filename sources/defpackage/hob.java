package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hob extends hns implements List, hnk {
    public static final hob a = new hob(new Object[0]);
    private final Object[] b;

    public hob(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.hnn
    public final hnm b() {
        return new hnx(this, null, this.b, 0);
    }

    @Override // defpackage.hnn
    public final hnn c(Object obj) {
        if (a() >= 32) {
            return new hnv(this.b, hod.c(obj), a() + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(this.b, a() + 1);
        copyOf.getClass();
        copyOf[a()] = obj;
        return new hob(copyOf);
    }

    @Override // defpackage.hnn
    public final hnn d(int i, Object obj) {
        hpk.b(i, a());
        if (i == a()) {
            return c(obj);
        }
        int i2 = i + 1;
        if (a() < 32) {
            Object[] objArr = new Object[a() + 1];
            ffdo.w(this.b, objArr, 0, i, 6);
            ffdo.n(this.b, objArr, i2, i, a());
            objArr[i] = obj;
            return new hob(objArr);
        }
        Object[] objArr2 = this.b;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        copyOf.getClass();
        ffdo.n(this.b, copyOf, i2, i, a() - 1);
        copyOf[i] = obj;
        return new hnv(copyOf, hod.c(this.b[31]), a() + 1, 0);
    }

    @Override // defpackage.hns, defpackage.hnn
    public final hnn e(Collection collection) {
        if (a() + collection.size() > 32) {
            hnm b = b();
            b.addAll(collection);
            return b.a();
        }
        Object[] copyOf = Arrays.copyOf(this.b, a() + collection.size());
        copyOf.getClass();
        int a2 = a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[a2] = it.next();
            a2++;
        }
        return new hob(copyOf);
    }

    @Override // defpackage.ffde, java.util.List
    public final Object get(int i) {
        hpk.a(i, a());
        return this.b[i];
    }

    @Override // defpackage.hnn
    public final hnn h(ffji ffjiVar) {
        Object[] objArr = this.b;
        int a2 = a();
        int a3 = a();
        boolean z = false;
        for (int i = 0; i < a3; i++) {
            Object obj = this.b[i];
            if (((Boolean) ffjiVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.b;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    objArr.getClass();
                    z = true;
                    a2 = i;
                }
            } else if (z) {
                objArr[a2] = obj;
                a2++;
            }
        }
        return a2 == a() ? this : a2 == 0 ? a : new hob(ffdo.g(objArr, 0, a2));
    }

    @Override // defpackage.hnn
    public final hnn i(int i) {
        hpk.a(i, a());
        if (a() == 1) {
            return a;
        }
        Object[] copyOf = Arrays.copyOf(this.b, a() - 1);
        copyOf.getClass();
        ffdo.n(this.b, copyOf, i, i + 1, a());
        return new hob(copyOf);
    }

    @Override // defpackage.ffde, java.util.List
    public final int indexOf(Object obj) {
        return ffdo.D(this.b, obj);
    }

    @Override // defpackage.hnn
    public final hnn j(int i, Object obj) {
        hpk.a(i, a());
        Object[] objArr = this.b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf.getClass();
        copyOf[i] = obj;
        return new hob(copyOf);
    }

    @Override // defpackage.ffde, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (ffkj.e(obj, objArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    @Override // defpackage.ffde, java.util.List
    public final ListIterator listIterator(int i) {
        hpk.b(i, a());
        return new hnt(this.b, i, a());
    }
}

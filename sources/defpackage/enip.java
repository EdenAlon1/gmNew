package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enip<E> extends engi<E> implements Set<E>, j$.util.Set<E> {
    private static final long serialVersionUID = 912559;
    private transient engw a;

    static int d(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            emxf.b(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static enin i(int i) {
        endr.c(i, "expectedSize");
        return new enin(i);
    }

    public static enip j(int i, Object... objArr) {
        if (i == 0) {
            return enpd.a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new enpx(obj);
        }
        int d = d(i);
        Object[] objArr2 = new Object[d];
        int i2 = d - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            enoh.e(obj2, i5);
            int hashCode = obj2.hashCode();
            int a = engc.a(hashCode);
            while (true) {
                int i6 = a & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    a++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new enpx(obj4);
        }
        if (d(i4) < d / 2) {
            return j(i4, objArr);
        }
        if (w(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new enpd(objArr, i3, objArr2, i2, i4);
    }

    public static enip n(Iterable iterable) {
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return enpd.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new enpx(next);
        }
        enin eninVar = new enin();
        eninVar.c(next);
        it.getClass();
        while (it.hasNext()) {
            eninVar.c(it.next());
        }
        return eninVar.g();
    }

    public static enip o(Collection collection) {
        if ((collection instanceof enip) && !(collection instanceof SortedSet)) {
            enip enipVar = (enip) collection;
            if (!enipVar.l()) {
                return enipVar;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public static enip p(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? j(length, (Object[]) objArr.clone()) : new enpx(objArr[0]) : enpd.a;
    }

    public static enip q() {
        return enpd.a;
    }

    public static enip r(Object obj, Object obj2) {
        return j(2, obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static enip s(Object obj, Object obj2, Object obj3) {
        return j(3, obj, obj2, obj3);
    }

    public static enip t(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(4, obj, obj2, obj3, obj4);
    }

    public static enip u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return j(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static enip v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        emxf.b(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return j(i, objArr2);
    }

    public static boolean w(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean b() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof enip) && b() && ((enip) obj).b() && hashCode() != obj.hashCode()) {
            return false;
        }
        return enpw.l(this, obj);
    }

    @Override // defpackage.engi
    public engw g() {
        engw engwVar = this.a;
        if (engwVar != null) {
            return engwVar;
        }
        engw h = h();
        this.a = h;
        return h;
    }

    public engw h() {
        return engw.h(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return enpw.a(this);
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract enqu listIterator();

    @Override // defpackage.engi
    public Object writeReplace() {
        return new enio(toArray());
    }
}

package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class engw<E> extends engi<E> implements List<E>, RandomAccess, j$.util.List<E> {
    private static final enqv a = new engs(enou.a, 0);
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = -889275714;

    public static engw A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public static engw B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @SafeVarargs
    public static engw C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        emxf.b(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return H(objArr2);
    }

    public static engw D(Iterable iterable) {
        Comparable[] comparableArr = (Comparable[]) enjk.t(iterable, new Comparable[0]);
        enoh.f(comparableArr);
        Arrays.sort(comparableArr);
        return h(comparableArr);
    }

    public static engw E(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] r = enjk.r(iterable);
        enoh.f(r);
        Arrays.sort(r, comparator);
        return h(r);
    }

    private static engw H(Object... objArr) {
        enoh.f(objArr);
        return h(objArr);
    }

    public static engr d(int i) {
        endr.c(i, "expectedSize");
        return new engr(i);
    }

    static engw h(Object[] objArr) {
        return i(objArr, objArr.length);
    }

    static engw i(Object[] objArr, int i) {
        return i == 0 ? enou.a : new enou(objArr, i);
    }

    public static engw j(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? n((Collection) iterable) : o(iterable.iterator());
    }

    public static engw n(Collection collection) {
        if (!(collection instanceof engi)) {
            return H(collection.toArray());
        }
        engw g = ((engi) collection).g();
        return g.l() ? h(g.toArray()) : g;
    }

    public static engw o(Iterator it) {
        if (!it.hasNext()) {
            return enou.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        engr engrVar = new engr();
        engrVar.h(next);
        engrVar.k(it);
        return engrVar.g();
    }

    public static engw p(Object[] objArr) {
        return objArr.length == 0 ? enou.a : H((Object[]) objArr.clone());
    }

    public static engw q() {
        return enou.a;
    }

    public static engw r(Object obj) {
        return H(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static engw s(Object obj, Object obj2) {
        return H(obj, obj2);
    }

    public static engw t(Object obj, Object obj2, Object obj3) {
        return H(obj, obj2, obj3);
    }

    public static engw u(Object obj, Object obj2, Object obj3, Object obj4) {
        return H(obj, obj2, obj3, obj4);
    }

    public static engw v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return H(obj, obj2, obj3, obj4, obj5);
    }

    public static engw w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return H(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static engw x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static engw y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static engw z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // java.util.List
    /* renamed from: F, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final enqv listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final enqv listIterator(int i) {
        emxf.x(i, size());
        return isEmpty() ? a : new engs(this, i);
    }

    public engw a() {
        return size() <= 1 ? this : new engt(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public engw subList(int i, int i2) {
        emxf.k(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? enou.a : new engv(this, i, i3);
    }

    @Override // defpackage.engi
    public int c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return enkr.h(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.engi
    /* renamed from: k */
    public final enqu listIterator() {
        return iterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // defpackage.engi
    public Object writeReplace() {
        return new engu(toArray());
    }

    @Override // defpackage.engi
    @Deprecated
    public final engw g() {
        return this;
    }
}

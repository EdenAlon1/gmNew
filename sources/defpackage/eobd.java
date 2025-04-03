package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eobd extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 1;
    private Object[] a;
    private int b;

    public eobd(int i) {
        this.a = new Object[Math.max(1, i)];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            this.a = Arrays.copyOf(objArr, i + i);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr2[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }
}

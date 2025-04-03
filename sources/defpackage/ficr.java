package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ficr implements Iterator {
    private final Object[] a;
    private int b = 0;

    public ficr(Object[] objArr) {
        this.a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr = this.a;
        int i = this.b;
        if (i == objArr.length) {
            throw new NoSuchElementException(a.h(i, "Out of elements: "));
        }
        this.b = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}

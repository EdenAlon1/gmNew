package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hph implements Iterator, fflg {
    private Object a;
    private final Map b;
    private int c;

    public hph(Object obj, Map map) {
        this.a = obj;
        this.b = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.a;
        this.c++;
        Object obj2 = this.b.get(obj);
        if (obj2 == null) {
            throw new ConcurrentModificationException(a.i(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.a = ((hpf) obj2).b;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

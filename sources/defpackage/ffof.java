package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffof implements Iterator, fflg {
    private int a;
    private final Iterator b;

    public ffof(ffog ffogVar) {
        this.a = ffogVar.b;
        this.b = ffogVar.a.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 && this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        this.a = i - 1;
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

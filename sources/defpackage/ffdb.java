package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffdb implements Iterator, fflg {
    public int a;
    final /* synthetic */ ffde b;

    public ffdb(ffde ffdeVar) {
        this.b = ffdeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ffde ffdeVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return ffdeVar.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

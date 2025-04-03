package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfuw implements Iterator {
    protected final dfuv a;
    protected int b = -1;

    public dfuw(dfuv dfuvVar) {
        this.a = dfuvVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c() + (-1);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            dfuv dfuvVar = this.a;
            int i = this.b + 1;
            this.b = i;
            return dfuvVar.d(i);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

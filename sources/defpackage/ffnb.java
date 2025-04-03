package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffnb implements Iterator, fflg {
    private final Iterator a;
    private int b;

    public ffnb(ffnc ffncVar) {
        this.a = ffncVar.a.a();
        this.b = ffncVar.b;
    }

    private final void a() {
        while (this.b > 0 && this.a.hasNext()) {
            this.a.next();
            this.b--;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

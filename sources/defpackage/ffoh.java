package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffoh implements Iterator, fflg {
    final /* synthetic */ ffoi a;
    private final Iterator b;
    private int c = -1;
    private Object d;

    public ffoh(ffoi ffoiVar) {
        this.a = ffoiVar;
        this.b = ffoiVar.a.a();
    }

    private final void a() {
        if (this.b.hasNext()) {
            Iterator it = this.b;
            ffji ffjiVar = this.a.b;
            Object next = it.next();
            if (((Boolean) ffjiVar.invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c == -1) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c == -1) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.d;
        this.d = null;
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

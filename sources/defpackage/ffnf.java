package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffnf implements Iterator, fflg {
    final /* synthetic */ ffng a;
    private final Iterator b;
    private int c = -1;
    private Object d;

    public ffnf(ffng ffngVar) {
        this.a = ffngVar;
        this.b = ffngVar.a.a();
    }

    private final void a() {
        int i;
        while (true) {
            if (!this.b.hasNext()) {
                i = 0;
                break;
            }
            Iterator it = this.b;
            ffji ffjiVar = this.a.c;
            Object next = it.next();
            if (((Boolean) ffjiVar.invoke(next)).booleanValue() == this.a.b) {
                this.d = next;
                i = 1;
                break;
            }
        }
        this.c = i;
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

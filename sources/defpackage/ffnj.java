package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffnj implements Iterator, fflg {
    final /* synthetic */ ffnk a;
    private Object b;
    private int c = -2;

    public ffnj(ffnk ffnkVar) {
        this.a = ffnkVar;
    }

    private final void a() {
        Object invoke;
        if (this.c == -2) {
            invoke = this.a.a.invoke();
        } else {
            ffnk ffnkVar = this.a;
            Object obj = this.b;
            obj.getClass();
            invoke = ffnkVar.b.invoke(obj);
        }
        this.b = invoke;
        this.c = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.b;
        obj.getClass();
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

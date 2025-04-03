package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class encg implements Iterator {
    int b;
    int c = -1;
    int d;
    final /* synthetic */ ench e;

    public encg(ench enchVar) {
        this.e = enchVar;
        this.b = enchVar.a.a();
        this.d = enchVar.a.d;
    }

    private final void b() {
        if (this.e.a.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a = a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.e.a.e(i);
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        endr.b(this.c != -1);
        this.e.b -= r0.a.g(this.c);
        this.b--;
        this.c = -1;
        this.d = this.e.a.d;
    }
}

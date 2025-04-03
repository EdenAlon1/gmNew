package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class endz implements Iterator {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ ened e;

    public endz(ened enedVar) {
        this.e = enedVar;
        this.b = enedVar.e;
        this.c = enedVar.c();
    }

    private final void b() {
        if (this.e.e != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.c;
        this.d = i;
        Object a = a(i);
        this.c = this.e.d(this.c);
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        endr.b(this.d >= 0);
        this.b += 32;
        int i = this.d;
        ened enedVar = this.e;
        enedVar.remove(enedVar.g(i));
        this.c = this.e.a(this.c, this.d);
        this.d = -1;
    }
}

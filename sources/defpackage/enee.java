package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enee implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ enef d;

    public enee(enef enefVar) {
        this.d = enefVar;
        this.a = enefVar.b;
        this.b = enefVar.a();
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        Object c = this.d.c(i);
        this.b = this.d.b(this.b);
        return c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        endr.b(this.c >= 0);
        this.a += 32;
        int i = this.c;
        enef enefVar = this.d;
        enefVar.remove(enefVar.c(i));
        this.b--;
        this.c = -1;
    }
}

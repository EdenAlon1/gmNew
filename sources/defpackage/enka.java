package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enka implements Iterator {
    final Set a;
    enkc b;
    enkc c;
    int d;
    final /* synthetic */ enkf e;

    public enka(enkf enkfVar) {
        this.e = enkfVar;
        this.a = enpw.g(enkfVar.x().size());
        this.b = enkfVar.a;
        this.d = enkfVar.e;
    }

    private final void a() {
        if (this.e.e != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        enkc enkcVar;
        a();
        enkc enkcVar2 = this.b;
        if (enkcVar2 == null) {
            throw new NoSuchElementException();
        }
        this.c = enkcVar2;
        this.a.add(enkcVar2.a);
        do {
            enkcVar = this.b.c;
            this.b = enkcVar;
            if (enkcVar == null) {
                break;
            }
        } while (!this.a.add(enkcVar.a));
        return this.c.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        emxf.m(this.c != null, "no calls to next() since the last call to remove()");
        this.e.e(this.c.a);
        this.c = null;
        this.d = this.e.e;
    }
}

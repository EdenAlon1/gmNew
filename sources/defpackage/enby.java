package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enby implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ enbz c;

    public enby(enbz enbzVar, Iterator it) {
        this.c = enbzVar;
        this.b = enbzVar.b;
        this.a = it;
    }

    final void a() {
        this.c.b();
        if (this.c.b != this.b) {
            throw new ConcurrentModificationException();
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
        this.a.remove();
        enbz enbzVar = this.c;
        encd encdVar = enbzVar.e;
        encdVar.b--;
        enbzVar.c();
    }

    public enby(enbz enbzVar) {
        this.c = enbzVar;
        this.b = enbzVar.b;
        Collection collection = enbzVar.b;
        this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}

package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enoc implements Iterator {
    private final enny a;
    private final Iterator b;
    private ennx c;
    private int d;
    private int e;
    private boolean f;

    public enoc(enny ennyVar, Iterator it) {
        this.a = ennyVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        if (i == 0) {
            ennx ennxVar = (ennx) this.b.next();
            this.c = ennxVar;
            i = ennxVar.a();
            this.e = i;
        }
        this.d = i - 1;
        this.f = true;
        ennx ennxVar2 = this.c;
        ennxVar2.getClass();
        return ennxVar2.b();
    }

    @Override // java.util.Iterator
    public final void remove() {
        endr.b(this.f);
        if (this.e == 1) {
            this.b.remove();
        } else {
            enny ennyVar = this.a;
            ennx ennxVar = this.c;
            ennxVar.getClass();
            ennyVar.remove(ennxVar.b());
        }
        this.e--;
        this.f = false;
    }
}

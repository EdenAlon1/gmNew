package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class con implements Iterator, fflg {
    public int a = -1;
    final /* synthetic */ coo b;
    private final Iterator c;

    public con(coo cooVar) {
        this.b = cooVar;
        this.c = ffno.a(new com(cooVar, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        if (i != -1) {
            this.b.a.c(i);
            this.a = -1;
        }
    }
}

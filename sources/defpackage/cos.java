package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cos implements Iterator, fflg {
    public int a = -1;
    final /* synthetic */ cot b;
    private final Iterator c;

    public cos(cot cotVar) {
        this.b = cotVar;
        this.c = ffno.a(new cor(cotVar, this, null));
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
            this.b.a.f(i);
            this.a = -1;
        }
    }
}

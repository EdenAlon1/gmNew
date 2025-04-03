package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kus implements Iterator, fflg {
    private final ffji a;
    private final List b = new ArrayList();
    private Iterator c;

    public kus(Iterator it, ffji ffjiVar) {
        this.a = ffjiVar;
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.c.next();
        ?? invoke = this.a.invoke(next);
        if (invoke != 0 && invoke.hasNext()) {
            this.b.add(this.c);
            this.c = invoke;
            return next;
        }
        while (!this.c.hasNext() && !this.b.isEmpty()) {
            this.c = (Iterator) ffdx.P(this.b);
            ffdx.s(this.b);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

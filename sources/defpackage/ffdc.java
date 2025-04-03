package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffdc extends ffdb implements ListIterator, fflg {
    final /* synthetic */ ffde c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffdc(ffde ffdeVar, int i) {
        super(ffdeVar);
        this.c = ffdeVar;
        ffda.c(i, ffdeVar.a());
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        ffde ffdeVar = this.c;
        int i = this.a - 1;
        this.a = i;
        return ffdeVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

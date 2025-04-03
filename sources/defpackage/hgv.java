package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgv implements Iterator, fflg {
    private final hjr a;
    private final int b;
    private int c;
    private final int d;

    public hgv(hjr hjrVar, int i, int i2) {
        this.a = hjrVar;
        this.b = i2;
        this.c = i;
        this.d = hjrVar.g;
        if (hjrVar.f) {
            hjt.g();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.a.g != this.d) {
            hjt.g();
        }
        int i = this.c;
        this.c = hjt.a(this.a.a, i) + i;
        return new hjs(this.a, i, this.d);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

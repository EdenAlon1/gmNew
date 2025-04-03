package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enug implements Iterator {
    final /* synthetic */ enuh a;
    private final ensn b;
    private int c;
    private int d;

    public enug(enuh enuhVar, ensn ensnVar, int i) {
        this.a = enuhVar;
        this.b = ensnVar;
        int i2 = i & 31;
        this.c = i2;
        this.d = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c = this.b.c(this.a.f(this.c));
        int i = this.d;
        if (i == 0) {
            this.c = -1;
            return c;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
        this.d >>>= numberOfTrailingZeros;
        this.c += numberOfTrailingZeros;
        return c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enff extends enfm implements Iterator {
    protected enff() {
    }

    protected abstract Iterator b();

    @Override // defpackage.enfm
    protected /* bridge */ /* synthetic */ Object hC() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return b().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        b().remove();
    }
}

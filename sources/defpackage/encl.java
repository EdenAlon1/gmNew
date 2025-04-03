package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class encl extends AbstractCollection {
    final /* synthetic */ encm a;

    public encl(encm encmVar) {
        this.a = encmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.z(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.i();
    }
}

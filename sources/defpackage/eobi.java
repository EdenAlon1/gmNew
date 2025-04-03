package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eobi extends AbstractSet {
    final /* synthetic */ eobj a;

    public eobi(eobj eobjVar) {
        this.a = eobjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof eobs)) {
            return false;
        }
        eobs eobsVar = (eobs) obj;
        eobsVar.c();
        return this.a.d().contains(eobsVar.a) && this.a.e(eobsVar.a).contains(eobsVar.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new eobt(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ermn.g(this.a.a());
    }
}

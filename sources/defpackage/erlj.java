package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erlj<K, V> extends enfd<Collection<V>> {
    final Collection a;
    final Set b;

    public erlj(Collection collection, Set set) {
        this.a = collection;
        this.b = set;
    }

    @Override // defpackage.enfd
    /* renamed from: b */
    protected final Collection hC() {
        return this.a;
    }

    @Override // defpackage.enfd, java.util.Collection
    public final boolean contains(Object obj) {
        return d(obj);
    }

    @Override // defpackage.enfd, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return endu.a(this, collection);
    }

    @Override // defpackage.enfd, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.a;
    }

    @Override // defpackage.enfd, java.util.Collection, java.lang.Iterable
    public final Iterator<Collection<V>> iterator() {
        return new erli(this.b.iterator());
    }

    @Override // defpackage.enfd, java.util.Collection
    public final boolean remove(Object obj) {
        Iterator<Collection<V>> it = iterator();
        while (it.hasNext()) {
            if (emxb.a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.enfd, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return enju.n(iterator(), collection);
    }

    @Override // defpackage.enfd, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return enju.o(iterator(), collection);
    }

    @Override // defpackage.enfd, java.util.Collection
    public final Object[] toArray() {
        return e();
    }

    @Override // defpackage.enfd, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return enoh.d(this, objArr);
    }
}

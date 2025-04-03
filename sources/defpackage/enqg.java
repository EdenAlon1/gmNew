package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enqg<K, V> extends enqp<Map.Entry<K, Collection<V>>> {
    private static final long serialVersionUID = 0;

    public enqg(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.enqj, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.g) {
            contains = !(obj instanceof Map.Entry) ? false : a().contains(ennc.k((Map.Entry) obj));
        }
        return contains;
    }

    @Override // defpackage.enqj, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        boolean a;
        synchronized (this.g) {
            a = endu.a(a(), collection);
        }
        return a;
    }

    @Override // defpackage.enqp, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean l;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            l = enpw.l(a(), obj);
        }
        return l;
    }

    @Override // defpackage.enqj, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new enqf(this, super.iterator());
    }

    @Override // defpackage.enqj, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.g) {
            remove = !(obj instanceof Map.Entry) ? false : a().remove(ennc.k((Map.Entry) obj));
        }
        return remove;
    }

    @Override // defpackage.enqj, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean n;
        synchronized (this.g) {
            n = enju.n(a().iterator(), collection);
        }
        return n;
    }

    @Override // defpackage.enqj, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean o;
        synchronized (this.g) {
            o = enju.o(a().iterator(), collection);
        }
        return o;
    }

    @Override // defpackage.enqj, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr;
        synchronized (this.g) {
            Set a = a();
            objArr = new Object[a.size()];
            enoh.h(a, objArr);
        }
        return objArr;
    }

    @Override // defpackage.enqj, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] d;
        synchronized (this.g) {
            d = enoh.d(a(), objArr);
        }
        return d;
    }
}

package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class encp<E> extends AbstractCollection<E> implements enny<E> {
    private transient Set a;
    private transient Set b;

    public int a(Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.enny
    public final boolean add(Object obj) {
        a(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (!(collection instanceof enny)) {
            if (collection.isEmpty()) {
                return false;
            }
            return enju.l(this, collection.iterator());
        }
        enny ennyVar = (enny) collection;
        if (!(ennyVar instanceof ench)) {
            if (ennyVar.isEmpty()) {
                return false;
            }
            for (ennx ennxVar : ennyVar.j()) {
                a(ennxVar.b(), ennxVar.a());
            }
            return true;
        }
        ench enchVar = (ench) ennyVar;
        if (enchVar.isEmpty()) {
            return false;
        }
        for (int a = enchVar.a.a(); a >= 0; a = enchVar.a.e(a)) {
            a(enchVar.a.i(a), enchVar.a.c(a));
        }
        return true;
    }

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.enny
    public final boolean contains(Object obj) {
        return b(obj) > 0;
    }

    public int d(Object obj, int i) {
        throw null;
    }

    public abstract Iterator e();

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return enod.a(this, obj);
    }

    public abstract Iterator f();

    public boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return j().hashCode();
    }

    @Override // defpackage.enny
    public final Set i() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        encn encnVar = new encn(this);
        this.a = encnVar;
        return encnVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return j().isEmpty();
    }

    @Override // defpackage.enny
    public final Set j() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        enco encoVar = new enco(this);
        this.b = encoVar;
        return encoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.enny
    public final boolean remove(Object obj) {
        return d(obj, 1) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof enny) {
            collection = ((enny) collection).i();
        }
        return i().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof enny) {
            collection = ((enny) collection).i();
        }
        return i().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }
}

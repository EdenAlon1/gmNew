package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enfd<E> extends enfm implements Collection<E> {
    protected enfd() {
    }

    public boolean add(Object obj) {
        return b().add(obj);
    }

    public boolean addAll(Collection collection) {
        return b().addAll(collection);
    }

    protected abstract Collection b();

    @Override // java.util.Collection
    public final void clear() {
        b().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return b().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return b().containsAll(collection);
    }

    public final boolean d(Object obj) {
        return enju.m(iterator(), obj);
    }

    protected final Object[] e() {
        return toArray(new Object[size()]);
    }

    @Override // defpackage.enfm
    protected /* bridge */ /* synthetic */ Object hC() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return b().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        return b().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        return b().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return b().size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return b().toArray();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return b().toArray(objArr);
    }
}

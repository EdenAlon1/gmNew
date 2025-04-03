package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffgb<K, V> extends fffo<Map.Entry<K, V>, K, V> {
    private final ffga a;

    public ffgb(ffga ffgaVar) {
        this.a = ffgaVar;
    }

    @Override // defpackage.fffo
    public final boolean a(Map.Entry entry) {
        return this.a.i(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fffo
    public final boolean b(Map.Entry entry) {
        entry.getClass();
        ffga ffgaVar = this.a;
        ffgaVar.f();
        int b = ffgaVar.b(entry.getKey());
        if (b < 0) {
            return false;
        }
        Object[] objArr = ffgaVar.c;
        objArr.getClass();
        if (!ffkj.e(objArr[b], entry.getValue())) {
            return false;
        }
        ffgaVar.g(b);
        return true;
    }

    @Override // defpackage.ffdk
    public final int c() {
        return this.a.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.h(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new fffv(this.a);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.a.f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.a.f();
        return super.retainAll(collection);
    }
}

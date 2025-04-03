package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hol<K, V> extends hoe<Map.Entry<K, V>, K, V> {
    private final hoj a;

    public hol(hoj hojVar) {
        this.a = hojVar;
    }

    @Override // defpackage.hoe
    public final boolean a(Map.Entry entry) {
        Object obj = this.a.get(entry.getKey());
        return obj != null ? ffkj.e(obj, entry.getValue()) : entry.getValue() == null && this.a.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hoe
    public final boolean b(Map.Entry entry) {
        return this.a.remove(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.ffdk
    public final int c() {
        return this.a.b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new hom(this.a);
    }
}

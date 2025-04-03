package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class hsm<K, V, E> implements Set<E>, ffll {
    public final hsv a;

    public hsm(hsv hsvVar) {
        this.a = hsvVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ffkc.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ffkc.b(this, objArr);
    }
}

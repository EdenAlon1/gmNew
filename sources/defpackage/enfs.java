package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enfs extends AbstractMap implements Serializable, encw {
    private final enfy a;
    private transient Set b;

    public enfs(enfy enfyVar) {
        this.a = enfyVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    @Override // defpackage.encw
    public final encw a() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        enft enftVar = new enft(this.a);
        this.b = enftVar;
        return enftVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        enfy enfyVar = this.a;
        int e = enfyVar.e(obj);
        if (e == -1) {
            return null;
        }
        return enfyVar.a[e];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.encw
    public final Object put(Object obj, Object obj2) {
        return this.a.k(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int b = engc.b(obj);
        enfy enfyVar = this.a;
        int f = enfyVar.f(obj, b);
        if (f == -1) {
            return null;
        }
        Object obj2 = enfyVar.a[f];
        enfyVar.i(f, b);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}

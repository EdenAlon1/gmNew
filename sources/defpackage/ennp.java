package defpackage;

import java.util.AbstractCollection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ennp extends AbstractCollection {
    public abstract ennd a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        a().q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a().y(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a().B(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return a().i();
    }
}

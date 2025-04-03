package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enqi<V> extends enqj<Collection<V>> {
    private static final long serialVersionUID = 0;

    public enqi(Collection collection, Object obj) {
        super(collection, obj);
    }

    @Override // defpackage.enqj, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Collection<V>> iterator() {
        return new enqh(this, super.iterator());
    }
}

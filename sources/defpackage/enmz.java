package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enmz<K, V> extends enfd<Map.Entry<K, V>> {
    private final Collection a;

    public enmz(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.enfd
    /* renamed from: b */
    protected final Collection hC() {
        return this.a;
    }

    @Override // defpackage.enfd, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.a;
    }

    @Override // defpackage.enfd, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new enmo(this.a.iterator());
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

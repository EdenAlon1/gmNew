package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erlm<K, V> extends enfd<Map.Entry<K, V>> {
    final Collection a;

    public erlm(Collection collection) {
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
        return enju.j(this.a.iterator(), new emwl() { // from class: erlk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new erll(entry);
            }
        });
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

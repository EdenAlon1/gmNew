package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erlh<K, V> extends enfo<Map.Entry<K, Collection<V>>> {
    private final Set a;

    public erlh(Set set) {
        this.a = set;
    }

    @Override // defpackage.enfo, defpackage.enfd
    /* renamed from: b */
    protected final /* synthetic */ Collection hC() {
        return this.a;
    }

    @Override // defpackage.enfo
    /* renamed from: c */
    protected final Set b() {
        return this.a;
    }

    @Override // defpackage.enfd, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.a;
    }

    @Override // defpackage.enfd, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return enju.j(this.a.iterator(), new emwl() { // from class: erlf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new erlg(entry);
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

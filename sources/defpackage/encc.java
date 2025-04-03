package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class encc extends enbz implements Set {
    final /* synthetic */ encd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public encc(encd encdVar, Object obj, Set set) {
        super(encdVar, obj, set, null);
        this.f = encdVar;
    }

    @Override // defpackage.enbz, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean m = enpw.m((Set) this.b, collection);
        if (m) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return m;
    }
}

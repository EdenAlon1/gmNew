package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enqd extends enql {
    private static final long serialVersionUID = 0;
    transient Set a;
    transient Collection b;

    public enqd(Map map, Object obj) {
        super(map, obj);
    }

    @Override // defpackage.enql, java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // defpackage.enql, java.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.g) {
            if (this.a == null) {
                this.a = new enqg(a().entrySet(), this.g);
            }
            set = this.a;
        }
        return set;
    }

    @Override // defpackage.enql, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection a;
        synchronized (this.g) {
            Collection collection = (Collection) super.get(obj);
            a = collection == null ? null : enqr.a(collection, this.g);
        }
        return a;
    }

    @Override // defpackage.enql, java.util.Map
    public final Collection values() {
        Collection collection;
        synchronized (this.g) {
            if (this.b == null) {
                this.b = new enqi(a().values(), this.g);
            }
            collection = this.b;
        }
        return collection;
    }
}

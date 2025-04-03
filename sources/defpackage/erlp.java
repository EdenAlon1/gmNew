package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erlp extends enfj {
    Set a;
    Collection b;
    final /* synthetic */ Map c;
    final /* synthetic */ erlq d;

    public erlp(erlq erlqVar, Map map) {
        this.c = map;
        this.d = erlqVar;
    }

    @Override // defpackage.enfj
    protected final Map b() {
        return this.c;
    }

    @Override // defpackage.enfj, java.util.Map
    public final boolean containsValue(Object obj) {
        return ((enfd) values()).d(obj);
    }

    @Override // defpackage.enfj, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        erlh erlhVar = new erlh(this.c.entrySet());
        this.a = erlhVar;
        return erlhVar;
    }

    @Override // defpackage.enfj, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        List c = this.d.c(obj);
        if (c.isEmpty()) {
            return null;
        }
        return c;
    }

    @Override // defpackage.enfj, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.c;
    }

    @Override // defpackage.enfj, java.util.Map
    public final Collection values() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        erlj erljVar = new erlj(this.c.values(), entrySet());
        this.b = erljVar;
        return erljVar;
    }
}

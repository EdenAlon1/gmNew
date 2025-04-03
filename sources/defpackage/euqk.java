package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euqk implements euug {
    private volatile Set b = null;
    private volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public euqk(Collection collection) {
        this.a.addAll(collection);
    }

    static euqk b(Collection collection) {
        return new euqk((Set) collection);
    }

    private final synchronized void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.add(((euug) it.next()).a());
        }
        this.a = null;
    }

    @Override // defpackage.euug
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.b);
    }

    final synchronized void c(euug euugVar) {
        if (this.b == null) {
            this.a.add(euugVar);
        } else {
            this.b.add(euugVar.a());
        }
    }
}

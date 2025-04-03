package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erod extends eroc {
    private static final AtomicReferenceFieldUpdater a;
    private static final AtomicIntegerFieldUpdater b;

    static {
        eroc erocVar = erof.a;
        a = AtomicReferenceFieldUpdater.newUpdater(erof.class, Set.class, "seenExceptions");
        b = AtomicIntegerFieldUpdater.newUpdater(erof.class, "remaining");
    }

    @Override // defpackage.eroc
    public final int a(erof erofVar) {
        return b.decrementAndGet(erofVar);
    }

    @Override // defpackage.eroc
    public final void b(erof erofVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (!atomicReferenceFieldUpdater.compareAndSet(erofVar, null, set) && atomicReferenceFieldUpdater.get(erofVar) == null) {
        }
    }
}

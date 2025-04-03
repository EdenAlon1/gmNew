package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elek implements elei {
    final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(elem.class, elej.class, "currentMetadata");

    @Override // defpackage.elei
    public final elej a(elem elemVar) {
        return (elej) this.a.get(elemVar);
    }

    @Override // defpackage.elei
    public final boolean b(elem elemVar, elej elejVar, elej elejVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.a;
            if (atomicReferenceFieldUpdater.compareAndSet(elemVar, elejVar, elejVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(elemVar) == elejVar);
        return false;
    }
}

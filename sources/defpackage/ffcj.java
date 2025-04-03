package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffcj implements Serializable, ffbz {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ffcj.class, Object.class, "c");
    private volatile ffix b;
    private volatile Object c = ffcr.a;

    public ffcj(ffix ffixVar) {
        this.b = ffixVar;
    }

    private final Object writeReplace() {
        return new ffbw(a());
    }

    @Override // defpackage.ffbz
    public final Object a() {
        Object obj = this.c;
        if (obj != ffcr.a) {
            return obj;
        }
        ffix ffixVar = this.b;
        if (ffixVar != null) {
            Object invoke = ffixVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            ffcr ffcrVar = ffcr.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, ffcrVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != ffcrVar) {
                }
            }
            this.b = null;
            return invoke;
        }
        return this.c;
    }

    @Override // defpackage.ffbz
    public final boolean b() {
        return this.c != ffcr.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

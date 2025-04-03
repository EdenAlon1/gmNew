package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feud extends feuc {
    private final AtomicIntegerFieldUpdater a;

    public feud(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.feuc
    public final boolean a(feuf feufVar) {
        return this.a.compareAndSet(feufVar, 0, -1);
    }

    @Override // defpackage.feuc
    public final void b(feuf feufVar) {
        this.a.set(feufVar, 0);
    }
}

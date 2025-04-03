package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enmc extends WeakReference implements enmb {
    final enlb a;

    public enmc(ReferenceQueue referenceQueue, Object obj, enlb enlbVar) {
        super(obj, referenceQueue);
        this.a = enlbVar;
    }

    @Override // defpackage.enmb
    public final enlb a() {
        return this.a;
    }

    @Override // defpackage.enmb
    public final enmb b(ReferenceQueue referenceQueue, enlb enlbVar) {
        return new enmc(referenceQueue, get(), enlbVar);
    }
}

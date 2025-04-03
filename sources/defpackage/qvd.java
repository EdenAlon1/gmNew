package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qvd extends WeakReference {
    final qtp a;
    final boolean b;
    qwv c;

    public qvd(qtp qtpVar, qwn qwnVar, ReferenceQueue referenceQueue) {
        super(qwnVar, referenceQueue);
        rkf.f(qtpVar);
        this.a = qtpVar;
        this.c = null;
        this.b = qwnVar.a;
    }

    final void a() {
        this.c = null;
        clear();
    }
}

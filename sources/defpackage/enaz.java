package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enaz extends WeakReference implements enau {
    final enbg a;

    public enaz(ReferenceQueue referenceQueue, Object obj, enbg enbgVar) {
        super(obj, referenceQueue);
        this.a = enbgVar;
    }

    @Override // defpackage.enau
    public final int a() {
        return 1;
    }

    @Override // defpackage.enau
    public final enau b(ReferenceQueue referenceQueue, Object obj, enbg enbgVar) {
        return new enaz(referenceQueue, obj, enbgVar);
    }

    @Override // defpackage.enau
    public final enbg c() {
        return this.a;
    }

    @Override // defpackage.enau
    public final Object d() {
        return get();
    }

    @Override // defpackage.enau
    public final boolean f() {
        return true;
    }

    @Override // defpackage.enau
    public final boolean g() {
        return false;
    }

    @Override // defpackage.enau
    public final void e(Object obj) {
    }
}

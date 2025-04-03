package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class enkw extends WeakReference implements enlb {
    final int a;

    public enkw(ReferenceQueue referenceQueue, Object obj, int i) {
        super(obj, referenceQueue);
        this.a = i;
    }

    @Override // defpackage.enlb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.enlb
    public enlb b() {
        return null;
    }

    @Override // defpackage.enlb
    public final Object c() {
        return get();
    }
}

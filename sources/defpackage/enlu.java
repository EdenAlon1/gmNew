package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enlu extends enkw implements enlb {
    public volatile Object b;

    public enlu(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = null;
    }

    @Override // defpackage.enlb
    public final Object d() {
        return this.b;
    }
}

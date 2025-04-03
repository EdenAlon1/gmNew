package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enly extends enkw implements enma {
    public volatile enmb b;

    public enly(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = enme.a;
    }

    @Override // defpackage.enlb
    public final Object d() {
        return this.b.get();
    }

    @Override // defpackage.enma
    public final enmb e() {
        return this.b;
    }
}

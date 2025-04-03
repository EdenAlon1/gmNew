package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekzh extends PhantomReference {
    final ekzg a;

    public ekzh(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = new ekzg(this);
    }
}

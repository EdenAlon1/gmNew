package defpackage;

import io.grpc.Status;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqb {
    final Object a = new Object();
    Collection b = new HashSet();
    Status c;
    final /* synthetic */ feqc d;

    public feqb(feqc feqcVar) {
        this.d = feqcVar;
    }

    final void a(Status status) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = status;
            boolean isEmpty = this.b.isEmpty();
            if (isEmpty) {
                this.d.z.n(status);
            }
        }
    }
}

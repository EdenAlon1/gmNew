package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekpq extends fdzb {
    private final SettableFuture a;

    public ekpq(fdxn fdxnVar, SettableFuture settableFuture) {
        super(fdxnVar);
        this.a = settableFuture;
    }

    @Override // defpackage.fech, defpackage.fdxn
    public final void a(Status status, febo feboVar) {
        try {
            super.a(status, feboVar);
        } finally {
            this.a.set(null);
        }
    }
}

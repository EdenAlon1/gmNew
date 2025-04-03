package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qdj extends FutureTask {
    final /* synthetic */ qdk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdj(qdk qdkVar, Callable callable) {
        super(callable);
        this.a = qdkVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.a.c((qdh) get());
        } catch (InterruptedException | ExecutionException e) {
            this.a.c(new qdh(e));
        }
    }
}

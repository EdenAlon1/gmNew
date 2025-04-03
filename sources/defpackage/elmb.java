package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elmb implements Executor {
    private final Executor a;
    private final SettableFuture b;

    public elmb(Executor executor, SettableFuture settableFuture) {
        this.a = executor;
        this.b = settableFuture;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor = this.a;
        if (executor == erpp.a) {
            executor.execute(runnable);
            return;
        }
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.setException(e);
        }
    }
}

package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class bkn implements ListenableFuture {
    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        ksw.h(runnable);
        ksw.h(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            avw.d("ImmediateFuture", a.j(executor, runnable, "Experienced RuntimeException while attempting to notify ", " on Executor "), e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract Object get();

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        ksw.h(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}

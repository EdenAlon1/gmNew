package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class errs {
    public static errl a(ExecutorService executorService) {
        return executorService instanceof errl ? (errl) executorService : executorService instanceof ScheduledExecutorService ? new errr((ScheduledExecutorService) executorService) : new erro(executorService);
    }

    public static errm b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof errm ? (errm) scheduledExecutorService : new errr(scheduledExecutorService);
    }

    static Executor c(final Executor executor, final ernr ernrVar) {
        executor.getClass();
        return executor == erpp.a ? executor : new Executor() { // from class: errn
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                errs.d(executor, ernrVar, runnable);
            }
        };
    }

    static /* synthetic */ void d(Executor executor, ernr ernrVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            ernrVar.setException(e);
        }
    }
}

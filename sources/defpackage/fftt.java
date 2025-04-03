package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fftt extends ffts implements ffsu {
    private final Executor a;

    public fftt(Executor executor) {
        this.a = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    private static final void j(ffhd ffhdVar, RejectedExecutionException rejectedExecutionException) {
        ffui.d(ffhdVar, fftq.a("The task was rejected", rejectedExecutionException));
    }

    private static final ScheduledFuture k(ScheduledExecutorService scheduledExecutorService, Runnable runnable, ffhd ffhdVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            j(ffhdVar, e);
            return null;
        }
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            j(ffhdVar, e);
            ffsd ffsdVar = fftc.a;
            fgie.a.a(ffhdVar, runnable);
        }
    }

    @Override // defpackage.ffsu
    public final ffte c(long j, Runnable runnable, ffhd ffhdVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture k = scheduledExecutorService != null ? k(scheduledExecutorService, runnable, ffhdVar, j) : null;
        return k != null ? new fftd(k) : ffsq.a.v(j, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.ffsu
    public final void d(long j, ffrf ffrfVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture k = scheduledExecutorService != null ? k(scheduledExecutorService, new ffvc(this, ffrfVar), ((ffrh) ffrfVar).b, j) : null;
        if (k != null) {
            ((ffrh) ffrfVar).D(new ffrb(k));
        } else {
            ffsq.a.d(j, ffrfVar);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fftt) && ((fftt) obj).a == this.a;
    }

    @Override // defpackage.ffts
    public final Executor g() {
        return this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.ffsd
    public final String toString() {
        return this.a.toString();
    }
}

package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrq implements ScheduledExecutorService {
    private final ScheduledExecutorService a;

    public ejrq(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        long j = eldl.a;
        if (eldl.s()) {
            this.a.execute(eldl.k(runnable));
        } else {
            this.a.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        collection.getClass();
        List invokeAll = this.a.invokeAll(collection);
        invokeAll.getClass();
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        collection.getClass();
        return this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        long j2 = eldl.a;
        if (eldl.s()) {
            runnable = eldl.k(runnable);
        }
        ScheduledFuture<?> schedule = this.a.schedule(runnable, j, timeUnit);
        schedule.getClass();
        return schedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        long j3 = eldl.a;
        if (eldl.s()) {
            runnable = eldl.k(runnable);
        }
        ScheduledFuture<?> scheduleAtFixedRate = this.a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        scheduleAtFixedRate.getClass();
        return scheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        long j3 = eldl.a;
        if (eldl.s()) {
            runnable = eldl.k(runnable);
        }
        ScheduledFuture<?> scheduleWithFixedDelay = this.a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        scheduleWithFixedDelay.getClass();
        return scheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> shutdownNow = this.a.shutdownNow();
        shutdownNow.getClass();
        return shutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        long j = eldl.a;
        if (eldl.s()) {
            Future<?> submit = this.a.submit(eldl.k(runnable));
            submit.getClass();
            return submit;
        }
        Future<?> submit2 = this.a.submit(runnable);
        submit2.getClass();
        return submit2;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        return this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        List invokeAll = this.a.invokeAll(collection, j, timeUnit);
        invokeAll.getClass();
        return invokeAll;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        callable.getClass();
        timeUnit.getClass();
        long j2 = eldl.a;
        if (eldl.s()) {
            callable = eldl.n(callable);
        }
        ScheduledFuture schedule = this.a.schedule(callable, j, timeUnit);
        schedule.getClass();
        return schedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        long j = eldl.a;
        if (eldl.s()) {
            Future submit = this.a.submit(eldl.k(runnable), obj);
            submit.getClass();
            return submit;
        }
        Future submit2 = this.a.submit(runnable, obj);
        submit2.getClass();
        return submit2;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        long j = eldl.a;
        if (eldl.s()) {
            Future submit = this.a.submit(eldl.n(callable));
            submit.getClass();
            return submit;
        }
        Future submit2 = this.a.submit(callable);
        submit2.getClass();
        return submit2;
    }
}

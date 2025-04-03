package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eurh implements ScheduledExecutorService {
    public static final /* synthetic */ int c = 0;
    public final ExecutorService a;
    public final ScheduledExecutorService b;

    public eurh(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.a = executorService;
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
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
    public final ScheduledFuture schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new eurk(new eurj() { // from class: euqy
            @Override // defpackage.eurj
            public final ScheduledFuture a(final euri euriVar) {
                final eurh eurhVar = eurh.this;
                final Runnable runnable2 = runnable;
                return eurhVar.b.schedule(new Runnable() { // from class: eurg
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Runnable runnable3 = runnable2;
                        final euri euriVar2 = euriVar;
                        eurh.this.a.execute(new Runnable() { // from class: eurd
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i = eurh.c;
                                Runnable runnable4 = runnable3;
                                euri euriVar3 = euriVar2;
                                try {
                                    runnable4.run();
                                    euriVar3.a(null);
                                } catch (Exception e) {
                                    euriVar3.b(e);
                                }
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new eurk(new eurj() { // from class: eurb
            @Override // defpackage.eurj
            public final ScheduledFuture a(final euri euriVar) {
                final eurh eurhVar = eurh.this;
                final Runnable runnable2 = runnable;
                return eurhVar.b.scheduleAtFixedRate(new Runnable() { // from class: eurf
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Runnable runnable3 = runnable2;
                        final euri euriVar2 = euriVar;
                        eurh.this.a.execute(new Runnable() { // from class: eurc
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i = eurh.c;
                                try {
                                    runnable3.run();
                                } catch (Exception e) {
                                    euriVar2.b(e);
                                    throw e;
                                }
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new eurk(new eurj() { // from class: eure
            @Override // defpackage.eurj
            public final ScheduledFuture a(final euri euriVar) {
                final eurh eurhVar = eurh.this;
                final Runnable runnable2 = runnable;
                return eurhVar.b.scheduleWithFixedDelay(new Runnable() { // from class: eura
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Runnable runnable3 = runnable2;
                        final euri euriVar2 = euriVar;
                        eurh.this.a.execute(new Runnable() { // from class: euqv
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i = eurh.c;
                                try {
                                    runnable3.run();
                                } catch (Exception e) {
                                    euriVar2.b(e);
                                }
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(final Callable callable, final long j, final TimeUnit timeUnit) {
        return new eurk(new eurj() { // from class: euqw
            @Override // defpackage.eurj
            public final ScheduledFuture a(final euri euriVar) {
                final eurh eurhVar = eurh.this;
                final Callable callable2 = callable;
                return eurhVar.b.schedule(new Callable() { // from class: euqz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final Callable callable3 = callable2;
                        final euri euriVar2 = euriVar;
                        return eurh.this.a.submit(new Runnable() { // from class: euqx
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i = eurh.c;
                                Callable callable4 = callable3;
                                euri euriVar3 = euriVar2;
                                try {
                                    euriVar3.a(callable4.call());
                                } catch (Exception e) {
                                    euriVar3.b(e);
                                }
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.a.submit(callable);
    }
}

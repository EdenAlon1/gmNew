package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrh extends ffgo implements CoroutineExceptionHandler, ScheduledExecutorService {
    public static final /* synthetic */ int b = 0;
    public final ThreadLocal a;
    private final ScheduledExecutorService d;

    public ejrh(ScheduledExecutorService scheduledExecutorService) {
        super(CoroutineExceptionHandler.c);
        this.d = scheduledExecutorService;
        this.a = new ThreadLocal();
    }

    private final Runnable b(final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: ejrd
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
                ejrh ejrhVar = this;
                Throwable th = (Throwable) ejrhVar.a.get();
                ejrhVar.a.remove();
                if (th != null) {
                    throw th;
                }
            }
        };
        long j = eldl.a;
        return eldl.s() ? eldl.k(runnable2) : runnable2;
    }

    public final Callable a(final Callable callable) {
        Callable callable2 = new Callable() { // from class: ejqz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object call = callable.call();
                ejrh ejrhVar = this;
                Throwable th = (Throwable) ejrhVar.a.get();
                ejrhVar.a.remove();
                if (th == null) {
                    return call;
                }
                throw th;
            }
        };
        long j = eldl.a;
        return eldl.s() ? eldl.n(callable2) : callable2;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.d.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.d.execute(b(runnable));
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(ffhd ffhdVar, Throwable th) {
        ffhdVar.getClass();
        th.getClass();
        try {
            ((enrr) ((enrr) ((enru) ejrj.b.a()).i()).g(th).h("com/google/apps/tiktok/coroutines/TikTokExceptionHandler", "handleException", 61, "TikTokExceptionHandler.kt")).q("Uncaught exception from runnable");
        } catch (Throwable th2) {
            ejrj.a.log(Level.SEVERE, "GoogleLogger failed to log", th2);
            Log.e("TikTokExceptionHandler2", "GoogleLogger failed to log", th2);
            ejrj.a.log(Level.SEVERE, "Uncaught exception from runnable", th);
            Log.e("TikTokExceptionHandler2", "Uncaught exception from runnable", th);
        }
        this.a.set(th);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        collection.getClass();
        final ejre ejreVar = new ejre(this);
        List invokeAll = this.d.invokeAll(new endt(collection, new emwl() { // from class: ejrc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = ejrh.b;
                return ffji.this.invoke(obj);
            }
        }));
        invokeAll.getClass();
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        collection.getClass();
        final ejrg ejrgVar = new ejrg(this);
        return this.d.invokeAny(new endt(collection, new emwl() { // from class: ejra
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = ejrh.b;
                return ffji.this.invoke(obj);
            }
        }));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.d.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> schedule = this.d.schedule(b(runnable), j, timeUnit);
        schedule.getClass();
        return schedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> scheduleAtFixedRate = this.d.scheduleAtFixedRate(b(runnable), j, j2, timeUnit);
        scheduleAtFixedRate.getClass();
        return scheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> scheduleWithFixedDelay = this.d.scheduleWithFixedDelay(b(runnable), j, j2, timeUnit);
        scheduleWithFixedDelay.getClass();
        return scheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.d.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> shutdownNow = this.d.shutdownNow();
        shutdownNow.getClass();
        return shutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        Future<?> submit = this.d.submit(b(runnable));
        submit.getClass();
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        return this.d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        callable.getClass();
        timeUnit.getClass();
        ScheduledFuture schedule = this.d.schedule(a(callable), j, timeUnit);
        schedule.getClass();
        return schedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        Future submit = this.d.submit(b(runnable), obj);
        submit.getClass();
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        final ejrf ejrfVar = new ejrf(this);
        List invokeAll = this.d.invokeAll(new endt(collection, new emwl() { // from class: ejrb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = ejrh.b;
                return ffji.this.invoke(obj);
            }
        }), j, timeUnit);
        invokeAll.getClass();
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        Future submit = this.d.submit(a(callable));
        submit.getClass();
        return submit;
    }
}

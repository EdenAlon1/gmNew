package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duno implements errm {
    private final errm a;

    public duno(errm errmVar) {
        this.a = errmVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: b */
    public final ListenableFuture submit(Callable callable) {
        return this.a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: c */
    public final ListenableFuture submit(Runnable runnable, Object obj) {
        return this.a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final errk schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final errk schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.a.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final errk scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final errk scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: gd */
    public final ListenableFuture submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService, defpackage.errl
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

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService, defpackage.errl
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }
}

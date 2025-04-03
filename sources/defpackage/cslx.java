package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cslx implements errl {
    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("awaitTermination unimplemented, cannot shutdown UI thread");
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: b */
    public final ListenableFuture submit(final Callable callable) {
        final SettableFuture create = SettableFuture.create();
        cslq.f(new Runnable() { // from class: cslu
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = SettableFuture.this;
                try {
                    settableFuture.set(callable.call());
                } catch (Throwable th) {
                    settableFuture.setException(th);
                }
            }
        });
        return create;
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: c */
    public final ListenableFuture submit(final Runnable runnable, final Object obj) {
        final SettableFuture create = SettableFuture.create();
        cslq.f(new Runnable() { // from class: cslt
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = create;
                Runnable runnable2 = runnable;
                Object obj2 = obj;
                try {
                    runnable2.run();
                    settableFuture.set(obj2);
                } catch (Throwable th) {
                    settableFuture.setException(th);
                }
            }
        });
        return create;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        cslq.f(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: gd */
    public final ListenableFuture submit(Runnable runnable) {
        return submit(runnable, new Object());
    }

    @Override // defpackage.errl, java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return (List) Collection.EL.stream(collection).map(new Function() { // from class: cslv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cslx.this.submit((Callable) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: cslw
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(java.util.Collection collection) {
        throw new UnsupportedOperationException("invokeAny unimplemented, cannot cancel runnables on the UI thread");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("shutdown unimplemented, cannot shutdown UI thread");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("shutdownNow unimplemented, cannot shutdown UI thread");
    }

    @Override // defpackage.errl, java.util.concurrent.ExecutorService
    public final List invokeAll(java.util.Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("invokeAll with timeout unimplemented, cannot cancel runnables on the UI thread");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(java.util.Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("invokeAny with timeout unimplemented, cannot cancel runnables on the UI thread");
    }
}

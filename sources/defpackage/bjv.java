package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bjv implements ListenableFuture {
    private final ListenableFuture a;
    kfb b;

    public bjv() {
        this.a = kfg.a(new bju(this));
    }

    public static bjv a(ListenableFuture listenableFuture) {
        return listenableFuture instanceof bjv ? (bjv) listenableFuture : new bjv(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        this.a.b(runnable, executor);
    }

    final void c(Throwable th) {
        kfb kfbVar = this.b;
        if (kfbVar != null) {
            kfbVar.c(th);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    public bjv(ListenableFuture listenableFuture) {
        ksw.h(listenableFuture);
        this.a = listenableFuture;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}

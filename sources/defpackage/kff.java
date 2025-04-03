package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kff implements ListenableFuture {
    final WeakReference a;
    public final kez b = new kfe(this);

    public kff(kfb kfbVar) {
        this.a = new WeakReference(kfbVar);
    }

    final boolean a(Throwable th) {
        return this.b.h(th);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        kfb kfbVar = (kfb) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || kfbVar == null) {
            return cancel;
        }
        kfbVar.a = null;
        kfbVar.b = null;
        kfbVar.c.g(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}

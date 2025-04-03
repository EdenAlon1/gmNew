package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejlj implements ExecutorService {
    private static final enru c = enru.c("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor");
    private final Executor d;
    private final boolean e;
    private final boolean f;
    private boolean g;
    private ListenableFuture h;
    private ejli i;
    public final Deque a = new ArrayDeque();
    public int b = 1;
    private final ejlh j = new ejlh(this);

    public ejlj(Executor executor, boolean z, boolean z2) {
        this.d = executor;
        this.f = z2;
        this.e = z;
    }

    static /* synthetic */ void d(ListenableFuture listenableFuture) {
        try {
            erqt.q(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((enrr) ((enrr) ((enrr) c.i()).g(e.getCause())).h("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor", "logOnFailure", (char) 412, "SuspendableUiThreadExecutor.java")).q("Silently ignored exception in SuspendableUiThreadExecutor.");
        }
    }

    public final Queue a() {
        ArrayDeque arrayDeque;
        synchronized (this.a) {
            emxf.m(this.g, "Executor may only be drained when it is suspended.");
            arrayDeque = new ArrayDeque(this.a);
            this.a.clear();
        }
        return arrayDeque;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        efbd.c();
        synchronized (this.a) {
            this.g = false;
        }
        execute(erry.a);
    }

    public final void c() {
        efbd.c();
        synchronized (this.a) {
            this.g = true;
            this.b = 1;
            if (this.f) {
                ejli ejliVar = this.i;
                if (ejliVar != null) {
                    ejliVar.a();
                    this.i = null;
                }
            } else {
                ListenableFuture listenableFuture = this.h;
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                    this.h = null;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        int i;
        runnable.getClass();
        synchronized (this.a) {
            if (!this.g && (i = this.b) != 3 && i != 2) {
                this.a.add(runnable);
                if (this.f) {
                    ejli ejliVar = new ejli(this.j);
                    this.i = ejliVar;
                    this.d.execute(eldl.l(ejliVar));
                } else {
                    final ListenableFuture l = erqt.l(eldl.l(this.j), this.d);
                    this.h = l;
                    l.b(eldl.l(new Runnable() { // from class: ejlg
                        @Override // java.lang.Runnable
                        public final void run() {
                            ejlj.d(ListenableFuture.this);
                        }
                    }), erpp.a);
                }
                this.b = 2;
            }
            this.a.add(runnable);
        }
        synchronized (this.a) {
            z = false;
            if (efbd.g() && this.e && !this.g && this.b != 3) {
                if (this.f) {
                    ejli ejliVar2 = this.i;
                    ejliVar2.getClass();
                    ejliVar2.a();
                    this.i = null;
                } else {
                    ListenableFuture listenableFuture = this.h;
                    listenableFuture.getClass();
                    listenableFuture.cancel(false);
                    this.h = null;
                }
                this.b = 2;
                z = true;
            }
        }
        if (z) {
            this.j.run();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return erqt.l(runnable, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(final Runnable runnable, final Object obj) {
        return erqt.m(new Callable() { // from class: ejlf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                runnable.run();
                return obj;
            }
        }, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return erqt.m(callable, this);
    }
}

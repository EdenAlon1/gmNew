package defpackage;

import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtnn extends ernv implements errm {
    public static final /* synthetic */ int d = 0;
    public final dlpw a;
    public final Handler b;
    public final fazb c;

    public dtnn(dlpw dlpwVar, Handler handler, emxc emxcVar) {
        this.a = dlpwVar;
        this.b = handler;
        this.c = (fazb) emxcVar.e(new fazb() { // from class: dtnk
            @Override // defpackage.fazb
            public final Object b() {
                int i = dtnn.d;
                return false;
            }
        });
    }

    public static int h(Delayed delayed, Delayed delayed2) {
        long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        return delay == delay2 ? 0 : 1;
    }

    private final errk i(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        dtnl dtnlVar = new dtnl(this, runnable, this.a.a() + millis, timeUnit.toMillis(j2), z);
        this.b.postDelayed(dtnlVar, millis);
        j(dtnlVar, dtnlVar);
        return dtnlVar;
    }

    private final void j(ListenableFuture listenableFuture, final Runnable runnable) {
        listenableFuture.b(new Runnable() { // from class: dtni
            @Override // java.lang.Runnable
            public final void run() {
                dtnn.this.b.removeCallbacks(runnable);
            }
        }, erpp.a);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ernv, defpackage.errl
    /* renamed from: b */
    public final ListenableFuture submit(final Callable callable) {
        if (((Boolean) this.c.b()).booleanValue()) {
            return super.submit(callable);
        }
        Handler handler = this.b;
        final SettableFuture create = SettableFuture.create();
        handler.post(new Runnable() { // from class: dtnj
            @Override // java.lang.Runnable
            public final void run() {
                int i = dtnn.d;
                SettableFuture settableFuture = SettableFuture.this;
                try {
                    settableFuture.set(callable.call());
                } catch (Exception e) {
                    settableFuture.setException(e);
                    throw new RuntimeException(e);
                }
            }
        });
        return create;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final errk schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final errk schedule(Callable callable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        dtnm dtnmVar = new dtnm(this, callable, this.a.a() + millis);
        this.b.postDelayed(dtnmVar, millis);
        j(dtnmVar, dtnmVar);
        return dtnmVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final errk scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final errk scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, false);
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

    @Override // defpackage.ernv, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return submit(callable);
    }
}

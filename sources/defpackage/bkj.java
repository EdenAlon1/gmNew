package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkj {
    public static ListenableFuture a(Collection collection) {
        return new bkr(new ArrayList(collection), true, bjb.a());
    }

    public static ListenableFuture b(Object obj) {
        return obj == null ? bkm.a : new bkm(obj);
    }

    public static ListenableFuture c(final long j, final ScheduledExecutorService scheduledExecutorService, final ListenableFuture listenableFuture) {
        return kfg.a(new kfd() { // from class: bjw
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final ListenableFuture listenableFuture2 = ListenableFuture.this;
                bkj.j(listenableFuture2, kfbVar);
                if (!listenableFuture2.isDone()) {
                    final long j2 = j;
                    final ScheduledFuture schedule = scheduledExecutorService.schedule(new Callable() { // from class: bkd
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(kfb.this.c(new TimeoutException("Future[" + listenableFuture2 + "] is not done within " + j2 + " ms.")));
                        }
                    }, j2, TimeUnit.MILLISECONDS);
                    listenableFuture2.b(new Runnable() { // from class: bke
                        @Override // java.lang.Runnable
                        public final void run() {
                            schedule.cancel(true);
                        }
                    }, bjb.a());
                }
                return a.i(listenableFuture2, "TimeoutFuture[", "]");
            }
        });
    }

    public static ListenableFuture d(final ListenableFuture listenableFuture) {
        ksw.h(listenableFuture);
        return listenableFuture.isDone() ? listenableFuture : kfg.a(new kfd() { // from class: bjz
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                ListenableFuture listenableFuture2 = ListenableFuture.this;
                bkj.l(false, listenableFuture2, kfbVar, bjb.a());
                return "nonCancellationPropagating[" + listenableFuture2 + "]";
            }
        });
    }

    public static ListenableFuture e(Collection collection) {
        return new bkr(new ArrayList(collection), false, bjb.a());
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, afd afdVar, Executor executor) {
        return g(listenableFuture, new bkf(afdVar), executor);
    }

    public static ListenableFuture g(ListenableFuture listenableFuture, bjq bjqVar, Executor executor) {
        bjs bjsVar = new bjs(bjqVar, listenableFuture);
        listenableFuture.b(bjsVar, executor);
        return bjsVar;
    }

    public static Object h(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void i(ListenableFuture listenableFuture, bjt bjtVar, Executor executor) {
        listenableFuture.b(new bki(listenableFuture, bjtVar), executor);
    }

    public static void j(ListenableFuture listenableFuture, kfb kfbVar) {
        l(true, listenableFuture, kfbVar, bjb.a());
    }

    public static ListenableFuture k(final long j, final ScheduledExecutorService scheduledExecutorService, final ListenableFuture listenableFuture) {
        return kfg.a(new kfd() { // from class: bka
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final ListenableFuture listenableFuture2 = ListenableFuture.this;
                bkj.j(listenableFuture2, kfbVar);
                if (!listenableFuture2.isDone()) {
                    final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: bkb
                        @Override // java.lang.Runnable
                        public final void run() {
                            kfb.this.b(null);
                            listenableFuture2.cancel(true);
                        }
                    }, j, TimeUnit.MILLISECONDS);
                    listenableFuture2.b(new Runnable() { // from class: bkc
                        @Override // java.lang.Runnable
                        public final void run() {
                            schedule.cancel(true);
                        }
                    }, bjb.a());
                }
                return a.i(listenableFuture2, "TimeoutFuture[", "]");
            }
        });
    }

    public static void l(boolean z, ListenableFuture listenableFuture, kfb kfbVar, Executor executor) {
        ksw.h(listenableFuture);
        ksw.h(kfbVar);
        ksw.h(executor);
        i(listenableFuture, new bkg(kfbVar), executor);
        if (z) {
            kfbVar.a(new bkh(listenableFuture), bjb.a());
        }
    }
}

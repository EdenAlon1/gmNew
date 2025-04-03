package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqt extends errb {
    public static erqp a(Iterable iterable) {
        return new erqp(false, engw.j(iterable));
    }

    @SafeVarargs
    public static erqp b(ListenableFuture... listenableFutureArr) {
        return new erqp(false, engw.p(listenableFutureArr));
    }

    public static erqp c(Iterable iterable) {
        return new erqp(true, engw.j(iterable));
    }

    @SafeVarargs
    public static erqp d(ListenableFuture... listenableFutureArr) {
        return new erqp(true, engw.p(listenableFutureArr));
    }

    public static ListenableFuture e(Iterable iterable) {
        return new erpi(engw.j(iterable), true);
    }

    @SafeVarargs
    public static ListenableFuture f(ListenableFuture... listenableFutureArr) {
        return new erpi(engw.p(listenableFutureArr), true);
    }

    public static ListenableFuture g() {
        errc errcVar = errc.a;
        return errcVar != null ? errcVar : new errc();
    }

    public static ListenableFuture h(Throwable th) {
        th.getClass();
        return new errd(th);
    }

    public static ListenableFuture i(Object obj) {
        return obj == null ? erre.a : new erre(obj);
    }

    public static ListenableFuture j(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        erqs erqsVar = new erqs(listenableFuture);
        listenableFuture.b(erqsVar, erpp.a);
        return erqsVar;
    }

    public static ListenableFuture k(erog erogVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        ersl erslVar = new ersl(erogVar);
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(erslVar, j, timeUnit);
        erslVar.b(new Runnable() { // from class: erql
            @Override // java.lang.Runnable
            public final void run() {
                schedule.cancel(false);
            }
        }, erpp.a);
        return erslVar;
    }

    public static ListenableFuture l(Runnable runnable, Executor executor) {
        ersl d = ersl.d(runnable, null);
        executor.execute(d);
        return d;
    }

    public static ListenableFuture m(Callable callable, Executor executor) {
        ersl erslVar = new ersl(callable);
        executor.execute(erslVar);
        return erslVar;
    }

    public static ListenableFuture n(erog erogVar, Executor executor) {
        ersl erslVar = new ersl(erogVar);
        executor.execute(erslVar);
        return erslVar;
    }

    public static ListenableFuture o(Iterable iterable) {
        return new erpi(engw.j(iterable), false);
    }

    public static ListenableFuture p(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        ersi ersiVar = new ersi(listenableFuture);
        ersg ersgVar = new ersg(ersiVar);
        ersiVar.b = scheduledExecutorService.schedule(ersgVar, j, timeUnit);
        listenableFuture.b(ersgVar, erpp.a);
        return ersiVar;
    }

    public static Object q(Future future) {
        emxf.p(future.isDone(), "Future was expected to be done: %s", future);
        return ersn.a(future);
    }

    public static void r(ListenableFuture listenableFuture, erqj erqjVar, Executor executor) {
        erqjVar.getClass();
        listenableFuture.b(new erqm(listenableFuture, erqjVar), executor);
    }

    public static void s(ListenableFuture listenableFuture, Future future) {
        if (listenableFuture instanceof ernr) {
            ((ernr) listenableFuture).l(future);
        } else {
            if (listenableFuture == null || !listenableFuture.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(ListenableFuture listenableFuture, Future future) {
        listenableFuture.getClass();
        if (future.isDone()) {
            return;
        }
        if (listenableFuture.isDone()) {
            s(listenableFuture, future);
            return;
        }
        erqn erqnVar = new erqn(listenableFuture, future);
        listenableFuture.b(erqnVar, erpp.a);
        if (future instanceof ListenableFuture) {
            future.b(erqnVar, erpp.a);
        }
    }
}

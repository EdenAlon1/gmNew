package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class errj extends FutureTask implements ListenableFuture {
    private final erpt a;

    public errj(Runnable runnable) {
        super(runnable, null);
        this.a = new erpt();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        erpt erptVar = this.a;
        synchronized (erptVar) {
            if (erptVar.b) {
                erpt.a(runnable, executor);
            } else {
                erptVar.a = new erps(runnable, executor, erptVar.a);
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        erpt erptVar = this.a;
        synchronized (erptVar) {
            if (erptVar.b) {
                return;
            }
            erptVar.b = true;
            erps erpsVar = erptVar.a;
            erps erpsVar2 = null;
            erptVar.a = null;
            while (erpsVar != null) {
                erps erpsVar3 = erpsVar.c;
                erpsVar.c = erpsVar2;
                erpsVar2 = erpsVar;
                erpsVar = erpsVar3;
            }
            while (erpsVar2 != null) {
                erpt.a(erpsVar2.a, erpsVar2.b);
                erpsVar2 = erpsVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public errj(Callable callable) {
        super(callable);
        this.a = new erpt();
    }
}

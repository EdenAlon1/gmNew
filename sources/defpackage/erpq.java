package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erpq extends ernv {
    private final emyy a = new emyy();
    private int b = 0;
    private boolean c = false;

    private final void d() {
        synchronized (this.a) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                this.a.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        emyy emyyVar = this.a;
        long nanos = timeUnit.toNanos(j);
        synchronized (emyyVar) {
            while (true) {
                if (this.c && this.b == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long nanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.a, nanos);
                nanos -= System.nanoTime() - nanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            if (this.c) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.b++;
        }
        try {
            runnable.run();
        } finally {
            d();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.b == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.a) {
            this.c = true;
            if (this.b == 0) {
                this.a.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        return Collections.EMPTY_LIST;
    }
}

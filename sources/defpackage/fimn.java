package defpackage;

import android.os.Trace;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fimn implements Executor {
    private final BlockingQueue a = new LinkedBlockingQueue();
    private boolean b;
    private boolean c;
    private InterruptedIOException d;
    private RuntimeException e;

    private final Runnable d(boolean z, long j) {
        try {
            Runnable runnable = !z ? (Runnable) this.a.take() : (Runnable) this.a.poll(j, TimeUnit.NANOSECONDS);
            if (runnable != null) {
                return runnable;
            }
            throw new SocketTimeoutException();
        } catch (InterruptedException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }

    public final void a() {
        b(0);
    }

    public final void b(int i) {
        Runnable d;
        new fiev("Cronet MessageLoop#loop");
        try {
            long nanoTime = System.nanoTime();
            long convert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.MILLISECONDS);
            if (this.c) {
                InterruptedIOException interruptedIOException = this.d;
                if (interruptedIOException == null) {
                    throw this.e;
                }
                throw interruptedIOException;
            }
            if (this.b) {
                throw new IllegalStateException("Cannot run loop when it is already running.");
            }
            this.b = true;
            while (this.b) {
                if (i == 0) {
                    try {
                        d = d(false, 0L);
                    } catch (InterruptedIOException e) {
                        this.b = false;
                        this.c = true;
                        this.d = e;
                        throw e;
                    } catch (RuntimeException e2) {
                        this.b = false;
                        this.c = true;
                        this.e = e2;
                        throw e2;
                    }
                } else {
                    d = d(true, (convert - System.nanoTime()) + nanoTime);
                }
                new fiev("Cronet MessageLoop#loop running task");
                try {
                    d.run();
                    Trace.endSection();
                } finally {
                }
            }
            Trace.endSection();
        } finally {
            try {
                Trace.endSection();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    public final void c() {
        this.b = false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.a.put(runnable);
        } catch (InterruptedException e) {
            throw new RejectedExecutionException(e);
        }
    }
}

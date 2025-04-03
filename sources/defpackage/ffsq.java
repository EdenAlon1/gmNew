package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsq extends fftn implements Runnable {
    private static volatile Thread _thread;
    public static final ffsq a;
    private static volatile int debugStatus;
    private static final long e;

    static {
        Long l;
        ffsq ffsqVar = new ffsq();
        a = ffsqVar;
        ffsqVar.p(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        e = timeUnit.toNanos(l.longValue());
    }

    private ffsq() {
    }

    private final synchronized Thread A() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setContextClassLoader(a.getClass().getClassLoader());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    private final synchronized void B() {
        if (D()) {
            debugStatus = 3;
            ((fftn) this).c.c(null);
            this.d.c(null);
            notifyAll();
        }
    }

    private final synchronized boolean C() {
        if (D()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean D() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private static final void E() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.fftn, defpackage.ffsu
    public final ffte c(long j, Runnable runnable, ffhd ffhdVar) {
        return v(j, runnable);
    }

    @Override // defpackage.ffto
    protected final Thread g() {
        Thread thread = _thread;
        return thread == null ? A() : thread;
    }

    @Override // defpackage.fftn
    public final void j(Runnable runnable) {
        if (debugStatus == 4) {
            E();
        }
        super.j(runnable);
    }

    @Override // defpackage.ffto
    protected final void k(long j, fftl fftlVar) {
        E();
    }

    @Override // defpackage.fftn, defpackage.ffti
    public final void l() {
        debugStatus = 4;
        super.l();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = ffvi.a;
        ffvi.a.set(this);
        try {
            if (C()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long m = m();
                    if (m == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = e + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            break;
                        } else {
                            m = ffmk.k(Long.MAX_VALUE, j2);
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (m > 0) {
                        if (D()) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, m);
                        }
                    }
                }
            }
            _thread = null;
            B();
            if (y()) {
                return;
            }
            g();
        } catch (Throwable th) {
            _thread = null;
            B();
            if (!y()) {
                g();
            }
            throw th;
        }
    }

    @Override // defpackage.ffsd
    public final String toString() {
        return "DefaultExecutor";
    }
}

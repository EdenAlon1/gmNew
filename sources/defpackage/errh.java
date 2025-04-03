package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class errh extends AtomicReference implements Runnable {
    private static final Runnable a = new errg();
    private static final Runnable b = new errg();

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        errf errfVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof errf)) {
                if (runnable != b) {
                    break;
                }
            } else {
                errfVar = (errf) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(errfVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract Object a();

    public abstract String b();

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean g();

    final void h() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            errf errfVar = new errf(this);
            errfVar.a(Thread.currentThread());
            if (compareAndSet(runnable, errfVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(a)) == b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(a)) == b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean g = g();
            if (!g) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        errt.a(th);
                        if (!compareAndSet(currentThread, a)) {
                            c(currentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, a)) {
                            c(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, a)) {
                c(currentThread);
            }
            if (g) {
                return;
            }
            e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof errf) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}

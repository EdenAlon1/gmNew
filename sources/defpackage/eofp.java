package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eofp extends AbstractExecutorService {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public boolean g;
    public final ThreadFactory i;
    public final boolean j;
    public final Runnable k;
    public final Runnable l;
    public final eofn[] m;
    public final eofn[] n;
    public final CountDownLatch o;
    public final AtomicReference p;
    private final int q;
    private boolean r;
    private final boolean s;
    private final eofo[] t;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger f = new AtomicInteger();
    public final AtomicBoolean h = new AtomicBoolean();

    public eofp(int i, ThreadFactory threadFactory, Runnable runnable, Runnable runnable2) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.h(i, "numThreads must be positive: "));
        }
        this.q = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = threadFactory;
        this.j = true;
        this.k = runnable;
        this.l = runnable2;
        this.s = true;
        this.o = new CountDownLatch(i);
        int i2 = i + 1;
        eofn[] eofnVarArr = new eofn[i2];
        eofn[] eofnVarArr2 = new eofn[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            eofnVarArr[i4] = new eofn(b, i4);
            eofnVarArr2[i4] = new eofn(a, i4);
        }
        this.m = eofnVarArr;
        this.n = eofnVarArr2;
        eofo[] eofoVarArr = new eofo[i];
        eofn eofnVar = eofnVarArr[0];
        while (i3 < i) {
            eofn eofnVar2 = new eofn(eofnVar, i3);
            eofoVarArr[i3] = new eofo(this, i3);
            i3++;
            eofnVar = eofnVar2;
        }
        this.t = eofoVarArr;
        this.p = new AtomicReference(eofnVar);
    }

    private final void b(boolean z) {
        this.r = true;
        while (true) {
            eofn eofnVar = (eofn) this.p.get();
            Object obj = eofnVar.a;
            if (obj == a) {
                return;
            }
            if (eofm.a(this.p, eofnVar, (obj != b || z) ? this.n[0] : this.n[eofnVar.b])) {
                while (eofnVar.a != b) {
                    eofo eofoVar = this.t[eofnVar.b];
                    Thread thread = eofoVar.b;
                    eofoVar.i = 3;
                    if (thread != null) {
                        LockSupport.unpark(thread);
                    } else {
                        eofoVar.a();
                    }
                    eofnVar = (eofn) eofnVar.a;
                }
            }
        }
    }

    public final void a() {
        if (this.s) {
            this.d.decrementAndGet();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.o.await(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i;
        runnable.getClass();
        if (!this.r) {
            if (this.s) {
                if (this.q != Integer.MAX_VALUE) {
                    do {
                        AtomicInteger atomicInteger = this.d;
                        int i2 = this.q;
                        i = atomicInteger.get();
                        if (i != i2) {
                        }
                    } while (!this.d.compareAndSet(i, i + 1));
                } else {
                    this.d.incrementAndGet();
                }
            }
            eofn eofnVar = new eofn(runnable, -1);
            this.c.add(eofnVar);
            while (true) {
                eofn eofnVar2 = (eofn) this.p.get();
                Object obj = eofnVar2.a;
                if (obj == b) {
                    int i3 = eofnVar2.b;
                    int min = Math.min(i3 + 1, this.t.length);
                    if (min == i3 || eofm.a(this.p, eofnVar2, this.m[min])) {
                        return;
                    }
                } else {
                    if (obj == a) {
                        if (this.c.remove(eofnVar)) {
                            a();
                            throw new RejectedExecutionException();
                        }
                        return;
                    }
                    int i4 = eofnVar2.b;
                    if (eofm.a(this.p, eofnVar2, (eofn) obj)) {
                        eofo eofoVar = this.t[i4];
                        Thread thread = eofoVar.b;
                        eofoVar.i = 1;
                        if (thread != null) {
                            LockSupport.unpark(thread);
                            return;
                        } else {
                            eofoVar.h.e.incrementAndGet();
                            eofoVar.b();
                            return;
                        }
                    }
                }
            }
        }
        throw new RejectedExecutionException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return ((eofn) this.p.get()).a == a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.o.getCount() == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        b(false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        b(true);
        ArrayList arrayList = new ArrayList();
        if (this.h.compareAndSet(false, true)) {
            while (true) {
                eofn eofnVar = (eofn) this.c.poll();
                if (eofnVar == null) {
                    break;
                }
                a();
                arrayList.add((Runnable) eofnVar.a);
            }
            this.g = true;
            for (eofo eofoVar : this.t) {
                Thread thread = eofoVar.c;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        return arrayList;
    }
}
